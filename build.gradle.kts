plugins {
    kotlin("multiplatform") version "1.8.0" apply false
}

allprojects {
    group = "io.github.folding-lang"
    repositories {
        mavenLocal()
        mavenCentral()
        maven("https://jitpack.io")
    }
}