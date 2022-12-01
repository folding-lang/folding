package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightValueTranspiler {
    fun processValue(fdValueContext: FoldingParser.ValueContext): String

    fun processJustDefaultValue(fdDefaultValueContext: FoldingParser.JustDefaultValueContext): String
    fun processReflected(fdReflectedContext: FoldingParser.ReflectedContext): String
    fun processCallFunction(fdCallFunctionContext: FoldingParser.CallFunctionContext): String
    fun processGetFieldGlobal(fdGetFieldGlobalContext: FoldingParser.GetFieldGlobalContext): String
    fun processGetField(fdGetFieldContext: FoldingParser.GetFieldContext): String
    fun processCallMethod(fdCallMethodContext: FoldingParser.CallMethodContext): String
    fun processReflectedMethod(fdReflectedMethodContext: FoldingParser.ReflectedMethodContext): String
    fun processInvokeValue(fdInvokeValueContext: FoldingParser.InvokeValueContext): String
    fun processValueTypeCasting(fdValueTypeCastingContext: FoldingParser.ValueTypeCastingContext): String
    fun processCallAopFunc(fdCallAopFuncContext: FoldingParser.CallAopFuncContext): String
    fun processCallOpFunc(fdCallOpFuncContext: FoldingParser.CallOpFuncContext): String
    fun processDoExpression(fdDoExpressionContext: FoldingParser.DoExpressionContext): String
    fun processJustLambda(fdJustLambdaContext: FoldingParser.JustLambdaContext): String
    fun processParenedValue(fdParenedValueContext: FoldingParser.ParenedValueContext): String

    fun processArgValue(fdArgValueContext: FoldingParser.ArgValueContext): String
    fun processArgEx(fdArgExContext: FoldingParser.ArgExContext): String

    fun processInvoking(fdInvokingContext: FoldingParser.InvokingContext): String
    fun processInvokeEx(fdInvokeExContext: FoldingParser.InvokeExContext): String

    fun processParameterForLambda(fdParameterContext: FoldingParser.ParameterContext): String
    fun processParameterFromValueForLambda(fdParameterFromValueContext: FoldingParser.ParameterFromValueContext): String
}