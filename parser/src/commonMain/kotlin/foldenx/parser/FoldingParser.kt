package foldenx.parser

import foldenx.parser.raw.FoldingLexer
import foldenx.parser.raw.FoldingParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

class FoldingParser(rawParser: FoldingParser) {
    companion object {
        fun fromString(string: String) =
            FoldingParser(CommonTokenStream(FoldingLexer(CharStreams.fromString(string))))
    }
}