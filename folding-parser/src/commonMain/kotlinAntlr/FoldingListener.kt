// Generated from Folding.g4 by ANTLR 4.13.1

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by [FoldingParser].
 */
public interface FoldingListener : ParseTreeListener {
    /**
     * Enter a parse tree produced by [FoldingParser.file].
     *
     * @param ctx The parse tree
     */
    public fun enterFile(ctx: FoldingParser.FileContext)

    /**
     * Exit a parse tree produced by [FoldingParser.file].
     *
     * @param ctx The parse tree
     */
    public fun exitFile(ctx: FoldingParser.FileContext)
    /**
     * Enter a parse tree produced by [FoldingParser.fileCompo].
     *
     * @param ctx The parse tree
     */
    public fun enterFileCompo(ctx: FoldingParser.FileCompoContext)

    /**
     * Exit a parse tree produced by [FoldingParser.fileCompo].
     *
     * @param ctx The parse tree
     */
    public fun exitFileCompo(ctx: FoldingParser.FileCompoContext)
    /**
     * Enter a parse tree produced by [FoldingParser.importEx].
     *
     * @param ctx The parse tree
     */
    public fun enterImportEx(ctx: FoldingParser.ImportExContext)

    /**
     * Exit a parse tree produced by [FoldingParser.importEx].
     *
     * @param ctx The parse tree
     */
    public fun exitImportEx(ctx: FoldingParser.ImportExContext)
    /**
     * Enter a parse tree produced by [FoldingParser.importBody].
     *
     * @param ctx The parse tree
     */
    public fun enterImportBody(ctx: FoldingParser.ImportBodyContext)

    /**
     * Exit a parse tree produced by [FoldingParser.importBody].
     *
     * @param ctx The parse tree
     */
    public fun exitImportBody(ctx: FoldingParser.ImportBodyContext)
    /**
     * Enter a parse tree produced by [FoldingParser.importCompo].
     *
     * @param ctx The parse tree
     */
    public fun enterImportCompo(ctx: FoldingParser.ImportCompoContext)

    /**
     * Exit a parse tree produced by [FoldingParser.importCompo].
     *
     * @param ctx The parse tree
     */
    public fun exitImportCompo(ctx: FoldingParser.ImportCompoContext)
    /**
     * Enter a parse tree produced by [FoldingParser.importDefAlias].
     *
     * @param ctx The parse tree
     */
    public fun enterImportDefAlias(ctx: FoldingParser.ImportDefAliasContext)

    /**
     * Exit a parse tree produced by [FoldingParser.importDefAlias].
     *
     * @param ctx The parse tree
     */
    public fun exitImportDefAlias(ctx: FoldingParser.ImportDefAliasContext)
    /**
     * Enter a parse tree produced by [FoldingParser.importClassAlias].
     *
     * @param ctx The parse tree
     */
    public fun enterImportClassAlias(ctx: FoldingParser.ImportClassAliasContext)

    /**
     * Exit a parse tree produced by [FoldingParser.importClassAlias].
     *
     * @param ctx The parse tree
     */
    public fun exitImportClassAlias(ctx: FoldingParser.ImportClassAliasContext)
    /**
     * Enter a parse tree produced by [FoldingParser.importType].
     *
     * @param ctx The parse tree
     */
    public fun enterImportType(ctx: FoldingParser.ImportTypeContext)

    /**
     * Exit a parse tree produced by [FoldingParser.importType].
     *
     * @param ctx The parse tree
     */
    public fun exitImportType(ctx: FoldingParser.ImportTypeContext)
    /**
     * Enter a parse tree produced by [FoldingParser.importPath].
     *
     * @param ctx The parse tree
     */
    public fun enterImportPath(ctx: FoldingParser.ImportPathContext)

    /**
     * Exit a parse tree produced by [FoldingParser.importPath].
     *
     * @param ctx The parse tree
     */
    public fun exitImportPath(ctx: FoldingParser.ImportPathContext)
    /**
     * Enter a parse tree produced by [FoldingParser.importNest].
     *
     * @param ctx The parse tree
     */
    public fun enterImportNest(ctx: FoldingParser.ImportNestContext)

    /**
     * Exit a parse tree produced by [FoldingParser.importNest].
     *
     * @param ctx The parse tree
     */
    public fun exitImportNest(ctx: FoldingParser.ImportNestContext)
    /**
     * Enter a parse tree produced by [FoldingParser.packagePiece].
     *
     * @param ctx The parse tree
     */
    public fun enterPackagePiece(ctx: FoldingParser.PackagePieceContext)

    /**
     * Exit a parse tree produced by [FoldingParser.packagePiece].
     *
     * @param ctx The parse tree
     */
    public fun exitPackagePiece(ctx: FoldingParser.PackagePieceContext)
    /**
     * Enter a parse tree produced by [FoldingParser.package_].
     *
     * @param ctx The parse tree
     */
    public fun enterPackage_(ctx: FoldingParser.Package_Context)

    /**
     * Exit a parse tree produced by [FoldingParser.package_].
     *
     * @param ctx The parse tree
     */
    public fun exitPackage_(ctx: FoldingParser.Package_Context)
    /**
     * Enter a parse tree produced by [FoldingParser.namespace].
     *
     * @param ctx The parse tree
     */
    public fun enterNamespace(ctx: FoldingParser.NamespaceContext)

    /**
     * Exit a parse tree produced by [FoldingParser.namespace].
     *
     * @param ctx The parse tree
     */
    public fun exitNamespace(ctx: FoldingParser.NamespaceContext)
    /**
     * Enter a parse tree produced by [FoldingParser.doBlock].
     *
     * @param ctx The parse tree
     */
    public fun enterDoBlock(ctx: FoldingParser.DoBlockContext)

    /**
     * Exit a parse tree produced by [FoldingParser.doBlock].
     *
     * @param ctx The parse tree
     */
    public fun exitDoBlock(ctx: FoldingParser.DoBlockContext)
    /**
     * Enter a parse tree produced by [FoldingParser.compo].
     *
     * @param ctx The parse tree
     */
    public fun enterCompo(ctx: FoldingParser.CompoContext)

    /**
     * Exit a parse tree produced by [FoldingParser.compo].
     *
     * @param ctx The parse tree
     */
    public fun exitCompo(ctx: FoldingParser.CompoContext)
    /**
     * Enter a parse tree produced by [FoldingParser.remainLet_binding].
     *
     * @param ctx The parse tree
     */
    public fun enterRemainLet_binding(ctx: FoldingParser.RemainLet_bindingContext)

    /**
     * Exit a parse tree produced by [FoldingParser.remainLet_binding].
     *
     * @param ctx The parse tree
     */
    public fun exitRemainLet_binding(ctx: FoldingParser.RemainLet_bindingContext)
    /**
     * Enter a parse tree produced by [FoldingParser.returning].
     *
     * @param ctx The parse tree
     */
    public fun enterReturning(ctx: FoldingParser.ReturningContext)

    /**
     * Exit a parse tree produced by [FoldingParser.returning].
     *
     * @param ctx The parse tree
     */
    public fun exitReturning(ctx: FoldingParser.ReturningContext)
    /**
     * Enter a parse tree produced by the `globalFieldAssign` labeled alternative in [FoldingParser.fieldAssign].
     *
     * @param ctx The parse tree
     */
    public fun enterGlobalFieldAssign(ctx: FoldingParser.GlobalFieldAssignContext)

    /**
     * Exit a parse tree produced by the `globalFieldAssign` labeled alternative in [FoldingParser.fieldAssign].
     *
     * @param ctx The parse tree
     */
    public fun exitGlobalFieldAssign(ctx: FoldingParser.GlobalFieldAssignContext)
    /**
     * Enter a parse tree produced by the `objectFieldAssign` labeled alternative in [FoldingParser.fieldAssign].
     *
     * @param ctx The parse tree
     */
    public fun enterObjectFieldAssign(ctx: FoldingParser.ObjectFieldAssignContext)

    /**
     * Exit a parse tree produced by the `objectFieldAssign` labeled alternative in [FoldingParser.fieldAssign].
     *
     * @param ctx The parse tree
     */
    public fun exitObjectFieldAssign(ctx: FoldingParser.ObjectFieldAssignContext)
    /**
     * Enter a parse tree produced by the `justInterface` labeled alternative in [FoldingParser.class_].
     *
     * @param ctx The parse tree
     */
    public fun enterJustInterface(ctx: FoldingParser.JustInterfaceContext)

    /**
     * Exit a parse tree produced by the `justInterface` labeled alternative in [FoldingParser.class_].
     *
     * @param ctx The parse tree
     */
    public fun exitJustInterface(ctx: FoldingParser.JustInterfaceContext)
    /**
     * Enter a parse tree produced by the `justClass` labeled alternative in [FoldingParser.class_].
     *
     * @param ctx The parse tree
     */
    public fun enterJustClass(ctx: FoldingParser.JustClassContext)

    /**
     * Exit a parse tree produced by the `justClass` labeled alternative in [FoldingParser.class_].
     *
     * @param ctx The parse tree
     */
    public fun exitJustClass(ctx: FoldingParser.JustClassContext)
    /**
     * Enter a parse tree produced by the `justAbstractClass` labeled alternative in [FoldingParser.class_].
     *
     * @param ctx The parse tree
     */
    public fun enterJustAbstractClass(ctx: FoldingParser.JustAbstractClassContext)

    /**
     * Exit a parse tree produced by the `justAbstractClass` labeled alternative in [FoldingParser.class_].
     *
     * @param ctx The parse tree
     */
    public fun exitJustAbstractClass(ctx: FoldingParser.JustAbstractClassContext)
    /**
     * Enter a parse tree produced by [FoldingParser.constructor_].
     *
     * @param ctx The parse tree
     */
    public fun enterConstructor_(ctx: FoldingParser.Constructor_Context)

    /**
     * Exit a parse tree produced by [FoldingParser.constructor_].
     *
     * @param ctx The parse tree
     */
    public fun exitConstructor_(ctx: FoldingParser.Constructor_Context)
    /**
     * Enter a parse tree produced by [FoldingParser.constructorSelf].
     *
     * @param ctx The parse tree
     */
    public fun enterConstructorSelf(ctx: FoldingParser.ConstructorSelfContext)

    /**
     * Exit a parse tree produced by [FoldingParser.constructorSelf].
     *
     * @param ctx The parse tree
     */
    public fun exitConstructorSelf(ctx: FoldingParser.ConstructorSelfContext)
    /**
     * Enter a parse tree produced by [FoldingParser.defInInterface].
     *
     * @param ctx The parse tree
     */
    public fun enterDefInInterface(ctx: FoldingParser.DefInInterfaceContext)

    /**
     * Exit a parse tree produced by [FoldingParser.defInInterface].
     *
     * @param ctx The parse tree
     */
    public fun exitDefInInterface(ctx: FoldingParser.DefInInterfaceContext)
    /**
     * Enter a parse tree produced by [FoldingParser.fieldInInterface].
     *
     * @param ctx The parse tree
     */
    public fun enterFieldInInterface(ctx: FoldingParser.FieldInInterfaceContext)

    /**
     * Exit a parse tree produced by [FoldingParser.fieldInInterface].
     *
     * @param ctx The parse tree
     */
    public fun exitFieldInInterface(ctx: FoldingParser.FieldInInterfaceContext)
    /**
     * Enter a parse tree produced by [FoldingParser.inherit].
     *
     * @param ctx The parse tree
     */
    public fun enterInherit(ctx: FoldingParser.InheritContext)

    /**
     * Exit a parse tree produced by [FoldingParser.inherit].
     *
     * @param ctx The parse tree
     */
    public fun exitInherit(ctx: FoldingParser.InheritContext)
    /**
     * Enter a parse tree produced by [FoldingParser.impl].
     *
     * @param ctx The parse tree
     */
    public fun enterImpl(ctx: FoldingParser.ImplContext)

    /**
     * Exit a parse tree produced by [FoldingParser.impl].
     *
     * @param ctx The parse tree
     */
    public fun exitImpl(ctx: FoldingParser.ImplContext)
    /**
     * Enter a parse tree produced by [FoldingParser.implBody].
     *
     * @param ctx The parse tree
     */
    public fun enterImplBody(ctx: FoldingParser.ImplBodyContext)

    /**
     * Exit a parse tree produced by [FoldingParser.implBody].
     *
     * @param ctx The parse tree
     */
    public fun exitImplBody(ctx: FoldingParser.ImplBodyContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeParam].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeParam(ctx: FoldingParser.TypeParamContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeParam].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeParam(ctx: FoldingParser.TypeParamContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeParamCompo].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeParamCompo(ctx: FoldingParser.TypeParamCompoContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeParamCompo].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeParamCompo(ctx: FoldingParser.TypeParamCompoContext)
    /**
     * Enter a parse tree produced by [FoldingParser.definition].
     *
     * @param ctx The parse tree
     */
    public fun enterDefinition(ctx: FoldingParser.DefinitionContext)

    /**
     * Exit a parse tree produced by [FoldingParser.definition].
     *
     * @param ctx The parse tree
     */
    public fun exitDefinition(ctx: FoldingParser.DefinitionContext)
    /**
     * Enter a parse tree produced by [FoldingParser.defaultValue].
     *
     * @param ctx The parse tree
     */
    public fun enterDefaultValue(ctx: FoldingParser.DefaultValueContext)

    /**
     * Exit a parse tree produced by [FoldingParser.defaultValue].
     *
     * @param ctx The parse tree
     */
    public fun exitDefaultValue(ctx: FoldingParser.DefaultValueContext)
    /**
     * Enter a parse tree produced by [FoldingParser.boolean].
     *
     * @param ctx The parse tree
     */
    public fun enterBoolean(ctx: FoldingParser.BooleanContext)

    /**
     * Exit a parse tree produced by [FoldingParser.boolean].
     *
     * @param ctx The parse tree
     */
    public fun exitBoolean(ctx: FoldingParser.BooleanContext)
    /**
     * Enter a parse tree produced by the `callMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterCallMethod(ctx: FoldingParser.CallMethodContext)

    /**
     * Exit a parse tree produced by the `callMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitCallMethod(ctx: FoldingParser.CallMethodContext)
    /**
     * Enter a parse tree produced by the `reflected` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterReflected(ctx: FoldingParser.ReflectedContext)

    /**
     * Exit a parse tree produced by the `reflected` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitReflected(ctx: FoldingParser.ReflectedContext)
    /**
     * Enter a parse tree produced by the `callFunction` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterCallFunction(ctx: FoldingParser.CallFunctionContext)

    /**
     * Exit a parse tree produced by the `callFunction` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitCallFunction(ctx: FoldingParser.CallFunctionContext)
    /**
     * Enter a parse tree produced by the `typeCheck` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeCheck(ctx: FoldingParser.TypeCheckContext)

    /**
     * Exit a parse tree produced by the `typeCheck` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeCheck(ctx: FoldingParser.TypeCheckContext)
    /**
     * Enter a parse tree produced by the `useForeignClass` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterUseForeignClass(ctx: FoldingParser.UseForeignClassContext)

    /**
     * Exit a parse tree produced by the `useForeignClass` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitUseForeignClass(ctx: FoldingParser.UseForeignClassContext)
    /**
     * Enter a parse tree produced by the `callOpFunc` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterCallOpFunc(ctx: FoldingParser.CallOpFuncContext)

    /**
     * Exit a parse tree produced by the `callOpFunc` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitCallOpFunc(ctx: FoldingParser.CallOpFuncContext)
    /**
     * Enter a parse tree produced by the `tuple` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterTuple(ctx: FoldingParser.TupleContext)

    /**
     * Exit a parse tree produced by the `tuple` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitTuple(ctx: FoldingParser.TupleContext)
    /**
     * Enter a parse tree produced by the `justDefaultValue` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterJustDefaultValue(ctx: FoldingParser.JustDefaultValueContext)

    /**
     * Exit a parse tree produced by the `justDefaultValue` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitJustDefaultValue(ctx: FoldingParser.JustDefaultValueContext)
    /**
     * Enter a parse tree produced by the `anonymousClassObject` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterAnonymousClassObject(ctx: FoldingParser.AnonymousClassObjectContext)

    /**
     * Exit a parse tree produced by the `anonymousClassObject` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitAnonymousClassObject(ctx: FoldingParser.AnonymousClassObjectContext)
    /**
     * Enter a parse tree produced by the `getFieldGlobal` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterGetFieldGlobal(ctx: FoldingParser.GetFieldGlobalContext)

    /**
     * Exit a parse tree produced by the `getFieldGlobal` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitGetFieldGlobal(ctx: FoldingParser.GetFieldGlobalContext)
    /**
     * Enter a parse tree produced by the `letExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterLetExpression(ctx: FoldingParser.LetExpressionContext)

    /**
     * Exit a parse tree produced by the `letExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitLetExpression(ctx: FoldingParser.LetExpressionContext)
    /**
     * Enter a parse tree produced by the `doExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterDoExpression(ctx: FoldingParser.DoExpressionContext)

    /**
     * Exit a parse tree produced by the `doExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitDoExpression(ctx: FoldingParser.DoExpressionContext)
    /**
     * Enter a parse tree produced by the `invokeValueLikeMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterInvokeValueLikeMethod(ctx: FoldingParser.InvokeValueLikeMethodContext)

    /**
     * Exit a parse tree produced by the `invokeValueLikeMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitInvokeValueLikeMethod(ctx: FoldingParser.InvokeValueLikeMethodContext)
    /**
     * Enter a parse tree produced by the `ifExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterIfExpression(ctx: FoldingParser.IfExpressionContext)

    /**
     * Exit a parse tree produced by the `ifExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitIfExpression(ctx: FoldingParser.IfExpressionContext)
    /**
     * Enter a parse tree produced by the `simpleIf` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterSimpleIf(ctx: FoldingParser.SimpleIfContext)

    /**
     * Exit a parse tree produced by the `simpleIf` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitSimpleIf(ctx: FoldingParser.SimpleIfContext)
    /**
     * Enter a parse tree produced by the `invokeValue` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterInvokeValue(ctx: FoldingParser.InvokeValueContext)

    /**
     * Exit a parse tree produced by the `invokeValue` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitInvokeValue(ctx: FoldingParser.InvokeValueContext)
    /**
     * Enter a parse tree produced by the `outputOfInversing` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterOutputOfInversing(ctx: FoldingParser.OutputOfInversingContext)

    /**
     * Exit a parse tree produced by the `outputOfInversing` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitOutputOfInversing(ctx: FoldingParser.OutputOfInversingContext)
    /**
     * Enter a parse tree produced by the `callAopFunc` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterCallAopFunc(ctx: FoldingParser.CallAopFuncContext)

    /**
     * Exit a parse tree produced by the `callAopFunc` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitCallAopFunc(ctx: FoldingParser.CallAopFuncContext)
    /**
     * Enter a parse tree produced by the `callAopFuncBack` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterCallAopFuncBack(ctx: FoldingParser.CallAopFuncBackContext)

    /**
     * Exit a parse tree produced by the `callAopFuncBack` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitCallAopFuncBack(ctx: FoldingParser.CallAopFuncBackContext)
    /**
     * Enter a parse tree produced by the `this` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterThis(ctx: FoldingParser.ThisContext)

    /**
     * Exit a parse tree produced by the `this` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitThis(ctx: FoldingParser.ThisContext)
    /**
     * Enter a parse tree produced by the `getField` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterGetField(ctx: FoldingParser.GetFieldContext)

    /**
     * Exit a parse tree produced by the `getField` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitGetField(ctx: FoldingParser.GetFieldContext)
    /**
     * Enter a parse tree produced by the `callFunctionLikeMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterCallFunctionLikeMethod(ctx: FoldingParser.CallFunctionLikeMethodContext)

    /**
     * Exit a parse tree produced by the `callFunctionLikeMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitCallFunctionLikeMethod(ctx: FoldingParser.CallFunctionLikeMethodContext)
    /**
     * Enter a parse tree produced by the `reflectedMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterReflectedMethod(ctx: FoldingParser.ReflectedMethodContext)

    /**
     * Exit a parse tree produced by the `reflectedMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitReflectedMethod(ctx: FoldingParser.ReflectedMethodContext)
    /**
     * Enter a parse tree produced by the `justLambda` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterJustLambda(ctx: FoldingParser.JustLambdaContext)

    /**
     * Exit a parse tree produced by the `justLambda` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitJustLambda(ctx: FoldingParser.JustLambdaContext)
    /**
     * Enter a parse tree produced by the `parenedValue` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterParenedValue(ctx: FoldingParser.ParenedValueContext)

    /**
     * Exit a parse tree produced by the `parenedValue` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitParenedValue(ctx: FoldingParser.ParenedValueContext)
    /**
     * Enter a parse tree produced by the `null` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterNull(ctx: FoldingParser.NullContext)

    /**
     * Exit a parse tree produced by the `null` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitNull(ctx: FoldingParser.NullContext)
    /**
     * Enter a parse tree produced by the `valueTypeCasting` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterValueTypeCasting(ctx: FoldingParser.ValueTypeCastingContext)

    /**
     * Exit a parse tree produced by the `valueTypeCasting` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitValueTypeCasting(ctx: FoldingParser.ValueTypeCastingContext)
    /**
     * Enter a parse tree produced by the `patternMatchExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun enterPatternMatchExpression(ctx: FoldingParser.PatternMatchExpressionContext)

    /**
     * Exit a parse tree produced by the `patternMatchExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     */
    public fun exitPatternMatchExpression(ctx: FoldingParser.PatternMatchExpressionContext)
    /**
     * Enter a parse tree produced by [FoldingParser.reference].
     *
     * @param ctx The parse tree
     */
    public fun enterReference(ctx: FoldingParser.ReferenceContext)

    /**
     * Exit a parse tree produced by [FoldingParser.reference].
     *
     * @param ctx The parse tree
     */
    public fun exitReference(ctx: FoldingParser.ReferenceContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeCasting].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeCasting(ctx: FoldingParser.TypeCastingContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeCasting].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeCasting(ctx: FoldingParser.TypeCastingContext)
    /**
     * Enter a parse tree produced by [FoldingParser.if_else].
     *
     * @param ctx The parse tree
     */
    public fun enterIf_else(ctx: FoldingParser.If_elseContext)

    /**
     * Exit a parse tree produced by [FoldingParser.if_else].
     *
     * @param ctx The parse tree
     */
    public fun exitIf_else(ctx: FoldingParser.If_elseContext)
    /**
     * Enter a parse tree produced by [FoldingParser.let_binding].
     *
     * @param ctx The parse tree
     */
    public fun enterLet_binding(ctx: FoldingParser.Let_bindingContext)

    /**
     * Exit a parse tree produced by [FoldingParser.let_binding].
     *
     * @param ctx The parse tree
     */
    public fun exitLet_binding(ctx: FoldingParser.Let_bindingContext)
    /**
     * Enter a parse tree produced by [FoldingParser.patternMatch].
     *
     * @param ctx The parse tree
     */
    public fun enterPatternMatch(ctx: FoldingParser.PatternMatchContext)

    /**
     * Exit a parse tree produced by [FoldingParser.patternMatch].
     *
     * @param ctx The parse tree
     */
    public fun exitPatternMatch(ctx: FoldingParser.PatternMatchContext)
    /**
     * Enter a parse tree produced by [FoldingParser.patternMatchCompo].
     *
     * @param ctx The parse tree
     */
    public fun enterPatternMatchCompo(ctx: FoldingParser.PatternMatchCompoContext)

    /**
     * Exit a parse tree produced by [FoldingParser.patternMatchCompo].
     *
     * @param ctx The parse tree
     */
    public fun exitPatternMatchCompo(ctx: FoldingParser.PatternMatchCompoContext)
    /**
     * Enter a parse tree produced by [FoldingParser.tupleEx].
     *
     * @param ctx The parse tree
     */
    public fun enterTupleEx(ctx: FoldingParser.TupleExContext)

    /**
     * Exit a parse tree produced by [FoldingParser.tupleEx].
     *
     * @param ctx The parse tree
     */
    public fun exitTupleEx(ctx: FoldingParser.TupleExContext)
    /**
     * Enter a parse tree produced by [FoldingParser.paramEx].
     *
     * @param ctx The parse tree
     */
    public fun enterParamEx(ctx: FoldingParser.ParamExContext)

    /**
     * Exit a parse tree produced by [FoldingParser.paramEx].
     *
     * @param ctx The parse tree
     */
    public fun exitParamEx(ctx: FoldingParser.ParamExContext)
    /**
     * Enter a parse tree produced by [FoldingParser.parameter].
     *
     * @param ctx The parse tree
     */
    public fun enterParameter(ctx: FoldingParser.ParameterContext)

    /**
     * Exit a parse tree produced by [FoldingParser.parameter].
     *
     * @param ctx The parse tree
     */
    public fun exitParameter(ctx: FoldingParser.ParameterContext)
    /**
     * Enter a parse tree produced by the `singleArg` labeled alternative in [FoldingParser.argEx].
     *
     * @param ctx The parse tree
     */
    public fun enterSingleArg(ctx: FoldingParser.SingleArgContext)

    /**
     * Exit a parse tree produced by the `singleArg` labeled alternative in [FoldingParser.argEx].
     *
     * @param ctx The parse tree
     */
    public fun exitSingleArg(ctx: FoldingParser.SingleArgContext)
    /**
     * Enter a parse tree produced by the `multiArg` labeled alternative in [FoldingParser.argEx].
     *
     * @param ctx The parse tree
     */
    public fun enterMultiArg(ctx: FoldingParser.MultiArgContext)

    /**
     * Exit a parse tree produced by the `multiArg` labeled alternative in [FoldingParser.argEx].
     *
     * @param ctx The parse tree
     */
    public fun exitMultiArg(ctx: FoldingParser.MultiArgContext)
    /**
     * Enter a parse tree produced by the `primaryArgValue` labeled alternative in [FoldingParser.argValue].
     *
     * @param ctx The parse tree
     */
    public fun enterPrimaryArgValue(ctx: FoldingParser.PrimaryArgValueContext)

    /**
     * Exit a parse tree produced by the `primaryArgValue` labeled alternative in [FoldingParser.argValue].
     *
     * @param ctx The parse tree
     */
    public fun exitPrimaryArgValue(ctx: FoldingParser.PrimaryArgValueContext)
    /**
     * Enter a parse tree produced by the `singleListArgValue` labeled alternative in [FoldingParser.argValue].
     *
     * @param ctx The parse tree
     */
    public fun enterSingleListArgValue(ctx: FoldingParser.SingleListArgValueContext)

    /**
     * Exit a parse tree produced by the `singleListArgValue` labeled alternative in [FoldingParser.argValue].
     *
     * @param ctx The parse tree
     */
    public fun exitSingleListArgValue(ctx: FoldingParser.SingleListArgValueContext)
    /**
     * Enter a parse tree produced by [FoldingParser.invoking].
     *
     * @param ctx The parse tree
     */
    public fun enterInvoking(ctx: FoldingParser.InvokingContext)

    /**
     * Exit a parse tree produced by [FoldingParser.invoking].
     *
     * @param ctx The parse tree
     */
    public fun exitInvoking(ctx: FoldingParser.InvokingContext)
    /**
     * Enter a parse tree produced by [FoldingParser.commonOpIdentifier].
     *
     * @param ctx The parse tree
     */
    public fun enterCommonOpIdentifier(ctx: FoldingParser.CommonOpIdentifierContext)

    /**
     * Exit a parse tree produced by [FoldingParser.commonOpIdentifier].
     *
     * @param ctx The parse tree
     */
    public fun exitCommonOpIdentifier(ctx: FoldingParser.CommonOpIdentifierContext)
    /**
     * Enter a parse tree produced by [FoldingParser.commonIdentifier].
     *
     * @param ctx The parse tree
     */
    public fun enterCommonIdentifier(ctx: FoldingParser.CommonIdentifierContext)

    /**
     * Exit a parse tree produced by [FoldingParser.commonIdentifier].
     *
     * @param ctx The parse tree
     */
    public fun exitCommonIdentifier(ctx: FoldingParser.CommonIdentifierContext)
    /**
     * Enter a parse tree produced by [FoldingParser.opIdWrap].
     *
     * @param ctx The parse tree
     */
    public fun enterOpIdWrap(ctx: FoldingParser.OpIdWrapContext)

    /**
     * Exit a parse tree produced by [FoldingParser.opIdWrap].
     *
     * @param ctx The parse tree
     */
    public fun exitOpIdWrap(ctx: FoldingParser.OpIdWrapContext)
    /**
     * Enter a parse tree produced by [FoldingParser.aopIdWrap].
     *
     * @param ctx The parse tree
     */
    public fun enterAopIdWrap(ctx: FoldingParser.AopIdWrapContext)

    /**
     * Exit a parse tree produced by [FoldingParser.aopIdWrap].
     *
     * @param ctx The parse tree
     */
    public fun exitAopIdWrap(ctx: FoldingParser.AopIdWrapContext)
    /**
     * Enter a parse tree produced by [FoldingParser.commonClassIdentifier].
     *
     * @param ctx The parse tree
     */
    public fun enterCommonClassIdentifier(ctx: FoldingParser.CommonClassIdentifierContext)

    /**
     * Exit a parse tree produced by [FoldingParser.commonClassIdentifier].
     *
     * @param ctx The parse tree
     */
    public fun exitCommonClassIdentifier(ctx: FoldingParser.CommonClassIdentifierContext)
    /**
     * Enter a parse tree produced by [FoldingParser.field].
     *
     * @param ctx The parse tree
     */
    public fun enterField(ctx: FoldingParser.FieldContext)

    /**
     * Exit a parse tree produced by [FoldingParser.field].
     *
     * @param ctx The parse tree
     */
    public fun exitField(ctx: FoldingParser.FieldContext)
    /**
     * Enter a parse tree produced by [FoldingParser.fieldNotInit].
     *
     * @param ctx The parse tree
     */
    public fun enterFieldNotInit(ctx: FoldingParser.FieldNotInitContext)

    /**
     * Exit a parse tree produced by [FoldingParser.fieldNotInit].
     *
     * @param ctx The parse tree
     */
    public fun exitFieldNotInit(ctx: FoldingParser.FieldNotInitContext)
    /**
     * Enter a parse tree produced by [FoldingParser.fieldSetted].
     *
     * @param ctx The parse tree
     */
    public fun enterFieldSetted(ctx: FoldingParser.FieldSettedContext)

    /**
     * Exit a parse tree produced by [FoldingParser.fieldSetted].
     *
     * @param ctx The parse tree
     */
    public fun exitFieldSetted(ctx: FoldingParser.FieldSettedContext)
    /**
     * Enter a parse tree produced by [FoldingParser.foreignField].
     *
     * @param ctx The parse tree
     */
    public fun enterForeignField(ctx: FoldingParser.ForeignFieldContext)

    /**
     * Exit a parse tree produced by [FoldingParser.foreignField].
     *
     * @param ctx The parse tree
     */
    public fun exitForeignField(ctx: FoldingParser.ForeignFieldContext)
    /**
     * Enter a parse tree produced by [FoldingParser.def].
     *
     * @param ctx The parse tree
     */
    public fun enterDef(ctx: FoldingParser.DefContext)

    /**
     * Exit a parse tree produced by [FoldingParser.def].
     *
     * @param ctx The parse tree
     */
    public fun exitDef(ctx: FoldingParser.DefContext)
    /**
     * Enter a parse tree produced by [FoldingParser.justDef].
     *
     * @param ctx The parse tree
     */
    public fun enterJustDef(ctx: FoldingParser.JustDefContext)

    /**
     * Exit a parse tree produced by [FoldingParser.justDef].
     *
     * @param ctx The parse tree
     */
    public fun exitJustDef(ctx: FoldingParser.JustDefContext)
    /**
     * Enter a parse tree produced by [FoldingParser.foreignDef].
     *
     * @param ctx The parse tree
     */
    public fun enterForeignDef(ctx: FoldingParser.ForeignDefContext)

    /**
     * Exit a parse tree produced by [FoldingParser.foreignDef].
     *
     * @param ctx The parse tree
     */
    public fun exitForeignDef(ctx: FoldingParser.ForeignDefContext)
    /**
     * Enter a parse tree produced by the `simpleInverseDef` labeled alternative in [FoldingParser.inverseDefining].
     *
     * @param ctx The parse tree
     */
    public fun enterSimpleInverseDef(ctx: FoldingParser.SimpleInverseDefContext)

    /**
     * Exit a parse tree produced by the `simpleInverseDef` labeled alternative in [FoldingParser.inverseDefining].
     *
     * @param ctx The parse tree
     */
    public fun exitSimpleInverseDef(ctx: FoldingParser.SimpleInverseDefContext)
    /**
     * Enter a parse tree produced by the `rawInverseDef` labeled alternative in [FoldingParser.inverseDefining].
     *
     * @param ctx The parse tree
     */
    public fun enterRawInverseDef(ctx: FoldingParser.RawInverseDefContext)

    /**
     * Exit a parse tree produced by the `rawInverseDef` labeled alternative in [FoldingParser.inverseDefining].
     *
     * @param ctx The parse tree
     */
    public fun exitRawInverseDef(ctx: FoldingParser.RawInverseDefContext)
    /**
     * Enter a parse tree produced by the `outputParam` labeled alternative in [FoldingParser.inverseDefCompo].
     *
     * @param ctx The parse tree
     */
    public fun enterOutputParam(ctx: FoldingParser.OutputParamContext)

    /**
     * Exit a parse tree produced by the `outputParam` labeled alternative in [FoldingParser.inverseDefCompo].
     *
     * @param ctx The parse tree
     */
    public fun exitOutputParam(ctx: FoldingParser.OutputParamContext)
    /**
     * Enter a parse tree produced by the `necessaryParam` labeled alternative in [FoldingParser.inverseDefCompo].
     *
     * @param ctx The parse tree
     */
    public fun enterNecessaryParam(ctx: FoldingParser.NecessaryParamContext)

    /**
     * Exit a parse tree produced by the `necessaryParam` labeled alternative in [FoldingParser.inverseDefCompo].
     *
     * @param ctx The parse tree
     */
    public fun exitNecessaryParam(ctx: FoldingParser.NecessaryParamContext)
    /**
     * Enter a parse tree produced by [FoldingParser.inverseDefGateCompo].
     *
     * @param ctx The parse tree
     */
    public fun enterInverseDefGateCompo(ctx: FoldingParser.InverseDefGateCompoContext)

    /**
     * Exit a parse tree produced by [FoldingParser.inverseDefGateCompo].
     *
     * @param ctx The parse tree
     */
    public fun exitInverseDefGateCompo(ctx: FoldingParser.InverseDefGateCompoContext)
    /**
     * Enter a parse tree produced by [FoldingParser.lambda].
     *
     * @param ctx The parse tree
     */
    public fun enterLambda(ctx: FoldingParser.LambdaContext)

    /**
     * Exit a parse tree produced by [FoldingParser.lambda].
     *
     * @param ctx The parse tree
     */
    public fun exitLambda(ctx: FoldingParser.LambdaContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeEx].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeEx(ctx: FoldingParser.TypeExContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeEx].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeEx(ctx: FoldingParser.TypeExContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeExSingle].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeExSingle(ctx: FoldingParser.TypeExSingleContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeExSingle].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeExSingle(ctx: FoldingParser.TypeExSingleContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeArgEx].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeArgEx(ctx: FoldingParser.TypeArgExContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeArgEx].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeArgEx(ctx: FoldingParser.TypeArgExContext)
    /**
     * Enter a parse tree produced by [FoldingParser.primitiveType].
     *
     * @param ctx The parse tree
     */
    public fun enterPrimitiveType(ctx: FoldingParser.PrimitiveTypeContext)

    /**
     * Exit a parse tree produced by [FoldingParser.primitiveType].
     *
     * @param ctx The parse tree
     */
    public fun exitPrimitiveType(ctx: FoldingParser.PrimitiveTypeContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeExParamEx].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeExParamEx(ctx: FoldingParser.TypeExParamExContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeExParamEx].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeExParamEx(ctx: FoldingParser.TypeExParamExContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeExFunc].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeExFunc(ctx: FoldingParser.TypeExFuncContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeExFunc].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeExFunc(ctx: FoldingParser.TypeExFuncContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeExCovariant].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeExCovariant(ctx: FoldingParser.TypeExCovariantContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeExCovariant].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeExCovariant(ctx: FoldingParser.TypeExCovariantContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeExContravariant].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeExContravariant(ctx: FoldingParser.TypeExContravariantContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeExContravariant].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeExContravariant(ctx: FoldingParser.TypeExContravariantContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeExWildcard].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeExWildcard(ctx: FoldingParser.TypeExWildcardContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeExWildcard].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeExWildcard(ctx: FoldingParser.TypeExWildcardContext)
    /**
     * Enter a parse tree produced by [FoldingParser.foreignBody].
     *
     * @param ctx The parse tree
     */
    public fun enterForeignBody(ctx: FoldingParser.ForeignBodyContext)

    /**
     * Exit a parse tree produced by [FoldingParser.foreignBody].
     *
     * @param ctx The parse tree
     */
    public fun exitForeignBody(ctx: FoldingParser.ForeignBodyContext)
    /**
     * Enter a parse tree produced by [FoldingParser.foreignElement].
     *
     * @param ctx The parse tree
     */
    public fun enterForeignElement(ctx: FoldingParser.ForeignElementContext)

    /**
     * Exit a parse tree produced by [FoldingParser.foreignElement].
     *
     * @param ctx The parse tree
     */
    public fun exitForeignElement(ctx: FoldingParser.ForeignElementContext)
    /**
     * Enter a parse tree produced by [FoldingParser.foreignPlatform].
     *
     * @param ctx The parse tree
     */
    public fun enterForeignPlatform(ctx: FoldingParser.ForeignPlatformContext)

    /**
     * Exit a parse tree produced by [FoldingParser.foreignPlatform].
     *
     * @param ctx The parse tree
     */
    public fun exitForeignPlatform(ctx: FoldingParser.ForeignPlatformContext)
    /**
     * Enter a parse tree produced by [FoldingParser.typeAlias].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeAlias(ctx: FoldingParser.TypeAliasContext)

    /**
     * Exit a parse tree produced by [FoldingParser.typeAlias].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeAlias(ctx: FoldingParser.TypeAliasContext)
    /**
     * Enter a parse tree produced by [FoldingParser.foreignTypeExpectitive].
     *
     * @param ctx The parse tree
     */
    public fun enterForeignTypeExpectitive(ctx: FoldingParser.ForeignTypeExpectitiveContext)

    /**
     * Exit a parse tree produced by [FoldingParser.foreignTypeExpectitive].
     *
     * @param ctx The parse tree
     */
    public fun exitForeignTypeExpectitive(ctx: FoldingParser.ForeignTypeExpectitiveContext)
    /**
     * Enter a parse tree produced by [FoldingParser.annotationDef].
     *
     * @param ctx The parse tree
     */
    public fun enterAnnotationDef(ctx: FoldingParser.AnnotationDefContext)

    /**
     * Exit a parse tree produced by [FoldingParser.annotationDef].
     *
     * @param ctx The parse tree
     */
    public fun exitAnnotationDef(ctx: FoldingParser.AnnotationDefContext)
    /**
     * Enter a parse tree produced by [FoldingParser.annotation].
     *
     * @param ctx The parse tree
     */
    public fun enterAnnotation(ctx: FoldingParser.AnnotationContext)

    /**
     * Exit a parse tree produced by [FoldingParser.annotation].
     *
     * @param ctx The parse tree
     */
    public fun exitAnnotation(ctx: FoldingParser.AnnotationContext)
    /**
     * Enter a parse tree produced by [FoldingParser.annotationBlock].
     *
     * @param ctx The parse tree
     */
    public fun enterAnnotationBlock(ctx: FoldingParser.AnnotationBlockContext)

    /**
     * Exit a parse tree produced by [FoldingParser.annotationBlock].
     *
     * @param ctx The parse tree
     */
    public fun exitAnnotationBlock(ctx: FoldingParser.AnnotationBlockContext)
}