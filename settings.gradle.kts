rootProject.name = "folding"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
}

include("folding-parser")

include("folding-parserx")

val lightTranspilerDirName = "light-transpiler"
include(lightTranspilerDirName)
val lightTranspilerDir = file(lightTranspilerDirName)
val lightTranspilerList =
    lightTranspilerDir
        .listFiles { dir, name ->
            name.contains("transpiler")
        }
        .mapNotNull {
            if (!it.isDirectory) return@mapNotNull null
            val name = it.name
            include("$lightTranspilerDirName:$name")
            it
        }


val stdlibDirName = "folding-stdlib"
include(stdlibDirName)
val stdlibDir = file(stdlibDirName)
val stdlibList =
    stdlibDir
        .listFiles { dir, name ->
            name.contains("stdlib")
        }
        .mapNotNull {
            if (!it.isDirectory) return@mapNotNull null
            val name = it.name
            include("$stdlibDirName:$name")
            it
        }

val pluginsDirName = "folding-plugins"
include(pluginsDirName)
val pluginsDir = file(pluginsDirName)
val pluginsList =
    pluginsDir
        .listFiles { dir, name ->
            name.contains("folding")
        }
        .mapNotNull {
            if (!it.isDirectory) return@mapNotNull null
            val name = it.name
            include("$pluginsDirName:$name")
            it
        }

