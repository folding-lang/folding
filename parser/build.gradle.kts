plugins {
    kotlin("multiplatform") version "1.7.0"
}



buildscript {
    repositories {
        mavenCentral()
        maven(url="https://jitpack.io")
    }
    val antlrGroup = "com.strumenta.antlr-kotlin"
    val antlrVersion = "-SNAPSHOT"
    dependencies {
        classpath("$antlrGroup:antlr-kotlin-gradle-plugin:$antlrVersion")
    }
}

kotlin {
    jvm()
    js {
        browser {}
    }

    sourceSets {
        val commonAntlr by creating {
            val antlrGroup = "com.strumenta.antlr-kotlin"
            val antlrVersion = "-SNAPSHOT"
            dependencies {
                api(kotlin("stdlib-common"))
                api("$antlrGroup:antlr-kotlin-runtime:$antlrVersion")
            }
            kotlin.srcDir("build/generated-src/commonAntlr/kotlin")
        }

        val commonMain by getting {
            dependsOn(commonAntlr)
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
    }
}