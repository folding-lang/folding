package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.effect.Effect
import foldingx.lighttranspiler.exception.InvalidCode
import foldingx.parser.FoldingParser
import foldingx.parser.identifier.processCommonClassId

fun processTypeEx(fdTypeExContext: FoldingParser.TypeExContext,effect: Effect): String = when {
    fdTypeExContext.findTypeExSingle() != null -> processTypeExSingle(fdTypeExContext.findTypeExSingle()!!,effect)
    fdTypeExContext.findTypeExFunc() != null -> processTypeExFunc(fdTypeExContext.findTypeExFunc()!!,effect)
    else -> throw RuntimeException("Invalid typeEx '${fdTypeExContext.text}'")
}.let { fdTypeExContext.QM()?.let { _ -> "($it)?" } ?: it }
fun processTypeExSingle(fdTypeExSingleContext: FoldingParser.TypeExSingleContext,effect: Effect): String =
    if (fdTypeExSingleContext.findPrimitiveType() == null)
        (fdTypeExSingleContext.findPackage_()?.text?.let { "${processPackage(it,effect)}." } ?: "") +
                (processCommonClassId(fdTypeExSingleContext.findCommonClassIdentifier()!!)) +
                (fdTypeExSingleContext.LPAREN()?.let { _ ->
                    fdTypeExSingleContext.findTypeArgEx().joinToString(",","<",">") {
                        when {
                            it.findTypeEx() != null -> processTypeEx(it.findTypeEx()!!,effect)
                            it.findTypeExCovariant() != null -> "out " + processTypeEx(it.findTypeExCovariant()!!.findTypeEx()!!,effect)
                            it.findTypeExContravariant() != null -> "in " + processTypeEx(it.findTypeExContravariant()!!.findTypeEx()!!,effect)
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
fun processTypeExFunc(fdTypeExFuncContext: FoldingParser.TypeExFuncContext, effect: Effect): String =
    fdTypeExFuncContext.findTypeExParamEx().joinToString(",","(",")") {
        val pure = processTypeEx(it.findTypeEx()!!,effect)
        if (it.ELLIPSIS() == null) pure
        else "Array<$pure>"
    } + "->" + processTypeEx(fdTypeExFuncContext.findTypeEx()!!,effect)