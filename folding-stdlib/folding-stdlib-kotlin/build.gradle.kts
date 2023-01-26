import foldingx.gradle.base.folding

plugins {
    kotlin("multiplatform")
}

dependencies {
    commonMainImplementation(kotlin("stdlib-common"))
    commonMainImplementation(project(":folding-stdlib:folding-stdlib-common"))
}

folding {
    sourcesSets {
        val commonMain by creating {
            target = "kotlin"
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
}