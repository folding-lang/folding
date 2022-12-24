package foldingx.lighttranspiler.exception

import org.antlr.v4.kotlinruntime.ParserRuleContext

class TranspilingError(message: String) : Exception(message)

fun ParserRuleContext.getPositionText() = try {
    position!!.start.let { (l,c) -> "$l:$c" }
} catch (e: Exception) { "" }

fun invalidCode(kind: String, context: ParserRuleContext) =
    TranspilingError(
        "Invalid $kind ${context.getPositionText()} '${context.text}'"
    )