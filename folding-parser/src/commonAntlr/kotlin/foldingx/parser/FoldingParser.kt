// Generated from java-escape by ANTLR 4.7.1
package foldingx.parser;
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
                                                              FoldingParser.FieldAssignContext::class,
                                                              FoldingParser.Class_Context::class,
                                                              FoldingParser.ClassBodyContext::class,
                                                              FoldingParser.Constructor_Context::class,
                                                              FoldingParser.DefInInterfaceContext::class,
                                                              FoldingParser.ImplDeepContext::class,
                                                              FoldingParser.ImplHighContext::class,
                                                              FoldingParser.ImplBodyContext::class,
                                                              FoldingParser.DefInImplContext::class,
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
                                                              FoldingParser.ValNotInitContext::class,
                                                              FoldingParser.VarNotInitContext::class,
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
        CLASS(7),
        DO(8),
        EXTERNAL(9),
        FOREIGN(10),
        TEMPLATE(11),
        NAMESPACE(12),
        OVERRIDE(13),
        INTERNAL(14),
        IMPORT(15),
        IMPL(16),
        RETURN(17),
        VAR(18),
        VAL(19),
        STATIC(20),
        INTERFACE(21),
        NEWDATA(22),
        ASSGIN(23),
        BIGARROW(24),
        ELLIPSIS(25),
        DOT(26),
        LPAREN(27),
        RPAREN(28),
        LSQUARE(29),
        LCOLONSQUARE(30),
        RSQUARE(31),
        RCOLONSQUARE(32),
        LBRACE(33),
        RBRACE(34),
        ARROW(35),
        TILDE(36),
        COLON(37),
        DOUBLECOLON(38),
        Sharp(39),
        ID(40),
        OPID(41),
        Integer(42),
        Double(43),
        String(44),
        RawString(45)
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
        RULE_fieldAssign(8),
        RULE_class_(9),
        RULE_classBody(10),
        RULE_constructor_(11),
        RULE_defInInterface(12),
        RULE_implDeep(13),
        RULE_implHigh(14),
        RULE_implBody(15),
        RULE_defInImpl(16),
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
        RULE_valNotInit(32),
        RULE_varNotInit(33),
        RULE_valSetted(34),
        RULE_varSetted(35),
        RULE_def(36),
        RULE_compiledId(37),
        RULE_lambdaParamEx(38),
        RULE_lambda(39),
        RULE_opIdWrap(40),
        RULE_aopIdWrap(41),
        RULE_typeEx(42),
        RULE_typeExSingle(43),
        RULE_typeExParamEx(44),
        RULE_typeExParameter(45),
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
                                "fieldAssign", "class_", "classBody", "constructor_", 
                                "defInInterface", "implDeep", "implHigh", 
                                "implBody", "defInImpl", "newdata", "typeParam", 
                                "typeParamCompo", "definition", "field", 
                                "value", "typeCasting", "paramEx", "parameter", 
                                "opParameter", "aopParameter", "argEx", 
                                "argValue", "val_", "var_", "valNotInit", 
                                "varNotInit", "valSetted", "varSetted", 
                                "def", "compiledId", "lambdaParamEx", "lambda", 
                                "opIdWrap", "aopIdWrap", "typeEx", "typeExSingle", 
                                "typeExParamEx", "typeExParameter", "foreignBody", 
                                "foreignElement", "foreignPlatform", "annoValue", 
                                "annoParam", "annotationDef", "annotation", 
                                "annotationBlock", "literal")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
                                                          null, "'as'", 
                                                          "'abstract'", 
                                                          "'annotation'", 
                                                          "'class'", "'do'", 
                                                          "'external'", 
                                                          "'foreign'", "'template'", 
                                                          "'package'", "'override'", 
                                                          "'internal'", 
                                                          "'import'", "'impl'", 
                                                          "'return'", "'var'", 
                                                          "'val'", "'static'", 
                                                          "'interface'", 
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
                                                           "CLASS", "DO", 
                                                           "EXTERNAL", "FOREIGN", 
                                                           "TEMPLATE", "NAMESPACE", 
                                                           "OVERRIDE", "INTERNAL", 
                                                           "IMPORT", "IMPL", 
                                                           "RETURN", "VAR", 
                                                           "VAL", "STATIC", 
                                                           "INTERFACE", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u002f\u031d\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0003\u0002\u0005\u0002\u0072\u000a\u0002\u0003\u0002\u0007\u0002\u0075\u000a\u0002\u000c\u0002\u000e\u0002\u0078\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u007f\u000a\u0002\u000c\u0002\u000e\u0002\u0082\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0007\u0005\u008c\u000a\u0005\u000c\u0005\u000e\u0005\u008f\u000b\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u0097\u000a\u0007\u000c\u0007\u000e\u0007\u009a\u000b\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u00a1\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0005\u000b\u00ab\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u00b0\u000a\u000b\u0003\u000b\u0003\u000b\u0006\u000b\u00b4\u000a\u000b\u000d\u000b\u000e\u000b\u00b5\u0005\u000b\u00b8\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0007\u000c\u00be\u000a\u000c\u000c\u000c\u000e\u000c\u00c1\u000b\u000c\u0003\u000c\u0007\u000c\u00c4\u000a\u000c\u000c\u000c\u000e\u000c\u00c7\u000b\u000c\u0003\u000c\u0007\u000c\u00ca\u000a\u000c\u000c\u000c\u000e\u000c\u00cd\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00d4\u000a\u000d\u0003\u000e\u0005\u000e\u00d7\u000a\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00db\u000a\u000e\u0003\u000e\u0005\u000e\u00de\u000a\u000e\u0003\u000e\u0005\u000e\u00e1\u000a\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00e7\u000a\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00eb\u000a\u000e\u0003\u000e\u0005\u000e\u00ee\u000a\u000e\u0003\u000e\u0005\u000e\u00f1\u000a\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00f6\u000a\u000e\u0003\u000e\u0005\u000e\u00f9\u000a\u000e\u0003\u000f\u0003\u000f\u0005\u000f\u00fd\u000a\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u0101\u000a\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u0106\u000a\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u010a\u000a\u0010\u0003\u0011\u0003\u0011\u0007\u0011\u010e\u000a\u0011\u000c\u0011\u000e\u0011\u0111\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0005\u0012\u0116\u000a\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u011a\u000a\u0012\u0003\u0012\u0005\u0012\u011d\u000a\u0012\u0003\u0012\u0005\u0012\u0120\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0125\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0005\u0013\u012a\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0007\u0013\u0130\u000a\u0013\u000c\u0013\u000e\u0013\u0133\u000b\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0006\u0014\u0138\u000a\u0014\u000d\u0014\u000e\u0014\u0139\u0003\u0015\u0003\u0015\u0003\u0015\u0007\u0015\u013f\u000a\u0015\u000c\u0015\u000e\u0015\u0142\u000b\u0015\u0003\u0016\u0003\u0016\u0005\u0016\u0146\u000a\u0016\u0003\u0017\u0005\u0017\u0149\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u014d\u000a\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0157\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u015d\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0163\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u016e\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0007\u0018\u017a\u000a\u0018\u000c\u0018\u000e\u0018\u017d\u000b\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0005\u001a\u0183\u000a\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0005\u001a\u0188\u000a\u001a\u0003\u001a\u0003\u001a\u0005\u001a\u018c\u000a\u001a\u0003\u001b\u0003\u001b\u0007\u001b\u0190\u000a\u001b\u000c\u001b\u000e\u001b\u0193\u000b\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0005\u001e\u019e\u000a\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u01a2\u000a\u001e\u0003\u001e\u0003\u001e\u0007\u001e\u01a6\u000a\u001e\u000c\u001e\u000e\u001e\u01a9\u000b\u001e\u0003\u001e\u0005\u001e\u01ac\u000a\u001e\u0003\u001f\u0003\u001f\u0006\u001f\u01b0\u000a\u001f\u000d\u001f\u000e\u001f\u01b1\u0005\u001f\u01b4\u000a\u001f\u0003\u001f\u0003\u001f\u0007\u001f\u01b8\u000a\u001f\u000c\u001f\u000e\u001f\u01bb\u000b\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0005\u0020\u01c1\u000a\u0020\u0003\u0021\u0003\u0021\u0005\u0021\u01c5\u000a\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01d2\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u01da\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0026\u0005\u0026\u01e0\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u01e4\u000a\u0026\u0003\u0026\u0005\u0026\u01e7\u000a\u0026\u0003\u0026\u0005\u0026\u01ea\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u01ef\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u01f3\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u01f7\u000a\u0026\u0003\u0026\u0005\u0026\u01fa\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0200\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0205\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0209\u000a\u0026\u0003\u0026\u0005\u0026\u020c\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0212\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0217\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u021b\u000a\u0026\u0003\u0026\u0005\u0026\u021e\u000a\u0026\u0003\u0026\u0005\u0026\u0221\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0226\u000a\u0026\u0003\u0026\u0005\u0026\u0229\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u022d\u000a\u0026\u0003\u0026\u0005\u0026\u0230\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0236\u000a\u0026\u0003\u0026\u0005\u0026\u0239\u000a\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u023d\u000a\u0026\u0003\u0026\u0005\u0026\u0240\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0246\u000a\u0026\u0003\u0026\u0005\u0026\u0249\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u024e\u000a\u0026\u0003\u0026\u0005\u0026\u0251\u000a\u0026\u0003\u0026\u0005\u0026\u0254\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0259\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u025f\u000a\u0026\u0003\u0026\u0005\u0026\u0262\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0267\u000a\u0026\u0003\u0026\u0005\u0026\u026a\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0270\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0276\u000a\u0026\u0003\u0026\u0005\u0026\u0279\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u027e\u000a\u0026\u0003\u0026\u0005\u0026\u0281\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u0287\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u028d\u000a\u0026\u0005\u0026\u028f\u000a\u0026\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0005\u0028\u0297\u000a\u0028\u0005\u0028\u0299\u000a\u0028\u0003\u0028\u0003\u0028\u0005\u0028\u029d\u000a\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u02a3\u000a\u0029\u0003\u0029\u0007\u0029\u02a6\u000a\u0029\u000c\u0029\u000e\u0029\u02a9\u000b\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002c\u0003\u002c\u0005\u002c\u02b9\u000a\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0005\u002d\u02be\u000a\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0006\u002d\u02c3\u000a\u002d\u000d\u002d\u000e\u002d\u02c4\u0003\u002d\u0003\u002d\u0005\u002d\u02c9\u000a\u002d\u0003\u002e\u0003\u002e\u0005\u002e\u02cd\u000a\u002e\u0003\u002f\u0003\u002f\u0007\u002f\u02d1\u000a\u002f\u000c\u002f\u000e\u002f\u02d4\u000b\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u0030\u0003\u0030\u0007\u0030\u02dc\u000a\u0030\u000c\u0030\u000e\u0030\u02df\u000b\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u02ea\u000a\u0031\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0007\u0035\u02f7\u000a\u0035\u000c\u0035\u000e\u0035\u02fa\u000b\u0035\u0003\u0035\u0005\u0035\u02fd\u000a\u0035\u0003\u0036\u0003\u0036\u0007\u0036\u0301\u000a\u0036\u000c\u0036\u000e\u0036\u0304\u000b\u0036\u0003\u0036\u0003\u0036\u0003\u0036\u0007\u0036\u0309\u000a\u0036\u000c\u0036\u000e\u0036\u030c\u000b\u0036\u0003\u0036\u0005\u0036\u030f\u000a\u0036\u0003\u0037\u0003\u0037\u0007\u0037\u0313\u000a\u0037\u000c\u0037\u000e\u0037\u0316\u000b\u0037\u0003\u0037\u0003\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0002\u0003\u002e\u0039\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0002\u0003\u0003\u0002\u002c\u002e\u0002\u0378\u0002\u0071\u0003\u0002\u0002\u0002\u0004\u0083\u0003\u0002\u0002\u0002\u0006\u0085\u0003\u0002\u0002\u0002\u0008\u0088\u0003\u0002\u0002\u0002\u000a\u0090\u0003\u0002\u0002\u0002\u000c\u0093\u0003\u0002\u0002\u0002\u000e\u00a0\u0003\u0002\u0002\u0002\u0010\u00a2\u0003\u0002\u0002\u0002\u0012\u00a5\u0003\u0002\u0002\u0002\u0014\u00aa\u0003\u0002\u0002\u0002\u0016\u00bb\u0003\u0002\u0002\u0002\u0018\u00d0\u0003\u0002\u0002\u0002\u001a\u00f8\u0003\u0002\u0002\u0002\u001c\u00fa\u0003\u0002\u0002\u0002\u001e\u0102\u0003\u0002\u0002\u0002\u0020\u010b\u0003\u0002\u0002\u0002\u0022\u0115\u0003\u0002\u0002\u0002\u0024\u0129\u0003\u0002\u0002\u0002\u0026\u0137\u0003\u0002\u0002\u0002\u0028\u013b\u0003\u0002\u0002\u0002\u002a\u0145\u0003\u0002\u0002\u0002\u002c\u0148\u0003\u0002\u0002\u0002\u002e\u016d\u0003\u0002\u0002\u0002\u0030\u017e\u0003\u0002\u0002\u0002\u0032\u0182\u0003\u0002\u0002\u0002\u0034\u018d\u0003\u0002\u0002\u0002\u0036\u0194\u0003\u0002\u0002\u0002\u0038\u0198\u0003\u0002\u0002\u0002\u003a\u01ab\u0003\u0002\u0002\u0002\u003c\u01b3\u0003\u0002\u0002\u0002\u003e\u01c0\u0003\u0002\u0002\u0002\u0040\u01c4\u0003\u0002\u0002\u0002\u0042\u01c6\u0003\u0002\u0002\u0002\u0044\u01ca\u0003\u0002\u0002\u0002\u0046\u01ce\u0003\u0002\u0002\u0002\u0048\u01d6\u0003\u0002\u0002\u0002\u004a\u028e\u0003\u0002\u0002\u0002\u004c\u0290\u0003\u0002\u0002\u0002\u004e\u0292\u0003\u0002\u0002\u0002\u0050\u029e\u0003\u0002\u0002\u0002\u0052\u02ad\u0003\u0002\u0002\u0002\u0054\u02b1\u0003\u0002\u0002\u0002\u0056\u02b8\u0003\u0002\u0002\u0002\u0058\u02bd\u0003\u0002\u0002\u0002\u005a\u02ca\u0003\u0002\u0002\u0002\u005c\u02ce\u0003\u0002\u0002\u0002\u005e\u02d9\u0003\u0002\u0002\u0002\u0060\u02e9\u0003\u0002\u0002\u0002\u0062\u02eb\u0003\u0002\u0002\u0002\u0064\u02ed\u0003\u0002\u0002\u0002\u0066\u02ef\u0003\u0002\u0002\u0002\u0068\u02f2\u0003\u0002\u0002\u0002\u006a\u030e\u0003\u0002\u0002\u0002\u006c\u0310\u0003\u0002\u0002\u0002\u006e\u0319\u0003\u0002\u0002\u0002\u0070\u0072\u0005\u000a\u0006\u0002\u0071\u0070\u0003\u0002\u0002\u0002\u0071\u0072\u0003\u0002\u0002\u0002\u0072\u0076\u0003\u0002\u0002\u0002\u0073\u0075\u0005\u0004\u0003\u0002\u0074\u0073\u0003\u0002\u0002\u0002\u0075\u0078\u0003\u0002\u0002\u0002\u0076\u0074\u0003\u0002\u0002\u0002\u0076\u0077\u0003\u0002\u0002\u0002\u0077\u0080\u0003\u0002\u0002\u0002\u0078\u0076\u0003\u0002\u0002\u0002\u0079\u007f\u0005\u002a\u0016\u0002\u007a\u007f\u0005\u002c\u0017\u0002\u007b\u007f\u0005\u0068\u0035\u0002\u007c\u007f\u0005\u0024\u0013\u0002\u007d\u007f\u0005\u001c\u000f\u0002\u007e\u0079\u0003\u0002\u0002\u0002\u007e\u007a\u0003\u0002\u0002\u0002\u007e\u007b\u0003\u0002\u0002\u0002\u007e\u007c\u0003\u0002\u0002\u0002\u007e\u007d\u0003\u0002\u0002\u0002\u007f\u0082\u0003\u0002\u0002\u0002\u0080\u007e\u0003\u0002\u0002\u0002\u0080\u0081\u0003\u0002\u0002\u0002\u0081\u0003\u0003\u0002\u0002\u0002\u0082\u0080\u0003\u0002\u0002\u0002\u0083\u0084\u0005\u0006\u0004\u0002\u0084\u0005\u0003\u0002\u0002\u0002\u0085\u0086\u0007\u0011\u0002\u0002\u0086\u0087\u0005\u0008\u0005\u0002\u0087\u0007\u0003\u0002\u0002\u0002\u0088\u008d\u0007\u002a\u0002\u0002\u0089\u008a\u0007\u001c\u0002\u0002\u008a\u008c\u0007\u002a\u0002\u0002\u008b\u0089\u0003\u0002\u0002\u0002\u008c\u008f\u0003\u0002\u0002\u0002\u008d\u008b\u0003\u0002\u0002\u0002\u008d\u008e\u0003\u0002\u0002\u0002\u008e\u0009\u0003\u0002\u0002\u0002\u008f\u008d\u0003\u0002\u0002\u0002\u0090\u0091\u0007\u000e\u0002\u0002\u0091\u0092\u0005\u0008\u0005\u0002\u0092\u000b\u0003\u0002\u0002\u0002\u0093\u0094\u0007\u000a\u0002\u0002\u0094\u0098\u0007\u0023\u0002\u0002\u0095\u0097\u0005\u000e\u0008\u0002\u0096\u0095\u0003\u0002\u0002\u0002\u0097\u009a\u0003\u0002\u0002\u0002\u0098\u0096\u0003\u0002\u0002\u0002\u0098\u0099\u0003\u0002\u0002\u0002\u0099\u009b\u0003\u0002\u0002\u0002\u009a\u0098\u0003\u0002\u0002\u0002\u009b\u009c\u0007\u0024\u0002\u0002\u009c\u000d\u0003\u0002\u0002\u0002\u009d\u00a1\u0005\u0012\u000a\u0002\u009e\u00a1\u0005\u002e\u0018\u0002\u009f\u00a1\u0005\u0010\u0009\u0002\u00a0\u009d\u0003\u0002\u0002\u0002\u00a0\u009e\u0003\u0002\u0002\u0002\u00a0\u009f\u0003\u0002\u0002\u0002\u00a1\u000f\u0003\u0002\u0002\u0002\u00a2\u00a3\u0007\u0013\u0002\u0002\u00a3\u00a4\u0005\u002e\u0018\u0002\u00a4\u0011\u0003\u0002\u0002\u0002\u00a5\u00a6\u0005\u002e\u0018\u0002\u00a6\u00a7\u0007\u0019\u0002\u0002\u00a7\u00a8\u0005\u002e\u0018\u0002\u00a8\u0013\u0003\u0002\u0002\u0002\u00a9\u00ab\u0005\u006c\u0037\u0002\u00aa\u00a9\u0003\u0002\u0002\u0002\u00aa\u00ab\u0003\u0002\u0002\u0002\u00ab\u00ac\u0003\u0002\u0002\u0002\u00ac\u00ad\u0007\u0009\u0002\u0002\u00ad\u00af\u0007\u002a\u0002\u0002\u00ae\u00b0\u0005\u0026\u0014\u0002\u00af\u00ae\u0003\u0002\u0002\u0002\u00af\u00b0\u0003\u0002\u0002\u0002\u00b0\u00b7\u0003\u0002\u0002\u0002\u00b1\u00b3\u0007\u001a\u0002\u0002\u00b2\u00b4\u0005\u0018\u000d\u0002\u00b3\u00b2\u0003\u0002\u0002\u0002\u00b4\u00b5\u0003\u0002\u0002\u0002\u00b5\u00b3\u0003\u0002\u0002\u0002\u00b5\u00b6\u0003\u0002\u0002\u0002\u00b6\u00b8\u0003\u0002\u0002\u0002\u00b7\u00b1\u0003\u0002\u0002\u0002\u00b7\u00b8\u0003\u0002\u0002\u0002\u00b8\u00b9\u0003\u0002\u0002\u0002\u00b9\u00ba\u0005\u0016\u000c\u0002\u00ba\u0015\u0003\u0002\u0002\u0002\u00bb\u00bf\u0007\u0023\u0002\u0002\u00bc\u00be\u0005\u002c\u0017\u0002\u00bd\u00bc\u0003\u0002\u0002\u0002\u00be\u00c1\u0003\u0002\u0002\u0002\u00bf\u00bd\u0003\u0002\u0002\u0002\u00bf\u00c0\u0003\u0002\u0002\u0002\u00c0\u00c5\u0003\u0002\u0002\u0002\u00c1\u00bf\u0003\u0002\u0002\u0002\u00c2\u00c4\u0005\u001a\u000e\u0002\u00c3\u00c2\u0003\u0002\u0002\u0002\u00c4\u00c7\u0003\u0002\u0002\u0002\u00c5\u00c3\u0003\u0002\u0002\u0002\u00c5\u00c6\u0003\u0002\u0002\u0002\u00c6\u00cb\u0003\u0002\u0002\u0002\u00c7\u00c5\u0003\u0002\u0002\u0002\u00c8\u00ca\u0005\u001c\u000f\u0002\u00c9\u00c8\u0003\u0002\u0002\u0002\u00ca\u00cd\u0003\u0002\u0002\u0002\u00cb\u00c9\u0003\u0002\u0002\u0002\u00cb\u00cc\u0003\u0002\u0002\u0002\u00cc\u00ce\u0003\u0002\u0002\u0002\u00cd\u00cb\u0003\u0002\u0002\u0002\u00ce\u00cf\u0007\u0024\u0002\u0002\u00cf\u0017\u0003\u0002\u0002\u0002\u00d0\u00d1\u0007\u002a\u0002\u0002\u00d1\u00d3\u0005\u0034\u001b\u0002\u00d2\u00d4\u0005\u000c\u0007\u0002\u00d3\u00d2\u0003\u0002\u0002\u0002\u00d3\u00d4\u0003\u0002\u0002\u0002\u00d4\u0019\u0003\u0002\u0002\u0002\u00d5\u00d7\u0005\u006c\u0037\u0002\u00d6\u00d5\u0003\u0002\u0002\u0002\u00d6\u00d7\u0003\u0002\u0002\u0002\u00d7\u00d8\u0003\u0002\u0002\u0002\u00d8\u00da\u0007\u002a\u0002\u0002\u00d9\u00db\u0005\u004c\u0027\u0002\u00da\u00d9\u0003\u0002\u0002\u0002\u00da\u00db\u0003\u0002\u0002\u0002\u00db\u00dd\u0003\u0002\u0002\u0002\u00dc\u00de\u0005\u0026\u0014\u0002\u00dd\u00dc\u0003\u0002\u0002\u0002\u00dd\u00de\u0003\u0002\u0002\u0002\u00de\u00e0\u0003\u0002\u0002\u0002\u00df\u00e1\u0005\u0034\u001b\u0002\u00e0\u00df\u0003\u0002\u0002\u0002\u00e0\u00e1\u0003\u0002\u0002\u0002\u00e1\u00e2\u0003\u0002\u0002\u0002\u00e2\u00e3\u0007\u001a\u0002\u0002\u00e3\u00e4\u0007\u0027\u0002\u0002\u00e4\u00f9\u0005\u0056\u002c\u0002\u00e5\u00e7\u0005\u006c\u0037\u0002\u00e6\u00e5\u0003\u0002\u0002\u0002\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u00e8\u0003\u0002\u0002\u0002\u00e8\u00ea\u0007\u002a\u0002\u0002\u00e9\u00eb\u0005\u004c\u0027\u0002\u00ea\u00e9\u0003\u0002\u0002\u0002\u00ea\u00eb\u0003\u0002\u0002\u0002\u00eb\u00ed\u0003\u0002\u0002\u0002\u00ec\u00ee\u0005\u0026\u0014\u0002\u00ed\u00ec\u0003\u0002\u0002\u0002\u00ed\u00ee\u0003\u0002\u0002\u0002\u00ee\u00f0\u0003\u0002\u0002\u0002\u00ef\u00f1\u0005\u0034\u001b\u0002\u00f0\u00ef\u0003\u0002\u0002\u0002\u00f0\u00f1\u0003\u0002\u0002\u0002\u00f1\u00f2\u0003\u0002\u0002\u0002\u00f2\u00f5\u0007\u001a\u0002\u0002\u00f3\u00f4\u0007\u0027\u0002\u0002\u00f4\u00f6\u0005\u0056\u002c\u0002\u00f5\u00f3\u0003\u0002\u0002\u0002\u00f5\u00f6\u0003\u0002\u0002\u0002\u00f6\u00f7\u0003\u0002\u0002\u0002\u00f7\u00f9\u0005\u002e\u0018\u0002\u00f8\u00d6\u0003\u0002\u0002\u0002\u00f8\u00e6\u0003\u0002\u0002\u0002\u00f9\u001b\u0003\u0002\u0002\u0002\u00fa\u00fc\u0007\u0012\u0002\u0002\u00fb\u00fd\u0005\u0026\u0014\u0002\u00fc\u00fb\u0003\u0002\u0002\u0002\u00fc\u00fd\u0003\u0002\u0002\u0002\u00fd\u00fe\u0003\u0002\u0002\u0002\u00fe\u0100\u0005\u0056\u002c\u0002\u00ff\u0101\u0005\u0020\u0011\u0002\u0100\u00ff\u0003\u0002\u0002\u0002\u0100\u0101\u0003\u0002\u0002\u0002\u0101\u001d\u0003\u0002\u0002\u0002\u0102\u0103\u0007\u0012\u0002\u0002\u0103\u0105\u0005\u0056\u002c\u0002\u0104\u0106\u0005\u0026\u0014\u0002\u0105\u0104\u0003\u0002\u0002\u0002\u0105\u0106\u0003\u0002\u0002\u0002\u0106\u0107\u0003\u0002\u0002\u0002\u0107\u0109\u0005\u0056\u002c\u0002\u0108\u010a\u0005\u0020\u0011\u0002\u0109\u0108\u0003\u0002\u0002\u0002\u0109\u010a\u0003\u0002\u0002\u0002\u010a\u001f\u0003\u0002\u0002\u0002\u010b\u010f\u0007\u0023\u0002\u0002\u010c\u010e\u0005\u0022\u0012\u0002\u010d\u010c\u0003\u0002\u0002\u0002\u010e\u0111\u0003\u0002\u0002\u0002\u010f\u010d\u0003\u0002\u0002\u0002\u010f\u0110\u0003\u0002\u0002\u0002\u0110\u0112\u0003\u0002\u0002\u0002\u0111\u010f\u0003\u0002\u0002\u0002\u0112\u0113\u0007\u0024\u0002\u0002\u0113\u0021\u0003\u0002\u0002\u0002\u0114\u0116\u0005\u006c\u0037\u0002\u0115\u0114\u0003\u0002\u0002\u0002\u0115\u0116\u0003\u0002\u0002\u0002\u0116\u0117\u0003\u0002\u0002\u0002\u0117\u0119\u0007\u002a\u0002\u0002\u0118\u011a\u0005\u004c\u0027\u0002\u0119\u0118\u0003\u0002\u0002\u0002\u0119\u011a\u0003\u0002\u0002\u0002\u011a\u011c\u0003\u0002\u0002\u0002\u011b\u011d\u0005\u0026\u0014\u0002\u011c\u011b\u0003\u0002\u0002\u0002\u011c\u011d\u0003\u0002\u0002\u0002\u011d\u011f\u0003\u0002\u0002\u0002\u011e\u0120\u0005\u0034\u001b\u0002\u011f\u011e\u0003\u0002\u0002\u0002\u011f\u0120\u0003\u0002\u0002\u0002\u0120\u0121\u0003\u0002\u0002\u0002\u0121\u0124\u0007\u001a\u0002\u0002\u0122\u0123\u0007\u0027\u0002\u0002\u0123\u0125\u0005\u0056\u002c\u0002\u0124\u0122\u0003\u0002\u0002\u0002\u0124\u0125\u0003\u0002\u0002\u0002\u0125\u0126\u0003\u0002\u0002\u0002\u0126\u0127\u0005\u002e\u0018\u0002\u0127\u0023\u0003\u0002\u0002\u0002\u0128\u012a\u0005\u006c\u0037\u0002\u0129\u0128\u0003\u0002\u0002\u0002\u0129\u012a\u0003\u0002\u0002\u0002\u012a\u012b\u0003\u0002\u0002\u0002\u012b\u012c\u0007\u0018\u0002\u0002\u012c\u012d\u0007\u002a\u0002\u0002\u012d\u0131\u0007\u0023\u0002\u0002\u012e\u0130\u0005\u006e\u0038\u0002\u012f\u012e\u0003\u0002\u0002\u0002\u0130\u0133\u0003\u0002\u0002\u0002\u0131\u012f\u0003\u0002\u0002\u0002\u0131\u0132\u0003\u0002\u0002\u0002\u0132\u0134\u0003\u0002\u0002\u0002\u0133\u0131\u0003\u0002\u0002\u0002\u0134\u0135\u0007\u0024\u0002\u0002\u0135\u0025\u0003\u0002\u0002\u0002\u0136\u0138\u0005\u0028\u0015\u0002\u0137\u0136\u0003\u0002\u0002\u0002\u0138\u0139\u0003\u0002\u0002\u0002\u0139\u0137\u0003\u0002\u0002\u0002\u0139\u013a\u0003\u0002\u0002\u0002\u013a\u0027\u0003\u0002\u0002\u0002\u013b\u0140\u0007\u002a\u0002\u0002\u013c\u013d\u0007\u0026\u0002\u0002\u013d\u013f\u0005\u0056\u002c\u0002\u013e\u013c\u0003\u0002\u0002\u0002\u013f\u0142\u0003\u0002\u0002\u0002\u0140\u013e\u0003\u0002\u0002\u0002\u0140\u0141\u0003\u0002\u0002\u0002\u0141\u0029\u0003\u0002\u0002\u0002\u0142\u0140\u0003\u0002\u0002\u0002\u0143\u0146\u0005\u004a\u0026\u0002\u0144\u0146\u0005\u0014\u000b\u0002\u0145\u0143\u0003\u0002\u0002\u0002\u0145\u0144\u0003\u0002\u0002\u0002\u0146\u002b\u0003\u0002\u0002\u0002\u0147\u0149\u0005\u006c\u0037\u0002\u0148\u0147\u0003\u0002\u0002\u0002\u0148\u0149\u0003\u0002\u0002\u0002\u0149\u014c\u0003\u0002\u0002\u0002\u014a\u014d\u0005\u003e\u0020\u0002\u014b\u014d\u0005\u0040\u0021\u0002\u014c\u014a\u0003\u0002\u0002\u0002\u014c\u014b\u0003\u0002\u0002\u0002\u014d\u002d\u0003\u0002\u0002\u0002\u014e\u014f\u0008\u0018\u0001\u0002\u014f\u016e\u0007\u002c\u0002\u0002\u0150\u016e\u0007\u002d\u0002\u0002\u0151\u016e\u0007\u002e\u0002\u0002\u0152\u016e\u0005\u006e\u0038\u0002\u0153\u0154\u0005\u0008\u0005\u0002\u0154\u0155\u0007\u001c\u0002\u0002\u0155\u0157\u0003\u0002\u0002\u0002\u0156\u0153\u0003\u0002\u0002\u0002\u0156\u0157\u0003\u0002\u0002\u0002\u0157\u0158\u0003\u0002\u0002\u0002\u0158\u016e\u0007\u002a\u0002\u0002\u0159\u015a\u0005\u0008\u0005\u0002\u015a\u015b\u0007\u001c\u0002\u0002\u015b\u015d\u0003\u0002\u0002\u0002\u015c\u0159\u0003\u0002\u0002\u0002\u015c\u015d\u0003\u0002\u0002\u0002\u015d\u015e\u0003\u0002\u0002\u0002\u015e\u016e\u0005\u0052\u002a\u0002\u015f\u0160\u0005\u0008\u0005\u0002\u0160\u0161\u0007\u001c\u0002\u0002\u0161\u0163\u0003\u0002\u0002\u0002\u0162\u015f\u0003\u0002\u0002\u0002\u0162\u0163\u0003\u0002\u0002\u0002\u0163\u0164\u0003\u0002\u0002\u0002\u0164\u016e\u0005\u0054\u002b\u0002\u0165\u0166\u0007\u002b\u0002\u0002\u0166\u016e\u0005\u002e\u0018\u0009\u0167\u016e\u0005\u000c\u0007\u0002\u0168\u016e\u0005\u0050\u0029\u0002\u0169\u016a\u0007\u001d\u0002\u0002\u016a\u016b\u0005\u002e\u0018\u0002\u016b\u016c\u0007\u001e\u0002\u0002\u016c\u016e\u0003\u0002\u0002\u0002\u016d\u014e\u0003\u0002\u0002\u0002\u016d\u0150\u0003\u0002\u0002\u0002\u016d\u0151\u0003\u0002\u0002\u0002\u016d\u0152\u0003\u0002\u0002\u0002\u016d\u0156\u0003\u0002\u0002\u0002\u016d\u015c\u0003\u0002\u0002\u0002\u016d\u0162\u0003\u0002\u0002\u0002\u016d\u0165\u0003\u0002\u0002\u0002\u016d\u0167\u0003\u0002\u0002\u0002\u016d\u0168\u0003\u0002\u0002\u0002\u016d\u0169\u0003\u0002\u0002\u0002\u016e\u017b\u0003\u0002\u0002\u0002\u016f\u0170\u000c\u0008\u0002\u0002\u0170\u0171\u0007\u002b\u0002\u0002\u0171\u017a\u0005\u002e\u0018\u0009\u0172\u0173\u000c\u000a\u0002\u0002\u0173\u017a\u0005\u003c\u001f\u0002\u0174\u0175\u000c\u0005\u0002\u0002\u0175\u0176\u0007\u0027\u0002\u0002\u0176\u017a\u0007\u002a\u0002\u0002\u0177\u0178\u000c\u0003\u0002\u0002\u0178\u017a\u0005\u0030\u0019\u0002\u0179\u016f\u0003\u0002\u0002\u0002\u0179\u0172\u0003\u0002\u0002\u0002\u0179\u0174\u0003\u0002\u0002\u0002\u0179\u0177\u0003\u0002\u0002\u0002\u017a\u017d\u0003\u0002\u0002\u0002\u017b\u0179\u0003\u0002\u0002\u0002\u017b\u017c\u0003\u0002\u0002\u0002\u017c\u002f\u0003\u0002\u0002\u0002\u017d\u017b\u0003\u0002\u0002\u0002\u017e\u017f\u0007\u0006\u0002\u0002\u017f\u0180\u0005\u0056\u002c\u0002\u0180\u0031\u0003\u0002\u0002\u0002\u0181\u0183\u0005\u006c\u0037\u0002\u0182\u0181\u0003\u0002\u0002\u0002\u0182\u0183\u0003\u0002\u0002\u0002\u0183\u0184\u0003\u0002\u0002\u0002\u0184\u0185\u0007\u002a\u0002\u0002\u0185\u0187\u0005\u0056\u002c\u0002\u0186\u0188\u0007\u001b\u0002\u0002\u0187\u0186\u0003\u0002\u0002\u0002\u0187\u0188\u0003\u0002\u0002\u0002\u0188\u018b\u0003\u0002\u0002\u0002\u0189\u018a\u0007\u0019\u0002\u0002\u018a\u018c\u0005\u002e\u0018\u0002\u018b\u0189\u0003\u0002\u0002\u0002\u018b\u018c\u0003\u0002\u0002\u0002\u018c\u0033\u0003\u0002\u0002\u0002\u018d\u0191\u0007\u0027\u0002\u0002\u018e\u0190\u0005\u0032\u001a\u0002\u018f\u018e\u0003\u0002\u0002\u0002\u0190\u0193\u0003\u0002\u0002\u0002\u0191\u018f\u0003\u0002\u0002\u0002\u0191\u0192\u0003\u0002\u0002\u0002\u0192\u0035\u0003\u0002\u0002\u0002\u0193\u0191\u0003\u0002\u0002\u0002\u0194\u0195\u0007\u0027\u0002\u0002\u0195\u0196\u0005\u0032\u001a\u0002\u0196\u0197\u0005\u0032\u001a\u0002\u0197\u0037\u0003\u0002\u0002\u0002\u0198\u0199\u0007\u0027\u0002\u0002\u0199\u019a\u0005\u0032\u001a\u0002\u019a\u0039\u0003\u0002\u0002\u0002\u019b\u019c\u0007\u002a\u0002\u0002\u019c\u019e\u0007\u0019\u0002\u0002\u019d\u019b\u0003\u0002\u0002\u0002\u019d\u019e\u0003\u0002\u0002\u0002\u019e\u019f\u0003\u0002\u0002\u0002\u019f\u01ac\u0005\u002e\u0018\u0002\u01a0\u01a2\u0007\u002a\u0002\u0002\u01a1\u01a0\u0003\u0002\u0002\u0002\u01a1\u01a2\u0003\u0002\u0002\u0002\u01a2\u01a3\u0003\u0002\u0002\u0002\u01a3\u01a7\u0007\u0023\u0002\u0002\u01a4\u01a6\u0005\u002e\u0018\u0002\u01a5\u01a4\u0003\u0002\u0002\u0002\u01a6\u01a9\u0003\u0002\u0002\u0002\u01a7\u01a5\u0003\u0002\u0002\u0002\u01a7\u01a8\u0003\u0002\u0002\u0002\u01a8\u01aa\u0003\u0002\u0002\u0002\u01a9\u01a7\u0003\u0002\u0002\u0002\u01aa\u01ac\u0007\u0024\u0002\u0002\u01ab\u019d\u0003\u0002\u0002\u0002\u01ab\u01a1\u0003\u0002\u0002\u0002\u01ac\u003b\u0003\u0002\u0002\u0002\u01ad\u01af\u0007\u0026\u0002\u0002\u01ae\u01b0\u0005\u0056\u002c\u0002\u01af\u01ae\u0003\u0002\u0002\u0002\u01b0\u01b1\u0003\u0002\u0002\u0002\u01b1\u01af\u0003\u0002\u0002\u0002\u01b1\u01b2\u0003\u0002\u0002\u0002\u01b2\u01b4\u0003\u0002\u0002\u0002\u01b3\u01ad\u0003\u0002\u0002\u0002\u01b3\u01b4\u0003\u0002\u0002\u0002\u01b4\u01b5\u0003\u0002\u0002\u0002\u01b5\u01b9\u0007\u001d\u0002\u0002\u01b6\u01b8\u0005\u003a\u001e\u0002\u01b7\u01b6\u0003\u0002\u0002\u0002\u01b8\u01bb\u0003\u0002\u0002\u0002\u01b9\u01b7\u0003\u0002\u0002\u0002\u01b9\u01ba\u0003\u0002\u0002\u0002\u01ba\u01bc\u0003\u0002\u0002\u0002\u01bb\u01b9\u0003\u0002\u0002\u0002\u01bc\u01bd\u0007\u001e\u0002\u0002\u01bd\u003d\u0003\u0002\u0002\u0002\u01be\u01c1\u0005\u0046\u0024\u0002\u01bf\u01c1\u0005\u0042\u0022\u0002\u01c0\u01be\u0003\u0002\u0002\u0002\u01c0\u01bf\u0003\u0002\u0002\u0002\u01c1\u003f\u0003\u0002\u0002\u0002\u01c2\u01c5\u0005\u0048\u0025\u0002\u01c3\u01c5\u0005\u0044\u0023\u0002\u01c4\u01c2\u0003\u0002\u0002\u0002\u01c4\u01c3\u0003\u0002\u0002\u0002\u01c5\u0041\u0003\u0002\u0002\u0002\u01c6\u01c7\u0007\u0015\u0002\u0002\u01c7\u01c8\u0007\u002a\u0002\u0002\u01c8\u01c9\u0005\u0056\u002c\u0002\u01c9\u0043\u0003\u0002\u0002\u0002\u01ca\u01cb\u0007\u0014\u0002\u0002\u01cb\u01cc\u0007\u002a\u0002\u0002\u01cc\u01cd\u0005\u0056\u002c\u0002\u01cd\u0045\u0003\u0002\u0002\u0002\u01ce\u01cf\u0007\u0015\u0002\u0002\u01cf\u01d1\u0007\u002a\u0002\u0002\u01d0\u01d2\u0005\u0056\u002c\u0002\u01d1\u01d0\u0003\u0002\u0002\u0002\u01d1\u01d2\u0003\u0002\u0002\u0002\u01d2\u01d3\u0003\u0002\u0002\u0002\u01d3\u01d4\u0007\u0019\u0002\u0002\u01d4\u01d5\u0005\u002e\u0018\u0002\u01d5\u0047\u0003\u0002\u0002\u0002\u01d6\u01d7\u0007\u0014\u0002\u0002\u01d7\u01d9\u0007\u002a\u0002\u0002\u01d8\u01da\u0005\u0056\u002c\u0002\u01d9\u01d8\u0003\u0002\u0002\u0002\u01d9\u01da\u0003\u0002\u0002\u0002\u01da\u01db\u0003\u0002\u0002\u0002\u01db\u01dc\u0007\u0019\u0002\u0002\u01dc\u01dd\u0005\u002e\u0018\u0002\u01dd\u0049\u0003\u0002\u0002\u0002\u01de\u01e0\u0005\u006c\u0037\u0002\u01df\u01de\u0003\u0002\u0002\u0002\u01df\u01e0\u0003\u0002\u0002\u0002\u01e0\u01e1\u0003\u0002\u0002\u0002\u01e1\u01e3\u0007\u002a\u0002\u0002\u01e2\u01e4\u0005\u004c\u0027\u0002\u01e3\u01e2\u0003\u0002\u0002\u0002\u01e3\u01e4\u0003\u0002\u0002\u0002\u01e4\u01e6\u0003\u0002\u0002\u0002\u01e5\u01e7\u0005\u0026\u0014\u0002\u01e6\u01e5\u0003\u0002\u0002\u0002\u01e6\u01e7\u0003\u0002\u0002\u0002\u01e7\u01e9\u0003\u0002\u0002\u0002\u01e8\u01ea\u0005\u0034\u001b\u0002\u01e9\u01e8\u0003\u0002\u0002\u0002\u01e9\u01ea\u0003\u0002\u0002\u0002\u01ea\u01eb\u0003\u0002\u0002\u0002\u01eb\u01ee\u0007\u001a\u0002\u0002\u01ec\u01ed\u0007\u0027\u0002\u0002\u01ed\u01ef\u0005\u0056\u002c\u0002\u01ee\u01ec\u0003\u0002\u0002\u0002\u01ee\u01ef\u0003\u0002\u0002\u0002\u01ef\u01f0\u0003\u0002\u0002\u0002\u01f0\u028f\u0005\u002e\u0018\u0002\u01f1\u01f3\u0005\u006c\u0037\u0002\u01f2\u01f1\u0003\u0002\u0002\u0002\u01f2\u01f3\u0003\u0002\u0002\u0002\u01f3\u01f4\u0003\u0002\u0002\u0002\u01f4\u01f6\u0005\u0052\u002a\u0002\u01f5\u01f7\u0005\u004c\u0027\u0002\u01f6\u01f5\u0003\u0002\u0002\u0002\u01f6\u01f7\u0003\u0002\u0002\u0002\u01f7\u01f9\u0003\u0002\u0002\u0002\u01f8\u01fa\u0005\u0026\u0014\u0002\u01f9\u01f8\u0003\u0002\u0002\u0002\u01f9\u01fa\u0003\u0002\u0002\u0002\u01fa\u01fb\u0003\u0002\u0002\u0002\u01fb\u01fc\u0005\u0036\u001c\u0002\u01fc\u01ff\u0007\u001a\u0002\u0002\u01fd\u01fe\u0007\u0027\u0002\u0002\u01fe\u0200\u0005\u0056\u002c\u0002\u01ff\u01fd\u0003\u0002\u0002\u0002\u01ff\u0200\u0003\u0002\u0002\u0002\u0200\u0201\u0003\u0002\u0002\u0002\u0201\u0202\u0005\u002e\u0018\u0002\u0202\u028f\u0003\u0002\u0002\u0002\u0203\u0205\u0005\u006c\u0037\u0002\u0204\u0203\u0003\u0002\u0002\u0002\u0204\u0205\u0003\u0002\u0002\u0002\u0205\u0206\u0003\u0002\u0002\u0002\u0206\u0208\u0005\u0054\u002b\u0002\u0207\u0209\u0005\u004c\u0027\u0002\u0208\u0207\u0003\u0002\u0002\u0002\u0208\u0209\u0003\u0002\u0002\u0002\u0209\u020b\u0003\u0002\u0002\u0002\u020a\u020c\u0005\u0026\u0014\u0002\u020b\u020a\u0003\u0002\u0002\u0002\u020b\u020c\u0003\u0002\u0002\u0002\u020c\u020d\u0003\u0002\u0002\u0002\u020d\u020e\u0005\u0038\u001d\u0002\u020e\u0211\u0007\u001a\u0002\u0002\u020f\u0210\u0007\u0027\u0002\u0002\u0210\u0212\u0005\u0056\u002c\u0002\u0211\u020f\u0003\u0002\u0002\u0002\u0211\u0212\u0003\u0002\u0002\u0002\u0212\u0213\u0003\u0002\u0002\u0002\u0213\u0214\u0005\u002e\u0018\u0002\u0214\u028f\u0003\u0002\u0002\u0002\u0215\u0217\u0005\u006c\u0037\u0002\u0216\u0215\u0003\u0002\u0002\u0002\u0216\u0217\u0003\u0002\u0002\u0002\u0217\u0218\u0003\u0002\u0002\u0002\u0218\u021a\u0007\u002a\u0002\u0002\u0219\u021b\u0005\u004c\u0027\u0002\u021a\u0219\u0003\u0002\u0002\u0002\u021a\u021b\u0003\u0002\u0002\u0002\u021b\u021d\u0003\u0002\u0002\u0002\u021c\u021e\u0005\u0026\u0014\u0002\u021d\u021c\u0003\u0002\u0002\u0002\u021d\u021e\u0003\u0002\u0002\u0002\u021e\u0220\u0003\u0002\u0002\u0002\u021f\u0221\u0005\u0034\u001b\u0002\u0220\u021f\u0003\u0002\u0002\u0002\u0220\u0221\u0003\u0002\u0002\u0002\u0221\u0222\u0003\u0002\u0002\u0002\u0222\u0223\u0007\u000c\u0002\u0002\u0223\u0225\u0005\u0056\u002c\u0002\u0224\u0226\u0005\u005e\u0030\u0002\u0225\u0224\u0003\u0002\u0002\u0002\u0225\u0226\u0003\u0002\u0002\u0002\u0226\u028f\u0003\u0002\u0002\u0002\u0227\u0229\u0005\u006c\u0037\u0002\u0228\u0227\u0003\u0002\u0002\u0002\u0228\u0229\u0003\u0002\u0002\u0002\u0229\u022a\u0003\u0002\u0002\u0002\u022a\u022c\u0005\u0052\u002a\u0002\u022b\u022d\u0005\u004c\u0027\u0002\u022c\u022b\u0003\u0002\u0002\u0002\u022c\u022d\u0003\u0002\u0002\u0002\u022d\u022f\u0003\u0002\u0002\u0002\u022e\u0230\u0005\u0026\u0014\u0002\u022f\u022e\u0003\u0002\u0002\u0002\u022f\u0230\u0003\u0002\u0002\u0002\u0230\u0231\u0003\u0002\u0002\u0002\u0231\u0232\u0005\u0036\u001c\u0002\u0232\u0233\u0007\u000c\u0002\u0002\u0233\u0235\u0005\u0056\u002c\u0002\u0234\u0236\u0005\u005e\u0030\u0002\u0235\u0234\u0003\u0002\u0002\u0002\u0235\u0236\u0003\u0002\u0002\u0002\u0236\u028f\u0003\u0002\u0002\u0002\u0237\u0239\u0005\u006c\u0037\u0002\u0238\u0237\u0003\u0002\u0002\u0002\u0238\u0239\u0003\u0002\u0002\u0002\u0239\u023a\u0003\u0002\u0002\u0002\u023a\u023c\u0005\u0054\u002b\u0002\u023b\u023d\u0005\u004c\u0027\u0002\u023c\u023b\u0003\u0002\u0002\u0002\u023c\u023d\u0003\u0002\u0002\u0002\u023d\u023f\u0003\u0002\u0002\u0002\u023e\u0240\u0005\u0026\u0014\u0002\u023f\u023e\u0003\u0002\u0002\u0002\u023f\u0240\u0003\u0002\u0002\u0002\u0240\u0241\u0003\u0002\u0002\u0002\u0241\u0242\u0005\u0038\u001d\u0002\u0242\u0243\u0007\u000c\u0002\u0002\u0243\u0245\u0005\u0056\u002c\u0002\u0244\u0246\u0005\u005e\u0030\u0002\u0245\u0244\u0003\u0002\u0002\u0002\u0245\u0246\u0003\u0002\u0002\u0002\u0246\u028f\u0003\u0002\u0002\u0002\u0247\u0249\u0005\u006c\u0037\u0002\u0248\u0247\u0003\u0002\u0002\u0002\u0248\u0249\u0003\u0002\u0002\u0002\u0249\u024a\u0003\u0002\u0002\u0002\u024a\u024b\u0007\u000d\u0002\u0002\u024b\u024d\u0007\u002a\u0002\u0002\u024c\u024e\u0005\u004c\u0027\u0002\u024d\u024c\u0003\u0002\u0002\u0002\u024d\u024e\u0003\u0002\u0002\u0002\u024e\u0250\u0003\u0002\u0002\u0002\u024f\u0251\u0005\u0026\u0014\u0002\u0250\u024f\u0003\u0002\u0002\u0002\u0250\u0251\u0003\u0002\u0002\u0002\u0251\u0253\u0003\u0002\u0002\u0002\u0252\u0254\u0005\u0034\u001b\u0002\u0253\u0252\u0003\u0002\u0002\u0002\u0253\u0254\u0003\u0002\u0002\u0002\u0254\u025e\u0003\u0002\u0002\u0002\u0255\u0256\u0007\u000c\u0002\u0002\u0256\u0258\u0005\u0056\u002c\u0002\u0257\u0259\u0005\u005e\u0030\u0002\u0258\u0257\u0003\u0002\u0002\u0002\u0258\u0259\u0003\u0002\u0002\u0002\u0259\u025f\u0003\u0002\u0002\u0002\u025a\u025b\u0007\u001a\u0002\u0002\u025b\u025c\u0005\u0056\u002c\u0002\u025c\u025d\u0007\u002f\u0002\u0002\u025d\u025f\u0003\u0002\u0002\u0002\u025e\u0255\u0003\u0002\u0002\u0002\u025e\u025a\u0003\u0002\u0002\u0002\u025f\u028f\u0003\u0002\u0002\u0002\u0260\u0262\u0005\u006c\u0037\u0002\u0261\u0260\u0003\u0002\u0002\u0002\u0261\u0262\u0003\u0002\u0002\u0002\u0262\u0263\u0003\u0002\u0002\u0002\u0263\u0264\u0007\u000d\u0002\u0002\u0264\u0266\u0005\u0052\u002a\u0002\u0265\u0267\u0005\u004c\u0027\u0002\u0266\u0265\u0003\u0002\u0002\u0002\u0266\u0267\u0003\u0002\u0002\u0002\u0267\u0269\u0003\u0002\u0002\u0002\u0268\u026a\u0005\u0026\u0014\u0002\u0269\u0268\u0003\u0002\u0002\u0002\u0269\u026a\u0003\u0002\u0002\u0002\u026a\u026b\u0003\u0002\u0002\u0002\u026b\u0275\u0005\u0036\u001c\u0002\u026c\u026d\u0007\u000c\u0002\u0002\u026d\u026f\u0005\u0056\u002c\u0002\u026e\u0270\u0005\u005e\u0030\u0002\u026f\u026e\u0003\u0002\u0002\u0002\u026f\u0270\u0003\u0002\u0002\u0002\u0270\u0276\u0003\u0002\u0002\u0002\u0271\u0272\u0007\u001a\u0002\u0002\u0272\u0273\u0005\u0056\u002c\u0002\u0273\u0274\u0007\u002f\u0002\u0002\u0274\u0276\u0003\u0002\u0002\u0002\u0275\u026c\u0003\u0002\u0002\u0002\u0275\u0271\u0003\u0002\u0002\u0002\u0276\u028f\u0003\u0002\u0002\u0002\u0277\u0279\u0005\u006c\u0037\u0002\u0278\u0277\u0003\u0002\u0002\u0002\u0278\u0279\u0003\u0002\u0002\u0002\u0279\u027a\u0003\u0002\u0002\u0002\u027a\u027b\u0007\u000d\u0002\u0002\u027b\u027d\u0005\u0054\u002b\u0002\u027c\u027e\u0005\u004c\u0027\u0002\u027d\u027c\u0003\u0002\u0002\u0002\u027d\u027e\u0003\u0002\u0002\u0002\u027e\u0280\u0003\u0002\u0002\u0002\u027f\u0281\u0005\u0026\u0014\u0002\u0280\u027f\u0003\u0002\u0002\u0002\u0280\u0281\u0003\u0002\u0002\u0002\u0281\u0282\u0003\u0002\u0002\u0002\u0282\u028c\u0005\u0038\u001d\u0002\u0283\u0284\u0007\u000c\u0002\u0002\u0284\u0286\u0005\u0056\u002c\u0002\u0285\u0287\u0005\u005e\u0030\u0002\u0286\u0285\u0003\u0002\u0002\u0002\u0286\u0287\u0003\u0002\u0002\u0002\u0287\u028d\u0003\u0002\u0002\u0002\u0288\u0289\u0007\u001a\u0002\u0002\u0289\u028a\u0005\u0056\u002c\u0002\u028a\u028b\u0007\u002f\u0002\u0002\u028b\u028d\u0003\u0002\u0002\u0002\u028c\u0283\u0003\u0002\u0002\u0002\u028c\u0288\u0003\u0002\u0002\u0002\u028d\u028f\u0003\u0002\u0002\u0002\u028e\u01df\u0003\u0002\u0002\u0002\u028e\u01f2\u0003\u0002\u0002\u0002\u028e\u0204\u0003\u0002\u0002\u0002\u028e\u0216\u0003\u0002\u0002\u0002\u028e\u0228\u0003\u0002\u0002\u0002\u028e\u0238\u0003\u0002\u0002\u0002\u028e\u0248\u0003\u0002\u0002\u0002\u028e\u0261\u0003\u0002\u0002\u0002\u028e\u0278\u0003\u0002\u0002\u0002\u028f\u004b\u0003\u0002\u0002\u0002\u0290\u0291\u0005\u006e\u0038\u0002\u0291\u004d\u0003\u0002\u0002\u0002\u0292\u0298\u0007\u002a\u0002\u0002\u0293\u0294\u0007\u0026\u0002\u0002\u0294\u0296\u0005\u0056\u002c\u0002\u0295\u0297\u0007\u001b\u0002\u0002\u0296\u0295\u0003\u0002\u0002\u0002\u0296\u0297\u0003\u0002\u0002\u0002\u0297\u0299\u0003\u0002\u0002\u0002\u0298\u0293\u0003\u0002\u0002\u0002\u0298\u0299\u0003\u0002\u0002\u0002\u0299\u029c\u0003\u0002\u0002\u0002\u029a\u029b\u0007\u0019\u0002\u0002\u029b\u029d\u0005\u002e\u0018\u0002\u029c\u029a\u0003\u0002\u0002\u0002\u029c\u029d\u0003\u0002\u0002\u0002\u029d\u004f\u0003\u0002\u0002\u0002\u029e\u02a2\u0007\u001f\u0002\u0002\u029f\u02a0\u0005\u0026\u0014\u0002\u02a0\u02a1\u0007\u0027\u0002\u0002\u02a1\u02a3\u0003\u0002\u0002\u0002\u02a2\u029f\u0003\u0002\u0002\u0002\u02a2\u02a3\u0003\u0002\u0002\u0002\u02a3\u02a7\u0003\u0002\u0002\u0002\u02a4\u02a6\u0005\u004e\u0028\u0002\u02a5\u02a4\u0003\u0002\u0002\u0002\u02a6\u02a9\u0003\u0002\u0002\u0002\u02a7\u02a5\u0003\u0002\u0002\u0002\u02a7\u02a8\u0003\u0002\u0002\u0002\u02a8\u02aa\u0003\u0002\u0002\u0002\u02a9\u02a7\u0003\u0002\u0002\u0002\u02aa\u02ab\u0007\u0021\u0002\u0002\u02ab\u02ac\u0005\u002e\u0018\u0002\u02ac\u0051\u0003\u0002\u0002\u0002\u02ad\u02ae\u0007\u001f\u0002\u0002\u02ae\u02af\u0007\u002b\u0002\u0002\u02af\u02b0\u0007\u0021\u0002\u0002\u02b0\u0053\u0003\u0002\u0002\u0002\u02b1\u02b2\u0007\u001f\u0002\u0002\u02b2\u02b3\u0007\u0026\u0002\u0002\u02b3\u02b4\u0007\u002b\u0002\u0002\u02b4\u02b5\u0007\u0021\u0002\u0002\u02b5\u0055\u0003\u0002\u0002\u0002\u02b6\u02b9\u0005\u005c\u002f\u0002\u02b7\u02b9\u0005\u0058\u002d\u0002\u02b8\u02b6\u0003\u0002\u0002\u0002\u02b8\u02b7\u0003\u0002\u0002\u0002\u02b9\u0057\u0003\u0002\u0002\u0002\u02ba\u02bb\u0005\u0008\u0005\u0002\u02bb\u02bc\u0007\u001c\u0002\u0002\u02bc\u02be\u0003\u0002\u0002\u0002\u02bd\u02ba\u0003\u0002\u0002\u0002\u02bd\u02be\u0003\u0002\u0002\u0002\u02be\u02bf\u0003\u0002\u0002\u0002\u02bf\u02c8\u0007\u002a\u0002\u0002\u02c0\u02c2\u0007\u001d\u0002\u0002\u02c1\u02c3\u0005\u0056\u002c\u0002\u02c2\u02c1\u0003\u0002\u0002\u0002\u02c3\u02c4\u0003\u0002\u0002\u0002\u02c4\u02c2\u0003\u0002\u0002\u0002\u02c4\u02c5\u0003\u0002\u0002\u0002\u02c5\u02c6\u0003\u0002\u0002\u0002\u02c6\u02c7\u0007\u001e\u0002\u0002\u02c7\u02c9\u0003\u0002\u0002\u0002\u02c8\u02c0\u0003\u0002\u0002\u0002\u02c8\u02c9\u0003\u0002\u0002\u0002\u02c9\u0059\u0003\u0002\u0002\u0002\u02ca\u02cc\u0005\u0056\u002c\u0002\u02cb\u02cd\u0007\u001b\u0002\u0002\u02cc\u02cb\u0003\u0002\u0002\u0002\u02cc\u02cd\u0003\u0002\u0002\u0002\u02cd\u005b\u0003\u0002\u0002\u0002\u02ce\u02d2\u0007\u001d\u0002\u0002\u02cf\u02d1\u0005\u005a\u002e\u0002\u02d0\u02cf\u0003\u0002\u0002\u0002\u02d1\u02d4\u0003\u0002\u0002\u0002\u02d2\u02d0\u0003\u0002\u0002\u0002\u02d2\u02d3\u0003\u0002\u0002\u0002\u02d3\u02d5\u0003\u0002\u0002\u0002\u02d4\u02d2\u0003\u0002\u0002\u0002\u02d5\u02d6\u0007\u001e\u0002\u0002\u02d6\u02d7\u0007\u0025\u0002\u0002\u02d7\u02d8\u0005\u0056\u002c\u0002\u02d8\u005d\u0003\u0002\u0002\u0002\u02d9\u02dd\u0007\u0023\u0002\u0002\u02da\u02dc\u0005\u0060\u0031\u0002\u02db\u02da\u0003\u0002\u0002\u0002\u02dc\u02df\u0003\u0002\u0002\u0002\u02dd\u02db\u0003\u0002\u0002\u0002\u02dd\u02de\u0003\u0002\u0002\u0002\u02de\u02e0\u0003\u0002\u0002\u0002\u02df\u02dd\u0003\u0002\u0002\u0002\u02e0\u02e1\u0007\u0024\u0002\u0002\u02e1\u005f\u0003\u0002\u0002\u0002\u02e2\u02e3\u0005\u0062\u0032\u0002\u02e3\u02e4\u0007\u002f\u0002\u0002\u02e4\u02ea\u0003\u0002\u0002\u0002\u02e5\u02e6\u0005\u0062\u0032\u0002\u02e6\u02e7\u0007\u0026\u0002\u0002\u02e7\u02e8\u0007\u002e\u0002\u0002\u02e8\u02ea\u0003\u0002\u0002\u0002\u02e9\u02e2\u0003\u0002\u0002\u0002\u02e9\u02e5\u0003\u0002\u0002\u0002\u02ea\u0061\u0003\u0002\u0002\u0002\u02eb\u02ec\u0007\u002a\u0002\u0002\u02ec\u0063\u0003\u0002\u0002\u0002\u02ed\u02ee\u0009\u0002\u0002\u0002\u02ee\u0065\u0003\u0002\u0002\u0002\u02ef\u02f0\u0007\u002a\u0002\u0002\u02f0\u02f1\u0005\u0056\u002c\u0002\u02f1\u0067\u0003\u0002\u0002\u0002\u02f2\u02f3\u0007\u0008\u0002\u0002\u02f3\u02fc\u0007\u002a\u0002\u0002\u02f4\u02f8\u0007\u001d\u0002\u0002\u02f5\u02f7\u0005\u0066\u0034\u0002\u02f6\u02f5\u0003\u0002\u0002\u0002\u02f7\u02fa\u0003\u0002\u0002\u0002\u02f8\u02f6\u0003\u0002\u0002\u0002\u02f8\u02f9\u0003\u0002\u0002\u0002\u02f9\u02fb\u0003\u0002\u0002\u0002\u02fa\u02f8\u0003\u0002\u0002\u0002\u02fb\u02fd\u0007\u001e\u0002\u0002\u02fc\u02f4\u0003\u0002\u0002\u0002\u02fc\u02fd\u0003\u0002\u0002\u0002\u02fd\u0069\u0003\u0002\u0002\u0002\u02fe\u0302\u0007\u002a\u0002\u0002\u02ff\u0301\u0005\u0064\u0033\u0002\u0300\u02ff\u0003\u0002\u0002\u0002\u0301\u0304\u0003\u0002\u0002\u0002\u0302\u0300\u0003\u0002\u0002\u0002\u0302\u0303\u0003\u0002\u0002\u0002\u0303\u030f\u0003\u0002\u0002\u0002\u0304\u0302\u0003\u0002\u0002\u0002\u0305\u0306\u0007\u002a\u0002\u0002\u0306\u030a\u0007\u001d\u0002\u0002\u0307\u0309\u0005\u0064\u0033\u0002\u0308\u0307\u0003\u0002\u0002\u0002\u0309\u030c\u0003\u0002\u0002\u0002\u030a\u0308\u0003\u0002\u0002\u0002\u030a\u030b\u0003\u0002\u0002\u0002\u030b\u030d\u0003\u0002\u0002\u0002\u030c\u030a\u0003\u0002\u0002\u0002\u030d\u030f\u0007\u001e\u0002\u0002\u030e\u02fe\u0003\u0002\u0002\u0002\u030e\u0305\u0003\u0002\u0002\u0002\u030f\u006b\u0003\u0002\u0002\u0002\u0310\u0314\u0007\u0020\u0002\u0002\u0311\u0313\u0005\u006a\u0036\u0002\u0312\u0311\u0003\u0002\u0002\u0002\u0313\u0316\u0003\u0002\u0002\u0002\u0314\u0312\u0003\u0002\u0002\u0002\u0314\u0315\u0003\u0002\u0002\u0002\u0315\u0317\u0003\u0002\u0002\u0002\u0316\u0314\u0003\u0002\u0002\u0002\u0317\u0318\u0007\u0022\u0002\u0002\u0318\u006d\u0003\u0002\u0002\u0002\u0319\u031a\u0007\u0029\u0002\u0002\u031a\u031b\u0007\u002a\u0002\u0002\u031b\u006f\u0003\u0002\u0002\u0002\u007f\u0071\u0076\u007e\u0080\u008d\u0098\u00a0\u00aa\u00af\u00b5\u00b7\u00bf\u00c5\u00cb\u00d3\u00d6\u00da\u00dd\u00e0\u00e6\u00ea\u00ed\u00f0\u00f5\u00f8\u00fc\u0100\u0105\u0109\u010f\u0115\u0119\u011c\u011f\u0124\u0129\u0131\u0139\u0140\u0145\u0148\u014c\u0156\u015c\u0162\u016d\u0179\u017b\u0182\u0187\u018b\u0191\u019d\u01a1\u01a7\u01ab\u01b1\u01b3\u01b9\u01c0\u01c4\u01d1\u01d9\u01df\u01e3\u01e6\u01e9\u01ee\u01f2\u01f6\u01f9\u01ff\u0204\u0208\u020b\u0211\u0216\u021a\u021d\u0220\u0225\u0228\u022c\u022f\u0235\u0238\u023c\u023f\u0245\u0248\u024d\u0250\u0253\u0258\u025e\u0261\u0266\u0269\u026f\u0275\u0278\u027d\u0280\u0286\u028c\u028e\u0296\u0298\u029c\u02a2\u02a7\u02b8\u02bd\u02c4\u02c8\u02cc\u02d2\u02dd\u02e9\u02f8\u02fc\u0302\u030a\u030e\u0314"

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
    private val CLASS = Tokens.CLASS.id
    private val DO = Tokens.DO.id
    private val EXTERNAL = Tokens.EXTERNAL.id
    private val FOREIGN = Tokens.FOREIGN.id
    private val TEMPLATE = Tokens.TEMPLATE.id
    private val NAMESPACE = Tokens.NAMESPACE.id
    private val OVERRIDE = Tokens.OVERRIDE.id
    private val INTERNAL = Tokens.INTERNAL.id
    private val IMPORT = Tokens.IMPORT.id
    private val IMPL = Tokens.IMPL.id
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
		fun findImplDeep() : List<ImplDeepContext> = getRuleContexts(solver.getType("ImplDeepContext"))
		fun findImplDeep(i: Int) : ImplDeepContext? = getRuleContext(solver.getType("ImplDeepContext"),i)
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
			this.state = 126
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ANNOTATION) or (1L shl CLASS) or (1L shl TEMPLATE) or (1L shl IMPL) or (1L shl VAR) or (1L shl VAL) or (1L shl NEWDATA) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 124
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
				5 -> {if (true){
				this.state = 123
				implDeep()
				}}
				}
				}
				this.state = 128
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
			this.state = 129
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
			this.state = 131
			match(IMPORT) as Token
			this.state = 132
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
			this.state = 134
			match(ID) as Token
			this.state = 139
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 135
					match(DOT) as Token
					this.state = 136
					match(ID) as Token
					}
					} 
				}
				this.state = 141
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
			this.state = 142
			match(NAMESPACE) as Token
			this.state = 143
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
			this.state = 145
			match(DO) as Token
			this.state = 146
			match(LBRACE) as Token
			this.state = 150
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl RETURN) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl Sharp) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 147
				compo()
				}
				}
				this.state = 152
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 153
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
		fun findFieldAssign() : FieldAssignContext? = getRuleContext(solver.getType("FieldAssignContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findReturning() : ReturningContext? = getRuleContext(solver.getType("ReturningContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  compo() : CompoContext {
		var _localctx : CompoContext = CompoContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_compo.id)
		try {
			this.state = 158
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 155
			fieldAssign()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 156
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 157
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
		enterRule(_localctx, 14, Rules.RULE_returning.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 160
			match(RETURN) as Token
			this.state = 161
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

	open class FieldAssignContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fieldAssign.id
	        set(value) { throw RuntimeException() }
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  fieldAssign() : FieldAssignContext {
		var _localctx : FieldAssignContext = FieldAssignContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_fieldAssign.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 163
			value(0)
			this.state = 164
			match(ASSGIN) as Token
			this.state = 165
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
		fun CLASS() : TerminalNode? = getToken(FoldingParser.Tokens.CLASS.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findClassBody() : ClassBodyContext? = getRuleContext(solver.getType("ClassBodyContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun BIGARROW() : TerminalNode? = getToken(FoldingParser.Tokens.BIGARROW.id, 0)
		fun findConstructor_() : List<Constructor_Context> = getRuleContexts(solver.getType("Constructor_Context"))
		fun findConstructor_(i: Int) : Constructor_Context? = getRuleContext(solver.getType("Constructor_Context"),i)
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
			this.state = 168
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 167
				annotationBlock()
				}
			}

			this.state = 170
			match(CLASS) as Token
			this.state = 171
			match(ID) as Token
			this.state = 173
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 172
				typeParam()
				}
			}

			this.state = 181
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==BIGARROW) {
				if (true){
				this.state = 175
				match(BIGARROW) as Token
				this.state = 177 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 176
					constructor_()
					}
					}
					this.state = 179 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( _la==ID )
				}
			}

			this.state = 183
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
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		fun findDefInInterface() : List<DefInInterfaceContext> = getRuleContexts(solver.getType("DefInInterfaceContext"))
		fun findDefInInterface(i: Int) : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),i)
		fun findImplDeep() : List<ImplDeepContext> = getRuleContexts(solver.getType("ImplDeepContext"))
		fun findImplDeep(i: Int) : ImplDeepContext? = getRuleContext(solver.getType("ImplDeepContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  classBody() : ClassBodyContext {
		var _localctx : ClassBodyContext = ClassBodyContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_classBody.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 185
			match(LBRACE) as Token
			this.state = 189
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,11,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 186
					field()
					}
					} 
				}
				this.state = 191
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,11,context)
			}
			this.state = 195
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LCOLONSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 192
				defInInterface()
				}
				}
				this.state = 197
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 201
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 198
				implDeep()
				}
				}
				this.state = 203
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 204
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

	open class Constructor_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_constructor_.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findDoBlock() : DoBlockContext? = getRuleContext(solver.getType("DoBlockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  constructor_() : Constructor_Context {
		var _localctx : Constructor_Context = Constructor_Context(context, state)
		enterRule(_localctx, 22, Rules.RULE_constructor_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 206
			match(ID) as Token
			this.state = 207
			parameter()
			this.state = 209
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 208
				doBlock()
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
		enterRule(_localctx, 24, Rules.RULE_defInInterface.id)
		var _la: Int
		try {
			this.state = 246
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,24,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 212
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 211
				annotationBlock()
				}
			}

			this.state = 214
			match(ID) as Token
			this.state = 216
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 215
				compiledId()
				}
			}

			this.state = 219
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 218
				typeParam()
				}
			}

			this.state = 222
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 221
				parameter()
				}
			}

			this.state = 224
			match(BIGARROW) as Token
			this.state = 225
			match(COLON) as Token
			this.state = 226
			typeEx()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 228
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 227
				annotationBlock()
				}
			}

			this.state = 230
			match(ID) as Token
			this.state = 232
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 231
				compiledId()
				}
			}

			this.state = 235
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 234
				typeParam()
				}
			}

			this.state = 238
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 237
				parameter()
				}
			}

			this.state = 240
			match(BIGARROW) as Token
			this.state = 243
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 241
				match(COLON) as Token
				this.state = 242
				typeEx()
				}
			}

			this.state = 245
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

	open class ImplDeepContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_implDeep.id
	        set(value) { throw RuntimeException() }
		fun IMPL() : TerminalNode? = getToken(FoldingParser.Tokens.IMPL.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findImplBody() : ImplBodyContext? = getRuleContext(solver.getType("ImplBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  implDeep() : ImplDeepContext {
		var _localctx : ImplDeepContext = ImplDeepContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_implDeep.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 248
			match(IMPL) as Token
			this.state = 250
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,25,context) ) {
			1   -> if (true){
			this.state = 249
			typeParam()
			}
			}
			this.state = 252
			typeEx()
			this.state = 254
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 253
				implBody()
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

	open class ImplHighContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_implHigh.id
	        set(value) { throw RuntimeException() }
		fun IMPL() : TerminalNode? = getToken(FoldingParser.Tokens.IMPL.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findImplBody() : ImplBodyContext? = getRuleContext(solver.getType("ImplBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  implHigh() : ImplHighContext {
		var _localctx : ImplHighContext = ImplHighContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_implHigh.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 256
			match(IMPL) as Token
			this.state = 257
			typeEx()
			this.state = 259
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,27,context) ) {
			1   -> if (true){
			this.state = 258
			typeParam()
			}
			}
			this.state = 261
			typeEx()
			this.state = 263
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 262
				implBody()
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
		enterRule(_localctx, 30, Rules.RULE_implBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 265
			match(LBRACE) as Token
			this.state = 269
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LCOLONSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 266
				defInImpl()
				}
				}
				this.state = 271
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 272
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

	open class DefInImplContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_defInImpl.id
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defInImpl() : DefInImplContext {
		var _localctx : DefInImplContext = DefInImplContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_defInImpl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 275
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 274
				annotationBlock()
				}
			}

			this.state = 277
			match(ID) as Token
			this.state = 279
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 278
				compiledId()
				}
			}

			this.state = 282
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 281
				typeParam()
				}
			}

			this.state = 285
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 284
				parameter()
				}
			}

			this.state = 287
			match(BIGARROW) as Token
			this.state = 290
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 288
				match(COLON) as Token
				this.state = 289
				typeEx()
				}
			}

			this.state = 292
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
			this.state = 295
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 294
				annotationBlock()
				}
			}

			this.state = 297
			match(NEWDATA) as Token
			this.state = 298
			match(ID) as Token
			this.state = 299
			match(LBRACE) as Token
			this.state = 303
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Sharp) {
				if (true){
				if (true){
				this.state = 300
				literal()
				}
				}
				this.state = 305
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 306
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
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 309 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 308
				typeParamCompo()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 311 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,37,context)
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
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 313
			match(ID) as Token
			this.state = 318
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TILDE) {
				if (true){
				if (true){
				this.state = 314
				match(TILDE) as Token
				this.state = 315
				typeEx()
				}
				}
				this.state = 320
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  definition() : DefinitionContext {
		var _localctx : DefinitionContext = DefinitionContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_definition.id)
		try {
			this.state = 323
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,39,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 321
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 322
			class_()
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
			this.state = 326
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 325
				annotationBlock()
				}
			}

			this.state = 330
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			VAL  ->  /*LL1AltBlock*/{if (true){
			this.state = 328
			val_()
			}}
			VAR  ->  /*LL1AltBlock*/{if (true){
			this.state = 329
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
		var _startState : Int = 44
		enterRecursionRule(_localctx, 44, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 363
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,45,context) ) {
			1 -> {if (true){
			this.state = 333
			match(Integer) as Token
			}}
			2 -> {if (true){
			this.state = 334
			match(Double) as Token
			}}
			3 -> {if (true){
			this.state = 335
			match(String) as Token
			}}
			4 -> {if (true){
			this.state = 336
			literal()
			}}
			5 -> {if (true){
			this.state = 340
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,42,context) ) {
			1   -> if (true){
			this.state = 337
			package_()
			this.state = 338
			match(DOT) as Token
			}
			}
			this.state = 342
			match(ID) as Token
			}}
			6 -> {if (true){
			this.state = 346
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 343
				package_()
				this.state = 344
				match(DOT) as Token
				}
			}

			this.state = 348
			opIdWrap()
			}}
			7 -> {if (true){
			this.state = 352
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 349
				package_()
				this.state = 350
				match(DOT) as Token
				}
			}

			this.state = 354
			aopIdWrap()
			}}
			8 -> {if (true){
			this.state = 355
			match(OPID) as Token
			this.state = 356
			value(7)
			}}
			9 -> {if (true){
			this.state = 357
			doBlock()
			}}
			10 -> {if (true){
			this.state = 358
			lambda()
			}}
			11 -> {if (true){
			this.state = 359
			match(LPAREN) as Token
			this.state = 360
			value(0)
			this.state = 361
			match(RPAREN) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 377
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,47,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 375
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,46,context) ) {
					1 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 365
					if (!(precpred(context!!, 6))) throw FailedPredicateException(this, "precpred(context!!, 6)")
					this.state = 366
					match(OPID) as Token
					this.state = 367
					value(7)
					}}
					2 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 368
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 369
					argValue()
					}}
					3 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 370
					if (!(precpred(context!!, 3))) throw FailedPredicateException(this, "precpred(context!!, 3)")
					this.state = 371
					match(COLON) as Token
					this.state = 372
					match(ID) as Token
					}}
					4 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 373
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 374
					typeCasting()
					}}
					}
					} 
				}
				this.state = 379
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,47,context)
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
			this.state = 380
			match(AS) as Token
			this.state = 381
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
			this.state = 384
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 383
				annotationBlock()
				}
			}

			this.state = 386
			match(ID) as Token
			this.state = 387
			typeEx()
			this.state = 389
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 388
				match(ELLIPSIS) as Token
				}
			}

			this.state = 393
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 391
				match(ASSGIN) as Token
				this.state = 392
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
			this.state = 395
			match(COLON) as Token
			this.state = 399
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,51,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 396
					paramEx()
					}
					} 
				}
				this.state = 401
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
			this.state = 402
			match(COLON) as Token
			this.state = 403
			paramEx()
			this.state = 404
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
			this.state = 406
			match(COLON) as Token
			this.state = 407
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
			this.state = 425
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,55,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 411
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,52,context) ) {
			1   -> if (true){
			this.state = 409
			match(ID) as Token
			this.state = 410
			match(ASSGIN) as Token
			}
			}
			this.state = 413
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 415
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 414
				match(ID) as Token
				}
			}

			this.state = 417
			match(LBRACE) as Token
			this.state = 421
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl Sharp) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 418
				value(0)
				}
				}
				this.state = 423
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 424
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
			this.state = 433
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 427
				match(TILDE) as Token
				this.state = 429 
				errorHandler.sync(this)
				_alt = 1
				do {
					when (_alt) {
					    1 -> if (true){
					if (true){
					this.state = 428
					typeEx()
					}
					}
					else -> throw NoViableAltException(this)
					}
					this.state = 431 
					errorHandler.sync(this)
					_alt = interpreter!!.adaptivePredict(_input!!,56,context)
				} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
				}
			}

			this.state = 435
			match(LPAREN) as Token
			this.state = 439
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl Sharp) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 436
				argEx()
				}
				}
				this.state = 441
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 442
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
		fun findValNotInit() : ValNotInitContext? = getRuleContext(solver.getType("ValNotInitContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  val_() : Val_Context {
		var _localctx : Val_Context = Val_Context(context, state)
		enterRule(_localctx, 60, Rules.RULE_val_.id)
		try {
			this.state = 446
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,59,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 444
			valSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 445
			valNotInit()
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
		fun findVarNotInit() : VarNotInitContext? = getRuleContext(solver.getType("VarNotInitContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  var_() : Var_Context {
		var _localctx : Var_Context = Var_Context(context, state)
		enterRule(_localctx, 62, Rules.RULE_var_.id)
		try {
			this.state = 450
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,60,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 448
			varSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 449
			varNotInit()
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

	open class ValNotInitContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_valNotInit.id
	        set(value) { throw RuntimeException() }
		fun VAL() : TerminalNode? = getToken(FoldingParser.Tokens.VAL.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  valNotInit() : ValNotInitContext {
		var _localctx : ValNotInitContext = ValNotInitContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_valNotInit.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 452
			match(VAL) as Token
			this.state = 453
			match(ID) as Token
			this.state = 454
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

	open class VarNotInitContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_varNotInit.id
	        set(value) { throw RuntimeException() }
		fun VAR() : TerminalNode? = getToken(FoldingParser.Tokens.VAR.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  varNotInit() : VarNotInitContext {
		var _localctx : VarNotInitContext = VarNotInitContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_varNotInit.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 456
			match(VAR) as Token
			this.state = 457
			match(ID) as Token
			this.state = 458
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
		enterRule(_localctx, 68, Rules.RULE_valSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 460
			match(VAL) as Token
			this.state = 461
			match(ID) as Token
			this.state = 463
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 462
				typeEx()
				}
			}

			this.state = 465
			match(ASSGIN) as Token
			this.state = 466
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
		enterRule(_localctx, 70, Rules.RULE_varSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 468
			match(VAR) as Token
			this.state = 469
			match(ID) as Token
			this.state = 471
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 470
				typeEx()
				}
			}

			this.state = 473
			match(ASSGIN) as Token
			this.state = 474
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
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun findForeignBody() : ForeignBodyContext? = getRuleContext(solver.getType("ForeignBodyContext"),0)
		fun TEMPLATE() : TerminalNode? = getToken(FoldingParser.Tokens.TEMPLATE.id, 0)
		fun RawString() : TerminalNode? = getToken(FoldingParser.Tokens.RawString.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  def() : DefContext {
		var _localctx : DefContext = DefContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_def.id)
		var _la: Int
		try {
			this.state = 652
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,105,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 477
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 476
				annotationBlock()
				}
			}

			this.state = 479
			match(ID) as Token
			this.state = 481
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 480
				compiledId()
				}
			}

			this.state = 484
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 483
				typeParam()
				}
			}

			this.state = 487
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 486
				parameter()
				}
			}

			this.state = 489
			match(BIGARROW) as Token
			this.state = 492
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 490
				match(COLON) as Token
				this.state = 491
				typeEx()
				}
			}

			this.state = 494
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 496
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 495
				annotationBlock()
				}
			}

			this.state = 498
			opIdWrap()
			this.state = 500
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 499
				compiledId()
				}
			}

			this.state = 503
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 502
				typeParam()
				}
			}

			this.state = 505
			opParameter()
			this.state = 506
			match(BIGARROW) as Token
			this.state = 509
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 507
				match(COLON) as Token
				this.state = 508
				typeEx()
				}
			}

			this.state = 511
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 514
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 513
				annotationBlock()
				}
			}

			this.state = 516
			aopIdWrap()
			this.state = 518
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 517
				compiledId()
				}
			}

			this.state = 521
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 520
				typeParam()
				}
			}

			this.state = 523
			aopParameter()
			this.state = 524
			match(BIGARROW) as Token
			this.state = 527
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 525
				match(COLON) as Token
				this.state = 526
				typeEx()
				}
			}

			this.state = 529
			value(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 532
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 531
				annotationBlock()
				}
			}

			this.state = 534
			match(ID) as Token
			this.state = 536
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 535
				compiledId()
				}
			}

			this.state = 539
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 538
				typeParam()
				}
			}

			this.state = 542
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 541
				parameter()
				}
			}

			this.state = 544
			match(FOREIGN) as Token
			this.state = 545
			typeEx()
			this.state = 547
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 546
				foreignBody()
				}
			}

			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 550
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 549
				annotationBlock()
				}
			}

			this.state = 552
			opIdWrap()
			this.state = 554
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 553
				compiledId()
				}
			}

			this.state = 557
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 556
				typeParam()
				}
			}

			this.state = 559
			opParameter()
			this.state = 560
			match(FOREIGN) as Token
			this.state = 561
			typeEx()
			this.state = 563
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 562
				foreignBody()
				}
			}

			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 566
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 565
				annotationBlock()
				}
			}

			this.state = 568
			aopIdWrap()
			this.state = 570
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 569
				compiledId()
				}
			}

			this.state = 573
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 572
				typeParam()
				}
			}

			this.state = 575
			aopParameter()
			this.state = 576
			match(FOREIGN) as Token
			this.state = 577
			typeEx()
			this.state = 579
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 578
				foreignBody()
				}
			}

			}}
			7 -> {
			enterOuterAlt(_localctx, 7)
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
			match(TEMPLATE) as Token
			this.state = 585
			match(ID) as Token
			this.state = 587
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 586
				compiledId()
				}
			}

			this.state = 590
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 589
				typeParam()
				}
			}

			this.state = 593
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COLON) {
				if (true){
				this.state = 592
				parameter()
				}
			}

			this.state = 604
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 595
			match(FOREIGN) as Token
			this.state = 596
			typeEx()
			this.state = 598
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 597
				foreignBody()
				}
			}

			}}
			BIGARROW  ->  /*LL1AltBlock*/{if (true){
			this.state = 600
			match(BIGARROW) as Token
			this.state = 601
			typeEx()
			this.state = 602
			match(RawString) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			8 -> {
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 607
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 606
				annotationBlock()
				}
			}

			this.state = 609
			match(TEMPLATE) as Token
			this.state = 610
			opIdWrap()
			this.state = 612
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 611
				compiledId()
				}
			}

			this.state = 615
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 614
				typeParam()
				}
			}

			this.state = 617
			opParameter()
			this.state = 627
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 618
			match(FOREIGN) as Token
			this.state = 619
			typeEx()
			this.state = 621
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 620
				foreignBody()
				}
			}

			}}
			BIGARROW  ->  /*LL1AltBlock*/{if (true){
			this.state = 623
			match(BIGARROW) as Token
			this.state = 624
			typeEx()
			this.state = 625
			match(RawString) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			9 -> {
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 630
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 629
				annotationBlock()
				}
			}

			this.state = 632
			match(TEMPLATE) as Token
			this.state = 633
			aopIdWrap()
			this.state = 635
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Sharp) {
				if (true){
				this.state = 634
				compiledId()
				}
			}

			this.state = 638
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 637
				typeParam()
				}
			}

			this.state = 640
			aopParameter()
			this.state = 650
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 641
			match(FOREIGN) as Token
			this.state = 642
			typeEx()
			this.state = 644
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 643
				foreignBody()
				}
			}

			}}
			BIGARROW  ->  /*LL1AltBlock*/{if (true){
			this.state = 646
			match(BIGARROW) as Token
			this.state = 647
			typeEx()
			this.state = 648
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
		enterRule(_localctx, 74, Rules.RULE_compiledId.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 654
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
		enterRule(_localctx, 76, Rules.RULE_lambdaParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 656
			match(ID) as Token
			this.state = 662
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 657
				match(TILDE) as Token
				this.state = 658
				typeEx()
				this.state = 660
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				if (_la==ELLIPSIS) {
					if (true){
					this.state = 659
					match(ELLIPSIS) as Token
					}
				}

				}
			}

			this.state = 666
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 664
				match(ASSGIN) as Token
				this.state = 665
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
		enterRule(_localctx, 78, Rules.RULE_lambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 668
			match(LSQUARE) as Token
			this.state = 672
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,109,context) ) {
			1   -> if (true){
			this.state = 669
			typeParam()
			this.state = 670
			match(COLON) as Token
			}
			}
			this.state = 677
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 674
				lambdaParamEx()
				}
				}
				this.state = 679
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 680
			match(RSQUARE) as Token
			this.state = 681
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
		enterRule(_localctx, 80, Rules.RULE_opIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 683
			match(LSQUARE) as Token
			this.state = 684
			match(OPID) as Token
			this.state = 685
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
		enterRule(_localctx, 82, Rules.RULE_aopIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 687
			match(LSQUARE) as Token
			this.state = 688
			match(TILDE) as Token
			this.state = 689
			match(OPID) as Token
			this.state = 690
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
		enterRule(_localctx, 84, Rules.RULE_typeEx.id)
		try {
			this.state = 694
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 692
			typeExParameter()
			}}
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 693
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
		enterRule(_localctx, 86, Rules.RULE_typeExSingle.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 699
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,112,context) ) {
			1   -> if (true){
			this.state = 696
			package_()
			this.state = 697
			match(DOT) as Token
			}
			}
			this.state = 701
			match(ID) as Token
			this.state = 710
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,114,context) ) {
			1   -> if (true){
			this.state = 702
			match(LPAREN) as Token
			this.state = 704 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 703
				typeEx()
				}
				}
				this.state = 706 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==LPAREN || _la==ID )
			this.state = 708
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
		enterRule(_localctx, 88, Rules.RULE_typeExParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 712
			typeEx()
			this.state = 714
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 713
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
		enterRule(_localctx, 90, Rules.RULE_typeExParameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 716
			match(LPAREN) as Token
			this.state = 720
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN || _la==ID) {
				if (true){
				if (true){
				this.state = 717
				typeExParamEx()
				}
				}
				this.state = 722
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 723
			match(RPAREN) as Token
			this.state = 724
			match(ARROW) as Token
			this.state = 725
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
			this.state = 727
			match(LBRACE) as Token
			this.state = 731
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 728
				foreignElement()
				}
				}
				this.state = 733
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 734
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
			this.state = 743
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,118,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 736
			foreignPlatform()
			this.state = 737
			match(RawString) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 739
			foreignPlatform()
			this.state = 740
			match(TILDE) as Token
			this.state = 741
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
			this.state = 745
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
			this.state = 747
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
			this.state = 749
			match(ID) as Token
			this.state = 750
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
			this.state = 752
			match(ANNOTATION) as Token
			this.state = 753
			match(ID) as Token
			this.state = 762
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 754
				match(LPAREN) as Token
				this.state = 758
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==ID) {
					if (true){
					if (true){
					this.state = 755
					annoParam()
					}
					}
					this.state = 760
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				this.state = 761
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
			this.state = 780
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,123,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 764
			match(ID) as Token
			this.state = 768
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 765
				annoValue()
				}
				}
				this.state = 770
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 771
			match(ID) as Token
			this.state = 772
			match(LPAREN) as Token
			this.state = 776
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 773
				annoValue()
				}
				}
				this.state = 778
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 779
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
			this.state = 782
			match(LCOLONSQUARE) as Token
			this.state = 786
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 783
				annotation()
				}
				}
				this.state = 788
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 789
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
			this.state = 791
			match(Sharp) as Token
			this.state = 792
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
		    0 -> return precpred(context!!, 6)
		    1 -> return precpred(context!!, 8)
		    2 -> return precpred(context!!, 3)
		    3 -> return precpred(context!!, 1)
		}
		return true
	}

}