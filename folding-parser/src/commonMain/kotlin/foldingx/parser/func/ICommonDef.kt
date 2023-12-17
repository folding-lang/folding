package foldingx.parser.func

import FoldingParser

interface CommonDefiningGroup

interface ICommonDef : CommonDefiningGroup {
    val id: String
    val typeParamContext: FoldingParser.TypeParamContext?
    val parameterContext: FoldingParser.ParameterContext?
    val typeExContext: FoldingParser.TypeExContext?
}