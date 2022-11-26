package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightTranspiler {
    fun transpile(fdFileContext: FoldingParser.FileContext)
    fun processFileCompo(fdFileCompoContext: FoldingParser.FileCompoContext)
    fun processDefinition(fdDefinitionContext: FoldingParser.DefinitionContext)
    fun processDef(fdDefContext: FoldingParser.DefContext)
    fun processClass(fdClass_Context: FoldingParser.Class_Context)
    fun processField(fdFieldContext: FoldingParser.FieldContext)
}