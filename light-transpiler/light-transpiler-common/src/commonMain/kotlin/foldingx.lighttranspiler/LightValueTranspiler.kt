package foldingx.lighttranspiler

import foldingx.lighttranspiler.effect.Effect
import foldingx.lighttranspiler.util.TranspiledArgValue
import foldingx.parser.FoldingParser

interface LightValueTranspiler<TEffect: Effect> {
    fun processValue(fdValueContext: FoldingParser.ValueContext, effect: TEffect): String

    fun processJustDefaultValue(fdJustDefaultValueContext: FoldingParser.JustDefaultValueContext, effect: TEffect): String
    fun processNull(fdNullContext: FoldingParser.NullContext, effect: TEffect): String
    fun processThis(fdNullContext: FoldingParser.ThisContext, effect: TEffect): String
    fun processReflected(fdReflectedContext: FoldingParser.ReflectedContext, effect: TEffect): String
    fun processCallFunction(fdCallFunctionContext: FoldingParser.CallFunctionContext, effect: TEffect): String
    fun processUseForeignClass(fdUseForeignClassContext: FoldingParser.UseForeignClassContext, effect: TEffect): String
    fun processGetFieldGlobal(fdGetFieldGlobalContext: FoldingParser.GetFieldGlobalContext, effect: TEffect): String
    fun processGetField(fdGetFieldContext: FoldingParser.GetFieldContext, effect: TEffect): String
    fun processCallMethod(fdCallMethodContext: FoldingParser.CallMethodContext, effect: TEffect): String
    fun processReflectedMethod(fdReflectedMethodContext: FoldingParser.ReflectedMethodContext, effect: TEffect): String
    fun processCallFunctionLikeMethod(fdCallFunctionLikeMethodContext: FoldingParser.CallFunctionLikeMethodContext, effect: TEffect): String
    fun processInvokeValue(fdInvokeValueContext: FoldingParser.InvokeValueContext, effect: TEffect): String
    fun processInvokeValueLikeMethod(fdInvokeValueLikeMethodContext: FoldingParser.InvokeValueLikeMethodContext, effect: TEffect): String
    fun processSimpleIf(fdSimpleIfContext: FoldingParser.SimpleIfContext, effect: TEffect): String
    fun processIfExpression(fdIfExpressionContext: FoldingParser.IfExpressionContext, effect: TEffect): String
    fun processValueTypeCasting(fdValueTypeCastingContext: FoldingParser.ValueTypeCastingContext, effect: TEffect): String
    fun processCallAopFuncBack(fdCallAopFuncBackContext: FoldingParser.CallAopFuncBackContext, effect: TEffect): String
    fun processCallAopFunc(fdCallAopFuncContext: FoldingParser.CallAopFuncContext, effect: TEffect): String
    fun processCallOpFunc(fdCallOpFuncContext: FoldingParser.CallOpFuncContext, effect: TEffect): String
    fun processTypeCheck(fdTypeCheckContext: FoldingParser.TypeCheckContext, effect: TEffect): String
    fun processDoExpression(fdDoExpressionContext: FoldingParser.DoExpressionContext, effect: TEffect): String
    fun processLetExpression(fdLetExpressionContext: FoldingParser.LetExpressionContext, effect: TEffect): String
    fun processJustLambda(fdJustLambdaContext: FoldingParser.JustLambdaContext, effect: TEffect): String
    fun processParenedValue(fdParenedValueContext: FoldingParser.ParenedValueContext, effect: TEffect): String

    fun processAnonymousClassObject(fdAnonymousClassObjectContext: FoldingParser.AnonymousClassObjectContext, effect: TEffect): String

    fun processTuple(fdTupleContext: FoldingParser.TupleContext, effect: TEffect): String

    fun processArgValue(fdArgValueContext: FoldingParser.ArgValueContext, effect: TEffect): TranspiledArgValue
    fun processArgEx(fdArgExContext: FoldingParser.ArgExContext, effect: TEffect): String
    fun processInvoking(fdInvokingContext: FoldingParser.InvokingContext, effect: TEffect): String

    fun processParameter(fdParameterContext: FoldingParser.ParameterContext, effect: TEffect): String
    fun processParamDestruction(fdParamDestruction: List<Pair<String?,FoldingParser.ValueContext>>, effect: TEffect): String

//    fun processParameterForLambda(fdParameterForLambdaContext: FoldingParser.ParameterForLambdaContext, effect: TEffect): String
//    fun processParameterFromValueForLambda(fdParameterFromValueForLambdaContext: FoldingParser.ParameterFromValueForLambdaContext, effect: TEffect): String
}