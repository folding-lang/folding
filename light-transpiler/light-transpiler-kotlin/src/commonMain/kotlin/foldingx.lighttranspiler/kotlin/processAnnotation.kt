package foldingx.lighttranspiler.kotlin

import foldingx.lighttranspiler.kotlin.effect.EffectKt
import foldingx.parser.FoldingParser

fun processAnnotationBlock(
    fdAnnotationBlockContext: FoldingParser.AnnotationBlockContext,
    valueTranspilerKt: LightValueTranspilerKt,
    effect: EffectKt
): String =
    fdAnnotationBlockContext.findAnnotation().joinToString("\n") { processAnnotation(it,valueTranspilerKt,effect) }

fun processAnnotation(
    fdAnnotationContext: FoldingParser.AnnotationContext,
    valueTranspilerKt: LightValueTranspilerKt,
    effect: EffectKt
): String =
    "@" + (fdAnnotationContext.findPackage_()?.let { it.text + "." } ?: "") +
            fdAnnotationContext.ID()!!.text +
            (fdAnnotationContext.findArgValue()?.let { valueTranspilerKt.processArgValue(it,effect) } ?: "")
