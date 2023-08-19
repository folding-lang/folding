package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.FileWrapper
import foldingx.lighttranspiler.LightTranspiler
import foldingx.lighttranspiler.exception.InvalidCode
import foldingx.parser.FoldingParser
import foldingx.parser.classes.CommonClass
import foldingx.parser.identifier.processCommonClassId
import foldingx.parser.identifier.processId

interface LightTranspilerKt : LightTranspiler, LightClassTranspilerKt {
    var currentPackage: String?
    var generatedClassRegistry: MutableList<CommonClass>?
    override fun getCurrentTranspilingPackage(): String? = currentPackage
    override fun registerGeneratedClass(commonClass: CommonClass): Boolean =
        generatedClassRegistry?.add(commonClass) ?: false

    override fun transpilePackage(
        sourcesRoot: String,
        fdFileContextList: List<FoldingParser.FileContext>
    ): List<FileWrapper> {
        val namespace = fdFileContextList.first().findNamespace()?.let { it.findPackage_()!!.text }
        currentPackage = namespace
        val generatedClassBasket: MutableList<CommonClass> = mutableListOf()
        generatedClassRegistry = generatedClassBasket
        val packagePath = namespace?.replace(".","/") ?: ""
        val top = namespace?.let { "package $namespace\n\n" } ?: ""

        val importText = fdFileContextList.flatMap {
            it.findImportEx().flatMap { processImportEx(it).split("\n") }
        }.distinct().joinToString("\n")

        val defList = fdFileContextList.flatMap { it.findFileCompo().mapNotNull { it.findDefinition()?.findDef() } }
        val annotationDefList = fdFileContextList.flatMap { it.findAnnotationDef() }
        val typeAliasList = fdFileContextList.flatMap { it.findTypeAlias() }
        val globalFieldList = fdFileContextList.flatMap { it.findFileCompo().mapNotNull { it.findField() } }
        val classList = fdFileContextList.flatMap { it.findFileCompo().mapNotNull { it.findDefinition()?.findClass_() } }

        val (classFilesOrigin,constructFuncTextsOrigin) = classList.map {
            val classId = when(it) {
                is FoldingParser.JustInterfaceContext -> processCommonClassId(it.findCommonClassIdentifier()!!)
                is FoldingParser.JustClassContext -> processCommonClassId(it.findCommonClassIdentifier()!!)
                is FoldingParser.JustAbstractClassContext -> processCommonClassId(it.findCommonClassIdentifier()!!)
                else -> throw InvalidCode("class",it)
            }
            val transpiled = transpileClass(it)
            val classText = transpiled.substringBeforeLast("/** folding class constructor function */\n")
            val constructText =
                if (transpiled.contains("/** folding class constructor function */\n"))
                    "/** folding class constructor function */\n" +
                            transpiled.substringAfterLast("/** folding class constructor function */\n")
                else ""

            FileWrapper(
                "$sourcesRoot/$packagePath",
                "$classId.kt",
                top + importText + "\n\n\n" + classText
            ) to constructText
        }.unzip()

        val (classFilesAdditional,constructFuncTextsAdditional) = generatedClassBasket.map {
            val classId = processCommonClassId(it.identifier)
            val transpiled = processCommonClass(it)
            val classText = transpiled.substringBeforeLast("/** folding class constructor function */\n")
            val constructText =
                if (transpiled.contains("/** folding class constructor function */\n"))
                    "/** folding class constructor function */\n" +
                        transpiled.substringAfterLast("/** folding class constructor function */\n")
                else ""

            FileWrapper(
                "$sourcesRoot/$packagePath",
                "$classId.kt",
                top + importText + "\n\n\n" + classText
            ) to constructText
        }.unzip()

        val classFiles = classFilesOrigin + classFilesAdditional
        val constructFuncTexts = constructFuncTextsOrigin + constructFuncTextsAdditional

        val annotationDefFile = annotationDefList.map {
            FileWrapper(
                "$sourcesRoot/$packagePath",
                it.ID()!!.text + ".kt",
                top + importText + "\n\n\n" + processAnnotationDef(it)
            )
        }

        val typeAliasFile = typeAliasList.map {
            FileWrapper(
                "$sourcesRoot/$packagePath",
                processCommonClassId(it.findCommonClassIdentifier()!!) + ".kt",
                top + importText + "\n\n\n" + processTypeAlias(it)
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

        return listOf(defaultFile) + annotationDefFile + typeAliasFile + classFiles
    }

    override fun transpileFile(fdFileContext: FoldingParser.FileContext): String {
        val namespace = fdFileContext.findNamespace()?.let { "package " + it.findPackage_()!!.text } ?: ""
        currentPackage = fdFileContext.findNamespace()?.findPackage_()?.text
        val imports = fdFileContext.findImportEx()
            .flatMap { processImportEx(it).split("\n") }
            .distinct().joinToString("\n")
        val allAnnotationDef = fdFileContext.findAnnotationDef().joinToString("\n") { processAnnotationDef(it) }
        val allTypeAlias = fdFileContext.findTypeAlias().joinToString("\n") { processTypeAlias(it) }
        val fileBody = fdFileContext.findFileCompo().joinToString("\n\n") { processFileCompo(it) }
        return listOf(namespace,imports,allTypeAlias,allAnnotationDef,fileBody).filter { it != "" }.joinToString("\n\n\n")
    }
    override fun processImportEx(fdImportExContext: FoldingParser.ImportExContext): String {
        val pkg = fdImportExContext.findPackage_()!!.text
        val importNestId = fdImportExContext.findImportNest()?.let {
            if (it.EM() != null) ""
            else "." + it.ID()!!.text
        }
        return fdImportExContext.findImportBody()?.findImportCompo()?.joinToString("\n") { compo ->
            when {
                compo.CLASS() == null ->
                    "import $pkg${importNestId ?: ""}.${processId(compo.findCommonIdentifier()!!)}" +
                            (compo.findImportDefAlias()?.let { " as ${processId(it.findCommonIdentifier()!!)}" } ?: "")
                compo.CLASS() != null ->
                    "import $pkg${importNestId ?: ""}.${processCommonClassId(compo.findCommonClassIdentifier()!!)}" +
                            (compo.findImportClassAlias()?.let { " as ${processCommonClassId(it.findCommonClassIdentifier()!!)}" } ?: "")
                else -> throw InvalidCode("import",compo)
            }
        } ?: ((importNestId?.let { "import $pkg$it.*\n" } ?: "") + "import $pkg.*")
    }
    override fun processFileCompo(fdFileCompoContext: FoldingParser.FileCompoContext): String = when {
        fdFileCompoContext.findDefinition() != null -> processDefinition(fdFileCompoContext.findDefinition()!!)
        fdFileCompoContext.findField() != null -> processField(fdFileCompoContext.findField()!!)
        else -> throw InvalidCode("fileCompo",fdFileCompoContext)
    }
    override fun processDefinition(fdDefinitionContext: FoldingParser.DefinitionContext): String = when {
        fdDefinitionContext.findDef() != null -> processDef(fdDefinitionContext.findDef()!!)
        fdDefinitionContext.findClass_() != null -> processClass(fdDefinitionContext.findClass_()!!)
        else -> throw InvalidCode("definition",fdDefinitionContext)
    }
    override fun processDef(fdDefContext: FoldingParser.DefContext): String = transpileDef(fdDefContext)
    override fun processClass(fdClass_Context: FoldingParser.Class_Context): String = transpileClass(fdClass_Context)
    override fun processAnnotationDef(fdAnnotationDefContext: FoldingParser.AnnotationDefContext): String =
        "annotation class ${fdAnnotationDefContext.ID()!!.text} ${processParameter(fdAnnotationDefContext.findParameter()!!)}"

    override fun processTypeAlias(fdTypeAliasContext: FoldingParser.TypeAliasContext): String =
        "typealias " + processCommonClassId(fdTypeAliasContext.findCommonClassIdentifier()!!) +
                (fdTypeAliasContext.findTypeParam()?.let { processTypeParam(it).first } ?: "") +
                " = " + when {
            fdTypeAliasContext.findTypeEx() != null ->
                processTypeEx(fdTypeAliasContext.findTypeEx()!!)
            fdTypeAliasContext.findForeignBody() != null -> {
                val foreignBody = fdTypeAliasContext.findForeignBody()!!
                if (foreignBody.RawString() != null) foreignBody.RawString()!!.text.removeSurrounding("`")
                else foreignBody.findForeignElement()
                    .find { it.findForeignPlatform()!!.ID()!!.text == "kotlin" }
                    ?.RawString()?.text?.removeSurrounding("`")
                    ?: (
                            (getCurrentTranspilingPackage()?.let { "$it." } ?: "") +
                                    "implfd.kotlin." + processCommonClassId(fdTypeAliasContext.findCommonClassIdentifier()!!) +
                                    (fdTypeAliasContext.findTypeParam()?.let { processTypeParam(it).first } ?: "")
                            )

            }

            else -> (getCurrentTranspilingPackage()?.let { "$it." } ?: "") +
                    "implfd.kotlin." + processCommonClassId(fdTypeAliasContext.findCommonClassIdentifier()!!) +
                    (fdTypeAliasContext.findTypeParam()?.let { processTypeParam(it).first } ?: "")
        }
}
