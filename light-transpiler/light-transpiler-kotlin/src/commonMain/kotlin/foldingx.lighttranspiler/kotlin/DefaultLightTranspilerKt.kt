package foldingx.lighttranspiler.kotlin

import foldingx.parser.classes.CommonClass

open class DefaultLightTranspilerKt: LightTranspilerKt {
    override var currentPackage: String? = null
    override var generatedClassRegistry: MutableList<CommonClass>? = mutableListOf()

    companion object: DefaultLightTranspilerKt()
}