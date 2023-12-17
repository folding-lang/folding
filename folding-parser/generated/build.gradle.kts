plugins {
    kotlin("multiplatform")
    `maven-publish`
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

//    // region:Region: Configurations for Kotlin/Native
//    linuxX64 {
//        binaries {
//            staticLib()
//        }
//    }
//    mingwX64 {
//        binaries {
//            staticLib()
//        }
//    }
//    // endregion

    sourceSets {

        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                api("$antlrGroup:antlr-kotlin-runtime:$antlrVersion")
            }
        }

    }
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

val prepareMavenDeployment: Project.(description: String) -> Unit by rootProject.ext
prepareMavenDeployment("the folding-lang parser")



