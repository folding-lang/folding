package foldingx.gradle.base

import org.gradle.api.Named

open class FoldingSourceSet(private val name: String): Named {
    var targetPlatforms: FoldingTargetPlatforms = All
    var sourceDir = "src/$name/folding"
    var outputDirs: MutableMap<FoldingPlatform,String> = mutableMapOf()
    override fun getName(): String = name
}