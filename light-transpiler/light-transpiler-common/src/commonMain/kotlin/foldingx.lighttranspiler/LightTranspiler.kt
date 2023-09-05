package foldingx.lighttranspiler

import foldingx.lighttranspiler.effect.Effect
import foldingx.parser.FoldingParser

interface LightTranspiler<TEffect: Effect> : LightClassTranspiler<TEffect> {
    fun transpilePackage(sourcesRoot: String,fdFileContextList: List<FoldingParser.FileContext>, effect: TEffect): List<FileWrapper>
    fun transpileFile(fdFileContext: FoldingParser.FileContext, effect: TEffect): String
    fun processImportEx(fdImportExContext: FoldingParser.ImportExContext, effect: TEffect): String
    fun processFileCompo(fdFileCompoContext: FoldingParser.FileCompoContext, effect: TEffect): String
    fun processDefinition(fdDefinitionContext: FoldingParser.DefinitionContext, effect: TEffect): String
    fun processDef(fdDefContext: FoldingParser.DefContext, effect: TEffect): String
    fun processClass(fdClass_Context: FoldingParser.Class_Context, effect: TEffect): String
    fun processAnnotationDef(fdAnnotationDefContext: FoldingParser.AnnotationDefContext, effect: TEffect): String
    fun processTypeAlias(fdTypeAliasContext: FoldingParser.TypeAliasContext, effect: TEffect): String
}