package foldingx.lighttranspiler.kotlin

import foldingx.parser.FoldingParser

fun String.insertMargin(length: Int) = replace("\n","\n"+" ".repeat(length))

fun mateParamAndParamCExes(parameterExes: List<FoldingParser.ParamExContext>, paramCExesText: String ): String =
    parameterExes.zip(paramCExesText.split("\n")).joinToString("\n") { (it,invValue) ->
        "val ${it.ID()}: ${processTypeEx(it.findTypeEx()!!)} = $invValue"
    }


