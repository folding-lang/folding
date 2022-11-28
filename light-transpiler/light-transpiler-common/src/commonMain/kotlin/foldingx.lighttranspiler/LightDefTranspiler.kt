package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightDefTranspiler {
    fun processDef(fdDefContext: FoldingParser.DefContext): String

    fun processJustDef(fdJustDefContext: FoldingParser.JustDefContext): String
    fun processInverseDefining(fdInverseDefiningContext: FoldingParser.InverseDefiningContext): String
    fun processForeignDef(fdForeignDefContext: FoldingParser.ForeignDefContext): String

    fun processParameter(fdParameterContext: FoldingParser.ParameterContext): String
    fun processParameterFromValue(fdParameterFromValueContext: FoldingParser.ParameterFromValueContext): String
}