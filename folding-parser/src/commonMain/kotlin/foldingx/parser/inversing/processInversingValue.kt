package foldingx.parser.inversing

import foldingx.parser.FoldingParser
import foldingx.parser.identifier.processAopId
import foldingx.parser.identifier.processId
import foldingx.parser.identifier.processOpId

fun processInverseValue(value: FoldingParser.ValueContext, invSeqList: List<List<CallWrapper>>): List<List<CallWrapper>> {
    if (value is FoldingParser.ParenedValueContext)
        return processInverseValue(value.findValue()!!,invSeqList)

    if (!isInverseValue(value)) throw RuntimeException()

    return invSeqList.flatMap { invSeq ->
        if (value is FoldingParser.OutputOfInversingContext) {
            return@flatMap listOf(invSeq + CallWrapper(value.ID()?.text ?: "?", listOf(), -1))
        }


        val idPre = when (value) {
            is FoldingParser.CallFunctionContext -> processId(value.findReference()!!.findCommonIdentifier()!!)
            is FoldingParser.CallAopFuncContext -> processAopId(value.findCallingAopId()!!.text)
            is FoldingParser.CallOpFuncContext -> processOpId(value.findCallingOpId()!!.text)
            else -> throw RuntimeException()
        }

        val values: List<FoldingParser.ValueContext> = when (value) {
            is FoldingParser.CallFunctionContext ->
                (value.findArgValue()!! as FoldingParser.PrimaryArgValueContext).findArgEx().map {
                    (it as FoldingParser.SingleArgContext).findValue()!!
                }
            is FoldingParser.CallAopFuncContext -> listOf(value.findValue()!!)
            is FoldingParser.CallOpFuncContext -> value.findValue()
            else -> throw RuntimeException()
        }

        val id = idPre + "_inverse" + values.mapIndexed { i, it ->
            if (isInverseValue(it)) "_$i"
            else "__"
        }.joinToString("")

        val invValues = values.filter { isInverseValue(it) }
        val justValues = values - invValues.toSet()


        invValues.flatMapIndexed { i, it ->
            processInverseValue(it,listOf(invSeq + CallWrapper(id,justValues,i)))
        }
    }
}

fun isInverseValue(value: FoldingParser.ValueContext): Boolean {
    if (value is FoldingParser.ParenedValueContext)
        return isInverseValue(value.findValue()!!)
    if (!(         value is FoldingParser.CallFunctionContext
                || value is FoldingParser.CallAopFuncContext
                || value is FoldingParser.CallOpFuncContext)
        ) return false

    when(value){
        is FoldingParser.CallFunctionContext -> {
            if (value.findArgValue() == null) return false
            if ((value.findArgValue() as? FoldingParser.PrimaryArgValueContext)?.let {
                    it.findArgEx().all {
                        (it as? FoldingParser.SingleArgContext)?.let {
                            !isInverseValue(it.findValue()!!) } != false
                    }
            } == true)
                return false
        }
        is FoldingParser.CallAopFuncContext ->
            return isInverseValue(value.findValue()!!)
        is FoldingParser.CallOpFuncContext ->
            return value.findValue().any { isInverseValue(it) }
    }

    return true


}