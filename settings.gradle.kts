rootProject.name = "folding"

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
