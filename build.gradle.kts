plugins {
    kotlin("multiplatform") version "1.7.20" apply false
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        maven("https://jitpack.io")
    }
}