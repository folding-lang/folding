import foldingx.lighttranspiler.kotlin.LightClassTranspilerKt
import foldingx.lighttranspiler.kotlin.LightTranspilerKt
import foldingx.parser.FoldingLexer
import foldingx.parser.FoldingParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import java.io.File

fun main() {
    val transpiler = object : LightTranspilerKt {
        override fun getClassTranspilerKt(): LightClassTranspilerKt = this
    }
//    val rawLexer = FoldingLexer(ANTLRFileStream.invoke("folding-stdlib/src/main/folding/folding/Number.fd"))
//    val rawParser = FoldingParser(CommonTokenStream(rawLexer))
    val sourceRoot = "samples"
    val fileContextList = File(sourceRoot)
        .listFiles { _, name -> name.endsWith(".fd") }!!
        .map {
            FoldingParser(CommonTokenStream(FoldingLexer(CharStreams.fromFileName(it.path)))).file()
        }

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