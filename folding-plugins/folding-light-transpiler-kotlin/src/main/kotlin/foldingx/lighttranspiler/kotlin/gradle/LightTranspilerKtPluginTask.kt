package foldingx.lighttranspiler.kotlin.gradle

import org.gradle.api.DefaultTask

abstract class LightTranspilerKtPluginTask : DefaultTask() {
    override fun getGroup(): String = "fd light-transpiler kotlin"
}