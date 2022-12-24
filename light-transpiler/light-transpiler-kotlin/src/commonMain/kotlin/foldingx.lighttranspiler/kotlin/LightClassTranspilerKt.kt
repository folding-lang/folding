package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightClassTranspiler
import foldingx.parser.FoldingParser

interface LightClassTranspilerKt : LightClassTranspiler, LightDefTranspilerKt {
    override fun transpileClass(fdClass_Context: FoldingParser.Class_Context): String = when(fdClass_Context) {
        is FoldingParser.JustClassContext -> processJustClass(fdClass_Context)
        is FoldingParser.JustMultiClassContext -> processJustMultiClass(fdClass_Context)
        is FoldingParser.JustInterfaceContext -> processJustInterface(fdClass_Context)
        else -> throw RuntimeException("Invalid class '${fdClass_Context.text}'")
    }

    override fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext): String
    override fun processJustMultiClass(fdJustMultiClassContext: FoldingParser.JustMultiClassContext): String
    override fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext): String

    override fun processDefInInterface(fdDefInInterfaceContext: FoldingParser.DefInInterfaceContext): String
    override fun processDefInImpl(fdDefInImplContext: FoldingParser.DefInImplContext): String
}