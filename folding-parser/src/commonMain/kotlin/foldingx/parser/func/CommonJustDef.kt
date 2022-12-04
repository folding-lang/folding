package foldingx.parser.func

import foldingx.parser.FoldingParser

class CommonJustDef(
    val annotationBlockContext: FoldingParser.AnnotationBlockContext?,
    val id: String,
    val typeParamContext: FoldingParser.TypeParamContext?,
    val parameterContext: FoldingParser.ParameterContext?,
    /** the return type of its func */ val typeExContext: FoldingParser.TypeExContext,
    val valueContext: FoldingParser.ValueContext
) : ICommonDef