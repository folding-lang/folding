package foldingx.parser.inversing

import foldingx.parser.FoldingParser

class CallWrapper(val id: String, val typeArgs: List<FoldingParser.TypeExContext>, val args: List<FoldingParser.ValueContext>, val inverseIndex: Int) {
}