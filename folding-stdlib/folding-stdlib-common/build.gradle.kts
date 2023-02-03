import foldingx.generate.gradle.generateFdTuples

folding {
    sourcesSets {
        val main by creating {
            outputDirs += "../folding-stdlib-kotlin/src/commonMain"
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