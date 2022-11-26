plugins {
    kotlin("multiplatform") version "1.7.20"
}
val prefix = "light-transpiler"
subprojects {
    apply(plugin="org.jetbrains.kotlin.multiplatform")
    dependencies {
        commonMainImplementation(project(":folding-parser"))
        if (!name.contains("common"))
            commonMainImplementation(project(":$prefix:$prefix-common"))
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
        // endregion
    }
}

kotlin {
    jvm()
}