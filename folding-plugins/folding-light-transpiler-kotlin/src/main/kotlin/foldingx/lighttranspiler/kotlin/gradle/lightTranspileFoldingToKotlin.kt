package foldingx.lighttranspiler.kotlin.gradle

import foldingx.gradle.base.FoldingPlatform
import foldingx.gradle.base.FoldingSourceSet
import foldingx.lighttranspiler.FileWrapper
import foldingx.lighttranspiler.kotlin.DefaultLightTranspilerKt
import foldingx.lighttranspiler.kotlin.effect.EffectKt
import foldingx.lighttranspiler.kotlin.processPackage
import foldingx.lighttranspiler.raw.processFoldingRawFile
import foldingx.parser.FoldingLexer
import foldingx.parser.FoldingParser
import foldingx.parser.util.SimpleErrorListener
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.gradle.api.tasks.TaskAction
import java.io.File
import javax.inject.Inject


internal fun File.makeAllDirsForce(): Boolean {
    if (exists()) return false

    return if (mkdir()) true
    else {
        parentFile.makeAllDirsForce()
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

    val effect = EffectKt()
    effect.packageFormatMap["platform"] = platform.name
    effect.packageFormatMap += platform.formats

    val files = inputDir.walk().filterNot { it.isDirectory }
    val fileContextsByPackage = files
        .filter { it.extension == "fd" }
        .map {
            val parser = FoldingParser(CommonTokenStream(FoldingLexer(CharStreams.fromString(it.readText()))))
            val listener = SimpleErrorListener(it.name)
            syntaxErrorListenerList += listener
            parser.addErrorListener(listener)
            parser.file()
        }
        .groupBy { it.findNamespace()?.findPackage_()?.text?.let { processPackage(it,effect) } }
        .filter {
            val isImpl = it.key?.matches(".+\\.(implfd\\.(.+\\.?)+)".toRegex()) ?: false
            val isImplThisPlatform = it.key?.matches(".+\\.(implfd\\.${platform.name})".toRegex()) ?: false
            !isImpl || isImplThisPlatform
        }

    if (syntaxErrorListenerList.any { it.syntaxErrorCount > 0 }) handleSyntaxErrors(syntaxErrorListenerList)


    val transpiledList = fileContextsByPackage.values.flatMap {
        transpiler.transpilePackage(outputPath,it,effect)
    }

    val transpiledRawList = files
        .filter { it.extension == "fdr" }.toList()
        .mapNotNull {
            val (rp,c) = processFoldingRawFile(it.readText(),effect)
            val p = processPackage(rp,effect)
            val dirText = "$outputPath/${p.replace(".","/")}".replace("\r","")

            val isImpl = p.matches(".+\\.(implfd\\.(.+\\.?)+)".toRegex())
            val isImplThisPlatform = p.matches(".+\\.(implfd\\.${platform.name})".toRegex())

            if (!isImpl || isImplThisPlatform)
                FileWrapper(dirText, it.nameWithoutExtension + ".kt", c)
            else null
        }

    val totalTranspiledList = transpiledList + transpiledRawList

    val transpiledDirsToTranspiled = totalTranspiledList.map {
        File(it.dirText) to it
    }

    val transpileFiles = transpiledDirsToTranspiled.map { (dir,it) ->
        dir.makeAllDirsForce()
        val file = File(dir,it.name)
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
