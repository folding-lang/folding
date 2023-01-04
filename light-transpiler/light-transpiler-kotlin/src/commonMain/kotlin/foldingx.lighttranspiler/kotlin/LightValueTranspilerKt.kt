package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightValueTranspiler
import foldingx.lighttranspiler.exception.invalidCode
import foldingx.parser.FoldingParser
import foldingx.parser.identifier.processAopId
import foldingx.parser.identifier.processId
import foldingx.parser.identifier.processOpId

interface LightValueTranspilerKt : LightValueTranspiler {
    override fun processValue(fdValueContext: FoldingParser.ValueContext): String = when(fdValueContext) {
        is FoldingParser.JustDefaultValueContext -> processJustDefaultValue(fdValueContext)
        is FoldingParser.ReflectedContext -> processReflected(fdValueContext)
        is FoldingParser.CallFunctionContext -> processCallFunction(fdValueContext)
        is FoldingParser.UseForeignClassContext -> processUseForeignClass(fdValueContext)
        is FoldingParser.GetFieldGlobalContext -> processGetFieldGlobal(fdValueContext)
        is FoldingParser.GetFieldContext -> processGetField(fdValueContext)
        is FoldingParser.CallMethodContext -> processCallMethod(fdValueContext)
        is FoldingParser.ReflectedMethodContext -> processReflectedMethod(fdValueContext)
        is FoldingParser.InvokeValueContext -> processInvokeValue(fdValueContext)
        is FoldingParser.SimpleIfContext -> processSimpleIf(fdValueContext)
        is FoldingParser.TakeNullContext -> processTakeNull(fdValueContext)
        is FoldingParser.IfExpressionContext -> processIfExpression(fdValueContext)
        is FoldingParser.ValueTypeCastingContext -> processValueTypeCasting(fdValueContext)
        is FoldingParser.CallAopFuncContext -> processCallAopFunc(fdValueContext)
        is FoldingParser.CallOpFuncContext -> processCallOpFunc(fdValueContext)
        is FoldingParser.DoExpressionContext -> processDoExpression(fdValueContext)
        is FoldingParser.JustLambdaContext -> processJustLambda(fdValueContext)
        is FoldingParser.ParenedValueContext -> processParenedValue(fdValueContext)

        else -> throw RuntimeException("Invalid value '${fdValueContext.text}'")
    }

    override fun processJustDefaultValue(fdJustDefaultValueContext: FoldingParser.JustDefaultValueContext): String =
        fdJustDefaultValueContext.text
    override fun processReflected(fdReflectedContext: FoldingParser.ReflectedContext): String =
        "::" + processReference(fdReflectedContext.findReference()!!)
    override fun processCallFunction(fdCallFunctionContext: FoldingParser.CallFunctionContext): String =
        "${processReference(fdCallFunctionContext.findReference()!!)}(" +
                (fdCallFunctionContext.findArgValue()?.let { processArgValue(it) } ?: "") + ")"
    override fun processUseForeignClass(fdUseForeignClassContext: FoldingParser.UseForeignClassContext): String =
        "${processReference(fdUseForeignClassContext.findReference()!!)}(" +
                (fdUseForeignClassContext.findArgValue()?.let { processArgValue(it) } ?: "") + ")"
    override fun processGetFieldGlobal(fdGetFieldGlobalContext: FoldingParser.GetFieldGlobalContext): String =
        processReference(fdGetFieldGlobalContext.findReference()!!)
    override fun processGetField(fdGetFieldContext: FoldingParser.GetFieldContext): String =
        "(${processValue(fdGetFieldContext.findValue()!!)}).${fdGetFieldContext.ID()!!.text}"
    override fun processCallMethod(fdCallMethodContext: FoldingParser.CallMethodContext): String =
        "(${processValue(fdCallMethodContext.findValue()!!)})." + "${fdCallMethodContext.ID()!!.text}(" +
                (fdCallMethodContext.findArgValue()?.let { processArgValue(it) } ?: "") + ")"
    override fun processReflectedMethod(fdReflectedMethodContext: FoldingParser.ReflectedMethodContext): String =
        "(${processValue(fdReflectedMethodContext.findValue()!!)})::${fdReflectedMethodContext.ID()!!.text}"
    override fun processInvokeValue(fdInvokeValueContext: FoldingParser.InvokeValueContext): String =
        "(${processValue(fdInvokeValueContext.findValue()!!)}).invoke(" +
                (fdInvokeValueContext.findInvoking()?.let { processInvoking(it) } ?: "") + ")"
    override fun processSimpleIf(fdSimpleIfContext: FoldingParser.SimpleIfContext): String =
        "(if (${processValue(fdSimpleIfContext.findValue(1)!!)}) (${processValue(fdSimpleIfContext.findValue(0)!!)})" +
                " else null)"
    override fun processTakeNull(fdTakeNullContext: FoldingParser.TakeNullContext): String =
        "((${processValue(fdTakeNullContext.findValue(0)!!)}) ?: (${processValue(fdTakeNullContext.findValue(1)!!)}))"
    override fun processIfExpression(fdIfExpressionContext: FoldingParser.IfExpressionContext): String =
        fdIfExpressionContext.findIf_else()!!.let { if_else -> when(if_else) {
            is FoldingParser.DirectJudgeContext ->
                "(if (" + processValue(if_else.findValue(0)!!) + ") (" +
                        processValue(if_else.findValue(1)!!) + ") else (" +
                        processValue(if_else.findValue(2)!!) + "))"
            is FoldingParser.BindingJudgeContext ->
                "(${processValue(if_else.findValue(0)!!)}).let { " + (if_else.ID()?.text?.let { "$it -> " } ?: "") +
                        "if (" + processValue(if_else.findValue(1)!!) + ") (" +
                        processValue(if_else.findValue(2)!!) + ") else (" +
                        processValue(if_else.findValue(3)!!) + ") }"

            else -> throw RuntimeException("Invalid if-expression '${fdIfExpressionContext.text}'")
        } }
    override fun processValueTypeCasting(fdValueTypeCastingContext: FoldingParser.ValueTypeCastingContext): String =
        "(${processValue(fdValueTypeCastingContext.findValue()!!)} " +
                "as ${processTypeEx(fdValueTypeCastingContext.findTypeCasting()!!.findTypeEx()!!)})"
    override fun processCallAopFunc(fdCallAopFuncContext: FoldingParser.CallAopFuncContext): String =
        processCallingAopId(fdCallAopFuncContext.findCallingAopId()!!).let { when(it) {
            is OpIdWrapper.Primitive -> "(${it.text}(${processValue(fdCallAopFuncContext.findValue()!!)}))"
            is OpIdWrapper.Common -> "${it.text}(${processValue(fdCallAopFuncContext.findValue()!!)})"
        } }
    override fun processCallOpFunc(fdCallOpFuncContext: FoldingParser.CallOpFuncContext): String =
        processCallingOpId(fdCallOpFuncContext.findCallingOpId()!!).let { when(it) {
            is OpIdWrapper.Primitive ->
                "${processValue(fdCallOpFuncContext.findValue(0)!!)} ${it.text} " +
                        processValue(fdCallOpFuncContext.findValue(1)!!)
            is OpIdWrapper.Common ->
                "${it.text}(${processValue(fdCallOpFuncContext.findValue(0)!!)}," +
                        "${processValue(fdCallOpFuncContext.findValue(1)!!)})"
        } }
    override fun processDoExpression(fdDoExpressionContext: FoldingParser.DoExpressionContext): String =
        processDoBlock(fdDoExpressionContext.findDoBlock()!!)
    fun processDoBlock(fdDoBlockContext: FoldingParser.DoBlockContext) =
        fdDoBlockContext.findCompo().joinToString("\n","{\n") { when {
            it.findValue() != null -> processValue(it.findValue()!!)
            it.findFieldAssign() != null -> it.findFieldAssign()!!.let { that -> when(that) {
                is FoldingParser.GlobalFieldAssignContext ->
                    "${that.ID()!!.text} = ${processValue(that.findValue()!!)}"
                is FoldingParser.ObjectFieldAssignContext ->
                    "(${processValue(that.findValue(0)!!)})${that.ID()!!.text} = ${processValue(that.findValue(1)!!)}"

                else -> throw RuntimeException("Invalid field assigning '${that.text}'")
            } }
            it.findReturning() != null -> "return " + processValue(it.findReturning()!!.findValue()!!)

            else -> throw invalidCode("do expression",fdDoBlockContext)
        } }.insertMargin(4) + "\n}()"
    override fun processJustLambda(fdJustLambdaContext: FoldingParser.JustLambdaContext): String {
        val lambdaContext = fdJustLambdaContext.findLambda()!!
        val (param,paramC) = lambdaContext.findParameterForLambda()?.let { p ->
            processParameterForLambda(p) to
                    p.findParameterFromValueForLambda()?.let { processParameterFromValueForLambda(it) }
        } ?: ("" to null)
        val primaryHead = "$param ->"
        val primaryBody = ("\n"+(paramC?.let { "$it\n" } ?: "")+
                "("+processValue(lambdaContext.findValue()!!)+")").insertMargin(4) + "\n"

        return "{ ${primaryHead + primaryBody}}"
    }
    override fun processParenedValue(fdParenedValueContext: FoldingParser.ParenedValueContext): String =
        "(${processValue(fdParenedValueContext.findValue()!!)})"

    override fun processAnonymousClassObject(fdAnonymousClassObjectContext: FoldingParser.AnonymousClassObjectContext): String {
        TODO("Not yet implemented")
    }

    override fun processArgValue(fdArgValueContext: FoldingParser.ArgValueContext): String = when(fdArgValueContext) {
        is FoldingParser.PrimaryArgValueContext ->
            fdArgValueContext.findArgEx().joinToString(",") { processArgEx(it) }
        is FoldingParser.SingleListArgValueContext ->
            fdArgValueContext.findValue().joinToString(",") { processValue(it) }

        else -> throw RuntimeException("Invalid invoke '${fdArgValueContext.text}'")
    }
    override fun processArgEx(fdArgExContext: FoldingParser.ArgExContext): String = when(fdArgExContext) {
        is FoldingParser.SingleArgContext ->
            "${fdArgExContext.ID()?.text?.let { "$it = " } ?: ""}${processValue(fdArgExContext.findValue()!!)}"
        is FoldingParser.MultiArgContext ->
            (fdArgExContext.ID()?.text?.let { "$it = " } ?: "*") +
                    fdArgExContext.findValue().joinToString(",","arrayOf(",")") { processValue(it) }

        else -> throw RuntimeException("Invalid argument '${fdArgExContext.text}'")
    }
    override fun processInvoking(fdInvokingContext: FoldingParser.InvokingContext): String =
        fdInvokingContext.findValue().joinToString(",") { processValue(it) }

    override fun processParameterForLambda(fdParameterForLambdaContext: FoldingParser.ParameterForLambdaContext): String =
        when {
            fdParameterForLambdaContext.findParameterFromValueForLambda() == null ->
                fdParameterForLambdaContext.findParamEx().joinToString(", ","","") {
                    (if (it.ELLIPSIS() == null) "" else "vararg ") + it.ID()!!.text + ": " + processTypeEx(it.findTypeEx()!!)
                }
            else -> fdParameterForLambdaContext.findParameterFromValueForLambda()!!.findParamCEx().mapIndexed { index, paramCExContext ->
                "r$index" + ": " + processTypeEx(paramCExContext.findTypeEx()!!)
            }.joinToString(", ","(",")")
        }
    override fun processParameterFromValueForLambda(fdParameterFromValueForLambdaContext: FoldingParser.ParameterFromValueForLambdaContext): String =
        TODO("Not Yet Implemented")


    fun processReference(fdReferenceContext: FoldingParser.ReferenceContext) =
        (fdReferenceContext.findPackage_()?.text?.let { "$it." } ?: "") +
                processId(fdReferenceContext.findCommonIdentifier()!!)
    fun processCallingOpId(fdCallingOpIdContext: FoldingParser.CallingOpIdContext) = when(fdCallingOpIdContext) {
        is FoldingParser.PrimitiveOpIdContext -> OpIdWrapper.Primitive(fdCallingOpIdContext.text)
        is FoldingParser.CommonOpIdContext -> OpIdWrapper.Common(processOpId(fdCallingOpIdContext.OPID()!!.text))
        else -> throw RuntimeException("Invalid operator id '${fdCallingOpIdContext.text}")
    }
    fun processCallingAopId(fdCallingAopIdContext: FoldingParser.CallingAopIdContext) = when(fdCallingAopIdContext) {
        is FoldingParser.PrimitiveAopIdContext -> OpIdWrapper.Primitive(fdCallingAopIdContext.text)
        is FoldingParser.CommonAopIdContext -> OpIdWrapper.Common(processAopId(fdCallingAopIdContext.OPID()!!.text))
        else -> throw RuntimeException("Invalid unary operator id '${fdCallingAopIdContext.text}")
    }

    sealed class OpIdWrapper(val text: String) {
        class Common(text: String): OpIdWrapper(text)
        class Primitive(text: String): OpIdWrapper(text)
    }

}