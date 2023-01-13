version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":folding-plugins:folding-base"))
    implementation(project(":light-transpiler:light-transpiler-common"))
    implementation(project(":light-transpiler:light-transpiler-kotlin"))
    implementation(project(":folding-parser"))
}

gradlePlugin {
    plugins {
        create("foldingLightTranspilerKt") {
            id = "folding.lighttranspiler.kotlin"
            implementationClass = "foldingx.lighttranspiler.kotlin.gradle.LightTranspilerKtPlugin"
        }
    }
}