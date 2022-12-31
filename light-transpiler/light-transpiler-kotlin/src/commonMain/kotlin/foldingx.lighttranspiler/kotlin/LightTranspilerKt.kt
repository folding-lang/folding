package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightTranspiler
import foldingx.lighttranspiler.exception.invalidCode
import foldingx.parser.FoldingParser

interface LightTranspilerKt : LightTranspiler, LightClassTranspilerKt {
    override fun transpile(fdFileContext: FoldingParser.FileContext): String {
        val namespace = fdFileContext.findNamespace()?.let { "package " + it.findPackage_()!!.text } ?: ""
        val imports = fdFileContext.findImportEx().joinToString("\n") { processImportEx(it) }
        val allAnnotationDef = fdFileContext.findAnnotationDef().joinToString("\n") { processAnnotationDef(it) }
        val fileBody = fdFileContext.findFileCompo().joinToString("\n\n") { processFileCompo(it) }
        return listOf(namespace,imports,allAnnotationDef,fileBody).filter { it != "" }.joinToString("\n\n\n")
    }
    override fun processImportEx(fdImportExContext: FoldingParser.ImportExContext): String {
        val pkg = fdImportExContext.findPackage_()!!.text
        return fdImportExContext.findImportBody()?.findImportCompo()?.joinToString("\n") { compo ->
            when {
                compo.CLASS() == null ->
                    "import $pkg.${compo.ID()!!.text}" +
                            (compo.findImportAlias()?.let { " as ${it.ID()!!.text}" } ?: "")
                compo.QUOTE().isEmpty() ->
                    "import $pkg.${compo.ID()!!.text}" +
                            (compo.findImportAlias()?.let { " as ${it.ID()!!.text}" } ?: "") +
                            "\nimport $pkg.${compo.ID()!!.text}Class"
                compo.QUOTE().isNotEmpty() ->
                    "import $pkg.${compo.ID()!!.text}" +
                            (compo.findImportAlias()?.let { " as ${it.ID()!!.text}" } ?: "")
                else -> throw invalidCode("import",compo)
            }
        } ?: "import $pkg.*"
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
