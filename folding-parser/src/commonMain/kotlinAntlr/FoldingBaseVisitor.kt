// Generated from Folding.g4 by ANTLR 4.13.1

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of [FoldingVisitor],
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param T The return type of the visit operation. Use [Unit] for operations with no return type.
 */
public open class FoldingBaseVisitor<T> : AbstractParseTreeVisitor<T>(), FoldingVisitor<T> {
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitFile(ctx: FoldingParser.FileContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitFileCompo(ctx: FoldingParser.FileCompoContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitImportEx(ctx: FoldingParser.ImportExContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitImportBody(ctx: FoldingParser.ImportBodyContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitImportCompo(ctx: FoldingParser.ImportCompoContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitImportDefAlias(ctx: FoldingParser.ImportDefAliasContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitImportClassAlias(ctx: FoldingParser.ImportClassAliasContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitImportType(ctx: FoldingParser.ImportTypeContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitImportPath(ctx: FoldingParser.ImportPathContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitImportNest(ctx: FoldingParser.ImportNestContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitPackagePiece(ctx: FoldingParser.PackagePieceContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitPackage_(ctx: FoldingParser.Package_Context): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitNamespace(ctx: FoldingParser.NamespaceContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitDoBlock(ctx: FoldingParser.DoBlockContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitCompo(ctx: FoldingParser.CompoContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitRemainLet_binding(ctx: FoldingParser.RemainLet_bindingContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitReturning(ctx: FoldingParser.ReturningContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitGlobalFieldAssign(ctx: FoldingParser.GlobalFieldAssignContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitObjectFieldAssign(ctx: FoldingParser.ObjectFieldAssignContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitJustInterface(ctx: FoldingParser.JustInterfaceContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitJustClass(ctx: FoldingParser.JustClassContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitJustAbstractClass(ctx: FoldingParser.JustAbstractClassContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitConstructor_(ctx: FoldingParser.Constructor_Context): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitConstructorSelf(ctx: FoldingParser.ConstructorSelfContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitDefInInterface(ctx: FoldingParser.DefInInterfaceContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitFieldInInterface(ctx: FoldingParser.FieldInInterfaceContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitInherit(ctx: FoldingParser.InheritContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitImpl(ctx: FoldingParser.ImplContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitImplBody(ctx: FoldingParser.ImplBodyContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeParam(ctx: FoldingParser.TypeParamContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeParamCompo(ctx: FoldingParser.TypeParamCompoContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitDefinition(ctx: FoldingParser.DefinitionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitDefaultValue(ctx: FoldingParser.DefaultValueContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitBoolean(ctx: FoldingParser.BooleanContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitCallMethod(ctx: FoldingParser.CallMethodContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitReflected(ctx: FoldingParser.ReflectedContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitCallFunction(ctx: FoldingParser.CallFunctionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeCheck(ctx: FoldingParser.TypeCheckContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitUseForeignClass(ctx: FoldingParser.UseForeignClassContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitCallOpFunc(ctx: FoldingParser.CallOpFuncContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTuple(ctx: FoldingParser.TupleContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitJustDefaultValue(ctx: FoldingParser.JustDefaultValueContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitAnonymousClassObject(ctx: FoldingParser.AnonymousClassObjectContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitGetFieldGlobal(ctx: FoldingParser.GetFieldGlobalContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitLetExpression(ctx: FoldingParser.LetExpressionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitDoExpression(ctx: FoldingParser.DoExpressionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitInvokeValueLikeMethod(ctx: FoldingParser.InvokeValueLikeMethodContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitIfExpression(ctx: FoldingParser.IfExpressionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitSimpleIf(ctx: FoldingParser.SimpleIfContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitInvokeValue(ctx: FoldingParser.InvokeValueContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitOutputOfInversing(ctx: FoldingParser.OutputOfInversingContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitCallAopFunc(ctx: FoldingParser.CallAopFuncContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitCallAopFuncBack(ctx: FoldingParser.CallAopFuncBackContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitThis(ctx: FoldingParser.ThisContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitGetField(ctx: FoldingParser.GetFieldContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitCallFunctionLikeMethod(ctx: FoldingParser.CallFunctionLikeMethodContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitReflectedMethod(ctx: FoldingParser.ReflectedMethodContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitJustLambda(ctx: FoldingParser.JustLambdaContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitParenedValue(ctx: FoldingParser.ParenedValueContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitNull(ctx: FoldingParser.NullContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitValueTypeCasting(ctx: FoldingParser.ValueTypeCastingContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitPatternMatchExpression(ctx: FoldingParser.PatternMatchExpressionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitReference(ctx: FoldingParser.ReferenceContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeCasting(ctx: FoldingParser.TypeCastingContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitIf_else(ctx: FoldingParser.If_elseContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitLet_binding(ctx: FoldingParser.Let_bindingContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitPatternMatch(ctx: FoldingParser.PatternMatchContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitPatternMatchCompo(ctx: FoldingParser.PatternMatchCompoContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTupleEx(ctx: FoldingParser.TupleExContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitParamEx(ctx: FoldingParser.ParamExContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitParameter(ctx: FoldingParser.ParameterContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitSingleArg(ctx: FoldingParser.SingleArgContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitMultiArg(ctx: FoldingParser.MultiArgContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitPrimaryArgValue(ctx: FoldingParser.PrimaryArgValueContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitSingleListArgValue(ctx: FoldingParser.SingleListArgValueContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitInvoking(ctx: FoldingParser.InvokingContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitCommonOpIdentifier(ctx: FoldingParser.CommonOpIdentifierContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitCommonIdentifier(ctx: FoldingParser.CommonIdentifierContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitOpIdWrap(ctx: FoldingParser.OpIdWrapContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitAopIdWrap(ctx: FoldingParser.AopIdWrapContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitCommonClassIdentifier(ctx: FoldingParser.CommonClassIdentifierContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitField(ctx: FoldingParser.FieldContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitFieldNotInit(ctx: FoldingParser.FieldNotInitContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitFieldSetted(ctx: FoldingParser.FieldSettedContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitForeignField(ctx: FoldingParser.ForeignFieldContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitDef(ctx: FoldingParser.DefContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitJustDef(ctx: FoldingParser.JustDefContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitForeignDef(ctx: FoldingParser.ForeignDefContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitSimpleInverseDef(ctx: FoldingParser.SimpleInverseDefContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitRawInverseDef(ctx: FoldingParser.RawInverseDefContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitOutputParam(ctx: FoldingParser.OutputParamContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitNecessaryParam(ctx: FoldingParser.NecessaryParamContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitInverseDefGateCompo(ctx: FoldingParser.InverseDefGateCompoContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitLambda(ctx: FoldingParser.LambdaContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeEx(ctx: FoldingParser.TypeExContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeExSingle(ctx: FoldingParser.TypeExSingleContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeArgEx(ctx: FoldingParser.TypeArgExContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitPrimitiveType(ctx: FoldingParser.PrimitiveTypeContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeExParamEx(ctx: FoldingParser.TypeExParamExContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeExFunc(ctx: FoldingParser.TypeExFuncContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeExCovariant(ctx: FoldingParser.TypeExCovariantContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeExContravariant(ctx: FoldingParser.TypeExContravariantContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeExWildcard(ctx: FoldingParser.TypeExWildcardContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitForeignBody(ctx: FoldingParser.ForeignBodyContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitForeignElement(ctx: FoldingParser.ForeignElementContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitForeignPlatform(ctx: FoldingParser.ForeignPlatformContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeAlias(ctx: FoldingParser.TypeAliasContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitForeignTypeExpectitive(ctx: FoldingParser.ForeignTypeExpectitiveContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitAnnotationDef(ctx: FoldingParser.AnnotationDefContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitAnnotation(ctx: FoldingParser.AnnotationContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitAnnotationBlock(ctx: FoldingParser.AnnotationBlockContext): T {
        return this.visitChildren(ctx)!!
    }
}