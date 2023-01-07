package foldingx.parser.func

import foldingx.parser.FoldingParser

class CommonInverseDef(
    val parent: CommonJustDef,
    val resultId: String,
    val inverseDefCompoList: List<FoldingParser.InverseDefCompoContext>
)