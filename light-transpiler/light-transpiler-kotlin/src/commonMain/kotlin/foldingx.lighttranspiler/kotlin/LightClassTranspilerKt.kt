package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightClassTranspiler
import foldingx.parser.FoldingParser
import foldingx.parser.func.CommonJustDef
import foldingx.parser.identifier.processId

interface LightClassTranspilerKt : LightClassTranspiler, LightDefTranspilerKt {
    override fun transpileClass(fdClass_Context: FoldingParser.Class_Context): String = when(fdClass_Context) {
        is FoldingParser.JustClassContext -> processJustClass(fdClass_Context)
        is FoldingParser.JustMultiClassContext -> processJustMultiClass(fdClass_Context)
        is FoldingParser.JustInterfaceContext -> processJustInterface(fdClass_Context)
        else -> throw RuntimeException("Invalid class '${fdClass_Context.text}'")
    }

    override fun processJustClass(fdJustClassContext: FoldingParser.JustClassContext): String {
        val (tHead,tTail) = fdJustClassContext.findTypeParam()?.let { processTypeParam(it).let { (h,t) ->
            " $h " to t
        } } ?: ("" to "")

        val constructor = fdJustClassContext.findConstructorSelf()!!.findParameter()?.let { processParameter(it) } ?: "()"
        val initialize = fdJustClassContext.findConstructorSelf()!!.findDoBlock()?.let {
            "\ninit " + processDoBlock(it).removeSuffix("()") + "\n"
        }?.insertMargin(4) ?: ""

        val interfaceList = fdJustClassContext.findImpl().map { processTypeEx(it.findTypeEx()!!) }
        val inherits = fdJustClassContext.findInherit()?.findImpl()?.findTypeEx()?.let { processTypeEx(it) }?.let {
            listOf(it) + interfaceList
        } ?: interfaceList
        val inheritsText = inherits.takeIf { it.isNotEmpty() }?.joinToString(", ",": ") ?: ""

        val implList = (listOf(fdJustClassContext.findInherit()?.findImpl()) + fdJustClassContext.findImpl())
            .mapNotNull { it?.findImplBody()?.findDef() }.flatten().map { transpileDef(it) }
        val vanillaDefList = fdJustClassContext.findDef().map { transpileDef(it) }
        val defListText = (vanillaDefList + implList).joinToString("\n\n","\n").insertMargin(4)

        val primaryHead = "class ${fdJustClassContext.ID()!!.text}$tHead$constructor $inheritsText $tTail"
        val primaryBody = "{$initialize$defListText\n}"

        return primaryHead + primaryBody
    }
    override fun processJustMultiClass(fdJustMultiClassContext: FoldingParser.JustMultiClassContext): String
    override fun processJustAbstractClass(fdJustAbstractClassContext: FoldingParser.JustAbstractClassContext): String
    override fun processJustInterface(fdJustInterfaceContext: FoldingParser.JustInterfaceContext): String

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
}