package foldingx.lighttranspiler

import foldingx.lighttranspiler.util.TranspiledArgValue
import foldingx.parser.FoldingParser

interface LightValueTranspiler {
    fun processValue(fdValueContext: FoldingParser.ValueContext): String

    fun processJustDefaultValue(fdJustDefaultValueContext: FoldingParser.JustDefaultValueContext): String
    fun processNull(fdNullContext: FoldingParser.NullContext): String
    fun processThis(fdNullContext: FoldingParser.ThisContext): String
    fun processReflected(fdReflectedContext: FoldingParser.ReflectedContext): String
    fun processCallFunction(fdCallFunctionContext: FoldingParser.CallFunctionContext): String
    fun processUseForeignClass(fdUseForeignClassContext: FoldingParser.UseForeignClassContext): String
    fun processGetFieldGlobal(fdGetFieldGlobalContext: FoldingParser.GetFieldGlobalContext): String
    fun processGetField(fdGetFieldContext: FoldingParser.GetFieldContext): String
    fun processCallMethod(fdCallMethodContext: FoldingParser.CallMethodContext): String
    fun processReflectedMethod(fdReflectedMethodContext: FoldingParser.ReflectedMethodContext): String
    fun processCallFunctionLikeMethod(fdCallFunctionLikeMethodContext: FoldingParser.CallFunctionLikeMethodContext): String
    fun processInvokeValue(fdInvokeValueContext: FoldingParser.InvokeValueContext): String
    fun processInvokeValueLikeMethod(fdInvokeValueLikeMethodContext: FoldingParser.InvokeValueLikeMethodContext): String
    fun processSimpleIf(fdSimpleIfContext: FoldingParser.SimpleIfContext): String
    fun processIfExpression(fdIfExpressionContext: FoldingParser.IfExpressionContext): String
    fun processValueTypeCasting(fdValueTypeCastingContext: FoldingParser.ValueTypeCastingContext): String
    fun processCallAopFuncBack(fdCallAopFuncBackContext: FoldingParser.CallAopFuncBackContext): String
    fun processCallAopFunc(fdCallAopFuncContext: FoldingParser.CallAopFuncContext): String
    fun processCallOpFunc(fdCallOpFuncContext: FoldingParser.CallOpFuncContext): String
    fun processTypeCheck(fdTypeCheckContext: FoldingParser.TypeCheckContext): String
    fun processDoExpression(fdDoExpressionContext: FoldingParser.DoExpressionContext): String
    fun processLetExpression(fdLetExpressionContext: FoldingParser.LetExpressionContext): String
    fun processJustLambda(fdJustLambdaContext: FoldingParser.JustLambdaContext): String
    fun processParenedValue(fdParenedValueContext: FoldingParser.ParenedValueContext): String

    fun processAnonymousClassObject(fdAnonymousClassObjectContext: FoldingParser.AnonymousClassObjectContext): String

    fun processArgValue(fdArgValueContext: FoldingParser.ArgValueContext): TranspiledArgValue
    fun processArgEx(fdArgExContext: FoldingParser.ArgExContext): String
    fun processInvoking(fdInvokingContext: FoldingParser.InvokingContext): String

    fun processParameterForLambda(fdParameterForLambdaContext: FoldingParser.ParameterForLambdaContext): String
    fun processParameterFromValueForLambda(fdParameterFromValueForLambdaContext: FoldingParser.ParameterFromValueForLambdaContext): String
}