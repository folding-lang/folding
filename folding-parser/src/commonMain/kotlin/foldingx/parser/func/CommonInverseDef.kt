package foldingx.parser.func

import foldingx.parser.FoldingParser

sealed interface CommonInverseDef : CommonDefiningGroup {
    val parent: ICommonDef
    val resultId: String
}

class CommonInverseDefSimple(
    override val parent: ICommonDef,
    override val resultId: String,
    val inverseDefCompoList: List<FoldingParser.InverseDefCompoContext>
) : CommonInverseDef

class CommonInverseDefRaw(
    override val parent: ICommonDef,
    override val resultId: String,
    val inverseDefGateCompoList: List<FoldingParser.InverseDefGateCompoContext>,
    val value: FoldingParser.ValueContext
) : CommonInverseDef