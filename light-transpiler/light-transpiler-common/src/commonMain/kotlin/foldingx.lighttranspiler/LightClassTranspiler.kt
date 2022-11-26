package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightClassTranspiler {
    fun processClass(fdClass_Context: FoldingParser.Class_Context)

    fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext)
    fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext)

    fun processDefInInterface(fdDefInInterfaceContext: FoldingParser.DefInInterfaceContext)
    fun processDefInImpl(fdDefInImplContext: FoldingParser.DefInImplContext)
}