package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightTranspiler : LightClassTranspiler {
    fun transpilePackage(sourcesRoot: String,fdFileContextList: List<FoldingParser.FileContext>): List<FileWrapper>
    fun transpileFile(fdFileContext: FoldingParser.FileContext): String
    fun processImportEx(fdImportExContext: FoldingParser.ImportExContext): String
    fun processFileCompo(fdFileCompoContext: FoldingParser.FileCompoContext): String
    fun processDefinition(fdDefinitionContext: FoldingParser.DefinitionContext): String
    fun processDef(fdDefContext: FoldingParser.DefContext): String
    fun processClass(fdClass_Context: FoldingParser.Class_Context): String
    fun processAnnotationDef(fdAnnotationDefContext: FoldingParser.AnnotationDefContext): String
    fun processTypeAlias(fdTypeAliasContext: FoldingParser.TypeAliasContext): String
}