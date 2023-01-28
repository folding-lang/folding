package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightValueTranspiler
import foldingx.lighttranspiler.exception.invalidCode
import foldingx.parser.FoldingParser
import foldingx.parser.identifier.processAopId
import foldingx.parser.identifier.processId
import foldingx.parser.identifier.processOpId
import foldingx.parser.inversing.processInverseValue

interface LightValueTranspilerKt : LightValueTranspiler {
    override fun processValue(fdValueContext: FoldingParser.ValueContext): String = when(fdValueContext) {
        is FoldingParser.JustDefaultValueContext -> processJustDefaultValue(fdValueContext)
        is FoldingParser.ReflectedContext -> processReflected(fdValueContext)
        is FoldingParser.CallFunctionContext -> processCallFunction(fdValueContext)
        is FoldingParser.UseForeignClassContext -> processUseForeignClass(fdValueContext)
        is FoldingParser.GetFieldGlobalContext -> processGetFieldGlobal(fdValueContext)
        is FoldingParser.GetFieldContext -> processGetField(fdValueContext)
        is FoldingParser.CallMethodContext -> processCallMethod(fdValueContext)
        is FoldingParser.ReflectedMethodContext -> processReflectedMethod(fdValueContext)
        is FoldingParser.InvokeValueContext -> processInvokeValue(fdValueContext)
        is FoldingParser.SimpleIfContext -> processSimpleIf(fdValueContext)
        is FoldingParser.TakeNullContext -> processTakeNull(fdValueContext)
        is FoldingParser.IfExpressionContext -> processIfExpression(fdValueContext)
        is FoldingParser.ValueTypeCastingContext -> processValueTypeCasting(fdValueContext)
        is FoldingParser.CallAopFuncContext -> processCallAopFunc(fdValueContext)
        is FoldingParser.CallOpFuncContext -> processCallOpFunc(fdValueContext)
        is FoldingParser.LetExpressionContext -> processLetExpression(fdValueContext)
        is FoldingParser.DoExpressionContext -> processDoExpression(fdValueContext)
        is FoldingParser.JustLambdaContext -> processJustLambda(fdValueContext)
        is FoldingParser.ParenedValueContext -> processParenedValue(fdValueContext)
        is FoldingParser.AnonymousClassObjectContext -> processAnonymousClassObject(fdValueContext)

        else -> throw RuntimeException("Invalid value '${fdValueContext.text}'")
    }

    override fun processJustDefaultValue(fdJustDefaultValueContext: FoldingParser.JustDefaultValueContext): String =
        fdJustDefaultValueContext.text
    override fun processReflected(fdReflectedContext: FoldingParser.ReflectedContext): String =
        "::" + processReference(fdReflectedContext.findReference()!!)
    override fun processCallFunction(fdCallFunctionContext: FoldingParser.CallFunctionContext): String =
        "${processReference(fdCallFunctionContext.findReference()!!)}(" +
                (fdCallFunctionContext.findArgValue()?.let { processArgValue(it) } ?: "") + ")"
    override fun processUseForeignClass(fdUseForeignClassContext: FoldingParser.UseForeignClassContext): String =
        "${processReference(fdUseForeignClassContext.findReference()!!)}(" +
                (fdUseForeignClassContext.findArgValue()?.let { processArgValue(it) } ?: "") + ")"
    override fun processGetFieldGlobal(fdGetFieldGlobalContext: FoldingParser.GetFieldGlobalContext): String =
        processReference(fdGetFieldGlobalContext.findReference()!!)
    override fun processGetField(fdGetFieldContext: FoldingParser.GetFieldContext): String =
        "(${processValue(fdGetFieldContext.findValue()!!)}).${fdGetFieldContext.ID()!!.text}"
    override fun processCallMethod(fdCallMethodContext: FoldingParser.CallMethodContext): String =
        "(${processValue(fdCallMethodContext.findValue()!!)})." + "${fdCallMethodContext.ID()!!.text}(" +
                (fdCallMethodContext.findArgValue()?.let { processArgValue(it) } ?: "") + ")"
    override fun processReflectedMethod(fdReflectedMethodContext: FoldingParser.ReflectedMethodContext): String =
        "(${processValue(fdReflectedMethodContext.findValue()!!)})::${fdReflectedMethodContext.ID()!!.text}"
    override fun processInvokeValue(fdInvokeValueContext: FoldingParser.InvokeValueContext): String =
        "(${processValue(fdInvokeValueContext.findValue()!!)}).invoke(" +
                (fdInvokeValueContext.findInvoking()?.let { processInvoking(it) } ?: "") + ")"
    override fun processSimpleIf(fdSimpleIfContext: FoldingParser.SimpleIfContext): String =
        "(if (${processValue(fdSimpleIfContext.findValue(1)!!)}) (${processValue(fdSimpleIfContext.findValue(0)!!)})" +
                " else null)"
    override fun processTakeNull(fdTakeNullContext: FoldingParser.TakeNullContext): String =
        "((${processValue(fdTakeNullContext.findValue(0)!!)}) ?: (${processValue(fdTakeNullContext.findValue(1)!!)}))"
    override fun processIfExpression(fdIfExpressionContext: FoldingParser.IfExpressionContext): String =
        fdIfExpressionContext.findIf_else()!!.let { ifElse ->
                "(if (" + processValue(ifElse.findValue(0)!!) + ") (" +
                        processValue(ifElse.findValue(1)!!) + ") else (" +
                        processValue(ifElse.findValue(2)!!) + "))"
        }
    override fun processValueTypeCasting(fdValueTypeCastingContext: FoldingParser.ValueTypeCastingContext): String =
        "(${processValue(fdValueTypeCastingContext.findValue()!!)} " +
                "as ${processTypeEx(fdValueTypeCastingContext.findTypeCasting()!!.findTypeEx()!!)})"
    override fun processCallAopFunc(fdCallAopFuncContext: FoldingParser.CallAopFuncContext): String =
        processAopId(fdCallAopFuncContext.findCallingAopId()!!.text) +
                "(${processValue(fdCallAopFuncContext.findValue()!!)})"
    override fun processCallOpFunc(fdCallOpFuncContext: FoldingParser.CallOpFuncContext): String =
        processOpId(fdCallOpFuncContext.findCallingOpId()!!.text) +
                "(${processValue(fdCallOpFuncContext.findValue(0)!!)}," +
                "${processValue(fdCallOpFuncContext.findValue(1)!!)})"
    override fun processDoExpression(fdDoExpressionContext: FoldingParser.DoExpressionContext): String =
        processDoBlock(fdDoExpressionContext.findDoBlock()!!)
    fun processDoBlock(fdDoBlockContext: FoldingParser.DoBlockContext) =
        fdDoBlockContext.findCompo().joinToString("\n","{\n") { when {
            it.findValue() != null -> processValue(it.findValue()!!)
            it.findFieldAssign() != null -> it.findFieldAssign()!!.let { that -> when(that) {
                is FoldingParser.GlobalFieldAssignContext ->
                    "${that.ID()!!.text} = ${processValue(that.findValue()!!)}"
                is FoldingParser.ObjectFieldAssignContext ->
                    "(${processValue(that.findValue(0)!!)})${that.ID()!!.text} = ${processValue(that.findValue(1)!!)}"

                else -> throw RuntimeException("Invalid field assigning '${that.text}'")
            } }
            it.findReturning() != null -> "return " + processValue(it.findReturning()!!.findValue()!!)

            else -> throw invalidCode("do expression",fdDoBlockContext)
        } }.insertMargin(4) + "\n}()"
    override fun processJustLambda(fdJustLambdaContext: FoldingParser.JustLambdaContext): String {
        val lambdaContext = fdJustLambdaContext.findLambda()!!
        val (param,paramC) = lambdaContext.findParameterForLambda()?.let { p ->
            processParameterForLambda(p) to
                    p.findParameterFromValueForLambda()?.let { processParameterFromValueForLambda(it) }
        } ?: ("" to null)
        val primaryHead = "$param ->"
        val primaryBody = ("\n"+(paramC?.let { "$it\n" } ?: "")+
                "("+processValue(lambdaContext.findValue()!!)+")").insertMargin(4) + "\n"

        return "{ ${primaryHead + primaryBody}}"
    }

    override fun processLetExpression(fdLetExpressionContext: FoldingParser.LetExpressionContext): String {
        val (boundPre,bindTarget,value) = fdLetExpressionContext.findLet_binding()!!.findValue()
        val bindTargetReferId = "r" + bindTarget.position.toString().map { it.code.toString(16) }.joinToString("")
        val bounds = processInverse(boundPre,bindTargetReferId).map { (id,inv) -> "val $id = ($inv)" }.joinToString("")
        return "{ $bindTargetReferId -> \n$bounds\n${processValue(value)}".insertMargin(4)+"\n}(${processValue(bindTarget)})"
    }

    override fun processParenedValue(fdParenedValueContext: FoldingParser.ParenedValueContext): String =
        "(${processValue(fdParenedValueContext.findValue()!!)})"

    override fun processAnonymousClassObject(fdAnonymousClassObjectContext: FoldingParser.AnonymousClassObjectContext): String {
        val (i,c) = fdAnonymousClassObjectContext.run {
            makeClassPrimaryBody(getClassTranspilerKt(),findField(),findDef(),findInherit(),findImpl(),listOf())
        }
        return "object$i {$c\n}"
    }

    fun getClassTranspilerKt(): LightClassTranspilerKt

    override fun processArgValue(fdArgValueContext: FoldingParser.ArgValueContext): String = when(fdArgValueContext) {
        is FoldingParser.PrimaryArgValueContext ->
            fdArgValueContext.findArgEx().joinToString(",") { processArgEx(it) }
        is FoldingParser.SingleListArgValueContext ->
            fdArgValueContext.findValue().joinToString(",") { processValue(it) }

        else -> throw RuntimeException("Invalid invoke '${fdArgValueContext.text}'")
    }
    override fun processArgEx(fdArgExContext: FoldingParser.ArgExContext): String = when(fdArgExContext) {
        is FoldingParser.SingleArgContext ->
            "${fdArgExContext.ID()?.text?.let { "$it = " } ?: ""}${processValue(fdArgExContext.findValue()!!)}"
        is FoldingParser.MultiArgContext ->
            (fdArgExContext.ID()?.text?.let { "$it = " } ?: "*") +
                    fdArgExContext.findValue().joinToString(",","arrayOf(",")") { processValue(it) }

        else -> throw RuntimeException("Invalid argument '${fdArgExContext.text}'")
    }
    override fun processInvoking(fdInvokingContext: FoldingParser.InvokingContext): String =
        fdInvokingContext.findValue().joinToString(",") { processValue(it) }

    override fun processParameterForLambda(fdParameterForLambdaContext: FoldingParser.ParameterForLambdaContext): String =
        when {
            fdParameterForLambdaContext.findParameterFromValueForLambda() == null ->
                fdParameterForLambdaContext.findParamEx().joinToString(", ","","") {
                    (if (it.ELLIPSIS() == null) "" else "vararg ") + it.ID()!!.text + ": " + processTypeEx(it.findTypeEx()!!)
                }
            else -> fdParameterForLambdaContext.findParameterFromValueForLambda()!!.findParamCEx().mapIndexed { index, paramCExContext ->
                "r$index" + ": " + processTypeEx(paramCExContext.findTypeEx()!!)
            }.joinToString(", ","(",")")
        }
    override fun processParameterFromValueForLambda(fdParameterFromValueForLambdaContext: FoldingParser.ParameterFromValueForLambdaContext): String =
        TODO("Not Yet Implemented")


    fun processReference(fdReferenceContext: FoldingParser.ReferenceContext) =
        (fdReferenceContext.findPackage_()?.text?.let { "$it." } ?: "") +
                processId(fdReferenceContext.findCommonIdentifier()!!)


    fun makeClassPrimaryBody(
        classTranspilerKt: LightClassTranspilerKt,
        fieldList: List<FoldingParser.FieldContext>, defList: List<FoldingParser.DefContext>,
        inheritContext: FoldingParser.InheritContext?, implList: List<FoldingParser.ImplContext>,
        defInInterfaceList: List<FoldingParser.DefInInterfaceContext>
    ): Pair<String,String> {
        val interfaceList = implList.map { processTypeEx(it.findTypeEx()!!) }
        val inherits = inheritContext?.findImpl()?.findTypeEx()?.let { processTypeEx(it) }?.let {
            listOf(it + (inheritContext.findArgValue()?.let { "(${processArgValue(it)})" } ?: "()")) + interfaceList
        } ?: interfaceList
        val inheritsText = inherits.takeIf { it.isNotEmpty() }?.joinToString(", "," : ") ?: ""

        val fieldListText = fieldList.map { classTranspilerKt.processField(it) }

        val implListText = (listOf(inheritContext?.findImpl()) + implList)
            .mapNotNull { it?.findImplBody()?.findDef() }.flatten().map { "override " + classTranspilerKt.transpileDef(it) }
        val vanillaDefList = defList.map { classTranspilerKt.transpileDef(it) }
        val defInInterfaceListText = defInInterfaceList.map { classTranspilerKt.processDefInInterface(it) }
        val compoListText = (fieldListText + defInInterfaceListText + vanillaDefList + implListText).joinToString("\n\n","\n").insertMargin(4)

        return inheritsText to compoListText
    }

    fun processInverse(targetValue: FoldingParser.ValueContext, inputValueId: String) =
        processInverseValue(targetValue, listOf()).map {
            it.last().id to it.dropLast(1).fold(inputValueId) { acc, callWrapper ->
                callWrapper.id + "($acc" + callWrapper.args.joinToString(", ",", ",")") {
                    processValue(it)
                } + "._${callWrapper.inverseIndex}"
            }
        }

}