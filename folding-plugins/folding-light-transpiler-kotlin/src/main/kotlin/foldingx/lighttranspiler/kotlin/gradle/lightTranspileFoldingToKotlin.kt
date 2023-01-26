package foldingx.lighttranspiler.kotlin.gradle

import foldingx.gradle.base.folding
import foldingx.lighttranspiler.kotlin.DefaultLightTranspilerKt
import foldingx.lighttranspiler.kotlin.LightClassTranspilerKt
import foldingx.lighttranspiler.kotlin.LightTranspilerKt
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
        val transpiler = DefaultLightTranspilerKt
        val sourceSets = project.folding.sourcesSets.filter { it.target?.equals("kotlin") ?: true  }
        sourceSets.forEach { set ->
            val inputPath = "src/${set.name}/folding"
            val outputPath = "src/${set.name}/kotlin"

            val inputDir = File(inputPath)
            if (!inputDir.exists()) return

            val files = inputDir.walk()
            val fileContextsByPackage = files
                .filterNot { it.isDirectory }
                .map {
                    FoldingParser(CommonTokenStream(FoldingLexer(CharStreams.fromString(it.readText())))).file()
                }
                .groupBy { it.findNamespace()?.findPackage_()?.text }

            val transpiledList = fileContextsByPackage.values.flatMap {
                transpiler.transpilePackage(outputPath,it)
            }
            val transpiledDirsToTranspiled = transpiledList.map {
                File(it.dirText).apply { mkdirs() } to it
            }
            File(outputPath).mkdir()
            println("Pass!_2")
            val transpileFiles = transpiledDirsToTranspiled.map { (dir,it) ->
                val file = File(dir,it.name)
                dir.mkdir()
                println(dir.path)
                println(file.path)
                file.createNewFile()
                file.writeText(it.content)
                file
            }
        }
    }

}

val TaskContainerScope.lightTranspileFoldingToKotlin: TaskProvider<LightTranspileFoldingToKotlinTask>
    get() = named<LightTranspileFoldingToKotlinTask>("lightTranspileFoldingToKotlin")