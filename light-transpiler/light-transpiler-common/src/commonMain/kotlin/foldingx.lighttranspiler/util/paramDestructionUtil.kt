package foldingx.lighttranspiler.util

import foldingx.parser.FoldingParser

fun extractParamDestruction(fdParamExContext: List<FoldingParser.ParamExContext>) =
    fdParamExContext.filter { it.findValue() != null }.map {
        it.ID()?.text to it.findValue()!!
    }