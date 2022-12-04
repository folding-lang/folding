package foldingx.parser.func

import foldingx.parser.FoldingParser


fun processNativeDef(defContext: FoldingParser.DefContext) =
    defContext.findJustDef()?.let { processJustDef(it)  to defContext.findInverseDefining().map { processInverseDef(it) } }

fun processJustDef(justDefContext: FoldingParser.JustDefContext): CommonJustDef =
    TODO("Not yet implemented")

fun processInverseDef(inverseDefiningContext: FoldingParser.InverseDefiningContext): CommonInverseDef =
    TODO("Not yet implemented")

fun processForeignDef(foreignDefContext: FoldingParser.ForeignDefContext): CommonForeignDef =
    TODO("Not yet implemented")