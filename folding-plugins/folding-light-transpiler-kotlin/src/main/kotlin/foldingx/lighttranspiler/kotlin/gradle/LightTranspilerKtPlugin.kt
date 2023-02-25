package foldingx.lighttranspiler.kotlin.gradle

import foldingx.gradle.base.FoldingBasePlugin
import foldingx.gradle.base.folding
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.invoke

open class LightTranspilerKtPlugin : Plugin<Project> {
    val mySimpleTasks: List<Class<out LightTranspilerKtPluginTask>> = listOf(
        LightTranspileFoldingToKotlinToAllTask::class.java
    )

    lateinit var generatedOutputSpecs: List<OutputSpec>

    override fun apply(target: Project) = target.run {

        apply { it.plugin(FoldingBasePlugin::class.java) }

        registerTasks(this)

    }

    private fun registerTasks(target: Project) {
        mySimpleTasks.forEach {
            val name = it.simpleName.removeSuffix("Task").replaceFirstChar { it.lowercase() }
            target.tasks.register(name,it)
        }
        target.folding.sourcesSets.actions += {
            generatedOutputSpecs = generateOutputSpecs(target.folding.sourcesSets.toList() + it)
            registerGeneratedTranspilingTasks(target)
        }
        target.afterEvaluate {
            target.tasks {
                lightTranspileFoldingToKotlinToAll {
                    project.tasks.filterIsInstance<LightTranspileFoldingToKotlinTask>().forEach {
                        dependsOn(it.path)
                    }
                }
            }
        }
    }

    private fun registerGeneratedTranspilingTasks(target: Project) {
        generatedOutputSpecs.forEach {
            val name =
                "lightTranspileFoldingToKotlinToThe${it.outputPath
                    .replace("/","_")
                    .replace("\\","_")
                    .replace(":","_")}"
            val task = target.tasks
                .filterIsInstance<LightTranspileFoldingToKotlinTask>()
                .find { it.name == name }
            if (task != null) {
                task.sourcesSets().clear()
                task.sourcesSets().addAll(it.sourceSets)
            }
            else {
                target.tasks.create(
                    name,
                    LightTranspileFoldingToKotlinTask::class.java,
                    it.outputPath,
                    it.sourceSets.toMutableList()
                )
            }
        }
    }
}