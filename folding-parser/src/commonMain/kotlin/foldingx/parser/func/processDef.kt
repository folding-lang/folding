package foldingx.parser.func

import foldingx.parser.FoldingParser
import foldingx.parser.identifier.processId


fun processNativeDef(defContext: FoldingParser.DefContext) =
    defContext.findJustDef()
        ?.let(::processJustDef)
        ?.let { c -> c to defContext.findInverseDefining().map { processInverseDef(c,it) } }

fun processJustDef(justDefContext: FoldingParser.JustDefContext): CommonJustDef =
    CommonJustDef(
        annotationBlockContext = justDefContext.findAnnotationBlock(),
        id = justDefContext.findCommonIdentifier()!!.let(::processId),
        typeParamContext = justDefContext.findTypeParam(),
        parameterContext = justDefContext.findParameter(),
        typeExContext = justDefContext.findTypeEx(),
        valueContext = justDefContext.findValue()
    )

fun processInverseDef(parent: ICommonDef, inverseDefiningContext: FoldingParser.InverseDefiningContext): CommonInverseDef =
    CommonInverseDef(
        parent = parent,
        resultId = inverseDefiningContext.ID()?.text ?: "r",
        inverseDefCompoList = inverseDefiningContext.findInverseDefCompo()
    )

fun processForeignDef(foreignDefContext: FoldingParser.ForeignDefContext): CommonForeignDef =
    CommonForeignDef(
        annotationBlockContext = foreignDefContext.findAnnotationBlock(),
        id = foreignDefContext.findCommonIdentifier()!!.let(::processId),
        typeParamContext = foreignDefContext.findTypeParam(),
        parameterContext = foreignDefContext.findParameter(),
        typeExContext = foreignDefContext.findTypeEx(),
        foreignBodyContext = foreignDefContext.findForeignBody()
    )