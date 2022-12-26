import foldingx.lighttranspiler.kotlin.LightTranspilerKt
import foldingx.parser.FoldingLexer
import foldingx.parser.FoldingParser
import org.antlr.v4.kotlinruntime.ANTLRFileStream
import org.antlr.v4.kotlinruntime.CommonTokenStream

suspend fun main() {
    val transpiler = object : LightTranspilerKt {
        override fun processJustMultiClass(fdJustMultiClassContext: FoldingParser.JustMultiClassContext): String {
            TODO("Not yet implemented")
        }
    }
    val rawLexer = FoldingLexer(ANTLRFileStream.invoke("samples/TestFFI4JsConsole.fd"))
    val rawParser = FoldingParser(CommonTokenStream(rawLexer))

    transpiler.transpile(rawParser.file()).let(::println)
}