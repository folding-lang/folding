package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.exception.invalidCode
import foldingx.parser.FoldingParser

fun processTypeEx(fdTypeExContext: FoldingParser.TypeExContext): String = when {
    fdTypeExContext.findTypeExSingle() != null -> processTypeExSingle(fdTypeExContext.findTypeExSingle()!!)
    fdTypeExContext.findTypeExFunc() != null -> processTypeExFunc(fdTypeExContext.findTypeExFunc()!!)
    else -> throw RuntimeException("Invalid typeEx '${fdTypeExContext.text}'")
}.let { fdTypeExContext.QM()?.let { _ -> "($it)?" } ?: it }
fun processTypeExSingle(fdTypeExSingleContext: FoldingParser.TypeExSingleContext): String =
    if (fdTypeExSingleContext.findPrimitiveType() == null)
        (fdTypeExSingleContext.findPackage_()?.text?.let { "$it." } ?: "") +
                (when {
                    fdTypeExSingleContext.QUOTE().isNotEmpty() -> fdTypeExSingleContext.ID()!!.text
                    fdTypeExSingleContext.QUOTE().isEmpty() -> fdTypeExSingleContext.ID()!!.text + "Class"
                    else -> throw invalidCode("type",fdTypeExSingleContext)
                }) +
                (fdTypeExSingleContext.LPAREN()?.let { _ ->
                    fdTypeExSingleContext.findTypeEx().joinToString(",","<",">") { processTypeEx(it) }
                } ?: "")
    else
        when {
            fdTypeExSingleContext.findPrimitiveType()!!.ARRAY() != null ->
                "Array<${processTypeEx(fdTypeExSingleContext.findPrimitiveType()!!.findTypeEx()!!)}>"
            else ->
                fdTypeExSingleContext.findPrimitiveType()!!.text
        }
fun processTypeExFunc(fdTypeExFuncContext: FoldingParser.TypeExFuncContext): String =
    fdTypeExFuncContext.findTypeExParamEx().joinToString(",","(",")") {
        val pure = processTypeEx(it.findTypeEx()!!)
        if (it.ELLIPSIS() == null) pure
        else "Array<$pure>"
    } + "->" + processTypeEx(fdTypeExFuncContext.findTypeEx()!!)