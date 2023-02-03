package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.FileWrapper
import foldingx.lighttranspiler.LightTranspiler
import foldingx.lighttranspiler.exception.invalidCode
import foldingx.parser.FoldingParser

interface LightTranspilerKt : LightTranspiler, LightClassTranspilerKt {
    var currentPackage: String?
    override fun getCurrentTranspilingPackage(): String? = currentPackage

    override fun transpilePackage(
        sourcesRoot: String,
        fdFileContextList: List<FoldingParser.FileContext>
    ): List<FileWrapper> {
        val namespace = fdFileContextList.first().findNamespace()?.let { it.findPackage_()!!.text }
        val packagePath = namespace?.replace(".","/") ?: ""
        val top = namespace?.let { "package $namespace\n\n" }

        val importText = fdFileContextList.flatMap {
            it.findImportEx().flatMap { processImportEx(it).split("\n") }
        }.distinct().joinToString("\n")

        val defList = fdFileContextList.flatMap {
            currentPackage = it.findNamespace()?.findPackage_()?.text
            it.findFileCompo().mapNotNull { it.findDefinition()?.findDef() }
        }
        val annotationDefList = fdFileContextList.flatMap { it.findAnnotationDef() }
        val globalFieldList = fdFileContextList.flatMap { it.findFileCompo().mapNotNull { it.findField() } }
        val classList = fdFileContextList.flatMap { it.findFileCompo().mapNotNull { it.findDefinition()?.findClass_() } }

        val (classFiles,constructFuncTexts) = classList.map {
            val classId = when(it) {
                is FoldingParser.JustInterfaceContext -> it.ID()!!.text
                is FoldingParser.JustClassContext -> it.ID()!!.text
                is FoldingParser.JustAbstractClassContext -> it.ID()!!.text
                else -> throw RuntimeException()
            }
            val transpiled = transpileClass(it)
            val classText = transpiled.substringBeforeLast("/** folding class constructor function */\n")
            val constructText = "/** folding class constructor function */\n" +
                    transpiled.substringAfterLast("/** folding class constructor function */\n")
            FileWrapper(
                "$sourcesRoot/$packagePath",
                "$classId.kt",
                top + importText + "\n\n\n" + classText
            ) to constructText
        }.unzip()

        val annotationDefFile = annotationDefList.map {
            FileWrapper(
                "$sourcesRoot/$packagePath",
                it.ID()!!.text + ".kt",
                top + importText + "\n\n\n" + processAnnotationDef(it)
            )
        }

        val defaultFile = FileWrapper(
            "$sourcesRoot/$packagePath",
            "Default.kt",
            top + importText +
                    globalFieldList.joinToString("\n\n","\n\n\n") { processField(it) } +
                    constructFuncTexts.joinToString("\n\n","\n\n\n") +
                    defList.joinToString("\n\n","\n\n\n") { processDef(it) }
        )

        return listOf(defaultFile) + annotationDefFile + classFiles
    }

    override fun transpileFile(fdFileContext: FoldingParser.FileContext): String {
        val namespace = fdFileContext.findNamespace()?.let { "package " + it.findPackage_()!!.text } ?: ""
        val imports = fdFileContext.findImportEx()
            .flatMap { processImportEx(it).split("\n") }
            .distinct().joinToString("\n")
        val allAnnotationDef = fdFileContext.findAnnotationDef().joinToString("\n") { processAnnotationDef(it) }
        val fileBody = fdFileContext.findFileCompo().joinToString("\n\n") { processFileCompo(it) }
        return listOf(namespace,imports,allAnnotationDef,fileBody).filter { it != "" }.joinToString("\n\n\n")
    }
    override fun processImportEx(fdImportExContext: FoldingParser.ImportExContext): String {
        val pkg = fdImportExContext.findPackage_()!!.text
        val importNestId = fdImportExContext.findImportNest()?.let { "." + it.ID()!!.text }
        return fdImportExContext.findImportBody()?.findImportCompo()?.joinToString("\n") { compo ->
            when {
                compo.CLASS() == null ->
                    "import $pkg${importNestId ?: ""}.${compo.ID()!!.text}" +
                            (compo.findImportAlias()?.let { " as ${it.ID()!!.text}" } ?: "")
                compo.QUOTE().isEmpty() ->
                    "import $pkg${importNestId ?: ""}.${compo.ID()!!.text}" +
                            (compo.findImportAlias()?.let { " as ${it.ID()!!.text}" } ?: "") +
                            "\nimport $pkg.${compo.ID()!!.text}Class"
                compo.QUOTE().isNotEmpty() ->
                    "import $pkg.${compo.ID()!!.text}" +
                            (compo.findImportAlias()?.let { " as ${it.ID()!!.text}" } ?: "")
                else -> throw invalidCode("import",compo)
            }
        } ?: ((importNestId?.let { "import $pkg$it.*\n" } ?: "") + "import $pkg.*")
    }
    override fun processFileCompo(fdFileCompoContext: FoldingParser.FileCompoContext): String = when {
        fdFileCompoContext.findDefinition() != null -> processDefinition(fdFileCompoContext.findDefinition()!!)
        fdFileCompoContext.findField() != null -> processField(fdFileCompoContext.findField()!!)
        else -> throw RuntimeException("Invalid fileCompo '${fdFileCompoContext.text}'")
    }
    override fun processDefinition(fdDefinitionContext: FoldingParser.DefinitionContext): String = when {
        fdDefinitionContext.findDef() != null -> processDef(fdDefinitionContext.findDef()!!)
        fdDefinitionContext.findClass_() != null -> processClass(fdDefinitionContext.findClass_()!!)
        else -> throw RuntimeException("Invalid definition '${fdDefinitionContext.text}'")
    }
    override fun processDef(fdDefContext: FoldingParser.DefContext): String = transpileDef(fdDefContext)
    override fun processClass(fdClass_Context: FoldingParser.Class_Context): String = transpileClass(fdClass_Context)
    override fun processAnnotationDef(fdAnnotationDefContext: FoldingParser.AnnotationDefContext): String =
        "annotation class ${fdAnnotationDefContext.ID()!!.text} ${processParameter(fdAnnotationDefContext.findParameter()!!)}"
}
