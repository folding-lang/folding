plugins {
    kotlin("multiplatform") version "1.7.10"
}



buildscript {
    repositories {
        mavenCentral()
        maven(url="https://jitpack.io")
    }
    val antlrGroup = "com.strumenta.antlr-kotlin"
    val antlrVersion = "-SNAPSHOT"
    dependencies {
        classpath("$antlrGroup:antlr-kotlin-gradle-plugin:$antlrVersion")
    }
}

val antlrGroup = "com.strumenta.antlr-kotlin"
val antlrVersion = "-SNAPSHOT"

kotlin {
    jvm()
    js(BOTH) {
        browser {}
        nodejs {}
    }

    // region:Region: Configurations for Kotlin/Native
    ios("ios") {
        binaries {
            staticLib()
        }
    }
    linuxX64("linux") {
        binaries {
            staticLib()
        }
    }
    macosX64("mac") {
        binaries {
            staticLib()
        }
    }
    mingwX64("windows") {
        binaries {
            staticLib()
        }
    }
    // endregion

    sourceSets {
        val commonAntlr by creating {

            dependencies {
                api(kotlin("stdlib-common"))
                api("$antlrGroup:antlr-kotlin-runtime:$antlrVersion")
            }
            kotlin.srcDir("build/generated-src/commonAntlr/kotlin")
        }

        val commonMain by getting {
            dependsOn(commonAntlr)
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
    }
}

tasks.register<com.strumenta.antlrkotlin.gradleplugin.AntlrKotlinTask>("generateKotlinCommonGrammarSource") {
    // the classpath used to run antlr code generation
    antlrClasspath = configurations.detachedConfiguration(
        // antlr itself
        // antlr is transitive added by antlr-kotlin-target,
        // add another dependency if you want to choose another antlr4 version (not recommended)
        // project.dependencies.create("org.antlr:antlr4:$antlrVersion"),

        // antlr target, required to create kotlin code
        project.dependencies.create("$antlrGroup:antlr-kotlin-target:$antlrVersion")
    )
    maxHeapSize = "64m"
    packageName = "foldenx.parser.raw"
    arguments = listOf("-no-visitor", "-no-listener")
    source = project.objects
        .sourceDirectorySet("antlr", "antlr")
        .srcDir("${rootDir.absolutePath}/grammar/grammars/antlr4").apply {
            include("*.g4")
        }
    outputDirectory = File("src/commonAntlr/kotlin")
}

tasks.build {
    dependsOn("generateKotlinCommonGrammarSource")
}