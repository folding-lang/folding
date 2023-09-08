package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightDefTranspiler
import foldingx.lighttranspiler.exception.InvalidCode
import foldingx.lighttranspiler.kotlin.effect.EffectKt
import foldingx.lighttranspiler.util.extractParamDestruction
import foldingx.parser.FoldingParser
import foldingx.parser.func.*
import foldingx.parser.func.processJustDef as processJustDefPre
import foldingx.parser.func.processInverseDef as processInverseDefPre
import foldingx.parser.func.processForeignDef as processForeignDefPre

interface LightDefTranspilerKt : LightDefTranspiler<EffectKt>, LightValueTranspilerKt {
    fun EffectKt.getCurrentTranspilingPackage(): String?

    override fun transpileDef(fdDefContext: FoldingParser.DefContext, effect: EffectKt): String = when {
        fdDefContext.findJustDef() != null -> processJustDefPre(fdDefContext.findJustDef()!!).let { p ->
            processJustDef(p,effect) + (fdDefContext.findInverseDefining().takeIf { it.isNotEmpty() }
                ?.joinToString("\n", "\n") {
                    processInverseDefining(processInverseDefPre(p, it),effect)
                } ?: "")
        }
        fdDefContext.findForeignDef() != null -> processForeignDefPre(fdDefContext.findForeignDef()!!).let { p ->
            processForeignDef(p,effect) + (fdDefContext.findInverseDefining().takeIf { it.isNotEmpty() }
                ?.joinToString("\n", "\n") {
                    processInverseDefining(processInverseDefPre(p, it),effect)
                } ?: "")
        }
        else -> throw InvalidCode("def",fdDefContext)
    }

    override fun processJustDef(fdCommonJustDef: CommonJustDef, effect: EffectKt): String {
        val (tHead,tTail) = fdCommonJustDef.typeParamContext?.let { processTypeParam(it,effect).let { (h,t) ->
            " $h " to t?.let { "$t " }
        } } ?: (" " to "")
        val (param,paramC) = fdCommonJustDef.parameterContext?.let { p ->
            processParameter(p,effect) to processParamDestruction(extractParamDestruction(p.findParamEx()),effect)
        } ?: ("()" to null)
        val primaryHead = "fun$tHead${fdCommonJustDef.id}$param: ${processTypeEx(fdCommonJustDef.typeExContext!!,effect)} " +
                (tTail ?: "")

        val annotation = fdCommonJustDef.annotationBlockContext
            ?.let { processAnnotationBlock(it,this,effect) + "\n" } ?: ""

        val primaryBody = ("{\n"+(paramC?.let { "$it\n" } ?: "")+
                "return ("+processValue(fdCommonJustDef.valueContext!!,effect)+")").insertMargin(4) + "\n}"

        return annotation + primaryHead + primaryBody
    }
    override fun processInverseDefining(fdCommonInverseDef: CommonInverseDef, effect: EffectKt): String {
        val idHead = "${fdCommonInverseDef.parent.id}_inverse"
        val idTail = when (fdCommonInverseDef) {
            is CommonInverseDefSimple ->
                fdCommonInverseDef.inverseDefCompoList.mapIndexed { i, it ->
                    when (it) {
                        is FoldingParser.OutputParamContext -> "_$i"
                        else -> "__"
                    }
                }.joinToString("")
            is CommonInverseDefRaw ->
                fdCommonInverseDef.inverseDefGateCompoList.mapIndexed { i, it ->
                    when {
                        it.As() != null -> "__"
                        else -> "_$i"
                    }
                }.joinToString("")
        }
        val id = idHead + idTail

        val (tHead,tTail) = fdCommonInverseDef.parent.typeParamContext?.let { processTypeParam(it,effect).let { (h,t) ->
            " $h " to t?.let { "$t " }
        } } ?: (" " to "")


        val (outputHead,output) = when (fdCommonInverseDef) {
            is CommonInverseDefSimple -> {
                val outputList = fdCommonInverseDef.inverseDefCompoList
                    .mapIndexed { i, it ->
                        if (it is FoldingParser.OutputParamContext)
                            processValue(it.findValue()!!,effect) to (it.findTypeEx()
                                ?: fdCommonInverseDef.parent.parameterContext!!.findParamEx(i)?.findTypeEx()
                                ?: fdCommonInverseDef.parent.parameterContext!!.findParamEx().last().findTypeEx()!!)
                        else null
                    }.filterNotNull()
                val outputHead = "folding.FdTuple${outputList.count()}Class<"+
                    outputList.joinToString(",") { (_,t) -> processTypeEx(t,effect) } +">"
                outputHead to outputList.joinToString(",", "$outputHead(", ")") { it.first }
            }
            is CommonInverseDefRaw -> {
                val outputTypeList = fdCommonInverseDef.inverseDefGateCompoList
                    .mapIndexed { i, it ->
                        if (it.As() == null)
                             (
                                fdCommonInverseDef.parent.parameterContext!!.findParamEx(i)?.findTypeEx()
                                ?: fdCommonInverseDef.parent.parameterContext!!.findParamEx().last().findTypeEx()!!)
                        else null
                    }.filterNotNull()
                val outputHead = "folding.FdTuple${outputTypeList.count()}Class<"+
                    outputTypeList.joinToString(",") { t -> processTypeEx(t,effect) } +">"
                outputHead to processValue(fdCommonInverseDef.value,effect)
            }
        }

        val param = when(fdCommonInverseDef) {
            is CommonInverseDefSimple -> fdCommonInverseDef.inverseDefCompoList
                .mapIndexed { i, it ->
                    if (it is FoldingParser.NecessaryParamContext)
                        it.ID()!!.text to
                            processTypeEx(fdCommonInverseDef.parent.parameterContext!!.findParamEx(i)!!.findTypeEx()!!,effect)
                    else null
                }
            is CommonInverseDefRaw -> fdCommonInverseDef.inverseDefGateCompoList
                .mapIndexed { i, it ->
                    if (it.As() != null)
                        it.ID()!!.text to
                            processTypeEx(fdCommonInverseDef.parent.parameterContext!!.findParamEx(i)!!.findTypeEx()!!,effect)
                    else null
                }
        }
            .filterNotNull().map { (pid,type) -> "$pid: $type" }
        val primaryInput = fdCommonInverseDef.resultId + ": " + processTypeEx(fdCommonInverseDef.parent.typeExContext!!,effect)

        val primaryHead = "fun$tHead$id(${(listOf(primaryInput) + param).joinToString()}): $outputHead " +
                (tTail ?: "")
        val primaryBody = ("{\nreturn $output").insertMargin(4) + "\n}"

        return primaryHead + primaryBody
    }
    override fun processForeignDef(fdCommonForeignDef: CommonForeignDef, effect: EffectKt): String {
        val (tHead,tTail) = fdCommonForeignDef.typeParamContext?.let { processTypeParam(it,effect).let { (h,t) ->
            " $h " to t?.let { "$t " }
        } } ?: (" " to "")
        val (param,paramCLazy) = fdCommonForeignDef.parameterContext?.let { p ->
            processParameter(p,effect) to lazy { processParamDestruction(extractParamDestruction(p.findParamEx()),effect) }
        } ?: ("()" to null)
        val primaryHead = "fun$tHead${fdCommonForeignDef.id}$param: ${processTypeEx(fdCommonForeignDef.typeExContext!!,effect)} " +
                (tTail ?: "")

        val annotation = fdCommonForeignDef.annotationBlockContext
            ?.let { processAnnotationBlock(it,this,effect) + "\n" } ?: ""

        var isParamCNeeded = true

        val foreignBody = fdCommonForeignDef.foreignBodyContext?.let { when {
            it.RawString() != null -> it.RawString()!!.text.removeSurrounding("`")
            it.LBRACE() != null -> it.findForeignElement().find { it.findForeignPlatform()!!.text == "kotlin" }
                ?.RawString()?.text?.removeSurrounding("`")
            else -> throw InvalidCode("foreign def",null)
        } } ?: (
                (effect.getCurrentTranspilingPackage()?.let { "$it." } ?: "") +
                        "implfd.kotlin." + fdCommonForeignDef.id +
                        tHead.removePrefix(" ").removeSuffix(" ") +
                        (fdCommonForeignDef.parameterContext?.let { context ->
                            isParamCNeeded = false
                            makeParamIdBag(context.findParamEx()).joinToString(", ", "(", ")") { (id, it) ->
                                if (it.ELLIPSIS() != null) "*($id as Array<out ${processTypeEx(it.findTypeEx()!!,effect)}>)"
                                else "($id as ${processTypeEx(it.findTypeEx()!!,effect)})"
                            }
                        } ?: "()")
                )

        val primaryBody = "{\n${paramCLazy.takeIf { isParamCNeeded }?.let { "${it.value}\n" } ?: ""}return ($foreignBody)".insertMargin(4) + "\n}"

        return annotation + primaryHead + primaryBody
    }

}
