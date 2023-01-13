package foldingx.gradle.base

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

val Project.folding: FoldingExtension
    get() = FoldingExtension.get(this)

fun Project.folding(action: FoldingExtension.() -> Unit) =
    configure(action)

fun FoldingExtension.sourceSets(action: NamedDomainObjectContainer<FoldingSourceSet>.() -> Unit) =
    sourcesSets.action()
