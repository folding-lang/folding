// Generated from java-escape by ANTLR 4.7.1
package foldenx.parser.raw;
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
                                                              FoldingParser.ImportBodyContext::class,
                                                              FoldingParser.ImportElementContext::class,
                                                              FoldingParser.Package_Context::class,
                                                              FoldingParser.NamespaceContext::class,
                                                              FoldingParser.BodyContext::class,
                                                              FoldingParser.CompoContext::class,
                                                              FoldingParser.DefinitionInBodyContext::class,
                                                              FoldingParser.DataContext::class,
                                                              FoldingParser.DataBodyContext::class,
                                                              FoldingParser.DefinitionInDataContext::class,
                                                              FoldingParser.StaticDefinitionContext::class,
                                                              FoldingParser.ConstuctorContext::class,
                                                              FoldingParser.Interface_Context::class,
                                                              FoldingParser.InterfaceBodyContext::class,
                                                              FoldingParser.PropertyInInterfaceContext::class,
                                                              FoldingParser.ValInInterfaceContext::class,
                                                              FoldingParser.VarInInterfaceContext::class,
                                                              FoldingParser.DefInInterfaceContext::class,
                                                              FoldingParser.TypeParamContext::class,
                                                              FoldingParser.TypeParamCompoContext::class,
                                                              FoldingParser.TypeParamTypeClassBoundContext::class,
                                                              FoldingParser.TypeParamOnTypeContext::class,
                                                              FoldingParser.TypeContext::class,
                                                              FoldingParser.TypeDefBodyContext::class,
                                                              FoldingParser.DefInTypeContext::class,
                                                              FoldingParser.ParamExInTypeContext::class,
                                                              FoldingParser.ParameterInTypeContext::class,
                                                              FoldingParser.OpParameterInTypeContext::class,
                                                              FoldingParser.AopParameterInTypeContext::class,
                                                              FoldingParser.ImplContext::class,
                                                              FoldingParser.ImplBodyContext::class,
                                                              FoldingParser.ParamExInImplContext::class,
                                                              FoldingParser.ParameterInImplContext::class,
                                                              FoldingParser.OpParameterInImplContext::class,
                                                              FoldingParser.AopParameterInImplContext::class,
                                                              FoldingParser.DefInImplContext::class,
                                                              FoldingParser.DefinitionContext::class,
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
                                                              FoldingParser.DefContext::class,
                                                              FoldingParser.LambdaParamExContext::class,
                                                              FoldingParser.LambdaContext::class,
                                                              FoldingParser.OpIdWrapContext::class,
                                                              FoldingParser.AopIdWrapContext::class,
                                                              FoldingParser.TypeExContext::class,
                                                              FoldingParser.TypeExSingleContext::class)
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
        DATA(5),
        FOREIGN(6),
        FOLDING(7),
        NAMESPACE(8),
        OVERRIDE(9),
        INTERNAL(10),
        IMPORT(11),
        IMPL(12),
        RETURN(13),
        TYPE(14),
        VAR(15),
        VAL(16),
        DO(17),
        STATIC(18),
        INTERFACE(19),
        ASSGIN(20),
        ELLIPSIS(21),
        DOT(22),
        LPAREN(23),
        RPAREN(24),
        LSQUARE(25),
        RSQUARE(26),
        LBRACE(27),
        RBRACE(28),
        ARROW(29),
        TILDE(30),
        ID(31),
        OPID(32),
        Integer(33),
        Double(34),
        String(35)
    }

    enum class Rules(val id: Int) {
        RULE_file(0),
        RULE_importEx(1),
        RULE_importBody(2),
        RULE_importElement(3),
        RULE_package_(4),
        RULE_namespace(5),
        RULE_body(6),
        RULE_compo(7),
        RULE_definitionInBody(8),
        RULE_data(9),
        RULE_dataBody(10),
        RULE_definitionInData(11),
        RULE_staticDefinition(12),
        RULE_constuctor(13),
        RULE_interface_(14),
        RULE_interfaceBody(15),
        RULE_propertyInInterface(16),
        RULE_valInInterface(17),
        RULE_varInInterface(18),
        RULE_defInInterface(19),
        RULE_typeParam(20),
        RULE_typeParamCompo(21),
        RULE_typeParamTypeClassBound(22),
        RULE_typeParamOnType(23),
        RULE_type(24),
        RULE_typeDefBody(25),
        RULE_defInType(26),
        RULE_paramExInType(27),
        RULE_parameterInType(28),
        RULE_opParameterInType(29),
        RULE_aopParameterInType(30),
        RULE_impl(31),
        RULE_implBody(32),
        RULE_paramExInImpl(33),
        RULE_parameterInImpl(34),
        RULE_opParameterInImpl(35),
        RULE_aopParameterInImpl(36),
        RULE_defInImpl(37),
        RULE_definition(38),
        RULE_value(39),
        RULE_typeCasting(40),
        RULE_paramEx(41),
        RULE_parameter(42),
        RULE_opParameter(43),
        RULE_aopParameter(44),
        RULE_argEx(45),
        RULE_argValue(46),
        RULE_val_(47),
        RULE_var_(48),
        RULE_def(49),
        RULE_lambdaParamEx(50),
        RULE_lambda(51),
        RULE_opIdWrap(52),
        RULE_aopIdWrap(53),
        RULE_typeEx(54),
        RULE_typeExSingle(55)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "importEx", "importBody", "importElement", 
                                "package_", "namespace", "body", "compo", 
                                "definitionInBody", "data", "dataBody", 
                                "definitionInData", "staticDefinition", 
                                "constuctor", "interface_", "interfaceBody", 
                                "propertyInInterface", "valInInterface", 
                                "varInInterface", "defInInterface", "typeParam", 
                                "typeParamCompo", "typeParamTypeClassBound", 
                                "typeParamOnType", "type", "typeDefBody", 
                                "defInType", "paramExInType", "parameterInType", 
                                "opParameterInType", "aopParameterInType", 
                                "impl", "implBody", "paramExInImpl", "parameterInImpl", 
                                "opParameterInImpl", "aopParameterInImpl", 
                                "defInImpl", "definition", "value", "typeCasting", 
                                "paramEx", "parameter", "opParameter", "aopParameter", 
                                "argEx", "argValue", "val_", "var_", "def", 
                                "lambdaParamEx", "lambda", "opIdWrap", "aopIdWrap", 
                                "typeEx", "typeExSingle")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
                                                          null, "'as'", 
                                                          "'data'", "'foreign'", 
                                                          "'folding'", "'namespace'", 
                                                          "'override'", 
                                                          "'internal'", 
                                                          "'import'", "'impl'", 
                                                          "'return'", "'type'", 
                                                          "'var'", "'val'", 
                                                          "'do'", "'static'", 
                                                          "'interface'", 
                                                          "'='", "'...'", 
                                                          "'.'", "'('", 
                                                          "')'", "'['", 
                                                          "']'", "'{'", 
                                                          "'}'", "'->'", 
                                                          "'~'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "WS", "COMMENT", 
                                                           "LINE_COMMENT", 
                                                           "AS", "DATA", 
                                                           "FOREIGN", "FOLDING", 
                                                           "NAMESPACE", 
                                                           "OVERRIDE", "INTERNAL", 
                                                           "IMPORT", "IMPL", 
                                                           "RETURN", "TYPE", 
                                                           "VAR", "VAL", 
                                                           "DO", "STATIC", 
                                                           "INTERFACE", 
                                                           "ASSGIN", "ELLIPSIS", 
                                                           "DOT", "LPAREN", 
                                                           "RPAREN", "LSQUARE", 
                                                           "RSQUARE", "LBRACE", 
                                                           "RBRACE", "ARROW", 
                                                           "TILDE", "ID", 
                                                           "OPID", "Integer", 
                                                           "Double", "String")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0025\u0377\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0003\u0002\u0005\u0002\u0074\u000a\u0002\u0003\u0002\u0007\u0002\u0077\u000a\u0002\u000c\u0002\u000e\u0002\u007a\u000b\u0002\u0003\u0002\u0007\u0002\u007d\u000a\u0002\u000c\u0002\u000e\u0002\u0080\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0085\u000a\u0003\u0003\u0004\u0003\u0004\u0007\u0004\u0089\u000a\u0004\u000c\u0004\u000e\u0004\u008c\u000b\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0093\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0098\u000a\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u009c\u000a\u0005\u0003\u0005\u0005\u0005\u009f\u000a\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0007\u0006\u00a4\u000a\u0006\u000c\u0006\u000e\u0006\u00a7\u000b\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0005\u0008\u00ad\u000a\u0008\u0003\u0008\u0003\u0008\u0007\u0008\u00b1\u000a\u0008\u000c\u0008\u000e\u0008\u00b4\u000b\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0005\u0009\u00ba\u000a\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u00c2\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u00c7\u000a\u000b\u0003\u000b\u0003\u000b\u0006\u000b\u00cb\u000a\u000b\u000d\u000b\u000e\u000b\u00cc\u0005\u000b\u00cf\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0007\u000c\u00d5\u000a\u000c\u000c\u000c\u000e\u000c\u00d8\u000b\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00dc\u000a\u000c\u000c\u000c\u000e\u000c\u00df\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0005\u000d\u00e4\u000a\u000d\u0003\u000d\u0005\u000d\u00e7\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00ed\u000a\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00f5\u000a\u000e\u0003\u000f\u0006\u000f\u00f8\u000a\u000f\u000d\u000f\u000e\u000f\u00f9\u0003\u000f\u0003\u000f\u0005\u000f\u00fe\u000a\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u0103\u000a\u0010\u0003\u0010\u0003\u0010\u0006\u0010\u0107\u000a\u0010\u000d\u0010\u000e\u0010\u0108\u0005\u0010\u010b\u000a\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u0113\u000a\u0011\u000c\u0011\u000e\u0011\u0116\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0005\u0012\u011c\u000a\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0005\u0015\u0127\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u012b\u000a\u0015\u0003\u0015\u0007\u0015\u012e\u000a\u0015\u000c\u0015\u000e\u0015\u0131\u000b\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0135\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0139\u000a\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u013f\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0143\u000a\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0149\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u014d\u000a\u0015\u0003\u0015\u0007\u0015\u0150\u000a\u0015\u000c\u0015\u000e\u0015\u0153\u000b\u0015\u0003\u0015\u0005\u0015\u0156\u000a\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u015b\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u015f\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0163\u000a\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0169\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u016d\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0171\u000a\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0176\u000a\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0006\u0016\u017c\u000a\u0016\u000d\u0016\u000e\u0016\u017d\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0006\u0017\u0184\u000a\u0017\u000d\u0017\u000e\u0017\u0185\u0005\u0017\u0188\u000a\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0006\u0019\u0190\u000a\u0019\u000d\u0019\u000e\u0019\u0191\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0006\u001a\u019b\u000a\u001a\u000d\u001a\u000e\u001a\u019c\u0005\u001a\u019f\u000a\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0007\u001b\u01a5\u000a\u001b\u000c\u001b\u000e\u001b\u01a8\u000b\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0005\u001c\u01ae\u000a\u001c\u0003\u001c\u0007\u001c\u01b1\u000a\u001c\u000c\u001c\u000e\u001c\u01b4\u000b\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01b9\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01c0\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01c5\u000a\u001c\u0003\u001d\u0003\u001d\u0005\u001d\u01c9\u000a\u001d\u0003\u001e\u0003\u001e\u0007\u001e\u01cd\u000a\u001e\u000c\u001e\u000e\u001e\u01d0\u000b\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0007\u0021\u01df\u000a\u0021\u000c\u0021\u000e\u0021\u01e2\u000b\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0007\u0022\u01e9\u000a\u0022\u000c\u0022\u000e\u0022\u01ec\u000b\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u01f3\u000a\u0023\u0003\u0024\u0003\u0024\u0007\u0024\u01f7\u000a\u0024\u000c\u0024\u000e\u0024\u01fa\u000b\u0024\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0027\u0005\u0027\u0208\u000a\u0027\u0003\u0027\u0003\u0027\u0007\u0027\u020c\u000a\u0027\u000c\u0027\u000e\u0027\u020f\u000b\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u0214\u000a\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u021c\u000a\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u0224\u000a\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u0229\u000a\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u022f\u000a\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u0234\u000a\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0005\u0028\u023d\u000a\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u0243\u000a\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u0247\u000a\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u024e\u000a\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u0255\u000a\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u025c\u000a\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u0263\u000a\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u026b\u000a\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u0273\u000a\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u0278\u000a\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u027c\u000a\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u0281\u000a\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u0285\u000a\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u0289\u000a\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u028d\u000a\u0029\u0005\u0029\u028f\u000a\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u029a\u000a\u0029\u0007\u0029\u029c\u000a\u0029\u000c\u0029\u000e\u0029\u029f\u000b\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u02a7\u000a\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u02ab\u000a\u002b\u0003\u002c\u0003\u002c\u0007\u002c\u02af\u000a\u002c\u000c\u002c\u000e\u002c\u02b2\u000b\u002c\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0005\u002f\u02c1\u000a\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0005\u002f\u02c6\u000a\u002f\u0003\u0030\u0003\u0030\u0007\u0030\u02ca\u000a\u0030\u000c\u0030\u000e\u0030\u02cd\u000b\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u02d4\u000a\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0005\u0032\u02dc\u000a\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0033\u0005\u0033\u02e2\u000a\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u02e6\u000a\u0033\u0003\u0033\u0007\u0033\u02e9\u000a\u0033\u000c\u0033\u000e\u0033\u02ec\u000b\u0033\u0003\u0033\u0005\u0033\u02ef\u000a\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u02f4\u000a\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u02f8\u000a\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u02fc\u000a\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u0302\u000a\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u0306\u000a\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u030a\u000a\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u0310\u000a\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u0314\u000a\u0033\u0003\u0033\u0003\u0033\u0007\u0033\u0318\u000a\u0033\u000c\u0033\u000e\u0033\u031b\u000b\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u031f\u000a\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u0323\u000a\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u032a\u000a\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u032e\u000a\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u0334\u000a\u0033\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0005\u0034\u033a\u000a\u0034\u0005\u0034\u033c\u000a\u0034\u0003\u0034\u0003\u0034\u0005\u0034\u0340\u000a\u0034\u0003\u0035\u0003\u0035\u0007\u0035\u0344\u000a\u0035\u000c\u0035\u000e\u0035\u0347\u000b\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0005\u0038\u035d\u000a\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0007\u0038\u0362\u000a\u0038\u000c\u0038\u000e\u0038\u0365\u000b\u0038\u0003\u0039\u0003\u0039\u0003\u0039\u0005\u0039\u036a\u000a\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0006\u0039\u036f\u000a\u0039\u000d\u0039\u000e\u0039\u0370\u0003\u0039\u0003\u0039\u0005\u0039\u0375\u000a\u0039\u0003\u0039\u0002\u0004\u0050\u006e\u003a\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0070\u0002\u0002\u0002\u03ec\u0002\u0073\u0003\u0002\u0002\u0002\u0004\u0081\u0003\u0002\u0002\u0002\u0006\u0086\u0003\u0002\u0002\u0002\u0008\u0092\u0003\u0002\u0002\u0002\u000a\u00a0\u0003\u0002\u0002\u0002\u000c\u00a8\u0003\u0002\u0002\u0002\u000e\u00ac\u0003\u0002\u0002\u0002\u0010\u00b9\u0003\u0002\u0002\u0002\u0012\u00c1\u0003\u0002\u0002\u0002\u0014\u00c3\u0003\u0002\u0002\u0002\u0016\u00d2\u0003\u0002\u0002\u0002\u0018\u00e3\u0003\u0002\u0002\u0002\u001a\u00ee\u0003\u0002\u0002\u0002\u001c\u00f7\u0003\u0002\u0002\u0002\u001e\u00ff\u0003\u0002\u0002\u0002\u0020\u010e\u0003\u0002\u0002\u0002\u0022\u011b\u0003\u0002\u0002\u0002\u0024\u011d\u0003\u0002\u0002\u0002\u0026\u0121\u0003\u0002\u0002\u0002\u0028\u0175\u0003\u0002\u0002\u0002\u002a\u017b\u0003\u0002\u0002\u0002\u002c\u017f\u0003\u0002\u0002\u0002\u002e\u0189\u0003\u0002\u0002\u0002\u0030\u018d\u0003\u0002\u0002\u0002\u0032\u0195\u0003\u0002\u0002\u0002\u0034\u01a2\u0003\u0002\u0002\u0002\u0036\u01c4\u0003\u0002\u0002\u0002\u0038\u01c6\u0003\u0002\u0002\u0002\u003a\u01ca\u0003\u0002\u0002\u0002\u003c\u01d3\u0003\u0002\u0002\u0002\u003e\u01d8\u0003\u0002\u0002\u0002\u0040\u01dc\u0003\u0002\u0002\u0002\u0042\u01e6\u0003\u0002\u0002\u0002\u0044\u01ef\u0003\u0002\u0002\u0002\u0046\u01f4\u0003\u0002\u0002\u0002\u0048\u01fd\u0003\u0002\u0002\u0002\u004a\u0202\u0003\u0002\u0002\u0002\u004c\u0233\u0003\u0002\u0002\u0002\u004e\u023c\u0003\u0002\u0002\u0002\u0050\u028e\u0003\u0002\u0002\u0002\u0052\u02a0\u0003\u0002\u0002\u0002\u0054\u02a3\u0003\u0002\u0002\u0002\u0056\u02ac\u0003\u0002\u0002\u0002\u0058\u02b5\u0003\u0002\u0002\u0002\u005a\u02ba\u0003\u0002\u0002\u0002\u005c\u02c0\u0003\u0002\u0002\u0002\u005e\u02c7\u0003\u0002\u0002\u0002\u0060\u02d0\u0003\u0002\u0002\u0002\u0062\u02d8\u0003\u0002\u0002\u0002\u0064\u0333\u0003\u0002\u0002\u0002\u0066\u0335\u0003\u0002\u0002\u0002\u0068\u0341\u0003\u0002\u0002\u0002\u006a\u034b\u0003\u0002\u0002\u0002\u006c\u034f\u0003\u0002\u0002\u0002\u006e\u035c\u0003\u0002\u0002\u0002\u0070\u0369\u0003\u0002\u0002\u0002\u0072\u0074\u0005\u000c\u0007\u0002\u0073\u0072\u0003\u0002\u0002\u0002\u0073\u0074\u0003\u0002\u0002\u0002\u0074\u0078\u0003\u0002\u0002\u0002\u0075\u0077\u0005\u0004\u0003\u0002\u0076\u0075\u0003\u0002\u0002\u0002\u0077\u007a\u0003\u0002\u0002\u0002\u0078\u0076\u0003\u0002\u0002\u0002\u0078\u0079\u0003\u0002\u0002\u0002\u0079\u007e\u0003\u0002\u0002\u0002\u007a\u0078\u0003\u0002\u0002\u0002\u007b\u007d\u0005\u004e\u0028\u0002\u007c\u007b\u0003\u0002\u0002\u0002\u007d\u0080\u0003\u0002\u0002\u0002\u007e\u007c\u0003\u0002\u0002\u0002\u007e\u007f\u0003\u0002\u0002\u0002\u007f\u0003\u0003\u0002\u0002\u0002\u0080\u007e\u0003\u0002\u0002\u0002\u0081\u0082\u0007\u000d\u0002\u0002\u0082\u0084\u0005\u000a\u0006\u0002\u0083\u0085\u0005\u0006\u0004\u0002\u0084\u0083\u0003\u0002\u0002\u0002\u0084\u0085\u0003\u0002\u0002\u0002\u0085\u0005\u0003\u0002\u0002\u0002\u0086\u008a\u0007\u001d\u0002\u0002\u0087\u0089\u0005\u0008\u0005\u0002\u0088\u0087\u0003\u0002\u0002\u0002\u0089\u008c\u0003\u0002\u0002\u0002\u008a\u0088\u0003\u0002\u0002\u0002\u008a\u008b\u0003\u0002\u0002\u0002\u008b\u008d\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002\u0002\u008d\u008e\u0007\u001e\u0002\u0002\u008e\u0007\u0003\u0002\u0002\u0002\u008f\u0090\u0005\u000a\u0006\u0002\u0090\u0091\u0007\u0018\u0002\u0002\u0091\u0093\u0003\u0002\u0002\u0002\u0092\u008f\u0003\u0002\u0002\u0002\u0092\u0093\u0003\u0002\u0002\u0002\u0093\u0097\u0003\u0002\u0002\u0002\u0094\u0098\u0007\u0021\u0002\u0002\u0095\u0098\u0005\u006a\u0036\u0002\u0096\u0098\u0005\u006c\u0037\u0002\u0097\u0094\u0003\u0002\u0002\u0002\u0097\u0095\u0003\u0002\u0002\u0002\u0097\u0096\u0003\u0002\u0002\u0002\u0098\u009e\u0003\u0002\u0002\u0002\u0099\u009b\u0007\u0008\u0002\u0002\u009a\u009c\u0007\u0009\u0002\u0002\u009b\u009a\u0003\u0002\u0002\u0002\u009b\u009c\u0003\u0002\u0002\u0002\u009c\u009d\u0003\u0002\u0002\u0002\u009d\u009f\u0005\u006e\u0038\u0002\u009e\u0099\u0003\u0002\u0002\u0002\u009e\u009f\u0003\u0002\u0002\u0002\u009f\u0009\u0003\u0002\u0002\u0002\u00a0\u00a5\u0007\u0021\u0002\u0002\u00a1\u00a2\u0007\u0018\u0002\u0002\u00a2\u00a4\u0007\u0021\u0002\u0002\u00a3\u00a1\u0003\u0002\u0002\u0002\u00a4\u00a7\u0003\u0002\u0002\u0002\u00a5\u00a3\u0003\u0002\u0002\u0002\u00a5\u00a6\u0003\u0002\u0002\u0002\u00a6\u000b\u0003\u0002\u0002\u0002\u00a7\u00a5\u0003\u0002\u0002\u0002\u00a8\u00a9\u0007\u000a\u0002\u0002\u00a9\u00aa\u0005\u000a\u0006\u0002\u00aa\u000d\u0003\u0002\u0002\u0002\u00ab\u00ad\u0007\u0013\u0002\u0002\u00ac\u00ab\u0003\u0002\u0002\u0002\u00ac\u00ad\u0003\u0002\u0002\u0002\u00ad\u00ae\u0003\u0002\u0002\u0002\u00ae\u00b2\u0007\u001d\u0002\u0002\u00af\u00b1\u0005\u0010\u0009\u0002\u00b0\u00af\u0003\u0002\u0002\u0002\u00b1\u00b4\u0003\u0002\u0002\u0002\u00b2\u00b0\u0003\u0002\u0002\u0002\u00b2\u00b3\u0003\u0002\u0002\u0002\u00b3\u00b5\u0003\u0002\u0002\u0002\u00b4\u00b2\u0003\u0002\u0002\u0002\u00b5\u00b6\u0007\u001e\u0002\u0002\u00b6\u000f\u0003\u0002\u0002\u0002\u00b7\u00ba\u0005\u0012\u000a\u0002\u00b8\u00ba\u0005\u0050\u0029\u0002\u00b9\u00b7\u0003\u0002\u0002\u0002\u00b9\u00b8\u0003\u0002\u0002\u0002\u00ba\u0011\u0003\u0002\u0002\u0002\u00bb\u00c2\u0005\u0064\u0033\u0002\u00bc\u00c2\u0005\u0062\u0032\u0002\u00bd\u00c2\u0005\u0060\u0031\u0002\u00be\u00c2\u0005\u0040\u0021\u0002\u00bf\u00c2\u0005\u0014\u000b\u0002\u00c0\u00c2\u0005\u001e\u0010\u0002\u00c1\u00bb\u0003\u0002\u0002\u0002\u00c1\u00bc\u0003\u0002\u0002\u0002\u00c1\u00bd\u0003\u0002\u0002\u0002\u00c1\u00be\u0003\u0002\u0002\u0002\u00c1\u00bf\u0003\u0002\u0002\u0002\u00c1\u00c0\u0003\u0002\u0002\u0002\u00c2\u0013\u0003\u0002\u0002\u0002\u00c3\u00c4\u0007\u0007\u0002\u0002\u00c4\u00c6\u0007\u0021\u0002\u0002\u00c5\u00c7\u0005\u002a\u0016\u0002\u00c6\u00c5\u0003\u0002\u0002\u0002\u00c6\u00c7\u0003\u0002\u0002\u0002\u00c7\u00ce\u0003\u0002\u0002\u0002\u00c8\u00ca\u0007\u0020\u0002\u0002\u00c9\u00cb\u0005\u006e\u0038\u0002\u00ca\u00c9\u0003\u0002\u0002\u0002\u00cb\u00cc\u0003\u0002\u0002\u0002\u00cc\u00ca\u0003\u0002\u0002\u0002\u00cc\u00cd\u0003\u0002\u0002\u0002\u00cd\u00cf\u0003\u0002\u0002\u0002\u00ce\u00c8\u0003\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00cf\u00d0\u0003\u0002\u0002\u0002\u00d0\u00d1\u0005\u0016\u000c\u0002\u00d1\u0015\u0003\u0002\u0002\u0002\u00d2\u00d6\u0007\u001d\u0002\u0002\u00d3\u00d5\u0005\u001c\u000f\u0002\u00d4\u00d3\u0003\u0002\u0002\u0002\u00d5\u00d8\u0003\u0002\u0002\u0002\u00d6\u00d4\u0003\u0002\u0002\u0002\u00d6\u00d7\u0003\u0002\u0002\u0002\u00d7\u00dd\u0003\u0002\u0002\u0002\u00d8\u00d6\u0003\u0002\u0002\u0002\u00d9\u00dc\u0005\u0018\u000d\u0002\u00da\u00dc\u0005\u001a\u000e\u0002\u00db\u00d9\u0003\u0002\u0002\u0002\u00db\u00da\u0003\u0002\u0002\u0002\u00dc\u00df\u0003\u0002\u0002\u0002\u00dd\u00db\u0003\u0002\u0002\u0002\u00dd\u00de\u0003\u0002\u0002\u0002\u00de\u00e0\u0003\u0002\u0002\u0002\u00df\u00dd\u0003\u0002\u0002\u0002\u00e0\u00e1\u0007\u001e\u0002\u0002\u00e1\u0017\u0003\u0002\u0002\u0002\u00e2\u00e4\u0007\u000c\u0002\u0002\u00e3\u00e2\u0003\u0002\u0002\u0002\u00e3\u00e4\u0003\u0002\u0002\u0002\u00e4\u00e6\u0003\u0002\u0002\u0002\u00e5\u00e7\u0007\u000b\u0002\u0002\u00e6\u00e5\u0003\u0002\u0002\u0002\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u00ec\u0003\u0002\u0002\u0002\u00e8\u00ed\u0005\u0060\u0031\u0002\u00e9\u00ed\u0005\u0062\u0032\u0002\u00ea\u00ed\u0005\u0064\u0033\u0002\u00eb\u00ed\u0005\u0040\u0021\u0002\u00ec\u00e8\u0003\u0002\u0002\u0002\u00ec\u00e9\u0003\u0002\u0002\u0002\u00ec\u00ea\u0003\u0002\u0002\u0002\u00ec\u00eb\u0003\u0002\u0002\u0002\u00ed\u0019\u0003\u0002\u0002\u0002\u00ee\u00f4\u0007\u0014\u0002\u0002\u00ef\u00f5\u0005\u0060\u0031\u0002\u00f0\u00f5\u0005\u0062\u0032\u0002\u00f1\u00f5\u0005\u0064\u0033\u0002\u00f2\u00f5\u0005\u0014\u000b\u0002\u00f3\u00f5\u0005\u001e\u0010\u0002\u00f4\u00ef\u0003\u0002\u0002\u0002\u00f4\u00f0\u0003\u0002\u0002\u0002\u00f4\u00f1\u0003\u0002\u0002\u0002\u00f4\u00f2\u0003\u0002\u0002\u0002\u00f4\u00f3\u0003\u0002\u0002\u0002\u00f5\u001b\u0003\u0002\u0002\u0002\u00f6\u00f8\u0005\u0056\u002c\u0002\u00f7\u00f6\u0003\u0002\u0002\u0002\u00f8\u00f9\u0003\u0002\u0002\u0002\u00f9\u00f7\u0003\u0002\u0002\u0002\u00f9\u00fa\u0003\u0002\u0002\u0002\u00fa\u00fd\u0003\u0002\u0002\u0002\u00fb\u00fc\u0007\u0016\u0002\u0002\u00fc\u00fe\u0005\u0050\u0029\u0002\u00fd\u00fb\u0003\u0002\u0002\u0002\u00fd\u00fe\u0003\u0002\u0002\u0002\u00fe\u001d\u0003\u0002\u0002\u0002\u00ff\u0100\u0007\u0015\u0002\u0002\u0100\u0102\u0007\u0021\u0002\u0002\u0101\u0103\u0005\u002a\u0016\u0002\u0102\u0101\u0003\u0002\u0002\u0002\u0102\u0103\u0003\u0002\u0002\u0002\u0103\u010a\u0003\u0002\u0002\u0002\u0104\u0106\u0007\u0020\u0002\u0002\u0105\u0107\u0005\u006e\u0038\u0002\u0106\u0105\u0003\u0002\u0002\u0002\u0107\u0108\u0003\u0002\u0002\u0002\u0108\u0106\u0003\u0002\u0002\u0002\u0108\u0109\u0003\u0002\u0002\u0002\u0109\u010b\u0003\u0002\u0002\u0002\u010a\u0104\u0003\u0002\u0002\u0002\u010a\u010b\u0003\u0002\u0002\u0002\u010b\u010c\u0003\u0002\u0002\u0002\u010c\u010d\u0005\u0020\u0011\u0002\u010d\u001f\u0003\u0002\u0002\u0002\u010e\u0114\u0007\u001d\u0002\u0002\u010f\u0113\u0005\u0028\u0015\u0002\u0110\u0113\u0005\u0022\u0012\u0002\u0111\u0113\u0005\u001a\u000e\u0002\u0112\u010f\u0003\u0002\u0002\u0002\u0112\u0110\u0003\u0002\u0002\u0002\u0112\u0111\u0003\u0002\u0002\u0002\u0113\u0116\u0003\u0002\u0002\u0002\u0114\u0112\u0003\u0002\u0002\u0002\u0114\u0115\u0003\u0002\u0002\u0002\u0115\u0117\u0003\u0002\u0002\u0002\u0116\u0114\u0003\u0002\u0002\u0002\u0117\u0118\u0007\u001e\u0002\u0002\u0118\u0021\u0003\u0002\u0002\u0002\u0119\u011c\u0005\u0024\u0013\u0002\u011a\u011c\u0005\u0026\u0014\u0002\u011b\u0119\u0003\u0002\u0002\u0002\u011b\u011a\u0003\u0002\u0002\u0002\u011c\u0023\u0003\u0002\u0002\u0002\u011d\u011e\u0007\u0012\u0002\u0002\u011e\u011f\u0007\u0021\u0002\u0002\u011f\u0120\u0005\u006e\u0038\u0002\u0120\u0025\u0003\u0002\u0002\u0002\u0121\u0122\u0007\u0011\u0002\u0002\u0122\u0123\u0007\u0021\u0002\u0002\u0123\u0124\u0005\u006e\u0038\u0002\u0124\u0027\u0003\u0002\u0002\u0002\u0125\u0127\u0007\u0009\u0002\u0002\u0126\u0125\u0003\u0002\u0002\u0002\u0126\u0127\u0003\u0002\u0002\u0002\u0127\u0128\u0003\u0002\u0002\u0002\u0128\u012a\u0007\u0021\u0002\u0002\u0129\u012b\u0005\u002a\u0016\u0002\u012a\u0129\u0003\u0002\u0002\u0002\u012a\u012b\u0003\u0002\u0002\u0002\u012b\u012f\u0003\u0002\u0002\u0002\u012c\u012e\u0005\u0056\u002c\u0002\u012d\u012c\u0003\u0002\u0002\u0002\u012e\u0131\u0003\u0002\u0002\u0002\u012f\u012d\u0003\u0002\u0002\u0002\u012f\u0130\u0003\u0002\u0002\u0002\u0130\u0132\u0003\u0002\u0002\u0002\u0131\u012f\u0003\u0002\u0002\u0002\u0132\u0176\u0005\u006e\u0038\u0002\u0133\u0135\u0007\u0009\u0002\u0002\u0134\u0133\u0003\u0002\u0002\u0002\u0134\u0135\u0003\u0002\u0002\u0002\u0135\u0136\u0003\u0002\u0002\u0002\u0136\u0138\u0005\u006a\u0036\u0002\u0137\u0139\u0005\u002a\u0016\u0002\u0138\u0137\u0003\u0002\u0002\u0002\u0138\u0139\u0003\u0002\u0002\u0002\u0139\u013a\u0003\u0002\u0002\u0002\u013a\u013b\u0005\u0058\u002d\u0002\u013b\u013c\u0005\u006e\u0038\u0002\u013c\u0176\u0003\u0002\u0002\u0002\u013d\u013f\u0007\u0009\u0002\u0002\u013e\u013d\u0003\u0002\u0002\u0002\u013e\u013f\u0003\u0002\u0002\u0002\u013f\u0140\u0003\u0002\u0002\u0002\u0140\u0142\u0005\u006c\u0037\u0002\u0141\u0143\u0005\u002a\u0016\u0002\u0142\u0141\u0003\u0002\u0002\u0002\u0142\u0143\u0003\u0002\u0002\u0002\u0143\u0144\u0003\u0002\u0002\u0002\u0144\u0145\u0005\u005a\u002e\u0002\u0145\u0146\u0005\u006e\u0038\u0002\u0146\u0176\u0003\u0002\u0002\u0002\u0147\u0149\u0007\u0009\u0002\u0002\u0148\u0147\u0003\u0002\u0002\u0002\u0148\u0149\u0003\u0002\u0002\u0002\u0149\u014a\u0003\u0002\u0002\u0002\u014a\u014c\u0007\u0021\u0002\u0002\u014b\u014d\u0005\u002a\u0016\u0002\u014c\u014b\u0003\u0002\u0002\u0002\u014c\u014d\u0003\u0002\u0002\u0002\u014d\u0151\u0003\u0002\u0002\u0002\u014e\u0150\u0005\u0056\u002c\u0002\u014f\u014e\u0003\u0002\u0002\u0002\u0150\u0153\u0003\u0002\u0002\u0002\u0151\u014f\u0003\u0002\u0002\u0002\u0151\u0152\u0003\u0002\u0002\u0002\u0152\u0155\u0003\u0002\u0002\u0002\u0153\u0151\u0003\u0002\u0002\u0002\u0154\u0156\u0005\u006e\u0038\u0002\u0155\u0154\u0003\u0002\u0002\u0002\u0155\u0156\u0003\u0002\u0002\u0002\u0156\u0157\u0003\u0002\u0002\u0002\u0157\u0158\u0007\u0016\u0002\u0002\u0158\u0176\u0005\u0050\u0029\u0002\u0159\u015b\u0007\u0009\u0002\u0002\u015a\u0159\u0003\u0002\u0002\u0002\u015a\u015b\u0003\u0002\u0002\u0002\u015b\u015c\u0003\u0002\u0002\u0002\u015c\u015e\u0005\u006a\u0036\u0002\u015d\u015f\u0005\u002a\u0016\u0002\u015e\u015d\u0003\u0002\u0002\u0002\u015e\u015f\u0003\u0002\u0002\u0002\u015f\u0160\u0003\u0002\u0002\u0002\u0160\u0162\u0005\u0058\u002d\u0002\u0161\u0163\u0005\u006e\u0038\u0002\u0162\u0161\u0003\u0002\u0002\u0002\u0162\u0163\u0003\u0002\u0002\u0002\u0163\u0164\u0003\u0002\u0002\u0002\u0164\u0165\u0007\u0016\u0002\u0002\u0165\u0166\u0005\u0050\u0029\u0002\u0166\u0176\u0003\u0002\u0002\u0002\u0167\u0169\u0007\u0009\u0002\u0002\u0168\u0167\u0003\u0002\u0002\u0002\u0168\u0169\u0003\u0002\u0002\u0002\u0169\u016a\u0003\u0002\u0002\u0002\u016a\u016c\u0005\u006c\u0037\u0002\u016b\u016d\u0005\u002a\u0016\u0002\u016c\u016b\u0003\u0002\u0002\u0002\u016c\u016d\u0003\u0002\u0002\u0002\u016d\u016e\u0003\u0002\u0002\u0002\u016e\u0170\u0005\u005a\u002e\u0002\u016f\u0171\u0005\u006e\u0038\u0002\u0170\u016f\u0003\u0002\u0002\u0002\u0170\u0171\u0003\u0002\u0002\u0002\u0171\u0172\u0003\u0002\u0002\u0002\u0172\u0173\u0007\u0016\u0002\u0002\u0173\u0174\u0005\u0050\u0029\u0002\u0174\u0176\u0003\u0002\u0002\u0002\u0175\u0126\u0003\u0002\u0002\u0002\u0175\u0134\u0003\u0002\u0002\u0002\u0175\u013e\u0003\u0002\u0002\u0002\u0175\u0148\u0003\u0002\u0002\u0002\u0175\u015a\u0003\u0002\u0002\u0002\u0175\u0168\u0003\u0002\u0002\u0002\u0176\u0029\u0003\u0002\u0002\u0002\u0177\u0178\u0007\u001b\u0002\u0002\u0178\u0179\u0005\u002c\u0017\u0002\u0179\u017a\u0007\u001c\u0002\u0002\u017a\u017c\u0003\u0002\u0002\u0002\u017b\u0177\u0003\u0002\u0002\u0002\u017c\u017d\u0003\u0002\u0002\u0002\u017d\u017b\u0003\u0002\u0002\u0002\u017d\u017e\u0003\u0002\u0002\u0002\u017e\u002b\u0003\u0002\u0002\u0002\u017f\u0187\u0007\u0021\u0002\u0002\u0180\u0183\u0007\u0020\u0002\u0002\u0181\u0184\u0005\u006e\u0038\u0002\u0182\u0184\u0005\u002e\u0018\u0002\u0183\u0181\u0003\u0002\u0002\u0002\u0183\u0182\u0003\u0002\u0002\u0002\u0184\u0185\u0003\u0002\u0002\u0002\u0185\u0183\u0003\u0002\u0002\u0002\u0185\u0186\u0003\u0002\u0002\u0002\u0186\u0188\u0003\u0002\u0002\u0002\u0187\u0180\u0003\u0002\u0002\u0002\u0187\u0188\u0003\u0002\u0002\u0002\u0188\u002d\u0003\u0002\u0002\u0002\u0189\u018a\u0007\u001b\u0002\u0002\u018a\u018b\u0005\u006e\u0038\u0002\u018b\u018c\u0007\u001c\u0002\u0002\u018c\u002f\u0003\u0002\u0002\u0002\u018d\u018f\u0007\u0019\u0002\u0002\u018e\u0190\u0007\u0021\u0002\u0002\u018f\u018e\u0003\u0002\u0002\u0002\u0190\u0191\u0003\u0002\u0002\u0002\u0191\u018f\u0003\u0002\u0002\u0002\u0191\u0192\u0003\u0002\u0002\u0002\u0192\u0193\u0003\u0002\u0002\u0002\u0193\u0194\u0007\u001a\u0002\u0002\u0194\u0031\u0003\u0002\u0002\u0002\u0195\u0196\u0007\u0010\u0002\u0002\u0196\u0197\u0007\u0021\u0002\u0002\u0197\u019e\u0005\u0030\u0019\u0002\u0198\u019a\u0007\u0020\u0002\u0002\u0199\u019b\u0005\u006e\u0038\u0002\u019a\u0199\u0003\u0002\u0002\u0002\u019b\u019c\u0003\u0002\u0002\u0002\u019c\u019a\u0003\u0002\u0002\u0002\u019c\u019d\u0003\u0002\u0002\u0002\u019d\u019f\u0003\u0002\u0002\u0002\u019e\u0198\u0003\u0002\u0002\u0002\u019e\u019f\u0003\u0002\u0002\u0002\u019f\u01a0\u0003\u0002\u0002\u0002\u01a0\u01a1\u0005\u0034\u001b\u0002\u01a1\u0033\u0003\u0002\u0002\u0002\u01a2\u01a6\u0007\u001d\u0002\u0002\u01a3\u01a5\u0005\u0036\u001c\u0002\u01a4\u01a3\u0003\u0002\u0002\u0002\u01a5\u01a8\u0003\u0002\u0002\u0002\u01a6\u01a4\u0003\u0002\u0002\u0002\u01a6\u01a7\u0003\u0002\u0002\u0002\u01a7\u01a9\u0003\u0002\u0002\u0002\u01a8\u01a6\u0003\u0002\u0002\u0002\u01a9\u01aa\u0007\u001e\u0002\u0002\u01aa\u0035\u0003\u0002\u0002\u0002\u01ab\u01ad\u0007\u0021\u0002\u0002\u01ac\u01ae\u0005\u002a\u0016\u0002\u01ad\u01ac\u0003\u0002\u0002\u0002\u01ad\u01ae\u0003\u0002\u0002\u0002\u01ae\u01b2\u0003\u0002\u0002\u0002\u01af\u01b1\u0005\u003a\u001e\u0002\u01b0\u01af\u0003\u0002\u0002\u0002\u01b1\u01b4\u0003\u0002\u0002\u0002\u01b2\u01b0\u0003\u0002\u0002\u0002\u01b2\u01b3\u0003\u0002\u0002\u0002\u01b3\u01b5\u0003\u0002\u0002\u0002\u01b4\u01b2\u0003\u0002\u0002\u0002\u01b5\u01c5\u0005\u006e\u0038\u0002\u01b6\u01b8\u0005\u006a\u0036\u0002\u01b7\u01b9\u0005\u002a\u0016\u0002\u01b8\u01b7\u0003\u0002\u0002\u0002\u01b8\u01b9\u0003\u0002\u0002\u0002\u01b9\u01ba\u0003\u0002\u0002\u0002\u01ba\u01bb\u0005\u003c\u001f\u0002\u01bb\u01bc\u0005\u006e\u0038\u0002\u01bc\u01c5\u0003\u0002\u0002\u0002\u01bd\u01bf\u0005\u006c\u0037\u0002\u01be\u01c0\u0005\u002a\u0016\u0002\u01bf\u01be\u0003\u0002\u0002\u0002\u01bf\u01c0\u0003\u0002\u0002\u0002\u01c0\u01c1\u0003\u0002\u0002\u0002\u01c1\u01c2\u0005\u003e\u0020\u0002\u01c2\u01c3\u0005\u006e\u0038\u0002\u01c3\u01c5\u0003\u0002\u0002\u0002\u01c4\u01ab\u0003\u0002\u0002\u0002\u01c4\u01b6\u0003\u0002\u0002\u0002\u01c4\u01bd\u0003\u0002\u0002\u0002\u01c5\u0037\u0003\u0002\u0002\u0002\u01c6\u01c8\u0005\u006e\u0038\u0002\u01c7\u01c9\u0007\u0017\u0002\u0002\u01c8\u01c7\u0003\u0002\u0002\u0002\u01c8\u01c9\u0003\u0002\u0002\u0002\u01c9\u0039\u0003\u0002\u0002\u0002\u01ca\u01ce\u0007\u0019\u0002\u0002\u01cb\u01cd\u0005\u0038\u001d\u0002\u01cc\u01cb\u0003\u0002\u0002\u0002\u01cd\u01d0\u0003\u0002\u0002\u0002\u01ce\u01cc\u0003\u0002\u0002\u0002\u01ce\u01cf\u0003\u0002\u0002\u0002\u01cf\u01d1\u0003\u0002\u0002\u0002\u01d0\u01ce\u0003\u0002\u0002\u0002\u01d1\u01d2\u0007\u001a\u0002\u0002\u01d2\u003b\u0003\u0002\u0002\u0002\u01d3\u01d4\u0007\u0019\u0002\u0002\u01d4\u01d5\u0005\u0038\u001d\u0002\u01d5\u01d6\u0005\u0038\u001d\u0002\u01d6\u01d7\u0007\u001a\u0002\u0002\u01d7\u003d\u0003\u0002\u0002\u0002\u01d8\u01d9\u0007\u0019\u0002\u0002\u01d9\u01da\u0005\u0038\u001d\u0002\u01da\u01db\u0007\u001a\u0002\u0002\u01db\u003f\u0003\u0002\u0002\u0002\u01dc\u01e0\u0007\u000e\u0002\u0002\u01dd\u01df\u0005\u002a\u0016\u0002\u01de\u01dd\u0003\u0002\u0002\u0002\u01df\u01e2\u0003\u0002\u0002\u0002\u01e0\u01de\u0003\u0002\u0002\u0002\u01e0\u01e1\u0003\u0002\u0002\u0002\u01e1\u01e3\u0003\u0002\u0002\u0002\u01e2\u01e0\u0003\u0002\u0002\u0002\u01e3\u01e4\u0005\u006e\u0038\u0002\u01e4\u01e5\u0005\u0042\u0022\u0002\u01e5\u0041\u0003\u0002\u0002\u0002\u01e6\u01ea\u0007\u001d\u0002\u0002\u01e7\u01e9\u0005\u004c\u0027\u0002\u01e8\u01e7\u0003\u0002\u0002\u0002\u01e9\u01ec\u0003\u0002\u0002\u0002\u01ea\u01e8\u0003\u0002\u0002\u0002\u01ea\u01eb\u0003\u0002\u0002\u0002\u01eb\u01ed\u0003\u0002\u0002\u0002\u01ec\u01ea\u0003\u0002\u0002\u0002\u01ed\u01ee\u0007\u001e\u0002\u0002\u01ee\u0043\u0003\u0002\u0002\u0002\u01ef\u01f2\u0007\u0021\u0002\u0002\u01f0\u01f1\u0007\u0016\u0002\u0002\u01f1\u01f3\u0005\u0050\u0029\u0002\u01f2\u01f0\u0003\u0002\u0002\u0002\u01f2\u01f3\u0003\u0002\u0002\u0002\u01f3\u0045\u0003\u0002\u0002\u0002\u01f4\u01f8\u0007\u0019\u0002\u0002\u01f5\u01f7\u0005\u0044\u0023\u0002\u01f6\u01f5\u0003\u0002\u0002\u0002\u01f7\u01fa\u0003\u0002\u0002\u0002\u01f8\u01f6\u0003\u0002\u0002\u0002\u01f8\u01f9\u0003\u0002\u0002\u0002\u01f9\u01fb\u0003\u0002\u0002\u0002\u01fa\u01f8\u0003\u0002\u0002\u0002\u01fb\u01fc\u0007\u001a\u0002\u0002\u01fc\u0047\u0003\u0002\u0002\u0002\u01fd\u01fe\u0007\u0019\u0002\u0002\u01fe\u01ff\u0005\u0044\u0023\u0002\u01ff\u0200\u0005\u0044\u0023\u0002\u0200\u0201\u0007\u001a\u0002\u0002\u0201\u0049\u0003\u0002\u0002\u0002\u0202\u0203\u0007\u0019\u0002\u0002\u0203\u0204\u0005\u0044\u0023\u0002\u0204\u0205\u0007\u001a\u0002\u0002\u0205\u004b\u0003\u0002\u0002\u0002\u0206\u0208\u0007\u0009\u0002\u0002\u0207\u0206\u0003\u0002\u0002\u0002\u0207\u0208\u0003\u0002\u0002\u0002\u0208\u0209\u0003\u0002\u0002\u0002\u0209\u020d\u0007\u0021\u0002\u0002\u020a\u020c\u0005\u0046\u0024\u0002\u020b\u020a\u0003\u0002\u0002\u0002\u020c\u020f\u0003\u0002\u0002\u0002\u020d\u020b\u0003\u0002\u0002\u0002\u020d\u020e\u0003\u0002\u0002\u0002\u020e\u0210\u0003\u0002\u0002\u0002\u020f\u020d\u0003\u0002\u0002\u0002\u0210\u0211\u0007\u0016\u0002\u0002\u0211\u0234\u0005\u0050\u0029\u0002\u0212\u0214\u0007\u0009\u0002\u0002\u0213\u0212\u0003\u0002\u0002\u0002\u0213\u0214\u0003\u0002\u0002\u0002\u0214\u0215\u0003\u0002\u0002\u0002\u0215\u0216\u0005\u006a\u0036\u0002\u0216\u0217\u0005\u0048\u0025\u0002\u0217\u0218\u0007\u0016\u0002\u0002\u0218\u0219\u0005\u0050\u0029\u0002\u0219\u0234\u0003\u0002\u0002\u0002\u021a\u021c\u0007\u0009\u0002\u0002\u021b\u021a\u0003\u0002\u0002\u0002\u021b\u021c\u0003\u0002\u0002\u0002\u021c\u021d\u0003\u0002\u0002\u0002\u021d\u021e\u0005\u006c\u0037\u0002\u021e\u021f\u0005\u004a\u0026\u0002\u021f\u0220\u0007\u0016\u0002\u0002\u0220\u0221\u0005\u0050\u0029\u0002\u0221\u0234\u0003\u0002\u0002\u0002\u0222\u0224\u0007\u0009\u0002\u0002\u0223\u0222\u0003\u0002\u0002\u0002\u0223\u0224\u0003\u0002\u0002\u0002\u0224\u0225\u0003\u0002\u0002\u0002\u0225\u0226\u0007\u0021\u0002\u0002\u0226\u0234\u0007\u0008\u0002\u0002\u0227\u0229\u0007\u0009\u0002\u0002\u0228\u0227\u0003\u0002\u0002\u0002\u0228\u0229\u0003\u0002\u0002\u0002\u0229\u022a\u0003\u0002\u0002\u0002\u022a\u022b\u0005\u006a\u0036\u0002\u022b\u022c\u0007\u0008\u0002\u0002\u022c\u0234\u0003\u0002\u0002\u0002\u022d\u022f\u0007\u0009\u0002\u0002\u022e\u022d\u0003\u0002\u0002\u0002\u022e\u022f\u0003\u0002\u0002\u0002\u022f\u0230\u0003\u0002\u0002\u0002\u0230\u0231\u0005\u006c\u0037\u0002\u0231\u0232\u0007\u0008\u0002\u0002\u0232\u0234\u0003\u0002\u0002\u0002\u0233\u0207\u0003\u0002\u0002\u0002\u0233\u0213\u0003\u0002\u0002\u0002\u0233\u021b\u0003\u0002\u0002\u0002\u0233\u0223\u0003\u0002\u0002\u0002\u0233\u0228\u0003\u0002\u0002\u0002\u0233\u022e\u0003\u0002\u0002\u0002\u0234\u004d\u0003\u0002\u0002\u0002\u0235\u023d\u0005\u0064\u0033\u0002\u0236\u023d\u0005\u0060\u0031\u0002\u0237\u023d\u0005\u0062\u0032\u0002\u0238\u023d\u0005\u0032\u001a\u0002\u0239\u023d\u0005\u0040\u0021\u0002\u023a\u023d\u0005\u0014\u000b\u0002\u023b\u023d\u0005\u001e\u0010\u0002\u023c\u0235\u0003\u0002\u0002\u0002\u023c\u0236\u0003\u0002\u0002\u0002\u023c\u0237\u0003\u0002\u0002\u0002\u023c\u0238\u0003\u0002\u0002\u0002\u023c\u0239\u0003\u0002\u0002\u0002\u023c\u023a\u0003\u0002\u0002\u0002\u023c\u023b\u0003\u0002\u0002\u0002\u023d\u004f\u0003\u0002\u0002\u0002\u023e\u0242\u0008\u0029\u0001\u0002\u023f\u0240\u0005\u000a\u0006\u0002\u0240\u0241\u0007\u0018\u0002\u0002\u0241\u0243\u0003\u0002\u0002\u0002\u0242\u023f\u0003\u0002\u0002\u0002\u0242\u0243\u0003\u0002\u0002\u0002\u0243\u0244\u0003\u0002\u0002\u0002\u0244\u0246\u0007\u0021\u0002\u0002\u0245\u0247\u0005\u0052\u002a\u0002\u0246\u0245\u0003\u0002\u0002\u0002\u0246\u0247\u0003\u0002\u0002\u0002\u0247\u028f\u0003\u0002\u0002\u0002\u0248\u028f\u0007\u0023\u0002\u0002\u0249\u024a\u0007\u0019\u0002\u0002\u024a\u024b\u0007\u0023\u0002\u0002\u024b\u024d\u0007\u001a\u0002\u0002\u024c\u024e\u0005\u0052\u002a\u0002\u024d\u024c\u0003\u0002\u0002\u0002\u024d\u024e\u0003\u0002\u0002\u0002\u024e\u028f\u0003\u0002\u0002\u0002\u024f\u028f\u0007\u0024\u0002\u0002\u0250\u0251\u0007\u0019\u0002\u0002\u0251\u0252\u0007\u0024\u0002\u0002\u0252\u0254\u0007\u001a\u0002\u0002\u0253\u0255\u0005\u0052\u002a\u0002\u0254\u0253\u0003\u0002\u0002\u0002\u0254\u0255\u0003\u0002\u0002\u0002\u0255\u028f\u0003\u0002\u0002\u0002\u0256\u028f\u0007\u0025\u0002\u0002\u0257\u0258\u0007\u0019\u0002\u0002\u0258\u0259\u0007\u0025\u0002\u0002\u0259\u025b\u0007\u001a\u0002\u0002\u025a\u025c\u0005\u0052\u002a\u0002\u025b\u025a\u0003\u0002\u0002\u0002\u025b\u025c\u0003\u0002\u0002\u0002\u025c\u028f\u0003\u0002\u0002\u0002\u025d\u025e\u0007\u0019\u0002\u0002\u025e\u025f\u0005\u0050\u0029\u0002\u025f\u0260\u0005\u005e\u0030\u0002\u0260\u0262\u0007\u001a\u0002\u0002\u0261\u0263\u0005\u0052\u002a\u0002\u0262\u0261\u0003\u0002\u0002\u0002\u0262\u0263\u0003\u0002\u0002\u0002\u0263\u028f\u0003\u0002\u0002\u0002\u0264\u0265\u0007\u0019\u0002\u0002\u0265\u0266\u0005\u0050\u0029\u0002\u0266\u0267\u0007\u0022\u0002\u0002\u0267\u0268\u0005\u0050\u0029\u0002\u0268\u026a\u0007\u001a\u0002\u0002\u0269\u026b\u0005\u0052\u002a\u0002\u026a\u0269\u0003\u0002\u0002\u0002\u026a\u026b\u0003\u0002\u0002\u0002\u026b\u028f\u0003\u0002\u0002\u0002\u026c\u026d\u0007\u0022\u0002\u0002\u026d\u028f\u0005\u0050\u0029\u0009\u026e\u026f\u0007\u0019\u0002\u0002\u026f\u0270\u0007\u0022\u0002\u0002\u0270\u0272\u0005\u0050\u0029\u0002\u0271\u0273\u0005\u0052\u002a\u0002\u0272\u0271\u0003\u0002\u0002\u0002\u0272\u0273\u0003\u0002\u0002\u0002\u0273\u028f\u0003\u0002\u0002\u0002\u0274\u0275\u0005\u000a\u0006\u0002\u0275\u0276\u0007\u0018\u0002\u0002\u0276\u0278\u0003\u0002\u0002\u0002\u0277\u0274\u0003\u0002\u0002\u0002\u0277\u0278\u0003\u0002\u0002\u0002\u0278\u0279\u0003\u0002\u0002\u0002\u0279\u027b\u0005\u006a\u0036\u0002\u027a\u027c\u0005\u0052\u002a\u0002\u027b\u027a\u0003\u0002\u0002\u0002\u027b\u027c\u0003\u0002\u0002\u0002\u027c\u028f\u0003\u0002\u0002\u0002\u027d\u027e\u0005\u000a\u0006\u0002\u027e\u027f\u0007\u0018\u0002\u0002\u027f\u0281\u0003\u0002\u0002\u0002\u0280\u027d\u0003\u0002\u0002\u0002\u0280\u0281\u0003\u0002\u0002\u0002\u0281\u0282\u0003\u0002\u0002\u0002\u0282\u0284\u0005\u006c\u0037\u0002\u0283\u0285\u0005\u0052\u002a\u0002\u0284\u0283\u0003\u0002\u0002\u0002\u0284\u0285\u0003\u0002\u0002\u0002\u0285\u028f\u0003\u0002\u0002\u0002\u0286\u0288\u0005\u000e\u0008\u0002\u0287\u0289\u0005\u0052\u002a\u0002\u0288\u0287\u0003\u0002\u0002\u0002\u0288\u0289\u0003\u0002\u0002\u0002\u0289\u028f\u0003\u0002\u0002\u0002\u028a\u028c\u0005\u0068\u0035\u0002\u028b\u028d\u0005\u0052\u002a\u0002\u028c\u028b\u0003\u0002\u0002\u0002\u028c\u028d\u0003\u0002\u0002\u0002\u028d\u028f\u0003\u0002\u0002\u0002\u028e\u023e\u0003\u0002\u0002\u0002\u028e\u0248\u0003\u0002\u0002\u0002\u028e\u0249\u0003\u0002\u0002\u0002\u028e\u024f\u0003\u0002\u0002\u0002\u028e\u0250\u0003\u0002\u0002\u0002\u028e\u0256\u0003\u0002\u0002\u0002\u028e\u0257\u0003\u0002\u0002\u0002\u028e\u025d\u0003\u0002\u0002\u0002\u028e\u0264\u0003\u0002\u0002\u0002\u028e\u026c\u0003\u0002\u0002\u0002\u028e\u026e\u0003\u0002\u0002\u0002\u028e\u0277\u0003\u0002\u0002\u0002\u028e\u0280\u0003\u0002\u0002\u0002\u028e\u0286\u0003\u0002\u0002\u0002\u028e\u028a\u0003\u0002\u0002\u0002\u028f\u029d\u0003\u0002\u0002\u0002\u0290\u0291\u000c\u000b\u0002\u0002\u0291\u0292\u0007\u0022\u0002\u0002\u0292\u029c\u0005\u0050\u0029\u000c\u0293\u0294\u000c\u000d\u0002\u0002\u0294\u029c\u0005\u005e\u0030\u0002\u0295\u0296\u000c\u0007\u0002\u0002\u0296\u0297\u0007\u0018\u0002\u0002\u0297\u0299\u0005\u0050\u0029\u0002\u0298\u029a\u0005\u0052\u002a\u0002\u0299\u0298\u0003\u0002\u0002\u0002\u0299\u029a\u0003\u0002\u0002\u0002\u029a\u029c\u0003\u0002\u0002\u0002\u029b\u0290\u0003\u0002\u0002\u0002\u029b\u0293\u0003\u0002\u0002\u0002\u029b\u0295\u0003\u0002\u0002\u0002\u029c\u029f\u0003\u0002\u0002\u0002\u029d\u029b\u0003\u0002\u0002\u0002\u029d\u029e\u0003\u0002\u0002\u0002\u029e\u0051\u0003\u0002\u0002\u0002\u029f\u029d\u0003\u0002\u0002\u0002\u02a0\u02a1\u0007\u0006\u0002\u0002\u02a1\u02a2\u0005\u006e\u0038\u0002\u02a2\u0053\u0003\u0002\u0002\u0002\u02a3\u02a4\u0007\u0021\u0002\u0002\u02a4\u02a6\u0005\u006e\u0038\u0002\u02a5\u02a7\u0007\u0017\u0002\u0002\u02a6\u02a5\u0003\u0002\u0002\u0002\u02a6\u02a7\u0003\u0002\u0002\u0002\u02a7\u02aa\u0003\u0002\u0002\u0002\u02a8\u02a9\u0007\u0016\u0002\u0002\u02a9\u02ab\u0005\u0050\u0029\u0002\u02aa\u02a8\u0003\u0002\u0002\u0002\u02aa\u02ab\u0003\u0002\u0002\u0002\u02ab\u0055\u0003\u0002\u0002\u0002\u02ac\u02b0\u0007\u0019\u0002\u0002\u02ad\u02af\u0005\u0054\u002b\u0002\u02ae\u02ad\u0003\u0002\u0002\u0002\u02af\u02b2\u0003\u0002\u0002\u0002\u02b0\u02ae\u0003\u0002\u0002\u0002\u02b0\u02b1\u0003\u0002\u0002\u0002\u02b1\u02b3\u0003\u0002\u0002\u0002\u02b2\u02b0\u0003\u0002\u0002\u0002\u02b3\u02b4\u0007\u001a\u0002\u0002\u02b4\u0057\u0003\u0002\u0002\u0002\u02b5\u02b6\u0007\u0019\u0002\u0002\u02b6\u02b7\u0005\u0054\u002b\u0002\u02b7\u02b8\u0005\u0054\u002b\u0002\u02b8\u02b9\u0007\u001a\u0002\u0002\u02b9\u0059\u0003\u0002\u0002\u0002\u02ba\u02bb\u0007\u0019\u0002\u0002\u02bb\u02bc\u0005\u0054\u002b\u0002\u02bc\u02bd\u0007\u001a\u0002\u0002\u02bd\u005b\u0003\u0002\u0002\u0002\u02be\u02bf\u0007\u0021\u0002\u0002\u02bf\u02c1\u0007\u0016\u0002\u0002\u02c0\u02be\u0003\u0002\u0002\u0002\u02c0\u02c1\u0003\u0002\u0002\u0002\u02c1\u02c2\u0003\u0002\u0002\u0002\u02c2\u02c5\u0005\u0050\u0029\u0002\u02c3\u02c4\u0007\u0020\u0002\u0002\u02c4\u02c6\u0005\u006e\u0038\u0002\u02c5\u02c3\u0003\u0002\u0002\u0002\u02c5\u02c6\u0003\u0002\u0002\u0002\u02c6\u005d\u0003\u0002\u0002\u0002\u02c7\u02cb\u0007\u0019\u0002\u0002\u02c8\u02ca\u0005\u005c\u002f\u0002\u02c9\u02c8\u0003\u0002\u0002\u0002\u02ca\u02cd\u0003\u0002\u0002\u0002\u02cb\u02c9\u0003\u0002\u0002\u0002\u02cb\u02cc\u0003\u0002\u0002\u0002\u02cc\u02ce\u0003\u0002\u0002\u0002\u02cd\u02cb\u0003\u0002\u0002\u0002\u02ce\u02cf\u0007\u001a\u0002\u0002\u02cf\u005f\u0003\u0002\u0002\u0002\u02d0\u02d1\u0007\u0012\u0002\u0002\u02d1\u02d3\u0007\u0021\u0002\u0002\u02d2\u02d4\u0005\u006e\u0038\u0002\u02d3\u02d2\u0003\u0002\u0002\u0002\u02d3\u02d4\u0003\u0002\u0002\u0002\u02d4\u02d5\u0003\u0002\u0002\u0002\u02d5\u02d6\u0007\u0016\u0002\u0002\u02d6\u02d7\u0005\u0050\u0029\u0002\u02d7\u0061\u0003\u0002\u0002\u0002\u02d8\u02d9\u0007\u0011\u0002\u0002\u02d9\u02db\u0007\u0021\u0002\u0002\u02da\u02dc\u0005\u006e\u0038\u0002\u02db\u02da\u0003\u0002\u0002\u0002\u02db\u02dc\u0003\u0002\u0002\u0002\u02dc\u02dd\u0003\u0002\u0002\u0002\u02dd\u02de\u0007\u0016\u0002\u0002\u02de\u02df\u0005\u0050\u0029\u0002\u02df\u0063\u0003\u0002\u0002\u0002\u02e0\u02e2\u0007\u0009\u0002\u0002\u02e1\u02e0\u0003\u0002\u0002\u0002\u02e1\u02e2\u0003\u0002\u0002\u0002\u02e2\u02e3\u0003\u0002\u0002\u0002\u02e3\u02e5\u0007\u0021\u0002\u0002\u02e4\u02e6\u0005\u002a\u0016\u0002\u02e5\u02e4\u0003\u0002\u0002\u0002\u02e5\u02e6\u0003\u0002\u0002\u0002\u02e6\u02ea\u0003\u0002\u0002\u0002\u02e7\u02e9\u0005\u0056\u002c\u0002\u02e8\u02e7\u0003\u0002\u0002\u0002\u02e9\u02ec\u0003\u0002\u0002\u0002\u02ea\u02e8\u0003\u0002\u0002\u0002\u02ea\u02eb\u0003\u0002\u0002\u0002\u02eb\u02ee\u0003\u0002\u0002\u0002\u02ec\u02ea\u0003\u0002\u0002\u0002\u02ed\u02ef\u0005\u006e\u0038\u0002\u02ee\u02ed\u0003\u0002\u0002\u0002\u02ee\u02ef\u0003\u0002\u0002\u0002\u02ef\u02f0\u0003\u0002\u0002\u0002\u02f0\u02f1\u0007\u0016\u0002\u0002\u02f1\u0334\u0005\u0050\u0029\u0002\u02f2\u02f4\u0007\u0009\u0002\u0002\u02f3\u02f2\u0003\u0002\u0002\u0002\u02f3\u02f4\u0003\u0002\u0002\u0002\u02f4\u02f5\u0003\u0002\u0002\u0002\u02f5\u02f7\u0005\u006a\u0036\u0002\u02f6\u02f8\u0005\u002a\u0016\u0002\u02f7\u02f6\u0003\u0002\u0002\u0002\u02f7\u02f8\u0003\u0002\u0002\u0002\u02f8\u02f9\u0003\u0002\u0002\u0002\u02f9\u02fb\u0005\u0058\u002d\u0002\u02fa\u02fc\u0005\u006e\u0038\u0002\u02fb\u02fa\u0003\u0002\u0002\u0002\u02fb\u02fc\u0003\u0002\u0002\u0002\u02fc\u02fd\u0003\u0002\u0002\u0002\u02fd\u02fe\u0007\u0016\u0002\u0002\u02fe\u02ff\u0005\u0050\u0029\u0002\u02ff\u0334\u0003\u0002\u0002\u0002\u0300\u0302\u0007\u0009\u0002\u0002\u0301\u0300\u0003\u0002\u0002\u0002\u0301\u0302\u0003\u0002\u0002\u0002\u0302\u0303\u0003\u0002\u0002\u0002\u0303\u0305\u0005\u006c\u0037\u0002\u0304\u0306\u0005\u002a\u0016\u0002\u0305\u0304\u0003\u0002\u0002\u0002\u0305\u0306\u0003\u0002\u0002\u0002\u0306\u0307\u0003\u0002\u0002\u0002\u0307\u0309\u0005\u005a\u002e\u0002\u0308\u030a\u0005\u006e\u0038\u0002\u0309\u0308\u0003\u0002\u0002\u0002\u0309\u030a\u0003\u0002\u0002\u0002\u030a\u030b\u0003\u0002\u0002\u0002\u030b\u030c\u0007\u0016\u0002\u0002\u030c\u030d\u0005\u0050\u0029\u0002\u030d\u0334\u0003\u0002\u0002\u0002\u030e\u0310\u0007\u0009\u0002\u0002\u030f\u030e\u0003\u0002\u0002\u0002\u030f\u0310\u0003\u0002\u0002\u0002\u0310\u0311\u0003\u0002\u0002\u0002\u0311\u0313\u0007\u0021\u0002\u0002\u0312\u0314\u0005\u002a\u0016\u0002\u0313\u0312\u0003\u0002\u0002\u0002\u0313\u0314\u0003\u0002\u0002\u0002\u0314\u0315\u0003\u0002\u0002\u0002\u0315\u0319\u0007\u0008\u0002\u0002\u0316\u0318\u0005\u003a\u001e\u0002\u0317\u0316\u0003\u0002\u0002\u0002\u0318\u031b\u0003\u0002\u0002\u0002\u0319\u0317\u0003\u0002\u0002\u0002\u0319\u031a\u0003\u0002\u0002\u0002\u031a\u031c\u0003\u0002\u0002\u0002\u031b\u0319\u0003\u0002\u0002\u0002\u031c\u0334\u0005\u006e\u0038\u0002\u031d\u031f\u0007\u0009\u0002\u0002\u031e\u031d\u0003\u0002\u0002\u0002\u031e\u031f\u0003\u0002\u0002\u0002\u031f\u0320\u0003\u0002\u0002\u0002\u0320\u0322\u0005\u006a\u0036\u0002\u0321\u0323\u0005\u002a\u0016\u0002\u0322\u0321\u0003\u0002\u0002\u0002\u0322\u0323\u0003\u0002\u0002\u0002\u0323\u0324\u0003\u0002\u0002\u0002\u0324\u0325\u0007\u0008\u0002\u0002\u0325\u0326\u0005\u003c\u001f\u0002\u0326\u0327\u0005\u006e\u0038\u0002\u0327\u0334\u0003\u0002\u0002\u0002\u0328\u032a\u0007\u0009\u0002\u0002\u0329\u0328\u0003\u0002\u0002\u0002\u0329\u032a\u0003\u0002\u0002\u0002\u032a\u032b\u0003\u0002\u0002\u0002\u032b\u032d\u0005\u006c\u0037\u0002\u032c\u032e\u0005\u002a\u0016\u0002\u032d\u032c\u0003\u0002\u0002\u0002\u032d\u032e\u0003\u0002\u0002\u0002\u032e\u032f\u0003\u0002\u0002\u0002\u032f\u0330\u0007\u0008\u0002\u0002\u0330\u0331\u0005\u003e\u0020\u0002\u0331\u0332\u0005\u006e\u0038\u0002\u0332\u0334\u0003\u0002\u0002\u0002\u0333\u02e1\u0003\u0002\u0002\u0002\u0333\u02f3\u0003\u0002\u0002\u0002\u0333\u0301\u0003\u0002\u0002\u0002\u0333\u030f\u0003\u0002\u0002\u0002\u0333\u031e\u0003\u0002\u0002\u0002\u0333\u0329\u0003\u0002\u0002\u0002\u0334\u0065\u0003\u0002\u0002\u0002\u0335\u033b\u0007\u0021\u0002\u0002\u0336\u0337\u0007\u0020\u0002\u0002\u0337\u0339\u0005\u006e\u0038\u0002\u0338\u033a\u0007\u0017\u0002\u0002\u0339\u0338\u0003\u0002\u0002\u0002\u0339\u033a\u0003\u0002\u0002\u0002\u033a\u033c\u0003\u0002\u0002\u0002\u033b\u0336\u0003\u0002\u0002\u0002\u033b\u033c\u0003\u0002\u0002\u0002\u033c\u033f\u0003\u0002\u0002\u0002\u033d\u033e\u0007\u0016\u0002\u0002\u033e\u0340\u0005\u0050\u0029\u0002\u033f\u033d\u0003\u0002\u0002\u0002\u033f\u0340\u0003\u0002\u0002\u0002\u0340\u0067\u0003\u0002\u0002\u0002\u0341\u0345\u0007\u001b\u0002\u0002\u0342\u0344\u0005\u0066\u0034\u0002\u0343\u0342\u0003\u0002\u0002\u0002\u0344\u0347\u0003\u0002\u0002\u0002\u0345\u0343\u0003\u0002\u0002\u0002\u0345\u0346\u0003\u0002\u0002\u0002\u0346\u0348\u0003\u0002\u0002\u0002\u0347\u0345\u0003\u0002\u0002\u0002\u0348\u0349\u0007\u001c\u0002\u0002\u0349\u034a\u0005\u0050\u0029\u0002\u034a\u0069\u0003\u0002\u0002\u0002\u034b\u034c\u0007\u001b\u0002\u0002\u034c\u034d\u0007\u0022\u0002\u0002\u034d\u034e\u0007\u001c\u0002\u0002\u034e\u006b\u0003\u0002\u0002\u0002\u034f\u0350\u0007\u001b\u0002\u0002\u0350\u0351\u0007\u0020\u0002\u0002\u0351\u0352\u0007\u0022\u0002\u0002\u0352\u0353\u0007\u001c\u0002\u0002\u0353\u006d\u0003\u0002\u0002\u0002\u0354\u0355\u0008\u0038\u0001\u0002\u0355\u0356\u0007\u0019\u0002\u0002\u0356\u0357\u0005\u006e\u0038\u0002\u0357\u0358\u0007\u001f\u0002\u0002\u0358\u0359\u0005\u006e\u0038\u0002\u0359\u035a\u0007\u001a\u0002\u0002\u035a\u035d\u0003\u0002\u0002\u0002\u035b\u035d\u0005\u0070\u0039\u0002\u035c\u0354\u0003\u0002\u0002\u0002\u035c\u035b\u0003\u0002\u0002\u0002\u035d\u0363\u0003\u0002\u0002\u0002\u035e\u035f\u000c\u0004\u0002\u0002\u035f\u0360\u0007\u001f\u0002\u0002\u0360\u0362\u0005\u006e\u0038\u0005\u0361\u035e\u0003\u0002\u0002\u0002\u0362\u0365\u0003\u0002\u0002\u0002\u0363\u0361\u0003\u0002\u0002\u0002\u0363\u0364\u0003\u0002\u0002\u0002\u0364\u006f\u0003\u0002\u0002\u0002\u0365\u0363\u0003\u0002\u0002\u0002\u0366\u0367\u0005\u000a\u0006\u0002\u0367\u0368\u0007\u0018\u0002\u0002\u0368\u036a\u0003\u0002\u0002\u0002\u0369\u0366\u0003\u0002\u0002\u0002\u0369\u036a\u0003\u0002\u0002\u0002\u036a\u036b\u0003\u0002\u0002\u0002\u036b\u0374\u0007\u0021\u0002\u0002\u036c\u036e\u0007\u0019\u0002\u0002\u036d\u036f\u0005\u006e\u0038\u0002\u036e\u036d\u0003\u0002\u0002\u0002\u036f\u0370\u0003\u0002\u0002\u0002\u0370\u036e\u0003\u0002\u0002\u0002\u0370\u0371\u0003\u0002\u0002\u0002\u0371\u0372\u0003\u0002\u0002\u0002\u0372\u0373\u0007\u001a\u0002\u0002\u0373\u0375\u0003\u0002\u0002\u0002\u0374\u036c\u0003\u0002\u0002\u0002\u0374\u0375\u0003\u0002\u0002\u0002\u0375\u0071\u0003\u0002\u0002\u0002\u0085\u0073\u0078\u007e\u0084\u008a\u0092\u0097\u009b\u009e\u00a5\u00ac\u00b2\u00b9\u00c1\u00c6\u00cc\u00ce\u00d6\u00db\u00dd\u00e3\u00e6\u00ec\u00f4\u00f9\u00fd\u0102\u0108\u010a\u0112\u0114\u011b\u0126\u012a\u012f\u0134\u0138\u013e\u0142\u0148\u014c\u0151\u0155\u015a\u015e\u0162\u0168\u016c\u0170\u0175\u017d\u0183\u0185\u0187\u0191\u019c\u019e\u01a6\u01ad\u01b2\u01b8\u01bf\u01c4\u01c8\u01ce\u01e0\u01ea\u01f2\u01f8\u0207\u020d\u0213\u021b\u0223\u0228\u022e\u0233\u023c\u0242\u0246\u024d\u0254\u025b\u0262\u026a\u0272\u0277\u027b\u0280\u0284\u0288\u028c\u028e\u0299\u029b\u029d\u02a6\u02aa\u02b0\u02c0\u02c5\u02cb\u02d3\u02db\u02e1\u02e5\u02ea\u02ee\u02f3\u02f7\u02fb\u0301\u0305\u0309\u030f\u0313\u0319\u031e\u0322\u0329\u032d\u0333\u0339\u033b\u033f\u0345\u035c\u0363\u0369\u0370\u0374"

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
    private val DATA = Tokens.DATA.id
    private val FOREIGN = Tokens.FOREIGN.id
    private val FOLDING = Tokens.FOLDING.id
    private val NAMESPACE = Tokens.NAMESPACE.id
    private val OVERRIDE = Tokens.OVERRIDE.id
    private val INTERNAL = Tokens.INTERNAL.id
    private val IMPORT = Tokens.IMPORT.id
    private val IMPL = Tokens.IMPL.id
    private val RETURN = Tokens.RETURN.id
    private val TYPE = Tokens.TYPE.id
    private val VAR = Tokens.VAR.id
    private val VAL = Tokens.VAL.id
    private val DO = Tokens.DO.id
    private val STATIC = Tokens.STATIC.id
    private val INTERFACE = Tokens.INTERFACE.id
    private val ASSGIN = Tokens.ASSGIN.id
    private val ELLIPSIS = Tokens.ELLIPSIS.id
    private val DOT = Tokens.DOT.id
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val LSQUARE = Tokens.LSQUARE.id
    private val RSQUARE = Tokens.RSQUARE.id
    private val LBRACE = Tokens.LBRACE.id
    private val RBRACE = Tokens.RBRACE.id
    private val ARROW = Tokens.ARROW.id
    private val TILDE = Tokens.TILDE.id
    private val ID = Tokens.ID.id
    private val OPID = Tokens.OPID.id
    private val Integer = Tokens.Integer.id
    private val Double = Tokens.Double.id
    private val String = Tokens.String.id

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
			this.state = 113
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAMESPACE) {
				if (true){
				this.state = 112
				namespace()
				}
			}

			this.state = 118
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPORT) {
				if (true){
				if (true){
				this.state = 115
				importEx()
				}
				}
				this.state = 120
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 124
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DATA) or (1L shl FOLDING) or (1L shl IMPL) or (1L shl TYPE) or (1L shl VAR) or (1L shl VAL) or (1L shl INTERFACE) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				if (true){
				this.state = 121
				definition()
				}
				}
				this.state = 126
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
		fun IMPORT() : TerminalNode? = getToken(FoldingParser.Tokens.IMPORT.id, 0)
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun findImportBody() : ImportBodyContext? = getRuleContext(solver.getType("ImportBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importEx() : ImportExContext {
		var _localctx : ImportExContext = ImportExContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_importEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 127
			match(IMPORT) as Token
			this.state = 128
			package_()
			this.state = 130
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 129
				importBody()
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

	open class ImportBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importBody.id
	        set(value) { throw RuntimeException() }
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findImportElement() : List<ImportElementContext> = getRuleContexts(solver.getType("ImportElementContext"))
		fun findImportElement(i: Int) : ImportElementContext? = getRuleContext(solver.getType("ImportElementContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importBody() : ImportBodyContext {
		var _localctx : ImportBodyContext = ImportBodyContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_importBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 132
			match(LBRACE) as Token
			this.state = 136
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 133
				importElement()
				}
				}
				this.state = 138
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 139
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

	open class ImportElementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importElement.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun DOT() : TerminalNode? = getToken(FoldingParser.Tokens.DOT.id, 0)
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun FOLDING() : TerminalNode? = getToken(FoldingParser.Tokens.FOLDING.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importElement() : ImportElementContext {
		var _localctx : ImportElementContext = ImportElementContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_importElement.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 144
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1   -> if (true){
			this.state = 141
			package_()
			this.state = 142
			match(DOT) as Token
			}
			}
			this.state = 149
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1 -> {if (true){
			this.state = 146
			match(ID) as Token
			}}
			2 -> {if (true){
			this.state = 147
			opIdWrap()
			}}
			3 -> {if (true){
			this.state = 148
			aopIdWrap()
			}}
			}
			this.state = 156
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOREIGN) {
				if (true){
				this.state = 151
				match(FOREIGN) as Token
				this.state = 153
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==FOLDING) {
					if (true){
					this.state = 152
					match(FOLDING) as Token
					}
				}

				this.state = 155
				typeEx(0)
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
		enterRule(_localctx, 8, Rules.RULE_package_.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 158
			match(ID) as Token
			this.state = 163
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,9,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 159
					match(DOT) as Token
					this.state = 160
					match(ID) as Token
					}
					} 
				}
				this.state = 165
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,9,context)
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
		enterRule(_localctx, 10, Rules.RULE_namespace.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 166
			match(NAMESPACE) as Token
			this.state = 167
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

	open class BodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_body.id
	        set(value) { throw RuntimeException() }
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun DO() : TerminalNode? = getToken(FoldingParser.Tokens.DO.id, 0)
		fun findCompo() : List<CompoContext> = getRuleContexts(solver.getType("CompoContext"))
		fun findCompo(i: Int) : CompoContext? = getRuleContext(solver.getType("CompoContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  body() : BodyContext {
		var _localctx : BodyContext = BodyContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_body.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 170
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 169
				match(DO) as Token
				}
			}

			this.state = 172
			match(LBRACE) as Token
			this.state = 176
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DATA) or (1L shl FOLDING) or (1L shl IMPL) or (1L shl VAR) or (1L shl VAL) or (1L shl DO) or (1L shl INTERFACE) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 173
				compo()
				}
				}
				this.state = 178
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 179
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
		fun findDefinitionInBody() : DefinitionInBodyContext? = getRuleContext(solver.getType("DefinitionInBodyContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  compo() : CompoContext {
		var _localctx : CompoContext = CompoContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_compo.id)
		try {
			this.state = 183
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,12,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 181
			definitionInBody()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 182
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

	open class DefinitionInBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_definitionInBody.id
	        set(value) { throw RuntimeException() }
		fun findDef() : DefContext? = getRuleContext(solver.getType("DefContext"),0)
		fun findVar_() : Var_Context? = getRuleContext(solver.getType("Var_Context"),0)
		fun findVal_() : Val_Context? = getRuleContext(solver.getType("Val_Context"),0)
		fun findImpl() : ImplContext? = getRuleContext(solver.getType("ImplContext"),0)
		fun findData() : DataContext? = getRuleContext(solver.getType("DataContext"),0)
		fun findInterface_() : Interface_Context? = getRuleContext(solver.getType("Interface_Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  definitionInBody() : DefinitionInBodyContext {
		var _localctx : DefinitionInBodyContext = DefinitionInBodyContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_definitionInBody.id)
		try {
			this.state = 191
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOLDING , LSQUARE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 185
			def()
			}}
			VAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 186
			var_()
			}}
			VAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 187
			val_()
			}}
			IMPL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 188
			impl()
			}}
			DATA  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 189
			data()
			}}
			INTERFACE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 190
			interface_()
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

	open class DataContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_data.id
	        set(value) { throw RuntimeException() }
		fun DATA() : TerminalNode? = getToken(FoldingParser.Tokens.DATA.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findDataBody() : DataBodyContext? = getRuleContext(solver.getType("DataBodyContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  data() : DataContext {
		var _localctx : DataContext = DataContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_data.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 193
			match(DATA) as Token
			this.state = 194
			match(ID) as Token
			this.state = 196
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 195
				typeParam()
				}
			}

			this.state = 204
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 198
				match(TILDE) as Token
				this.state = 200 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 199
					typeEx(0)
					}
					}
					this.state = 202 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( _la==LPAREN || _la==ID )
				}
			}

			this.state = 206
			dataBody()
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

	open class DataBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_dataBody.id
	        set(value) { throw RuntimeException() }
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findConstuctor() : List<ConstuctorContext> = getRuleContexts(solver.getType("ConstuctorContext"))
		fun findConstuctor(i: Int) : ConstuctorContext? = getRuleContext(solver.getType("ConstuctorContext"),i)
		fun findDefinitionInData() : List<DefinitionInDataContext> = getRuleContexts(solver.getType("DefinitionInDataContext"))
		fun findDefinitionInData(i: Int) : DefinitionInDataContext? = getRuleContext(solver.getType("DefinitionInDataContext"),i)
		fun findStaticDefinition() : List<StaticDefinitionContext> = getRuleContexts(solver.getType("StaticDefinitionContext"))
		fun findStaticDefinition(i: Int) : StaticDefinitionContext? = getRuleContext(solver.getType("StaticDefinitionContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  dataBody() : DataBodyContext {
		var _localctx : DataBodyContext = DataBodyContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_dataBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 208
			match(LBRACE) as Token
			this.state = 212
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN) {
				if (true){
				if (true){
				this.state = 209
				constuctor()
				}
				}
				this.state = 214
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 219
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl FOLDING) or (1L shl OVERRIDE) or (1L shl INTERNAL) or (1L shl IMPL) or (1L shl VAR) or (1L shl VAL) or (1L shl STATIC) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 217
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				FOLDING , OVERRIDE , INTERNAL , IMPL , VAR , VAL , LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 215
				definitionInData()
				}}
				STATIC  ->  /*LL1AltBlock*/{if (true){
				this.state = 216
				staticDefinition()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 221
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 222
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

	open class DefinitionInDataContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_definitionInData.id
	        set(value) { throw RuntimeException() }
		fun findVal_() : Val_Context? = getRuleContext(solver.getType("Val_Context"),0)
		fun findVar_() : Var_Context? = getRuleContext(solver.getType("Var_Context"),0)
		fun findDef() : DefContext? = getRuleContext(solver.getType("DefContext"),0)
		fun findImpl() : ImplContext? = getRuleContext(solver.getType("ImplContext"),0)
		fun INTERNAL() : TerminalNode? = getToken(FoldingParser.Tokens.INTERNAL.id, 0)
		fun OVERRIDE() : TerminalNode? = getToken(FoldingParser.Tokens.OVERRIDE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  definitionInData() : DefinitionInDataContext {
		var _localctx : DefinitionInDataContext = DefinitionInDataContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_definitionInData.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 225
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INTERNAL) {
				if (true){
				this.state = 224
				match(INTERNAL) as Token
				}
			}

			this.state = 228
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OVERRIDE) {
				if (true){
				this.state = 227
				match(OVERRIDE) as Token
				}
			}

			this.state = 234
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 230
			val_()
			}}
			VAR  ->  /*LL1AltBlock*/{if (true){
			this.state = 231
			var_()
			}}
			FOLDING , LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
			this.state = 232
			def()
			}}
			IMPL  ->  /*LL1AltBlock*/{if (true){
			this.state = 233
			impl()
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

	open class StaticDefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_staticDefinition.id
	        set(value) { throw RuntimeException() }
		fun STATIC() : TerminalNode? = getToken(FoldingParser.Tokens.STATIC.id, 0)
		fun findVal_() : Val_Context? = getRuleContext(solver.getType("Val_Context"),0)
		fun findVar_() : Var_Context? = getRuleContext(solver.getType("Var_Context"),0)
		fun findDef() : DefContext? = getRuleContext(solver.getType("DefContext"),0)
		fun findData() : DataContext? = getRuleContext(solver.getType("DataContext"),0)
		fun findInterface_() : Interface_Context? = getRuleContext(solver.getType("Interface_Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  staticDefinition() : StaticDefinitionContext {
		var _localctx : StaticDefinitionContext = StaticDefinitionContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_staticDefinition.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 236
			match(STATIC) as Token
			this.state = 242
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 237
			val_()
			}}
			VAR  ->  /*LL1AltBlock*/{if (true){
			this.state = 238
			var_()
			}}
			FOLDING , LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
			this.state = 239
			def()
			}}
			DATA  ->  /*LL1AltBlock*/{if (true){
			this.state = 240
			data()
			}}
			INTERFACE  ->  /*LL1AltBlock*/{if (true){
			this.state = 241
			interface_()
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
		enterRule(_localctx, 26, Rules.RULE_constuctor.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 245 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 244
				parameter()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 247 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,24,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 251
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 249
				match(ASSGIN) as Token
				this.state = 250
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
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  interface_() : Interface_Context {
		var _localctx : Interface_Context = Interface_Context(context, state)
		enterRule(_localctx, 28, Rules.RULE_interface_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 253
			match(INTERFACE) as Token
			this.state = 254
			match(ID) as Token
			this.state = 256
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 255
				typeParam()
				}
			}

			this.state = 264
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 258
				match(TILDE) as Token
				this.state = 260 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 259
					typeEx(0)
					}
					}
					this.state = 262 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( _la==LPAREN || _la==ID )
				}
			}

			this.state = 266
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
		fun findDefInInterface() : List<DefInInterfaceContext> = getRuleContexts(solver.getType("DefInInterfaceContext"))
		fun findDefInInterface(i: Int) : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),i)
		fun findPropertyInInterface() : List<PropertyInInterfaceContext> = getRuleContexts(solver.getType("PropertyInInterfaceContext"))
		fun findPropertyInInterface(i: Int) : PropertyInInterfaceContext? = getRuleContext(solver.getType("PropertyInInterfaceContext"),i)
		fun findStaticDefinition() : List<StaticDefinitionContext> = getRuleContexts(solver.getType("StaticDefinitionContext"))
		fun findStaticDefinition(i: Int) : StaticDefinitionContext? = getRuleContext(solver.getType("StaticDefinitionContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  interfaceBody() : InterfaceBodyContext {
		var _localctx : InterfaceBodyContext = InterfaceBodyContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_interfaceBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 268
			match(LBRACE) as Token
			this.state = 274
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl FOLDING) or (1L shl VAR) or (1L shl VAL) or (1L shl STATIC) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 272
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				FOLDING , LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 269
				defInInterface()
				}}
				VAR , VAL  ->  /*LL1AltBlock*/{if (true){
				this.state = 270
				propertyInInterface()
				}}
				STATIC  ->  /*LL1AltBlock*/{if (true){
				this.state = 271
				staticDefinition()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 276
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 277
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

	open class PropertyInInterfaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_propertyInInterface.id
	        set(value) { throw RuntimeException() }
		fun findValInInterface() : ValInInterfaceContext? = getRuleContext(solver.getType("ValInInterfaceContext"),0)
		fun findVarInInterface() : VarInInterfaceContext? = getRuleContext(solver.getType("VarInInterfaceContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  propertyInInterface() : PropertyInInterfaceContext {
		var _localctx : PropertyInInterfaceContext = PropertyInInterfaceContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_propertyInInterface.id)
		try {
			this.state = 281
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 279
			valInInterface()
			}}
			VAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 280
			varInInterface()
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
		enterRule(_localctx, 34, Rules.RULE_valInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 283
			match(VAL) as Token
			this.state = 284
			match(ID) as Token
			this.state = 285
			typeEx(0)
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
		enterRule(_localctx, 36, Rules.RULE_varInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 287
			match(VAR) as Token
			this.state = 288
			match(ID) as Token
			this.state = 289
			typeEx(0)
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
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun FOLDING() : TerminalNode? = getToken(FoldingParser.Tokens.FOLDING.id, 0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : List<ParameterContext> = getRuleContexts(solver.getType("ParameterContext"))
		fun findParameter(i: Int) : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),i)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findOpParameter() : OpParameterContext? = getRuleContext(solver.getType("OpParameterContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findAopParameter() : AopParameterContext? = getRuleContext(solver.getType("AopParameterContext"),0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defInInterface() : DefInInterfaceContext {
		var _localctx : DefInInterfaceContext = DefInInterfaceContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_defInInterface.id)
		var _la: Int
		try {
			var _alt: Int
			this.state = 371
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,49,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 292
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 291
				match(FOLDING) as Token
				}
			}

			this.state = 294
			match(ID) as Token
			this.state = 296
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 295
				typeParam()
				}
			}

			this.state = 301
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,34,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 298
					parameter()
					}
					} 
				}
				this.state = 303
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,34,context)
			}
			this.state = 304
			typeEx(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 306
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 305
				match(FOLDING) as Token
				}
			}

			this.state = 308
			opIdWrap()
			this.state = 310
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 309
				typeParam()
				}
			}

			this.state = 312
			opParameter()
			this.state = 313
			typeEx(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 316
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 315
				match(FOLDING) as Token
				}
			}

			this.state = 318
			aopIdWrap()
			this.state = 320
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 319
				typeParam()
				}
			}

			this.state = 322
			aopParameter()
			this.state = 323
			typeEx(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 326
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 325
				match(FOLDING) as Token
				}
			}

			this.state = 328
			match(ID) as Token
			this.state = 330
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 329
				typeParam()
				}
			}

			this.state = 335
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,41,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 332
					parameter()
					}
					} 
				}
				this.state = 337
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,41,context)
			}
			this.state = 339
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 338
				typeEx(0)
				}
			}

			this.state = 341
			match(ASSGIN) as Token
			this.state = 342
			value(0)
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 344
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 343
				match(FOLDING) as Token
				}
			}

			this.state = 346
			opIdWrap()
			this.state = 348
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 347
				typeParam()
				}
			}

			this.state = 350
			opParameter()
			this.state = 352
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 351
				typeEx(0)
				}
			}

			this.state = 354
			match(ASSGIN) as Token
			this.state = 355
			value(0)
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 358
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 357
				match(FOLDING) as Token
				}
			}

			this.state = 360
			aopIdWrap()
			this.state = 362
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 361
				typeParam()
				}
			}

			this.state = 364
			aopParameter()
			this.state = 366
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 365
				typeEx(0)
				}
			}

			this.state = 368
			match(ASSGIN) as Token
			this.state = 369
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

	open class TypeParamContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeParam.id
	        set(value) { throw RuntimeException() }
		fun LSQUARE() : List<TerminalNode> = getTokens(FoldingParser.Tokens.LSQUARE.id)
		fun LSQUARE(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.LSQUARE.id, i) as TerminalNode
		fun findTypeParamCompo() : List<TypeParamCompoContext> = getRuleContexts(solver.getType("TypeParamCompoContext"))
		fun findTypeParamCompo(i: Int) : TypeParamCompoContext? = getRuleContext(solver.getType("TypeParamCompoContext"),i)
		fun RSQUARE() : List<TerminalNode> = getTokens(FoldingParser.Tokens.RSQUARE.id)
		fun RSQUARE(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.RSQUARE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeParam() : TypeParamContext {
		var _localctx : TypeParamContext = TypeParamContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_typeParam.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 377 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 373
				match(LSQUARE) as Token
				this.state = 374
				typeParamCompo()
				this.state = 375
				match(RSQUARE) as Token
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 379 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,50,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
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
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		fun findTypeParamTypeClassBound() : List<TypeParamTypeClassBoundContext> = getRuleContexts(solver.getType("TypeParamTypeClassBoundContext"))
		fun findTypeParamTypeClassBound(i: Int) : TypeParamTypeClassBoundContext? = getRuleContext(solver.getType("TypeParamTypeClassBoundContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeParamCompo() : TypeParamCompoContext {
		var _localctx : TypeParamCompoContext = TypeParamCompoContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_typeParamCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 381
			match(ID) as Token
			this.state = 389
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 382
				match(TILDE) as Token
				this.state = 385 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					this.state = 385
					errorHandler.sync(this)
					when (_input!!.LA(1)) {
					LPAREN , ID  ->  /*LL1AltBlock*/{if (true){
					this.state = 383
					typeEx(0)
					}}
					LSQUARE  ->  /*LL1AltBlock*/{if (true){
					this.state = 384
					typeParamTypeClassBound()
					}}
					else -> throw NoViableAltException(this)
					}
					}
					this.state = 387 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ID))) != 0L) )
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

	open class TypeParamTypeClassBoundContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeParamTypeClassBound.id
	        set(value) { throw RuntimeException() }
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeParamTypeClassBound() : TypeParamTypeClassBoundContext {
		var _localctx : TypeParamTypeClassBoundContext = TypeParamTypeClassBoundContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_typeParamTypeClassBound.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 391
			match(LSQUARE) as Token
			this.state = 392
			typeEx(0)
			this.state = 393
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

	open class TypeParamOnTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeParamOnType.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun ID() : List<TerminalNode> = getTokens(FoldingParser.Tokens.ID.id)
		fun ID(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.ID.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeParamOnType() : TypeParamOnTypeContext {
		var _localctx : TypeParamOnTypeContext = TypeParamOnTypeContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_typeParamOnType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 395
			match(LPAREN) as Token
			this.state = 397 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 396
				match(ID) as Token
				}
				}
				this.state = 399 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==ID )
			this.state = 401
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

	open class TypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_type.id
	        set(value) { throw RuntimeException() }
		fun TYPE() : TerminalNode? = getToken(FoldingParser.Tokens.TYPE.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeParamOnType() : TypeParamOnTypeContext? = getRuleContext(solver.getType("TypeParamOnTypeContext"),0)
		fun findTypeDefBody() : TypeDefBodyContext? = getRuleContext(solver.getType("TypeDefBodyContext"),0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  type() : TypeContext {
		var _localctx : TypeContext = TypeContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_type.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 403
			match(TYPE) as Token
			this.state = 404
			match(ID) as Token
			this.state = 405
			typeParamOnType()
			this.state = 412
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 406
				match(TILDE) as Token
				this.state = 408 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 407
					typeEx(0)
					}
					}
					this.state = 410 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( _la==LPAREN || _la==ID )
				}
			}

			this.state = 414
			typeDefBody()
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

	open class TypeDefBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeDefBody.id
	        set(value) { throw RuntimeException() }
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findDefInType() : List<DefInTypeContext> = getRuleContexts(solver.getType("DefInTypeContext"))
		fun findDefInType(i: Int) : DefInTypeContext? = getRuleContext(solver.getType("DefInTypeContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeDefBody() : TypeDefBodyContext {
		var _localctx : TypeDefBodyContext = TypeDefBodyContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_typeDefBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 416
			match(LBRACE) as Token
			this.state = 420
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 417
				defInType()
				}
				}
				this.state = 422
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 423
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

	open class DefInTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_defInType.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameterInType() : List<ParameterInTypeContext> = getRuleContexts(solver.getType("ParameterInTypeContext"))
		fun findParameterInType(i: Int) : ParameterInTypeContext? = getRuleContext(solver.getType("ParameterInTypeContext"),i)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findOpParameterInType() : OpParameterInTypeContext? = getRuleContext(solver.getType("OpParameterInTypeContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findAopParameterInType() : AopParameterInTypeContext? = getRuleContext(solver.getType("AopParameterInTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defInType() : DefInTypeContext {
		var _localctx : DefInTypeContext = DefInTypeContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_defInType.id)
		var _la: Int
		try {
			var _alt: Int
			this.state = 450
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,62,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 425
			match(ID) as Token
			this.state = 427
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 426
				typeParam()
				}
			}

			this.state = 432
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,59,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 429
					parameterInType()
					}
					} 
				}
				this.state = 434
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,59,context)
			}
			this.state = 435
			typeEx(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 436
			opIdWrap()
			this.state = 438
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 437
				typeParam()
				}
			}

			this.state = 440
			opParameterInType()
			this.state = 441
			typeEx(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 443
			aopIdWrap()
			this.state = 445
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 444
				typeParam()
				}
			}

			this.state = 447
			aopParameterInType()
			this.state = 448
			typeEx(0)
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

	open class ParamExInTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_paramExInType.id
	        set(value) { throw RuntimeException() }
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ELLIPSIS() : TerminalNode? = getToken(FoldingParser.Tokens.ELLIPSIS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramExInType() : ParamExInTypeContext {
		var _localctx : ParamExInTypeContext = ParamExInTypeContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_paramExInType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 452
			typeEx(0)
			this.state = 454
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 453
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

	open class ParameterInTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameterInType.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findParamExInType() : List<ParamExInTypeContext> = getRuleContexts(solver.getType("ParamExInTypeContext"))
		fun findParamExInType(i: Int) : ParamExInTypeContext? = getRuleContext(solver.getType("ParamExInTypeContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parameterInType() : ParameterInTypeContext {
		var _localctx : ParameterInTypeContext = ParameterInTypeContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_parameterInType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 456
			match(LPAREN) as Token
			this.state = 460
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN || _la==ID) {
				if (true){
				if (true){
				this.state = 457
				paramExInType()
				}
				}
				this.state = 462
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 463
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

	open class OpParameterInTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opParameterInType.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParamExInType() : List<ParamExInTypeContext> = getRuleContexts(solver.getType("ParamExInTypeContext"))
		fun findParamExInType(i: Int) : ParamExInTypeContext? = getRuleContext(solver.getType("ParamExInTypeContext"),i)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  opParameterInType() : OpParameterInTypeContext {
		var _localctx : OpParameterInTypeContext = OpParameterInTypeContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_opParameterInType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 465
			match(LPAREN) as Token
			this.state = 466
			paramExInType()
			this.state = 467
			paramExInType()
			this.state = 468
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

	open class AopParameterInTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_aopParameterInType.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParamExInType() : ParamExInTypeContext? = getRuleContext(solver.getType("ParamExInTypeContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  aopParameterInType() : AopParameterInTypeContext {
		var _localctx : AopParameterInTypeContext = AopParameterInTypeContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_aopParameterInType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 470
			match(LPAREN) as Token
			this.state = 471
			paramExInType()
			this.state = 472
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

	open class ImplContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_impl.id
	        set(value) { throw RuntimeException() }
		fun IMPL() : TerminalNode? = getToken(FoldingParser.Tokens.IMPL.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findImplBody() : ImplBodyContext? = getRuleContext(solver.getType("ImplBodyContext"),0)
		fun findTypeParam() : List<TypeParamContext> = getRuleContexts(solver.getType("TypeParamContext"))
		fun findTypeParam(i: Int) : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  impl() : ImplContext {
		var _localctx : ImplContext = ImplContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_impl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 474
			match(IMPL) as Token
			this.state = 478
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE) {
				if (true){
				if (true){
				this.state = 475
				typeParam()
				}
				}
				this.state = 480
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 481
			typeEx(0)
			this.state = 482
			implBody()
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

	open class ImplBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_implBody.id
	        set(value) { throw RuntimeException() }
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findDefInImpl() : List<DefInImplContext> = getRuleContexts(solver.getType("DefInImplContext"))
		fun findDefInImpl(i: Int) : DefInImplContext? = getRuleContext(solver.getType("DefInImplContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  implBody() : ImplBodyContext {
		var _localctx : ImplBodyContext = ImplBodyContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_implBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 484
			match(LBRACE) as Token
			this.state = 488
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl FOLDING) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				if (true){
				this.state = 485
				defInImpl()
				}
				}
				this.state = 490
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 491
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

	open class ParamExInImplContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_paramExInImpl.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramExInImpl() : ParamExInImplContext {
		var _localctx : ParamExInImplContext = ParamExInImplContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_paramExInImpl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 493
			match(ID) as Token
			this.state = 496
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 494
				match(ASSGIN) as Token
				this.state = 495
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

	open class ParameterInImplContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameterInImpl.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findParamExInImpl() : List<ParamExInImplContext> = getRuleContexts(solver.getType("ParamExInImplContext"))
		fun findParamExInImpl(i: Int) : ParamExInImplContext? = getRuleContext(solver.getType("ParamExInImplContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parameterInImpl() : ParameterInImplContext {
		var _localctx : ParameterInImplContext = ParameterInImplContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_parameterInImpl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 498
			match(LPAREN) as Token
			this.state = 502
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 499
				paramExInImpl()
				}
				}
				this.state = 504
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 505
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

	open class OpParameterInImplContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opParameterInImpl.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParamExInImpl() : List<ParamExInImplContext> = getRuleContexts(solver.getType("ParamExInImplContext"))
		fun findParamExInImpl(i: Int) : ParamExInImplContext? = getRuleContext(solver.getType("ParamExInImplContext"),i)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  opParameterInImpl() : OpParameterInImplContext {
		var _localctx : OpParameterInImplContext = OpParameterInImplContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_opParameterInImpl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 507
			match(LPAREN) as Token
			this.state = 508
			paramExInImpl()
			this.state = 509
			paramExInImpl()
			this.state = 510
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

	open class AopParameterInImplContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_aopParameterInImpl.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParamExInImpl() : ParamExInImplContext? = getRuleContext(solver.getType("ParamExInImplContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  aopParameterInImpl() : AopParameterInImplContext {
		var _localctx : AopParameterInImplContext = AopParameterInImplContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_aopParameterInImpl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 512
			match(LPAREN) as Token
			this.state = 513
			paramExInImpl()
			this.state = 514
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

	open class DefInImplContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_defInImpl.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun FOLDING() : TerminalNode? = getToken(FoldingParser.Tokens.FOLDING.id, 0)
		fun findParameterInImpl() : List<ParameterInImplContext> = getRuleContexts(solver.getType("ParameterInImplContext"))
		fun findParameterInImpl(i: Int) : ParameterInImplContext? = getRuleContext(solver.getType("ParameterInImplContext"),i)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findOpParameterInImpl() : OpParameterInImplContext? = getRuleContext(solver.getType("OpParameterInImplContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findAopParameterInImpl() : AopParameterInImplContext? = getRuleContext(solver.getType("AopParameterInImplContext"),0)
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defInImpl() : DefInImplContext {
		var _localctx : DefInImplContext = DefInImplContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_defInImpl.id)
		var _la: Int
		try {
			this.state = 561
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,76,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 517
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 516
				match(FOLDING) as Token
				}
			}

			this.state = 519
			match(ID) as Token
			this.state = 523
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN) {
				if (true){
				if (true){
				this.state = 520
				parameterInImpl()
				}
				}
				this.state = 525
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 526
			match(ASSGIN) as Token
			this.state = 527
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 529
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 528
				match(FOLDING) as Token
				}
			}

			this.state = 531
			opIdWrap()
			this.state = 532
			opParameterInImpl()
			this.state = 533
			match(ASSGIN) as Token
			this.state = 534
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 537
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 536
				match(FOLDING) as Token
				}
			}

			this.state = 539
			aopIdWrap()
			this.state = 540
			aopParameterInImpl()
			this.state = 541
			match(ASSGIN) as Token
			this.state = 542
			value(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 545
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 544
				match(FOLDING) as Token
				}
			}

			this.state = 547
			match(ID) as Token
			this.state = 548
			match(FOREIGN) as Token
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 550
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 549
				match(FOLDING) as Token
				}
			}

			this.state = 552
			opIdWrap()
			this.state = 553
			match(FOREIGN) as Token
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 556
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 555
				match(FOLDING) as Token
				}
			}

			this.state = 558
			aopIdWrap()
			this.state = 559
			match(FOREIGN) as Token
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

	open class DefinitionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_definition.id
	        set(value) { throw RuntimeException() }
		fun findDef() : DefContext? = getRuleContext(solver.getType("DefContext"),0)
		fun findVal_() : Val_Context? = getRuleContext(solver.getType("Val_Context"),0)
		fun findVar_() : Var_Context? = getRuleContext(solver.getType("Var_Context"),0)
		fun findType() : TypeContext? = getRuleContext(solver.getType("TypeContext"),0)
		fun findImpl() : ImplContext? = getRuleContext(solver.getType("ImplContext"),0)
		fun findData() : DataContext? = getRuleContext(solver.getType("DataContext"),0)
		fun findInterface_() : Interface_Context? = getRuleContext(solver.getType("Interface_Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  definition() : DefinitionContext {
		var _localctx : DefinitionContext = DefinitionContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_definition.id)
		try {
			this.state = 570
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOLDING , LSQUARE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 563
			def()
			}}
			VAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 564
			val_()
			}}
			VAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 565
			var_()
			}}
			TYPE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 566
			type()
			}}
			IMPL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 567
			impl()
			}}
			DATA  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 568
			data()
			}}
			INTERFACE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 569
			interface_()
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

	open class ValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_value.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun DOT() : TerminalNode? = getToken(FoldingParser.Tokens.DOT.id, 0)
		fun findTypeCasting() : TypeCastingContext? = getRuleContext(solver.getType("TypeCastingContext"),0)
		fun Integer() : TerminalNode? = getToken(FoldingParser.Tokens.Integer.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun Double() : TerminalNode? = getToken(FoldingParser.Tokens.Double.id, 0)
		fun String() : TerminalNode? = getToken(FoldingParser.Tokens.String.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findBody() : BodyContext? = getRuleContext(solver.getType("BodyContext"),0)
		fun findLambda() : LambdaContext? = getRuleContext(solver.getType("LambdaContext"),0)
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
		var _startState : Int = 78
		enterRecursionRule(_localctx, 78, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 652
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,92,context) ) {
			1 -> {if (true){
			this.state = 576
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,78,context) ) {
			1   -> if (true){
			this.state = 573
			package_()
			this.state = 574
			match(DOT) as Token
			}
			}
			this.state = 578
			match(ID) as Token
			this.state = 580
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,79,context) ) {
			1   -> if (true){
			this.state = 579
			typeCasting()
			}
			}
			}}
			2 -> {if (true){
			this.state = 582
			match(Integer) as Token
			}}
			3 -> {if (true){
			this.state = 583
			match(LPAREN) as Token
			this.state = 584
			match(Integer) as Token
			this.state = 585
			match(RPAREN) as Token
			this.state = 587
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,80,context) ) {
			1   -> if (true){
			this.state = 586
			typeCasting()
			}
			}
			}}
			4 -> {if (true){
			this.state = 589
			match(Double) as Token
			}}
			5 -> {if (true){
			this.state = 590
			match(LPAREN) as Token
			this.state = 591
			match(Double) as Token
			this.state = 592
			match(RPAREN) as Token
			this.state = 594
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,81,context) ) {
			1   -> if (true){
			this.state = 593
			typeCasting()
			}
			}
			}}
			6 -> {if (true){
			this.state = 596
			match(String) as Token
			}}
			7 -> {if (true){
			this.state = 597
			match(LPAREN) as Token
			this.state = 598
			match(String) as Token
			this.state = 599
			match(RPAREN) as Token
			this.state = 601
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,82,context) ) {
			1   -> if (true){
			this.state = 600
			typeCasting()
			}
			}
			}}
			8 -> {if (true){
			this.state = 603
			match(LPAREN) as Token
			this.state = 604
			value(0)
			this.state = 605
			argValue()
			this.state = 606
			match(RPAREN) as Token
			this.state = 608
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,83,context) ) {
			1   -> if (true){
			this.state = 607
			typeCasting()
			}
			}
			}}
			9 -> {if (true){
			this.state = 610
			match(LPAREN) as Token
			this.state = 611
			value(0)
			this.state = 612
			match(OPID) as Token
			this.state = 613
			value(0)
			this.state = 614
			match(RPAREN) as Token
			this.state = 616
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,84,context) ) {
			1   -> if (true){
			this.state = 615
			typeCasting()
			}
			}
			}}
			10 -> {if (true){
			this.state = 618
			match(OPID) as Token
			this.state = 619
			value(7)
			}}
			11 -> {if (true){
			this.state = 620
			match(LPAREN) as Token
			this.state = 621
			match(OPID) as Token
			this.state = 622
			value(0)
			this.state = 624
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,85,context) ) {
			1   -> if (true){
			this.state = 623
			typeCasting()
			}
			}
			}}
			12 -> {if (true){
			this.state = 629
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 626
				package_()
				this.state = 627
				match(DOT) as Token
				}
			}

			this.state = 631
			opIdWrap()
			this.state = 633
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,87,context) ) {
			1   -> if (true){
			this.state = 632
			typeCasting()
			}
			}
			}}
			13 -> {if (true){
			this.state = 638
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 635
				package_()
				this.state = 636
				match(DOT) as Token
				}
			}

			this.state = 640
			aopIdWrap()
			this.state = 642
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,89,context) ) {
			1   -> if (true){
			this.state = 641
			typeCasting()
			}
			}
			}}
			14 -> {if (true){
			this.state = 644
			body()
			this.state = 646
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,90,context) ) {
			1   -> if (true){
			this.state = 645
			typeCasting()
			}
			}
			}}
			15 -> {if (true){
			this.state = 648
			lambda()
			this.state = 650
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,91,context) ) {
			1   -> if (true){
			this.state = 649
			typeCasting()
			}
			}
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 667
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,95,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 665
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,94,context) ) {
					1 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 654
					if (!(precpred(context!!, 9))) throw FailedPredicateException(this, "precpred(context!!, 9)")
					this.state = 655
					match(OPID) as Token
					this.state = 656
					value(10)
					}}
					2 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 657
					if (!(precpred(context!!, 11))) throw FailedPredicateException(this, "precpred(context!!, 11)")
					this.state = 658
					argValue()
					}}
					3 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 659
					if (!(precpred(context!!, 5))) throw FailedPredicateException(this, "precpred(context!!, 5)")
					this.state = 660
					match(DOT) as Token
					this.state = 661
					value(0)
					this.state = 663
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,93,context) ) {
					1   -> if (true){
					this.state = 662
					typeCasting()
					}
					}
					}}
					}
					} 
				}
				this.state = 669
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,95,context)
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
		enterRule(_localctx, 80, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 670
			match(AS) as Token
			this.state = 671
			typeEx(0)
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
		fun ELLIPSIS() : TerminalNode? = getToken(FoldingParser.Tokens.ELLIPSIS.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramEx() : ParamExContext {
		var _localctx : ParamExContext = ParamExContext(context, state)
		enterRule(_localctx, 82, Rules.RULE_paramEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 673
			match(ID) as Token
			this.state = 674
			typeEx(0)
			this.state = 676
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 675
				match(ELLIPSIS) as Token
				}
			}

			this.state = 680
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 678
				match(ASSGIN) as Token
				this.state = 679
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findParamEx() : List<ParamExContext> = getRuleContexts(solver.getType("ParamExContext"))
		fun findParamEx(i: Int) : ParamExContext? = getRuleContext(solver.getType("ParamExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parameter() : ParameterContext {
		var _localctx : ParameterContext = ParameterContext(context, state)
		enterRule(_localctx, 84, Rules.RULE_parameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 682
			match(LPAREN) as Token
			this.state = 686
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 683
				paramEx()
				}
				}
				this.state = 688
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 689
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

	open class OpParameterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opParameter.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParamEx() : List<ParamExContext> = getRuleContexts(solver.getType("ParamExContext"))
		fun findParamEx(i: Int) : ParamExContext? = getRuleContext(solver.getType("ParamExContext"),i)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  opParameter() : OpParameterContext {
		var _localctx : OpParameterContext = OpParameterContext(context, state)
		enterRule(_localctx, 86, Rules.RULE_opParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 691
			match(LPAREN) as Token
			this.state = 692
			paramEx()
			this.state = 693
			paramEx()
			this.state = 694
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

	open class AopParameterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_aopParameter.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParamEx() : ParamExContext? = getRuleContext(solver.getType("ParamExContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  aopParameter() : AopParameterContext {
		var _localctx : AopParameterContext = AopParameterContext(context, state)
		enterRule(_localctx, 88, Rules.RULE_aopParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 696
			match(LPAREN) as Token
			this.state = 697
			paramEx()
			this.state = 698
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

	open class ArgExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_argEx.id
	        set(value) { throw RuntimeException() }
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  argEx() : ArgExContext {
		var _localctx : ArgExContext = ArgExContext(context, state)
		enterRule(_localctx, 90, Rules.RULE_argEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 702
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,99,context) ) {
			1   -> if (true){
			this.state = 700
			match(ID) as Token
			this.state = 701
			match(ASSGIN) as Token
			}
			}
			this.state = 704
			value(0)
			this.state = 707
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 705
				match(TILDE) as Token
				this.state = 706
				typeEx(0)
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

	open class ArgValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_argValue.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findArgEx() : List<ArgExContext> = getRuleContexts(solver.getType("ArgExContext"))
		fun findArgEx(i: Int) : ArgExContext? = getRuleContext(solver.getType("ArgExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  argValue() : ArgValueContext {
		var _localctx : ArgValueContext = ArgValueContext(context, state)
		enterRule(_localctx, 92, Rules.RULE_argValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 709
			match(LPAREN) as Token
			this.state = 713
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 710
				argEx()
				}
				}
				this.state = 715
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 716
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
		fun VAL() : TerminalNode? = getToken(FoldingParser.Tokens.VAL.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  val_() : Val_Context {
		var _localctx : Val_Context = Val_Context(context, state)
		enterRule(_localctx, 94, Rules.RULE_val_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 718
			match(VAL) as Token
			this.state = 719
			match(ID) as Token
			this.state = 721
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 720
				typeEx(0)
				}
			}

			this.state = 723
			match(ASSGIN) as Token
			this.state = 724
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

	open class Var_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_var_.id
	        set(value) { throw RuntimeException() }
		fun VAR() : TerminalNode? = getToken(FoldingParser.Tokens.VAR.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  var_() : Var_Context {
		var _localctx : Var_Context = Var_Context(context, state)
		enterRule(_localctx, 96, Rules.RULE_var_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 726
			match(VAR) as Token
			this.state = 727
			match(ID) as Token
			this.state = 729
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 728
				typeEx(0)
				}
			}

			this.state = 731
			match(ASSGIN) as Token
			this.state = 732
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
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun FOLDING() : TerminalNode? = getToken(FoldingParser.Tokens.FOLDING.id, 0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : List<ParameterContext> = getRuleContexts(solver.getType("ParameterContext"))
		fun findParameter(i: Int) : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),i)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findOpParameter() : OpParameterContext? = getRuleContext(solver.getType("OpParameterContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findAopParameter() : AopParameterContext? = getRuleContext(solver.getType("AopParameterContext"),0)
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun findParameterInType() : List<ParameterInTypeContext> = getRuleContexts(solver.getType("ParameterInTypeContext"))
		fun findParameterInType(i: Int) : ParameterInTypeContext? = getRuleContext(solver.getType("ParameterInTypeContext"),i)
		fun findOpParameterInType() : OpParameterInTypeContext? = getRuleContext(solver.getType("OpParameterInTypeContext"),0)
		fun findAopParameterInType() : AopParameterInTypeContext? = getRuleContext(solver.getType("AopParameterInTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  def() : DefContext {
		var _localctx : DefContext = DefContext(context, state)
		enterRule(_localctx, 98, Rules.RULE_def.id)
		var _la: Int
		try {
			var _alt: Int
			this.state = 817
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,121,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 735
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 734
				match(FOLDING) as Token
				}
			}

			this.state = 737
			match(ID) as Token
			this.state = 739
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 738
				typeParam()
				}
			}

			this.state = 744
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,106,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 741
					parameter()
					}
					} 
				}
				this.state = 746
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,106,context)
			}
			this.state = 748
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 747
				typeEx(0)
				}
			}

			this.state = 750
			match(ASSGIN) as Token
			this.state = 751
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 753
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 752
				match(FOLDING) as Token
				}
			}

			this.state = 755
			opIdWrap()
			this.state = 757
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 756
				typeParam()
				}
			}

			this.state = 759
			opParameter()
			this.state = 761
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 760
				typeEx(0)
				}
			}

			this.state = 763
			match(ASSGIN) as Token
			this.state = 764
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 767
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 766
				match(FOLDING) as Token
				}
			}

			this.state = 769
			aopIdWrap()
			this.state = 771
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 770
				typeParam()
				}
			}

			this.state = 773
			aopParameter()
			this.state = 775
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 774
				typeEx(0)
				}
			}

			this.state = 777
			match(ASSGIN) as Token
			this.state = 778
			value(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 781
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 780
				match(FOLDING) as Token
				}
			}

			this.state = 783
			match(ID) as Token
			this.state = 785
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 784
				typeParam()
				}
			}

			this.state = 787
			match(FOREIGN) as Token
			this.state = 791
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,116,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 788
					parameterInType()
					}
					} 
				}
				this.state = 793
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,116,context)
			}
			this.state = 794
			typeEx(0)
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 796
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 795
				match(FOLDING) as Token
				}
			}

			this.state = 798
			opIdWrap()
			this.state = 800
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 799
				typeParam()
				}
			}

			this.state = 802
			match(FOREIGN) as Token
			this.state = 803
			opParameterInType()
			this.state = 804
			typeEx(0)
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 807
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FOLDING) {
				if (true){
				this.state = 806
				match(FOLDING) as Token
				}
			}

			this.state = 809
			aopIdWrap()
			this.state = 811
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 810
				typeParam()
				}
			}

			this.state = 813
			match(FOREIGN) as Token
			this.state = 814
			aopParameterInType()
			this.state = 815
			typeEx(0)
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
		enterRule(_localctx, 100, Rules.RULE_lambdaParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 819
			match(ID) as Token
			this.state = 825
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 820
				match(TILDE) as Token
				this.state = 821
				typeEx(0)
				this.state = 823
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==ELLIPSIS) {
					if (true){
					this.state = 822
					match(ELLIPSIS) as Token
					}
				}

				}
			}

			this.state = 829
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 827
				match(ASSGIN) as Token
				this.state = 828
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
		fun findLambdaParamEx() : List<LambdaParamExContext> = getRuleContexts(solver.getType("LambdaParamExContext"))
		fun findLambdaParamEx(i: Int) : LambdaParamExContext? = getRuleContext(solver.getType("LambdaParamExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  lambda() : LambdaContext {
		var _localctx : LambdaContext = LambdaContext(context, state)
		enterRule(_localctx, 102, Rules.RULE_lambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 831
			match(LSQUARE) as Token
			this.state = 835
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 832
				lambdaParamEx()
				}
				}
				this.state = 837
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 838
			match(RSQUARE) as Token
			this.state = 839
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
		enterRule(_localctx, 104, Rules.RULE_opIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 841
			match(LSQUARE) as Token
			this.state = 842
			match(OPID) as Token
			this.state = 843
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
		enterRule(_localctx, 106, Rules.RULE_aopIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 845
			match(LSQUARE) as Token
			this.state = 846
			match(TILDE) as Token
			this.state = 847
			match(OPID) as Token
			this.state = 848
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		fun ARROW() : TerminalNode? = getToken(FoldingParser.Tokens.ARROW.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findTypeExSingle() : TypeExSingleContext? = getRuleContext(solver.getType("TypeExSingleContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	 fun typeEx() : TypeExContext {
		return typeEx(0);
	}

	private fun typeEx(_p: Int) : TypeExContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : TypeExContext= TypeExContext(context, _parentState)
		var _prevctx : TypeExContext= _localctx
		var _startState : Int = 108
		enterRecursionRule(_localctx, 108, Rules.RULE_typeEx.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 858
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{if (true){
			this.state = 851
			match(LPAREN) as Token
			this.state = 852
			typeEx(0)
			this.state = 853
			match(ARROW) as Token
			this.state = 854
			typeEx(0)
			this.state = 855
			match(RPAREN) as Token
			}}
			ID  ->  /*LL1AltBlock*/{if (true){
			this.state = 857
			typeExSingle()
			}}
			else -> throw NoViableAltException(this)
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 865
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,127,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = TypeExContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_typeEx.id)
					this.state = 860
					if (!(precpred(context!!, 2))) throw FailedPredicateException(this, "precpred(context!!, 2)")
					this.state = 861
					match(ARROW) as Token
					this.state = 862
					typeEx(3)
					}
					} 
				}
				this.state = 867
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,127,context)
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
		enterRule(_localctx, 110, Rules.RULE_typeExSingle.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 871
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,128,context) ) {
			1   -> if (true){
			this.state = 868
			package_()
			this.state = 869
			match(DOT) as Token
			}
			}
			this.state = 873
			match(ID) as Token
			this.state = 882
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,130,context) ) {
			1   -> if (true){
			this.state = 874
			match(LPAREN) as Token
			this.state = 876 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 875
				typeEx(0)
				}
				}
				this.state = 878 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==LPAREN || _la==ID )
			this.state = 880
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

	override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		39 -> return value_sempred(_localctx as ValueContext, predIndex)
		54 -> return typeEx_sempred(_localctx as TypeExContext, predIndex)
		}
		return true
	}
	private fun value_sempred( _localctx : ValueContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 9)
		    1 -> return precpred(context!!, 11)
		    2 -> return precpred(context!!, 5)
		}
		return true
	}
	private fun typeEx_sempred( _localctx : TypeExContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    3 -> return precpred(context!!, 2)
		}
		return true
	}

}