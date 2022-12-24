package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightClassTranspiler : LightDefTranspiler {
    fun transpileClass(fdClass_Context: FoldingParser.Class_Context): String

    fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext): String
    fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext): String
    fun processJustAbstractClass(fdJustAbstractClassContext: FoldingParser.JustAbstractClassContext): String
    fun processJustMultiClass(fdJustMultiClassContext: FoldingParser.JustMultiClassContext): String

    fun processDefInInterface(fdDefInInterfaceContext: FoldingParser.DefInInterfaceContext): String
}