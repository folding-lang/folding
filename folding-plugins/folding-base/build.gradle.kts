version = "1.0-SNAPSHOT"

gradlePlugin {
    plugins {
        create("foldingBase") {
            id = "io.github.folding-lang.folding.base"
            implementationClass = "foldingx.gradle.base.FoldingBasePlugin"
        }
    }
}