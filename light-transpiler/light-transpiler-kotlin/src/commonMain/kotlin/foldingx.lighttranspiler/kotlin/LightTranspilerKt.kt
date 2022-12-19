package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightTranspiler
import foldingx.parser.FoldingParser

interface LightTranspilerKt : LightTranspiler, LightClassTranspilerKt {
    override fun transpile(fdFileContext: FoldingParser.FileContext): String {
        val namespace = fdFileContext.findNamespace()?.let { "package" + it.findPackage_()!!.text } ?: ""
        val imports = fdFileContext.findImportEx().joinToString("\n") { processImportEx(it) }
        val allAnnotationDef = fdFileContext.findAnnotationDef().joinToString("\n") { processAnnotationDef(it) }
        val fileBody = fdFileContext.findFileCompo().joinToString("\n\n") { processFileCompo(it) }
        return listOf(namespace,imports,allAnnotationDef,fileBody).joinToString("\n\n\n")
    }
    override fun processImportEx(fdImportExContext: FoldingParser.ImportExContext): String {
        val pkg = fdImportExContext.findPackage_()!!.text
        return fdImportExContext.findImportBody()?.findImportCompo()?.joinToString("\n") { compo ->
            "$pkg.${compo.ID()!!.text}" + (compo.findImportAlias()?.let { " as ${it.ID()!!.text}" } ?: "")
        } ?: "$pkg.*"
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
    override fun processField(fdFieldContext: FoldingParser.FieldContext): String = when {
        fdFieldContext.findFieldNotInit() != null -> if (fdFieldContext.findFieldNotInit()!!.findTypeEx()!!.QM() == null)
            fdFieldContext.findFieldNotInit()!!.let {
                if (it.MUTABLE() != null) """
                   |private ${it.ID()!!.text}_field: ${processTypeEx(it.findTypeEx()!!)}? = null
                   |var ${it.ID()!!.text}: ${processTypeEx(it.findTypeEx()!!)}
                   |    get() = ${it.ID()!!.text}_field ?: throw RuntimeException("The field '${it.ID()!!.text}' has not been initialized")
                   |    set(value) { ${it.ID()!!.text}_field = value }""".trimMargin()
                else """
                   |private ${it.ID()!!.text}_field: ${processTypeEx(it.findTypeEx()!!)}? = null
                   |var ${it.ID()!!.text}: ${processTypeEx(it.findTypeEx()!!)}
                   |    get() = ${it.ID()!!.text}_field ?: throw RuntimeException("The field '${it.ID()!!.text}' has not been initialized")
                   |    set(value) {
                   |        if (${it.ID()!!.text}_field != null) ${it.ID()!!.text}_field = value
                   |        else throw RuntimeException("The field '${it.ID()!!.text}' was already initialized")
                   |    }""".trimMargin()
            } else throw RuntimeException("Invalid field type '${fdFieldContext.findFieldNotInit()!!.text}': " +
                "not initialized field type must be non-nullable")
        fdFieldContext.findFieldSetted() != null -> fdFieldContext.findFieldSetted()!!.let {
            val keyword = if (it.MUTABLE() != null) "var" else "val"
            "$keyword ${it.ID()!!.text} ${it.findTypeEx()?.let { t -> ": " + processTypeEx(t) } ?: ""} = ${processValue(it.findValue()!!)}"
        }
        else -> throw RuntimeException("Invalid field '${fdFieldContext.text}'")
    }
    override fun processAnnotationDef(fdAnnotationDefContext: FoldingParser.AnnotationDefContext): String =
        "annotation class ${fdAnnotationDefContext.ID()!!.text} ${processParameter(fdAnnotationDefContext.findParameter()!!)}"
}
