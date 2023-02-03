package foldingx.lighttranspiler.kotlin

open class DefaultLightTranspilerKt: LightTranspilerKt {
    override var currentPackage: String? = null

    companion object: DefaultLightTranspilerKt()
}