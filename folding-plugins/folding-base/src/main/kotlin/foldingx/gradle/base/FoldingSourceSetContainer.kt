package foldingx.gradle.base

import org.gradle.api.Action
import org.gradle.api.NamedDomainObjectContainer

class FoldingSourceSetContainer(
    private val container: NamedDomainObjectContainer<FoldingSourceSet>,
    private val platformContainer: FoldingPlatformContainer
): NamedDomainObjectContainer<FoldingSourceSet> by container {

    override fun create(name: String): FoldingSourceSet = create(name) {}
    override fun create(name: String, configureAction: Action<in FoldingSourceSet>): FoldingSourceSet {
        return container.create(name, configureAction).also {
            val purePlatforms = when(val platforms = it.targetPlatforms) {
                All -> platformContainer
                is Targets -> platforms
            }
            purePlatforms.forEach { p ->
                p.sourceSets += it
                p.processor.makeTasksWithSourceSet(p,it)
            }
        }
    }
}