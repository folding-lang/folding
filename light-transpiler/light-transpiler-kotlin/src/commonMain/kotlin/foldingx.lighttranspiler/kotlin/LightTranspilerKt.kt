package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.FileWrapper
import foldingx.lighttranspiler.LightTranspiler
import foldingx.lighttranspiler.exception.InvalidCode
import foldingx.lighttranspiler.kotlin.effect.EffectKt
import foldingx.parser.FoldingParser
import foldingx.parser.classes.CommonClass
import foldingx.parser.identifier.processCommonClassId
import foldingx.parser.identifier.processId

interface LightTranspilerKt : LightTranspiler<EffectKt>, LightClassTranspilerKt {
    override fun EffectKt.getCurrentTranspilingPackage(): String? = currentPackage
    override fun EffectKt.registerGeneratedClass(commonClass: CommonClass): Boolean =
        generatedClassRegistry?.add(commonClass) ?: false

    override fun transpilePackage(
        sourcesRoot: String,
        fdFileContextList: List<FoldingParser.FileContext>,
        effect: EffectKt
    ): List<FileWrapper> {
        val namespace = fdFileContextList.first().findNamespace()?.let { it.findPackage_()!!.text }
        effect.currentPackage = namespace
        val generatedClassBasket: MutableList<CommonClass> = mutableListOf()
        effect.generatedClassRegistry = generatedClassBasket
        val packagePath = namespace?.replace(".","/") ?: ""
        val top = namespace?.let { "package $namespace\n\n" } ?: ""

        val importText = fdFileContextList.flatMap {
            it.findImportEx().flatMap { processImportEx(it,effect).split("\n") }
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
            val transpiled = transpileClass(it,effect)
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
            val transpiled = processCommonClass(it,effect)
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
                top + importText + "\n\n\n" + processAnnotationDef(it,effect)
            )
        }

        val typeAliasFile = typeAliasList.map {
            FileWrapper(
                "$sourcesRoot/$packagePath",
                processCommonClassId(it.findCommonClassIdentifier()!!) + ".kt",
                top + importText + "\n\n\n" + processTypeAlias(it,effect)
            )
        }

        val defaultFile = FileWrapper(
            "$sourcesRoot/$packagePath",
            "Default.kt",
            top + importText +
                    globalFieldList.joinToString("\n\n","\n\n\n") { processField(it,effect) } +
                    constructFuncTexts.joinToString("\n\n","\n\n\n") +
                    defList.joinToString("\n\n","\n\n\n") { processDef(it,effect) }
        )

        return listOf(defaultFile) + annotationDefFile + typeAliasFile + classFiles
    }

    override fun transpileFile(fdFileContext: FoldingParser.FileContext, effect: EffectKt): String {
        val namespace = fdFileContext.findNamespace()?.let { "package " + it.findPackage_()!!.text } ?: ""
        effect.currentPackage = fdFileContext.findNamespace()?.findPackage_()?.text
        val imports = fdFileContext.findImportEx()
            .flatMap { processImportEx(it,effect).split("\n") }
            .distinct().joinToString("\n")
        val allAnnotationDef = fdFileContext.findAnnotationDef().joinToString("\n") { processAnnotationDef(it,effect) }
        val allTypeAlias = fdFileContext.findTypeAlias().joinToString("\n") { processTypeAlias(it,effect) }
        val fileBody = fdFileContext.findFileCompo().joinToString("\n\n") { processFileCompo(it,effect) }
        return listOf(namespace,imports,allTypeAlias,allAnnotationDef,fileBody).filter { it != "" }.joinToString("\n\n\n")
    }
    override fun processImportEx(fdImportExContext: FoldingParser.ImportExContext, effect: EffectKt): String {
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
    override fun processFileCompo(fdFileCompoContext: FoldingParser.FileCompoContext, effect: EffectKt): String = when {
        fdFileCompoContext.findDefinition() != null -> processDefinition(fdFileCompoContext.findDefinition()!!,effect)
        fdFileCompoContext.findField() != null -> processField(fdFileCompoContext.findField()!!,effect)
        else -> throw InvalidCode("fileCompo",fdFileCompoContext)
    }
    override fun processDefinition(fdDefinitionContext: FoldingParser.DefinitionContext, effect: EffectKt): String = when {
        fdDefinitionContext.findDef() != null -> processDef(fdDefinitionContext.findDef()!!,effect)
        fdDefinitionContext.findClass_() != null -> processClass(fdDefinitionContext.findClass_()!!,effect)
        else -> throw InvalidCode("definition",fdDefinitionContext)
    }
    override fun processDef(fdDefContext: FoldingParser.DefContext, effect: EffectKt): String = transpileDef(fdDefContext,effect)
    override fun processClass(fdClass_Context: FoldingParser.Class_Context, effect: EffectKt): String = transpileClass(fdClass_Context,effect)
    override fun processAnnotationDef(fdAnnotationDefContext: FoldingParser.AnnotationDefContext, effect: EffectKt): String =
        "annotation class ${fdAnnotationDefContext.ID()!!.text} ${processParameter(fdAnnotationDefContext.findParameter()!!,effect)}"

    override fun processTypeAlias(fdTypeAliasContext: FoldingParser.TypeAliasContext, effect: EffectKt): String =
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
                            (effect.getCurrentTranspilingPackage()?.let { "$it." } ?: "") +
                                    "implfd.kotlin." + processCommonClassId(fdTypeAliasContext.findCommonClassIdentifier()!!) +
                                    (fdTypeAliasContext.findTypeParam()?.let { processTypeParam(it).first } ?: "")
                            )

            }

            else -> (effect.getCurrentTranspilingPackage()?.let { "$it." } ?: "") +
                    "implfd.kotlin." + processCommonClassId(fdTypeAliasContext.findCommonClassIdentifier()!!) +
                    (fdTypeAliasContext.findTypeParam()?.let { processTypeParam(it).first } ?: "")
        }
}
