plugins {
    kotlin("jvm")
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "1.1.0"
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.gradle.java-gradle-plugin")
    apply(plugin = "com.gradle.plugin-publish")

    dependencies {
        implementation(kotlin("stdlib"))
        implementation(gradleApi())
        implementation(gradleKotlinDsl())
    }

    publishing {
        repositories {
            mavenLocal()
        }
    }
}