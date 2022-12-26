rootProject.name = "folding"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
}

include("folding-generate")

include("folding-parser")
include("folding-parser:example")
include("folding-parser:publish")

include("folding-parserx")

val lightTranspilerDirName = "light-transpiler"
include(lightTranspilerDirName)
val lightTranspilerDir = file(lightTranspilerDirName)
val lightTranspilerList =
    lightTranspilerDir
        .list { dir, name -> name.contains("transpiler") }
        .map {
            include("$lightTranspilerDirName:$it")
            it
        }


val stdlibDirName = "folding-stdlib"
include(stdlibDirName)
val stdlibDir = file(stdlibDirName)
val stdlibList =
    stdlibDir
        .list { dir, name -> name.contains("stdlib") }
        .map {
            include("$stdlibDirName:$it")
            it
        }

