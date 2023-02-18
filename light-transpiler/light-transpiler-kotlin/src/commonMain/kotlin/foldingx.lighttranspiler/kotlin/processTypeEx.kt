package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.exception.InvalidCode
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
                    else -> throw InvalidCode("type",fdTypeExSingleContext)
                }) +
                (fdTypeExSingleContext.LPAREN()?.let { _ ->
                    fdTypeExSingleContext.findTypeArgEx().joinToString(",","<",">") {
                        when {
                            it.findTypeEx() != null -> processTypeEx(it.findTypeEx()!!)
                            it.findTypeExCovariant() != null -> "out " + processTypeEx(it.findTypeExCovariant()!!.findTypeEx()!!)
                            it.findTypeExContravariant() != null -> "in " + processTypeEx(it.findTypeExContravariant()!!.findTypeEx()!!)
                            it.findTypeExWildcard() != null -> "*"
                            else -> throw InvalidCode("type argument",it)
                        }
                    }
                } ?: "")
    else
        when {
            else ->
                fdTypeExSingleContext.findPrimitiveType()!!.text
        }
fun processTypeExFunc(fdTypeExFuncContext: FoldingParser.TypeExFuncContext): String =
    fdTypeExFuncContext.findTypeExParamEx().joinToString(",","(",")") {
        val pure = processTypeEx(it.findTypeEx()!!)
        if (it.ELLIPSIS() == null) pure
        else "Array<$pure>"
    } + "->" + processTypeEx(fdTypeExFuncContext.findTypeEx()!!)