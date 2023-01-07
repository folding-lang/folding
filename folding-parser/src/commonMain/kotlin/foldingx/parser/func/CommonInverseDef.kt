package foldingx.parser.func

import foldingx.parser.FoldingParser

class CommonInverseDef(
    val parent: ICommonDef,
    val resultId: String,
    val inverseDefCompoList: List<FoldingParser.InverseDefCompoContext>
) : CommonDefiningGroup