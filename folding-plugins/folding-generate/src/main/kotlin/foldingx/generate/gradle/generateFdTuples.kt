package foldingx.generate.gradle

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.TaskContainerScope
import org.gradle.kotlin.dsl.named
import java.io.File

open class GenerateFdTuplesTask : GeneratePluginTask() {
    @Input lateinit var genFileName: String
    @Input lateinit var genDir: String
    @Input lateinit var namespace: String
    @Input var tupleCount = 20

    @TaskAction
    fun task() {
        genFdTuplesFile(genFileName, genDir, namespace, tupleCount)
    }
}

val TaskContainerScope.generateFdTuples: TaskProvider<GenerateFdTuplesTask>
    get() = named<GenerateFdTuplesTask>("generateFdTuples")

fun genFdTuplesFile(fileName: String, dir: String? = null, namespace: String, tupleCount: Int) {
    val file = File("${dir?.let { it + File.separator } ?: ""}$fileName")
    val text = "package $namespace\n\n" + genFdTuplesUntil(tupleCount)

    file.createNewFile()
    file.writeText(text)
}

fun genFdTuplesUntil(number: Int) = (1..number).joinToString("\n") { genFdTuple(it) }

fun genFdTuple(number: Int): String {
    val range = 0 until number
    val typeParam = range.joinToString(" ","(",")") { "T$it" }
    val param = range.joinToString(" ","(",")") { "_$it~T$it" }
    return "class FdTuple$number $typeParam { $param }"
}
