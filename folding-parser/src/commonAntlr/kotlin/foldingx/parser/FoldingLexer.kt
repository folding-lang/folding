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
		                                                  "'abstract'", "'annotation'", 
		                                                  "'class'", "'do'", "'foreign'", 
		                                                  "'package'", "'internal'", 
		                                                  "'import'", "'impl'", 
		                                                  "'inherit'", "'return'", 
		                                                  "'mutable'", "'interface'", 
		                                                  "'data'", "'inverse'", 
		                                                  "'expect'", "'if'", 
		                                                  "'else'", "'new'", "'let'", 
		                                                  "'typealias'", "'from!'", 
		                                                  "'is!'", "'Int'", "'Long'", 
		                                                  "'Double'", "'Float'", 
		                                                  "'Byte'", "'Char'", 
		                                                  "'String'", "'Boolean'", 
		                                                  "'Unit'", "'null'", 
		                                                  "'true'", "'false'", 
		                                                  "'@'", "'='", "'...'", 
		                                                  "'.'", "'('", "')'", 
		                                                  "'['", "']'", "'{'", 
		                                                  "'}'", "'->'", "'->?'", 
		                                                  "'~'", "'~>'", "':'", 
		                                                  "'::'", "':#'", "'''", 
		                                                  "':''", "'#'", "'?'")
		private val SYMBOLIC_NAMES: List<String?> = listOf(null, "WS", "COMMENT", 
		                                                   "LINE_COMMENT", "ABSTRACT", 
		                                                   "ANNOTATION", "CLASS", 
		                                                   "DO", "FOREIGN", "NAMESPACE", 
		                                                   "INTERNAL", "IMPORT", 
		                                                   "IMPL", "INHERIT", 
		                                                   "RETURN", "MUTABLE", 
		                                                   "INTERFACE", "DATA", 
		                                                   "INVERSE", "EXPECT", 
		                                                   "IF", "ELSE", "NEW", 
		                                                   "LET", "TYPEALIAS", 
		                                                   "FROM", "IS", "INT", 
		                                                   "LONG", "DOUBLE", "FLOAT", 
		                                                   "BYTE", "CHAR", "STRING", 
		                                                   "BOOLEAN", "UNIT", 
		                                                   "NULL", "TRUE", "FALSE", 
		                                                   "ALPHA", "ASSGIN", 
		                                                   "ELLIPSIS", "DOT", 
		                                                   "LPAREN", "RPAREN", 
		                                                   "LSQUARE", "RSQUARE", 
		                                                   "LBRACE", "RBRACE", 
		                                                   "ARROW", "ARROWQM", 
		                                                   "TILDE", "As", "COLON", 
		                                                   "DOUBLECOLON", "COLONSHARP", 
		                                                   "QUOTE", "COLONQUOTE", 
		                                                   "SHARP", "QM", "ID", 
		                                                   "OPID", "Integer", 
		                                                   "Double", "String", 
		                                                   "RawString")

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

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u0043\u0209\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0004\u0042\u0009\u0042\u0004\u0043\u0009\u0043\u0004\u0044\u0009\u0044\u0004\u0045\u0009\u0045\u0004\u0046\u0009\u0046\u0004\u0047\u0009\u0047\u0004\u0048\u0009\u0048\u0004\u0049\u0009\u0049\u0003\u0002\u0006\u0002\u0095\u000a\u0002\u000d\u0002\u000e\u0002\u0096\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u009f\u000a\u0003\u000c\u0003\u000e\u0003\u00a2\u000b\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u00ad\u000a\u0004\u000c\u0004\u000e\u0004\u00b0\u000b\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0036\u0003\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0039\u0003\u0039\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003b\u0003\u003b\u0003\u003c\u0003\u003c\u0003\u003d\u0003\u003d\u0003\u003e\u0003\u003e\u0003\u003f\u0003\u003f\u0003\u0040\u0003\u0040\u0007\u0040\u01ce\u000a\u0040\u000c\u0040\u000e\u0040\u01d1\u000b\u0040\u0003\u0041\u0006\u0041\u01d4\u000a\u0041\u000d\u0041\u000e\u0041\u01d5\u0003\u0042\u0003\u0042\u0003\u0043\u0006\u0043\u01db\u000a\u0043\u000d\u0043\u000e\u0043\u01dc\u0003\u0044\u0006\u0044\u01e0\u000a\u0044\u000d\u0044\u000e\u0044\u01e1\u0003\u0044\u0003\u0044\u0006\u0044\u01e6\u000a\u0044\u000d\u0044\u000e\u0044\u01e7\u0003\u0045\u0003\u0045\u0003\u0045\u0007\u0045\u01ed\u000a\u0045\u000c\u0045\u000e\u0045\u01f0\u000b\u0045\u0003\u0045\u0003\u0045\u0003\u0046\u0003\u0046\u0003\u0046\u0005\u0046\u01f7\u000a\u0046\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0048\u0003\u0048\u0003\u0049\u0003\u0049\u0007\u0049\u0203\u000a\u0049\u000c\u0049\u000e\u0049\u0206\u000b\u0049\u0003\u0049\u0003\u0049\u0003\u00a0\u0002\u004a\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011\u0021\u0012\u0023\u0013\u0025\u0014\u0027\u0015\u0029\u0016\u002b\u0017\u002d\u0018\u002f\u0019\u0031\u001a\u0033\u001b\u0035\u001c\u0037\u001d\u0039\u001e\u003b\u001f\u003d\u0020\u003f\u0021\u0041\u0022\u0043\u0023\u0045\u0024\u0047\u0025\u0049\u0026\u004b\u0027\u004d\u0028\u004f\u0029\u0051\u002a\u0053\u002b\u0055\u002c\u0057\u002d\u0059\u002e\u005b\u002f\u005d\u0030\u005f\u0031\u0061\u0032\u0063\u0033\u0065\u0034\u0067\u0035\u0069\u0036\u006b\u0037\u006d\u0038\u006f\u0039\u0071\u003a\u0073\u003b\u0075\u003c\u0077\u003d\u0079\u0002\u007b\u0002\u007d\u0002\u007f\u003e\u0081\u003f\u0083\u0002\u0085\u0040\u0087\u0041\u0089\u0042\u008b\u0002\u008d\u0002\u008f\u0002\u0091\u0043\u0003\u0002\u000c\u0005\u0002\u000b\u000c\u000e\u000f\u0022\u0022\u0004\u0002\u000c\u000c\u000f\u000f\u0005\u0002\u0043\u005c\u0061\u0061\u0063\u007c\u0007\u0002\u002f\u002f\u0032\u003b\u0043\u005c\u0061\u0061\u0063\u007c\u000a\u0002\u0023\u0023\u0026\u0028\u002c\u0031\u003d\u0042\u005e\u005e\u0060\u0060\u007e\u007e\u0080\u0080\u0003\u0002\u0032\u003b\u0004\u0002\u0024\u0024\u005e\u005e\u000a\u0002\u0024\u0024\u0031\u0031\u005e\u005e\u0064\u0064\u0068\u0068\u0070\u0070\u0074\u0074\u0076\u0076\u0005\u0002\u0032\u003b\u0043\u0048\u0063\u0068\u0003\u0002\u0062\u0062\u0002\u020d\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002\u0021\u0003\u0002\u0002\u0002\u0002\u0023\u0003\u0002\u0002\u0002\u0002\u0025\u0003\u0002\u0002\u0002\u0002\u0027\u0003\u0002\u0002\u0002\u0002\u0029\u0003\u0002\u0002\u0002\u0002\u002b\u0003\u0002\u0002\u0002\u0002\u002d\u0003\u0002\u0002\u0002\u0002\u002f\u0003\u0002\u0002\u0002\u0002\u0031\u0003\u0002\u0002\u0002\u0002\u0033\u0003\u0002\u0002\u0002\u0002\u0035\u0003\u0002\u0002\u0002\u0002\u0037\u0003\u0002\u0002\u0002\u0002\u0039\u0003\u0002\u0002\u0002\u0002\u003b\u0003\u0002\u0002\u0002\u0002\u003d\u0003\u0002\u0002\u0002\u0002\u003f\u0003\u0002\u0002\u0002\u0002\u0041\u0003\u0002\u0002\u0002\u0002\u0043\u0003\u0002\u0002\u0002\u0002\u0045\u0003\u0002\u0002\u0002\u0002\u0047\u0003\u0002\u0002\u0002\u0002\u0049\u0003\u0002\u0002\u0002\u0002\u004b\u0003\u0002\u0002\u0002\u0002\u004d\u0003\u0002\u0002\u0002\u0002\u004f\u0003\u0002\u0002\u0002\u0002\u0051\u0003\u0002\u0002\u0002\u0002\u0053\u0003\u0002\u0002\u0002\u0002\u0055\u0003\u0002\u0002\u0002\u0002\u0057\u0003\u0002\u0002\u0002\u0002\u0059\u0003\u0002\u0002\u0002\u0002\u005b\u0003\u0002\u0002\u0002\u0002\u005d\u0003\u0002\u0002\u0002\u0002\u005f\u0003\u0002\u0002\u0002\u0002\u0061\u0003\u0002\u0002\u0002\u0002\u0063\u0003\u0002\u0002\u0002\u0002\u0065\u0003\u0002\u0002\u0002\u0002\u0067\u0003\u0002\u0002\u0002\u0002\u0069\u0003\u0002\u0002\u0002\u0002\u006b\u0003\u0002\u0002\u0002\u0002\u006d\u0003\u0002\u0002\u0002\u0002\u006f\u0003\u0002\u0002\u0002\u0002\u0071\u0003\u0002\u0002\u0002\u0002\u0073\u0003\u0002\u0002\u0002\u0002\u0075\u0003\u0002\u0002\u0002\u0002\u0077\u0003\u0002\u0002\u0002\u0002\u007f\u0003\u0002\u0002\u0002\u0002\u0081\u0003\u0002\u0002\u0002\u0002\u0085\u0003\u0002\u0002\u0002\u0002\u0087\u0003\u0002\u0002\u0002\u0002\u0089\u0003\u0002\u0002\u0002\u0002\u0091\u0003\u0002\u0002\u0002\u0003\u0094\u0003\u0002\u0002\u0002\u0005\u009a\u0003\u0002\u0002\u0002\u0007\u00a8\u0003\u0002\u0002\u0002\u0009\u00b3\u0003\u0002\u0002\u0002\u000b\u00bc\u0003\u0002\u0002\u0002\u000d\u00c7\u0003\u0002\u0002\u0002\u000f\u00cd\u0003\u0002\u0002\u0002\u0011\u00d0\u0003\u0002\u0002\u0002\u0013\u00d8\u0003\u0002\u0002\u0002\u0015\u00e0\u0003\u0002\u0002\u0002\u0017\u00e9\u0003\u0002\u0002\u0002\u0019\u00f0\u0003\u0002\u0002\u0002\u001b\u00f5\u0003\u0002\u0002\u0002\u001d\u00fd\u0003\u0002\u0002\u0002\u001f\u0104\u0003\u0002\u0002\u0002\u0021\u010c\u0003\u0002\u0002\u0002\u0023\u0116\u0003\u0002\u0002\u0002\u0025\u011b\u0003\u0002\u0002\u0002\u0027\u0123\u0003\u0002\u0002\u0002\u0029\u012a\u0003\u0002\u0002\u0002\u002b\u012d\u0003\u0002\u0002\u0002\u002d\u0132\u0003\u0002\u0002\u0002\u002f\u0136\u0003\u0002\u0002\u0002\u0031\u013a\u0003\u0002\u0002\u0002\u0033\u0144\u0003\u0002\u0002\u0002\u0035\u014a\u0003\u0002\u0002\u0002\u0037\u014e\u0003\u0002\u0002\u0002\u0039\u0152\u0003\u0002\u0002\u0002\u003b\u0157\u0003\u0002\u0002\u0002\u003d\u015e\u0003\u0002\u0002\u0002\u003f\u0164\u0003\u0002\u0002\u0002\u0041\u0169\u0003\u0002\u0002\u0002\u0043\u016e\u0003\u0002\u0002\u0002\u0045\u0175\u0003\u0002\u0002\u0002\u0047\u017d\u0003\u0002\u0002\u0002\u0049\u0182\u0003\u0002\u0002\u0002\u004b\u0187\u0003\u0002\u0002\u0002\u004d\u018c\u0003\u0002\u0002\u0002\u004f\u0192\u0003\u0002\u0002\u0002\u0051\u0194\u0003\u0002\u0002\u0002\u0053\u0196\u0003\u0002\u0002\u0002\u0055\u019a\u0003\u0002\u0002\u0002\u0057\u019c\u0003\u0002\u0002\u0002\u0059\u019e\u0003\u0002\u0002\u0002\u005b\u01a0\u0003\u0002\u0002\u0002\u005d\u01a2\u0003\u0002\u0002\u0002\u005f\u01a4\u0003\u0002\u0002\u0002\u0061\u01a6\u0003\u0002\u0002\u0002\u0063\u01a8\u0003\u0002\u0002\u0002\u0065\u01ab\u0003\u0002\u0002\u0002\u0067\u01af\u0003\u0002\u0002\u0002\u0069\u01b1\u0003\u0002\u0002\u0002\u006b\u01b4\u0003\u0002\u0002\u0002\u006d\u01b6\u0003\u0002\u0002\u0002\u006f\u01b9\u0003\u0002\u0002\u0002\u0071\u01bc\u0003\u0002\u0002\u0002\u0073\u01be\u0003\u0002\u0002\u0002\u0075\u01c1\u0003\u0002\u0002\u0002\u0077\u01c3\u0003\u0002\u0002\u0002\u0079\u01c5\u0003\u0002\u0002\u0002\u007b\u01c7\u0003\u0002\u0002\u0002\u007d\u01c9\u0003\u0002\u0002\u0002\u007f\u01cb\u0003\u0002\u0002\u0002\u0081\u01d3\u0003\u0002\u0002\u0002\u0083\u01d7\u0003\u0002\u0002\u0002\u0085\u01da\u0003\u0002\u0002\u0002\u0087\u01df\u0003\u0002\u0002\u0002\u0089\u01e9\u0003\u0002\u0002\u0002\u008b\u01f3\u0003\u0002\u0002\u0002\u008d\u01f8\u0003\u0002\u0002\u0002\u008f\u01fe\u0003\u0002\u0002\u0002\u0091\u0200\u0003\u0002\u0002\u0002\u0093\u0095\u0009\u0002\u0002\u0002\u0094\u0093\u0003\u0002\u0002\u0002\u0095\u0096\u0003\u0002\u0002\u0002\u0096\u0094\u0003\u0002\u0002\u0002\u0096\u0097\u0003\u0002\u0002\u0002\u0097\u0098\u0003\u0002\u0002\u0002\u0098\u0099\u0008\u0002\u0002\u0002\u0099\u0004\u0003\u0002\u0002\u0002\u009a\u009b\u0007\u0031\u0002\u0002\u009b\u009c\u0007\u002c\u0002\u0002\u009c\u00a0\u0003\u0002\u0002\u0002\u009d\u009f\u000b\u0002\u0002\u0002\u009e\u009d\u0003\u0002\u0002\u0002\u009f\u00a2\u0003\u0002\u0002\u0002\u00a0\u00a1\u0003\u0002\u0002\u0002\u00a0\u009e\u0003\u0002\u0002\u0002\u00a1\u00a3\u0003\u0002\u0002\u0002\u00a2\u00a0\u0003\u0002\u0002\u0002\u00a3\u00a4\u0007\u002c\u0002\u0002\u00a4\u00a5\u0007\u0031\u0002\u0002\u00a5\u00a6\u0003\u0002\u0002\u0002\u00a6\u00a7\u0008\u0003\u0002\u0002\u00a7\u0006\u0003\u0002\u0002\u0002\u00a8\u00a9\u0007\u0031\u0002\u0002\u00a9\u00aa\u0007\u0031\u0002\u0002\u00aa\u00ae\u0003\u0002\u0002\u0002\u00ab\u00ad\u000a\u0003\u0002\u0002\u00ac\u00ab\u0003\u0002\u0002\u0002\u00ad\u00b0\u0003\u0002\u0002\u0002\u00ae\u00ac\u0003\u0002\u0002\u0002\u00ae\u00af\u0003\u0002\u0002\u0002\u00af\u00b1\u0003\u0002\u0002\u0002\u00b0\u00ae\u0003\u0002\u0002\u0002\u00b1\u00b2\u0008\u0004\u0002\u0002\u00b2\u0008\u0003\u0002\u0002\u0002\u00b3\u00b4\u0007\u0063\u0002\u0002\u00b4\u00b5\u0007\u0064\u0002\u0002\u00b5\u00b6\u0007\u0075\u0002\u0002\u00b6\u00b7\u0007\u0076\u0002\u0002\u00b7\u00b8\u0007\u0074\u0002\u0002\u00b8\u00b9\u0007\u0063\u0002\u0002\u00b9\u00ba\u0007\u0065\u0002\u0002\u00ba\u00bb\u0007\u0076\u0002\u0002\u00bb\u000a\u0003\u0002\u0002\u0002\u00bc\u00bd\u0007\u0063\u0002\u0002\u00bd\u00be\u0007\u0070\u0002\u0002\u00be\u00bf\u0007\u0070\u0002\u0002\u00bf\u00c0\u0007\u0071\u0002\u0002\u00c0\u00c1\u0007\u0076\u0002\u0002\u00c1\u00c2\u0007\u0063\u0002\u0002\u00c2\u00c3\u0007\u0076\u0002\u0002\u00c3\u00c4\u0007\u006b\u0002\u0002\u00c4\u00c5\u0007\u0071\u0002\u0002\u00c5\u00c6\u0007\u0070\u0002\u0002\u00c6\u000c\u0003\u0002\u0002\u0002\u00c7\u00c8\u0007\u0065\u0002\u0002\u00c8\u00c9\u0007\u006e\u0002\u0002\u00c9\u00ca\u0007\u0063\u0002\u0002\u00ca\u00cb\u0007\u0075\u0002\u0002\u00cb\u00cc\u0007\u0075\u0002\u0002\u00cc\u000e\u0003\u0002\u0002\u0002\u00cd\u00ce\u0007\u0066\u0002\u0002\u00ce\u00cf\u0007\u0071\u0002\u0002\u00cf\u0010\u0003\u0002\u0002\u0002\u00d0\u00d1\u0007\u0068\u0002\u0002\u00d1\u00d2\u0007\u0071\u0002\u0002\u00d2\u00d3\u0007\u0074\u0002\u0002\u00d3\u00d4\u0007\u0067\u0002\u0002\u00d4\u00d5\u0007\u006b\u0002\u0002\u00d5\u00d6\u0007\u0069\u0002\u0002\u00d6\u00d7\u0007\u0070\u0002\u0002\u00d7\u0012\u0003\u0002\u0002\u0002\u00d8\u00d9\u0007\u0072\u0002\u0002\u00d9\u00da\u0007\u0063\u0002\u0002\u00da\u00db\u0007\u0065\u0002\u0002\u00db\u00dc\u0007\u006d\u0002\u0002\u00dc\u00dd\u0007\u0063\u0002\u0002\u00dd\u00de\u0007\u0069\u0002\u0002\u00de\u00df\u0007\u0067\u0002\u0002\u00df\u0014\u0003\u0002\u0002\u0002\u00e0\u00e1\u0007\u006b\u0002\u0002\u00e1\u00e2\u0007\u0070\u0002\u0002\u00e2\u00e3\u0007\u0076\u0002\u0002\u00e3\u00e4\u0007\u0067\u0002\u0002\u00e4\u00e5\u0007\u0074\u0002\u0002\u00e5\u00e6\u0007\u0070\u0002\u0002\u00e6\u00e7\u0007\u0063\u0002\u0002\u00e7\u00e8\u0007\u006e\u0002\u0002\u00e8\u0016\u0003\u0002\u0002\u0002\u00e9\u00ea\u0007\u006b\u0002\u0002\u00ea\u00eb\u0007\u006f\u0002\u0002\u00eb\u00ec\u0007\u0072\u0002\u0002\u00ec\u00ed\u0007\u0071\u0002\u0002\u00ed\u00ee\u0007\u0074\u0002\u0002\u00ee\u00ef\u0007\u0076\u0002\u0002\u00ef\u0018\u0003\u0002\u0002\u0002\u00f0\u00f1\u0007\u006b\u0002\u0002\u00f1\u00f2\u0007\u006f\u0002\u0002\u00f2\u00f3\u0007\u0072\u0002\u0002\u00f3\u00f4\u0007\u006e\u0002\u0002\u00f4\u001a\u0003\u0002\u0002\u0002\u00f5\u00f6\u0007\u006b\u0002\u0002\u00f6\u00f7\u0007\u0070\u0002\u0002\u00f7\u00f8\u0007\u006a\u0002\u0002\u00f8\u00f9\u0007\u0067\u0002\u0002\u00f9\u00fa\u0007\u0074\u0002\u0002\u00fa\u00fb\u0007\u006b\u0002\u0002\u00fb\u00fc\u0007\u0076\u0002\u0002\u00fc\u001c\u0003\u0002\u0002\u0002\u00fd\u00fe\u0007\u0074\u0002\u0002\u00fe\u00ff\u0007\u0067\u0002\u0002\u00ff\u0100\u0007\u0076\u0002\u0002\u0100\u0101\u0007\u0077\u0002\u0002\u0101\u0102\u0007\u0074\u0002\u0002\u0102\u0103\u0007\u0070\u0002\u0002\u0103\u001e\u0003\u0002\u0002\u0002\u0104\u0105\u0007\u006f\u0002\u0002\u0105\u0106\u0007\u0077\u0002\u0002\u0106\u0107\u0007\u0076\u0002\u0002\u0107\u0108\u0007\u0063\u0002\u0002\u0108\u0109\u0007\u0064\u0002\u0002\u0109\u010a\u0007\u006e\u0002\u0002\u010a\u010b\u0007\u0067\u0002\u0002\u010b\u0020\u0003\u0002\u0002\u0002\u010c\u010d\u0007\u006b\u0002\u0002\u010d\u010e\u0007\u0070\u0002\u0002\u010e\u010f\u0007\u0076\u0002\u0002\u010f\u0110\u0007\u0067\u0002\u0002\u0110\u0111\u0007\u0074\u0002\u0002\u0111\u0112\u0007\u0068\u0002\u0002\u0112\u0113\u0007\u0063\u0002\u0002\u0113\u0114\u0007\u0065\u0002\u0002\u0114\u0115\u0007\u0067\u0002\u0002\u0115\u0022\u0003\u0002\u0002\u0002\u0116\u0117\u0007\u0066\u0002\u0002\u0117\u0118\u0007\u0063\u0002\u0002\u0118\u0119\u0007\u0076\u0002\u0002\u0119\u011a\u0007\u0063\u0002\u0002\u011a\u0024\u0003\u0002\u0002\u0002\u011b\u011c\u0007\u006b\u0002\u0002\u011c\u011d\u0007\u0070\u0002\u0002\u011d\u011e\u0007\u0078\u0002\u0002\u011e\u011f\u0007\u0067\u0002\u0002\u011f\u0120\u0007\u0074\u0002\u0002\u0120\u0121\u0007\u0075\u0002\u0002\u0121\u0122\u0007\u0067\u0002\u0002\u0122\u0026\u0003\u0002\u0002\u0002\u0123\u0124\u0007\u0067\u0002\u0002\u0124\u0125\u0007\u007a\u0002\u0002\u0125\u0126\u0007\u0072\u0002\u0002\u0126\u0127\u0007\u0067\u0002\u0002\u0127\u0128\u0007\u0065\u0002\u0002\u0128\u0129\u0007\u0076\u0002\u0002\u0129\u0028\u0003\u0002\u0002\u0002\u012a\u012b\u0007\u006b\u0002\u0002\u012b\u012c\u0007\u0068\u0002\u0002\u012c\u002a\u0003\u0002\u0002\u0002\u012d\u012e\u0007\u0067\u0002\u0002\u012e\u012f\u0007\u006e\u0002\u0002\u012f\u0130\u0007\u0075\u0002\u0002\u0130\u0131\u0007\u0067\u0002\u0002\u0131\u002c\u0003\u0002\u0002\u0002\u0132\u0133\u0007\u0070\u0002\u0002\u0133\u0134\u0007\u0067\u0002\u0002\u0134\u0135\u0007\u0079\u0002\u0002\u0135\u002e\u0003\u0002\u0002\u0002\u0136\u0137\u0007\u006e\u0002\u0002\u0137\u0138\u0007\u0067\u0002\u0002\u0138\u0139\u0007\u0076\u0002\u0002\u0139\u0030\u0003\u0002\u0002\u0002\u013a\u013b\u0007\u0076\u0002\u0002\u013b\u013c\u0007\u007b\u0002\u0002\u013c\u013d\u0007\u0072\u0002\u0002\u013d\u013e\u0007\u0067\u0002\u0002\u013e\u013f\u0007\u0063\u0002\u0002\u013f\u0140\u0007\u006e\u0002\u0002\u0140\u0141\u0007\u006b\u0002\u0002\u0141\u0142\u0007\u0063\u0002\u0002\u0142\u0143\u0007\u0075\u0002\u0002\u0143\u0032\u0003\u0002\u0002\u0002\u0144\u0145\u0007\u0068\u0002\u0002\u0145\u0146\u0007\u0074\u0002\u0002\u0146\u0147\u0007\u0071\u0002\u0002\u0147\u0148\u0007\u006f\u0002\u0002\u0148\u0149\u0007\u0023\u0002\u0002\u0149\u0034\u0003\u0002\u0002\u0002\u014a\u014b\u0007\u006b\u0002\u0002\u014b\u014c\u0007\u0075\u0002\u0002\u014c\u014d\u0007\u0023\u0002\u0002\u014d\u0036\u0003\u0002\u0002\u0002\u014e\u014f\u0007\u004b\u0002\u0002\u014f\u0150\u0007\u0070\u0002\u0002\u0150\u0151\u0007\u0076\u0002\u0002\u0151\u0038\u0003\u0002\u0002\u0002\u0152\u0153\u0007\u004e\u0002\u0002\u0153\u0154\u0007\u0071\u0002\u0002\u0154\u0155\u0007\u0070\u0002\u0002\u0155\u0156\u0007\u0069\u0002\u0002\u0156\u003a\u0003\u0002\u0002\u0002\u0157\u0158\u0007\u0046\u0002\u0002\u0158\u0159\u0007\u0071\u0002\u0002\u0159\u015a\u0007\u0077\u0002\u0002\u015a\u015b\u0007\u0064\u0002\u0002\u015b\u015c\u0007\u006e\u0002\u0002\u015c\u015d\u0007\u0067\u0002\u0002\u015d\u003c\u0003\u0002\u0002\u0002\u015e\u015f\u0007\u0048\u0002\u0002\u015f\u0160\u0007\u006e\u0002\u0002\u0160\u0161\u0007\u0071\u0002\u0002\u0161\u0162\u0007\u0063\u0002\u0002\u0162\u0163\u0007\u0076\u0002\u0002\u0163\u003e\u0003\u0002\u0002\u0002\u0164\u0165\u0007\u0044\u0002\u0002\u0165\u0166\u0007\u007b\u0002\u0002\u0166\u0167\u0007\u0076\u0002\u0002\u0167\u0168\u0007\u0067\u0002\u0002\u0168\u0040\u0003\u0002\u0002\u0002\u0169\u016a\u0007\u0045\u0002\u0002\u016a\u016b\u0007\u006a\u0002\u0002\u016b\u016c\u0007\u0063\u0002\u0002\u016c\u016d\u0007\u0074\u0002\u0002\u016d\u0042\u0003\u0002\u0002\u0002\u016e\u016f\u0007\u0055\u0002\u0002\u016f\u0170\u0007\u0076\u0002\u0002\u0170\u0171\u0007\u0074\u0002\u0002\u0171\u0172\u0007\u006b\u0002\u0002\u0172\u0173\u0007\u0070\u0002\u0002\u0173\u0174\u0007\u0069\u0002\u0002\u0174\u0044\u0003\u0002\u0002\u0002\u0175\u0176\u0007\u0044\u0002\u0002\u0176\u0177\u0007\u0071\u0002\u0002\u0177\u0178\u0007\u0071\u0002\u0002\u0178\u0179\u0007\u006e\u0002\u0002\u0179\u017a\u0007\u0067\u0002\u0002\u017a\u017b\u0007\u0063\u0002\u0002\u017b\u017c\u0007\u0070\u0002\u0002\u017c\u0046\u0003\u0002\u0002\u0002\u017d\u017e\u0007\u0057\u0002\u0002\u017e\u017f\u0007\u0070\u0002\u0002\u017f\u0180\u0007\u006b\u0002\u0002\u0180\u0181\u0007\u0076\u0002\u0002\u0181\u0048\u0003\u0002\u0002\u0002\u0182\u0183\u0007\u0070\u0002\u0002\u0183\u0184\u0007\u0077\u0002\u0002\u0184\u0185\u0007\u006e\u0002\u0002\u0185\u0186\u0007\u006e\u0002\u0002\u0186\u004a\u0003\u0002\u0002\u0002\u0187\u0188\u0007\u0076\u0002\u0002\u0188\u0189\u0007\u0074\u0002\u0002\u0189\u018a\u0007\u0077\u0002\u0002\u018a\u018b\u0007\u0067\u0002\u0002\u018b\u004c\u0003\u0002\u0002\u0002\u018c\u018d\u0007\u0068\u0002\u0002\u018d\u018e\u0007\u0063\u0002\u0002\u018e\u018f\u0007\u006e\u0002\u0002\u018f\u0190\u0007\u0075\u0002\u0002\u0190\u0191\u0007\u0067\u0002\u0002\u0191\u004e\u0003\u0002\u0002\u0002\u0192\u0193\u0007\u0042\u0002\u0002\u0193\u0050\u0003\u0002\u0002\u0002\u0194\u0195\u0007\u003f\u0002\u0002\u0195\u0052\u0003\u0002\u0002\u0002\u0196\u0197\u0007\u0030\u0002\u0002\u0197\u0198\u0007\u0030\u0002\u0002\u0198\u0199\u0007\u0030\u0002\u0002\u0199\u0054\u0003\u0002\u0002\u0002\u019a\u019b\u0007\u0030\u0002\u0002\u019b\u0056\u0003\u0002\u0002\u0002\u019c\u019d\u0007\u002a\u0002\u0002\u019d\u0058\u0003\u0002\u0002\u0002\u019e\u019f\u0007\u002b\u0002\u0002\u019f\u005a\u0003\u0002\u0002\u0002\u01a0\u01a1\u0007\u005d\u0002\u0002\u01a1\u005c\u0003\u0002\u0002\u0002\u01a2\u01a3\u0007\u005f\u0002\u0002\u01a3\u005e\u0003\u0002\u0002\u0002\u01a4\u01a5\u0007\u007d\u0002\u0002\u01a5\u0060\u0003\u0002\u0002\u0002\u01a6\u01a7\u0007\u007f\u0002\u0002\u01a7\u0062\u0003\u0002\u0002\u0002\u01a8\u01a9\u0007\u002f\u0002\u0002\u01a9\u01aa\u0007\u0040\u0002\u0002\u01aa\u0064\u0003\u0002\u0002\u0002\u01ab\u01ac\u0007\u002f\u0002\u0002\u01ac\u01ad\u0007\u0040\u0002\u0002\u01ad\u01ae\u0007\u0041\u0002\u0002\u01ae\u0066\u0003\u0002\u0002\u0002\u01af\u01b0\u0007\u0080\u0002\u0002\u01b0\u0068\u0003\u0002\u0002\u0002\u01b1\u01b2\u0007\u0080\u0002\u0002\u01b2\u01b3\u0007\u0040\u0002\u0002\u01b3\u006a\u0003\u0002\u0002\u0002\u01b4\u01b5\u0007\u003c\u0002\u0002\u01b5\u006c\u0003\u0002\u0002\u0002\u01b6\u01b7\u0007\u003c\u0002\u0002\u01b7\u01b8\u0007\u003c\u0002\u0002\u01b8\u006e\u0003\u0002\u0002\u0002\u01b9\u01ba\u0007\u003c\u0002\u0002\u01ba\u01bb\u0007\u0025\u0002\u0002\u01bb\u0070\u0003\u0002\u0002\u0002\u01bc\u01bd\u0007\u0029\u0002\u0002\u01bd\u0072\u0003\u0002\u0002\u0002\u01be\u01bf\u0007\u003c\u0002\u0002\u01bf\u01c0\u0007\u0029\u0002\u0002\u01c0\u0074\u0003\u0002\u0002\u0002\u01c1\u01c2\u0007\u0025\u0002\u0002\u01c2\u0076\u0003\u0002\u0002\u0002\u01c3\u01c4\u0007\u0041\u0002\u0002\u01c4\u0078\u0003\u0002\u0002\u0002\u01c5\u01c6\u0009\u0004\u0002\u0002\u01c6\u007a\u0003\u0002\u0002\u0002\u01c7\u01c8\u0009\u0005\u0002\u0002\u01c8\u007c\u0003\u0002\u0002\u0002\u01c9\u01ca\u0009\u0006\u0002\u0002\u01ca\u007e\u0003\u0002\u0002\u0002\u01cb\u01cf\u0005\u0079\u003d\u0002\u01cc\u01ce\u0005\u007b\u003e\u0002\u01cd\u01cc\u0003\u0002\u0002\u0002\u01ce\u01d1\u0003\u0002\u0002\u0002\u01cf\u01cd\u0003\u0002\u0002\u0002\u01cf\u01d0\u0003\u0002\u0002\u0002\u01d0\u0080\u0003\u0002\u0002\u0002\u01d1\u01cf\u0003\u0002\u0002\u0002\u01d2\u01d4\u0005\u007d\u003f\u0002\u01d3\u01d2\u0003\u0002\u0002\u0002\u01d4\u01d5\u0003\u0002\u0002\u0002\u01d5\u01d3\u0003\u0002\u0002\u0002\u01d5\u01d6\u0003\u0002\u0002\u0002\u01d6\u0082\u0003\u0002\u0002\u0002\u01d7\u01d8\u0009\u0007\u0002\u0002\u01d8\u0084\u0003\u0002\u0002\u0002\u01d9\u01db\u0005\u0083\u0042\u0002\u01da\u01d9\u0003\u0002\u0002\u0002\u01db\u01dc\u0003\u0002\u0002\u0002\u01dc\u01da\u0003\u0002\u0002\u0002\u01dc\u01dd\u0003\u0002\u0002\u0002\u01dd\u0086\u0003\u0002\u0002\u0002\u01de\u01e0\u0005\u0083\u0042\u0002\u01df\u01de\u0003\u0002\u0002\u0002\u01e0\u01e1\u0003\u0002\u0002\u0002\u01e1\u01df\u0003\u0002\u0002\u0002\u01e1\u01e2\u0003\u0002\u0002\u0002\u01e2\u01e3\u0003\u0002\u0002\u0002\u01e3\u01e5\u0007\u0030\u0002\u0002\u01e4\u01e6\u0005\u0083\u0042\u0002\u01e5\u01e4\u0003\u0002\u0002\u0002\u01e6\u01e7\u0003\u0002\u0002\u0002\u01e7\u01e5\u0003\u0002\u0002\u0002\u01e7\u01e8\u0003\u0002\u0002\u0002\u01e8\u0088\u0003\u0002\u0002\u0002\u01e9\u01ee\u0007\u0024\u0002\u0002\u01ea\u01ed\u0005\u008b\u0046\u0002\u01eb\u01ed\u000a\u0008\u0002\u0002\u01ec\u01ea\u0003\u0002\u0002\u0002\u01ec\u01eb\u0003\u0002\u0002\u0002\u01ed\u01f0\u0003\u0002\u0002\u0002\u01ee\u01ec\u0003\u0002\u0002\u0002\u01ee\u01ef\u0003\u0002\u0002\u0002\u01ef\u01f1\u0003\u0002\u0002\u0002\u01f0\u01ee\u0003\u0002\u0002\u0002\u01f1\u01f2\u0007\u0024\u0002\u0002\u01f2\u008a\u0003\u0002\u0002\u0002\u01f3\u01f6\u0007\u005e\u0002\u0002\u01f4\u01f7\u0009\u0009\u0002\u0002\u01f5\u01f7\u0005\u008d\u0047\u0002\u01f6\u01f4\u0003\u0002\u0002\u0002\u01f6\u01f5\u0003\u0002\u0002\u0002\u01f7\u008c\u0003\u0002\u0002\u0002\u01f8\u01f9\u0007\u0077\u0002\u0002\u01f9\u01fa\u0005\u008f\u0048\u0002\u01fa\u01fb\u0005\u008f\u0048\u0002\u01fb\u01fc\u0005\u008f\u0048\u0002\u01fc\u01fd\u0005\u008f\u0048\u0002\u01fd\u008e\u0003\u0002\u0002\u0002\u01fe\u01ff\u0009\u000a\u0002\u0002\u01ff\u0090\u0003\u0002\u0002\u0002\u0200\u0204\u0007\u0062\u0002\u0002\u0201\u0203\u000a\u000b\u0002\u0002\u0202\u0201\u0003\u0002\u0002\u0002\u0203\u0206\u0003\u0002\u0002\u0002\u0204\u0202\u0003\u0002\u0002\u0002\u0204\u0205\u0003\u0002\u0002\u0002\u0205\u0207\u0003\u0002\u0002\u0002\u0206\u0204\u0003\u0002\u0002\u0002\u0207\u0208\u0007\u0062\u0002\u0002\u0208\u0092\u0003\u0002\u0002\u0002\u000f\u0002\u0096\u00a0\u00ae\u01cf\u01d5\u01dc\u01e1\u01e7\u01ec\u01ee\u01f6\u0204\u0003\u0008\u0002\u0002"

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
	    ABSTRACT(4),
	    ANNOTATION(5),
	    CLASS(6),
	    DO(7),
	    FOREIGN(8),
	    NAMESPACE(9),
	    INTERNAL(10),
	    IMPORT(11),
	    IMPL(12),
	    INHERIT(13),
	    RETURN(14),
	    MUTABLE(15),
	    INTERFACE(16),
	    DATA(17),
	    INVERSE(18),
	    EXPECT(19),
	    IF(20),
	    ELSE(21),
	    NEW(22),
	    LET(23),
	    TYPEALIAS(24),
	    FROM(25),
	    IS(26),
	    INT(27),
	    LONG(28),
	    DOUBLE(29),
	    FLOAT(30),
	    BYTE(31),
	    CHAR(32),
	    STRING(33),
	    BOOLEAN(34),
	    UNIT(35),
	    NULL(36),
	    TRUE(37),
	    FALSE(38),
	    ALPHA(39),
	    ASSGIN(40),
	    ELLIPSIS(41),
	    DOT(42),
	    LPAREN(43),
	    RPAREN(44),
	    LSQUARE(45),
	    RSQUARE(46),
	    LBRACE(47),
	    RBRACE(48),
	    ARROW(49),
	    ARROWQM(50),
	    TILDE(51),
	    As(52),
	    COLON(53),
	    DOUBLECOLON(54),
	    COLONSHARP(55),
	    QUOTE(56),
	    COLONQUOTE(57),
	    SHARP(58),
	    QM(59),
	    ID(60),
	    OPID(61),
	    Integer(62),
	    Double(63),
	    String(64),
	    RawString(65)
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
	    ABSTRACT,
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
	    INTERFACE,
	    DATA,
	    INVERSE,
	    EXPECT,
	    IF,
	    ELSE,
	    NEW,
	    LET,
	    TYPEALIAS,
	    FROM,
	    IS,
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
	    ALPHA,
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
	    ARROWQM,
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