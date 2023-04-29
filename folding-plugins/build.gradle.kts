plugins {
    kotlin("jvm")
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "1.1.0"
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.gradle.java-gradle-plugin")
    apply(plugin = "com.gradle.plugin-publish")

    dependencies {
        implementation(kotlin("stdlib"))
        implementation(gradleApi())
        implementation(gradleKotlinDsl())
    }

    publishing {
        repositories {
            mavenLocal()
            maven {
                name = "OSSRH"

                credentials {
                    username = rootProject.properties["ossrhUsername"]!! as String
                    password = rootProject.properties["ossrhPassword"]!! as String
                }

                url = uri(
                        if ("SNAPSHOT" in version as String) {
                            "https://s01.oss.sonatype.org/content/repositories/snapshots/"
                        } else {
                            "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                        }
                )
            }
            maven {
                name = "Github"

                credentials {
                    username = rootProject.properties["githubUser"] as String
                    password = rootProject.properties["githubToken"] as String
                }

                url = uri("https://maven.pkg.github.com/folding-lang/folding")
            }
        }
    }
}