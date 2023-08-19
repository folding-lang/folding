package foldingx.lighttranspiler

import foldingx.parser.FoldingParser
import foldingx.parser.classes.CommonClass

interface LightClassTranspiler : LightDefTranspiler {
    fun transpileClass(fdClass_Context: FoldingParser.Class_Context): String

    fun processCommonClass(fdCommonClass: CommonClass): String
    fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext): String
    fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext): String
    fun processJustAbstractClass(fdJustAbstractClassContext: FoldingParser.JustAbstractClassContext): String

    fun processDefInInterface(fdDefInInterfaceContext: FoldingParser.DefInInterfaceContext): String

    fun processField(fdFieldContext: FoldingParser.FieldContext): String
}