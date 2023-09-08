package foldingx.gradle.base

interface FoldingProcessor {
    fun makeTasksWithSourceSet(platform: FoldingPlatform, sourceSet: FoldingSourceSet)
    fun makeTasksWithPlatform(platform: FoldingPlatform)
}
