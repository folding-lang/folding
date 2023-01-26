version = project(":light-transpiler:light-transpiler-kotlin").version

dependencies {
    implementation(project(":folding-plugins:folding-base"))
    implementation(project(":light-transpiler:light-transpiler-common"))
    implementation(project(":light-transpiler:light-transpiler-kotlin"))
    implementation(project(":folding-parser"))
}

gradlePlugin {
    plugins {
        create("foldingLightTranspilerKt") {
            id = "io.github.folding-lang.folding.lighttranspiler.kotlin"
            implementationClass = "foldingx.lighttranspiler.kotlin.gradle.LightTranspilerKtPlugin"
        }
    }
}