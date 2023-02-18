package foldingx.lighttranspiler.kotlin.gradle

import foldingx.gradle.base.FoldingSourceSet
import foldingx.lighttranspiler.kotlin.DefaultLightTranspilerKt
import foldingx.parser.FoldingLexer
import foldingx.parser.FoldingParser
import foldingx.parser.util.SimpleErrorListener
import org.antlr.v4.kotlinruntime.ANTLRErrorListener
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.TaskContainerScope
import org.gradle.kotlin.dsl.named
import java.io.File
import javax.inject.Inject

internal fun generateOutputSpecs(sourcesSets: List<FoldingSourceSet>): List<OutputSpec> {
    val sourcesSetsFiltered = sourcesSets.filter { it.target?.equals("kotlin") ?: true  }
    val outputDirs = sourcesSetsFiltered.flatMap { it.outputDirs }.distinct()
    return outputDirs.map { outputDir ->
        OutputSpec(outputDir,sourcesSetsFiltered.filter { it.outputDirs.contains(outputDir) })
    }
}

internal fun File.makeAllDirsForce(): Boolean {
    if (exists()) return false

    return if (mkdir()) true
    else {
        File(path.split(File.separator).dropLast(1).joinToString(File.separator)).makeAllDirsForce()
        mkdir()
    }
}

open class LightTranspileFoldingToKotlinToAllTask : LightTranspilerKtPluginTask() {
    @TaskAction
    fun task() {

    }
}

open class LightTranspileFoldingToKotlinTask @Inject constructor (private val outputPath: String, private val sourcesSets: List<FoldingSourceSet>) : LightTranspilerKtPluginTask() {

    @TaskAction
    fun task() {
        val transpiler = DefaultLightTranspilerKt
        val sourceSets = sourcesSets.filter { it.target?.equals("kotlin") ?: true  }
        sourceSets.forEach { set ->
            val inputPath = set.sourceDir + "/folding"
            val outputPath = this.outputPath + "/kotlin"

            val syntaxErrorListenerList = mutableListOf<SimpleErrorListener>()

            val inputDir = File(inputPath)
            if (!inputDir.exists()) return

            val files = inputDir.walk()
            val fileContextsByPackage = files
                .filterNot { it.isDirectory }
                .map {
                    val parser = FoldingParser(CommonTokenStream(FoldingLexer(CharStreams.fromString(it.readText()))))
                    val listener = SimpleErrorListener(it.name)
                    syntaxErrorListenerList += listener
                    parser.addErrorListener(listener)
                    parser.file()
                }
                .groupBy { it.findNamespace()?.findPackage_()?.text }

            if (syntaxErrorListenerList.any { it.syntaxErrorCount > 0 }) handleSyntaxErrors(syntaxErrorListenerList)

            val transpiledList = fileContextsByPackage.values.flatMap {
                transpiler.transpilePackage(outputPath,it)
            }
            val transpiledDirsToTranspiled = transpiledList.map {
                File(it.dirText)
                File(it.dirText) to it
            }

            val transpileFiles = transpiledDirsToTranspiled.map { (dir,it) ->
                val file = File(dir,it.name)
                dir.makeAllDirsForce()
                println(file.path)
                file.createNewFile()
                file.writeText(it.content)
                file
            }
        }
    }

    fun handleSyntaxErrors(listeners: List<SimpleErrorListener>): Nothing {
        val messages = listeners
            .flatMap { it.messages }
            .onEach {
                println(it)
            }
        val exceptionMessage = messages.joinToString(
            "\n  ",
            "Syntax Error have detected!\n=========\n  ",
            "\n========="
        )
        throw RuntimeException(exceptionMessage)
    }

}

val TaskContainerScope.lightTranspileFoldingToKotlinToAll: TaskProvider<LightTranspileFoldingToKotlinToAllTask>
    get() = named<LightTranspileFoldingToKotlinToAllTask>("lightTranspileFoldingToKotlinToAll")