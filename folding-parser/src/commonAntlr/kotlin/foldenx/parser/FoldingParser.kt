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
                                                              FoldingParser.Constructor_Context::class,
                                                              FoldingParser.SubconstructorContext::class,
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
        RULE_constructor_(11),
        RULE_subconstructor(12),
        RULE_interface_(13),
        RULE_interfaceBody(14),
        RULE_valInInterface(15),
        RULE_varInInterface(16),
        RULE_defInInterface(17),
        RULE_newdata(18),
        RULE_typeParam(19),
        RULE_typeParamCompo(20),
        RULE_definition(21),
        RULE_field(22),
        RULE_value(23),
        RULE_typeCasting(24),
        RULE_paramEx(25),
        RULE_parameter(26),
        RULE_opParameter(27),
        RULE_aopParameter(28),
        RULE_argEx(29),
        RULE_argValue(30),
        RULE_val_(31),
        RULE_var_(32),
        RULE_valSetted(33),
        RULE_varSetted(34),
        RULE_def(35),
        RULE_compiledId(36),
        RULE_lambdaParamEx(37),
        RULE_lambda(38),
        RULE_opIdWrap(39),
        RULE_aopIdWrap(40),
        RULE_typeEx(41),
        RULE_typeExSingle(42),
        RULE_typeExParamEx(43),
        RULE_typeExParameter(44),
        RULE_foreign(45),
        RULE_foreignBody(46),
        RULE_foreignElement(47),
        RULE_foreignPlatform(48),
        RULE_annoValue(49),
        RULE_annoParam(50),
        RULE_annotationDef(51),
        RULE_annotation(52),
        RULE_annotationBlock(53),
        RULE_literal(54)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "importEx", "importVanila", "package_", 
                                "namespace", "doBlock", "compo", "returning", 
                                "staticBlock", "class_", "classBody", "constructor_", 
                                "subconstructor", "interface_", "interfaceBody", 
                                "valInInterface", "varInInterface", "defInInterface", 
                                "newdata", "typeParam", "typeParamCompo", 
                                "definition", "field", "value", "typeCasting", 
                                "paramEx", "parameter", "opParameter", "aopParameter", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u002e\u0338\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0003\u0002\u0005\u0002\u0072\u000a\u0002\u0003\u0002\u0007\u0002\u0075\u000a\u0002\u000c\u0002\u000e\u0002\u0078\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u007e\u000a\u0002\u000c\u0002\u000e\u0002\u0081\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0007\u0005\u008b\u000a\u0005\u000c\u0005\u000e\u0005\u008e\u000b\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u0096\u000a\u0007\u000c\u0007\u000e\u0007\u0099\u000b\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u00a0\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0007\u000a\u00a9\u000a\u000a\u000c\u000a\u000e\u000a\u00ac\u000b\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0005\u000b\u00b1\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u00b6\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0005\u000c\u00bd\u000a\u000c\u0003\u000c\u0007\u000c\u00c0\u000a\u000c\u000c\u000c\u000e\u000c\u00c3\u000b\u000c\u0003\u000c\u0005\u000c\u00c6\u000a\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00ca\u000a\u000c\u000c\u000c\u000e\u000c\u00cd\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00d2\u000a\u000c\u000c\u000c\u000e\u000c\u00d5\u000b\u000c\u0003\u000c\u0005\u000c\u00d8\u000a\u000c\u0003\u000c\u0005\u000c\u00db\u000a\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00df\u000a\u000c\u000c\u000c\u000e\u000c\u00e2\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0005\u000c\u00e7\u000a\u000c\u0003\u000c\u0005\u000c\u00ea\u000a\u000c\u0003\u000c\u0007\u000c\u00ed\u000a\u000c\u000c\u000c\u000e\u000c\u00f0\u000b\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00f4\u000a\u000c\u000c\u000c\u000e\u000c\u00f7\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0005\u000c\u00fc\u000a\u000c\u0003\u000c\u0007\u000c\u00ff\u000a\u000c\u000c\u000c\u000e\u000c\u0102\u000b\u000c\u0003\u000c\u0005\u000c\u0105\u000a\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u0109\u000a\u000c\u000c\u000c\u000e\u000c\u010c\u000b\u000c\u0003\u000c\u0005\u000c\u010f\u000a\u000c\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0005\u000f\u0118\u000a\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u011d\u000a\u000f\u0003\u000f\u0003\u000f\u0006\u000f\u0121\u000a\u000f\u000d\u000f\u000e\u000f\u0122\u0005\u000f\u0125\u000a\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0005\u0010\u012b\u000a\u0010\u0003\u0010\u0007\u0010\u012e\u000a\u0010\u000c\u0010\u000e\u0010\u0131\u000b\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0005\u0013\u013e\u000a\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0142\u000a\u0013\u0003\u0013\u0005\u0013\u0145\u000a\u0013\u0003\u0013\u0005\u0013\u0148\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u014e\u000a\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0152\u000a\u0013\u0003\u0013\u0005\u0013\u0155\u000a\u0013\u0003\u0013\u0005\u0013\u0158\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u015d\u000a\u0013\u0003\u0013\u0005\u0013\u0160\u000a\u0013\u0003\u0014\u0005\u0014\u0163\u000a\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014\u0169\u000a\u0014\u000c\u0014\u000e\u0014\u016c\u000b\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0006\u0015\u0171\u000a\u0015\u000d\u0015\u000e\u0015\u0172\u0003\u0016\u0003\u0016\u0003\u0016\u0007\u0016\u0178\u000a\u0016\u000c\u0016\u000e\u0016\u017b\u000b\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0180\u000a\u0017\u0003\u0018\u0005\u0018\u0183\u000a\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0187\u000a\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u0191\u000a\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u0197\u000a\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u019d\u000a\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u01a8\u000a\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0007\u0019\u01b4\u000a\u0019\u000c\u0019\u000e\u0019\u01b7\u000b\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0005\u001b\u01bd\u000a\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001b\u01c2\u000a\u001b\u0003\u001b\u0003\u001b\u0005\u001b\u01c6\u000a\u001b\u0003\u001c\u0003\u001c\u0007\u001c\u01ca\u000a\u001c\u000c\u001c\u000e\u001c\u01cd\u000b\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0005\u001f\u01d8\u000a\u001f\u0003\u001f\u0003\u001f\u0005\u001f\u01dc\u000a\u001f\u0003\u001f\u0003\u001f\u0007\u001f\u01e0\u000a\u001f\u000c\u001f\u000e\u001f\u01e3\u000b\u001f\u0003\u001f\u0005\u001f\u01e6\u000a\u001f\u0003\u0020\u0003\u0020\u0006\u0020\u01ea\u000a\u0020\u000d\u0020\u000e\u0020\u01eb\u0005\u0020\u01ee\u000a\u0020\u0003\u0020\u0003\u0020\u0007\u0020\u01f2\u000a\u0020\u000c\u0020\u000e\u0020\u01f5\u000b\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0005\u0021\u01fb\u000a\u0021\u0003\u0022\u0003\u0022\u0005\u0022\u01ff\u000a\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u0204\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u020c\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0025\u0005\u0025\u0212\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0216\u000a\u0025\u0003\u0025\u0005\u0025\u0219\u000a\u0025\u0003\u0025\u0005\u0025\u021c\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0221\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0225\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0229\u000a\u0025\u0003\u0025\u0005\u0025\u022c\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0232\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0237\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u023b\u000a\u0025\u0003\u0025\u0005\u0025\u023e\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0244\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0249\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u024d\u000a\u0025\u0003\u0025\u0005\u0025\u0250\u000a\u0025\u0003\u0025\u0005\u0025\u0253\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0257\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u025b\u000a\u0025\u0003\u0025\u0005\u0025\u025e\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0264\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0268\u000a\u0025\u0003\u0025\u0005\u0025\u026b\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0271\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0276\u000a\u0025\u0003\u0025\u0005\u0025\u0279\u000a\u0025\u0003\u0025\u0005\u0025\u027c\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0280\u000a\u0025\u0003\u0025\u0005\u0025\u0283\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0288\u000a\u0025\u0003\u0025\u0005\u0025\u028b\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0290\u000a\u0025\u0003\u0025\u0005\u0025\u0293\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0298\u000a\u0025\u0003\u0025\u0005\u0025\u029b\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u02a0\u000a\u0025\u0005\u0025\u02a2\u000a\u0025\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u02aa\u000a\u0027\u0005\u0027\u02ac\u000a\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u02b0\u000a\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0005\u0028\u02b6\u000a\u0028\u0003\u0028\u0007\u0028\u02b9\u000a\u0028\u000c\u0028\u000e\u0028\u02bc\u000b\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0005\u002b\u02cc\u000a\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0005\u002c\u02d1\u000a\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0006\u002c\u02d6\u000a\u002c\u000d\u002c\u000e\u002c\u02d7\u0003\u002c\u0003\u002c\u0005\u002c\u02dc\u000a\u002c\u0003\u002d\u0003\u002d\u0005\u002d\u02e0\u000a\u002d\u0003\u002e\u0003\u002e\u0007\u002e\u02e4\u000a\u002e\u000c\u002e\u000e\u002e\u02e7\u000b\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0005\u002f\u02f3\u000a\u002f\u0003\u0030\u0003\u0030\u0007\u0030\u02f7\u000a\u0030\u000c\u0030\u000e\u0030\u02fa\u000b\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u0305\u000a\u0031\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0007\u0035\u0312\u000a\u0035\u000c\u0035\u000e\u0035\u0315\u000b\u0035\u0003\u0035\u0005\u0035\u0318\u000a\u0035\u0003\u0036\u0003\u0036\u0007\u0036\u031c\u000a\u0036\u000c\u0036\u000e\u0036\u031f\u000b\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0007\u0036\u0324\u000a\u0036\u000c\u0036\u000e\u0036\u0327\u000b\u0036\u0003\u0036\u0005\u0036\u032a\u000a\u0036\u0003\u0037\u0003\u0037\u0007\u0037\u032e\u000a\u0037\u000c\u0037\u000e\u0037\u0331\u000b\u0037\u0003\u0037\u0003\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0002\u0003\u0030\u0039\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0002\u0003\u0003\u0002\u002b\u002d\u0002\u039d\u0002\u0071\u0003\u0002\u0002\u0002\u0004\u0082\u0003\u0002\u0002\u0002\u0006\u0084\u0003\u0002\u0002\u0002\u0008\u0087\u0003\u0002\u0002\u0002\u000a\u008f\u0003\u0002\u0002\u0002\u000c\u0092\u0003\u0002\u0002\u0002\u000e\u009f\u0003\u0002\u0002\u0002\u0010\u00a1\u0003\u0002\u0002\u0002\u0012\u00a4\u0003\u0002\u0002\u0002\u0014\u00b0\u0003\u0002\u0002\u0002\u0016\u010e\u0003\u0002\u0002\u0002\u0018\u0110\u0003\u0002\u0002\u0002\u001a\u0112\u0003\u0002\u0002\u0002\u001c\u0117\u0003\u0002\u0002\u0002\u001e\u0128\u0003\u0002\u0002\u0002\u0020\u0134\u0003\u0002\u0002\u0002\u0022\u0138\u0003\u0002\u0002\u0002\u0024\u015f\u0003\u0002\u0002\u0002\u0026\u0162\u0003\u0002\u0002\u0002\u0028\u0170\u0003\u0002\u0002\u0002\u002a\u0174\u0003\u0002\u0002\u0002\u002c\u017f\u0003\u0002\u0002\u0002\u002e\u0182\u0003\u0002\u0002\u0002\u0030\u01a7\u0003\u0002\u0002\u0002\u0032\u01b8\u0003\u0002\u0002\u0002\u0034\u01bc\u0003\u0002\u0002\u0002\u0036\u01c7\u0003\u0002\u0002\u0002\u0038\u01ce\u0003\u0002\u0002\u0002\u003a\u01d2\u0003\u0002\u0002\u0002\u003c\u01e5\u0003\u0002\u0002\u0002\u003e\u01ed\u0003\u0002\u0002\u0002\u0040\u01fa\u0003\u0002\u0002\u0002\u0042\u01fe\u0003\u0002\u0002\u0002\u0044\u0200\u0003\u0002\u0002\u0002\u0046\u0208\u0003\u0002\u0002\u0002\u0048\u02a1\u0003\u0002\u0002\u0002\u004a\u02a3\u0003\u0002\u0002\u0002\u004c\u02a5\u0003\u0002\u0002\u0002\u004e\u02b1\u0003\u0002\u0002\u0002\u0050\u02c0\u0003\u0002\u0002\u0002\u0052\u02c4\u0003\u0002\u0002\u0002\u0054\u02cb\u0003\u0002\u0002\u0002\u0056\u02d0\u0003\u0002\u0002\u0002\u0058\u02dd\u0003\u0002\u0002\u0002\u005a\u02e1\u0003\u0002\u0002\u0002\u005c\u02f2\u0003\u0002\u0002\u0002\u005e\u02f4\u0003\u0002\u0002\u0002\u0060\u0304\u0003\u0002\u0002\u0002\u0062\u0306\u0003\u0002\u0002\u0002\u0064\u0308\u0003\u0002\u0002\u0002\u0066\u030a\u0003\u0002\u0002\u0002\u0068\u030d\u0003\u0002\u0002\u0002\u006a\u0329\u0003\u0002\u0002\u0002\u006c\u032b\u0003\u0002\u0002\u0002\u006e\u0334\u0003\u0002\u0002\u0002\u0070\u0072\u0005\u000a\u0006\u0002\u0071\u0070\u0003\u0002\u0002\u0002\u0071\u0072\u0003\u0002\u0002\u0002\u0072\u0076\u0003\u0002\u0002\u0002\u0073\u0075\u0005\u0004\u0003\u0002\u0074\u0073\u0003\u0002\u0002\u0002\u0075\u0078\u0003\u0002\u0002\u0002\u0076\u0074\u0003\u0002\u0002\u0002\u0076\u0077\u0003\u0002\u0002\u0002\u0077\u007f\u0003\u0002\u0002\u0002\u0078\u0076\u0003\u0002\u0002\u0002\u0079\u007e\u0005\u002c\u0017\u0002\u007a\u007e\u0005\u002e\u0018\u0002\u007b\u007e\u0005\u0068\u0035\u0002\u007c\u007e\u0005\u0026\u0014\u0002\u007d\u0079\u0003\u0002\u0002\u0002\u007d\u007a\u0003\u0002\u0002\u0002\u007d\u007b\u0003\u0002\u0002\u0002\u007d\u007c\u0003\u0002\u0002\u0002\u007e\u0081\u0003\u0002\u0002\u0002\u007f\u007d\u0003\u0002\u0002\u0002\u007f\u0080\u0003\u0002\u0002\u0002\u0080\u0003\u0003\u0002\u0002\u0002\u0081\u007f\u0003\u0002\u0002\u0002\u0082\u0083\u0005\u0006\u0004\u0002\u0083\u0005\u0003\u0002\u0002\u0002\u0084\u0085\u0007\u0011\u0002\u0002\u0085\u0086\u0005\u0008\u0005\u0002\u0086\u0007\u0003\u0002\u0002\u0002\u0087\u008c\u0007\u0029\u0002\u0002\u0088\u0089\u0007\u001b\u0002\u0002\u0089\u008b\u0007\u0029\u0002\u0002\u008a\u0088\u0003\u0002\u0002\u0002\u008b\u008e\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002\u0002\u008c\u008d\u0003\u0002\u0002\u0002\u008d\u0009\u0003\u0002\u0002\u0002\u008e\u008c\u0003\u0002\u0002\u0002\u008f\u0090\u0007\u000e\u0002\u0002\u0090\u0091\u0005\u0008\u0005\u0002\u0091\u000b\u0003\u0002\u0002\u0002\u0092\u0093\u0007\u000a\u0002\u0002\u0093\u0097\u0007\u0022\u0002\u0002\u0094\u0096\u0005\u000e\u0008\u0002\u0095\u0094\u0003\u0002\u0002\u0002\u0096\u0099\u0003\u0002\u0002\u0002\u0097\u0095\u0003\u0002\u0002\u0002\u0097\u0098\u0003\u0002\u0002\u0002\u0098\u009a\u0003\u0002\u0002\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u009a\u009b\u0007\u0023\u0002\u0002\u009b\u000d\u0003\u0002\u0002\u0002\u009c\u00a0\u0005\u002e\u0018\u0002\u009d\u00a0\u0005\u0030\u0019\u0002\u009e\u00a0\u0005\u0010\u0009\u0002\u009f\u009c\u0003\u0002\u0002\u0002\u009f\u009d\u0003\u0002\u0002\u0002\u009f\u009e\u0003\u0002\u0002\u0002\u00a0\u000f\u0003\u0002\u0002\u0002\u00a1\u00a2\u0007\u0012\u0002\u0002\u00a2\u00a3\u0005\u0030\u0019\u0002\u00a3\u0011\u0003\u0002\u0002\u0002\u00a4\u00a5\u0007\u0015\u0002\u0002\u00a5\u00aa\u0007\u0022\u0002\u0002\u00a6\u00a9\u0005\u002c\u0017\u0002\u00a7\u00a9\u0005\u002e\u0018\u0002\u00a8\u00a6\u0003\u0002\u0002\u0002\u00a8\u00a7\u0003\u0002\u0002\u0002\u00a9\u00ac\u0003\u0002\u0002\u0002\u00aa\u00a8\u0003\u0002\u0002\u0002\u00aa\u00ab\u0003\u0002\u0002\u0002\u00ab\u00ad\u0003\u0002\u0002\u0002\u00ac\u00aa\u0003\u0002\u0002\u0002\u00ad\u00ae\u0007\u0023\u0002\u0002\u00ae\u0013\u0003\u0002\u0002\u0002\u00af\u00b1\u0005\u006c\u0037\u0002\u00b0\u00af\u0003\u0002\u0002\u0002\u00b0\u00b1\u0003\u0002\u0002\u0002\u00b1\u00b2\u0003\u0002\u0002\u0002\u00b2\u00b3\u0007\u0009\u0002\u0002\u00b3\u00b5\u0007\u0029\u0002\u0002\u00b4\u00b6\u0005\u0028\u0015\u0002\u00b5\u00b4\u0003\u0002\u0002\u0002\u00b5\u00b6\u0003\u0002\u0002\u0002\u00b6\u00b7\u0003\u0002\u0002\u0002\u00b7\u00b8\u0005\u0018\u000d\u0002\u00b8\u00b9\u0005\u0016\u000c\u0002\u00b9\u0015\u0003\u0002\u0002\u0002\u00ba\u00bc\u0007\u0022\u0002\u0002\u00bb\u00bd\u0005\u000c\u0007\u0002\u00bc\u00bb\u0003\u0002\u0002\u0002\u00bc\u00bd\u0003\u0002\u0002\u0002\u00bd\u00c1\u0003\u0002\u0002\u0002\u00be\u00c0\u0005\u001a\u000e\u0002\u00bf\u00be\u0003\u0002\u0002\u0002\u00c0\u00c3\u0003\u0002\u0002\u0002\u00c1\u00bf\u0003\u0002\u0002\u0002\u00c1\u00c2\u0003\u0002\u0002\u0002\u00c2\u00c5\u0003\u0002\u0002\u0002\u00c3\u00c1\u0003\u0002\u0002\u0002\u00c4\u00c6\u0005\u0012\u000a\u0002\u00c5\u00c4\u0003\u0002\u0002\u0002\u00c5\u00c6\u0003\u0002\u0002\u0002\u00c6\u00cb\u0003\u0002\u0002\u0002\u00c7\u00ca\u0005\u002e\u0018\u0002\u00c8\u00ca\u0005\u0048\u0025\u0002\u00c9\u00c7\u0003\u0002\u0002\u0002\u00c9\u00c8\u0003\u0002\u0002\u0002\u00ca\u00cd\u0003\u0002\u0002\u0002\u00cb\u00c9\u0003\u0002\u0002\u0002\u00cb\u00cc\u0003\u0002\u0002\u0002\u00cc\u00ce\u0003\u0002\u0002\u0002\u00cd\u00cb\u0003\u0002\u0002\u0002\u00ce\u010f\u0007\u0023\u0002\u0002\u00cf\u00d3\u0007\u0022\u0002\u0002\u00d0\u00d2\u0005\u001a\u000e\u0002\u00d1\u00d0\u0003\u0002\u0002\u0002\u00d2\u00d5\u0003\u0002\u0002\u0002\u00d3\u00d1\u0003\u0002\u0002\u0002\u00d3\u00d4\u0003\u0002\u0002\u0002\u00d4\u00d7\u0003\u0002\u0002\u0002\u00d5\u00d3\u0003\u0002\u0002\u0002\u00d6\u00d8\u0005\u000c\u0007\u0002\u00d7\u00d6\u0003\u0002\u0002\u0002\u00d7\u00d8\u0003\u0002\u0002\u0002\u00d8\u00da\u0003\u0002\u0002\u0002\u00d9\u00db\u0005\u0012\u000a\u0002\u00da\u00d9\u0003\u0002\u0002\u0002\u00da\u00db\u0003\u0002\u0002\u0002\u00db\u00e0\u0003\u0002\u0002\u0002\u00dc\u00df\u0005\u002e\u0018\u0002\u00dd\u00df\u0005\u0048\u0025\u0002\u00de\u00dc\u0003\u0002\u0002\u0002\u00de\u00dd\u0003\u0002\u0002\u0002\u00df\u00e2\u0003\u0002\u0002\u0002\u00e0\u00de\u0003\u0002\u0002\u0002\u00e0\u00e1\u0003\u0002\u0002\u0002\u00e1\u00e3\u0003\u0002\u0002\u0002\u00e2\u00e0\u0003\u0002\u0002\u0002\u00e3\u010f\u0007\u0023\u0002\u0002\u00e4\u00e6\u0007\u0022\u0002\u0002\u00e5\u00e7\u0005\u0012\u000a\u0002\u00e6\u00e5\u0003\u0002\u0002\u0002\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u00e9\u0003\u0002\u0002\u0002\u00e8\u00ea\u0005\u000c\u0007\u0002\u00e9\u00e8\u0003\u0002\u0002\u0002\u00e9\u00ea\u0003\u0002\u0002\u0002\u00ea\u00ee\u0003\u0002\u0002\u0002\u00eb\u00ed\u0005\u001a\u000e\u0002\u00ec\u00eb\u0003\u0002\u0002\u0002\u00ed\u00f0\u0003\u0002\u0002\u0002\u00ee\u00ec\u0003\u0002\u0002\u0002\u00ee\u00ef\u0003\u0002\u0002\u0002\u00ef\u00f5\u0003\u0002\u0002\u0002\u00f0\u00ee\u0003\u0002\u0002\u0002\u00f1\u00f4\u0005\u002e\u0018\u0002\u00f2\u00f4\u0005\u0048\u0025\u0002\u00f3\u00f1\u0003\u0002\u0002\u0002\u00f3\u00f2\u0003\u0002\u0002\u0002\u00f4\u00f7\u0003\u0002\u0002\u0002\u00f5\u00f3\u0003\u0002\u0002\u0002\u00f5\u00f6\u0003\u0002\u0002\u0002\u00f6\u00f8\u0003\u0002\u0002\u0002\u00f7\u00f5\u0003\u0002\u0002\u0002\u00f8\u010f\u0007\u0023\u0002\u0002\u00f9\u00fb\u0007\u0022\u0002\u0002\u00fa\u00fc\u0005\u0012\u000a\u0002\u00fb\u00fa\u0003\u0002\u0002\u0002\u00fb\u00fc\u0003\u0002\u0002\u0002\u00fc\u0100\u0003\u0002\u0002\u0002\u00fd\u00ff\u0005\u001a\u000e\u0002\u00fe\u00fd\u0003\u0002\u0002\u0002\u00ff\u0102\u0003\u0002\u0002\u0002\u0100\u00fe\u0003\u0002\u0002\u0002\u0100\u0101\u0003\u0002\u0002\u0002\u0101\u0104\u0003\u0002\u0002\u0002\u0102\u0100\u0003\u0002\u0002\u0002\u0103\u0105\u0005\u000c\u0007\u0002\u0104\u0103\u0003\u0002\u0002\u0002\u0104\u0105\u0003\u0002\u0002\u0002\u0105\u010a\u0003\u0002\u0002\u0002\u0106\u0109\u0005\u002e\u0018\u0002\u0107\u0109\u0005\u0048\u0025\u0002\u0108\u0106\u0003\u0002\u0002\u0002\u0108\u0107\u0003\u0002\u0002\u0002\u0109\u010c\u0003\u0002\u0002\u0002\u010a\u0108\u0003\u0002\u0002\u0002\u010a\u010b\u0003\u0002\u0002\u0002\u010b\u010d\u0003\u0002\u0002\u0002\u010c\u010a\u0003\u0002\u0002\u0002\u010d\u010f\u0007\u0023\u0002\u0002\u010e\u00ba\u0003\u0002\u0002\u0002\u010e\u00cf\u0003\u0002\u0002\u0002\u010e\u00e4\u0003\u0002\u0002\u0002\u010e\u00f9\u0003\u0002\u0002\u0002\u010f\u0017\u0003\u0002\u0002\u0002\u0110\u0111\u0005\u0036\u001c\u0002\u0111\u0019\u0003\u0002\u0002\u0002\u0112\u0113\u0005\u0018\u000d\u0002\u0113\u0114\u0007\u0019\u0002\u0002\u0114\u0115\u0005\u0030\u0019\u0002\u0115\u001b\u0003\u0002\u0002\u0002\u0116\u0118\u0005\u006c\u0037\u0002\u0117\u0116\u0003\u0002\u0002\u0002\u0117\u0118\u0003\u0002\u0002\u0002\u0118\u0119\u0003\u0002\u0002\u0002\u0119\u011a\u0007\u0016\u0002\u0002\u011a\u011c\u0007\u0029\u0002\u0002\u011b\u011d\u0005\u0028\u0015\u0002\u011c\u011b\u0003\u0002\u0002\u0002\u011c\u011d\u0003\u0002\u0002\u0002\u011d\u0124\u0003\u0002\u0002\u0002\u011e\u0120\u0007\u0025\u0002\u0002\u011f\u0121\u0005\u0054\u002b\u0002\u0120\u011f\u0003\u0002\u0002\u0002\u0121\u0122\u0003\u0002\u0002\u0002\u0122\u0120\u0003\u0002\u0002\u0002\u0122\u0123\u0003\u0002\u0002\u0002\u0123\u0125\u0003\u0002\u0002\u0002\u0124\u011e\u0003\u0002\u0002\u0002\u0124\u0125\u0003\u0002\u0002\u0002\u0125\u0126\u0003\u0002\u0002\u0002\u0126\u0127\u0005\u001e\u0010\u0002\u0127\u001d\u0003\u0002\u0002\u0002\u0128\u012a\u0007\u0022\u0002\u0002\u0129\u012b\u0005\u0012\u000a\u0002\u012a\u0129\u0003\u0002\u0002\u0002\u012a\u012b\u0003\u0002\u0002\u0002\u012b\u012f\u0003\u0002\u0002\u0002\u012c\u012e\u0005\u0024\u0013\u0002\u012d\u012c\u0003\u0002\u0002\u0002\u012e\u0131\u0003\u0002\u0002\u0002\u012f\u012d\u0003\u0002\u0002\u0002\u012f\u0130\u0003\u0002\u0002\u0002\u0130\u0132\u0003\u0002\u0002\u0002\u0131\u012f\u0003\u0002\u0002\u0002\u0132\u0133\u0007\u0023\u0002\u0002\u0133\u001f\u0003\u0002\u0002\u0002\u0134\u0135\u0007\u0014\u0002\u0002\u0135\u0136\u0007\u0029\u0002\u0002\u0136\u0137\u0005\u0054\u002b\u0002\u0137\u0021\u0003\u0002\u0002\u0002\u0138\u0139\u0007\u0013\u0002\u0002\u0139\u013a\u0007\u0029\u0002\u0002\u013a\u013b\u0005\u0054\u002b\u0002\u013b\u0023\u0003\u0002\u0002\u0002\u013c\u013e\u0005\u006c\u0037\u0002\u013d\u013c\u0003\u0002\u0002\u0002\u013d\u013e\u0003\u0002\u0002\u0002\u013e\u013f\u0003\u0002\u0002\u0002\u013f\u0141\u0007\u0029\u0002\u0002\u0140\u0142\u0005\u004a\u0026\u0002\u0141\u0140\u0003\u0002\u0002\u0002\u0141\u0142\u0003\u0002\u0002\u0002\u0142\u0144\u0003\u0002\u0002\u0002\u0143\u0145\u0005\u0028\u0015\u0002\u0144\u0143\u0003\u0002\u0002\u0002\u0144\u0145\u0003\u0002\u0002\u0002\u0145\u0147\u0003\u0002\u0002\u0002\u0146\u0148\u0005\u0036\u001c\u0002\u0147\u0146\u0003\u0002\u0002\u0002\u0147\u0148\u0003\u0002\u0002\u0002\u0148\u0149\u0003\u0002\u0002\u0002\u0149\u014a\u0007\u0019\u0002\u0002\u014a\u014b\u0007\u0026\u0002\u0002\u014b\u0160\u0005\u0054\u002b\u0002\u014c\u014e\u0005\u006c\u0037\u0002\u014d\u014c\u0003\u0002\u0002\u0002\u014d\u014e\u0003\u0002\u0002\u0002\u014e\u014f\u0003\u0002\u0002\u0002\u014f\u0151\u0007\u0029\u0002\u0002\u0150\u0152\u0005\u004a\u0026\u0002\u0151\u0150\u0003\u0002\u0002\u0002\u0151\u0152\u0003\u0002\u0002\u0002\u0152\u0154\u0003\u0002\u0002\u0002\u0153\u0155\u0005\u0028\u0015\u0002\u0154\u0153\u0003\u0002\u0002\u0002\u0154\u0155\u0003\u0002\u0002\u0002\u0155\u0157\u0003\u0002\u0002\u0002\u0156\u0158\u0005\u0036\u001c\u0002\u0157\u0156\u0003\u0002\u0002\u0002\u0157\u0158\u0003\u0002\u0002\u0002\u0158\u0159\u0003\u0002\u0002\u0002\u0159\u015c\u0007\u0019\u0002\u0002\u015a\u015b\u0007\u0026\u0002\u0002\u015b\u015d\u0005\u0054\u002b\u0002\u015c\u015a\u0003\u0002\u0002\u0002\u015c\u015d\u0003\u0002\u0002\u0002\u015d\u015e\u0003\u0002\u0002\u0002\u015e\u0160\u0005\u0030\u0019\u0002\u015f\u013d\u0003\u0002\u0002\u0002\u015f\u014d\u0003\u0002\u0002\u0002\u0160\u0025\u0003\u0002\u0002\u0002\u0161\u0163\u0005\u006c\u0037\u0002\u0162\u0161\u0003\u0002\u0002\u0002\u0162\u0163\u0003\u0002\u0002\u0002\u0163\u0164\u0003\u0002\u0002\u0002\u0164\u0165\u0007\u0017\u0002\u0002\u0165\u0166\u0007\u0029\u0002\u0002\u0166\u016a\u0007\u0022\u0002\u0002\u0167\u0169\u0005\u006e\u0038\u0002\u0168\u0167\u0003\u0002\u0002\u0002\u0169\u016c\u0003\u0002\u0002\u0002\u016a\u0168\u0003\u0002\u0002\u0002\u016a\u016b\u0003\u0002\u0002\u0002\u016b\u016d\u0003\u0002\u0002\u0002\u016c\u016a\u0003\u0002\u0002\u0002\u016d\u016e\u0007\u0023\u0002\u0002\u016e\u0027\u0003\u0002\u0002\u0002\u016f\u0171\u0005\u002a\u0016\u0002\u0170\u016f\u0003\u0002\u0002\u0002\u0171\u0172\u0003\u0002\u0002\u0002\u0172\u0170\u0003\u0002\u0002\u0002\u0172\u0173\u0003\u0002\u0002\u0002\u0173\u0029\u0003\u0002\u0002\u0002\u0174\u0179\u0007\u0029\u0002\u0002\u0175\u0176\u0007\u0025\u0002\u0002\u0176\u0178\u0005\u0054\u002b\u0002\u0177\u0175\u0003\u0002\u0002\u0002\u0178\u017b\u0003\u0002\u0002\u0002\u0179\u0177\u0003\u0002\u0002\u0002\u0179\u017a\u0003\u0002\u0002\u0002\u017a\u002b\u0003\u0002\u0002\u0002\u017b\u0179\u0003\u0002\u0002\u0002\u017c\u0180\u0005\u0048\u0025\u0002\u017d\u0180\u0005\u0014\u000b\u0002\u017e\u0180\u0005\u001c\u000f\u0002\u017f\u017c\u0003\u0002\u0002\u0002\u017f\u017d\u0003\u0002\u0002\u0002\u017f\u017e\u0003\u0002\u0002\u0002\u0180\u002d\u0003\u0002\u0002\u0002\u0181\u0183\u0005\u006c\u0037\u0002\u0182\u0181\u0003\u0002\u0002\u0002\u0182\u0183\u0003\u0002\u0002\u0002\u0183\u0186\u0003\u0002\u0002\u0002\u0184\u0187\u0005\u0040\u0021\u0002\u0185\u0187\u0005\u0042\u0022\u0002\u0186\u0184\u0003\u0002\u0002\u0002\u0186\u0185\u0003\u0002\u0002\u0002\u0187\u002f\u0003\u0002\u0002\u0002\u0188\u0189\u0008\u0019\u0001\u0002\u0189\u01a8\u0007\u002b\u0002\u0002\u018a\u01a8\u0007\u002c\u0002\u0002\u018b\u01a8\u0007\u002d\u0002\u0002\u018c\u01a8\u0005\u006e\u0038\u0002\u018d\u018e\u0005\u0008\u0005\u0002\u018e\u018f\u0007\u001b\u0002\u0002\u018f\u0191\u0003\u0002\u0002\u0002\u0190\u018d\u0003\u0002\u0002\u0002\u0190\u0191\u0003\u0002\u0002\u0002\u0191\u0192\u0003\u0002\u0002\u0002\u0192\u01a8\u0007\u0029\u0002\u0002\u0193\u0194\u0005\u0008\u0005\u0002\u0194\u0195\u0007\u001b\u0002\u0002\u0195\u0197\u0003\u0002\u0002\u0002\u0196\u0193\u0003\u0002\u0002\u0002\u0196\u0197\u0003\u0002\u0002\u0002\u0197\u0198\u0003\u0002\u0002\u0002\u0198\u01a8\u0005\u0050\u0029\u0002\u0199\u019a\u0005\u0008\u0005\u0002\u019a\u019b\u0007\u001b\u0002\u0002\u019b\u019d\u0003\u0002\u0002\u0002\u019c\u0199\u0003\u0002\u0002\u0002\u019c\u019d\u0003\u0002\u0002\u0002\u019d\u019e\u0003\u0002\u0002\u0002\u019e\u01a8\u0005\u0052\u002a\u0002\u019f\u01a0\u0007\u002a\u0002\u0002\u01a0\u01a8\u0005\u0030\u0019\u0008\u01a1\u01a8\u0005\u000c\u0007\u0002\u01a2\u01a8\u0005\u004e\u0028\u0002\u01a3\u01a4\u0007\u001c\u0002\u0002\u01a4\u01a5\u0005\u0030\u0019\u0002\u01a5\u01a6\u0007\u001d\u0002\u0002\u01a6\u01a8\u0003\u0002\u0002\u0002\u01a7\u0188\u0003\u0002\u0002\u0002\u01a7\u018a\u0003\u0002\u0002\u0002\u01a7\u018b\u0003\u0002\u0002\u0002\u01a7\u018c\u0003\u0002\u0002\u0002\u01a7\u0190\u0003\u0002\u0002\u0002\u01a7\u0196\u0003\u0002\u0002\u0002\u01a7\u019c\u0003\u0002\u0002\u0002\u01a7\u019f\u0003\u0002\u0002\u0002\u01a7\u01a1\u0003\u0002\u0002\u0002\u01a7\u01a2\u0003\u0002\u0002\u0002\u01a7\u01a3\u0003\u0002\u0002\u0002\u01a8\u01b5\u0003\u0002\u0002\u0002\u01a9\u01aa\u000c\u0009\u0002\u0002\u01aa\u01ab\u0007\u002a\u0002\u0002\u01ab\u01b4\u0005\u0030\u0019\u000a\u01ac\u01ad\u000c\u000a\u0002\u0002\u01ad\u01b4\u0005\u003e\u0020\u0002\u01ae\u01af\u000c\u0005\u0002\u0002\u01af\u01b0\u0007\u0026\u0002\u0002\u01b0\u01b4\u0007\u0029\u0002\u0002\u01b1\u01b2\u000c\u0003\u0002\u0002\u01b2\u01b4\u0005\u0032\u001a\u0002\u01b3\u01a9\u0003\u0002\u0002\u0002\u01b3\u01ac\u0003\u0002\u0002\u0002\u01b3\u01ae\u0003\u0002\u0002\u0002\u01b3\u01b1\u0003\u0002\u0002\u0002\u01b4\u01b7\u0003\u0002\u0002\u0002\u01b5\u01b3\u0003\u0002\u0002\u0002\u01b5\u01b6\u0003\u0002\u0002\u0002\u01b6\u0031\u0003\u0002\u0002\u0002\u01b7\u01b5\u0003\u0002\u0002\u0002\u01b8\u01b9\u0007\u0006\u0002\u0002\u01b9\u01ba\u0005\u0054\u002b\u0002\u01ba\u0033\u0003\u0002\u0002\u0002\u01bb\u01bd\u0005\u006c\u0037\u0002\u01bc\u01bb\u0003\u0002\u0002\u0002\u01bc\u01bd\u0003\u0002\u0002\u0002\u01bd\u01be\u0003\u0002\u0002\u0002\u01be\u01bf\u0007\u0029\u0002\u0002\u01bf\u01c1\u0005\u0054\u002b\u0002\u01c0\u01c2\u0007\u001a\u0002\u0002\u01c1\u01c0\u0003\u0002\u0002\u0002\u01c1\u01c2\u0003\u0002\u0002\u0002\u01c2\u01c5\u0003\u0002\u0002\u0002\u01c3\u01c4\u0007\u0018\u0002\u0002\u01c4\u01c6\u0005\u0030\u0019\u0002\u01c5\u01c3\u0003\u0002\u0002\u0002\u01c5\u01c6\u0003\u0002\u0002\u0002\u01c6\u0035\u0003\u0002\u0002\u0002\u01c7\u01cb\u0007\u0026\u0002\u0002\u01c8\u01ca\u0005\u0034\u001b\u0002\u01c9\u01c8\u0003\u0002\u0002\u0002\u01ca\u01cd\u0003\u0002\u0002\u0002\u01cb\u01c9\u0003\u0002\u0002\u0002\u01cb\u01cc\u0003\u0002\u0002\u0002\u01cc\u0037\u0003\u0002\u0002\u0002\u01cd\u01cb\u0003\u0002\u0002\u0002\u01ce\u01cf\u0007\u0026\u0002\u0002\u01cf\u01d0\u0005\u0034\u001b\u0002\u01d0\u01d1\u0005\u0034\u001b\u0002\u01d1\u0039\u0003\u0002\u0002\u0002\u01d2\u01d3\u0007\u0026\u0002\u0002\u01d3\u01d4\u0005\u0034\u001b\u0002\u01d4\u003b\u0003\u0002\u0002\u0002\u01d5\u01d6\u0007\u0029\u0002\u0002\u01d6\u01d8\u0007\u0018\u0002\u0002\u01d7\u01d5\u0003\u0002\u0002\u0002\u01d7\u01d8\u0003\u0002\u0002\u0002\u01d8\u01d9\u0003\u0002\u0002\u0002\u01d9\u01e6\u0005\u0030\u0019\u0002\u01da\u01dc\u0007\u0029\u0002\u0002\u01db\u01da\u0003\u0002\u0002\u0002\u01db\u01dc\u0003\u0002\u0002\u0002\u01dc\u01dd\u0003\u0002\u0002\u0002\u01dd\u01e1\u0007\u0022\u0002\u0002\u01de\u01e0\u0005\u0030\u0019\u0002\u01df\u01de\u0003\u0002\u0002\u0002\u01e0\u01e3\u0003\u0002\u0002\u0002\u01e1\u01df\u0003\u0002\u0002\u0002\u01e1\u01e2\u0003\u0002\u0002\u0002\u01e2\u01e4\u0003\u0002\u0002\u0002\u01e3\u01e1\u0003\u0002\u0002\u0002\u01e4\u01e6\u0007\u0023\u0002\u0002\u01e5\u01d7\u0003\u0002\u0002\u0002\u01e5\u01db\u0003\u0002\u0002\u0002\u01e6\u003d\u0003\u0002\u0002\u0002\u01e7\u01e9\u0007\u0025\u0002\u0002\u01e8\u01ea\u0005\u0054\u002b\u0002\u01e9\u01e8\u0003\u0002\u0002\u0002\u01ea\u01eb\u0003\u0002\u0002\u0002\u01eb\u01e9\u0003\u0002\u0002\u0002\u01eb\u01ec\u0003\u0002\u0002\u0002\u01ec\u01ee\u0003\u0002\u0002\u0002\u01ed\u01e7\u0003\u0002\u0002\u0002\u01ed\u01ee\u0003\u0002\u0002\u0002\u01ee\u01ef\u0003\u0002\u0002\u0002\u01ef\u01f3\u0007\u001c\u0002\u0002\u01f0\u01f2\u0005\u003c\u001f\u0002\u01f1\u01f0\u0003\u0002\u0002\u0002\u01f2\u01f5\u0003\u0002\u0002\u0002\u01f3\u01f1\u0003\u0002\u0002\u0002\u01f3\u01f4\u0003\u0002\u0002\u0002\u01f4\u01f6\u0003\u0002\u0002\u0002\u01f5\u01f3\u0003\u0002\u0002\u0002\u01f6\u01f7\u0007\u001d\u0002\u0002\u01f7\u003f\u0003\u0002\u0002\u0002\u01f8\u01fb\u0005\u0044\u0023\u0002\u01f9\u01fb\u0005\u0020\u0011\u0002\u01fa\u01f8\u0003\u0002\u0002\u0002\u01fa\u01f9\u0003\u0002\u0002\u0002\u01fb\u0041\u0003\u0002\u0002\u0002\u01fc\u01ff\u0005\u0046\u0024\u0002\u01fd\u01ff\u0005\u0022\u0012\u0002\u01fe\u01fc\u0003\u0002\u0002\u0002\u01fe\u01fd\u0003\u0002\u0002\u0002\u01ff\u0043\u0003\u0002\u0002\u0002\u0200\u0201\u0007\u0014\u0002\u0002\u0201\u0203\u0007\u0029\u0002\u0002\u0202\u0204\u0005\u0054\u002b\u0002\u0203\u0202\u0003\u0002\u0002\u0002\u0203\u0204\u0003\u0002\u0002\u0002\u0204\u0205\u0003\u0002\u0002\u0002\u0205\u0206\u0007\u0018\u0002\u0002\u0206\u0207\u0005\u0030\u0019\u0002\u0207\u0045\u0003\u0002\u0002\u0002\u0208\u0209\u0007\u0013\u0002\u0002\u0209\u020b\u0007\u0029\u0002\u0002\u020a\u020c\u0005\u0054\u002b\u0002\u020b\u020a\u0003\u0002\u0002\u0002\u020b\u020c\u0003\u0002\u0002\u0002\u020c\u020d\u0003\u0002\u0002\u0002\u020d\u020e\u0007\u0018\u0002\u0002\u020e\u020f\u0005\u0030\u0019\u0002\u020f\u0047\u0003\u0002\u0002\u0002\u0210\u0212\u0005\u006c\u0037\u0002\u0211\u0210\u0003\u0002\u0002\u0002\u0211\u0212\u0003\u0002\u0002\u0002\u0212\u0213\u0003\u0002\u0002\u0002\u0213\u0215\u0007\u0029\u0002\u0002\u0214\u0216\u0005\u004a\u0026\u0002\u0215\u0214\u0003\u0002\u0002\u0002\u0215\u0216\u0003\u0002\u0002\u0002\u0216\u0218\u0003\u0002\u0002\u0002\u0217\u0219\u0005\u0028\u0015\u0002\u0218\u0217\u0003\u0002\u0002\u0002\u0218\u0219\u0003\u0002\u0002\u0002\u0219\u021b\u0003\u0002\u0002\u0002\u021a\u021c\u0005\u0036\u001c\u0002\u021b\u021a\u0003\u0002\u0002\u0002\u021b\u021c\u0003\u0002\u0002\u0002\u021c\u021d\u0003\u0002\u0002\u0002\u021d\u0220\u0007\u0019\u0002\u0002\u021e\u021f\u0007\u0026\u0002\u0002\u021f\u0221\u0005\u0054\u002b\u0002\u0220\u021e\u0003\u0002\u0002\u0002\u0220\u0221\u0003\u0002\u0002\u0002\u0221\u0222\u0003\u0002\u0002\u0002\u0222\u02a2\u0005\u0030\u0019\u0002\u0223\u0225\u0005\u006c\u0037\u0002\u0224\u0223\u0003\u0002\u0002\u0002\u0224\u0225\u0003\u0002\u0002\u0002\u0225\u0226\u0003\u0002\u0002\u0002\u0226\u0228\u0005\u0050\u0029\u0002\u0227\u0229\u0005\u004a\u0026\u0002\u0228\u0227\u0003\u0002\u0002\u0002\u0228\u0229\u0003\u0002\u0002\u0002\u0229\u022b\u0003\u0002\u0002\u0002\u022a\u022c\u0005\u0028\u0015\u0002\u022b\u022a\u0003\u0002\u0002\u0002\u022b\u022c\u0003\u0002\u0002\u0002\u022c\u022d\u0003\u0002\u0002\u0002\u022d\u022e\u0005\u0038\u001d\u0002\u022e\u0231\u0007\u0019\u0002\u0002\u022f\u0230\u0007\u0026\u0002\u0002\u0230\u0232\u0005\u0054\u002b\u0002\u0231\u022f\u0003\u0002\u0002\u0002\u0231\u0232\u0003\u0002\u0002\u0002\u0232\u0233\u0003\u0002\u0002\u0002\u0233\u0234\u0005\u0030\u0019\u0002\u0234\u02a2\u0003\u0002\u0002\u0002\u0235\u0237\u0005\u006c\u0037\u0002\u0236\u0235\u0003\u0002\u0002\u0002\u0236\u0237\u0003\u0002\u0002\u0002\u0237\u0238\u0003\u0002\u0002\u0002\u0238\u023a\u0005\u0052\u002a\u0002\u0239\u023b\u0005\u004a\u0026\u0002\u023a\u0239\u0003\u0002\u0002\u0002\u023a\u023b\u0003\u0002\u0002\u0002\u023b\u023d\u0003\u0002\u0002\u0002\u023c\u023e\u0005\u0028\u0015\u0002\u023d\u023c\u0003\u0002\u0002\u0002\u023d\u023e\u0003\u0002\u0002\u0002\u023e\u023f\u0003\u0002\u0002\u0002\u023f\u0240\u0005\u003a\u001e\u0002\u0240\u0243\u0007\u0019\u0002\u0002\u0241\u0242\u0007\u0026\u0002\u0002\u0242\u0244\u0005\u0054\u002b\u0002\u0243\u0241\u0003\u0002\u0002\u0002\u0243\u0244\u0003\u0002\u0002\u0002\u0244\u0245\u0003\u0002\u0002\u0002\u0245\u0246\u0005\u0030\u0019\u0002\u0246\u02a2\u0003\u0002\u0002\u0002\u0247\u0249\u0005\u006c\u0037\u0002\u0248\u0247\u0003\u0002\u0002\u0002\u0248\u0249\u0003\u0002\u0002\u0002\u0249\u024a\u0003\u0002\u0002\u0002\u024a\u024c\u0007\u0029\u0002\u0002\u024b\u024d\u0005\u004a\u0026\u0002\u024c\u024b\u0003\u0002\u0002\u0002\u024c\u024d\u0003\u0002\u0002\u0002\u024d\u024f\u0003\u0002\u0002\u0002\u024e\u0250\u0005\u0028\u0015\u0002\u024f\u024e\u0003\u0002\u0002\u0002\u024f\u0250\u0003\u0002\u0002\u0002\u0250\u0252\u0003\u0002\u0002\u0002\u0251\u0253\u0005\u0036\u001c\u0002\u0252\u0251\u0003\u0002\u0002\u0002\u0252\u0253\u0003\u0002\u0002\u0002\u0253\u0254\u0003\u0002\u0002\u0002\u0254\u02a2\u0005\u005c\u002f\u0002\u0255\u0257\u0005\u006c\u0037\u0002\u0256\u0255\u0003\u0002\u0002\u0002\u0256\u0257\u0003\u0002\u0002\u0002\u0257\u0258\u0003\u0002\u0002\u0002\u0258\u025a\u0005\u0050\u0029\u0002\u0259\u025b\u0005\u004a\u0026\u0002\u025a\u0259\u0003\u0002\u0002\u0002\u025a\u025b\u0003\u0002\u0002\u0002\u025b\u025d\u0003\u0002\u0002\u0002\u025c\u025e\u0005\u0028\u0015\u0002\u025d\u025c\u0003\u0002\u0002\u0002\u025d\u025e\u0003\u0002\u0002\u0002\u025e\u025f\u0003\u0002\u0002\u0002\u025f\u0260\u0005\u0038\u001d\u0002\u0260\u0261\u0005\u005c\u002f\u0002\u0261\u02a2\u0003\u0002\u0002\u0002\u0262\u0264\u0005\u006c\u0037\u0002\u0263\u0262\u0003\u0002\u0002\u0002\u0263\u0264\u0003\u0002\u0002\u0002\u0264\u0265\u0003\u0002\u0002\u0002\u0265\u0267\u0005\u0052\u002a\u0002\u0266\u0268\u0005\u004a\u0026\u0002\u0267\u0266\u0003\u0002\u0002\u0002\u0267\u0268\u0003\u0002\u0002\u0002\u0268\u026a\u0003\u0002\u0002\u0002\u0269\u026b\u0005\u0028\u0015\u0002\u026a\u0269\u0003\u0002\u0002\u0002\u026a\u026b\u0003\u0002\u0002\u0002\u026b\u026c\u0003\u0002\u0002\u0002\u026c\u026d\u0005\u003a\u001e\u0002\u026d\u026e\u0005\u005c\u002f\u0002\u026e\u02a2\u0003\u0002\u0002\u0002\u026f\u0271\u0005\u006c\u0037\u0002\u0270\u026f\u0003\u0002\u0002\u0002\u0270\u0271\u0003\u0002\u0002\u0002\u0271\u0272\u0003\u0002\u0002\u0002\u0272\u0273\u0007\u000d\u0002\u0002\u0273\u0275\u0007\u0029\u0002\u0002\u0274\u0276\u0005\u004a\u0026\u0002\u0275\u0274\u0003\u0002\u0002\u0002\u0275\u0276\u0003\u0002\u0002\u0002\u0276\u0278\u0003\u0002\u0002\u0002\u0277\u0279\u0005\u0028\u0015\u0002\u0278\u0277\u0003\u0002\u0002\u0002\u0278\u0279\u0003\u0002\u0002\u0002\u0279\u027b\u0003\u0002\u0002\u0002\u027a\u027c\u0005\u0036\u001c\u0002\u027b\u027a\u0003\u0002\u0002\u0002\u027b\u027c\u0003\u0002\u0002\u0002\u027c\u027f\u0003\u0002\u0002\u0002\u027d\u0280\u0005\u005c\u002f\u0002\u027e\u0280\u0007\u002e\u0002\u0002\u027f\u027d\u0003\u0002\u0002\u0002\u027f\u027e\u0003\u0002\u0002\u0002\u0280\u02a2\u0003\u0002\u0002\u0002\u0281\u0283\u0005\u006c\u0037\u0002\u0282\u0281\u0003\u0002\u0002\u0002\u0282\u0283\u0003\u0002\u0002\u0002\u0283\u0284\u0003\u0002\u0002\u0002\u0284\u0285\u0007\u000d\u0002\u0002\u0285\u0287\u0005\u0050\u0029\u0002\u0286\u0288\u0005\u004a\u0026\u0002\u0287\u0286\u0003\u0002\u0002\u0002\u0287\u0288\u0003\u0002\u0002\u0002\u0288\u028a\u0003\u0002\u0002\u0002\u0289\u028b\u0005\u0028\u0015\u0002\u028a\u0289\u0003\u0002\u0002\u0002\u028a\u028b\u0003\u0002\u0002\u0002\u028b\u028c\u0003\u0002\u0002\u0002\u028c\u028f\u0005\u0038\u001d\u0002\u028d\u0290\u0005\u005c\u002f\u0002\u028e\u0290\u0007\u002e\u0002\u0002\u028f\u028d\u0003\u0002\u0002\u0002\u028f\u028e\u0003\u0002\u0002\u0002\u0290\u02a2\u0003\u0002\u0002\u0002\u0291\u0293\u0005\u006c\u0037\u0002\u0292\u0291\u0003\u0002\u0002\u0002\u0292\u0293\u0003\u0002\u0002\u0002\u0293\u0294\u0003\u0002\u0002\u0002\u0294\u0295\u0007\u000d\u0002\u0002\u0295\u0297\u0005\u0052\u002a\u0002\u0296\u0298\u0005\u004a\u0026\u0002\u0297\u0296\u0003\u0002\u0002\u0002\u0297\u0298\u0003\u0002\u0002\u0002\u0298\u029a\u0003\u0002\u0002\u0002\u0299\u029b\u0005\u0028\u0015\u0002\u029a\u0299\u0003\u0002\u0002\u0002\u029a\u029b\u0003\u0002\u0002\u0002\u029b\u029c\u0003\u0002\u0002\u0002\u029c\u029f\u0005\u003a\u001e\u0002\u029d\u02a0\u0005\u005c\u002f\u0002\u029e\u02a0\u0007\u002e\u0002\u0002\u029f\u029d\u0003\u0002\u0002\u0002\u029f\u029e\u0003\u0002\u0002\u0002\u02a0\u02a2\u0003\u0002\u0002\u0002\u02a1\u0211\u0003\u0002\u0002\u0002\u02a1\u0224\u0003\u0002\u0002\u0002\u02a1\u0236\u0003\u0002\u0002\u0002\u02a1\u0248\u0003\u0002\u0002\u0002\u02a1\u0256\u0003\u0002\u0002\u0002\u02a1\u0263\u0003\u0002\u0002\u0002\u02a1\u0270\u0003\u0002\u0002\u0002\u02a1\u0282\u0003\u0002\u0002\u0002\u02a1\u0292\u0003\u0002\u0002\u0002\u02a2\u0049\u0003\u0002\u0002\u0002\u02a3\u02a4\u0005\u006e\u0038\u0002\u02a4\u004b\u0003\u0002\u0002\u0002\u02a5\u02ab\u0007\u0029\u0002\u0002\u02a6\u02a7\u0007\u0025\u0002\u0002\u02a7\u02a9\u0005\u0054\u002b\u0002\u02a8\u02aa\u0007\u001a\u0002\u0002\u02a9\u02a8\u0003\u0002\u0002\u0002\u02a9\u02aa\u0003\u0002\u0002\u0002\u02aa\u02ac\u0003\u0002\u0002\u0002\u02ab\u02a6\u0003\u0002\u0002\u0002\u02ab\u02ac\u0003\u0002\u0002\u0002\u02ac\u02af\u0003\u0002\u0002\u0002\u02ad\u02ae\u0007\u0018\u0002\u0002\u02ae\u02b0\u0005\u0030\u0019\u0002\u02af\u02ad\u0003\u0002\u0002\u0002\u02af\u02b0\u0003\u0002\u0002\u0002\u02b0\u004d\u0003\u0002\u0002\u0002\u02b1\u02b5\u0007\u001e\u0002\u0002\u02b2\u02b3\u0005\u0028\u0015\u0002\u02b3\u02b4\u0007\u0026\u0002\u0002\u02b4\u02b6\u0003\u0002\u0002\u0002\u02b5\u02b2\u0003\u0002\u0002\u0002\u02b5\u02b6\u0003\u0002\u0002\u0002\u02b6\u02ba\u0003\u0002\u0002\u0002\u02b7\u02b9\u0005\u004c\u0027\u0002\u02b8\u02b7\u0003\u0002\u0002\u0002\u02b9\u02bc\u0003\u0002\u0002\u0002\u02ba\u02b8\u0003\u0002\u0002\u0002\u02ba\u02bb\u0003\u0002\u0002\u0002\u02bb\u02bd\u0003\u0002\u0002\u0002\u02bc\u02ba\u0003\u0002\u0002\u0002\u02bd\u02be\u0007\u0020\u0002\u0002\u02be\u02bf\u0005\u0030\u0019\u0002\u02bf\u004f\u0003\u0002\u0002\u0002\u02c0\u02c1\u0007\u001e\u0002\u0002\u02c1\u02c2\u0007\u002a\u0002\u0002\u02c2\u02c3\u0007\u0020\u0002\u0002\u02c3\u0051\u0003\u0002\u0002\u0002\u02c4\u02c5\u0007\u001e\u0002\u0002\u02c5\u02c6\u0007\u0025\u0002\u0002\u02c6\u02c7\u0007\u002a\u0002\u0002\u02c7\u02c8\u0007\u0020\u0002\u0002\u02c8\u0053\u0003\u0002\u0002\u0002\u02c9\u02cc\u0005\u005a\u002e\u0002\u02ca\u02cc\u0005\u0056\u002c\u0002\u02cb\u02c9\u0003\u0002\u0002\u0002\u02cb\u02ca\u0003\u0002\u0002\u0002\u02cc\u0055\u0003\u0002\u0002\u0002\u02cd\u02ce\u0005\u0008\u0005\u0002\u02ce\u02cf\u0007\u001b\u0002\u0002\u02cf\u02d1\u0003\u0002\u0002\u0002\u02d0\u02cd\u0003\u0002\u0002\u0002\u02d0\u02d1\u0003\u0002\u0002\u0002\u02d1\u02d2\u0003\u0002\u0002\u0002\u02d2\u02db\u0007\u0029\u0002\u0002\u02d3\u02d5\u0007\u001c\u0002\u0002\u02d4\u02d6\u0005\u0054\u002b\u0002\u02d5\u02d4\u0003\u0002\u0002\u0002\u02d6\u02d7\u0003\u0002\u0002\u0002\u02d7\u02d5\u0003\u0002\u0002\u0002\u02d7\u02d8\u0003\u0002\u0002\u0002\u02d8\u02d9\u0003\u0002\u0002\u0002\u02d9\u02da\u0007\u001d\u0002\u0002\u02da\u02dc\u0003\u0002\u0002\u0002\u02db\u02d3\u0003\u0002\u0002\u0002\u02db\u02dc\u0003\u0002\u0002\u0002\u02dc\u0057\u0003\u0002\u0002\u0002\u02dd\u02df\u0005\u0054\u002b\u0002\u02de\u02e0\u0007\u001a\u0002\u0002\u02df\u02de\u0003\u0002\u0002\u0002\u02df\u02e0\u0003\u0002\u0002\u0002\u02e0\u0059\u0003\u0002\u0002\u0002\u02e1\u02e5\u0007\u001c\u0002\u0002\u02e2\u02e4\u0005\u0058\u002d\u0002\u02e3\u02e2\u0003\u0002\u0002\u0002\u02e4\u02e7\u0003\u0002\u0002\u0002\u02e5\u02e3\u0003\u0002\u0002\u0002\u02e5\u02e6\u0003\u0002\u0002\u0002\u02e6\u02e8\u0003\u0002\u0002\u0002\u02e7\u02e5\u0003\u0002\u0002\u0002\u02e8\u02e9\u0007\u001d\u0002\u0002\u02e9\u02ea\u0007\u0024\u0002\u0002\u02ea\u02eb\u0005\u0054\u002b\u0002\u02eb\u005b\u0003\u0002\u0002\u0002\u02ec\u02ed\u0007\u000c\u0002\u0002\u02ed\u02ee\u0005\u0054\u002b\u0002\u02ee\u02ef\u0005\u005e\u0030\u0002\u02ef\u02f3\u0003\u0002\u0002\u0002\u02f0\u02f1\u0007\u000b\u0002\u0002\u02f1\u02f3\u0005\u0054\u002b\u0002\u02f2\u02ec\u0003\u0002\u0002\u0002\u02f2\u02f0\u0003\u0002\u0002\u0002\u02f3\u005d\u0003\u0002\u0002\u0002\u02f4\u02f8\u0007\u0022\u0002\u0002\u02f5\u02f7\u0005\u0060\u0031\u0002\u02f6\u02f5\u0003\u0002\u0002\u0002\u02f7\u02fa\u0003\u0002\u0002\u0002\u02f8\u02f6\u0003\u0002\u0002\u0002\u02f8\u02f9\u0003\u0002\u0002\u0002\u02f9\u02fb\u0003\u0002\u0002\u0002\u02fa\u02f8\u0003\u0002\u0002\u0002\u02fb\u02fc\u0007\u0023\u0002\u0002\u02fc\u005f\u0003\u0002\u0002\u0002\u02fd\u02fe\u0005\u0062\u0032\u0002\u02fe\u02ff\u0007\u002e\u0002\u0002\u02ff\u0305\u0003\u0002\u0002\u0002\u0300\u0301\u0005\u0062\u0032\u0002\u0301\u0302\u0007\u0025\u0002\u0002\u0302\u0303\u0007\u002d\u0002\u0002\u0303\u0305\u0003\u0002\u0002\u0002\u0304\u02fd\u0003\u0002\u0002\u0002\u0304\u0300\u0003\u0002\u0002\u0002\u0305\u0061\u0003\u0002\u0002\u0002\u0306\u0307\u0007\u0029\u0002\u0002\u0307\u0063\u0003\u0002\u0002\u0002\u0308\u0309\u0009\u0002\u0002\u0002\u0309\u0065\u0003\u0002\u0002\u0002\u030a\u030b\u0007\u0029\u0002\u0002\u030b\u030c\u0005\u0054\u002b\u0002\u030c\u0067\u0003\u0002\u0002\u0002\u030d\u030e\u0007\u0008\u0002\u0002\u030e\u0317\u0007\u0029\u0002\u0002\u030f\u0313\u0007\u001c\u0002\u0002\u0310\u0312\u0005\u0066\u0034\u0002\u0311\u0310\u0003\u0002\u0002\u0002\u0312\u0315\u0003\u0002\u0002\u0002\u0313\u0311\u0003\u0002\u0002\u0002\u0313\u0314\u0003\u0002\u0002\u0002\u0314\u0316\u0003\u0002\u0002\u0002\u0315\u0313\u0003\u0002\u0002\u0002\u0316\u0318\u0007\u001d\u0002\u0002\u0317\u030f\u0003\u0002\u0002\u0002\u0317\u0318\u0003\u0002\u0002\u0002\u0318\u0069\u0003\u0002\u0002\u0002\u0319\u031d\u0007\u0029\u0002\u0002\u031a\u031c\u0005\u0064\u0033\u0002\u031b\u031a\u0003\u0002\u0002\u0002\u031c\u031f\u0003\u0002\u0002\u0002\u031d\u031b\u0003\u0002\u0002\u0002\u031d\u031e\u0003\u0002\u0002\u0002\u031e\u032a\u0003\u0002\u0002\u0002\u031f\u031d\u0003\u0002\u0002\u0002\u0320\u0321\u0007\u0029\u0002\u0002\u0321\u0325\u0007\u001c\u0002\u0002\u0322\u0324\u0005\u0064\u0033\u0002\u0323\u0322\u0003\u0002\u0002\u0002\u0324\u0327\u0003\u0002\u0002\u0002\u0325\u0323\u0003\u0002\u0002\u0002\u0325\u0326\u0003\u0002\u0002\u0002\u0326\u0328\u0003\u0002\u0002\u0002\u0327\u0325\u0003\u0002\u0002\u0002\u0328\u032a\u0007\u001d\u0002\u0002\u0329\u0319\u0003\u0002\u0002\u0002\u0329\u0320\u0003\u0002\u0002\u0002\u032a\u006b\u0003\u0002\u0002\u0002\u032b\u032f\u0007\u001f\u0002\u0002\u032c\u032e\u0005\u006a\u0036\u0002\u032d\u032c\u0003\u0002\u0002\u0002\u032e\u0331\u0003\u0002\u0002\u0002\u032f\u032d\u0003\u0002\u0002\u0002\u032f\u0330\u0003\u0002\u0002\u0002\u0330\u0332\u0003\u0002\u0002\u0002\u0331\u032f\u0003\u0002\u0002\u0002\u0332\u0333\u0007\u0021\u0002\u0002\u0333\u006d\u0003\u0002\u0002\u0002\u0334\u0335\u0007\u0028\u0002\u0002\u0335\u0336\u0007\u0029\u0002\u0002\u0336\u006f\u0003\u0002\u0002\u0002\u0087\u0071\u0076\u007d\u007f\u008c\u0097\u009f\u00a8\u00aa\u00b0\u00b5\u00bc\u00c1\u00c5\u00c9\u00cb\u00d3\u00d7\u00da\u00de\u00e0\u00e6\u00e9\u00ee\u00f3\u00f5\u00fb\u0100\u0104\u0108\u010a\u010e\u0117\u011c\u0122\u0124\u012a\u012f\u013d\u0141\u0144\u0147\u014d\u0151\u0154\u0157\u015c\u015f\u0162\u016a\u0172\u0179\u017f\u0182\u0186\u0190\u0196\u019c\u01a7\u01b3\u01b5\u01bc\u01c1\u01c5\u01cb\u01d7\u01db\u01e1\u01e5\u01eb\u01ed\u01f3\u01fa\u01fe\u0203\u020b\u0211\u0215\u0218\u021b\u0220\u0224\u0228\u022b\u0231\u0236\u023a\u023d\u0243\u0248\u024c\u024f\u0252\u0256\u025a\u025d\u0263\u0267\u026a\u0270\u0275\u0278\u027b\u027f\u0282\u0287\u028a\u028f\u0292\u0297\u029a\u029f\u02a1\u02a9\u02ab\u02af\u02b5\u02ba\u02cb\u02d0\u02d7\u02db\u02df\u02e5\u02f2\u02f8\u0304\u0313\u0317\u031d\u0325\u0329\u032f"

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
			this.state = 111
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAMESPACE) {
				if (true){
				this.state = 110
				namespace()
				}
			}

			this.state = 116
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPORT) {
				if (true){
				if (true){
				this.state = 113
				importEx()
				}
				}
				this.state = 118
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 125
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ANNOTATION) or (1L shl Class) or (1L shl TEMPLATE) or (1L shl VAR) or (1L shl VAL) or (1L shl INTERFACE) or (1L shl NEWDATA) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 123
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
				1 -> {if (true){
				this.state = 119
				definition()
				}}
				2 -> {if (true){
				this.state = 120
				field()
				}}
				3 -> {if (true){
				this.state = 121
				annotationDef()
				}}
				4 -> {if (true){
				this.state = 122
				newdata()
				}}
				}
				}
				this.state = 127
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
			this.state = 128
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
			this.state = 130
			match(IMPORT) as Token
			this.state = 131
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
			this.state = 133
			match(ID) as Token
			this.state = 138
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 134
					match(DOT) as Token
					this.state = 135
					match(ID) as Token
					}
					} 
				}
				this.state = 140
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
			this.state = 141
			match(NAMESPACE) as Token
			this.state = 142
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
			this.state = 144
			match(DO) as Token
			this.state = 145
			match(LBRACE) as Token
			this.state = 149
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl RETURN) or (1L shl VAR) or (1L shl VAL) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl Sharp) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 146
				compo()
				}
				}
				this.state = 151
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 152
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
			this.state = 157
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAR , VAL , LCOLONSQUARE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 154
			field()
			}}
			DO , LPAREN , LSQUARE , Sharp , ID , OPID , Integer , Double , String  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 155
			value(0)
			}}
			RETURN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 156
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
			this.state = 159
			match(RETURN) as Token
			this.state = 160
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
			this.state = 162
			match(STATIC) as Token
			this.state = 163
			match(LBRACE) as Token
			this.state = 168
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Class) or (1L shl TEMPLATE) or (1L shl VAR) or (1L shl VAL) or (1L shl INTERFACE) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 166
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,7,context) ) {
				1 -> {if (true){
				this.state = 164
				definition()
				}}
				2 -> {if (true){
				this.state = 165
				field()
				}}
				}
				}
				this.state = 170
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 171
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
		fun findConstructor_() : Constructor_Context? = getRuleContext(solver.getType("Constructor_Context"),0)
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
			this.state = 174
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 173
				annotationBlock()
				}
			}

			this.state = 176
			match(Class) as Token
			this.state = 177
			match(ID) as Token
			this.state = 179
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 178
				typeParam()
				}
			}

			this.state = 181
			constructor_()
			this.state = 182
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
		fun findDoBlock() : DoBlockContext? = getRuleContext(solver.getType("DoBlockContext"),0)
		fun findSubconstructor() : List<SubconstructorContext> = getRuleContexts(solver.getType("SubconstructorContext"))
		fun findSubconstructor(i: Int) : SubconstructorContext? = getRuleContext(solver.getType("SubconstructorContext"),i)
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
			this.state = 268
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,31,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 184
			match(LBRACE) as Token
			this.state = 186
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 185
				doBlock()
				}
			}

			this.state = 191
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 188
				subconstructor()
				}
				}
				this.state = 193
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 195
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STATIC) {
				if (true){
				this.state = 194
				staticBlock()
				}
			}

			this.state = 201
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl TEMPLATE) or (1L shl VAR) or (1L shl VAL) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 199
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,14,context) ) {
				1 -> {if (true){
				this.state = 197
				field()
				}}
				2 -> {if (true){
				this.state = 198
				def()
				}}
				}
				}
				this.state = 203
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 204
			match(RBRACE) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 205
			match(LBRACE) as Token
			this.state = 209
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 206
				subconstructor()
				}
				}
				this.state = 211
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 213
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 212
				doBlock()
				}
			}

			this.state = 216
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STATIC) {
				if (true){
				this.state = 215
				staticBlock()
				}
			}

			this.state = 222
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl TEMPLATE) or (1L shl VAR) or (1L shl VAL) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 220
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,19,context) ) {
				1 -> {if (true){
				this.state = 218
				field()
				}}
				2 -> {if (true){
				this.state = 219
				def()
				}}
				}
				}
				this.state = 224
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 225
			match(RBRACE) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 226
			match(LBRACE) as Token
			this.state = 228
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STATIC) {
				if (true){
				this.state = 227
				staticBlock()
				}
			}

			this.state = 231
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 230
				doBlock()
				}
			}

			this.state = 236
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 233
				subconstructor()
				}
				}
				this.state = 238
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 243
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl TEMPLATE) or (1L shl VAR) or (1L shl VAL) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 241
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,24,context) ) {
				1 -> {if (true){
				this.state = 239
				field()
				}}
				2 -> {if (true){
				this.state = 240
				def()
				}}
				}
				}
				this.state = 245
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 246
			match(RBRACE) as Token
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 247
			match(LBRACE) as Token
			this.state = 249
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STATIC) {
				if (true){
				this.state = 248
				staticBlock()
				}
			}

			this.state = 254
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 251
				subconstructor()
				}
				}
				this.state = 256
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 258
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 257
				doBlock()
				}
			}

			this.state = 264
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl TEMPLATE) or (1L shl VAR) or (1L shl VAL) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 262
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,29,context) ) {
				1 -> {if (true){
				this.state = 260
				field()
				}}
				2 -> {if (true){
				this.state = 261
				def()
				}}
				}
				}
				this.state = 266
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 267
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

	open class Constructor_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_constructor_.id
	        set(value) { throw RuntimeException() }
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  constructor_() : Constructor_Context {
		var _localctx : Constructor_Context = Constructor_Context(context, state)
		enterRule(_localctx, 22, Rules.RULE_constructor_.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 270
			parameter()
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

	open class SubconstructorContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_subconstructor.id
	        set(value) { throw RuntimeException() }
		fun findConstructor_() : Constructor_Context? = getRuleContext(solver.getType("Constructor_Context"),0)
		fun BIGARROW() : TerminalNode? = getToken(FoldingParser.Tokens.BIGARROW.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  subconstructor() : SubconstructorContext {
		var _localctx : SubconstructorContext = SubconstructorContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_subconstructor.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 272
			constructor_()
			this.state = 273
			match(BIGARROW) as Token
			this.state = 274
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
		enterRule(_localctx, 26, Rules.RULE_interface_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 277
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 276
				annotationBlock()
				}
			}

			this.state = 279
			match(INTERFACE) as Token
			this.state = 280
			match(ID) as Token
			this.state = 282
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 281
				typeParam()
				}
			}

			this.state = 290
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 284
				match(TILDE) as Token
				this.state = 286 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 285
					typeEx()
					}
					}
					this.state = 288 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( _la==LPAREN || _la==ID )
				}
			}

			this.state = 292
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
		enterRule(_localctx, 28, Rules.RULE_interfaceBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 294
			match(LBRACE) as Token
			this.state = 296
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STATIC) {
				if (true){
				this.state = 295
				staticBlock()
				}
			}

			this.state = 301
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LCOLONSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 298
				defInInterface()
				}
				}
				this.state = 303
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 304
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
		enterRule(_localctx, 30, Rules.RULE_valInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 306
			match(VAL) as Token
			this.state = 307
			match(ID) as Token
			this.state = 308
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
		enterRule(_localctx, 32, Rules.RULE_varInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 310
			match(VAR) as Token
			this.state = 311
			match(ID) as Token
			this.state = 312
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
		enterRule(_localctx, 34, Rules.RULE_defInInterface.id)
		var _la: Int
		try {
			this.state = 349
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,47,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 315
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 314
				annotationBlock()
				}
			}

			this.state = 317
			match(ID) as Token
			this.state = 319
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 318
				compiledId()
				}
			}

			this.state = 322
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 321
				typeParam()
				}
			}

			this.state = 325
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 324
				parameter()
				}
			}

			this.state = 327
			match(BIGARROW) as Token
			this.state = 328
			match(COLON) as Token
			this.state = 329
			typeEx()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 331
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 330
				annotationBlock()
				}
			}

			this.state = 333
			match(ID) as Token
			this.state = 335
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 334
				compiledId()
				}
			}

			this.state = 338
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 337
				typeParam()
				}
			}

			this.state = 341
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 340
				parameter()
				}
			}

			this.state = 343
			match(BIGARROW) as Token
			this.state = 346
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 344
				match(COLON) as Token
				this.state = 345
				typeEx()
				}
			}

			this.state = 348
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
		enterRule(_localctx, 36, Rules.RULE_newdata.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 352
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 351
				annotationBlock()
				}
			}

			this.state = 354
			match(NEWDATA) as Token
			this.state = 355
			match(ID) as Token
			this.state = 356
			match(LBRACE) as Token
			this.state = 360
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Sharp) {
				if (true){
				if (true){
				this.state = 357
				literal()
				}
				}
				this.state = 362
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 363
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
		enterRule(_localctx, 38, Rules.RULE_typeParam.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 366 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 365
				typeParamCompo()
				}
				}
				this.state = 368 
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
		enterRule(_localctx, 40, Rules.RULE_typeParamCompo.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 370
			match(ID) as Token
			this.state = 375
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,51,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 371
					match(TILDE) as Token
					this.state = 372
					typeEx()
					}
					} 
				}
				this.state = 377
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,51,context)
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
		enterRule(_localctx, 42, Rules.RULE_definition.id)
		try {
			this.state = 381
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,52,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 378
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 379
			class_()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 380
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
		enterRule(_localctx, 44, Rules.RULE_field.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 384
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 383
				annotationBlock()
				}
			}

			this.state = 388
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 386
			val_()
			}}
			VAR  ->  /*LL1AltBlock*/{if (true){
			this.state = 387
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
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		fun COLON() : TerminalNode? = getToken(FoldingParser.Tokens.COLON.id, 0)
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
		var _startState : Int = 46
		enterRecursionRule(_localctx, 46, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 421
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,58,context) ) {
			1 -> {if (true){
			this.state = 391
			match(Integer) as Token
			}}
			2 -> {if (true){
			this.state = 392
			match(Double) as Token
			}}
			3 -> {if (true){
			this.state = 393
			match(String) as Token
			}}
			4 -> {if (true){
			this.state = 394
			literal()
			}}
			5 -> {if (true){
			this.state = 398
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,55,context) ) {
			1   -> if (true){
			this.state = 395
			package_()
			this.state = 396
			match(DOT) as Token
			}
			}
			this.state = 400
			match(ID) as Token
			}}
			6 -> {if (true){
			this.state = 404
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 401
				package_()
				this.state = 402
				match(DOT) as Token
				}
			}

			this.state = 406
			opIdWrap()
			}}
			7 -> {if (true){
			this.state = 410
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 407
				package_()
				this.state = 408
				match(DOT) as Token
				}
			}

			this.state = 412
			aopIdWrap()
			}}
			8 -> {if (true){
			this.state = 413
			match(OPID) as Token
			this.state = 414
			value(6)
			}}
			9 -> {if (true){
			this.state = 415
			doBlock()
			}}
			10 -> {if (true){
			this.state = 416
			lambda()
			}}
			11 -> {if (true){
			this.state = 417
			match(LPAREN) as Token
			this.state = 418
			value(0)
			this.state = 419
			match(RPAREN) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 435
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,60,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 433
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,59,context) ) {
					1 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 423
					if (!(precpred(context!!, 7))) throw FailedPredicateException(this, "precpred(context!!, 7)")
					this.state = 424
					match(OPID) as Token
					this.state = 425
					value(8)
					}}
					2 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 426
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 427
					argValue()
					}}
					3 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 428
					if (!(precpred(context!!, 3))) throw FailedPredicateException(this, "precpred(context!!, 3)")
					this.state = 429
					match(COLON) as Token
					this.state = 430
					match(ID) as Token
					}}
					4 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 431
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 432
					typeCasting()
					}}
					}
					} 
				}
				this.state = 437
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,60,context)
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
		enterRule(_localctx, 48, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 438
			match(AS) as Token
			this.state = 439
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
		enterRule(_localctx, 50, Rules.RULE_paramEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 442
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 441
				annotationBlock()
				}
			}

			this.state = 444
			match(ID) as Token
			this.state = 445
			typeEx()
			this.state = 447
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 446
				match(ELLIPSIS) as Token
				}
			}

			this.state = 451
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 449
				match(ASSGIN) as Token
				this.state = 450
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
		enterRule(_localctx, 52, Rules.RULE_parameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 453
			match(COLON) as Token
			this.state = 457
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LCOLONSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 454
				paramEx()
				}
				}
				this.state = 459
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
		enterRule(_localctx, 54, Rules.RULE_opParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 460
			match(COLON) as Token
			this.state = 461
			paramEx()
			this.state = 462
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
		enterRule(_localctx, 56, Rules.RULE_aopParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 464
			match(COLON) as Token
			this.state = 465
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
		enterRule(_localctx, 58, Rules.RULE_argEx.id)
		var _la: Int
		try {
			this.state = 483
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,68,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 469
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,65,context) ) {
			1   -> if (true){
			this.state = 467
			match(ID) as Token
			this.state = 468
			match(ASSGIN) as Token
			}
			}
			this.state = 471
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 473
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 472
				match(ID) as Token
				}
			}

			this.state = 475
			match(LBRACE) as Token
			this.state = 479
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl Sharp) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 476
				value(0)
				}
				}
				this.state = 481
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 482
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
		enterRule(_localctx, 60, Rules.RULE_argValue.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 491
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 485
				match(TILDE) as Token
				this.state = 487 
				errorHandler.sync(this)
				_alt = 1
				do {
					when (_alt) {
					    1 -> if (true){
					if (true){
					this.state = 486
					typeEx()
					}
					}
					else -> throw NoViableAltException(this)
					}
					this.state = 489 
					errorHandler.sync(this)
					_alt = interpreter!!.adaptivePredict(_input!!,69,context)
				} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
				}
			}

			this.state = 493
			match(LPAREN) as Token
			this.state = 497
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl Sharp) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 494
				argEx()
				}
				}
				this.state = 499
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 500
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
		enterRule(_localctx, 62, Rules.RULE_val_.id)
		try {
			this.state = 504
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,72,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 502
			valSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 503
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
		enterRule(_localctx, 64, Rules.RULE_var_.id)
		try {
			this.state = 508
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,73,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 506
			varSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 507
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
		enterRule(_localctx, 66, Rules.RULE_valSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 510
			match(VAL) as Token
			this.state = 511
			match(ID) as Token
			this.state = 513
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 512
				typeEx()
				}
			}

			this.state = 515
			match(ASSGIN) as Token
			this.state = 516
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
		enterRule(_localctx, 68, Rules.RULE_varSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 518
			match(VAR) as Token
			this.state = 519
			match(ID) as Token
			this.state = 521
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 520
				typeEx()
				}
			}

			this.state = 523
			match(ASSGIN) as Token
			this.state = 524
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
		enterRule(_localctx, 70, Rules.RULE_def.id)
		var _la: Int
		try {
			this.state = 671
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,112,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 527
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 526
				annotationBlock()
				}
			}

			this.state = 529
			match(ID) as Token
			this.state = 531
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 530
				compiledId()
				}
			}

			this.state = 534
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 533
				typeParam()
				}
			}

			this.state = 537
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 536
				parameter()
				}
			}

			this.state = 539
			match(BIGARROW) as Token
			this.state = 542
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 540
				match(COLON) as Token
				this.state = 541
				typeEx()
				}
			}

			this.state = 544
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
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
			opIdWrap()
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
			opParameter()
			this.state = 556
			match(BIGARROW) as Token
			this.state = 559
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 557
				match(COLON) as Token
				this.state = 558
				typeEx()
				}
			}

			this.state = 561
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 564
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 563
				annotationBlock()
				}
			}

			this.state = 566
			aopIdWrap()
			this.state = 568
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 567
				compiledId()
				}
			}

			this.state = 571
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 570
				typeParam()
				}
			}

			this.state = 573
			aopParameter()
			this.state = 574
			match(BIGARROW) as Token
			this.state = 577
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 575
				match(COLON) as Token
				this.state = 576
				typeEx()
				}
			}

			this.state = 579
			value(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 582
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 581
				annotationBlock()
				}
			}

			this.state = 584
			match(ID) as Token
			this.state = 586
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 585
				compiledId()
				}
			}

			this.state = 589
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 588
				typeParam()
				}
			}

			this.state = 592
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 591
				parameter()
				}
			}

			this.state = 594
			foreign()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 596
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 595
				annotationBlock()
				}
			}

			this.state = 598
			opIdWrap()
			this.state = 600
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 599
				compiledId()
				}
			}

			this.state = 603
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 602
				typeParam()
				}
			}

			this.state = 605
			opParameter()
			this.state = 606
			foreign()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 609
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 608
				annotationBlock()
				}
			}

			this.state = 611
			aopIdWrap()
			this.state = 613
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 612
				compiledId()
				}
			}

			this.state = 616
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 615
				typeParam()
				}
			}

			this.state = 618
			aopParameter()
			this.state = 619
			foreign()
			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 622
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 621
				annotationBlock()
				}
			}

			this.state = 624
			match(TEMPLATE) as Token
			this.state = 625
			match(ID) as Token
			this.state = 627
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 626
				compiledId()
				}
			}

			this.state = 630
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 629
				typeParam()
				}
			}

			this.state = 633
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 632
				parameter()
				}
			}

			this.state = 637
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			EXTERNAL , FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 635
			foreign()
			}}
			RawString  ->  /*LL1AltBlock*/{if (true){
			this.state = 636
			match(RawString) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 640
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 639
				annotationBlock()
				}
			}

			this.state = 642
			match(TEMPLATE) as Token
			this.state = 643
			opIdWrap()
			this.state = 645
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 644
				compiledId()
				}
			}

			this.state = 648
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 647
				typeParam()
				}
			}

			this.state = 650
			opParameter()
			this.state = 653
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			EXTERNAL , FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 651
			foreign()
			}}
			RawString  ->  /*LL1AltBlock*/{if (true){
			this.state = 652
			match(RawString) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 656
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 655
				annotationBlock()
				}
			}

			this.state = 658
			match(TEMPLATE) as Token
			this.state = 659
			aopIdWrap()
			this.state = 661
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 660
				compiledId()
				}
			}

			this.state = 664
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 663
				typeParam()
				}
			}

			this.state = 666
			aopParameter()
			this.state = 669
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			EXTERNAL , FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 667
			foreign()
			}}
			RawString  ->  /*LL1AltBlock*/{if (true){
			this.state = 668
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
		enterRule(_localctx, 72, Rules.RULE_compiledId.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 673
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
		enterRule(_localctx, 74, Rules.RULE_lambdaParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 675
			match(ID) as Token
			this.state = 681
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 676
				match(TILDE) as Token
				this.state = 677
				typeEx()
				this.state = 679
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==ELLIPSIS) {
					if (true){
					this.state = 678
					match(ELLIPSIS) as Token
					}
				}

				}
			}

			this.state = 685
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 683
				match(ASSGIN) as Token
				this.state = 684
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
		enterRule(_localctx, 76, Rules.RULE_lambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 687
			match(LSQUARE) as Token
			this.state = 691
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,116,context) ) {
			1   -> if (true){
			this.state = 688
			typeParam()
			this.state = 689
			match(COLON) as Token
			}
			}
			this.state = 696
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 693
				lambdaParamEx()
				}
				}
				this.state = 698
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 699
			match(RSQUARE) as Token
			this.state = 700
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
		enterRule(_localctx, 78, Rules.RULE_opIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 702
			match(LSQUARE) as Token
			this.state = 703
			match(OPID) as Token
			this.state = 704
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
		enterRule(_localctx, 80, Rules.RULE_aopIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 706
			match(LSQUARE) as Token
			this.state = 707
			match(TILDE) as Token
			this.state = 708
			match(OPID) as Token
			this.state = 709
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
		fun findTypeExSingle() : TypeExSingleContext? = getRuleContext(solver.getType("TypeExSingleContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeEx() : TypeExContext {
		var _localctx : TypeExContext = TypeExContext(context, state)
		enterRule(_localctx, 82, Rules.RULE_typeEx.id)
		try {
			this.state = 713
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 711
			typeExParameter()
			}}
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 712
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
		enterRule(_localctx, 84, Rules.RULE_typeExSingle.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 718
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,119,context) ) {
			1   -> if (true){
			this.state = 715
			package_()
			this.state = 716
			match(DOT) as Token
			}
			}
			this.state = 720
			match(ID) as Token
			this.state = 729
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,121,context) ) {
			1   -> if (true){
			this.state = 721
			match(LPAREN) as Token
			this.state = 723 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 722
				typeEx()
				}
				}
				this.state = 725 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==LPAREN || _la==ID )
			this.state = 727
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
		enterRule(_localctx, 86, Rules.RULE_typeExParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 731
			typeEx()
			this.state = 733
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 732
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
		fun ARROW() : TerminalNode? = getToken(FoldingParser.Tokens.ARROW.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findTypeExParamEx() : List<TypeExParamExContext> = getRuleContexts(solver.getType("TypeExParamExContext"))
		fun findTypeExParamEx(i: Int) : TypeExParamExContext? = getRuleContext(solver.getType("TypeExParamExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeExParameter() : TypeExParameterContext {
		var _localctx : TypeExParameterContext = TypeExParameterContext(context, state)
		enterRule(_localctx, 88, Rules.RULE_typeExParameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 735
			match(LPAREN) as Token
			this.state = 739
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN || _la==ID) {
				if (true){
				if (true){
				this.state = 736
				typeExParamEx()
				}
				}
				this.state = 741
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 742
			match(RPAREN) as Token
			this.state = 743
			match(ARROW) as Token
			this.state = 744
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
		enterRule(_localctx, 90, Rules.RULE_foreign.id)
		try {
			this.state = 752
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 746
			match(FOREIGN) as Token
			this.state = 747
			typeEx()
			this.state = 748
			foreignBody()
			}}
			EXTERNAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 750
			match(EXTERNAL) as Token
			this.state = 751
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
		enterRule(_localctx, 92, Rules.RULE_foreignBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 754
			match(LBRACE) as Token
			this.state = 758
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 755
				foreignElement()
				}
				}
				this.state = 760
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 761
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
		enterRule(_localctx, 94, Rules.RULE_foreignElement.id)
		try {
			this.state = 770
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,126,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 763
			foreignPlatform()
			this.state = 764
			match(RawString) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 766
			foreignPlatform()
			this.state = 767
			match(TILDE) as Token
			this.state = 768
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
		enterRule(_localctx, 96, Rules.RULE_foreignPlatform.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 772
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
		enterRule(_localctx, 98, Rules.RULE_annoValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 774
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
		enterRule(_localctx, 100, Rules.RULE_annoParam.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 776
			match(ID) as Token
			this.state = 777
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
		enterRule(_localctx, 102, Rules.RULE_annotationDef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 779
			match(ANNOTATION) as Token
			this.state = 780
			match(ID) as Token
			this.state = 789
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 781
				match(LPAREN) as Token
				this.state = 785
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==ID) {
					if (true){
					if (true){
					this.state = 782
					annoParam()
					}
					}
					this.state = 787
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				this.state = 788
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
		enterRule(_localctx, 104, Rules.RULE_annotation.id)
		var _la: Int
		try {
			this.state = 807
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,131,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 791
			match(ID) as Token
			this.state = 795
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 792
				annoValue()
				}
				}
				this.state = 797
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 798
			match(ID) as Token
			this.state = 799
			match(LPAREN) as Token
			this.state = 803
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 800
				annoValue()
				}
				}
				this.state = 805
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 806
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
		enterRule(_localctx, 106, Rules.RULE_annotationBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 809
			match(LCOLONSQUARE) as Token
			this.state = 813
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 810
				annotation()
				}
				}
				this.state = 815
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 816
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
		enterRule(_localctx, 108, Rules.RULE_literal.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 818
			match(Sharp) as Token
			this.state = 819
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
		23 -> return value_sempred(_localctx as ValueContext, predIndex)
		}
		return true
	}
	private fun value_sempred( _localctx : ValueContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 7)
		    1 -> return precpred(context!!, 8)
		    2 -> return precpred(context!!, 3)
		    3 -> return precpred(context!!, 1)
		}
		return true
	}

}