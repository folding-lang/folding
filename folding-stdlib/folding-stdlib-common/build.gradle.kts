import foldingx.generate.gradle.generateFdTuples
import foldingx.gradle.base.folding
import org.jetbrains.kotlin.cli.js.internal.main

plugins {
    kotlin("multiplatform")
    `maven-publish`
}

folding {
    sourcesSets {
        val mainSource by creating
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
        val mainSource by creating {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonMain by getting {
            dependsOn(mainSource)
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
    }
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