package foldingx.lighttranspiler

import foldingx.parser.FoldingParser
import foldingx.parser.func.CommonForeignDef
import foldingx.parser.func.CommonInverseDef
import foldingx.parser.func.CommonJustDef

interface LightDefTranspiler : LightValueTranspiler {
    fun transpileDef(fdDefContext: FoldingParser.DefContext): String

    fun processJustDef(fdCommonJustDef: CommonJustDef): String
    fun processInverseDefining(fdCommonInverseDef: CommonInverseDef): String
    fun processForeignDef(fdCommonForeignDef: CommonForeignDef): String

    fun processParameter(fdParameterContext: FoldingParser.ParameterContext): String
    fun processParameterFromValue(fdParameterFromValueContext: FoldingParser.ParameterFromValueContext): String
}