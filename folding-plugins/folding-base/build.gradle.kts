version = "1.0-SNAPSHOT"

gradlePlugin {
    plugins {
        create("foldingBase") {
            id = "folding.base"
            implementationClass = "foldingx.gradle.base.FoldingBasePlugin"
        }
    }
}