package foldingx.gradle.base

import org.gradle.api.Action
import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project

class FoldingPlatformContainer(
    private val container: NamedDomainObjectContainer<FoldingPlatform>
): NamedDomainObjectContainer<FoldingPlatform> by container {
    override fun create(name: String): FoldingPlatform = create(name) {}
    override fun create(name: String, configureAction: Action<in FoldingPlatform>): FoldingPlatform {
        return container.create(name, configureAction).also {
            it.processor.makeTasksWithPlatform(it)
        }
    }
}
