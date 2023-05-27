package foldingx.lighttranspiler.kotlin

import foldingx.parser.FoldingParser
import foldingx.parser.identifier.processCommonClassId

fun processTypeParam(fdTypeParamContext: FoldingParser.TypeParamContext): Pair<String,String?> {
    val tMap = fdTypeParamContext.findTypeParamCompo().associate { processTypeParamCompo(it) }
    val head = tMap.keys.joinToString(",","<",">")
    val tail = tMap.values.flatten().takeIf { it.isNotEmpty() }?.joinToString(", ","where ")
    return head to tail
}
fun processTypeParamCompo(fdTypeParamCompoContext: FoldingParser.TypeParamCompoContext) =
    fdTypeParamCompoContext.findCommonClassIdentifier().let {
        val t = processCommonClassId(it!!)
        t to fdTypeParamCompoContext.findTypeEx().map { "$t : ${processTypeEx(it)}" }
    }