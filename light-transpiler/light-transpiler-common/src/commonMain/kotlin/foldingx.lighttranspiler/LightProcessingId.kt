package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightProcessingId {
    fun processCommonIdentifier(fdCommonIdentifierContext: FoldingParser.CommonIdentifierContext)
    fun processOpID(opId: String)
    fun processAopID(aopId: String)
}