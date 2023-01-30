plugins {
    kotlin("multiplatform")
    `maven-publish`
}
val prefix = "light-transpiler"

version = "0.1-SNAPSHOT"

subprojects {
    apply(plugin="org.jetbrains.kotlin.multiplatform")
    apply(plugin="org.gradle.maven-publish")

    version = parent!!.version

    dependencies {
        commonMainImplementation(project(":folding-parser"))
        if (!name.contains("common"))
            commonMainImplementation(project(":$prefix:$prefix-common"))
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
        // endregion
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
                    description.set("the folding-lang transpiler")
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
}

kotlin {
    jvm()
}