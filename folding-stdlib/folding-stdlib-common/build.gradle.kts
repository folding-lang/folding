import foldingx.generate.gradle.generateFdTuples
import foldingx.gradle.base.folding

plugins {
    kotlin("multiplatform")
}

folding {
    sourcesSets {
        val main by creating
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

kotlin {
    jvm()
    js(BOTH) {
        browser {}
        nodejs {}
    }

    // region:Region: Configurations for Kotlin/Native
    linuxX64("linux") {
        binaries {
            staticLib()
        }
    }
    mingwX64("windows") {
        binaries {
            staticLib()
        }
    }
    // endregion\

    sourceSets {
        val main by creating {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonMain by getting {
            dependsOn(main)
        }
    }
}