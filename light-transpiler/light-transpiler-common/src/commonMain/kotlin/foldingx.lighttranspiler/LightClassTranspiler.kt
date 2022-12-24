package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightClassTranspiler : LightDefTranspiler {
    fun transpileClass(fdClass_Context: FoldingParser.Class_Context): String

    fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext)
    fun processJustMultiClass(fdJustMultiClassContext: FoldingParser.JustMultiClassContext)
    fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext)

    fun processDefInInterface(fdDefInInterfaceContext: FoldingParser.DefInInterfaceContext): String
    fun processDefInImpl(fdDefInImplContext: FoldingParser.DefInImplContext): String
}