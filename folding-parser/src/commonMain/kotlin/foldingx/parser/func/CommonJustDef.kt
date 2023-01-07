package foldingx.parser.func

import foldingx.parser.FoldingParser

class CommonJustDef(
    val annotationBlockContext: FoldingParser.AnnotationBlockContext?,
    override val id: String,
    override val typeParamContext: FoldingParser.TypeParamContext?,
    override val parameterContext: FoldingParser.ParameterContext?,
    /** the return type of its func */
    override val typeExContext: FoldingParser.TypeExContext?,
    val valueContext: FoldingParser.ValueContext?
) : ICommonDef