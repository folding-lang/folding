package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightClassTranspiler
import foldingx.lighttranspiler.exception.InvalidCode
import foldingx.lighttranspiler.kotlin.effect.EffectKt
import foldingx.lighttranspiler.util.extractParamDestruction
import foldingx.parser.FoldingParser
import foldingx.parser.classes.ClassCategory
import foldingx.parser.classes.CommonClass
import foldingx.parser.classes.processClassContext
import foldingx.parser.func.CommonJustDef
import foldingx.parser.identifier.processCommonClassId
import foldingx.parser.identifier.processId

interface LightClassTranspilerKt : LightClassTranspiler<EffectKt>, LightDefTranspilerKt {
    override fun transpileClass(fdClass_Context: FoldingParser.Class_Context, effect: EffectKt): String = when(fdClass_Context) {
        is FoldingParser.JustClassContext -> processJustClass(fdClass_Context,effect)
        is FoldingParser.JustAbstractClassContext -> processJustAbstractClass(fdClass_Context,effect)
        is FoldingParser.JustInterfaceContext -> processJustInterface(fdClass_Context,effect)
        else -> throw InvalidCode("class",fdClass_Context)
    }

    override fun processCommonClass(fdCommonClass: CommonClass, effect: EffectKt): String {
        val (tHead,tTail) = fdCommonClass.typeParam?.let { processTypeParam(it,effect).let { (h,t) ->
            h to (t ?: "")
        } } ?: ("" to "")

        val (constructor,constructorC) = fdCommonClass.constructorSelf?.findParameter()?.let { p ->
            processConstructorParameter(p,effect) to processParamDestruction(extractParamDestruction(p.findParamEx()),effect)
        } ?: ((if (fdCommonClass.category.canHasConstructorSelf) "()" else "") to null)
        val initialize = fdCommonClass.constructorSelf?.findDoBlock()?.let {
            "\ninit " + processDoBlock(it,effect).removeSuffix("()")
        } ?: ""

        val (inheritsText,compoListText) = fdCommonClass.run {
            makeClassPrimaryBody(
                getClassTranspilerKt(),
                fieldList, defList, inheritContext, implList, defInInterfaceList, fieldInInterfaceList, effect=effect
            )
        }

        val headKeyword = when(fdCommonClass.category) {
            ClassCategory.DATA_CLASS -> "class"
            ClassCategory.ABSTRACT_CLASS -> "interface"
            ClassCategory.ABSTRACT_DATA_CLASS -> "abstract class"
        }

        val annotation = fdCommonClass.annotationBlockContext
            ?.let { processAnnotationBlock(it,this,effect) + "\n" } ?: ""

        val primaryHead = "open $headKeyword ${processCommonClassId(fdCommonClass.identifier)}$tHead$constructor$inheritsText $tTail"
        val primaryBody = "{${(constructorC?.let { "\n$it\n" } ?: "")}$compoListText\n$initialize".insertMargin(4)+"\n}"

        val inverseFunctionText = if (
            fdCommonClass.category == ClassCategory.DATA_CLASS &&
            fdCommonClass.identifier.QUOTE().isEmpty()
            ) {
            fdCommonClass.constructorSelf!!.findParameter()?.let {
                makeClassInverse(
                    fdCommonClass.identifier.ID()!!.text,
                    it,
                    fdCommonClass.typeParam,
                    effect
                )
            }
        } else null

        val constructFunctionText = if (
            fdCommonClass.category == ClassCategory.DATA_CLASS &&
            fdCommonClass.identifier.QUOTE().isEmpty()
            ) {
            makeConstructFunction(
                fdCommonClass.identifier.ID()!!.text,
                fdCommonClass.constructorSelf!!.findParameter(),
                fdCommonClass.typeParam,
                effect
            ) + "\n"
        } else ""

        return annotation + primaryHead + primaryBody + "\n" + constructFunctionText + (inverseFunctionText ?: "")
    }

    override fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext, effect: EffectKt): String {
        return processCommonClass(processClassContext(fdJustClassContext),effect)
    }
    override fun processJustAbstractClass(fdJustAbstractClassContext: FoldingParser.JustAbstractClassContext, effect: EffectKt): String {
        return processCommonClass(processClassContext(fdJustAbstractClassContext),effect)
    }
    override fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext, effect: EffectKt): String {
        return processCommonClass(processClassContext(fdJustInterfaceContext),effect)
    }

    fun makeConstructFunction(
        classId: String, parameter: FoldingParser.ParameterContext?,
        typeParamContext: FoldingParser.TypeParamContext?
    , effect: EffectKt): String {
        val (tHead,tTail) = typeParamContext?.let { processTypeParam(it,effect).let { (h,t) ->
            h to t?.let { "$t " }
        } } ?: (null to "")
        val param = parameter?.let { p ->
            processParameter(p,effect)
        } ?: "()"
        val primaryHead = "/** folding class constructor function */\n" +
                "fun${tHead?.let { " $it " } ?: " "}${classId}$param: ${classId}Class${tHead ?: ""} " +
                (tTail ?: "")
        val primaryBody = ("{\n"+
                "return ${classId}Class${tHead ?: ""}("+(parameter?.findParamEx()?.joinToString { it.ID()!!.text } ?: "")+")").insertMargin(4) + "\n}"

        return primaryHead + primaryBody
    }

    @Deprecated("legacy")
    fun makeFactoryFunction(
        classId: String,
        typeParamContext: FoldingParser.TypeParamContext?,
        effect: EffectKt
    ): String {
        val (tHead,tTail) = typeParamContext?.let { processTypeParam(it,effect).let { (h,t) ->
            h to t?.let { "$t " }
        } } ?: (null to "")
        val primaryHead = "/** folding class constructor function */\n" +
                "fun${tHead?.let { " $it " } ?: " "}${classId}(): ${classId}Class${tHead ?: ""} " +
                (tTail ?: "")
        val primaryBody = ("{\n"+
                "return (object : ${classId}${tHead ?: ""} {})").insertMargin(4) + "\n}"

        return primaryHead + primaryBody
    }

    fun makeClassInverse(
        classId: String, parameter: FoldingParser.ParameterContext,
        typeParamContext: FoldingParser.TypeParamContext?,
        effect: EffectKt
    ): String {
        val idHead = "${classId}_inverse"
        val idTail =  (0 until parameter.findParamEx().count()).joinToString("_","_")
        val id = idHead + idTail

        val (tHead,tTail) = typeParamContext?.let { processTypeParam(it,effect).let { (h,t) ->
            h to t
        } } ?: (null to "")

        val outputList = parameter.findParamEx().map { "instance.${it.ID()!!.text}" to it.findTypeEx() }
        val outputHead = "folding.FdTuple${outputList.count()}Class<"+
                outputList.joinToString(",") { (_,t) -> t?.let { processTypeEx(it,effect) } ?: "_" } +">"
        val output = outputList.joinToString(",","$outputHead(",")") { it.first }

        val primaryInput = "instance: ${classId}Class${tHead ?: ""}"

        val primaryHead = "fun${tHead?.let { " $it " } ?: " "}$id($primaryInput): $outputHead " +
                (tTail ?: "")
        val primaryBody = ("{\nreturn $output").insertMargin(4) + "\n}"

        return primaryHead + primaryBody
    }

    fun processConstructorParameter(fdParameterContext: FoldingParser.ParameterContext, effect: EffectKt) =
        fdParameterContext.findParamEx().mapIndexed { i, it ->
            (if (it.ELLIPSIS() == null) "val " else "vararg val ") + makeIndexedParamId(i,it.ID()?.text) + ": " + processTypeEx(it.findTypeEx()!!, effect)
        }.joinToString(", ","(",")")

    override fun processDefInInterface(fdDefInInterfaceContext: FoldingParser.DefInInterfaceContext, effect: EffectKt): String {
        val fdCommonJustDef = CommonJustDef(
            fdDefInInterfaceContext.findAnnotationBlock(),
            processId(fdDefInInterfaceContext.findCommonIdentifier()!!),
            fdDefInInterfaceContext.findTypeParam(),
            fdDefInInterfaceContext.findParameter(),
            fdDefInInterfaceContext.findTypeEx(),
            null
        )
        val (tHead, tTail) = fdCommonJustDef.typeParamContext?.let {
            processTypeParam(it,effect).let { (h, t) ->
                " $h " to t
            }
        } ?: (" " to "")
        val param = fdCommonJustDef.parameterContext?.let { p -> processParameter(p,effect) } ?: "()"

        return "abstract fun$tHead${fdCommonJustDef.id}$param: ${processTypeEx(fdCommonJustDef.typeExContext!!,effect)} " +
                (tTail ?: "")
    }

    override fun processField(fdFieldContext: FoldingParser.FieldContext, effect: EffectKt): String = when {
        fdFieldContext.findFieldNotInit() != null -> if (fdFieldContext.findFieldNotInit()!!.findTypeEx()!!.QM() == null)
            fdFieldContext.findFieldNotInit()!!.let {
                if (it.MUTABLE() != null) """
                   |/** not initiated variable */
                   |private var ${it.ID()!!.text}_field: ${processTypeEx(it.findTypeEx()!!,effect)}? = null
                   |var ${it.ID()!!.text}: ${processTypeEx(it.findTypeEx()!!,effect)}
                   |    get() = ${it.ID()!!.text}_field ?: throw RuntimeException("The field '${it.ID()!!.text}' has not been initialized")
                   |    set(value) { ${it.ID()!!.text}_field = value }""".trimMargin()
                else """
                   |/** not initiated variance */
                   |private var ${it.ID()!!.text}_field: ${processTypeEx(it.findTypeEx()!!,effect)}? = null
                   |var ${it.ID()!!.text}: ${processTypeEx(it.findTypeEx()!!,effect)}
                   |    get() = ${it.ID()!!.text}_field ?: throw RuntimeException("The field '${it.ID()!!.text}' has not been initialized")
                   |    set(value) {
                   |        if (${it.ID()!!.text}_field != null) ${it.ID()!!.text}_field = value
                   |        else throw RuntimeException("The field '${it.ID()!!.text}' was already initialized")
                   |    }""".trimMargin()
            } else throw InvalidCode("field type",fdFieldContext.findFieldNotInit(),
            "not initialized field type must be non-nullable"
            )
        fdFieldContext.findFieldSetted() != null -> fdFieldContext.findFieldSetted()!!.let {
            val keyword = if (it.MUTABLE() != null) "var" else "val"
            "$keyword ${it.ID()!!.text} ${it.findTypeEx()?.let { t -> ": " + processTypeEx(t,effect) } ?: ""} = ${processValue(it.findValue()!!,effect)}"
        }
        fdFieldContext.findForeignField() != null -> fdFieldContext.findForeignField()!!.let {
            val keyword = it.settingValue?.let { "var" } ?: "val"
            val head = "$keyword ${it.ID(0).text}: ${processTypeEx(it.findTypeEx()!!,effect)}"
            val getting =
                if (it.gettingValue != null) "\nget() = (${processValue(it.gettingValue!!,effect)})"
                else "\nget() { throw RuntimeException(\"Getter of the field '${it.ID(0).text}' is not defined\") }"
            val setting = if (it.settingValue != null) "\nset(${it.inputID!!.text}) {${processValue(it.settingValue!!,effect)}}" else ""
            (head + getting + setting).insertMargin(4)
        }
        else -> throw InvalidCode("field",fdFieldContext)
    }


    override fun getClassTranspilerKt(): LightClassTranspilerKt = this
}