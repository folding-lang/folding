plugins {
    kotlin("multiplatform")
    `maven-publish`
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

version = "0.1-SNAPSHOT"

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
    // endregion

    sourceSets {
        val commonAntlr by creating {

            dependencies {
                api(kotlin("stdlib-common"))
                api("$antlrGroup:antlr-kotlin-runtime:$antlrVersion")
            }
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
    packageName = "foldingx.parser"
    arguments = listOf("-no-visitor", "-no-listener")
    source = project.objects
        .sourceDirectorySet("antlr", "antlr")
        .srcDir("${rootDir.absolutePath}/folding-grammar/grammars/antlr4").apply {
            include("*.g4")
        }
    outputDirectory = File("src/commonAntlr/kotlin")
}

tasks.build {
    dependsOn("generateKotlinCommonGrammarSource")
}


publishing {
    repositories {
        mavenLocal()
    }
    publications {
        create<MavenPublication>(project.name) {

            groupId = group as String
            artifactId = project.name

            pom {
                name.set(project.name)
                description.set("the folding-lang parser")
                url.set("https://github.com/folding-lang/${rootProject.name}")

                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://opensource.org/licenses/mit-license.php")
                    }
                }

                developers {
                    developer {
                        id.set("muqhc")
                        name.set("Muqhc")
                        email.set("muqhc07@gmail.com")
                        url.set("https://github.com/muqhc")
                        roles.addAll("developer")
                        timezone.set("Asia/Seoul")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/folding-lang/${rootProject.name}.git")
                    developerConnection.set("scm:git:ssh://github.com:folding-lang/${rootProject.name}.git")
                    url.set("https://github.com/folding-lang/${rootProject.name}")
                }
            }
        }
    }
}