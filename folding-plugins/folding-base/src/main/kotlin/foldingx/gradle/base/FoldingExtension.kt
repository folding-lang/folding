package foldingx.gradle.base

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project

open class FoldingExtension(project: Project) {
    lateinit var sourcesSets: FoldingSourceSetContainer

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