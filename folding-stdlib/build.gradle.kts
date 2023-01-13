import foldingx.generate.gradle.generateFdTuples

plugins {
    kotlin("jvm")
}

buildscript {
    repositories {
        mavenLocal()
    }

    dependencies {
        classpath("io.github.folding-lang:folding-generate:1.0-SNAPSHOT")
    }
}

apply(plugin = "foldingx.generate")

tasks {
    generateFdTuples {
        namespace = "folding"
        val path = listOf(projectDir.absolutePath,"src","main","folding","folding")
            .joinToString(File.separator).also(::println)
        mkdir(path)
        genDir = path
        genFileName = "FdTuples.fd"
    }
}