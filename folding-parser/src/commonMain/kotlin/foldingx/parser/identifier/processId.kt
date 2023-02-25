package foldingx.parser.identifier

import foldingx.parser.FoldingParser

fun processId(idSource: FoldingParser.CommonIdentifierContext) = when {
    idSource.ID() != null -> idSource.text
    idSource.findOpIdWrap() != null ->
        processOpId(idSource.findOpIdWrap()!!.OPID()!!.text)
    idSource.findAopIdWrap() != null ->
        processAopId(idSource.findAopIdWrap()!!.OPID()!!.text)
    else -> throw RuntimeException("'${idSource.text}' is invalid Id")
}

fun processOpId(text: String) = "OP_" + text.toCharArray().joinToString("_") {
    it.code.toString(16)
}

fun processAopId(text: String) = "AOP_" + text.toCharArray().joinToString("_") {
    it.code.toString(16)
}