// Generated from java-escape by ANTLR 4.7.1
package foldenx.parser

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
		                                                  "'as'", "'abstract'", 
		                                                  "'annotation'", "'class'", 
		                                                  "'do'", "'external'", 
		                                                  "'foreign'", "'package'", 
		                                                  "'override'", "'internal'", 
		                                                  "'import'", "'return'", 
		                                                  "'var'", "'val'", "'static'", 
		                                                  "'interface'", "'='", 
		                                                  "'...'", "'.'", "'('", 
		                                                  "')'", "'['", "'[:'", 
		                                                  "']'", "':]'", "'{'", 
		                                                  "'}'", "'->'", "'~'", 
		                                                  "':'", "'::'")
		private val SYMBOLIC_NAMES: List<String?> = listOf(null, "WS", "COMMENT", 
		                                                   "LINE_COMMENT", "AS", 
		                                                   "ABSTRACT", "ANNOTATION", 
		                                                   "Class", "DO", "EXTERNAL", 
		                                                   "FOREIGN", "NAMESPACE", 
		                                                   "OVERRIDE", "INTERNAL", 
		                                                   "IMPORT", "RETURN", 
		                                                   "VAR", "VAL", "STATIC", 
		                                                   "INTERFACE", "ASSGIN", 
		                                                   "ELLIPSIS", "DOT", 
		                                                   "LPAREN", "RPAREN", 
		                                                   "LSQUARE", "LCOLONSQUARE", 
		                                                   "RSQUARE", "RCOLONSQUARE", 
		                                                   "LBRACE", "RBRACE", 
		                                                   "ARROW", "TILDE", "COLON", 
		                                                   "DOUBLECOLON", "ID", 
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

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u002a\u015c\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0003\u0002\u0006\u0002\u0067\u000a\u0002\u000d\u0002\u000e\u0002\u0068\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u0071\u000a\u0003\u000c\u0003\u000e\u0003\u0074\u000b\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004\u007f\u000a\u0004\u000c\u0004\u000e\u0004\u0082\u000b\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0007\u0027\u0124\u000a\u0027\u000c\u0027\u000e\u0027\u0127\u000b\u0027\u0003\u0028\u0006\u0028\u012a\u000a\u0028\u000d\u0028\u000e\u0028\u012b\u0003\u0029\u0003\u0029\u0003\u002a\u0006\u002a\u0131\u000a\u002a\u000d\u002a\u000e\u002a\u0132\u0003\u002b\u0006\u002b\u0136\u000a\u002b\u000d\u002b\u000e\u002b\u0137\u0003\u002b\u0003\u002b\u0006\u002b\u013c\u000a\u002b\u000d\u002b\u000e\u002b\u013d\u0003\u002c\u0003\u002c\u0005\u002c\u0142\u000a\u002c\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002e\u0006\u002e\u014b\u000a\u002e\u000d\u002e\u000e\u002e\u014c\u0003\u002f\u0006\u002f\u0150\u000a\u002f\u000d\u002f\u000e\u002f\u0151\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0005\u0031\u0158\u000a\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0072\u0002\u0033\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011\u0021\u0012\u0023\u0013\u0025\u0014\u0027\u0015\u0029\u0016\u002b\u0017\u002d\u0018\u002f\u0019\u0031\u001a\u0033\u001b\u0035\u001c\u0037\u001d\u0039\u001e\u003b\u001f\u003d\u0020\u003f\u0021\u0041\u0022\u0043\u0023\u0045\u0024\u0047\u0002\u0049\u0002\u004b\u0002\u004d\u0025\u004f\u0026\u0051\u0002\u0053\u0027\u0055\u0028\u0057\u0029\u0059\u002a\u005b\u0002\u005d\u0002\u005f\u0002\u0061\u0002\u0063\u0002\u0003\u0002\u000a\u0005\u0002\u000b\u000c\u000e\u000f\u0022\u0022\u0004\u0002\u000c\u000c\u000f\u000f\u0005\u0002\u0043\u005c\u0061\u0061\u0063\u007c\u0007\u0002\u002f\u002f\u0032\u003b\u0043\u005c\u0061\u0061\u0063\u007c\u000a\u0002\u0023\u0023\u0025\u0028\u002c\u0031\u003d\u0042\u005e\u005e\u0060\u0060\u007e\u007e\u0080\u0080\u0003\u0002\u0032\u003b\u0006\u0002\u000c\u000c\u000f\u000f\u0024\u0024\u005e\u005e\u000a\u0002\u0024\u0024\u0029\u0029\u005e\u005e\u0064\u0064\u0068\u0068\u0070\u0070\u0074\u0074\u0076\u0076\u0002\u015e\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002\u0021\u0003\u0002\u0002\u0002\u0002\u0023\u0003\u0002\u0002\u0002\u0002\u0025\u0003\u0002\u0002\u0002\u0002\u0027\u0003\u0002\u0002\u0002\u0002\u0029\u0003\u0002\u0002\u0002\u0002\u002b\u0003\u0002\u0002\u0002\u0002\u002d\u0003\u0002\u0002\u0002\u0002\u002f\u0003\u0002\u0002\u0002\u0002\u0031\u0003\u0002\u0002\u0002\u0002\u0033\u0003\u0002\u0002\u0002\u0002\u0035\u0003\u0002\u0002\u0002\u0002\u0037\u0003\u0002\u0002\u0002\u0002\u0039\u0003\u0002\u0002\u0002\u0002\u003b\u0003\u0002\u0002\u0002\u0002\u003d\u0003\u0002\u0002\u0002\u0002\u003f\u0003\u0002\u0002\u0002\u0002\u0041\u0003\u0002\u0002\u0002\u0002\u0043\u0003\u0002\u0002\u0002\u0002\u0045\u0003\u0002\u0002\u0002\u0002\u004d\u0003\u0002\u0002\u0002\u0002\u004f\u0003\u0002\u0002\u0002\u0002\u0053\u0003\u0002\u0002\u0002\u0002\u0055\u0003\u0002\u0002\u0002\u0002\u0057\u0003\u0002\u0002\u0002\u0002\u0059\u0003\u0002\u0002\u0002\u0003\u0066\u0003\u0002\u0002\u0002\u0005\u006c\u0003\u0002\u0002\u0002\u0007\u007a\u0003\u0002\u0002\u0002\u0009\u0085\u0003\u0002\u0002\u0002\u000b\u0088\u0003\u0002\u0002\u0002\u000d\u0091\u0003\u0002\u0002\u0002\u000f\u009c\u0003\u0002\u0002\u0002\u0011\u00a2\u0003\u0002\u0002\u0002\u0013\u00a5\u0003\u0002\u0002\u0002\u0015\u00ae\u0003\u0002\u0002\u0002\u0017\u00b6\u0003\u0002\u0002\u0002\u0019\u00be\u0003\u0002\u0002\u0002\u001b\u00c7\u0003\u0002\u0002\u0002\u001d\u00d0\u0003\u0002\u0002\u0002\u001f\u00d7\u0003\u0002\u0002\u0002\u0021\u00de\u0003\u0002\u0002\u0002\u0023\u00e2\u0003\u0002\u0002\u0002\u0025\u00e6\u0003\u0002\u0002\u0002\u0027\u00ed\u0003\u0002\u0002\u0002\u0029\u00f7\u0003\u0002\u0002\u0002\u002b\u00f9\u0003\u0002\u0002\u0002\u002d\u00fd\u0003\u0002\u0002\u0002\u002f\u00ff\u0003\u0002\u0002\u0002\u0031\u0101\u0003\u0002\u0002\u0002\u0033\u0103\u0003\u0002\u0002\u0002\u0035\u0105\u0003\u0002\u0002\u0002\u0037\u0108\u0003\u0002\u0002\u0002\u0039\u010a\u0003\u0002\u0002\u0002\u003b\u010d\u0003\u0002\u0002\u0002\u003d\u010f\u0003\u0002\u0002\u0002\u003f\u0111\u0003\u0002\u0002\u0002\u0041\u0114\u0003\u0002\u0002\u0002\u0043\u0116\u0003\u0002\u0002\u0002\u0045\u0118\u0003\u0002\u0002\u0002\u0047\u011b\u0003\u0002\u0002\u0002\u0049\u011d\u0003\u0002\u0002\u0002\u004b\u011f\u0003\u0002\u0002\u0002\u004d\u0121\u0003\u0002\u0002\u0002\u004f\u0129\u0003\u0002\u0002\u0002\u0051\u012d\u0003\u0002\u0002\u0002\u0053\u0130\u0003\u0002\u0002\u0002\u0055\u0135\u0003\u0002\u0002\u0002\u0057\u013f\u0003\u0002\u0002\u0002\u0059\u0145\u0003\u0002\u0002\u0002\u005b\u014a\u0003\u0002\u0002\u0002\u005d\u014f\u0003\u0002\u0002\u0002\u005f\u0153\u0003\u0002\u0002\u0002\u0061\u0157\u0003\u0002\u0002\u0002\u0063\u0159\u0003\u0002\u0002\u0002\u0065\u0067\u0009\u0002\u0002\u0002\u0066\u0065\u0003\u0002\u0002\u0002\u0067\u0068\u0003\u0002\u0002\u0002\u0068\u0066\u0003\u0002\u0002\u0002\u0068\u0069\u0003\u0002\u0002\u0002\u0069\u006a\u0003\u0002\u0002\u0002\u006a\u006b\u0008\u0002\u0002\u0002\u006b\u0004\u0003\u0002\u0002\u0002\u006c\u006d\u0007\u0031\u0002\u0002\u006d\u006e\u0007\u002c\u0002\u0002\u006e\u0072\u0003\u0002\u0002\u0002\u006f\u0071\u000b\u0002\u0002\u0002\u0070\u006f\u0003\u0002\u0002\u0002\u0071\u0074\u0003\u0002\u0002\u0002\u0072\u0073\u0003\u0002\u0002\u0002\u0072\u0070\u0003\u0002\u0002\u0002\u0073\u0075\u0003\u0002\u0002\u0002\u0074\u0072\u0003\u0002\u0002\u0002\u0075\u0076\u0007\u002c\u0002\u0002\u0076\u0077\u0007\u0031\u0002\u0002\u0077\u0078\u0003\u0002\u0002\u0002\u0078\u0079\u0008\u0003\u0002\u0002\u0079\u0006\u0003\u0002\u0002\u0002\u007a\u007b\u0007\u0031\u0002\u0002\u007b\u007c\u0007\u0031\u0002\u0002\u007c\u0080\u0003\u0002\u0002\u0002\u007d\u007f\u000a\u0003\u0002\u0002\u007e\u007d\u0003\u0002\u0002\u0002\u007f\u0082\u0003\u0002\u0002\u0002\u0080\u007e\u0003\u0002\u0002\u0002\u0080\u0081\u0003\u0002\u0002\u0002\u0081\u0083\u0003\u0002\u0002\u0002\u0082\u0080\u0003\u0002\u0002\u0002\u0083\u0084\u0008\u0004\u0002\u0002\u0084\u0008\u0003\u0002\u0002\u0002\u0085\u0086\u0007\u0063\u0002\u0002\u0086\u0087\u0007\u0075\u0002\u0002\u0087\u000a\u0003\u0002\u0002\u0002\u0088\u0089\u0007\u0063\u0002\u0002\u0089\u008a\u0007\u0064\u0002\u0002\u008a\u008b\u0007\u0075\u0002\u0002\u008b\u008c\u0007\u0076\u0002\u0002\u008c\u008d\u0007\u0074\u0002\u0002\u008d\u008e\u0007\u0063\u0002\u0002\u008e\u008f\u0007\u0065\u0002\u0002\u008f\u0090\u0007\u0076\u0002\u0002\u0090\u000c\u0003\u0002\u0002\u0002\u0091\u0092\u0007\u0063\u0002\u0002\u0092\u0093\u0007\u0070\u0002\u0002\u0093\u0094\u0007\u0070\u0002\u0002\u0094\u0095\u0007\u0071\u0002\u0002\u0095\u0096\u0007\u0076\u0002\u0002\u0096\u0097\u0007\u0063\u0002\u0002\u0097\u0098\u0007\u0076\u0002\u0002\u0098\u0099\u0007\u006b\u0002\u0002\u0099\u009a\u0007\u0071\u0002\u0002\u009a\u009b\u0007\u0070\u0002\u0002\u009b\u000e\u0003\u0002\u0002\u0002\u009c\u009d\u0007\u0065\u0002\u0002\u009d\u009e\u0007\u006e\u0002\u0002\u009e\u009f\u0007\u0063\u0002\u0002\u009f\u00a0\u0007\u0075\u0002\u0002\u00a0\u00a1\u0007\u0075\u0002\u0002\u00a1\u0010\u0003\u0002\u0002\u0002\u00a2\u00a3\u0007\u0066\u0002\u0002\u00a3\u00a4\u0007\u0071\u0002\u0002\u00a4\u0012\u0003\u0002\u0002\u0002\u00a5\u00a6\u0007\u0067\u0002\u0002\u00a6\u00a7\u0007\u007a\u0002\u0002\u00a7\u00a8\u0007\u0076\u0002\u0002\u00a8\u00a9\u0007\u0067\u0002\u0002\u00a9\u00aa\u0007\u0074\u0002\u0002\u00aa\u00ab\u0007\u0070\u0002\u0002\u00ab\u00ac\u0007\u0063\u0002\u0002\u00ac\u00ad\u0007\u006e\u0002\u0002\u00ad\u0014\u0003\u0002\u0002\u0002\u00ae\u00af\u0007\u0068\u0002\u0002\u00af\u00b0\u0007\u0071\u0002\u0002\u00b0\u00b1\u0007\u0074\u0002\u0002\u00b1\u00b2\u0007\u0067\u0002\u0002\u00b2\u00b3\u0007\u006b\u0002\u0002\u00b3\u00b4\u0007\u0069\u0002\u0002\u00b4\u00b5\u0007\u0070\u0002\u0002\u00b5\u0016\u0003\u0002\u0002\u0002\u00b6\u00b7\u0007\u0072\u0002\u0002\u00b7\u00b8\u0007\u0063\u0002\u0002\u00b8\u00b9\u0007\u0065\u0002\u0002\u00b9\u00ba\u0007\u006d\u0002\u0002\u00ba\u00bb\u0007\u0063\u0002\u0002\u00bb\u00bc\u0007\u0069\u0002\u0002\u00bc\u00bd\u0007\u0067\u0002\u0002\u00bd\u0018\u0003\u0002\u0002\u0002\u00be\u00bf\u0007\u0071\u0002\u0002\u00bf\u00c0\u0007\u0078\u0002\u0002\u00c0\u00c1\u0007\u0067\u0002\u0002\u00c1\u00c2\u0007\u0074\u0002\u0002\u00c2\u00c3\u0007\u0074\u0002\u0002\u00c3\u00c4\u0007\u006b\u0002\u0002\u00c4\u00c5\u0007\u0066\u0002\u0002\u00c5\u00c6\u0007\u0067\u0002\u0002\u00c6\u001a\u0003\u0002\u0002\u0002\u00c7\u00c8\u0007\u006b\u0002\u0002\u00c8\u00c9\u0007\u0070\u0002\u0002\u00c9\u00ca\u0007\u0076\u0002\u0002\u00ca\u00cb\u0007\u0067\u0002\u0002\u00cb\u00cc\u0007\u0074\u0002\u0002\u00cc\u00cd\u0007\u0070\u0002\u0002\u00cd\u00ce\u0007\u0063\u0002\u0002\u00ce\u00cf\u0007\u006e\u0002\u0002\u00cf\u001c\u0003\u0002\u0002\u0002\u00d0\u00d1\u0007\u006b\u0002\u0002\u00d1\u00d2\u0007\u006f\u0002\u0002\u00d2\u00d3\u0007\u0072\u0002\u0002\u00d3\u00d4\u0007\u0071\u0002\u0002\u00d4\u00d5\u0007\u0074\u0002\u0002\u00d5\u00d6\u0007\u0076\u0002\u0002\u00d6\u001e\u0003\u0002\u0002\u0002\u00d7\u00d8\u0007\u0074\u0002\u0002\u00d8\u00d9\u0007\u0067\u0002\u0002\u00d9\u00da\u0007\u0076\u0002\u0002\u00da\u00db\u0007\u0077\u0002\u0002\u00db\u00dc\u0007\u0074\u0002\u0002\u00dc\u00dd\u0007\u0070\u0002\u0002\u00dd\u0020\u0003\u0002\u0002\u0002\u00de\u00df\u0007\u0078\u0002\u0002\u00df\u00e0\u0007\u0063\u0002\u0002\u00e0\u00e1\u0007\u0074\u0002\u0002\u00e1\u0022\u0003\u0002\u0002\u0002\u00e2\u00e3\u0007\u0078\u0002\u0002\u00e3\u00e4\u0007\u0063\u0002\u0002\u00e4\u00e5\u0007\u006e\u0002\u0002\u00e5\u0024\u0003\u0002\u0002\u0002\u00e6\u00e7\u0007\u0075\u0002\u0002\u00e7\u00e8\u0007\u0076\u0002\u0002\u00e8\u00e9\u0007\u0063\u0002\u0002\u00e9\u00ea\u0007\u0076\u0002\u0002\u00ea\u00eb\u0007\u006b\u0002\u0002\u00eb\u00ec\u0007\u0065\u0002\u0002\u00ec\u0026\u0003\u0002\u0002\u0002\u00ed\u00ee\u0007\u006b\u0002\u0002\u00ee\u00ef\u0007\u0070\u0002\u0002\u00ef\u00f0\u0007\u0076\u0002\u0002\u00f0\u00f1\u0007\u0067\u0002\u0002\u00f1\u00f2\u0007\u0074\u0002\u0002\u00f2\u00f3\u0007\u0068\u0002\u0002\u00f3\u00f4\u0007\u0063\u0002\u0002\u00f4\u00f5\u0007\u0065\u0002\u0002\u00f5\u00f6\u0007\u0067\u0002\u0002\u00f6\u0028\u0003\u0002\u0002\u0002\u00f7\u00f8\u0007\u003f\u0002\u0002\u00f8\u002a\u0003\u0002\u0002\u0002\u00f9\u00fa\u0007\u0030\u0002\u0002\u00fa\u00fb\u0007\u0030\u0002\u0002\u00fb\u00fc\u0007\u0030\u0002\u0002\u00fc\u002c\u0003\u0002\u0002\u0002\u00fd\u00fe\u0007\u0030\u0002\u0002\u00fe\u002e\u0003\u0002\u0002\u0002\u00ff\u0100\u0007\u002a\u0002\u0002\u0100\u0030\u0003\u0002\u0002\u0002\u0101\u0102\u0007\u002b\u0002\u0002\u0102\u0032\u0003\u0002\u0002\u0002\u0103\u0104\u0007\u005d\u0002\u0002\u0104\u0034\u0003\u0002\u0002\u0002\u0105\u0106\u0007\u005d\u0002\u0002\u0106\u0107\u0007\u003c\u0002\u0002\u0107\u0036\u0003\u0002\u0002\u0002\u0108\u0109\u0007\u005f\u0002\u0002\u0109\u0038\u0003\u0002\u0002\u0002\u010a\u010b\u0007\u003c\u0002\u0002\u010b\u010c\u0007\u005f\u0002\u0002\u010c\u003a\u0003\u0002\u0002\u0002\u010d\u010e\u0007\u007d\u0002\u0002\u010e\u003c\u0003\u0002\u0002\u0002\u010f\u0110\u0007\u007f\u0002\u0002\u0110\u003e\u0003\u0002\u0002\u0002\u0111\u0112\u0007\u002f\u0002\u0002\u0112\u0113\u0007\u0040\u0002\u0002\u0113\u0040\u0003\u0002\u0002\u0002\u0114\u0115\u0007\u0080\u0002\u0002\u0115\u0042\u0003\u0002\u0002\u0002\u0116\u0117\u0007\u003c\u0002\u0002\u0117\u0044\u0003\u0002\u0002\u0002\u0118\u0119\u0007\u003c\u0002\u0002\u0119\u011a\u0007\u003c\u0002\u0002\u011a\u0046\u0003\u0002\u0002\u0002\u011b\u011c\u0009\u0004\u0002\u0002\u011c\u0048\u0003\u0002\u0002\u0002\u011d\u011e\u0009\u0005\u0002\u0002\u011e\u004a\u0003\u0002\u0002\u0002\u011f\u0120\u0009\u0006\u0002\u0002\u0120\u004c\u0003\u0002\u0002\u0002\u0121\u0125\u0005\u0047\u0024\u0002\u0122\u0124\u0005\u0049\u0025\u0002\u0123\u0122\u0003\u0002\u0002\u0002\u0124\u0127\u0003\u0002\u0002\u0002\u0125\u0123\u0003\u0002\u0002\u0002\u0125\u0126\u0003\u0002\u0002\u0002\u0126\u004e\u0003\u0002\u0002\u0002\u0127\u0125\u0003\u0002\u0002\u0002\u0128\u012a\u0005\u004b\u0026\u0002\u0129\u0128\u0003\u0002\u0002\u0002\u012a\u012b\u0003\u0002\u0002\u0002\u012b\u0129\u0003\u0002\u0002\u0002\u012b\u012c\u0003\u0002\u0002\u0002\u012c\u0050\u0003\u0002\u0002\u0002\u012d\u012e\u0009\u0007\u0002\u0002\u012e\u0052\u0003\u0002\u0002\u0002\u012f\u0131\u0005\u0051\u0029\u0002\u0130\u012f\u0003\u0002\u0002\u0002\u0131\u0132\u0003\u0002\u0002\u0002\u0132\u0130\u0003\u0002\u0002\u0002\u0132\u0133\u0003\u0002\u0002\u0002\u0133\u0054\u0003\u0002\u0002\u0002\u0134\u0136\u0005\u0051\u0029\u0002\u0135\u0134\u0003\u0002\u0002\u0002\u0136\u0137\u0003\u0002\u0002\u0002\u0137\u0135\u0003\u0002\u0002\u0002\u0137\u0138\u0003\u0002\u0002\u0002\u0138\u0139\u0003\u0002\u0002\u0002\u0139\u013b\u0007\u0030\u0002\u0002\u013a\u013c\u0005\u0051\u0029\u0002\u013b\u013a\u0003\u0002\u0002\u0002\u013c\u013d\u0003\u0002\u0002\u0002\u013d\u013b\u0003\u0002\u0002\u0002\u013d\u013e\u0003\u0002\u0002\u0002\u013e\u0056\u0003\u0002\u0002\u0002\u013f\u0141\u0007\u0024\u0002\u0002\u0140\u0142\u0005\u005b\u002e\u0002\u0141\u0140\u0003\u0002\u0002\u0002\u0141\u0142\u0003\u0002\u0002\u0002\u0142\u0143\u0003\u0002\u0002\u0002\u0143\u0144\u0007\u0024\u0002\u0002\u0144\u0058\u0003\u0002\u0002\u0002\u0145\u0146\u0007\u0062\u0002\u0002\u0146\u0147\u0005\u005d\u002f\u0002\u0147\u0148\u0007\u0062\u0002\u0002\u0148\u005a\u0003\u0002\u0002\u0002\u0149\u014b\u0005\u0061\u0031\u0002\u014a\u0149\u0003\u0002\u0002\u0002\u014b\u014c\u0003\u0002\u0002\u0002\u014c\u014a\u0003\u0002\u0002\u0002\u014c\u014d\u0003\u0002\u0002\u0002\u014d\u005c\u0003\u0002\u0002\u0002\u014e\u0150\u0005\u005f\u0030\u0002\u014f\u014e\u0003\u0002\u0002\u0002\u0150\u0151\u0003\u0002\u0002\u0002\u0151\u014f\u0003\u0002\u0002\u0002\u0151\u0152\u0003\u0002\u0002\u0002\u0152\u005e\u0003\u0002\u0002\u0002\u0153\u0154\u000b\u0002\u0002\u0002\u0154\u0060\u0003\u0002\u0002\u0002\u0155\u0158\u000a\u0008\u0002\u0002\u0156\u0158\u0005\u0063\u0032\u0002\u0157\u0155\u0003\u0002\u0002\u0002\u0157\u0156\u0003\u0002\u0002\u0002\u0158\u0062\u0003\u0002\u0002\u0002\u0159\u015a\u0007\u005e\u0002\u0002\u015a\u015b\u0009\u0009\u0002\u0002\u015b\u0064\u0003\u0002\u0002\u0002\u000f\u0002\u0068\u0072\u0080\u0125\u012b\u0132\u0137\u013d\u0141\u014c\u0151\u0157\u0003\u0008\u0002\u0002"

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
	    AS(4),
	    ABSTRACT(5),
	    ANNOTATION(6),
	    Class(7),
	    DO(8),
	    EXTERNAL(9),
	    FOREIGN(10),
	    NAMESPACE(11),
	    OVERRIDE(12),
	    INTERNAL(13),
	    IMPORT(14),
	    RETURN(15),
	    VAR(16),
	    VAL(17),
	    STATIC(18),
	    INTERFACE(19),
	    ASSGIN(20),
	    ELLIPSIS(21),
	    DOT(22),
	    LPAREN(23),
	    RPAREN(24),
	    LSQUARE(25),
	    LCOLONSQUARE(26),
	    RSQUARE(27),
	    RCOLONSQUARE(28),
	    LBRACE(29),
	    RBRACE(30),
	    ARROW(31),
	    TILDE(32),
	    COLON(33),
	    DOUBLECOLON(34),
	    ID(35),
	    OPID(36),
	    Integer(37),
	    Double(38),
	    String(39),
	    RawString(40)
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
	    AS,
	    ABSTRACT,
	    ANNOTATION,
	    Class,
	    DO,
	    EXTERNAL,
	    FOREIGN,
	    NAMESPACE,
	    OVERRIDE,
	    INTERNAL,
	    IMPORT,
	    RETURN,
	    VAR,
	    VAL,
	    STATIC,
	    INTERFACE,
	    ASSGIN,
	    ELLIPSIS,
	    DOT,
	    LPAREN,
	    RPAREN,
	    LSQUARE,
	    LCOLONSQUARE,
	    RSQUARE,
	    RCOLONSQUARE,
	    LBRACE,
	    RBRACE,
	    ARROW,
	    TILDE,
	    COLON,
	    DOUBLECOLON,
	    IDLETTERHEAD,
	    IDLETTERTAIL,
	    IDLETTERSPECIAL,
	    ID,
	    OPID,
	    DIGITLETTER,
	    Integer,
	    Double,
	    String,
	    RawString,
	    StringCharacters,
	    RawStringCharacters,
	    RawStringCharacter,
	    StringCharacter,
	    EscapeSequence
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}