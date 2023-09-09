package foldingx.gradle.base

import org.gradle.api.Named

class FoldingPlatform(private val name: String): Named {
    lateinit var processor: FoldingProcessor
    val sourceSets: MutableSet<FoldingSourceSet> = mutableSetOf()
    val formats: MutableMap<String,String> = mutableMapOf()
    override fun getName(): String = name
}