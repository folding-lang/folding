package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightDefTranspiler
import foldingx.parser.FoldingParser
import foldingx.parser.func.CommonForeignDef
import foldingx.parser.func.CommonInverseDef
import foldingx.parser.func.CommonJustDef
import foldingx.parser.func.processJustDef as processJustDefRaw
import foldingx.parser.func.processInverseDef as processInverseDefRaw
import foldingx.parser.func.processForeignDef as processForeignDefRaw

interface LightDefTranspilerKt : LightDefTranspiler, LightValueTranspilerKt {
    override fun transpileDef(fdDefContext: FoldingParser.DefContext): String = when {
        fdDefContext.findJustDef() != null -> processJustDefRaw(fdDefContext.findJustDef()!!).let { p ->
            processJustDef(p) + fdDefContext.findInverseDefining().joinToString("\n","\n") {
                processInverseDefining(processInverseDefRaw(p,it))
            }
        }
        fdDefContext.findForeignDef() != null -> processForeignDef(processForeignDefRaw(fdDefContext.findForeignDef()!!))
        else -> throw RuntimeException("Invalid def '${fdDefContext.text}'")
    }

    override fun processJustDef(fdCommonJustDef: CommonJustDef): String {
        val (tHead,tTail) = fdCommonJustDef.typeParamContext?.let { processTypeParam(it).let { (h,t) ->
            " $h " to t
        } } ?: (" " to "")
        val (param,paramC) = fdCommonJustDef.parameterContext?.let { p ->
            processParameter(p) to p.findParameterFromValue()?.let { processParameterFromValue(it) }
        } ?: ("()" to null)
        val primaryHead = "fun$tHead${fdCommonJustDef.id}$param: ${processTypeEx(fdCommonJustDef.typeExContext!!)} " +
                (tTail ?: "")
        val primaryBody = ("{\n"+(paramC?.let { "$it\n" } ?: "")+
                "return ("+processValue(fdCommonJustDef.valueContext!!)+")").insertMargin(4) + "\n}"

        return primaryHead + primaryBody
    }
    override fun processInverseDefining(fdCommonInverseDef: CommonInverseDef): String {
        val idHead = "${fdCommonInverseDef.parent.id}_inverse"
        val idTail = fdCommonInverseDef.inverseDefCompoList.mapIndexed { i,it -> when(it) {
            is FoldingParser.OutputParamContext -> i.toString()
            else -> ""
        } }.joinToString("_","_")
        val id = idHead + idTail

        val (tHead,tTail) = fdCommonInverseDef.parent.typeParamContext?.let { processTypeParam(it).let { (h,t) ->
            " $h " to t
        } } ?: (" " to "")

        val outputList = fdCommonInverseDef.inverseDefCompoList
            .filterIsInstance<FoldingParser.OutputParamContext>()
            .map { processValue(it.findValue()!!) to it.findTypeEx() }
        val outputHead = "FdTuple${outputList.count()}<"+
                outputList.joinToString(",") { (_,t) -> t?.let { processTypeEx(it) } ?: "_" } +">"
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
            " $h " to t
        } } ?: (" " to "")
        val (param,paramC) = fdCommonForeignDef.parameterContext?.let { p ->
            processParameter(p) to p.findParameterFromValue()?.let { processParameterFromValue(it) }
        } ?: ("()" to null)
        val primaryHead = "fun$tHead${fdCommonForeignDef.id}$param: ${processTypeEx(fdCommonForeignDef.typeExContext!!)} " +
                (tTail ?: "")
        val foreignBody = fdCommonForeignDef.foreignBodyContext!!.let { when {
            it.RawString() != null -> it.RawString()!!.text.removeSurrounding("`")
            it.LBRACE() != null -> it.findForeignElement().find { it.findForeignPlatform()!!.text == "kotlin" }
                ?.RawString()?.text?.removeSurrounding("`")
                ?: throw RuntimeException("Can't find the foreign def targeting kotlin")
            else -> throw RuntimeException("Invalid foreign def '${fdCommonForeignDef.id}'")
        } }
        val primaryBody = "{\n${paramC?.let { "$it\n" } ?: ""}return ($foreignBody)".insertMargin(4) + "\n}"

        return primaryHead + primaryBody
    }

    override fun processParameter(fdParameterContext: FoldingParser.ParameterContext): String = when {
        fdParameterContext.findParameterFromValue() == null ->
            fdParameterContext.findParamEx().joinToString(", ","(",")") {
                (if (it.ELLIPSIS() == null) "" else "vararg ") + it.ID()!!.text + ": " + processTypeEx(it.findTypeEx()!!)
            }
        else -> fdParameterContext.findParameterFromValue()!!.findParamCEx().mapIndexed { index, paramCExContext ->
            "r$index" + ": " + processTypeEx(paramCExContext.findTypeEx()!!)
        }.joinToString(", ","(",")")
    }

    override fun processParameterFromValue(fdParameterFromValueContext: FoldingParser.ParameterFromValueContext): String =
        TODO("Not Yet Implemented")
}