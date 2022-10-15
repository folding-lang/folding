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
                                                              FoldingParser.ImportBodyContext::class,
                                                              FoldingParser.ImportElementContext::class,
                                                              FoldingParser.Package_Context::class,
                                                              FoldingParser.NamespaceContext::class,
                                                              FoldingParser.BodyContext::class,
                                                              FoldingParser.CompoContext::class,
                                                              FoldingParser.DefinitionInBodyContext::class,
                                                              FoldingParser.ReturningContext::class,
                                                              FoldingParser.Class_Context::class,
                                                              FoldingParser.ClassBodyContext::class,
                                                              FoldingParser.DefinitionInClassContext::class,
                                                              FoldingParser.AbstractDefinitionInClassContext::class,
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
                                                              FoldingParser.TypeParamOnTypeclassContext::class,
                                                              FoldingParser.TypeclassContext::class,
                                                              FoldingParser.TypeclassDefBodyContext::class,
                                                              FoldingParser.DefInTypeclassContext::class,
                                                              FoldingParser.ParamExInTypeclassContext::class,
                                                              FoldingParser.ParameterInTypeclassContext::class,
                                                              FoldingParser.OpParameterInTypeclassContext::class,
                                                              FoldingParser.AopParameterInTypeclassContext::class,
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
                                                              FoldingParser.TypeExSingleContext::class,
                                                              FoldingParser.ForeignContext::class,
                                                              FoldingParser.ForeignAutoTypedContext::class,
                                                              FoldingParser.ForeignBodyContext::class,
                                                              FoldingParser.ForeignElementContext::class,
                                                              FoldingParser.ForeignPlatformContext::class)
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
        DATA(6),
        EXTERNAL(7),
        FOREIGN(8),
        NAMESPACE(9),
        OVERRIDE(10),
        INTERNAL(11),
        IMPORT(12),
        IMPL(13),
        RETURN(14),
        TYPECLASS(15),
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
        RSQUARE(26),
        LBRACE(27),
        RBRACE(28),
        ARROW(29),
        TILDE(30),
        ID(31),
        OPID(32),
        Integer(33),
        Double(34),
        String(35),
        RawString(36)
    }

    enum class Rules(val id: Int) {
        RULE_file(0),
        RULE_importEx(1),
        RULE_importVanila(2),
        RULE_importBody(3),
        RULE_importElement(4),
        RULE_package_(5),
        RULE_namespace(6),
        RULE_body(7),
        RULE_compo(8),
        RULE_definitionInBody(9),
        RULE_returning(10),
        RULE_class_(11),
        RULE_classBody(12),
        RULE_definitionInClass(13),
        RULE_abstractDefinitionInClass(14),
        RULE_staticDefinition(15),
        RULE_constuctor(16),
        RULE_interface_(17),
        RULE_interfaceBody(18),
        RULE_propertyInInterface(19),
        RULE_valInInterface(20),
        RULE_varInInterface(21),
        RULE_defInInterface(22),
        RULE_typeParam(23),
        RULE_typeParamCompo(24),
        RULE_typeParamOnTypeclass(25),
        RULE_typeclass(26),
        RULE_typeclassDefBody(27),
        RULE_defInTypeclass(28),
        RULE_paramExInTypeclass(29),
        RULE_parameterInTypeclass(30),
        RULE_opParameterInTypeclass(31),
        RULE_aopParameterInTypeclass(32),
        RULE_impl(33),
        RULE_implBody(34),
        RULE_paramExInImpl(35),
        RULE_parameterInImpl(36),
        RULE_opParameterInImpl(37),
        RULE_aopParameterInImpl(38),
        RULE_defInImpl(39),
        RULE_definition(40),
        RULE_value(41),
        RULE_typeCasting(42),
        RULE_paramEx(43),
        RULE_parameter(44),
        RULE_opParameter(45),
        RULE_aopParameter(46),
        RULE_argEx(47),
        RULE_argValue(48),
        RULE_val_(49),
        RULE_var_(50),
        RULE_def(51),
        RULE_lambdaParamEx(52),
        RULE_lambda(53),
        RULE_opIdWrap(54),
        RULE_aopIdWrap(55),
        RULE_typeEx(56),
        RULE_typeExSingle(57),
        RULE_foreign(58),
        RULE_foreignAutoTyped(59),
        RULE_foreignBody(60),
        RULE_foreignElement(61),
        RULE_foreignPlatform(62)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "importEx", "importVanila", "importBody", 
                                "importElement", "package_", "namespace", 
                                "body", "compo", "definitionInBody", "returning", 
                                "class_", "classBody", "definitionInClass", 
                                "abstractDefinitionInClass", "staticDefinition", 
                                "constuctor", "interface_", "interfaceBody", 
                                "propertyInInterface", "valInInterface", 
                                "varInInterface", "defInInterface", "typeParam", 
                                "typeParamCompo", "typeParamOnTypeclass", 
                                "typeclass", "typeclassDefBody", "defInTypeclass", 
                                "paramExInTypeclass", "parameterInTypeclass", 
                                "opParameterInTypeclass", "aopParameterInTypeclass", 
                                "impl", "implBody", "paramExInImpl", "parameterInImpl", 
                                "opParameterInImpl", "aopParameterInImpl", 
                                "defInImpl", "definition", "value", "typeCasting", 
                                "paramEx", "parameter", "opParameter", "aopParameter", 
                                "argEx", "argValue", "val_", "var_", "def", 
                                "lambdaParamEx", "lambda", "opIdWrap", "aopIdWrap", 
                                "typeEx", "typeExSingle", "foreign", "foreignAutoTyped", 
                                "foreignBody", "foreignElement", "foreignPlatform")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
                                                          null, "'as'", 
                                                          "'abstract'", 
                                                          "'data'", "'external'", 
                                                          "'foreign'", "'package'", 
                                                          "'override'", 
                                                          "'internal'", 
                                                          "'import'", "'impl'", 
                                                          "'return'", "'class'", 
                                                          "'var'", "'val'", 
                                                          "'static'", "'interface'", 
                                                          "'='", "'...'", 
                                                          "'.'", "'('", 
                                                          "')'", "'['", 
                                                          "']'", "'{'", 
                                                          "'}'", "'->'", 
                                                          "'~'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "WS", "COMMENT", 
                                                           "LINE_COMMENT", 
                                                           "AS", "ABSTRACT", 
                                                           "DATA", "EXTERNAL", 
                                                           "FOREIGN", "NAMESPACE", 
                                                           "OVERRIDE", "INTERNAL", 
                                                           "IMPORT", "IMPL", 
                                                           "RETURN", "TYPECLASS", 
                                                           "VAR", "VAL", 
                                                           "STATIC", "INTERFACE", 
                                                           "ASSGIN", "ELLIPSIS", 
                                                           "DOT", "LPAREN", 
                                                           "RPAREN", "LSQUARE", 
                                                           "RSQUARE", "LBRACE", 
                                                           "RBRACE", "ARROW", 
                                                           "TILDE", "ID", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0026\u0378\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0003\u0002\u0005\u0002\u0082\u000a\u0002\u0003\u0002\u0007\u0002\u0085\u000a\u0002\u000c\u0002\u000e\u0002\u0088\u000b\u0002\u0003\u0002\u0007\u0002\u008b\u000a\u0002\u000c\u0002\u000e\u0002\u008e\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u0095\u000a\u0004\u0003\u0005\u0003\u0005\u0007\u0005\u0099\u000a\u0005\u000c\u0005\u000e\u0005\u009c\u000b\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00a3\u000a\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00a8\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u00ad\u000a\u0007\u000c\u0007\u000e\u0007\u00b0\u000b\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0007\u0009\u00b7\u000a\u0009\u000c\u0009\u000e\u0009\u00ba\u000b\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u00c1\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u00c9\u000a\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0005\u000d\u00cf\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00d4\u000a\u000d\u0003\u000d\u0003\u000d\u0006\u000d\u00d8\u000a\u000d\u000d\u000d\u000e\u000d\u00d9\u0005\u000d\u00dc\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0007\u000e\u00e2\u000a\u000e\u000c\u000e\u000e\u000e\u00e5\u000b\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0007\u000e\u00ea\u000a\u000e\u000c\u000e\u000e\u000e\u00ed\u000b\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0005\u000f\u00f2\u000a\u000f\u0003\u000f\u0005\u000f\u00f5\u000a\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00fb\u000a\u000f\u0003\u0010\u0005\u0010\u00fe\u000a\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u0102\u000a\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u010a\u000a\u0011\u0003\u0012\u0006\u0012\u010d\u000a\u0012\u000d\u0012\u000e\u0012\u010e\u0003\u0012\u0003\u0012\u0005\u0012\u0113\u000a\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0118\u000a\u0013\u0003\u0013\u0003\u0013\u0006\u0013\u011c\u000a\u0013\u000d\u0013\u000e\u0013\u011d\u0005\u0013\u0120\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014\u0128\u000a\u0014\u000c\u0014\u000e\u0014\u012b\u000b\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0005\u0015\u0131\u000a\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0005\u0018\u013d\u000a\u0018\u0003\u0018\u0007\u0018\u0140\u000a\u0018\u000c\u0018\u000e\u0018\u0143\u000b\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0148\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u014f\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0156\u000a\u0018\u0003\u0018\u0007\u0018\u0159\u000a\u0018\u000c\u0018\u000e\u0018\u015c\u000b\u0018\u0003\u0018\u0005\u0018\u015f\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0165\u000a\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0169\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0170\u000a\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0174\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0179\u000a\u0018\u0003\u0019\u0003\u0019\u0006\u0019\u017d\u000a\u0019\u000d\u0019\u000e\u0019\u017e\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0007\u001a\u0186\u000a\u001a\u000c\u001a\u000e\u001a\u0189\u000b\u001a\u0003\u001b\u0003\u001b\u0006\u001b\u018d\u000a\u001b\u000d\u001b\u000e\u001b\u018e\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0006\u001c\u0198\u000a\u001c\u000d\u001c\u000e\u001c\u0199\u0005\u001c\u019c\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0007\u001d\u01a2\u000a\u001d\u000c\u001d\u000e\u001d\u01a5\u000b\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0005\u001e\u01ab\u000a\u001e\u0003\u001e\u0007\u001e\u01ae\u000a\u001e\u000c\u001e\u000e\u001e\u01b1\u000b\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u01b6\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u01bd\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u01c2\u000a\u001e\u0003\u001f\u0003\u001f\u0005\u001f\u01c6\u000a\u001f\u0003\u0020\u0003\u0020\u0007\u0020\u01ca\u000a\u0020\u000c\u0020\u000e\u0020\u01cd\u000b\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0007\u0023\u01dc\u000a\u0023\u000c\u0023\u000e\u0023\u01df\u000b\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0007\u0024\u01e6\u000a\u0024\u000c\u0024\u000e\u0024\u01e9\u000b\u0024\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u01f0\u000a\u0025\u0003\u0026\u0003\u0026\u0007\u0026\u01f4\u000a\u0026\u000c\u0026\u000e\u0026\u01f7\u000b\u0026\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0007\u0029\u0206\u000a\u0029\u000c\u0029\u000e\u0029\u0209\u000b\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u021f\u000a\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0005\u002a\u0228\u000a\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u022e\u000a\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0232\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0239\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0240\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0247\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u024e\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0256\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u025e\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0263\u000a\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0267\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u026c\u000a\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0270\u000a\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0274\u000a\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0278\u000a\u002b\u0005\u002b\u027a\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0285\u000a\u002b\u0007\u002b\u0287\u000a\u002b\u000c\u002b\u000e\u002b\u028a\u000b\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0005\u002d\u0292\u000a\u002d\u0003\u002d\u0003\u002d\u0005\u002d\u0296\u000a\u002d\u0003\u002e\u0003\u002e\u0007\u002e\u029a\u000a\u002e\u000c\u002e\u000e\u002e\u029d\u000b\u002e\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0005\u0031\u02ac\u000a\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u02b1\u000a\u0031\u0003\u0032\u0003\u0032\u0007\u0032\u02b5\u000a\u0032\u000c\u0032\u000e\u0032\u02b8\u000b\u0032\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u02bf\u000a\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0034\u0005\u0034\u02c7\u000a\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035\u0005\u0035\u02ce\u000a\u0035\u0003\u0035\u0007\u0035\u02d1\u000a\u0035\u000c\u0035\u000e\u0035\u02d4\u000b\u0035\u0003\u0035\u0005\u0035\u02d7\u000a\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u02dd\u000a\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u02e1\u000a\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u02e8\u000a\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u02ec\u000a\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u02f3\u000a\u0035\u0003\u0035\u0007\u0035\u02f6\u000a\u0035\u000c\u0035\u000e\u0035\u02f9\u000b\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u02fe\u000a\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u0305\u000a\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u030a\u000a\u0035\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0005\u0036\u0310\u000a\u0036\u0005\u0036\u0312\u000a\u0036\u0003\u0036\u0003\u0036\u0005\u0036\u0316\u000a\u0036\u0003\u0037\u0003\u0037\u0007\u0037\u031a\u000a\u0037\u000c\u0037\u000e\u0037\u031d\u000b\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0005\u003a\u033d\u000a\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0007\u003a\u0342\u000a\u003a\u000c\u003a\u000e\u003a\u0345\u000b\u003a\u0003\u003b\u0003\u003b\u0003\u003b\u0005\u003b\u034a\u000a\u003b\u0003\u003b\u0003\u003b\u0003\u003b\u0006\u003b\u034f\u000a\u003b\u000d\u003b\u000e\u003b\u0350\u0003\u003b\u0003\u003b\u0005\u003b\u0355\u000a\u003b\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0005\u003c\u035d\u000a\u003c\u0003\u003d\u0003\u003d\u0003\u003d\u0005\u003d\u0362\u000a\u003d\u0003\u003e\u0003\u003e\u0007\u003e\u0366\u000a\u003e\u000c\u003e\u000e\u003e\u0369\u000b\u003e\u0003\u003e\u0003\u003e\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0005\u003f\u0374\u000a\u003f\u0003\u0040\u0003\u0040\u0003\u0040\u0002\u0004\u0054\u0072\u0041\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0070\u0072\u0074\u0076\u0078\u007a\u007c\u007e\u0002\u0002\u0002\u03da\u0002\u0081\u0003\u0002\u0002\u0002\u0004\u008f\u0003\u0002\u0002\u0002\u0006\u0091\u0003\u0002\u0002\u0002\u0008\u0096\u0003\u0002\u0002\u0002\u000a\u00a2\u0003\u0002\u0002\u0002\u000c\u00a9\u0003\u0002\u0002\u0002\u000e\u00b1\u0003\u0002\u0002\u0002\u0010\u00b4\u0003\u0002\u0002\u0002\u0012\u00c0\u0003\u0002\u0002\u0002\u0014\u00c8\u0003\u0002\u0002\u0002\u0016\u00ca\u0003\u0002\u0002\u0002\u0018\u00ce\u0003\u0002\u0002\u0002\u001a\u00df\u0003\u0002\u0002\u0002\u001c\u00f1\u0003\u0002\u0002\u0002\u001e\u00fd\u0003\u0002\u0002\u0002\u0020\u0103\u0003\u0002\u0002\u0002\u0022\u010c\u0003\u0002\u0002\u0002\u0024\u0114\u0003\u0002\u0002\u0002\u0026\u0123\u0003\u0002\u0002\u0002\u0028\u0130\u0003\u0002\u0002\u0002\u002a\u0132\u0003\u0002\u0002\u0002\u002c\u0136\u0003\u0002\u0002\u0002\u002e\u0178\u0003\u0002\u0002\u0002\u0030\u017a\u0003\u0002\u0002\u0002\u0032\u0182\u0003\u0002\u0002\u0002\u0034\u018a\u0003\u0002\u0002\u0002\u0036\u0192\u0003\u0002\u0002\u0002\u0038\u019f\u0003\u0002\u0002\u0002\u003a\u01c1\u0003\u0002\u0002\u0002\u003c\u01c3\u0003\u0002\u0002\u0002\u003e\u01c7\u0003\u0002\u0002\u0002\u0040\u01d0\u0003\u0002\u0002\u0002\u0042\u01d5\u0003\u0002\u0002\u0002\u0044\u01d9\u0003\u0002\u0002\u0002\u0046\u01e3\u0003\u0002\u0002\u0002\u0048\u01ec\u0003\u0002\u0002\u0002\u004a\u01f1\u0003\u0002\u0002\u0002\u004c\u01fa\u0003\u0002\u0002\u0002\u004e\u01ff\u0003\u0002\u0002\u0002\u0050\u021e\u0003\u0002\u0002\u0002\u0052\u0227\u0003\u0002\u0002\u0002\u0054\u0279\u0003\u0002\u0002\u0002\u0056\u028b\u0003\u0002\u0002\u0002\u0058\u028e\u0003\u0002\u0002\u0002\u005a\u0297\u0003\u0002\u0002\u0002\u005c\u02a0\u0003\u0002\u0002\u0002\u005e\u02a5\u0003\u0002\u0002\u0002\u0060\u02ab\u0003\u0002\u0002\u0002\u0062\u02b2\u0003\u0002\u0002\u0002\u0064\u02bb\u0003\u0002\u0002\u0002\u0066\u02c3\u0003\u0002\u0002\u0002\u0068\u0309\u0003\u0002\u0002\u0002\u006a\u030b\u0003\u0002\u0002\u0002\u006c\u0317\u0003\u0002\u0002\u0002\u006e\u0321\u0003\u0002\u0002\u0002\u0070\u0325\u0003\u0002\u0002\u0002\u0072\u033c\u0003\u0002\u0002\u0002\u0074\u0349\u0003\u0002\u0002\u0002\u0076\u035c\u0003\u0002\u0002\u0002\u0078\u0361\u0003\u0002\u0002\u0002\u007a\u0363\u0003\u0002\u0002\u0002\u007c\u0373\u0003\u0002\u0002\u0002\u007e\u0375\u0003\u0002\u0002\u0002\u0080\u0082\u0005\u000e\u0008\u0002\u0081\u0080\u0003\u0002\u0002\u0002\u0081\u0082\u0003\u0002\u0002\u0002\u0082\u0086\u0003\u0002\u0002\u0002\u0083\u0085\u0005\u0004\u0003\u0002\u0084\u0083\u0003\u0002\u0002\u0002\u0085\u0088\u0003\u0002\u0002\u0002\u0086\u0084\u0003\u0002\u0002\u0002\u0086\u0087\u0003\u0002\u0002\u0002\u0087\u008c\u0003\u0002\u0002\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0089\u008b\u0005\u0052\u002a\u0002\u008a\u0089\u0003\u0002\u0002\u0002\u008b\u008e\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002\u0002\u008c\u008d\u0003\u0002\u0002\u0002\u008d\u0003\u0003\u0002\u0002\u0002\u008e\u008c\u0003\u0002\u0002\u0002\u008f\u0090\u0005\u0006\u0004\u0002\u0090\u0005\u0003\u0002\u0002\u0002\u0091\u0092\u0007\u000e\u0002\u0002\u0092\u0094\u0005\u000c\u0007\u0002\u0093\u0095\u0005\u0008\u0005\u0002\u0094\u0093\u0003\u0002\u0002\u0002\u0094\u0095\u0003\u0002\u0002\u0002\u0095\u0007\u0003\u0002\u0002\u0002\u0096\u009a\u0007\u001d\u0002\u0002\u0097\u0099\u0005\u000a\u0006\u0002\u0098\u0097\u0003\u0002\u0002\u0002\u0099\u009c\u0003\u0002\u0002\u0002\u009a\u0098\u0003\u0002\u0002\u0002\u009a\u009b\u0003\u0002\u0002\u0002\u009b\u009d\u0003\u0002\u0002\u0002\u009c\u009a\u0003\u0002\u0002\u0002\u009d\u009e\u0007\u001e\u0002\u0002\u009e\u0009\u0003\u0002\u0002\u0002\u009f\u00a0\u0005\u000c\u0007\u0002\u00a0\u00a1\u0007\u0018\u0002\u0002\u00a1\u00a3\u0003\u0002\u0002\u0002\u00a2\u009f\u0003\u0002\u0002\u0002\u00a2\u00a3\u0003\u0002\u0002\u0002\u00a3\u00a7\u0003\u0002\u0002\u0002\u00a4\u00a8\u0007\u0021\u0002\u0002\u00a5\u00a8\u0005\u006e\u0038\u0002\u00a6\u00a8\u0005\u0070\u0039\u0002\u00a7\u00a4\u0003\u0002\u0002\u0002\u00a7\u00a5\u0003\u0002\u0002\u0002\u00a7\u00a6\u0003\u0002\u0002\u0002\u00a8\u000b\u0003\u0002\u0002\u0002\u00a9\u00ae\u0007\u0021\u0002\u0002\u00aa\u00ab\u0007\u0018\u0002\u0002\u00ab\u00ad\u0007\u0021\u0002\u0002\u00ac\u00aa\u0003\u0002\u0002\u0002\u00ad\u00b0\u0003\u0002\u0002\u0002\u00ae\u00ac\u0003\u0002\u0002\u0002\u00ae\u00af\u0003\u0002\u0002\u0002\u00af\u000d\u0003\u0002\u0002\u0002\u00b0\u00ae\u0003\u0002\u0002\u0002\u00b1\u00b2\u0007\u000b\u0002\u0002\u00b2\u00b3\u0005\u000c\u0007\u0002\u00b3\u000f\u0003\u0002\u0002\u0002\u00b4\u00b8\u0007\u001d\u0002\u0002\u00b5\u00b7\u0005\u0012\u000a\u0002\u00b6\u00b5\u0003\u0002\u0002\u0002\u00b7\u00ba\u0003\u0002\u0002\u0002\u00b8\u00b6\u0003\u0002\u0002\u0002\u00b8\u00b9\u0003\u0002\u0002\u0002\u00b9\u00bb\u0003\u0002\u0002\u0002\u00ba\u00b8\u0003\u0002\u0002\u0002\u00bb\u00bc\u0007\u001e\u0002\u0002\u00bc\u0011\u0003\u0002\u0002\u0002\u00bd\u00c1\u0005\u0014\u000b\u0002\u00be\u00c1\u0005\u0054\u002b\u0002\u00bf\u00c1\u0005\u0016\u000c\u0002\u00c0\u00bd\u0003\u0002\u0002\u0002\u00c0\u00be\u0003\u0002\u0002\u0002\u00c0\u00bf\u0003\u0002\u0002\u0002\u00c1\u0013\u0003\u0002\u0002\u0002\u00c2\u00c9\u0005\u0068\u0035\u0002\u00c3\u00c9\u0005\u0066\u0034\u0002\u00c4\u00c9\u0005\u0064\u0033\u0002\u00c5\u00c9\u0005\u0044\u0023\u0002\u00c6\u00c9\u0005\u0018\u000d\u0002\u00c7\u00c9\u0005\u0024\u0013\u0002\u00c8\u00c2\u0003\u0002\u0002\u0002\u00c8\u00c3\u0003\u0002\u0002\u0002\u00c8\u00c4\u0003\u0002\u0002\u0002\u00c8\u00c5\u0003\u0002\u0002\u0002\u00c8\u00c6\u0003\u0002\u0002\u0002\u00c8\u00c7\u0003\u0002\u0002\u0002\u00c9\u0015\u0003\u0002\u0002\u0002\u00ca\u00cb\u0007\u0010\u0002\u0002\u00cb\u00cc\u0005\u0054\u002b\u0002\u00cc\u0017\u0003\u0002\u0002\u0002\u00cd\u00cf\u0007\u0007\u0002\u0002\u00ce\u00cd\u0003\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00cf\u00d0\u0003\u0002\u0002\u0002\u00d0\u00d1\u0007\u0008\u0002\u0002\u00d1\u00d3\u0007\u0021\u0002\u0002\u00d2\u00d4\u0005\u0030\u0019\u0002\u00d3\u00d2\u0003\u0002\u0002\u0002\u00d3\u00d4\u0003\u0002\u0002\u0002\u00d4\u00db\u0003\u0002\u0002\u0002\u00d5\u00d7\u0007\u0020\u0002\u0002\u00d6\u00d8\u0005\u0072\u003a\u0002\u00d7\u00d6\u0003\u0002\u0002\u0002\u00d8\u00d9\u0003\u0002\u0002\u0002\u00d9\u00d7\u0003\u0002\u0002\u0002\u00d9\u00da\u0003\u0002\u0002\u0002\u00da\u00dc\u0003\u0002\u0002\u0002\u00db\u00d5\u0003\u0002\u0002\u0002\u00db\u00dc\u0003\u0002\u0002\u0002\u00dc\u00dd\u0003\u0002\u0002\u0002\u00dd\u00de\u0005\u001a\u000e\u0002\u00de\u0019\u0003\u0002\u0002\u0002\u00df\u00e3\u0007\u001d\u0002\u0002\u00e0\u00e2\u0005\u0022\u0012\u0002\u00e1\u00e0\u0003\u0002\u0002\u0002\u00e2\u00e5\u0003\u0002\u0002\u0002\u00e3\u00e1\u0003\u0002\u0002\u0002\u00e3\u00e4\u0003\u0002\u0002\u0002\u00e4\u00eb\u0003\u0002\u0002\u0002\u00e5\u00e3\u0003\u0002\u0002\u0002\u00e6\u00ea\u0005\u001c\u000f\u0002\u00e7\u00ea\u0005\u0020\u0011\u0002\u00e8\u00ea\u0005\u001e\u0010\u0002\u00e9\u00e6\u0003\u0002\u0002\u0002\u00e9\u00e7\u0003\u0002\u0002\u0002\u00e9\u00e8\u0003\u0002\u0002\u0002\u00ea\u00ed\u0003\u0002\u0002\u0002\u00eb\u00e9\u0003\u0002\u0002\u0002\u00eb\u00ec\u0003\u0002\u0002\u0002\u00ec\u00ee\u0003\u0002\u0002\u0002\u00ed\u00eb\u0003\u0002\u0002\u0002\u00ee\u00ef\u0007\u001e\u0002\u0002\u00ef\u001b\u0003\u0002\u0002\u0002\u00f0\u00f2\u0007\u000d\u0002\u0002\u00f1\u00f0\u0003\u0002\u0002\u0002\u00f1\u00f2\u0003\u0002\u0002\u0002\u00f2\u00f4\u0003\u0002\u0002\u0002\u00f3\u00f5\u0007\u000c\u0002\u0002\u00f4\u00f3\u0003\u0002\u0002\u0002\u00f4\u00f5\u0003\u0002\u0002\u0002\u00f5\u00fa\u0003\u0002\u0002\u0002\u00f6\u00fb\u0005\u0064\u0033\u0002\u00f7\u00fb\u0005\u0066\u0034\u0002\u00f8\u00fb\u0005\u0068\u0035\u0002\u00f9\u00fb\u0005\u0044\u0023\u0002\u00fa\u00f6\u0003\u0002\u0002\u0002\u00fa\u00f7\u0003\u0002\u0002\u0002\u00fa\u00f8\u0003\u0002\u0002\u0002\u00fa\u00f9\u0003\u0002\u0002\u0002\u00fb\u001d\u0003\u0002\u0002\u0002\u00fc\u00fe\u0007\u000d\u0002\u0002\u00fd\u00fc\u0003\u0002\u0002\u0002\u00fd\u00fe\u0003\u0002\u0002\u0002\u00fe\u0101\u0003\u0002\u0002\u0002\u00ff\u0102\u0005\u0028\u0015\u0002\u0100\u0102\u0005\u002e\u0018\u0002\u0101\u00ff\u0003\u0002\u0002\u0002\u0101\u0100\u0003\u0002\u0002\u0002\u0102\u001f\u0003\u0002\u0002\u0002\u0103\u0109\u0007\u0014\u0002\u0002\u0104\u010a\u0005\u0064\u0033\u0002\u0105\u010a\u0005\u0066\u0034\u0002\u0106\u010a\u0005\u0068\u0035\u0002\u0107\u010a\u0005\u0018\u000d\u0002\u0108\u010a\u0005\u0024\u0013\u0002\u0109\u0104\u0003\u0002\u0002\u0002\u0109\u0105\u0003\u0002\u0002\u0002\u0109\u0106\u0003\u0002\u0002\u0002\u0109\u0107\u0003\u0002\u0002\u0002\u0109\u0108\u0003\u0002\u0002\u0002\u010a\u0021\u0003\u0002\u0002\u0002\u010b\u010d\u0005\u005a\u002e\u0002\u010c\u010b\u0003\u0002\u0002\u0002\u010d\u010e\u0003\u0002\u0002\u0002\u010e\u010c\u0003\u0002\u0002\u0002\u010e\u010f\u0003\u0002\u0002\u0002\u010f\u0112\u0003\u0002\u0002\u0002\u0110\u0111\u0007\u0016\u0002\u0002\u0111\u0113\u0005\u0054\u002b\u0002\u0112\u0110\u0003\u0002\u0002\u0002\u0112\u0113\u0003\u0002\u0002\u0002\u0113\u0023\u0003\u0002\u0002\u0002\u0114\u0115\u0007\u0015\u0002\u0002\u0115\u0117\u0007\u0021\u0002\u0002\u0116\u0118\u0005\u0030\u0019\u0002\u0117\u0116\u0003\u0002\u0002\u0002\u0117\u0118\u0003\u0002\u0002\u0002\u0118\u011f\u0003\u0002\u0002\u0002\u0119\u011b\u0007\u0020\u0002\u0002\u011a\u011c\u0005\u0072\u003a\u0002\u011b\u011a\u0003\u0002\u0002\u0002\u011c\u011d\u0003\u0002\u0002\u0002\u011d\u011b\u0003\u0002\u0002\u0002\u011d\u011e\u0003\u0002\u0002\u0002\u011e\u0120\u0003\u0002\u0002\u0002\u011f\u0119\u0003\u0002\u0002\u0002\u011f\u0120\u0003\u0002\u0002\u0002\u0120\u0121\u0003\u0002\u0002\u0002\u0121\u0122\u0005\u0026\u0014\u0002\u0122\u0025\u0003\u0002\u0002\u0002\u0123\u0129\u0007\u001d\u0002\u0002\u0124\u0128\u0005\u002e\u0018\u0002\u0125\u0128\u0005\u0028\u0015\u0002\u0126\u0128\u0005\u0020\u0011\u0002\u0127\u0124\u0003\u0002\u0002\u0002\u0127\u0125\u0003\u0002\u0002\u0002\u0127\u0126\u0003\u0002\u0002\u0002\u0128\u012b\u0003\u0002\u0002\u0002\u0129\u0127\u0003\u0002\u0002\u0002\u0129\u012a\u0003\u0002\u0002\u0002\u012a\u012c\u0003\u0002\u0002\u0002\u012b\u0129\u0003\u0002\u0002\u0002\u012c\u012d\u0007\u001e\u0002\u0002\u012d\u0027\u0003\u0002\u0002\u0002\u012e\u0131\u0005\u002a\u0016\u0002\u012f\u0131\u0005\u002c\u0017\u0002\u0130\u012e\u0003\u0002\u0002\u0002\u0130\u012f\u0003\u0002\u0002\u0002\u0131\u0029\u0003\u0002\u0002\u0002\u0132\u0133\u0007\u0013\u0002\u0002\u0133\u0134\u0007\u0021\u0002\u0002\u0134\u0135\u0005\u0072\u003a\u0002\u0135\u002b\u0003\u0002\u0002\u0002\u0136\u0137\u0007\u0012\u0002\u0002\u0137\u0138\u0007\u0021\u0002\u0002\u0138\u0139\u0005\u0072\u003a\u0002\u0139\u002d\u0003\u0002\u0002\u0002\u013a\u013c\u0007\u0021\u0002\u0002\u013b\u013d\u0005\u0030\u0019\u0002\u013c\u013b\u0003\u0002\u0002\u0002\u013c\u013d\u0003\u0002\u0002\u0002\u013d\u0141\u0003\u0002\u0002\u0002\u013e\u0140\u0005\u005a\u002e\u0002\u013f\u013e\u0003\u0002\u0002\u0002\u0140\u0143\u0003\u0002\u0002\u0002\u0141\u013f\u0003\u0002\u0002\u0002\u0141\u0142\u0003\u0002\u0002\u0002\u0142\u0144\u0003\u0002\u0002\u0002\u0143\u0141\u0003\u0002\u0002\u0002\u0144\u0179\u0005\u0072\u003a\u0002\u0145\u0147\u0005\u006e\u0038\u0002\u0146\u0148\u0005\u0030\u0019\u0002\u0147\u0146\u0003\u0002\u0002\u0002\u0147\u0148\u0003\u0002\u0002\u0002\u0148\u0149\u0003\u0002\u0002\u0002\u0149\u014a\u0005\u005c\u002f\u0002\u014a\u014b\u0005\u0072\u003a\u0002\u014b\u0179\u0003\u0002\u0002\u0002\u014c\u014e\u0005\u0070\u0039\u0002\u014d\u014f\u0005\u0030\u0019\u0002\u014e\u014d\u0003\u0002\u0002\u0002\u014e\u014f\u0003\u0002\u0002\u0002\u014f\u0150\u0003\u0002\u0002\u0002\u0150\u0151\u0005\u005e\u0030\u0002\u0151\u0152\u0005\u0072\u003a\u0002\u0152\u0179\u0003\u0002\u0002\u0002\u0153\u0155\u0007\u0021\u0002\u0002\u0154\u0156\u0005\u0030\u0019\u0002\u0155\u0154\u0003\u0002\u0002\u0002\u0155\u0156\u0003\u0002\u0002\u0002\u0156\u015a\u0003\u0002\u0002\u0002\u0157\u0159\u0005\u005a\u002e\u0002\u0158\u0157\u0003\u0002\u0002\u0002\u0159\u015c\u0003\u0002\u0002\u0002\u015a\u0158\u0003\u0002\u0002\u0002\u015a\u015b\u0003\u0002\u0002\u0002\u015b\u015e\u0003\u0002\u0002\u0002\u015c\u015a\u0003\u0002\u0002\u0002\u015d\u015f\u0005\u0072\u003a\u0002\u015e\u015d\u0003\u0002\u0002\u0002\u015e\u015f\u0003\u0002\u0002\u0002\u015f\u0160\u0003\u0002\u0002\u0002\u0160\u0161\u0007\u0016\u0002\u0002\u0161\u0179\u0005\u0054\u002b\u0002\u0162\u0164\u0005\u006e\u0038\u0002\u0163\u0165\u0005\u0030\u0019\u0002\u0164\u0163\u0003\u0002\u0002\u0002\u0164\u0165\u0003\u0002\u0002\u0002\u0165\u0166\u0003\u0002\u0002\u0002\u0166\u0168\u0005\u005c\u002f\u0002\u0167\u0169\u0005\u0072\u003a\u0002\u0168\u0167\u0003\u0002\u0002\u0002\u0168\u0169\u0003\u0002\u0002\u0002\u0169\u016a\u0003\u0002\u0002\u0002\u016a\u016b\u0007\u0016\u0002\u0002\u016b\u016c\u0005\u0054\u002b\u0002\u016c\u0179\u0003\u0002\u0002\u0002\u016d\u016f\u0005\u0070\u0039\u0002\u016e\u0170\u0005\u0030\u0019\u0002\u016f\u016e\u0003\u0002\u0002\u0002\u016f\u0170\u0003\u0002\u0002\u0002\u0170\u0171\u0003\u0002\u0002\u0002\u0171\u0173\u0005\u005e\u0030\u0002\u0172\u0174\u0005\u0072\u003a\u0002\u0173\u0172\u0003\u0002\u0002\u0002\u0173\u0174\u0003\u0002\u0002\u0002\u0174\u0175\u0003\u0002\u0002\u0002\u0175\u0176\u0007\u0016\u0002\u0002\u0176\u0177\u0005\u0054\u002b\u0002\u0177\u0179\u0003\u0002\u0002\u0002\u0178\u013a\u0003\u0002\u0002\u0002\u0178\u0145\u0003\u0002\u0002\u0002\u0178\u014c\u0003\u0002\u0002\u0002\u0178\u0153\u0003\u0002\u0002\u0002\u0178\u0162\u0003\u0002\u0002\u0002\u0178\u016d\u0003\u0002\u0002\u0002\u0179\u002f\u0003\u0002\u0002\u0002\u017a\u017c\u0007\u001b\u0002\u0002\u017b\u017d\u0005\u0032\u001a\u0002\u017c\u017b\u0003\u0002\u0002\u0002\u017d\u017e\u0003\u0002\u0002\u0002\u017e\u017c\u0003\u0002\u0002\u0002\u017e\u017f\u0003\u0002\u0002\u0002\u017f\u0180\u0003\u0002\u0002\u0002\u0180\u0181\u0007\u001c\u0002\u0002\u0181\u0031\u0003\u0002\u0002\u0002\u0182\u0187\u0007\u0021\u0002\u0002\u0183\u0184\u0007\u0020\u0002\u0002\u0184\u0186\u0005\u0072\u003a\u0002\u0185\u0183\u0003\u0002\u0002\u0002\u0186\u0189\u0003\u0002\u0002\u0002\u0187\u0185\u0003\u0002\u0002\u0002\u0187\u0188\u0003\u0002\u0002\u0002\u0188\u0033\u0003\u0002\u0002\u0002\u0189\u0187\u0003\u0002\u0002\u0002\u018a\u018c\u0007\u0019\u0002\u0002\u018b\u018d\u0007\u0021\u0002\u0002\u018c\u018b\u0003\u0002\u0002\u0002\u018d\u018e\u0003\u0002\u0002\u0002\u018e\u018c\u0003\u0002\u0002\u0002\u018e\u018f\u0003\u0002\u0002\u0002\u018f\u0190\u0003\u0002\u0002\u0002\u0190\u0191\u0007\u001a\u0002\u0002\u0191\u0035\u0003\u0002\u0002\u0002\u0192\u0193\u0007\u0011\u0002\u0002\u0193\u0194\u0007\u0021\u0002\u0002\u0194\u019b\u0005\u0034\u001b\u0002\u0195\u0197\u0007\u0020\u0002\u0002\u0196\u0198\u0005\u0072\u003a\u0002\u0197\u0196\u0003\u0002\u0002\u0002\u0198\u0199\u0003\u0002\u0002\u0002\u0199\u0197\u0003\u0002\u0002\u0002\u0199\u019a\u0003\u0002\u0002\u0002\u019a\u019c\u0003\u0002\u0002\u0002\u019b\u0195\u0003\u0002\u0002\u0002\u019b\u019c\u0003\u0002\u0002\u0002\u019c\u019d\u0003\u0002\u0002\u0002\u019d\u019e\u0005\u0038\u001d\u0002\u019e\u0037\u0003\u0002\u0002\u0002\u019f\u01a3\u0007\u001d\u0002\u0002\u01a0\u01a2\u0005\u003a\u001e\u0002\u01a1\u01a0\u0003\u0002\u0002\u0002\u01a2\u01a5\u0003\u0002\u0002\u0002\u01a3\u01a1\u0003\u0002\u0002\u0002\u01a3\u01a4\u0003\u0002\u0002\u0002\u01a4\u01a6\u0003\u0002\u0002\u0002\u01a5\u01a3\u0003\u0002\u0002\u0002\u01a6\u01a7\u0007\u001e\u0002\u0002\u01a7\u0039\u0003\u0002\u0002\u0002\u01a8\u01aa\u0007\u0021\u0002\u0002\u01a9\u01ab\u0005\u0030\u0019\u0002\u01aa\u01a9\u0003\u0002\u0002\u0002\u01aa\u01ab\u0003\u0002\u0002\u0002\u01ab\u01af\u0003\u0002\u0002\u0002\u01ac\u01ae\u0005\u003e\u0020\u0002\u01ad\u01ac\u0003\u0002\u0002\u0002\u01ae\u01b1\u0003\u0002\u0002\u0002\u01af\u01ad\u0003\u0002\u0002\u0002\u01af\u01b0\u0003\u0002\u0002\u0002\u01b0\u01b2\u0003\u0002\u0002\u0002\u01b1\u01af\u0003\u0002\u0002\u0002\u01b2\u01c2\u0005\u0072\u003a\u0002\u01b3\u01b5\u0005\u006e\u0038\u0002\u01b4\u01b6\u0005\u0030\u0019\u0002\u01b5\u01b4\u0003\u0002\u0002\u0002\u01b5\u01b6\u0003\u0002\u0002\u0002\u01b6\u01b7\u0003\u0002\u0002\u0002\u01b7\u01b8\u0005\u0040\u0021\u0002\u01b8\u01b9\u0005\u0072\u003a\u0002\u01b9\u01c2\u0003\u0002\u0002\u0002\u01ba\u01bc\u0005\u0070\u0039\u0002\u01bb\u01bd\u0005\u0030\u0019\u0002\u01bc\u01bb\u0003\u0002\u0002\u0002\u01bc\u01bd\u0003\u0002\u0002\u0002\u01bd\u01be\u0003\u0002\u0002\u0002\u01be\u01bf\u0005\u0042\u0022\u0002\u01bf\u01c0\u0005\u0072\u003a\u0002\u01c0\u01c2\u0003\u0002\u0002\u0002\u01c1\u01a8\u0003\u0002\u0002\u0002\u01c1\u01b3\u0003\u0002\u0002\u0002\u01c1\u01ba\u0003\u0002\u0002\u0002\u01c2\u003b\u0003\u0002\u0002\u0002\u01c3\u01c5\u0005\u0072\u003a\u0002\u01c4\u01c6\u0007\u0017\u0002\u0002\u01c5\u01c4\u0003\u0002\u0002\u0002\u01c5\u01c6\u0003\u0002\u0002\u0002\u01c6\u003d\u0003\u0002\u0002\u0002\u01c7\u01cb\u0007\u0019\u0002\u0002\u01c8\u01ca\u0005\u003c\u001f\u0002\u01c9\u01c8\u0003\u0002\u0002\u0002\u01ca\u01cd\u0003\u0002\u0002\u0002\u01cb\u01c9\u0003\u0002\u0002\u0002\u01cb\u01cc\u0003\u0002\u0002\u0002\u01cc\u01ce\u0003\u0002\u0002\u0002\u01cd\u01cb\u0003\u0002\u0002\u0002\u01ce\u01cf\u0007\u001a\u0002\u0002\u01cf\u003f\u0003\u0002\u0002\u0002\u01d0\u01d1\u0007\u0019\u0002\u0002\u01d1\u01d2\u0005\u003c\u001f\u0002\u01d2\u01d3\u0005\u003c\u001f\u0002\u01d3\u01d4\u0007\u001a\u0002\u0002\u01d4\u0041\u0003\u0002\u0002\u0002\u01d5\u01d6\u0007\u0019\u0002\u0002\u01d6\u01d7\u0005\u003c\u001f\u0002\u01d7\u01d8\u0007\u001a\u0002\u0002\u01d8\u0043\u0003\u0002\u0002\u0002\u01d9\u01dd\u0007\u000f\u0002\u0002\u01da\u01dc\u0005\u0030\u0019\u0002\u01db\u01da\u0003\u0002\u0002\u0002\u01dc\u01df\u0003\u0002\u0002\u0002\u01dd\u01db\u0003\u0002\u0002\u0002\u01dd\u01de\u0003\u0002\u0002\u0002\u01de\u01e0\u0003\u0002\u0002\u0002\u01df\u01dd\u0003\u0002\u0002\u0002\u01e0\u01e1\u0005\u0072\u003a\u0002\u01e1\u01e2\u0005\u0046\u0024\u0002\u01e2\u0045\u0003\u0002\u0002\u0002\u01e3\u01e7\u0007\u001d\u0002\u0002\u01e4\u01e6\u0005\u0050\u0029\u0002\u01e5\u01e4\u0003\u0002\u0002\u0002\u01e6\u01e9\u0003\u0002\u0002\u0002\u01e7\u01e5\u0003\u0002\u0002\u0002\u01e7\u01e8\u0003\u0002\u0002\u0002\u01e8\u01ea\u0003\u0002\u0002\u0002\u01e9\u01e7\u0003\u0002\u0002\u0002\u01ea\u01eb\u0007\u001e\u0002\u0002\u01eb\u0047\u0003\u0002\u0002\u0002\u01ec\u01ef\u0007\u0021\u0002\u0002\u01ed\u01ee\u0007\u0016\u0002\u0002\u01ee\u01f0\u0005\u0054\u002b\u0002\u01ef\u01ed\u0003\u0002\u0002\u0002\u01ef\u01f0\u0003\u0002\u0002\u0002\u01f0\u0049\u0003\u0002\u0002\u0002\u01f1\u01f5\u0007\u0019\u0002\u0002\u01f2\u01f4\u0005\u0048\u0025\u0002\u01f3\u01f2\u0003\u0002\u0002\u0002\u01f4\u01f7\u0003\u0002\u0002\u0002\u01f5\u01f3\u0003\u0002\u0002\u0002\u01f5\u01f6\u0003\u0002\u0002\u0002\u01f6\u01f8\u0003\u0002\u0002\u0002\u01f7\u01f5\u0003\u0002\u0002\u0002\u01f8\u01f9\u0007\u001a\u0002\u0002\u01f9\u004b\u0003\u0002\u0002\u0002\u01fa\u01fb\u0007\u0019\u0002\u0002\u01fb\u01fc\u0005\u0048\u0025\u0002\u01fc\u01fd\u0005\u0048\u0025\u0002\u01fd\u01fe\u0007\u001a\u0002\u0002\u01fe\u004d\u0003\u0002\u0002\u0002\u01ff\u0200\u0007\u0019\u0002\u0002\u0200\u0201\u0005\u0048\u0025\u0002\u0201\u0202\u0007\u001a\u0002\u0002\u0202\u004f\u0003\u0002\u0002\u0002\u0203\u0207\u0007\u0021\u0002\u0002\u0204\u0206\u0005\u004a\u0026\u0002\u0205\u0204\u0003\u0002\u0002\u0002\u0206\u0209\u0003\u0002\u0002\u0002\u0207\u0205\u0003\u0002\u0002\u0002\u0207\u0208\u0003\u0002\u0002\u0002\u0208\u020a\u0003\u0002\u0002\u0002\u0209\u0207\u0003\u0002\u0002\u0002\u020a\u020b\u0007\u0016\u0002\u0002\u020b\u021f\u0005\u0054\u002b\u0002\u020c\u020d\u0005\u006e\u0038\u0002\u020d\u020e\u0005\u004c\u0027\u0002\u020e\u020f\u0007\u0016\u0002\u0002\u020f\u0210\u0005\u0054\u002b\u0002\u0210\u021f\u0003\u0002\u0002\u0002\u0211\u0212\u0005\u0070\u0039\u0002\u0212\u0213\u0005\u004e\u0028\u0002\u0213\u0214\u0007\u0016\u0002\u0002\u0214\u0215\u0005\u0054\u002b\u0002\u0215\u021f\u0003\u0002\u0002\u0002\u0216\u0217\u0007\u0021\u0002\u0002\u0217\u021f\u0005\u0078\u003d\u0002\u0218\u0219\u0005\u006e\u0038\u0002\u0219\u021a\u0005\u0078\u003d\u0002\u021a\u021f\u0003\u0002\u0002\u0002\u021b\u021c\u0005\u0070\u0039\u0002\u021c\u021d\u0005\u0078\u003d\u0002\u021d\u021f\u0003\u0002\u0002\u0002\u021e\u0203\u0003\u0002\u0002\u0002\u021e\u020c\u0003\u0002\u0002\u0002\u021e\u0211\u0003\u0002\u0002\u0002\u021e\u0216\u0003\u0002\u0002\u0002\u021e\u0218\u0003\u0002\u0002\u0002\u021e\u021b\u0003\u0002\u0002\u0002\u021f\u0051\u0003\u0002\u0002\u0002\u0220\u0228\u0005\u0068\u0035\u0002\u0221\u0228\u0005\u0064\u0033\u0002\u0222\u0228\u0005\u0066\u0034\u0002\u0223\u0228\u0005\u0036\u001c\u0002\u0224\u0228\u0005\u0044\u0023\u0002\u0225\u0228\u0005\u0018\u000d\u0002\u0226\u0228\u0005\u0024\u0013\u0002\u0227\u0220\u0003\u0002\u0002\u0002\u0227\u0221\u0003\u0002\u0002\u0002\u0227\u0222\u0003\u0002\u0002\u0002\u0227\u0223\u0003\u0002\u0002\u0002\u0227\u0224\u0003\u0002\u0002\u0002\u0227\u0225\u0003\u0002\u0002\u0002\u0227\u0226\u0003\u0002\u0002\u0002\u0228\u0053\u0003\u0002\u0002\u0002\u0229\u022d\u0008\u002b\u0001\u0002\u022a\u022b\u0005\u000c\u0007\u0002\u022b\u022c\u0007\u0018\u0002\u0002\u022c\u022e\u0003\u0002\u0002\u0002\u022d\u022a\u0003\u0002\u0002\u0002\u022d\u022e\u0003\u0002\u0002\u0002\u022e\u022f\u0003\u0002\u0002\u0002\u022f\u0231\u0007\u0021\u0002\u0002\u0230\u0232\u0005\u0056\u002c\u0002\u0231\u0230\u0003\u0002\u0002\u0002\u0231\u0232\u0003\u0002\u0002\u0002\u0232\u027a\u0003\u0002\u0002\u0002\u0233\u027a\u0007\u0023\u0002\u0002\u0234\u0235\u0007\u0019\u0002\u0002\u0235\u0236\u0007\u0023\u0002\u0002\u0236\u0238\u0007\u001a\u0002\u0002\u0237\u0239\u0005\u0056\u002c\u0002\u0238\u0237\u0003\u0002\u0002\u0002\u0238\u0239\u0003\u0002\u0002\u0002\u0239\u027a\u0003\u0002\u0002\u0002\u023a\u027a\u0007\u0024\u0002\u0002\u023b\u023c\u0007\u0019\u0002\u0002\u023c\u023d\u0007\u0024\u0002\u0002\u023d\u023f\u0007\u001a\u0002\u0002\u023e\u0240\u0005\u0056\u002c\u0002\u023f\u023e\u0003\u0002\u0002\u0002\u023f\u0240\u0003\u0002\u0002\u0002\u0240\u027a\u0003\u0002\u0002\u0002\u0241\u027a\u0007\u0025\u0002\u0002\u0242\u0243\u0007\u0019\u0002\u0002\u0243\u0244\u0007\u0025\u0002\u0002\u0244\u0246\u0007\u001a\u0002\u0002\u0245\u0247\u0005\u0056\u002c\u0002\u0246\u0245\u0003\u0002\u0002\u0002\u0246\u0247\u0003\u0002\u0002\u0002\u0247\u027a\u0003\u0002\u0002\u0002\u0248\u0249\u0007\u0019\u0002\u0002\u0249\u024a\u0005\u0054\u002b\u0002\u024a\u024b\u0005\u0062\u0032\u0002\u024b\u024d\u0007\u001a\u0002\u0002\u024c\u024e\u0005\u0056\u002c\u0002\u024d\u024c\u0003\u0002\u0002\u0002\u024d\u024e\u0003\u0002\u0002\u0002\u024e\u027a\u0003\u0002\u0002\u0002\u024f\u0250\u0007\u0019\u0002\u0002\u0250\u0251\u0005\u0054\u002b\u0002\u0251\u0252\u0007\u0022\u0002\u0002\u0252\u0253\u0005\u0054\u002b\u0002\u0253\u0255\u0007\u001a\u0002\u0002\u0254\u0256\u0005\u0056\u002c\u0002\u0255\u0254\u0003\u0002\u0002\u0002\u0255\u0256\u0003\u0002\u0002\u0002\u0256\u027a\u0003\u0002\u0002\u0002\u0257\u0258\u0007\u0022\u0002\u0002\u0258\u027a\u0005\u0054\u002b\u0009\u0259\u025a\u0007\u0019\u0002\u0002\u025a\u025b\u0007\u0022\u0002\u0002\u025b\u025d\u0005\u0054\u002b\u0002\u025c\u025e\u0005\u0056\u002c\u0002\u025d\u025c\u0003\u0002\u0002\u0002\u025d\u025e\u0003\u0002\u0002\u0002\u025e\u027a\u0003\u0002\u0002\u0002\u025f\u0260\u0005\u000c\u0007\u0002\u0260\u0261\u0007\u0018\u0002\u0002\u0261\u0263\u0003\u0002\u0002\u0002\u0262\u025f\u0003\u0002\u0002\u0002\u0262\u0263\u0003\u0002\u0002\u0002\u0263\u0264\u0003\u0002\u0002\u0002\u0264\u0266\u0005\u006e\u0038\u0002\u0265\u0267\u0005\u0056\u002c\u0002\u0266\u0265\u0003\u0002\u0002\u0002\u0266\u0267\u0003\u0002\u0002\u0002\u0267\u027a\u0003\u0002\u0002\u0002\u0268\u0269\u0005\u000c\u0007\u0002\u0269\u026a\u0007\u0018\u0002\u0002\u026a\u026c\u0003\u0002\u0002\u0002\u026b\u0268\u0003\u0002\u0002\u0002\u026b\u026c\u0003\u0002\u0002\u0002\u026c\u026d\u0003\u0002\u0002\u0002\u026d\u026f\u0005\u0070\u0039\u0002\u026e\u0270\u0005\u0056\u002c\u0002\u026f\u026e\u0003\u0002\u0002\u0002\u026f\u0270\u0003\u0002\u0002\u0002\u0270\u027a\u0003\u0002\u0002\u0002\u0271\u0273\u0005\u0010\u0009\u0002\u0272\u0274\u0005\u0056\u002c\u0002\u0273\u0272\u0003\u0002\u0002\u0002\u0273\u0274\u0003\u0002\u0002\u0002\u0274\u027a\u0003\u0002\u0002\u0002\u0275\u0277\u0005\u006c\u0037\u0002\u0276\u0278\u0005\u0056\u002c\u0002\u0277\u0276\u0003\u0002\u0002\u0002\u0277\u0278\u0003\u0002\u0002\u0002\u0278\u027a\u0003\u0002\u0002\u0002\u0279\u0229\u0003\u0002\u0002\u0002\u0279\u0233\u0003\u0002\u0002\u0002\u0279\u0234\u0003\u0002\u0002\u0002\u0279\u023a\u0003\u0002\u0002\u0002\u0279\u023b\u0003\u0002\u0002\u0002\u0279\u0241\u0003\u0002\u0002\u0002\u0279\u0242\u0003\u0002\u0002\u0002\u0279\u0248\u0003\u0002\u0002\u0002\u0279\u024f\u0003\u0002\u0002\u0002\u0279\u0257\u0003\u0002\u0002\u0002\u0279\u0259\u0003\u0002\u0002\u0002\u0279\u0262\u0003\u0002\u0002\u0002\u0279\u026b\u0003\u0002\u0002\u0002\u0279\u0271\u0003\u0002\u0002\u0002\u0279\u0275\u0003\u0002\u0002\u0002\u027a\u0288\u0003\u0002\u0002\u0002\u027b\u027c\u000c\u000b\u0002\u0002\u027c\u027d\u0007\u0022\u0002\u0002\u027d\u0287\u0005\u0054\u002b\u000c\u027e\u027f\u000c\u000d\u0002\u0002\u027f\u0287\u0005\u0062\u0032\u0002\u0280\u0281\u000c\u0007\u0002\u0002\u0281\u0282\u0007\u0018\u0002\u0002\u0282\u0284\u0005\u0054\u002b\u0002\u0283\u0285\u0005\u0056\u002c\u0002\u0284\u0283\u0003\u0002\u0002\u0002\u0284\u0285\u0003\u0002\u0002\u0002\u0285\u0287\u0003\u0002\u0002\u0002\u0286\u027b\u0003\u0002\u0002\u0002\u0286\u027e\u0003\u0002\u0002\u0002\u0286\u0280\u0003\u0002\u0002\u0002\u0287\u028a\u0003\u0002\u0002\u0002\u0288\u0286\u0003\u0002\u0002\u0002\u0288\u0289\u0003\u0002\u0002\u0002\u0289\u0055\u0003\u0002\u0002\u0002\u028a\u0288\u0003\u0002\u0002\u0002\u028b\u028c\u0007\u0006\u0002\u0002\u028c\u028d\u0005\u0072\u003a\u0002\u028d\u0057\u0003\u0002\u0002\u0002\u028e\u028f\u0007\u0021\u0002\u0002\u028f\u0291\u0005\u0072\u003a\u0002\u0290\u0292\u0007\u0017\u0002\u0002\u0291\u0290\u0003\u0002\u0002\u0002\u0291\u0292\u0003\u0002\u0002\u0002\u0292\u0295\u0003\u0002\u0002\u0002\u0293\u0294\u0007\u0016\u0002\u0002\u0294\u0296\u0005\u0054\u002b\u0002\u0295\u0293\u0003\u0002\u0002\u0002\u0295\u0296\u0003\u0002\u0002\u0002\u0296\u0059\u0003\u0002\u0002\u0002\u0297\u029b\u0007\u0019\u0002\u0002\u0298\u029a\u0005\u0058\u002d\u0002\u0299\u0298\u0003\u0002\u0002\u0002\u029a\u029d\u0003\u0002\u0002\u0002\u029b\u0299\u0003\u0002\u0002\u0002\u029b\u029c\u0003\u0002\u0002\u0002\u029c\u029e\u0003\u0002\u0002\u0002\u029d\u029b\u0003\u0002\u0002\u0002\u029e\u029f\u0007\u001a\u0002\u0002\u029f\u005b\u0003\u0002\u0002\u0002\u02a0\u02a1\u0007\u0019\u0002\u0002\u02a1\u02a2\u0005\u0058\u002d\u0002\u02a2\u02a3\u0005\u0058\u002d\u0002\u02a3\u02a4\u0007\u001a\u0002\u0002\u02a4\u005d\u0003\u0002\u0002\u0002\u02a5\u02a6\u0007\u0019\u0002\u0002\u02a6\u02a7\u0005\u0058\u002d\u0002\u02a7\u02a8\u0007\u001a\u0002\u0002\u02a8\u005f\u0003\u0002\u0002\u0002\u02a9\u02aa\u0007\u0021\u0002\u0002\u02aa\u02ac\u0007\u0016\u0002\u0002\u02ab\u02a9\u0003\u0002\u0002\u0002\u02ab\u02ac\u0003\u0002\u0002\u0002\u02ac\u02ad\u0003\u0002\u0002\u0002\u02ad\u02b0\u0005\u0054\u002b\u0002\u02ae\u02af\u0007\u0020\u0002\u0002\u02af\u02b1\u0005\u0072\u003a\u0002\u02b0\u02ae\u0003\u0002\u0002\u0002\u02b0\u02b1\u0003\u0002\u0002\u0002\u02b1\u0061\u0003\u0002\u0002\u0002\u02b2\u02b6\u0007\u0019\u0002\u0002\u02b3\u02b5\u0005\u0060\u0031\u0002\u02b4\u02b3\u0003\u0002\u0002\u0002\u02b5\u02b8\u0003\u0002\u0002\u0002\u02b6\u02b4\u0003\u0002\u0002\u0002\u02b6\u02b7\u0003\u0002\u0002\u0002\u02b7\u02b9\u0003\u0002\u0002\u0002\u02b8\u02b6\u0003\u0002\u0002\u0002\u02b9\u02ba\u0007\u001a\u0002\u0002\u02ba\u0063\u0003\u0002\u0002\u0002\u02bb\u02bc\u0007\u0013\u0002\u0002\u02bc\u02be\u0007\u0021\u0002\u0002\u02bd\u02bf\u0005\u0072\u003a\u0002\u02be\u02bd\u0003\u0002\u0002\u0002\u02be\u02bf\u0003\u0002\u0002\u0002\u02bf\u02c0\u0003\u0002\u0002\u0002\u02c0\u02c1\u0007\u0016\u0002\u0002\u02c1\u02c2\u0005\u0054\u002b\u0002\u02c2\u0065\u0003\u0002\u0002\u0002\u02c3\u02c4\u0007\u0012\u0002\u0002\u02c4\u02c6\u0007\u0021\u0002\u0002\u02c5\u02c7\u0005\u0072\u003a\u0002\u02c6\u02c5\u0003\u0002\u0002\u0002\u02c6\u02c7\u0003\u0002\u0002\u0002\u02c7\u02c8\u0003\u0002\u0002\u0002\u02c8\u02c9\u0007\u0016\u0002\u0002\u02c9\u02ca\u0005\u0054\u002b\u0002\u02ca\u0067\u0003\u0002\u0002\u0002\u02cb\u02cd\u0007\u0021\u0002\u0002\u02cc\u02ce\u0005\u0030\u0019\u0002\u02cd\u02cc\u0003\u0002\u0002\u0002\u02cd\u02ce\u0003\u0002\u0002\u0002\u02ce\u02d2\u0003\u0002\u0002\u0002\u02cf\u02d1\u0005\u005a\u002e\u0002\u02d0\u02cf\u0003\u0002\u0002\u0002\u02d1\u02d4\u0003\u0002\u0002\u0002\u02d2\u02d0\u0003\u0002\u0002\u0002\u02d2\u02d3\u0003\u0002\u0002\u0002\u02d3\u02d6\u0003\u0002\u0002\u0002\u02d4\u02d2\u0003\u0002\u0002\u0002\u02d5\u02d7\u0005\u0072\u003a\u0002\u02d6\u02d5\u0003\u0002\u0002\u0002\u02d6\u02d7\u0003\u0002\u0002\u0002\u02d7\u02d8\u0003\u0002\u0002\u0002\u02d8\u02d9\u0007\u0016\u0002\u0002\u02d9\u030a\u0005\u0054\u002b\u0002\u02da\u02dc\u0005\u006e\u0038\u0002\u02db\u02dd\u0005\u0030\u0019\u0002\u02dc\u02db\u0003\u0002\u0002\u0002\u02dc\u02dd\u0003\u0002\u0002\u0002\u02dd\u02de\u0003\u0002\u0002\u0002\u02de\u02e0\u0005\u005c\u002f\u0002\u02df\u02e1\u0005\u0072\u003a\u0002\u02e0\u02df\u0003\u0002\u0002\u0002\u02e0\u02e1\u0003\u0002\u0002\u0002\u02e1\u02e2\u0003\u0002\u0002\u0002\u02e2\u02e3\u0007\u0016\u0002\u0002\u02e3\u02e4\u0005\u0054\u002b\u0002\u02e4\u030a\u0003\u0002\u0002\u0002\u02e5\u02e7\u0005\u0070\u0039\u0002\u02e6\u02e8\u0005\u0030\u0019\u0002\u02e7\u02e6\u0003\u0002\u0002\u0002\u02e7\u02e8\u0003\u0002\u0002\u0002\u02e8\u02e9\u0003\u0002\u0002\u0002\u02e9\u02eb\u0005\u005e\u0030\u0002\u02ea\u02ec\u0005\u0072\u003a\u0002\u02eb\u02ea\u0003\u0002\u0002\u0002\u02eb\u02ec\u0003\u0002\u0002\u0002\u02ec\u02ed\u0003\u0002\u0002\u0002\u02ed\u02ee\u0007\u0016\u0002\u0002\u02ee\u02ef\u0005\u0054\u002b\u0002\u02ef\u030a\u0003\u0002\u0002\u0002\u02f0\u02f2\u0007\u0021\u0002\u0002\u02f1\u02f3\u0005\u0030\u0019\u0002\u02f2\u02f1\u0003\u0002\u0002\u0002\u02f2\u02f3\u0003\u0002\u0002\u0002\u02f3\u02f7\u0003\u0002\u0002\u0002\u02f4\u02f6\u0005\u003e\u0020\u0002\u02f5\u02f4\u0003\u0002\u0002\u0002\u02f6\u02f9\u0003\u0002\u0002\u0002\u02f7\u02f5\u0003\u0002\u0002\u0002\u02f7\u02f8\u0003\u0002\u0002\u0002\u02f8\u02fa\u0003\u0002\u0002\u0002\u02f9\u02f7\u0003\u0002\u0002\u0002\u02fa\u030a\u0005\u0076\u003c\u0002\u02fb\u02fd\u0005\u006e\u0038\u0002\u02fc\u02fe\u0005\u0030\u0019\u0002\u02fd\u02fc\u0003\u0002\u0002\u0002\u02fd\u02fe\u0003\u0002\u0002\u0002\u02fe\u02ff\u0003\u0002\u0002\u0002\u02ff\u0300\u0005\u0040\u0021\u0002\u0300\u0301\u0005\u0076\u003c\u0002\u0301\u030a\u0003\u0002\u0002\u0002\u0302\u0304\u0005\u0070\u0039\u0002\u0303\u0305\u0005\u0030\u0019\u0002\u0304\u0303\u0003\u0002\u0002\u0002\u0304\u0305\u0003\u0002\u0002\u0002\u0305\u0306\u0003\u0002\u0002\u0002\u0306\u0307\u0005\u0042\u0022\u0002\u0307\u0308\u0005\u0076\u003c\u0002\u0308\u030a\u0003\u0002\u0002\u0002\u0309\u02cb\u0003\u0002\u0002\u0002\u0309\u02da\u0003\u0002\u0002\u0002\u0309\u02e5\u0003\u0002\u0002\u0002\u0309\u02f0\u0003\u0002\u0002\u0002\u0309\u02fb\u0003\u0002\u0002\u0002\u0309\u0302\u0003\u0002\u0002\u0002\u030a\u0069\u0003\u0002\u0002\u0002\u030b\u0311\u0007\u0021\u0002\u0002\u030c\u030d\u0007\u0020\u0002\u0002\u030d\u030f\u0005\u0072\u003a\u0002\u030e\u0310\u0007\u0017\u0002\u0002\u030f\u030e\u0003\u0002\u0002\u0002\u030f\u0310\u0003\u0002\u0002\u0002\u0310\u0312\u0003\u0002\u0002\u0002\u0311\u030c\u0003\u0002\u0002\u0002\u0311\u0312\u0003\u0002\u0002\u0002\u0312\u0315\u0003\u0002\u0002\u0002\u0313\u0314\u0007\u0016\u0002\u0002\u0314\u0316\u0005\u0054\u002b\u0002\u0315\u0313\u0003\u0002\u0002\u0002\u0315\u0316\u0003\u0002\u0002\u0002\u0316\u006b\u0003\u0002\u0002\u0002\u0317\u031b\u0007\u001b\u0002\u0002\u0318\u031a\u0005\u006a\u0036\u0002\u0319\u0318\u0003\u0002\u0002\u0002\u031a\u031d\u0003\u0002\u0002\u0002\u031b\u0319\u0003\u0002\u0002\u0002\u031b\u031c\u0003\u0002\u0002\u0002\u031c\u031e\u0003\u0002\u0002\u0002\u031d\u031b\u0003\u0002\u0002\u0002\u031e\u031f\u0007\u001c\u0002\u0002\u031f\u0320\u0005\u0054\u002b\u0002\u0320\u006d\u0003\u0002\u0002\u0002\u0321\u0322\u0007\u001b\u0002\u0002\u0322\u0323\u0007\u0022\u0002\u0002\u0323\u0324\u0007\u001c\u0002\u0002\u0324\u006f\u0003\u0002\u0002\u0002\u0325\u0326\u0007\u001b\u0002\u0002\u0326\u0327\u0007\u0020\u0002\u0002\u0327\u0328\u0007\u0022\u0002\u0002\u0328\u0329\u0007\u001c\u0002\u0002\u0329\u0071\u0003\u0002\u0002\u0002\u032a\u032b\u0008\u003a\u0001\u0002\u032b\u032c\u0007\u0019\u0002\u0002\u032c\u032d\u0005\u0072\u003a\u0002\u032d\u032e\u0007\u001f\u0002\u0002\u032e\u032f\u0005\u0072\u003a\u0002\u032f\u0330\u0007\u001a\u0002\u0002\u0330\u033d\u0003\u0002\u0002\u0002\u0331\u0332\u0007\u0019\u0002\u0002\u0332\u0333\u0005\u0074\u003b\u0002\u0333\u0334\u0007\u001f\u0002\u0002\u0334\u0335\u0005\u0072\u003a\u0002\u0335\u0336\u0007\u001a\u0002\u0002\u0336\u033d\u0003\u0002\u0002\u0002\u0337\u0338\u0005\u0074\u003b\u0002\u0338\u0339\u0007\u001f\u0002\u0002\u0339\u033a\u0005\u0072\u003a\u0004\u033a\u033d\u0003\u0002\u0002\u0002\u033b\u033d\u0005\u0074\u003b\u0002\u033c\u032a\u0003\u0002\u0002\u0002\u033c\u0331\u0003\u0002\u0002\u0002\u033c\u0337\u0003\u0002\u0002\u0002\u033c\u033b\u0003\u0002\u0002\u0002\u033d\u0343\u0003\u0002\u0002\u0002\u033e\u033f\u000c\u0006\u0002\u0002\u033f\u0340\u0007\u001f\u0002\u0002\u0340\u0342\u0005\u0072\u003a\u0007\u0341\u033e\u0003\u0002\u0002\u0002\u0342\u0345\u0003\u0002\u0002\u0002\u0343\u0341\u0003\u0002\u0002\u0002\u0343\u0344\u0003\u0002\u0002\u0002\u0344\u0073\u0003\u0002\u0002\u0002\u0345\u0343\u0003\u0002\u0002\u0002\u0346\u0347\u0005\u000c\u0007\u0002\u0347\u0348\u0007\u0018\u0002\u0002\u0348\u034a\u0003\u0002\u0002\u0002\u0349\u0346\u0003\u0002\u0002\u0002\u0349\u034a\u0003\u0002\u0002\u0002\u034a\u034b\u0003\u0002\u0002\u0002\u034b\u0354\u0007\u0021\u0002\u0002\u034c\u034e\u0007\u0019\u0002\u0002\u034d\u034f\u0005\u0072\u003a\u0002\u034e\u034d\u0003\u0002\u0002\u0002\u034f\u0350\u0003\u0002\u0002\u0002\u0350\u034e\u0003\u0002\u0002\u0002\u0350\u0351\u0003\u0002\u0002\u0002\u0351\u0352\u0003\u0002\u0002\u0002\u0352\u0353\u0007\u001a\u0002\u0002\u0353\u0355\u0003\u0002\u0002\u0002\u0354\u034c\u0003\u0002\u0002\u0002\u0354\u0355\u0003\u0002\u0002\u0002\u0355\u0075\u0003\u0002\u0002\u0002\u0356\u0357\u0007\u000a\u0002\u0002\u0357\u0358\u0005\u0072\u003a\u0002\u0358\u0359\u0005\u007a\u003e\u0002\u0359\u035d\u0003\u0002\u0002\u0002\u035a\u035b\u0007\u0009\u0002\u0002\u035b\u035d\u0005\u0072\u003a\u0002\u035c\u0356\u0003\u0002\u0002\u0002\u035c\u035a\u0003\u0002\u0002\u0002\u035d\u0077\u0003\u0002\u0002\u0002\u035e\u035f\u0007\u000a\u0002\u0002\u035f\u0362\u0005\u007a\u003e\u0002\u0360\u0362\u0007\u0009\u0002\u0002\u0361\u035e\u0003\u0002\u0002\u0002\u0361\u0360\u0003\u0002\u0002\u0002\u0362\u0079\u0003\u0002\u0002\u0002\u0363\u0367\u0007\u001d\u0002\u0002\u0364\u0366\u0005\u007c\u003f\u0002\u0365\u0364\u0003\u0002\u0002\u0002\u0366\u0369\u0003\u0002\u0002\u0002\u0367\u0365\u0003\u0002\u0002\u0002\u0367\u0368\u0003\u0002\u0002\u0002\u0368\u036a\u0003\u0002\u0002\u0002\u0369\u0367\u0003\u0002\u0002\u0002\u036a\u036b\u0007\u001e\u0002\u0002\u036b\u007b\u0003\u0002\u0002\u0002\u036c\u036d\u0005\u007e\u0040\u0002\u036d\u036e\u0007\u0026\u0002\u0002\u036e\u0374\u0003\u0002\u0002\u0002\u036f\u0370\u0005\u007e\u0040\u0002\u0370\u0371\u0007\u0020\u0002\u0002\u0371\u0372\u0007\u0025\u0002\u0002\u0372\u0374\u0003\u0002\u0002\u0002\u0373\u036c\u0003\u0002\u0002\u0002\u0373\u036f\u0003\u0002\u0002\u0002\u0374\u007d\u0003\u0002\u0002\u0002\u0375\u0376\u0007\u0021\u0002\u0002\u0376\u007f\u0003\u0002\u0002\u0002\u0075\u0081\u0086\u008c\u0094\u009a\u00a2\u00a7\u00ae\u00b8\u00c0\u00c8\u00ce\u00d3\u00d9\u00db\u00e3\u00e9\u00eb\u00f1\u00f4\u00fa\u00fd\u0101\u0109\u010e\u0112\u0117\u011d\u011f\u0127\u0129\u0130\u013c\u0141\u0147\u014e\u0155\u015a\u015e\u0164\u0168\u016f\u0173\u0178\u017e\u0187\u018e\u0199\u019b\u01a3\u01aa\u01af\u01b5\u01bc\u01c1\u01c5\u01cb\u01dd\u01e7\u01ef\u01f5\u0207\u021e\u0227\u022d\u0231\u0238\u023f\u0246\u024d\u0255\u025d\u0262\u0266\u026b\u026f\u0273\u0277\u0279\u0284\u0286\u0288\u0291\u0295\u029b\u02ab\u02b0\u02b6\u02be\u02c6\u02cd\u02d2\u02d6\u02dc\u02e0\u02e7\u02eb\u02f2\u02f7\u02fd\u0304\u0309\u030f\u0311\u0315\u031b\u033c\u0343\u0349\u0350\u0354\u035c\u0361\u0367\u0373"

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
    private val DATA = Tokens.DATA.id
    private val EXTERNAL = Tokens.EXTERNAL.id
    private val FOREIGN = Tokens.FOREIGN.id
    private val NAMESPACE = Tokens.NAMESPACE.id
    private val OVERRIDE = Tokens.OVERRIDE.id
    private val INTERNAL = Tokens.INTERNAL.id
    private val IMPORT = Tokens.IMPORT.id
    private val IMPL = Tokens.IMPL.id
    private val RETURN = Tokens.RETURN.id
    private val TYPECLASS = Tokens.TYPECLASS.id
    private val VAR = Tokens.VAR.id
    private val VAL = Tokens.VAL.id
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
			this.state = 127
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAMESPACE) {
				if (true){
				this.state = 126
				namespace()
				}
			}

			this.state = 132
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPORT) {
				if (true){
				if (true){
				this.state = 129
				importEx()
				}
				}
				this.state = 134
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 138
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ABSTRACT) or (1L shl DATA) or (1L shl IMPL) or (1L shl TYPECLASS) or (1L shl VAR) or (1L shl VAL) or (1L shl INTERFACE) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				if (true){
				this.state = 135
				definition()
				}
				}
				this.state = 140
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
			this.state = 141
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
		fun findImportBody() : ImportBodyContext? = getRuleContext(solver.getType("ImportBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importVanila() : ImportVanilaContext {
		var _localctx : ImportVanilaContext = ImportVanilaContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_importVanila.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 143
			match(IMPORT) as Token
			this.state = 144
			package_()
			this.state = 146
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 145
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
		enterRule(_localctx, 6, Rules.RULE_importBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 148
			match(LBRACE) as Token
			this.state = 152
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 149
				importElement()
				}
				}
				this.state = 154
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 155
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importElement() : ImportElementContext {
		var _localctx : ImportElementContext = ImportElementContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_importElement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 160
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1   -> if (true){
			this.state = 157
			package_()
			this.state = 158
			match(DOT) as Token
			}
			}
			this.state = 165
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1 -> {if (true){
			this.state = 162
			match(ID) as Token
			}}
			2 -> {if (true){
			this.state = 163
			opIdWrap()
			}}
			3 -> {if (true){
			this.state = 164
			aopIdWrap()
			}}
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
		enterRule(_localctx, 10, Rules.RULE_package_.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 167
			match(ID) as Token
			this.state = 172
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,7,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 168
					match(DOT) as Token
					this.state = 169
					match(ID) as Token
					}
					} 
				}
				this.state = 174
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,7,context)
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
		enterRule(_localctx, 12, Rules.RULE_namespace.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 175
			match(NAMESPACE) as Token
			this.state = 176
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
		fun findCompo() : List<CompoContext> = getRuleContexts(solver.getType("CompoContext"))
		fun findCompo(i: Int) : CompoContext? = getRuleContext(solver.getType("CompoContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  body() : BodyContext {
		var _localctx : BodyContext = BodyContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_body.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 178
			match(LBRACE) as Token
			this.state = 182
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ABSTRACT) or (1L shl DATA) or (1L shl IMPL) or (1L shl RETURN) or (1L shl VAR) or (1L shl VAL) or (1L shl INTERFACE) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 179
				compo()
				}
				}
				this.state = 184
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 185
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
		fun findReturning() : ReturningContext? = getRuleContext(solver.getType("ReturningContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  compo() : CompoContext {
		var _localctx : CompoContext = CompoContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_compo.id)
		try {
			this.state = 190
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,9,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 187
			definitionInBody()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 188
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 189
			returning()
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
		fun findClass_() : Class_Context? = getRuleContext(solver.getType("Class_Context"),0)
		fun findInterface_() : Interface_Context? = getRuleContext(solver.getType("Interface_Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  definitionInBody() : DefinitionInBodyContext {
		var _localctx : DefinitionInBodyContext = DefinitionInBodyContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_definitionInBody.id)
		try {
			this.state = 198
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LSQUARE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 192
			def()
			}}
			VAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 193
			var_()
			}}
			VAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 194
			val_()
			}}
			IMPL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 195
			impl()
			}}
			ABSTRACT , DATA  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 196
			class_()
			}}
			INTERFACE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 197
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
		enterRule(_localctx, 20, Rules.RULE_returning.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 200
			match(RETURN) as Token
			this.state = 201
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

	open class Class_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_class_.id
	        set(value) { throw RuntimeException() }
		fun DATA() : TerminalNode? = getToken(FoldingParser.Tokens.DATA.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findClassBody() : ClassBodyContext? = getRuleContext(solver.getType("ClassBodyContext"),0)
		fun ABSTRACT() : TerminalNode? = getToken(FoldingParser.Tokens.ABSTRACT.id, 0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  class_() : Class_Context {
		var _localctx : Class_Context = Class_Context(context, state)
		enterRule(_localctx, 22, Rules.RULE_class_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 204
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ABSTRACT) {
				if (true){
				this.state = 203
				match(ABSTRACT) as Token
				}
			}

			this.state = 206
			match(DATA) as Token
			this.state = 207
			match(ID) as Token
			this.state = 209
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 208
				typeParam()
				}
			}

			this.state = 217
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 211
				match(TILDE) as Token
				this.state = 213 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 212
					typeEx(0)
					}
					}
					this.state = 215 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( _la==LPAREN || _la==ID )
				}
			}

			this.state = 219
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
		fun findDefinitionInClass() : List<DefinitionInClassContext> = getRuleContexts(solver.getType("DefinitionInClassContext"))
		fun findDefinitionInClass(i: Int) : DefinitionInClassContext? = getRuleContext(solver.getType("DefinitionInClassContext"),i)
		fun findStaticDefinition() : List<StaticDefinitionContext> = getRuleContexts(solver.getType("StaticDefinitionContext"))
		fun findStaticDefinition(i: Int) : StaticDefinitionContext? = getRuleContext(solver.getType("StaticDefinitionContext"),i)
		fun findAbstractDefinitionInClass() : List<AbstractDefinitionInClassContext> = getRuleContexts(solver.getType("AbstractDefinitionInClassContext"))
		fun findAbstractDefinitionInClass(i: Int) : AbstractDefinitionInClassContext? = getRuleContext(solver.getType("AbstractDefinitionInClassContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  classBody() : ClassBodyContext {
		var _localctx : ClassBodyContext = ClassBodyContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_classBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 221
			match(LBRACE) as Token
			this.state = 225
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN) {
				if (true){
				if (true){
				this.state = 222
				constuctor()
				}
				}
				this.state = 227
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 233
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl OVERRIDE) or (1L shl INTERNAL) or (1L shl IMPL) or (1L shl VAR) or (1L shl VAL) or (1L shl STATIC) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 231
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,16,context) ) {
				1 -> {if (true){
				this.state = 228
				definitionInClass()
				}}
				2 -> {if (true){
				this.state = 229
				staticDefinition()
				}}
				3 -> {if (true){
				this.state = 230
				abstractDefinitionInClass()
				}}
				}
				}
				this.state = 235
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 236
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

	open class DefinitionInClassContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_definitionInClass.id
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

	fun  definitionInClass() : DefinitionInClassContext {
		var _localctx : DefinitionInClassContext = DefinitionInClassContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_definitionInClass.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 239
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INTERNAL) {
				if (true){
				this.state = 238
				match(INTERNAL) as Token
				}
			}

			this.state = 242
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OVERRIDE) {
				if (true){
				this.state = 241
				match(OVERRIDE) as Token
				}
			}

			this.state = 248
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 244
			val_()
			}}
			VAR  ->  /*LL1AltBlock*/{if (true){
			this.state = 245
			var_()
			}}
			LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
			this.state = 246
			def()
			}}
			IMPL  ->  /*LL1AltBlock*/{if (true){
			this.state = 247
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

	open class AbstractDefinitionInClassContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_abstractDefinitionInClass.id
	        set(value) { throw RuntimeException() }
		fun findPropertyInInterface() : PropertyInInterfaceContext? = getRuleContext(solver.getType("PropertyInInterfaceContext"),0)
		fun findDefInInterface() : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),0)
		fun INTERNAL() : TerminalNode? = getToken(FoldingParser.Tokens.INTERNAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  abstractDefinitionInClass() : AbstractDefinitionInClassContext {
		var _localctx : AbstractDefinitionInClassContext = AbstractDefinitionInClassContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_abstractDefinitionInClass.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 251
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INTERNAL) {
				if (true){
				this.state = 250
				match(INTERNAL) as Token
				}
			}

			this.state = 255
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAR , VAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 253
			propertyInInterface()
			}}
			LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
			this.state = 254
			defInInterface()
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
		fun findClass_() : Class_Context? = getRuleContext(solver.getType("Class_Context"),0)
		fun findInterface_() : Interface_Context? = getRuleContext(solver.getType("Interface_Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  staticDefinition() : StaticDefinitionContext {
		var _localctx : StaticDefinitionContext = StaticDefinitionContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_staticDefinition.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 257
			match(STATIC) as Token
			this.state = 263
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 258
			val_()
			}}
			VAR  ->  /*LL1AltBlock*/{if (true){
			this.state = 259
			var_()
			}}
			LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
			this.state = 260
			def()
			}}
			ABSTRACT , DATA  ->  /*LL1AltBlock*/{if (true){
			this.state = 261
			class_()
			}}
			INTERFACE  ->  /*LL1AltBlock*/{if (true){
			this.state = 262
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
		enterRule(_localctx, 32, Rules.RULE_constuctor.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 266 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 265
				parameter()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 268 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,24,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 272
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 270
				match(ASSGIN) as Token
				this.state = 271
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
		enterRule(_localctx, 34, Rules.RULE_interface_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 274
			match(INTERFACE) as Token
			this.state = 275
			match(ID) as Token
			this.state = 277
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 276
				typeParam()
				}
			}

			this.state = 285
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 279
				match(TILDE) as Token
				this.state = 281 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 280
					typeEx(0)
					}
					}
					this.state = 283 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( _la==LPAREN || _la==ID )
				}
			}

			this.state = 287
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
		enterRule(_localctx, 36, Rules.RULE_interfaceBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 289
			match(LBRACE) as Token
			this.state = 295
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl VAR) or (1L shl VAL) or (1L shl STATIC) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 293
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 290
				defInInterface()
				}}
				VAR , VAL  ->  /*LL1AltBlock*/{if (true){
				this.state = 291
				propertyInInterface()
				}}
				STATIC  ->  /*LL1AltBlock*/{if (true){
				this.state = 292
				staticDefinition()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 297
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 298
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
		enterRule(_localctx, 38, Rules.RULE_propertyInInterface.id)
		try {
			this.state = 302
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 300
			valInInterface()
			}}
			VAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 301
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
		enterRule(_localctx, 40, Rules.RULE_valInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 304
			match(VAL) as Token
			this.state = 305
			match(ID) as Token
			this.state = 306
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
		enterRule(_localctx, 42, Rules.RULE_varInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 308
			match(VAR) as Token
			this.state = 309
			match(ID) as Token
			this.state = 310
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
		enterRule(_localctx, 44, Rules.RULE_defInInterface.id)
		var _la: Int
		try {
			var _alt: Int
			this.state = 374
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,43,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 312
			match(ID) as Token
			this.state = 314
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 313
				typeParam()
				}
			}

			this.state = 319
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,33,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 316
					parameter()
					}
					} 
				}
				this.state = 321
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,33,context)
			}
			this.state = 322
			typeEx(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 323
			opIdWrap()
			this.state = 325
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 324
				typeParam()
				}
			}

			this.state = 327
			opParameter()
			this.state = 328
			typeEx(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 330
			aopIdWrap()
			this.state = 332
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 331
				typeParam()
				}
			}

			this.state = 334
			aopParameter()
			this.state = 335
			typeEx(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 337
			match(ID) as Token
			this.state = 339
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 338
				typeParam()
				}
			}

			this.state = 344
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,37,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 341
					parameter()
					}
					} 
				}
				this.state = 346
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,37,context)
			}
			this.state = 348
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 347
				typeEx(0)
				}
			}

			this.state = 350
			match(ASSGIN) as Token
			this.state = 351
			value(0)
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 352
			opIdWrap()
			this.state = 354
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 353
				typeParam()
				}
			}

			this.state = 356
			opParameter()
			this.state = 358
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 357
				typeEx(0)
				}
			}

			this.state = 360
			match(ASSGIN) as Token
			this.state = 361
			value(0)
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 363
			aopIdWrap()
			this.state = 365
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 364
				typeParam()
				}
			}

			this.state = 367
			aopParameter()
			this.state = 369
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 368
				typeEx(0)
				}
			}

			this.state = 371
			match(ASSGIN) as Token
			this.state = 372
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
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		fun findTypeParamCompo() : List<TypeParamCompoContext> = getRuleContexts(solver.getType("TypeParamCompoContext"))
		fun findTypeParamCompo(i: Int) : TypeParamCompoContext? = getRuleContext(solver.getType("TypeParamCompoContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeParam() : TypeParamContext {
		var _localctx : TypeParamContext = TypeParamContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_typeParam.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 376
			match(LSQUARE) as Token
			this.state = 378 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 377
				typeParamCompo()
				}
				}
				this.state = 380 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==ID )
			this.state = 382
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
		enterRule(_localctx, 48, Rules.RULE_typeParamCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 384
			match(ID) as Token
			this.state = 389
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TILDE) {
				if (true){
				if (true){
				this.state = 385
				match(TILDE) as Token
				this.state = 386
				typeEx(0)
				}
				}
				this.state = 391
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

	open class TypeParamOnTypeclassContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeParamOnTypeclass.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun ID() : List<TerminalNode> = getTokens(FoldingParser.Tokens.ID.id)
		fun ID(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.ID.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeParamOnTypeclass() : TypeParamOnTypeclassContext {
		var _localctx : TypeParamOnTypeclassContext = TypeParamOnTypeclassContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_typeParamOnTypeclass.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 392
			match(LPAREN) as Token
			this.state = 394 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 393
				match(ID) as Token
				}
				}
				this.state = 396 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==ID )
			this.state = 398
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

	open class TypeclassContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeclass.id
	        set(value) { throw RuntimeException() }
		fun TYPECLASS() : TerminalNode? = getToken(FoldingParser.Tokens.TYPECLASS.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeParamOnTypeclass() : TypeParamOnTypeclassContext? = getRuleContext(solver.getType("TypeParamOnTypeclassContext"),0)
		fun findTypeclassDefBody() : TypeclassDefBodyContext? = getRuleContext(solver.getType("TypeclassDefBodyContext"),0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeclass() : TypeclassContext {
		var _localctx : TypeclassContext = TypeclassContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_typeclass.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 400
			match(TYPECLASS) as Token
			this.state = 401
			match(ID) as Token
			this.state = 402
			typeParamOnTypeclass()
			this.state = 409
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 403
				match(TILDE) as Token
				this.state = 405 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 404
					typeEx(0)
					}
					}
					this.state = 407 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( _la==LPAREN || _la==ID )
				}
			}

			this.state = 411
			typeclassDefBody()
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

	open class TypeclassDefBodyContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeclassDefBody.id
	        set(value) { throw RuntimeException() }
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findDefInTypeclass() : List<DefInTypeclassContext> = getRuleContexts(solver.getType("DefInTypeclassContext"))
		fun findDefInTypeclass(i: Int) : DefInTypeclassContext? = getRuleContext(solver.getType("DefInTypeclassContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeclassDefBody() : TypeclassDefBodyContext {
		var _localctx : TypeclassDefBodyContext = TypeclassDefBodyContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_typeclassDefBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 413
			match(LBRACE) as Token
			this.state = 417
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 414
				defInTypeclass()
				}
				}
				this.state = 419
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 420
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

	open class DefInTypeclassContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_defInTypeclass.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameterInTypeclass() : List<ParameterInTypeclassContext> = getRuleContexts(solver.getType("ParameterInTypeclassContext"))
		fun findParameterInTypeclass(i: Int) : ParameterInTypeclassContext? = getRuleContext(solver.getType("ParameterInTypeclassContext"),i)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findOpParameterInTypeclass() : OpParameterInTypeclassContext? = getRuleContext(solver.getType("OpParameterInTypeclassContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findAopParameterInTypeclass() : AopParameterInTypeclassContext? = getRuleContext(solver.getType("AopParameterInTypeclassContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defInTypeclass() : DefInTypeclassContext {
		var _localctx : DefInTypeclassContext = DefInTypeclassContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_defInTypeclass.id)
		var _la: Int
		try {
			var _alt: Int
			this.state = 447
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,54,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 422
			match(ID) as Token
			this.state = 424
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 423
				typeParam()
				}
			}

			this.state = 429
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,51,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 426
					parameterInTypeclass()
					}
					} 
				}
				this.state = 431
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,51,context)
			}
			this.state = 432
			typeEx(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 433
			opIdWrap()
			this.state = 435
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 434
				typeParam()
				}
			}

			this.state = 437
			opParameterInTypeclass()
			this.state = 438
			typeEx(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 440
			aopIdWrap()
			this.state = 442
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 441
				typeParam()
				}
			}

			this.state = 444
			aopParameterInTypeclass()
			this.state = 445
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

	open class ParamExInTypeclassContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_paramExInTypeclass.id
	        set(value) { throw RuntimeException() }
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ELLIPSIS() : TerminalNode? = getToken(FoldingParser.Tokens.ELLIPSIS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramExInTypeclass() : ParamExInTypeclassContext {
		var _localctx : ParamExInTypeclassContext = ParamExInTypeclassContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_paramExInTypeclass.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 449
			typeEx(0)
			this.state = 451
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 450
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

	open class ParameterInTypeclassContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameterInTypeclass.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findParamExInTypeclass() : List<ParamExInTypeclassContext> = getRuleContexts(solver.getType("ParamExInTypeclassContext"))
		fun findParamExInTypeclass(i: Int) : ParamExInTypeclassContext? = getRuleContext(solver.getType("ParamExInTypeclassContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parameterInTypeclass() : ParameterInTypeclassContext {
		var _localctx : ParameterInTypeclassContext = ParameterInTypeclassContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_parameterInTypeclass.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 453
			match(LPAREN) as Token
			this.state = 457
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN || _la==ID) {
				if (true){
				if (true){
				this.state = 454
				paramExInTypeclass()
				}
				}
				this.state = 459
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 460
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

	open class OpParameterInTypeclassContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opParameterInTypeclass.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParamExInTypeclass() : List<ParamExInTypeclassContext> = getRuleContexts(solver.getType("ParamExInTypeclassContext"))
		fun findParamExInTypeclass(i: Int) : ParamExInTypeclassContext? = getRuleContext(solver.getType("ParamExInTypeclassContext"),i)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  opParameterInTypeclass() : OpParameterInTypeclassContext {
		var _localctx : OpParameterInTypeclassContext = OpParameterInTypeclassContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_opParameterInTypeclass.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 462
			match(LPAREN) as Token
			this.state = 463
			paramExInTypeclass()
			this.state = 464
			paramExInTypeclass()
			this.state = 465
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

	open class AopParameterInTypeclassContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_aopParameterInTypeclass.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParamExInTypeclass() : ParamExInTypeclassContext? = getRuleContext(solver.getType("ParamExInTypeclassContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  aopParameterInTypeclass() : AopParameterInTypeclassContext {
		var _localctx : AopParameterInTypeclassContext = AopParameterInTypeclassContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_aopParameterInTypeclass.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 467
			match(LPAREN) as Token
			this.state = 468
			paramExInTypeclass()
			this.state = 469
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
		enterRule(_localctx, 66, Rules.RULE_impl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 471
			match(IMPL) as Token
			this.state = 475
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE) {
				if (true){
				if (true){
				this.state = 472
				typeParam()
				}
				}
				this.state = 477
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 478
			typeEx(0)
			this.state = 479
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
		enterRule(_localctx, 68, Rules.RULE_implBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 481
			match(LBRACE) as Token
			this.state = 485
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 482
				defInImpl()
				}
				}
				this.state = 487
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 488
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
		enterRule(_localctx, 70, Rules.RULE_paramExInImpl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 490
			match(ID) as Token
			this.state = 493
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 491
				match(ASSGIN) as Token
				this.state = 492
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
		enterRule(_localctx, 72, Rules.RULE_parameterInImpl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 495
			match(LPAREN) as Token
			this.state = 499
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 496
				paramExInImpl()
				}
				}
				this.state = 501
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 502
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
		enterRule(_localctx, 74, Rules.RULE_opParameterInImpl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 504
			match(LPAREN) as Token
			this.state = 505
			paramExInImpl()
			this.state = 506
			paramExInImpl()
			this.state = 507
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
		enterRule(_localctx, 76, Rules.RULE_aopParameterInImpl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 509
			match(LPAREN) as Token
			this.state = 510
			paramExInImpl()
			this.state = 511
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
		fun findParameterInImpl() : List<ParameterInImplContext> = getRuleContexts(solver.getType("ParameterInImplContext"))
		fun findParameterInImpl(i: Int) : ParameterInImplContext? = getRuleContext(solver.getType("ParameterInImplContext"),i)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findOpParameterInImpl() : OpParameterInImplContext? = getRuleContext(solver.getType("OpParameterInImplContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findAopParameterInImpl() : AopParameterInImplContext? = getRuleContext(solver.getType("AopParameterInImplContext"),0)
		fun findForeignAutoTyped() : ForeignAutoTypedContext? = getRuleContext(solver.getType("ForeignAutoTypedContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defInImpl() : DefInImplContext {
		var _localctx : DefInImplContext = DefInImplContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_defInImpl.id)
		var _la: Int
		try {
			this.state = 540
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,62,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 513
			match(ID) as Token
			this.state = 517
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN) {
				if (true){
				if (true){
				this.state = 514
				parameterInImpl()
				}
				}
				this.state = 519
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 520
			match(ASSGIN) as Token
			this.state = 521
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 522
			opIdWrap()
			this.state = 523
			opParameterInImpl()
			this.state = 524
			match(ASSGIN) as Token
			this.state = 525
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 527
			aopIdWrap()
			this.state = 528
			aopParameterInImpl()
			this.state = 529
			match(ASSGIN) as Token
			this.state = 530
			value(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 532
			match(ID) as Token
			this.state = 533
			foreignAutoTyped()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 534
			opIdWrap()
			this.state = 535
			foreignAutoTyped()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 537
			aopIdWrap()
			this.state = 538
			foreignAutoTyped()
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
		fun findTypeclass() : TypeclassContext? = getRuleContext(solver.getType("TypeclassContext"),0)
		fun findImpl() : ImplContext? = getRuleContext(solver.getType("ImplContext"),0)
		fun findClass_() : Class_Context? = getRuleContext(solver.getType("Class_Context"),0)
		fun findInterface_() : Interface_Context? = getRuleContext(solver.getType("Interface_Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  definition() : DefinitionContext {
		var _localctx : DefinitionContext = DefinitionContext(context, state)
		enterRule(_localctx, 80, Rules.RULE_definition.id)
		try {
			this.state = 549
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LSQUARE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 542
			def()
			}}
			VAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 543
			val_()
			}}
			VAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 544
			var_()
			}}
			TYPECLASS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 545
			typeclass()
			}}
			IMPL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 546
			impl()
			}}
			ABSTRACT , DATA  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 547
			class_()
			}}
			INTERFACE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 548
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
		var _startState : Int = 82
		enterRecursionRule(_localctx, 82, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 631
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,78,context) ) {
			1 -> {if (true){
			this.state = 555
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,64,context) ) {
			1   -> if (true){
			this.state = 552
			package_()
			this.state = 553
			match(DOT) as Token
			}
			}
			this.state = 557
			match(ID) as Token
			this.state = 559
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,65,context) ) {
			1   -> if (true){
			this.state = 558
			typeCasting()
			}
			}
			}}
			2 -> {if (true){
			this.state = 561
			match(Integer) as Token
			}}
			3 -> {if (true){
			this.state = 562
			match(LPAREN) as Token
			this.state = 563
			match(Integer) as Token
			this.state = 564
			match(RPAREN) as Token
			this.state = 566
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,66,context) ) {
			1   -> if (true){
			this.state = 565
			typeCasting()
			}
			}
			}}
			4 -> {if (true){
			this.state = 568
			match(Double) as Token
			}}
			5 -> {if (true){
			this.state = 569
			match(LPAREN) as Token
			this.state = 570
			match(Double) as Token
			this.state = 571
			match(RPAREN) as Token
			this.state = 573
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,67,context) ) {
			1   -> if (true){
			this.state = 572
			typeCasting()
			}
			}
			}}
			6 -> {if (true){
			this.state = 575
			match(String) as Token
			}}
			7 -> {if (true){
			this.state = 576
			match(LPAREN) as Token
			this.state = 577
			match(String) as Token
			this.state = 578
			match(RPAREN) as Token
			this.state = 580
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,68,context) ) {
			1   -> if (true){
			this.state = 579
			typeCasting()
			}
			}
			}}
			8 -> {if (true){
			this.state = 582
			match(LPAREN) as Token
			this.state = 583
			value(0)
			this.state = 584
			argValue()
			this.state = 585
			match(RPAREN) as Token
			this.state = 587
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,69,context) ) {
			1   -> if (true){
			this.state = 586
			typeCasting()
			}
			}
			}}
			9 -> {if (true){
			this.state = 589
			match(LPAREN) as Token
			this.state = 590
			value(0)
			this.state = 591
			match(OPID) as Token
			this.state = 592
			value(0)
			this.state = 593
			match(RPAREN) as Token
			this.state = 595
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,70,context) ) {
			1   -> if (true){
			this.state = 594
			typeCasting()
			}
			}
			}}
			10 -> {if (true){
			this.state = 597
			match(OPID) as Token
			this.state = 598
			value(7)
			}}
			11 -> {if (true){
			this.state = 599
			match(LPAREN) as Token
			this.state = 600
			match(OPID) as Token
			this.state = 601
			value(0)
			this.state = 603
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,71,context) ) {
			1   -> if (true){
			this.state = 602
			typeCasting()
			}
			}
			}}
			12 -> {if (true){
			this.state = 608
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 605
				package_()
				this.state = 606
				match(DOT) as Token
				}
			}

			this.state = 610
			opIdWrap()
			this.state = 612
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,73,context) ) {
			1   -> if (true){
			this.state = 611
			typeCasting()
			}
			}
			}}
			13 -> {if (true){
			this.state = 617
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 614
				package_()
				this.state = 615
				match(DOT) as Token
				}
			}

			this.state = 619
			aopIdWrap()
			this.state = 621
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,75,context) ) {
			1   -> if (true){
			this.state = 620
			typeCasting()
			}
			}
			}}
			14 -> {if (true){
			this.state = 623
			body()
			this.state = 625
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,76,context) ) {
			1   -> if (true){
			this.state = 624
			typeCasting()
			}
			}
			}}
			15 -> {if (true){
			this.state = 627
			lambda()
			this.state = 629
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,77,context) ) {
			1   -> if (true){
			this.state = 628
			typeCasting()
			}
			}
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 646
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,81,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 644
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,80,context) ) {
					1 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 633
					if (!(precpred(context!!, 9))) throw FailedPredicateException(this, "precpred(context!!, 9)")
					this.state = 634
					match(OPID) as Token
					this.state = 635
					value(10)
					}}
					2 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 636
					if (!(precpred(context!!, 11))) throw FailedPredicateException(this, "precpred(context!!, 11)")
					this.state = 637
					argValue()
					}}
					3 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 638
					if (!(precpred(context!!, 5))) throw FailedPredicateException(this, "precpred(context!!, 5)")
					this.state = 639
					match(DOT) as Token
					this.state = 640
					value(0)
					this.state = 642
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,79,context) ) {
					1   -> if (true){
					this.state = 641
					typeCasting()
					}
					}
					}}
					}
					} 
				}
				this.state = 648
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,81,context)
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
		enterRule(_localctx, 84, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 649
			match(AS) as Token
			this.state = 650
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
		enterRule(_localctx, 86, Rules.RULE_paramEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 652
			match(ID) as Token
			this.state = 653
			typeEx(0)
			this.state = 655
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 654
				match(ELLIPSIS) as Token
				}
			}

			this.state = 659
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 657
				match(ASSGIN) as Token
				this.state = 658
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
		enterRule(_localctx, 88, Rules.RULE_parameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 661
			match(LPAREN) as Token
			this.state = 665
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 662
				paramEx()
				}
				}
				this.state = 667
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 668
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
		enterRule(_localctx, 90, Rules.RULE_opParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 670
			match(LPAREN) as Token
			this.state = 671
			paramEx()
			this.state = 672
			paramEx()
			this.state = 673
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
		enterRule(_localctx, 92, Rules.RULE_aopParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 675
			match(LPAREN) as Token
			this.state = 676
			paramEx()
			this.state = 677
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
		enterRule(_localctx, 94, Rules.RULE_argEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 681
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,85,context) ) {
			1   -> if (true){
			this.state = 679
			match(ID) as Token
			this.state = 680
			match(ASSGIN) as Token
			}
			}
			this.state = 683
			value(0)
			this.state = 686
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 684
				match(TILDE) as Token
				this.state = 685
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
		enterRule(_localctx, 96, Rules.RULE_argValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 688
			match(LPAREN) as Token
			this.state = 692
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 689
				argEx()
				}
				}
				this.state = 694
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 695
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
		enterRule(_localctx, 98, Rules.RULE_val_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 697
			match(VAL) as Token
			this.state = 698
			match(ID) as Token
			this.state = 700
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 699
				typeEx(0)
				}
			}

			this.state = 702
			match(ASSGIN) as Token
			this.state = 703
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
		enterRule(_localctx, 100, Rules.RULE_var_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 705
			match(VAR) as Token
			this.state = 706
			match(ID) as Token
			this.state = 708
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 707
				typeEx(0)
				}
			}

			this.state = 710
			match(ASSGIN) as Token
			this.state = 711
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
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : List<ParameterContext> = getRuleContexts(solver.getType("ParameterContext"))
		fun findParameter(i: Int) : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),i)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findOpParameter() : OpParameterContext? = getRuleContext(solver.getType("OpParameterContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findAopParameter() : AopParameterContext? = getRuleContext(solver.getType("AopParameterContext"),0)
		fun findForeign() : ForeignContext? = getRuleContext(solver.getType("ForeignContext"),0)
		fun findParameterInTypeclass() : List<ParameterInTypeclassContext> = getRuleContexts(solver.getType("ParameterInTypeclassContext"))
		fun findParameterInTypeclass(i: Int) : ParameterInTypeclassContext? = getRuleContext(solver.getType("ParameterInTypeclassContext"),i)
		fun findOpParameterInTypeclass() : OpParameterInTypeclassContext? = getRuleContext(solver.getType("OpParameterInTypeclassContext"),0)
		fun findAopParameterInTypeclass() : AopParameterInTypeclassContext? = getRuleContext(solver.getType("AopParameterInTypeclassContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  def() : DefContext {
		var _localctx : DefContext = DefContext(context, state)
		enterRule(_localctx, 102, Rules.RULE_def.id)
		var _la: Int
		try {
			var _alt: Int
			this.state = 775
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,101,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 713
			match(ID) as Token
			this.state = 715
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 714
				typeParam()
				}
			}

			this.state = 720
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,91,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 717
					parameter()
					}
					} 
				}
				this.state = 722
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,91,context)
			}
			this.state = 724
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 723
				typeEx(0)
				}
			}

			this.state = 726
			match(ASSGIN) as Token
			this.state = 727
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 728
			opIdWrap()
			this.state = 730
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 729
				typeParam()
				}
			}

			this.state = 732
			opParameter()
			this.state = 734
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 733
				typeEx(0)
				}
			}

			this.state = 736
			match(ASSGIN) as Token
			this.state = 737
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 739
			aopIdWrap()
			this.state = 741
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 740
				typeParam()
				}
			}

			this.state = 743
			aopParameter()
			this.state = 745
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 744
				typeEx(0)
				}
			}

			this.state = 747
			match(ASSGIN) as Token
			this.state = 748
			value(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 750
			match(ID) as Token
			this.state = 752
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 751
				typeParam()
				}
			}

			this.state = 757
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN) {
				if (true){
				if (true){
				this.state = 754
				parameterInTypeclass()
				}
				}
				this.state = 759
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 760
			foreign()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 761
			opIdWrap()
			this.state = 763
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 762
				typeParam()
				}
			}

			this.state = 765
			opParameterInTypeclass()
			this.state = 766
			foreign()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 768
			aopIdWrap()
			this.state = 770
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 769
				typeParam()
				}
			}

			this.state = 772
			aopParameterInTypeclass()
			this.state = 773
			foreign()
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
		enterRule(_localctx, 104, Rules.RULE_lambdaParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 777
			match(ID) as Token
			this.state = 783
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 778
				match(TILDE) as Token
				this.state = 779
				typeEx(0)
				this.state = 781
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==ELLIPSIS) {
					if (true){
					this.state = 780
					match(ELLIPSIS) as Token
					}
				}

				}
			}

			this.state = 787
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 785
				match(ASSGIN) as Token
				this.state = 786
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
		enterRule(_localctx, 106, Rules.RULE_lambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 789
			match(LSQUARE) as Token
			this.state = 793
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 790
				lambdaParamEx()
				}
				}
				this.state = 795
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 796
			match(RSQUARE) as Token
			this.state = 797
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
		enterRule(_localctx, 108, Rules.RULE_opIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 799
			match(LSQUARE) as Token
			this.state = 800
			match(OPID) as Token
			this.state = 801
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
		enterRule(_localctx, 110, Rules.RULE_aopIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 803
			match(LSQUARE) as Token
			this.state = 804
			match(TILDE) as Token
			this.state = 805
			match(OPID) as Token
			this.state = 806
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
		var _startState : Int = 112
		enterRecursionRule(_localctx, 112, Rules.RULE_typeEx.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 826
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,106,context) ) {
			1 -> {if (true){
			this.state = 809
			match(LPAREN) as Token
			this.state = 810
			typeEx(0)
			this.state = 811
			match(ARROW) as Token
			this.state = 812
			typeEx(0)
			this.state = 813
			match(RPAREN) as Token
			}}
			2 -> {if (true){
			this.state = 815
			match(LPAREN) as Token
			this.state = 816
			typeExSingle()
			this.state = 817
			match(ARROW) as Token
			this.state = 818
			typeEx(0)
			this.state = 819
			match(RPAREN) as Token
			}}
			3 -> {if (true){
			this.state = 821
			typeExSingle()
			this.state = 822
			match(ARROW) as Token
			this.state = 823
			typeEx(2)
			}}
			4 -> {if (true){
			this.state = 825
			typeExSingle()
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 833
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,107,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = TypeExContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_typeEx.id)
					this.state = 828
					if (!(precpred(context!!, 4))) throw FailedPredicateException(this, "precpred(context!!, 4)")
					this.state = 829
					match(ARROW) as Token
					this.state = 830
					typeEx(5)
					}
					} 
				}
				this.state = 835
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,107,context)
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
		enterRule(_localctx, 114, Rules.RULE_typeExSingle.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 839
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,108,context) ) {
			1   -> if (true){
			this.state = 836
			package_()
			this.state = 837
			match(DOT) as Token
			}
			}
			this.state = 841
			match(ID) as Token
			this.state = 850
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,110,context) ) {
			1   -> if (true){
			this.state = 842
			match(LPAREN) as Token
			this.state = 844 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 843
				typeEx(0)
				}
				}
				this.state = 846 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==LPAREN || _la==ID )
			this.state = 848
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
		enterRule(_localctx, 116, Rules.RULE_foreign.id)
		try {
			this.state = 858
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 852
			match(FOREIGN) as Token
			this.state = 853
			typeEx(0)
			this.state = 854
			foreignBody()
			}}
			EXTERNAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 856
			match(EXTERNAL) as Token
			this.state = 857
			typeEx(0)
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

	open class ForeignAutoTypedContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_foreignAutoTyped.id
	        set(value) { throw RuntimeException() }
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun findForeignBody() : ForeignBodyContext? = getRuleContext(solver.getType("ForeignBodyContext"),0)
		fun EXTERNAL() : TerminalNode? = getToken(FoldingParser.Tokens.EXTERNAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignAutoTyped() : ForeignAutoTypedContext {
		var _localctx : ForeignAutoTypedContext = ForeignAutoTypedContext(context, state)
		enterRule(_localctx, 118, Rules.RULE_foreignAutoTyped.id)
		try {
			this.state = 863
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 860
			match(FOREIGN) as Token
			this.state = 861
			foreignBody()
			}}
			EXTERNAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 862
			match(EXTERNAL) as Token
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
		enterRule(_localctx, 120, Rules.RULE_foreignBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 865
			match(LBRACE) as Token
			this.state = 869
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 866
				foreignElement()
				}
				}
				this.state = 871
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 872
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
		enterRule(_localctx, 122, Rules.RULE_foreignElement.id)
		try {
			this.state = 881
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,114,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 874
			foreignPlatform()
			this.state = 875
			match(RawString) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 877
			foreignPlatform()
			this.state = 878
			match(TILDE) as Token
			this.state = 879
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
		enterRule(_localctx, 124, Rules.RULE_foreignPlatform.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 883
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
		41 -> return value_sempred(_localctx as ValueContext, predIndex)
		56 -> return typeEx_sempred(_localctx as TypeExContext, predIndex)
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
		    3 -> return precpred(context!!, 4)
		}
		return true
	}

}