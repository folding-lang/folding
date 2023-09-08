package foldingx.gradle.base

import org.gradle.api.Named

class FoldingPlatform(private val name: String): Named {
    lateinit var processor: FoldingProcessor
    val sourceSets: MutableSet<FoldingSourceSet> = mutableSetOf()
    override fun getName(): String = name
}