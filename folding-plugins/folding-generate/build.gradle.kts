version = "1.0-SNAPSHOT"

gradlePlugin {
    plugins {
        create("foldingGenerate") {
            id = "foldingx.generate"
            implementationClass = "foldingx.generate.gradle.GeneratePlugin"
        }
    }
}