version = "1.0-SNAPSHOT"

gradlePlugin {
    plugins {
        create("foldingGenerate") {
            id = "io.github.folding-lang.foldingx.generate"
            implementationClass = "foldingx.generate.gradle.GeneratePlugin"
        }
    }
}