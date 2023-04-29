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
		                                                  "'typealias'", "'where'", 
		                                                  "'from!'", "'is!'", 
		                                                  "'get!'", "'set!'", 
		                                                  "'remain!'", "'match!'", 
		                                                  "'Int'", "'Long'", "'Double'", 
		                                                  "'Float'", "'Byte'", 
		                                                  "'Char'", "'String'", 
		                                                  "'Boolean'", "'Unit'", 
		                                                  "'null'", "'true'", 
		                                                  "'false'", "'@'", "'='", 
		                                                  "'...'", "'.'", "'('", 
		                                                  "')'", "'['", "']'", 
		                                                  "'{'", "'}'", "'->'", 
		                                                  "'->?'", "'~'", "'~>'", 
		                                                  "':'", "'::'", "':::'", 
		                                                  "':#'", "'''", "':''", 
		                                                  "'#'", "'?'")
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
		                                                   "WHERE", "FROM", "IS", 
		                                                   "GET", "SET", "REMAIN", 
		                                                   "MATCH", "INT", "LONG", 
		                                                   "DOUBLE", "FLOAT", 
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
		                                                   "DOUBLECOLON", "TRIPLECOLON", 
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

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u0049\u0242\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0004\u0042\u0009\u0042\u0004\u0043\u0009\u0043\u0004\u0044\u0009\u0044\u0004\u0045\u0009\u0045\u0004\u0046\u0009\u0046\u0004\u0047\u0009\u0047\u0004\u0048\u0009\u0048\u0004\u0049\u0009\u0049\u0004\u004a\u0009\u004a\u0004\u004b\u0009\u004b\u0004\u004c\u0009\u004c\u0004\u004d\u0009\u004d\u0004\u004e\u0009\u004e\u0004\u004f\u0009\u004f\u0003\u0002\u0006\u0002\u00a1\u000a\u0002\u000d\u0002\u000e\u0002\u00a2\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u00ab\u000a\u0003\u000c\u0003\u000e\u0003\u00ae\u000b\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u00b9\u000a\u0004\u000c\u0004\u000e\u0004\u00bc\u000b\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035\u0003\u0036\u0003\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0039\u0003\u0039\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003b\u0003\u003b\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003d\u0003\u003d\u0003\u003d\u0003\u003d\u0003\u003e\u0003\u003e\u0003\u003e\u0003\u003f\u0003\u003f\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0041\u0003\u0041\u0003\u0042\u0003\u0042\u0003\u0043\u0003\u0043\u0003\u0044\u0003\u0044\u0003\u0045\u0003\u0045\u0003\u0046\u0003\u0046\u0007\u0046\u01fd\u000a\u0046\u000c\u0046\u000e\u0046\u0200\u000b\u0046\u0003\u0047\u0006\u0047\u0203\u000a\u0047\u000d\u0047\u000e\u0047\u0204\u0003\u0048\u0003\u0048\u0003\u0049\u0006\u0049\u020a\u000a\u0049\u000d\u0049\u000e\u0049\u020b\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0006\u0049\u0212\u000a\u0049\u000d\u0049\u000e\u0049\u0213\u0005\u0049\u0216\u000a\u0049\u0003\u004a\u0006\u004a\u0219\u000a\u004a\u000d\u004a\u000e\u004a\u021a\u0003\u004a\u0003\u004a\u0006\u004a\u021f\u000a\u004a\u000d\u004a\u000e\u004a\u0220\u0003\u004b\u0003\u004b\u0003\u004b\u0007\u004b\u0226\u000a\u004b\u000c\u004b\u000e\u004b\u0229\u000b\u004b\u0003\u004b\u0003\u004b\u0003\u004c\u0003\u004c\u0003\u004c\u0005\u004c\u0230\u000a\u004c\u0003\u004d\u0003\u004d\u0003\u004d\u0003\u004d\u0003\u004d\u0003\u004d\u0003\u004e\u0003\u004e\u0003\u004f\u0003\u004f\u0007\u004f\u023c\u000a\u004f\u000c\u004f\u000e\u004f\u023f\u000b\u004f\u0003\u004f\u0003\u004f\u0003\u00ac\u0002\u0050\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011\u0021\u0012\u0023\u0013\u0025\u0014\u0027\u0015\u0029\u0016\u002b\u0017\u002d\u0018\u002f\u0019\u0031\u001a\u0033\u001b\u0035\u001c\u0037\u001d\u0039\u001e\u003b\u001f\u003d\u0020\u003f\u0021\u0041\u0022\u0043\u0023\u0045\u0024\u0047\u0025\u0049\u0026\u004b\u0027\u004d\u0028\u004f\u0029\u0051\u002a\u0053\u002b\u0055\u002c\u0057\u002d\u0059\u002e\u005b\u002f\u005d\u0030\u005f\u0031\u0061\u0032\u0063\u0033\u0065\u0034\u0067\u0035\u0069\u0036\u006b\u0037\u006d\u0038\u006f\u0039\u0071\u003a\u0073\u003b\u0075\u003c\u0077\u003d\u0079\u003e\u007b\u003f\u007d\u0040\u007f\u0041\u0081\u0042\u0083\u0043\u0085\u0002\u0087\u0002\u0089\u0002\u008b\u0044\u008d\u0045\u008f\u0002\u0091\u0046\u0093\u0047\u0095\u0048\u0097\u0002\u0099\u0002\u009b\u0002\u009d\u0049\u0003\u0002\u000c\u0005\u0002\u000b\u000c\u000e\u000f\u0022\u0022\u0004\u0002\u000c\u000c\u000f\u000f\u0005\u0002\u0043\u005c\u0061\u0061\u0063\u007c\u0007\u0002\u002f\u002f\u0032\u003b\u0043\u005c\u0061\u0061\u0063\u007c\u000a\u0002\u0023\u0023\u0026\u0028\u002c\u0031\u003c\u0042\u005e\u005e\u0060\u0060\u007e\u007e\u0080\u0080\u0003\u0002\u0032\u003b\u0004\u0002\u0024\u0024\u005e\u005e\u000a\u0002\u0024\u0024\u0031\u0031\u005e\u005e\u0064\u0064\u0068\u0068\u0070\u0070\u0074\u0074\u0076\u0076\u0005\u0002\u0032\u003b\u0043\u0048\u0063\u0068\u0003\u0002\u0062\u0062\u0002\u0248\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002\u0021\u0003\u0002\u0002\u0002\u0002\u0023\u0003\u0002\u0002\u0002\u0002\u0025\u0003\u0002\u0002\u0002\u0002\u0027\u0003\u0002\u0002\u0002\u0002\u0029\u0003\u0002\u0002\u0002\u0002\u002b\u0003\u0002\u0002\u0002\u0002\u002d\u0003\u0002\u0002\u0002\u0002\u002f\u0003\u0002\u0002\u0002\u0002\u0031\u0003\u0002\u0002\u0002\u0002\u0033\u0003\u0002\u0002\u0002\u0002\u0035\u0003\u0002\u0002\u0002\u0002\u0037\u0003\u0002\u0002\u0002\u0002\u0039\u0003\u0002\u0002\u0002\u0002\u003b\u0003\u0002\u0002\u0002\u0002\u003d\u0003\u0002\u0002\u0002\u0002\u003f\u0003\u0002\u0002\u0002\u0002\u0041\u0003\u0002\u0002\u0002\u0002\u0043\u0003\u0002\u0002\u0002\u0002\u0045\u0003\u0002\u0002\u0002\u0002\u0047\u0003\u0002\u0002\u0002\u0002\u0049\u0003\u0002\u0002\u0002\u0002\u004b\u0003\u0002\u0002\u0002\u0002\u004d\u0003\u0002\u0002\u0002\u0002\u004f\u0003\u0002\u0002\u0002\u0002\u0051\u0003\u0002\u0002\u0002\u0002\u0053\u0003\u0002\u0002\u0002\u0002\u0055\u0003\u0002\u0002\u0002\u0002\u0057\u0003\u0002\u0002\u0002\u0002\u0059\u0003\u0002\u0002\u0002\u0002\u005b\u0003\u0002\u0002\u0002\u0002\u005d\u0003\u0002\u0002\u0002\u0002\u005f\u0003\u0002\u0002\u0002\u0002\u0061\u0003\u0002\u0002\u0002\u0002\u0063\u0003\u0002\u0002\u0002\u0002\u0065\u0003\u0002\u0002\u0002\u0002\u0067\u0003\u0002\u0002\u0002\u0002\u0069\u0003\u0002\u0002\u0002\u0002\u006b\u0003\u0002\u0002\u0002\u0002\u006d\u0003\u0002\u0002\u0002\u0002\u006f\u0003\u0002\u0002\u0002\u0002\u0071\u0003\u0002\u0002\u0002\u0002\u0073\u0003\u0002\u0002\u0002\u0002\u0075\u0003\u0002\u0002\u0002\u0002\u0077\u0003\u0002\u0002\u0002\u0002\u0079\u0003\u0002\u0002\u0002\u0002\u007b\u0003\u0002\u0002\u0002\u0002\u007d\u0003\u0002\u0002\u0002\u0002\u007f\u0003\u0002\u0002\u0002\u0002\u0081\u0003\u0002\u0002\u0002\u0002\u0083\u0003\u0002\u0002\u0002\u0002\u008b\u0003\u0002\u0002\u0002\u0002\u008d\u0003\u0002\u0002\u0002\u0002\u0091\u0003\u0002\u0002\u0002\u0002\u0093\u0003\u0002\u0002\u0002\u0002\u0095\u0003\u0002\u0002\u0002\u0002\u009d\u0003\u0002\u0002\u0002\u0003\u00a0\u0003\u0002\u0002\u0002\u0005\u00a6\u0003\u0002\u0002\u0002\u0007\u00b4\u0003\u0002\u0002\u0002\u0009\u00bf\u0003\u0002\u0002\u0002\u000b\u00c8\u0003\u0002\u0002\u0002\u000d\u00d3\u0003\u0002\u0002\u0002\u000f\u00d9\u0003\u0002\u0002\u0002\u0011\u00dc\u0003\u0002\u0002\u0002\u0013\u00e4\u0003\u0002\u0002\u0002\u0015\u00ec\u0003\u0002\u0002\u0002\u0017\u00f5\u0003\u0002\u0002\u0002\u0019\u00fc\u0003\u0002\u0002\u0002\u001b\u0101\u0003\u0002\u0002\u0002\u001d\u0109\u0003\u0002\u0002\u0002\u001f\u0110\u0003\u0002\u0002\u0002\u0021\u0118\u0003\u0002\u0002\u0002\u0023\u0122\u0003\u0002\u0002\u0002\u0025\u0127\u0003\u0002\u0002\u0002\u0027\u012f\u0003\u0002\u0002\u0002\u0029\u0136\u0003\u0002\u0002\u0002\u002b\u0139\u0003\u0002\u0002\u0002\u002d\u013e\u0003\u0002\u0002\u0002\u002f\u0142\u0003\u0002\u0002\u0002\u0031\u0146\u0003\u0002\u0002\u0002\u0033\u0150\u0003\u0002\u0002\u0002\u0035\u0156\u0003\u0002\u0002\u0002\u0037\u015c\u0003\u0002\u0002\u0002\u0039\u0160\u0003\u0002\u0002\u0002\u003b\u0165\u0003\u0002\u0002\u0002\u003d\u016a\u0003\u0002\u0002\u0002\u003f\u0172\u0003\u0002\u0002\u0002\u0041\u0179\u0003\u0002\u0002\u0002\u0043\u017d\u0003\u0002\u0002\u0002\u0045\u0182\u0003\u0002\u0002\u0002\u0047\u0189\u0003\u0002\u0002\u0002\u0049\u018f\u0003\u0002\u0002\u0002\u004b\u0194\u0003\u0002\u0002\u0002\u004d\u0199\u0003\u0002\u0002\u0002\u004f\u01a0\u0003\u0002\u0002\u0002\u0051\u01a8\u0003\u0002\u0002\u0002\u0053\u01ad\u0003\u0002\u0002\u0002\u0055\u01b2\u0003\u0002\u0002\u0002\u0057\u01b7\u0003\u0002\u0002\u0002\u0059\u01bd\u0003\u0002\u0002\u0002\u005b\u01bf\u0003\u0002\u0002\u0002\u005d\u01c1\u0003\u0002\u0002\u0002\u005f\u01c5\u0003\u0002\u0002\u0002\u0061\u01c7\u0003\u0002\u0002\u0002\u0063\u01c9\u0003\u0002\u0002\u0002\u0065\u01cb\u0003\u0002\u0002\u0002\u0067\u01cd\u0003\u0002\u0002\u0002\u0069\u01cf\u0003\u0002\u0002\u0002\u006b\u01d1\u0003\u0002\u0002\u0002\u006d\u01d3\u0003\u0002\u0002\u0002\u006f\u01d6\u0003\u0002\u0002\u0002\u0071\u01da\u0003\u0002\u0002\u0002\u0073\u01dc\u0003\u0002\u0002\u0002\u0075\u01df\u0003\u0002\u0002\u0002\u0077\u01e1\u0003\u0002\u0002\u0002\u0079\u01e4\u0003\u0002\u0002\u0002\u007b\u01e8\u0003\u0002\u0002\u0002\u007d\u01eb\u0003\u0002\u0002\u0002\u007f\u01ed\u0003\u0002\u0002\u0002\u0081\u01f0\u0003\u0002\u0002\u0002\u0083\u01f2\u0003\u0002\u0002\u0002\u0085\u01f4\u0003\u0002\u0002\u0002\u0087\u01f6\u0003\u0002\u0002\u0002\u0089\u01f8\u0003\u0002\u0002\u0002\u008b\u01fa\u0003\u0002\u0002\u0002\u008d\u0202\u0003\u0002\u0002\u0002\u008f\u0206\u0003\u0002\u0002\u0002\u0091\u0215\u0003\u0002\u0002\u0002\u0093\u0218\u0003\u0002\u0002\u0002\u0095\u0222\u0003\u0002\u0002\u0002\u0097\u022c\u0003\u0002\u0002\u0002\u0099\u0231\u0003\u0002\u0002\u0002\u009b\u0237\u0003\u0002\u0002\u0002\u009d\u0239\u0003\u0002\u0002\u0002\u009f\u00a1\u0009\u0002\u0002\u0002\u00a0\u009f\u0003\u0002\u0002\u0002\u00a1\u00a2\u0003\u0002\u0002\u0002\u00a2\u00a0\u0003\u0002\u0002\u0002\u00a2\u00a3\u0003\u0002\u0002\u0002\u00a3\u00a4\u0003\u0002\u0002\u0002\u00a4\u00a5\u0008\u0002\u0002\u0002\u00a5\u0004\u0003\u0002\u0002\u0002\u00a6\u00a7\u0007\u0031\u0002\u0002\u00a7\u00a8\u0007\u002c\u0002\u0002\u00a8\u00ac\u0003\u0002\u0002\u0002\u00a9\u00ab\u000b\u0002\u0002\u0002\u00aa\u00a9\u0003\u0002\u0002\u0002\u00ab\u00ae\u0003\u0002\u0002\u0002\u00ac\u00ad\u0003\u0002\u0002\u0002\u00ac\u00aa\u0003\u0002\u0002\u0002\u00ad\u00af\u0003\u0002\u0002\u0002\u00ae\u00ac\u0003\u0002\u0002\u0002\u00af\u00b0\u0007\u002c\u0002\u0002\u00b0\u00b1\u0007\u0031\u0002\u0002\u00b1\u00b2\u0003\u0002\u0002\u0002\u00b2\u00b3\u0008\u0003\u0002\u0002\u00b3\u0006\u0003\u0002\u0002\u0002\u00b4\u00b5\u0007\u0031\u0002\u0002\u00b5\u00b6\u0007\u0031\u0002\u0002\u00b6\u00ba\u0003\u0002\u0002\u0002\u00b7\u00b9\u000a\u0003\u0002\u0002\u00b8\u00b7\u0003\u0002\u0002\u0002\u00b9\u00bc\u0003\u0002\u0002\u0002\u00ba\u00b8\u0003\u0002\u0002\u0002\u00ba\u00bb\u0003\u0002\u0002\u0002\u00bb\u00bd\u0003\u0002\u0002\u0002\u00bc\u00ba\u0003\u0002\u0002\u0002\u00bd\u00be\u0008\u0004\u0002\u0002\u00be\u0008\u0003\u0002\u0002\u0002\u00bf\u00c0\u0007\u0063\u0002\u0002\u00c0\u00c1\u0007\u0064\u0002\u0002\u00c1\u00c2\u0007\u0075\u0002\u0002\u00c2\u00c3\u0007\u0076\u0002\u0002\u00c3\u00c4\u0007\u0074\u0002\u0002\u00c4\u00c5\u0007\u0063\u0002\u0002\u00c5\u00c6\u0007\u0065\u0002\u0002\u00c6\u00c7\u0007\u0076\u0002\u0002\u00c7\u000a\u0003\u0002\u0002\u0002\u00c8\u00c9\u0007\u0063\u0002\u0002\u00c9\u00ca\u0007\u0070\u0002\u0002\u00ca\u00cb\u0007\u0070\u0002\u0002\u00cb\u00cc\u0007\u0071\u0002\u0002\u00cc\u00cd\u0007\u0076\u0002\u0002\u00cd\u00ce\u0007\u0063\u0002\u0002\u00ce\u00cf\u0007\u0076\u0002\u0002\u00cf\u00d0\u0007\u006b\u0002\u0002\u00d0\u00d1\u0007\u0071\u0002\u0002\u00d1\u00d2\u0007\u0070\u0002\u0002\u00d2\u000c\u0003\u0002\u0002\u0002\u00d3\u00d4\u0007\u0065\u0002\u0002\u00d4\u00d5\u0007\u006e\u0002\u0002\u00d5\u00d6\u0007\u0063\u0002\u0002\u00d6\u00d7\u0007\u0075\u0002\u0002\u00d7\u00d8\u0007\u0075\u0002\u0002\u00d8\u000e\u0003\u0002\u0002\u0002\u00d9\u00da\u0007\u0066\u0002\u0002\u00da\u00db\u0007\u0071\u0002\u0002\u00db\u0010\u0003\u0002\u0002\u0002\u00dc\u00dd\u0007\u0068\u0002\u0002\u00dd\u00de\u0007\u0071\u0002\u0002\u00de\u00df\u0007\u0074\u0002\u0002\u00df\u00e0\u0007\u0067\u0002\u0002\u00e0\u00e1\u0007\u006b\u0002\u0002\u00e1\u00e2\u0007\u0069\u0002\u0002\u00e2\u00e3\u0007\u0070\u0002\u0002\u00e3\u0012\u0003\u0002\u0002\u0002\u00e4\u00e5\u0007\u0072\u0002\u0002\u00e5\u00e6\u0007\u0063\u0002\u0002\u00e6\u00e7\u0007\u0065\u0002\u0002\u00e7\u00e8\u0007\u006d\u0002\u0002\u00e8\u00e9\u0007\u0063\u0002\u0002\u00e9\u00ea\u0007\u0069\u0002\u0002\u00ea\u00eb\u0007\u0067\u0002\u0002\u00eb\u0014\u0003\u0002\u0002\u0002\u00ec\u00ed\u0007\u006b\u0002\u0002\u00ed\u00ee\u0007\u0070\u0002\u0002\u00ee\u00ef\u0007\u0076\u0002\u0002\u00ef\u00f0\u0007\u0067\u0002\u0002\u00f0\u00f1\u0007\u0074\u0002\u0002\u00f1\u00f2\u0007\u0070\u0002\u0002\u00f2\u00f3\u0007\u0063\u0002\u0002\u00f3\u00f4\u0007\u006e\u0002\u0002\u00f4\u0016\u0003\u0002\u0002\u0002\u00f5\u00f6\u0007\u006b\u0002\u0002\u00f6\u00f7\u0007\u006f\u0002\u0002\u00f7\u00f8\u0007\u0072\u0002\u0002\u00f8\u00f9\u0007\u0071\u0002\u0002\u00f9\u00fa\u0007\u0074\u0002\u0002\u00fa\u00fb\u0007\u0076\u0002\u0002\u00fb\u0018\u0003\u0002\u0002\u0002\u00fc\u00fd\u0007\u006b\u0002\u0002\u00fd\u00fe\u0007\u006f\u0002\u0002\u00fe\u00ff\u0007\u0072\u0002\u0002\u00ff\u0100\u0007\u006e\u0002\u0002\u0100\u001a\u0003\u0002\u0002\u0002\u0101\u0102\u0007\u006b\u0002\u0002\u0102\u0103\u0007\u0070\u0002\u0002\u0103\u0104\u0007\u006a\u0002\u0002\u0104\u0105\u0007\u0067\u0002\u0002\u0105\u0106\u0007\u0074\u0002\u0002\u0106\u0107\u0007\u006b\u0002\u0002\u0107\u0108\u0007\u0076\u0002\u0002\u0108\u001c\u0003\u0002\u0002\u0002\u0109\u010a\u0007\u0074\u0002\u0002\u010a\u010b\u0007\u0067\u0002\u0002\u010b\u010c\u0007\u0076\u0002\u0002\u010c\u010d\u0007\u0077\u0002\u0002\u010d\u010e\u0007\u0074\u0002\u0002\u010e\u010f\u0007\u0070\u0002\u0002\u010f\u001e\u0003\u0002\u0002\u0002\u0110\u0111\u0007\u006f\u0002\u0002\u0111\u0112\u0007\u0077\u0002\u0002\u0112\u0113\u0007\u0076\u0002\u0002\u0113\u0114\u0007\u0063\u0002\u0002\u0114\u0115\u0007\u0064\u0002\u0002\u0115\u0116\u0007\u006e\u0002\u0002\u0116\u0117\u0007\u0067\u0002\u0002\u0117\u0020\u0003\u0002\u0002\u0002\u0118\u0119\u0007\u006b\u0002\u0002\u0119\u011a\u0007\u0070\u0002\u0002\u011a\u011b\u0007\u0076\u0002\u0002\u011b\u011c\u0007\u0067\u0002\u0002\u011c\u011d\u0007\u0074\u0002\u0002\u011d\u011e\u0007\u0068\u0002\u0002\u011e\u011f\u0007\u0063\u0002\u0002\u011f\u0120\u0007\u0065\u0002\u0002\u0120\u0121\u0007\u0067\u0002\u0002\u0121\u0022\u0003\u0002\u0002\u0002\u0122\u0123\u0007\u0066\u0002\u0002\u0123\u0124\u0007\u0063\u0002\u0002\u0124\u0125\u0007\u0076\u0002\u0002\u0125\u0126\u0007\u0063\u0002\u0002\u0126\u0024\u0003\u0002\u0002\u0002\u0127\u0128\u0007\u006b\u0002\u0002\u0128\u0129\u0007\u0070\u0002\u0002\u0129\u012a\u0007\u0078\u0002\u0002\u012a\u012b\u0007\u0067\u0002\u0002\u012b\u012c\u0007\u0074\u0002\u0002\u012c\u012d\u0007\u0075\u0002\u0002\u012d\u012e\u0007\u0067\u0002\u0002\u012e\u0026\u0003\u0002\u0002\u0002\u012f\u0130\u0007\u0067\u0002\u0002\u0130\u0131\u0007\u007a\u0002\u0002\u0131\u0132\u0007\u0072\u0002\u0002\u0132\u0133\u0007\u0067\u0002\u0002\u0133\u0134\u0007\u0065\u0002\u0002\u0134\u0135\u0007\u0076\u0002\u0002\u0135\u0028\u0003\u0002\u0002\u0002\u0136\u0137\u0007\u006b\u0002\u0002\u0137\u0138\u0007\u0068\u0002\u0002\u0138\u002a\u0003\u0002\u0002\u0002\u0139\u013a\u0007\u0067\u0002\u0002\u013a\u013b\u0007\u006e\u0002\u0002\u013b\u013c\u0007\u0075\u0002\u0002\u013c\u013d\u0007\u0067\u0002\u0002\u013d\u002c\u0003\u0002\u0002\u0002\u013e\u013f\u0007\u0070\u0002\u0002\u013f\u0140\u0007\u0067\u0002\u0002\u0140\u0141\u0007\u0079\u0002\u0002\u0141\u002e\u0003\u0002\u0002\u0002\u0142\u0143\u0007\u006e\u0002\u0002\u0143\u0144\u0007\u0067\u0002\u0002\u0144\u0145\u0007\u0076\u0002\u0002\u0145\u0030\u0003\u0002\u0002\u0002\u0146\u0147\u0007\u0076\u0002\u0002\u0147\u0148\u0007\u007b\u0002\u0002\u0148\u0149\u0007\u0072\u0002\u0002\u0149\u014a\u0007\u0067\u0002\u0002\u014a\u014b\u0007\u0063\u0002\u0002\u014b\u014c\u0007\u006e\u0002\u0002\u014c\u014d\u0007\u006b\u0002\u0002\u014d\u014e\u0007\u0063\u0002\u0002\u014e\u014f\u0007\u0075\u0002\u0002\u014f\u0032\u0003\u0002\u0002\u0002\u0150\u0151\u0007\u0079\u0002\u0002\u0151\u0152\u0007\u006a\u0002\u0002\u0152\u0153\u0007\u0067\u0002\u0002\u0153\u0154\u0007\u0074\u0002\u0002\u0154\u0155\u0007\u0067\u0002\u0002\u0155\u0034\u0003\u0002\u0002\u0002\u0156\u0157\u0007\u0068\u0002\u0002\u0157\u0158\u0007\u0074\u0002\u0002\u0158\u0159\u0007\u0071\u0002\u0002\u0159\u015a\u0007\u006f\u0002\u0002\u015a\u015b\u0007\u0023\u0002\u0002\u015b\u0036\u0003\u0002\u0002\u0002\u015c\u015d\u0007\u006b\u0002\u0002\u015d\u015e\u0007\u0075\u0002\u0002\u015e\u015f\u0007\u0023\u0002\u0002\u015f\u0038\u0003\u0002\u0002\u0002\u0160\u0161\u0007\u0069\u0002\u0002\u0161\u0162\u0007\u0067\u0002\u0002\u0162\u0163\u0007\u0076\u0002\u0002\u0163\u0164\u0007\u0023\u0002\u0002\u0164\u003a\u0003\u0002\u0002\u0002\u0165\u0166\u0007\u0075\u0002\u0002\u0166\u0167\u0007\u0067\u0002\u0002\u0167\u0168\u0007\u0076\u0002\u0002\u0168\u0169\u0007\u0023\u0002\u0002\u0169\u003c\u0003\u0002\u0002\u0002\u016a\u016b\u0007\u0074\u0002\u0002\u016b\u016c\u0007\u0067\u0002\u0002\u016c\u016d\u0007\u006f\u0002\u0002\u016d\u016e\u0007\u0063\u0002\u0002\u016e\u016f\u0007\u006b\u0002\u0002\u016f\u0170\u0007\u0070\u0002\u0002\u0170\u0171\u0007\u0023\u0002\u0002\u0171\u003e\u0003\u0002\u0002\u0002\u0172\u0173\u0007\u006f\u0002\u0002\u0173\u0174\u0007\u0063\u0002\u0002\u0174\u0175\u0007\u0076\u0002\u0002\u0175\u0176\u0007\u0065\u0002\u0002\u0176\u0177\u0007\u006a\u0002\u0002\u0177\u0178\u0007\u0023\u0002\u0002\u0178\u0040\u0003\u0002\u0002\u0002\u0179\u017a\u0007\u004b\u0002\u0002\u017a\u017b\u0007\u0070\u0002\u0002\u017b\u017c\u0007\u0076\u0002\u0002\u017c\u0042\u0003\u0002\u0002\u0002\u017d\u017e\u0007\u004e\u0002\u0002\u017e\u017f\u0007\u0071\u0002\u0002\u017f\u0180\u0007\u0070\u0002\u0002\u0180\u0181\u0007\u0069\u0002\u0002\u0181\u0044\u0003\u0002\u0002\u0002\u0182\u0183\u0007\u0046\u0002\u0002\u0183\u0184\u0007\u0071\u0002\u0002\u0184\u0185\u0007\u0077\u0002\u0002\u0185\u0186\u0007\u0064\u0002\u0002\u0186\u0187\u0007\u006e\u0002\u0002\u0187\u0188\u0007\u0067\u0002\u0002\u0188\u0046\u0003\u0002\u0002\u0002\u0189\u018a\u0007\u0048\u0002\u0002\u018a\u018b\u0007\u006e\u0002\u0002\u018b\u018c\u0007\u0071\u0002\u0002\u018c\u018d\u0007\u0063\u0002\u0002\u018d\u018e\u0007\u0076\u0002\u0002\u018e\u0048\u0003\u0002\u0002\u0002\u018f\u0190\u0007\u0044\u0002\u0002\u0190\u0191\u0007\u007b\u0002\u0002\u0191\u0192\u0007\u0076\u0002\u0002\u0192\u0193\u0007\u0067\u0002\u0002\u0193\u004a\u0003\u0002\u0002\u0002\u0194\u0195\u0007\u0045\u0002\u0002\u0195\u0196\u0007\u006a\u0002\u0002\u0196\u0197\u0007\u0063\u0002\u0002\u0197\u0198\u0007\u0074\u0002\u0002\u0198\u004c\u0003\u0002\u0002\u0002\u0199\u019a\u0007\u0055\u0002\u0002\u019a\u019b\u0007\u0076\u0002\u0002\u019b\u019c\u0007\u0074\u0002\u0002\u019c\u019d\u0007\u006b\u0002\u0002\u019d\u019e\u0007\u0070\u0002\u0002\u019e\u019f\u0007\u0069\u0002\u0002\u019f\u004e\u0003\u0002\u0002\u0002\u01a0\u01a1\u0007\u0044\u0002\u0002\u01a1\u01a2\u0007\u0071\u0002\u0002\u01a2\u01a3\u0007\u0071\u0002\u0002\u01a3\u01a4\u0007\u006e\u0002\u0002\u01a4\u01a5\u0007\u0067\u0002\u0002\u01a5\u01a6\u0007\u0063\u0002\u0002\u01a6\u01a7\u0007\u0070\u0002\u0002\u01a7\u0050\u0003\u0002\u0002\u0002\u01a8\u01a9\u0007\u0057\u0002\u0002\u01a9\u01aa\u0007\u0070\u0002\u0002\u01aa\u01ab\u0007\u006b\u0002\u0002\u01ab\u01ac\u0007\u0076\u0002\u0002\u01ac\u0052\u0003\u0002\u0002\u0002\u01ad\u01ae\u0007\u0070\u0002\u0002\u01ae\u01af\u0007\u0077\u0002\u0002\u01af\u01b0\u0007\u006e\u0002\u0002\u01b0\u01b1\u0007\u006e\u0002\u0002\u01b1\u0054\u0003\u0002\u0002\u0002\u01b2\u01b3\u0007\u0076\u0002\u0002\u01b3\u01b4\u0007\u0074\u0002\u0002\u01b4\u01b5\u0007\u0077\u0002\u0002\u01b5\u01b6\u0007\u0067\u0002\u0002\u01b6\u0056\u0003\u0002\u0002\u0002\u01b7\u01b8\u0007\u0068\u0002\u0002\u01b8\u01b9\u0007\u0063\u0002\u0002\u01b9\u01ba\u0007\u006e\u0002\u0002\u01ba\u01bb\u0007\u0075\u0002\u0002\u01bb\u01bc\u0007\u0067\u0002\u0002\u01bc\u0058\u0003\u0002\u0002\u0002\u01bd\u01be\u0007\u0042\u0002\u0002\u01be\u005a\u0003\u0002\u0002\u0002\u01bf\u01c0\u0007\u003f\u0002\u0002\u01c0\u005c\u0003\u0002\u0002\u0002\u01c1\u01c2\u0007\u0030\u0002\u0002\u01c2\u01c3\u0007\u0030\u0002\u0002\u01c3\u01c4\u0007\u0030\u0002\u0002\u01c4\u005e\u0003\u0002\u0002\u0002\u01c5\u01c6\u0007\u0030\u0002\u0002\u01c6\u0060\u0003\u0002\u0002\u0002\u01c7\u01c8\u0007\u002a\u0002\u0002\u01c8\u0062\u0003\u0002\u0002\u0002\u01c9\u01ca\u0007\u002b\u0002\u0002\u01ca\u0064\u0003\u0002\u0002\u0002\u01cb\u01cc\u0007\u005d\u0002\u0002\u01cc\u0066\u0003\u0002\u0002\u0002\u01cd\u01ce\u0007\u005f\u0002\u0002\u01ce\u0068\u0003\u0002\u0002\u0002\u01cf\u01d0\u0007\u007d\u0002\u0002\u01d0\u006a\u0003\u0002\u0002\u0002\u01d1\u01d2\u0007\u007f\u0002\u0002\u01d2\u006c\u0003\u0002\u0002\u0002\u01d3\u01d4\u0007\u002f\u0002\u0002\u01d4\u01d5\u0007\u0040\u0002\u0002\u01d5\u006e\u0003\u0002\u0002\u0002\u01d6\u01d7\u0007\u002f\u0002\u0002\u01d7\u01d8\u0007\u0040\u0002\u0002\u01d8\u01d9\u0007\u0041\u0002\u0002\u01d9\u0070\u0003\u0002\u0002\u0002\u01da\u01db\u0007\u0080\u0002\u0002\u01db\u0072\u0003\u0002\u0002\u0002\u01dc\u01dd\u0007\u0080\u0002\u0002\u01dd\u01de\u0007\u0040\u0002\u0002\u01de\u0074\u0003\u0002\u0002\u0002\u01df\u01e0\u0007\u003c\u0002\u0002\u01e0\u0076\u0003\u0002\u0002\u0002\u01e1\u01e2\u0007\u003c\u0002\u0002\u01e2\u01e3\u0007\u003c\u0002\u0002\u01e3\u0078\u0003\u0002\u0002\u0002\u01e4\u01e5\u0007\u003c\u0002\u0002\u01e5\u01e6\u0007\u003c\u0002\u0002\u01e6\u01e7\u0007\u003c\u0002\u0002\u01e7\u007a\u0003\u0002\u0002\u0002\u01e8\u01e9\u0007\u003c\u0002\u0002\u01e9\u01ea\u0007\u0025\u0002\u0002\u01ea\u007c\u0003\u0002\u0002\u0002\u01eb\u01ec\u0007\u0029\u0002\u0002\u01ec\u007e\u0003\u0002\u0002\u0002\u01ed\u01ee\u0007\u003c\u0002\u0002\u01ee\u01ef\u0007\u0029\u0002\u0002\u01ef\u0080\u0003\u0002\u0002\u0002\u01f0\u01f1\u0007\u0025\u0002\u0002\u01f1\u0082\u0003\u0002\u0002\u0002\u01f2\u01f3\u0007\u0041\u0002\u0002\u01f3\u0084\u0003\u0002\u0002\u0002\u01f4\u01f5\u0009\u0004\u0002\u0002\u01f5\u0086\u0003\u0002\u0002\u0002\u01f6\u01f7\u0009\u0005\u0002\u0002\u01f7\u0088\u0003\u0002\u0002\u0002\u01f8\u01f9\u0009\u0006\u0002\u0002\u01f9\u008a\u0003\u0002\u0002\u0002\u01fa\u01fe\u0005\u0085\u0043\u0002\u01fb\u01fd\u0005\u0087\u0044\u0002\u01fc\u01fb\u0003\u0002\u0002\u0002\u01fd\u0200\u0003\u0002\u0002\u0002\u01fe\u01fc\u0003\u0002\u0002\u0002\u01fe\u01ff\u0003\u0002\u0002\u0002\u01ff\u008c\u0003\u0002\u0002\u0002\u0200\u01fe\u0003\u0002\u0002\u0002\u0201\u0203\u0005\u0089\u0045\u0002\u0202\u0201\u0003\u0002\u0002\u0002\u0203\u0204\u0003\u0002\u0002\u0002\u0204\u0202\u0003\u0002\u0002\u0002\u0204\u0205\u0003\u0002\u0002\u0002\u0205\u008e\u0003\u0002\u0002\u0002\u0206\u0207\u0009\u0007\u0002\u0002\u0207\u0090\u0003\u0002\u0002\u0002\u0208\u020a\u0005\u008f\u0048\u0002\u0209\u0208\u0003\u0002\u0002\u0002\u020a\u020b\u0003\u0002\u0002\u0002\u020b\u0209\u0003\u0002\u0002\u0002\u020b\u020c\u0003\u0002\u0002\u0002\u020c\u0216\u0003\u0002\u0002\u0002\u020d\u020e\u0007\u0032\u0002\u0002\u020e\u020f\u0007\u007a\u0002\u0002\u020f\u0211\u0003\u0002\u0002\u0002\u0210\u0212\u0005\u009b\u004e\u0002\u0211\u0210\u0003\u0002\u0002\u0002\u0212\u0213\u0003\u0002\u0002\u0002\u0213\u0211\u0003\u0002\u0002\u0002\u0213\u0214\u0003\u0002\u0002\u0002\u0214\u0216\u0003\u0002\u0002\u0002\u0215\u0209\u0003\u0002\u0002\u0002\u0215\u020d\u0003\u0002\u0002\u0002\u0216\u0092\u0003\u0002\u0002\u0002\u0217\u0219\u0005\u008f\u0048\u0002\u0218\u0217\u0003\u0002\u0002\u0002\u0219\u021a\u0003\u0002\u0002\u0002\u021a\u0218\u0003\u0002\u0002\u0002\u021a\u021b\u0003\u0002\u0002\u0002\u021b\u021c\u0003\u0002\u0002\u0002\u021c\u021e\u0007\u0030\u0002\u0002\u021d\u021f\u0005\u008f\u0048\u0002\u021e\u021d\u0003\u0002\u0002\u0002\u021f\u0220\u0003\u0002\u0002\u0002\u0220\u021e\u0003\u0002\u0002\u0002\u0220\u0221\u0003\u0002\u0002\u0002\u0221\u0094\u0003\u0002\u0002\u0002\u0222\u0227\u0007\u0024\u0002\u0002\u0223\u0226\u0005\u0097\u004c\u0002\u0224\u0226\u000a\u0008\u0002\u0002\u0225\u0223\u0003\u0002\u0002\u0002\u0225\u0224\u0003\u0002\u0002\u0002\u0226\u0229\u0003\u0002\u0002\u0002\u0227\u0225\u0003\u0002\u0002\u0002\u0227\u0228\u0003\u0002\u0002\u0002\u0228\u022a\u0003\u0002\u0002\u0002\u0229\u0227\u0003\u0002\u0002\u0002\u022a\u022b\u0007\u0024\u0002\u0002\u022b\u0096\u0003\u0002\u0002\u0002\u022c\u022f\u0007\u005e\u0002\u0002\u022d\u0230\u0009\u0009\u0002\u0002\u022e\u0230\u0005\u0099\u004d\u0002\u022f\u022d\u0003\u0002\u0002\u0002\u022f\u022e\u0003\u0002\u0002\u0002\u0230\u0098\u0003\u0002\u0002\u0002\u0231\u0232\u0007\u0077\u0002\u0002\u0232\u0233\u0005\u009b\u004e\u0002\u0233\u0234\u0005\u009b\u004e\u0002\u0234\u0235\u0005\u009b\u004e\u0002\u0235\u0236\u0005\u009b\u004e\u0002\u0236\u009a\u0003\u0002\u0002\u0002\u0237\u0238\u0009\u000a\u0002\u0002\u0238\u009c\u0003\u0002\u0002\u0002\u0239\u023d\u0007\u0062\u0002\u0002\u023a\u023c\u000a\u000b\u0002\u0002\u023b\u023a\u0003\u0002\u0002\u0002\u023c\u023f\u0003\u0002\u0002\u0002\u023d\u023b\u0003\u0002\u0002\u0002\u023d\u023e\u0003\u0002\u0002\u0002\u023e\u0240\u0003\u0002\u0002\u0002\u023f\u023d\u0003\u0002\u0002\u0002\u0240\u0241\u0007\u0062\u0002\u0002\u0241\u009e\u0003\u0002\u0002\u0002\u0011\u0002\u00a2\u00ac\u00ba\u01fe\u0204\u020b\u0213\u0215\u021a\u0220\u0225\u0227\u022f\u023d\u0003\u0008\u0002\u0002"

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
	    WHERE(25),
	    FROM(26),
	    IS(27),
	    GET(28),
	    SET(29),
	    REMAIN(30),
	    MATCH(31),
	    INT(32),
	    LONG(33),
	    DOUBLE(34),
	    FLOAT(35),
	    BYTE(36),
	    CHAR(37),
	    STRING(38),
	    BOOLEAN(39),
	    UNIT(40),
	    NULL(41),
	    TRUE(42),
	    FALSE(43),
	    ALPHA(44),
	    ASSGIN(45),
	    ELLIPSIS(46),
	    DOT(47),
	    LPAREN(48),
	    RPAREN(49),
	    LSQUARE(50),
	    RSQUARE(51),
	    LBRACE(52),
	    RBRACE(53),
	    ARROW(54),
	    ARROWQM(55),
	    TILDE(56),
	    As(57),
	    COLON(58),
	    DOUBLECOLON(59),
	    TRIPLECOLON(60),
	    COLONSHARP(61),
	    QUOTE(62),
	    COLONQUOTE(63),
	    SHARP(64),
	    QM(65),
	    ID(66),
	    OPID(67),
	    Integer(68),
	    Double(69),
	    String(70),
	    RawString(71)
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
	    WHERE,
	    FROM,
	    IS,
	    GET,
	    SET,
	    REMAIN,
	    MATCH,
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
	    TRIPLECOLON,
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