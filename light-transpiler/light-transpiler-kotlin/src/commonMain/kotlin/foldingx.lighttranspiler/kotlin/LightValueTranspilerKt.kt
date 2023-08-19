package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightValueTranspiler
import foldingx.lighttranspiler.exception.InvalidCode
import foldingx.lighttranspiler.util.TranspiledArgValue
import foldingx.lighttranspiler.util.extractParamDestruction
import foldingx.parser.FoldingParser
import foldingx.parser.classes.CommonClass
import foldingx.parser.identifier.*
import foldingx.parser.inversing.processInverseValue

interface LightValueTranspilerKt : LightValueTranspiler {
    fun registerGeneratedClass(commonClass: CommonClass): Boolean

    override fun processValue(fdValueContext: FoldingParser.ValueContext): String = when(fdValueContext) {
        is FoldingParser.JustDefaultValueContext -> processJustDefaultValue(fdValueContext)
        is FoldingParser.NullContext -> processNull(fdValueContext)
        is FoldingParser.ThisContext -> processThis(fdValueContext)
        is FoldingParser.ReflectedContext -> processReflected(fdValueContext)
        is FoldingParser.CallFunctionContext -> processCallFunction(fdValueContext)
        is FoldingParser.UseForeignClassContext -> processUseForeignClass(fdValueContext)
        is FoldingParser.GetFieldGlobalContext -> processGetFieldGlobal(fdValueContext)
        is FoldingParser.GetFieldContext -> processGetField(fdValueContext)
        is FoldingParser.CallMethodContext -> processCallMethod(fdValueContext)
        is FoldingParser.ReflectedMethodContext -> processReflectedMethod(fdValueContext)
        is FoldingParser.CallFunctionLikeMethodContext -> processCallFunctionLikeMethod(fdValueContext)
        is FoldingParser.InvokeValueContext -> processInvokeValue(fdValueContext)
        is FoldingParser.InvokeValueLikeMethodContext -> processInvokeValueLikeMethod(fdValueContext)
        is FoldingParser.SimpleIfContext -> processSimpleIf(fdValueContext)
        is FoldingParser.ValueTypeCastingContext -> processValueTypeCasting(fdValueContext)
        is FoldingParser.CallAopFuncBackContext -> processCallAopFuncBack(fdValueContext)
        is FoldingParser.CallAopFuncContext -> processCallAopFunc(fdValueContext)
        is FoldingParser.CallOpFuncContext -> processCallOpFunc(fdValueContext)
        is FoldingParser.TypeCheckContext -> processTypeCheck(fdValueContext)
        is FoldingParser.IfExpressionContext -> processIfExpression(fdValueContext)
        is FoldingParser.PatternMatchExpressionContext -> TODO("processPatternMatchExpression(fdValueContext)")
        is FoldingParser.LetExpressionContext -> processLetExpression(fdValueContext)
        is FoldingParser.DoExpressionContext -> processDoExpression(fdValueContext)
        is FoldingParser.JustLambdaContext -> processJustLambda(fdValueContext)
        is FoldingParser.ParenedValueContext -> processParenedValue(fdValueContext)
        is FoldingParser.AnonymousClassObjectContext -> processAnonymousClassObject(fdValueContext)
        is FoldingParser.TupleContext -> processTuple(fdValueContext)

        else -> throw InvalidCode("value",fdValueContext)
    }

    override fun processJustDefaultValue(fdJustDefaultValueContext: FoldingParser.JustDefaultValueContext): String =
        fdJustDefaultValueContext.text

    override fun processNull(fdNullContext: FoldingParser.NullContext): String = "null"
    override fun processThis(fdNullContext: FoldingParser.ThisContext): String = "this"
    override fun processReflected(fdReflectedContext: FoldingParser.ReflectedContext): String =
        "::" + processReference(fdReflectedContext.findReference()!!)
    override fun processCallFunction(fdCallFunctionContext: FoldingParser.CallFunctionContext): String {
        val (typeArguments,arguments) = fdCallFunctionContext.findArgValue()?.let { processArgValue(it) }
            ?: TranspiledArgValue("","")
        return processReference(fdCallFunctionContext.findReference()!!) + typeArguments + "(" +
                arguments + ")"
    }
    override fun processUseForeignClass(fdUseForeignClassContext: FoldingParser.UseForeignClassContext): String {
        val (typeArguments,arguments) = fdUseForeignClassContext.findArgValue()?.let { processArgValue(it) }
            ?: TranspiledArgValue("","")
        return "${processReference(fdUseForeignClassContext.findReference()!!)}$typeArguments(" +
                arguments + ")"
    }
    override fun processGetFieldGlobal(fdGetFieldGlobalContext: FoldingParser.GetFieldGlobalContext): String =
        processReference(fdGetFieldGlobalContext.findReference()!!)
    override fun processGetField(fdGetFieldContext: FoldingParser.GetFieldContext): String =
        "(${processValue(fdGetFieldContext.findValue()!!)}).${processId(fdGetFieldContext.findCommonIdentifier()!!)}"
    override fun processCallMethod(fdCallMethodContext: FoldingParser.CallMethodContext): String {
        val (typeArguments,arguments) = fdCallMethodContext.findArgValue()?.let { processArgValue(it) }
            ?: TranspiledArgValue("","")
        return "(${processValue(fdCallMethodContext.findValue()!!)})." + processId(fdCallMethodContext.findCommonIdentifier()!!) +
                typeArguments + "(" + arguments + ")"
    }
    override fun processReflectedMethod(fdReflectedMethodContext: FoldingParser.ReflectedMethodContext): String =
        "(${processValue(fdReflectedMethodContext.findValue()!!)})::${processId(fdReflectedMethodContext.findCommonIdentifier()!!)}"
    override fun processCallFunctionLikeMethod(fdCallFunctionLikeMethodContext: FoldingParser.CallFunctionLikeMethodContext): String {
        val (typeArguments,arguments) = fdCallFunctionLikeMethodContext.findArgValue()?.let { processArgValue(it) }
            ?: TranspiledArgValue("","")
        return processId(fdCallFunctionLikeMethodContext.findCommonIdentifier()!!) + typeArguments + "(" +
                processValue(fdCallFunctionLikeMethodContext.findValue()!!) +
                (if (arguments == "") "" else ", $arguments") + ")"
    }
    override fun processInvokeValue(fdInvokeValueContext: FoldingParser.InvokeValueContext): String =
        "(${processValue(fdInvokeValueContext.findValue()!!)}).invoke(" +
                (fdInvokeValueContext.findInvoking()?.let { processInvoking(it) } ?: "") + ")"
    override fun processInvokeValueLikeMethod(fdInvokeValueLikeMethodContext: FoldingParser.InvokeValueLikeMethodContext): String =
        "(${processValue(fdInvokeValueLikeMethodContext.findValue(1)!!)}).invoke(" +
                processValue(fdInvokeValueLikeMethodContext.findValue(0)!!) +
                (fdInvokeValueLikeMethodContext.findInvoking()?.let { ","+ processInvoking(it) } ?: "") + ")"
    override fun processSimpleIf(fdSimpleIfContext: FoldingParser.SimpleIfContext): String =
        "(if (${processValue(fdSimpleIfContext.findValue(1)!!)}) (${processValue(fdSimpleIfContext.findValue(0)!!)})" +
                " else null)"
    override fun processIfExpression(fdIfExpressionContext: FoldingParser.IfExpressionContext): String =
        fdIfExpressionContext.findIf_else()!!.let { ifElse ->
                "(if (" + processValue(ifElse.findValue(0)!!) + ") (" +
                        processValue(ifElse.findValue(1)!!) + ") else (" +
                        processValue(ifElse.findValue(2)!!) + "))"
        }
    override fun processValueTypeCasting(fdValueTypeCastingContext: FoldingParser.ValueTypeCastingContext): String =
        "(${processValue(fdValueTypeCastingContext.findValue()!!)} " +
                "as ${processTypeEx(fdValueTypeCastingContext.findTypeCasting()!!.findTypeEx()!!)})"
    override fun processCallAopFuncBack(fdCallAopFuncBackContext: FoldingParser.CallAopFuncBackContext): String =
        processCommonOpId(fdCallAopFuncBackContext.findCommonOpIdentifier()!!, OpIdUsage.AOP) +
                "(${processValue(fdCallAopFuncBackContext.findValue()!!)})"
    override fun processCallAopFunc(fdCallAopFuncContext: FoldingParser.CallAopFuncContext): String =
        processCommonOpId(fdCallAopFuncContext.findCommonOpIdentifier()!!, OpIdUsage.AOP) +
                "(${processValue(fdCallAopFuncContext.findValue()!!)})"
    override fun processCallOpFunc(fdCallOpFuncContext: FoldingParser.CallOpFuncContext): String =
        processCommonOpId(fdCallOpFuncContext.findCommonOpIdentifier()!!, OpIdUsage.OP) +
                "(${processValue(fdCallOpFuncContext.findValue(0)!!)}," +
                "${processValue(fdCallOpFuncContext.findValue(1)!!)})"
    override fun processTypeCheck(fdTypeCheckContext: FoldingParser.TypeCheckContext): String =
        "(" + processValue(fdTypeCheckContext.findValue()!!) +
                " is " + processTypeEx(fdTypeCheckContext.findTypeEx()!!) + ")"
    override fun processDoExpression(fdDoExpressionContext: FoldingParser.DoExpressionContext): String =
        processDoBlock(fdDoExpressionContext.findDoBlock()!!)
    fun processDoBlock(fdDoBlockContext: FoldingParser.DoBlockContext): String {
        var isReturned = false
        return fdDoBlockContext.findCompo().joinToString("\n", "{\n") {
            when {
                isReturned -> ""
                it.findValue() != null -> processValue(it.findValue()!!) + ";folding.unit();"
                it.findFieldAssign() != null -> it.findFieldAssign()!!.let { that ->
                    when (that) {
                        is FoldingParser.GlobalFieldAssignContext ->
                            "${that.ID()!!.text} = ${processValue(that.findValue()!!)}"
                        is FoldingParser.ObjectFieldAssignContext ->
                            "(${processValue(that.findValue(0)!!)}).${that.ID()!!.text} = ${processValue(that.findValue(1)!!)}"

                        else -> throw InvalidCode("field assigning", that)
                    }
                }+";"
                it.findRemainLet_binding() != null ->
                    processLet_binding(it.findRemainLet_binding()!!.findLet_binding()!!)
                        .replace("\n    ","\n").removeSuffix("}()").removePrefix("{") + ";"
                it.findReturning() != null -> {
                    isReturned = true
                    processValue(it.findReturning()!!.findValue()!!)+";"
                }

                else -> throw InvalidCode("do expression", fdDoBlockContext)
            }
        }.insertMargin(4) + "\n}()"
    }
    override fun processJustLambda(fdJustLambdaContext: FoldingParser.JustLambdaContext): String {
        val lambdaContext = fdJustLambdaContext.findLambda()!!
        val (param,paramC) = lambdaContext.findParameter()?.let { p ->
            processParameter(p).removeSurrounding("(",")") to
                processParamDestruction(extractParamDestruction(p.findParamEx()))
        } ?: ("" to null)
        val primaryHead = "$param ->"
        val primaryBody = ("\n"+(paramC?.let { "$it\n" } ?: "")+
                "("+processValue(lambdaContext.findValue()!!)+")").insertMargin(4) + "\n"

        return "{ ${primaryHead + primaryBody}}"
    }

    override fun processLetExpression(fdLetExpressionContext: FoldingParser.LetExpressionContext): String = processLet_binding(fdLetExpressionContext.findLet_binding()!!)
    fun processLet_binding(fdLet_bindingContext: FoldingParser.Let_bindingContext): String {
        val (boundPre,bindTarget,value) = fdLet_bindingContext.findValue()
        val bindTargetReferId = "r" + (bindTarget.position?.let { "${it.start.line},${it.start.column}" } ?: "null")
            .map { it.code.toString(32) }.joinToString("")
        val bounds = processInverse(boundPre, bindTargetReferId).joinToString("\n") { (id, inv) -> "val $id = ($inv)" }
        return "{\nval $bindTargetReferId = ${processValue(bindTarget)}\n$bounds;\n${processValue(value)}".insertMargin(4)+"\n}()"
    }

    override fun processParenedValue(fdParenedValueContext: FoldingParser.ParenedValueContext): String =
        "(${processValue(fdParenedValueContext.findValue()!!)})"

    override fun processAnonymousClassObject(fdAnonymousClassObjectContext: FoldingParser.AnonymousClassObjectContext): String {
        val (i,c) = fdAnonymousClassObjectContext.run {
            makeClassPrimaryBody(getClassTranspilerKt(),findField(),findDef(),findInherit(),findImpl(),listOf())
        }
        return "object$i {$c".insertMargin(4)+"}"
    }

    override fun processTuple(fdTupleContext: FoldingParser.TupleContext): String {
        val values = fdTupleContext.findTupleEx()!!.findValue()
        return values.joinToString(", ","FdTuple${values.count()}(",")") {
            processValue(it)
        }
    }

    fun getClassTranspilerKt(): LightClassTranspilerKt

    override fun processArgValue(fdArgValueContext: FoldingParser.ArgValueContext): TranspiledArgValue {
        val typeArguments = when (val it = fdArgValueContext) {
            is FoldingParser.PrimaryArgValueContext ->
                if (it.findTypeEx().isNotEmpty())
                    it.findTypeEx().joinToString(",","<",">") {
                        processTypeEx(it)
                    }
                else ""

            else -> throw InvalidCode("type argument",it)
        }
        val arguments = when (fdArgValueContext) {
            is FoldingParser.PrimaryArgValueContext ->
                fdArgValueContext.findArgEx().joinToString(",") { processArgEx(it) }

            else -> throw InvalidCode("invoke", fdArgValueContext)
        }

        return TranspiledArgValue(typeArguments, arguments)
    }
    override fun processArgEx(fdArgExContext: FoldingParser.ArgExContext): String = when(fdArgExContext) {
        is FoldingParser.SingleArgContext ->
            "${fdArgExContext.ID()?.text?.let { "$it = " } ?: ""}${if (fdArgExContext.ELLIPSIS() != null) "*" else ""}${processValue(fdArgExContext.findValue()!!)}"
        is FoldingParser.MultiArgContext ->
            (fdArgExContext.ID()?.text?.let { "$it = " } ?: "*") +
                    fdArgExContext.findValue().joinToString(",","array(",")") { processValue(it) }

        else -> throw InvalidCode("argument",fdArgExContext)
    }
    override fun processInvoking(fdInvokingContext: FoldingParser.InvokingContext): String =
        fdInvokingContext.findValue().joinToString(",") { processValue(it) }


    override fun processParameter(fdParameterContext: FoldingParser.ParameterContext): String =
        makeParamIdBag(fdParameterContext.findParamEx()).joinToString(", ", "(", ")") { (id, it) ->
            (if (it.ELLIPSIS() == null) "" else "vararg ") + id + ": " + processTypeEx(it.findTypeEx()!!)
        }


    override fun processParamDestruction(fdParamDestruction: List<Pair<String?,FoldingParser.ValueContext>>): String =
        fdParamDestruction.flatMapIndexed { i, (idNullable,valueCtx) ->
            val id = makeIndexedParamId(i,idNullable)
            processInverse(valueCtx,id).map { (invId,invValue) -> invId to invValue }
        }.joinToString("\n") { (invId,invValue) ->
            "val $invId = $invValue"
        }


    fun processReference(fdReferenceContext: FoldingParser.ReferenceContext) =
        (fdReferenceContext.findPackage_()?.text?.let { "$it." } ?: "") +
                processId(fdReferenceContext.findCommonIdentifier()!!)


    fun makeClassPrimaryBody(
        classTranspilerKt: LightClassTranspilerKt,
        fieldList: List<FoldingParser.FieldContext> = listOf(), defList: List<FoldingParser.DefContext> = listOf(),
        inheritContext: FoldingParser.InheritContext? = null, implList: List<FoldingParser.ImplContext> = listOf(),
        defInInterfaceList: List<FoldingParser.DefInInterfaceContext> = listOf(),
        fieldInInterfaceList: List<FoldingParser.FieldInInterfaceContext> = listOf()
    ): Pair<String,String> {
        val interfaceList = implList.map { processTypeEx(it.findTypeEx()!!) }
        val inherits = inheritContext?.findImpl()?.findTypeEx()?.let { processTypeEx(it) }?.let {
            listOf(it + (inheritContext.findArgValue()?.let { "(${processArgValue(it).arguments})" } ?: "()")) + interfaceList
        } ?: interfaceList
        val inheritsText = inherits.takeIf { it.isNotEmpty() }?.joinToString(", "," : ") ?: ""

        val fieldListText = fieldList.map { classTranspilerKt.processField(it) }
        val abstractFieldList = fieldInInterfaceList.map {
            val id = it.findFieldNotInit()!!.ID()!!.text
            val typeEx = processTypeEx(it.findFieldNotInit()!!.findTypeEx()!!)
            val keyword =
                if (it.findFieldNotInit()!!.MUTABLE() == null) "val" else "var"
            "abstract $keyword $id: $typeEx"
        }

        val implDefListText = (listOf(inheritContext?.findImpl()) + implList)
            .mapNotNull { it?.findImplBody()?.findDef() }.flatten().map { "open override " + classTranspilerKt.transpileDef(it) }
        val implFieldListText = (listOf(inheritContext?.findImpl()) + implList)
            .mapNotNull { it?.findImplBody()?.findField() }.flatten().map {
                val parts = classTranspilerKt.processField(it).split("\n").toMutableList()
                val keywordEditIndex = if (parts[0] == "/** not initiated variable */") 2 else 0
                parts[keywordEditIndex] = "open override " + parts[keywordEditIndex]
                parts.joinToString("\n")
            }
        val vanillaDefList = defList.map { "open " + classTranspilerKt.transpileDef(it) }
        val defInInterfaceListText = defInInterfaceList.map { classTranspilerKt.processDefInInterface(it) }

        val compoListText =
            (abstractFieldList + fieldListText + implFieldListText + defInInterfaceListText + vanillaDefList + implDefListText).joinToString("\n\n","\n")

        return inheritsText to compoListText
    }

    fun processInverse(targetValue: FoldingParser.ValueContext, inputValueId: String) =
        processInverseValue(targetValue).map {
            it.last().id to it.dropLast(1).fold(inputValueId) { acc, callWrapper ->
                callWrapper.id +
                        (callWrapper.typeArgs.takeIf { it.isNotEmpty() }?.joinToString(",","<",">") {
                            processTypeEx(it)
                        } ?: "") +
                        (listOf(acc) + callWrapper.args.map {
                            processValue(it)
                        }).joinToString(", ","(",")") + "._${callWrapper.inverseIndex}"
            }
        }

}