package foldingx.lighttranspiler.kotlin.effect

import foldingx.lighttranspiler.effect.Effect
import foldingx.parser.classes.CommonClass

class EffectKt : Effect {
    override val packageFormatMap: MutableMap<String, String> = mutableMapOf()
    var currentPackage: String? = null
    var generatedClassRegistry: MutableList<CommonClass>? = mutableListOf()
}