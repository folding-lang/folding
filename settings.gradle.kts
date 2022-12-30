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
        .listFiles { dir, name ->
            name.contains("transpiler") && dir.isDirectory()
        }
        .map { dir ->
            val name = dir.name
            include("$lightTranspilerDirName:$name")
            dir
                .list { pDir, pName ->
                    pName.contains("plugin") && pDir.isDirectory()
                }
                .map {
                    include("$lightTranspilerDirName:$name:$it")
                }
            dir
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

