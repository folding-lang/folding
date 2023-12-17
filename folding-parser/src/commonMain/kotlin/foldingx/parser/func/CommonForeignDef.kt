package foldingx.parser.func

import FoldingParser

class CommonForeignDef(
    val annotationBlockContext: FoldingParser.AnnotationBlockContext?,
    override val id: String,
    override val typeParamContext: FoldingParser.TypeParamContext?,
    override val parameterContext: FoldingParser.ParameterContext?,
    /** the return type of its func */
    override val typeExContext: FoldingParser.TypeExContext?,
    val foreignBodyContext: FoldingParser.ForeignBodyContext?
) : ICommonDef