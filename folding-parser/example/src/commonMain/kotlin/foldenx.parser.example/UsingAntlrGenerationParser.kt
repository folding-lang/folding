package foldenx.parser.example

import foldenx.parser.FoldingLexer
import foldenx.parser.FoldingParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

fun usingAntlrGenerationParserTest(input: String = """
    package samples

    interface Console {
        log(msg String) Unit
    }

    [>>=]#bind[T R](value T  func (T) -> R) R = func(value)

    console external Console

    myFunc[a ~ Calc(a)](x a) = (x * 2 + 7) * (x + 9)

    main = do {
        console:log(1 >>= myFunc)
    }
""".trimIndent()): FoldingParser.FileContext {
    val stream = CharStreams.fromString(input)
    val lexer = FoldingLexer(stream)
    val parser = FoldingParser(CommonTokenStream(lexer))

    val root = parser.file()

    val definitions = root.findDefinition()

    println(definitions.joinToString("\n\n","=== Definitions ===\n\n","\n\n===================") {
        when {
            it.findDef() != null -> "Def: ${it.text}"
            it.findInterface_() != null -> "Interface: ${it.text}"
            it.findClass_() != null -> "Class: ${it.text}"
            else -> "[Error]"
        }
    })

    return root
}