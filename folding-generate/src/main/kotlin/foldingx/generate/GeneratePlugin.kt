package foldingx.generate

import org.gradle.api.Plugin
import org.gradle.api.Project

open class GeneratePlugin : Plugin<Project> {
    val myTasks: List<Class<out GeneratePluginTask>> = listOf(
        GenerateFdTuplesTask::class.java
    )
    override fun apply(target: Project) = target.run {
        myTasks.forEach {
            val name = it.simpleName.removeSuffix("Task").replaceFirstChar { it.lowercase() }
            tasks.register(name,it)
        }
    }
}