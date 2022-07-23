package foldenx.parser.example

import foldenx.parser.raw.FoldingLexer
import foldenx.parser.raw.FoldingParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

fun usingAntlrGenerationParserTest(input: String = """
    interface Console {
        log(msg String) Unit
    }

    console foreign Console

    myFunc[a ~ [Calc(a)]](x a) = (x * 2 + 7) * (x + 9) * pi

    main() = {
        console.log(myFunc(1))
    }
""".trimIndent()): FoldingParser.FileContext {
    val stream = CharStreams.fromString(input)
    val lexer = FoldingLexer(stream)
    val parser = FoldingParser(CommonTokenStream(lexer))

    val root = parser.file()

    val definitions = root.findDefinition().distinctBy { it.text }

    println(definitions.joinToString("\n\n","=== Definitions ===\n\n","\n\n===================") {
        when {
            it.findDef() != null -> "Def: ${it.text}"
            it.findInterface_() != null -> "Interface: ${it.text}"
            it.findType() != null -> "Type: ${it.text}"
            it.findData() != null -> "Data: ${it.text}"
            it.findVal_() != null -> "Val: ${it.text}"
            it.findVar_() != null -> "Var: ${it.text}"
            it.findImpl() != null -> "Impl: ${it.text}"
            else -> "[Error]"
        }
    })

    return root
}