package foldenx.parser.example

import foldenx.parser.FoldingLexer
import foldenx.parser.FoldingParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

fun usingAntlrGenerationParserTest(input: String = """
    package samples
    
    class Console {
    }
    
    data Console {
        log(msg String) external Unit
    }

    console external Console

    myFunc[a ~ Calc(a)](x a) = (x * 2 + 7) * (x + 9)

    main = immediately do {
        console:log(myFunc(1))
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
            it.findTypeclass() != null -> "Typeclass: ${it.text}"
            it.findClass_() != null -> "Class: ${it.text}"
            it.findVal_() != null -> "Val: ${it.text}"
            it.findVar_() != null -> "Var: ${it.text}"
            it.findImpl() != null -> "Impl: ${it.text}"
            else -> "[Error]"
        }
    })

    return root
}