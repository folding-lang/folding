package foldingx.gradle.base

import org.gradle.api.Named

open class FoldingSourceSet(private val name: String): Named {
    var target: String? = null
    var sourceDir = "src/$name"
    var outputDirs = mutableListOf("src/${name}_transpiled_fd")
    override fun getName(): String = name
}