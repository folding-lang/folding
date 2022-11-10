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
                                                              FoldingParser.ConstructorSelfContext::class,
                                                              FoldingParser.DefInInterfaceContext::class,
                                                              FoldingParser.ImplContext::class,
                                                              FoldingParser.ImplBodyContext::class,
                                                              FoldingParser.DefInImplContext::class,
                                                              FoldingParser.NewsetContext::class,
                                                              FoldingParser.TypeParamContext::class,
                                                              FoldingParser.TypeParamCompoContext::class,
                                                              FoldingParser.DefinitionContext::class,
                                                              FoldingParser.ValueContext::class,
                                                              FoldingParser.TypeCastingContext::class,
                                                              FoldingParser.ParamExContext::class,
                                                              FoldingParser.ParameterContext::class,
                                                              FoldingParser.OpParameterContext::class,
                                                              FoldingParser.AopParameterContext::class,
                                                              FoldingParser.ArgExContext::class,
                                                              FoldingParser.ArgValueContext::class,
                                                              FoldingParser.FieldContext::class,
                                                              FoldingParser.FieldNotInitContext::class,
                                                              FoldingParser.FieldSettedContext::class,
                                                              FoldingParser.DefContext::class,
                                                              FoldingParser.JustDefContext::class,
                                                              FoldingParser.TemplateContext::class,
                                                              FoldingParser.ForeignDefContext::class,
                                                              FoldingParser.CompiledIdContext::class,
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
        Literal(1),
        WS(2),
        COMMENT(3),
        LINE_COMMENT(4),
        ABSTRACT(5),
        ANNOTATION(6),
        CLASS(7),
        DO(8),
        FOREIGN(9),
        TEMPLATE(10),
        NAMESPACE(11),
        INTERNAL(12),
        IMPORT(13),
        IMPL(14),
        RETURN(15),
        MUTABLE(16),
        FIELD(17),
        STATIC(18),
        NEWSET(19),
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
        ID(34),
        OPID(35),
        Integer(36),
        Double(37),
        String(38),
        RawString(39)
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
        RULE_constructorSelf(12),
        RULE_defInInterface(13),
        RULE_impl(14),
        RULE_implBody(15),
        RULE_defInImpl(16),
        RULE_newset(17),
        RULE_typeParam(18),
        RULE_typeParamCompo(19),
        RULE_definition(20),
        RULE_value(21),
        RULE_typeCasting(22),
        RULE_paramEx(23),
        RULE_parameter(24),
        RULE_opParameter(25),
        RULE_aopParameter(26),
        RULE_argEx(27),
        RULE_argValue(28),
        RULE_field(29),
        RULE_fieldNotInit(30),
        RULE_fieldSetted(31),
        RULE_def(32),
        RULE_justDef(33),
        RULE_template(34),
        RULE_foreignDef(35),
        RULE_compiledId(36),
        RULE_lambda(37),
        RULE_opIdWrap(38),
        RULE_aopIdWrap(39),
        RULE_typeEx(40),
        RULE_typeExSingle(41),
        RULE_typeExParamEx(42),
        RULE_typeExParameter(43),
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

        val ruleNames = arrayOf("file", "importEx", "importVanila", "package_", 
                                "namespace", "doBlock", "compo", "returning", 
                                "fieldAssign", "class_", "classBody", "constructor_", 
                                "constructorSelf", "defInInterface", "impl", 
                                "implBody", "defInImpl", "newset", "typeParam", 
                                "typeParamCompo", "definition", "value", 
                                "typeCasting", "paramEx", "parameter", "opParameter", 
                                "aopParameter", "argEx", "argValue", "field", 
                                "fieldNotInit", "fieldSetted", "def", "justDef", 
                                "template", "foreignDef", "compiledId", 
                                "lambda", "opIdWrap", "aopIdWrap", "typeEx", 
                                "typeExSingle", "typeExParamEx", "typeExParameter", 
                                "foreignBody", "foreignElement", "foreignPlatform", 
                                "annoValue", "annoParam", "annotationDef", 
                                "annotation", "annotationBlock")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
                                                          null, null, "'abstract'", 
                                                          "'annotation'", 
                                                          "'class'", "'do'", 
                                                          "'foreign'", "'template'", 
                                                          "'package'", "'internal'", 
                                                          "'import'", "'impl'", 
                                                          "'return'", "'mutable'", 
                                                          "'field'", "'static'", 
                                                          "'newset'", "'='", 
                                                          "'...'", "'.'", 
                                                          "'('", "')'", 
                                                          "'['", "'[:'", 
                                                          "']'", "':]'", 
                                                          "'{'", "'}'", 
                                                          "'->'", "'~'", 
                                                          "':'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "Literal", 
                                                           "WS", "COMMENT", 
                                                           "LINE_COMMENT", 
                                                           "ABSTRACT", "ANNOTATION", 
                                                           "CLASS", "DO", 
                                                           "FOREIGN", "TEMPLATE", 
                                                           "NAMESPACE", 
                                                           "INTERNAL", "IMPORT", 
                                                           "IMPL", "RETURN", 
                                                           "MUTABLE", "FIELD", 
                                                           "STATIC", "NEWSET", 
                                                           "ASSGIN", "ELLIPSIS", 
                                                           "DOT", "LPAREN", 
                                                           "RPAREN", "LSQUARE", 
                                                           "LCOLONSQUARE", 
                                                           "RSQUARE", "RCOLONSQUARE", 
                                                           "LBRACE", "RBRACE", 
                                                           "ARROW", "TILDE", 
                                                           "COLON", "ID", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0029\u02df\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0003\u0002\u0005\u0002\u006c\u000a\u0002\u0003\u0002\u0007\u0002\u006f\u000a\u0002\u000c\u0002\u000e\u0002\u0072\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u0078\u000a\u0002\u000c\u0002\u000e\u0002\u007b\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0007\u0005\u0085\u000a\u0005\u000c\u0005\u000e\u0005\u0088\u000b\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u0090\u000a\u0007\u000c\u0007\u000e\u0007\u0093\u000b\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u009a\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0005\u000b\u00a4\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u00a9\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0007\u000c\u00af\u000a\u000c\u000c\u000c\u000e\u000c\u00b2\u000b\u000c\u0003\u000c\u0005\u000c\u00b5\u000a\u000c\u0003\u000c\u0007\u000c\u00b8\u000a\u000c\u000c\u000c\u000e\u000c\u00bb\u000b\u000c\u0003\u000c\u0007\u000c\u00be\u000a\u000c\u000c\u000c\u000e\u000c\u00c1\u000b\u000c\u0003\u000c\u0007\u000c\u00c4\u000a\u000c\u000c\u000c\u000e\u000c\u00c7\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0005\u000d\u00cd\u000a\u000d\u0003\u000d\u0005\u000d\u00d0\u000a\u000d\u0003\u000e\u0005\u000e\u00d3\u000a\u000e\u0003\u000e\u0005\u000e\u00d6\u000a\u000e\u0003\u000f\u0005\u000f\u00d9\u000a\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00dd\u000a\u000f\u0003\u000f\u0005\u000f\u00e0\u000a\u000f\u0003\u000f\u0005\u000f\u00e3\u000a\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00e7\u000a\u000f\u0003\u0010\u0003\u0010\u0005\u0010\u00eb\u000a\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u00ef\u000a\u0010\u0003\u0011\u0003\u0011\u0007\u0011\u00f3\u000a\u0011\u000c\u0011\u000e\u0011\u00f6\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0005\u0012\u00fb\u000a\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u00ff\u000a\u0012\u0003\u0012\u0005\u0012\u0102\u000a\u0012\u0003\u0012\u0005\u0012\u0105\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0005\u0013\u010c\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0007\u0013\u0112\u000a\u0013\u000c\u0013\u000e\u0013\u0115\u000b\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0006\u0014\u011a\u000a\u0014\u000d\u0014\u000e\u0014\u011b\u0003\u0015\u0003\u0015\u0003\u0015\u0007\u0015\u0121\u000a\u0015\u000c\u0015\u000e\u0015\u0124\u000b\u0015\u0003\u0016\u0003\u0016\u0005\u0016\u0128\u000a\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0132\u000a\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0138\u000a\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u013e\u000a\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0149\u000a\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0007\u0017\u0155\u000a\u0017\u000c\u0017\u000e\u0017\u0158\u000b\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0005\u0019\u015e\u000a\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u0165\u000a\u0019\u0003\u0019\u0005\u0019\u0168\u000a\u0019\u0003\u001a\u0003\u001a\u0006\u001a\u016c\u000a\u001a\u000d\u001a\u000e\u001a\u016d\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0005\u001d\u017d\u000a\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u0181\u000a\u001d\u0003\u001d\u0003\u001d\u0007\u001d\u0185\u000a\u001d\u000c\u001d\u000e\u001d\u0188\u000b\u001d\u0003\u001d\u0005\u001d\u018b\u000a\u001d\u0003\u001e\u0003\u001e\u0006\u001e\u018f\u000a\u001e\u000d\u001e\u000e\u001e\u0190\u0005\u001e\u0193\u000a\u001e\u0003\u001e\u0003\u001e\u0007\u001e\u0197\u000a\u001e\u000c\u001e\u000e\u001e\u019a\u000b\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0005\u001f\u01a0\u000a\u001f\u0003\u0020\u0003\u0020\u0005\u0020\u01a4\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0005\u0021\u01ab\u000a\u0021\u0003\u0021\u0003\u0021\u0005\u0021\u01af\u000a\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0005\u0022\u01b7\u000a\u0022\u0003\u0023\u0005\u0023\u01ba\u000a\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u01be\u000a\u0023\u0003\u0023\u0005\u0023\u01c1\u000a\u0023\u0003\u0023\u0005\u0023\u01c4\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u01cb\u000a\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u01cf\u000a\u0023\u0003\u0023\u0005\u0023\u01d2\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u01da\u000a\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u01de\u000a\u0023\u0003\u0023\u0005\u0023\u01e1\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u01e8\u000a\u0023\u0003\u0024\u0005\u0024\u01eb\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01f0\u000a\u0024\u0003\u0024\u0005\u0024\u01f3\u000a\u0024\u0003\u0024\u0005\u0024\u01f6\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01fb\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0201\u000a\u0024\u0003\u0024\u0005\u0024\u0204\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0209\u000a\u0024\u0003\u0024\u0005\u0024\u020c\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0212\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0218\u000a\u0024\u0003\u0024\u0005\u0024\u021b\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0220\u000a\u0024\u0003\u0024\u0005\u0024\u0223\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u0229\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u022f\u000a\u0024\u0005\u0024\u0231\u000a\u0024\u0003\u0025\u0005\u0025\u0234\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0238\u000a\u0025\u0003\u0025\u0005\u0025\u023b\u000a\u0025\u0003\u0025\u0005\u0025\u023e\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0243\u000a\u0025\u0003\u0025\u0005\u0025\u0246\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u024a\u000a\u0025\u0003\u0025\u0005\u0025\u024d\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0253\u000a\u0025\u0003\u0025\u0005\u0025\u0256\u000a\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u025a\u000a\u0025\u0003\u0025\u0005\u0025\u025d\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0005\u0025\u0263\u000a\u0025\u0005\u0025\u0265\u000a\u0025\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0007\u0027\u026b\u000a\u0027\u000c\u0027\u000e\u0027\u026e\u000b\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0005\u002a\u027e\u000a\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0283\u000a\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0006\u002b\u0288\u000a\u002b\u000d\u002b\u000e\u002b\u0289\u0003\u002b\u0003\u002b\u0005\u002b\u028e\u000a\u002b\u0003\u002c\u0003\u002c\u0005\u002c\u0292\u000a\u002c\u0003\u002d\u0003\u002d\u0007\u002d\u0296\u000a\u002d\u000c\u002d\u000e\u002d\u0299\u000b\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0007\u002e\u02a1\u000a\u002e\u000c\u002e\u000e\u002e\u02a4\u000b\u002e\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0005\u002f\u02af\u000a\u002f\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0007\u0033\u02bc\u000a\u0033\u000c\u0033\u000e\u0033\u02bf\u000b\u0033\u0003\u0033\u0005\u0033\u02c2\u000a\u0033\u0003\u0034\u0003\u0034\u0007\u0034\u02c6\u000a\u0034\u000c\u0034\u000e\u0034\u02c9\u000b\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0007\u0034\u02ce\u000a\u0034\u000c\u0034\u000e\u0034\u02d1\u000b\u0034\u0003\u0034\u0005\u0034\u02d4\u000a\u0034\u0003\u0035\u0003\u0035\u0007\u0035\u02d8\u000a\u0035\u000c\u0035\u000e\u0035\u02db\u000b\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0002\u0003\u002c\u0036\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u0002\u0003\u0003\u0002\u0026\u0028\u0002\u032e\u0002\u006b\u0003\u0002\u0002\u0002\u0004\u007c\u0003\u0002\u0002\u0002\u0006\u007e\u0003\u0002\u0002\u0002\u0008\u0081\u0003\u0002\u0002\u0002\u000a\u0089\u0003\u0002\u0002\u0002\u000c\u008c\u0003\u0002\u0002\u0002\u000e\u0099\u0003\u0002\u0002\u0002\u0010\u009b\u0003\u0002\u0002\u0002\u0012\u009e\u0003\u0002\u0002\u0002\u0014\u00a3\u0003\u0002\u0002\u0002\u0016\u00ac\u0003\u0002\u0002\u0002\u0018\u00ca\u0003\u0002\u0002\u0002\u001a\u00d2\u0003\u0002\u0002\u0002\u001c\u00d8\u0003\u0002\u0002\u0002\u001e\u00e8\u0003\u0002\u0002\u0002\u0020\u00f0\u0003\u0002\u0002\u0002\u0022\u00fa\u0003\u0002\u0002\u0002\u0024\u010b\u0003\u0002\u0002\u0002\u0026\u0119\u0003\u0002\u0002\u0002\u0028\u011d\u0003\u0002\u0002\u0002\u002a\u0127\u0003\u0002\u0002\u0002\u002c\u0148\u0003\u0002\u0002\u0002\u002e\u0159\u0003\u0002\u0002\u0002\u0030\u0167\u0003\u0002\u0002\u0002\u0032\u0169\u0003\u0002\u0002\u0002\u0034\u0171\u0003\u0002\u0002\u0002\u0036\u0176\u0003\u0002\u0002\u0002\u0038\u018a\u0003\u0002\u0002\u0002\u003a\u0192\u0003\u0002\u0002\u0002\u003c\u019f\u0003\u0002\u0002\u0002\u003e\u01a1\u0003\u0002\u0002\u0002\u0040\u01a8\u0003\u0002\u0002\u0002\u0042\u01b6\u0003\u0002\u0002\u0002\u0044\u01e7\u0003\u0002\u0002\u0002\u0046\u0230\u0003\u0002\u0002\u0002\u0048\u0264\u0003\u0002\u0002\u0002\u004a\u0266\u0003\u0002\u0002\u0002\u004c\u0268\u0003\u0002\u0002\u0002\u004e\u0272\u0003\u0002\u0002\u0002\u0050\u0276\u0003\u0002\u0002\u0002\u0052\u027d\u0003\u0002\u0002\u0002\u0054\u0282\u0003\u0002\u0002\u0002\u0056\u028f\u0003\u0002\u0002\u0002\u0058\u0293\u0003\u0002\u0002\u0002\u005a\u029e\u0003\u0002\u0002\u0002\u005c\u02ae\u0003\u0002\u0002\u0002\u005e\u02b0\u0003\u0002\u0002\u0002\u0060\u02b2\u0003\u0002\u0002\u0002\u0062\u02b4\u0003\u0002\u0002\u0002\u0064\u02b7\u0003\u0002\u0002\u0002\u0066\u02d3\u0003\u0002\u0002\u0002\u0068\u02d5\u0003\u0002\u0002\u0002\u006a\u006c\u0005\u000a\u0006\u0002\u006b\u006a\u0003\u0002\u0002\u0002\u006b\u006c\u0003\u0002\u0002\u0002\u006c\u0070\u0003\u0002\u0002\u0002\u006d\u006f\u0005\u0004\u0003\u0002\u006e\u006d\u0003\u0002\u0002\u0002\u006f\u0072\u0003\u0002\u0002\u0002\u0070\u006e\u0003\u0002\u0002\u0002\u0070\u0071\u0003\u0002\u0002\u0002\u0071\u0079\u0003\u0002\u0002\u0002\u0072\u0070\u0003\u0002\u0002\u0002\u0073\u0078\u0005\u002a\u0016\u0002\u0074\u0078\u0005\u003c\u001f\u0002\u0075\u0078\u0005\u0064\u0033\u0002\u0076\u0078\u0005\u0024\u0013\u0002\u0077\u0073\u0003\u0002\u0002\u0002\u0077\u0074\u0003\u0002\u0002\u0002\u0077\u0075\u0003\u0002\u0002\u0002\u0077\u0076\u0003\u0002\u0002\u0002\u0078\u007b\u0003\u0002\u0002\u0002\u0079\u0077\u0003\u0002\u0002\u0002\u0079\u007a\u0003\u0002\u0002\u0002\u007a\u0003\u0003\u0002\u0002\u0002\u007b\u0079\u0003\u0002\u0002\u0002\u007c\u007d\u0005\u0006\u0004\u0002\u007d\u0005\u0003\u0002\u0002\u0002\u007e\u007f\u0007\u000f\u0002\u0002\u007f\u0080\u0005\u0008\u0005\u0002\u0080\u0007\u0003\u0002\u0002\u0002\u0081\u0086\u0007\u0024\u0002\u0002\u0082\u0083\u0007\u0018\u0002\u0002\u0083\u0085\u0007\u0024\u0002\u0002\u0084\u0082\u0003\u0002\u0002\u0002\u0085\u0088\u0003\u0002\u0002\u0002\u0086\u0084\u0003\u0002\u0002\u0002\u0086\u0087\u0003\u0002\u0002\u0002\u0087\u0009\u0003\u0002\u0002\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0089\u008a\u0007\u000d\u0002\u0002\u008a\u008b\u0005\u0008\u0005\u0002\u008b\u000b\u0003\u0002\u0002\u0002\u008c\u008d\u0007\u000a\u0002\u0002\u008d\u0091\u0007\u001f\u0002\u0002\u008e\u0090\u0005\u000e\u0008\u0002\u008f\u008e\u0003\u0002\u0002\u0002\u0090\u0093\u0003\u0002\u0002\u0002\u0091\u008f\u0003\u0002\u0002\u0002\u0091\u0092\u0003\u0002\u0002\u0002\u0092\u0094\u0003\u0002\u0002\u0002\u0093\u0091\u0003\u0002\u0002\u0002\u0094\u0095\u0007\u0020\u0002\u0002\u0095\u000d\u0003\u0002\u0002\u0002\u0096\u009a\u0005\u0012\u000a\u0002\u0097\u009a\u0005\u002c\u0017\u0002\u0098\u009a\u0005\u0010\u0009\u0002\u0099\u0096\u0003\u0002\u0002\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u0099\u0098\u0003\u0002\u0002\u0002\u009a\u000f\u0003\u0002\u0002\u0002\u009b\u009c\u0007\u0011\u0002\u0002\u009c\u009d\u0005\u002c\u0017\u0002\u009d\u0011\u0003\u0002\u0002\u0002\u009e\u009f\u0005\u002c\u0017\u0002\u009f\u00a0\u0007\u0016\u0002\u0002\u00a0\u00a1\u0005\u002c\u0017\u0002\u00a1\u0013\u0003\u0002\u0002\u0002\u00a2\u00a4\u0005\u0068\u0035\u0002\u00a3\u00a2\u0003\u0002\u0002\u0002\u00a3\u00a4\u0003\u0002\u0002\u0002\u00a4\u00a5\u0003\u0002\u0002\u0002\u00a5\u00a6\u0007\u0009\u0002\u0002\u00a6\u00a8\u0007\u0024\u0002\u0002\u00a7\u00a9\u0005\u0026\u0014\u0002\u00a8\u00a7\u0003\u0002\u0002\u0002\u00a8\u00a9\u0003\u0002\u0002\u0002\u00a9\u00aa\u0003\u0002\u0002\u0002\u00aa\u00ab\u0005\u0016\u000c\u0002\u00ab\u0015\u0003\u0002\u0002\u0002\u00ac\u00b4\u0007\u001f\u0002\u0002\u00ad\u00af\u0005\u0018\u000d\u0002\u00ae\u00ad\u0003\u0002\u0002\u0002\u00af\u00b2\u0003\u0002\u0002\u0002\u00b0\u00ae\u0003\u0002\u0002\u0002\u00b0\u00b1\u0003\u0002\u0002\u0002\u00b1\u00b5\u0003\u0002\u0002\u0002\u00b2\u00b0\u0003\u0002\u0002\u0002\u00b3\u00b5\u0005\u001a\u000e\u0002\u00b4\u00b0\u0003\u0002\u0002\u0002\u00b4\u00b3\u0003\u0002\u0002\u0002\u00b5\u00b9\u0003\u0002\u0002\u0002\u00b6\u00b8\u0005\u003c\u001f\u0002\u00b7\u00b6\u0003\u0002\u0002\u0002\u00b8\u00bb\u0003\u0002\u0002\u0002\u00b9\u00b7\u0003\u0002\u0002\u0002\u00b9\u00ba\u0003\u0002\u0002\u0002\u00ba\u00bf\u0003\u0002\u0002\u0002\u00bb\u00b9\u0003\u0002\u0002\u0002\u00bc\u00be\u0005\u001c\u000f\u0002\u00bd\u00bc\u0003\u0002\u0002\u0002\u00be\u00c1\u0003\u0002\u0002\u0002\u00bf\u00bd\u0003\u0002\u0002\u0002\u00bf\u00c0\u0003\u0002\u0002\u0002\u00c0\u00c5\u0003\u0002\u0002\u0002\u00c1\u00bf\u0003\u0002\u0002\u0002\u00c2\u00c4\u0005\u001e\u0010\u0002\u00c3\u00c2\u0003\u0002\u0002\u0002\u00c4\u00c7\u0003\u0002\u0002\u0002\u00c5\u00c3\u0003\u0002\u0002\u0002\u00c5\u00c6\u0003\u0002\u0002\u0002\u00c6\u00c8\u0003\u0002\u0002\u0002\u00c7\u00c5\u0003\u0002\u0002\u0002\u00c8\u00c9\u0007\u0020\u0002\u0002\u00c9\u0017\u0003\u0002\u0002\u0002\u00ca\u00cc\u0007\u0024\u0002\u0002\u00cb\u00cd\u0005\u0032\u001a\u0002\u00cc\u00cb\u0003\u0002\u0002\u0002\u00cc\u00cd\u0003\u0002\u0002\u0002\u00cd\u00cf\u0003\u0002\u0002\u0002\u00ce\u00d0\u0005\u000c\u0007\u0002\u00cf\u00ce\u0003\u0002\u0002\u0002\u00cf\u00d0\u0003\u0002\u0002\u0002\u00d0\u0019\u0003\u0002\u0002\u0002\u00d1\u00d3\u0005\u0032\u001a\u0002\u00d2\u00d1\u0003\u0002\u0002\u0002\u00d2\u00d3\u0003\u0002\u0002\u0002\u00d3\u00d5\u0003\u0002\u0002\u0002\u00d4\u00d6\u0005\u000c\u0007\u0002\u00d5\u00d4\u0003\u0002\u0002\u0002\u00d5\u00d6\u0003\u0002\u0002\u0002\u00d6\u001b\u0003\u0002\u0002\u0002\u00d7\u00d9\u0005\u0068\u0035\u0002\u00d8\u00d7\u0003\u0002\u0002\u0002\u00d8\u00d9\u0003\u0002\u0002\u0002\u00d9\u00da\u0003\u0002\u0002\u0002\u00da\u00dc\u0007\u0024\u0002\u0002\u00db\u00dd\u0005\u004a\u0026\u0002\u00dc\u00db\u0003\u0002\u0002\u0002\u00dc\u00dd\u0003\u0002\u0002\u0002\u00dd\u00df\u0003\u0002\u0002\u0002\u00de\u00e0\u0005\u0026\u0014\u0002\u00df\u00de\u0003\u0002\u0002\u0002\u00df\u00e0\u0003\u0002\u0002\u0002\u00e0\u00e2\u0003\u0002\u0002\u0002\u00e1\u00e3\u0005\u0032\u001a\u0002\u00e2\u00e1\u0003\u0002\u0002\u0002\u00e2\u00e3\u0003\u0002\u0002\u0002\u00e3\u00e4\u0003\u0002\u0002\u0002\u00e4\u00e6\u0005\u0052\u002a\u0002\u00e5\u00e7\u0005\u002c\u0017\u0002\u00e6\u00e5\u0003\u0002\u0002\u0002\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u001d\u0003\u0002\u0002\u0002\u00e8\u00ea\u0007\u0010\u0002\u0002\u00e9\u00eb\u0005\u0026\u0014\u0002\u00ea\u00e9\u0003\u0002\u0002\u0002\u00ea\u00eb\u0003\u0002\u0002\u0002\u00eb\u00ec\u0003\u0002\u0002\u0002\u00ec\u00ee\u0005\u0052\u002a\u0002\u00ed\u00ef\u0005\u0020\u0011\u0002\u00ee\u00ed\u0003\u0002\u0002\u0002\u00ee\u00ef\u0003\u0002\u0002\u0002\u00ef\u001f\u0003\u0002\u0002\u0002\u00f0\u00f4\u0007\u001f\u0002\u0002\u00f1\u00f3\u0005\u0022\u0012\u0002\u00f2\u00f1\u0003\u0002\u0002\u0002\u00f3\u00f6\u0003\u0002\u0002\u0002\u00f4\u00f2\u0003\u0002\u0002\u0002\u00f4\u00f5\u0003\u0002\u0002\u0002\u00f5\u00f7\u0003\u0002\u0002\u0002\u00f6\u00f4\u0003\u0002\u0002\u0002\u00f7\u00f8\u0007\u0020\u0002\u0002\u00f8\u0021\u0003\u0002\u0002\u0002\u00f9\u00fb\u0005\u0068\u0035\u0002\u00fa\u00f9\u0003\u0002\u0002\u0002\u00fa\u00fb\u0003\u0002\u0002\u0002\u00fb\u00fc\u0003\u0002\u0002\u0002\u00fc\u00fe\u0007\u0024\u0002\u0002\u00fd\u00ff\u0005\u004a\u0026\u0002\u00fe\u00fd\u0003\u0002\u0002\u0002\u00fe\u00ff\u0003\u0002\u0002\u0002\u00ff\u0101\u0003\u0002\u0002\u0002\u0100\u0102\u0005\u0026\u0014\u0002\u0101\u0100\u0003\u0002\u0002\u0002\u0101\u0102\u0003\u0002\u0002\u0002\u0102\u0104\u0003\u0002\u0002\u0002\u0103\u0105\u0005\u0032\u001a\u0002\u0104\u0103\u0003\u0002\u0002\u0002\u0104\u0105\u0003\u0002\u0002\u0002\u0105\u0106\u0003\u0002\u0002\u0002\u0106\u0107\u0005\u0052\u002a\u0002\u0107\u0108\u0007\u0016\u0002\u0002\u0108\u0109\u0005\u002c\u0017\u0002\u0109\u0023\u0003\u0002\u0002\u0002\u010a\u010c\u0005\u0068\u0035\u0002\u010b\u010a\u0003\u0002\u0002\u0002\u010b\u010c\u0003\u0002\u0002\u0002\u010c\u010d\u0003\u0002\u0002\u0002\u010d\u010e\u0007\u0015\u0002\u0002\u010e\u010f\u0007\u0024\u0002\u0002\u010f\u0113\u0007\u001f\u0002\u0002\u0110\u0112\u0007\u0003\u0002\u0002\u0111\u0110\u0003\u0002\u0002\u0002\u0112\u0115\u0003\u0002\u0002\u0002\u0113\u0111\u0003\u0002\u0002\u0002\u0113\u0114\u0003\u0002\u0002\u0002\u0114\u0116\u0003\u0002\u0002\u0002\u0115\u0113\u0003\u0002\u0002\u0002\u0116\u0117\u0007\u0020\u0002\u0002\u0117\u0025\u0003\u0002\u0002\u0002\u0118\u011a\u0005\u0028\u0015\u0002\u0119\u0118\u0003\u0002\u0002\u0002\u011a\u011b\u0003\u0002\u0002\u0002\u011b\u0119\u0003\u0002\u0002\u0002\u011b\u011c\u0003\u0002\u0002\u0002\u011c\u0027\u0003\u0002\u0002\u0002\u011d\u0122\u0007\u0024\u0002\u0002\u011e\u011f\u0007\u0022\u0002\u0002\u011f\u0121\u0005\u0052\u002a\u0002\u0120\u011e\u0003\u0002\u0002\u0002\u0121\u0124\u0003\u0002\u0002\u0002\u0122\u0120\u0003\u0002\u0002\u0002\u0122\u0123\u0003\u0002\u0002\u0002\u0123\u0029\u0003\u0002\u0002\u0002\u0124\u0122\u0003\u0002\u0002\u0002\u0125\u0128\u0005\u0042\u0022\u0002\u0126\u0128\u0005\u0014\u000b\u0002\u0127\u0125\u0003\u0002\u0002\u0002\u0127\u0126\u0003\u0002\u0002\u0002\u0128\u002b\u0003\u0002\u0002\u0002\u0129\u012a\u0008\u0017\u0001\u0002\u012a\u0149\u0007\u0026\u0002\u0002\u012b\u0149\u0007\u0027\u0002\u0002\u012c\u0149\u0007\u0028\u0002\u0002\u012d\u0149\u0007\u0003\u0002\u0002\u012e\u012f\u0005\u0008\u0005\u0002\u012f\u0130\u0007\u0018\u0002\u0002\u0130\u0132\u0003\u0002\u0002\u0002\u0131\u012e\u0003\u0002\u0002\u0002\u0131\u0132\u0003\u0002\u0002\u0002\u0132\u0133\u0003\u0002\u0002\u0002\u0133\u0149\u0007\u0024\u0002\u0002\u0134\u0135\u0005\u0008\u0005\u0002\u0135\u0136\u0007\u0018\u0002\u0002\u0136\u0138\u0003\u0002\u0002\u0002\u0137\u0134\u0003\u0002\u0002\u0002\u0137\u0138\u0003\u0002\u0002\u0002\u0138\u0139\u0003\u0002\u0002\u0002\u0139\u0149\u0005\u004e\u0028\u0002\u013a\u013b\u0005\u0008\u0005\u0002\u013b\u013c\u0007\u0018\u0002\u0002\u013c\u013e\u0003\u0002\u0002\u0002\u013d\u013a\u0003\u0002\u0002\u0002\u013d\u013e\u0003\u0002\u0002\u0002\u013e\u013f\u0003\u0002\u0002\u0002\u013f\u0149\u0005\u0050\u0029\u0002\u0140\u0141\u0007\u0025\u0002\u0002\u0141\u0149\u0005\u002c\u0017\u0007\u0142\u0149\u0005\u000c\u0007\u0002\u0143\u0149\u0005\u004c\u0027\u0002\u0144\u0145\u0007\u0019\u0002\u0002\u0145\u0146\u0005\u002c\u0017\u0002\u0146\u0147\u0007\u001a\u0002\u0002\u0147\u0149\u0003\u0002\u0002\u0002\u0148\u0129\u0003\u0002\u0002\u0002\u0148\u012b\u0003\u0002\u0002\u0002\u0148\u012c\u0003\u0002\u0002\u0002\u0148\u012d\u0003\u0002\u0002\u0002\u0148\u0131\u0003\u0002\u0002\u0002\u0148\u0137\u0003\u0002\u0002\u0002\u0148\u013d\u0003\u0002\u0002\u0002\u0148\u0140\u0003\u0002\u0002\u0002\u0148\u0142\u0003\u0002\u0002\u0002\u0148\u0143\u0003\u0002\u0002\u0002\u0148\u0144\u0003\u0002\u0002\u0002\u0149\u0156\u0003\u0002\u0002\u0002\u014a\u014b\u000c\u0006\u0002\u0002\u014b\u014c\u0007\u0025\u0002\u0002\u014c\u0155\u0005\u002c\u0017\u0007\u014d\u014e\u000c\u000a\u0002\u0002\u014e\u014f\u0007\u0023\u0002\u0002\u014f\u0155\u0007\u0024\u0002\u0002\u0150\u0151\u000c\u0009\u0002\u0002\u0151\u0155\u0005\u003a\u001e\u0002\u0152\u0153\u000c\u0008\u0002\u0002\u0153\u0155\u0005\u002e\u0018\u0002\u0154\u014a\u0003\u0002\u0002\u0002\u0154\u014d\u0003\u0002\u0002\u0002\u0154\u0150\u0003\u0002\u0002\u0002\u0154\u0152\u0003\u0002\u0002\u0002\u0155\u0158\u0003\u0002\u0002\u0002\u0156\u0154\u0003\u0002\u0002\u0002\u0156\u0157\u0003\u0002\u0002\u0002\u0157\u002d\u0003\u0002\u0002\u0002\u0158\u0156\u0003\u0002\u0002\u0002\u0159\u015a\u0007\u0022\u0002\u0002\u015a\u015b\u0005\u0052\u002a\u0002\u015b\u002f\u0003\u0002\u0002\u0002\u015c\u015e\u0005\u0068\u0035\u0002\u015d\u015c\u0003\u0002\u0002\u0002\u015d\u015e\u0003\u0002\u0002\u0002\u015e\u015f\u0003\u0002\u0002\u0002\u015f\u0160\u0005\u002c\u0017\u0002\u0160\u0161\u0007\u0022\u0002\u0002\u0161\u0162\u0005\u0052\u002a\u0002\u0162\u0168\u0003\u0002\u0002\u0002\u0163\u0165\u0005\u0068\u0035\u0002\u0164\u0163\u0003\u0002\u0002\u0002\u0164\u0165\u0003\u0002\u0002\u0002\u0165\u0166\u0003\u0002\u0002\u0002\u0166\u0168\u0005\u002c\u0017\u0002\u0167\u015d\u0003\u0002\u0002\u0002\u0167\u0164\u0003\u0002\u0002\u0002\u0168\u0031\u0003\u0002\u0002\u0002\u0169\u016b\u0007\u0019\u0002\u0002\u016a\u016c\u0005\u0030\u0019\u0002\u016b\u016a\u0003\u0002\u0002\u0002\u016c\u016d\u0003\u0002\u0002\u0002\u016d\u016b\u0003\u0002\u0002\u0002\u016d\u016e\u0003\u0002\u0002\u0002\u016e\u016f\u0003\u0002\u0002\u0002\u016f\u0170\u0007\u001a\u0002\u0002\u0170\u0033\u0003\u0002\u0002\u0002\u0171\u0172\u0007\u0019\u0002\u0002\u0172\u0173\u0005\u0030\u0019\u0002\u0173\u0174\u0005\u0030\u0019\u0002\u0174\u0175\u0007\u001a\u0002\u0002\u0175\u0035\u0003\u0002\u0002\u0002\u0176\u0177\u0007\u0019\u0002\u0002\u0177\u0178\u0005\u0030\u0019\u0002\u0178\u0179\u0007\u001a\u0002\u0002\u0179\u0037\u0003\u0002\u0002\u0002\u017a\u017b\u0007\u0024\u0002\u0002\u017b\u017d\u0007\u0016\u0002\u0002\u017c\u017a\u0003\u0002\u0002\u0002\u017c\u017d\u0003\u0002\u0002\u0002\u017d\u017e\u0003\u0002\u0002\u0002\u017e\u018b\u0005\u002c\u0017\u0002\u017f\u0181\u0007\u0024\u0002\u0002\u0180\u017f\u0003\u0002\u0002\u0002\u0180\u0181\u0003\u0002\u0002\u0002\u0181\u0182\u0003\u0002\u0002\u0002\u0182\u0186\u0007\u001f\u0002\u0002\u0183\u0185\u0005\u002c\u0017\u0002\u0184\u0183\u0003\u0002\u0002\u0002\u0185\u0188\u0003\u0002\u0002\u0002\u0186\u0184\u0003\u0002\u0002\u0002\u0186\u0187\u0003\u0002\u0002\u0002\u0187\u0189\u0003\u0002\u0002\u0002\u0188\u0186\u0003\u0002\u0002\u0002\u0189\u018b\u0007\u0020\u0002\u0002\u018a\u017c\u0003\u0002\u0002\u0002\u018a\u0180\u0003\u0002\u0002\u0002\u018b\u0039\u0003\u0002\u0002\u0002\u018c\u018e\u0007\u0022\u0002\u0002\u018d\u018f\u0005\u0052\u002a\u0002\u018e\u018d\u0003\u0002\u0002\u0002\u018f\u0190\u0003\u0002\u0002\u0002\u0190\u018e\u0003\u0002\u0002\u0002\u0190\u0191\u0003\u0002\u0002\u0002\u0191\u0193\u0003\u0002\u0002\u0002\u0192\u018c\u0003\u0002\u0002\u0002\u0192\u0193\u0003\u0002\u0002\u0002\u0193\u0194\u0003\u0002\u0002\u0002\u0194\u0198\u0007\u0019\u0002\u0002\u0195\u0197\u0005\u0038\u001d\u0002\u0196\u0195\u0003\u0002\u0002\u0002\u0197\u019a\u0003\u0002\u0002\u0002\u0198\u0196\u0003\u0002\u0002\u0002\u0198\u0199\u0003\u0002\u0002\u0002\u0199\u019b\u0003\u0002\u0002\u0002\u019a\u0198\u0003\u0002\u0002\u0002\u019b\u019c\u0007\u001a\u0002\u0002\u019c\u003b\u0003\u0002\u0002\u0002\u019d\u01a0\u0005\u0040\u0021\u0002\u019e\u01a0\u0005\u003e\u0020\u0002\u019f\u019d\u0003\u0002\u0002\u0002\u019f\u019e\u0003\u0002\u0002\u0002\u01a0\u003d\u0003\u0002\u0002\u0002\u01a1\u01a3\u0007\u0013\u0002\u0002\u01a2\u01a4\u0007\u0012\u0002\u0002\u01a3\u01a2\u0003\u0002\u0002\u0002\u01a3\u01a4\u0003\u0002\u0002\u0002\u01a4\u01a5\u0003\u0002\u0002\u0002\u01a5\u01a6\u0007\u0024\u0002\u0002\u01a6\u01a7\u0005\u0052\u002a\u0002\u01a7\u003f\u0003\u0002\u0002\u0002\u01a8\u01aa\u0007\u0013\u0002\u0002\u01a9\u01ab\u0007\u0012\u0002\u0002\u01aa\u01a9\u0003\u0002\u0002\u0002\u01aa\u01ab\u0003\u0002\u0002\u0002\u01ab\u01ac\u0003\u0002\u0002\u0002\u01ac\u01ae\u0007\u0024\u0002\u0002\u01ad\u01af\u0005\u0052\u002a\u0002\u01ae\u01ad\u0003\u0002\u0002\u0002\u01ae\u01af\u0003\u0002\u0002\u0002\u01af\u01b0\u0003\u0002\u0002\u0002\u01b0\u01b1\u0007\u0016\u0002\u0002\u01b1\u01b2\u0005\u002c\u0017\u0002\u01b2\u0041\u0003\u0002\u0002\u0002\u01b3\u01b7\u0005\u0044\u0023\u0002\u01b4\u01b7\u0005\u0046\u0024\u0002\u01b5\u01b7\u0005\u0048\u0025\u0002\u01b6\u01b3\u0003\u0002\u0002\u0002\u01b6\u01b4\u0003\u0002\u0002\u0002\u01b6\u01b5\u0003\u0002\u0002\u0002\u01b7\u0043\u0003\u0002\u0002\u0002\u01b8\u01ba\u0005\u0068\u0035\u0002\u01b9\u01b8\u0003\u0002\u0002\u0002\u01b9\u01ba\u0003\u0002\u0002\u0002\u01ba\u01bb\u0003\u0002\u0002\u0002\u01bb\u01bd\u0007\u0024\u0002\u0002\u01bc\u01be\u0005\u004a\u0026\u0002\u01bd\u01bc\u0003\u0002\u0002\u0002\u01bd\u01be\u0003\u0002\u0002\u0002\u01be\u01c0\u0003\u0002\u0002\u0002\u01bf\u01c1\u0005\u0026\u0014\u0002\u01c0\u01bf\u0003\u0002\u0002\u0002\u01c0\u01c1\u0003\u0002\u0002\u0002\u01c1\u01c3\u0003\u0002\u0002\u0002\u01c2\u01c4\u0005\u0032\u001a\u0002\u01c3\u01c2\u0003\u0002\u0002\u0002\u01c3\u01c4\u0003\u0002\u0002\u0002\u01c4\u01c5\u0003\u0002\u0002\u0002\u01c5\u01c6\u0005\u0052\u002a\u0002\u01c6\u01c7\u0007\u0016\u0002\u0002\u01c7\u01c8\u0005\u002c\u0017\u0002\u01c8\u01e8\u0003\u0002\u0002\u0002\u01c9\u01cb\u0005\u0068\u0035\u0002\u01ca\u01c9\u0003\u0002\u0002\u0002\u01ca\u01cb\u0003\u0002\u0002\u0002\u01cb\u01cc\u0003\u0002\u0002\u0002\u01cc\u01ce\u0005\u004e\u0028\u0002\u01cd\u01cf\u0005\u004a\u0026\u0002\u01ce\u01cd\u0003\u0002\u0002\u0002\u01ce\u01cf\u0003\u0002\u0002\u0002\u01cf\u01d1\u0003\u0002\u0002\u0002\u01d0\u01d2\u0005\u0026\u0014\u0002\u01d1\u01d0\u0003\u0002\u0002\u0002\u01d1\u01d2\u0003\u0002\u0002\u0002\u01d2\u01d3\u0003\u0002\u0002\u0002\u01d3\u01d4\u0005\u0034\u001b\u0002\u01d4\u01d5\u0005\u0052\u002a\u0002\u01d5\u01d6\u0007\u0016\u0002\u0002\u01d6\u01d7\u0005\u002c\u0017\u0002\u01d7\u01e8\u0003\u0002\u0002\u0002\u01d8\u01da\u0005\u0068\u0035\u0002\u01d9\u01d8\u0003\u0002\u0002\u0002\u01d9\u01da\u0003\u0002\u0002\u0002\u01da\u01db\u0003\u0002\u0002\u0002\u01db\u01dd\u0005\u004e\u0028\u0002\u01dc\u01de\u0005\u004a\u0026\u0002\u01dd\u01dc\u0003\u0002\u0002\u0002\u01dd\u01de\u0003\u0002\u0002\u0002\u01de\u01e0\u0003\u0002\u0002\u0002\u01df\u01e1\u0005\u0026\u0014\u0002\u01e0\u01df\u0003\u0002\u0002\u0002\u01e0\u01e1\u0003\u0002\u0002\u0002\u01e1\u01e2\u0003\u0002\u0002\u0002\u01e2\u01e3\u0005\u0036\u001c\u0002\u01e3\u01e4\u0005\u0052\u002a\u0002\u01e4\u01e5\u0007\u0016\u0002\u0002\u01e5\u01e6\u0005\u002c\u0017\u0002\u01e6\u01e8\u0003\u0002\u0002\u0002\u01e7\u01b9\u0003\u0002\u0002\u0002\u01e7\u01ca\u0003\u0002\u0002\u0002\u01e7\u01d9\u0003\u0002\u0002\u0002\u01e8\u0045\u0003\u0002\u0002\u0002\u01e9\u01eb\u0005\u0068\u0035\u0002\u01ea\u01e9\u0003\u0002\u0002\u0002\u01ea\u01eb\u0003\u0002\u0002\u0002\u01eb\u01ec\u0003\u0002\u0002\u0002\u01ec\u01ed\u0007\u000c\u0002\u0002\u01ed\u01ef\u0007\u0024\u0002\u0002\u01ee\u01f0\u0005\u004a\u0026\u0002\u01ef\u01ee\u0003\u0002\u0002\u0002\u01ef\u01f0\u0003\u0002\u0002\u0002\u01f0\u01f2\u0003\u0002\u0002\u0002\u01f1\u01f3\u0005\u0026\u0014\u0002\u01f2\u01f1\u0003\u0002\u0002\u0002\u01f2\u01f3\u0003\u0002\u0002\u0002\u01f3\u01f5\u0003\u0002\u0002\u0002\u01f4\u01f6\u0005\u0032\u001a\u0002\u01f5\u01f4\u0003\u0002\u0002\u0002\u01f5\u01f6\u0003\u0002\u0002\u0002\u01f6\u0200\u0003\u0002\u0002\u0002\u01f7\u01f8\u0007\u000b\u0002\u0002\u01f8\u01fa\u0005\u0052\u002a\u0002\u01f9\u01fb\u0005\u005a\u002e\u0002\u01fa\u01f9\u0003\u0002\u0002\u0002\u01fa\u01fb\u0003\u0002\u0002\u0002\u01fb\u0201\u0003\u0002\u0002\u0002\u01fc\u01fd\u0007\u0016\u0002\u0002\u01fd\u01fe\u0005\u0052\u002a\u0002\u01fe\u01ff\u0007\u0029\u0002\u0002\u01ff\u0201\u0003\u0002\u0002\u0002\u0200\u01f7\u0003\u0002\u0002\u0002\u0200\u01fc\u0003\u0002\u0002\u0002\u0201\u0231\u0003\u0002\u0002\u0002\u0202\u0204\u0005\u0068\u0035\u0002\u0203\u0202\u0003\u0002\u0002\u0002\u0203\u0204\u0003\u0002\u0002\u0002\u0204\u0205\u0003\u0002\u0002\u0002\u0205\u0206\u0007\u000c\u0002\u0002\u0206\u0208\u0007\u0024\u0002\u0002\u0207\u0209\u0005\u004a\u0026\u0002\u0208\u0207\u0003\u0002\u0002\u0002\u0208\u0209\u0003\u0002\u0002\u0002\u0209\u020b\u0003\u0002\u0002\u0002\u020a\u020c\u0005\u0026\u0014\u0002\u020b\u020a\u0003\u0002\u0002\u0002\u020b\u020c\u0003\u0002\u0002\u0002\u020c\u020d\u0003\u0002\u0002\u0002\u020d\u0217\u0005\u0034\u001b\u0002\u020e\u020f\u0007\u000b\u0002\u0002\u020f\u0211\u0005\u0052\u002a\u0002\u0210\u0212\u0005\u005a\u002e\u0002\u0211\u0210\u0003\u0002\u0002\u0002\u0211\u0212\u0003\u0002\u0002\u0002\u0212\u0218\u0003\u0002\u0002\u0002\u0213\u0214\u0007\u0016\u0002\u0002\u0214\u0215\u0005\u0052\u002a\u0002\u0215\u0216\u0007\u0029\u0002\u0002\u0216\u0218\u0003\u0002\u0002\u0002\u0217\u020e\u0003\u0002\u0002\u0002\u0217\u0213\u0003\u0002\u0002\u0002\u0218\u0231\u0003\u0002\u0002\u0002\u0219\u021b\u0005\u0068\u0035\u0002\u021a\u0219\u0003\u0002\u0002\u0002\u021a\u021b\u0003\u0002\u0002\u0002\u021b\u021c\u0003\u0002\u0002\u0002\u021c\u021d\u0007\u000c\u0002\u0002\u021d\u021f\u0007\u0024\u0002\u0002\u021e\u0220\u0005\u004a\u0026\u0002\u021f\u021e\u0003\u0002\u0002\u0002\u021f\u0220\u0003\u0002\u0002\u0002\u0220\u0222\u0003\u0002\u0002\u0002\u0221\u0223\u0005\u0026\u0014\u0002\u0222\u0221\u0003\u0002\u0002\u0002\u0222\u0223\u0003\u0002\u0002\u0002\u0223\u0224\u0003\u0002\u0002\u0002\u0224\u022e\u0005\u0036\u001c\u0002\u0225\u0226\u0007\u000b\u0002\u0002\u0226\u0228\u0005\u0052\u002a\u0002\u0227\u0229\u0005\u005a\u002e\u0002\u0228\u0227\u0003\u0002\u0002\u0002\u0228\u0229\u0003\u0002\u0002\u0002\u0229\u022f\u0003\u0002\u0002\u0002\u022a\u022b\u0007\u0016\u0002\u0002\u022b\u022c\u0005\u0052\u002a\u0002\u022c\u022d\u0007\u0029\u0002\u0002\u022d\u022f\u0003\u0002\u0002\u0002\u022e\u0225\u0003\u0002\u0002\u0002\u022e\u022a\u0003\u0002\u0002\u0002\u022f\u0231\u0003\u0002\u0002\u0002\u0230\u01ea\u0003\u0002\u0002\u0002\u0230\u0203\u0003\u0002\u0002\u0002\u0230\u021a\u0003\u0002\u0002\u0002\u0231\u0047\u0003\u0002\u0002\u0002\u0232\u0234\u0005\u0068\u0035\u0002\u0233\u0232\u0003\u0002\u0002\u0002\u0233\u0234\u0003\u0002\u0002\u0002\u0234\u0235\u0003\u0002\u0002\u0002\u0235\u0237\u0007\u0024\u0002\u0002\u0236\u0238\u0005\u004a\u0026\u0002\u0237\u0236\u0003\u0002\u0002\u0002\u0237\u0238\u0003\u0002\u0002\u0002\u0238\u023a\u0003\u0002\u0002\u0002\u0239\u023b\u0005\u0026\u0014\u0002\u023a\u0239\u0003\u0002\u0002\u0002\u023a\u023b\u0003\u0002\u0002\u0002\u023b\u023d\u0003\u0002\u0002\u0002\u023c\u023e\u0005\u0032\u001a\u0002\u023d\u023c\u0003\u0002\u0002\u0002\u023d\u023e\u0003\u0002\u0002\u0002\u023e\u023f\u0003\u0002\u0002\u0002\u023f\u0240\u0007\u000b\u0002\u0002\u0240\u0242\u0005\u0052\u002a\u0002\u0241\u0243\u0005\u005a\u002e\u0002\u0242\u0241\u0003\u0002\u0002\u0002\u0242\u0243\u0003\u0002\u0002\u0002\u0243\u0265\u0003\u0002\u0002\u0002\u0244\u0246\u0005\u0068\u0035\u0002\u0245\u0244\u0003\u0002\u0002\u0002\u0245\u0246\u0003\u0002\u0002\u0002\u0246\u0247\u0003\u0002\u0002\u0002\u0247\u0249\u0007\u0024\u0002\u0002\u0248\u024a\u0005\u004a\u0026\u0002\u0249\u0248\u0003\u0002\u0002\u0002\u0249\u024a\u0003\u0002\u0002\u0002\u024a\u024c\u0003\u0002\u0002\u0002\u024b\u024d\u0005\u0026\u0014\u0002\u024c\u024b\u0003\u0002\u0002\u0002\u024c\u024d\u0003\u0002\u0002\u0002\u024d\u024e\u0003\u0002\u0002\u0002\u024e\u024f\u0005\u0034\u001b\u0002\u024f\u0250\u0007\u000b\u0002\u0002\u0250\u0252\u0005\u0052\u002a\u0002\u0251\u0253\u0005\u005a\u002e\u0002\u0252\u0251\u0003\u0002\u0002\u0002\u0252\u0253\u0003\u0002\u0002\u0002\u0253\u0265\u0003\u0002\u0002\u0002\u0254\u0256\u0005\u0068\u0035\u0002\u0255\u0254\u0003\u0002\u0002\u0002\u0255\u0256\u0003\u0002\u0002\u0002\u0256\u0257\u0003\u0002\u0002\u0002\u0257\u0259\u0007\u0024\u0002\u0002\u0258\u025a\u0005\u004a\u0026\u0002\u0259\u0258\u0003\u0002\u0002\u0002\u0259\u025a\u0003\u0002\u0002\u0002\u025a\u025c\u0003\u0002\u0002\u0002\u025b\u025d\u0005\u0026\u0014\u0002\u025c\u025b\u0003\u0002\u0002\u0002\u025c\u025d\u0003\u0002\u0002\u0002\u025d\u025e\u0003\u0002\u0002\u0002\u025e\u025f\u0005\u0036\u001c\u0002\u025f\u0260\u0007\u000b\u0002\u0002\u0260\u0262\u0005\u0052\u002a\u0002\u0261\u0263\u0005\u005a\u002e\u0002\u0262\u0261\u0003\u0002\u0002\u0002\u0262\u0263\u0003\u0002\u0002\u0002\u0263\u0265\u0003\u0002\u0002\u0002\u0264\u0233\u0003\u0002\u0002\u0002\u0264\u0245\u0003\u0002\u0002\u0002\u0264\u0255\u0003\u0002\u0002\u0002\u0265\u0049\u0003\u0002\u0002\u0002\u0266\u0267\u0007\u0003\u0002\u0002\u0267\u004b\u0003\u0002\u0002\u0002\u0268\u026c\u0007\u001b\u0002\u0002\u0269\u026b\u0005\u0030\u0019\u0002\u026a\u0269\u0003\u0002\u0002\u0002\u026b\u026e\u0003\u0002\u0002\u0002\u026c\u026a\u0003\u0002\u0002\u0002\u026c\u026d\u0003\u0002\u0002\u0002\u026d\u026f\u0003\u0002\u0002\u0002\u026e\u026c\u0003\u0002\u0002\u0002\u026f\u0270\u0007\u001d\u0002\u0002\u0270\u0271\u0005\u002c\u0017\u0002\u0271\u004d\u0003\u0002\u0002\u0002\u0272\u0273\u0007\u001b\u0002\u0002\u0273\u0274\u0007\u0025\u0002\u0002\u0274\u0275\u0007\u001d\u0002\u0002\u0275\u004f\u0003\u0002\u0002\u0002\u0276\u0277\u0007\u001b\u0002\u0002\u0277\u0278\u0007\u0022\u0002\u0002\u0278\u0279\u0007\u0025\u0002\u0002\u0279\u027a\u0007\u001d\u0002\u0002\u027a\u0051\u0003\u0002\u0002\u0002\u027b\u027e\u0005\u0058\u002d\u0002\u027c\u027e\u0005\u0054\u002b\u0002\u027d\u027b\u0003\u0002\u0002\u0002\u027d\u027c\u0003\u0002\u0002\u0002\u027e\u0053\u0003\u0002\u0002\u0002\u027f\u0280\u0005\u0008\u0005\u0002\u0280\u0281\u0007\u0018\u0002\u0002\u0281\u0283\u0003\u0002\u0002\u0002\u0282\u027f\u0003\u0002\u0002\u0002\u0282\u0283\u0003\u0002\u0002\u0002\u0283\u0284\u0003\u0002\u0002\u0002\u0284\u028d\u0007\u0024\u0002\u0002\u0285\u0287\u0007\u0019\u0002\u0002\u0286\u0288\u0005\u0052\u002a\u0002\u0287\u0286\u0003\u0002\u0002\u0002\u0288\u0289\u0003\u0002\u0002\u0002\u0289\u0287\u0003\u0002\u0002\u0002\u0289\u028a\u0003\u0002\u0002\u0002\u028a\u028b\u0003\u0002\u0002\u0002\u028b\u028c\u0007\u001a\u0002\u0002\u028c\u028e\u0003\u0002\u0002\u0002\u028d\u0285\u0003\u0002\u0002\u0002\u028d\u028e\u0003\u0002\u0002\u0002\u028e\u0055\u0003\u0002\u0002\u0002\u028f\u0291\u0005\u0052\u002a\u0002\u0290\u0292\u0007\u0017\u0002\u0002\u0291\u0290\u0003\u0002\u0002\u0002\u0291\u0292\u0003\u0002\u0002\u0002\u0292\u0057\u0003\u0002\u0002\u0002\u0293\u0297\u0007\u0019\u0002\u0002\u0294\u0296\u0005\u0056\u002c\u0002\u0295\u0294\u0003\u0002\u0002\u0002\u0296\u0299\u0003\u0002\u0002\u0002\u0297\u0295\u0003\u0002\u0002\u0002\u0297\u0298\u0003\u0002\u0002\u0002\u0298\u029a\u0003\u0002\u0002\u0002\u0299\u0297\u0003\u0002\u0002\u0002\u029a\u029b\u0007\u001a\u0002\u0002\u029b\u029c\u0007\u0021\u0002\u0002\u029c\u029d\u0005\u0052\u002a\u0002\u029d\u0059\u0003\u0002\u0002\u0002\u029e\u02a2\u0007\u001f\u0002\u0002\u029f\u02a1\u0005\u005c\u002f\u0002\u02a0\u029f\u0003\u0002\u0002\u0002\u02a1\u02a4\u0003\u0002\u0002\u0002\u02a2\u02a0\u0003\u0002\u0002\u0002\u02a2\u02a3\u0003\u0002\u0002\u0002\u02a3\u02a5\u0003\u0002\u0002\u0002\u02a4\u02a2\u0003\u0002\u0002\u0002\u02a5\u02a6\u0007\u0020\u0002\u0002\u02a6\u005b\u0003\u0002\u0002\u0002\u02a7\u02a8\u0005\u005e\u0030\u0002\u02a8\u02a9\u0007\u0029\u0002\u0002\u02a9\u02af\u0003\u0002\u0002\u0002\u02aa\u02ab\u0005\u005e\u0030\u0002\u02ab\u02ac\u0007\u0022\u0002\u0002\u02ac\u02ad\u0007\u0028\u0002\u0002\u02ad\u02af\u0003\u0002\u0002\u0002\u02ae\u02a7\u0003\u0002\u0002\u0002\u02ae\u02aa\u0003\u0002\u0002\u0002\u02af\u005d\u0003\u0002\u0002\u0002\u02b0\u02b1\u0007\u0024\u0002\u0002\u02b1\u005f\u0003\u0002\u0002\u0002\u02b2\u02b3\u0009\u0002\u0002\u0002\u02b3\u0061\u0003\u0002\u0002\u0002\u02b4\u02b5\u0007\u0024\u0002\u0002\u02b5\u02b6\u0005\u0052\u002a\u0002\u02b6\u0063\u0003\u0002\u0002\u0002\u02b7\u02b8\u0007\u0008\u0002\u0002\u02b8\u02c1\u0007\u0024\u0002\u0002\u02b9\u02bd\u0007\u0019\u0002\u0002\u02ba\u02bc\u0005\u0062\u0032\u0002\u02bb\u02ba\u0003\u0002\u0002\u0002\u02bc\u02bf\u0003\u0002\u0002\u0002\u02bd\u02bb\u0003\u0002\u0002\u0002\u02bd\u02be\u0003\u0002\u0002\u0002\u02be\u02c0\u0003\u0002\u0002\u0002\u02bf\u02bd\u0003\u0002\u0002\u0002\u02c0\u02c2\u0007\u001a\u0002\u0002\u02c1\u02b9\u0003\u0002\u0002\u0002\u02c1\u02c2\u0003\u0002\u0002\u0002\u02c2\u0065\u0003\u0002\u0002\u0002\u02c3\u02c7\u0007\u0024\u0002\u0002\u02c4\u02c6\u0005\u0060\u0031\u0002\u02c5\u02c4\u0003\u0002\u0002\u0002\u02c6\u02c9\u0003\u0002\u0002\u0002\u02c7\u02c5\u0003\u0002\u0002\u0002\u02c7\u02c8\u0003\u0002\u0002\u0002\u02c8\u02d4\u0003\u0002\u0002\u0002\u02c9\u02c7\u0003\u0002\u0002\u0002\u02ca\u02cb\u0007\u0024\u0002\u0002\u02cb\u02cf\u0007\u0019\u0002\u0002\u02cc\u02ce\u0005\u0060\u0031\u0002\u02cd\u02cc\u0003\u0002\u0002\u0002\u02ce\u02d1\u0003\u0002\u0002\u0002\u02cf\u02cd\u0003\u0002\u0002\u0002\u02cf\u02d0\u0003\u0002\u0002\u0002\u02d0\u02d2\u0003\u0002\u0002\u0002\u02d1\u02cf\u0003\u0002\u0002\u0002\u02d2\u02d4\u0007\u001a\u0002\u0002\u02d3\u02c3\u0003\u0002\u0002\u0002\u02d3\u02ca\u0003\u0002\u0002\u0002\u02d4\u0067\u0003\u0002\u0002\u0002\u02d5\u02d9\u0007\u001c\u0002\u0002\u02d6\u02d8\u0005\u0066\u0034\u0002\u02d7\u02d6\u0003\u0002\u0002\u0002\u02d8\u02db\u0003\u0002\u0002\u0002\u02d9\u02d7\u0003\u0002\u0002\u0002\u02d9\u02da\u0003\u0002\u0002\u0002\u02da\u02dc\u0003\u0002\u0002\u0002\u02db\u02d9\u0003\u0002\u0002\u0002\u02dc\u02dd\u0007\u001e\u0002\u0002\u02dd\u0069\u0003\u0002\u0002\u0002\u0074\u006b\u0070\u0077\u0079\u0086\u0091\u0099\u00a3\u00a8\u00b0\u00b4\u00b9\u00bf\u00c5\u00cc\u00cf\u00d2\u00d5\u00d8\u00dc\u00df\u00e2\u00e6\u00ea\u00ee\u00f4\u00fa\u00fe\u0101\u0104\u010b\u0113\u011b\u0122\u0127\u0131\u0137\u013d\u0148\u0154\u0156\u015d\u0164\u0167\u016d\u017c\u0180\u0186\u018a\u0190\u0192\u0198\u019f\u01a3\u01aa\u01ae\u01b6\u01b9\u01bd\u01c0\u01c3\u01ca\u01ce\u01d1\u01d9\u01dd\u01e0\u01e7\u01ea\u01ef\u01f2\u01f5\u01fa\u0200\u0203\u0208\u020b\u0211\u0217\u021a\u021f\u0222\u0228\u022e\u0230\u0233\u0237\u023a\u023d\u0242\u0245\u0249\u024c\u0252\u0255\u0259\u025c\u0262\u0264\u026c\u027d\u0282\u0289\u028d\u0291\u0297\u02a2\u02ae\u02bd\u02c1\u02c7\u02cf\u02d3\u02d9"

        val ATN = ATNDeserializer().deserialize(serializedATN.asCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val Literal = Tokens.Literal.id
    private val WS = Tokens.WS.id
    private val COMMENT = Tokens.COMMENT.id
    private val LINE_COMMENT = Tokens.LINE_COMMENT.id
    private val ABSTRACT = Tokens.ABSTRACT.id
    private val ANNOTATION = Tokens.ANNOTATION.id
    private val CLASS = Tokens.CLASS.id
    private val DO = Tokens.DO.id
    private val FOREIGN = Tokens.FOREIGN.id
    private val TEMPLATE = Tokens.TEMPLATE.id
    private val NAMESPACE = Tokens.NAMESPACE.id
    private val INTERNAL = Tokens.INTERNAL.id
    private val IMPORT = Tokens.IMPORT.id
    private val IMPL = Tokens.IMPL.id
    private val RETURN = Tokens.RETURN.id
    private val MUTABLE = Tokens.MUTABLE.id
    private val FIELD = Tokens.FIELD.id
    private val STATIC = Tokens.STATIC.id
    private val NEWSET = Tokens.NEWSET.id
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
		fun findNewset() : List<NewsetContext> = getRuleContexts(solver.getType("NewsetContext"))
		fun findNewset(i: Int) : NewsetContext? = getRuleContext(solver.getType("NewsetContext"),i)
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
			this.state = 119
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ANNOTATION) or (1L shl CLASS) or (1L shl TEMPLATE) or (1L shl FIELD) or (1L shl NEWSET) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 117
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
				1 -> {if (true){
				this.state = 113
				definition()
				}}
				2 -> {if (true){
				this.state = 114
				field()
				}}
				3 -> {if (true){
				this.state = 115
				annotationDef()
				}}
				4 -> {if (true){
				this.state = 116
				newset()
				}}
				}
				}
				this.state = 121
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
			this.state = 122
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
			this.state = 124
			match(IMPORT) as Token
			this.state = 125
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
			this.state = 127
			match(ID) as Token
			this.state = 132
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 128
					match(DOT) as Token
					this.state = 129
					match(ID) as Token
					}
					} 
				}
				this.state = 134
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
			this.state = 135
			match(NAMESPACE) as Token
			this.state = 136
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
			this.state = 138
			match(DO) as Token
			this.state = 139
			match(LBRACE) as Token
			this.state = 143
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Literal) or (1L shl DO) or (1L shl RETURN) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 140
				compo()
				}
				}
				this.state = 145
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 146
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
			this.state = 151
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 148
			fieldAssign()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 149
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 150
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
			this.state = 153
			match(RETURN) as Token
			this.state = 154
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
			this.state = 156
			value(0)
			this.state = 157
			match(ASSGIN) as Token
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

	open class Class_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_class_.id
	        set(value) { throw RuntimeException() }
		fun CLASS() : TerminalNode? = getToken(FoldingParser.Tokens.CLASS.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
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
			this.state = 161
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 160
				annotationBlock()
				}
			}

			this.state = 163
			match(CLASS) as Token
			this.state = 164
			match(ID) as Token
			this.state = 166
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 165
				typeParam()
				}
			}

			this.state = 168
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
		fun findConstructorSelf() : ConstructorSelfContext? = getRuleContext(solver.getType("ConstructorSelfContext"),0)
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		fun findDefInInterface() : List<DefInInterfaceContext> = getRuleContexts(solver.getType("DefInInterfaceContext"))
		fun findDefInInterface(i: Int) : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),i)
		fun findImpl() : List<ImplContext> = getRuleContexts(solver.getType("ImplContext"))
		fun findImpl(i: Int) : ImplContext? = getRuleContext(solver.getType("ImplContext"),i)
		fun findConstructor_() : List<Constructor_Context> = getRuleContexts(solver.getType("Constructor_Context"))
		fun findConstructor_(i: Int) : Constructor_Context? = getRuleContext(solver.getType("Constructor_Context"),i)
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
			this.state = 170
			match(LBRACE) as Token
			this.state = 178
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,10,context) ) {
			1 -> {if (true){
			this.state = 174
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,9,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 171
					constructor_()
					}
					} 
				}
				this.state = 176
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,9,context)
			}
			}}
			2 -> {if (true){
			this.state = 177
			constructorSelf()
			}}
			}
			this.state = 183
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==FIELD) {
				if (true){
				if (true){
				this.state = 180
				field()
				}
				}
				this.state = 185
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 189
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LCOLONSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 186
				defInInterface()
				}
				}
				this.state = 191
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 195
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 192
				impl()
				}
				}
				this.state = 197
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 198
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
			this.state = 200
			match(ID) as Token
			this.state = 202
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 201
				parameter()
				}
			}

			this.state = 205
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 204
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

	open class ConstructorSelfContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_constructorSelf.id
	        set(value) { throw RuntimeException() }
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findDoBlock() : DoBlockContext? = getRuleContext(solver.getType("DoBlockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  constructorSelf() : ConstructorSelfContext {
		var _localctx : ConstructorSelfContext = ConstructorSelfContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_constructorSelf.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 208
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 207
				parameter()
				}
			}

			this.state = 211
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 210
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
		enterRule(_localctx, 26, Rules.RULE_defInInterface.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 214
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 213
				annotationBlock()
				}
			}

			this.state = 216
			match(ID) as Token
			this.state = 218
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 217
				compiledId()
				}
			}

			this.state = 221
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,20,context) ) {
			1   -> if (true){
			this.state = 220
			typeParam()
			}
			}
			this.state = 224
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,21,context) ) {
			1   -> if (true){
			this.state = 223
			parameter()
			}
			}
			this.state = 226
			typeEx()
			this.state = 228
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,22,context) ) {
			1   -> if (true){
			this.state = 227
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

	open class ImplContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_impl.id
	        set(value) { throw RuntimeException() }
		fun IMPL() : TerminalNode? = getToken(FoldingParser.Tokens.IMPL.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findImplBody() : ImplBodyContext? = getRuleContext(solver.getType("ImplBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  impl() : ImplContext {
		var _localctx : ImplContext = ImplContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_impl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 230
			match(IMPL) as Token
			this.state = 232
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,23,context) ) {
			1   -> if (true){
			this.state = 231
			typeParam()
			}
			}
			this.state = 234
			typeEx()
			this.state = 236
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 235
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
			this.state = 238
			match(LBRACE) as Token
			this.state = 242
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LCOLONSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 239
				defInImpl()
				}
				}
				this.state = 244
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 245
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
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
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
			this.state = 248
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 247
				annotationBlock()
				}
			}

			this.state = 250
			match(ID) as Token
			this.state = 252
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 251
				compiledId()
				}
			}

			this.state = 255
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,28,context) ) {
			1   -> if (true){
			this.state = 254
			typeParam()
			}
			}
			this.state = 258
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,29,context) ) {
			1   -> if (true){
			this.state = 257
			parameter()
			}
			}
			this.state = 260
			typeEx()
			this.state = 261
			match(ASSGIN) as Token
			this.state = 262
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

	open class NewsetContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_newset.id
	        set(value) { throw RuntimeException() }
		fun NEWSET() : TerminalNode? = getToken(FoldingParser.Tokens.NEWSET.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun Literal() : List<TerminalNode> = getTokens(FoldingParser.Tokens.Literal.id)
		fun Literal(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.Literal.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  newset() : NewsetContext {
		var _localctx : NewsetContext = NewsetContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_newset.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
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
			match(NEWSET) as Token
			this.state = 268
			match(ID) as Token
			this.state = 269
			match(LBRACE) as Token
			this.state = 273
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==Literal) {
				if (true){
				if (true){
				this.state = 270
				match(Literal) as Token
				}
				}
				this.state = 275
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 276
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
			this.state = 279 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 278
				typeParamCompo()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 281 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,32,context)
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
			this.state = 283
			match(ID) as Token
			this.state = 288
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TILDE) {
				if (true){
				if (true){
				this.state = 284
				match(TILDE) as Token
				this.state = 285
				typeEx()
				}
				}
				this.state = 290
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
			this.state = 293
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,34,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 291
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 292
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

	open class ValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_value.id
	        set(value) { throw RuntimeException() }
		fun Integer() : TerminalNode? = getToken(FoldingParser.Tokens.Integer.id, 0)
		fun Double() : TerminalNode? = getToken(FoldingParser.Tokens.Double.id, 0)
		fun String() : TerminalNode? = getToken(FoldingParser.Tokens.String.id, 0)
		fun Literal() : TerminalNode? = getToken(FoldingParser.Tokens.Literal.id, 0)
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
		var _startState : Int = 42
		enterRecursionRule(_localctx, 42, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 326
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,38,context) ) {
			1 -> {if (true){
			this.state = 296
			match(Integer) as Token
			}}
			2 -> {if (true){
			this.state = 297
			match(Double) as Token
			}}
			3 -> {if (true){
			this.state = 298
			match(String) as Token
			}}
			4 -> {if (true){
			this.state = 299
			match(Literal) as Token
			}}
			5 -> {if (true){
			this.state = 303
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,35,context) ) {
			1   -> if (true){
			this.state = 300
			package_()
			this.state = 301
			match(DOT) as Token
			}
			}
			this.state = 305
			match(ID) as Token
			}}
			6 -> {if (true){
			this.state = 309
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 306
				package_()
				this.state = 307
				match(DOT) as Token
				}
			}

			this.state = 311
			opIdWrap()
			}}
			7 -> {if (true){
			this.state = 315
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 312
				package_()
				this.state = 313
				match(DOT) as Token
				}
			}

			this.state = 317
			aopIdWrap()
			}}
			8 -> {if (true){
			this.state = 318
			match(OPID) as Token
			this.state = 319
			value(5)
			}}
			9 -> {if (true){
			this.state = 320
			doBlock()
			}}
			10 -> {if (true){
			this.state = 321
			lambda()
			}}
			11 -> {if (true){
			this.state = 322
			match(LPAREN) as Token
			this.state = 323
			value(0)
			this.state = 324
			match(RPAREN) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 340
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,40,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 338
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,39,context) ) {
					1 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 328
					if (!(precpred(context!!, 4))) throw FailedPredicateException(this, "precpred(context!!, 4)")
					this.state = 329
					match(OPID) as Token
					this.state = 330
					value(5)
					}}
					2 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 331
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 332
					match(COLON) as Token
					this.state = 333
					match(ID) as Token
					}}
					3 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 334
					if (!(precpred(context!!, 7))) throw FailedPredicateException(this, "precpred(context!!, 7)")
					this.state = 335
					argValue()
					}}
					4 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 336
					if (!(precpred(context!!, 6))) throw FailedPredicateException(this, "precpred(context!!, 6)")
					this.state = 337
					typeCasting()
					}}
					}
					} 
				}
				this.state = 342
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,40,context)
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
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeCasting() : TypeCastingContext {
		var _localctx : TypeCastingContext = TypeCastingContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 343
			match(TILDE) as Token
			this.state = 344
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
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramEx() : ParamExContext {
		var _localctx : ParamExContext = ParamExContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_paramEx.id)
		var _la: Int
		try {
			this.state = 357
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,43,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 347
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 346
				annotationBlock()
				}
			}

			this.state = 349
			value(0)
			this.state = 350
			match(TILDE) as Token
			this.state = 351
			typeEx()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 354
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 353
				annotationBlock()
				}
			}

			this.state = 356
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
		enterRule(_localctx, 48, Rules.RULE_parameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 359
			match(LPAREN) as Token
			this.state = 361 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 360
				paramEx()
				}
				}
				this.state = 363 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Literal) or (1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L) )
			this.state = 365
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
		enterRule(_localctx, 50, Rules.RULE_opParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 367
			match(LPAREN) as Token
			this.state = 368
			paramEx()
			this.state = 369
			paramEx()
			this.state = 370
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
		enterRule(_localctx, 52, Rules.RULE_aopParameter.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 372
			match(LPAREN) as Token
			this.state = 373
			paramEx()
			this.state = 374
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
		enterRule(_localctx, 54, Rules.RULE_argEx.id)
		var _la: Int
		try {
			this.state = 392
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,48,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 378
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,45,context) ) {
			1   -> if (true){
			this.state = 376
			match(ID) as Token
			this.state = 377
			match(ASSGIN) as Token
			}
			}
			this.state = 380
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 382
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 381
				match(ID) as Token
				}
			}

			this.state = 384
			match(LBRACE) as Token
			this.state = 388
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Literal) or (1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 385
				value(0)
				}
				}
				this.state = 390
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 391
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
		enterRule(_localctx, 56, Rules.RULE_argValue.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 400
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 394
				match(TILDE) as Token
				this.state = 396 
				errorHandler.sync(this)
				_alt = 1
				do {
					when (_alt) {
					    1 -> if (true){
					if (true){
					this.state = 395
					typeEx()
					}
					}
					else -> throw NoViableAltException(this)
					}
					this.state = 398 
					errorHandler.sync(this)
					_alt = interpreter!!.adaptivePredict(_input!!,49,context)
				} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
				}
			}

			this.state = 402
			match(LPAREN) as Token
			this.state = 406
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Literal) or (1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 403
				argEx()
				}
				}
				this.state = 408
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 409
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

	open class FieldContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_field.id
	        set(value) { throw RuntimeException() }
		fun findFieldSetted() : FieldSettedContext? = getRuleContext(solver.getType("FieldSettedContext"),0)
		fun findFieldNotInit() : FieldNotInitContext? = getRuleContext(solver.getType("FieldNotInitContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  field() : FieldContext {
		var _localctx : FieldContext = FieldContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_field.id)
		try {
			this.state = 413
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,52,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 411
			fieldSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 412
			fieldNotInit()
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

	open class FieldNotInitContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fieldNotInit.id
	        set(value) { throw RuntimeException() }
		fun FIELD() : TerminalNode? = getToken(FoldingParser.Tokens.FIELD.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun MUTABLE() : TerminalNode? = getToken(FoldingParser.Tokens.MUTABLE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  fieldNotInit() : FieldNotInitContext {
		var _localctx : FieldNotInitContext = FieldNotInitContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_fieldNotInit.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 415
			match(FIELD) as Token
			this.state = 417
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==MUTABLE) {
				if (true){
				this.state = 416
				match(MUTABLE) as Token
				}
			}

			this.state = 419
			match(ID) as Token
			this.state = 420
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

	open class FieldSettedContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fieldSetted.id
	        set(value) { throw RuntimeException() }
		fun FIELD() : TerminalNode? = getToken(FoldingParser.Tokens.FIELD.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun MUTABLE() : TerminalNode? = getToken(FoldingParser.Tokens.MUTABLE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  fieldSetted() : FieldSettedContext {
		var _localctx : FieldSettedContext = FieldSettedContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_fieldSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 422
			match(FIELD) as Token
			this.state = 424
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==MUTABLE) {
				if (true){
				this.state = 423
				match(MUTABLE) as Token
				}
			}

			this.state = 426
			match(ID) as Token
			this.state = 428
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 427
				typeEx()
				}
			}

			this.state = 430
			match(ASSGIN) as Token
			this.state = 431
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
		fun findJustDef() : JustDefContext? = getRuleContext(solver.getType("JustDefContext"),0)
		fun findTemplate() : TemplateContext? = getRuleContext(solver.getType("TemplateContext"),0)
		fun findForeignDef() : ForeignDefContext? = getRuleContext(solver.getType("ForeignDefContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  def() : DefContext {
		var _localctx : DefContext = DefContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_def.id)
		try {
			this.state = 436
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,56,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 433
			justDef()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 434
			template()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 435
			foreignDef()
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

	open class JustDefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_justDef.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findOpParameter() : OpParameterContext? = getRuleContext(solver.getType("OpParameterContext"),0)
		fun findAopParameter() : AopParameterContext? = getRuleContext(solver.getType("AopParameterContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  justDef() : JustDefContext {
		var _localctx : JustDefContext = JustDefContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_justDef.id)
		var _la: Int
		try {
			this.state = 485
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,67,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 439
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 438
				annotationBlock()
				}
			}

			this.state = 441
			match(ID) as Token
			this.state = 443
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 442
				compiledId()
				}
			}

			this.state = 446
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,59,context) ) {
			1   -> if (true){
			this.state = 445
			typeParam()
			}
			}
			this.state = 449
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,60,context) ) {
			1   -> if (true){
			this.state = 448
			parameter()
			}
			}
			this.state = 451
			typeEx()
			this.state = 452
			match(ASSGIN) as Token
			this.state = 453
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 456
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 455
				annotationBlock()
				}
			}

			this.state = 458
			opIdWrap()
			this.state = 460
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 459
				compiledId()
				}
			}

			this.state = 463
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 462
				typeParam()
				}
			}

			this.state = 465
			opParameter()
			this.state = 466
			typeEx()
			this.state = 467
			match(ASSGIN) as Token
			this.state = 468
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 471
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 470
				annotationBlock()
				}
			}

			this.state = 473
			opIdWrap()
			this.state = 475
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 474
				compiledId()
				}
			}

			this.state = 478
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 477
				typeParam()
				}
			}

			this.state = 480
			aopParameter()
			this.state = 481
			typeEx()
			this.state = 482
			match(ASSGIN) as Token
			this.state = 483
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

	open class TemplateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_template.id
	        set(value) { throw RuntimeException() }
		fun TEMPLATE() : TerminalNode? = getToken(FoldingParser.Tokens.TEMPLATE.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun RawString() : TerminalNode? = getToken(FoldingParser.Tokens.RawString.id, 0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findForeignBody() : ForeignBodyContext? = getRuleContext(solver.getType("ForeignBodyContext"),0)
		fun findOpParameter() : OpParameterContext? = getRuleContext(solver.getType("OpParameterContext"),0)
		fun findAopParameter() : AopParameterContext? = getRuleContext(solver.getType("AopParameterContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  template() : TemplateContext {
		var _localctx : TemplateContext = TemplateContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_template.id)
		var _la: Int
		try {
			this.state = 558
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,84,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 488
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 487
				annotationBlock()
				}
			}

			this.state = 490
			match(TEMPLATE) as Token
			this.state = 491
			match(ID) as Token
			this.state = 493
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 492
				compiledId()
				}
			}

			this.state = 496
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 495
				typeParam()
				}
			}

			this.state = 499
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 498
				parameter()
				}
			}

			this.state = 510
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 501
			match(FOREIGN) as Token
			this.state = 502
			typeEx()
			this.state = 504
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 503
				foreignBody()
				}
			}

			}}
			ASSGIN  ->  /*LL1AltBlock*/{if (true){
			this.state = 506
			match(ASSGIN) as Token
			this.state = 507
			typeEx()
			this.state = 508
			match(RawString) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 513
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 512
				annotationBlock()
				}
			}

			this.state = 515
			match(TEMPLATE) as Token
			this.state = 516
			match(ID) as Token
			this.state = 518
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
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
			opParameter()
			this.state = 533
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 524
			match(FOREIGN) as Token
			this.state = 525
			typeEx()
			this.state = 527
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 526
				foreignBody()
				}
			}

			}}
			ASSGIN  ->  /*LL1AltBlock*/{if (true){
			this.state = 529
			match(ASSGIN) as Token
			this.state = 530
			typeEx()
			this.state = 531
			match(RawString) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 536
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 535
				annotationBlock()
				}
			}

			this.state = 538
			match(TEMPLATE) as Token
			this.state = 539
			match(ID) as Token
			this.state = 541
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 540
				compiledId()
				}
			}

			this.state = 544
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 543
				typeParam()
				}
			}

			this.state = 546
			aopParameter()
			this.state = 556
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 547
			match(FOREIGN) as Token
			this.state = 548
			typeEx()
			this.state = 550
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 549
				foreignBody()
				}
			}

			}}
			ASSGIN  ->  /*LL1AltBlock*/{if (true){
			this.state = 552
			match(ASSGIN) as Token
			this.state = 553
			typeEx()
			this.state = 554
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

	open class ForeignDefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_foreignDef.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findForeignBody() : ForeignBodyContext? = getRuleContext(solver.getType("ForeignBodyContext"),0)
		fun findOpParameter() : OpParameterContext? = getRuleContext(solver.getType("OpParameterContext"),0)
		fun findAopParameter() : AopParameterContext? = getRuleContext(solver.getType("AopParameterContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignDef() : ForeignDefContext {
		var _localctx : ForeignDefContext = ForeignDefContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_foreignDef.id)
		var _la: Int
		try {
			this.state = 610
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,98,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 561
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 560
				annotationBlock()
				}
			}

			this.state = 563
			match(ID) as Token
			this.state = 565
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 564
				compiledId()
				}
			}

			this.state = 568
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 567
				typeParam()
				}
			}

			this.state = 571
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 570
				parameter()
				}
			}

			this.state = 573
			match(FOREIGN) as Token
			this.state = 574
			typeEx()
			this.state = 576
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 575
				foreignBody()
				}
			}

			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 579
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 578
				annotationBlock()
				}
			}

			this.state = 581
			match(ID) as Token
			this.state = 583
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 582
				compiledId()
				}
			}

			this.state = 586
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 585
				typeParam()
				}
			}

			this.state = 588
			opParameter()
			this.state = 589
			match(FOREIGN) as Token
			this.state = 590
			typeEx()
			this.state = 592
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 591
				foreignBody()
				}
			}

			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 595
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
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
			if (_la==Literal) {
				if (true){
				this.state = 598
				compiledId()
				}
			}

			this.state = 602
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 601
				typeParam()
				}
			}

			this.state = 604
			aopParameter()
			this.state = 605
			match(FOREIGN) as Token
			this.state = 606
			typeEx()
			this.state = 608
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 607
				foreignBody()
				}
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
		fun Literal() : TerminalNode? = getToken(FoldingParser.Tokens.Literal.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  compiledId() : CompiledIdContext {
		var _localctx : CompiledIdContext = CompiledIdContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_compiledId.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 612
			match(Literal) as Token
			}
		}
		catch (re: RecognitionException) {
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
		fun findParamEx() : List<ParamExContext> = getRuleContexts(solver.getType("ParamExContext"))
		fun findParamEx(i: Int) : ParamExContext? = getRuleContext(solver.getType("ParamExContext"),i)
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
			this.state = 614
			match(LSQUARE) as Token
			this.state = 618
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Literal) or (1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 615
				paramEx()
				}
				}
				this.state = 620
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 621
			match(RSQUARE) as Token
			this.state = 622
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
			this.state = 624
			match(LSQUARE) as Token
			this.state = 625
			match(OPID) as Token
			this.state = 626
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
			this.state = 628
			match(LSQUARE) as Token
			this.state = 629
			match(TILDE) as Token
			this.state = 630
			match(OPID) as Token
			this.state = 631
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
		enterRule(_localctx, 80, Rules.RULE_typeEx.id)
		try {
			this.state = 635
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 633
			typeExParameter()
			}}
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 634
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
			this.state = 640
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,101,context) ) {
			1   -> if (true){
			this.state = 637
			package_()
			this.state = 638
			match(DOT) as Token
			}
			}
			this.state = 642
			match(ID) as Token
			this.state = 651
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,103,context) ) {
			1   -> if (true){
			this.state = 643
			match(LPAREN) as Token
			this.state = 645 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 644
				typeEx()
				}
				}
				this.state = 647 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==LPAREN || _la==ID )
			this.state = 649
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
			this.state = 653
			typeEx()
			this.state = 655
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 654
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
		enterRule(_localctx, 86, Rules.RULE_typeExParameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 657
			match(LPAREN) as Token
			this.state = 661
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN || _la==ID) {
				if (true){
				if (true){
				this.state = 658
				typeExParamEx()
				}
				}
				this.state = 663
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 664
			match(RPAREN) as Token
			this.state = 665
			match(ARROW) as Token
			this.state = 666
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
		enterRule(_localctx, 88, Rules.RULE_foreignBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 668
			match(LBRACE) as Token
			this.state = 672
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 669
				foreignElement()
				}
				}
				this.state = 674
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 675
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
			this.state = 684
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,107,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 677
			foreignPlatform()
			this.state = 678
			match(RawString) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 680
			foreignPlatform()
			this.state = 681
			match(TILDE) as Token
			this.state = 682
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
			this.state = 686
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
			this.state = 688
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
			this.state = 690
			match(ID) as Token
			this.state = 691
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
		enterRule(_localctx, 98, Rules.RULE_annotationDef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 693
			match(ANNOTATION) as Token
			this.state = 694
			match(ID) as Token
			this.state = 703
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 695
				match(LPAREN) as Token
				this.state = 699
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==ID) {
					if (true){
					if (true){
					this.state = 696
					annoParam()
					}
					}
					this.state = 701
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				this.state = 702
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
			this.state = 721
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,112,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 705
			match(ID) as Token
			this.state = 709
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 706
				annoValue()
				}
				}
				this.state = 711
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 712
			match(ID) as Token
			this.state = 713
			match(LPAREN) as Token
			this.state = 717
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 714
				annoValue()
				}
				}
				this.state = 719
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 720
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
		enterRule(_localctx, 102, Rules.RULE_annotationBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 723
			match(LCOLONSQUARE) as Token
			this.state = 727
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 724
				annotation()
				}
				}
				this.state = 729
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 730
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

	override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		21 -> return value_sempred(_localctx as ValueContext, predIndex)
		}
		return true
	}
	private fun value_sempred( _localctx : ValueContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 4)
		    1 -> return precpred(context!!, 8)
		    2 -> return precpred(context!!, 7)
		    3 -> return precpred(context!!, 6)
		}
		return true
	}

}