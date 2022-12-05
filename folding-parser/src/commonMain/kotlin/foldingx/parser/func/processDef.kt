package foldingx.parser.func

import foldingx.parser.FoldingParser
import foldingx.parser.identifier.processId


fun processNativeDef(defContext: FoldingParser.DefContext) =
    defContext.findJustDef()?.let { processJustDef(it)  to defContext.findInverseDefining().map { processInverseDef(it) } }

fun processJustDef(justDefContext: FoldingParser.JustDefContext): CommonJustDef =
    CommonJustDef(
        annotationBlockContext = justDefContext.findAnnotationBlock(),
        id = justDefContext.findCommonIdentifier()!!.let(::processId),
        typeParamContext = justDefContext.findTypeParam(),
        parameterContext = justDefContext.findParameter(),
        typeExContext = justDefContext.findTypeEx(),
        valueContext = justDefContext.findValue()
    )

fun processInverseDef(inverseDefiningContext: FoldingParser.InverseDefiningContext): CommonInverseDef =
    TODO("Not yet implemented")

fun processForeignDef(foreignDefContext: FoldingParser.ForeignDefContext): CommonForeignDef =
    CommonForeignDef(
        annotationBlockContext = foreignDefContext.findAnnotationBlock(),
        id = foreignDefContext.findCommonIdentifier()!!.let(::processId),
        typeParamContext = foreignDefContext.findTypeParam(),
        parameterContext = foreignDefContext.findParameter(),
        typeExContext = foreignDefContext.findTypeEx(),
        foreignBodyContext = foreignDefContext.findForeignBody()
    )