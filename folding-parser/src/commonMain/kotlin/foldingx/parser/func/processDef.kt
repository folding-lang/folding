package foldingx.parser.func

import foldingx.parser.FoldingParser
import foldingx.parser.identifier.processId

fun processJustDef(justDefContext: FoldingParser.JustDefContext): CommonJustDef =
    CommonJustDef(
        annotationBlockContext = justDefContext.findAnnotationBlock(),
        id = justDefContext.findCommonIdentifier()!!.let(::processId),
        typeParamContext = justDefContext.findTypeParam(),
        parameterContext = justDefContext.findParameter(),
        typeExContext = justDefContext.findTypeEx(),
        valueContext = justDefContext.findValue()
    )

fun processInverseDef(parent: ICommonDef, inverseDefiningContext: FoldingParser.InverseDefiningContext) =
    when (inverseDefiningContext) {
        is FoldingParser.SimpleInverseDefContext -> processInverseDefSimple(parent,inverseDefiningContext)
        is FoldingParser.RawInverseDefContext -> processInverseDefRaw(parent,inverseDefiningContext)
        else -> throw IllegalArgumentException("unexpected inverseDefiningContext type")
    }

fun processInverseDefSimple(parent: ICommonDef, inverseDefSimpleContext: FoldingParser.SimpleInverseDefContext): CommonInverseDefSimple =
    CommonInverseDefSimple(
        parent = parent,
        resultId = inverseDefSimpleContext.ID()?.text ?: "result",
        inverseDefCompoList = inverseDefSimpleContext.findInverseDefCompo()
    )

fun processInverseDefRaw(parent: ICommonDef, inverseDefRawContext: FoldingParser.RawInverseDefContext): CommonInverseDefRaw =
    CommonInverseDefRaw(
        parent = parent,
        resultId = inverseDefRawContext.ID()?.text ?: "result",
        inverseDefGateCompoList = inverseDefRawContext.findInverseDefGateCompo(),
        value = inverseDefRawContext.findValue()!!
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