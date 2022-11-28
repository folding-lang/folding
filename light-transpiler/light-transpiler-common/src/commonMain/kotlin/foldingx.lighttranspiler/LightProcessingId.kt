package foldingx.lighttranspiler

import foldingx.parser.FoldingParser

interface LightProcessingId {
    fun processCommonIdentifier(fdCommonIdentifierContext: FoldingParser.CommonIdentifierContext): String
    fun processOpID(opId: String): String
    fun processAopID(aopId: String): String
}