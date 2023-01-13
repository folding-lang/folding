package foldingx.lighttranspiler.kotlin.gradle

import foldingx.gradle.base.FoldingBasePlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply

open class LightTranspilerKtPlugin : Plugin<Project> {
    val myTasks: List<Class<out LightTranspilerKtPluginTask>> = listOf(
        LightTranspileFoldingToKotlinTask::class.java
    )

    override fun apply(target: Project) = target.run {

        apply { it.plugin(FoldingBasePlugin::class.java) }

        myTasks.forEach {
            val name = it.simpleName.removeSuffix("Task").replaceFirstChar { it.lowercase() }
            tasks.register(name,it)
        }

    }
}