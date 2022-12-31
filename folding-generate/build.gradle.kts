plugins {
    kotlin("jvm")
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "1.1.0"
}

group = "foldingx"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(kotlin("stdlib"))
    implementation(gradleApi())
    implementation(gradleKotlinDsl())
}

gradlePlugin {
    plugins {
        create("foldingGenerate") {
            id = "foldingx.generate"
            implementationClass = "foldingx.generate.GeneratePlugin"
        }
    }
}

publishing {
    repositories {
        mavenLocal()
    }
}