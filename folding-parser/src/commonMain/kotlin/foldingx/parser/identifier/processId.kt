package foldingx.parser.identifier

import foldingx.parser.FoldingParser

fun processId(idSource: FoldingParser.CommonIdentifierContext) = when {
    idSource.ID() != null -> idSource.text
    idSource.findOpIdWrap() != null ->
        "OP_" + idSource.findOpIdWrap()!!.OPID()!!.text.toCharArray().joinToString("_") {
            it.code.toString(16)
        }
    idSource.findAopIdWrap() != null ->
        "AOP_" + idSource.findAopIdWrap()!!.OPID()!!.text.toCharArray().joinToString("_") {
            it.code.toString(16)
        }
    else -> throw RuntimeException("'${idSource.text}' is invalid Id")
}