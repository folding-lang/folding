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
        target.afterEvaluate {
            generatedOutputSpecs = generateOutputSpecs(target)

            registerGeneratedTranspilingTasks(target)

            mySimpleTasks.forEach {
                val name = it.simpleName.removeSuffix("Task").replaceFirstChar { it.lowercase() }
                target.tasks.register(name,it)
            }

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
            target.tasks.create(name,LightTranspileFoldingToKotlinTask::class.java,it.outputPath,it.sourceSets)
        }
    }
}