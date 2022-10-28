// Generated from java-escape by ANTLR 4.7.1
package foldenx.parser;
import com.strumenta.kotlinmultiplatform.asCharArray
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import kotlin.reflect.KClass

class FoldingParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(FoldingParser.FileContext::class,
                                                              FoldingParser.ImportExContext::class,
                                                              FoldingParser.ImportVanilaContext::class,
                                                              FoldingParser.Package_Context::class,
                                                              FoldingParser.NamespaceContext::class,
                                                              FoldingParser.DoBlockContext::class,
                                                              FoldingParser.CompoContext::class,
                                                              FoldingParser.ReturningContext::class,
                                                              FoldingParser.StaticBlockContext::class,
                                                              FoldingParser.Class_Context::class,
                                                              FoldingParser.ClassBodyContext::class,
                                                              FoldingParser.ConstuctorContext::class,
                                                              FoldingParser.Interface_Context::class,
                                                              FoldingParser.InterfaceBodyContext::class,
                                                              FoldingParser.ValInInterfaceContext::class,
                                                              FoldingParser.VarInInterfaceContext::class,
                                                              FoldingParser.DefInInterfaceContext::class,
                                                              FoldingParser.NewdataContext::class,
                                                              FoldingParser.TypeParamContext::class,
                                                              FoldingParser.TypeParamCompoContext::class,
                                                              FoldingParser.DefinitionContext::class,
                                                              FoldingParser.FieldContext::class,
                                                              FoldingParser.ValueContext::class,
                                                              FoldingParser.TypeCastingContext::class,
                                                              FoldingParser.ParamExContext::class,
                                                              FoldingParser.ParameterContext::class,
                                                              FoldingParser.OpParameterContext::class,
                                                              FoldingParser.AopParameterContext::class,
                                                              FoldingParser.ArgExContext::class,
                                                              FoldingParser.ArgValueContext::class,
                                                              FoldingParser.Val_Context::class,
                                                              FoldingParser.Var_Context::class,
                                                              FoldingParser.ValSettedContext::class,
                                                              FoldingParser.VarSettedContext::class,
                                                              FoldingParser.DefContext::class,
                                                              FoldingParser.CompiledIdContext::class,
                                                              FoldingParser.LambdaParamExContext::class,
                                                              FoldingParser.LambdaContext::class,
                                                              FoldingParser.OpIdWrapContext::class,
                                                              FoldingParser.AopIdWrapContext::class,
                                                              FoldingParser.TypeExContext::class,
                                                              FoldingParser.TypeExSingleContext::class,
                                                              FoldingParser.TypeExParamExContext::class,
                                                              FoldingParser.TypeExParameterContext::class,
                                                              FoldingParser.ForeignContext::class,
                                                              FoldingParser.ForeignBodyContext::class,
                                                              FoldingParser.ForeignElementContext::class,
                                                              FoldingParser.ForeignPlatformContext::class,
                                                              FoldingParser.AnnoValueContext::class,
                                                              FoldingParser.AnnoParamContext::class,
                                                              FoldingParser.AnnotationDefContext::class,
                                                              FoldingParser.AnnotationContext::class,
                                                              FoldingParser.AnnotationBlockContext::class,
                                                              FoldingParser.LiteralContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "Folding.g4"

    override val tokenNames: Array<String?>?
        get() = FoldingParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = FoldingParser.Companion.ruleNames
    override val atn: ATN
        get() = FoldingParser.Companion.ATN
    override val vocabulary: Vocabulary
        get() = FoldingParser.Companion.VOCABULARY

    enum class Tokens(val id: Int) {
        EOF(-1),
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
        TEMPLATE(11),
        NAMESPACE(12),
        OVERRIDE(13),
        INTERNAL(14),
        IMPORT(15),
        RETURN(16),
        VAR(17),
        VAL(18),
        STATIC(19),
        INTERFACE(20),
        NEWDATA(21),
        ASSGIN(22),
        BIGARROW(23),
        ELLIPSIS(24),
        DOT(25),
        LPAREN(26),
        RPAREN(27),
        LSQUARE(28),
        LCOLONSQUARE(29),
        RSQUARE(30),
        RCOLONSQUARE(31),
        LBRACE(32),
        RBRACE(33),
        ARROW(34),
        TILDE(35),
        COLON(36),
        DOUBLECOLON(37),
        Sharp(38),
        ID(39),
        OPID(40),
        Integer(41),
        Double(42),
        String(43),
        RawString(44)
    }

    enum class Rules(val id: Int) {
        RULE_file(0),
        RULE_importEx(1),
        RULE_importVanila(2),
        RULE_package_(3),
        RULE_namespace(4),
        RULE_doBlock(5),
        RULE_compo(6),
        RULE_returning(7),
        RULE_staticBlock(8),
        RULE_class_(9),
        RULE_classBody(10),
        RULE_constuctor(11),
        RULE_interface_(12),
        RULE_interfaceBody(13),
        RULE_valInInterface(14),
        RULE_varInInterface(15),
        RULE_defInInterface(16),
        RULE_newdata(17),
        RULE_typeParam(18),
        RULE_typeParamCompo(19),
        RULE_definition(20),
        RULE_field(21),
        RULE_value(22),
        RULE_typeCasting(23),
        RULE_paramEx(24),
        RULE_parameter(25),
        RULE_opParameter(26),
        RULE_aopParameter(27),
        RULE_argEx(28),
        RULE_argValue(29),
        RULE_val_(30),
        RULE_var_(31),
        RULE_valSetted(32),
        RULE_varSetted(33),
        RULE_def(34),
        RULE_compiledId(35),
        RULE_lambdaParamEx(36),
        RULE_lambda(37),
        RULE_opIdWrap(38),
        RULE_aopIdWrap(39),
        RULE_typeEx(40),
        RULE_typeExSingle(41),
        RULE_typeExParamEx(42),
        RULE_typeExParameter(43),
        RULE_foreign(44),
        RULE_foreignBody(45),
        RULE_foreignElement(46),
        RULE_foreignPlatform(47),
        RULE_annoValue(48),
        RULE_annoParam(49),
        RULE_annotationDef(50),
        RULE_annotation(51),
        RULE_annotationBlock(52),
        RULE_literal(53)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "importEx", "importVanila", "package_", 
                                "namespace", "doBlock", "compo", "returning", 
                                "staticBlock", "class_", "classBody", "constuctor", 
                                "interface_", "interfaceBody", "valInInterface", 
                                "varInInterface", "defInInterface", "newdata", 
                                "typeParam", "typeParamCompo", "definition", 
                                "field", "value", "typeCasting", "paramEx", 
                                "parameter", "opParameter", "aopParameter", 
                                "argEx", "argValue", "val_", "var_", "valSetted", 
                                "varSetted", "def", "compiledId", "lambdaParamEx", 
                                "lambda", "opIdWrap", "aopIdWrap", "typeEx", 
                                "typeExSingle", "typeExParamEx", "typeExParameter", 
                                "foreign", "foreignBody", "foreignElement", 
                                "foreignPlatform", "annoValue", "annoParam", 
                                "annotationDef", "annotation", "annotationBlock", 
                                "literal")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
                                                          null, "'as'", 
                                                          "'abstract'", 
                                                          "'annotation'", 
                                                          "'class'", "'do'", 
                                                          "'external'", 
                                                          "'foreign'", "'template'", 
                                                          "'package'", "'override'", 
                                                          "'internal'", 
                                                          "'import'", "'return'", 
                                                          "'var'", "'val'", 
                                                          "'static'", "'interface'", 
                                                          "'newdata'", "'='", 
                                                          "'=>'", "'...'", 
                                                          "'.'", "'('", 
                                                          "')'", "'['", 
                                                          "'[:'", "']'", 
                                                          "':]'", "'{'", 
                                                          "'}'", "'->'", 
                                                          "'~'", "':'", 
                                                          "'::'", "'#'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "WS", "COMMENT", 
                                                           "LINE_COMMENT", 
                                                           "AS", "ABSTRACT", 
                                                           "ANNOTATION", 
                                                           "Class", "DO", 
                                                           "EXTERNAL", "FOREIGN", 
                                                           "TEMPLATE", "NAMESPACE", 
                                                           "OVERRIDE", "INTERNAL", 
                                                           "IMPORT", "RETURN", 
                                                           "VAR", "VAL", 
                                                           "STATIC", "INTERFACE", 
                                                           "NEWDATA", "ASSGIN", 
                                                           "BIGARROW", "ELLIPSIS", 
                                                           "DOT", "LPAREN", 
                                                           "RPAREN", "LSQUARE", 
                                                           "LCOLONSQUARE", 
                                                           "RSQUARE", "RCOLONSQUARE", 
                                                           "LBRACE", "RBRACE", 
                                                           "ARROW", "TILDE", 
                                                           "COLON", "DOUBLECOLON", 
                                                           "Sharp", "ID", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u002e\u02fa\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0003\u0002\u0005\u0002\u0070\u000a\u0002\u0003\u0002\u0007\u0002\u0073\u000a\u0002\u000c\u0002\u000e\u0002\u0076\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u007c\u000a\u0002\u000c\u0002\u000e\u0002\u007f\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0007\u0005\u0089\u000a\u0005\u000c\u0005\u000e\u0005\u008c\u000b\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u0094\u000a\u0007\u000c\u0007\u000e\u0007\u0097\u000b\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u009e\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0007\u000a\u00a7\u000a\u000a\u000c\u000a\u000e\u000a\u00aa\u000b\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0005\u000b\u00af\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u00b4\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0007\u000c\u00bb\u000a\u000c\u000c\u000c\u000e\u000c\u00be\u000b\u000c\u0003\u000c\u0005\u000c\u00c1\u000a\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00c5\u000a\u000c\u000c\u000c\u000e\u000c\u00c8\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0006\u000d\u00cd\u000a\u000d\u000d\u000d\u000e\u000d\u00ce\u0003\u000d\u0003\u000d\u0005\u000d\u00d3\u000a\u000d\u0003\u000e\u0005\u000e\u00d6\u000a\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00db\u000a\u000e\u0003\u000e\u0003\u000e\u0006\u000e\u00df\u000a\u000e\u000d\u000e\u000e\u000e\u00e0\u0005\u000e\u00e3\u000a\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0005\u000f\u00e9\u000a\u000f\u0003\u000f\u0007\u000f\u00ec\u000a\u000f\u000c\u000f\u000e\u000f\u00ef\u000b\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0005\u0012\u00fc\u000a\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0100\u000a\u0012\u0003\u0012\u0005\u0012\u0103\u000a\u0012\u0003\u0012\u0005\u0012\u0106\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u010c\u000a\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0110\u000a\u0012\u0003\u0012\u0005\u0012\u0113\u000a\u0012\u0003\u0012\u0005\u0012\u0116\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u011b\u000a\u0012\u0003\u0012\u0005\u0012\u011e\u000a\u0012\u0003\u0013\u0005\u0013\u0121\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0007\u0013\u0127\u000a\u0013\u000c\u0013\u000e\u0013\u012a\u000b\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0006\u0014\u012f\u000a\u0014\u000d\u0014\u000e\u0014\u0130\u0003\u0015\u0003\u0015\u0003\u0015\u0007\u0015\u0136\u000a\u0015\u000c\u0015\u000e\u0015\u0139\u000b\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u013e\u000a\u0016\u0003\u0017\u0005\u0017\u0141\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0145\u000a\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u014f\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0155\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u015b\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0166\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0007\u0018\u0175\u000a\u0018\u000c\u0018\u000e\u0018\u0178\u000b\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0005\u001a\u017e\u000a\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0005\u001a\u0183\u000a\u001a\u0003\u001a\u0003\u001a\u0005\u001a\u0187\u000a\u001a\u0003\u001b\u0003\u001b\u0007\u001b\u018b\u000a\u001b\u000c\u001b\u000e\u001b\u018e\u000b\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0005\u001e\u0199\u000a\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u019d\u000a\u001e\u0003\u001e\u0003\u001e\u0007\u001e\u01a1\u000a\u001e\u000c\u001e\u000e\u001e\u01a4\u000b\u001e\u0003\u001e\u0005\u001e\u01a7\u000a\u001e\u0003\u001f\u0003\u001f\u0006\u001f\u01ab\u000a\u001f\u000d\u001f\u000e\u001f\u01ac\u0005\u001f\u01af\u000a\u001f\u0003\u001f\u0003\u001f\u0007\u001f\u01b3\u000a\u001f\u000c\u001f\u000e\u001f\u01b6\u000b\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0005\u0020\u01bc\u000a\u0020\u0003\u0021\u0003\u0021\u0005\u0021\u01c0\u000a\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0005\u0022\u01c5\u000a\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u01cd\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0005\u0024\u01d3\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01d7\u000a\u0024\u0003\u0024\u0005\u0024\u01da\u000a\u0024\u0003\u0024\u0005\u0024\u01dd\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01e2\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01e6\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01ea\u000a\u0024\u0003\u0024\u0005\u0024\u01ed\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01f3\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01f8\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01fc\u000a\u0024\u0003\u0024\u0005\u0024\u01ff\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0205\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u020a\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u020e\u000a\u0024\u0003\u0024\u0005\u0024\u0211\u000a\u0024\u0003\u0024\u0005\u0024\u0214\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0218\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u021c\u000a\u0024\u0003\u0024\u0005\u0024\u021f\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0225\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0229\u000a\u0024\u0003\u0024\u0005\u0024\u022c\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0232\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0237\u000a\u0024\u0003\u0024\u0005\u0024\u023a\u000a\u0024\u0003\u0024\u0005\u0024\u023d\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0241\u000a\u0024\u0003\u0024\u0005\u0024\u0244\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0249\u000a\u0024\u0003\u0024\u0005\u0024\u024c\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0251\u000a\u0024\u0003\u0024\u0005\u0024\u0254\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0259\u000a\u0024\u0003\u0024\u0005\u0024\u025c\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0261\u000a\u0024\u0005\u0024\u0263\u000a\u0024\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u026b\u000a\u0026\u0005\u0026\u026d\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0271\u000a\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u0277\u000a\u0027\u0003\u0027\u0007\u0027\u027a\u000a\u0027\u000c\u0027\u000e\u0027\u027d\u000b\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0005\u002a\u0290\u000a\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0295\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0006\u002b\u029a\u000a\u002b\u000d\u002b\u000e\u002b\u029b\u0003\u002b\u0003\u002b\u0005\u002b\u02a0\u000a\u002b\u0003\u002c\u0003\u002c\u0005\u002c\u02a4\u000a\u002c\u0003\u002d\u0003\u002d\u0007\u002d\u02a8\u000a\u002d\u000c\u002d\u000e\u002d\u02ab\u000b\u002d\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0005\u002e\u02b5\u000a\u002e\u0003\u002f\u0003\u002f\u0007\u002f\u02b9\u000a\u002f\u000c\u002f\u000e\u002f\u02bc\u000b\u002f\u0003\u002f\u0003\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0005\u0030\u02c7\u000a\u0030\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0007\u0034\u02d4\u000a\u0034\u000c\u0034\u000e\u0034\u02d7\u000b\u0034\u0003\u0034\u0005\u0034\u02da\u000a\u0034\u0003\u0035\u0003\u0035\u0007\u0035\u02de\u000a\u0035\u000c\u0035\u000e\u0035\u02e1\u000b\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0007\u0035\u02e6\u000a\u0035\u000c\u0035\u000e\u0035\u02e9\u000b\u0035\u0003\u0035\u0005\u0035\u02ec\u000a\u0035\u0003\u0036\u0003\u0036\u0007\u0036\u02f0\u000a\u0036\u000c\u0036\u000e\u0036\u02f3\u000b\u0036\u0003\u0036\u0003\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0002\u0003\u002e\u0038\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u0002\u0003\u0003\u0002\u002b\u002d\u0002\u0350\u0002\u006f\u0003\u0002\u0002\u0002\u0004\u0080\u0003\u0002\u0002\u0002\u0006\u0082\u0003\u0002\u0002\u0002\u0008\u0085\u0003\u0002\u0002\u0002\u000a\u008d\u0003\u0002\u0002\u0002\u000c\u0090\u0003\u0002\u0002\u0002\u000e\u009d\u0003\u0002\u0002\u0002\u0010\u009f\u0003\u0002\u0002\u0002\u0012\u00a2\u0003\u0002\u0002\u0002\u0014\u00ae\u0003\u0002\u0002\u0002\u0016\u00b8\u0003\u0002\u0002\u0002\u0018\u00cc\u0003\u0002\u0002\u0002\u001a\u00d5\u0003\u0002\u0002\u0002\u001c\u00e6\u0003\u0002\u0002\u0002\u001e\u00f2\u0003\u0002\u0002\u0002\u0020\u00f6\u0003\u0002\u0002\u0002\u0022\u011d\u0003\u0002\u0002\u0002\u0024\u0120\u0003\u0002\u0002\u0002\u0026\u012e\u0003\u0002\u0002\u0002\u0028\u0132\u0003\u0002\u0002\u0002\u002a\u013d\u0003\u0002\u0002\u0002\u002c\u0140\u0003\u0002\u0002\u0002\u002e\u0165\u0003\u0002\u0002\u0002\u0030\u0179\u0003\u0002\u0002\u0002\u0032\u017d\u0003\u0002\u0002\u0002\u0034\u0188\u0003\u0002\u0002\u0002\u0036\u018f\u0003\u0002\u0002\u0002\u0038\u0193\u0003\u0002\u0002\u0002\u003a\u01a6\u0003\u0002\u0002\u0002\u003c\u01ae\u0003\u0002\u0002\u0002\u003e\u01bb\u0003\u0002\u0002\u0002\u0040\u01bf\u0003\u0002\u0002\u0002\u0042\u01c1\u0003\u0002\u0002\u0002\u0044\u01c9\u0003\u0002\u0002\u0002\u0046\u0262\u0003\u0002\u0002\u0002\u0048\u0264\u0003\u0002\u0002\u0002\u004a\u0266\u0003\u0002\u0002\u0002\u004c\u0272\u0003\u0002\u0002\u0002\u004e\u0281\u0003\u0002\u0002\u0002\u0050\u0285\u0003\u0002\u0002\u0002\u0052\u028f\u0003\u0002\u0002\u0002\u0054\u0294\u0003\u0002\u0002\u0002\u0056\u02a1\u0003\u0002\u0002\u0002\u0058\u02a5\u0003\u0002\u0002\u0002\u005a\u02b4\u0003\u0002\u0002\u0002\u005c\u02b6\u0003\u0002\u0002\u0002\u005e\u02c6\u0003\u0002\u0002\u0002\u0060\u02c8\u0003\u0002\u0002\u0002\u0062\u02ca\u0003\u0002\u0002\u0002\u0064\u02cc\u0003\u0002\u0002\u0002\u0066\u02cf\u0003\u0002\u0002\u0002\u0068\u02eb\u0003\u0002\u0002\u0002\u006a\u02ed\u0003\u0002\u0002\u0002\u006c\u02f6\u0003\u0002\u0002\u0002\u006e\u0070\u0005\u000a\u0006\u0002\u006f\u006e\u0003\u0002\u0002\u0002\u006f\u0070\u0003\u0002\u0002\u0002\u0070\u0074\u0003\u0002\u0002\u0002\u0071\u0073\u0005\u0004\u0003\u0002\u0072\u0071\u0003\u0002\u0002\u0002\u0073\u0076\u0003\u0002\u0002\u0002\u0074\u0072\u0003\u0002\u0002\u0002\u0074\u0075\u0003\u0002\u0002\u0002\u0075\u007d\u0003\u0002\u0002\u0002\u0076\u0074\u0003\u0002\u0002\u0002\u0077\u007c\u0005\u002a\u0016\u0002\u0078\u007c\u0005\u002c\u0017\u0002\u0079\u007c\u0005\u0066\u0034\u0002\u007a\u007c\u0005\u0024\u0013\u0002\u007b\u0077\u0003\u0002\u0002\u0002\u007b\u0078\u0003\u0002\u0002\u0002\u007b\u0079\u0003\u0002\u0002\u0002\u007b\u007a\u0003\u0002\u0002\u0002\u007c\u007f\u0003\u0002\u0002\u0002\u007d\u007b\u0003\u0002\u0002\u0002\u007d\u007e\u0003\u0002\u0002\u0002\u007e\u0003\u0003\u0002\u0002\u0002\u007f\u007d\u0003\u0002\u0002\u0002\u0080\u0081\u0005\u0006\u0004\u0002\u0081\u0005\u0003\u0002\u0002\u0002\u0082\u0083\u0007\u0011\u0002\u0002\u0083\u0084\u0005\u0008\u0005\u0002\u0084\u0007\u0003\u0002\u0002\u0002\u0085\u008a\u0007\u0029\u0002\u0002\u0086\u0087\u0007\u001b\u0002\u0002\u0087\u0089\u0007\u0029\u0002\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0089\u008c\u0003\u0002\u0002\u0002\u008a\u0088\u0003\u0002\u0002\u0002\u008a\u008b\u0003\u0002\u0002\u0002\u008b\u0009\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002\u0002\u008d\u008e\u0007\u000e\u0002\u0002\u008e\u008f\u0005\u0008\u0005\u0002\u008f\u000b\u0003\u0002\u0002\u0002\u0090\u0091\u0007\u000a\u0002\u0002\u0091\u0095\u0007\u0022\u0002\u0002\u0092\u0094\u0005\u000e\u0008\u0002\u0093\u0092\u0003\u0002\u0002\u0002\u0094\u0097\u0003\u0002\u0002\u0002\u0095\u0093\u0003\u0002\u0002\u0002\u0095\u0096\u0003\u0002\u0002\u0002\u0096\u0098\u0003\u0002\u0002\u0002\u0097\u0095\u0003\u0002\u0002\u0002\u0098\u0099\u0007\u0023\u0002\u0002\u0099\u000d\u0003\u0002\u0002\u0002\u009a\u009e\u0005\u002c\u0017\u0002\u009b\u009e\u0005\u002e\u0018\u0002\u009c\u009e\u0005\u0010\u0009\u0002\u009d\u009a\u0003\u0002\u0002\u0002\u009d\u009b\u0003\u0002\u0002\u0002\u009d\u009c\u0003\u0002\u0002\u0002\u009e\u000f\u0003\u0002\u0002\u0002\u009f\u00a0\u0007\u0012\u0002\u0002\u00a0\u00a1\u0005\u002e\u0018\u0002\u00a1\u0011\u0003\u0002\u0002\u0002\u00a2\u00a3\u0007\u0015\u0002\u0002\u00a3\u00a8\u0007\u0022\u0002\u0002\u00a4\u00a7\u0005\u002a\u0016\u0002\u00a5\u00a7\u0005\u002c\u0017\u0002\u00a6\u00a4\u0003\u0002\u0002\u0002\u00a6\u00a5\u0003\u0002\u0002\u0002\u00a7\u00aa\u0003\u0002\u0002\u0002\u00a8\u00a6\u0003\u0002\u0002\u0002\u00a8\u00a9\u0003\u0002\u0002\u0002\u00a9\u00ab\u0003\u0002\u0002\u0002\u00aa\u00a8\u0003\u0002\u0002\u0002\u00ab\u00ac\u0007\u0023\u0002\u0002\u00ac\u0013\u0003\u0002\u0002\u0002\u00ad\u00af\u0005\u006a\u0036\u0002\u00ae\u00ad\u0003\u0002\u0002\u0002\u00ae\u00af\u0003\u0002\u0002\u0002\u00af\u00b0\u0003\u0002\u0002\u0002\u00b0\u00b1\u0007\u0009\u0002\u0002\u00b1\u00b3\u0007\u0029\u0002\u0002\u00b2\u00b4\u0005\u0026\u0014\u0002\u00b3\u00b2\u0003\u0002\u0002\u0002\u00b3\u00b4\u0003\u0002\u0002\u0002\u00b4\u00b5\u0003\u0002\u0002\u0002\u00b5\u00b6\u0005\u0018\u000d\u0002\u00b6\u00b7\u0005\u0016\u000c\u0002\u00b7\u0015\u0003\u0002\u0002\u0002\u00b8\u00bc\u0007\u0022\u0002\u0002\u00b9\u00bb\u0005\u0018\u000d\u0002\u00ba\u00b9\u0003\u0002\u0002\u0002\u00bb\u00be\u0003\u0002\u0002\u0002\u00bc\u00ba\u0003\u0002\u0002\u0002\u00bc\u00bd\u0003\u0002\u0002\u0002\u00bd\u00c0\u0003\u0002\u0002\u0002\u00be\u00bc\u0003\u0002\u0002\u0002\u00bf\u00c1\u0005\u0012\u000a\u0002\u00c0\u00bf\u0003\u0002\u0002\u0002\u00c0\u00c1\u0003\u0002\u0002\u0002\u00c1\u00c6\u0003\u0002\u0002\u0002\u00c2\u00c5\u0005\u002c\u0017\u0002\u00c3\u00c5\u0005\u0046\u0024\u0002\u00c4\u00c2\u0003\u0002\u0002\u0002\u00c4\u00c3\u0003\u0002\u0002\u0002\u00c5\u00c8\u0003\u0002\u0002\u0002\u00c6\u00c4\u0003\u0002\u0002\u0002\u00c6\u00c7\u0003\u0002\u0002\u0002\u00c7\u00c9\u0003\u0002\u0002\u0002\u00c8\u00c6\u0003\u0002\u0002\u0002\u00c9\u00ca\u0007\u0023\u0002\u0002\u00ca\u0017\u0003\u0002\u0002\u0002\u00cb\u00cd\u0005\u0034\u001b\u0002\u00cc\u00cb\u0003\u0002\u0002\u0002\u00cd\u00ce\u0003\u0002\u0002\u0002\u00ce\u00cc\u0003\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00cf\u00d2\u0003\u0002\u0002\u0002\u00d0\u00d1\u0007\u0018\u0002\u0002\u00d1\u00d3\u0005\u002e\u0018\u0002\u00d2\u00d0\u0003\u0002\u0002\u0002\u00d2\u00d3\u0003\u0002\u0002\u0002\u00d3\u0019\u0003\u0002\u0002\u0002\u00d4\u00d6\u0005\u006a\u0036\u0002\u00d5\u00d4\u0003\u0002\u0002\u0002\u00d5\u00d6\u0003\u0002\u0002\u0002\u00d6\u00d7\u0003\u0002\u0002\u0002\u00d7\u00d8\u0007\u0016\u0002\u0002\u00d8\u00da\u0007\u0029\u0002\u0002\u00d9\u00db\u0005\u0026\u0014\u0002\u00da\u00d9\u0003\u0002\u0002\u0002\u00da\u00db\u0003\u0002\u0002\u0002\u00db\u00e2\u0003\u0002\u0002\u0002\u00dc\u00de\u0007\u0025\u0002\u0002\u00dd\u00df\u0005\u0052\u002a\u0002\u00de\u00dd\u0003\u0002\u0002\u0002\u00df\u00e0\u0003\u0002\u0002\u0002\u00e0\u00de\u0003\u0002\u0002\u0002\u00e0\u00e1\u0003\u0002\u0002\u0002\u00e1\u00e3\u0003\u0002\u0002\u0002\u00e2\u00dc\u0003\u0002\u0002\u0002\u00e2\u00e3\u0003\u0002\u0002\u0002\u00e3\u00e4\u0003\u0002\u0002\u0002\u00e4\u00e5\u0005\u001c\u000f\u0002\u00e5\u001b\u0003\u0002\u0002\u0002\u00e6\u00e8\u0007\u0022\u0002\u0002\u00e7\u00e9\u0005\u0012\u000a\u0002\u00e8\u00e7\u0003\u0002\u0002\u0002\u00e8\u00e9\u0003\u0002\u0002\u0002\u00e9\u00ed\u0003\u0002\u0002\u0002\u00ea\u00ec\u0005\u0022\u0012\u0002\u00eb\u00ea\u0003\u0002\u0002\u0002\u00ec\u00ef\u0003\u0002\u0002\u0002\u00ed\u00eb\u0003\u0002\u0002\u0002\u00ed\u00ee\u0003\u0002\u0002\u0002\u00ee\u00f0\u0003\u0002\u0002\u0002\u00ef\u00ed\u0003\u0002\u0002\u0002\u00f0\u00f1\u0007\u0023\u0002\u0002\u00f1\u001d\u0003\u0002\u0002\u0002\u00f2\u00f3\u0007\u0014\u0002\u0002\u00f3\u00f4\u0007\u0029\u0002\u0002\u00f4\u00f5\u0005\u0052\u002a\u0002\u00f5\u001f\u0003\u0002\u0002\u0002\u00f6\u00f7\u0007\u0013\u0002\u0002\u00f7\u00f8\u0007\u0029\u0002\u0002\u00f8\u00f9\u0005\u0052\u002a\u0002\u00f9\u0021\u0003\u0002\u0002\u0002\u00fa\u00fc\u0005\u006a\u0036\u0002\u00fb\u00fa\u0003\u0002\u0002\u0002\u00fb\u00fc\u0003\u0002\u0002\u0002\u00fc\u00fd\u0003\u0002\u0002\u0002\u00fd\u00ff\u0007\u0029\u0002\u0002\u00fe\u0100\u0005\u0048\u0025\u0002\u00ff\u00fe\u0003\u0002\u0002\u0002\u00ff\u0100\u0003\u0002\u0002\u0002\u0100\u0102\u0003\u0002\u0002\u0002\u0101\u0103\u0005\u0026\u0014\u0002\u0102\u0101\u0003\u0002\u0002\u0002\u0102\u0103\u0003\u0002\u0002\u0002\u0103\u0105\u0003\u0002\u0002\u0002\u0104\u0106\u0005\u0034\u001b\u0002\u0105\u0104\u0003\u0002\u0002\u0002\u0105\u0106\u0003\u0002\u0002\u0002\u0106\u0107\u0003\u0002\u0002\u0002\u0107\u0108\u0007\u0019\u0002\u0002\u0108\u0109\u0007\u0026\u0002\u0002\u0109\u011e\u0005\u0052\u002a\u0002\u010a\u010c\u0005\u006a\u0036\u0002\u010b\u010a\u0003\u0002\u0002\u0002\u010b\u010c\u0003\u0002\u0002\u0002\u010c\u010d\u0003\u0002\u0002\u0002\u010d\u010f\u0007\u0029\u0002\u0002\u010e\u0110\u0005\u0048\u0025\u0002\u010f\u010e\u0003\u0002\u0002\u0002\u010f\u0110\u0003\u0002\u0002\u0002\u0110\u0112\u0003\u0002\u0002\u0002\u0111\u0113\u0005\u0026\u0014\u0002\u0112\u0111\u0003\u0002\u0002\u0002\u0112\u0113\u0003\u0002\u0002\u0002\u0113\u0115\u0003\u0002\u0002\u0002\u0114\u0116\u0005\u0034\u001b\u0002\u0115\u0114\u0003\u0002\u0002\u0002\u0115\u0116\u0003\u0002\u0002\u0002\u0116\u0117\u0003\u0002\u0002\u0002\u0117\u011a\u0007\u0019\u0002\u0002\u0118\u0119\u0007\u0026\u0002\u0002\u0119\u011b\u0005\u0052\u002a\u0002\u011a\u0118\u0003\u0002\u0002\u0002\u011a\u011b\u0003\u0002\u0002\u0002\u011b\u011c\u0003\u0002\u0002\u0002\u011c\u011e\u0005\u002e\u0018\u0002\u011d\u00fb\u0003\u0002\u0002\u0002\u011d\u010b\u0003\u0002\u0002\u0002\u011e\u0023\u0003\u0002\u0002\u0002\u011f\u0121\u0005\u006a\u0036\u0002\u0120\u011f\u0003\u0002\u0002\u0002\u0120\u0121\u0003\u0002\u0002\u0002\u0121\u0122\u0003\u0002\u0002\u0002\u0122\u0123\u0007\u0017\u0002\u0002\u0123\u0124\u0007\u0029\u0002\u0002\u0124\u0128\u0007\u0022\u0002\u0002\u0125\u0127\u0005\u006c\u0037\u0002\u0126\u0125\u0003\u0002\u0002\u0002\u0127\u012a\u0003\u0002\u0002\u0002\u0128\u0126\u0003\u0002\u0002\u0002\u0128\u0129\u0003\u0002\u0002\u0002\u0129\u012b\u0003\u0002\u0002\u0002\u012a\u0128\u0003\u0002\u0002\u0002\u012b\u012c\u0007\u0023\u0002\u0002\u012c\u0025\u0003\u0002\u0002\u0002\u012d\u012f\u0005\u0028\u0015\u0002\u012e\u012d\u0003\u0002\u0002\u0002\u012f\u0130\u0003\u0002\u0002\u0002\u0130\u012e\u0003\u0002\u0002\u0002\u0130\u0131\u0003\u0002\u0002\u0002\u0131\u0027\u0003\u0002\u0002\u0002\u0132\u0137\u0007\u0029\u0002\u0002\u0133\u0134\u0007\u0025\u0002\u0002\u0134\u0136\u0005\u0052\u002a\u0002\u0135\u0133\u0003\u0002\u0002\u0002\u0136\u0139\u0003\u0002\u0002\u0002\u0137\u0135\u0003\u0002\u0002\u0002\u0137\u0138\u0003\u0002\u0002\u0002\u0138\u0029\u0003\u0002\u0002\u0002\u0139\u0137\u0003\u0002\u0002\u0002\u013a\u013e\u0005\u0046\u0024\u0002\u013b\u013e\u0005\u0014\u000b\u0002\u013c\u013e\u0005\u001a\u000e\u0002\u013d\u013a\u0003\u0002\u0002\u0002\u013d\u013b\u0003\u0002\u0002\u0002\u013d\u013c\u0003\u0002\u0002\u0002\u013e\u002b\u0003\u0002\u0002\u0002\u013f\u0141\u0005\u006a\u0036\u0002\u0140\u013f\u0003\u0002\u0002\u0002\u0140\u0141\u0003\u0002\u0002\u0002\u0141\u0144\u0003\u0002\u0002\u0002\u0142\u0145\u0005\u003e\u0020\u0002\u0143\u0145\u0005\u0040\u0021\u0002\u0144\u0142\u0003\u0002\u0002\u0002\u0144\u0143\u0003\u0002\u0002\u0002\u0145\u002d\u0003\u0002\u0002\u0002\u0146\u0147\u0008\u0018\u0001\u0002\u0147\u0166\u0007\u002b\u0002\u0002\u0148\u0166\u0007\u002c\u0002\u0002\u0149\u0166\u0007\u002d\u0002\u0002\u014a\u0166\u0005\u006c\u0037\u0002\u014b\u014c\u0005\u0008\u0005\u0002\u014c\u014d\u0007\u001b\u0002\u0002\u014d\u014f\u0003\u0002\u0002\u0002\u014e\u014b\u0003\u0002\u0002\u0002\u014e\u014f\u0003\u0002\u0002\u0002\u014f\u0150\u0003\u0002\u0002\u0002\u0150\u0166\u0007\u0029\u0002\u0002\u0151\u0152\u0005\u0008\u0005\u0002\u0152\u0153\u0007\u001b\u0002\u0002\u0153\u0155\u0003\u0002\u0002\u0002\u0154\u0151\u0003\u0002\u0002\u0002\u0154\u0155\u0003\u0002\u0002\u0002\u0155\u0156\u0003\u0002\u0002\u0002\u0156\u0166\u0005\u004e\u0028\u0002\u0157\u0158\u0005\u0008\u0005\u0002\u0158\u0159\u0007\u001b\u0002\u0002\u0159\u015b\u0003\u0002\u0002\u0002\u015a\u0157\u0003\u0002\u0002\u0002\u015a\u015b\u0003\u0002\u0002\u0002\u015b\u015c\u0003\u0002\u0002\u0002\u015c\u0166\u0005\u0050\u0029\u0002\u015d\u015e\u0007\u002a\u0002\u0002\u015e\u0166\u0005\u002e\u0018\u0009\u015f\u0166\u0005\u000c\u0007\u0002\u0160\u0166\u0005\u004c\u0027\u0002\u0161\u0162\u0007\u001c\u0002\u0002\u0162\u0163\u0005\u002e\u0018\u0002\u0163\u0164\u0007\u001d\u0002\u0002\u0164\u0166\u0003\u0002\u0002\u0002\u0165\u0146\u0003\u0002\u0002\u0002\u0165\u0148\u0003\u0002\u0002\u0002\u0165\u0149\u0003\u0002\u0002\u0002\u0165\u014a\u0003\u0002\u0002\u0002\u0165\u014e\u0003\u0002\u0002\u0002\u0165\u0154\u0003\u0002\u0002\u0002\u0165\u015a\u0003\u0002\u0002\u0002\u0165\u015d\u0003\u0002\u0002\u0002\u0165\u015f\u0003\u0002\u0002\u0002\u0165\u0160\u0003\u0002\u0002\u0002\u0165\u0161\u0003\u0002\u0002\u0002\u0166\u0176\u0003\u0002\u0002\u0002\u0167\u0168\u000c\u000a\u0002\u0002\u0168\u0169\u0007\u002a\u0002\u0002\u0169\u0175\u0005\u002e\u0018\u000b\u016a\u016b\u000c\u0006\u0002\u0002\u016b\u016c\u0007\u0026\u0002\u0002\u016c\u0175\u0005\u002e\u0018\u0007\u016d\u016e\u000c\u0005\u0002\u0002\u016e\u016f\u0007\u0027\u0002\u0002\u016f\u0175\u0005\u002e\u0018\u0006\u0170\u0171\u000c\u000b\u0002\u0002\u0171\u0175\u0005\u003c\u001f\u0002\u0172\u0173\u000c\u0003\u0002\u0002\u0173\u0175\u0005\u0030\u0019\u0002\u0174\u0167\u0003\u0002\u0002\u0002\u0174\u016a\u0003\u0002\u0002\u0002\u0174\u016d\u0003\u0002\u0002\u0002\u0174\u0170\u0003\u0002\u0002\u0002\u0174\u0172\u0003\u0002\u0002\u0002\u0175\u0178\u0003\u0002\u0002\u0002\u0176\u0174\u0003\u0002\u0002\u0002\u0176\u0177\u0003\u0002\u0002\u0002\u0177\u002f\u0003\u0002\u0002\u0002\u0178\u0176\u0003\u0002\u0002\u0002\u0179\u017a\u0007\u0006\u0002\u0002\u017a\u017b\u0005\u0052\u002a\u0002\u017b\u0031\u0003\u0002\u0002\u0002\u017c\u017e\u0005\u006a\u0036\u0002\u017d\u017c\u0003\u0002\u0002\u0002\u017d\u017e\u0003\u0002\u0002\u0002\u017e\u017f\u0003\u0002\u0002\u0002\u017f\u0180\u0007\u0029\u0002\u0002\u0180\u0182\u0005\u0052\u002a\u0002\u0181\u0183\u0007\u001a\u0002\u0002\u0182\u0181\u0003\u0002\u0002\u0002\u0182\u0183\u0003\u0002\u0002\u0002\u0183\u0186\u0003\u0002\u0002\u0002\u0184\u0185\u0007\u0018\u0002\u0002\u0185\u0187\u0005\u002e\u0018\u0002\u0186\u0184\u0003\u0002\u0002\u0002\u0186\u0187\u0003\u0002\u0002\u0002\u0187\u0033\u0003\u0002\u0002\u0002\u0188\u018c\u0007\u0026\u0002\u0002\u0189\u018b\u0005\u0032\u001a\u0002\u018a\u0189\u0003\u0002\u0002\u0002\u018b\u018e\u0003\u0002\u0002\u0002\u018c\u018a\u0003\u0002\u0002\u0002\u018c\u018d\u0003\u0002\u0002\u0002\u018d\u0035\u0003\u0002\u0002\u0002\u018e\u018c\u0003\u0002\u0002\u0002\u018f\u0190\u0007\u0026\u0002\u0002\u0190\u0191\u0005\u0032\u001a\u0002\u0191\u0192\u0005\u0032\u001a\u0002\u0192\u0037\u0003\u0002\u0002\u0002\u0193\u0194\u0007\u0026\u0002\u0002\u0194\u0195\u0005\u0032\u001a\u0002\u0195\u0039\u0003\u0002\u0002\u0002\u0196\u0197\u0007\u0029\u0002\u0002\u0197\u0199\u0007\u0018\u0002\u0002\u0198\u0196\u0003\u0002\u0002\u0002\u0198\u0199\u0003\u0002\u0002\u0002\u0199\u019a\u0003\u0002\u0002\u0002\u019a\u01a7\u0005\u002e\u0018\u0002\u019b\u019d\u0007\u0029\u0002\u0002\u019c\u019b\u0003\u0002\u0002\u0002\u019c\u019d\u0003\u0002\u0002\u0002\u019d\u019e\u0003\u0002\u0002\u0002\u019e\u01a2\u0007\u0022\u0002\u0002\u019f\u01a1\u0005\u002e\u0018\u0002\u01a0\u019f\u0003\u0002\u0002\u0002\u01a1\u01a4\u0003\u0002\u0002\u0002\u01a2\u01a0\u0003\u0002\u0002\u0002\u01a2\u01a3\u0003\u0002\u0002\u0002\u01a3\u01a5\u0003\u0002\u0002\u0002\u01a4\u01a2\u0003\u0002\u0002\u0002\u01a5\u01a7\u0007\u0023\u0002\u0002\u01a6\u0198\u0003\u0002\u0002\u0002\u01a6\u019c\u0003\u0002\u0002\u0002\u01a7\u003b\u0003\u0002\u0002\u0002\u01a8\u01aa\u0007\u0025\u0002\u0002\u01a9\u01ab\u0005\u0052\u002a\u0002\u01aa\u01a9\u0003\u0002\u0002\u0002\u01ab\u01ac\u0003\u0002\u0002\u0002\u01ac\u01aa\u0003\u0002\u0002\u0002\u01ac\u01ad\u0003\u0002\u0002\u0002\u01ad\u01af\u0003\u0002\u0002\u0002\u01ae\u01a8\u0003\u0002\u0002\u0002\u01ae\u01af\u0003\u0002\u0002\u0002\u01af\u01b0\u0003\u0002\u0002\u0002\u01b0\u01b4\u0007\u001c\u0002\u0002\u01b1\u01b3\u0005\u003a\u001e\u0002\u01b2\u01b1\u0003\u0002\u0002\u0002\u01b3\u01b6\u0003\u0002\u0002\u0002\u01b4\u01b2\u0003\u0002\u0002\u0002\u01b4\u01b5\u0003\u0002\u0002\u0002\u01b5\u01b7\u0003\u0002\u0002\u0002\u01b6\u01b4\u0003\u0002\u0002\u0002\u01b7\u01b8\u0007\u001d\u0002\u0002\u01b8\u003d\u0003\u0002\u0002\u0002\u01b9\u01bc\u0005\u0042\u0022\u0002\u01ba\u01bc\u0005\u001e\u0010\u0002\u01bb\u01b9\u0003\u0002\u0002\u0002\u01bb\u01ba\u0003\u0002\u0002\u0002\u01bc\u003f\u0003\u0002\u0002\u0002\u01bd\u01c0\u0005\u0044\u0023\u0002\u01be\u01c0\u0005\u0020\u0011\u0002\u01bf\u01bd\u0003\u0002\u0002\u0002\u01bf\u01be\u0003\u0002\u0002\u0002\u01c0\u0041\u0003\u0002\u0002\u0002\u01c1\u01c2\u0007\u0014\u0002\u0002\u01c2\u01c4\u0007\u0029\u0002\u0002\u01c3\u01c5\u0005\u0052\u002a\u0002\u01c4\u01c3\u0003\u0002\u0002\u0002\u01c4\u01c5\u0003\u0002\u0002\u0002\u01c5\u01c6\u0003\u0002\u0002\u0002\u01c6\u01c7\u0007\u0018\u0002\u0002\u01c7\u01c8\u0005\u002e\u0018\u0002\u01c8\u0043\u0003\u0002\u0002\u0002\u01c9\u01ca\u0007\u0013\u0002\u0002\u01ca\u01cc\u0007\u0029\u0002\u0002\u01cb\u01cd\u0005\u0052\u002a\u0002\u01cc\u01cb\u0003\u0002\u0002\u0002\u01cc\u01cd\u0003\u0002\u0002\u0002\u01cd\u01ce\u0003\u0002\u0002\u0002\u01ce\u01cf\u0007\u0018\u0002\u0002\u01cf\u01d0\u0005\u002e\u0018\u0002\u01d0\u0045\u0003\u0002\u0002\u0002\u01d1\u01d3\u0005\u006a\u0036\u0002\u01d2\u01d1\u0003\u0002\u0002\u0002\u01d2\u01d3\u0003\u0002\u0002\u0002\u01d3\u01d4\u0003\u0002\u0002\u0002\u01d4\u01d6\u0007\u0029\u0002\u0002\u01d5\u01d7\u0005\u0048\u0025\u0002\u01d6\u01d5\u0003\u0002\u0002\u0002\u01d6\u01d7\u0003\u0002\u0002\u0002\u01d7\u01d9\u0003\u0002\u0002\u0002\u01d8\u01da\u0005\u0026\u0014\u0002\u01d9\u01d8\u0003\u0002\u0002\u0002\u01d9\u01da\u0003\u0002\u0002\u0002\u01da\u01dc\u0003\u0002\u0002\u0002\u01db\u01dd\u0005\u0034\u001b\u0002\u01dc\u01db\u0003\u0002\u0002\u0002\u01dc\u01dd\u0003\u0002\u0002\u0002\u01dd\u01de\u0003\u0002\u0002\u0002\u01de\u01e1\u0007\u0019\u0002\u0002\u01df\u01e0\u0007\u0026\u0002\u0002\u01e0\u01e2\u0005\u0052\u002a\u0002\u01e1\u01df\u0003\u0002\u0002\u0002\u01e1\u01e2\u0003\u0002\u0002\u0002\u01e2\u01e3\u0003\u0002\u0002\u0002\u01e3\u0263\u0005\u002e\u0018\u0002\u01e4\u01e6\u0005\u006a\u0036\u0002\u01e5\u01e4\u0003\u0002\u0002\u0002\u01e5\u01e6\u0003\u0002\u0002\u0002\u01e6\u01e7\u0003\u0002\u0002\u0002\u01e7\u01e9\u0005\u004e\u0028\u0002\u01e8\u01ea\u0005\u0048\u0025\u0002\u01e9\u01e8\u0003\u0002\u0002\u0002\u01e9\u01ea\u0003\u0002\u0002\u0002\u01ea\u01ec\u0003\u0002\u0002\u0002\u01eb\u01ed\u0005\u0026\u0014\u0002\u01ec\u01eb\u0003\u0002\u0002\u0002\u01ec\u01ed\u0003\u0002\u0002\u0002\u01ed\u01ee\u0003\u0002\u0002\u0002\u01ee\u01ef\u0005\u0036\u001c\u0002\u01ef\u01f2\u0007\u0019\u0002\u0002\u01f0\u01f1\u0007\u0026\u0002\u0002\u01f1\u01f3\u0005\u0052\u002a\u0002\u01f2\u01f0\u0003\u0002\u0002\u0002\u01f2\u01f3\u0003\u0002\u0002\u0002\u01f3\u01f4\u0003\u0002\u0002\u0002\u01f4\u01f5\u0005\u002e\u0018\u0002\u01f5\u0263\u0003\u0002\u0002\u0002\u01f6\u01f8\u0005\u006a\u0036\u0002\u01f7\u01f6\u0003\u0002\u0002\u0002\u01f7\u01f8\u0003\u0002\u0002\u0002\u01f8\u01f9\u0003\u0002\u0002\u0002\u01f9\u01fb\u0005\u0050\u0029\u0002\u01fa\u01fc\u0005\u0048\u0025\u0002\u01fb\u01fa\u0003\u0002\u0002\u0002\u01fb\u01fc\u0003\u0002\u0002\u0002\u01fc\u01fe\u0003\u0002\u0002\u0002\u01fd\u01ff\u0005\u0026\u0014\u0002\u01fe\u01fd\u0003\u0002\u0002\u0002\u01fe\u01ff\u0003\u0002\u0002\u0002\u01ff\u0200\u0003\u0002\u0002\u0002\u0200\u0201\u0005\u0038\u001d\u0002\u0201\u0204\u0007\u0019\u0002\u0002\u0202\u0203\u0007\u0026\u0002\u0002\u0203\u0205\u0005\u0052\u002a\u0002\u0204\u0202\u0003\u0002\u0002\u0002\u0204\u0205\u0003\u0002\u0002\u0002\u0205\u0206\u0003\u0002\u0002\u0002\u0206\u0207\u0005\u002e\u0018\u0002\u0207\u0263\u0003\u0002\u0002\u0002\u0208\u020a\u0005\u006a\u0036\u0002\u0209\u0208\u0003\u0002\u0002\u0002\u0209\u020a\u0003\u0002\u0002\u0002\u020a\u020b\u0003\u0002\u0002\u0002\u020b\u020d\u0007\u0029\u0002\u0002\u020c\u020e\u0005\u0048\u0025\u0002\u020d\u020c\u0003\u0002\u0002\u0002\u020d\u020e\u0003\u0002\u0002\u0002\u020e\u0210\u0003\u0002\u0002\u0002\u020f\u0211\u0005\u0026\u0014\u0002\u0210\u020f\u0003\u0002\u0002\u0002\u0210\u0211\u0003\u0002\u0002\u0002\u0211\u0213\u0003\u0002\u0002\u0002\u0212\u0214\u0005\u0034\u001b\u0002\u0213\u0212\u0003\u0002\u0002\u0002\u0213\u0214\u0003\u0002\u0002\u0002\u0214\u0215\u0003\u0002\u0002\u0002\u0215\u0263\u0005\u005a\u002e\u0002\u0216\u0218\u0005\u006a\u0036\u0002\u0217\u0216\u0003\u0002\u0002\u0002\u0217\u0218\u0003\u0002\u0002\u0002\u0218\u0219\u0003\u0002\u0002\u0002\u0219\u021b\u0005\u004e\u0028\u0002\u021a\u021c\u0005\u0048\u0025\u0002\u021b\u021a\u0003\u0002\u0002\u0002\u021b\u021c\u0003\u0002\u0002\u0002\u021c\u021e\u0003\u0002\u0002\u0002\u021d\u021f\u0005\u0026\u0014\u0002\u021e\u021d\u0003\u0002\u0002\u0002\u021e\u021f\u0003\u0002\u0002\u0002\u021f\u0220\u0003\u0002\u0002\u0002\u0220\u0221\u0005\u0036\u001c\u0002\u0221\u0222\u0005\u005a\u002e\u0002\u0222\u0263\u0003\u0002\u0002\u0002\u0223\u0225\u0005\u006a\u0036\u0002\u0224\u0223\u0003\u0002\u0002\u0002\u0224\u0225\u0003\u0002\u0002\u0002\u0225\u0226\u0003\u0002\u0002\u0002\u0226\u0228\u0005\u0050\u0029\u0002\u0227\u0229\u0005\u0048\u0025\u0002\u0228\u0227\u0003\u0002\u0002\u0002\u0228\u0229\u0003\u0002\u0002\u0002\u0229\u022b\u0003\u0002\u0002\u0002\u022a\u022c\u0005\u0026\u0014\u0002\u022b\u022a\u0003\u0002\u0002\u0002\u022b\u022c\u0003\u0002\u0002\u0002\u022c\u022d\u0003\u0002\u0002\u0002\u022d\u022e\u0005\u0038\u001d\u0002\u022e\u022f\u0005\u005a\u002e\u0002\u022f\u0263\u0003\u0002\u0002\u0002\u0230\u0232\u0005\u006a\u0036\u0002\u0231\u0230\u0003\u0002\u0002\u0002\u0231\u0232\u0003\u0002\u0002\u0002\u0232\u0233\u0003\u0002\u0002\u0002\u0233\u0234\u0007\u000d\u0002\u0002\u0234\u0236\u0007\u0029\u0002\u0002\u0235\u0237\u0005\u0048\u0025\u0002\u0236\u0235\u0003\u0002\u0002\u0002\u0236\u0237\u0003\u0002\u0002\u0002\u0237\u0239\u0003\u0002\u0002\u0002\u0238\u023a\u0005\u0026\u0014\u0002\u0239\u0238\u0003\u0002\u0002\u0002\u0239\u023a\u0003\u0002\u0002\u0002\u023a\u023c\u0003\u0002\u0002\u0002\u023b\u023d\u0005\u0034\u001b\u0002\u023c\u023b\u0003\u0002\u0002\u0002\u023c\u023d\u0003\u0002\u0002\u0002\u023d\u0240\u0003\u0002\u0002\u0002\u023e\u0241\u0005\u005a\u002e\u0002\u023f\u0241\u0007\u002e\u0002\u0002\u0240\u023e\u0003\u0002\u0002\u0002\u0240\u023f\u0003\u0002\u0002\u0002\u0241\u0263\u0003\u0002\u0002\u0002\u0242\u0244\u0005\u006a\u0036\u0002\u0243\u0242\u0003\u0002\u0002\u0002\u0243\u0244\u0003\u0002\u0002\u0002\u0244\u0245\u0003\u0002\u0002\u0002\u0245\u0246\u0007\u000d\u0002\u0002\u0246\u0248\u0005\u004e\u0028\u0002\u0247\u0249\u0005\u0048\u0025\u0002\u0248\u0247\u0003\u0002\u0002\u0002\u0248\u0249\u0003\u0002\u0002\u0002\u0249\u024b\u0003\u0002\u0002\u0002\u024a\u024c\u0005\u0026\u0014\u0002\u024b\u024a\u0003\u0002\u0002\u0002\u024b\u024c\u0003\u0002\u0002\u0002\u024c\u024d\u0003\u0002\u0002\u0002\u024d\u0250\u0005\u0036\u001c\u0002\u024e\u0251\u0005\u005a\u002e\u0002\u024f\u0251\u0007\u002e\u0002\u0002\u0250\u024e\u0003\u0002\u0002\u0002\u0250\u024f\u0003\u0002\u0002\u0002\u0251\u0263\u0003\u0002\u0002\u0002\u0252\u0254\u0005\u006a\u0036\u0002\u0253\u0252\u0003\u0002\u0002\u0002\u0253\u0254\u0003\u0002\u0002\u0002\u0254\u0255\u0003\u0002\u0002\u0002\u0255\u0256\u0007\u000d\u0002\u0002\u0256\u0258\u0005\u0050\u0029\u0002\u0257\u0259\u0005\u0048\u0025\u0002\u0258\u0257\u0003\u0002\u0002\u0002\u0258\u0259\u0003\u0002\u0002\u0002\u0259\u025b\u0003\u0002\u0002\u0002\u025a\u025c\u0005\u0026\u0014\u0002\u025b\u025a\u0003\u0002\u0002\u0002\u025b\u025c\u0003\u0002\u0002\u0002\u025c\u025d\u0003\u0002\u0002\u0002\u025d\u0260\u0005\u0038\u001d\u0002\u025e\u0261\u0005\u005a\u002e\u0002\u025f\u0261\u0007\u002e\u0002\u0002\u0260\u025e\u0003\u0002\u0002\u0002\u0260\u025f\u0003\u0002\u0002\u0002\u0261\u0263\u0003\u0002\u0002\u0002\u0262\u01d2\u0003\u0002\u0002\u0002\u0262\u01e5\u0003\u0002\u0002\u0002\u0262\u01f7\u0003\u0002\u0002\u0002\u0262\u0209\u0003\u0002\u0002\u0002\u0262\u0217\u0003\u0002\u0002\u0002\u0262\u0224\u0003\u0002\u0002\u0002\u0262\u0231\u0003\u0002\u0002\u0002\u0262\u0243\u0003\u0002\u0002\u0002\u0262\u0253\u0003\u0002\u0002\u0002\u0263\u0047\u0003\u0002\u0002\u0002\u0264\u0265\u0005\u006c\u0037\u0002\u0265\u0049\u0003\u0002\u0002\u0002\u0266\u026c\u0007\u0029\u0002\u0002\u0267\u0268\u0007\u0025\u0002\u0002\u0268\u026a\u0005\u0052\u002a\u0002\u0269\u026b\u0007\u001a\u0002\u0002\u026a\u0269\u0003\u0002\u0002\u0002\u026a\u026b\u0003\u0002\u0002\u0002\u026b\u026d\u0003\u0002\u0002\u0002\u026c\u0267\u0003\u0002\u0002\u0002\u026c\u026d\u0003\u0002\u0002\u0002\u026d\u0270\u0003\u0002\u0002\u0002\u026e\u026f\u0007\u0018\u0002\u0002\u026f\u0271\u0005\u002e\u0018\u0002\u0270\u026e\u0003\u0002\u0002\u0002\u0270\u0271\u0003\u0002\u0002\u0002\u0271\u004b\u0003\u0002\u0002\u0002\u0272\u0276\u0007\u001e\u0002\u0002\u0273\u0274\u0005\u0026\u0014\u0002\u0274\u0275\u0007\u0026\u0002\u0002\u0275\u0277\u0003\u0002\u0002\u0002\u0276\u0273\u0003\u0002\u0002\u0002\u0276\u0277\u0003\u0002\u0002\u0002\u0277\u027b\u0003\u0002\u0002\u0002\u0278\u027a\u0005\u004a\u0026\u0002\u0279\u0278\u0003\u0002\u0002\u0002\u027a\u027d\u0003\u0002\u0002\u0002\u027b\u0279\u0003\u0002\u0002\u0002\u027b\u027c\u0003\u0002\u0002\u0002\u027c\u027e\u0003\u0002\u0002\u0002\u027d\u027b\u0003\u0002\u0002\u0002\u027e\u027f\u0007\u0020\u0002\u0002\u027f\u0280\u0005\u002e\u0018\u0002\u0280\u004d\u0003\u0002\u0002\u0002\u0281\u0282\u0007\u001e\u0002\u0002\u0282\u0283\u0007\u002a\u0002\u0002\u0283\u0284\u0007\u0020\u0002\u0002\u0284\u004f\u0003\u0002\u0002\u0002\u0285\u0286\u0007\u001e\u0002\u0002\u0286\u0287\u0007\u0025\u0002\u0002\u0287\u0288\u0007\u002a\u0002\u0002\u0288\u0289\u0007\u0020\u0002\u0002\u0289\u0051\u0003\u0002\u0002\u0002\u028a\u028b\u0005\u0058\u002d\u0002\u028b\u028c\u0007\u0024\u0002\u0002\u028c\u028d\u0005\u0052\u002a\u0002\u028d\u0290\u0003\u0002\u0002\u0002\u028e\u0290\u0005\u0054\u002b\u0002\u028f\u028a\u0003\u0002\u0002\u0002\u028f\u028e\u0003\u0002\u0002\u0002\u0290\u0053\u0003\u0002\u0002\u0002\u0291\u0292\u0005\u0008\u0005\u0002\u0292\u0293\u0007\u001b\u0002\u0002\u0293\u0295\u0003\u0002\u0002\u0002\u0294\u0291\u0003\u0002\u0002\u0002\u0294\u0295\u0003\u0002\u0002\u0002\u0295\u0296\u0003\u0002\u0002\u0002\u0296\u029f\u0007\u0029\u0002\u0002\u0297\u0299\u0007\u001c\u0002\u0002\u0298\u029a\u0005\u0052\u002a\u0002\u0299\u0298\u0003\u0002\u0002\u0002\u029a\u029b\u0003\u0002\u0002\u0002\u029b\u0299\u0003\u0002\u0002\u0002\u029b\u029c\u0003\u0002\u0002\u0002\u029c\u029d\u0003\u0002\u0002\u0002\u029d\u029e\u0007\u001d\u0002\u0002\u029e\u02a0\u0003\u0002\u0002\u0002\u029f\u0297\u0003\u0002\u0002\u0002\u029f\u02a0\u0003\u0002\u0002\u0002\u02a0\u0055\u0003\u0002\u0002\u0002\u02a1\u02a3\u0005\u0052\u002a\u0002\u02a2\u02a4\u0007\u001a\u0002\u0002\u02a3\u02a2\u0003\u0002\u0002\u0002\u02a3\u02a4\u0003\u0002\u0002\u0002\u02a4\u0057\u0003\u0002\u0002\u0002\u02a5\u02a9\u0007\u001c\u0002\u0002\u02a6\u02a8\u0005\u0056\u002c\u0002\u02a7\u02a6\u0003\u0002\u0002\u0002\u02a8\u02ab\u0003\u0002\u0002\u0002\u02a9\u02a7\u0003\u0002\u0002\u0002\u02a9\u02aa\u0003\u0002\u0002\u0002\u02aa\u02ac\u0003\u0002\u0002\u0002\u02ab\u02a9\u0003\u0002\u0002\u0002\u02ac\u02ad\u0007\u001d\u0002\u0002\u02ad\u0059\u0003\u0002\u0002\u0002\u02ae\u02af\u0007\u000c\u0002\u0002\u02af\u02b0\u0005\u0052\u002a\u0002\u02b0\u02b1\u0005\u005c\u002f\u0002\u02b1\u02b5\u0003\u0002\u0002\u0002\u02b2\u02b3\u0007\u000b\u0002\u0002\u02b3\u02b5\u0005\u0052\u002a\u0002\u02b4\u02ae\u0003\u0002\u0002\u0002\u02b4\u02b2\u0003\u0002\u0002\u0002\u02b5\u005b\u0003\u0002\u0002\u0002\u02b6\u02ba\u0007\u0022\u0002\u0002\u02b7\u02b9\u0005\u005e\u0030\u0002\u02b8\u02b7\u0003\u0002\u0002\u0002\u02b9\u02bc\u0003\u0002\u0002\u0002\u02ba\u02b8\u0003\u0002\u0002\u0002\u02ba\u02bb\u0003\u0002\u0002\u0002\u02bb\u02bd\u0003\u0002\u0002\u0002\u02bc\u02ba\u0003\u0002\u0002\u0002\u02bd\u02be\u0007\u0023\u0002\u0002\u02be\u005d\u0003\u0002\u0002\u0002\u02bf\u02c0\u0005\u0060\u0031\u0002\u02c0\u02c1\u0007\u002e\u0002\u0002\u02c1\u02c7\u0003\u0002\u0002\u0002\u02c2\u02c3\u0005\u0060\u0031\u0002\u02c3\u02c4\u0007\u0025\u0002\u0002\u02c4\u02c5\u0007\u002d\u0002\u0002\u02c5\u02c7\u0003\u0002\u0002\u0002\u02c6\u02bf\u0003\u0002\u0002\u0002\u02c6\u02c2\u0003\u0002\u0002\u0002\u02c7\u005f\u0003\u0002\u0002\u0002\u02c8\u02c9\u0007\u0029\u0002\u0002\u02c9\u0061\u0003\u0002\u0002\u0002\u02ca\u02cb\u0009\u0002\u0002\u0002\u02cb\u0063\u0003\u0002\u0002\u0002\u02cc\u02cd\u0007\u0029\u0002\u0002\u02cd\u02ce\u0005\u0052\u002a\u0002\u02ce\u0065\u0003\u0002\u0002\u0002\u02cf\u02d0\u0007\u0008\u0002\u0002\u02d0\u02d9\u0007\u0029\u0002\u0002\u02d1\u02d5\u0007\u001c\u0002\u0002\u02d2\u02d4\u0005\u0064\u0033\u0002\u02d3\u02d2\u0003\u0002\u0002\u0002\u02d4\u02d7\u0003\u0002\u0002\u0002\u02d5\u02d3\u0003\u0002\u0002\u0002\u02d5\u02d6\u0003\u0002\u0002\u0002\u02d6\u02d8\u0003\u0002\u0002\u0002\u02d7\u02d5\u0003\u0002\u0002\u0002\u02d8\u02da\u0007\u001d\u0002\u0002\u02d9\u02d1\u0003\u0002\u0002\u0002\u02d9\u02da\u0003\u0002\u0002\u0002\u02da\u0067\u0003\u0002\u0002\u0002\u02db\u02df\u0007\u0029\u0002\u0002\u02dc\u02de\u0005\u0062\u0032\u0002\u02dd\u02dc\u0003\u0002\u0002\u0002\u02de\u02e1\u0003\u0002\u0002\u0002\u02df\u02dd\u0003\u0002\u0002\u0002\u02df\u02e0\u0003\u0002\u0002\u0002\u02e0\u02ec\u0003\u0002\u0002\u0002\u02e1\u02df\u0003\u0002\u0002\u0002\u02e2\u02e3\u0007\u0029\u0002\u0002\u02e3\u02e7\u0007\u001c\u0002\u0002\u02e4\u02e6\u0005\u0062\u0032\u0002\u02e5\u02e4\u0003\u0002\u0002\u0002\u02e6\u02e9\u0003\u0002\u0002\u0002\u02e7\u02e5\u0003\u0002\u0002\u0002\u02e7\u02e8\u0003\u0002\u0002\u0002\u02e8\u02ea\u0003\u0002\u0002\u0002\u02e9\u02e7\u0003\u0002\u0002\u0002\u02ea\u02ec\u0007\u001d\u0002\u0002\u02eb\u02db\u0003\u0002\u0002\u0002\u02eb\u02e2\u0003\u0002\u0002\u0002\u02ec\u0069\u0003\u0002\u0002\u0002\u02ed\u02f1\u0007\u001f\u0002\u0002\u02ee\u02f0\u0005\u0068\u0035\u0002\u02ef\u02ee\u0003\u0002\u0002\u0002\u02f0\u02f3\u0003\u0002\u0002\u0002\u02f1\u02ef\u0003\u0002\u0002\u0002\u02f1\u02f2\u0003\u0002\u0002\u0002\u02f2\u02f4\u0003\u0002\u0002\u0002\u02f3\u02f1\u0003\u0002\u0002\u0002\u02f4\u02f5\u0007\u0021\u0002\u0002\u02f5\u006b\u0003\u0002\u0002\u0002\u02f6\u02f7\u0007\u0028\u0002\u0002\u02f7\u02f8\u0007\u0029\u0002\u0002\u02f8\u006d\u0003\u0002\u0002\u0002\u0078\u006f\u0074\u007b\u007d\u008a\u0095\u009d\u00a6\u00a8\u00ae\u00b3\u00bc\u00c0\u00c4\u00c6\u00ce\u00d2\u00d5\u00da\u00e0\u00e2\u00e8\u00ed\u00fb\u00ff\u0102\u0105\u010b\u010f\u0112\u0115\u011a\u011d\u0120\u0128\u0130\u0137\u013d\u0140\u0144\u014e\u0154\u015a\u0165\u0174\u0176\u017d\u0182\u0186\u018c\u0198\u019c\u01a2\u01a6\u01ac\u01ae\u01b4\u01bb\u01bf\u01c4\u01cc\u01d2\u01d6\u01d9\u01dc\u01e1\u01e5\u01e9\u01ec\u01f2\u01f7\u01fb\u01fe\u0204\u0209\u020d\u0210\u0213\u0217\u021b\u021e\u0224\u0228\u022b\u0231\u0236\u0239\u023c\u0240\u0243\u0248\u024b\u0250\u0253\u0258\u025b\u0260\u0262\u026a\u026c\u0270\u0276\u027b\u028f\u0294\u029b\u029f\u02a3\u02a9\u02b4\u02ba\u02c6\u02d5\u02d9\u02df\u02e7\u02eb\u02f1"

        val ATN = ATNDeserializer().deserialize(serializedATN.asCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val WS = Tokens.WS.id
    private val COMMENT = Tokens.COMMENT.id
    private val LINE_COMMENT = Tokens.LINE_COMMENT.id
    private val AS = Tokens.AS.id
    private val ABSTRACT = Tokens.ABSTRACT.id
    private val ANNOTATION = Tokens.ANNOTATION.id
    private val Class = Tokens.Class.id
    private val DO = Tokens.DO.id
    private val EXTERNAL = Tokens.EXTERNAL.id
    private val FOREIGN = Tokens.FOREIGN.id
    private val TEMPLATE = Tokens.TEMPLATE.id
    private val NAMESPACE = Tokens.NAMESPACE.id
    private val OVERRIDE = Tokens.OVERRIDE.id
    private val INTERNAL = Tokens.INTERNAL.id
    private val IMPORT = Tokens.IMPORT.id
    private val RETURN = Tokens.RETURN.id
    private val VAR = Tokens.VAR.id
    private val VAL = Tokens.VAL.id
    private val STATIC = Tokens.STATIC.id
    private val INTERFACE = Tokens.INTERFACE.id
    private val NEWDATA = Tokens.NEWDATA.id
    private val ASSGIN = Tokens.ASSGIN.id
    private val BIGARROW = Tokens.BIGARROW.id
    private val ELLIPSIS = Tokens.ELLIPSIS.id
    private val DOT = Tokens.DOT.id
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val LSQUARE = Tokens.LSQUARE.id
    private val LCOLONSQUARE = Tokens.LCOLONSQUARE.id
    private val RSQUARE = Tokens.RSQUARE.id
    private val RCOLONSQUARE = Tokens.RCOLONSQUARE.id
    private val LBRACE = Tokens.LBRACE.id
    private val RBRACE = Tokens.RBRACE.id
    private val ARROW = Tokens.ARROW.id
    private val TILDE = Tokens.TILDE.id
    private val COLON = Tokens.COLON.id
    private val DOUBLECOLON = Tokens.DOUBLECOLON.id
    private val Sharp = Tokens.Sharp.id
    private val ID = Tokens.ID.id
    private val OPID = Tokens.OPID.id
    private val Integer = Tokens.Integer.id
    private val Double = Tokens.Double.id
    private val String = Tokens.String.id
    private val RawString = Tokens.RawString.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class FileContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_file.id
	        set(value) { throw RuntimeException() }
		fun findNamespace() : NamespaceContext? = getRuleContext(solver.getType("NamespaceContext"),0)
		fun findImportEx() : List<ImportExContext> = getRuleContexts(solver.getType("ImportExContext"))
		fun findImportEx(i: Int) : ImportExContext? = getRuleContext(solver.getType("ImportExContext"),i)
		fun findDefinition() : List<DefinitionContext> = getRuleContexts(solver.getType("DefinitionContext"))
		fun findDefinition(i: Int) : DefinitionContext? = getRuleContext(solver.getType("DefinitionContext"),i)
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		fun findAnnotationDef() : List<AnnotationDefContext> = getRuleContexts(solver.getType("AnnotationDefContext"))
		fun findAnnotationDef(i: Int) : AnnotationDefContext? = getRuleContext(solver.getType("AnnotationDefContext"),i)
		fun findNewdata() : List<NewdataContext> = getRuleContexts(solver.getType("NewdataContext"))
		fun findNewdata(i: Int) : NewdataContext? = getRuleContext(solver.getType("NewdataContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  file() : FileContext {
		var _localctx : FileContext = FileContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_file.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 109
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAMESPACE) {
				if (true){
				this.state = 108
				namespace()
				}
			}

			this.state = 114
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPORT) {
				if (true){
				if (true){
				this.state = 111
				importEx()
				}
				}
				this.state = 116
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 123
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ANNOTATION) or (1L shl Class) or (1L shl TEMPLATE) or (1L shl VAR) or (1L shl VAL) or (1L shl INTERFACE) or (1L shl NEWDATA) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 121
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
				1 -> {if (true){
				this.state = 117
				definition()
				}}
				2 -> {if (true){
				this.state = 118
				field()
				}}
				3 -> {if (true){
				this.state = 119
				annotationDef()
				}}
				4 -> {if (true){
				this.state = 120
				newdata()
				}}
				}
				}
				this.state = 125
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ImportExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importEx.id
	        set(value) { throw RuntimeException() }
		fun findImportVanila() : ImportVanilaContext? = getRuleContext(solver.getType("ImportVanilaContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importEx() : ImportExContext {
		var _localctx : ImportExContext = ImportExContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_importEx.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 126
			importVanila()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ImportVanilaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importVanila.id
	        set(value) { throw RuntimeException() }
		fun IMPORT() : TerminalNode? = getToken(FoldingParser.Tokens.IMPORT.id, 0)
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importVanila() : ImportVanilaContext {
		var _localctx : ImportVanilaContext = ImportVanilaContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_importVanila.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 128
			match(IMPORT) as Token
			this.state = 129
			package_()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Package_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_package_.id
	        set(value) { throw RuntimeException() }
		fun ID() : List<TerminalNode> = getTokens(FoldingParser.Tokens.ID.id)
		fun ID(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.ID.id, i) as TerminalNode
		fun DOT() : List<TerminalNode> = getTokens(FoldingParser.Tokens.DOT.id)
		fun DOT(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.DOT.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  package_() : Package_Context {
		var _localctx : Package_Context = Package_Context(context, state)
		enterRule(_localctx, 6, Rules.RULE_package_.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 131
			match(ID) as Token
			this.state = 136
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 132
					match(DOT) as Token
					this.state = 133
					match(ID) as Token
					}
					} 
				}
				this.state = 138
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NamespaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_namespace.id
	        set(value) { throw RuntimeException() }
		fun NAMESPACE() : TerminalNode? = getToken(FoldingParser.Tokens.NAMESPACE.id, 0)
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  namespace() : NamespaceContext {
		var _localctx : NamespaceContext = NamespaceContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_namespace.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 139
			match(NAMESPACE) as Token
			this.state = 140
			package_()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DoBlockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_doBlock.id
	        set(value) { throw RuntimeException() }
		fun DO() : TerminalNode? = getToken(FoldingParser.Tokens.DO.id, 0)
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findCompo() : List<CompoContext> = getRuleContexts(solver.getType("CompoContext"))
		fun findCompo(i: Int) : CompoContext? = getRuleContext(solver.getType("CompoContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  doBlock() : DoBlockContext {
		var _localctx : DoBlockContext = DoBlockContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_doBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 142
			match(DO) as Token
			this.state = 143
			match(LBRACE) as Token
			this.state = 147
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl RETURN) or (1L shl VAR) or (1L shl VAL) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl Sharp) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 144
				compo()
				}
				}
				this.state = 149
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 150
			match(RBRACE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CompoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_compo.id
	        set(value) { throw RuntimeException() }
		fun findField() : FieldContext? = getRuleContext(solver.getType("FieldContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findReturning() : ReturningContext? = getRuleContext(solver.getType("ReturningContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  compo() : CompoContext {
		var _localctx : CompoContext = CompoContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_compo.id)
		try {
			this.state = 155
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAR , VAL , LCOLONSQUARE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 152
			field()
			}}
			DO , LPAREN , LSQUARE , Sharp , ID , OPID , Integer , Double , String  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 153
			value(0)
			}}
			RETURN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 154
			returning()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ReturningContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_returning.id
	        set(value) { throw RuntimeException() }
		fun RETURN() : TerminalNode? = getToken(FoldingParser.Tokens.RETURN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  returning() : ReturningContext {
		var _localctx : ReturningContext = ReturningContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_returning.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 157
			match(RETURN) as Token
			this.state = 158
			value(0)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class StaticBlockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_staticBlock.id
	        set(value) { throw RuntimeException() }
		fun STATIC() : TerminalNode? = getToken(FoldingParser.Tokens.STATIC.id, 0)
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findDefinition() : List<DefinitionContext> = getRuleContexts(solver.getType("DefinitionContext"))
		fun findDefinition(i: Int) : DefinitionContext? = getRuleContext(solver.getType("DefinitionContext"),i)
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  staticBlock() : StaticBlockContext {
		var _localctx : StaticBlockContext = StaticBlockContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_staticBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 160
			match(STATIC) as Token
			this.state = 161
			match(LBRACE) as Token
			this.state = 166
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Class) or (1L shl TEMPLATE) or (1L shl VAR) or (1L shl VAL) or (1L shl INTERFACE) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 164
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,7,context) ) {
				1 -> {if (true){
				this.state = 162
				definition()
				}}
				2 -> {if (true){
				this.state = 163
				field()
				}}
				}
				}
				this.state = 168
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 169
			match(RBRACE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Class_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_class_.id
	        set(value) { throw RuntimeException() }
		fun Class() : TerminalNode? = getToken(FoldingParser.Tokens.Class.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findConstuctor() : ConstuctorContext? = getRuleContext(solver.getType("ConstuctorContext"),0)
		fun findClassBody() : ClassBodyContext? = getRuleContext(solver.getType("ClassBodyContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  class_() : Class_Context {
		var _localctx : Class_Context = Class_Context(context, state)
		enterRule(_localctx, 18, Rules.RULE_class_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 172
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 171
				annotationBlock()
				}
			}

			this.state = 174
			match(Class) as Token
			this.state = 175
			match(ID) as Token
			this.state = 177
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 176
				typeParam()
				}
			}

			this.state = 179
			constuctor()
			this.state = 180
			classBody()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ClassBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_classBody.id
	        set(value) { throw RuntimeException() }
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findConstuctor() : List<ConstuctorContext> = getRuleContexts(solver.getType("ConstuctorContext"))
		fun findConstuctor(i: Int) : ConstuctorContext? = getRuleContext(solver.getType("ConstuctorContext"),i)
		fun findStaticBlock() : StaticBlockContext? = getRuleContext(solver.getType("StaticBlockContext"),0)
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		fun findDef() : List<DefContext> = getRuleContexts(solver.getType("DefContext"))
		fun findDef(i: Int) : DefContext? = getRuleContext(solver.getType("DefContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  classBody() : ClassBodyContext {
		var _localctx : ClassBodyContext = ClassBodyContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_classBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 182
			match(LBRACE) as Token
			this.state = 186
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 183
				constuctor()
				}
				}
				this.state = 188
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 190
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STATIC) {
				if (true){
				this.state = 189
				staticBlock()
				}
			}

			this.state = 196
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl TEMPLATE) or (1L shl VAR) or (1L shl VAL) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 194
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,13,context) ) {
				1 -> {if (true){
				this.state = 192
				field()
				}}
				2 -> {if (true){
				this.state = 193
				def()
				}}
				}
				}
				this.state = 198
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 199
			match(RBRACE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ConstuctorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_constuctor.id
	        set(value) { throw RuntimeException() }
		fun findParameter() : List<ParameterContext> = getRuleContexts(solver.getType("ParameterContext"))
		fun findParameter(i: Int) : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),i)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  constuctor() : ConstuctorContext {
		var _localctx : ConstuctorContext = ConstuctorContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_constuctor.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 202 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 201
				parameter()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 204 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,15,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 208
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 206
				match(ASSGIN) as Token
				this.state = 207
				value(0)
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Interface_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_interface_.id
	        set(value) { throw RuntimeException() }
		fun INTERFACE() : TerminalNode? = getToken(FoldingParser.Tokens.INTERFACE.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findInterfaceBody() : InterfaceBodyContext? = getRuleContext(solver.getType("InterfaceBodyContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  interface_() : Interface_Context {
		var _localctx : Interface_Context = Interface_Context(context, state)
		enterRule(_localctx, 24, Rules.RULE_interface_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 211
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 210
				annotationBlock()
				}
			}

			this.state = 213
			match(INTERFACE) as Token
			this.state = 214
			match(ID) as Token
			this.state = 216
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 215
				typeParam()
				}
			}

			this.state = 224
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 218
				match(TILDE) as Token
				this.state = 220 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 219
					typeEx()
					}
					}
					this.state = 222 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( _la==LPAREN || _la==ID )
				}
			}

			this.state = 226
			interfaceBody()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class InterfaceBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_interfaceBody.id
	        set(value) { throw RuntimeException() }
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findStaticBlock() : StaticBlockContext? = getRuleContext(solver.getType("StaticBlockContext"),0)
		fun findDefInInterface() : List<DefInInterfaceContext> = getRuleContexts(solver.getType("DefInInterfaceContext"))
		fun findDefInInterface(i: Int) : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  interfaceBody() : InterfaceBodyContext {
		var _localctx : InterfaceBodyContext = InterfaceBodyContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_interfaceBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 228
			match(LBRACE) as Token
			this.state = 230
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STATIC) {
				if (true){
				this.state = 229
				staticBlock()
				}
			}

			this.state = 235
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LCOLONSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 232
				defInInterface()
				}
				}
				this.state = 237
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 238
			match(RBRACE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ValInInterfaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_valInInterface.id
	        set(value) { throw RuntimeException() }
		fun VAL() : TerminalNode? = getToken(FoldingParser.Tokens.VAL.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  valInInterface() : ValInInterfaceContext {
		var _localctx : ValInInterfaceContext = ValInInterfaceContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_valInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 240
			match(VAL) as Token
			this.state = 241
			match(ID) as Token
			this.state = 242
			typeEx()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class VarInInterfaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_varInInterface.id
	        set(value) { throw RuntimeException() }
		fun VAR() : TerminalNode? = getToken(FoldingParser.Tokens.VAR.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  varInInterface() : VarInInterfaceContext {
		var _localctx : VarInInterfaceContext = VarInInterfaceContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_varInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 244
			match(VAR) as Token
			this.state = 245
			match(ID) as Token
			this.state = 246
			typeEx()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DefInInterfaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_defInInterface.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun BIGARROW() : TerminalNode? = getToken(FoldingParser.Tokens.BIGARROW.id, 0)
		fun COLON() : TerminalNode? = getToken(FoldingParser.Tokens.COLON.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defInInterface() : DefInInterfaceContext {
		var _localctx : DefInInterfaceContext = DefInInterfaceContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_defInInterface.id)
		var _la: Int
		try {
			this.state = 283
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,32,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 249
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 248
				annotationBlock()
				}
			}

			this.state = 251
			match(ID) as Token
			this.state = 253
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 252
				compiledId()
				}
			}

			this.state = 256
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 255
				typeParam()
				}
			}

			this.state = 259
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 258
				parameter()
				}
			}

			this.state = 261
			match(BIGARROW) as Token
			this.state = 262
			match(COLON) as Token
			this.state = 263
			typeEx()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 265
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 264
				annotationBlock()
				}
			}

			this.state = 267
			match(ID) as Token
			this.state = 269
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 268
				compiledId()
				}
			}

			this.state = 272
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 271
				typeParam()
				}
			}

			this.state = 275
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 274
				parameter()
				}
			}

			this.state = 277
			match(BIGARROW) as Token
			this.state = 280
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 278
				match(COLON) as Token
				this.state = 279
				typeEx()
				}
			}

			this.state = 282
			value(0)
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class NewdataContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_newdata.id
	        set(value) { throw RuntimeException() }
		fun NEWDATA() : TerminalNode? = getToken(FoldingParser.Tokens.NEWDATA.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findLiteral() : List<LiteralContext> = getRuleContexts(solver.getType("LiteralContext"))
		fun findLiteral(i: Int) : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  newdata() : NewdataContext {
		var _localctx : NewdataContext = NewdataContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_newdata.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 286
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 285
				annotationBlock()
				}
			}

			this.state = 288
			match(NEWDATA) as Token
			this.state = 289
			match(ID) as Token
			this.state = 290
			match(LBRACE) as Token
			this.state = 294
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Sharp) {
				if (true){
				if (true){
				this.state = 291
				literal()
				}
				}
				this.state = 296
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 297
			match(RBRACE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypeParamContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeParam.id
	        set(value) { throw RuntimeException() }
		fun findTypeParamCompo() : List<TypeParamCompoContext> = getRuleContexts(solver.getType("TypeParamCompoContext"))
		fun findTypeParamCompo(i: Int) : TypeParamCompoContext? = getRuleContext(solver.getType("TypeParamCompoContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeParam() : TypeParamContext {
		var _localctx : TypeParamContext = TypeParamContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_typeParam.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 300 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 299
				typeParamCompo()
				}
				}
				this.state = 302 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==ID )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypeParamCompoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeParamCompo.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun TILDE() : List<TerminalNode> = getTokens(FoldingParser.Tokens.TILDE.id)
		fun TILDE(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.TILDE.id, i) as TerminalNode
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeParamCompo() : TypeParamCompoContext {
		var _localctx : TypeParamCompoContext = TypeParamCompoContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_typeParamCompo.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 304
			match(ID) as Token
			this.state = 309
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,36,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 305
					match(TILDE) as Token
					this.state = 306
					typeEx()
					}
					} 
				}
				this.state = 311
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,36,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_definition.id
	        set(value) { throw RuntimeException() }
		fun findDef() : DefContext? = getRuleContext(solver.getType("DefContext"),0)
		fun findClass_() : Class_Context? = getRuleContext(solver.getType("Class_Context"),0)
		fun findInterface_() : Interface_Context? = getRuleContext(solver.getType("Interface_Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  definition() : DefinitionContext {
		var _localctx : DefinitionContext = DefinitionContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_definition.id)
		try {
			this.state = 315
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,37,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 312
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 313
			class_()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 314
			interface_()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class FieldContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_field.id
	        set(value) { throw RuntimeException() }
		fun findVal_() : Val_Context? = getRuleContext(solver.getType("Val_Context"),0)
		fun findVar_() : Var_Context? = getRuleContext(solver.getType("Var_Context"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  field() : FieldContext {
		var _localctx : FieldContext = FieldContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_field.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 318
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 317
				annotationBlock()
				}
			}

			this.state = 322
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 320
			val_()
			}}
			VAR  ->  /*LL1AltBlock*/{if (true){
			this.state = 321
			var_()
			}}
			else -> throw NoViableAltException(this)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_value.id
	        set(value) { throw RuntimeException() }
		fun Integer() : TerminalNode? = getToken(FoldingParser.Tokens.Integer.id, 0)
		fun Double() : TerminalNode? = getToken(FoldingParser.Tokens.Double.id, 0)
		fun String() : TerminalNode? = getToken(FoldingParser.Tokens.String.id, 0)
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun DOT() : TerminalNode? = getToken(FoldingParser.Tokens.DOT.id, 0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun findDoBlock() : DoBlockContext? = getRuleContext(solver.getType("DoBlockContext"),0)
		fun findLambda() : LambdaContext? = getRuleContext(solver.getType("LambdaContext"),0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun COLON() : TerminalNode? = getToken(FoldingParser.Tokens.COLON.id, 0)
		fun DOUBLECOLON() : TerminalNode? = getToken(FoldingParser.Tokens.DOUBLECOLON.id, 0)
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		fun findTypeCasting() : TypeCastingContext? = getRuleContext(solver.getType("TypeCastingContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	 fun value() : ValueContext {
		return value(0);
	}

	private fun value(_p: Int) : ValueContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : ValueContext= ValueContext(context, _parentState)
		var _prevctx : ValueContext= _localctx
		var _startState : Int = 44
		enterRecursionRule(_localctx, 44, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 355
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,43,context) ) {
			1 -> {if (true){
			this.state = 325
			match(Integer) as Token
			}}
			2 -> {if (true){
			this.state = 326
			match(Double) as Token
			}}
			3 -> {if (true){
			this.state = 327
			match(String) as Token
			}}
			4 -> {if (true){
			this.state = 328
			literal()
			}}
			5 -> {if (true){
			this.state = 332
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,40,context) ) {
			1   -> if (true){
			this.state = 329
			package_()
			this.state = 330
			match(DOT) as Token
			}
			}
			this.state = 334
			match(ID) as Token
			}}
			6 -> {if (true){
			this.state = 338
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 335
				package_()
				this.state = 336
				match(DOT) as Token
				}
			}

			this.state = 340
			opIdWrap()
			}}
			7 -> {if (true){
			this.state = 344
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 341
				package_()
				this.state = 342
				match(DOT) as Token
				}
			}

			this.state = 346
			aopIdWrap()
			}}
			8 -> {if (true){
			this.state = 347
			match(OPID) as Token
			this.state = 348
			value(7)
			}}
			9 -> {if (true){
			this.state = 349
			doBlock()
			}}
			10 -> {if (true){
			this.state = 350
			lambda()
			}}
			11 -> {if (true){
			this.state = 351
			match(LPAREN) as Token
			this.state = 352
			value(0)
			this.state = 353
			match(RPAREN) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 372
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,45,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 370
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,44,context) ) {
					1 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 357
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 358
					match(OPID) as Token
					this.state = 359
					value(9)
					}}
					2 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 360
					if (!(precpred(context!!, 4))) throw FailedPredicateException(this, "precpred(context!!, 4)")
					this.state = 361
					match(COLON) as Token
					this.state = 362
					value(5)
					}}
					3 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 363
					if (!(precpred(context!!, 3))) throw FailedPredicateException(this, "precpred(context!!, 3)")
					this.state = 364
					match(DOUBLECOLON) as Token
					this.state = 365
					value(4)
					}}
					4 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 366
					if (!(precpred(context!!, 9))) throw FailedPredicateException(this, "precpred(context!!, 9)")
					this.state = 367
					argValue()
					}}
					5 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 368
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 369
					typeCasting()
					}}
					}
					} 
				}
				this.state = 374
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,45,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class TypeCastingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeCasting.id
	        set(value) { throw RuntimeException() }
		fun AS() : TerminalNode? = getToken(FoldingParser.Tokens.AS.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeCasting() : TypeCastingContext {
		var _localctx : TypeCastingContext = TypeCastingContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 375
			match(AS) as Token
			this.state = 376
			typeEx()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ParamExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_paramEx.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun ELLIPSIS() : TerminalNode? = getToken(FoldingParser.Tokens.ELLIPSIS.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramEx() : ParamExContext {
		var _localctx : ParamExContext = ParamExContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_paramEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 379
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 378
				annotationBlock()
				}
			}

			this.state = 381
			match(ID) as Token
			this.state = 382
			typeEx()
			this.state = 384
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 383
				match(ELLIPSIS) as Token
				}
			}

			this.state = 388
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,48,context) ) {
			1   -> if (true){
			this.state = 386
			match(ASSGIN) as Token
			this.state = 387
			value(0)
			}
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ParameterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameter.id
	        set(value) { throw RuntimeException() }
		fun COLON() : TerminalNode? = getToken(FoldingParser.Tokens.COLON.id, 0)
		fun findParamEx() : List<ParamExContext> = getRuleContexts(solver.getType("ParamExContext"))
		fun findParamEx(i: Int) : ParamExContext? = getRuleContext(solver.getType("ParamExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parameter() : ParameterContext {
		var _localctx : ParameterContext = ParameterContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_parameter.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 390
			match(COLON) as Token
			this.state = 394
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,49,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 391
					paramEx()
					}
					} 
				}
				this.state = 396
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,49,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class OpParameterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opParameter.id
	        set(value) { throw RuntimeException() }
		fun COLON() : TerminalNode? = getToken(FoldingParser.Tokens.COLON.id, 0)
		fun findParamEx() : List<ParamExContext> = getRuleContexts(solver.getType("ParamExContext"))
		fun findParamEx(i: Int) : ParamExContext? = getRuleContext(solver.getType("ParamExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  opParameter() : OpParameterContext {
		var _localctx : OpParameterContext = OpParameterContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_opParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 397
			match(COLON) as Token
			this.state = 398
			paramEx()
			this.state = 399
			paramEx()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AopParameterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_aopParameter.id
	        set(value) { throw RuntimeException() }
		fun COLON() : TerminalNode? = getToken(FoldingParser.Tokens.COLON.id, 0)
		fun findParamEx() : ParamExContext? = getRuleContext(solver.getType("ParamExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  aopParameter() : AopParameterContext {
		var _localctx : AopParameterContext = AopParameterContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_aopParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 401
			match(COLON) as Token
			this.state = 402
			paramEx()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ArgExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_argEx.id
	        set(value) { throw RuntimeException() }
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  argEx() : ArgExContext {
		var _localctx : ArgExContext = ArgExContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_argEx.id)
		var _la: Int
		try {
			this.state = 420
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,53,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 406
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,50,context) ) {
			1   -> if (true){
			this.state = 404
			match(ID) as Token
			this.state = 405
			match(ASSGIN) as Token
			}
			}
			this.state = 408
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 410
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 409
				match(ID) as Token
				}
			}

			this.state = 412
			match(LBRACE) as Token
			this.state = 416
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl Sharp) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 413
				value(0)
				}
				}
				this.state = 418
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 419
			match(RBRACE) as Token
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ArgValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_argValue.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findArgEx() : List<ArgExContext> = getRuleContexts(solver.getType("ArgExContext"))
		fun findArgEx(i: Int) : ArgExContext? = getRuleContext(solver.getType("ArgExContext"),i)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  argValue() : ArgValueContext {
		var _localctx : ArgValueContext = ArgValueContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_argValue.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 428
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 422
				match(TILDE) as Token
				this.state = 424 
				errorHandler.sync(this)
				_alt = 1
				do {
					when (_alt) {
					    1 -> if (true){
					if (true){
					this.state = 423
					typeEx()
					}
					}
					else -> throw NoViableAltException(this)
					}
					this.state = 426 
					errorHandler.sync(this)
					_alt = interpreter!!.adaptivePredict(_input!!,54,context)
				} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
				}
			}

			this.state = 430
			match(LPAREN) as Token
			this.state = 434
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl Sharp) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 431
				argEx()
				}
				}
				this.state = 436
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 437
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Val_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_val_.id
	        set(value) { throw RuntimeException() }
		fun findValSetted() : ValSettedContext? = getRuleContext(solver.getType("ValSettedContext"),0)
		fun findValInInterface() : ValInInterfaceContext? = getRuleContext(solver.getType("ValInInterfaceContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  val_() : Val_Context {
		var _localctx : Val_Context = Val_Context(context, state)
		enterRule(_localctx, 60, Rules.RULE_val_.id)
		try {
			this.state = 441
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,57,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 439
			valSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 440
			valInInterface()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Var_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_var_.id
	        set(value) { throw RuntimeException() }
		fun findVarSetted() : VarSettedContext? = getRuleContext(solver.getType("VarSettedContext"),0)
		fun findVarInInterface() : VarInInterfaceContext? = getRuleContext(solver.getType("VarInInterfaceContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  var_() : Var_Context {
		var _localctx : Var_Context = Var_Context(context, state)
		enterRule(_localctx, 62, Rules.RULE_var_.id)
		try {
			this.state = 445
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,58,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 443
			varSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 444
			varInInterface()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ValSettedContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_valSetted.id
	        set(value) { throw RuntimeException() }
		fun VAL() : TerminalNode? = getToken(FoldingParser.Tokens.VAL.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  valSetted() : ValSettedContext {
		var _localctx : ValSettedContext = ValSettedContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_valSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 447
			match(VAL) as Token
			this.state = 448
			match(ID) as Token
			this.state = 450
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 449
				typeEx()
				}
			}

			this.state = 452
			match(ASSGIN) as Token
			this.state = 453
			value(0)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class VarSettedContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_varSetted.id
	        set(value) { throw RuntimeException() }
		fun VAR() : TerminalNode? = getToken(FoldingParser.Tokens.VAR.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  varSetted() : VarSettedContext {
		var _localctx : VarSettedContext = VarSettedContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_varSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 455
			match(VAR) as Token
			this.state = 456
			match(ID) as Token
			this.state = 458
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 457
				typeEx()
				}
			}

			this.state = 460
			match(ASSGIN) as Token
			this.state = 461
			value(0)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_def.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun BIGARROW() : TerminalNode? = getToken(FoldingParser.Tokens.BIGARROW.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun COLON() : TerminalNode? = getToken(FoldingParser.Tokens.COLON.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findOpParameter() : OpParameterContext? = getRuleContext(solver.getType("OpParameterContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findAopParameter() : AopParameterContext? = getRuleContext(solver.getType("AopParameterContext"),0)
		fun findForeign() : ForeignContext? = getRuleContext(solver.getType("ForeignContext"),0)
		fun TEMPLATE() : TerminalNode? = getToken(FoldingParser.Tokens.TEMPLATE.id, 0)
		fun RawString() : TerminalNode? = getToken(FoldingParser.Tokens.RawString.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  def() : DefContext {
		var _localctx : DefContext = DefContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_def.id)
		var _la: Int
		try {
			this.state = 608
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,97,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 464
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 463
				annotationBlock()
				}
			}

			this.state = 466
			match(ID) as Token
			this.state = 468
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 467
				compiledId()
				}
			}

			this.state = 471
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 470
				typeParam()
				}
			}

			this.state = 474
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 473
				parameter()
				}
			}

			this.state = 476
			match(BIGARROW) as Token
			this.state = 479
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 477
				match(COLON) as Token
				this.state = 478
				typeEx()
				}
			}

			this.state = 481
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 483
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 482
				annotationBlock()
				}
			}

			this.state = 485
			opIdWrap()
			this.state = 487
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 486
				compiledId()
				}
			}

			this.state = 490
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 489
				typeParam()
				}
			}

			this.state = 492
			opParameter()
			this.state = 493
			match(BIGARROW) as Token
			this.state = 496
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 494
				match(COLON) as Token
				this.state = 495
				typeEx()
				}
			}

			this.state = 498
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 501
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 500
				annotationBlock()
				}
			}

			this.state = 503
			aopIdWrap()
			this.state = 505
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 504
				compiledId()
				}
			}

			this.state = 508
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 507
				typeParam()
				}
			}

			this.state = 510
			aopParameter()
			this.state = 511
			match(BIGARROW) as Token
			this.state = 514
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 512
				match(COLON) as Token
				this.state = 513
				typeEx()
				}
			}

			this.state = 516
			value(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 519
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 518
				annotationBlock()
				}
			}

			this.state = 521
			match(ID) as Token
			this.state = 523
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 522
				compiledId()
				}
			}

			this.state = 526
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 525
				typeParam()
				}
			}

			this.state = 529
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 528
				parameter()
				}
			}

			this.state = 531
			foreign()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 533
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 532
				annotationBlock()
				}
			}

			this.state = 535
			opIdWrap()
			this.state = 537
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 536
				compiledId()
				}
			}

			this.state = 540
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 539
				typeParam()
				}
			}

			this.state = 542
			opParameter()
			this.state = 543
			foreign()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 546
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 545
				annotationBlock()
				}
			}

			this.state = 548
			aopIdWrap()
			this.state = 550
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 549
				compiledId()
				}
			}

			this.state = 553
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 552
				typeParam()
				}
			}

			this.state = 555
			aopParameter()
			this.state = 556
			foreign()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 559
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 558
				annotationBlock()
				}
			}

			this.state = 561
			match(TEMPLATE) as Token
			this.state = 562
			match(ID) as Token
			this.state = 564
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 563
				compiledId()
				}
			}

			this.state = 567
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 566
				typeParam()
				}
			}

			this.state = 570
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 569
				parameter()
				}
			}

			this.state = 574
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			EXTERNAL , FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 572
			foreign()
			}}
			RawString  ->  /*LL1AltBlock*/{if (true){
			this.state = 573
			match(RawString) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 577
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 576
				annotationBlock()
				}
			}

			this.state = 579
			match(TEMPLATE) as Token
			this.state = 580
			opIdWrap()
			this.state = 582
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 581
				compiledId()
				}
			}

			this.state = 585
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 584
				typeParam()
				}
			}

			this.state = 587
			opParameter()
			this.state = 590
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			EXTERNAL , FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 588
			foreign()
			}}
			RawString  ->  /*LL1AltBlock*/{if (true){
			this.state = 589
			match(RawString) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 593
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 592
				annotationBlock()
				}
			}

			this.state = 595
			match(TEMPLATE) as Token
			this.state = 596
			aopIdWrap()
			this.state = 598
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 597
				compiledId()
				}
			}

			this.state = 601
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 600
				typeParam()
				}
			}

			this.state = 603
			aopParameter()
			this.state = 606
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			EXTERNAL , FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 604
			foreign()
			}}
			RawString  ->  /*LL1AltBlock*/{if (true){
			this.state = 605
			match(RawString) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CompiledIdContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_compiledId.id
	        set(value) { throw RuntimeException() }
		fun findLiteral() : LiteralContext? = getRuleContext(solver.getType("LiteralContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  compiledId() : CompiledIdContext {
		var _localctx : CompiledIdContext = CompiledIdContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_compiledId.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 610
			literal()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LambdaParamExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lambdaParamEx.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun ELLIPSIS() : TerminalNode? = getToken(FoldingParser.Tokens.ELLIPSIS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  lambdaParamEx() : LambdaParamExContext {
		var _localctx : LambdaParamExContext = LambdaParamExContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_lambdaParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 612
			match(ID) as Token
			this.state = 618
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 613
				match(TILDE) as Token
				this.state = 614
				typeEx()
				this.state = 616
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==ELLIPSIS) {
					if (true){
					this.state = 615
					match(ELLIPSIS) as Token
					}
				}

				}
			}

			this.state = 622
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 620
				match(ASSGIN) as Token
				this.state = 621
				value(0)
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LambdaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lambda.id
	        set(value) { throw RuntimeException() }
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun COLON() : TerminalNode? = getToken(FoldingParser.Tokens.COLON.id, 0)
		fun findLambdaParamEx() : List<LambdaParamExContext> = getRuleContexts(solver.getType("LambdaParamExContext"))
		fun findLambdaParamEx(i: Int) : LambdaParamExContext? = getRuleContext(solver.getType("LambdaParamExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  lambda() : LambdaContext {
		var _localctx : LambdaContext = LambdaContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_lambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 624
			match(LSQUARE) as Token
			this.state = 628
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,101,context) ) {
			1   -> if (true){
			this.state = 625
			typeParam()
			this.state = 626
			match(COLON) as Token
			}
			}
			this.state = 633
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 630
				lambdaParamEx()
				}
				}
				this.state = 635
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 636
			match(RSQUARE) as Token
			this.state = 637
			value(0)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class OpIdWrapContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opIdWrap.id
	        set(value) { throw RuntimeException() }
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  opIdWrap() : OpIdWrapContext {
		var _localctx : OpIdWrapContext = OpIdWrapContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_opIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 639
			match(LSQUARE) as Token
			this.state = 640
			match(OPID) as Token
			this.state = 641
			match(RSQUARE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AopIdWrapContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_aopIdWrap.id
	        set(value) { throw RuntimeException() }
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  aopIdWrap() : AopIdWrapContext {
		var _localctx : AopIdWrapContext = AopIdWrapContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_aopIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 643
			match(LSQUARE) as Token
			this.state = 644
			match(TILDE) as Token
			this.state = 645
			match(OPID) as Token
			this.state = 646
			match(RSQUARE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypeExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeEx.id
	        set(value) { throw RuntimeException() }
		fun findTypeExParameter() : TypeExParameterContext? = getRuleContext(solver.getType("TypeExParameterContext"),0)
		fun ARROW() : TerminalNode? = getToken(FoldingParser.Tokens.ARROW.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findTypeExSingle() : TypeExSingleContext? = getRuleContext(solver.getType("TypeExSingleContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeEx() : TypeExContext {
		var _localctx : TypeExContext = TypeExContext(context, state)
		enterRule(_localctx, 80, Rules.RULE_typeEx.id)
		try {
			this.state = 653
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 648
			typeExParameter()
			this.state = 649
			match(ARROW) as Token
			this.state = 650
			typeEx()
			}}
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 652
			typeExSingle()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypeExSingleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeExSingle.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun DOT() : TerminalNode? = getToken(FoldingParser.Tokens.DOT.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeExSingle() : TypeExSingleContext {
		var _localctx : TypeExSingleContext = TypeExSingleContext(context, state)
		enterRule(_localctx, 82, Rules.RULE_typeExSingle.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 658
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,104,context) ) {
			1   -> if (true){
			this.state = 655
			package_()
			this.state = 656
			match(DOT) as Token
			}
			}
			this.state = 660
			match(ID) as Token
			this.state = 669
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,106,context) ) {
			1   -> if (true){
			this.state = 661
			match(LPAREN) as Token
			this.state = 663 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 662
				typeEx()
				}
				}
				this.state = 665 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==LPAREN || _la==ID )
			this.state = 667
			match(RPAREN) as Token
			}
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypeExParamExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeExParamEx.id
	        set(value) { throw RuntimeException() }
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ELLIPSIS() : TerminalNode? = getToken(FoldingParser.Tokens.ELLIPSIS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeExParamEx() : TypeExParamExContext {
		var _localctx : TypeExParamExContext = TypeExParamExContext(context, state)
		enterRule(_localctx, 84, Rules.RULE_typeExParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 671
			typeEx()
			this.state = 673
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 672
				match(ELLIPSIS) as Token
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypeExParameterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeExParameter.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findTypeExParamEx() : List<TypeExParamExContext> = getRuleContexts(solver.getType("TypeExParamExContext"))
		fun findTypeExParamEx(i: Int) : TypeExParamExContext? = getRuleContext(solver.getType("TypeExParamExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeExParameter() : TypeExParameterContext {
		var _localctx : TypeExParameterContext = TypeExParameterContext(context, state)
		enterRule(_localctx, 86, Rules.RULE_typeExParameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 675
			match(LPAREN) as Token
			this.state = 679
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN || _la==ID) {
				if (true){
				if (true){
				this.state = 676
				typeExParamEx()
				}
				}
				this.state = 681
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 682
			match(RPAREN) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ForeignContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_foreign.id
	        set(value) { throw RuntimeException() }
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findForeignBody() : ForeignBodyContext? = getRuleContext(solver.getType("ForeignBodyContext"),0)
		fun EXTERNAL() : TerminalNode? = getToken(FoldingParser.Tokens.EXTERNAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreign() : ForeignContext {
		var _localctx : ForeignContext = ForeignContext(context, state)
		enterRule(_localctx, 88, Rules.RULE_foreign.id)
		try {
			this.state = 690
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 684
			match(FOREIGN) as Token
			this.state = 685
			typeEx()
			this.state = 686
			foreignBody()
			}}
			EXTERNAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 688
			match(EXTERNAL) as Token
			this.state = 689
			typeEx()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ForeignBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_foreignBody.id
	        set(value) { throw RuntimeException() }
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findForeignElement() : List<ForeignElementContext> = getRuleContexts(solver.getType("ForeignElementContext"))
		fun findForeignElement(i: Int) : ForeignElementContext? = getRuleContext(solver.getType("ForeignElementContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignBody() : ForeignBodyContext {
		var _localctx : ForeignBodyContext = ForeignBodyContext(context, state)
		enterRule(_localctx, 90, Rules.RULE_foreignBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 692
			match(LBRACE) as Token
			this.state = 696
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 693
				foreignElement()
				}
				}
				this.state = 698
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 699
			match(RBRACE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ForeignElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_foreignElement.id
	        set(value) { throw RuntimeException() }
		fun findForeignPlatform() : ForeignPlatformContext? = getRuleContext(solver.getType("ForeignPlatformContext"),0)
		fun RawString() : TerminalNode? = getToken(FoldingParser.Tokens.RawString.id, 0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun String() : TerminalNode? = getToken(FoldingParser.Tokens.String.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignElement() : ForeignElementContext {
		var _localctx : ForeignElementContext = ForeignElementContext(context, state)
		enterRule(_localctx, 92, Rules.RULE_foreignElement.id)
		try {
			this.state = 708
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,111,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 701
			foreignPlatform()
			this.state = 702
			match(RawString) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 704
			foreignPlatform()
			this.state = 705
			match(TILDE) as Token
			this.state = 706
			match(String) as Token
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ForeignPlatformContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_foreignPlatform.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignPlatform() : ForeignPlatformContext {
		var _localctx : ForeignPlatformContext = ForeignPlatformContext(context, state)
		enterRule(_localctx, 94, Rules.RULE_foreignPlatform.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 710
			match(ID) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AnnoValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_annoValue.id
	        set(value) { throw RuntimeException() }
		fun Integer() : TerminalNode? = getToken(FoldingParser.Tokens.Integer.id, 0)
		fun Double() : TerminalNode? = getToken(FoldingParser.Tokens.Double.id, 0)
		fun String() : TerminalNode? = getToken(FoldingParser.Tokens.String.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  annoValue() : AnnoValueContext {
		var _localctx : AnnoValueContext = AnnoValueContext(context, state)
		enterRule(_localctx, 96, Rules.RULE_annoValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 712
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AnnoParamContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_annoParam.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  annoParam() : AnnoParamContext {
		var _localctx : AnnoParamContext = AnnoParamContext(context, state)
		enterRule(_localctx, 98, Rules.RULE_annoParam.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 714
			match(ID) as Token
			this.state = 715
			typeEx()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AnnotationDefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_annotationDef.id
	        set(value) { throw RuntimeException() }
		fun ANNOTATION() : TerminalNode? = getToken(FoldingParser.Tokens.ANNOTATION.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findAnnoParam() : List<AnnoParamContext> = getRuleContexts(solver.getType("AnnoParamContext"))
		fun findAnnoParam(i: Int) : AnnoParamContext? = getRuleContext(solver.getType("AnnoParamContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  annotationDef() : AnnotationDefContext {
		var _localctx : AnnotationDefContext = AnnotationDefContext(context, state)
		enterRule(_localctx, 100, Rules.RULE_annotationDef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 717
			match(ANNOTATION) as Token
			this.state = 718
			match(ID) as Token
			this.state = 727
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 719
				match(LPAREN) as Token
				this.state = 723
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==ID) {
					if (true){
					if (true){
					this.state = 720
					annoParam()
					}
					}
					this.state = 725
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				this.state = 726
				match(RPAREN) as Token
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AnnotationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_annotation.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findAnnoValue() : List<AnnoValueContext> = getRuleContexts(solver.getType("AnnoValueContext"))
		fun findAnnoValue(i: Int) : AnnoValueContext? = getRuleContext(solver.getType("AnnoValueContext"),i)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  annotation() : AnnotationContext {
		var _localctx : AnnotationContext = AnnotationContext(context, state)
		enterRule(_localctx, 102, Rules.RULE_annotation.id)
		var _la: Int
		try {
			this.state = 745
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,116,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 729
			match(ID) as Token
			this.state = 733
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 730
				annoValue()
				}
				}
				this.state = 735
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 736
			match(ID) as Token
			this.state = 737
			match(LPAREN) as Token
			this.state = 741
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 738
				annoValue()
				}
				}
				this.state = 743
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 744
			match(RPAREN) as Token
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AnnotationBlockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_annotationBlock.id
	        set(value) { throw RuntimeException() }
		fun LCOLONSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LCOLONSQUARE.id, 0)
		fun RCOLONSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RCOLONSQUARE.id, 0)
		fun findAnnotation() : List<AnnotationContext> = getRuleContexts(solver.getType("AnnotationContext"))
		fun findAnnotation(i: Int) : AnnotationContext? = getRuleContext(solver.getType("AnnotationContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  annotationBlock() : AnnotationBlockContext {
		var _localctx : AnnotationBlockContext = AnnotationBlockContext(context, state)
		enterRule(_localctx, 104, Rules.RULE_annotationBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 747
			match(LCOLONSQUARE) as Token
			this.state = 751
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 748
				annotation()
				}
				}
				this.state = 753
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 754
			match(RCOLONSQUARE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_literal.id
	        set(value) { throw RuntimeException() }
		fun Sharp() : TerminalNode? = getToken(FoldingParser.Tokens.Sharp.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  literal() : LiteralContext {
		var _localctx : LiteralContext = LiteralContext(context, state)
		enterRule(_localctx, 106, Rules.RULE_literal.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 756
			match(Sharp) as Token
			this.state = 757
			match(ID) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		22 -> return value_sempred(_localctx as ValueContext, predIndex)
		}
		return true
	}
	private fun value_sempred( _localctx : ValueContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 8)
		    1 -> return precpred(context!!, 4)
		    2 -> return precpred(context!!, 3)
		    3 -> return precpred(context!!, 9)
		    4 -> return precpred(context!!, 1)
		}
		return true
	}

}