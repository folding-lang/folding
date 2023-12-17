package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.effect.Effect
import FoldingParser
import foldingx.parser.identifier.processCommonClassId

fun processTypeParam(fdTypeParamContext: FoldingParser.TypeParamContext, effect: Effect): Pair<String,String?> {
    val tMap = fdTypeParamContext.findTypeParamCompo().associate { processTypeParamCompo(it,effect) }
    val head = tMap.keys.joinToString(",","<",">")
    val tail = tMap.values.flatten().takeIf { it.isNotEmpty() }?.joinToString(", ","where ")
    return head to tail
}
fun processTypeParamCompo(fdTypeParamCompoContext: FoldingParser.TypeParamCompoContext, effect: Effect) =
    fdTypeParamCompoContext.findCommonClassIdentifier().let {
        val t = processCommonClassId(it!!)
        t to fdTypeParamCompoContext.findTypeEx().map { "$t : ${processTypeEx(it,effect)}" }
    }