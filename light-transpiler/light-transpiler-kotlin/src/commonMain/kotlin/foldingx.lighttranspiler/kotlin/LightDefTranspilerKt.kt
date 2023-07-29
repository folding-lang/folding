package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightDefTranspiler
import foldingx.lighttranspiler.exception.InvalidCode
import foldingx.lighttranspiler.util.extractParamDestruction
import foldingx.parser.FoldingParser
import foldingx.parser.func.CommonForeignDef
import foldingx.parser.func.CommonInverseDef
import foldingx.parser.func.CommonJustDef
import foldingx.parser.func.processJustDef as processJustDefRaw
import foldingx.parser.func.processInverseDef as processInverseDefRaw
import foldingx.parser.func.processForeignDef as processForeignDefRaw

interface LightDefTranspilerKt : LightDefTranspiler, LightValueTranspilerKt {
    fun getCurrentTranspilingPackage(): String?

    override fun transpileDef(fdDefContext: FoldingParser.DefContext): String = when {
        fdDefContext.findJustDef() != null -> processJustDefRaw(fdDefContext.findJustDef()!!).let { p ->
            processJustDef(p) + (fdDefContext.findInverseDefining().takeIf { it.isNotEmpty() }
                ?.joinToString("\n", "\n") {
                    processInverseDefining(processInverseDefRaw(p, it))
                } ?: "")
        }
        fdDefContext.findForeignDef() != null -> processForeignDefRaw(fdDefContext.findForeignDef()!!).let { p ->
            processForeignDef(p) + (fdDefContext.findInverseDefining().takeIf { it.isNotEmpty() }
                ?.joinToString("\n", "\n") {
                    processInverseDefining(processInverseDefRaw(p, it))
                } ?: "")
        }
        else -> throw InvalidCode("def",fdDefContext)
    }

    override fun processJustDef(fdCommonJustDef: CommonJustDef): String {
        val (tHead,tTail) = fdCommonJustDef.typeParamContext?.let { processTypeParam(it).let { (h,t) ->
            " $h " to t?.let { "$t " }
        } } ?: (" " to "")
        val (param,paramC) = fdCommonJustDef.parameterContext?.let { p ->
            processParameter(p) to extractParamDestruction(p.findParamEx()).let {
                mateParamAndParamCExes(p.findParamEx(), processParamDestruction(it))
            }
        } ?: ("()" to null)
        val primaryHead = "fun$tHead${fdCommonJustDef.id}$param: ${processTypeEx(fdCommonJustDef.typeExContext!!)} " +
                (tTail ?: "")

        val annotation = fdCommonJustDef.annotationBlockContext
            ?.let { processAnnotationBlock(it,this) + "\n" } ?: ""

        val primaryBody = ("{\n"+(paramC?.let { "$it\n" } ?: "")+
                "return ("+processValue(fdCommonJustDef.valueContext!!)+")").insertMargin(4) + "\n}"

        return annotation + primaryHead + primaryBody
    }
    override fun processInverseDefining(fdCommonInverseDef: CommonInverseDef): String {
        val idHead = "${fdCommonInverseDef.parent.id}_inverse"
        val idTail = fdCommonInverseDef.inverseDefCompoList.mapIndexed { i,it -> when(it) {
            is FoldingParser.OutputParamContext -> "_$i"
            else -> "__"
        } }.joinToString("")
        val id = idHead + idTail

        val (tHead,tTail) = fdCommonInverseDef.parent.typeParamContext?.let { processTypeParam(it).let { (h,t) ->
            " $h " to t?.let { "$t " }
        } } ?: (" " to "")

        val outputList = fdCommonInverseDef.inverseDefCompoList
            .mapIndexed { i, it ->
                if (it is FoldingParser.OutputParamContext)
                    processValue(it.findValue()!!) to (it.findTypeEx()
                        ?: fdCommonInverseDef.parent.parameterContext!!.findParamEx(i)?.findTypeEx()
                        ?: fdCommonInverseDef.parent.parameterContext!!.findParamEx().last().findTypeEx()!!)
                else null
            }.filterNotNull()
        val outputHead = "folding.FdTuple${outputList.count()}Class<"+
                outputList.joinToString(",") { (_,t) -> processTypeEx(t) } +">"
        val output = outputList.joinToString(",","$outputHead(",")") { it.first }

        val param = fdCommonInverseDef.inverseDefCompoList
            .mapIndexed { i, it ->
                if (it is FoldingParser.NecessaryParamContext)
                    it.ID()!!.text to
                            processTypeEx(fdCommonInverseDef.parent.parameterContext!!.findParamEx(i)!!.findTypeEx()!!)
                else null
            }
            .filterNotNull().map { (pid,type) -> "$pid: $type" }
        val primaryInput = fdCommonInverseDef.resultId + ": " + processTypeEx(fdCommonInverseDef.parent.typeExContext!!)

        val primaryHead = "fun$tHead$id(${(listOf(primaryInput) + param).joinToString()}): $outputHead " +
                (tTail ?: "")
        val primaryBody = ("{\nreturn $output").insertMargin(4) + "\n}"

        return primaryHead + primaryBody
    }
    override fun processForeignDef(fdCommonForeignDef: CommonForeignDef): String {
        val (tHead,tTail) = fdCommonForeignDef.typeParamContext?.let { processTypeParam(it).let { (h,t) ->
            " $h " to t?.let { "$t " }
        } } ?: (" " to "")
        val (param,paramC) = fdCommonForeignDef.parameterContext?.let { p ->
            processParameter(p) to extractParamDestruction(p.findParamEx()).let {
                mateParamAndParamCExes(p.findParamEx(), processParamDestruction(it))
            }
        } ?: ("()" to null)
        val primaryHead = "fun$tHead${fdCommonForeignDef.id}$param: ${processTypeEx(fdCommonForeignDef.typeExContext!!)} " +
                (tTail ?: "")

        val annotation = fdCommonForeignDef.annotationBlockContext
            ?.let { processAnnotationBlock(it,this) + "\n" } ?: ""

        val foreignBody = fdCommonForeignDef.foreignBodyContext?.let { when {
            it.RawString() != null -> it.RawString()!!.text.removeSurrounding("`")
            it.LBRACE() != null -> it.findForeignElement().find { it.findForeignPlatform()!!.text == "kotlin" }
                ?.RawString()?.text?.removeSurrounding("`")
            else -> throw InvalidCode("foreign def",null)
        } } ?: (
                (getCurrentTranspilingPackage()?.let { "$it." } ?: "") +
                        "implfd.kotlin." + fdCommonForeignDef.id +
                        tHead.removePrefix(" ").removeSuffix(" ") +
                        (fdCommonForeignDef.parameterContext?.let { context ->
                            param.replace(":"," as").replace("vararg","*")
                        } ?: "()")
                )

        val primaryBody = "{\n${paramC?.let { "$it\n" } ?: ""}return ($foreignBody)".insertMargin(4) + "\n}"

        return annotation + primaryHead + primaryBody
    }

}
