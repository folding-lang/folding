package foldingx.lighttranspiler.kotlin

import foldingx.parser.FoldingParser

fun processTypeEx(fdTypeExContext: FoldingParser.TypeExContext): String = "(" + when {
    fdTypeExContext.findTypeExSingle() != null -> processTypeExSingle(fdTypeExContext.findTypeExSingle()!!)
    fdTypeExContext.findTypeExFunc() != null -> processTypeExFunc(fdTypeExContext.findTypeExFunc()!!)
    else -> throw RuntimeException("Invalid typeEx '${fdTypeExContext.text}'")
} + ")" + (fdTypeExContext.QM()?.let { "?" } ?: "")
fun processTypeExSingle(fdTypeExSingleContext: FoldingParser.TypeExSingleContext): String =
    if (fdTypeExSingleContext.findPrimitiveType() == null)
        (fdTypeExSingleContext.findPackage_()?.text?.let { "$it." } ?: "") +
                fdTypeExSingleContext.ID()!!.text +
                (fdTypeExSingleContext.LPAREN()?.let { _ ->
                    fdTypeExSingleContext.findTypeEx().joinToString(",","<",">") { processTypeEx(it) }
                } ?: "")
    else fdTypeExSingleContext.findPrimitiveType()!!.text
fun processTypeExFunc(fdTypeExFuncContext: FoldingParser.TypeExFuncContext): String =
    fdTypeExFuncContext.findTypeExParamEx().joinToString(",","(",")") {
        val pure = processTypeEx(it.findTypeEx()!!)
        if (it.ELLIPSIS() == null) pure
        else "Array<$pure>"
    } + "->" + processTypeEx(fdTypeExFuncContext.findTypeEx()!!)