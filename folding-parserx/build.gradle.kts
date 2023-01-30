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

    }
}