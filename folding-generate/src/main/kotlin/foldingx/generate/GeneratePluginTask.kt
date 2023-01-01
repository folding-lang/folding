package foldingx.generate

import org.gradle.api.DefaultTask

abstract class GeneratePluginTask: DefaultTask() {
    override fun getGroup(): String = "fd generate"
}