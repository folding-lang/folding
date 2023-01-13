package foldingx.gradle.base

import org.gradle.api.Named

open class FoldingSourceSet(private val name: String): Named {
    var target: String? = null
    override fun getName(): String = name
}