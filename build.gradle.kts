plugins {
    kotlin("multiplatform") version "1.7.20" apply false
}

allprojects {
    group = "io.github.folding-lang"
    repositories {
        mavenLocal()
        mavenCentral()
        maven("https://jitpack.io")
    }
}