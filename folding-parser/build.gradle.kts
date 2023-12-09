plugins {
    kotlin("multiplatform")
    `maven-publish`
    antlr
}

val antlrGroup = "com.strumenta"
val antlrVersion = "0.1.0-RC5"

version = "0.1-SNAPSHOT"

kotlin {
    jvm()
    js(IR) {
        browser {}
        nodejs {}
    }

    // region:Region: Configurations for Kotlin/Native
    linuxX64 {
        binaries {
            staticLib()
        }
    }
    mingwX64 {
        binaries {
            staticLib()
        }
    }
    // endregion

    sourceSets {

        val commonMain by getting {
            this.kotlin.source(
                project.objects
                    .sourceDirectorySet("antlr", "antlr")
                    .srcDir("src/commonMain/kotlinAntlr").apply {
                        include("*.kt")
                    }
            )
            dependencies {
                implementation(kotlin("stdlib-common"))
                api("$antlrGroup:antlr-kotlin-runtime:$antlrVersion")
            }
        }

    }
}

dependencies {
    // The ANTLR 4 dependency, which instructs the Gradle ANTLR plugin
    // to use ANTLR 4 instead of the bundled version
    antlr("org.antlr:antlr4:4.13.1")

    // The ANTLR Kotlin target
    antlr("$antlrGroup:antlr-kotlin-target:$antlrVersion")
}

//tasks.register<com.strumenta.antlrkotlin.gradleplugin.AntlrKotlinTask>("generateKotlinCommonGrammarSource") {
//    // the classpath used to run antlr code generation
//    antlrClasspath = configurations.detachedConfiguration(
//        // antlr itself
//        // antlr is transitive added by antlr-kotlin-target,
//        // add another dependency if you want to choose another antlr4 version (not recommended)
//        // project.dependencies.create("org.antlr:antlr4:$antlrVersion"),
//
//        // antlr target, required to create kotlin code
//        project.dependencies.create("$antlrGroup:antlr-kotlin-target:$antlrVersion")
//    )
//    maxHeapSize = "64m"
//    packageName = "foldingx.parser"
//    arguments = listOf("-visitor", "-listener")
//    source = project.objects
//        .sourceDirectorySet("antlr", "antlr")
//        .srcDir("${rootDir.absolutePath}/folding-grammar/grammars/antlr4").apply {
//            include("*.g4")
//        }
//    outputDirectory = File("src/commonAntlr/kotlin")
//}
//
//tasks.build {
//    dependsOn("generateKotlinCommonGrammarSource")
//}

val generateKotlinGrammarSource = tasks.register<AntlrTask>("generateKotlinGrammarSource") {
    dependsOn("cleanGenerateKotlinGrammarSource")

    // ANTLR .g4 files are under {example-project}/antlr
    val source = project.objects
        .sourceDirectorySet("kotlinAntlr", "kotlinAntlr")
        .srcDir("${rootDir.absolutePath}/folding-grammar/grammars/antlr4").apply {
            include("*.g4")
        }
    setSource(source)

    val pkgName = "foldingx.parser"
    arguments = listOf(
        "-Dlanguage=Kotlin",    // We want to generate Kotlin sources
        "-visitor",             // We want visitors alongside listeners
        "-package", pkgName,    // We want the generated sources to have this package declared
        "-encoding", "UTF-8",   // We want the generated sources to be encoded in UTF-8
    )

    // Generated files are outputted inside standard sources,
    // but you can switch to output them under build/
    val outDir = "src/commonMain/kotlinAntlr/${pkgName.replace(".", "/")}"
    outputDirectory = File(outDir)
}

tasks {
    generateGrammarSource {
        // The default task is set up considering a Java source set,
        // which we might not have in a Kotlin project.
        // Using it is messier than simply registering a new task
        enabled = false
    }
}

val prepareMavenDeployment: Project.(description: String) -> Unit by rootProject.ext
prepareMavenDeployment("the folding-lang parser")



