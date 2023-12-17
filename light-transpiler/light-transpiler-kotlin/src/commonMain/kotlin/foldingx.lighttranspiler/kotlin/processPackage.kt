package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.effect.Effect

fun processPackage(packageContext: String, effect: Effect?): String {
    var result = packageContext
    if (effect == null) return result
    effect.packageFormatMap.forEach { (key,value) ->
        result = result.replace("{$key}",value)
    }
    return result
}
