package foldingx.lighttranspiler

import foldingx.lighttranspiler.effect.Effect
import FoldingParser
import foldingx.parser.classes.CommonClass

interface LightClassTranspiler<TEffect: Effect> : LightDefTranspiler<TEffect> {
    fun transpileClass(fdClass_Context: FoldingParser.Class_Context, effect: TEffect): String

    fun processCommonClass(fdCommonClass: CommonClass, effect: TEffect): String
    fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext, effect: TEffect): String
    fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext, effect: TEffect): String
    fun processJustAbstractClass(fdJustAbstractClassContext: FoldingParser.JustAbstractClassContext, effect: TEffect): String

    fun processDefInInterface(fdDefInInterfaceContext: FoldingParser.DefInInterfaceContext, effect: TEffect): String

    fun processField(fdFieldContext: FoldingParser.FieldContext, effect: TEffect): String
}