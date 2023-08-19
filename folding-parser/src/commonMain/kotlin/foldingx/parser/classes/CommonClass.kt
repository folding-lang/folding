package foldingx.parser.classes

import foldingx.parser.FoldingParser

class CommonClass (
    val category: ClassCategory,
    val identifier: FoldingParser.CommonClassIdentifierContext,
    val annotationBlockContext: FoldingParser.AnnotationBlockContext? = null,
    val typeParam: FoldingParser.TypeParamContext? = null,
    val constructorSelf: FoldingParser.ConstructorSelfContext? = null,
    val fieldList: List<FoldingParser.FieldContext> = listOf(),
    val defList: List<FoldingParser.DefContext> = listOf(),
    val inheritContext: FoldingParser.InheritContext? = null,
    val implList: List<FoldingParser.ImplContext> = listOf(),
    val defInInterfaceList: List<FoldingParser.DefInInterfaceContext> = listOf(),
    val fieldInInterfaceList: List<FoldingParser.FieldInInterfaceContext> = listOf()
)