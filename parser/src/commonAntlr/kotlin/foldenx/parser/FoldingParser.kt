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
                                                              FoldingParser.DefinitionInClassContext::class,
                                                              FoldingParser.AbstractDefinitionInClassContext::class,
                                                              FoldingParser.ConstuctorContext::class,
                                                              FoldingParser.Interface_Context::class,
                                                              FoldingParser.InterfaceBodyContext::class,
                                                              FoldingParser.FieldInInterfaceContext::class,
                                                              FoldingParser.ValInInterfaceContext::class,
                                                              FoldingParser.VarInInterfaceContext::class,
                                                              FoldingParser.DefInInterfaceContext::class,
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
        RULE_definitionInClass(11),
        RULE_abstractDefinitionInClass(12),
        RULE_constuctor(13),
        RULE_interface_(14),
        RULE_interfaceBody(15),
        RULE_fieldInInterface(16),
        RULE_valInInterface(17),
        RULE_varInInterface(18),
        RULE_defInInterface(19),
        RULE_typeParam(20),
        RULE_typeParamCompo(21),
        RULE_definition(22),
        RULE_field(23),
        RULE_value(24),
        RULE_typeCasting(25),
        RULE_paramEx(26),
        RULE_parameter(27),
        RULE_opParameter(28),
        RULE_aopParameter(29),
        RULE_argEx(30),
        RULE_argValue(31),
        RULE_val_(32),
        RULE_var_(33),
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
                                "staticBlock", "class_", "classBody", "definitionInClass", 
                                "abstractDefinitionInClass", "constuctor", 
                                "interface_", "interfaceBody", "fieldInInterface", 
                                "valInInterface", "varInInterface", "defInInterface", 
                                "typeParam", "typeParamCompo", "definition", 
                                "field", "value", "typeCasting", "paramEx", 
                                "parameter", "opParameter", "aopParameter", 
                                "argEx", "argValue", "val_", "var_", "def", 
                                "compiledId", "lambdaParamEx", "lambda", 
                                "opIdWrap", "aopIdWrap", "typeEx", "typeExSingle", 
                                "typeExParamEx", "typeExParameter", "foreign", 
                                "foreignBody", "foreignElement", "foreignPlatform", 
                                "annoValue", "annoParam", "annotationDef", 
                                "annotation", "annotationBlock", "literal")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
                                                          null, "'as'", 
                                                          "'abstract'", 
                                                          "'annotation'", 
                                                          "'class'", "'do'", 
                                                          "'external'", 
                                                          "'foreign'", "'package'", 
                                                          "'override'", 
                                                          "'internal'", 
                                                          "'import'", "'return'", 
                                                          "'var'", "'val'", 
                                                          "'static'", "'interface'", 
                                                          "'='", "'...'", 
                                                          "'.'", "'('", 
                                                          "')'", "'['", 
                                                          "'[:'", "']'", 
                                                          "':]'", "'{'", 
                                                          "'}'", "'->'", 
                                                          "'~'", "':'", 
                                                          "'::'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "WS", "COMMENT", 
                                                           "LINE_COMMENT", 
                                                           "AS", "ABSTRACT", 
                                                           "ANNOTATION", 
                                                           "Class", "DO", 
                                                           "EXTERNAL", "FOREIGN", 
                                                           "NAMESPACE", 
                                                           "OVERRIDE", "INTERNAL", 
                                                           "IMPORT", "RETURN", 
                                                           "VAR", "VAL", 
                                                           "STATIC", "INTERFACE", 
                                                           "ASSGIN", "ELLIPSIS", 
                                                           "DOT", "LPAREN", 
                                                           "RPAREN", "LSQUARE", 
                                                           "LCOLONSQUARE", 
                                                           "RSQUARE", "RCOLONSQUARE", 
                                                           "LBRACE", "RBRACE", 
                                                           "ARROW", "TILDE", 
                                                           "COLON", "DOUBLECOLON", 
                                                           "ID", "OPID", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u002a\u02e7\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0003\u0002\u0005\u0002\u0070\u000a\u0002\u0003\u0002\u0007\u0002\u0073\u000a\u0002\u000c\u0002\u000e\u0002\u0076\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u007b\u000a\u0002\u000c\u0002\u000e\u0002\u007e\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0007\u0005\u0088\u000a\u0005\u000c\u0005\u000e\u0005\u008b\u000b\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u0093\u000a\u0007\u000c\u0007\u000e\u0007\u0096\u000b\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0005\u0008\u009c\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0007\u000a\u00a5\u000a\u000a\u000c\u000a\u000e\u000a\u00a8\u000b\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0005\u000b\u00ad\u000a\u000b\u0003\u000b\u0005\u000b\u00b0\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u00b5\u000a\u000b\u0003\u000b\u0003\u000b\u0006\u000b\u00b9\u000a\u000b\u000d\u000b\u000e\u000b\u00ba\u0005\u000b\u00bd\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0007\u000c\u00c3\u000a\u000c\u000c\u000c\u000e\u000c\u00c6\u000b\u000c\u0003\u000c\u0005\u000c\u00c9\u000a\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00cd\u000a\u000c\u000c\u000c\u000e\u000c\u00d0\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0005\u000d\u00d5\u000a\u000d\u0003\u000d\u0005\u000d\u00d8\u000a\u000d\u0003\u000d\u0005\u000d\u00db\u000a\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00df\u000a\u000d\u0003\u000d\u0005\u000d\u00e2\u000a\u000d\u0003\u000d\u0005\u000d\u00e5\u000a\u000d\u0003\u000d\u0005\u000d\u00e8\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00ed\u000a\u000d\u0003\u000d\u0005\u000d\u00f0\u000a\u000d\u0003\u000d\u0005\u000d\u00f3\u000a\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00f7\u000a\u000d\u0003\u000d\u0005\u000d\u00fa\u000a\u000d\u0003\u000d\u0005\u000d\u00fd\u000a\u000d\u0003\u000d\u0005\u000d\u0100\u000a\u000d\u0003\u000e\u0005\u000e\u0103\u000a\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u0107\u000a\u000e\u0003\u000f\u0006\u000f\u010a\u000a\u000f\u000d\u000f\u000e\u000f\u010b\u0003\u000f\u0003\u000f\u0005\u000f\u0110\u000a\u000f\u0003\u0010\u0005\u0010\u0113\u000a\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u0118\u000a\u0010\u0003\u0010\u0003\u0010\u0006\u0010\u011c\u000a\u0010\u000d\u0010\u000e\u0010\u011d\u0005\u0010\u0120\u000a\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0005\u0011\u0126\u000a\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u012a\u000a\u0011\u000c\u0011\u000e\u0011\u012d\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0005\u0012\u0132\u000a\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0136\u000a\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0005\u0015\u0141\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0145\u000a\u0015\u0003\u0015\u0005\u0015\u0148\u000a\u0015\u0003\u0015\u0005\u0015\u014b\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u014f\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0153\u000a\u0015\u0003\u0015\u0005\u0015\u0156\u000a\u0015\u0003\u0015\u0005\u0015\u0159\u000a\u0015\u0003\u0015\u0005\u0015\u015c\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0160\u000a\u0015\u0003\u0016\u0003\u0016\u0006\u0016\u0164\u000a\u0016\u000d\u0016\u000e\u0016\u0165\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0007\u0017\u016d\u000a\u0017\u000c\u0017\u000e\u0017\u0170\u000b\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0175\u000a\u0018\u0003\u0019\u0003\u0019\u0005\u0019\u0179\u000a\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0005\u001a\u0183\u000a\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0005\u001a\u0189\u000a\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0005\u001a\u018f\u000a\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0005\u001a\u019a\u000a\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0007\u001a\u01a6\u000a\u001a\u000c\u001a\u000e\u001a\u01a9\u000b\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0005\u001c\u01af\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01b4\u000a\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01b8\u000a\u001c\u0003\u001d\u0003\u001d\u0007\u001d\u01bc\u000a\u001d\u000c\u001d\u000e\u001d\u01bf\u000b\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0005\u0020\u01ce\u000a\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u01d2\u000a\u0020\u0003\u0020\u0003\u0020\u0007\u0020\u01d6\u000a\u0020\u000c\u0020\u000e\u0020\u01d9\u000b\u0020\u0003\u0020\u0005\u0020\u01dc\u000a\u0020\u0003\u0021\u0003\u0021\u0007\u0021\u01e0\u000a\u0021\u000c\u0021\u000e\u0021\u01e3\u000b\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0005\u0022\u01ea\u000a\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u01f2\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0005\u0024\u01f8\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01fc\u000a\u0024\u0003\u0024\u0005\u0024\u01ff\u000a\u0024\u0003\u0024\u0005\u0024\u0202\u000a\u0024\u0003\u0024\u0005\u0024\u0205\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u020a\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u020e\u000a\u0024\u0003\u0024\u0005\u0024\u0211\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0215\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u021b\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u021f\u000a\u0024\u0003\u0024\u0005\u0024\u0222\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0226\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u022c\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0230\u000a\u0024\u0003\u0024\u0005\u0024\u0233\u000a\u0024\u0003\u0024\u0005\u0024\u0236\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u023a\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u023e\u000a\u0024\u0003\u0024\u0005\u0024\u0241\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0247\u000a\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u024b\u000a\u0024\u0003\u0024\u0005\u0024\u024e\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0253\u000a\u0024\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u025b\u000a\u0026\u0005\u0026\u025d\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0261\u000a\u0026\u0003\u0027\u0003\u0027\u0007\u0027\u0265\u000a\u0027\u000c\u0027\u000e\u0027\u0268\u000b\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0005\u002a\u027b\u000a\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0280\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0006\u002b\u0285\u000a\u002b\u000d\u002b\u000e\u002b\u0286\u0003\u002b\u0003\u002b\u0005\u002b\u028b\u000a\u002b\u0003\u002c\u0003\u002c\u0005\u002c\u028f\u000a\u002c\u0003\u002d\u0003\u002d\u0007\u002d\u0293\u000a\u002d\u000c\u002d\u000e\u002d\u0296\u000b\u002d\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0003\u002e\u0005\u002e\u02a0\u000a\u002e\u0003\u002f\u0003\u002f\u0007\u002f\u02a4\u000a\u002f\u000c\u002f\u000e\u002f\u02a7\u000b\u002f\u0003\u002f\u0003\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0005\u0030\u02b2\u000a\u0030\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0007\u0034\u02bf\u000a\u0034\u000c\u0034\u000e\u0034\u02c2\u000b\u0034\u0003\u0034\u0005\u0034\u02c5\u000a\u0034\u0003\u0035\u0003\u0035\u0007\u0035\u02c9\u000a\u0035\u000c\u0035\u000e\u0035\u02cc\u000b\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0007\u0035\u02d1\u000a\u0035\u000c\u0035\u000e\u0035\u02d4\u000b\u0035\u0003\u0035\u0005\u0035\u02d7\u000a\u0035\u0003\u0036\u0003\u0036\u0003\u0036\u0007\u0036\u02dc\u000a\u0036\u000c\u0036\u000e\u0036\u02df\u000b\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0002\u0003\u0032\u0038\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u0002\u0003\u0003\u0002\u0027\u0029\u0002\u0338\u0002\u006f\u0003\u0002\u0002\u0002\u0004\u007f\u0003\u0002\u0002\u0002\u0006\u0081\u0003\u0002\u0002\u0002\u0008\u0084\u0003\u0002\u0002\u0002\u000a\u008c\u0003\u0002\u0002\u0002\u000c\u008f\u0003\u0002\u0002\u0002\u000e\u009b\u0003\u0002\u0002\u0002\u0010\u009d\u0003\u0002\u0002\u0002\u0012\u00a0\u0003\u0002\u0002\u0002\u0014\u00ac\u0003\u0002\u0002\u0002\u0016\u00c0\u0003\u0002\u0002\u0002\u0018\u00ff\u0003\u0002\u0002\u0002\u001a\u0102\u0003\u0002\u0002\u0002\u001c\u0109\u0003\u0002\u0002\u0002\u001e\u0112\u0003\u0002\u0002\u0002\u0020\u0123\u0003\u0002\u0002\u0002\u0022\u0131\u0003\u0002\u0002\u0002\u0024\u0137\u0003\u0002\u0002\u0002\u0026\u013b\u0003\u0002\u0002\u0002\u0028\u015f\u0003\u0002\u0002\u0002\u002a\u0161\u0003\u0002\u0002\u0002\u002c\u0169\u0003\u0002\u0002\u0002\u002e\u0174\u0003\u0002\u0002\u0002\u0030\u0178\u0003\u0002\u0002\u0002\u0032\u0199\u0003\u0002\u0002\u0002\u0034\u01aa\u0003\u0002\u0002\u0002\u0036\u01ae\u0003\u0002\u0002\u0002\u0038\u01b9\u0003\u0002\u0002\u0002\u003a\u01c2\u0003\u0002\u0002\u0002\u003c\u01c7\u0003\u0002\u0002\u0002\u003e\u01db\u0003\u0002\u0002\u0002\u0040\u01dd\u0003\u0002\u0002\u0002\u0042\u01e6\u0003\u0002\u0002\u0002\u0044\u01ee\u0003\u0002\u0002\u0002\u0046\u0252\u0003\u0002\u0002\u0002\u0048\u0254\u0003\u0002\u0002\u0002\u004a\u0256\u0003\u0002\u0002\u0002\u004c\u0262\u0003\u0002\u0002\u0002\u004e\u026c\u0003\u0002\u0002\u0002\u0050\u0270\u0003\u0002\u0002\u0002\u0052\u027a\u0003\u0002\u0002\u0002\u0054\u027f\u0003\u0002\u0002\u0002\u0056\u028c\u0003\u0002\u0002\u0002\u0058\u0290\u0003\u0002\u0002\u0002\u005a\u029f\u0003\u0002\u0002\u0002\u005c\u02a1\u0003\u0002\u0002\u0002\u005e\u02b1\u0003\u0002\u0002\u0002\u0060\u02b3\u0003\u0002\u0002\u0002\u0062\u02b5\u0003\u0002\u0002\u0002\u0064\u02b7\u0003\u0002\u0002\u0002\u0066\u02ba\u0003\u0002\u0002\u0002\u0068\u02d6\u0003\u0002\u0002\u0002\u006a\u02d8\u0003\u0002\u0002\u0002\u006c\u02e3\u0003\u0002\u0002\u0002\u006e\u0070\u0005\u000a\u0006\u0002\u006f\u006e\u0003\u0002\u0002\u0002\u006f\u0070\u0003\u0002\u0002\u0002\u0070\u0074\u0003\u0002\u0002\u0002\u0071\u0073\u0005\u0004\u0003\u0002\u0072\u0071\u0003\u0002\u0002\u0002\u0073\u0076\u0003\u0002\u0002\u0002\u0074\u0072\u0003\u0002\u0002\u0002\u0074\u0075\u0003\u0002\u0002\u0002\u0075\u007c\u0003\u0002\u0002\u0002\u0076\u0074\u0003\u0002\u0002\u0002\u0077\u007b\u0005\u002e\u0018\u0002\u0078\u007b\u0005\u0030\u0019\u0002\u0079\u007b\u0005\u0066\u0034\u0002\u007a\u0077\u0003\u0002\u0002\u0002\u007a\u0078\u0003\u0002\u0002\u0002\u007a\u0079\u0003\u0002\u0002\u0002\u007b\u007e\u0003\u0002\u0002\u0002\u007c\u007a\u0003\u0002\u0002\u0002\u007c\u007d\u0003\u0002\u0002\u0002\u007d\u0003\u0003\u0002\u0002\u0002\u007e\u007c\u0003\u0002\u0002\u0002\u007f\u0080\u0005\u0006\u0004\u0002\u0080\u0005\u0003\u0002\u0002\u0002\u0081\u0082\u0007\u0010\u0002\u0002\u0082\u0083\u0005\u0008\u0005\u0002\u0083\u0007\u0003\u0002\u0002\u0002\u0084\u0089\u0007\u0025\u0002\u0002\u0085\u0086\u0007\u0018\u0002\u0002\u0086\u0088\u0007\u0025\u0002\u0002\u0087\u0085\u0003\u0002\u0002\u0002\u0088\u008b\u0003\u0002\u0002\u0002\u0089\u0087\u0003\u0002\u0002\u0002\u0089\u008a\u0003\u0002\u0002\u0002\u008a\u0009\u0003\u0002\u0002\u0002\u008b\u0089\u0003\u0002\u0002\u0002\u008c\u008d\u0007\u000d\u0002\u0002\u008d\u008e\u0005\u0008\u0005\u0002\u008e\u000b\u0003\u0002\u0002\u0002\u008f\u0090\u0007\u000a\u0002\u0002\u0090\u0094\u0007\u001f\u0002\u0002\u0091\u0093\u0005\u000e\u0008\u0002\u0092\u0091\u0003\u0002\u0002\u0002\u0093\u0096\u0003\u0002\u0002\u0002\u0094\u0092\u0003\u0002\u0002\u0002\u0094\u0095\u0003\u0002\u0002\u0002\u0095\u0097\u0003\u0002\u0002\u0002\u0096\u0094\u0003\u0002\u0002\u0002\u0097\u0098\u0007\u0020\u0002\u0002\u0098\u000d\u0003\u0002\u0002\u0002\u0099\u009c\u0005\u0032\u001a\u0002\u009a\u009c\u0005\u0010\u0009\u0002\u009b\u0099\u0003\u0002\u0002\u0002\u009b\u009a\u0003\u0002\u0002\u0002\u009c\u000f\u0003\u0002\u0002\u0002\u009d\u009e\u0007\u0011\u0002\u0002\u009e\u009f\u0005\u0032\u001a\u0002\u009f\u0011\u0003\u0002\u0002\u0002\u00a0\u00a1\u0007\u0014\u0002\u0002\u00a1\u00a6\u0007\u001f\u0002\u0002\u00a2\u00a5\u0005\u002e\u0018\u0002\u00a3\u00a5\u0005\u0030\u0019\u0002\u00a4\u00a2\u0003\u0002\u0002\u0002\u00a4\u00a3\u0003\u0002\u0002\u0002\u00a5\u00a8\u0003\u0002\u0002\u0002\u00a6\u00a4\u0003\u0002\u0002\u0002\u00a6\u00a7\u0003\u0002\u0002\u0002\u00a7\u00a9\u0003\u0002\u0002\u0002\u00a8\u00a6\u0003\u0002\u0002\u0002\u00a9\u00aa\u0007\u0020\u0002\u0002\u00aa\u0013\u0003\u0002\u0002\u0002\u00ab\u00ad\u0005\u006a\u0036\u0002\u00ac\u00ab\u0003\u0002\u0002\u0002\u00ac\u00ad\u0003\u0002\u0002\u0002\u00ad\u00af\u0003\u0002\u0002\u0002\u00ae\u00b0\u0007\u0007\u0002\u0002\u00af\u00ae\u0003\u0002\u0002\u0002\u00af\u00b0\u0003\u0002\u0002\u0002\u00b0\u00b1\u0003\u0002\u0002\u0002\u00b1\u00b2\u0007\u0009\u0002\u0002\u00b2\u00b4\u0007\u0025\u0002\u0002\u00b3\u00b5\u0005\u002a\u0016\u0002\u00b4\u00b3\u0003\u0002\u0002\u0002\u00b4\u00b5\u0003\u0002\u0002\u0002\u00b5\u00bc\u0003\u0002\u0002\u0002\u00b6\u00b8\u0007\u0022\u0002\u0002\u00b7\u00b9\u0005\u0052\u002a\u0002\u00b8\u00b7\u0003\u0002\u0002\u0002\u00b9\u00ba\u0003\u0002\u0002\u0002\u00ba\u00b8\u0003\u0002\u0002\u0002\u00ba\u00bb\u0003\u0002\u0002\u0002\u00bb\u00bd\u0003\u0002\u0002\u0002\u00bc\u00b6\u0003\u0002\u0002\u0002\u00bc\u00bd\u0003\u0002\u0002\u0002\u00bd\u00be\u0003\u0002\u0002\u0002\u00be\u00bf\u0005\u0016\u000c\u0002\u00bf\u0015\u0003\u0002\u0002\u0002\u00c0\u00c4\u0007\u001f\u0002\u0002\u00c1\u00c3\u0005\u001c\u000f\u0002\u00c2\u00c1\u0003\u0002\u0002\u0002\u00c3\u00c6\u0003\u0002\u0002\u0002\u00c4\u00c2\u0003\u0002\u0002\u0002\u00c4\u00c5\u0003\u0002\u0002\u0002\u00c5\u00c8\u0003\u0002\u0002\u0002\u00c6\u00c4\u0003\u0002\u0002\u0002\u00c7\u00c9\u0005\u0012\u000a\u0002\u00c8\u00c7\u0003\u0002\u0002\u0002\u00c8\u00c9\u0003\u0002\u0002\u0002\u00c9\u00ce\u0003\u0002\u0002\u0002\u00ca\u00cd\u0005\u0018\u000d\u0002\u00cb\u00cd\u0005\u001a\u000e\u0002\u00cc\u00ca\u0003\u0002\u0002\u0002\u00cc\u00cb\u0003\u0002\u0002\u0002\u00cd\u00d0\u0003\u0002\u0002\u0002\u00ce\u00cc\u0003\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00cf\u00d1\u0003\u0002\u0002\u0002\u00d0\u00ce\u0003\u0002\u0002\u0002\u00d1\u00d2\u0007\u0020\u0002\u0002\u00d2\u0017\u0003\u0002\u0002\u0002\u00d3\u00d5\u0005\u006a\u0036\u0002\u00d4\u00d3\u0003\u0002\u0002\u0002\u00d4\u00d5\u0003\u0002\u0002\u0002\u00d5\u00d7\u0003\u0002\u0002\u0002\u00d6\u00d8\u0007\u000f\u0002\u0002\u00d7\u00d6\u0003\u0002\u0002\u0002\u00d7\u00d8\u0003\u0002\u0002\u0002\u00d8\u00da\u0003\u0002\u0002\u0002\u00d9\u00db\u0007\u000e\u0002\u0002\u00da\u00d9\u0003\u0002\u0002\u0002\u00da\u00db\u0003\u0002\u0002\u0002\u00db\u00dc\u0003\u0002\u0002\u0002\u00dc\u00de\u0007\u0025\u0002\u0002\u00dd\u00df\u0005\u0048\u0025\u0002\u00de\u00dd\u0003\u0002\u0002\u0002\u00de\u00df\u0003\u0002\u0002\u0002\u00df\u00e1\u0003\u0002\u0002\u0002\u00e0\u00e2\u0005\u002a\u0016\u0002\u00e1\u00e0\u0003\u0002\u0002\u0002\u00e1\u00e2\u0003\u0002\u0002\u0002\u00e2\u00e4\u0003\u0002\u0002\u0002\u00e3\u00e5\u0005\u0038\u001d\u0002\u00e4\u00e3\u0003\u0002\u0002\u0002\u00e4\u00e5\u0003\u0002\u0002\u0002\u00e5\u00e7\u0003\u0002\u0002\u0002\u00e6\u00e8\u0005\u0052\u002a\u0002\u00e7\u00e6\u0003\u0002\u0002\u0002\u00e7\u00e8\u0003\u0002\u0002\u0002\u00e8\u00e9\u0003\u0002\u0002\u0002\u00e9\u00ea\u0007\u0016\u0002\u0002\u00ea\u0100\u0005\u0032\u001a\u0002\u00eb\u00ed\u0005\u006a\u0036\u0002\u00ec\u00eb\u0003\u0002\u0002\u0002\u00ec\u00ed\u0003\u0002\u0002\u0002\u00ed\u00ef\u0003\u0002\u0002\u0002\u00ee\u00f0\u0007\u000f\u0002\u0002\u00ef\u00ee\u0003\u0002\u0002\u0002\u00ef\u00f0\u0003\u0002\u0002\u0002\u00f0\u00f2\u0003\u0002\u0002\u0002\u00f1\u00f3\u0007\u000e\u0002\u0002\u00f2\u00f1\u0003\u0002\u0002\u0002\u00f2\u00f3\u0003\u0002\u0002\u0002\u00f3\u00f4\u0003\u0002\u0002\u0002\u00f4\u00f6\u0007\u0025\u0002\u0002\u00f5\u00f7\u0005\u0048\u0025\u0002\u00f6\u00f5\u0003\u0002\u0002\u0002\u00f6\u00f7\u0003\u0002\u0002\u0002\u00f7\u00f9\u0003\u0002\u0002\u0002\u00f8\u00fa\u0005\u002a\u0016\u0002\u00f9\u00f8\u0003\u0002\u0002\u0002\u00f9\u00fa\u0003\u0002\u0002\u0002\u00fa\u00fc\u0003\u0002\u0002\u0002\u00fb\u00fd\u0005\u0038\u001d\u0002\u00fc\u00fb\u0003\u0002\u0002\u0002\u00fc\u00fd\u0003\u0002\u0002\u0002\u00fd\u00fe\u0003\u0002\u0002\u0002\u00fe\u0100\u0005\u005a\u002e\u0002\u00ff\u00d4\u0003\u0002\u0002\u0002\u00ff\u00ec\u0003\u0002\u0002\u0002\u0100\u0019\u0003\u0002\u0002\u0002\u0101\u0103\u0007\u000f\u0002\u0002\u0102\u0101\u0003\u0002\u0002\u0002\u0102\u0103\u0003\u0002\u0002\u0002\u0103\u0106\u0003\u0002\u0002\u0002\u0104\u0107\u0005\u0022\u0012\u0002\u0105\u0107\u0005\u0028\u0015\u0002\u0106\u0104\u0003\u0002\u0002\u0002\u0106\u0105\u0003\u0002\u0002\u0002\u0107\u001b\u0003\u0002\u0002\u0002\u0108\u010a\u0005\u0038\u001d\u0002\u0109\u0108\u0003\u0002\u0002\u0002\u010a\u010b\u0003\u0002\u0002\u0002\u010b\u0109\u0003\u0002\u0002\u0002\u010b\u010c\u0003\u0002\u0002\u0002\u010c\u010f\u0003\u0002\u0002\u0002\u010d\u010e\u0007\u0016\u0002\u0002\u010e\u0110\u0005\u0032\u001a\u0002\u010f\u010d\u0003\u0002\u0002\u0002\u010f\u0110\u0003\u0002\u0002\u0002\u0110\u001d\u0003\u0002\u0002\u0002\u0111\u0113\u0005\u006a\u0036\u0002\u0112\u0111\u0003\u0002\u0002\u0002\u0112\u0113\u0003\u0002\u0002\u0002\u0113\u0114\u0003\u0002\u0002\u0002\u0114\u0115\u0007\u0015\u0002\u0002\u0115\u0117\u0007\u0025\u0002\u0002\u0116\u0118\u0005\u002a\u0016\u0002\u0117\u0116\u0003\u0002\u0002\u0002\u0117\u0118\u0003\u0002\u0002\u0002\u0118\u011f\u0003\u0002\u0002\u0002\u0119\u011b\u0007\u0022\u0002\u0002\u011a\u011c\u0005\u0052\u002a\u0002\u011b\u011a\u0003\u0002\u0002\u0002\u011c\u011d\u0003\u0002\u0002\u0002\u011d\u011b\u0003\u0002\u0002\u0002\u011d\u011e\u0003\u0002\u0002\u0002\u011e\u0120\u0003\u0002\u0002\u0002\u011f\u0119\u0003\u0002\u0002\u0002\u011f\u0120\u0003\u0002\u0002\u0002\u0120\u0121\u0003\u0002\u0002\u0002\u0121\u0122\u0005\u0020\u0011\u0002\u0122\u001f\u0003\u0002\u0002\u0002\u0123\u0125\u0007\u001f\u0002\u0002\u0124\u0126\u0005\u0012\u000a\u0002\u0125\u0124\u0003\u0002\u0002\u0002\u0125\u0126\u0003\u0002\u0002\u0002\u0126\u012b\u0003\u0002\u0002\u0002\u0127\u012a\u0005\u0028\u0015\u0002\u0128\u012a\u0005\u0022\u0012\u0002\u0129\u0127\u0003\u0002\u0002\u0002\u0129\u0128\u0003\u0002\u0002\u0002\u012a\u012d\u0003\u0002\u0002\u0002\u012b\u0129\u0003\u0002\u0002\u0002\u012b\u012c\u0003\u0002\u0002\u0002\u012c\u012e\u0003\u0002\u0002\u0002\u012d\u012b\u0003\u0002\u0002\u0002\u012e\u012f\u0007\u0020\u0002\u0002\u012f\u0021\u0003\u0002\u0002\u0002\u0130\u0132\u0005\u006a\u0036\u0002\u0131\u0130\u0003\u0002\u0002\u0002\u0131\u0132\u0003\u0002\u0002\u0002\u0132\u0135\u0003\u0002\u0002\u0002\u0133\u0136\u0005\u0024\u0013\u0002\u0134\u0136\u0005\u0026\u0014\u0002\u0135\u0133\u0003\u0002\u0002\u0002\u0135\u0134\u0003\u0002\u0002\u0002\u0136\u0023\u0003\u0002\u0002\u0002\u0137\u0138\u0007\u0013\u0002\u0002\u0138\u0139\u0007\u0025\u0002\u0002\u0139\u013a\u0005\u0052\u002a\u0002\u013a\u0025\u0003\u0002\u0002\u0002\u013b\u013c\u0007\u0012\u0002\u0002\u013c\u013d\u0007\u0025\u0002\u0002\u013d\u013e\u0005\u0052\u002a\u0002\u013e\u0027\u0003\u0002\u0002\u0002\u013f\u0141\u0005\u006a\u0036\u0002\u0140\u013f\u0003\u0002\u0002\u0002\u0140\u0141\u0003\u0002\u0002\u0002\u0141\u0142\u0003\u0002\u0002\u0002\u0142\u0144\u0007\u0025\u0002\u0002\u0143\u0145\u0005\u0048\u0025\u0002\u0144\u0143\u0003\u0002\u0002\u0002\u0144\u0145\u0003\u0002\u0002\u0002\u0145\u0147\u0003\u0002\u0002\u0002\u0146\u0148\u0005\u002a\u0016\u0002\u0147\u0146\u0003\u0002\u0002\u0002\u0147\u0148\u0003\u0002\u0002\u0002\u0148\u014a\u0003\u0002\u0002\u0002\u0149\u014b\u0005\u0038\u001d\u0002\u014a\u0149\u0003\u0002\u0002\u0002\u014a\u014b\u0003\u0002\u0002\u0002\u014b\u014c\u0003\u0002\u0002\u0002\u014c\u0160\u0005\u0052\u002a\u0002\u014d\u014f\u0005\u006a\u0036\u0002\u014e\u014d\u0003\u0002\u0002\u0002\u014e\u014f\u0003\u0002\u0002\u0002\u014f\u0150\u0003\u0002\u0002\u0002\u0150\u0152\u0007\u0025\u0002\u0002\u0151\u0153\u0005\u0048\u0025\u0002\u0152\u0151\u0003\u0002\u0002\u0002\u0152\u0153\u0003\u0002\u0002\u0002\u0153\u0155\u0003\u0002\u0002\u0002\u0154\u0156\u0005\u002a\u0016\u0002\u0155\u0154\u0003\u0002\u0002\u0002\u0155\u0156\u0003\u0002\u0002\u0002\u0156\u0158\u0003\u0002\u0002\u0002\u0157\u0159\u0005\u0038\u001d\u0002\u0158\u0157\u0003\u0002\u0002\u0002\u0158\u0159\u0003\u0002\u0002\u0002\u0159\u015b\u0003\u0002\u0002\u0002\u015a\u015c\u0005\u0052\u002a\u0002\u015b\u015a\u0003\u0002\u0002\u0002\u015b\u015c\u0003\u0002\u0002\u0002\u015c\u015d\u0003\u0002\u0002\u0002\u015d\u015e\u0007\u0016\u0002\u0002\u015e\u0160\u0005\u0032\u001a\u0002\u015f\u0140\u0003\u0002\u0002\u0002\u015f\u014e\u0003\u0002\u0002\u0002\u0160\u0029\u0003\u0002\u0002\u0002\u0161\u0163\u0007\u001b\u0002\u0002\u0162\u0164\u0005\u002c\u0017\u0002\u0163\u0162\u0003\u0002\u0002\u0002\u0164\u0165\u0003\u0002\u0002\u0002\u0165\u0163\u0003\u0002\u0002\u0002\u0165\u0166\u0003\u0002\u0002\u0002\u0166\u0167\u0003\u0002\u0002\u0002\u0167\u0168\u0007\u001d\u0002\u0002\u0168\u002b\u0003\u0002\u0002\u0002\u0169\u016e\u0007\u0025\u0002\u0002\u016a\u016b\u0007\u0022\u0002\u0002\u016b\u016d\u0005\u0052\u002a\u0002\u016c\u016a\u0003\u0002\u0002\u0002\u016d\u0170\u0003\u0002\u0002\u0002\u016e\u016c\u0003\u0002\u0002\u0002\u016e\u016f\u0003\u0002\u0002\u0002\u016f\u002d\u0003\u0002\u0002\u0002\u0170\u016e\u0003\u0002\u0002\u0002\u0171\u0175\u0005\u0046\u0024\u0002\u0172\u0175\u0005\u0014\u000b\u0002\u0173\u0175\u0005\u001e\u0010\u0002\u0174\u0171\u0003\u0002\u0002\u0002\u0174\u0172\u0003\u0002\u0002\u0002\u0174\u0173\u0003\u0002\u0002\u0002\u0175\u002f\u0003\u0002\u0002\u0002\u0176\u0179\u0005\u0042\u0022\u0002\u0177\u0179\u0005\u0044\u0023\u0002\u0178\u0176\u0003\u0002\u0002\u0002\u0178\u0177\u0003\u0002\u0002\u0002\u0179\u0031\u0003\u0002\u0002\u0002\u017a\u017b\u0008\u001a\u0001\u0002\u017b\u019a\u0007\u0027\u0002\u0002\u017c\u019a\u0007\u0028\u0002\u0002\u017d\u019a\u0007\u0029\u0002\u0002\u017e\u019a\u0005\u006c\u0037\u0002\u017f\u0180\u0005\u0008\u0005\u0002\u0180\u0181\u0007\u0018\u0002\u0002\u0181\u0183\u0003\u0002\u0002\u0002\u0182\u017f\u0003\u0002\u0002\u0002\u0182\u0183\u0003\u0002\u0002\u0002\u0183\u0184\u0003\u0002\u0002\u0002\u0184\u019a\u0007\u0025\u0002\u0002\u0185\u0186\u0005\u0008\u0005\u0002\u0186\u0187\u0007\u0018\u0002\u0002\u0187\u0189\u0003\u0002\u0002\u0002\u0188\u0185\u0003\u0002\u0002\u0002\u0188\u0189\u0003\u0002\u0002\u0002\u0189\u018a\u0003\u0002\u0002\u0002\u018a\u019a\u0005\u004e\u0028\u0002\u018b\u018c\u0005\u0008\u0005\u0002\u018c\u018d\u0007\u0018\u0002\u0002\u018d\u018f\u0003\u0002\u0002\u0002\u018e\u018b\u0003\u0002\u0002\u0002\u018e\u018f\u0003\u0002\u0002\u0002\u018f\u0190\u0003\u0002\u0002\u0002\u0190\u019a\u0005\u0050\u0029\u0002\u0191\u0192\u0007\u0026\u0002\u0002\u0192\u019a\u0005\u0032\u001a\u0008\u0193\u019a\u0005\u000c\u0007\u0002\u0194\u019a\u0005\u004c\u0027\u0002\u0195\u0196\u0007\u0019\u0002\u0002\u0196\u0197\u0005\u0032\u001a\u0002\u0197\u0198\u0007\u001a\u0002\u0002\u0198\u019a\u0003\u0002\u0002\u0002\u0199\u017a\u0003\u0002\u0002\u0002\u0199\u017c\u0003\u0002\u0002\u0002\u0199\u017d\u0003\u0002\u0002\u0002\u0199\u017e\u0003\u0002\u0002\u0002\u0199\u0182\u0003\u0002\u0002\u0002\u0199\u0188\u0003\u0002\u0002\u0002\u0199\u018e\u0003\u0002\u0002\u0002\u0199\u0191\u0003\u0002\u0002\u0002\u0199\u0193\u0003\u0002\u0002\u0002\u0199\u0194\u0003\u0002\u0002\u0002\u0199\u0195\u0003\u0002\u0002\u0002\u019a\u01a7\u0003\u0002\u0002\u0002\u019b\u019c\u000c\u0009\u0002\u0002\u019c\u019d\u0007\u0026\u0002\u0002\u019d\u01a6\u0005\u0032\u001a\u000a\u019e\u019f\u000c\u0005\u0002\u0002\u019f\u01a0\u0007\u0023\u0002\u0002\u01a0\u01a6\u0005\u0032\u001a\u0006\u01a1\u01a2\u000c\u000a\u0002\u0002\u01a2\u01a6\u0005\u0040\u0021\u0002\u01a3\u01a4\u000c\u0003\u0002\u0002\u01a4\u01a6\u0005\u0034\u001b\u0002\u01a5\u019b\u0003\u0002\u0002\u0002\u01a5\u019e\u0003\u0002\u0002\u0002\u01a5\u01a1\u0003\u0002\u0002\u0002\u01a5\u01a3\u0003\u0002\u0002\u0002\u01a6\u01a9\u0003\u0002\u0002\u0002\u01a7\u01a5\u0003\u0002\u0002\u0002\u01a7\u01a8\u0003\u0002\u0002\u0002\u01a8\u0033\u0003\u0002\u0002\u0002\u01a9\u01a7\u0003\u0002\u0002\u0002\u01aa\u01ab\u0007\u0006\u0002\u0002\u01ab\u01ac\u0005\u0052\u002a\u0002\u01ac\u0035\u0003\u0002\u0002\u0002\u01ad\u01af\u0005\u006a\u0036\u0002\u01ae\u01ad\u0003\u0002\u0002\u0002\u01ae\u01af\u0003\u0002\u0002\u0002\u01af\u01b0\u0003\u0002\u0002\u0002\u01b0\u01b1\u0007\u0025\u0002\u0002\u01b1\u01b3\u0005\u0052\u002a\u0002\u01b2\u01b4\u0007\u0017\u0002\u0002\u01b3\u01b2\u0003\u0002\u0002\u0002\u01b3\u01b4\u0003\u0002\u0002\u0002\u01b4\u01b7\u0003\u0002\u0002\u0002\u01b5\u01b6\u0007\u0016\u0002\u0002\u01b6\u01b8\u0005\u0032\u001a\u0002\u01b7\u01b5\u0003\u0002\u0002\u0002\u01b7\u01b8\u0003\u0002\u0002\u0002\u01b8\u0037\u0003\u0002\u0002\u0002\u01b9\u01bd\u0007\u0019\u0002\u0002\u01ba\u01bc\u0005\u0036\u001c\u0002\u01bb\u01ba\u0003\u0002\u0002\u0002\u01bc\u01bf\u0003\u0002\u0002\u0002\u01bd\u01bb\u0003\u0002\u0002\u0002\u01bd\u01be\u0003\u0002\u0002\u0002\u01be\u01c0\u0003\u0002\u0002\u0002\u01bf\u01bd\u0003\u0002\u0002\u0002\u01c0\u01c1\u0007\u001a\u0002\u0002\u01c1\u0039\u0003\u0002\u0002\u0002\u01c2\u01c3\u0007\u0019\u0002\u0002\u01c3\u01c4\u0005\u0036\u001c\u0002\u01c4\u01c5\u0005\u0036\u001c\u0002\u01c5\u01c6\u0007\u001a\u0002\u0002\u01c6\u003b\u0003\u0002\u0002\u0002\u01c7\u01c8\u0007\u0019\u0002\u0002\u01c8\u01c9\u0005\u0036\u001c\u0002\u01c9\u01ca\u0007\u001a\u0002\u0002\u01ca\u003d\u0003\u0002\u0002\u0002\u01cb\u01cc\u0007\u0025\u0002\u0002\u01cc\u01ce\u0007\u0016\u0002\u0002\u01cd\u01cb\u0003\u0002\u0002\u0002\u01cd\u01ce\u0003\u0002\u0002\u0002\u01ce\u01cf\u0003\u0002\u0002\u0002\u01cf\u01dc\u0005\u0032\u001a\u0002\u01d0\u01d2\u0007\u0025\u0002\u0002\u01d1\u01d0\u0003\u0002\u0002\u0002\u01d1\u01d2\u0003\u0002\u0002\u0002\u01d2\u01d3\u0003\u0002\u0002\u0002\u01d3\u01d7\u0007\u001f\u0002\u0002\u01d4\u01d6\u0005\u0032\u001a\u0002\u01d5\u01d4\u0003\u0002\u0002\u0002\u01d6\u01d9\u0003\u0002\u0002\u0002\u01d7\u01d5\u0003\u0002\u0002\u0002\u01d7\u01d8\u0003\u0002\u0002\u0002\u01d8\u01da\u0003\u0002\u0002\u0002\u01d9\u01d7\u0003\u0002\u0002\u0002\u01da\u01dc\u0007\u0020\u0002\u0002\u01db\u01cd\u0003\u0002\u0002\u0002\u01db\u01d1\u0003\u0002\u0002\u0002\u01dc\u003f\u0003\u0002\u0002\u0002\u01dd\u01e1\u0007\u0019\u0002\u0002\u01de\u01e0\u0005\u003e\u0020\u0002\u01df\u01de\u0003\u0002\u0002\u0002\u01e0\u01e3\u0003\u0002\u0002\u0002\u01e1\u01df\u0003\u0002\u0002\u0002\u01e1\u01e2\u0003\u0002\u0002\u0002\u01e2\u01e4\u0003\u0002\u0002\u0002\u01e3\u01e1\u0003\u0002\u0002\u0002\u01e4\u01e5\u0007\u001a\u0002\u0002\u01e5\u0041\u0003\u0002\u0002\u0002\u01e6\u01e7\u0007\u0013\u0002\u0002\u01e7\u01e9\u0007\u0025\u0002\u0002\u01e8\u01ea\u0005\u0052\u002a\u0002\u01e9\u01e8\u0003\u0002\u0002\u0002\u01e9\u01ea\u0003\u0002\u0002\u0002\u01ea\u01eb\u0003\u0002\u0002\u0002\u01eb\u01ec\u0007\u0016\u0002\u0002\u01ec\u01ed\u0005\u0032\u001a\u0002\u01ed\u0043\u0003\u0002\u0002\u0002\u01ee\u01ef\u0007\u0012\u0002\u0002\u01ef\u01f1\u0007\u0025\u0002\u0002\u01f0\u01f2\u0005\u0052\u002a\u0002\u01f1\u01f0\u0003\u0002\u0002\u0002\u01f1\u01f2\u0003\u0002\u0002\u0002\u01f2\u01f3\u0003\u0002\u0002\u0002\u01f3\u01f4\u0007\u0016\u0002\u0002\u01f4\u01f5\u0005\u0032\u001a\u0002\u01f5\u0045\u0003\u0002\u0002\u0002\u01f6\u01f8\u0005\u006a\u0036\u0002\u01f7\u01f6\u0003\u0002\u0002\u0002\u01f7\u01f8\u0003\u0002\u0002\u0002\u01f8\u01f9\u0003\u0002\u0002\u0002\u01f9\u01fb\u0007\u0025\u0002\u0002\u01fa\u01fc\u0005\u0048\u0025\u0002\u01fb\u01fa\u0003\u0002\u0002\u0002\u01fb\u01fc\u0003\u0002\u0002\u0002\u01fc\u01fe\u0003\u0002\u0002\u0002\u01fd\u01ff\u0005\u002a\u0016\u0002\u01fe\u01fd\u0003\u0002\u0002\u0002\u01fe\u01ff\u0003\u0002\u0002\u0002\u01ff\u0201\u0003\u0002\u0002\u0002\u0200\u0202\u0005\u0038\u001d\u0002\u0201\u0200\u0003\u0002\u0002\u0002\u0201\u0202\u0003\u0002\u0002\u0002\u0202\u0204\u0003\u0002\u0002\u0002\u0203\u0205\u0005\u0052\u002a\u0002\u0204\u0203\u0003\u0002\u0002\u0002\u0204\u0205\u0003\u0002\u0002\u0002\u0205\u0206\u0003\u0002\u0002\u0002\u0206\u0207\u0007\u0016\u0002\u0002\u0207\u0253\u0005\u0032\u001a\u0002\u0208\u020a\u0005\u006a\u0036\u0002\u0209\u0208\u0003\u0002\u0002\u0002\u0209\u020a\u0003\u0002\u0002\u0002\u020a\u020b\u0003\u0002\u0002\u0002\u020b\u020d\u0005\u004e\u0028\u0002\u020c\u020e\u0005\u0048\u0025\u0002\u020d\u020c\u0003\u0002\u0002\u0002\u020d\u020e\u0003\u0002\u0002\u0002\u020e\u0210\u0003\u0002\u0002\u0002\u020f\u0211\u0005\u002a\u0016\u0002\u0210\u020f\u0003\u0002\u0002\u0002\u0210\u0211\u0003\u0002\u0002\u0002\u0211\u0212\u0003\u0002\u0002\u0002\u0212\u0214\u0005\u003a\u001e\u0002\u0213\u0215\u0005\u0052\u002a\u0002\u0214\u0213\u0003\u0002\u0002\u0002\u0214\u0215\u0003\u0002\u0002\u0002\u0215\u0216\u0003\u0002\u0002\u0002\u0216\u0217\u0007\u0016\u0002\u0002\u0217\u0218\u0005\u0032\u001a\u0002\u0218\u0253\u0003\u0002\u0002\u0002\u0219\u021b\u0005\u006a\u0036\u0002\u021a\u0219\u0003\u0002\u0002\u0002\u021a\u021b\u0003\u0002\u0002\u0002\u021b\u021c\u0003\u0002\u0002\u0002\u021c\u021e\u0005\u0050\u0029\u0002\u021d\u021f\u0005\u0048\u0025\u0002\u021e\u021d\u0003\u0002\u0002\u0002\u021e\u021f\u0003\u0002\u0002\u0002\u021f\u0221\u0003\u0002\u0002\u0002\u0220\u0222\u0005\u002a\u0016\u0002\u0221\u0220\u0003\u0002\u0002\u0002\u0221\u0222\u0003\u0002\u0002\u0002\u0222\u0223\u0003\u0002\u0002\u0002\u0223\u0225\u0005\u003c\u001f\u0002\u0224\u0226\u0005\u0052\u002a\u0002\u0225\u0224\u0003\u0002\u0002\u0002\u0225\u0226\u0003\u0002\u0002\u0002\u0226\u0227\u0003\u0002\u0002\u0002\u0227\u0228\u0007\u0016\u0002\u0002\u0228\u0229\u0005\u0032\u001a\u0002\u0229\u0253\u0003\u0002\u0002\u0002\u022a\u022c\u0005\u006a\u0036\u0002\u022b\u022a\u0003\u0002\u0002\u0002\u022b\u022c\u0003\u0002\u0002\u0002\u022c\u022d\u0003\u0002\u0002\u0002\u022d\u022f\u0007\u0025\u0002\u0002\u022e\u0230\u0005\u0048\u0025\u0002\u022f\u022e\u0003\u0002\u0002\u0002\u022f\u0230\u0003\u0002\u0002\u0002\u0230\u0232\u0003\u0002\u0002\u0002\u0231\u0233\u0005\u002a\u0016\u0002\u0232\u0231\u0003\u0002\u0002\u0002\u0232\u0233\u0003\u0002\u0002\u0002\u0233\u0235\u0003\u0002\u0002\u0002\u0234\u0236\u0005\u0038\u001d\u0002\u0235\u0234\u0003\u0002\u0002\u0002\u0235\u0236\u0003\u0002\u0002\u0002\u0236\u0237\u0003\u0002\u0002\u0002\u0237\u0253\u0005\u005a\u002e\u0002\u0238\u023a\u0005\u006a\u0036\u0002\u0239\u0238\u0003\u0002\u0002\u0002\u0239\u023a\u0003\u0002\u0002\u0002\u023a\u023b\u0003\u0002\u0002\u0002\u023b\u023d\u0005\u004e\u0028\u0002\u023c\u023e\u0005\u0048\u0025\u0002\u023d\u023c\u0003\u0002\u0002\u0002\u023d\u023e\u0003\u0002\u0002\u0002\u023e\u0240\u0003\u0002\u0002\u0002\u023f\u0241\u0005\u002a\u0016\u0002\u0240\u023f\u0003\u0002\u0002\u0002\u0240\u0241\u0003\u0002\u0002\u0002\u0241\u0242\u0003\u0002\u0002\u0002\u0242\u0243\u0005\u003a\u001e\u0002\u0243\u0244\u0005\u005a\u002e\u0002\u0244\u0253\u0003\u0002\u0002\u0002\u0245\u0247\u0005\u006a\u0036\u0002\u0246\u0245\u0003\u0002\u0002\u0002\u0246\u0247\u0003\u0002\u0002\u0002\u0247\u0248\u0003\u0002\u0002\u0002\u0248\u024a\u0005\u0050\u0029\u0002\u0249\u024b\u0005\u0048\u0025\u0002\u024a\u0249\u0003\u0002\u0002\u0002\u024a\u024b\u0003\u0002\u0002\u0002\u024b\u024d\u0003\u0002\u0002\u0002\u024c\u024e\u0005\u002a\u0016\u0002\u024d\u024c\u0003\u0002\u0002\u0002\u024d\u024e\u0003\u0002\u0002\u0002\u024e\u024f\u0003\u0002\u0002\u0002\u024f\u0250\u0005\u003c\u001f\u0002\u0250\u0251\u0005\u005a\u002e\u0002\u0251\u0253\u0003\u0002\u0002\u0002\u0252\u01f7\u0003\u0002\u0002\u0002\u0252\u0209\u0003\u0002\u0002\u0002\u0252\u021a\u0003\u0002\u0002\u0002\u0252\u022b\u0003\u0002\u0002\u0002\u0252\u0239\u0003\u0002\u0002\u0002\u0252\u0246\u0003\u0002\u0002\u0002\u0253\u0047\u0003\u0002\u0002\u0002\u0254\u0255\u0005\u006c\u0037\u0002\u0255\u0049\u0003\u0002\u0002\u0002\u0256\u025c\u0007\u0025\u0002\u0002\u0257\u0258\u0007\u0022\u0002\u0002\u0258\u025a\u0005\u0052\u002a\u0002\u0259\u025b\u0007\u0017\u0002\u0002\u025a\u0259\u0003\u0002\u0002\u0002\u025a\u025b\u0003\u0002\u0002\u0002\u025b\u025d\u0003\u0002\u0002\u0002\u025c\u0257\u0003\u0002\u0002\u0002\u025c\u025d\u0003\u0002\u0002\u0002\u025d\u0260\u0003\u0002\u0002\u0002\u025e\u025f\u0007\u0016\u0002\u0002\u025f\u0261\u0005\u0032\u001a\u0002\u0260\u025e\u0003\u0002\u0002\u0002\u0260\u0261\u0003\u0002\u0002\u0002\u0261\u004b\u0003\u0002\u0002\u0002\u0262\u0266\u0007\u001b\u0002\u0002\u0263\u0265\u0005\u004a\u0026\u0002\u0264\u0263\u0003\u0002\u0002\u0002\u0265\u0268\u0003\u0002\u0002\u0002\u0266\u0264\u0003\u0002\u0002\u0002\u0266\u0267\u0003\u0002\u0002\u0002\u0267\u0269\u0003\u0002\u0002\u0002\u0268\u0266\u0003\u0002\u0002\u0002\u0269\u026a\u0007\u001d\u0002\u0002\u026a\u026b\u0005\u0032\u001a\u0002\u026b\u004d\u0003\u0002\u0002\u0002\u026c\u026d\u0007\u001b\u0002\u0002\u026d\u026e\u0007\u0026\u0002\u0002\u026e\u026f\u0007\u001d\u0002\u0002\u026f\u004f\u0003\u0002\u0002\u0002\u0270\u0271\u0007\u001b\u0002\u0002\u0271\u0272\u0007\u0022\u0002\u0002\u0272\u0273\u0007\u0026\u0002\u0002\u0273\u0274\u0007\u001d\u0002\u0002\u0274\u0051\u0003\u0002\u0002\u0002\u0275\u0276\u0005\u0058\u002d\u0002\u0276\u0277\u0007\u0021\u0002\u0002\u0277\u0278\u0005\u0052\u002a\u0002\u0278\u027b\u0003\u0002\u0002\u0002\u0279\u027b\u0005\u0054\u002b\u0002\u027a\u0275\u0003\u0002\u0002\u0002\u027a\u0279\u0003\u0002\u0002\u0002\u027b\u0053\u0003\u0002\u0002\u0002\u027c\u027d\u0005\u0008\u0005\u0002\u027d\u027e\u0007\u0018\u0002\u0002\u027e\u0280\u0003\u0002\u0002\u0002\u027f\u027c\u0003\u0002\u0002\u0002\u027f\u0280\u0003\u0002\u0002\u0002\u0280\u0281\u0003\u0002\u0002\u0002\u0281\u028a\u0007\u0025\u0002\u0002\u0282\u0284\u0007\u0019\u0002\u0002\u0283\u0285\u0005\u0052\u002a\u0002\u0284\u0283\u0003\u0002\u0002\u0002\u0285\u0286\u0003\u0002\u0002\u0002\u0286\u0284\u0003\u0002\u0002\u0002\u0286\u0287\u0003\u0002\u0002\u0002\u0287\u0288\u0003\u0002\u0002\u0002\u0288\u0289\u0007\u001a\u0002\u0002\u0289\u028b\u0003\u0002\u0002\u0002\u028a\u0282\u0003\u0002\u0002\u0002\u028a\u028b\u0003\u0002\u0002\u0002\u028b\u0055\u0003\u0002\u0002\u0002\u028c\u028e\u0005\u0052\u002a\u0002\u028d\u028f\u0007\u0017\u0002\u0002\u028e\u028d\u0003\u0002\u0002\u0002\u028e\u028f\u0003\u0002\u0002\u0002\u028f\u0057\u0003\u0002\u0002\u0002\u0290\u0294\u0007\u0019\u0002\u0002\u0291\u0293\u0005\u0056\u002c\u0002\u0292\u0291\u0003\u0002\u0002\u0002\u0293\u0296\u0003\u0002\u0002\u0002\u0294\u0292\u0003\u0002\u0002\u0002\u0294\u0295\u0003\u0002\u0002\u0002\u0295\u0297\u0003\u0002\u0002\u0002\u0296\u0294\u0003\u0002\u0002\u0002\u0297\u0298\u0007\u001a\u0002\u0002\u0298\u0059\u0003\u0002\u0002\u0002\u0299\u029a\u0007\u000c\u0002\u0002\u029a\u029b\u0005\u0052\u002a\u0002\u029b\u029c\u0005\u005c\u002f\u0002\u029c\u02a0\u0003\u0002\u0002\u0002\u029d\u029e\u0007\u000b\u0002\u0002\u029e\u02a0\u0005\u0052\u002a\u0002\u029f\u0299\u0003\u0002\u0002\u0002\u029f\u029d\u0003\u0002\u0002\u0002\u02a0\u005b\u0003\u0002\u0002\u0002\u02a1\u02a5\u0007\u001f\u0002\u0002\u02a2\u02a4\u0005\u005e\u0030\u0002\u02a3\u02a2\u0003\u0002\u0002\u0002\u02a4\u02a7\u0003\u0002\u0002\u0002\u02a5\u02a3\u0003\u0002\u0002\u0002\u02a5\u02a6\u0003\u0002\u0002\u0002\u02a6\u02a8\u0003\u0002\u0002\u0002\u02a7\u02a5\u0003\u0002\u0002\u0002\u02a8\u02a9\u0007\u0020\u0002\u0002\u02a9\u005d\u0003\u0002\u0002\u0002\u02aa\u02ab\u0005\u0060\u0031\u0002\u02ab\u02ac\u0007\u002a\u0002\u0002\u02ac\u02b2\u0003\u0002\u0002\u0002\u02ad\u02ae\u0005\u0060\u0031\u0002\u02ae\u02af\u0007\u0022\u0002\u0002\u02af\u02b0\u0007\u0029\u0002\u0002\u02b0\u02b2\u0003\u0002\u0002\u0002\u02b1\u02aa\u0003\u0002\u0002\u0002\u02b1\u02ad\u0003\u0002\u0002\u0002\u02b2\u005f\u0003\u0002\u0002\u0002\u02b3\u02b4\u0007\u0025\u0002\u0002\u02b4\u0061\u0003\u0002\u0002\u0002\u02b5\u02b6\u0009\u0002\u0002\u0002\u02b6\u0063\u0003\u0002\u0002\u0002\u02b7\u02b8\u0007\u0025\u0002\u0002\u02b8\u02b9\u0005\u0052\u002a\u0002\u02b9\u0065\u0003\u0002\u0002\u0002\u02ba\u02bb\u0007\u0008\u0002\u0002\u02bb\u02c4\u0007\u0025\u0002\u0002\u02bc\u02c0\u0007\u0019\u0002\u0002\u02bd\u02bf\u0005\u0064\u0033\u0002\u02be\u02bd\u0003\u0002\u0002\u0002\u02bf\u02c2\u0003\u0002\u0002\u0002\u02c0\u02be\u0003\u0002\u0002\u0002\u02c0\u02c1\u0003\u0002\u0002\u0002\u02c1\u02c3\u0003\u0002\u0002\u0002\u02c2\u02c0\u0003\u0002\u0002\u0002\u02c3\u02c5\u0007\u001a\u0002\u0002\u02c4\u02bc\u0003\u0002\u0002\u0002\u02c4\u02c5\u0003\u0002\u0002\u0002\u02c5\u0067\u0003\u0002\u0002\u0002\u02c6\u02ca\u0007\u0025\u0002\u0002\u02c7\u02c9\u0005\u0062\u0032\u0002\u02c8\u02c7\u0003\u0002\u0002\u0002\u02c9\u02cc\u0003\u0002\u0002\u0002\u02ca\u02c8\u0003\u0002\u0002\u0002\u02ca\u02cb\u0003\u0002\u0002\u0002\u02cb\u02d7\u0003\u0002\u0002\u0002\u02cc\u02ca\u0003\u0002\u0002\u0002\u02cd\u02ce\u0007\u0025\u0002\u0002\u02ce\u02d2\u0007\u0019\u0002\u0002\u02cf\u02d1\u0005\u0062\u0032\u0002\u02d0\u02cf\u0003\u0002\u0002\u0002\u02d1\u02d4\u0003\u0002\u0002\u0002\u02d2\u02d0\u0003\u0002\u0002\u0002\u02d2\u02d3\u0003\u0002\u0002\u0002\u02d3\u02d5\u0003\u0002\u0002\u0002\u02d4\u02d2\u0003\u0002\u0002\u0002\u02d5\u02d7\u0007\u001a\u0002\u0002\u02d6\u02c6\u0003\u0002\u0002\u0002\u02d6\u02cd\u0003\u0002\u0002\u0002\u02d7\u0069\u0003\u0002\u0002\u0002\u02d8\u02d9\u0007\u001b\u0002\u0002\u02d9\u02dd\u0007\u0023\u0002\u0002\u02da\u02dc\u0005\u0068\u0035\u0002\u02db\u02da\u0003\u0002\u0002\u0002\u02dc\u02df\u0003\u0002\u0002\u0002\u02dd\u02db\u0003\u0002\u0002\u0002\u02dd\u02de\u0003\u0002\u0002\u0002\u02de\u02e0\u0003\u0002\u0002\u0002\u02df\u02dd\u0003\u0002\u0002\u0002\u02e0\u02e1\u0007\u0023\u0002\u0002\u02e1\u02e2\u0007\u001d\u0002\u0002\u02e2\u006b\u0003\u0002\u0002\u0002\u02e3\u02e4\u0007\u0024\u0002\u0002\u02e4\u02e5\u0007\u0025\u0002\u0002\u02e5\u006d\u0003\u0002\u0002\u0002\u0079\u006f\u0074\u007a\u007c\u0089\u0094\u009b\u00a4\u00a6\u00ac\u00af\u00b4\u00ba\u00bc\u00c4\u00c8\u00cc\u00ce\u00d4\u00d7\u00da\u00de\u00e1\u00e4\u00e7\u00ec\u00ef\u00f2\u00f6\u00f9\u00fc\u00ff\u0102\u0106\u010b\u010f\u0112\u0117\u011d\u011f\u0125\u0129\u012b\u0131\u0135\u0140\u0144\u0147\u014a\u014e\u0152\u0155\u0158\u015b\u015f\u0165\u016e\u0174\u0178\u0182\u0188\u018e\u0199\u01a5\u01a7\u01ae\u01b3\u01b7\u01bd\u01cd\u01d1\u01d7\u01db\u01e1\u01e9\u01f1\u01f7\u01fb\u01fe\u0201\u0204\u0209\u020d\u0210\u0214\u021a\u021e\u0221\u0225\u022b\u022f\u0232\u0235\u0239\u023d\u0240\u0246\u024a\u024d\u0252\u025a\u025c\u0260\u0266\u027a\u027f\u0286\u028a\u028e\u0294\u029f\u02a5\u02b1\u02c0\u02c4\u02ca\u02d2\u02d6\u02dd"

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
    private val NAMESPACE = Tokens.NAMESPACE.id
    private val OVERRIDE = Tokens.OVERRIDE.id
    private val INTERNAL = Tokens.INTERNAL.id
    private val IMPORT = Tokens.IMPORT.id
    private val RETURN = Tokens.RETURN.id
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
    private val LCOLONSQUARE = Tokens.LCOLONSQUARE.id
    private val RSQUARE = Tokens.RSQUARE.id
    private val RCOLONSQUARE = Tokens.RCOLONSQUARE.id
    private val LBRACE = Tokens.LBRACE.id
    private val RBRACE = Tokens.RBRACE.id
    private val ARROW = Tokens.ARROW.id
    private val TILDE = Tokens.TILDE.id
    private val COLON = Tokens.COLON.id
    private val DOUBLECOLON = Tokens.DOUBLECOLON.id
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
			this.state = 122
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ABSTRACT) or (1L shl ANNOTATION) or (1L shl Class) or (1L shl VAR) or (1L shl VAL) or (1L shl INTERFACE) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 120
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ABSTRACT , Class , INTERFACE , LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 117
				definition()
				}}
				VAR , VAL  ->  /*LL1AltBlock*/{if (true){
				this.state = 118
				field()
				}}
				ANNOTATION  ->  /*LL1AltBlock*/{if (true){
				this.state = 119
				annotationDef()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 124
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
			this.state = 125
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
			this.state = 127
			match(IMPORT) as Token
			this.state = 128
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
			this.state = 130
			match(ID) as Token
			this.state = 135
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 131
					match(DOT) as Token
					this.state = 132
					match(ID) as Token
					}
					} 
				}
				this.state = 137
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
			this.state = 138
			match(NAMESPACE) as Token
			this.state = 139
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
			this.state = 141
			match(DO) as Token
			this.state = 142
			match(LBRACE) as Token
			this.state = 146
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl RETURN) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl DOUBLECOLON) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 143
				compo()
				}
				}
				this.state = 148
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 149
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
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findReturning() : ReturningContext? = getRuleContext(solver.getType("ReturningContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  compo() : CompoContext {
		var _localctx : CompoContext = CompoContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_compo.id)
		try {
			this.state = 153
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			DO , LPAREN , LSQUARE , DOUBLECOLON , ID , OPID , Integer , Double , String  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 151
			value(0)
			}}
			RETURN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 152
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
			this.state = 155
			match(RETURN) as Token
			this.state = 156
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
			this.state = 158
			match(STATIC) as Token
			this.state = 159
			match(LBRACE) as Token
			this.state = 164
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ABSTRACT) or (1L shl Class) or (1L shl VAR) or (1L shl VAL) or (1L shl INTERFACE) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 162
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ABSTRACT , Class , INTERFACE , LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 160
				definition()
				}}
				VAR , VAL  ->  /*LL1AltBlock*/{if (true){
				this.state = 161
				field()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 166
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 167
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
		fun findClassBody() : ClassBodyContext? = getRuleContext(solver.getType("ClassBodyContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
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
		enterRule(_localctx, 18, Rules.RULE_class_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 170
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 169
				annotationBlock()
				}
			}

			this.state = 173
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ABSTRACT) {
				if (true){
				this.state = 172
				match(ABSTRACT) as Token
				}
			}

			this.state = 175
			match(Class) as Token
			this.state = 176
			match(ID) as Token
			this.state = 178
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 177
				typeParam()
				}
			}

			this.state = 186
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 180
				match(TILDE) as Token
				this.state = 182 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 181
					typeEx()
					}
					}
					this.state = 184 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( _la==LPAREN || _la==ID )
				}
			}

			this.state = 188
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
		fun findDefinitionInClass() : List<DefinitionInClassContext> = getRuleContexts(solver.getType("DefinitionInClassContext"))
		fun findDefinitionInClass(i: Int) : DefinitionInClassContext? = getRuleContext(solver.getType("DefinitionInClassContext"),i)
		fun findAbstractDefinitionInClass() : List<AbstractDefinitionInClassContext> = getRuleContexts(solver.getType("AbstractDefinitionInClassContext"))
		fun findAbstractDefinitionInClass(i: Int) : AbstractDefinitionInClassContext? = getRuleContext(solver.getType("AbstractDefinitionInClassContext"),i)
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
			this.state = 190
			match(LBRACE) as Token
			this.state = 194
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN) {
				if (true){
				if (true){
				this.state = 191
				constuctor()
				}
				}
				this.state = 196
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 198
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STATIC) {
				if (true){
				this.state = 197
				staticBlock()
				}
			}

			this.state = 204
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl OVERRIDE) or (1L shl INTERNAL) or (1L shl VAR) or (1L shl VAL) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 202
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,16,context) ) {
				1 -> {if (true){
				this.state = 200
				definitionInClass()
				}}
				2 -> {if (true){
				this.state = 201
				abstractDefinitionInClass()
				}}
				}
				}
				this.state = 206
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 207
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
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun INTERNAL() : TerminalNode? = getToken(FoldingParser.Tokens.INTERNAL.id, 0)
		fun OVERRIDE() : TerminalNode? = getToken(FoldingParser.Tokens.OVERRIDE.id, 0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findForeign() : ForeignContext? = getRuleContext(solver.getType("ForeignContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  definitionInClass() : DefinitionInClassContext {
		var _localctx : DefinitionInClassContext = DefinitionInClassContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_definitionInClass.id)
		var _la: Int
		try {
			this.state = 253
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,31,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 210
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 209
				annotationBlock()
				}
			}

			this.state = 213
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INTERNAL) {
				if (true){
				this.state = 212
				match(INTERNAL) as Token
				}
			}

			this.state = 216
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OVERRIDE) {
				if (true){
				this.state = 215
				match(OVERRIDE) as Token
				}
			}

			this.state = 218
			match(ID) as Token
			this.state = 220
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DOUBLECOLON) {
				if (true){
				this.state = 219
				compiledId()
				}
			}

			this.state = 223
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 222
				typeParam()
				}
			}

			this.state = 226
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,23,context) ) {
			1   -> if (true){
			this.state = 225
			parameter()
			}
			}
			this.state = 229
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 228
				typeEx()
				}
			}

			this.state = 231
			match(ASSGIN) as Token
			this.state = 232
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 234
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 233
				annotationBlock()
				}
			}

			this.state = 237
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INTERNAL) {
				if (true){
				this.state = 236
				match(INTERNAL) as Token
				}
			}

			this.state = 240
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OVERRIDE) {
				if (true){
				this.state = 239
				match(OVERRIDE) as Token
				}
			}

			this.state = 242
			match(ID) as Token
			this.state = 244
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DOUBLECOLON) {
				if (true){
				this.state = 243
				compiledId()
				}
			}

			this.state = 247
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 246
				typeParam()
				}
			}

			this.state = 250
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 249
				parameter()
				}
			}

			this.state = 252
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

	open class AbstractDefinitionInClassContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_abstractDefinitionInClass.id
	        set(value) { throw RuntimeException() }
		fun findFieldInInterface() : FieldInInterfaceContext? = getRuleContext(solver.getType("FieldInInterfaceContext"),0)
		fun findDefInInterface() : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),0)
		fun INTERNAL() : TerminalNode? = getToken(FoldingParser.Tokens.INTERNAL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  abstractDefinitionInClass() : AbstractDefinitionInClassContext {
		var _localctx : AbstractDefinitionInClassContext = AbstractDefinitionInClassContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_abstractDefinitionInClass.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 256
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INTERNAL) {
				if (true){
				this.state = 255
				match(INTERNAL) as Token
				}
			}

			this.state = 260
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,33,context) ) {
			1 -> {if (true){
			this.state = 258
			fieldInInterface()
			}}
			2 -> {if (true){
			this.state = 259
			defInInterface()
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
			this.state = 263 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 262
				parameter()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 265 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,34,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 269
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 267
				match(ASSGIN) as Token
				this.state = 268
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
		enterRule(_localctx, 28, Rules.RULE_interface_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 272
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 271
				annotationBlock()
				}
			}

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
					typeEx()
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
		fun findStaticBlock() : StaticBlockContext? = getRuleContext(solver.getType("StaticBlockContext"),0)
		fun findDefInInterface() : List<DefInInterfaceContext> = getRuleContexts(solver.getType("DefInInterfaceContext"))
		fun findDefInInterface(i: Int) : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),i)
		fun findFieldInInterface() : List<FieldInInterfaceContext> = getRuleContexts(solver.getType("FieldInInterfaceContext"))
		fun findFieldInInterface(i: Int) : FieldInInterfaceContext? = getRuleContext(solver.getType("FieldInInterfaceContext"),i)
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
			this.state = 289
			match(LBRACE) as Token
			this.state = 291
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STATIC) {
				if (true){
				this.state = 290
				staticBlock()
				}
			}

			this.state = 297
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl VAR) or (1L shl VAL) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 295
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,41,context) ) {
				1 -> {if (true){
				this.state = 293
				defInInterface()
				}}
				2 -> {if (true){
				this.state = 294
				fieldInInterface()
				}}
				}
				}
				this.state = 299
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 300
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

	open class FieldInInterfaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fieldInInterface.id
	        set(value) { throw RuntimeException() }
		fun findValInInterface() : ValInInterfaceContext? = getRuleContext(solver.getType("ValInInterfaceContext"),0)
		fun findVarInInterface() : VarInInterfaceContext? = getRuleContext(solver.getType("VarInInterfaceContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  fieldInInterface() : FieldInInterfaceContext {
		var _localctx : FieldInInterfaceContext = FieldInInterfaceContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_fieldInInterface.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 303
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 302
				annotationBlock()
				}
			}

			this.state = 307
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 305
			valInInterface()
			}}
			VAR  ->  /*LL1AltBlock*/{if (true){
			this.state = 306
			varInInterface()
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
			this.state = 309
			match(VAL) as Token
			this.state = 310
			match(ID) as Token
			this.state = 311
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
		enterRule(_localctx, 36, Rules.RULE_varInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 313
			match(VAR) as Token
			this.state = 314
			match(ID) as Token
			this.state = 315
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
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
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
			this.state = 349
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,54,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 318
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 317
				annotationBlock()
				}
			}

			this.state = 320
			match(ID) as Token
			this.state = 322
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DOUBLECOLON) {
				if (true){
				this.state = 321
				compiledId()
				}
			}

			this.state = 325
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 324
				typeParam()
				}
			}

			this.state = 328
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,48,context) ) {
			1   -> if (true){
			this.state = 327
			parameter()
			}
			}
			this.state = 330
			typeEx()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 332
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 331
				annotationBlock()
				}
			}

			this.state = 334
			match(ID) as Token
			this.state = 336
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DOUBLECOLON) {
				if (true){
				this.state = 335
				compiledId()
				}
			}

			this.state = 339
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 338
				typeParam()
				}
			}

			this.state = 342
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,52,context) ) {
			1   -> if (true){
			this.state = 341
			parameter()
			}
			}
			this.state = 345
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 344
				typeEx()
				}
			}

			this.state = 347
			match(ASSGIN) as Token
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
		enterRule(_localctx, 40, Rules.RULE_typeParam.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 351
			match(LSQUARE) as Token
			this.state = 353 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 352
				typeParamCompo()
				}
				}
				this.state = 355 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==ID )
			this.state = 357
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
		enterRule(_localctx, 42, Rules.RULE_typeParamCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 359
			match(ID) as Token
			this.state = 364
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TILDE) {
				if (true){
				if (true){
				this.state = 360
				match(TILDE) as Token
				this.state = 361
				typeEx()
				}
				}
				this.state = 366
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
		enterRule(_localctx, 44, Rules.RULE_definition.id)
		try {
			this.state = 370
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,57,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 367
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 368
			class_()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 369
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  field() : FieldContext {
		var _localctx : FieldContext = FieldContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_field.id)
		try {
			this.state = 374
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 372
			val_()
			}}
			VAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 373
			var_()
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
		var _startState : Int = 48
		enterRecursionRule(_localctx, 48, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 407
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,62,context) ) {
			1 -> {if (true){
			this.state = 377
			match(Integer) as Token
			}}
			2 -> {if (true){
			this.state = 378
			match(Double) as Token
			}}
			3 -> {if (true){
			this.state = 379
			match(String) as Token
			}}
			4 -> {if (true){
			this.state = 380
			literal()
			}}
			5 -> {if (true){
			this.state = 384
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,59,context) ) {
			1   -> if (true){
			this.state = 381
			package_()
			this.state = 382
			match(DOT) as Token
			}
			}
			this.state = 386
			match(ID) as Token
			}}
			6 -> {if (true){
			this.state = 390
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 387
				package_()
				this.state = 388
				match(DOT) as Token
				}
			}

			this.state = 392
			opIdWrap()
			}}
			7 -> {if (true){
			this.state = 396
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 393
				package_()
				this.state = 394
				match(DOT) as Token
				}
			}

			this.state = 398
			aopIdWrap()
			}}
			8 -> {if (true){
			this.state = 399
			match(OPID) as Token
			this.state = 400
			value(6)
			}}
			9 -> {if (true){
			this.state = 401
			doBlock()
			}}
			10 -> {if (true){
			this.state = 402
			lambda()
			}}
			11 -> {if (true){
			this.state = 403
			match(LPAREN) as Token
			this.state = 404
			value(0)
			this.state = 405
			match(RPAREN) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 421
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,64,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 419
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,63,context) ) {
					1 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 409
					if (!(precpred(context!!, 7))) throw FailedPredicateException(this, "precpred(context!!, 7)")
					this.state = 410
					match(OPID) as Token
					this.state = 411
					value(8)
					}}
					2 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 412
					if (!(precpred(context!!, 3))) throw FailedPredicateException(this, "precpred(context!!, 3)")
					this.state = 413
					match(COLON) as Token
					this.state = 414
					value(4)
					}}
					3 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 415
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 416
					argValue()
					}}
					4 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 417
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 418
					typeCasting()
					}}
					}
					} 
				}
				this.state = 423
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,64,context)
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
		enterRule(_localctx, 50, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 424
			match(AS) as Token
			this.state = 425
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
		enterRule(_localctx, 52, Rules.RULE_paramEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 428
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 427
				annotationBlock()
				}
			}

			this.state = 430
			match(ID) as Token
			this.state = 431
			typeEx()
			this.state = 433
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 432
				match(ELLIPSIS) as Token
				}
			}

			this.state = 437
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 435
				match(ASSGIN) as Token
				this.state = 436
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
		enterRule(_localctx, 54, Rules.RULE_parameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 439
			match(LPAREN) as Token
			this.state = 443
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 440
				paramEx()
				}
				}
				this.state = 445
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 446
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
		enterRule(_localctx, 56, Rules.RULE_opParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 448
			match(LPAREN) as Token
			this.state = 449
			paramEx()
			this.state = 450
			paramEx()
			this.state = 451
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
		enterRule(_localctx, 58, Rules.RULE_aopParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 453
			match(LPAREN) as Token
			this.state = 454
			paramEx()
			this.state = 455
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
		enterRule(_localctx, 60, Rules.RULE_argEx.id)
		var _la: Int
		try {
			this.state = 473
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,72,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 459
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,69,context) ) {
			1   -> if (true){
			this.state = 457
			match(ID) as Token
			this.state = 458
			match(ASSGIN) as Token
			}
			}
			this.state = 461
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 463
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 462
				match(ID) as Token
				}
			}

			this.state = 465
			match(LBRACE) as Token
			this.state = 469
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl DOUBLECOLON) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 466
				value(0)
				}
				}
				this.state = 471
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 472
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
		fun findArgEx() : List<ArgExContext> = getRuleContexts(solver.getType("ArgExContext"))
		fun findArgEx(i: Int) : ArgExContext? = getRuleContext(solver.getType("ArgExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  argValue() : ArgValueContext {
		var _localctx : ArgValueContext = ArgValueContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_argValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 475
			match(LPAREN) as Token
			this.state = 479
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl DOUBLECOLON) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 476
				argEx()
				}
				}
				this.state = 481
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 482
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
		enterRule(_localctx, 64, Rules.RULE_val_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 484
			match(VAL) as Token
			this.state = 485
			match(ID) as Token
			this.state = 487
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 486
				typeEx()
				}
			}

			this.state = 489
			match(ASSGIN) as Token
			this.state = 490
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
		enterRule(_localctx, 66, Rules.RULE_var_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 492
			match(VAR) as Token
			this.state = 493
			match(ID) as Token
			this.state = 495
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 494
				typeEx()
				}
			}

			this.state = 497
			match(ASSGIN) as Token
			this.state = 498
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
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findOpParameter() : OpParameterContext? = getRuleContext(solver.getType("OpParameterContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findAopParameter() : AopParameterContext? = getRuleContext(solver.getType("AopParameterContext"),0)
		fun findForeign() : ForeignContext? = getRuleContext(solver.getType("ForeignContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  def() : DefContext {
		var _localctx : DefContext = DefContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_def.id)
		var _la: Int
		try {
			this.state = 592
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,99,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 501
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 500
				annotationBlock()
				}
			}

			this.state = 503
			match(ID) as Token
			this.state = 505
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DOUBLECOLON) {
				if (true){
				this.state = 504
				compiledId()
				}
			}

			this.state = 508
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 507
				typeParam()
				}
			}

			this.state = 511
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,79,context) ) {
			1   -> if (true){
			this.state = 510
			parameter()
			}
			}
			this.state = 514
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 513
				typeEx()
				}
			}

			this.state = 516
			match(ASSGIN) as Token
			this.state = 517
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 519
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,81,context) ) {
			1   -> if (true){
			this.state = 518
			annotationBlock()
			}
			}
			this.state = 521
			opIdWrap()
			this.state = 523
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DOUBLECOLON) {
				if (true){
				this.state = 522
				compiledId()
				}
			}

			this.state = 526
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 525
				typeParam()
				}
			}

			this.state = 528
			opParameter()
			this.state = 530
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 529
				typeEx()
				}
			}

			this.state = 532
			match(ASSGIN) as Token
			this.state = 533
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 536
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,85,context) ) {
			1   -> if (true){
			this.state = 535
			annotationBlock()
			}
			}
			this.state = 538
			aopIdWrap()
			this.state = 540
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DOUBLECOLON) {
				if (true){
				this.state = 539
				compiledId()
				}
			}

			this.state = 543
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 542
				typeParam()
				}
			}

			this.state = 545
			aopParameter()
			this.state = 547
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 546
				typeEx()
				}
			}

			this.state = 549
			match(ASSGIN) as Token
			this.state = 550
			value(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 553
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 552
				annotationBlock()
				}
			}

			this.state = 555
			match(ID) as Token
			this.state = 557
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DOUBLECOLON) {
				if (true){
				this.state = 556
				compiledId()
				}
			}

			this.state = 560
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 559
				typeParam()
				}
			}

			this.state = 563
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 562
				parameter()
				}
			}

			this.state = 565
			foreign()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 567
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,93,context) ) {
			1   -> if (true){
			this.state = 566
			annotationBlock()
			}
			}
			this.state = 569
			opIdWrap()
			this.state = 571
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DOUBLECOLON) {
				if (true){
				this.state = 570
				compiledId()
				}
			}

			this.state = 574
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 573
				typeParam()
				}
			}

			this.state = 576
			opParameter()
			this.state = 577
			foreign()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 580
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,96,context) ) {
			1   -> if (true){
			this.state = 579
			annotationBlock()
			}
			}
			this.state = 582
			aopIdWrap()
			this.state = 584
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DOUBLECOLON) {
				if (true){
				this.state = 583
				compiledId()
				}
			}

			this.state = 587
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 586
				typeParam()
				}
			}

			this.state = 589
			aopParameter()
			this.state = 590
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
			this.state = 594
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
			this.state = 596
			match(ID) as Token
			this.state = 602
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 597
				match(TILDE) as Token
				this.state = 598
				typeEx()
				this.state = 600
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==ELLIPSIS) {
					if (true){
					this.state = 599
					match(ELLIPSIS) as Token
					}
				}

				}
			}

			this.state = 606
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 604
				match(ASSGIN) as Token
				this.state = 605
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
		enterRule(_localctx, 74, Rules.RULE_lambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 608
			match(LSQUARE) as Token
			this.state = 612
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 609
				lambdaParamEx()
				}
				}
				this.state = 614
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 615
			match(RSQUARE) as Token
			this.state = 616
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
			this.state = 618
			match(LSQUARE) as Token
			this.state = 619
			match(OPID) as Token
			this.state = 620
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
			this.state = 622
			match(LSQUARE) as Token
			this.state = 623
			match(TILDE) as Token
			this.state = 624
			match(OPID) as Token
			this.state = 625
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
			this.state = 632
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 627
			typeExParameter()
			this.state = 628
			match(ARROW) as Token
			this.state = 629
			typeEx()
			}}
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 631
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
			this.state = 637
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,105,context) ) {
			1   -> if (true){
			this.state = 634
			package_()
			this.state = 635
			match(DOT) as Token
			}
			}
			this.state = 639
			match(ID) as Token
			this.state = 648
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,107,context) ) {
			1   -> if (true){
			this.state = 640
			match(LPAREN) as Token
			this.state = 642 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 641
				typeEx()
				}
				}
				this.state = 644 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==LPAREN || _la==ID )
			this.state = 646
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
			this.state = 650
			typeEx()
			this.state = 652
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 651
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
			this.state = 654
			match(LPAREN) as Token
			this.state = 658
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN || _la==ID) {
				if (true){
				if (true){
				this.state = 655
				typeExParamEx()
				}
				}
				this.state = 660
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 661
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
			this.state = 669
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 663
			match(FOREIGN) as Token
			this.state = 664
			typeEx()
			this.state = 665
			foreignBody()
			}}
			EXTERNAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 667
			match(EXTERNAL) as Token
			this.state = 668
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
			this.state = 671
			match(LBRACE) as Token
			this.state = 675
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 672
				foreignElement()
				}
				}
				this.state = 677
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 678
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
			this.state = 687
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,112,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 680
			foreignPlatform()
			this.state = 681
			match(RawString) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 683
			foreignPlatform()
			this.state = 684
			match(TILDE) as Token
			this.state = 685
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
			this.state = 689
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
			this.state = 691
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
			this.state = 693
			match(ID) as Token
			this.state = 694
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
			this.state = 696
			match(ANNOTATION) as Token
			this.state = 697
			match(ID) as Token
			this.state = 706
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 698
				match(LPAREN) as Token
				this.state = 702
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==ID) {
					if (true){
					if (true){
					this.state = 699
					annoParam()
					}
					}
					this.state = 704
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				this.state = 705
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
			this.state = 724
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,117,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 708
			match(ID) as Token
			this.state = 712
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 709
				annoValue()
				}
				}
				this.state = 714
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 715
			match(ID) as Token
			this.state = 716
			match(LPAREN) as Token
			this.state = 720
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 717
				annoValue()
				}
				}
				this.state = 722
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 723
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
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun COLON() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLON.id)
		fun COLON(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLON.id, i) as TerminalNode
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
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
			this.state = 726
			match(LSQUARE) as Token
			this.state = 727
			match(COLON) as Token
			this.state = 731
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 728
				annotation()
				}
				}
				this.state = 733
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 734
			match(COLON) as Token
			this.state = 735
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

	open class LiteralContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_literal.id
	        set(value) { throw RuntimeException() }
		fun DOUBLECOLON() : TerminalNode? = getToken(FoldingParser.Tokens.DOUBLECOLON.id, 0)
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
			this.state = 737
			match(DOUBLECOLON) as Token
			this.state = 738
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
		24 -> return value_sempred(_localctx as ValueContext, predIndex)
		}
		return true
	}
	private fun value_sempred( _localctx : ValueContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 7)
		    1 -> return precpred(context!!, 3)
		    2 -> return precpred(context!!, 8)
		    3 -> return precpred(context!!, 1)
		}
		return true
	}

}