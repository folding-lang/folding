import foldingx.gradle.base.folding
import foldingx.lighttranspiler.kotlin.gradle.LightTranspileFoldingToKotlinTask
import foldingx.lighttranspiler.kotlin.gradle.lightTranspileFoldingToKotlinToAll

plugins {
    kotlin("multiplatform")
    `maven-publish`
}

version = "0.1-SNAPSHOT"

dependencies {
    commonMainImplementation(kotlin("stdlib-common"))
}

folding {
    sourcesSets {
        val commonMain by creating {
            target = "kotlin"
        }
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
                description.set("the folding-lang standard lib target kotlin")
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