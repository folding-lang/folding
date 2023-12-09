plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    js(IR) {
        browser {}
        nodejs {}
    }
    linuxX64 {
        binaries {
            staticLib()
            executable()
        }
    }
    mingwX64 {
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

        val linuxX64Main by getting {
            dependencies {
                implementation(project(":folding-parser"))
            }
        }

        val mingwX64Main by getting {
            dependencies {
                implementation(project(":folding-parser"))
            }
        }

    }
}

rootProject.extensions.configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
    versions.webpackCli.version = "4.10.0"
}