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
        val jvmTest by creating {
            target = "kotlin"
            outputDirs +="src/jvmTest"
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

    sourceSets {
        val commonMain_transpiled_fd by creating {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }

        val commonMain by getting {
            dependsOn(commonMain_transpiled_fd)
        }
    }
}

val prepareMavenDeployment: Project.(description: String) -> Unit by rootProject.ext
prepareMavenDeployment("the folding-lang standard lib target kotlin")
