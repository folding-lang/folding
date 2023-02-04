// Generated from java-escape by ANTLR 4.7.1
package foldingx.parser

import com.strumenta.kotlinmultiplatform.asCharArray
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.ThreadLocal
import org.antlr.v4.kotlinruntime.Vocabulary
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA

class FoldingLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "Folding.g4"

    override val atn: ATN
		get() = FoldingLexer.Companion.ATN

    override val vocabulary: Vocabulary
        get() = FoldingLexer.Companion.VOCABULARY

	@ThreadLocal
	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES: List<String?> = listOf(null, null, null, null, 
		                                                  "'annotation'", "'class'", 
		                                                  "'do'", "'foreign'", 
		                                                  "'package'", "'internal'", 
		                                                  "'import'", "'impl'", 
		                                                  "'inherit'", "'return'", 
		                                                  "'mutable'", "'inverse'", 
		                                                  "'from'", "'if'", "'else'", 
		                                                  "'new'", "'let'", "'Int'", 
		                                                  "'Long'", "'Double'", 
		                                                  "'Float'", "'Byte'", 
		                                                  "'Char'", "'String'", 
		                                                  "'Boolean'", "'Unit'", 
		                                                  "'null'", "'true'", 
		                                                  "'false'", "'='", "'...'", 
		                                                  "'.'", "'('", "')'", 
		                                                  "'['", "']'", "'{'", 
		                                                  "'}'", "'->'", "'~'", 
		                                                  "'~>'", "':'", "'::'", 
		                                                  "':#'", "'''", "':''", 
		                                                  "'#'", "'?'")
		private val SYMBOLIC_NAMES: List<String?> = listOf(null, "WS", "COMMENT", 
		                                                   "LINE_COMMENT", "ANNOTATION", 
		                                                   "CLASS", "DO", "FOREIGN", 
		                                                   "NAMESPACE", "INTERNAL", 
		                                                   "IMPORT", "IMPL", "INHERIT", 
		                                                   "RETURN", "MUTABLE", 
		                                                   "INVERSE", "FROM", 
		                                                   "IF", "ELSE", "NEW", 
		                                                   "LET", "INT", "LONG", 
		                                                   "DOUBLE", "FLOAT", 
		                                                   "BYTE", "CHAR", "STRING", 
		                                                   "BOOLEAN", "UNIT", 
		                                                   "NULL", "TRUE", "FALSE", 
		                                                   "ASSGIN", "ELLIPSIS", 
		                                                   "DOT", "LPAREN", "RPAREN", 
		                                                   "LSQUARE", "RSQUARE", 
		                                                   "LBRACE", "RBRACE", 
		                                                   "ARROW", "TILDE", "As", 
		                                                   "COLON", "DOUBLECOLON", 
		                                                   "COLONSHARP", "QUOTE", 
		                                                   "COLONQUOTE", "SHARP", 
		                                                   "QM", "ID", "OPID", 
		                                                   "Integer", "Double", 
		                                                   "String", "RawString")

		val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u003b\u01c5\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0003\u0002\u0006\u0002\u0085\u000a\u0002\u000d\u0002\u000e\u0002\u0086\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u008f\u000a\u0003\u000c\u0003\u000e\u0003\u0092\u000b\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u009d\u000a\u0004\u000c\u0004\u000e\u0004\u00a0\u000b\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035\u0003\u0036\u0003\u0036\u0003\u0037\u0003\u0037\u0003\u0038\u0003\u0038\u0007\u0038\u018a\u000a\u0038\u000c\u0038\u000e\u0038\u018d\u000b\u0038\u0003\u0039\u0006\u0039\u0190\u000a\u0039\u000d\u0039\u000e\u0039\u0191\u0003\u003a\u0003\u003a\u0003\u003b\u0006\u003b\u0197\u000a\u003b\u000d\u003b\u000e\u003b\u0198\u0003\u003c\u0006\u003c\u019c\u000a\u003c\u000d\u003c\u000e\u003c\u019d\u0003\u003c\u0003\u003c\u0006\u003c\u01a2\u000a\u003c\u000d\u003c\u000e\u003c\u01a3\u0003\u003d\u0003\u003d\u0003\u003d\u0007\u003d\u01a9\u000a\u003d\u000c\u003d\u000e\u003d\u01ac\u000b\u003d\u0003\u003d\u0003\u003d\u0003\u003e\u0003\u003e\u0003\u003e\u0005\u003e\u01b3\u000a\u003e\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u0040\u0003\u0040\u0003\u0041\u0003\u0041\u0007\u0041\u01bf\u000a\u0041\u000c\u0041\u000e\u0041\u01c2\u000b\u0041\u0003\u0041\u0003\u0041\u0003\u0090\u0002\u0042\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011\u0021\u0012\u0023\u0013\u0025\u0014\u0027\u0015\u0029\u0016\u002b\u0017\u002d\u0018\u002f\u0019\u0031\u001a\u0033\u001b\u0035\u001c\u0037\u001d\u0039\u001e\u003b\u001f\u003d\u0020\u003f\u0021\u0041\u0022\u0043\u0023\u0045\u0024\u0047\u0025\u0049\u0026\u004b\u0027\u004d\u0028\u004f\u0029\u0051\u002a\u0053\u002b\u0055\u002c\u0057\u002d\u0059\u002e\u005b\u002f\u005d\u0030\u005f\u0031\u0061\u0032\u0063\u0033\u0065\u0034\u0067\u0035\u0069\u0002\u006b\u0002\u006d\u0002\u006f\u0036\u0071\u0037\u0073\u0002\u0075\u0038\u0077\u0039\u0079\u003a\u007b\u0002\u007d\u0002\u007f\u0002\u0081\u003b\u0003\u0002\u000c\u0005\u0002\u000b\u000c\u000e\u000f\u0022\u0022\u0004\u0002\u000c\u000c\u000f\u000f\u0005\u0002\u0043\u005c\u0061\u0061\u0063\u007c\u0007\u0002\u002f\u002f\u0032\u003b\u0043\u005c\u0061\u0061\u0063\u007c\u000a\u0002\u0023\u0023\u0026\u0028\u002c\u0031\u003d\u0042\u005e\u005e\u0060\u0060\u007e\u007e\u0080\u0080\u0003\u0002\u0032\u003b\u0004\u0002\u0024\u0024\u005e\u005e\u000a\u0002\u0024\u0024\u0031\u0031\u005e\u005e\u0064\u0064\u0068\u0068\u0070\u0070\u0074\u0074\u0076\u0076\u0005\u0002\u0032\u003b\u0043\u0048\u0063\u0068\u0003\u0002\u0062\u0062\u0002\u01c9\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002\u0021\u0003\u0002\u0002\u0002\u0002\u0023\u0003\u0002\u0002\u0002\u0002\u0025\u0003\u0002\u0002\u0002\u0002\u0027\u0003\u0002\u0002\u0002\u0002\u0029\u0003\u0002\u0002\u0002\u0002\u002b\u0003\u0002\u0002\u0002\u0002\u002d\u0003\u0002\u0002\u0002\u0002\u002f\u0003\u0002\u0002\u0002\u0002\u0031\u0003\u0002\u0002\u0002\u0002\u0033\u0003\u0002\u0002\u0002\u0002\u0035\u0003\u0002\u0002\u0002\u0002\u0037\u0003\u0002\u0002\u0002\u0002\u0039\u0003\u0002\u0002\u0002\u0002\u003b\u0003\u0002\u0002\u0002\u0002\u003d\u0003\u0002\u0002\u0002\u0002\u003f\u0003\u0002\u0002\u0002\u0002\u0041\u0003\u0002\u0002\u0002\u0002\u0043\u0003\u0002\u0002\u0002\u0002\u0045\u0003\u0002\u0002\u0002\u0002\u0047\u0003\u0002\u0002\u0002\u0002\u0049\u0003\u0002\u0002\u0002\u0002\u004b\u0003\u0002\u0002\u0002\u0002\u004d\u0003\u0002\u0002\u0002\u0002\u004f\u0003\u0002\u0002\u0002\u0002\u0051\u0003\u0002\u0002\u0002\u0002\u0053\u0003\u0002\u0002\u0002\u0002\u0055\u0003\u0002\u0002\u0002\u0002\u0057\u0003\u0002\u0002\u0002\u0002\u0059\u0003\u0002\u0002\u0002\u0002\u005b\u0003\u0002\u0002\u0002\u0002\u005d\u0003\u0002\u0002\u0002\u0002\u005f\u0003\u0002\u0002\u0002\u0002\u0061\u0003\u0002\u0002\u0002\u0002\u0063\u0003\u0002\u0002\u0002\u0002\u0065\u0003\u0002\u0002\u0002\u0002\u0067\u0003\u0002\u0002\u0002\u0002\u006f\u0003\u0002\u0002\u0002\u0002\u0071\u0003\u0002\u0002\u0002\u0002\u0075\u0003\u0002\u0002\u0002\u0002\u0077\u0003\u0002\u0002\u0002\u0002\u0079\u0003\u0002\u0002\u0002\u0002\u0081\u0003\u0002\u0002\u0002\u0003\u0084\u0003\u0002\u0002\u0002\u0005\u008a\u0003\u0002\u0002\u0002\u0007\u0098\u0003\u0002\u0002\u0002\u0009\u00a3\u0003\u0002\u0002\u0002\u000b\u00ae\u0003\u0002\u0002\u0002\u000d\u00b4\u0003\u0002\u0002\u0002\u000f\u00b7\u0003\u0002\u0002\u0002\u0011\u00bf\u0003\u0002\u0002\u0002\u0013\u00c7\u0003\u0002\u0002\u0002\u0015\u00d0\u0003\u0002\u0002\u0002\u0017\u00d7\u0003\u0002\u0002\u0002\u0019\u00dc\u0003\u0002\u0002\u0002\u001b\u00e4\u0003\u0002\u0002\u0002\u001d\u00eb\u0003\u0002\u0002\u0002\u001f\u00f3\u0003\u0002\u0002\u0002\u0021\u00fb\u0003\u0002\u0002\u0002\u0023\u0100\u0003\u0002\u0002\u0002\u0025\u0103\u0003\u0002\u0002\u0002\u0027\u0108\u0003\u0002\u0002\u0002\u0029\u010c\u0003\u0002\u0002\u0002\u002b\u0110\u0003\u0002\u0002\u0002\u002d\u0114\u0003\u0002\u0002\u0002\u002f\u0119\u0003\u0002\u0002\u0002\u0031\u0120\u0003\u0002\u0002\u0002\u0033\u0126\u0003\u0002\u0002\u0002\u0035\u012b\u0003\u0002\u0002\u0002\u0037\u0130\u0003\u0002\u0002\u0002\u0039\u0137\u0003\u0002\u0002\u0002\u003b\u013f\u0003\u0002\u0002\u0002\u003d\u0144\u0003\u0002\u0002\u0002\u003f\u0149\u0003\u0002\u0002\u0002\u0041\u014e\u0003\u0002\u0002\u0002\u0043\u0154\u0003\u0002\u0002\u0002\u0045\u0156\u0003\u0002\u0002\u0002\u0047\u015a\u0003\u0002\u0002\u0002\u0049\u015c\u0003\u0002\u0002\u0002\u004b\u015e\u0003\u0002\u0002\u0002\u004d\u0160\u0003\u0002\u0002\u0002\u004f\u0162\u0003\u0002\u0002\u0002\u0051\u0164\u0003\u0002\u0002\u0002\u0053\u0166\u0003\u0002\u0002\u0002\u0055\u0168\u0003\u0002\u0002\u0002\u0057\u016b\u0003\u0002\u0002\u0002\u0059\u016d\u0003\u0002\u0002\u0002\u005b\u0170\u0003\u0002\u0002\u0002\u005d\u0172\u0003\u0002\u0002\u0002\u005f\u0175\u0003\u0002\u0002\u0002\u0061\u0178\u0003\u0002\u0002\u0002\u0063\u017a\u0003\u0002\u0002\u0002\u0065\u017d\u0003\u0002\u0002\u0002\u0067\u017f\u0003\u0002\u0002\u0002\u0069\u0181\u0003\u0002\u0002\u0002\u006b\u0183\u0003\u0002\u0002\u0002\u006d\u0185\u0003\u0002\u0002\u0002\u006f\u0187\u0003\u0002\u0002\u0002\u0071\u018f\u0003\u0002\u0002\u0002\u0073\u0193\u0003\u0002\u0002\u0002\u0075\u0196\u0003\u0002\u0002\u0002\u0077\u019b\u0003\u0002\u0002\u0002\u0079\u01a5\u0003\u0002\u0002\u0002\u007b\u01af\u0003\u0002\u0002\u0002\u007d\u01b4\u0003\u0002\u0002\u0002\u007f\u01ba\u0003\u0002\u0002\u0002\u0081\u01bc\u0003\u0002\u0002\u0002\u0083\u0085\u0009\u0002\u0002\u0002\u0084\u0083\u0003\u0002\u0002\u0002\u0085\u0086\u0003\u0002\u0002\u0002\u0086\u0084\u0003\u0002\u0002\u0002\u0086\u0087\u0003\u0002\u0002\u0002\u0087\u0088\u0003\u0002\u0002\u0002\u0088\u0089\u0008\u0002\u0002\u0002\u0089\u0004\u0003\u0002\u0002\u0002\u008a\u008b\u0007\u0031\u0002\u0002\u008b\u008c\u0007\u002c\u0002\u0002\u008c\u0090\u0003\u0002\u0002\u0002\u008d\u008f\u000b\u0002\u0002\u0002\u008e\u008d\u0003\u0002\u0002\u0002\u008f\u0092\u0003\u0002\u0002\u0002\u0090\u0091\u0003\u0002\u0002\u0002\u0090\u008e\u0003\u0002\u0002\u0002\u0091\u0093\u0003\u0002\u0002\u0002\u0092\u0090\u0003\u0002\u0002\u0002\u0093\u0094\u0007\u002c\u0002\u0002\u0094\u0095\u0007\u0031\u0002\u0002\u0095\u0096\u0003\u0002\u0002\u0002\u0096\u0097\u0008\u0003\u0002\u0002\u0097\u0006\u0003\u0002\u0002\u0002\u0098\u0099\u0007\u0031\u0002\u0002\u0099\u009a\u0007\u0031\u0002\u0002\u009a\u009e\u0003\u0002\u0002\u0002\u009b\u009d\u000a\u0003\u0002\u0002\u009c\u009b\u0003\u0002\u0002\u0002\u009d\u00a0\u0003\u0002\u0002\u0002\u009e\u009c\u0003\u0002\u0002\u0002\u009e\u009f\u0003\u0002\u0002\u0002\u009f\u00a1\u0003\u0002\u0002\u0002\u00a0\u009e\u0003\u0002\u0002\u0002\u00a1\u00a2\u0008\u0004\u0002\u0002\u00a2\u0008\u0003\u0002\u0002\u0002\u00a3\u00a4\u0007\u0063\u0002\u0002\u00a4\u00a5\u0007\u0070\u0002\u0002\u00a5\u00a6\u0007\u0070\u0002\u0002\u00a6\u00a7\u0007\u0071\u0002\u0002\u00a7\u00a8\u0007\u0076\u0002\u0002\u00a8\u00a9\u0007\u0063\u0002\u0002\u00a9\u00aa\u0007\u0076\u0002\u0002\u00aa\u00ab\u0007\u006b\u0002\u0002\u00ab\u00ac\u0007\u0071\u0002\u0002\u00ac\u00ad\u0007\u0070\u0002\u0002\u00ad\u000a\u0003\u0002\u0002\u0002\u00ae\u00af\u0007\u0065\u0002\u0002\u00af\u00b0\u0007\u006e\u0002\u0002\u00b0\u00b1\u0007\u0063\u0002\u0002\u00b1\u00b2\u0007\u0075\u0002\u0002\u00b2\u00b3\u0007\u0075\u0002\u0002\u00b3\u000c\u0003\u0002\u0002\u0002\u00b4\u00b5\u0007\u0066\u0002\u0002\u00b5\u00b6\u0007\u0071\u0002\u0002\u00b6\u000e\u0003\u0002\u0002\u0002\u00b7\u00b8\u0007\u0068\u0002\u0002\u00b8\u00b9\u0007\u0071\u0002\u0002\u00b9\u00ba\u0007\u0074\u0002\u0002\u00ba\u00bb\u0007\u0067\u0002\u0002\u00bb\u00bc\u0007\u006b\u0002\u0002\u00bc\u00bd\u0007\u0069\u0002\u0002\u00bd\u00be\u0007\u0070\u0002\u0002\u00be\u0010\u0003\u0002\u0002\u0002\u00bf\u00c0\u0007\u0072\u0002\u0002\u00c0\u00c1\u0007\u0063\u0002\u0002\u00c1\u00c2\u0007\u0065\u0002\u0002\u00c2\u00c3\u0007\u006d\u0002\u0002\u00c3\u00c4\u0007\u0063\u0002\u0002\u00c4\u00c5\u0007\u0069\u0002\u0002\u00c5\u00c6\u0007\u0067\u0002\u0002\u00c6\u0012\u0003\u0002\u0002\u0002\u00c7\u00c8\u0007\u006b\u0002\u0002\u00c8\u00c9\u0007\u0070\u0002\u0002\u00c9\u00ca\u0007\u0076\u0002\u0002\u00ca\u00cb\u0007\u0067\u0002\u0002\u00cb\u00cc\u0007\u0074\u0002\u0002\u00cc\u00cd\u0007\u0070\u0002\u0002\u00cd\u00ce\u0007\u0063\u0002\u0002\u00ce\u00cf\u0007\u006e\u0002\u0002\u00cf\u0014\u0003\u0002\u0002\u0002\u00d0\u00d1\u0007\u006b\u0002\u0002\u00d1\u00d2\u0007\u006f\u0002\u0002\u00d2\u00d3\u0007\u0072\u0002\u0002\u00d3\u00d4\u0007\u0071\u0002\u0002\u00d4\u00d5\u0007\u0074\u0002\u0002\u00d5\u00d6\u0007\u0076\u0002\u0002\u00d6\u0016\u0003\u0002\u0002\u0002\u00d7\u00d8\u0007\u006b\u0002\u0002\u00d8\u00d9\u0007\u006f\u0002\u0002\u00d9\u00da\u0007\u0072\u0002\u0002\u00da\u00db\u0007\u006e\u0002\u0002\u00db\u0018\u0003\u0002\u0002\u0002\u00dc\u00dd\u0007\u006b\u0002\u0002\u00dd\u00de\u0007\u0070\u0002\u0002\u00de\u00df\u0007\u006a\u0002\u0002\u00df\u00e0\u0007\u0067\u0002\u0002\u00e0\u00e1\u0007\u0074\u0002\u0002\u00e1\u00e2\u0007\u006b\u0002\u0002\u00e2\u00e3\u0007\u0076\u0002\u0002\u00e3\u001a\u0003\u0002\u0002\u0002\u00e4\u00e5\u0007\u0074\u0002\u0002\u00e5\u00e6\u0007\u0067\u0002\u0002\u00e6\u00e7\u0007\u0076\u0002\u0002\u00e7\u00e8\u0007\u0077\u0002\u0002\u00e8\u00e9\u0007\u0074\u0002\u0002\u00e9\u00ea\u0007\u0070\u0002\u0002\u00ea\u001c\u0003\u0002\u0002\u0002\u00eb\u00ec\u0007\u006f\u0002\u0002\u00ec\u00ed\u0007\u0077\u0002\u0002\u00ed\u00ee\u0007\u0076\u0002\u0002\u00ee\u00ef\u0007\u0063\u0002\u0002\u00ef\u00f0\u0007\u0064\u0002\u0002\u00f0\u00f1\u0007\u006e\u0002\u0002\u00f1\u00f2\u0007\u0067\u0002\u0002\u00f2\u001e\u0003\u0002\u0002\u0002\u00f3\u00f4\u0007\u006b\u0002\u0002\u00f4\u00f5\u0007\u0070\u0002\u0002\u00f5\u00f6\u0007\u0078\u0002\u0002\u00f6\u00f7\u0007\u0067\u0002\u0002\u00f7\u00f8\u0007\u0074\u0002\u0002\u00f8\u00f9\u0007\u0075\u0002\u0002\u00f9\u00fa\u0007\u0067\u0002\u0002\u00fa\u0020\u0003\u0002\u0002\u0002\u00fb\u00fc\u0007\u0068\u0002\u0002\u00fc\u00fd\u0007\u0074\u0002\u0002\u00fd\u00fe\u0007\u0071\u0002\u0002\u00fe\u00ff\u0007\u006f\u0002\u0002\u00ff\u0022\u0003\u0002\u0002\u0002\u0100\u0101\u0007\u006b\u0002\u0002\u0101\u0102\u0007\u0068\u0002\u0002\u0102\u0024\u0003\u0002\u0002\u0002\u0103\u0104\u0007\u0067\u0002\u0002\u0104\u0105\u0007\u006e\u0002\u0002\u0105\u0106\u0007\u0075\u0002\u0002\u0106\u0107\u0007\u0067\u0002\u0002\u0107\u0026\u0003\u0002\u0002\u0002\u0108\u0109\u0007\u0070\u0002\u0002\u0109\u010a\u0007\u0067\u0002\u0002\u010a\u010b\u0007\u0079\u0002\u0002\u010b\u0028\u0003\u0002\u0002\u0002\u010c\u010d\u0007\u006e\u0002\u0002\u010d\u010e\u0007\u0067\u0002\u0002\u010e\u010f\u0007\u0076\u0002\u0002\u010f\u002a\u0003\u0002\u0002\u0002\u0110\u0111\u0007\u004b\u0002\u0002\u0111\u0112\u0007\u0070\u0002\u0002\u0112\u0113\u0007\u0076\u0002\u0002\u0113\u002c\u0003\u0002\u0002\u0002\u0114\u0115\u0007\u004e\u0002\u0002\u0115\u0116\u0007\u0071\u0002\u0002\u0116\u0117\u0007\u0070\u0002\u0002\u0117\u0118\u0007\u0069\u0002\u0002\u0118\u002e\u0003\u0002\u0002\u0002\u0119\u011a\u0007\u0046\u0002\u0002\u011a\u011b\u0007\u0071\u0002\u0002\u011b\u011c\u0007\u0077\u0002\u0002\u011c\u011d\u0007\u0064\u0002\u0002\u011d\u011e\u0007\u006e\u0002\u0002\u011e\u011f\u0007\u0067\u0002\u0002\u011f\u0030\u0003\u0002\u0002\u0002\u0120\u0121\u0007\u0048\u0002\u0002\u0121\u0122\u0007\u006e\u0002\u0002\u0122\u0123\u0007\u0071\u0002\u0002\u0123\u0124\u0007\u0063\u0002\u0002\u0124\u0125\u0007\u0076\u0002\u0002\u0125\u0032\u0003\u0002\u0002\u0002\u0126\u0127\u0007\u0044\u0002\u0002\u0127\u0128\u0007\u007b\u0002\u0002\u0128\u0129\u0007\u0076\u0002\u0002\u0129\u012a\u0007\u0067\u0002\u0002\u012a\u0034\u0003\u0002\u0002\u0002\u012b\u012c\u0007\u0045\u0002\u0002\u012c\u012d\u0007\u006a\u0002\u0002\u012d\u012e\u0007\u0063\u0002\u0002\u012e\u012f\u0007\u0074\u0002\u0002\u012f\u0036\u0003\u0002\u0002\u0002\u0130\u0131\u0007\u0055\u0002\u0002\u0131\u0132\u0007\u0076\u0002\u0002\u0132\u0133\u0007\u0074\u0002\u0002\u0133\u0134\u0007\u006b\u0002\u0002\u0134\u0135\u0007\u0070\u0002\u0002\u0135\u0136\u0007\u0069\u0002\u0002\u0136\u0038\u0003\u0002\u0002\u0002\u0137\u0138\u0007\u0044\u0002\u0002\u0138\u0139\u0007\u0071\u0002\u0002\u0139\u013a\u0007\u0071\u0002\u0002\u013a\u013b\u0007\u006e\u0002\u0002\u013b\u013c\u0007\u0067\u0002\u0002\u013c\u013d\u0007\u0063\u0002\u0002\u013d\u013e\u0007\u0070\u0002\u0002\u013e\u003a\u0003\u0002\u0002\u0002\u013f\u0140\u0007\u0057\u0002\u0002\u0140\u0141\u0007\u0070\u0002\u0002\u0141\u0142\u0007\u006b\u0002\u0002\u0142\u0143\u0007\u0076\u0002\u0002\u0143\u003c\u0003\u0002\u0002\u0002\u0144\u0145\u0007\u0070\u0002\u0002\u0145\u0146\u0007\u0077\u0002\u0002\u0146\u0147\u0007\u006e\u0002\u0002\u0147\u0148\u0007\u006e\u0002\u0002\u0148\u003e\u0003\u0002\u0002\u0002\u0149\u014a\u0007\u0076\u0002\u0002\u014a\u014b\u0007\u0074\u0002\u0002\u014b\u014c\u0007\u0077\u0002\u0002\u014c\u014d\u0007\u0067\u0002\u0002\u014d\u0040\u0003\u0002\u0002\u0002\u014e\u014f\u0007\u0068\u0002\u0002\u014f\u0150\u0007\u0063\u0002\u0002\u0150\u0151\u0007\u006e\u0002\u0002\u0151\u0152\u0007\u0075\u0002\u0002\u0152\u0153\u0007\u0067\u0002\u0002\u0153\u0042\u0003\u0002\u0002\u0002\u0154\u0155\u0007\u003f\u0002\u0002\u0155\u0044\u0003\u0002\u0002\u0002\u0156\u0157\u0007\u0030\u0002\u0002\u0157\u0158\u0007\u0030\u0002\u0002\u0158\u0159\u0007\u0030\u0002\u0002\u0159\u0046\u0003\u0002\u0002\u0002\u015a\u015b\u0007\u0030\u0002\u0002\u015b\u0048\u0003\u0002\u0002\u0002\u015c\u015d\u0007\u002a\u0002\u0002\u015d\u004a\u0003\u0002\u0002\u0002\u015e\u015f\u0007\u002b\u0002\u0002\u015f\u004c\u0003\u0002\u0002\u0002\u0160\u0161\u0007\u005d\u0002\u0002\u0161\u004e\u0003\u0002\u0002\u0002\u0162\u0163\u0007\u005f\u0002\u0002\u0163\u0050\u0003\u0002\u0002\u0002\u0164\u0165\u0007\u007d\u0002\u0002\u0165\u0052\u0003\u0002\u0002\u0002\u0166\u0167\u0007\u007f\u0002\u0002\u0167\u0054\u0003\u0002\u0002\u0002\u0168\u0169\u0007\u002f\u0002\u0002\u0169\u016a\u0007\u0040\u0002\u0002\u016a\u0056\u0003\u0002\u0002\u0002\u016b\u016c\u0007\u0080\u0002\u0002\u016c\u0058\u0003\u0002\u0002\u0002\u016d\u016e\u0007\u0080\u0002\u0002\u016e\u016f\u0007\u0040\u0002\u0002\u016f\u005a\u0003\u0002\u0002\u0002\u0170\u0171\u0007\u003c\u0002\u0002\u0171\u005c\u0003\u0002\u0002\u0002\u0172\u0173\u0007\u003c\u0002\u0002\u0173\u0174\u0007\u003c\u0002\u0002\u0174\u005e\u0003\u0002\u0002\u0002\u0175\u0176\u0007\u003c\u0002\u0002\u0176\u0177\u0007\u0025\u0002\u0002\u0177\u0060\u0003\u0002\u0002\u0002\u0178\u0179\u0007\u0029\u0002\u0002\u0179\u0062\u0003\u0002\u0002\u0002\u017a\u017b\u0007\u003c\u0002\u0002\u017b\u017c\u0007\u0029\u0002\u0002\u017c\u0064\u0003\u0002\u0002\u0002\u017d\u017e\u0007\u0025\u0002\u0002\u017e\u0066\u0003\u0002\u0002\u0002\u017f\u0180\u0007\u0041\u0002\u0002\u0180\u0068\u0003\u0002\u0002\u0002\u0181\u0182\u0009\u0004\u0002\u0002\u0182\u006a\u0003\u0002\u0002\u0002\u0183\u0184\u0009\u0005\u0002\u0002\u0184\u006c\u0003\u0002\u0002\u0002\u0185\u0186\u0009\u0006\u0002\u0002\u0186\u006e\u0003\u0002\u0002\u0002\u0187\u018b\u0005\u0069\u0035\u0002\u0188\u018a\u0005\u006b\u0036\u0002\u0189\u0188\u0003\u0002\u0002\u0002\u018a\u018d\u0003\u0002\u0002\u0002\u018b\u0189\u0003\u0002\u0002\u0002\u018b\u018c\u0003\u0002\u0002\u0002\u018c\u0070\u0003\u0002\u0002\u0002\u018d\u018b\u0003\u0002\u0002\u0002\u018e\u0190\u0005\u006d\u0037\u0002\u018f\u018e\u0003\u0002\u0002\u0002\u0190\u0191\u0003\u0002\u0002\u0002\u0191\u018f\u0003\u0002\u0002\u0002\u0191\u0192\u0003\u0002\u0002\u0002\u0192\u0072\u0003\u0002\u0002\u0002\u0193\u0194\u0009\u0007\u0002\u0002\u0194\u0074\u0003\u0002\u0002\u0002\u0195\u0197\u0005\u0073\u003a\u0002\u0196\u0195\u0003\u0002\u0002\u0002\u0197\u0198\u0003\u0002\u0002\u0002\u0198\u0196\u0003\u0002\u0002\u0002\u0198\u0199\u0003\u0002\u0002\u0002\u0199\u0076\u0003\u0002\u0002\u0002\u019a\u019c\u0005\u0073\u003a\u0002\u019b\u019a\u0003\u0002\u0002\u0002\u019c\u019d\u0003\u0002\u0002\u0002\u019d\u019b\u0003\u0002\u0002\u0002\u019d\u019e\u0003\u0002\u0002\u0002\u019e\u019f\u0003\u0002\u0002\u0002\u019f\u01a1\u0007\u0030\u0002\u0002\u01a0\u01a2\u0005\u0073\u003a\u0002\u01a1\u01a0\u0003\u0002\u0002\u0002\u01a2\u01a3\u0003\u0002\u0002\u0002\u01a3\u01a1\u0003\u0002\u0002\u0002\u01a3\u01a4\u0003\u0002\u0002\u0002\u01a4\u0078\u0003\u0002\u0002\u0002\u01a5\u01aa\u0007\u0024\u0002\u0002\u01a6\u01a9\u0005\u007b\u003e\u0002\u01a7\u01a9\u000a\u0008\u0002\u0002\u01a8\u01a6\u0003\u0002\u0002\u0002\u01a8\u01a7\u0003\u0002\u0002\u0002\u01a9\u01ac\u0003\u0002\u0002\u0002\u01aa\u01a8\u0003\u0002\u0002\u0002\u01aa\u01ab\u0003\u0002\u0002\u0002\u01ab\u01ad\u0003\u0002\u0002\u0002\u01ac\u01aa\u0003\u0002\u0002\u0002\u01ad\u01ae\u0007\u0024\u0002\u0002\u01ae\u007a\u0003\u0002\u0002\u0002\u01af\u01b2\u0007\u005e\u0002\u0002\u01b0\u01b3\u0009\u0009\u0002\u0002\u01b1\u01b3\u0005\u007d\u003f\u0002\u01b2\u01b0\u0003\u0002\u0002\u0002\u01b2\u01b1\u0003\u0002\u0002\u0002\u01b3\u007c\u0003\u0002\u0002\u0002\u01b4\u01b5\u0007\u0077\u0002\u0002\u01b5\u01b6\u0005\u007f\u0040\u0002\u01b6\u01b7\u0005\u007f\u0040\u0002\u01b7\u01b8\u0005\u007f\u0040\u0002\u01b8\u01b9\u0005\u007f\u0040\u0002\u01b9\u007e\u0003\u0002\u0002\u0002\u01ba\u01bb\u0009\u000a\u0002\u0002\u01bb\u0080\u0003\u0002\u0002\u0002\u01bc\u01c0\u0007\u0062\u0002\u0002\u01bd\u01bf\u000a\u000b\u0002\u0002\u01be\u01bd\u0003\u0002\u0002\u0002\u01bf\u01c2\u0003\u0002\u0002\u0002\u01c0\u01be\u0003\u0002\u0002\u0002\u01c0\u01c1\u0003\u0002\u0002\u0002\u01c1\u01c3\u0003\u0002\u0002\u0002\u01c2\u01c0\u0003\u0002\u0002\u0002\u01c3\u01c4\u0007\u0062\u0002\u0002\u01c4\u0082\u0003\u0002\u0002\u0002\u000f\u0002\u0086\u0090\u009e\u018b\u0191\u0198\u019d\u01a3\u01a8\u01aa\u01b2\u01c0\u0003\u0008\u0002\u0002"

		val ATN = ATNDeserializer().deserialize(serializedATN.asCharArray())
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    WS(1),
	    COMMENT(2),
	    LINE_COMMENT(3),
	    ANNOTATION(4),
	    CLASS(5),
	    DO(6),
	    FOREIGN(7),
	    NAMESPACE(8),
	    INTERNAL(9),
	    IMPORT(10),
	    IMPL(11),
	    INHERIT(12),
	    RETURN(13),
	    MUTABLE(14),
	    INVERSE(15),
	    FROM(16),
	    IF(17),
	    ELSE(18),
	    NEW(19),
	    LET(20),
	    INT(21),
	    LONG(22),
	    DOUBLE(23),
	    FLOAT(24),
	    BYTE(25),
	    CHAR(26),
	    STRING(27),
	    BOOLEAN(28),
	    UNIT(29),
	    NULL(30),
	    TRUE(31),
	    FALSE(32),
	    ASSGIN(33),
	    ELLIPSIS(34),
	    DOT(35),
	    LPAREN(36),
	    RPAREN(37),
	    LSQUARE(38),
	    RSQUARE(39),
	    LBRACE(40),
	    RBRACE(41),
	    ARROW(42),
	    TILDE(43),
	    As(44),
	    COLON(45),
	    DOUBLECOLON(46),
	    COLONSHARP(47),
	    QUOTE(48),
	    COLONQUOTE(49),
	    SHARP(50),
	    QM(51),
	    ID(52),
	    OPID(53),
	    Integer(54),
	    Double(55),
	    String(56),
	    RawString(57)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	override val channelNames = Channels.values().map(Channels::name).toTypedArray()

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    WS,
	    COMMENT,
	    LINE_COMMENT,
	    ANNOTATION,
	    CLASS,
	    DO,
	    FOREIGN,
	    NAMESPACE,
	    INTERNAL,
	    IMPORT,
	    IMPL,
	    INHERIT,
	    RETURN,
	    MUTABLE,
	    INVERSE,
	    FROM,
	    IF,
	    ELSE,
	    NEW,
	    LET,
	    INT,
	    LONG,
	    DOUBLE,
	    FLOAT,
	    BYTE,
	    CHAR,
	    STRING,
	    BOOLEAN,
	    UNIT,
	    NULL,
	    TRUE,
	    FALSE,
	    ASSGIN,
	    ELLIPSIS,
	    DOT,
	    LPAREN,
	    RPAREN,
	    LSQUARE,
	    RSQUARE,
	    LBRACE,
	    RBRACE,
	    ARROW,
	    TILDE,
	    As,
	    COLON,
	    DOUBLECOLON,
	    COLONSHARP,
	    QUOTE,
	    COLONQUOTE,
	    SHARP,
	    QM,
	    IDLETTERHEAD,
	    IDLETTERTAIL,
	    IDLETTERSPECIAL,
	    ID,
	    OPID,
	    DIGITLETTER,
	    Integer,
	    Double,
	    String,
	    ESC,
	    UNICODE,
	    HEX,
	    RawString
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}