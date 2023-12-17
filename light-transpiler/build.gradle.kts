plugins {
    kotlin("multiplatform")
    id("org.jetbrains.dokka")
    `maven-publish`
}
val prefix = "light-transpiler"

version = "0.1-SNAPSHOT"

subprojects {
    apply(plugin="org.jetbrains.kotlin.multiplatform")
    apply(plugin="org.gradle.maven-publish")
    apply(plugin="org.jetbrains.dokka")

    version = parent!!.version

    dependencies {
        commonMainImplementation(project(":folding-parser"))
        if (!name.contains("common"))
            commonMainImplementation(project(":$prefix:$prefix-common"))
    }
    kotlin {
        jvm()
        js(IR) {
            browser {}
            nodejs {}
        }

//        // region:Region: Configurations for Kotlin/Native
//        linuxX64 {
//            binaries {
//                staticLib()
//            }
//        }
//        mingwX64 {
//            binaries {
//                staticLib()
//            }
//        }
//        // endregion
    }

    val prepareMavenDeployment: Project.(description: String) -> Unit by rootProject.ext
    prepareMavenDeployment("the folding-lang $name")
}

kotlin {
    jvm()
}