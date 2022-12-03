package foldingx.parser.identifier

import foldingx.parser.FoldingParser

fun processId(idSource: FoldingParser.CommonIdentifierContext) = when {
    idSource.ID() != null -> idSource.text
    idSource.findOpIdWrap() != null ->
        "OP_" + idSource.findOpIdWrap()!!.OPID()!!.text.toCharArray().joinToString("") {
            it.code.toString()
        }
    idSource.findAopIdWrap() != null ->
        "AOP_" + idSource.findAopIdWrap()!!.OPID()!!.text.toCharArray().joinToString("") {
            it.code.toString()
        }
    else -> throw RuntimeException("'${idSource.text}' is invalid Id")
}