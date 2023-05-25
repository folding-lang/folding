package foldingx.parser.inversing

import foldingx.parser.FoldingParser
import foldingx.parser.identifier.*

fun processInverseValue(value: FoldingParser.ValueContext, invSeqList: List<List<CallWrapper>> = listOf(listOf())): List<List<CallWrapper>> {
    if (value is FoldingParser.ParenedValueContext)
        return processInverseValue(value.findValue()!!,invSeqList)

    if (!isInverseValue(value)) throw RuntimeException()

    return invSeqList.flatMap { invSeq ->
        if (value is FoldingParser.OutputOfInversingContext) {
            return@flatMap listOf(invSeq + CallWrapper(value.ID()?.text ?: "?", listOf(), listOf(), -1))
        }


        val idPre = when (value) {
            is FoldingParser.CallFunctionContext -> processId(value.findReference()!!.findCommonIdentifier()!!)
            is FoldingParser.CallAopFuncContext -> processCommonOpId(value.findCommonOpIdentifier()!!, OpIdUsage.AOP)
            is FoldingParser.CallAopFuncBackContext -> processCommonOpId(value.findCommonOpIdentifier()!!, OpIdUsage.AOP)
            is FoldingParser.CallOpFuncContext -> processCommonOpId(value.findCommonOpIdentifier()!!, OpIdUsage.OP)
            is FoldingParser.CallFunctionLikeMethodContext -> processId(value.findCommonIdentifier()!!)
            else -> throw RuntimeException()
        }

        val values: List<FoldingParser.ValueContext> = when (value) {
            is FoldingParser.CallFunctionContext ->
                (value.findArgValue()!! as FoldingParser.PrimaryArgValueContext).findArgEx().map {
                    (it as FoldingParser.SingleArgContext).findValue()!!
                }
            is FoldingParser.CallAopFuncContext -> listOf(value.findValue()!!)
            is FoldingParser.CallAopFuncBackContext -> listOf(value.findValue()!!)
            is FoldingParser.CallOpFuncContext -> value.findValue()
            is FoldingParser.CallFunctionLikeMethodContext ->
                listOf(value.findValue()!!) +
                        (value.findArgValue()!! as FoldingParser.PrimaryArgValueContext).findArgEx().map {
                    (it as FoldingParser.SingleArgContext).findValue()!!
                }
            else -> throw RuntimeException()
        }

        val id = idPre + "_inverse" + values.mapIndexed { i, it ->
            if (isInverseValue(it)) "_$i"
            else "__"
        }.joinToString("")

        val invValues = values.filter { isInverseValue(it) }
        val justValues = values - invValues.toSet()

        val typeArgs = when(value) {
            is FoldingParser.CallFunctionContext -> (value.findArgValue()!! as FoldingParser.PrimaryArgValueContext).findTypeEx()
            is FoldingParser.CallFunctionLikeMethodContext -> (value.findArgValue()!! as FoldingParser.PrimaryArgValueContext).findTypeEx()
            else -> listOf()
        }


        invValues.flatMapIndexed { i, it ->
            processInverseValue(it,listOf(invSeq + CallWrapper(id,typeArgs,justValues,i)))
        }
    }.filter { it.last().id != "?" }
}

fun isInverseValue(value: FoldingParser.ValueContext): Boolean {
    if (value is FoldingParser.ParenedValueContext)
        return isInverseValue(value.findValue()!!)
    if (value is FoldingParser.OutputOfInversingContext)
        return true

    return when(value){
        is FoldingParser.CallFunctionContext ->
            if (value.findArgValue() == null) false
            else (value.findArgValue() as? FoldingParser.PrimaryArgValueContext)?.let {
                it.findArgEx().any { when(it){
                    is FoldingParser.SingleArgContext -> isInverseValue(it.findValue()!!)
                    else -> false
                } }
            } ?: false
        is FoldingParser.CallAopFuncContext ->
            return isInverseValue(value.findValue()!!)
        is FoldingParser.CallAopFuncBackContext ->
            return isInverseValue(value.findValue()!!)
        is FoldingParser.CallOpFuncContext ->
            return value.findValue().any { isInverseValue(it) }
        is FoldingParser.CallFunctionLikeMethodContext ->
            return if (isInverseValue(value.findValue()!!)) true
            else if (value.findArgValue() == null) false
            else (value.findArgValue() as? FoldingParser.PrimaryArgValueContext)?.let {
                it.findArgEx().any { when(it){
                    is FoldingParser.SingleArgContext -> isInverseValue(it.findValue()!!)
                    else -> false
                } }
            } ?: false

        else -> false
    }

}