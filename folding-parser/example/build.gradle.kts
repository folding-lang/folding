plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    js(BOTH) {
        browser {}
        nodejs {}
    }
    linuxX64("linux") {
        binaries {
            staticLib()
            executable()
        }
    }
    mingwX64("windows") {
        binaries {
            staticLib()
            executable()
        }
    }

    sourceSets {

        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(project(":folding-parser"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(project(":folding-parser"))
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(project(":folding-parser"))
            }
        }

        val linuxMain by getting {
            dependencies {
                implementation(project(":folding-parser"))
            }
        }

        val windowsMain by getting {
            dependencies {
                implementation(project(":folding-parser"))
            }
        }

    }
}

rootProject.extensions.configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
    versions.webpackCli.version = "4.10.0"
}