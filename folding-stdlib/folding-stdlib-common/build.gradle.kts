import foldingx.gradle.base.folding
import foldingx.generate.gradle.generateFdTuples
import foldingx.lighttranspiler.kotlin.gradle.kotlin

folding {
    sourceSets {
        val main by creating {
            outputDirs[kotlin] = "../folding-stdlib-kotlin/src/commonMain/kotlin"
        }
    }
}

val genFdTuplesPath = listOf(projectDir.absolutePath,"src","main","folding","folding")
    .joinToString(File.separator).also(::println)

tasks {
    generateFdTuples {
        namespace = "folding"
        mkdir(genFdTuplesPath)
        genDir = genFdTuplesPath
        genFileName = "FdTuples.fd"
    }
}