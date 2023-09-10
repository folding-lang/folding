package foldingx.lighttranspiler.raw

import foldingx.lighttranspiler.effect.Effect

data class ProcessedRawFile(val namespace: String, val content: String)

fun processFoldingRawFile(content: String, effect: Effect): ProcessedRawFile {
    val head = content.split("\n").first()
    var tail = content.split("\n").drop(1).joinToString("\n")
    effect.packageFormatMap.forEach { (key,value) ->
        tail = tail.replace("{$key}",value)
    }
    return ProcessedRawFile(head,tail)
}