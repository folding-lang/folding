plugins {
    kotlin("multiplatform") version "1.7.10"
}

kotlin {
    jvm()
    js {
        browser {}
        nodejs {}
        useCommonJs()
        binaries.executable()
    }

    sourceSets {

        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(project(":parser"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(project(":parser"))
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(project(":parser"))
            }
        }

    }
}

rootProject.extensions.configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
    versions.webpackCli.version = "4.10.0"
}