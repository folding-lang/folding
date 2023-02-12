package foldingx.gradle.base

import org.gradle.api.Action
import org.gradle.api.NamedDomainObjectContainer

class FoldingSourceSetContainer(
    private val container: NamedDomainObjectContainer<FoldingSourceSet>
): NamedDomainObjectContainer<FoldingSourceSet> by container {
    val actions = mutableListOf<(FoldingSourceSet) -> Unit>()

    override fun create(name: String): FoldingSourceSet = create(name) {}
    override fun create(name: String, configureAction: Action<in FoldingSourceSet>): FoldingSourceSet {
        FoldingSourceSet(name).also {
            configureAction.execute(it)
            actions.forEach { act -> act(it) }
        }
        return container.create(name, configureAction)
    }
}