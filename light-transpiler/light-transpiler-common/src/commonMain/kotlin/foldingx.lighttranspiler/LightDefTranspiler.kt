package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightDefTranspiler {
    fun processDef(fdDefContext: FoldingParser.DefContext)

    fun processJustDef(fdJustDefContext: FoldingParser.JustDefContext)
    fun processInverseDefining(fdInverseDefiningContext: FoldingParser.InverseDefiningContext)
    fun processForeignDef(fdForeignDefContext: FoldingParser.ForeignDefContext)

    fun processParameter(fdParameterContext: FoldingParser.ParameterContext)
    fun processParameterFromValue(fdParameterFromValueContext: FoldingParser.ParameterFromValueContext)
}