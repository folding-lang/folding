package foldingx.lighttranspiler

import foldingx.lighttranspiler.effect.Effect
import foldingx.parser.FoldingParser
import foldingx.parser.func.CommonForeignDef
import foldingx.parser.func.CommonInverseDef
import foldingx.parser.func.CommonJustDef

interface LightDefTranspiler<TEffect: Effect> : LightValueTranspiler<TEffect> {
    fun transpileDef(fdDefContext: FoldingParser.DefContext, effect: TEffect): String

    fun processJustDef(fdCommonJustDef: CommonJustDef, effect: TEffect): String
    fun processInverseDefining(fdCommonInverseDef: CommonInverseDef, effect: TEffect): String
    fun processForeignDef(fdCommonForeignDef: CommonForeignDef, effect: TEffect): String
}