package foldingx.gradle.base

import org.gradle.api.Plugin
import org.gradle.api.Project

open class FoldingBasePlugin : Plugin<Project> {
    override fun apply(target: Project) = target.run {
        val foldingSourceSetContainer = container(FoldingSourceSet::class.java)
        val extension = FoldingExtension.create(this)
        extension.sourcesSets = foldingSourceSetContainer
        Unit
    }
}