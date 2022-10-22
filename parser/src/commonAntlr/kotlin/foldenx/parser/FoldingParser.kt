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
                                                              FoldingParser.LambdaParamExContext::class,
                                                              FoldingParser.LambdaContext::class,
                                                              FoldingParser.OpIdWrapContext::class,
                                                              FoldingParser.AopIdWrapContext::class,
                                                              FoldingParser.TypeExContext::class,
                                                              FoldingParser.TypeExSingleContext::class,
                                                              FoldingParser.ForeignContext::class,
                                                              FoldingParser.ForeignBodyContext::class,
                                                              FoldingParser.ForeignElementContext::class,
                                                              FoldingParser.ForeignPlatformContext::class,
                                                              FoldingParser.AnnoValueContext::class,
                                                              FoldingParser.AnnoParamContext::class,
                                                              FoldingParser.AnnotationDefContext::class,
                                                              FoldingParser.AnnotationContext::class,
                                                              FoldingParser.AnnotationBlockContext::class)
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
        RSQUARE(26),
        LBRACE(27),
        RBRACE(28),
        ARROW(29),
        TILDE(30),
        COLON(31),
        ID(32),
        OPID(33),
        Integer(34),
        Double(35),
        String(36),
        RawString(37)
    }

    enum class Rules(val id: Int) {
        RULE_file(0),
        RULE_importEx(1),
        RULE_importVanila(2),
        RULE_importBody(3),
        RULE_importElement(4),
        RULE_package_(5),
        RULE_namespace(6),
        RULE_doBlock(7),
        RULE_compo(8),
        RULE_returning(9),
        RULE_staticBlock(10),
        RULE_class_(11),
        RULE_classBody(12),
        RULE_definitionInClass(13),
        RULE_abstractDefinitionInClass(14),
        RULE_constuctor(15),
        RULE_interface_(16),
        RULE_interfaceBody(17),
        RULE_fieldInInterface(18),
        RULE_valInInterface(19),
        RULE_varInInterface(20),
        RULE_defInInterface(21),
        RULE_typeParam(22),
        RULE_typeParamCompo(23),
        RULE_definition(24),
        RULE_field(25),
        RULE_value(26),
        RULE_typeCasting(27),
        RULE_paramEx(28),
        RULE_parameter(29),
        RULE_opParameter(30),
        RULE_aopParameter(31),
        RULE_argEx(32),
        RULE_argValue(33),
        RULE_val_(34),
        RULE_var_(35),
        RULE_def(36),
        RULE_lambdaParamEx(37),
        RULE_lambda(38),
        RULE_opIdWrap(39),
        RULE_aopIdWrap(40),
        RULE_typeEx(41),
        RULE_typeExSingle(42),
        RULE_foreign(43),
        RULE_foreignBody(44),
        RULE_foreignElement(45),
        RULE_foreignPlatform(46),
        RULE_annoValue(47),
        RULE_annoParam(48),
        RULE_annotationDef(49),
        RULE_annotation(50),
        RULE_annotationBlock(51)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "importEx", "importVanila", "importBody", 
                                "importElement", "package_", "namespace", 
                                "doBlock", "compo", "returning", "staticBlock", 
                                "class_", "classBody", "definitionInClass", 
                                "abstractDefinitionInClass", "constuctor", 
                                "interface_", "interfaceBody", "fieldInInterface", 
                                "valInInterface", "varInInterface", "defInInterface", 
                                "typeParam", "typeParamCompo", "definition", 
                                "field", "value", "typeCasting", "paramEx", 
                                "parameter", "opParameter", "aopParameter", 
                                "argEx", "argValue", "val_", "var_", "def", 
                                "lambdaParamEx", "lambda", "opIdWrap", "aopIdWrap", 
                                "typeEx", "typeExSingle", "foreign", "foreignBody", 
                                "foreignElement", "foreignPlatform", "annoValue", 
                                "annoParam", "annotationDef", "annotation", 
                                "annotationBlock")

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
                                                          "']'", "'{'", 
                                                          "'}'", "'->'", 
                                                          "'~'", "':'")
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
                                                           "RSQUARE", "LBRACE", 
                                                           "RBRACE", "ARROW", 
                                                           "TILDE", "COLON", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0027\u033c\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0003\u0002\u0005\u0002\u006c\u000a\u0002\u0003\u0002\u0007\u0002\u006f\u000a\u0002\u000c\u0002\u000e\u0002\u0072\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u0077\u000a\u0002\u000c\u0002\u000e\u0002\u007a\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u0081\u000a\u0004\u0003\u0005\u0003\u0005\u0007\u0005\u0085\u000a\u0005\u000c\u0005\u000e\u0005\u0088\u000b\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u008f\u000a\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u0094\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u0099\u000a\u0007\u000c\u0007\u000e\u0007\u009c\u000b\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u00a4\u000a\u0009\u000c\u0009\u000e\u0009\u00a7\u000b\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u00ae\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00b7\u000a\u000c\u000c\u000c\u000e\u000c\u00ba\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0005\u000d\u00bf\u000a\u000d\u0003\u000d\u0005\u000d\u00c2\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00c7\u000a\u000d\u0003\u000d\u0003\u000d\u0006\u000d\u00cb\u000a\u000d\u000d\u000d\u000e\u000d\u00cc\u0005\u000d\u00cf\u000a\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0007\u000e\u00d5\u000a\u000e\u000c\u000e\u000e\u000e\u00d8\u000b\u000e\u0003\u000e\u0005\u000e\u00db\u000a\u000e\u0003\u000e\u0003\u000e\u0007\u000e\u00df\u000a\u000e\u000c\u000e\u000e\u000e\u00e2\u000b\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0005\u000f\u00e7\u000a\u000f\u0003\u000f\u0005\u000f\u00ea\u000a\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0005\u0010\u00ef\u000a\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u00f3\u000a\u0010\u0003\u0011\u0006\u0011\u00f6\u000a\u0011\u000d\u0011\u000e\u0011\u00f7\u0003\u0011\u0003\u0011\u0005\u0011\u00fc\u000a\u0011\u0003\u0012\u0005\u0012\u00ff\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0104\u000a\u0012\u0003\u0012\u0003\u0012\u0006\u0012\u0108\u000a\u0012\u000d\u0012\u000e\u0012\u0109\u0005\u0012\u010c\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0005\u0013\u0112\u000a\u0013\u0003\u0013\u0003\u0013\u0007\u0013\u0116\u000a\u0013\u000c\u0013\u000e\u0013\u0119\u000b\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0005\u0014\u011e\u000a\u0014\u0003\u0014\u0003\u0014\u0005\u0014\u0122\u000a\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0005\u0017\u012d\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0131\u000a\u0017\u0003\u0017\u0007\u0017\u0134\u000a\u0017\u000c\u0017\u000e\u0017\u0137\u000b\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u013b\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u013f\u000a\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0145\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0149\u000a\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u014f\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0153\u000a\u0017\u0003\u0017\u0007\u0017\u0156\u000a\u0017\u000c\u0017\u000e\u0017\u0159\u000b\u0017\u0003\u0017\u0005\u0017\u015c\u000a\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0161\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0165\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0169\u000a\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u016f\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0173\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0177\u000a\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u017c\u000a\u0017\u0003\u0018\u0003\u0018\u0006\u0018\u0180\u000a\u0018\u000d\u0018\u000e\u0018\u0181\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0007\u0019\u0189\u000a\u0019\u000c\u0019\u000e\u0019\u018c\u000b\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0005\u001a\u0191\u000a\u001a\u0003\u001b\u0003\u001b\u0005\u001b\u0195\u000a\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u019b\u000a\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u019f\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01a6\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01ad\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01b4\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01bb\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01c3\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01c8\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01cf\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01d4\u000a\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01d8\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01dd\u000a\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01e1\u000a\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01e5\u000a\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01e9\u000a\u001c\u0005\u001c\u01eb\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01f0\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01f6\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01fc\u000a\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u0202\u000a\u001c\u0007\u001c\u0204\u000a\u001c\u000c\u001c\u000e\u001c\u0207\u000b\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0005\u001e\u020d\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u0212\u000a\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u0216\u000a\u001e\u0003\u001f\u0003\u001f\u0007\u001f\u021a\u000a\u001f\u000c\u001f\u000e\u001f\u021d\u000b\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0005\u0022\u022c\u000a\u0022\u0003\u0022\u0003\u0022\u0005\u0022\u0230\u000a\u0022\u0003\u0022\u0003\u0022\u0007\u0022\u0234\u000a\u0022\u000c\u0022\u000e\u0022\u0237\u000b\u0022\u0003\u0022\u0005\u0022\u023a\u000a\u0022\u0003\u0023\u0003\u0023\u0007\u0023\u023e\u000a\u0023\u000c\u0023\u000e\u0023\u0241\u000b\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0248\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0250\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0026\u0005\u0026\u0256\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u025a\u000a\u0026\u0003\u0026\u0007\u0026\u025d\u000a\u0026\u000c\u0026\u000e\u0026\u0260\u000b\u0026\u0003\u0026\u0005\u0026\u0263\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0268\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u026c\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0270\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0276\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u027a\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u027e\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0284\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0288\u000a\u0026\u0003\u0026\u0007\u0026\u028b\u000a\u0026\u000c\u0026\u000e\u0026\u028e\u000b\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0292\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0296\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u029c\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u02a0\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u02a5\u000a\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u02ab\u000a\u0027\u0005\u0027\u02ad\u000a\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u02b1\u000a\u0027\u0003\u0028\u0003\u0028\u0007\u0028\u02b5\u000a\u0028\u000c\u0028\u000e\u0028\u02b8\u000b\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u02d8\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0007\u002b\u02dd\u000a\u002b\u000c\u002b\u000e\u002b\u02e0\u000b\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0005\u002c\u02e5\u000a\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0006\u002c\u02ea\u000a\u002c\u000d\u002c\u000e\u002c\u02eb\u0003\u002c\u0003\u002c\u0005\u002c\u02f0\u000a\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0005\u002d\u02f8\u000a\u002d\u0003\u002e\u0003\u002e\u0007\u002e\u02fc\u000a\u002e\u000c\u002e\u000e\u002e\u02ff\u000b\u002e\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0005\u002f\u030a\u000a\u002f\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0007\u0033\u0317\u000a\u0033\u000c\u0033\u000e\u0033\u031a\u000b\u0033\u0003\u0033\u0005\u0033\u031d\u000a\u0033\u0003\u0034\u0003\u0034\u0007\u0034\u0321\u000a\u0034\u000c\u0034\u000e\u0034\u0324\u000b\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0007\u0034\u0329\u000a\u0034\u000c\u0034\u000e\u0034\u032c\u000b\u0034\u0003\u0034\u0005\u0034\u032f\u000a\u0034\u0003\u0035\u0003\u0035\u0003\u0035\u0007\u0035\u0334\u000a\u0035\u000c\u0035\u000e\u0035\u0337\u000b\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0002\u0004\u0036\u0054\u0036\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u0002\u0003\u0003\u0002\u0024\u0026\u0002\u03a4\u0002\u006b\u0003\u0002\u0002\u0002\u0004\u007b\u0003\u0002\u0002\u0002\u0006\u007d\u0003\u0002\u0002\u0002\u0008\u0082\u0003\u0002\u0002\u0002\u000a\u008e\u0003\u0002\u0002\u0002\u000c\u0095\u0003\u0002\u0002\u0002\u000e\u009d\u0003\u0002\u0002\u0002\u0010\u00a0\u0003\u0002\u0002\u0002\u0012\u00ad\u0003\u0002\u0002\u0002\u0014\u00af\u0003\u0002\u0002\u0002\u0016\u00b2\u0003\u0002\u0002\u0002\u0018\u00be\u0003\u0002\u0002\u0002\u001a\u00d2\u0003\u0002\u0002\u0002\u001c\u00e6\u0003\u0002\u0002\u0002\u001e\u00ee\u0003\u0002\u0002\u0002\u0020\u00f5\u0003\u0002\u0002\u0002\u0022\u00fe\u0003\u0002\u0002\u0002\u0024\u010f\u0003\u0002\u0002\u0002\u0026\u011d\u0003\u0002\u0002\u0002\u0028\u0123\u0003\u0002\u0002\u0002\u002a\u0127\u0003\u0002\u0002\u0002\u002c\u017b\u0003\u0002\u0002\u0002\u002e\u017d\u0003\u0002\u0002\u0002\u0030\u0185\u0003\u0002\u0002\u0002\u0032\u0190\u0003\u0002\u0002\u0002\u0034\u0194\u0003\u0002\u0002\u0002\u0036\u01ea\u0003\u0002\u0002\u0002\u0038\u0208\u0003\u0002\u0002\u0002\u003a\u020c\u0003\u0002\u0002\u0002\u003c\u0217\u0003\u0002\u0002\u0002\u003e\u0220\u0003\u0002\u0002\u0002\u0040\u0225\u0003\u0002\u0002\u0002\u0042\u0239\u0003\u0002\u0002\u0002\u0044\u023b\u0003\u0002\u0002\u0002\u0046\u0244\u0003\u0002\u0002\u0002\u0048\u024c\u0003\u0002\u0002\u0002\u004a\u02a4\u0003\u0002\u0002\u0002\u004c\u02a6\u0003\u0002\u0002\u0002\u004e\u02b2\u0003\u0002\u0002\u0002\u0050\u02bc\u0003\u0002\u0002\u0002\u0052\u02c0\u0003\u0002\u0002\u0002\u0054\u02d7\u0003\u0002\u0002\u0002\u0056\u02e4\u0003\u0002\u0002\u0002\u0058\u02f7\u0003\u0002\u0002\u0002\u005a\u02f9\u0003\u0002\u0002\u0002\u005c\u0309\u0003\u0002\u0002\u0002\u005e\u030b\u0003\u0002\u0002\u0002\u0060\u030d\u0003\u0002\u0002\u0002\u0062\u030f\u0003\u0002\u0002\u0002\u0064\u0312\u0003\u0002\u0002\u0002\u0066\u032e\u0003\u0002\u0002\u0002\u0068\u0330\u0003\u0002\u0002\u0002\u006a\u006c\u0005\u000e\u0008\u0002\u006b\u006a\u0003\u0002\u0002\u0002\u006b\u006c\u0003\u0002\u0002\u0002\u006c\u0070\u0003\u0002\u0002\u0002\u006d\u006f\u0005\u0004\u0003\u0002\u006e\u006d\u0003\u0002\u0002\u0002\u006f\u0072\u0003\u0002\u0002\u0002\u0070\u006e\u0003\u0002\u0002\u0002\u0070\u0071\u0003\u0002\u0002\u0002\u0071\u0078\u0003\u0002\u0002\u0002\u0072\u0070\u0003\u0002\u0002\u0002\u0073\u0077\u0005\u0032\u001a\u0002\u0074\u0077\u0005\u0034\u001b\u0002\u0075\u0077\u0005\u0064\u0033\u0002\u0076\u0073\u0003\u0002\u0002\u0002\u0076\u0074\u0003\u0002\u0002\u0002\u0076\u0075\u0003\u0002\u0002\u0002\u0077\u007a\u0003\u0002\u0002\u0002\u0078\u0076\u0003\u0002\u0002\u0002\u0078\u0079\u0003\u0002\u0002\u0002\u0079\u0003\u0003\u0002\u0002\u0002\u007a\u0078\u0003\u0002\u0002\u0002\u007b\u007c\u0005\u0006\u0004\u0002\u007c\u0005\u0003\u0002\u0002\u0002\u007d\u007e\u0007\u0010\u0002\u0002\u007e\u0080\u0005\u000c\u0007\u0002\u007f\u0081\u0005\u0008\u0005\u0002\u0080\u007f\u0003\u0002\u0002\u0002\u0080\u0081\u0003\u0002\u0002\u0002\u0081\u0007\u0003\u0002\u0002\u0002\u0082\u0086\u0007\u001d\u0002\u0002\u0083\u0085\u0005\u000a\u0006\u0002\u0084\u0083\u0003\u0002\u0002\u0002\u0085\u0088\u0003\u0002\u0002\u0002\u0086\u0084\u0003\u0002\u0002\u0002\u0086\u0087\u0003\u0002\u0002\u0002\u0087\u0089\u0003\u0002\u0002\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0089\u008a\u0007\u001e\u0002\u0002\u008a\u0009\u0003\u0002\u0002\u0002\u008b\u008c\u0005\u000c\u0007\u0002\u008c\u008d\u0007\u0018\u0002\u0002\u008d\u008f\u0003\u0002\u0002\u0002\u008e\u008b\u0003\u0002\u0002\u0002\u008e\u008f\u0003\u0002\u0002\u0002\u008f\u0093\u0003\u0002\u0002\u0002\u0090\u0094\u0007\u0022\u0002\u0002\u0091\u0094\u0005\u0050\u0029\u0002\u0092\u0094\u0005\u0052\u002a\u0002\u0093\u0090\u0003\u0002\u0002\u0002\u0093\u0091\u0003\u0002\u0002\u0002\u0093\u0092\u0003\u0002\u0002\u0002\u0094\u000b\u0003\u0002\u0002\u0002\u0095\u009a\u0007\u0022\u0002\u0002\u0096\u0097\u0007\u0018\u0002\u0002\u0097\u0099\u0007\u0022\u0002\u0002\u0098\u0096\u0003\u0002\u0002\u0002\u0099\u009c\u0003\u0002\u0002\u0002\u009a\u0098\u0003\u0002\u0002\u0002\u009a\u009b\u0003\u0002\u0002\u0002\u009b\u000d\u0003\u0002\u0002\u0002\u009c\u009a\u0003\u0002\u0002\u0002\u009d\u009e\u0007\u000d\u0002\u0002\u009e\u009f\u0005\u000c\u0007\u0002\u009f\u000f\u0003\u0002\u0002\u0002\u00a0\u00a1\u0007\u000a\u0002\u0002\u00a1\u00a5\u0007\u001d\u0002\u0002\u00a2\u00a4\u0005\u0012\u000a\u0002\u00a3\u00a2\u0003\u0002\u0002\u0002\u00a4\u00a7\u0003\u0002\u0002\u0002\u00a5\u00a3\u0003\u0002\u0002\u0002\u00a5\u00a6\u0003\u0002\u0002\u0002\u00a6\u00a8\u0003\u0002\u0002\u0002\u00a7\u00a5\u0003\u0002\u0002\u0002\u00a8\u00a9\u0007\u001e\u0002\u0002\u00a9\u0011\u0003\u0002\u0002\u0002\u00aa\u00ae\u0005\u004a\u0026\u0002\u00ab\u00ae\u0005\u0036\u001c\u0002\u00ac\u00ae\u0005\u0014\u000b\u0002\u00ad\u00aa\u0003\u0002\u0002\u0002\u00ad\u00ab\u0003\u0002\u0002\u0002\u00ad\u00ac\u0003\u0002\u0002\u0002\u00ae\u0013\u0003\u0002\u0002\u0002\u00af\u00b0\u0007\u0011\u0002\u0002\u00b0\u00b1\u0005\u0036\u001c\u0002\u00b1\u0015\u0003\u0002\u0002\u0002\u00b2\u00b3\u0007\u0014\u0002\u0002\u00b3\u00b8\u0007\u001d\u0002\u0002\u00b4\u00b7\u0005\u0032\u001a\u0002\u00b5\u00b7\u0005\u0034\u001b\u0002\u00b6\u00b4\u0003\u0002\u0002\u0002\u00b6\u00b5\u0003\u0002\u0002\u0002\u00b7\u00ba\u0003\u0002\u0002\u0002\u00b8\u00b6\u0003\u0002\u0002\u0002\u00b8\u00b9\u0003\u0002\u0002\u0002\u00b9\u00bb\u0003\u0002\u0002\u0002\u00ba\u00b8\u0003\u0002\u0002\u0002\u00bb\u00bc\u0007\u001e\u0002\u0002\u00bc\u0017\u0003\u0002\u0002\u0002\u00bd\u00bf\u0005\u0068\u0035\u0002\u00be\u00bd\u0003\u0002\u0002\u0002\u00be\u00bf\u0003\u0002\u0002\u0002\u00bf\u00c1\u0003\u0002\u0002\u0002\u00c0\u00c2\u0007\u0007\u0002\u0002\u00c1\u00c0\u0003\u0002\u0002\u0002\u00c1\u00c2\u0003\u0002\u0002\u0002\u00c2\u00c3\u0003\u0002\u0002\u0002\u00c3\u00c4\u0007\u0009\u0002\u0002\u00c4\u00c6\u0007\u0022\u0002\u0002\u00c5\u00c7\u0005\u002e\u0018\u0002\u00c6\u00c5\u0003\u0002\u0002\u0002\u00c6\u00c7\u0003\u0002\u0002\u0002\u00c7\u00ce\u0003\u0002\u0002\u0002\u00c8\u00ca\u0007\u0020\u0002\u0002\u00c9\u00cb\u0005\u0054\u002b\u0002\u00ca\u00c9\u0003\u0002\u0002\u0002\u00cb\u00cc\u0003\u0002\u0002\u0002\u00cc\u00ca\u0003\u0002\u0002\u0002\u00cc\u00cd\u0003\u0002\u0002\u0002\u00cd\u00cf\u0003\u0002\u0002\u0002\u00ce\u00c8\u0003\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00cf\u00d0\u0003\u0002\u0002\u0002\u00d0\u00d1\u0005\u001a\u000e\u0002\u00d1\u0019\u0003\u0002\u0002\u0002\u00d2\u00d6\u0007\u001d\u0002\u0002\u00d3\u00d5\u0005\u0020\u0011\u0002\u00d4\u00d3\u0003\u0002\u0002\u0002\u00d5\u00d8\u0003\u0002\u0002\u0002\u00d6\u00d4\u0003\u0002\u0002\u0002\u00d6\u00d7\u0003\u0002\u0002\u0002\u00d7\u00da\u0003\u0002\u0002\u0002\u00d8\u00d6\u0003\u0002\u0002\u0002\u00d9\u00db\u0005\u0016\u000c\u0002\u00da\u00d9\u0003\u0002\u0002\u0002\u00da\u00db\u0003\u0002\u0002\u0002\u00db\u00e0\u0003\u0002\u0002\u0002\u00dc\u00df\u0005\u001c\u000f\u0002\u00dd\u00df\u0005\u001e\u0010\u0002\u00de\u00dc\u0003\u0002\u0002\u0002\u00de\u00dd\u0003\u0002\u0002\u0002\u00df\u00e2\u0003\u0002\u0002\u0002\u00e0\u00de\u0003\u0002\u0002\u0002\u00e0\u00e1\u0003\u0002\u0002\u0002\u00e1\u00e3\u0003\u0002\u0002\u0002\u00e2\u00e0\u0003\u0002\u0002\u0002\u00e3\u00e4\u0007\u001e\u0002\u0002\u00e4\u001b\u0003\u0002\u0002\u0002\u00e5\u00e7\u0007\u000f\u0002\u0002\u00e6\u00e5\u0003\u0002\u0002\u0002\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u00e9\u0003\u0002\u0002\u0002\u00e8\u00ea\u0007\u000e\u0002\u0002\u00e9\u00e8\u0003\u0002\u0002\u0002\u00e9\u00ea\u0003\u0002\u0002\u0002\u00ea\u00eb\u0003\u0002\u0002\u0002\u00eb\u00ec\u0005\u004a\u0026\u0002\u00ec\u001d\u0003\u0002\u0002\u0002\u00ed\u00ef\u0007\u000f\u0002\u0002\u00ee\u00ed\u0003\u0002\u0002\u0002\u00ee\u00ef\u0003\u0002\u0002\u0002\u00ef\u00f2\u0003\u0002\u0002\u0002\u00f0\u00f3\u0005\u0026\u0014\u0002\u00f1\u00f3\u0005\u002c\u0017\u0002\u00f2\u00f0\u0003\u0002\u0002\u0002\u00f2\u00f1\u0003\u0002\u0002\u0002\u00f3\u001f\u0003\u0002\u0002\u0002\u00f4\u00f6\u0005\u003c\u001f\u0002\u00f5\u00f4\u0003\u0002\u0002\u0002\u00f6\u00f7\u0003\u0002\u0002\u0002\u00f7\u00f5\u0003\u0002\u0002\u0002\u00f7\u00f8\u0003\u0002\u0002\u0002\u00f8\u00fb\u0003\u0002\u0002\u0002\u00f9\u00fa\u0007\u0016\u0002\u0002\u00fa\u00fc\u0005\u0036\u001c\u0002\u00fb\u00f9\u0003\u0002\u0002\u0002\u00fb\u00fc\u0003\u0002\u0002\u0002\u00fc\u0021\u0003\u0002\u0002\u0002\u00fd\u00ff\u0005\u0068\u0035\u0002\u00fe\u00fd\u0003\u0002\u0002\u0002\u00fe\u00ff\u0003\u0002\u0002\u0002\u00ff\u0100\u0003\u0002\u0002\u0002\u0100\u0101\u0007\u0015\u0002\u0002\u0101\u0103\u0007\u0022\u0002\u0002\u0102\u0104\u0005\u002e\u0018\u0002\u0103\u0102\u0003\u0002\u0002\u0002\u0103\u0104\u0003\u0002\u0002\u0002\u0104\u010b\u0003\u0002\u0002\u0002\u0105\u0107\u0007\u0020\u0002\u0002\u0106\u0108\u0005\u0054\u002b\u0002\u0107\u0106\u0003\u0002\u0002\u0002\u0108\u0109\u0003\u0002\u0002\u0002\u0109\u0107\u0003\u0002\u0002\u0002\u0109\u010a\u0003\u0002\u0002\u0002\u010a\u010c\u0003\u0002\u0002\u0002\u010b\u0105\u0003\u0002\u0002\u0002\u010b\u010c\u0003\u0002\u0002\u0002\u010c\u010d\u0003\u0002\u0002\u0002\u010d\u010e\u0005\u0024\u0013\u0002\u010e\u0023\u0003\u0002\u0002\u0002\u010f\u0111\u0007\u001d\u0002\u0002\u0110\u0112\u0005\u0016\u000c\u0002\u0111\u0110\u0003\u0002\u0002\u0002\u0111\u0112\u0003\u0002\u0002\u0002\u0112\u0117\u0003\u0002\u0002\u0002\u0113\u0116\u0005\u002c\u0017\u0002\u0114\u0116\u0005\u0026\u0014\u0002\u0115\u0113\u0003\u0002\u0002\u0002\u0115\u0114\u0003\u0002\u0002\u0002\u0116\u0119\u0003\u0002\u0002\u0002\u0117\u0115\u0003\u0002\u0002\u0002\u0117\u0118\u0003\u0002\u0002\u0002\u0118\u011a\u0003\u0002\u0002\u0002\u0119\u0117\u0003\u0002\u0002\u0002\u011a\u011b\u0007\u001e\u0002\u0002\u011b\u0025\u0003\u0002\u0002\u0002\u011c\u011e\u0005\u0068\u0035\u0002\u011d\u011c\u0003\u0002\u0002\u0002\u011d\u011e\u0003\u0002\u0002\u0002\u011e\u0121\u0003\u0002\u0002\u0002\u011f\u0122\u0005\u0028\u0015\u0002\u0120\u0122\u0005\u002a\u0016\u0002\u0121\u011f\u0003\u0002\u0002\u0002\u0121\u0120\u0003\u0002\u0002\u0002\u0122\u0027\u0003\u0002\u0002\u0002\u0123\u0124\u0007\u0013\u0002\u0002\u0124\u0125\u0007\u0022\u0002\u0002\u0125\u0126\u0005\u0054\u002b\u0002\u0126\u0029\u0003\u0002\u0002\u0002\u0127\u0128\u0007\u0012\u0002\u0002\u0128\u0129\u0007\u0022\u0002\u0002\u0129\u012a\u0005\u0054\u002b\u0002\u012a\u002b\u0003\u0002\u0002\u0002\u012b\u012d\u0005\u0068\u0035\u0002\u012c\u012b\u0003\u0002\u0002\u0002\u012c\u012d\u0003\u0002\u0002\u0002\u012d\u012e\u0003\u0002\u0002\u0002\u012e\u0130\u0007\u0022\u0002\u0002\u012f\u0131\u0005\u002e\u0018\u0002\u0130\u012f\u0003\u0002\u0002\u0002\u0130\u0131\u0003\u0002\u0002\u0002\u0131\u0135\u0003\u0002\u0002\u0002\u0132\u0134\u0005\u003c\u001f\u0002\u0133\u0132\u0003\u0002\u0002\u0002\u0134\u0137\u0003\u0002\u0002\u0002\u0135\u0133\u0003\u0002\u0002\u0002\u0135\u0136\u0003\u0002\u0002\u0002\u0136\u0138\u0003\u0002\u0002\u0002\u0137\u0135\u0003\u0002\u0002\u0002\u0138\u017c\u0005\u0054\u002b\u0002\u0139\u013b\u0005\u0068\u0035\u0002\u013a\u0139\u0003\u0002\u0002\u0002\u013a\u013b\u0003\u0002\u0002\u0002\u013b\u013c\u0003\u0002\u0002\u0002\u013c\u013e\u0005\u0050\u0029\u0002\u013d\u013f\u0005\u002e\u0018\u0002\u013e\u013d\u0003\u0002\u0002\u0002\u013e\u013f\u0003\u0002\u0002\u0002\u013f\u0140\u0003\u0002\u0002\u0002\u0140\u0141\u0005\u003e\u0020\u0002\u0141\u0142\u0005\u0054\u002b\u0002\u0142\u017c\u0003\u0002\u0002\u0002\u0143\u0145\u0005\u0068\u0035\u0002\u0144\u0143\u0003\u0002\u0002\u0002\u0144\u0145\u0003\u0002\u0002\u0002\u0145\u0146\u0003\u0002\u0002\u0002\u0146\u0148\u0005\u0052\u002a\u0002\u0147\u0149\u0005\u002e\u0018\u0002\u0148\u0147\u0003\u0002\u0002\u0002\u0148\u0149\u0003\u0002\u0002\u0002\u0149\u014a\u0003\u0002\u0002\u0002\u014a\u014b\u0005\u0040\u0021\u0002\u014b\u014c\u0005\u0054\u002b\u0002\u014c\u017c\u0003\u0002\u0002\u0002\u014d\u014f\u0005\u0068\u0035\u0002\u014e\u014d\u0003\u0002\u0002\u0002\u014e\u014f\u0003\u0002\u0002\u0002\u014f\u0150\u0003\u0002\u0002\u0002\u0150\u0152\u0007\u0022\u0002\u0002\u0151\u0153\u0005\u002e\u0018\u0002\u0152\u0151\u0003\u0002\u0002\u0002\u0152\u0153\u0003\u0002\u0002\u0002\u0153\u0157\u0003\u0002\u0002\u0002\u0154\u0156\u0005\u003c\u001f\u0002\u0155\u0154\u0003\u0002\u0002\u0002\u0156\u0159\u0003\u0002\u0002\u0002\u0157\u0155\u0003\u0002\u0002\u0002\u0157\u0158\u0003\u0002\u0002\u0002\u0158\u015b\u0003\u0002\u0002\u0002\u0159\u0157\u0003\u0002\u0002\u0002\u015a\u015c\u0005\u0054\u002b\u0002\u015b\u015a\u0003\u0002\u0002\u0002\u015b\u015c\u0003\u0002\u0002\u0002\u015c\u015d\u0003\u0002\u0002\u0002\u015d\u015e\u0007\u0016\u0002\u0002\u015e\u017c\u0005\u0036\u001c\u0002\u015f\u0161\u0005\u0068\u0035\u0002\u0160\u015f\u0003\u0002\u0002\u0002\u0160\u0161\u0003\u0002\u0002\u0002\u0161\u0162\u0003\u0002\u0002\u0002\u0162\u0164\u0005\u0050\u0029\u0002\u0163\u0165\u0005\u002e\u0018\u0002\u0164\u0163\u0003\u0002\u0002\u0002\u0164\u0165\u0003\u0002\u0002\u0002\u0165\u0166\u0003\u0002\u0002\u0002\u0166\u0168\u0005\u003e\u0020\u0002\u0167\u0169\u0005\u0054\u002b\u0002\u0168\u0167\u0003\u0002\u0002\u0002\u0168\u0169\u0003\u0002\u0002\u0002\u0169\u016a\u0003\u0002\u0002\u0002\u016a\u016b\u0007\u0016\u0002\u0002\u016b\u016c\u0005\u0036\u001c\u0002\u016c\u017c\u0003\u0002\u0002\u0002\u016d\u016f\u0005\u0068\u0035\u0002\u016e\u016d\u0003\u0002\u0002\u0002\u016e\u016f\u0003\u0002\u0002\u0002\u016f\u0170\u0003\u0002\u0002\u0002\u0170\u0172\u0005\u0052\u002a\u0002\u0171\u0173\u0005\u002e\u0018\u0002\u0172\u0171\u0003\u0002\u0002\u0002\u0172\u0173\u0003\u0002\u0002\u0002\u0173\u0174\u0003\u0002\u0002\u0002\u0174\u0176\u0005\u0040\u0021\u0002\u0175\u0177\u0005\u0054\u002b\u0002\u0176\u0175\u0003\u0002\u0002\u0002\u0176\u0177\u0003\u0002\u0002\u0002\u0177\u0178\u0003\u0002\u0002\u0002\u0178\u0179\u0007\u0016\u0002\u0002\u0179\u017a\u0005\u0036\u001c\u0002\u017a\u017c\u0003\u0002\u0002\u0002\u017b\u012c\u0003\u0002\u0002\u0002\u017b\u013a\u0003\u0002\u0002\u0002\u017b\u0144\u0003\u0002\u0002\u0002\u017b\u014e\u0003\u0002\u0002\u0002\u017b\u0160\u0003\u0002\u0002\u0002\u017b\u016e\u0003\u0002\u0002\u0002\u017c\u002d\u0003\u0002\u0002\u0002\u017d\u017f\u0007\u001b\u0002\u0002\u017e\u0180\u0005\u0030\u0019\u0002\u017f\u017e\u0003\u0002\u0002\u0002\u0180\u0181\u0003\u0002\u0002\u0002\u0181\u017f\u0003\u0002\u0002\u0002\u0181\u0182\u0003\u0002\u0002\u0002\u0182\u0183\u0003\u0002\u0002\u0002\u0183\u0184\u0007\u001c\u0002\u0002\u0184\u002f\u0003\u0002\u0002\u0002\u0185\u018a\u0007\u0022\u0002\u0002\u0186\u0187\u0007\u0020\u0002\u0002\u0187\u0189\u0005\u0054\u002b\u0002\u0188\u0186\u0003\u0002\u0002\u0002\u0189\u018c\u0003\u0002\u0002\u0002\u018a\u0188\u0003\u0002\u0002\u0002\u018a\u018b\u0003\u0002\u0002\u0002\u018b\u0031\u0003\u0002\u0002\u0002\u018c\u018a\u0003\u0002\u0002\u0002\u018d\u0191\u0005\u004a\u0026\u0002\u018e\u0191\u0005\u0018\u000d\u0002\u018f\u0191\u0005\u0022\u0012\u0002\u0190\u018d\u0003\u0002\u0002\u0002\u0190\u018e\u0003\u0002\u0002\u0002\u0190\u018f\u0003\u0002\u0002\u0002\u0191\u0033\u0003\u0002\u0002\u0002\u0192\u0195\u0005\u0046\u0024\u0002\u0193\u0195\u0005\u0048\u0025\u0002\u0194\u0192\u0003\u0002\u0002\u0002\u0194\u0193\u0003\u0002\u0002\u0002\u0195\u0035\u0003\u0002\u0002\u0002\u0196\u019a\u0008\u001c\u0001\u0002\u0197\u0198\u0005\u000c\u0007\u0002\u0198\u0199\u0007\u0018\u0002\u0002\u0199\u019b\u0003\u0002\u0002\u0002\u019a\u0197\u0003\u0002\u0002\u0002\u019a\u019b\u0003\u0002\u0002\u0002\u019b\u019c\u0003\u0002\u0002\u0002\u019c\u019e\u0007\u0022\u0002\u0002\u019d\u019f\u0005\u0038\u001d\u0002\u019e\u019d\u0003\u0002\u0002\u0002\u019e\u019f\u0003\u0002\u0002\u0002\u019f\u01eb\u0003\u0002\u0002\u0002\u01a0\u01eb\u0007\u0024\u0002\u0002\u01a1\u01a2\u0007\u0019\u0002\u0002\u01a2\u01a3\u0007\u0024\u0002\u0002\u01a3\u01a5\u0007\u001a\u0002\u0002\u01a4\u01a6\u0005\u0038\u001d\u0002\u01a5\u01a4\u0003\u0002\u0002\u0002\u01a5\u01a6\u0003\u0002\u0002\u0002\u01a6\u01eb\u0003\u0002\u0002\u0002\u01a7\u01eb\u0007\u0025\u0002\u0002\u01a8\u01a9\u0007\u0019\u0002\u0002\u01a9\u01aa\u0007\u0025\u0002\u0002\u01aa\u01ac\u0007\u001a\u0002\u0002\u01ab\u01ad\u0005\u0038\u001d\u0002\u01ac\u01ab\u0003\u0002\u0002\u0002\u01ac\u01ad\u0003\u0002\u0002\u0002\u01ad\u01eb\u0003\u0002\u0002\u0002\u01ae\u01eb\u0007\u0026\u0002\u0002\u01af\u01b0\u0007\u0019\u0002\u0002\u01b0\u01b1\u0007\u0026\u0002\u0002\u01b1\u01b3\u0007\u001a\u0002\u0002\u01b2\u01b4\u0005\u0038\u001d\u0002\u01b3\u01b2\u0003\u0002\u0002\u0002\u01b3\u01b4\u0003\u0002\u0002\u0002\u01b4\u01eb\u0003\u0002\u0002\u0002\u01b5\u01b6\u0007\u0019\u0002\u0002\u01b6\u01b7\u0005\u0036\u001c\u0002\u01b7\u01b8\u0005\u0044\u0023\u0002\u01b8\u01ba\u0007\u001a\u0002\u0002\u01b9\u01bb\u0005\u0038\u001d\u0002\u01ba\u01b9\u0003\u0002\u0002\u0002\u01ba\u01bb\u0003\u0002\u0002\u0002\u01bb\u01eb\u0003\u0002\u0002\u0002\u01bc\u01bd\u0007\u0019\u0002\u0002\u01bd\u01be\u0005\u0036\u001c\u0002\u01be\u01bf\u0007\u0023\u0002\u0002\u01bf\u01c0\u0005\u0036\u001c\u0002\u01c0\u01c2\u0007\u001a\u0002\u0002\u01c1\u01c3\u0005\u0038\u001d\u0002\u01c2\u01c1\u0003\u0002\u0002\u0002\u01c2\u01c3\u0003\u0002\u0002\u0002\u01c3\u01eb\u0003\u0002\u0002\u0002\u01c4\u01c5\u0007\u0023\u0002\u0002\u01c5\u01c7\u0005\u0036\u001c\u0002\u01c6\u01c8\u0005\u0038\u001d\u0002\u01c7\u01c6\u0003\u0002\u0002\u0002\u01c7\u01c8\u0003\u0002\u0002\u0002\u01c8\u01eb\u0003\u0002\u0002\u0002\u01c9\u01ca\u0007\u0019\u0002\u0002\u01ca\u01cb\u0007\u0023\u0002\u0002\u01cb\u01cc\u0005\u0036\u001c\u0002\u01cc\u01ce\u0007\u001a\u0002\u0002\u01cd\u01cf\u0005\u0038\u001d\u0002\u01ce\u01cd\u0003\u0002\u0002\u0002\u01ce\u01cf\u0003\u0002\u0002\u0002\u01cf\u01eb\u0003\u0002\u0002\u0002\u01d0\u01d1\u0005\u000c\u0007\u0002\u01d1\u01d2\u0007\u0018\u0002\u0002\u01d2\u01d4\u0003\u0002\u0002\u0002\u01d3\u01d0\u0003\u0002\u0002\u0002\u01d3\u01d4\u0003\u0002\u0002\u0002\u01d4\u01d5\u0003\u0002\u0002\u0002\u01d5\u01d7\u0005\u0050\u0029\u0002\u01d6\u01d8\u0005\u0038\u001d\u0002\u01d7\u01d6\u0003\u0002\u0002\u0002\u01d7\u01d8\u0003\u0002\u0002\u0002\u01d8\u01eb\u0003\u0002\u0002\u0002\u01d9\u01da\u0005\u000c\u0007\u0002\u01da\u01db\u0007\u0018\u0002\u0002\u01db\u01dd\u0003\u0002\u0002\u0002\u01dc\u01d9\u0003\u0002\u0002\u0002\u01dc\u01dd\u0003\u0002\u0002\u0002\u01dd\u01de\u0003\u0002\u0002\u0002\u01de\u01e0\u0005\u0052\u002a\u0002\u01df\u01e1\u0005\u0038\u001d\u0002\u01e0\u01df\u0003\u0002\u0002\u0002\u01e0\u01e1\u0003\u0002\u0002\u0002\u01e1\u01eb\u0003\u0002\u0002\u0002\u01e2\u01e4\u0005\u0010\u0009\u0002\u01e3\u01e5\u0005\u0038\u001d\u0002\u01e4\u01e3\u0003\u0002\u0002\u0002\u01e4\u01e5\u0003\u0002\u0002\u0002\u01e5\u01eb\u0003\u0002\u0002\u0002\u01e6\u01e8\u0005\u004e\u0028\u0002\u01e7\u01e9\u0005\u0038\u001d\u0002\u01e8\u01e7\u0003\u0002\u0002\u0002\u01e8\u01e9\u0003\u0002\u0002\u0002\u01e9\u01eb\u0003\u0002\u0002\u0002\u01ea\u0196\u0003\u0002\u0002\u0002\u01ea\u01a0\u0003\u0002\u0002\u0002\u01ea\u01a1\u0003\u0002\u0002\u0002\u01ea\u01a7\u0003\u0002\u0002\u0002\u01ea\u01a8\u0003\u0002\u0002\u0002\u01ea\u01ae\u0003\u0002\u0002\u0002\u01ea\u01af\u0003\u0002\u0002\u0002\u01ea\u01b5\u0003\u0002\u0002\u0002\u01ea\u01bc\u0003\u0002\u0002\u0002\u01ea\u01c4\u0003\u0002\u0002\u0002\u01ea\u01c9\u0003\u0002\u0002\u0002\u01ea\u01d3\u0003\u0002\u0002\u0002\u01ea\u01dc\u0003\u0002\u0002\u0002\u01ea\u01e2\u0003\u0002\u0002\u0002\u01ea\u01e6\u0003\u0002\u0002\u0002\u01eb\u0205\u0003\u0002\u0002\u0002\u01ec\u01ed\u000c\u000e\u0002\u0002\u01ed\u01ef\u0005\u0044\u0023\u0002\u01ee\u01f0\u0005\u0038\u001d\u0002\u01ef\u01ee\u0003\u0002\u0002\u0002\u01ef\u01f0\u0003\u0002\u0002\u0002\u01f0\u0204\u0003\u0002\u0002\u0002\u01f1\u01f2\u000c\u000c\u0002\u0002\u01f2\u01f3\u0007\u0023\u0002\u0002\u01f3\u01f5\u0005\u0036\u001c\u0002\u01f4\u01f6\u0005\u0038\u001d\u0002\u01f5\u01f4\u0003\u0002\u0002\u0002\u01f5\u01f6\u0003\u0002\u0002\u0002\u01f6\u0204\u0003\u0002\u0002\u0002\u01f7\u01f8\u000c\u0008\u0002\u0002\u01f8\u01f9\u0007\u0018\u0002\u0002\u01f9\u01fb\u0005\u0036\u001c\u0002\u01fa\u01fc\u0005\u0038\u001d\u0002\u01fb\u01fa\u0003\u0002\u0002\u0002\u01fb\u01fc\u0003\u0002\u0002\u0002\u01fc\u0204\u0003\u0002\u0002\u0002\u01fd\u01fe\u000c\u0003\u0002\u0002\u01fe\u01ff\u0007\u0021\u0002\u0002\u01ff\u0201\u0005\u0036\u001c\u0002\u0200\u0202\u0005\u0038\u001d\u0002\u0201\u0200\u0003\u0002\u0002\u0002\u0201\u0202\u0003\u0002\u0002\u0002\u0202\u0204\u0003\u0002\u0002\u0002\u0203\u01ec\u0003\u0002\u0002\u0002\u0203\u01f1\u0003\u0002\u0002\u0002\u0203\u01f7\u0003\u0002\u0002\u0002\u0203\u01fd\u0003\u0002\u0002\u0002\u0204\u0207\u0003\u0002\u0002\u0002\u0205\u0203\u0003\u0002\u0002\u0002\u0205\u0206\u0003\u0002\u0002\u0002\u0206\u0037\u0003\u0002\u0002\u0002\u0207\u0205\u0003\u0002\u0002\u0002\u0208\u0209\u0007\u0006\u0002\u0002\u0209\u020a\u0005\u0054\u002b\u0002\u020a\u0039\u0003\u0002\u0002\u0002\u020b\u020d\u0005\u0068\u0035\u0002\u020c\u020b\u0003\u0002\u0002\u0002\u020c\u020d\u0003\u0002\u0002\u0002\u020d\u020e\u0003\u0002\u0002\u0002\u020e\u020f\u0007\u0022\u0002\u0002\u020f\u0211\u0005\u0054\u002b\u0002\u0210\u0212\u0007\u0017\u0002\u0002\u0211\u0210\u0003\u0002\u0002\u0002\u0211\u0212\u0003\u0002\u0002\u0002\u0212\u0215\u0003\u0002\u0002\u0002\u0213\u0214\u0007\u0016\u0002\u0002\u0214\u0216\u0005\u0036\u001c\u0002\u0215\u0213\u0003\u0002\u0002\u0002\u0215\u0216\u0003\u0002\u0002\u0002\u0216\u003b\u0003\u0002\u0002\u0002\u0217\u021b\u0007\u0019\u0002\u0002\u0218\u021a\u0005\u003a\u001e\u0002\u0219\u0218\u0003\u0002\u0002\u0002\u021a\u021d\u0003\u0002\u0002\u0002\u021b\u0219\u0003\u0002\u0002\u0002\u021b\u021c\u0003\u0002\u0002\u0002\u021c\u021e\u0003\u0002\u0002\u0002\u021d\u021b\u0003\u0002\u0002\u0002\u021e\u021f\u0007\u001a\u0002\u0002\u021f\u003d\u0003\u0002\u0002\u0002\u0220\u0221\u0007\u0019\u0002\u0002\u0221\u0222\u0005\u003a\u001e\u0002\u0222\u0223\u0005\u003a\u001e\u0002\u0223\u0224\u0007\u001a\u0002\u0002\u0224\u003f\u0003\u0002\u0002\u0002\u0225\u0226\u0007\u0019\u0002\u0002\u0226\u0227\u0005\u003a\u001e\u0002\u0227\u0228\u0007\u001a\u0002\u0002\u0228\u0041\u0003\u0002\u0002\u0002\u0229\u022a\u0007\u0022\u0002\u0002\u022a\u022c\u0007\u0016\u0002\u0002\u022b\u0229\u0003\u0002\u0002\u0002\u022b\u022c\u0003\u0002\u0002\u0002\u022c\u022d\u0003\u0002\u0002\u0002\u022d\u023a\u0005\u0036\u001c\u0002\u022e\u0230\u0007\u0022\u0002\u0002\u022f\u022e\u0003\u0002\u0002\u0002\u022f\u0230\u0003\u0002\u0002\u0002\u0230\u0231\u0003\u0002\u0002\u0002\u0231\u0235\u0007\u001d\u0002\u0002\u0232\u0234\u0005\u0036\u001c\u0002\u0233\u0232\u0003\u0002\u0002\u0002\u0234\u0237\u0003\u0002\u0002\u0002\u0235\u0233\u0003\u0002\u0002\u0002\u0235\u0236\u0003\u0002\u0002\u0002\u0236\u0238\u0003\u0002\u0002\u0002\u0237\u0235\u0003\u0002\u0002\u0002\u0238\u023a\u0007\u001e\u0002\u0002\u0239\u022b\u0003\u0002\u0002\u0002\u0239\u022f\u0003\u0002\u0002\u0002\u023a\u0043\u0003\u0002\u0002\u0002\u023b\u023f\u0007\u0019\u0002\u0002\u023c\u023e\u0005\u0042\u0022\u0002\u023d\u023c\u0003\u0002\u0002\u0002\u023e\u0241\u0003\u0002\u0002\u0002\u023f\u023d\u0003\u0002\u0002\u0002\u023f\u0240\u0003\u0002\u0002\u0002\u0240\u0242\u0003\u0002\u0002\u0002\u0241\u023f\u0003\u0002\u0002\u0002\u0242\u0243\u0007\u001a\u0002\u0002\u0243\u0045\u0003\u0002\u0002\u0002\u0244\u0245\u0007\u0013\u0002\u0002\u0245\u0247\u0007\u0022\u0002\u0002\u0246\u0248\u0005\u0054\u002b\u0002\u0247\u0246\u0003\u0002\u0002\u0002\u0247\u0248\u0003\u0002\u0002\u0002\u0248\u0249\u0003\u0002\u0002\u0002\u0249\u024a\u0007\u0016\u0002\u0002\u024a\u024b\u0005\u0036\u001c\u0002\u024b\u0047\u0003\u0002\u0002\u0002\u024c\u024d\u0007\u0012\u0002\u0002\u024d\u024f\u0007\u0022\u0002\u0002\u024e\u0250\u0005\u0054\u002b\u0002\u024f\u024e\u0003\u0002\u0002\u0002\u024f\u0250\u0003\u0002\u0002\u0002\u0250\u0251\u0003\u0002\u0002\u0002\u0251\u0252\u0007\u0016\u0002\u0002\u0252\u0253\u0005\u0036\u001c\u0002\u0253\u0049\u0003\u0002\u0002\u0002\u0254\u0256\u0005\u0068\u0035\u0002\u0255\u0254\u0003\u0002\u0002\u0002\u0255\u0256\u0003\u0002\u0002\u0002\u0256\u0257\u0003\u0002\u0002\u0002\u0257\u0259\u0007\u0022\u0002\u0002\u0258\u025a\u0005\u002e\u0018\u0002\u0259\u0258\u0003\u0002\u0002\u0002\u0259\u025a\u0003\u0002\u0002\u0002\u025a\u025e\u0003\u0002\u0002\u0002\u025b\u025d\u0005\u003c\u001f\u0002\u025c\u025b\u0003\u0002\u0002\u0002\u025d\u0260\u0003\u0002\u0002\u0002\u025e\u025c\u0003\u0002\u0002\u0002\u025e\u025f\u0003\u0002\u0002\u0002\u025f\u0262\u0003\u0002\u0002\u0002\u0260\u025e\u0003\u0002\u0002\u0002\u0261\u0263\u0005\u0054\u002b\u0002\u0262\u0261\u0003\u0002\u0002\u0002\u0262\u0263\u0003\u0002\u0002\u0002\u0263\u0264\u0003\u0002\u0002\u0002\u0264\u0265\u0007\u0016\u0002\u0002\u0265\u02a5\u0005\u0036\u001c\u0002\u0266\u0268\u0005\u0068\u0035\u0002\u0267\u0266\u0003\u0002\u0002\u0002\u0267\u0268\u0003\u0002\u0002\u0002\u0268\u0269\u0003\u0002\u0002\u0002\u0269\u026b\u0005\u0050\u0029\u0002\u026a\u026c\u0005\u002e\u0018\u0002\u026b\u026a\u0003\u0002\u0002\u0002\u026b\u026c\u0003\u0002\u0002\u0002\u026c\u026d\u0003\u0002\u0002\u0002\u026d\u026f\u0005\u003e\u0020\u0002\u026e\u0270\u0005\u0054\u002b\u0002\u026f\u026e\u0003\u0002\u0002\u0002\u026f\u0270\u0003\u0002\u0002\u0002\u0270\u0271\u0003\u0002\u0002\u0002\u0271\u0272\u0007\u0016\u0002\u0002\u0272\u0273\u0005\u0036\u001c\u0002\u0273\u02a5\u0003\u0002\u0002\u0002\u0274\u0276\u0005\u0068\u0035\u0002\u0275\u0274\u0003\u0002\u0002\u0002\u0275\u0276\u0003\u0002\u0002\u0002\u0276\u0277\u0003\u0002\u0002\u0002\u0277\u0279\u0005\u0052\u002a\u0002\u0278\u027a\u0005\u002e\u0018\u0002\u0279\u0278\u0003\u0002\u0002\u0002\u0279\u027a\u0003\u0002\u0002\u0002\u027a\u027b\u0003\u0002\u0002\u0002\u027b\u027d\u0005\u0040\u0021\u0002\u027c\u027e\u0005\u0054\u002b\u0002\u027d\u027c\u0003\u0002\u0002\u0002\u027d\u027e\u0003\u0002\u0002\u0002\u027e\u027f\u0003\u0002\u0002\u0002\u027f\u0280\u0007\u0016\u0002\u0002\u0280\u0281\u0005\u0036\u001c\u0002\u0281\u02a5\u0003\u0002\u0002\u0002\u0282\u0284\u0005\u0068\u0035\u0002\u0283\u0282\u0003\u0002\u0002\u0002\u0283\u0284\u0003\u0002\u0002\u0002\u0284\u0285\u0003\u0002\u0002\u0002\u0285\u0287\u0007\u0022\u0002\u0002\u0286\u0288\u0005\u002e\u0018\u0002\u0287\u0286\u0003\u0002\u0002\u0002\u0287\u0288\u0003\u0002\u0002\u0002\u0288\u028c\u0003\u0002\u0002\u0002\u0289\u028b\u0005\u003c\u001f\u0002\u028a\u0289\u0003\u0002\u0002\u0002\u028b\u028e\u0003\u0002\u0002\u0002\u028c\u028a\u0003\u0002\u0002\u0002\u028c\u028d\u0003\u0002\u0002\u0002\u028d\u028f\u0003\u0002\u0002\u0002\u028e\u028c\u0003\u0002\u0002\u0002\u028f\u02a5\u0005\u0058\u002d\u0002\u0290\u0292\u0005\u0068\u0035\u0002\u0291\u0290\u0003\u0002\u0002\u0002\u0291\u0292\u0003\u0002\u0002\u0002\u0292\u0293\u0003\u0002\u0002\u0002\u0293\u0295\u0005\u0050\u0029\u0002\u0294\u0296\u0005\u002e\u0018\u0002\u0295\u0294\u0003\u0002\u0002\u0002\u0295\u0296\u0003\u0002\u0002\u0002\u0296\u0297\u0003\u0002\u0002\u0002\u0297\u0298\u0005\u003e\u0020\u0002\u0298\u0299\u0005\u0058\u002d\u0002\u0299\u02a5\u0003\u0002\u0002\u0002\u029a\u029c\u0005\u0068\u0035\u0002\u029b\u029a\u0003\u0002\u0002\u0002\u029b\u029c\u0003\u0002\u0002\u0002\u029c\u029d\u0003\u0002\u0002\u0002\u029d\u029f\u0005\u0052\u002a\u0002\u029e\u02a0\u0005\u002e\u0018\u0002\u029f\u029e\u0003\u0002\u0002\u0002\u029f\u02a0\u0003\u0002\u0002\u0002\u02a0\u02a1\u0003\u0002\u0002\u0002\u02a1\u02a2\u0005\u0040\u0021\u0002\u02a2\u02a3\u0005\u0058\u002d\u0002\u02a3\u02a5\u0003\u0002\u0002\u0002\u02a4\u0255\u0003\u0002\u0002\u0002\u02a4\u0267\u0003\u0002\u0002\u0002\u02a4\u0275\u0003\u0002\u0002\u0002\u02a4\u0283\u0003\u0002\u0002\u0002\u02a4\u0291\u0003\u0002\u0002\u0002\u02a4\u029b\u0003\u0002\u0002\u0002\u02a5\u004b\u0003\u0002\u0002\u0002\u02a6\u02ac\u0007\u0022\u0002\u0002\u02a7\u02a8\u0007\u0020\u0002\u0002\u02a8\u02aa\u0005\u0054\u002b\u0002\u02a9\u02ab\u0007\u0017\u0002\u0002\u02aa\u02a9\u0003\u0002\u0002\u0002\u02aa\u02ab\u0003\u0002\u0002\u0002\u02ab\u02ad\u0003\u0002\u0002\u0002\u02ac\u02a7\u0003\u0002\u0002\u0002\u02ac\u02ad\u0003\u0002\u0002\u0002\u02ad\u02b0\u0003\u0002\u0002\u0002\u02ae\u02af\u0007\u0016\u0002\u0002\u02af\u02b1\u0005\u0036\u001c\u0002\u02b0\u02ae\u0003\u0002\u0002\u0002\u02b0\u02b1\u0003\u0002\u0002\u0002\u02b1\u004d\u0003\u0002\u0002\u0002\u02b2\u02b6\u0007\u001b\u0002\u0002\u02b3\u02b5\u0005\u004c\u0027\u0002\u02b4\u02b3\u0003\u0002\u0002\u0002\u02b5\u02b8\u0003\u0002\u0002\u0002\u02b6\u02b4\u0003\u0002\u0002\u0002\u02b6\u02b7\u0003\u0002\u0002\u0002\u02b7\u02b9\u0003\u0002\u0002\u0002\u02b8\u02b6\u0003\u0002\u0002\u0002\u02b9\u02ba\u0007\u001c\u0002\u0002\u02ba\u02bb\u0005\u0036\u001c\u0002\u02bb\u004f\u0003\u0002\u0002\u0002\u02bc\u02bd\u0007\u001b\u0002\u0002\u02bd\u02be\u0007\u0023\u0002\u0002\u02be\u02bf\u0007\u001c\u0002\u0002\u02bf\u0051\u0003\u0002\u0002\u0002\u02c0\u02c1\u0007\u001b\u0002\u0002\u02c1\u02c2\u0007\u0020\u0002\u0002\u02c2\u02c3\u0007\u0023\u0002\u0002\u02c3\u02c4\u0007\u001c\u0002\u0002\u02c4\u0053\u0003\u0002\u0002\u0002\u02c5\u02c6\u0008\u002b\u0001\u0002\u02c6\u02c7\u0007\u0019\u0002\u0002\u02c7\u02c8\u0005\u0054\u002b\u0002\u02c8\u02c9\u0007\u001f\u0002\u0002\u02c9\u02ca\u0005\u0054\u002b\u0002\u02ca\u02cb\u0007\u001a\u0002\u0002\u02cb\u02d8\u0003\u0002\u0002\u0002\u02cc\u02cd\u0007\u0019\u0002\u0002\u02cd\u02ce\u0005\u0056\u002c\u0002\u02ce\u02cf\u0007\u001f\u0002\u0002\u02cf\u02d0\u0005\u0054\u002b\u0002\u02d0\u02d1\u0007\u001a\u0002\u0002\u02d1\u02d8\u0003\u0002\u0002\u0002\u02d2\u02d3\u0005\u0056\u002c\u0002\u02d3\u02d4\u0007\u001f\u0002\u0002\u02d4\u02d5\u0005\u0054\u002b\u0004\u02d5\u02d8\u0003\u0002\u0002\u0002\u02d6\u02d8\u0005\u0056\u002c\u0002\u02d7\u02c5\u0003\u0002\u0002\u0002\u02d7\u02cc\u0003\u0002\u0002\u0002\u02d7\u02d2\u0003\u0002\u0002\u0002\u02d7\u02d6\u0003\u0002\u0002\u0002\u02d8\u02de\u0003\u0002\u0002\u0002\u02d9\u02da\u000c\u0006\u0002\u0002\u02da\u02db\u0007\u001f\u0002\u0002\u02db\u02dd\u0005\u0054\u002b\u0007\u02dc\u02d9\u0003\u0002\u0002\u0002\u02dd\u02e0\u0003\u0002\u0002\u0002\u02de\u02dc\u0003\u0002\u0002\u0002\u02de\u02df\u0003\u0002\u0002\u0002\u02df\u0055\u0003\u0002\u0002\u0002\u02e0\u02de\u0003\u0002\u0002\u0002\u02e1\u02e2\u0005\u000c\u0007\u0002\u02e2\u02e3\u0007\u0018\u0002\u0002\u02e3\u02e5\u0003\u0002\u0002\u0002\u02e4\u02e1\u0003\u0002\u0002\u0002\u02e4\u02e5\u0003\u0002\u0002\u0002\u02e5\u02e6\u0003\u0002\u0002\u0002\u02e6\u02ef\u0007\u0022\u0002\u0002\u02e7\u02e9\u0007\u0019\u0002\u0002\u02e8\u02ea\u0005\u0054\u002b\u0002\u02e9\u02e8\u0003\u0002\u0002\u0002\u02ea\u02eb\u0003\u0002\u0002\u0002\u02eb\u02e9\u0003\u0002\u0002\u0002\u02eb\u02ec\u0003\u0002\u0002\u0002\u02ec\u02ed\u0003\u0002\u0002\u0002\u02ed\u02ee\u0007\u001a\u0002\u0002\u02ee\u02f0\u0003\u0002\u0002\u0002\u02ef\u02e7\u0003\u0002\u0002\u0002\u02ef\u02f0\u0003\u0002\u0002\u0002\u02f0\u0057\u0003\u0002\u0002\u0002\u02f1\u02f2\u0007\u000c\u0002\u0002\u02f2\u02f3\u0005\u0054\u002b\u0002\u02f3\u02f4\u0005\u005a\u002e\u0002\u02f4\u02f8\u0003\u0002\u0002\u0002\u02f5\u02f6\u0007\u000b\u0002\u0002\u02f6\u02f8\u0005\u0054\u002b\u0002\u02f7\u02f1\u0003\u0002\u0002\u0002\u02f7\u02f5\u0003\u0002\u0002\u0002\u02f8\u0059\u0003\u0002\u0002\u0002\u02f9\u02fd\u0007\u001d\u0002\u0002\u02fa\u02fc\u0005\u005c\u002f\u0002\u02fb\u02fa\u0003\u0002\u0002\u0002\u02fc\u02ff\u0003\u0002\u0002\u0002\u02fd\u02fb\u0003\u0002\u0002\u0002\u02fd\u02fe\u0003\u0002\u0002\u0002\u02fe\u0300\u0003\u0002\u0002\u0002\u02ff\u02fd\u0003\u0002\u0002\u0002\u0300\u0301\u0007\u001e\u0002\u0002\u0301\u005b\u0003\u0002\u0002\u0002\u0302\u0303\u0005\u005e\u0030\u0002\u0303\u0304\u0007\u0027\u0002\u0002\u0304\u030a\u0003\u0002\u0002\u0002\u0305\u0306\u0005\u005e\u0030\u0002\u0306\u0307\u0007\u0020\u0002\u0002\u0307\u0308\u0007\u0026\u0002\u0002\u0308\u030a\u0003\u0002\u0002\u0002\u0309\u0302\u0003\u0002\u0002\u0002\u0309\u0305\u0003\u0002\u0002\u0002\u030a\u005d\u0003\u0002\u0002\u0002\u030b\u030c\u0007\u0022\u0002\u0002\u030c\u005f\u0003\u0002\u0002\u0002\u030d\u030e\u0009\u0002\u0002\u0002\u030e\u0061\u0003\u0002\u0002\u0002\u030f\u0310\u0007\u0022\u0002\u0002\u0310\u0311\u0005\u0054\u002b\u0002\u0311\u0063\u0003\u0002\u0002\u0002\u0312\u0313\u0007\u0008\u0002\u0002\u0313\u031c\u0007\u0022\u0002\u0002\u0314\u0318\u0007\u0019\u0002\u0002\u0315\u0317\u0005\u0062\u0032\u0002\u0316\u0315\u0003\u0002\u0002\u0002\u0317\u031a\u0003\u0002\u0002\u0002\u0318\u0316\u0003\u0002\u0002\u0002\u0318\u0319\u0003\u0002\u0002\u0002\u0319\u031b\u0003\u0002\u0002\u0002\u031a\u0318\u0003\u0002\u0002\u0002\u031b\u031d\u0007\u001a\u0002\u0002\u031c\u0314\u0003\u0002\u0002\u0002\u031c\u031d\u0003\u0002\u0002\u0002\u031d\u0065\u0003\u0002\u0002\u0002\u031e\u0322\u0007\u0022\u0002\u0002\u031f\u0321\u0005\u0060\u0031\u0002\u0320\u031f\u0003\u0002\u0002\u0002\u0321\u0324\u0003\u0002\u0002\u0002\u0322\u0320\u0003\u0002\u0002\u0002\u0322\u0323\u0003\u0002\u0002\u0002\u0323\u032f\u0003\u0002\u0002\u0002\u0324\u0322\u0003\u0002\u0002\u0002\u0325\u0326\u0007\u0022\u0002\u0002\u0326\u032a\u0007\u0019\u0002\u0002\u0327\u0329\u0005\u0060\u0031\u0002\u0328\u0327\u0003\u0002\u0002\u0002\u0329\u032c\u0003\u0002\u0002\u0002\u032a\u0328\u0003\u0002\u0002\u0002\u032a\u032b\u0003\u0002\u0002\u0002\u032b\u032d\u0003\u0002\u0002\u0002\u032c\u032a\u0003\u0002\u0002\u0002\u032d\u032f\u0007\u001a\u0002\u0002\u032e\u031e\u0003\u0002\u0002\u0002\u032e\u0325\u0003\u0002\u0002\u0002\u032f\u0067\u0003\u0002\u0002\u0002\u0330\u0331\u0007\u001b\u0002\u0002\u0331\u0335\u0007\u0021\u0002\u0002\u0332\u0334\u0005\u0066\u0034\u0002\u0333\u0332\u0003\u0002\u0002\u0002\u0334\u0337\u0003\u0002\u0002\u0002\u0335\u0333\u0003\u0002\u0002\u0002\u0335\u0336\u0003\u0002\u0002\u0002\u0336\u0338\u0003\u0002\u0002\u0002\u0337\u0335\u0003\u0002\u0002\u0002\u0338\u0339\u0007\u0021\u0002\u0002\u0339\u033a\u0007\u001c\u0002\u0002\u033a\u0069\u0003\u0002\u0002\u0002\u0082\u006b\u0070\u0076\u0078\u0080\u0086\u008e\u0093\u009a\u00a5\u00ad\u00b6\u00b8\u00be\u00c1\u00c6\u00cc\u00ce\u00d6\u00da\u00de\u00e0\u00e6\u00e9\u00ee\u00f2\u00f7\u00fb\u00fe\u0103\u0109\u010b\u0111\u0115\u0117\u011d\u0121\u012c\u0130\u0135\u013a\u013e\u0144\u0148\u014e\u0152\u0157\u015b\u0160\u0164\u0168\u016e\u0172\u0176\u017b\u0181\u018a\u0190\u0194\u019a\u019e\u01a5\u01ac\u01b3\u01ba\u01c2\u01c7\u01ce\u01d3\u01d7\u01dc\u01e0\u01e4\u01e8\u01ea\u01ef\u01f5\u01fb\u0201\u0203\u0205\u020c\u0211\u0215\u021b\u022b\u022f\u0235\u0239\u023f\u0247\u024f\u0255\u0259\u025e\u0262\u0267\u026b\u026f\u0275\u0279\u027d\u0283\u0287\u028c\u0291\u0295\u029b\u029f\u02a4\u02aa\u02ac\u02b0\u02b6\u02d7\u02de\u02e4\u02eb\u02ef\u02f7\u02fd\u0309\u0318\u031c\u0322\u032a\u032e\u0335"

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
    private val RSQUARE = Tokens.RSQUARE.id
    private val LBRACE = Tokens.LBRACE.id
    private val RBRACE = Tokens.RBRACE.id
    private val ARROW = Tokens.ARROW.id
    private val TILDE = Tokens.TILDE.id
    private val COLON = Tokens.COLON.id
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
			this.state = 105
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAMESPACE) {
				if (true){
				this.state = 104
				namespace()
				}
			}

			this.state = 110
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPORT) {
				if (true){
				if (true){
				this.state = 107
				importEx()
				}
				}
				this.state = 112
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 118
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ABSTRACT) or (1L shl ANNOTATION) or (1L shl Class) or (1L shl VAR) or (1L shl VAL) or (1L shl INTERFACE) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 116
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ABSTRACT , Class , INTERFACE , LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 113
				definition()
				}}
				VAR , VAL  ->  /*LL1AltBlock*/{if (true){
				this.state = 114
				field()
				}}
				ANNOTATION  ->  /*LL1AltBlock*/{if (true){
				this.state = 115
				annotationDef()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 120
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
			this.state = 121
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
			this.state = 123
			match(IMPORT) as Token
			this.state = 124
			package_()
			this.state = 126
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 125
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
			this.state = 128
			match(LBRACE) as Token
			this.state = 132
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 129
				importElement()
				}
				}
				this.state = 134
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 135
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
			this.state = 140
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1   -> if (true){
			this.state = 137
			package_()
			this.state = 138
			match(DOT) as Token
			}
			}
			this.state = 145
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,7,context) ) {
			1 -> {if (true){
			this.state = 142
			match(ID) as Token
			}}
			2 -> {if (true){
			this.state = 143
			opIdWrap()
			}}
			3 -> {if (true){
			this.state = 144
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
			this.state = 147
			match(ID) as Token
			this.state = 152
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,8,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 148
					match(DOT) as Token
					this.state = 149
					match(ID) as Token
					}
					} 
				}
				this.state = 154
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,8,context)
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
			this.state = 155
			match(NAMESPACE) as Token
			this.state = 156
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
		enterRule(_localctx, 14, Rules.RULE_doBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 158
			match(DO) as Token
			this.state = 159
			match(LBRACE) as Token
			this.state = 163
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl RETURN) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 160
				compo()
				}
				}
				this.state = 165
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 166
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
		fun findDef() : DefContext? = getRuleContext(solver.getType("DefContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findReturning() : ReturningContext? = getRuleContext(solver.getType("ReturningContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  compo() : CompoContext {
		var _localctx : CompoContext = CompoContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_compo.id)
		try {
			this.state = 171
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,10,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 168
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 169
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 170
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
		enterRule(_localctx, 18, Rules.RULE_returning.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 173
			match(RETURN) as Token
			this.state = 174
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
		enterRule(_localctx, 20, Rules.RULE_staticBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 176
			match(STATIC) as Token
			this.state = 177
			match(LBRACE) as Token
			this.state = 182
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ABSTRACT) or (1L shl Class) or (1L shl VAR) or (1L shl VAL) or (1L shl INTERFACE) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 180
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ABSTRACT , Class , INTERFACE , LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 178
				definition()
				}}
				VAR , VAL  ->  /*LL1AltBlock*/{if (true){
				this.state = 179
				field()
				}}
				else -> throw NoViableAltException(this)
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
		enterRule(_localctx, 22, Rules.RULE_class_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 188
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 187
				annotationBlock()
				}
			}

			this.state = 191
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ABSTRACT) {
				if (true){
				this.state = 190
				match(ABSTRACT) as Token
				}
			}

			this.state = 193
			match(Class) as Token
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
		enterRule(_localctx, 24, Rules.RULE_classBody.id)
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
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl OVERRIDE) or (1L shl INTERNAL) or (1L shl VAR) or (1L shl VAL) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 220
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,20,context) ) {
				1 -> {if (true){
				this.state = 218
				definitionInClass()
				}}
				2 -> {if (true){
				this.state = 219
				abstractDefinitionInClass()
				}}
				}
				}
				this.state = 224
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 225
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
		fun findDef() : DefContext? = getRuleContext(solver.getType("DefContext"),0)
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
			this.state = 228
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INTERNAL) {
				if (true){
				this.state = 227
				match(INTERNAL) as Token
				}
			}

			this.state = 231
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OVERRIDE) {
				if (true){
				this.state = 230
				match(OVERRIDE) as Token
				}
			}

			if (true){
			this.state = 233
			def()
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
		fun findFieldInInterface() : FieldInInterfaceContext? = getRuleContext(solver.getType("FieldInInterfaceContext"),0)
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
			this.state = 236
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INTERNAL) {
				if (true){
				this.state = 235
				match(INTERNAL) as Token
				}
			}

			this.state = 240
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,25,context) ) {
			1 -> {if (true){
			this.state = 238
			fieldInInterface()
			}}
			2 -> {if (true){
			this.state = 239
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
		enterRule(_localctx, 30, Rules.RULE_constuctor.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 243 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 242
				parameter()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 245 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,26,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 249
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 247
				match(ASSGIN) as Token
				this.state = 248
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
		enterRule(_localctx, 32, Rules.RULE_interface_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 252
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 251
				annotationBlock()
				}
			}

			this.state = 254
			match(INTERFACE) as Token
			this.state = 255
			match(ID) as Token
			this.state = 257
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 256
				typeParam()
				}
			}

			this.state = 265
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 259
				match(TILDE) as Token
				this.state = 261 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 260
					typeEx(0)
					}
					}
					this.state = 263 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( _la==LPAREN || _la==ID )
				}
			}

			this.state = 267
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
		enterRule(_localctx, 34, Rules.RULE_interfaceBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 269
			match(LBRACE) as Token
			this.state = 271
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==STATIC) {
				if (true){
				this.state = 270
				staticBlock()
				}
			}

			this.state = 277
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl VAR) or (1L shl VAL) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 275
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,33,context) ) {
				1 -> {if (true){
				this.state = 273
				defInInterface()
				}}
				2 -> {if (true){
				this.state = 274
				fieldInInterface()
				}}
				}
				}
				this.state = 279
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 280
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
		enterRule(_localctx, 36, Rules.RULE_fieldInInterface.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 283
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 282
				annotationBlock()
				}
			}

			this.state = 287
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 285
			valInInterface()
			}}
			VAR  ->  /*LL1AltBlock*/{if (true){
			this.state = 286
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
		enterRule(_localctx, 38, Rules.RULE_valInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 289
			match(VAL) as Token
			this.state = 290
			match(ID) as Token
			this.state = 291
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
		enterRule(_localctx, 40, Rules.RULE_varInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 293
			match(VAR) as Token
			this.state = 294
			match(ID) as Token
			this.state = 295
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
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
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
		enterRule(_localctx, 42, Rules.RULE_defInInterface.id)
		var _la: Int
		try {
			var _alt: Int
			this.state = 377
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,54,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 298
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 297
				annotationBlock()
				}
			}

			this.state = 300
			match(ID) as Token
			this.state = 302
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 301
				typeParam()
				}
			}

			this.state = 307
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,39,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 304
					parameter()
					}
					} 
				}
				this.state = 309
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,39,context)
			}
			this.state = 310
			typeEx(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 312
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,40,context) ) {
			1   -> if (true){
			this.state = 311
			annotationBlock()
			}
			}
			this.state = 314
			opIdWrap()
			this.state = 316
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 315
				typeParam()
				}
			}

			this.state = 318
			opParameter()
			this.state = 319
			typeEx(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 322
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,42,context) ) {
			1   -> if (true){
			this.state = 321
			annotationBlock()
			}
			}
			this.state = 324
			aopIdWrap()
			this.state = 326
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 325
				typeParam()
				}
			}

			this.state = 328
			aopParameter()
			this.state = 329
			typeEx(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
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
			if (_la==LSQUARE) {
				if (true){
				this.state = 335
				typeParam()
				}
			}

			this.state = 341
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,46,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 338
					parameter()
					}
					} 
				}
				this.state = 343
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,46,context)
			}
			this.state = 345
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 344
				typeEx(0)
				}
			}

			this.state = 347
			match(ASSGIN) as Token
			this.state = 348
			value(0)
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 350
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,48,context) ) {
			1   -> if (true){
			this.state = 349
			annotationBlock()
			}
			}
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
			this.state = 364
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,51,context) ) {
			1   -> if (true){
			this.state = 363
			annotationBlock()
			}
			}
			this.state = 366
			aopIdWrap()
			this.state = 368
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 367
				typeParam()
				}
			}

			this.state = 370
			aopParameter()
			this.state = 372
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 371
				typeEx(0)
				}
			}

			this.state = 374
			match(ASSGIN) as Token
			this.state = 375
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
		enterRule(_localctx, 44, Rules.RULE_typeParam.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 379
			match(LSQUARE) as Token
			this.state = 381 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 380
				typeParamCompo()
				}
				}
				this.state = 383 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==ID )
			this.state = 385
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
		enterRule(_localctx, 46, Rules.RULE_typeParamCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 387
			match(ID) as Token
			this.state = 392
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TILDE) {
				if (true){
				if (true){
				this.state = 388
				match(TILDE) as Token
				this.state = 389
				typeEx(0)
				}
				}
				this.state = 394
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
		enterRule(_localctx, 48, Rules.RULE_definition.id)
		try {
			this.state = 398
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,57,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 395
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 396
			class_()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 397
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
		enterRule(_localctx, 50, Rules.RULE_field.id)
		try {
			this.state = 402
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 400
			val_()
			}}
			VAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 401
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
		fun findDoBlock() : DoBlockContext? = getRuleContext(solver.getType("DoBlockContext"),0)
		fun findLambda() : LambdaContext? = getRuleContext(solver.getType("LambdaContext"),0)
		fun COLON() : TerminalNode? = getToken(FoldingParser.Tokens.COLON.id, 0)
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
		var _startState : Int = 52
		enterRecursionRule(_localctx, 52, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 488
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,74,context) ) {
			1 -> {if (true){
			this.state = 408
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,59,context) ) {
			1   -> if (true){
			this.state = 405
			package_()
			this.state = 406
			match(DOT) as Token
			}
			}
			this.state = 410
			match(ID) as Token
			this.state = 412
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,60,context) ) {
			1   -> if (true){
			this.state = 411
			typeCasting()
			}
			}
			}}
			2 -> {if (true){
			this.state = 414
			match(Integer) as Token
			}}
			3 -> {if (true){
			this.state = 415
			match(LPAREN) as Token
			this.state = 416
			match(Integer) as Token
			this.state = 417
			match(RPAREN) as Token
			this.state = 419
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,61,context) ) {
			1   -> if (true){
			this.state = 418
			typeCasting()
			}
			}
			}}
			4 -> {if (true){
			this.state = 421
			match(Double) as Token
			}}
			5 -> {if (true){
			this.state = 422
			match(LPAREN) as Token
			this.state = 423
			match(Double) as Token
			this.state = 424
			match(RPAREN) as Token
			this.state = 426
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,62,context) ) {
			1   -> if (true){
			this.state = 425
			typeCasting()
			}
			}
			}}
			6 -> {if (true){
			this.state = 428
			match(String) as Token
			}}
			7 -> {if (true){
			this.state = 429
			match(LPAREN) as Token
			this.state = 430
			match(String) as Token
			this.state = 431
			match(RPAREN) as Token
			this.state = 433
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,63,context) ) {
			1   -> if (true){
			this.state = 432
			typeCasting()
			}
			}
			}}
			8 -> {if (true){
			this.state = 435
			match(LPAREN) as Token
			this.state = 436
			value(0)
			this.state = 437
			argValue()
			this.state = 438
			match(RPAREN) as Token
			this.state = 440
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,64,context) ) {
			1   -> if (true){
			this.state = 439
			typeCasting()
			}
			}
			}}
			9 -> {if (true){
			this.state = 442
			match(LPAREN) as Token
			this.state = 443
			value(0)
			this.state = 444
			match(OPID) as Token
			this.state = 445
			value(0)
			this.state = 446
			match(RPAREN) as Token
			this.state = 448
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,65,context) ) {
			1   -> if (true){
			this.state = 447
			typeCasting()
			}
			}
			}}
			10 -> {if (true){
			this.state = 450
			match(OPID) as Token
			this.state = 451
			value(0)
			this.state = 453
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,66,context) ) {
			1   -> if (true){
			this.state = 452
			typeCasting()
			}
			}
			}}
			11 -> {if (true){
			this.state = 455
			match(LPAREN) as Token
			this.state = 456
			match(OPID) as Token
			this.state = 457
			value(0)
			this.state = 458
			match(RPAREN) as Token
			this.state = 460
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,67,context) ) {
			1   -> if (true){
			this.state = 459
			typeCasting()
			}
			}
			}}
			12 -> {if (true){
			this.state = 465
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 462
				package_()
				this.state = 463
				match(DOT) as Token
				}
			}

			this.state = 467
			opIdWrap()
			this.state = 469
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,69,context) ) {
			1   -> if (true){
			this.state = 468
			typeCasting()
			}
			}
			}}
			13 -> {if (true){
			this.state = 474
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 471
				package_()
				this.state = 472
				match(DOT) as Token
				}
			}

			this.state = 476
			aopIdWrap()
			this.state = 478
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,71,context) ) {
			1   -> if (true){
			this.state = 477
			typeCasting()
			}
			}
			}}
			14 -> {if (true){
			this.state = 480
			doBlock()
			this.state = 482
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,72,context) ) {
			1   -> if (true){
			this.state = 481
			typeCasting()
			}
			}
			}}
			15 -> {if (true){
			this.state = 484
			lambda()
			this.state = 486
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,73,context) ) {
			1   -> if (true){
			this.state = 485
			typeCasting()
			}
			}
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 515
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,80,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 513
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,79,context) ) {
					1 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 490
					if (!(precpred(context!!, 12))) throw FailedPredicateException(this, "precpred(context!!, 12)")
					this.state = 491
					argValue()
					this.state = 493
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,75,context) ) {
					1   -> if (true){
					this.state = 492
					typeCasting()
					}
					}
					}}
					2 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 495
					if (!(precpred(context!!, 10))) throw FailedPredicateException(this, "precpred(context!!, 10)")
					this.state = 496
					match(OPID) as Token
					this.state = 497
					value(0)
					this.state = 499
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,76,context) ) {
					1   -> if (true){
					this.state = 498
					typeCasting()
					}
					}
					}}
					3 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 501
					if (!(precpred(context!!, 6))) throw FailedPredicateException(this, "precpred(context!!, 6)")
					this.state = 502
					match(DOT) as Token
					this.state = 503
					value(0)
					this.state = 505
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,77,context) ) {
					1   -> if (true){
					this.state = 504
					typeCasting()
					}
					}
					}}
					4 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 507
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 508
					match(COLON) as Token
					this.state = 509
					value(0)
					this.state = 511
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,78,context) ) {
					1   -> if (true){
					this.state = 510
					typeCasting()
					}
					}
					}}
					}
					} 
				}
				this.state = 517
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,80,context)
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
		enterRule(_localctx, 54, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 518
			match(AS) as Token
			this.state = 519
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
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun ELLIPSIS() : TerminalNode? = getToken(FoldingParser.Tokens.ELLIPSIS.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramEx() : ParamExContext {
		var _localctx : ParamExContext = ParamExContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_paramEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 522
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 521
				annotationBlock()
				}
			}

			this.state = 524
			match(ID) as Token
			this.state = 525
			typeEx(0)
			this.state = 527
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 526
				match(ELLIPSIS) as Token
				}
			}

			this.state = 531
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 529
				match(ASSGIN) as Token
				this.state = 530
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
		enterRule(_localctx, 58, Rules.RULE_parameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 533
			match(LPAREN) as Token
			this.state = 537
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 534
				paramEx()
				}
				}
				this.state = 539
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 540
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
		enterRule(_localctx, 60, Rules.RULE_opParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 542
			match(LPAREN) as Token
			this.state = 543
			paramEx()
			this.state = 544
			paramEx()
			this.state = 545
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
		enterRule(_localctx, 62, Rules.RULE_aopParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 547
			match(LPAREN) as Token
			this.state = 548
			paramEx()
			this.state = 549
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
		enterRule(_localctx, 64, Rules.RULE_argEx.id)
		var _la: Int
		try {
			this.state = 567
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,88,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 553
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,85,context) ) {
			1   -> if (true){
			this.state = 551
			match(ID) as Token
			this.state = 552
			match(ASSGIN) as Token
			}
			}
			this.state = 555
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 557
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 556
				match(ID) as Token
				}
			}

			this.state = 559
			match(LBRACE) as Token
			this.state = 563
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 560
				value(0)
				}
				}
				this.state = 565
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 566
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
		enterRule(_localctx, 66, Rules.RULE_argValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 569
			match(LPAREN) as Token
			this.state = 573
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 570
				argEx()
				}
				}
				this.state = 575
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 576
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
		enterRule(_localctx, 68, Rules.RULE_val_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 578
			match(VAL) as Token
			this.state = 579
			match(ID) as Token
			this.state = 581
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 580
				typeEx(0)
				}
			}

			this.state = 583
			match(ASSGIN) as Token
			this.state = 584
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
		enterRule(_localctx, 70, Rules.RULE_var_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 586
			match(VAR) as Token
			this.state = 587
			match(ID) as Token
			this.state = 589
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 588
				typeEx(0)
				}
			}

			this.state = 591
			match(ASSGIN) as Token
			this.state = 592
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
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : List<ParameterContext> = getRuleContexts(solver.getType("ParameterContext"))
		fun findParameter(i: Int) : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),i)
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
		enterRule(_localctx, 72, Rules.RULE_def.id)
		var _la: Int
		try {
			var _alt: Int
			this.state = 674
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,109,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 595
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 594
				annotationBlock()
				}
			}

			this.state = 597
			match(ID) as Token
			this.state = 599
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 598
				typeParam()
				}
			}

			this.state = 604
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,94,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 601
					parameter()
					}
					} 
				}
				this.state = 606
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,94,context)
			}
			this.state = 608
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 607
				typeEx(0)
				}
			}

			this.state = 610
			match(ASSGIN) as Token
			this.state = 611
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 613
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,96,context) ) {
			1   -> if (true){
			this.state = 612
			annotationBlock()
			}
			}
			this.state = 615
			opIdWrap()
			this.state = 617
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 616
				typeParam()
				}
			}

			this.state = 619
			opParameter()
			this.state = 621
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 620
				typeEx(0)
				}
			}

			this.state = 623
			match(ASSGIN) as Token
			this.state = 624
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 627
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,99,context) ) {
			1   -> if (true){
			this.state = 626
			annotationBlock()
			}
			}
			this.state = 629
			aopIdWrap()
			this.state = 631
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 630
				typeParam()
				}
			}

			this.state = 633
			aopParameter()
			this.state = 635
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 634
				typeEx(0)
				}
			}

			this.state = 637
			match(ASSGIN) as Token
			this.state = 638
			value(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 641
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 640
				annotationBlock()
				}
			}

			this.state = 643
			match(ID) as Token
			this.state = 645
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 644
				typeParam()
				}
			}

			this.state = 650
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN) {
				if (true){
				if (true){
				this.state = 647
				parameter()
				}
				}
				this.state = 652
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 653
			foreign()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 655
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,105,context) ) {
			1   -> if (true){
			this.state = 654
			annotationBlock()
			}
			}
			this.state = 657
			opIdWrap()
			this.state = 659
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 658
				typeParam()
				}
			}

			this.state = 661
			opParameter()
			this.state = 662
			foreign()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 665
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,107,context) ) {
			1   -> if (true){
			this.state = 664
			annotationBlock()
			}
			}
			this.state = 667
			aopIdWrap()
			this.state = 669
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 668
				typeParam()
				}
			}

			this.state = 671
			aopParameter()
			this.state = 672
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
		enterRule(_localctx, 74, Rules.RULE_lambdaParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 676
			match(ID) as Token
			this.state = 682
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 677
				match(TILDE) as Token
				this.state = 678
				typeEx(0)
				this.state = 680
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==ELLIPSIS) {
					if (true){
					this.state = 679
					match(ELLIPSIS) as Token
					}
				}

				}
			}

			this.state = 686
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 684
				match(ASSGIN) as Token
				this.state = 685
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
		enterRule(_localctx, 76, Rules.RULE_lambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 688
			match(LSQUARE) as Token
			this.state = 692
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 689
				lambdaParamEx()
				}
				}
				this.state = 694
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 695
			match(RSQUARE) as Token
			this.state = 696
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
			this.state = 698
			match(LSQUARE) as Token
			this.state = 699
			match(OPID) as Token
			this.state = 700
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
			this.state = 702
			match(LSQUARE) as Token
			this.state = 703
			match(TILDE) as Token
			this.state = 704
			match(OPID) as Token
			this.state = 705
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
		var _startState : Int = 82
		enterRecursionRule(_localctx, 82, Rules.RULE_typeEx.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 725
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,114,context) ) {
			1 -> {if (true){
			this.state = 708
			match(LPAREN) as Token
			this.state = 709
			typeEx(0)
			this.state = 710
			match(ARROW) as Token
			this.state = 711
			typeEx(0)
			this.state = 712
			match(RPAREN) as Token
			}}
			2 -> {if (true){
			this.state = 714
			match(LPAREN) as Token
			this.state = 715
			typeExSingle()
			this.state = 716
			match(ARROW) as Token
			this.state = 717
			typeEx(0)
			this.state = 718
			match(RPAREN) as Token
			}}
			3 -> {if (true){
			this.state = 720
			typeExSingle()
			this.state = 721
			match(ARROW) as Token
			this.state = 722
			typeEx(2)
			}}
			4 -> {if (true){
			this.state = 724
			typeExSingle()
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 732
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,115,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = TypeExContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_typeEx.id)
					this.state = 727
					if (!(precpred(context!!, 4))) throw FailedPredicateException(this, "precpred(context!!, 4)")
					this.state = 728
					match(ARROW) as Token
					this.state = 729
					typeEx(5)
					}
					} 
				}
				this.state = 734
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,115,context)
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
		enterRule(_localctx, 84, Rules.RULE_typeExSingle.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 738
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,116,context) ) {
			1   -> if (true){
			this.state = 735
			package_()
			this.state = 736
			match(DOT) as Token
			}
			}
			this.state = 740
			match(ID) as Token
			this.state = 749
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,118,context) ) {
			1   -> if (true){
			this.state = 741
			match(LPAREN) as Token
			this.state = 743 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 742
				typeEx(0)
				}
				}
				this.state = 745 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==LPAREN || _la==ID )
			this.state = 747
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
		enterRule(_localctx, 86, Rules.RULE_foreign.id)
		try {
			this.state = 757
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 751
			match(FOREIGN) as Token
			this.state = 752
			typeEx(0)
			this.state = 753
			foreignBody()
			}}
			EXTERNAL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 755
			match(EXTERNAL) as Token
			this.state = 756
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
		enterRule(_localctx, 88, Rules.RULE_foreignBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 759
			match(LBRACE) as Token
			this.state = 763
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 760
				foreignElement()
				}
				}
				this.state = 765
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 766
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
		enterRule(_localctx, 90, Rules.RULE_foreignElement.id)
		try {
			this.state = 775
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,121,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 768
			foreignPlatform()
			this.state = 769
			match(RawString) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 771
			foreignPlatform()
			this.state = 772
			match(TILDE) as Token
			this.state = 773
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
		enterRule(_localctx, 92, Rules.RULE_foreignPlatform.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 777
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
		enterRule(_localctx, 94, Rules.RULE_annoValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 779
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
		enterRule(_localctx, 96, Rules.RULE_annoParam.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 781
			match(ID) as Token
			this.state = 782
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
		enterRule(_localctx, 98, Rules.RULE_annotationDef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 784
			match(ANNOTATION) as Token
			this.state = 785
			match(ID) as Token
			this.state = 794
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 786
				match(LPAREN) as Token
				this.state = 790
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==ID) {
					if (true){
					if (true){
					this.state = 787
					annoParam()
					}
					}
					this.state = 792
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				this.state = 793
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
		enterRule(_localctx, 100, Rules.RULE_annotation.id)
		var _la: Int
		try {
			this.state = 812
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,126,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 796
			match(ID) as Token
			this.state = 800
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 797
				annoValue()
				}
				}
				this.state = 802
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 803
			match(ID) as Token
			this.state = 804
			match(LPAREN) as Token
			this.state = 808
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 805
				annoValue()
				}
				}
				this.state = 810
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 811
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
		enterRule(_localctx, 102, Rules.RULE_annotationBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 814
			match(LSQUARE) as Token
			this.state = 815
			match(COLON) as Token
			this.state = 819
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 816
				annotation()
				}
				}
				this.state = 821
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 822
			match(COLON) as Token
			this.state = 823
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

	override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		26 -> return value_sempred(_localctx as ValueContext, predIndex)
		41 -> return typeEx_sempred(_localctx as TypeExContext, predIndex)
		}
		return true
	}
	private fun value_sempred( _localctx : ValueContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 12)
		    1 -> return precpred(context!!, 10)
		    2 -> return precpred(context!!, 6)
		    3 -> return precpred(context!!, 1)
		}
		return true
	}
	private fun typeEx_sempred( _localctx : TypeExContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    4 -> return precpred(context!!, 4)
		}
		return true
	}

}