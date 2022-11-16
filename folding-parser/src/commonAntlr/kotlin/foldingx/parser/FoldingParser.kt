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
                                                              FoldingParser.TypeParamContext::class,
                                                              FoldingParser.TypeParamCompoContext::class,
                                                              FoldingParser.DefinitionContext::class,
                                                              FoldingParser.ValueContext::class,
                                                              FoldingParser.TypeCastingContext::class,
                                                              FoldingParser.ParamExContext::class,
                                                              FoldingParser.ParamCExContext::class,
                                                              FoldingParser.ParameterContext::class,
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
        ANNOTATION(5),
        CLASS(6),
        DO(7),
        FOREIGN(8),
        TEMPLATE(9),
        NAMESPACE(10),
        INTERNAL(11),
        IMPORT(12),
        IMPL(13),
        RETURN(14),
        MUTABLE(15),
        FIELD(16),
        ASSGIN(17),
        ELLIPSIS(18),
        DOT(19),
        LPAREN(20),
        RPAREN(21),
        LSQUARE(22),
        LCOLONSQUARE(23),
        RSQUARE(24),
        RCOLONSQUARE(25),
        LBRACE(26),
        RBRACE(27),
        ARROW(28),
        TILDE(29),
        As(30),
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
        RULE_typeParam(17),
        RULE_typeParamCompo(18),
        RULE_definition(19),
        RULE_value(20),
        RULE_typeCasting(21),
        RULE_paramEx(22),
        RULE_paramCEx(23),
        RULE_parameter(24),
        RULE_argEx(25),
        RULE_argValue(26),
        RULE_field(27),
        RULE_fieldNotInit(28),
        RULE_fieldSetted(29),
        RULE_def(30),
        RULE_justDef(31),
        RULE_template(32),
        RULE_foreignDef(33),
        RULE_compiledId(34),
        RULE_lambda(35),
        RULE_opIdWrap(36),
        RULE_aopIdWrap(37),
        RULE_typeEx(38),
        RULE_typeExSingle(39),
        RULE_typeExParamEx(40),
        RULE_typeExParameter(41),
        RULE_foreignBody(42),
        RULE_foreignElement(43),
        RULE_foreignPlatform(44),
        RULE_annoValue(45),
        RULE_annoParam(46),
        RULE_annotationDef(47),
        RULE_annotation(48),
        RULE_annotationBlock(49)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "importEx", "importVanila", "package_", 
                                "namespace", "doBlock", "compo", "returning", 
                                "fieldAssign", "class_", "classBody", "constructor_", 
                                "constructorSelf", "defInInterface", "impl", 
                                "implBody", "defInImpl", "typeParam", "typeParamCompo", 
                                "definition", "value", "typeCasting", "paramEx", 
                                "paramCEx", "parameter", "argEx", "argValue", 
                                "field", "fieldNotInit", "fieldSetted", 
                                "def", "justDef", "template", "foreignDef", 
                                "compiledId", "lambda", "opIdWrap", "aopIdWrap", 
                                "typeEx", "typeExSingle", "typeExParamEx", 
                                "typeExParameter", "foreignBody", "foreignElement", 
                                "foreignPlatform", "annoValue", "annoParam", 
                                "annotationDef", "annotation", "annotationBlock")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
                                                          null, null, "'annotation'", 
                                                          "'class'", "'do'", 
                                                          "'foreign'", "'template'", 
                                                          "'package'", "'internal'", 
                                                          "'import'", "'impl'", 
                                                          "'return'", "'mutable'", 
                                                          "'field'", "'='", 
                                                          "'...'", "'.'", 
                                                          "'('", "')'", 
                                                          "'['", "'[:'", 
                                                          "']'", "':]'", 
                                                          "'{'", "'}'", 
                                                          "'->'", "'~'", 
                                                          "'~>'", "':'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "Literal", 
                                                           "WS", "COMMENT", 
                                                           "LINE_COMMENT", 
                                                           "ANNOTATION", 
                                                           "CLASS", "DO", 
                                                           "FOREIGN", "TEMPLATE", 
                                                           "NAMESPACE", 
                                                           "INTERNAL", "IMPORT", 
                                                           "IMPL", "RETURN", 
                                                           "MUTABLE", "FIELD", 
                                                           "ASSGIN", "ELLIPSIS", 
                                                           "DOT", "LPAREN", 
                                                           "RPAREN", "LSQUARE", 
                                                           "LCOLONSQUARE", 
                                                           "RSQUARE", "RCOLONSQUARE", 
                                                           "LBRACE", "RBRACE", 
                                                           "ARROW", "TILDE", 
                                                           "As", "COLON", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0027\u0268\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0003\u0002\u0005\u0002\u0068\u000a\u0002\u0003\u0002\u0007\u0002\u006b\u000a\u0002\u000c\u0002\u000e\u0002\u006e\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u0073\u000a\u0002\u000c\u0002\u000e\u0002\u0076\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0007\u0005\u0080\u000a\u0005\u000c\u0005\u000e\u0005\u0083\u000b\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0007\u0007\u008b\u000a\u0007\u000c\u0007\u000e\u0007\u008e\u000b\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u0095\u000a\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0005\u000b\u009f\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u00a4\u000a\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0007\u000c\u00aa\u000a\u000c\u000c\u000c\u000e\u000c\u00ad\u000b\u000c\u0003\u000c\u0005\u000c\u00b0\u000a\u000c\u0003\u000c\u0007\u000c\u00b3\u000a\u000c\u000c\u000c\u000e\u000c\u00b6\u000b\u000c\u0003\u000c\u0007\u000c\u00b9\u000a\u000c\u000c\u000c\u000e\u000c\u00bc\u000b\u000c\u0003\u000c\u0007\u000c\u00bf\u000a\u000c\u000c\u000c\u000e\u000c\u00c2\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0005\u000d\u00c8\u000a\u000d\u0003\u000d\u0005\u000d\u00cb\u000a\u000d\u0003\u000e\u0005\u000e\u00ce\u000a\u000e\u0003\u000e\u0005\u000e\u00d1\u000a\u000e\u0003\u000f\u0005\u000f\u00d4\u000a\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00d8\u000a\u000f\u0003\u000f\u0005\u000f\u00db\u000a\u000f\u0003\u000f\u0005\u000f\u00de\u000a\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00e2\u000a\u000f\u0003\u0010\u0003\u0010\u0005\u0010\u00e6\u000a\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u00ea\u000a\u0010\u0003\u0011\u0003\u0011\u0007\u0011\u00ee\u000a\u0011\u000c\u0011\u000e\u0011\u00f1\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0005\u0012\u00f6\u000a\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u00fa\u000a\u0012\u0003\u0012\u0005\u0012\u00fd\u000a\u0012\u0003\u0012\u0005\u0012\u0100\u000a\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0006\u0013\u0107\u000a\u0013\u000d\u0013\u000e\u0013\u0108\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014\u010e\u000a\u0014\u000c\u0014\u000e\u0014\u0111\u000b\u0014\u0003\u0015\u0003\u0015\u0005\u0015\u0115\u000a\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u011f\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u0125\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u012b\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u0136\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0007\u0016\u0142\u000a\u0016\u000c\u0016\u000e\u0016\u0145\u000b\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0005\u0018\u014c\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0007\u001a\u0157\u000a\u001a\u000c\u001a\u000e\u001a\u015a\u000b\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0006\u001a\u0160\u000a\u001a\u000d\u001a\u000e\u001a\u0161\u0003\u001a\u0003\u001a\u0005\u001a\u0166\u000a\u001a\u0003\u001b\u0003\u001b\u0005\u001b\u016a\u000a\u001b\u0003\u001b\u0003\u001b\u0005\u001b\u016e\u000a\u001b\u0003\u001b\u0003\u001b\u0007\u001b\u0172\u000a\u001b\u000c\u001b\u000e\u001b\u0175\u000b\u001b\u0003\u001b\u0005\u001b\u0178\u000a\u001b\u0003\u001c\u0003\u001c\u0006\u001c\u017c\u000a\u001c\u000d\u001c\u000e\u001c\u017d\u0005\u001c\u0180\u000a\u001c\u0003\u001c\u0003\u001c\u0007\u001c\u0184\u000a\u001c\u000c\u001c\u000e\u001c\u0187\u000b\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0005\u001d\u018d\u000a\u001d\u0003\u001e\u0003\u001e\u0005\u001e\u0191\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0005\u001f\u0198\u000a\u001f\u0003\u001f\u0003\u001f\u0005\u001f\u019c\u000a\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u01a4\u000a\u0020\u0003\u0021\u0005\u0021\u01a7\u000a\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0005\u0021\u01ac\u000a\u0021\u0003\u0021\u0005\u0021\u01af\u000a\u0021\u0003\u0021\u0005\u0021\u01b2\u000a\u0021\u0003\u0021\u0005\u0021\u01b5\u000a\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0005\u0022\u01bc\u000a\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0005\u0022\u01c2\u000a\u0022\u0003\u0022\u0005\u0022\u01c5\u000a\u0022\u0003\u0022\u0005\u0022\u01c8\u000a\u0022\u0003\u0022\u0005\u0022\u01cb\u000a\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0005\u0022\u01d0\u000a\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0005\u0022\u01d6\u000a\u0022\u0003\u0023\u0005\u0023\u01d9\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u01de\u000a\u0023\u0003\u0023\u0005\u0023\u01e1\u000a\u0023\u0003\u0023\u0005\u0023\u01e4\u000a\u0023\u0003\u0023\u0005\u0023\u01e7\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0005\u0023\u01ec\u000a\u0023\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0007\u0025\u01f2\u000a\u0025\u000c\u0025\u000e\u0025\u01f5\u000b\u0025\u0003\u0025\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0005\u0028\u0205\u000a\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u020a\u000a\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0006\u0029\u020f\u000a\u0029\u000d\u0029\u000e\u0029\u0210\u0003\u0029\u0003\u0029\u0005\u0029\u0215\u000a\u0029\u0003\u002a\u0003\u002a\u0005\u002a\u0219\u000a\u002a\u0003\u002b\u0003\u002b\u0007\u002b\u021d\u000a\u002b\u000c\u002b\u000e\u002b\u0220\u000b\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002c\u0003\u002c\u0007\u002c\u0228\u000a\u002c\u000c\u002c\u000e\u002c\u022b\u000b\u002c\u0003\u002c\u0003\u002c\u0005\u002c\u022f\u000a\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0005\u002d\u0238\u000a\u002d\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0007\u0031\u0245\u000a\u0031\u000c\u0031\u000e\u0031\u0248\u000b\u0031\u0003\u0031\u0005\u0031\u024b\u000a\u0031\u0003\u0032\u0003\u0032\u0007\u0032\u024f\u000a\u0032\u000c\u0032\u000e\u0032\u0252\u000b\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0007\u0032\u0257\u000a\u0032\u000c\u0032\u000e\u0032\u025a\u000b\u0032\u0003\u0032\u0005\u0032\u025d\u000a\u0032\u0003\u0033\u0003\u0033\u0007\u0033\u0261\u000a\u0033\u000c\u0033\u000e\u0033\u0264\u000b\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0002\u0003\u002a\u0034\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0002\u0003\u0003\u0002\u0024\u0026\u0002\u029f\u0002\u0067\u0003\u0002\u0002\u0002\u0004\u0077\u0003\u0002\u0002\u0002\u0006\u0079\u0003\u0002\u0002\u0002\u0008\u007c\u0003\u0002\u0002\u0002\u000a\u0084\u0003\u0002\u0002\u0002\u000c\u0087\u0003\u0002\u0002\u0002\u000e\u0094\u0003\u0002\u0002\u0002\u0010\u0096\u0003\u0002\u0002\u0002\u0012\u0099\u0003\u0002\u0002\u0002\u0014\u009e\u0003\u0002\u0002\u0002\u0016\u00a7\u0003\u0002\u0002\u0002\u0018\u00c5\u0003\u0002\u0002\u0002\u001a\u00cd\u0003\u0002\u0002\u0002\u001c\u00d3\u0003\u0002\u0002\u0002\u001e\u00e3\u0003\u0002\u0002\u0002\u0020\u00eb\u0003\u0002\u0002\u0002\u0022\u00f5\u0003\u0002\u0002\u0002\u0024\u0106\u0003\u0002\u0002\u0002\u0026\u010a\u0003\u0002\u0002\u0002\u0028\u0114\u0003\u0002\u0002\u0002\u002a\u0135\u0003\u0002\u0002\u0002\u002c\u0146\u0003\u0002\u0002\u0002\u002e\u0149\u0003\u0002\u0002\u0002\u0030\u0150\u0003\u0002\u0002\u0002\u0032\u0154\u0003\u0002\u0002\u0002\u0034\u0177\u0003\u0002\u0002\u0002\u0036\u017f\u0003\u0002\u0002\u0002\u0038\u018c\u0003\u0002\u0002\u0002\u003a\u018e\u0003\u0002\u0002\u0002\u003c\u0195\u0003\u0002\u0002\u0002\u003e\u01a3\u0003\u0002\u0002\u0002\u0040\u01a6\u0003\u0002\u0002\u0002\u0042\u01bb\u0003\u0002\u0002\u0002\u0044\u01d8\u0003\u0002\u0002\u0002\u0046\u01ed\u0003\u0002\u0002\u0002\u0048\u01ef\u0003\u0002\u0002\u0002\u004a\u01f9\u0003\u0002\u0002\u0002\u004c\u01fd\u0003\u0002\u0002\u0002\u004e\u0204\u0003\u0002\u0002\u0002\u0050\u0209\u0003\u0002\u0002\u0002\u0052\u0216\u0003\u0002\u0002\u0002\u0054\u021a\u0003\u0002\u0002\u0002\u0056\u022e\u0003\u0002\u0002\u0002\u0058\u0237\u0003\u0002\u0002\u0002\u005a\u0239\u0003\u0002\u0002\u0002\u005c\u023b\u0003\u0002\u0002\u0002\u005e\u023d\u0003\u0002\u0002\u0002\u0060\u0240\u0003\u0002\u0002\u0002\u0062\u025c\u0003\u0002\u0002\u0002\u0064\u025e\u0003\u0002\u0002\u0002\u0066\u0068\u0005\u000a\u0006\u0002\u0067\u0066\u0003\u0002\u0002\u0002\u0067\u0068\u0003\u0002\u0002\u0002\u0068\u006c\u0003\u0002\u0002\u0002\u0069\u006b\u0005\u0004\u0003\u0002\u006a\u0069\u0003\u0002\u0002\u0002\u006b\u006e\u0003\u0002\u0002\u0002\u006c\u006a\u0003\u0002\u0002\u0002\u006c\u006d\u0003\u0002\u0002\u0002\u006d\u0074\u0003\u0002\u0002\u0002\u006e\u006c\u0003\u0002\u0002\u0002\u006f\u0073\u0005\u0028\u0015\u0002\u0070\u0073\u0005\u0038\u001d\u0002\u0071\u0073\u0005\u0060\u0031\u0002\u0072\u006f\u0003\u0002\u0002\u0002\u0072\u0070\u0003\u0002\u0002\u0002\u0072\u0071\u0003\u0002\u0002\u0002\u0073\u0076\u0003\u0002\u0002\u0002\u0074\u0072\u0003\u0002\u0002\u0002\u0074\u0075\u0003\u0002\u0002\u0002\u0075\u0003\u0003\u0002\u0002\u0002\u0076\u0074\u0003\u0002\u0002\u0002\u0077\u0078\u0005\u0006\u0004\u0002\u0078\u0005\u0003\u0002\u0002\u0002\u0079\u007a\u0007\u000e\u0002\u0002\u007a\u007b\u0005\u0008\u0005\u0002\u007b\u0007\u0003\u0002\u0002\u0002\u007c\u0081\u0007\u0022\u0002\u0002\u007d\u007e\u0007\u0015\u0002\u0002\u007e\u0080\u0007\u0022\u0002\u0002\u007f\u007d\u0003\u0002\u0002\u0002\u0080\u0083\u0003\u0002\u0002\u0002\u0081\u007f\u0003\u0002\u0002\u0002\u0081\u0082\u0003\u0002\u0002\u0002\u0082\u0009\u0003\u0002\u0002\u0002\u0083\u0081\u0003\u0002\u0002\u0002\u0084\u0085\u0007\u000c\u0002\u0002\u0085\u0086\u0005\u0008\u0005\u0002\u0086\u000b\u0003\u0002\u0002\u0002\u0087\u0088\u0007\u0009\u0002\u0002\u0088\u008c\u0007\u001c\u0002\u0002\u0089\u008b\u0005\u000e\u0008\u0002\u008a\u0089\u0003\u0002\u0002\u0002\u008b\u008e\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002\u0002\u008c\u008d\u0003\u0002\u0002\u0002\u008d\u008f\u0003\u0002\u0002\u0002\u008e\u008c\u0003\u0002\u0002\u0002\u008f\u0090\u0007\u001d\u0002\u0002\u0090\u000d\u0003\u0002\u0002\u0002\u0091\u0095\u0005\u0012\u000a\u0002\u0092\u0095\u0005\u002a\u0016\u0002\u0093\u0095\u0005\u0010\u0009\u0002\u0094\u0091\u0003\u0002\u0002\u0002\u0094\u0092\u0003\u0002\u0002\u0002\u0094\u0093\u0003\u0002\u0002\u0002\u0095\u000f\u0003\u0002\u0002\u0002\u0096\u0097\u0007\u0010\u0002\u0002\u0097\u0098\u0005\u002a\u0016\u0002\u0098\u0011\u0003\u0002\u0002\u0002\u0099\u009a\u0005\u002a\u0016\u0002\u009a\u009b\u0007\u0013\u0002\u0002\u009b\u009c\u0005\u002a\u0016\u0002\u009c\u0013\u0003\u0002\u0002\u0002\u009d\u009f\u0005\u0064\u0033\u0002\u009e\u009d\u0003\u0002\u0002\u0002\u009e\u009f\u0003\u0002\u0002\u0002\u009f\u00a0\u0003\u0002\u0002\u0002\u00a0\u00a1\u0007\u0008\u0002\u0002\u00a1\u00a3\u0007\u0022\u0002\u0002\u00a2\u00a4\u0005\u0024\u0013\u0002\u00a3\u00a2\u0003\u0002\u0002\u0002\u00a3\u00a4\u0003\u0002\u0002\u0002\u00a4\u00a5\u0003\u0002\u0002\u0002\u00a5\u00a6\u0005\u0016\u000c\u0002\u00a6\u0015\u0003\u0002\u0002\u0002\u00a7\u00af\u0007\u001c\u0002\u0002\u00a8\u00aa\u0005\u0018\u000d\u0002\u00a9\u00a8\u0003\u0002\u0002\u0002\u00aa\u00ad\u0003\u0002\u0002\u0002\u00ab\u00a9\u0003\u0002\u0002\u0002\u00ab\u00ac\u0003\u0002\u0002\u0002\u00ac\u00b0\u0003\u0002\u0002\u0002\u00ad\u00ab\u0003\u0002\u0002\u0002\u00ae\u00b0\u0005\u001a\u000e\u0002\u00af\u00ab\u0003\u0002\u0002\u0002\u00af\u00ae\u0003\u0002\u0002\u0002\u00b0\u00b4\u0003\u0002\u0002\u0002\u00b1\u00b3\u0005\u0038\u001d\u0002\u00b2\u00b1\u0003\u0002\u0002\u0002\u00b3\u00b6\u0003\u0002\u0002\u0002\u00b4\u00b2\u0003\u0002\u0002\u0002\u00b4\u00b5\u0003\u0002\u0002\u0002\u00b5\u00ba\u0003\u0002\u0002\u0002\u00b6\u00b4\u0003\u0002\u0002\u0002\u00b7\u00b9\u0005\u001c\u000f\u0002\u00b8\u00b7\u0003\u0002\u0002\u0002\u00b9\u00bc\u0003\u0002\u0002\u0002\u00ba\u00b8\u0003\u0002\u0002\u0002\u00ba\u00bb\u0003\u0002\u0002\u0002\u00bb\u00c0\u0003\u0002\u0002\u0002\u00bc\u00ba\u0003\u0002\u0002\u0002\u00bd\u00bf\u0005\u001e\u0010\u0002\u00be\u00bd\u0003\u0002\u0002\u0002\u00bf\u00c2\u0003\u0002\u0002\u0002\u00c0\u00be\u0003\u0002\u0002\u0002\u00c0\u00c1\u0003\u0002\u0002\u0002\u00c1\u00c3\u0003\u0002\u0002\u0002\u00c2\u00c0\u0003\u0002\u0002\u0002\u00c3\u00c4\u0007\u001d\u0002\u0002\u00c4\u0017\u0003\u0002\u0002\u0002\u00c5\u00c7\u0007\u0022\u0002\u0002\u00c6\u00c8\u0005\u0032\u001a\u0002\u00c7\u00c6\u0003\u0002\u0002\u0002\u00c7\u00c8\u0003\u0002\u0002\u0002\u00c8\u00ca\u0003\u0002\u0002\u0002\u00c9\u00cb\u0005\u000c\u0007\u0002\u00ca\u00c9\u0003\u0002\u0002\u0002\u00ca\u00cb\u0003\u0002\u0002\u0002\u00cb\u0019\u0003\u0002\u0002\u0002\u00cc\u00ce\u0005\u0032\u001a\u0002\u00cd\u00cc\u0003\u0002\u0002\u0002\u00cd\u00ce\u0003\u0002\u0002\u0002\u00ce\u00d0\u0003\u0002\u0002\u0002\u00cf\u00d1\u0005\u000c\u0007\u0002\u00d0\u00cf\u0003\u0002\u0002\u0002\u00d0\u00d1\u0003\u0002\u0002\u0002\u00d1\u001b\u0003\u0002\u0002\u0002\u00d2\u00d4\u0005\u0064\u0033\u0002\u00d3\u00d2\u0003\u0002\u0002\u0002\u00d3\u00d4\u0003\u0002\u0002\u0002\u00d4\u00d5\u0003\u0002\u0002\u0002\u00d5\u00d7\u0007\u0022\u0002\u0002\u00d6\u00d8\u0005\u0046\u0024\u0002\u00d7\u00d6\u0003\u0002\u0002\u0002\u00d7\u00d8\u0003\u0002\u0002\u0002\u00d8\u00da\u0003\u0002\u0002\u0002\u00d9\u00db\u0005\u0024\u0013\u0002\u00da\u00d9\u0003\u0002\u0002\u0002\u00da\u00db\u0003\u0002\u0002\u0002\u00db\u00dd\u0003\u0002\u0002\u0002\u00dc\u00de\u0005\u0032\u001a\u0002\u00dd\u00dc\u0003\u0002\u0002\u0002\u00dd\u00de\u0003\u0002\u0002\u0002\u00de\u00df\u0003\u0002\u0002\u0002\u00df\u00e1\u0005\u004e\u0028\u0002\u00e0\u00e2\u0005\u002a\u0016\u0002\u00e1\u00e0\u0003\u0002\u0002\u0002\u00e1\u00e2\u0003\u0002\u0002\u0002\u00e2\u001d\u0003\u0002\u0002\u0002\u00e3\u00e5\u0007\u000f\u0002\u0002\u00e4\u00e6\u0005\u0024\u0013\u0002\u00e5\u00e4\u0003\u0002\u0002\u0002\u00e5\u00e6\u0003\u0002\u0002\u0002\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u00e9\u0005\u004e\u0028\u0002\u00e8\u00ea\u0005\u0020\u0011\u0002\u00e9\u00e8\u0003\u0002\u0002\u0002\u00e9\u00ea\u0003\u0002\u0002\u0002\u00ea\u001f\u0003\u0002\u0002\u0002\u00eb\u00ef\u0007\u001c\u0002\u0002\u00ec\u00ee\u0005\u0022\u0012\u0002\u00ed\u00ec\u0003\u0002\u0002\u0002\u00ee\u00f1\u0003\u0002\u0002\u0002\u00ef\u00ed\u0003\u0002\u0002\u0002\u00ef\u00f0\u0003\u0002\u0002\u0002\u00f0\u00f2\u0003\u0002\u0002\u0002\u00f1\u00ef\u0003\u0002\u0002\u0002\u00f2\u00f3\u0007\u001d\u0002\u0002\u00f3\u0021\u0003\u0002\u0002\u0002\u00f4\u00f6\u0005\u0064\u0033\u0002\u00f5\u00f4\u0003\u0002\u0002\u0002\u00f5\u00f6\u0003\u0002\u0002\u0002\u00f6\u00f7\u0003\u0002\u0002\u0002\u00f7\u00f9\u0007\u0022\u0002\u0002\u00f8\u00fa\u0005\u0046\u0024\u0002\u00f9\u00f8\u0003\u0002\u0002\u0002\u00f9\u00fa\u0003\u0002\u0002\u0002\u00fa\u00fc\u0003\u0002\u0002\u0002\u00fb\u00fd\u0005\u0024\u0013\u0002\u00fc\u00fb\u0003\u0002\u0002\u0002\u00fc\u00fd\u0003\u0002\u0002\u0002\u00fd\u00ff\u0003\u0002\u0002\u0002\u00fe\u0100\u0005\u0032\u001a\u0002\u00ff\u00fe\u0003\u0002\u0002\u0002\u00ff\u0100\u0003\u0002\u0002\u0002\u0100\u0101\u0003\u0002\u0002\u0002\u0101\u0102\u0005\u004e\u0028\u0002\u0102\u0103\u0007\u0013\u0002\u0002\u0103\u0104\u0005\u002a\u0016\u0002\u0104\u0023\u0003\u0002\u0002\u0002\u0105\u0107\u0005\u0026\u0014\u0002\u0106\u0105\u0003\u0002\u0002\u0002\u0107\u0108\u0003\u0002\u0002\u0002\u0108\u0106\u0003\u0002\u0002\u0002\u0108\u0109\u0003\u0002\u0002\u0002\u0109\u0025\u0003\u0002\u0002\u0002\u010a\u010f\u0007\u0022\u0002\u0002\u010b\u010c\u0007\u001f\u0002\u0002\u010c\u010e\u0005\u004e\u0028\u0002\u010d\u010b\u0003\u0002\u0002\u0002\u010e\u0111\u0003\u0002\u0002\u0002\u010f\u010d\u0003\u0002\u0002\u0002\u010f\u0110\u0003\u0002\u0002\u0002\u0110\u0027\u0003\u0002\u0002\u0002\u0111\u010f\u0003\u0002\u0002\u0002\u0112\u0115\u0005\u003e\u0020\u0002\u0113\u0115\u0005\u0014\u000b\u0002\u0114\u0112\u0003\u0002\u0002\u0002\u0114\u0113\u0003\u0002\u0002\u0002\u0115\u0029\u0003\u0002\u0002\u0002\u0116\u0117\u0008\u0016\u0001\u0002\u0117\u0136\u0007\u0024\u0002\u0002\u0118\u0136\u0007\u0025\u0002\u0002\u0119\u0136\u0007\u0026\u0002\u0002\u011a\u0136\u0007\u0003\u0002\u0002\u011b\u011c\u0005\u0008\u0005\u0002\u011c\u011d\u0007\u0015\u0002\u0002\u011d\u011f\u0003\u0002\u0002\u0002\u011e\u011b\u0003\u0002\u0002\u0002\u011e\u011f\u0003\u0002\u0002\u0002\u011f\u0120\u0003\u0002\u0002\u0002\u0120\u0136\u0007\u0022\u0002\u0002\u0121\u0122\u0005\u0008\u0005\u0002\u0122\u0123\u0007\u0015\u0002\u0002\u0123\u0125\u0003\u0002\u0002\u0002\u0124\u0121\u0003\u0002\u0002\u0002\u0124\u0125\u0003\u0002\u0002\u0002\u0125\u0126\u0003\u0002\u0002\u0002\u0126\u0136\u0005\u004a\u0026\u0002\u0127\u0128\u0005\u0008\u0005\u0002\u0128\u0129\u0007\u0015\u0002\u0002\u0129\u012b\u0003\u0002\u0002\u0002\u012a\u0127\u0003\u0002\u0002\u0002\u012a\u012b\u0003\u0002\u0002\u0002\u012b\u012c\u0003\u0002\u0002\u0002\u012c\u0136\u0005\u004c\u0027\u0002\u012d\u012e\u0007\u0023\u0002\u0002\u012e\u0136\u0005\u002a\u0016\u0007\u012f\u0136\u0005\u000c\u0007\u0002\u0130\u0136\u0005\u0048\u0025\u0002\u0131\u0132\u0007\u0016\u0002\u0002\u0132\u0133\u0005\u002a\u0016\u0002\u0133\u0134\u0007\u0017\u0002\u0002\u0134\u0136\u0003\u0002\u0002\u0002\u0135\u0116\u0003\u0002\u0002\u0002\u0135\u0118\u0003\u0002\u0002\u0002\u0135\u0119\u0003\u0002\u0002\u0002\u0135\u011a\u0003\u0002\u0002\u0002\u0135\u011e\u0003\u0002\u0002\u0002\u0135\u0124\u0003\u0002\u0002\u0002\u0135\u012a\u0003\u0002\u0002\u0002\u0135\u012d\u0003\u0002\u0002\u0002\u0135\u012f\u0003\u0002\u0002\u0002\u0135\u0130\u0003\u0002\u0002\u0002\u0135\u0131\u0003\u0002\u0002\u0002\u0136\u0143\u0003\u0002\u0002\u0002\u0137\u0138\u000c\u0006\u0002\u0002\u0138\u0139\u0007\u0023\u0002\u0002\u0139\u0142\u0005\u002a\u0016\u0007\u013a\u013b\u000c\u000a\u0002\u0002\u013b\u013c\u0007\u0021\u0002\u0002\u013c\u0142\u0007\u0022\u0002\u0002\u013d\u013e\u000c\u0009\u0002\u0002\u013e\u0142\u0005\u0036\u001c\u0002\u013f\u0140\u000c\u0008\u0002\u0002\u0140\u0142\u0005\u002c\u0017\u0002\u0141\u0137\u0003\u0002\u0002\u0002\u0141\u013a\u0003\u0002\u0002\u0002\u0141\u013d\u0003\u0002\u0002\u0002\u0141\u013f\u0003\u0002\u0002\u0002\u0142\u0145\u0003\u0002\u0002\u0002\u0143\u0141\u0003\u0002\u0002\u0002\u0143\u0144\u0003\u0002\u0002\u0002\u0144\u002b\u0003\u0002\u0002\u0002\u0145\u0143\u0003\u0002\u0002\u0002\u0146\u0147\u0007\u0020\u0002\u0002\u0147\u0148\u0005\u004e\u0028\u0002\u0148\u002d\u0003\u0002\u0002\u0002\u0149\u014b\u0007\u0022\u0002\u0002\u014a\u014c\u0007\u0014\u0002\u0002\u014b\u014a\u0003\u0002\u0002\u0002\u014b\u014c\u0003\u0002\u0002\u0002\u014c\u014d\u0003\u0002\u0002\u0002\u014d\u014e\u0007\u001f\u0002\u0002\u014e\u014f\u0005\u004e\u0028\u0002\u014f\u002f\u0003\u0002\u0002\u0002\u0150\u0151\u0005\u002a\u0016\u0002\u0151\u0152\u0007\u001f\u0002\u0002\u0152\u0153\u0005\u004e\u0028\u0002\u0153\u0031\u0003\u0002\u0002\u0002\u0154\u0158\u0007\u0016\u0002\u0002\u0155\u0157\u0005\u002e\u0018\u0002\u0156\u0155\u0003\u0002\u0002\u0002\u0157\u015a\u0003\u0002\u0002\u0002\u0158\u0156\u0003\u0002\u0002\u0002\u0158\u0159\u0003\u0002\u0002\u0002\u0159\u015b\u0003\u0002\u0002\u0002\u015a\u0158\u0003\u0002\u0002\u0002\u015b\u0165\u0007\u0017\u0002\u0002\u015c\u015d\u0007\u001f\u0002\u0002\u015d\u015f\u0007\u0016\u0002\u0002\u015e\u0160\u0005\u0030\u0019\u0002\u015f\u015e\u0003\u0002\u0002\u0002\u0160\u0161\u0003\u0002\u0002\u0002\u0161\u015f\u0003\u0002\u0002\u0002\u0161\u0162\u0003\u0002\u0002\u0002\u0162\u0163\u0003\u0002\u0002\u0002\u0163\u0164\u0007\u0017\u0002\u0002\u0164\u0166\u0003\u0002\u0002\u0002\u0165\u015c\u0003\u0002\u0002\u0002\u0165\u0166\u0003\u0002\u0002\u0002\u0166\u0033\u0003\u0002\u0002\u0002\u0167\u0168\u0007\u0022\u0002\u0002\u0168\u016a\u0007\u0013\u0002\u0002\u0169\u0167\u0003\u0002\u0002\u0002\u0169\u016a\u0003\u0002\u0002\u0002\u016a\u016b\u0003\u0002\u0002\u0002\u016b\u0178\u0005\u002a\u0016\u0002\u016c\u016e\u0007\u0022\u0002\u0002\u016d\u016c\u0003\u0002\u0002\u0002\u016d\u016e\u0003\u0002\u0002\u0002\u016e\u016f\u0003\u0002\u0002\u0002\u016f\u0173\u0007\u001c\u0002\u0002\u0170\u0172\u0005\u002a\u0016\u0002\u0171\u0170\u0003\u0002\u0002\u0002\u0172\u0175\u0003\u0002\u0002\u0002\u0173\u0171\u0003\u0002\u0002\u0002\u0173\u0174\u0003\u0002\u0002\u0002\u0174\u0176\u0003\u0002\u0002\u0002\u0175\u0173\u0003\u0002\u0002\u0002\u0176\u0178\u0007\u001d\u0002\u0002\u0177\u0169\u0003\u0002\u0002\u0002\u0177\u016d\u0003\u0002\u0002\u0002\u0178\u0035\u0003\u0002\u0002\u0002\u0179\u017b\u0007\u001f\u0002\u0002\u017a\u017c\u0005\u004e\u0028\u0002\u017b\u017a\u0003\u0002\u0002\u0002\u017c\u017d\u0003\u0002\u0002\u0002\u017d\u017b\u0003\u0002\u0002\u0002\u017d\u017e\u0003\u0002\u0002\u0002\u017e\u0180\u0003\u0002\u0002\u0002\u017f\u0179\u0003\u0002\u0002\u0002\u017f\u0180\u0003\u0002\u0002\u0002\u0180\u0181\u0003\u0002\u0002\u0002\u0181\u0185\u0007\u0016\u0002\u0002\u0182\u0184\u0005\u0034\u001b\u0002\u0183\u0182\u0003\u0002\u0002\u0002\u0184\u0187\u0003\u0002\u0002\u0002\u0185\u0183\u0003\u0002\u0002\u0002\u0185\u0186\u0003\u0002\u0002\u0002\u0186\u0188\u0003\u0002\u0002\u0002\u0187\u0185\u0003\u0002\u0002\u0002\u0188\u0189\u0007\u0017\u0002\u0002\u0189\u0037\u0003\u0002\u0002\u0002\u018a\u018d\u0005\u003c\u001f\u0002\u018b\u018d\u0005\u003a\u001e\u0002\u018c\u018a\u0003\u0002\u0002\u0002\u018c\u018b\u0003\u0002\u0002\u0002\u018d\u0039\u0003\u0002\u0002\u0002\u018e\u0190\u0007\u0012\u0002\u0002\u018f\u0191\u0007\u0011\u0002\u0002\u0190\u018f\u0003\u0002\u0002\u0002\u0190\u0191\u0003\u0002\u0002\u0002\u0191\u0192\u0003\u0002\u0002\u0002\u0192\u0193\u0007\u0022\u0002\u0002\u0193\u0194\u0005\u004e\u0028\u0002\u0194\u003b\u0003\u0002\u0002\u0002\u0195\u0197\u0007\u0012\u0002\u0002\u0196\u0198\u0007\u0011\u0002\u0002\u0197\u0196\u0003\u0002\u0002\u0002\u0197\u0198\u0003\u0002\u0002\u0002\u0198\u0199\u0003\u0002\u0002\u0002\u0199\u019b\u0007\u0022\u0002\u0002\u019a\u019c\u0005\u004e\u0028\u0002\u019b\u019a\u0003\u0002\u0002\u0002\u019b\u019c\u0003\u0002\u0002\u0002\u019c\u019d\u0003\u0002\u0002\u0002\u019d\u019e\u0007\u0013\u0002\u0002\u019e\u019f\u0005\u002a\u0016\u0002\u019f\u003d\u0003\u0002\u0002\u0002\u01a0\u01a4\u0005\u0040\u0021\u0002\u01a1\u01a4\u0005\u0042\u0022\u0002\u01a2\u01a4\u0005\u0044\u0023\u0002\u01a3\u01a0\u0003\u0002\u0002\u0002\u01a3\u01a1\u0003\u0002\u0002\u0002\u01a3\u01a2\u0003\u0002\u0002\u0002\u01a4\u003f\u0003\u0002\u0002\u0002\u01a5\u01a7\u0005\u0064\u0033\u0002\u01a6\u01a5\u0003\u0002\u0002\u0002\u01a6\u01a7\u0003\u0002\u0002\u0002\u01a7\u01ab\u0003\u0002\u0002\u0002\u01a8\u01ac\u0007\u0022\u0002\u0002\u01a9\u01ac\u0005\u004a\u0026\u0002\u01aa\u01ac\u0005\u004c\u0027\u0002\u01ab\u01a8\u0003\u0002\u0002\u0002\u01ab\u01a9\u0003\u0002\u0002\u0002\u01ab\u01aa\u0003\u0002\u0002\u0002\u01ac\u01ae\u0003\u0002\u0002\u0002\u01ad\u01af\u0005\u0046\u0024\u0002\u01ae\u01ad\u0003\u0002\u0002\u0002\u01ae\u01af\u0003\u0002\u0002\u0002\u01af\u01b1\u0003\u0002\u0002\u0002\u01b0\u01b2\u0005\u0024\u0013\u0002\u01b1\u01b0\u0003\u0002\u0002\u0002\u01b1\u01b2\u0003\u0002\u0002\u0002\u01b2\u01b4\u0003\u0002\u0002\u0002\u01b3\u01b5\u0005\u0032\u001a\u0002\u01b4\u01b3\u0003\u0002\u0002\u0002\u01b4\u01b5\u0003\u0002\u0002\u0002\u01b5\u01b6\u0003\u0002\u0002\u0002\u01b6\u01b7\u0005\u004e\u0028\u0002\u01b7\u01b8\u0007\u0013\u0002\u0002\u01b8\u01b9\u0005\u002a\u0016\u0002\u01b9\u0041\u0003\u0002\u0002\u0002\u01ba\u01bc\u0005\u0064\u0033\u0002\u01bb\u01ba\u0003\u0002\u0002\u0002\u01bb\u01bc\u0003\u0002\u0002\u0002\u01bc\u01bd\u0003\u0002\u0002\u0002\u01bd\u01c1\u0007\u000b\u0002\u0002\u01be\u01c2\u0007\u0022\u0002\u0002\u01bf\u01c2\u0005\u004a\u0026\u0002\u01c0\u01c2\u0005\u004c\u0027\u0002\u01c1\u01be\u0003\u0002\u0002\u0002\u01c1\u01bf\u0003\u0002\u0002\u0002\u01c1\u01c0\u0003\u0002\u0002\u0002\u01c2\u01c4\u0003\u0002\u0002\u0002\u01c3\u01c5\u0005\u0046\u0024\u0002\u01c4\u01c3\u0003\u0002\u0002\u0002\u01c4\u01c5\u0003\u0002\u0002\u0002\u01c5\u01c7\u0003\u0002\u0002\u0002\u01c6\u01c8\u0005\u0024\u0013\u0002\u01c7\u01c6\u0003\u0002\u0002\u0002\u01c7\u01c8\u0003\u0002\u0002\u0002\u01c8\u01ca\u0003\u0002\u0002\u0002\u01c9\u01cb\u0005\u0032\u001a\u0002\u01ca\u01c9\u0003\u0002\u0002\u0002\u01ca\u01cb\u0003\u0002\u0002\u0002\u01cb\u01d5\u0003\u0002\u0002\u0002\u01cc\u01cd\u0007\u000a\u0002\u0002\u01cd\u01cf\u0005\u004e\u0028\u0002\u01ce\u01d0\u0005\u0056\u002c\u0002\u01cf\u01ce\u0003\u0002\u0002\u0002\u01cf\u01d0\u0003\u0002\u0002\u0002\u01d0\u01d6\u0003\u0002\u0002\u0002\u01d1\u01d2\u0007\u0013\u0002\u0002\u01d2\u01d3\u0005\u004e\u0028\u0002\u01d3\u01d4\u0007\u0027\u0002\u0002\u01d4\u01d6\u0003\u0002\u0002\u0002\u01d5\u01cc\u0003\u0002\u0002\u0002\u01d5\u01d1\u0003\u0002\u0002\u0002\u01d6\u0043\u0003\u0002\u0002\u0002\u01d7\u01d9\u0005\u0064\u0033\u0002\u01d8\u01d7\u0003\u0002\u0002\u0002\u01d8\u01d9\u0003\u0002\u0002\u0002\u01d9\u01dd\u0003\u0002\u0002\u0002\u01da\u01de\u0007\u0022\u0002\u0002\u01db\u01de\u0005\u004a\u0026\u0002\u01dc\u01de\u0005\u004c\u0027\u0002\u01dd\u01da\u0003\u0002\u0002\u0002\u01dd\u01db\u0003\u0002\u0002\u0002\u01dd\u01dc\u0003\u0002\u0002\u0002\u01de\u01e0\u0003\u0002\u0002\u0002\u01df\u01e1\u0005\u0046\u0024\u0002\u01e0\u01df\u0003\u0002\u0002\u0002\u01e0\u01e1\u0003\u0002\u0002\u0002\u01e1\u01e3\u0003\u0002\u0002\u0002\u01e2\u01e4\u0005\u0024\u0013\u0002\u01e3\u01e2\u0003\u0002\u0002\u0002\u01e3\u01e4\u0003\u0002\u0002\u0002\u01e4\u01e6\u0003\u0002\u0002\u0002\u01e5\u01e7\u0005\u0032\u001a\u0002\u01e6\u01e5\u0003\u0002\u0002\u0002\u01e6\u01e7\u0003\u0002\u0002\u0002\u01e7\u01e8\u0003\u0002\u0002\u0002\u01e8\u01e9\u0007\u000a\u0002\u0002\u01e9\u01eb\u0005\u004e\u0028\u0002\u01ea\u01ec\u0005\u0056\u002c\u0002\u01eb\u01ea\u0003\u0002\u0002\u0002\u01eb\u01ec\u0003\u0002\u0002\u0002\u01ec\u0045\u0003\u0002\u0002\u0002\u01ed\u01ee\u0007\u0003\u0002\u0002\u01ee\u0047\u0003\u0002\u0002\u0002\u01ef\u01f3\u0007\u0018\u0002\u0002\u01f0\u01f2\u0005\u002e\u0018\u0002\u01f1\u01f0\u0003\u0002\u0002\u0002\u01f2\u01f5\u0003\u0002\u0002\u0002\u01f3\u01f1\u0003\u0002\u0002\u0002\u01f3\u01f4\u0003\u0002\u0002\u0002\u01f4\u01f6\u0003\u0002\u0002\u0002\u01f5\u01f3\u0003\u0002\u0002\u0002\u01f6\u01f7\u0007\u001a\u0002\u0002\u01f7\u01f8\u0005\u002a\u0016\u0002\u01f8\u0049\u0003\u0002\u0002\u0002\u01f9\u01fa\u0007\u0018\u0002\u0002\u01fa\u01fb\u0007\u0023\u0002\u0002\u01fb\u01fc\u0007\u001a\u0002\u0002\u01fc\u004b\u0003\u0002\u0002\u0002\u01fd\u01fe\u0007\u0018\u0002\u0002\u01fe\u01ff\u0007\u001f\u0002\u0002\u01ff\u0200\u0007\u0023\u0002\u0002\u0200\u0201\u0007\u001a\u0002\u0002\u0201\u004d\u0003\u0002\u0002\u0002\u0202\u0205\u0005\u0054\u002b\u0002\u0203\u0205\u0005\u0050\u0029\u0002\u0204\u0202\u0003\u0002\u0002\u0002\u0204\u0203\u0003\u0002\u0002\u0002\u0205\u004f\u0003\u0002\u0002\u0002\u0206\u0207\u0005\u0008\u0005\u0002\u0207\u0208\u0007\u0015\u0002\u0002\u0208\u020a\u0003\u0002\u0002\u0002\u0209\u0206\u0003\u0002\u0002\u0002\u0209\u020a\u0003\u0002\u0002\u0002\u020a\u020b\u0003\u0002\u0002\u0002\u020b\u0214\u0007\u0022\u0002\u0002\u020c\u020e\u0007\u0016\u0002\u0002\u020d\u020f\u0005\u004e\u0028\u0002\u020e\u020d\u0003\u0002\u0002\u0002\u020f\u0210\u0003\u0002\u0002\u0002\u0210\u020e\u0003\u0002\u0002\u0002\u0210\u0211\u0003\u0002\u0002\u0002\u0211\u0212\u0003\u0002\u0002\u0002\u0212\u0213\u0007\u0017\u0002\u0002\u0213\u0215\u0003\u0002\u0002\u0002\u0214\u020c\u0003\u0002\u0002\u0002\u0214\u0215\u0003\u0002\u0002\u0002\u0215\u0051\u0003\u0002\u0002\u0002\u0216\u0218\u0005\u004e\u0028\u0002\u0217\u0219\u0007\u0014\u0002\u0002\u0218\u0217\u0003\u0002\u0002\u0002\u0218\u0219\u0003\u0002\u0002\u0002\u0219\u0053\u0003\u0002\u0002\u0002\u021a\u021e\u0007\u0016\u0002\u0002\u021b\u021d\u0005\u0052\u002a\u0002\u021c\u021b\u0003\u0002\u0002\u0002\u021d\u0220\u0003\u0002\u0002\u0002\u021e\u021c\u0003\u0002\u0002\u0002\u021e\u021f\u0003\u0002\u0002\u0002\u021f\u0221\u0003\u0002\u0002\u0002\u0220\u021e\u0003\u0002\u0002\u0002\u0221\u0222\u0007\u0017\u0002\u0002\u0222\u0223\u0007\u001e\u0002\u0002\u0223\u0224\u0005\u004e\u0028\u0002\u0224\u0055\u0003\u0002\u0002\u0002\u0225\u0229\u0007\u001c\u0002\u0002\u0226\u0228\u0005\u0058\u002d\u0002\u0227\u0226\u0003\u0002\u0002\u0002\u0228\u022b\u0003\u0002\u0002\u0002\u0229\u0227\u0003\u0002\u0002\u0002\u0229\u022a\u0003\u0002\u0002\u0002\u022a\u022c\u0003\u0002\u0002\u0002\u022b\u0229\u0003\u0002\u0002\u0002\u022c\u022f\u0007\u001d\u0002\u0002\u022d\u022f\u0007\u0027\u0002\u0002\u022e\u0225\u0003\u0002\u0002\u0002\u022e\u022d\u0003\u0002\u0002\u0002\u022f\u0057\u0003\u0002\u0002\u0002\u0230\u0231\u0005\u005a\u002e\u0002\u0231\u0232\u0007\u0027\u0002\u0002\u0232\u0238\u0003\u0002\u0002\u0002\u0233\u0234\u0005\u005a\u002e\u0002\u0234\u0235\u0007\u001f\u0002\u0002\u0235\u0236\u0007\u0026\u0002\u0002\u0236\u0238\u0003\u0002\u0002\u0002\u0237\u0230\u0003\u0002\u0002\u0002\u0237\u0233\u0003\u0002\u0002\u0002\u0238\u0059\u0003\u0002\u0002\u0002\u0239\u023a\u0007\u0022\u0002\u0002\u023a\u005b\u0003\u0002\u0002\u0002\u023b\u023c\u0009\u0002\u0002\u0002\u023c\u005d\u0003\u0002\u0002\u0002\u023d\u023e\u0007\u0022\u0002\u0002\u023e\u023f\u0005\u004e\u0028\u0002\u023f\u005f\u0003\u0002\u0002\u0002\u0240\u0241\u0007\u0007\u0002\u0002\u0241\u024a\u0007\u0022\u0002\u0002\u0242\u0246\u0007\u0016\u0002\u0002\u0243\u0245\u0005\u005e\u0030\u0002\u0244\u0243\u0003\u0002\u0002\u0002\u0245\u0248\u0003\u0002\u0002\u0002\u0246\u0244\u0003\u0002\u0002\u0002\u0246\u0247\u0003\u0002\u0002\u0002\u0247\u0249\u0003\u0002\u0002\u0002\u0248\u0246\u0003\u0002\u0002\u0002\u0249\u024b\u0007\u0017\u0002\u0002\u024a\u0242\u0003\u0002\u0002\u0002\u024a\u024b\u0003\u0002\u0002\u0002\u024b\u0061\u0003\u0002\u0002\u0002\u024c\u0250\u0007\u0022\u0002\u0002\u024d\u024f\u0005\u005c\u002f\u0002\u024e\u024d\u0003\u0002\u0002\u0002\u024f\u0252\u0003\u0002\u0002\u0002\u0250\u024e\u0003\u0002\u0002\u0002\u0250\u0251\u0003\u0002\u0002\u0002\u0251\u025d\u0003\u0002\u0002\u0002\u0252\u0250\u0003\u0002\u0002\u0002\u0253\u0254\u0007\u0022\u0002\u0002\u0254\u0258\u0007\u0016\u0002\u0002\u0255\u0257\u0005\u005c\u002f\u0002\u0256\u0255\u0003\u0002\u0002\u0002\u0257\u025a\u0003\u0002\u0002\u0002\u0258\u0256\u0003\u0002\u0002\u0002\u0258\u0259\u0003\u0002\u0002\u0002\u0259\u025b\u0003\u0002\u0002\u0002\u025a\u0258\u0003\u0002\u0002\u0002\u025b\u025d\u0007\u0017\u0002\u0002\u025c\u024c\u0003\u0002\u0002\u0002\u025c\u0253\u0003\u0002\u0002\u0002\u025d\u0063\u0003\u0002\u0002\u0002\u025e\u0262\u0007\u0019\u0002\u0002\u025f\u0261\u0005\u0062\u0032\u0002\u0260\u025f\u0003\u0002\u0002\u0002\u0261\u0264\u0003\u0002\u0002\u0002\u0262\u0260\u0003\u0002\u0002\u0002\u0262\u0263\u0003\u0002\u0002\u0002\u0263\u0265\u0003\u0002\u0002\u0002\u0264\u0262\u0003\u0002\u0002\u0002\u0265\u0266\u0007\u001b\u0002\u0002\u0266\u0065\u0003\u0002\u0002\u0002\u005b\u0067\u006c\u0072\u0074\u0081\u008c\u0094\u009e\u00a3\u00ab\u00af\u00b4\u00ba\u00c0\u00c7\u00ca\u00cd\u00d0\u00d3\u00d7\u00da\u00dd\u00e1\u00e5\u00e9\u00ef\u00f5\u00f9\u00fc\u00ff\u0108\u010f\u0114\u011e\u0124\u012a\u0135\u0141\u0143\u014b\u0158\u0161\u0165\u0169\u016d\u0173\u0177\u017d\u017f\u0185\u018c\u0190\u0197\u019b\u01a3\u01a6\u01ab\u01ae\u01b1\u01b4\u01bb\u01c1\u01c4\u01c7\u01ca\u01cf\u01d5\u01d8\u01dd\u01e0\u01e3\u01e6\u01eb\u01f3\u0204\u0209\u0210\u0214\u0218\u021e\u0229\u022e\u0237\u0246\u024a\u0250\u0258\u025c\u0262"

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
    private val As = Tokens.As.id
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
			this.state = 101
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAMESPACE) {
				if (true){
				this.state = 100
				namespace()
				}
			}

			this.state = 106
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPORT) {
				if (true){
				if (true){
				this.state = 103
				importEx()
				}
				}
				this.state = 108
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 114
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ANNOTATION) or (1L shl CLASS) or (1L shl TEMPLATE) or (1L shl FIELD) or (1L shl LSQUARE) or (1L shl LCOLONSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 112
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				CLASS , TEMPLATE , LSQUARE , LCOLONSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 109
				definition()
				}}
				FIELD  ->  /*LL1AltBlock*/{if (true){
				this.state = 110
				field()
				}}
				ANNOTATION  ->  /*LL1AltBlock*/{if (true){
				this.state = 111
				annotationDef()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 116
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
			this.state = 117
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
			this.state = 119
			match(IMPORT) as Token
			this.state = 120
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
			this.state = 122
			match(ID) as Token
			this.state = 127
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,4,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 123
					match(DOT) as Token
					this.state = 124
					match(ID) as Token
					}
					} 
				}
				this.state = 129
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
			this.state = 130
			match(NAMESPACE) as Token
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
			this.state = 133
			match(DO) as Token
			this.state = 134
			match(LBRACE) as Token
			this.state = 138
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Literal) or (1L shl DO) or (1L shl RETURN) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 135
				compo()
				}
				}
				this.state = 140
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 141
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
			this.state = 146
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 143
			fieldAssign()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 144
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 145
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
			this.state = 148
			match(RETURN) as Token
			this.state = 149
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
			this.state = 151
			value(0)
			this.state = 152
			match(ASSGIN) as Token
			this.state = 153
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
			this.state = 156
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 155
				annotationBlock()
				}
			}

			this.state = 158
			match(CLASS) as Token
			this.state = 159
			match(ID) as Token
			this.state = 161
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 160
				typeParam()
				}
			}

			this.state = 163
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
			this.state = 165
			match(LBRACE) as Token
			this.state = 173
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,10,context) ) {
			1 -> {if (true){
			this.state = 169
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,9,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 166
					constructor_()
					}
					} 
				}
				this.state = 171
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,9,context)
			}
			}}
			2 -> {if (true){
			this.state = 172
			constructorSelf()
			}}
			}
			this.state = 178
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==FIELD) {
				if (true){
				if (true){
				this.state = 175
				field()
				}
				}
				this.state = 180
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 184
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LCOLONSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 181
				defInInterface()
				}
				}
				this.state = 186
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 190
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 187
				impl()
				}
				}
				this.state = 192
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 193
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
			this.state = 195
			match(ID) as Token
			this.state = 197
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 196
				parameter()
				}
			}

			this.state = 200
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 199
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
			this.state = 203
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 202
				parameter()
				}
			}

			this.state = 206
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 205
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
			this.state = 209
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 208
				annotationBlock()
				}
			}

			this.state = 211
			match(ID) as Token
			this.state = 213
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 212
				compiledId()
				}
			}

			this.state = 216
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,20,context) ) {
			1   -> if (true){
			this.state = 215
			typeParam()
			}
			}
			this.state = 219
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,21,context) ) {
			1   -> if (true){
			this.state = 218
			parameter()
			}
			}
			this.state = 221
			typeEx()
			this.state = 223
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,22,context) ) {
			1   -> if (true){
			this.state = 222
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
			this.state = 225
			match(IMPL) as Token
			this.state = 227
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,23,context) ) {
			1   -> if (true){
			this.state = 226
			typeParam()
			}
			}
			this.state = 229
			typeEx()
			this.state = 231
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 230
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
			this.state = 233
			match(LBRACE) as Token
			this.state = 237
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LCOLONSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 234
				defInImpl()
				}
				}
				this.state = 239
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 240
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
			this.state = 243
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 242
				annotationBlock()
				}
			}

			this.state = 245
			match(ID) as Token
			this.state = 247
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 246
				compiledId()
				}
			}

			this.state = 250
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,28,context) ) {
			1   -> if (true){
			this.state = 249
			typeParam()
			}
			}
			this.state = 253
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,29,context) ) {
			1   -> if (true){
			this.state = 252
			parameter()
			}
			}
			this.state = 255
			typeEx()
			this.state = 256
			match(ASSGIN) as Token
			this.state = 257
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
		enterRule(_localctx, 34, Rules.RULE_typeParam.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 260 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 259
				typeParamCompo()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 262 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,30,context)
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
		enterRule(_localctx, 36, Rules.RULE_typeParamCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 264
			match(ID) as Token
			this.state = 269
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TILDE) {
				if (true){
				if (true){
				this.state = 265
				match(TILDE) as Token
				this.state = 266
				typeEx()
				}
				}
				this.state = 271
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
		enterRule(_localctx, 38, Rules.RULE_definition.id)
		try {
			this.state = 274
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,32,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 272
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 273
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
		var _startState : Int = 40
		enterRecursionRule(_localctx, 40, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 307
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,36,context) ) {
			1 -> {if (true){
			this.state = 277
			match(Integer) as Token
			}}
			2 -> {if (true){
			this.state = 278
			match(Double) as Token
			}}
			3 -> {if (true){
			this.state = 279
			match(String) as Token
			}}
			4 -> {if (true){
			this.state = 280
			match(Literal) as Token
			}}
			5 -> {if (true){
			this.state = 284
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,33,context) ) {
			1   -> if (true){
			this.state = 281
			package_()
			this.state = 282
			match(DOT) as Token
			}
			}
			this.state = 286
			match(ID) as Token
			}}
			6 -> {if (true){
			this.state = 290
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 287
				package_()
				this.state = 288
				match(DOT) as Token
				}
			}

			this.state = 292
			opIdWrap()
			}}
			7 -> {if (true){
			this.state = 296
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 293
				package_()
				this.state = 294
				match(DOT) as Token
				}
			}

			this.state = 298
			aopIdWrap()
			}}
			8 -> {if (true){
			this.state = 299
			match(OPID) as Token
			this.state = 300
			value(5)
			}}
			9 -> {if (true){
			this.state = 301
			doBlock()
			}}
			10 -> {if (true){
			this.state = 302
			lambda()
			}}
			11 -> {if (true){
			this.state = 303
			match(LPAREN) as Token
			this.state = 304
			value(0)
			this.state = 305
			match(RPAREN) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 321
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,38,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 319
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,37,context) ) {
					1 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 309
					if (!(precpred(context!!, 4))) throw FailedPredicateException(this, "precpred(context!!, 4)")
					this.state = 310
					match(OPID) as Token
					this.state = 311
					value(5)
					}}
					2 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 312
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 313
					match(COLON) as Token
					this.state = 314
					match(ID) as Token
					}}
					3 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 315
					if (!(precpred(context!!, 7))) throw FailedPredicateException(this, "precpred(context!!, 7)")
					this.state = 316
					argValue()
					}}
					4 -> {if (true){
					_localctx = ValueContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 317
					if (!(precpred(context!!, 6))) throw FailedPredicateException(this, "precpred(context!!, 6)")
					this.state = 318
					typeCasting()
					}}
					}
					} 
				}
				this.state = 323
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,38,context)
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
		fun As() : TerminalNode? = getToken(FoldingParser.Tokens.As.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeCasting() : TypeCastingContext {
		var _localctx : TypeCastingContext = TypeCastingContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 324
			match(As) as Token
			this.state = 325
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
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ELLIPSIS() : TerminalNode? = getToken(FoldingParser.Tokens.ELLIPSIS.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramEx() : ParamExContext {
		var _localctx : ParamExContext = ParamExContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_paramEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 327
			match(ID) as Token
			this.state = 329
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 328
				match(ELLIPSIS) as Token
				}
			}

			this.state = 331
			match(TILDE) as Token
			this.state = 332
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

	open class ParamCExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_paramCEx.id
	        set(value) { throw RuntimeException() }
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramCEx() : ParamCExContext {
		var _localctx : ParamCExContext = ParamCExContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_paramCEx.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 334
			value(0)
			this.state = 335
			match(TILDE) as Token
			this.state = 336
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

	open class ParameterContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameter.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : List<TerminalNode> = getTokens(FoldingParser.Tokens.LPAREN.id)
		fun LPAREN(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.LPAREN.id, i) as TerminalNode
		fun RPAREN() : List<TerminalNode> = getTokens(FoldingParser.Tokens.RPAREN.id)
		fun RPAREN(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.RPAREN.id, i) as TerminalNode
		fun findParamEx() : List<ParamExContext> = getRuleContexts(solver.getType("ParamExContext"))
		fun findParamEx(i: Int) : ParamExContext? = getRuleContext(solver.getType("ParamExContext"),i)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findParamCEx() : List<ParamCExContext> = getRuleContexts(solver.getType("ParamCExContext"))
		fun findParamCEx(i: Int) : ParamCExContext? = getRuleContext(solver.getType("ParamCExContext"),i)
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
			this.state = 338
			match(LPAREN) as Token
			this.state = 342
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 339
				paramEx()
				}
				}
				this.state = 344
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 345
			match(RPAREN) as Token
			this.state = 355
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 346
				match(TILDE) as Token
				this.state = 347
				match(LPAREN) as Token
				this.state = 349 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 348
					paramCEx()
					}
					}
					this.state = 351 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Literal) or (1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L) )
				this.state = 353
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
		enterRule(_localctx, 50, Rules.RULE_argEx.id)
		var _la: Int
		try {
			this.state = 373
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,46,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 359
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,43,context) ) {
			1   -> if (true){
			this.state = 357
			match(ID) as Token
			this.state = 358
			match(ASSGIN) as Token
			}
			}
			this.state = 361
			value(0)
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 363
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 362
				match(ID) as Token
				}
			}

			this.state = 365
			match(LBRACE) as Token
			this.state = 369
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Literal) or (1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 366
				value(0)
				}
				}
				this.state = 371
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 372
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
		enterRule(_localctx, 52, Rules.RULE_argValue.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 381
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 375
				match(TILDE) as Token
				this.state = 377 
				errorHandler.sync(this)
				_alt = 1
				do {
					when (_alt) {
					    1 -> if (true){
					if (true){
					this.state = 376
					typeEx()
					}
					}
					else -> throw NoViableAltException(this)
					}
					this.state = 379 
					errorHandler.sync(this)
					_alt = interpreter!!.adaptivePredict(_input!!,47,context)
				} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
				}
			}

			this.state = 383
			match(LPAREN) as Token
			this.state = 387
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Literal) or (1L shl DO) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 384
				argEx()
				}
				}
				this.state = 389
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 390
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
		enterRule(_localctx, 54, Rules.RULE_field.id)
		try {
			this.state = 394
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,50,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 392
			fieldSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 393
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
		enterRule(_localctx, 56, Rules.RULE_fieldNotInit.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 396
			match(FIELD) as Token
			this.state = 398
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==MUTABLE) {
				if (true){
				this.state = 397
				match(MUTABLE) as Token
				}
			}

			this.state = 400
			match(ID) as Token
			this.state = 401
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
		enterRule(_localctx, 58, Rules.RULE_fieldSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 403
			match(FIELD) as Token
			this.state = 405
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==MUTABLE) {
				if (true){
				this.state = 404
				match(MUTABLE) as Token
				}
			}

			this.state = 407
			match(ID) as Token
			this.state = 409
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==ID) {
				if (true){
				this.state = 408
				typeEx()
				}
			}

			this.state = 411
			match(ASSGIN) as Token
			this.state = 412
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
		enterRule(_localctx, 60, Rules.RULE_def.id)
		try {
			this.state = 417
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,54,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 414
			justDef()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 415
			template()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 416
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
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  justDef() : JustDefContext {
		var _localctx : JustDefContext = JustDefContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_justDef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 420
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 419
				annotationBlock()
				}
			}

			this.state = 425
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,56,context) ) {
			1 -> {if (true){
			this.state = 422
			match(ID) as Token
			}}
			2 -> {if (true){
			this.state = 423
			opIdWrap()
			}}
			3 -> {if (true){
			this.state = 424
			aopIdWrap()
			}}
			}
			this.state = 428
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 427
				compiledId()
				}
			}

			this.state = 431
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,58,context) ) {
			1   -> if (true){
			this.state = 430
			typeParam()
			}
			}
			this.state = 434
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,59,context) ) {
			1   -> if (true){
			this.state = 433
			parameter()
			}
			}
			this.state = 436
			typeEx()
			this.state = 437
			match(ASSGIN) as Token
			this.state = 438
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

	open class TemplateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_template.id
	        set(value) { throw RuntimeException() }
		fun TEMPLATE() : TerminalNode? = getToken(FoldingParser.Tokens.TEMPLATE.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun RawString() : TerminalNode? = getToken(FoldingParser.Tokens.RawString.id, 0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findForeignBody() : ForeignBodyContext? = getRuleContext(solver.getType("ForeignBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  template() : TemplateContext {
		var _localctx : TemplateContext = TemplateContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_template.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 441
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 440
				annotationBlock()
				}
			}

			this.state = 443
			match(TEMPLATE) as Token
			this.state = 447
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,61,context) ) {
			1 -> {if (true){
			this.state = 444
			match(ID) as Token
			}}
			2 -> {if (true){
			this.state = 445
			opIdWrap()
			}}
			3 -> {if (true){
			this.state = 446
			aopIdWrap()
			}}
			}
			this.state = 450
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 449
				compiledId()
				}
			}

			this.state = 453
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 452
				typeParam()
				}
			}

			this.state = 456
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 455
				parameter()
				}
			}

			this.state = 467
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 458
			match(FOREIGN) as Token
			this.state = 459
			typeEx()
			this.state = 461
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE || _la==RawString) {
				if (true){
				this.state = 460
				foreignBody()
				}
			}

			}}
			ASSGIN  ->  /*LL1AltBlock*/{if (true){
			this.state = 463
			match(ASSGIN) as Token
			this.state = 464
			typeEx()
			this.state = 465
			match(RawString) as Token
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

	open class ForeignDefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_foreignDef.id
	        set(value) { throw RuntimeException() }
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findCompiledId() : CompiledIdContext? = getRuleContext(solver.getType("CompiledIdContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findForeignBody() : ForeignBodyContext? = getRuleContext(solver.getType("ForeignBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignDef() : ForeignDefContext {
		var _localctx : ForeignDefContext = ForeignDefContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_foreignDef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 470
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LCOLONSQUARE) {
				if (true){
				this.state = 469
				annotationBlock()
				}
			}

			this.state = 475
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,68,context) ) {
			1 -> {if (true){
			this.state = 472
			match(ID) as Token
			}}
			2 -> {if (true){
			this.state = 473
			opIdWrap()
			}}
			3 -> {if (true){
			this.state = 474
			aopIdWrap()
			}}
			}
			this.state = 478
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==Literal) {
				if (true){
				this.state = 477
				compiledId()
				}
			}

			this.state = 481
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 480
				typeParam()
				}
			}

			this.state = 484
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 483
				parameter()
				}
			}

			this.state = 486
			match(FOREIGN) as Token
			this.state = 487
			typeEx()
			this.state = 489
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE || _la==RawString) {
				if (true){
				this.state = 488
				foreignBody()
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
		enterRule(_localctx, 68, Rules.RULE_compiledId.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 491
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
		enterRule(_localctx, 70, Rules.RULE_lambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 493
			match(LSQUARE) as Token
			this.state = 497
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 494
				paramEx()
				}
				}
				this.state = 499
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 500
			match(RSQUARE) as Token
			this.state = 501
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
		enterRule(_localctx, 72, Rules.RULE_opIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 503
			match(LSQUARE) as Token
			this.state = 504
			match(OPID) as Token
			this.state = 505
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
		enterRule(_localctx, 74, Rules.RULE_aopIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 507
			match(LSQUARE) as Token
			this.state = 508
			match(TILDE) as Token
			this.state = 509
			match(OPID) as Token
			this.state = 510
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
		enterRule(_localctx, 76, Rules.RULE_typeEx.id)
		try {
			this.state = 514
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 512
			typeExParameter()
			}}
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 513
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
		enterRule(_localctx, 78, Rules.RULE_typeExSingle.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 519
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,75,context) ) {
			1   -> if (true){
			this.state = 516
			package_()
			this.state = 517
			match(DOT) as Token
			}
			}
			this.state = 521
			match(ID) as Token
			this.state = 530
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,77,context) ) {
			1   -> if (true){
			this.state = 522
			match(LPAREN) as Token
			this.state = 524 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 523
				typeEx()
				}
				}
				this.state = 526 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==LPAREN || _la==ID )
			this.state = 528
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
		enterRule(_localctx, 80, Rules.RULE_typeExParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 532
			typeEx()
			this.state = 534
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 533
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
		enterRule(_localctx, 82, Rules.RULE_typeExParameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 536
			match(LPAREN) as Token
			this.state = 540
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LPAREN || _la==ID) {
				if (true){
				if (true){
				this.state = 537
				typeExParamEx()
				}
				}
				this.state = 542
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 543
			match(RPAREN) as Token
			this.state = 544
			match(ARROW) as Token
			this.state = 545
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
		fun RawString() : TerminalNode? = getToken(FoldingParser.Tokens.RawString.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignBody() : ForeignBodyContext {
		var _localctx : ForeignBodyContext = ForeignBodyContext(context, state)
		enterRule(_localctx, 84, Rules.RULE_foreignBody.id)
		var _la: Int
		try {
			this.state = 556
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LBRACE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 547
			match(LBRACE) as Token
			this.state = 551
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 548
				foreignElement()
				}
				}
				this.state = 553
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 554
			match(RBRACE) as Token
			}}
			RawString  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 555
			match(RawString) as Token
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
		enterRule(_localctx, 86, Rules.RULE_foreignElement.id)
		try {
			this.state = 565
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,82,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 558
			foreignPlatform()
			this.state = 559
			match(RawString) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 561
			foreignPlatform()
			this.state = 562
			match(TILDE) as Token
			this.state = 563
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
		enterRule(_localctx, 88, Rules.RULE_foreignPlatform.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 567
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
		enterRule(_localctx, 90, Rules.RULE_annoValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 569
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
		enterRule(_localctx, 92, Rules.RULE_annoParam.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 571
			match(ID) as Token
			this.state = 572
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
		enterRule(_localctx, 94, Rules.RULE_annotationDef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 574
			match(ANNOTATION) as Token
			this.state = 575
			match(ID) as Token
			this.state = 584
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 576
				match(LPAREN) as Token
				this.state = 580
				errorHandler.sync(this);
				_la = _input!!.LA(1)
				while (_la==ID) {
					if (true){
					if (true){
					this.state = 577
					annoParam()
					}
					}
					this.state = 582
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				}
				this.state = 583
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
		enterRule(_localctx, 96, Rules.RULE_annotation.id)
		var _la: Int
		try {
			this.state = 602
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,87,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 586
			match(ID) as Token
			this.state = 590
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 587
				annoValue()
				}
				}
				this.state = 592
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 593
			match(ID) as Token
			this.state = 594
			match(LPAREN) as Token
			this.state = 598
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 595
				annoValue()
				}
				}
				this.state = 600
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 601
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
		enterRule(_localctx, 98, Rules.RULE_annotationBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 604
			match(LCOLONSQUARE) as Token
			this.state = 608
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 605
				annotation()
				}
				}
				this.state = 610
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 611
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
		20 -> return value_sempred(_localctx as ValueContext, predIndex)
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