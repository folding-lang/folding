package foldingx.lighttranspiler.kotlin.gradle

import foldingx.gradle.base.*
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.accessors.primitiveKotlinTypeNames
import org.gradle.kotlin.dsl.creating
import org.gradle.kotlin.dsl.invoke
import org.gradle.kotlin.dsl.provideDelegate

open class LightTranspilerKtPlugin : Plugin<Project> {
    val mySimpleTasks: List<Class<out LightTranspilerKtPluginTask>> = listOf(
    )

    lateinit var foldingLightKotlinProcessor: FoldingProcessor

    lateinit var defaultPlatform: FoldingPlatform

    override fun apply(target: Project) = target.run {

        apply { it.plugin(FoldingBasePlugin::class.java) }

        foldingLightKotlinProcessor = FoldingToKotlinLightProcessor(this)

        folding {
            platforms {
                defaultPlatform = create("kotlin") {
                    it.processor = foldingLightKotlinProcessor
                }
            }
        }

        registerTasks(this)

    }

    private fun registerTasks(target: Project) {
        mySimpleTasks.forEach {
            val name = it.simpleName.removeSuffix("Task").replaceFirstChar { it.lowercase() }
            target.tasks.register(name,it)
        }
    }

    private class FoldingToKotlinLightProcessor(val target: Project): FoldingProcessor {
        override fun makeTasksWithPlatform(platform: FoldingPlatform) {
            val name = "lightTranspileAllFoldingTo${platform.name}"
            target.tasks.create(
                name,
                LightTranspileAllFoldingToKotlinByPlatformTask::class.java,
                platform
            )
        }

        override fun makeTasksWithSourceSet(platform: FoldingPlatform, sourceSet: FoldingSourceSet) {
            val name = "lightTranspile${sourceSet.name}FoldingTo${platform.name}"
            target.tasks.create(
                name,
                LightTranspileFoldingToKotlinTask::class.java,
                platform,
                sourceSet
            )
        }
    }
}