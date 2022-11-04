package foldenx.parser.example

import foldingx.parser.FoldingLexer
import foldingx.parser.FoldingParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

fun usingAntlrGenerationParserTest(input: String = """
    package samples

    class Console {
        log: msg String => :Unit
    }

    [|>]#pipe T R: value T func (T) -> R => :R func(value)

    console foreign Console

    myFunc T ~ Calc(T): x T => :T (x * 2 + 7) * (x + 9)

    main => :Unit do {
        console:log(-1 |> myFunc)
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
            it.findClass_() != null -> "Class: ${it.text}"
            else -> "[Error]"
        }
    })

    return root
}