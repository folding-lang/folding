package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightClassTranspiler
import foldingx.lighttranspiler.exception.invalidCode
import foldingx.parser.FoldingParser
import foldingx.parser.func.CommonJustDef
import foldingx.parser.identifier.processId

interface LightClassTranspilerKt : LightClassTranspiler, LightDefTranspilerKt {
    override fun transpileClass(fdClass_Context: FoldingParser.Class_Context): String = when(fdClass_Context) {
        is FoldingParser.JustClassContext -> processJustClass(fdClass_Context)
        is FoldingParser.JustMultiClassContext -> processJustMultiClass(fdClass_Context)
        is FoldingParser.JustAbstractClassContext -> processJustAbstractClass(fdClass_Context)
        is FoldingParser.JustInterfaceContext -> processJustInterface(fdClass_Context)
        else -> throw invalidCode("class",fdClass_Context)
    }

    override fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext): String {
        val (tHead,tTail) = fdJustClassContext.findTypeParam()?.let { processTypeParam(it).let { (h,t) ->
            " $h " to t
        } } ?: ("" to "")

        val constructor = fdJustClassContext.findConstructorSelf()!!.findParameter()?.let { processConstructorParameter(it) } ?: "()"
        val initialize = fdJustClassContext.findConstructorSelf()!!.findDoBlock()?.let {
            "\ninit " + processDoBlock(it).removeSuffix("()") + "\n"
        }?.insertMargin(4) ?: ""

        val interfaceList = fdJustClassContext.findImpl().map { processTypeEx(it.findTypeEx()!!) }
        val inherits = fdJustClassContext.findInherit()?.findImpl()?.findTypeEx()?.let { processTypeEx(it) }?.let {
            listOf(it) + interfaceList
        } ?: interfaceList
        val inheritsText = inherits.takeIf { it.isNotEmpty() }?.joinToString(", "," : ") ?: ""

        val fieldList = fdJustClassContext.findField().map { processField(it) }

        val implList = (listOf(fdJustClassContext.findInherit()?.findImpl()) + fdJustClassContext.findImpl())
            .mapNotNull { it?.findImplBody()?.findDef() }.flatten().map { transpileDef(it) }
        val vanillaDefList = fdJustClassContext.findDef().map { transpileDef(it) }
        val compoListText = (fieldList + vanillaDefList + implList).joinToString("\n\n","\n").insertMargin(4)

        val primaryHead = "open class ${fdJustClassContext.ID()!!.text}$tHead$constructor$inheritsText $tTail"
        val primaryBody = "{$initialize$compoListText\n}"

        val inverseFunctionText = fdJustClassContext.findConstructorSelf()!!.findParameter()?.let {
            makeClassInverse(fdJustClassContext.ID()!!.text, it, fdJustClassContext.findTypeParam())
        }

        return primaryHead + primaryBody + "\n" + inverseFunctionText
    }
    override fun processJustMultiClass(fdJustMultiClassContext: FoldingParser.JustMultiClassContext): String
    override fun processJustAbstractClass(fdJustAbstractClassContext: FoldingParser.JustAbstractClassContext): String {
        val (tHead,tTail) = fdJustAbstractClassContext.findTypeParam()?.let { processTypeParam(it).let { (h,t) ->
            " $h " to t
        } } ?: ("" to "")

        val constructor = fdJustAbstractClassContext.findConstructorSelf()?.let { c ->
            c.findParameter()?.let { processConstructorParameter(it) } ?: "()"
        } ?: ""
        val initialize = fdJustAbstractClassContext.findConstructorSelf()?.findDoBlock()?.let {
            "\ninit " + processDoBlock(it).removeSuffix("()") + "\n"
        }?.insertMargin(4) ?: ""

        val interfaceList = fdJustAbstractClassContext.findImpl().map { processTypeEx(it.findTypeEx()!!) }
        val inherits = fdJustAbstractClassContext.findInherit()?.findImpl()?.findTypeEx()?.let { processTypeEx(it) }?.let {
            listOf(it) + interfaceList
        } ?: interfaceList
        val inheritsText = inherits.takeIf { it.isNotEmpty() }?.joinToString(", "," : ") ?: ""

        val fieldList = fdJustAbstractClassContext.findField().map { processField(it) }

        val implList = (listOf(fdJustAbstractClassContext.findInherit()?.findImpl()) + fdJustAbstractClassContext.findImpl())
            .mapNotNull { it?.findImplBody()?.findDef() }.flatten().map { transpileDef(it) }
        val vanillaDefList = fdJustAbstractClassContext.findDef().map { transpileDef(it) }
        val defInInterfaceList = fdJustAbstractClassContext.findDefInInterface().map { processDefInInterface(it) }
        val compoListText = (fieldList + defInInterfaceList + vanillaDefList + implList)
            .joinToString("\n\n","\n").insertMargin(4)

        val primaryHead = "abstract class ${fdJustAbstractClassContext.ID()!!.text}$tHead$constructor$inheritsText $tTail"
        val primaryBody = "{$initialize$compoListText\n}"

        val inverseFunctionText = fdJustAbstractClassContext.findConstructorSelf()?.findParameter()?.let {
            makeClassInverse(fdJustAbstractClassContext.ID()!!.text, it, fdJustAbstractClassContext.findTypeParam())
        }

        return primaryHead + primaryBody + (inverseFunctionText?.let { "\n" + it } ?: "")
    }
    override fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext): String {
        val (tHead,tTail) = fdJustInterfaceContext.findTypeParam()?.let { processTypeParam(it).let { (h,t) ->
            " $h " to t
        } } ?: ("" to "")

        val interfaceList = fdJustInterfaceContext.findImpl().map { processTypeEx(it.findTypeEx()!!) }
        val inheritsText = interfaceList.takeIf { it.isNotEmpty() }?.joinToString(", "," : ") ?: ""

        val implList = fdJustInterfaceContext.findImpl()
            .mapNotNull { it.findImplBody()?.findDef() }.flatten().map { transpileDef(it) }
        val vanillaDefList = fdJustInterfaceContext.findDef().map { transpileDef(it) }
        val defInInterfaceList = fdJustInterfaceContext.findDefInInterface().map { processDefInInterface(it) }
        val compoListText = (defInInterfaceList + vanillaDefList + implList).joinToString("\n\n","\n").insertMargin(4)

        val primaryHead = "interface ${fdJustInterfaceContext.ID()!!.text}$tHead$inheritsText $tTail"
        val primaryBody = "{$compoListText\n}"

        return primaryHead + primaryBody
    }

    fun makeClassInverse(
        classId: String, parameter: FoldingParser.ParameterContext,
        typeParamContext: FoldingParser.TypeParamContext?
    ): String {
        val idHead = "${classId}_inverse"
        val idTail =  (0..parameter.findParamEx().count()).joinToString("_","_")
        val id = idHead + idTail

        val (tHead,tTail) = typeParamContext?.let { processTypeParam(it).let { (h,t) ->
            h to t
        } } ?: (null to "")

        val outputList = parameter.findParamEx().map { "instance.${it.ID()!!.text}" to it.findTypeEx() }
        val outputHead = "FdTuple${outputList.count()}<"+
                outputList.joinToString(",") { (_,t) -> t?.let { processTypeEx(it) } ?: "_" } +">"
        val output = outputList.joinToString(",","$outputHead(",")") { it.first }

        val primaryInput = "instance: $classId${tHead ?: ""}"

        val primaryHead = "fun${tHead?.let { " $it " } ?: " "}$id($primaryInput): $outputHead " +
                (tTail ?: "")
        val primaryBody = ("{\nreturn $output").insertMargin(4) + "\n}"

        return primaryHead + primaryBody
    }

    fun processConstructorParameter(fdParameterContext: FoldingParser.ParameterContext) = when {
        fdParameterContext.findParameterFromValue() == null ->
            fdParameterContext.findParamEx().joinToString(", ","(",")") {
                (if (it.ELLIPSIS() == null) "val " else "vararg val ") + it.ID()!!.text + ": " + processTypeEx(it.findTypeEx()!!)
            }
        else -> fdParameterContext.findParameterFromValue()!!.findParamCEx().mapIndexed { index, paramCExContext ->
            "r$index" + ": " + processTypeEx(paramCExContext.findTypeEx()!!)
        }.joinToString(", ","(",")")
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

        return "fun$tHead${fdCommonJustDef.id}$param: ${processTypeEx(fdCommonJustDef.typeExContext!!)} " +
                (tTail ?: "")
    }

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
}