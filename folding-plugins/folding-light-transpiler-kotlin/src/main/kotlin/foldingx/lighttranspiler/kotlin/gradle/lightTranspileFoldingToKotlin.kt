package foldingx.lighttranspiler.kotlin.gradle

import foldingx.gradle.base.folding
import foldingx.parser.FoldingLexer
import foldingx.parser.FoldingParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.TaskContainerScope
import org.gradle.kotlin.dsl.named
import java.io.File

open class LightTranspileFoldingToKotlinTask : LightTranspilerKtPluginTask() {

    @TaskAction
    fun task() {
        val sourceSets = project.folding.sourcesSets.filter { it.target?.equals("kotlin") ?: true  }
        sourceSets.forEach { set ->
            val inputPath = "src/${set.name}/folding"
            val outputPath = "src/${set.name}/kotlin"

            val inputDir = File(inputPath)
            if (!inputDir.exists()) return

            val outputDir = File(outputPath)

            val files = inputDir.walk()
            val fileContextsByPackage = files
                .filterNot { it.isDirectory }
                .map {
                    FoldingParser(CommonTokenStream(FoldingLexer(CharStreams.fromFileName(it.readText())))).file()
                }
                .groupBy { it.findNamespace()?.findPackage_()?.text }

            val transpiledList = fileContextsByPackage.values.flatMap {
                LightTranspilerKtInstance.transpilePackage(outputPath,it)
            }
            val transpiledDirs = transpiledList.map { it.dirText }.distinct().map {
                File(it).apply { mkdirs() }
            }
            val transpileFiles = transpiledList.map {
                val file = File(it.dirText + File.separator + it.name)
                file.createNewFile()
                file.writeText(it.content)
                file
            }
        }
    }

}

val TaskContainerScope.lightTranspileFoldingToKotlin: TaskProvider<LightTranspileFoldingToKotlinTask>
    get() = named<LightTranspileFoldingToKotlinTask>("lightTranspileFoldingToKotlin")