package foldenx.parser.example

import foldingx.parser.FoldingLexer
import foldingx.parser.FoldingParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

fun usingAntlrGenerationParserTest(input: String = """
    package samples

    class Console {
        log (msg~String) Unit
    }

    [|>] T R (value~T func~ (T) -> R) R = #func:(#value)

    console foreign Console `console`

    myFunc T ~ Calc(T) (x~T) T = (#x + 2) + (#x * 7)
    inverse r (T (#r - 2)/8)

    main Unit = do {
        console:log(-6 |> 'myFunc)
    }
""".trimIndent()): FoldingParser.FileContext {
    val stream = CharStreams.fromString(input)
    val lexer = FoldingLexer(stream)
    val parser = FoldingParser(CommonTokenStream(lexer))

    val root = parser.file()

    val definitions = root.findFileCompo().mapNotNull { it.findDefinition() }

    println(definitions.joinToString("\n\n","=== Definitions ===\n\n","\n\n===================") {
        when {
            it.findDef() != null -> "Def: ${it.text}"
            it.findClass_() != null -> "Class: ${it.text}"
            else -> "[Error]"
        }
    })

    return root
}