package foldingx.gradle.base

import org.gradle.api.Project

open class FoldingExtension(project: Project) {
    lateinit var sourceSets: FoldingSourceSetContainer
    lateinit var platforms: FoldingPlatformContainer

    companion object {
        val name = "folding"

        @JvmStatic
        fun get(project: Project): FoldingExtension {
            return project.extensions.getByType(FoldingExtension::class.java)
        }

        @JvmStatic
        fun create(project: Project): FoldingExtension {
            return project.extensions.create(name, FoldingExtension::class.java, project)
        }
    }
}