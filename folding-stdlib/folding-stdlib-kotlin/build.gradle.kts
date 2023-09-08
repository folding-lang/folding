import foldingx.gradle.base.sourceSets
import foldingx.gradle.base.target
import foldingx.lighttranspiler.kotlin.gradle.kotlin

plugins {
    kotlin("multiplatform")
    `maven-publish`
}

version = "0.1-SNAPSHOT"

dependencies {
    commonMainImplementation(kotlin("stdlib-common"))
}

folding {
    sourceSets {
        val commonMain by creating {
            target(kotlin)
        }
        val jvmTest by creating {
            target(kotlin)
        }
    }
}

kotlin {
    jvm()
    js(IR) {
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

val prepareMavenDeployment: Project.(description: String) -> Unit by rootProject.ext
prepareMavenDeployment("the folding-lang standard lib target kotlin")
