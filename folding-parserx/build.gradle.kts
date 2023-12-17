plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    js(IR) {
        browser {}
        nodejs {}
    }
//    linuxX64 {
//        binaries {
//            staticLib()
//        }
//    }
//    mingwX64 {
//        binaries {
//            staticLib()
//        }
//    }

    sourceSets {

        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(project(":folding-parser"))
            }
        }

    }
}