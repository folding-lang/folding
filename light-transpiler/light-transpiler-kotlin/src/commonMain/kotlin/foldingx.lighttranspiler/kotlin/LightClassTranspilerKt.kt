package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightClassTranspiler
import foldingx.parser.FoldingParser

interface LightClassTranspilerKt : LightClassTranspiler, LightDefTranspilerKt {
    override fun transpileClass(fdClass_Context: FoldingParser.Class_Context): String

    override fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext): String
    override fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext): String

    override fun processDefInInterface(fdDefInInterfaceContext: FoldingParser.DefInInterfaceContext): String
    override fun processDefInImpl(fdDefInImplContext: FoldingParser.DefInImplContext): String
}