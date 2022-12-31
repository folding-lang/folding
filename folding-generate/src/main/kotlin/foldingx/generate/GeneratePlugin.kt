package foldingx.generate

import org.gradle.api.Plugin
import org.gradle.api.Project

open class GeneratePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.tasks.register("generateFdTuples",GenerateFdTuplesTask::class.java)
    }
}