package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightValueTranspiler {
    fun processValue(fdValueContext: FoldingParser.ValueContext)

    fun processJustDefaultValue(fdDefaultValueContext: FoldingParser.JustDefaultValueContext)
    fun processReflected(fdReflectedContext: FoldingParser.ReflectedContext)
    fun processCallInvFunc(fdCallInvFuncContext: FoldingParser.CallInvFuncContext)
    fun processCallFunction(fdCallFunctionContext: FoldingParser.CallFunctionContext)
    fun processGetFieldGlobal(fdGetFieldGlobalContext: FoldingParser.GetFieldGlobalContext)
    fun processGetField(fdGetFieldContext: FoldingParser.GetFieldContext)
    fun processCallMethod(fdCallMethodContext: FoldingParser.CallMethodContext)
    fun processReflectedMethod(fdReflectedMethodContext: FoldingParser.ReflectedMethodContext)
    fun processInvokeValue(fdInvokeValueContext: FoldingParser.InvokeValueContext)
    fun processValueTypeCasting(fdValueTypeCastingContext: FoldingParser.ValueTypeCastingContext)
    fun processCallAopFunc(fdCallAopFuncContext: FoldingParser.CallAopFuncContext)
    fun processCallOpFunc(fdCallOpFuncContext: FoldingParser.CallOpFuncContext)
    fun processDoExpression(fdDoExpressionContext: FoldingParser.DoExpressionContext)
    fun processJustLambda(fdJustLambdaContext: FoldingParser.JustLambdaContext)
    fun processParenedValue(fdParenedValueContext: FoldingParser.ParenedValueContext)

    fun processArgValue(fdArgValueContext: FoldingParser.ArgValueContext)
    fun processArgEx(fdArgExContext: FoldingParser.ArgExContext)

    fun processInvoking(fdInvokingContext: FoldingParser.InvokingContext)
    fun processInvokeEx(fdInvokeExContext: FoldingParser.InvokeExContext)

    fun processParameterForLambda(fdParameterContext: FoldingParser.ParameterContext)
    fun processParameterFromValueForLambda(fdParameterFromValueContext: FoldingParser.ParameterFromValueContext)
}