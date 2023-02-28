plugins {
    kotlin("multiplatform") version "1.8.0" apply false
    id("org.jetbrains.dokka") version "1.7.20" apply false
    `maven-publish`
    signing
}


val prepareMavenDeployment: Project.(String) -> Unit = { description: String  ->
    this.apply(plugin="org.jetbrains.dokka")
    this.tasks {
        create<Jar>("dokkaJar") {
            archiveClassifier.set("javadoc")
            dependsOn("dokkaHtml")

            from("$buildDir/dokka/html/") {
                include("**")
            }
        }
    }

    this.publishing {
        repositories {
            mavenLocal()
//            maven {
//                name = "OSSRH"
//
//                credentials {
//                    username = rootProject.properties["ossrhUsername"]!! as String
//                    password = rootProject.properties["ossrhPassword"]!! as String
//                }
//
//                url = uri(
//                    if ("SNAPSHOT" in version as String) {
//                        "https://s01.oss.sonatype.org/content/repositories/snapshots/"
//                    } else {
//                        "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
//                    }
//                )
//            }
        }
        publications {
            create<MavenPublication>(project.name) {

                groupId = group as String
                artifactId = project.name
                version = project.version as String

                artifact(tasks["dokkaJar"])

                pom {
                    name.set(project.name)
                    getDescription().set(description)
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
rootProject.ext["prepareMavenDeployment"] = prepareMavenDeployment

allprojects {
    group = "io.github.folding-lang"
    repositories {
        mavenLocal()
        mavenCentral()
        maven("https://jitpack.io")
    }
}