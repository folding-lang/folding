package foldingx.lighttranspiler.kotlin

import foldingx.parser.FoldingParser

fun processAnnotationBlock(fdAnnotationBlockContext: FoldingParser.AnnotationBlockContext, valueTranspilerKt: LightValueTranspilerKt): String =
    fdAnnotationBlockContext.findAnnotation().joinToString("\n") { processAnnotation(it,valueTranspilerKt) }

fun processAnnotation(fdAnnotationContext: FoldingParser.AnnotationContext, valueTranspilerKt: LightValueTranspilerKt): String =
    "@" + (fdAnnotationContext.findPackage_()?.let { it.text + "." } ?: "") +
            fdAnnotationContext.ID()!!.text +
            (fdAnnotationContext.findArgValue()?.let { valueTranspilerKt.processArgValue(it) } ?: "")
