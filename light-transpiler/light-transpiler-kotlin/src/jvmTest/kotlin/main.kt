import com.strumenta.kotlinmultiplatform.BitSet
import foldingx.lighttranspiler.kotlin.DefaultLightTranspilerKt
import foldingx.lighttranspiler.kotlin.LightClassTranspilerKt
import foldingx.lighttranspiler.kotlin.LightTranspilerKt
import foldingx.parser.FoldingLexer
import foldingx.parser.FoldingParser
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.ATNConfigSet
import org.antlr.v4.kotlinruntime.dfa.DFA
import java.io.File

fun main() {
    val transpiler = DefaultLightTranspilerKt
//    val rawLexer = FoldingLexer(ANTLRFileStream.invoke("folding-stdlib/src/main/folding/folding/Number.fd"))
//    val rawParser = FoldingParser(CommonTokenStream(rawLexer))
    val sourceRoot = "samples"
    val (parserList,fileContextList) = File(sourceRoot)
        .listFiles { _, name -> name.endsWith(".fd") }!!
        .map {
            val parser = FoldingParser(CommonTokenStream(FoldingLexer(CharStreams.fromFileName(it.path))))
            parser to parser.file()
        }
        .unzip()

    fun testTranspiling() {
        val fileWrapperList = transpiler.transpilePackage(sourceRoot,fileContextList)

        val outputSourceRoot = "$sourceRoot/kotlin"
        val outputFileList = fileWrapperList.map {
            File(it.dirText.replace(sourceRoot,outputSourceRoot)).mkdirs()
            File(it.dirText.replace(sourceRoot,outputSourceRoot) + "/${it.name}").apply {
                path.let(::println)
                createNewFile()
                writeText(it.content)
            }
        }
    }

    testTranspiling()
}