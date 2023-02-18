package foldingx.lighttranspiler.exception

import org.antlr.v4.kotlinruntime.ParserRuleContext

open class TranspilingError(message: String) : Exception(message)

fun ParserRuleContext.getPositionText() = try {
    position!!.start.let { (l,c) -> "$l:$c" }
} catch (e: Exception) { "" }

class InvalidCode(kind: String, context: ParserRuleContext?, additionalMessage: String? = null) :
    TranspilingError(
        "Invalid $kind ${context?.getPositionText() ?: ""} ${additionalMessage?.let { ": $it" } ?: ""} ${context?.text?.let { "'$it'" } ?: ""}"
    )