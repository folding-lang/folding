// Generated from Folding.g4 by ANTLR 4.13.1

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced by [FoldingParser].
 *
 * @param T The return type of the visit operation. Use [Unit] for operations with no return type.
 */
public interface FoldingVisitor<T> : ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by [FoldingParser.file].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitFile(ctx: FoldingParser.FileContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.fileCompo].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitFileCompo(ctx: FoldingParser.FileCompoContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.importEx].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitImportEx(ctx: FoldingParser.ImportExContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.importBody].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitImportBody(ctx: FoldingParser.ImportBodyContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.importCompo].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitImportCompo(ctx: FoldingParser.ImportCompoContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.importDefAlias].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitImportDefAlias(ctx: FoldingParser.ImportDefAliasContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.importClassAlias].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitImportClassAlias(ctx: FoldingParser.ImportClassAliasContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.importType].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitImportType(ctx: FoldingParser.ImportTypeContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.importPath].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitImportPath(ctx: FoldingParser.ImportPathContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.importNest].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitImportNest(ctx: FoldingParser.ImportNestContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.packagePiece].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitPackagePiece(ctx: FoldingParser.PackagePieceContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.package_].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitPackage_(ctx: FoldingParser.Package_Context): T
    /**
     * Visit a parse tree produced by [FoldingParser.namespace].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitNamespace(ctx: FoldingParser.NamespaceContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.doBlock].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitDoBlock(ctx: FoldingParser.DoBlockContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.compo].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitCompo(ctx: FoldingParser.CompoContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.remainLet_binding].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitRemainLet_binding(ctx: FoldingParser.RemainLet_bindingContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.returning].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitReturning(ctx: FoldingParser.ReturningContext): T
    /**
     * Visit a parse tree produced by the `globalFieldAssign` labeled alternative in [FoldingParser.fieldAssign].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitGlobalFieldAssign(ctx: FoldingParser.GlobalFieldAssignContext): T
    /**
     * Visit a parse tree produced by the `objectFieldAssign` labeled alternative in [FoldingParser.fieldAssign].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitObjectFieldAssign(ctx: FoldingParser.ObjectFieldAssignContext): T
    /**
     * Visit a parse tree produced by the `justInterface` labeled alternative in [FoldingParser.class_].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitJustInterface(ctx: FoldingParser.JustInterfaceContext): T
    /**
     * Visit a parse tree produced by the `justClass` labeled alternative in [FoldingParser.class_].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitJustClass(ctx: FoldingParser.JustClassContext): T
    /**
     * Visit a parse tree produced by the `justAbstractClass` labeled alternative in [FoldingParser.class_].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitJustAbstractClass(ctx: FoldingParser.JustAbstractClassContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.constructor_].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitConstructor_(ctx: FoldingParser.Constructor_Context): T
    /**
     * Visit a parse tree produced by [FoldingParser.constructorSelf].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitConstructorSelf(ctx: FoldingParser.ConstructorSelfContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.defInInterface].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitDefInInterface(ctx: FoldingParser.DefInInterfaceContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.fieldInInterface].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitFieldInInterface(ctx: FoldingParser.FieldInInterfaceContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.inherit].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitInherit(ctx: FoldingParser.InheritContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.impl].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitImpl(ctx: FoldingParser.ImplContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.implBody].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitImplBody(ctx: FoldingParser.ImplBodyContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeParam].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeParam(ctx: FoldingParser.TypeParamContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeParamCompo].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeParamCompo(ctx: FoldingParser.TypeParamCompoContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.definition].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitDefinition(ctx: FoldingParser.DefinitionContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.defaultValue].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitDefaultValue(ctx: FoldingParser.DefaultValueContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.boolean].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitBoolean(ctx: FoldingParser.BooleanContext): T
    /**
     * Visit a parse tree produced by the `callMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitCallMethod(ctx: FoldingParser.CallMethodContext): T
    /**
     * Visit a parse tree produced by the `reflected` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitReflected(ctx: FoldingParser.ReflectedContext): T
    /**
     * Visit a parse tree produced by the `callFunction` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitCallFunction(ctx: FoldingParser.CallFunctionContext): T
    /**
     * Visit a parse tree produced by the `typeCheck` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeCheck(ctx: FoldingParser.TypeCheckContext): T
    /**
     * Visit a parse tree produced by the `useForeignClass` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitUseForeignClass(ctx: FoldingParser.UseForeignClassContext): T
    /**
     * Visit a parse tree produced by the `callOpFunc` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitCallOpFunc(ctx: FoldingParser.CallOpFuncContext): T
    /**
     * Visit a parse tree produced by the `tuple` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTuple(ctx: FoldingParser.TupleContext): T
    /**
     * Visit a parse tree produced by the `justDefaultValue` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitJustDefaultValue(ctx: FoldingParser.JustDefaultValueContext): T
    /**
     * Visit a parse tree produced by the `anonymousClassObject` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitAnonymousClassObject(ctx: FoldingParser.AnonymousClassObjectContext): T
    /**
     * Visit a parse tree produced by the `getFieldGlobal` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitGetFieldGlobal(ctx: FoldingParser.GetFieldGlobalContext): T
    /**
     * Visit a parse tree produced by the `letExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitLetExpression(ctx: FoldingParser.LetExpressionContext): T
    /**
     * Visit a parse tree produced by the `doExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitDoExpression(ctx: FoldingParser.DoExpressionContext): T
    /**
     * Visit a parse tree produced by the `invokeValueLikeMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitInvokeValueLikeMethod(ctx: FoldingParser.InvokeValueLikeMethodContext): T
    /**
     * Visit a parse tree produced by the `ifExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitIfExpression(ctx: FoldingParser.IfExpressionContext): T
    /**
     * Visit a parse tree produced by the `simpleIf` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitSimpleIf(ctx: FoldingParser.SimpleIfContext): T
    /**
     * Visit a parse tree produced by the `invokeValue` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitInvokeValue(ctx: FoldingParser.InvokeValueContext): T
    /**
     * Visit a parse tree produced by the `outputOfInversing` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitOutputOfInversing(ctx: FoldingParser.OutputOfInversingContext): T
    /**
     * Visit a parse tree produced by the `callAopFunc` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitCallAopFunc(ctx: FoldingParser.CallAopFuncContext): T
    /**
     * Visit a parse tree produced by the `callAopFuncBack` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitCallAopFuncBack(ctx: FoldingParser.CallAopFuncBackContext): T
    /**
     * Visit a parse tree produced by the `this` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitThis(ctx: FoldingParser.ThisContext): T
    /**
     * Visit a parse tree produced by the `getField` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitGetField(ctx: FoldingParser.GetFieldContext): T
    /**
     * Visit a parse tree produced by the `callFunctionLikeMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitCallFunctionLikeMethod(ctx: FoldingParser.CallFunctionLikeMethodContext): T
    /**
     * Visit a parse tree produced by the `reflectedMethod` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitReflectedMethod(ctx: FoldingParser.ReflectedMethodContext): T
    /**
     * Visit a parse tree produced by the `justLambda` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitJustLambda(ctx: FoldingParser.JustLambdaContext): T
    /**
     * Visit a parse tree produced by the `parenedValue` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitParenedValue(ctx: FoldingParser.ParenedValueContext): T
    /**
     * Visit a parse tree produced by the `null` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitNull(ctx: FoldingParser.NullContext): T
    /**
     * Visit a parse tree produced by the `valueTypeCasting` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitValueTypeCasting(ctx: FoldingParser.ValueTypeCastingContext): T
    /**
     * Visit a parse tree produced by the `patternMatchExpression` labeled alternative in [FoldingParser.value].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitPatternMatchExpression(ctx: FoldingParser.PatternMatchExpressionContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.reference].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitReference(ctx: FoldingParser.ReferenceContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeCasting].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeCasting(ctx: FoldingParser.TypeCastingContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.if_else].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitIf_else(ctx: FoldingParser.If_elseContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.let_binding].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitLet_binding(ctx: FoldingParser.Let_bindingContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.patternMatch].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitPatternMatch(ctx: FoldingParser.PatternMatchContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.patternMatchCompo].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitPatternMatchCompo(ctx: FoldingParser.PatternMatchCompoContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.tupleEx].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTupleEx(ctx: FoldingParser.TupleExContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.paramEx].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitParamEx(ctx: FoldingParser.ParamExContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.parameter].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitParameter(ctx: FoldingParser.ParameterContext): T
    /**
     * Visit a parse tree produced by the `singleArg` labeled alternative in [FoldingParser.argEx].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitSingleArg(ctx: FoldingParser.SingleArgContext): T
    /**
     * Visit a parse tree produced by the `multiArg` labeled alternative in [FoldingParser.argEx].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitMultiArg(ctx: FoldingParser.MultiArgContext): T
    /**
     * Visit a parse tree produced by the `primaryArgValue` labeled alternative in [FoldingParser.argValue].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitPrimaryArgValue(ctx: FoldingParser.PrimaryArgValueContext): T
    /**
     * Visit a parse tree produced by the `singleListArgValue` labeled alternative in [FoldingParser.argValue].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitSingleListArgValue(ctx: FoldingParser.SingleListArgValueContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.invoking].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitInvoking(ctx: FoldingParser.InvokingContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.commonOpIdentifier].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitCommonOpIdentifier(ctx: FoldingParser.CommonOpIdentifierContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.commonIdentifier].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitCommonIdentifier(ctx: FoldingParser.CommonIdentifierContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.opIdWrap].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitOpIdWrap(ctx: FoldingParser.OpIdWrapContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.aopIdWrap].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitAopIdWrap(ctx: FoldingParser.AopIdWrapContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.commonClassIdentifier].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitCommonClassIdentifier(ctx: FoldingParser.CommonClassIdentifierContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.field].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitField(ctx: FoldingParser.FieldContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.fieldNotInit].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitFieldNotInit(ctx: FoldingParser.FieldNotInitContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.fieldSetted].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitFieldSetted(ctx: FoldingParser.FieldSettedContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.foreignField].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitForeignField(ctx: FoldingParser.ForeignFieldContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.def].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitDef(ctx: FoldingParser.DefContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.justDef].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitJustDef(ctx: FoldingParser.JustDefContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.foreignDef].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitForeignDef(ctx: FoldingParser.ForeignDefContext): T
    /**
     * Visit a parse tree produced by the `simpleInverseDef` labeled alternative in [FoldingParser.inverseDefining].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitSimpleInverseDef(ctx: FoldingParser.SimpleInverseDefContext): T
    /**
     * Visit a parse tree produced by the `rawInverseDef` labeled alternative in [FoldingParser.inverseDefining].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitRawInverseDef(ctx: FoldingParser.RawInverseDefContext): T
    /**
     * Visit a parse tree produced by the `outputParam` labeled alternative in [FoldingParser.inverseDefCompo].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitOutputParam(ctx: FoldingParser.OutputParamContext): T
    /**
     * Visit a parse tree produced by the `necessaryParam` labeled alternative in [FoldingParser.inverseDefCompo].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitNecessaryParam(ctx: FoldingParser.NecessaryParamContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.inverseDefGateCompo].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitInverseDefGateCompo(ctx: FoldingParser.InverseDefGateCompoContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.lambda].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitLambda(ctx: FoldingParser.LambdaContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeEx].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeEx(ctx: FoldingParser.TypeExContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeExSingle].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeExSingle(ctx: FoldingParser.TypeExSingleContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeArgEx].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeArgEx(ctx: FoldingParser.TypeArgExContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.primitiveType].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitPrimitiveType(ctx: FoldingParser.PrimitiveTypeContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeExParamEx].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeExParamEx(ctx: FoldingParser.TypeExParamExContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeExFunc].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeExFunc(ctx: FoldingParser.TypeExFuncContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeExCovariant].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeExCovariant(ctx: FoldingParser.TypeExCovariantContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeExContravariant].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeExContravariant(ctx: FoldingParser.TypeExContravariantContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeExWildcard].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeExWildcard(ctx: FoldingParser.TypeExWildcardContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.foreignBody].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitForeignBody(ctx: FoldingParser.ForeignBodyContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.foreignElement].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitForeignElement(ctx: FoldingParser.ForeignElementContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.foreignPlatform].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitForeignPlatform(ctx: FoldingParser.ForeignPlatformContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.typeAlias].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeAlias(ctx: FoldingParser.TypeAliasContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.foreignTypeExpectitive].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitForeignTypeExpectitive(ctx: FoldingParser.ForeignTypeExpectitiveContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.annotationDef].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitAnnotationDef(ctx: FoldingParser.AnnotationDefContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.annotation].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitAnnotation(ctx: FoldingParser.AnnotationContext): T
    /**
     * Visit a parse tree produced by [FoldingParser.annotationBlock].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitAnnotationBlock(ctx: FoldingParser.AnnotationBlockContext): T
}