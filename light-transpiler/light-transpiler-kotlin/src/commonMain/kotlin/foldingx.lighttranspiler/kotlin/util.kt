package foldingx.lighttranspiler.kotlin

import foldingx.parser.FoldingParser

fun String.insertMargin(length: Int) = replace("\n","\n"+" ".repeat(length))

fun makeParamIdBag(paramList: List<FoldingParser.ParamExContext>) =
    paramList.mapIndexed { i, it ->
        makeIndexedParamId(i,it.ID()?.text) to it
    }

fun makeIndexedParamId(index: Int, idRaw: String?) = idRaw ?: "p$index"


