package foldingx.lighttranspiler.kotlin.gradle

import foldingx.gradle.base.FoldingPlatform
import foldingx.gradle.base.FoldingSourceSet
import foldingx.lighttranspiler.kotlin.DefaultLightTranspilerKt
import foldingx.lighttranspiler.kotlin.effect.EffectKt
import foldingx.parser.FoldingLexer
import foldingx.parser.FoldingParser
import foldingx.parser.util.SimpleErrorListener
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.TaskContainerScope
import org.gradle.kotlin.dsl.named
import java.io.File
import javax.inject.Inject


internal fun File.makeAllDirsForce(): Boolean {
    if (exists()) return false

    return if (mkdir()) true
    else {
        File(path.split(File.separator).dropLast(1).joinToString(File.separator)).makeAllDirsForce()
        mkdir()
    }
}



fun makeDefaultOutputPath(platform: FoldingPlatform, sourceSet: FoldingSourceSet) =
    "src/${sourceSet.name}/kotlin"

fun lightTranspileFoldingToKotlin(platform: FoldingPlatform, sourceSet: FoldingSourceSet) {
    val transpiler = DefaultLightTranspilerKt
    val inputPath = sourceSet.sourceDir
    val outputPath = sourceSet.outputDirs.getOrDefault(platform,makeDefaultOutputPath(platform, sourceSet))

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
        .filter {
            val isImpl = it.key?.matches(".+\\.(implfd\\.(.+\\.?)+)".toRegex()) ?: false
            val isImplThisPlatform = it.key?.matches(".+\\.(implfd\\.${platform.name})".toRegex()) ?: false
            !isImpl || isImplThisPlatform
        }

    if (syntaxErrorListenerList.any { it.syntaxErrorCount > 0 }) handleSyntaxErrors(syntaxErrorListenerList)

    val effect = EffectKt()
    effect.packageFormatMap["platform"] = platform.name

    val transpiledList = fileContextsByPackage.values.flatMap {
        transpiler.transpilePackage(outputPath,it,effect)
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

open class LightTranspileFoldingToKotlinTask @Inject constructor (
    private val platform: FoldingPlatform,
    private val sourceSet: FoldingSourceSet,
) : LightTranspilerKtPluginTask() {
    @TaskAction
    fun task() {
        lightTranspileFoldingToKotlin(platform, sourceSet)
    }
}

open class LightTranspileAllFoldingToKotlinByPlatformTask @Inject constructor (
    private val platform: FoldingPlatform,
) : LightTranspilerKtPluginTask() {
    @TaskAction
    fun task() {
        platform.sourceSets.forEach {
            lightTranspileFoldingToKotlin(platform, it)
        }
    }
}
