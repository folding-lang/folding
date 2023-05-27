package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightClassTranspiler
import foldingx.lighttranspiler.exception.InvalidCode
import foldingx.parser.FoldingParser
import foldingx.parser.func.CommonJustDef
import foldingx.parser.identifier.processCommonClassId
import foldingx.parser.identifier.processId

interface LightClassTranspilerKt : LightClassTranspiler, LightDefTranspilerKt {
    override fun transpileClass(fdClass_Context: FoldingParser.Class_Context): String = when(fdClass_Context) {
        is FoldingParser.JustClassContext -> processJustClass(fdClass_Context)
        is FoldingParser.JustAbstractClassContext -> processJustAbstractClass(fdClass_Context)
        is FoldingParser.JustInterfaceContext -> processJustInterface(fdClass_Context)
        else -> throw InvalidCode("class",fdClass_Context)
    }

    override fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext): String {
        val (tHead,tTail) = fdJustClassContext.findTypeParam()?.let { processTypeParam(it).let { (h,t) ->
            h to (t ?: "")
        } } ?: ("" to "")

        val constructor = fdJustClassContext.findConstructorSelf()!!.findParameter()?.let { processConstructorParameter(it) } ?: "()"
        val initialize = fdJustClassContext.findConstructorSelf()!!.findDoBlock()?.let {
            "\ninit " + processDoBlock(it).removeSuffix("()")
        } ?: ""

        val (inheritsText,compoListText) = fdJustClassContext.run {
            makeClassPrimaryBody(getClassTranspilerKt(),findField(),findDef(),findInherit(),findImpl(),listOf())
        }

        val primaryHead = "open class ${processCommonClassId(fdJustClassContext.findCommonClassIdentifier()!!)}$tHead$constructor$inheritsText $tTail"
        val primaryBody = "{$compoListText\n$initialize".insertMargin(4)+"\n}"

        val inverseFunctionText = fdJustClassContext.findConstructorSelf()!!.findParameter()?.let {
            makeClassInverse(processCommonClassId(fdJustClassContext.findCommonClassIdentifier()!!), it, fdJustClassContext.findTypeParam())
        }

        val constructFunctionText = makeConstructFunction(
            processCommonClassId(fdJustClassContext.findCommonClassIdentifier()!!), fdJustClassContext.findConstructorSelf()!!.findParameter(),
            fdJustClassContext.findTypeParam()
        )

        val annotation = fdJustClassContext.findAnnotationBlock()
            ?.let { processAnnotationBlock(it,this) + "\n" } ?: ""

        return annotation + primaryHead + primaryBody + "\n" + constructFunctionText + "\n" + (inverseFunctionText ?: "")
    }
    override fun processJustAbstractClass(fdJustAbstractClassContext: FoldingParser.JustAbstractClassContext): String {
        val (tHead,tTail) = fdJustAbstractClassContext.findTypeParam()?.let { processTypeParam(it).let { (h,t) ->
            h to (t ?: "")
        } } ?: ("" to "")

        val constructor = fdJustAbstractClassContext.findConstructorSelf()?.let { c ->
            c.findParameter()?.let { processConstructorParameter(it) } ?: "()"
        } ?: ""
        val initialize = fdJustAbstractClassContext.findConstructorSelf()?.findDoBlock()?.let {
            "\ninit " + processDoBlock(it).removeSuffix("()")
        } ?: ""

        val (inheritsText,compoListText) = fdJustAbstractClassContext.run {
            makeClassPrimaryBody(getClassTranspilerKt(),findField(),findDef(),findInherit(),findImpl(),findDefInInterface())
        }

        val primaryHead = "abstract class ${processCommonClassId(fdJustAbstractClassContext.findCommonClassIdentifier()!!)}$tHead$constructor$inheritsText $tTail"
        val primaryBody = "{$compoListText\n$initialize".insertMargin(4)+"\n}"

        val inverseFunctionText = fdJustAbstractClassContext.findConstructorSelf()?.findParameter()?.let {
            makeClassInverse(processCommonClassId(fdJustAbstractClassContext.findCommonClassIdentifier()!!), it, fdJustAbstractClassContext.findTypeParam())
        }

        val annotation = fdJustAbstractClassContext.findAnnotationBlock()
            ?.let { processAnnotationBlock(it,this) + "\n" } ?: ""

        return annotation + primaryHead + primaryBody + (inverseFunctionText?.let { "\n" + it } ?: "")
    }
    override fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext): String {
        val (tHead,tTail) = fdJustInterfaceContext.findTypeParam()?.let { processTypeParam(it).let { (h,t) ->
            " $h " to (t ?: "")
        } } ?: ("" to "")

        val (inheritsText,compoListText) = fdJustInterfaceContext.run {
            makeClassPrimaryBody(getClassTranspilerKt(),listOf(),findDef(),null,findImpl(),findDefInInterface(),findFieldInInterface())
        }

        val primaryHead = "interface ${processCommonClassId(fdJustInterfaceContext.findCommonClassIdentifier()!!)}$tHead$inheritsText $tTail"
        val primaryBody = "{$compoListText".insertMargin(4)+"\n}"

        val factoryFunction = if (
            fdJustInterfaceContext.findDefInInterface().isEmpty()
            && fdJustInterfaceContext.ABSTRACT() == null
            )
            makeFactoryFunction(
                processCommonClassId(fdJustInterfaceContext.findCommonClassIdentifier()!!),
                fdJustInterfaceContext.findTypeParam()
            )
        else null

        val annotation = fdJustInterfaceContext.findAnnotationBlock()
            ?.let { processAnnotationBlock(it,this) + "\n" } ?: ""

        return annotation + primaryHead + primaryBody + (factoryFunction?.let { "\n"+it } ?: "")
    }

    fun makeConstructFunction(
        classId: String, parameter: FoldingParser.ParameterContext?,
        typeParamContext: FoldingParser.TypeParamContext?
    ): String {
        val (tHead,tTail) = typeParamContext?.let { processTypeParam(it).let { (h,t) ->
            h to t?.let { "$t " }
        } } ?: (null to "")
        val (param,paramC) = parameter?.let { p ->
            processParameter(p) to p.findParameterFromValue()?.let { processParameterFromValue(it) }
        } ?: ("()" to null)
        val primaryHead = "/** folding class constructor function */\n" +
                "fun${tHead?.let { " $it " } ?: " "}${classId}$param: ${classId}${tHead ?: ""} " +
                (tTail ?: "")
        val primaryBody = ("{\n"+(paramC?.let { "$it\n" } ?: "")+
                "return ${classId}${tHead ?: ""}("+(parameter?.findParamEx()?.joinToString { it.ID()!!.text } ?: "")+")").insertMargin(4) + "\n}"

        return primaryHead + primaryBody
    }

    fun makeFactoryFunction(
        classId: String,
        typeParamContext: FoldingParser.TypeParamContext?
    ): String {
        val (tHead,tTail) = typeParamContext?.let { processTypeParam(it).let { (h,t) ->
            h to t?.let { "$t " }
        } } ?: (null to "")
        val primaryHead = "/** folding class constructor function */\n" +
                "fun${tHead?.let { " $it " } ?: " "}${classId}(): ${classId}${tHead ?: ""} " +
                (tTail ?: "")
        val primaryBody = ("{\n"+
                "return (object : ${classId}${tHead ?: ""} {})").insertMargin(4) + "\n}"

        return primaryHead + primaryBody
    }

    fun makeClassInverse(
        classId: String, parameter: FoldingParser.ParameterContext,
        typeParamContext: FoldingParser.TypeParamContext?
    ): String {
        val idHead = "${classId}_inverse"
        val idTail =  (0 until parameter.findParamEx().count()).joinToString("_","_")
        val id = idHead + idTail

        val (tHead,tTail) = typeParamContext?.let { processTypeParam(it).let { (h,t) ->
            h to t
        } } ?: (null to "")

        val outputList = parameter.findParamEx().map { "instance.${it.ID()!!.text}" to it.findTypeEx() }
        val outputHead = "folding.FdTuple${outputList.count()}<"+
                outputList.joinToString(",") { (_,t) -> t?.let { processTypeEx(it) } ?: "_" } +">"
        val output = outputList.joinToString(",","$outputHead(",")") { it.first }

        val primaryInput = "instance: ${classId}${tHead ?: ""}"

        val primaryHead = "fun${tHead?.let { " $it " } ?: " "}$id($primaryInput): $outputHead " +
                (tTail ?: "")
        val primaryBody = ("{\nreturn $output").insertMargin(4) + "\n}"

        return primaryHead + primaryBody
    }

    fun processConstructorParameter(fdParameterContext: FoldingParser.ParameterContext) =
        fdParameterContext.findParamEx().joinToString(", ","(",")") {
            (if (it.ELLIPSIS() == null) "val " else "vararg val ") + it.ID()!!.text + ": " + processTypeEx(it.findTypeEx()!!)
        }

    override fun processDefInInterface(fdDefInInterfaceContext: FoldingParser.DefInInterfaceContext): String {
        val fdCommonJustDef = CommonJustDef(
            fdDefInInterfaceContext.findAnnotationBlock(),
            processId(fdDefInInterfaceContext.findCommonIdentifier()!!),
            fdDefInInterfaceContext.findTypeParam(),
            fdDefInInterfaceContext.findParameter(),
            fdDefInInterfaceContext.findTypeEx(),
            null
        )
        val (tHead, tTail) = fdCommonJustDef.typeParamContext?.let {
            processTypeParam(it).let { (h, t) ->
                " $h " to t
            }
        } ?: (" " to "")
        val param = fdCommonJustDef.parameterContext?.let { p -> processParameter(p) } ?: "()"

        return "abstract fun$tHead${fdCommonJustDef.id}$param: ${processTypeEx(fdCommonJustDef.typeExContext!!)} " +
                (tTail ?: "")
    }

    override fun processField(fdFieldContext: FoldingParser.FieldContext): String = when {
        fdFieldContext.findFieldNotInit() != null -> if (fdFieldContext.findFieldNotInit()!!.findTypeEx()!!.QM() == null)
            fdFieldContext.findFieldNotInit()!!.let {
                if (it.MUTABLE() != null) """
                   |/** not initiated variable */
                   |private var ${it.ID()!!.text}_field: ${processTypeEx(it.findTypeEx()!!)}? = null
                   |var ${it.ID()!!.text}: ${processTypeEx(it.findTypeEx()!!)}
                   |    get() = ${it.ID()!!.text}_field ?: throw RuntimeException("The field '${it.ID()!!.text}' has not been initialized")
                   |    set(value) { ${it.ID()!!.text}_field = value }""".trimMargin()
                else """
                   |/** not initiated variance */
                   |private var ${it.ID()!!.text}_field: ${processTypeEx(it.findTypeEx()!!)}? = null
                   |var ${it.ID()!!.text}: ${processTypeEx(it.findTypeEx()!!)}
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
            "$keyword ${it.ID()!!.text} ${it.findTypeEx()?.let { t -> ": " + processTypeEx(t) } ?: ""} = ${processValue(it.findValue()!!)}"
        }
        fdFieldContext.findForeignField() != null -> fdFieldContext.findForeignField()!!.let {
            val keyword = it.settingValue?.let { "var" } ?: "val"
            val head = "$keyword ${it.ID(0).text}: ${processTypeEx(it.findTypeEx()!!)}"
            val getting =
                if (it.gettingValue != null) "\nget() = (${processValue(it.gettingValue!!)})"
                else "\nget() { throw RuntimeException(\"Getter of the field '${it.ID(0).text}' is not defined\") }"
            val setting = if (it.settingValue != null) "\nset(${it.inputID!!.text}) {${processValue(it.settingValue!!)}}" else ""
            (head + getting + setting).insertMargin(4)
        }
        else -> throw InvalidCode("field",fdFieldContext)
    }


    override fun getClassTranspilerKt(): LightClassTranspilerKt = this
}