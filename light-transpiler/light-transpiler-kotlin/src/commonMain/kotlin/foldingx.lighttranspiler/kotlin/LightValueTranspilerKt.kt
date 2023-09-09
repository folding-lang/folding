package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.LightValueTranspiler
import foldingx.lighttranspiler.exception.InvalidCode
import foldingx.lighttranspiler.kotlin.effect.EffectKt
import foldingx.lighttranspiler.util.TranspiledArgValue
import foldingx.lighttranspiler.util.extractParamDestruction
import foldingx.parser.FoldingParser
import foldingx.parser.classes.CommonClass
import foldingx.parser.fields.FieldSpec
import foldingx.parser.identifier.*
import foldingx.parser.inversing.processInverseValue

interface LightValueTranspilerKt : LightValueTranspiler<EffectKt> {
    fun EffectKt.registerGeneratedClass(commonClass: CommonClass): Boolean

    override fun processValue(fdValueContext: FoldingParser.ValueContext, effect: EffectKt): String = when(fdValueContext) {
        is FoldingParser.JustDefaultValueContext -> processJustDefaultValue(fdValueContext,effect)
        is FoldingParser.NullContext -> processNull(fdValueContext,effect)
        is FoldingParser.ThisContext -> processThis(fdValueContext,effect)
        is FoldingParser.ReflectedContext -> processReflected(fdValueContext,effect)
        is FoldingParser.CallFunctionContext -> processCallFunction(fdValueContext,effect)
        is FoldingParser.UseForeignClassContext -> processUseForeignClass(fdValueContext,effect)
        is FoldingParser.GetFieldGlobalContext -> processGetFieldGlobal(fdValueContext,effect)
        is FoldingParser.GetFieldContext -> processGetField(fdValueContext,effect)
        is FoldingParser.CallMethodContext -> processCallMethod(fdValueContext,effect)
        is FoldingParser.ReflectedMethodContext -> processReflectedMethod(fdValueContext,effect)
        is FoldingParser.CallFunctionLikeMethodContext -> processCallFunctionLikeMethod(fdValueContext,effect)
        is FoldingParser.InvokeValueContext -> processInvokeValue(fdValueContext,effect)
        is FoldingParser.InvokeValueLikeMethodContext -> processInvokeValueLikeMethod(fdValueContext,effect)
        is FoldingParser.SimpleIfContext -> processSimpleIf(fdValueContext,effect)
        is FoldingParser.ValueTypeCastingContext -> processValueTypeCasting(fdValueContext,effect)
        is FoldingParser.CallAopFuncBackContext -> processCallAopFuncBack(fdValueContext,effect)
        is FoldingParser.CallAopFuncContext -> processCallAopFunc(fdValueContext,effect)
        is FoldingParser.CallOpFuncContext -> processCallOpFunc(fdValueContext,effect)
        is FoldingParser.TypeCheckContext -> processTypeCheck(fdValueContext,effect)
        is FoldingParser.IfExpressionContext -> processIfExpression(fdValueContext,effect)
        is FoldingParser.PatternMatchExpressionContext -> TODO("processPatternMatchExpression(fdValueContext)")
        is FoldingParser.LetExpressionContext -> processLetExpression(fdValueContext,effect)
        is FoldingParser.DoExpressionContext -> processDoExpression(fdValueContext,effect)
        is FoldingParser.JustLambdaContext -> processJustLambda(fdValueContext,effect)
        is FoldingParser.ParenedValueContext -> processParenedValue(fdValueContext,effect)
        is FoldingParser.AnonymousClassObjectContext -> processAnonymousClassObject(fdValueContext,effect)
        is FoldingParser.TupleContext -> processTuple(fdValueContext,effect)

        else -> throw InvalidCode("value",fdValueContext)
    }

    override fun processJustDefaultValue(fdJustDefaultValueContext: FoldingParser.JustDefaultValueContext, effect: EffectKt): String =
        fdJustDefaultValueContext.text

    override fun processNull(fdNullContext: FoldingParser.NullContext, effect: EffectKt): String = "null"
    override fun processThis(fdNullContext: FoldingParser.ThisContext, effect: EffectKt): String = "this"
    override fun processReflected(fdReflectedContext: FoldingParser.ReflectedContext, effect: EffectKt): String =
        "::" + processReference(fdReflectedContext.findReference()!!,effect)
    override fun processCallFunction(fdCallFunctionContext: FoldingParser.CallFunctionContext, effect: EffectKt): String {
        val (typeArguments,arguments) = fdCallFunctionContext.findArgValue()?.let { processArgValue(it,effect) }
            ?: TranspiledArgValue("","")
        return processReference(fdCallFunctionContext.findReference()!!,effect) + typeArguments + "(" +
                arguments + ")"
    }
    override fun processUseForeignClass(fdUseForeignClassContext: FoldingParser.UseForeignClassContext, effect: EffectKt): String {
        val (typeArguments,arguments) = fdUseForeignClassContext.findArgValue()?.let { processArgValue(it,effect) }
            ?: TranspiledArgValue("","")
        return "${processReference(fdUseForeignClassContext.findReference()!!,effect)}$typeArguments(" +
                arguments + ")"
    }
    override fun processGetFieldGlobal(fdGetFieldGlobalContext: FoldingParser.GetFieldGlobalContext, effect: EffectKt): String =
        processReference(fdGetFieldGlobalContext.findReference()!!,effect)
    override fun processGetField(fdGetFieldContext: FoldingParser.GetFieldContext, effect: EffectKt): String =
        "(${processValue(fdGetFieldContext.findValue()!!,effect)}).${processId(fdGetFieldContext.findCommonIdentifier()!!)}"
    override fun processCallMethod(fdCallMethodContext: FoldingParser.CallMethodContext, effect: EffectKt): String {
        val (typeArguments,arguments) = fdCallMethodContext.findArgValue()?.let { processArgValue(it,effect) }
            ?: TranspiledArgValue("","")
        return "(${processValue(fdCallMethodContext.findValue()!!,effect)})." + processId(fdCallMethodContext.findCommonIdentifier()!!) +
                typeArguments + "(" + arguments + ")"
    }
    override fun processReflectedMethod(fdReflectedMethodContext: FoldingParser.ReflectedMethodContext, effect: EffectKt): String =
        "(${processValue(fdReflectedMethodContext.findValue()!!,effect)})::${processId(fdReflectedMethodContext.findCommonIdentifier()!!)}"
    override fun processCallFunctionLikeMethod(fdCallFunctionLikeMethodContext: FoldingParser.CallFunctionLikeMethodContext, effect: EffectKt): String {
        val (typeArguments,arguments) = fdCallFunctionLikeMethodContext.findArgValue()?.let { processArgValue(it,effect) }
            ?: TranspiledArgValue("","")
        return processId(fdCallFunctionLikeMethodContext.findCommonIdentifier()!!) + typeArguments + "(" +
                processValue(fdCallFunctionLikeMethodContext.findValue()!!,effect) +
                (if (arguments == "") "" else ", $arguments") + ")"
    }
    override fun processInvokeValue(fdInvokeValueContext: FoldingParser.InvokeValueContext, effect: EffectKt): String =
        "(${processValue(fdInvokeValueContext.findValue()!!,effect)}).invoke(" +
                (fdInvokeValueContext.findInvoking()?.let { processInvoking(it,effect) } ?: "") + ")"
    override fun processInvokeValueLikeMethod(fdInvokeValueLikeMethodContext: FoldingParser.InvokeValueLikeMethodContext, effect: EffectKt): String =
        "(${processValue(fdInvokeValueLikeMethodContext.findValue(1)!!,effect)}).invoke(" +
                processValue(fdInvokeValueLikeMethodContext.findValue(0)!!,effect) +
                (fdInvokeValueLikeMethodContext.findInvoking()?.let { ","+ processInvoking(it,effect) } ?: "") + ")"
    override fun processSimpleIf(fdSimpleIfContext: FoldingParser.SimpleIfContext, effect: EffectKt): String =
        "(if (${processValue(fdSimpleIfContext.findValue(1)!!,effect)}) (${processValue(fdSimpleIfContext.findValue(0)!!,effect)})" +
                " else null)"
    override fun processIfExpression(fdIfExpressionContext: FoldingParser.IfExpressionContext, effect: EffectKt): String =
        fdIfExpressionContext.findIf_else()!!.let { ifElse ->
                "(if (" + processValue(ifElse.findValue(0)!!,effect) + ") (" +
                        processValue(ifElse.findValue(1)!!,effect) + ") else (" +
                        processValue(ifElse.findValue(2)!!,effect) + "))"
        }
    override fun processValueTypeCasting(fdValueTypeCastingContext: FoldingParser.ValueTypeCastingContext, effect: EffectKt): String =
        "(${processValue(fdValueTypeCastingContext.findValue()!!,effect)} " +
                "as ${processTypeEx(fdValueTypeCastingContext.findTypeCasting()!!.findTypeEx()!!,effect)})"
    override fun processCallAopFuncBack(fdCallAopFuncBackContext: FoldingParser.CallAopFuncBackContext, effect: EffectKt): String =
        processCommonOpId(fdCallAopFuncBackContext.findCommonOpIdentifier()!!, OpIdUsage.AOP) +
                "(${processValue(fdCallAopFuncBackContext.findValue()!!,effect)})"
    override fun processCallAopFunc(fdCallAopFuncContext: FoldingParser.CallAopFuncContext, effect: EffectKt): String =
        processCommonOpId(fdCallAopFuncContext.findCommonOpIdentifier()!!, OpIdUsage.AOP) +
                "(${processValue(fdCallAopFuncContext.findValue()!!,effect)})"
    override fun processCallOpFunc(fdCallOpFuncContext: FoldingParser.CallOpFuncContext, effect: EffectKt): String =
        processCommonOpId(fdCallOpFuncContext.findCommonOpIdentifier()!!, OpIdUsage.OP) +
                "(${processValue(fdCallOpFuncContext.findValue(0)!!,effect)}," +
                "${processValue(fdCallOpFuncContext.findValue(1)!!,effect)})"
    override fun processTypeCheck(fdTypeCheckContext: FoldingParser.TypeCheckContext, effect: EffectKt): String =
        "(" + processValue(fdTypeCheckContext.findValue()!!,effect) +
                " is " + processTypeEx(fdTypeCheckContext.findTypeEx()!!,effect) + ")"
    override fun processDoExpression(fdDoExpressionContext: FoldingParser.DoExpressionContext, effect: EffectKt): String =
        processDoBlock(fdDoExpressionContext.findDoBlock()!!,effect)
    fun processDoBlock(fdDoBlockContext: FoldingParser.DoBlockContext, effect: EffectKt): String {
        var isReturned = false
        return fdDoBlockContext.findCompo().joinToString("\n", "{\n") {
            when {
                isReturned -> ""
                it.findValue() != null -> processValue(it.findValue()!!,effect) + ";folding.unit();"
                it.findFieldAssign() != null -> it.findFieldAssign()!!.let { that ->
                    when (that) {
                        is FoldingParser.GlobalFieldAssignContext ->
                            "${that.ID()!!.text} = ${processValue(that.findValue()!!,effect)}"
                        is FoldingParser.ObjectFieldAssignContext ->
                            "(${processValue(that.findValue(0)!!,effect)}).${that.ID()!!.text} = ${processValue(that.findValue(1)!!,effect)}"

                        else -> throw InvalidCode("field assigning", that)
                    }
                }+";"
                it.findRemainLet_binding() != null ->
                    processLet_binding(it.findRemainLet_binding()!!.findLet_binding()!!,effect)
                        .replace("\n    ","\n").removeSuffix("}()").removePrefix("{") + ";"
                it.findReturning() != null -> {
                    isReturned = true
                    processValue(it.findReturning()!!.findValue()!!,effect)+";"
                }

                else -> throw InvalidCode("do expression", fdDoBlockContext)
            }
        }.insertMargin(4) + "\n}()"
    }
    override fun processJustLambda(fdJustLambdaContext: FoldingParser.JustLambdaContext, effect: EffectKt): String {
        val lambdaContext = fdJustLambdaContext.findLambda()!!
        val (param,paramC) = lambdaContext.findParameter()?.let { p ->
            processParameter(p,effect).removeSurrounding("(",")") to
                processParamDestruction(extractParamDestruction(p.findParamEx()),effect)
        } ?: ("" to null)
        val primaryHead = "$param ->"
        val primaryBody = ("\n"+(paramC?.let { "$it\n" } ?: "")+
                "("+processValue(lambdaContext.findValue()!!,effect)+")").insertMargin(4) + "\n"

        return "{ ${primaryHead + primaryBody}}"
    }

    override fun processLetExpression(fdLetExpressionContext: FoldingParser.LetExpressionContext, effect: EffectKt): String = processLet_binding(fdLetExpressionContext.findLet_binding()!!,effect)
    fun processLet_binding(fdLet_bindingContext: FoldingParser.Let_bindingContext, effect: EffectKt): String {
        val (boundPre,bindTarget,value) = fdLet_bindingContext.findValue()
        val bindTargetReferId = "r" + (bindTarget.position?.let { "${it.start.line},${it.start.column}" } ?: "null")
            .map { it.code.toString(32) }.joinToString("")
        val bounds = processInverse(boundPre, bindTargetReferId,effect).joinToString("\n") { (id, inv) -> "val $id = ($inv)" }
        return "{\nval $bindTargetReferId = ${processValue(bindTarget,effect)}\n$bounds;\n${processValue(value,effect)}".insertMargin(4)+"\n}()"
    }

    override fun processParenedValue(fdParenedValueContext: FoldingParser.ParenedValueContext, effect: EffectKt): String =
        "(${processValue(fdParenedValueContext.findValue()!!,effect)})"

    override fun processAnonymousClassObject(fdAnonymousClassObjectContext: FoldingParser.AnonymousClassObjectContext, effect: EffectKt): String {
        val (i,c) = fdAnonymousClassObjectContext.run {
            makeClassPrimaryBody(getClassTranspilerKt(),findField(),findDef(),findInherit(),findImpl(),listOf(),effect=effect)
        }
        return "object$i {$c".insertMargin(4)+"}"
    }

    override fun processTuple(fdTupleContext: FoldingParser.TupleContext, effect: EffectKt): String {
        val values = fdTupleContext.findTupleEx()!!.findValue()
        return values.joinToString(", ","FdTuple${values.count()}(",")") {
            processValue(it,effect)
        }
    }

    fun getClassTranspilerKt(): LightClassTranspilerKt

    override fun processArgValue(fdArgValueContext: FoldingParser.ArgValueContext, effect: EffectKt): TranspiledArgValue {
        val typeArguments = when (val it = fdArgValueContext) {
            is FoldingParser.PrimaryArgValueContext ->
                if (it.findTypeEx().isNotEmpty())
                    it.findTypeEx().joinToString(",","<",">") {
                        processTypeEx(it,effect)
                    }
                else ""

            else -> throw InvalidCode("type argument",it)
        }
        val arguments = when (fdArgValueContext) {
            is FoldingParser.PrimaryArgValueContext ->
                fdArgValueContext.findArgEx().joinToString(",") { processArgEx(it,effect) }

            else -> throw InvalidCode("invoke", fdArgValueContext)
        }

        return TranspiledArgValue(typeArguments, arguments)
    }
    override fun processArgEx(fdArgExContext: FoldingParser.ArgExContext, effect: EffectKt): String = when(fdArgExContext) {
        is FoldingParser.SingleArgContext ->
            "${fdArgExContext.ID()?.text?.let { "$it = " } ?: ""}${if (fdArgExContext.ELLIPSIS() != null) "*" else ""}${processValue(fdArgExContext.findValue()!!,effect)}"
        is FoldingParser.MultiArgContext ->
            (fdArgExContext.ID()?.text?.let { "$it = " } ?: "*") +
                    fdArgExContext.findValue().joinToString(",","array(",")") { processValue(it,effect) }

        else -> throw InvalidCode("argument",fdArgExContext)
    }
    override fun processInvoking(fdInvokingContext: FoldingParser.InvokingContext, effect: EffectKt): String =
        fdInvokingContext.findValue().joinToString(",") { processValue(it,effect) }


    override fun processParameter(fdParameterContext: FoldingParser.ParameterContext, effect: EffectKt): String =
        makeParamIdBag(fdParameterContext.findParamEx()).joinToString(", ", "(", ")") { (id, it) ->
            (if (it.ELLIPSIS() == null) "" else "vararg ") + id + ": " + processTypeEx(it.findTypeEx()!!,effect)
        }


    override fun processParamDestruction(fdParamDestruction: List<Pair<String?,FoldingParser.ValueContext>>, effect: EffectKt): String =
        fdParamDestruction.flatMapIndexed { i, (idNullable,valueCtx) ->
            val id = makeIndexedParamId(i,idNullable)
            processInverse(valueCtx,id,effect).map { (invId,invValue) -> invId to invValue }
        }.joinToString("\n") { (invId,invValue) ->
            "val $invId = $invValue"
        }


    fun processReference(fdReferenceContext: FoldingParser.ReferenceContext, effect: EffectKt) =
        (fdReferenceContext.findPackage_()?.text?.let { "${processPackage(it,effect)}." } ?: "") +
                processId(fdReferenceContext.findCommonIdentifier()!!)


    fun makeClassPrimaryBody(
        classTranspilerKt: LightClassTranspilerKt,
        fieldList: List<FoldingParser.FieldContext> = listOf(), defList: List<FoldingParser.DefContext> = listOf(),
        inheritContext: FoldingParser.InheritContext? = null, implList: List<FoldingParser.ImplContext> = listOf(),
        defInInterfaceList: List<FoldingParser.DefInInterfaceContext> = listOf(),
        fieldSpecList: List<FieldSpec> = listOf(),
        effect: EffectKt
    ): Pair<String,String> {
        val interfaceList = implList.map { processTypeEx(it.findTypeEx()!!,effect) }
        val inherits = inheritContext?.findTypeEx()?.let { processTypeEx(it,effect) }?.let {
            listOf(it + (inheritContext.findArgValue()?.let { "(${processArgValue(it,effect).arguments})" } ?: "()")) + interfaceList
        } ?: interfaceList
        val inheritsText = inherits.takeIf { it.isNotEmpty() }?.joinToString(", "," : ") ?: ""

        val fieldListText = fieldList.map { classTranspilerKt.processField(it,effect) }
        val abstractFieldList = fieldSpecList.map {
            val keyword = if (it.isMutable) "var" else "val"
            "abstract $keyword ${it.id}: ${it.typeEx}"
        }

        val implBodyList = implList.mapNotNull { it.findImplBody() }

        val implDefListText = (listOf(inheritContext?.findImplBody()) + implBodyList)
            .mapNotNull { it?.findDef() }.flatten().map { "open override " + classTranspilerKt.transpileDef(it,effect) }
        val implFieldListText = (listOf(inheritContext?.findImplBody()) + implBodyList)
            .mapNotNull { it?.findField() }.flatten().map {
                val parts = classTranspilerKt.processField(it,effect).split("\n").toMutableList()
                val keywordEditIndex = if (parts[0] == "/** not initiated variable */") 2 else 0
                parts[keywordEditIndex] = "open override " + parts[keywordEditIndex]
                parts.joinToString("\n")
            }
        val vanillaDefList = defList.map { "open " + classTranspilerKt.transpileDef(it,effect) }
        val defInInterfaceListText = defInInterfaceList.map { classTranspilerKt.processDefInInterface(it,effect) }

        val compoListText =
            (abstractFieldList + fieldListText + implFieldListText + defInInterfaceListText + vanillaDefList + implDefListText).joinToString("\n\n","\n")

        return inheritsText to compoListText
    }

    fun processInverse(targetValue: FoldingParser.ValueContext, inputValueId: String, effect: EffectKt) =
        processInverseValue(targetValue).map {
            it.last().id to it.dropLast(1).fold(inputValueId) { acc, callWrapper ->
                callWrapper.id +
                        (callWrapper.typeArgs.takeIf { it.isNotEmpty() }?.joinToString(",","<",">") {
                            processTypeEx(it,effect)
                        } ?: "") +
                        (listOf(acc) + callWrapper.args.map {
                            processValue(it,effect)
                        }).joinToString(", ","(",")") + "._${callWrapper.inverseIndex}"
            }
        }

}