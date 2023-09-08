package foldingx.gradle.base

import org.gradle.api.Plugin
import org.gradle.api.Project

open class FoldingBasePlugin : Plugin<Project> {
    override fun apply(target: Project) = target.run {
        val foldingSourceSetContainer = container(FoldingSourceSet::class.java)
        val foldingPlatformContainer = container(FoldingPlatform::class.java)
        val extension = FoldingExtension.create(this)
        extension.platforms = FoldingPlatformContainer(foldingPlatformContainer)
        extension.sourceSets = FoldingSourceSetContainer(foldingSourceSetContainer,extension.platforms)
        Unit
    }
}