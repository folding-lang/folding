plugins {
    id("io.github.folding-lang.foldingx.generate") version "1.0-SNAPSHOT"
    id("io.github.folding-lang.folding.lighttranspiler.kotlin") version "0.1-SNAPSHOT"
}

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }
    dependencies {
        classpath("io.github.folding-lang:light-transpiler-common-jvm:0.1-SNAPSHOT")
        classpath("io.github.folding-lang:light-transpiler-kotlin-jvm:0.1-SNAPSHOT")
    }
}

subprojects {
    apply(plugin = "io.github.folding-lang.foldingx.generate")
    apply(plugin = "io.github.folding-lang.folding.lighttranspiler.kotlin")
}