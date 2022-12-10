package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightClassTranspiler {
    fun transpileClass(fdClass_Context: FoldingParser.Class_Context): String

    fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext): String
    fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext): String

    fun processDefInInterface(fdDefInInterfaceContext: FoldingParser.DefInInterfaceContext): String
    fun processDefInImpl(fdDefInImplContext: FoldingParser.DefInImplContext): String
}