package foldingx.lighttranspiler.kotlin.gradle

import foldingx.lighttranspiler.kotlin.LightClassTranspilerKt
import foldingx.lighttranspiler.kotlin.LightTranspilerKt

object LightTranspilerKtInstance : LightTranspilerKt {
    override fun getClassTranspilerKt(): LightClassTranspilerKt = this
}