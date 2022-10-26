plugins {
    kotlin("multiplatform") version "1.7.20"
}

kotlin {
    jvm()
    js {
        browser {}
        nodejs {}
        useCommonJs()
        binaries.executable()
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