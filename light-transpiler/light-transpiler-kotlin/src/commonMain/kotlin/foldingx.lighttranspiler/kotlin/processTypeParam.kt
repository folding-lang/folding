package foldingx.lighttranspiler.kotlin

import foldingx.parser.FoldingParser

fun processTypeParam(fdTypeParamContext: FoldingParser.TypeParamContext): Pair<String,String?> {
    val tMap = fdTypeParamContext.findTypeParamCompo().associate { processTypeParamCompo(it) }
    val head = tMap.keys.joinToString(",","<",">")
    val tail = tMap.values.flatten().takeIf { it.isNotEmpty() }?.joinToString(",","where ")
    return head to tail
}
fun processTypeParamCompo(fdTypeParamCompoContext: FoldingParser.TypeParamCompoContext) =
    fdTypeParamCompoContext.ID()!!.text.let { t ->
        t to fdTypeParamCompoContext.findTypeEx().map { "$t : ${processTypeEx(it)}" }
    }