package foldingx.gradle.base

sealed interface FoldingTargetPlatforms

object All: FoldingTargetPlatforms
class Targets(platforms: MutableSet<FoldingPlatform>): FoldingTargetPlatforms, MutableSet<FoldingPlatform> by platforms