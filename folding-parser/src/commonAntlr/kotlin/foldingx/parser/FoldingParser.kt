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
                                                              FoldingParser.FileCompoContext::class,
                                                              FoldingParser.ImportExContext::class,
                                                              FoldingParser.ImportBodyContext::class,
                                                              FoldingParser.ImportCompoContext::class,
                                                              FoldingParser.ImportAliasContext::class,
                                                              FoldingParser.ImportTypeContext::class,
                                                              FoldingParser.ImportPathContext::class,
                                                              FoldingParser.ImportNestContext::class,
                                                              FoldingParser.Package_Context::class,
                                                              FoldingParser.NamespaceContext::class,
                                                              FoldingParser.DoBlockContext::class,
                                                              FoldingParser.CompoContext::class,
                                                              FoldingParser.ReturningContext::class,
                                                              FoldingParser.FieldAssignContext::class,
                                                              FoldingParser.Class_Context::class,
                                                              FoldingParser.Constructor_Context::class,
                                                              FoldingParser.ConstructorSelfContext::class,
                                                              FoldingParser.DefInInterfaceContext::class,
                                                              FoldingParser.InheritContext::class,
                                                              FoldingParser.ImplContext::class,
                                                              FoldingParser.ImplBodyContext::class,
                                                              FoldingParser.TypeParamContext::class,
                                                              FoldingParser.TypeParamCompoContext::class,
                                                              FoldingParser.DefinitionContext::class,
                                                              FoldingParser.DefaultValueContext::class,
                                                              FoldingParser.BooleanContext::class,
                                                              FoldingParser.ValueContext::class,
                                                              FoldingParser.ReferenceContext::class,
                                                              FoldingParser.TypeCastingContext::class,
                                                              FoldingParser.If_elseContext::class,
                                                              FoldingParser.Let_bindingContext::class,
                                                              FoldingParser.ParamExContext::class,
                                                              FoldingParser.ParamCExContext::class,
                                                              FoldingParser.ParameterContext::class,
                                                              FoldingParser.ParameterFromValueContext::class,
                                                              FoldingParser.SpecificAliasContext::class,
                                                              FoldingParser.ArgExContext::class,
                                                              FoldingParser.ArgValueContext::class,
                                                              FoldingParser.InvokingContext::class,
                                                              FoldingParser.CommonIdentifierContext::class,
                                                              FoldingParser.OpIdWrapContext::class,
                                                              FoldingParser.AopIdWrapContext::class,
                                                              FoldingParser.CallingOpIdContext::class,
                                                              FoldingParser.CallingAopIdContext::class,
                                                              FoldingParser.FieldContext::class,
                                                              FoldingParser.FieldNotInitContext::class,
                                                              FoldingParser.FieldSettedContext::class,
                                                              FoldingParser.DefContext::class,
                                                              FoldingParser.JustDefContext::class,
                                                              FoldingParser.ForeignDefContext::class,
                                                              FoldingParser.InverseDefiningContext::class,
                                                              FoldingParser.InverseDefCompoContext::class,
                                                              FoldingParser.LambdaContext::class,
                                                              FoldingParser.ParameterForLambdaContext::class,
                                                              FoldingParser.ParameterFromValueForLambdaContext::class,
                                                              FoldingParser.TypeExContext::class,
                                                              FoldingParser.TypeExSingleContext::class,
                                                              FoldingParser.PrimitiveTypeContext::class,
                                                              FoldingParser.TypeExParamExContext::class,
                                                              FoldingParser.TypeExFuncContext::class,
                                                              FoldingParser.ForeignBodyContext::class,
                                                              FoldingParser.ForeignElementContext::class,
                                                              FoldingParser.ForeignPlatformContext::class,
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
        ANNOTATION(4),
        CLASS(5),
        DO(6),
        FOREIGN(7),
        NAMESPACE(8),
        INTERNAL(9),
        IMPORT(10),
        IMPL(11),
        INHERIT(12),
        RETURN(13),
        MUTABLE(14),
        INVERSE(15),
        FROM(16),
        IF(17),
        ELSE(18),
        NEW(19),
        LET(20),
        INT(21),
        LONG(22),
        DOUBLE(23),
        FLOAT(24),
        BYTE(25),
        CHAR(26),
        STRING(27),
        BOOLEAN(28),
        UNIT(29),
        ARRAY(30),
        NULL(31),
        TRUE(32),
        FALSE(33),
        ASSGIN(34),
        ELLIPSIS(35),
        DOT(36),
        LPAREN(37),
        RPAREN(38),
        LSQUARE(39),
        RSQUARE(40),
        LBRACE(41),
        RBRACE(42),
        ARROW(43),
        TILDE(44),
        As(45),
        COLON(46),
        DOUBLECOLON(47),
        COLONSHARP(48),
        QUOTE(49),
        COLONQUOTE(50),
        SHARP(51),
        QM(52),
        ID(53),
        OPID(54),
        Integer(55),
        Double(56),
        String(57),
        RawString(58)
    }

    enum class Rules(val id: Int) {
        RULE_file(0),
        RULE_fileCompo(1),
        RULE_importEx(2),
        RULE_importBody(3),
        RULE_importCompo(4),
        RULE_importAlias(5),
        RULE_importType(6),
        RULE_importPath(7),
        RULE_importNest(8),
        RULE_package_(9),
        RULE_namespace(10),
        RULE_doBlock(11),
        RULE_compo(12),
        RULE_returning(13),
        RULE_fieldAssign(14),
        RULE_class_(15),
        RULE_constructor_(16),
        RULE_constructorSelf(17),
        RULE_defInInterface(18),
        RULE_inherit(19),
        RULE_impl(20),
        RULE_implBody(21),
        RULE_typeParam(22),
        RULE_typeParamCompo(23),
        RULE_definition(24),
        RULE_defaultValue(25),
        RULE_boolean(26),
        RULE_value(27),
        RULE_reference(28),
        RULE_typeCasting(29),
        RULE_if_else(30),
        RULE_let_binding(31),
        RULE_paramEx(32),
        RULE_paramCEx(33),
        RULE_parameter(34),
        RULE_parameterFromValue(35),
        RULE_specificAlias(36),
        RULE_argEx(37),
        RULE_argValue(38),
        RULE_invoking(39),
        RULE_commonIdentifier(40),
        RULE_opIdWrap(41),
        RULE_aopIdWrap(42),
        RULE_callingOpId(43),
        RULE_callingAopId(44),
        RULE_field(45),
        RULE_fieldNotInit(46),
        RULE_fieldSetted(47),
        RULE_def(48),
        RULE_justDef(49),
        RULE_foreignDef(50),
        RULE_inverseDefining(51),
        RULE_inverseDefCompo(52),
        RULE_lambda(53),
        RULE_parameterForLambda(54),
        RULE_parameterFromValueForLambda(55),
        RULE_typeEx(56),
        RULE_typeExSingle(57),
        RULE_primitiveType(58),
        RULE_typeExParamEx(59),
        RULE_typeExFunc(60),
        RULE_foreignBody(61),
        RULE_foreignElement(62),
        RULE_foreignPlatform(63),
        RULE_annotationDef(64),
        RULE_annotation(65),
        RULE_annotationBlock(66)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "fileCompo", "importEx", "importBody", 
                                "importCompo", "importAlias", "importType", 
                                "importPath", "importNest", "package_", 
                                "namespace", "doBlock", "compo", "returning", 
                                "fieldAssign", "class_", "constructor_", 
                                "constructorSelf", "defInInterface", "inherit", 
                                "impl", "implBody", "typeParam", "typeParamCompo", 
                                "definition", "defaultValue", "boolean", 
                                "value", "reference", "typeCasting", "if_else", 
                                "let_binding", "paramEx", "paramCEx", "parameter", 
                                "parameterFromValue", "specificAlias", "argEx", 
                                "argValue", "invoking", "commonIdentifier", 
                                "opIdWrap", "aopIdWrap", "callingOpId", 
                                "callingAopId", "field", "fieldNotInit", 
                                "fieldSetted", "def", "justDef", "foreignDef", 
                                "inverseDefining", "inverseDefCompo", "lambda", 
                                "parameterForLambda", "parameterFromValueForLambda", 
                                "typeEx", "typeExSingle", "primitiveType", 
                                "typeExParamEx", "typeExFunc", "foreignBody", 
                                "foreignElement", "foreignPlatform", "annotationDef", 
                                "annotation", "annotationBlock")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
                                                          null, "'annotation'", 
                                                          "'class'", "'do'", 
                                                          "'foreign'", "'package'", 
                                                          "'internal'", 
                                                          "'import'", "'impl'", 
                                                          "'inherit'", "'return'", 
                                                          "'mutable'", "'inverse'", 
                                                          "'from'", "'if'", 
                                                          "'else'", "'new'", 
                                                          "'let'", "'Int'", 
                                                          "'Long'", "'Double'", 
                                                          "'Float'", "'Byte'", 
                                                          "'Char'", "'String'", 
                                                          "'Boolean'", "'Unit'", 
                                                          "'Array'", "'null'", 
                                                          "'true'", "'false'", 
                                                          "'='", "'...'", 
                                                          "'.'", "'('", 
                                                          "')'", "'['", 
                                                          "']'", "'{'", 
                                                          "'}'", "'->'", 
                                                          "'~'", "'~>'", 
                                                          "':'", "'::'", 
                                                          "':#'", "'''", 
                                                          "':''", "'#'", 
                                                          "'?'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "WS", "COMMENT", 
                                                           "LINE_COMMENT", 
                                                           "ANNOTATION", 
                                                           "CLASS", "DO", 
                                                           "FOREIGN", "NAMESPACE", 
                                                           "INTERNAL", "IMPORT", 
                                                           "IMPL", "INHERIT", 
                                                           "RETURN", "MUTABLE", 
                                                           "INVERSE", "FROM", 
                                                           "IF", "ELSE", 
                                                           "NEW", "LET", 
                                                           "INT", "LONG", 
                                                           "DOUBLE", "FLOAT", 
                                                           "BYTE", "CHAR", 
                                                           "STRING", "BOOLEAN", 
                                                           "UNIT", "ARRAY", 
                                                           "NULL", "TRUE", 
                                                           "FALSE", "ASSGIN", 
                                                           "ELLIPSIS", "DOT", 
                                                           "LPAREN", "RPAREN", 
                                                           "LSQUARE", "RSQUARE", 
                                                           "LBRACE", "RBRACE", 
                                                           "ARROW", "TILDE", 
                                                           "As", "COLON", 
                                                           "DOUBLECOLON", 
                                                           "COLONSHARP", 
                                                           "QUOTE", "COLONQUOTE", 
                                                           "SHARP", "QM", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u003c\u0373\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0004\u0042\u0009\u0042\u0004\u0043\u0009\u0043\u0004\u0044\u0009\u0044\u0003\u0002\u0005\u0002\u008a\u000a\u0002\u0003\u0002\u0007\u0002\u008d\u000a\u0002\u000c\u0002\u000e\u0002\u0090\u000b\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u0094\u000a\u0002\u000c\u0002\u000e\u0002\u0097\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u009c\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u00a1\u000a\u0004\u0003\u0004\u0005\u0004\u00a4\u000a\u0004\u0003\u0004\u0005\u0004\u00a7\u000a\u0004\u0003\u0005\u0003\u0005\u0007\u0005\u00ab\u000a\u0005\u000c\u0005\u000e\u0005\u00ae\u000b\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00b5\u000a\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00b9\u000a\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00bf\u000a\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00c7\u000a\u0006\u0005\u0006\u00c9\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0007\u000b\u00da\u000a\u000b\u000c\u000b\u000e\u000b\u00dd\u000b\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0007\u000d\u00e5\u000a\u000d\u000c\u000d\u000e\u000d\u00e8\u000b\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00ef\u000a\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u00fe\u000a\u0010\u0003\u0011\u0005\u0011\u0101\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0106\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u010c\u000a\u0011\u0007\u0011\u010e\u000a\u0011\u000c\u0011\u000e\u0011\u0111\u000b\u0011\u0003\u0011\u0007\u0011\u0114\u000a\u0011\u000c\u0011\u000e\u0011\u0117\u000b\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u011b\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0120\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u0126\u000a\u0011\u000c\u0011\u000e\u0011\u0129\u000b\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u012d\u000a\u0011\u000c\u0011\u000e\u0011\u0130\u000b\u0011\u0003\u0011\u0005\u0011\u0133\u000a\u0011\u0003\u0011\u0007\u0011\u0136\u000a\u0011\u000c\u0011\u000e\u0011\u0139\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u013e\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0143\u000a\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0147\u000a\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u014b\u000a\u0011\u000c\u0011\u000e\u0011\u014e\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0153\u000a\u0011\u0007\u0011\u0155\u000a\u0011\u000c\u0011\u000e\u0011\u0158\u000b\u0011\u0003\u0011\u0005\u0011\u015b\u000a\u0011\u0003\u0011\u0007\u0011\u015e\u000a\u0011\u000c\u0011\u000e\u0011\u0161\u000b\u0011\u0003\u0011\u0005\u0011\u0164\u000a\u0011\u0003\u0012\u0003\u0012\u0005\u0012\u0168\u000a\u0012\u0003\u0012\u0005\u0012\u016b\u000a\u0012\u0003\u0013\u0005\u0013\u016e\u000a\u0013\u0003\u0013\u0005\u0013\u0171\u000a\u0013\u0003\u0014\u0005\u0014\u0174\u000a\u0014\u0003\u0014\u0003\u0014\u0005\u0014\u0178\u000a\u0014\u0003\u0014\u0005\u0014\u017b\u000a\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0005\u0015\u0181\u000a\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u0188\u000a\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0007\u0017\u018d\u000a\u0017\u000c\u0017\u000e\u0017\u0190\u000b\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0006\u0018\u0195\u000a\u0018\u000d\u0018\u000e\u0018\u0196\u0003\u0019\u0003\u0019\u0003\u0019\u0007\u0019\u019c\u000a\u0019\u000c\u0019\u000e\u0019\u019f\u000b\u0019\u0003\u001a\u0003\u001a\u0005\u001a\u01a3\u000a\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001b\u01a9\u000a\u001b\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u01b6\u000a\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u01bb\u000a\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0007\u001d\u01c3\u000a\u001d\u000c\u001d\u000e\u001d\u01c6\u000b\u001d\u0003\u001d\u0003\u001d\u0007\u001d\u01ca\u000a\u001d\u000c\u001d\u000e\u001d\u01cd\u000b\u001d\u0003\u001d\u0005\u001d\u01d0\u000a\u001d\u0003\u001d\u0007\u001d\u01d3\u000a\u001d\u000c\u001d\u000e\u001d\u01d6\u000b\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u01e4\u000a\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u01f9\u000a\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0005\u001d\u0202\u000a\u001d\u0003\u001d\u0003\u001d\u0007\u001d\u0206\u000a\u001d\u000c\u001d\u000e\u001d\u0209\u000b\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u020e\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0005\u0022\u0227\u000a\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0005\u0023\u022d\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0006\u0024\u0235\u000a\u0024\u000d\u0024\u000e\u0024\u0236\u0003\u0024\u0003\u0024\u0005\u0024\u023b\u000a\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0006\u0025\u0240\u000a\u0025\u000d\u0025\u000e\u0025\u0241\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0005\u0027\u024d\u000a\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u0252\u000a\u0027\u0003\u0027\u0003\u0027\u0007\u0027\u0256\u000a\u0027\u000c\u0027\u000e\u0027\u0259\u000b\u0027\u0003\u0027\u0005\u0027\u025c\u000a\u0027\u0003\u0028\u0003\u0028\u0006\u0028\u0260\u000a\u0028\u000d\u0028\u000e\u0028\u0261\u0003\u0028\u0003\u0028\u0005\u0028\u0266\u000a\u0028\u0003\u0028\u0007\u0028\u0269\u000a\u0028\u000c\u0028\u000e\u0028\u026c\u000b\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0006\u0028\u0271\u000a\u0028\u000d\u0028\u000e\u0028\u0272\u0003\u0028\u0003\u0028\u0005\u0028\u0277\u000a\u0028\u0003\u0028\u0007\u0028\u027a\u000a\u0028\u000c\u0028\u000e\u0028\u027d\u000b\u0028\u0003\u0028\u0005\u0028\u0280\u000a\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0007\u0029\u0285\u000a\u0029\u000c\u0029\u000e\u0029\u0288\u000b\u0029\u0003\u0029\u0003\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0005\u002a\u028f\u000a\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0003\u002f\u0003\u002f\u0005\u002f\u02a0\u000a\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0005\u0030\u02a6\u000a\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u02ae\u000a\u0031\u0003\u0031\u0005\u0031\u02b1\u000a\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0007\u0032\u02b8\u000a\u0032\u000c\u0032\u000e\u0032\u02bb\u000b\u0032\u0003\u0032\u0003\u0032\u0007\u0032\u02bf\u000a\u0032\u000c\u0032\u000e\u0032\u02c2\u000b\u0032\u0005\u0032\u02c4\u000a\u0032\u0003\u0033\u0005\u0033\u02c7\u000a\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u02cb\u000a\u0033\u0003\u0033\u0005\u0033\u02ce\u000a\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0034\u0005\u0034\u02d5\u000a\u0034\u0003\u0034\u0003\u0034\u0005\u0034\u02d9\u000a\u0034\u0003\u0034\u0005\u0034\u02dc\u000a\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0005\u0034\u02e1\u000a\u0034\u0003\u0035\u0003\u0035\u0005\u0035\u02e5\u000a\u0035\u0003\u0035\u0003\u0035\u0006\u0035\u02e9\u000a\u0035\u000d\u0035\u000e\u0035\u02ea\u0003\u0035\u0003\u0035\u0003\u0036\u0003\u0036\u0003\u0036\u0005\u0036\u02f2\u000a\u0036\u0003\u0036\u0003\u0036\u0005\u0036\u02f6\u000a\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0038\u0007\u0038\u02fe\u000a\u0038\u000c\u0038\u000e\u0038\u0301\u000b\u0038\u0003\u0038\u0005\u0038\u0304\u000a\u0038\u0003\u0039\u0003\u0039\u0006\u0039\u0308\u000a\u0039\u000d\u0039\u000e\u0039\u0309\u0003\u003a\u0005\u003a\u030d\u000a\u003a\u0003\u003a\u0003\u003a\u0005\u003a\u0311\u000a\u003a\u0003\u003a\u0005\u003a\u0314\u000a\u003a\u0003\u003b\u0003\u003b\u0003\u003b\u0005\u003b\u0319\u000a\u003b\u0003\u003b\u0003\u003b\u0003\u003b\u0003\u003b\u0005\u003b\u031f\u000a\u003b\u0003\u003b\u0003\u003b\u0006\u003b\u0323\u000a\u003b\u000d\u003b\u000e\u003b\u0324\u0003\u003b\u0003\u003b\u0005\u003b\u0329\u000a\u003b\u0003\u003b\u0005\u003b\u032c\u000a\u003b\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0005\u003c\u033c\u000a\u003c\u0003\u003d\u0003\u003d\u0005\u003d\u0340\u000a\u003d\u0003\u003e\u0003\u003e\u0007\u003e\u0344\u000a\u003e\u000c\u003e\u000e\u003e\u0347\u000b\u003e\u0003\u003e\u0003\u003e\u0003\u003e\u0003\u003e\u0003\u003f\u0003\u003f\u0007\u003f\u034f\u000a\u003f\u000c\u003f\u000e\u003f\u0352\u000b\u003f\u0003\u003f\u0003\u003f\u0005\u003f\u0356\u000a\u003f\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0041\u0003\u0041\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0043\u0003\u0043\u0003\u0043\u0005\u0043\u0364\u000a\u0043\u0003\u0043\u0003\u0043\u0005\u0043\u0368\u000a\u0043\u0003\u0044\u0003\u0044\u0007\u0044\u036c\u000a\u0044\u000c\u0044\u000e\u0044\u036f\u000b\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0002\u0003\u0038\u0045\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0070\u0072\u0074\u0076\u0078\u007a\u007c\u007e\u0080\u0082\u0084\u0086\u0002\u0004\u0003\u0002\u0022\u0023\u0003\u0002\u0036\u0037\u0002\u03c7\u0002\u0089\u0003\u0002\u0002\u0002\u0004\u009b\u0003\u0002\u0002\u0002\u0006\u009d\u0003\u0002\u0002\u0002\u0008\u00a8\u0003\u0002\u0002\u0002\u000a\u00c8\u0003\u0002\u0002\u0002\u000c\u00ca\u0003\u0002\u0002\u0002\u000e\u00cc\u0003\u0002\u0002\u0002\u0010\u00ce\u0003\u0002\u0002\u0002\u0012\u00d3\u0003\u0002\u0002\u0002\u0014\u00d6\u0003\u0002\u0002\u0002\u0016\u00de\u0003\u0002\u0002\u0002\u0018\u00e1\u0003\u0002\u0002\u0002\u001a\u00ee\u0003\u0002\u0002\u0002\u001c\u00f0\u0003\u0002\u0002\u0002\u001e\u00fd\u0003\u0002\u0002\u0002\u0020\u0163\u0003\u0002\u0002\u0002\u0022\u0165\u0003\u0002\u0002\u0002\u0024\u016d\u0003\u0002\u0002\u0002\u0026\u0173\u0003\u0002\u0002\u0002\u0028\u017e\u0003\u0002\u0002\u0002\u002a\u0184\u0003\u0002\u0002\u0002\u002c\u0189\u0003\u0002\u0002\u0002\u002e\u0194\u0003\u0002\u0002\u0002\u0030\u0198\u0003\u0002\u0002\u0002\u0032\u01a2\u0003\u0002\u0002\u0002\u0034\u01a8\u0003\u0002\u0002\u0002\u0036\u01aa\u0003\u0002\u0002\u0002\u0038\u01e3\u0003\u0002\u0002\u0002\u003a\u020d\u0003\u0002\u0002\u0002\u003c\u0211\u0003\u0002\u0002\u0002\u003e\u0216\u0003\u0002\u0002\u0002\u0040\u021e\u0003\u0002\u0002\u0002\u0042\u0224\u0003\u0002\u0002\u0002\u0044\u022c\u0003\u0002\u0002\u0002\u0046\u0232\u0003\u0002\u0002\u0002\u0048\u023c\u0003\u0002\u0002\u0002\u004a\u0245\u0003\u0002\u0002\u0002\u004c\u025b\u0003\u0002\u0002\u0002\u004e\u027f\u0003\u0002\u0002\u0002\u0050\u0281\u0003\u0002\u0002\u0002\u0052\u028e\u0003\u0002\u0002\u0002\u0054\u0290\u0003\u0002\u0002\u0002\u0056\u0294\u0003\u0002\u0002\u0002\u0058\u0299\u0003\u0002\u0002\u0002\u005a\u029b\u0003\u0002\u0002\u0002\u005c\u029f\u0003\u0002\u0002\u0002\u005e\u02a1\u0003\u0002\u0002\u0002\u0060\u02a9\u0003\u0002\u0002\u0002\u0062\u02c3\u0003\u0002\u0002\u0002\u0064\u02c6\u0003\u0002\u0002\u0002\u0066\u02d4\u0003\u0002\u0002\u0002\u0068\u02e2\u0003\u0002\u0002\u0002\u006a\u02f5\u0003\u0002\u0002\u0002\u006c\u02f7\u0003\u0002\u0002\u0002\u006e\u02ff\u0003\u0002\u0002\u0002\u0070\u0305\u0003\u0002\u0002\u0002\u0072\u0313\u0003\u0002\u0002\u0002\u0074\u032b\u0003\u0002\u0002\u0002\u0076\u033b\u0003\u0002\u0002\u0002\u0078\u033d\u0003\u0002\u0002\u0002\u007a\u0341\u0003\u0002\u0002\u0002\u007c\u0355\u0003\u0002\u0002\u0002\u007e\u0357\u0003\u0002\u0002\u0002\u0080\u035a\u0003\u0002\u0002\u0002\u0082\u035c\u0003\u0002\u0002\u0002\u0084\u0363\u0003\u0002\u0002\u0002\u0086\u0369\u0003\u0002\u0002\u0002\u0088\u008a\u0005\u0016\u000c\u0002\u0089\u0088\u0003\u0002\u0002\u0002\u0089\u008a\u0003\u0002\u0002\u0002\u008a\u008e\u0003\u0002\u0002\u0002\u008b\u008d\u0005\u0006\u0004\u0002\u008c\u008b\u0003\u0002\u0002\u0002\u008d\u0090\u0003\u0002\u0002\u0002\u008e\u008c\u0003\u0002\u0002\u0002\u008e\u008f\u0003\u0002\u0002\u0002\u008f\u0095\u0003\u0002\u0002\u0002\u0090\u008e\u0003\u0002\u0002\u0002\u0091\u0094\u0005\u0004\u0003\u0002\u0092\u0094\u0005\u0082\u0042\u0002\u0093\u0091\u0003\u0002\u0002\u0002\u0093\u0092\u0003\u0002\u0002\u0002\u0094\u0097\u0003\u0002\u0002\u0002\u0095\u0093\u0003\u0002\u0002\u0002\u0095\u0096\u0003\u0002\u0002\u0002\u0096\u0003\u0003\u0002\u0002\u0002\u0097\u0095\u0003\u0002\u0002\u0002\u0098\u009c\u0005\u0032\u001a\u0002\u0099\u009a\u0007\u0035\u0002\u0002\u009a\u009c\u0005\u005c\u002f\u0002\u009b\u0098\u0003\u0002\u0002\u0002\u009b\u0099\u0003\u0002\u0002\u0002\u009c\u0005\u0003\u0002\u0002\u0002\u009d\u009e\u0007\u000c\u0002\u0002\u009e\u00a0\u0005\u0014\u000b\u0002\u009f\u00a1\u0005\u0012\u000a\u0002\u00a0\u009f\u0003\u0002\u0002\u0002\u00a0\u00a1\u0003\u0002\u0002\u0002\u00a1\u00a3\u0003\u0002\u0002\u0002\u00a2\u00a4\u0005\u0010\u0009\u0002\u00a3\u00a2\u0003\u0002\u0002\u0002\u00a3\u00a4\u0003\u0002\u0002\u0002\u00a4\u00a6\u0003\u0002\u0002\u0002\u00a5\u00a7\u0005\u0008\u0005\u0002\u00a6\u00a5\u0003\u0002\u0002\u0002\u00a6\u00a7\u0003\u0002\u0002\u0002\u00a7\u0007\u0003\u0002\u0002\u0002\u00a8\u00ac\u0007\u002b\u0002\u0002\u00a9\u00ab\u0005\u000a\u0006\u0002\u00aa\u00a9\u0003\u0002\u0002\u0002\u00ab\u00ae\u0003\u0002\u0002\u0002\u00ac\u00aa\u0003\u0002\u0002\u0002\u00ac\u00ad\u0003\u0002\u0002\u0002\u00ad\u00af\u0003\u0002\u0002\u0002\u00ae\u00ac\u0003\u0002\u0002\u0002\u00af\u00b0\u0007\u002c\u0002\u0002\u00b0\u0009\u0003\u0002\u0002\u0002\u00b1\u00b4\u0007\u0037\u0002\u0002\u00b2\u00b3\u0007\u0035\u0002\u0002\u00b3\u00b5\u0005\u000c\u0007\u0002\u00b4\u00b2\u0003\u0002\u0002\u0002\u00b4\u00b5\u0003\u0002\u0002\u0002\u00b5\u00b8\u0003\u0002\u0002\u0002\u00b6\u00b7\u0007\u002f\u0002\u0002\u00b7\u00b9\u0005\u000e\u0008\u0002\u00b8\u00b6\u0003\u0002\u0002\u0002\u00b8\u00b9\u0003\u0002\u0002\u0002\u00b9\u00c9\u0003\u0002\u0002\u0002\u00ba\u00bb\u0007\u0007\u0002\u0002\u00bb\u00be\u0007\u0037\u0002\u0002\u00bc\u00bd\u0007\u0035\u0002\u0002\u00bd\u00bf\u0005\u000c\u0007\u0002\u00be\u00bc\u0003\u0002\u0002\u0002\u00be\u00bf\u0003\u0002\u0002\u0002\u00bf\u00c9\u0003\u0002\u0002\u0002\u00c0\u00c1\u0007\u0007\u0002\u0002\u00c1\u00c2\u0007\u0033\u0002\u0002\u00c2\u00c3\u0007\u0037\u0002\u0002\u00c3\u00c6\u0007\u0033\u0002\u0002\u00c4\u00c5\u0007\u0035\u0002\u0002\u00c5\u00c7\u0005\u000c\u0007\u0002\u00c6\u00c4\u0003\u0002\u0002\u0002\u00c6\u00c7\u0003\u0002\u0002\u0002\u00c7\u00c9\u0003\u0002\u0002\u0002\u00c8\u00b1\u0003\u0002\u0002\u0002\u00c8\u00ba\u0003\u0002\u0002\u0002\u00c8\u00c0\u0003\u0002\u0002\u0002\u00c9\u000b\u0003\u0002\u0002\u0002\u00ca\u00cb\u0007\u0037\u0002\u0002\u00cb\u000d\u0003\u0002\u0002\u0002\u00cc\u00cd\u0005\u0072\u003a\u0002\u00cd\u000f\u0003\u0002\u0002\u0002\u00ce\u00cf\u0007\u0027\u0002\u0002\u00cf\u00d0\u0007\u0012\u0002\u0002\u00d0\u00d1\u0007\u003c\u0002\u0002\u00d1\u00d2\u0007\u0028\u0002\u0002\u00d2\u0011\u0003\u0002\u0002\u0002\u00d3\u00d4\u0007\u0035\u0002\u0002\u00d4\u00d5\u0007\u0037\u0002\u0002\u00d5\u0013\u0003\u0002\u0002\u0002\u00d6\u00db\u0007\u0037\u0002\u0002\u00d7\u00d8\u0007\u0026\u0002\u0002\u00d8\u00da\u0007\u0037\u0002\u0002\u00d9\u00d7\u0003\u0002\u0002\u0002\u00da\u00dd\u0003\u0002\u0002\u0002\u00db\u00d9\u0003\u0002\u0002\u0002\u00db\u00dc\u0003\u0002\u0002\u0002\u00dc\u0015\u0003\u0002\u0002\u0002\u00dd\u00db\u0003\u0002\u0002\u0002\u00de\u00df\u0007\u000a\u0002\u0002\u00df\u00e0\u0005\u0014\u000b\u0002\u00e0\u0017\u0003\u0002\u0002\u0002\u00e1\u00e2\u0007\u0008\u0002\u0002\u00e2\u00e6\u0007\u002b\u0002\u0002\u00e3\u00e5\u0005\u001a\u000e\u0002\u00e4\u00e3\u0003\u0002\u0002\u0002\u00e5\u00e8\u0003\u0002\u0002\u0002\u00e6\u00e4\u0003\u0002\u0002\u0002\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u00e9\u0003\u0002\u0002\u0002\u00e8\u00e6\u0003\u0002\u0002\u0002\u00e9\u00ea\u0007\u002c\u0002\u0002\u00ea\u0019\u0003\u0002\u0002\u0002\u00eb\u00ef\u0005\u001e\u0010\u0002\u00ec\u00ef\u0005\u0038\u001d\u0002\u00ed\u00ef\u0005\u001c\u000f\u0002\u00ee\u00eb\u0003\u0002\u0002\u0002\u00ee\u00ec\u0003\u0002\u0002\u0002\u00ee\u00ed\u0003\u0002\u0002\u0002\u00ef\u001b\u0003\u0002\u0002\u0002\u00f0\u00f1\u0007\u000f\u0002\u0002\u00f1\u00f2\u0005\u0038\u001d\u0002\u00f2\u001d\u0003\u0002\u0002\u0002\u00f3\u00f4\u0007\u0035\u0002\u0002\u00f4\u00f5\u0007\u0037\u0002\u0002\u00f5\u00f6\u0007\u0024\u0002\u0002\u00f6\u00fe\u0005\u0038\u001d\u0002\u00f7\u00f8\u0005\u0038\u001d\u0002\u00f8\u00f9\u0007\u0032\u0002\u0002\u00f9\u00fa\u0007\u0037\u0002\u0002\u00fa\u00fb\u0007\u0024\u0002\u0002\u00fb\u00fc\u0005\u0038\u001d\u0002\u00fc\u00fe\u0003\u0002\u0002\u0002\u00fd\u00f3\u0003\u0002\u0002\u0002\u00fd\u00f7\u0003\u0002\u0002\u0002\u00fe\u001f\u0003\u0002\u0002\u0002\u00ff\u0101\u0005\u0086\u0044\u0002\u0100\u00ff\u0003\u0002\u0002\u0002\u0100\u0101\u0003\u0002\u0002\u0002\u0101\u0102\u0003\u0002\u0002\u0002\u0102\u0103\u0007\u0007\u0002\u0002\u0103\u0105\u0007\u0037\u0002\u0002\u0104\u0106\u0005\u002e\u0018\u0002\u0105\u0104\u0003\u0002\u0002\u0002\u0105\u0106\u0003\u0002\u0002\u0002\u0106\u0107\u0003\u0002\u0002\u0002\u0107\u010f\u0007\u002b\u0002\u0002\u0108\u010b\u0007\u0030\u0002\u0002\u0109\u010c\u0005\u0026\u0014\u0002\u010a\u010c\u0005\u0062\u0032\u0002\u010b\u0109\u0003\u0002\u0002\u0002\u010b\u010a\u0003\u0002\u0002\u0002\u010c\u010e\u0003\u0002\u0002\u0002\u010d\u0108\u0003\u0002\u0002\u0002\u010e\u0111\u0003\u0002\u0002\u0002\u010f\u010d\u0003\u0002\u0002\u0002\u010f\u0110\u0003\u0002\u0002\u0002\u0110\u0115\u0003\u0002\u0002\u0002\u0111\u010f\u0003\u0002\u0002\u0002\u0112\u0114\u0005\u002a\u0016\u0002\u0113\u0112\u0003\u0002\u0002\u0002\u0114\u0117\u0003\u0002\u0002\u0002\u0115\u0113\u0003\u0002\u0002\u0002\u0115\u0116\u0003\u0002\u0002\u0002\u0116\u0118\u0003\u0002\u0002\u0002\u0117\u0115\u0003\u0002\u0002\u0002\u0118\u0164\u0007\u002c\u0002\u0002\u0119\u011b\u0005\u0086\u0044\u0002\u011a\u0119\u0003\u0002\u0002\u0002\u011a\u011b\u0003\u0002\u0002\u0002\u011b\u011c\u0003\u0002\u0002\u0002\u011c\u011d\u0007\u0007\u0002\u0002\u011d\u011f\u0007\u0037\u0002\u0002\u011e\u0120\u0005\u002e\u0018\u0002\u011f\u011e\u0003\u0002\u0002\u0002\u011f\u0120\u0003\u0002\u0002\u0002\u0120\u0121\u0003\u0002\u0002\u0002\u0121\u0122\u0007\u002b\u0002\u0002\u0122\u0127\u0005\u0024\u0013\u0002\u0123\u0124\u0007\u0032\u0002\u0002\u0124\u0126\u0005\u005c\u002f\u0002\u0125\u0123\u0003\u0002\u0002\u0002\u0126\u0129\u0003\u0002\u0002\u0002\u0127\u0125\u0003\u0002\u0002\u0002\u0127\u0128\u0003\u0002\u0002\u0002\u0128\u012e\u0003\u0002\u0002\u0002\u0129\u0127\u0003\u0002\u0002\u0002\u012a\u012b\u0007\u0030\u0002\u0002\u012b\u012d\u0005\u0062\u0032\u0002\u012c\u012a\u0003\u0002\u0002\u0002\u012d\u0130\u0003\u0002\u0002\u0002\u012e\u012c\u0003\u0002\u0002\u0002\u012e\u012f\u0003\u0002\u0002\u0002\u012f\u0132\u0003\u0002\u0002\u0002\u0130\u012e\u0003\u0002\u0002\u0002\u0131\u0133\u0005\u0028\u0015\u0002\u0132\u0131\u0003\u0002\u0002\u0002\u0132\u0133\u0003\u0002\u0002\u0002\u0133\u0137\u0003\u0002\u0002\u0002\u0134\u0136\u0005\u002a\u0016\u0002\u0135\u0134\u0003\u0002\u0002\u0002\u0136\u0139\u0003\u0002\u0002\u0002\u0137\u0135\u0003\u0002\u0002\u0002\u0137\u0138\u0003\u0002\u0002\u0002\u0138\u013a\u0003\u0002\u0002\u0002\u0139\u0137\u0003\u0002\u0002\u0002\u013a\u013b\u0007\u002c\u0002\u0002\u013b\u0164\u0003\u0002\u0002\u0002\u013c\u013e\u0005\u0086\u0044\u0002\u013d\u013c\u0003\u0002\u0002\u0002\u013d\u013e\u0003\u0002\u0002\u0002\u013e\u013f\u0003\u0002\u0002\u0002\u013f\u0140\u0007\u0007\u0002\u0002\u0140\u0142\u0007\u0037\u0002\u0002\u0141\u0143\u0005\u002e\u0018\u0002\u0142\u0141\u0003\u0002\u0002\u0002\u0142\u0143\u0003\u0002\u0002\u0002\u0143\u0144\u0003\u0002\u0002\u0002\u0144\u0146\u0007\u002b\u0002\u0002\u0145\u0147\u0005\u0024\u0013\u0002\u0146\u0145\u0003\u0002\u0002\u0002\u0146\u0147\u0003\u0002\u0002\u0002\u0147\u014c\u0003\u0002\u0002\u0002\u0148\u0149\u0007\u0032\u0002\u0002\u0149\u014b\u0005\u005c\u002f\u0002\u014a\u0148\u0003\u0002\u0002\u0002\u014b\u014e\u0003\u0002\u0002\u0002\u014c\u014a\u0003\u0002\u0002\u0002\u014c\u014d\u0003\u0002\u0002\u0002\u014d\u0156\u0003\u0002\u0002\u0002\u014e\u014c\u0003\u0002\u0002\u0002\u014f\u0152\u0007\u0030\u0002\u0002\u0150\u0153\u0005\u0026\u0014\u0002\u0151\u0153\u0005\u0062\u0032\u0002\u0152\u0150\u0003\u0002\u0002\u0002\u0152\u0151\u0003\u0002\u0002\u0002\u0153\u0155\u0003\u0002\u0002\u0002\u0154\u014f\u0003\u0002\u0002\u0002\u0155\u0158\u0003\u0002\u0002\u0002\u0156\u0154\u0003\u0002\u0002\u0002\u0156\u0157\u0003\u0002\u0002\u0002\u0157\u015a\u0003\u0002\u0002\u0002\u0158\u0156\u0003\u0002\u0002\u0002\u0159\u015b\u0005\u0028\u0015\u0002\u015a\u0159\u0003\u0002\u0002\u0002\u015a\u015b\u0003\u0002\u0002\u0002\u015b\u015f\u0003\u0002\u0002\u0002\u015c\u015e\u0005\u002a\u0016\u0002\u015d\u015c\u0003\u0002\u0002\u0002\u015e\u0161\u0003\u0002\u0002\u0002\u015f\u015d\u0003\u0002\u0002\u0002\u015f\u0160\u0003\u0002\u0002\u0002\u0160\u0162\u0003\u0002\u0002\u0002\u0161\u015f\u0003\u0002\u0002\u0002\u0162\u0164\u0007\u002c\u0002\u0002\u0163\u0100\u0003\u0002\u0002\u0002\u0163\u011a\u0003\u0002\u0002\u0002\u0163\u013d\u0003\u0002\u0002\u0002\u0164\u0021\u0003\u0002\u0002\u0002\u0165\u0167\u0007\u0037\u0002\u0002\u0166\u0168\u0005\u0046\u0024\u0002\u0167\u0166\u0003\u0002\u0002\u0002\u0167\u0168\u0003\u0002\u0002\u0002\u0168\u016a\u0003\u0002\u0002\u0002\u0169\u016b\u0005\u0018\u000d\u0002\u016a\u0169\u0003\u0002\u0002\u0002\u016a\u016b\u0003\u0002\u0002\u0002\u016b\u0023\u0003\u0002\u0002\u0002\u016c\u016e\u0005\u0046\u0024\u0002\u016d\u016c\u0003\u0002\u0002\u0002\u016d\u016e\u0003\u0002\u0002\u0002\u016e\u0170\u0003\u0002\u0002\u0002\u016f\u0171\u0005\u0018\u000d\u0002\u0170\u016f\u0003\u0002\u0002\u0002\u0170\u0171\u0003\u0002\u0002\u0002\u0171\u0025\u0003\u0002\u0002\u0002\u0172\u0174\u0005\u0086\u0044\u0002\u0173\u0172\u0003\u0002\u0002\u0002\u0173\u0174\u0003\u0002\u0002\u0002\u0174\u0175\u0003\u0002\u0002\u0002\u0175\u0177\u0005\u0052\u002a\u0002\u0176\u0178\u0005\u002e\u0018\u0002\u0177\u0176\u0003\u0002\u0002\u0002\u0177\u0178\u0003\u0002\u0002\u0002\u0178\u017a\u0003\u0002\u0002\u0002\u0179\u017b\u0005\u0046\u0024\u0002\u017a\u0179\u0003\u0002\u0002\u0002\u017a\u017b\u0003\u0002\u0002\u0002\u017b\u017c\u0003\u0002\u0002\u0002\u017c\u017d\u0005\u0072\u003a\u0002\u017d\u0027\u0003\u0002\u0002\u0002\u017e\u0180\u0007\u000e\u0002\u0002\u017f\u0181\u0005\u004e\u0028\u0002\u0180\u017f\u0003\u0002\u0002\u0002\u0180\u0181\u0003\u0002\u0002\u0002\u0181\u0182\u0003\u0002\u0002\u0002\u0182\u0183\u0005\u002a\u0016\u0002\u0183\u0029\u0003\u0002\u0002\u0002\u0184\u0185\u0007\u000d\u0002\u0002\u0185\u0187\u0005\u0072\u003a\u0002\u0186\u0188\u0005\u002c\u0017\u0002\u0187\u0186\u0003\u0002\u0002\u0002\u0187\u0188\u0003\u0002\u0002\u0002\u0188\u002b\u0003\u0002\u0002\u0002\u0189\u018e\u0007\u002b\u0002\u0002\u018a\u018b\u0007\u0030\u0002\u0002\u018b\u018d\u0005\u0062\u0032\u0002\u018c\u018a\u0003\u0002\u0002\u0002\u018d\u0190\u0003\u0002\u0002\u0002\u018e\u018c\u0003\u0002\u0002\u0002\u018e\u018f\u0003\u0002\u0002\u0002\u018f\u0191\u0003\u0002\u0002\u0002\u0190\u018e\u0003\u0002\u0002\u0002\u0191\u0192\u0007\u002c\u0002\u0002\u0192\u002d\u0003\u0002\u0002\u0002\u0193\u0195\u0005\u0030\u0019\u0002\u0194\u0193\u0003\u0002\u0002\u0002\u0195\u0196\u0003\u0002\u0002\u0002\u0196\u0194\u0003\u0002\u0002\u0002\u0196\u0197\u0003\u0002\u0002\u0002\u0197\u002f\u0003\u0002\u0002\u0002\u0198\u019d\u0007\u0037\u0002\u0002\u0199\u019a\u0007\u002e\u0002\u0002\u019a\u019c\u0005\u0072\u003a\u0002\u019b\u0199\u0003\u0002\u0002\u0002\u019c\u019f\u0003\u0002\u0002\u0002\u019d\u019b\u0003\u0002\u0002\u0002\u019d\u019e\u0003\u0002\u0002\u0002\u019e\u0031\u0003\u0002\u0002\u0002\u019f\u019d\u0003\u0002\u0002\u0002\u01a0\u01a3\u0005\u0062\u0032\u0002\u01a1\u01a3\u0005\u0020\u0011\u0002\u01a2\u01a0\u0003\u0002\u0002\u0002\u01a2\u01a1\u0003\u0002\u0002\u0002\u01a3\u0033\u0003\u0002\u0002\u0002\u01a4\u01a9\u0007\u0039\u0002\u0002\u01a5\u01a9\u0007\u003a\u0002\u0002\u01a6\u01a9\u0007\u003b\u0002\u0002\u01a7\u01a9\u0005\u0036\u001c\u0002\u01a8\u01a4\u0003\u0002\u0002\u0002\u01a8\u01a5\u0003\u0002\u0002\u0002\u01a8\u01a6\u0003\u0002\u0002\u0002\u01a8\u01a7\u0003\u0002\u0002\u0002\u01a9\u0035\u0003\u0002\u0002\u0002\u01aa\u01ab\u0009\u0002\u0002\u0002\u01ab\u0037\u0003\u0002\u0002\u0002\u01ac\u01ad\u0008\u001d\u0001\u0002\u01ad\u01e4\u0005\u0034\u001b\u0002\u01ae\u01e4\u0007\u0021\u0002\u0002\u01af\u01b0\u0007\u002d\u0002\u0002\u01b0\u01e4\u0009\u0003\u0002\u0002\u01b1\u01b2\u0007\u0033\u0002\u0002\u01b2\u01e4\u0005\u003a\u001e\u0002\u01b3\u01b5\u0005\u003a\u001e\u0002\u01b4\u01b6\u0005\u004e\u0028\u0002\u01b5\u01b4\u0003\u0002\u0002\u0002\u01b5\u01b6\u0003\u0002\u0002\u0002\u01b6\u01e4\u0003\u0002\u0002\u0002\u01b7\u01b8\u0007\u0015\u0002\u0002\u01b8\u01ba\u0005\u003a\u001e\u0002\u01b9\u01bb\u0005\u004e\u0028\u0002\u01ba\u01b9\u0003\u0002\u0002\u0002\u01ba\u01bb\u0003\u0002\u0002\u0002\u01bb\u01e4\u0003\u0002\u0002\u0002\u01bc\u01bd\u0007\u0035\u0002\u0002\u01bd\u01e4\u0005\u003a\u001e\u0002\u01be\u01bf\u0007\u0015\u0002\u0002\u01bf\u01c4\u0007\u002b\u0002\u0002\u01c0\u01c1\u0007\u0032\u0002\u0002\u01c1\u01c3\u0005\u005c\u002f\u0002\u01c2\u01c0\u0003\u0002\u0002\u0002\u01c3\u01c6\u0003\u0002\u0002\u0002\u01c4\u01c2\u0003\u0002\u0002\u0002\u01c4\u01c5\u0003\u0002\u0002\u0002\u01c5\u01cb\u0003\u0002\u0002\u0002\u01c6\u01c4\u0003\u0002\u0002\u0002\u01c7\u01c8\u0007\u0030\u0002\u0002\u01c8\u01ca\u0005\u0062\u0032\u0002\u01c9\u01c7\u0003\u0002\u0002\u0002\u01ca\u01cd\u0003\u0002\u0002\u0002\u01cb\u01c9\u0003\u0002\u0002\u0002\u01cb\u01cc\u0003\u0002\u0002\u0002\u01cc\u01cf\u0003\u0002\u0002\u0002\u01cd\u01cb\u0003\u0002\u0002\u0002\u01ce\u01d0\u0005\u0028\u0015\u0002\u01cf\u01ce\u0003\u0002\u0002\u0002\u01cf\u01d0\u0003\u0002\u0002\u0002\u01d0\u01d4\u0003\u0002\u0002\u0002\u01d1\u01d3\u0005\u002a\u0016\u0002\u01d2\u01d1\u0003\u0002\u0002\u0002\u01d3\u01d6\u0003\u0002\u0002\u0002\u01d4\u01d2\u0003\u0002\u0002\u0002\u01d4\u01d5\u0003\u0002\u0002\u0002\u01d5\u01d7\u0003\u0002\u0002\u0002\u01d6\u01d4\u0003\u0002\u0002\u0002\u01d7\u01e4\u0007\u002c\u0002\u0002\u01d8\u01d9\u0005\u005a\u002e\u0002\u01d9\u01da\u0005\u0038\u001d\u0009\u01da\u01e4\u0003\u0002\u0002\u0002\u01db\u01e4\u0005\u003e\u0020\u0002\u01dc\u01e4\u0005\u0040\u0021\u0002\u01dd\u01e4\u0005\u0018\u000d\u0002\u01de\u01e4\u0005\u006c\u0037\u0002\u01df\u01e0\u0007\u0027\u0002\u0002\u01e0\u01e1\u0005\u0038\u001d\u0002\u01e1\u01e2\u0007\u0028\u0002\u0002\u01e2\u01e4\u0003\u0002\u0002\u0002\u01e3\u01ac\u0003\u0002\u0002\u0002\u01e3\u01ae\u0003\u0002\u0002\u0002\u01e3\u01af\u0003\u0002\u0002\u0002\u01e3\u01b1\u0003\u0002\u0002\u0002\u01e3\u01b3\u0003\u0002\u0002\u0002\u01e3\u01b7\u0003\u0002\u0002\u0002\u01e3\u01bc\u0003\u0002\u0002\u0002\u01e3\u01be\u0003\u0002\u0002\u0002\u01e3\u01d8\u0003\u0002\u0002\u0002\u01e3\u01db\u0003\u0002\u0002\u0002\u01e3\u01dc\u0003\u0002\u0002\u0002\u01e3\u01dd\u0003\u0002\u0002\u0002\u01e3\u01de\u0003\u0002\u0002\u0002\u01e3\u01df\u0003\u0002\u0002\u0002\u01e4\u0207\u0003\u0002\u0002\u0002\u01e5\u01e6\u000c\u000b\u0002\u0002\u01e6\u01e7\u0007\u0013\u0002\u0002\u01e7\u0206\u0005\u0038\u001d\u000c\u01e8\u01e9\u000c\u000a\u0002\u0002\u01e9\u01ea\u0007\u0036\u0002\u0002\u01ea\u0206\u0005\u0038\u001d\u000b\u01eb\u01ec\u000c\u0008\u0002\u0002\u01ec\u01ed\u0005\u0058\u002d\u0002\u01ed\u01ee\u0005\u0038\u001d\u0009\u01ee\u0206\u0003\u0002\u0002\u0002\u01ef\u01f0\u000c\u0011\u0002\u0002\u01f0\u0206\u0005\u003c\u001f\u0002\u01f1\u01f2\u000c\u0010\u0002\u0002\u01f2\u01f3\u0007\u0032\u0002\u0002\u01f3\u0206\u0007\u0037\u0002\u0002\u01f4\u01f5\u000c\u000f\u0002\u0002\u01f5\u01f6\u0007\u0030\u0002\u0002\u01f6\u01f8\u0007\u0037\u0002\u0002\u01f7\u01f9\u0005\u004e\u0028\u0002\u01f8\u01f7\u0003\u0002\u0002\u0002\u01f8\u01f9\u0003\u0002\u0002\u0002\u01f9\u0206\u0003\u0002\u0002\u0002\u01fa\u01fb\u000c\u000e\u0002\u0002\u01fb\u01fc\u0007\u0034\u0002\u0002\u01fc\u0206\u0007\u0037\u0002\u0002\u01fd\u01fe\u000c\u000d\u0002\u0002\u01fe\u01ff\u0007\u0031\u0002\u0002\u01ff\u0201\u0007\u0037\u0002\u0002\u0200\u0202\u0005\u004e\u0028\u0002\u0201\u0200\u0003\u0002\u0002\u0002\u0201\u0202\u0003\u0002\u0002\u0002\u0202\u0206\u0003\u0002\u0002\u0002\u0203\u0204\u000c\u000c\u0002\u0002\u0204\u0206\u0005\u0050\u0029\u0002\u0205\u01e5\u0003\u0002\u0002\u0002\u0205\u01e8\u0003\u0002\u0002\u0002\u0205\u01eb\u0003\u0002\u0002\u0002\u0205\u01ef\u0003\u0002\u0002\u0002\u0205\u01f1\u0003\u0002\u0002\u0002\u0205\u01f4\u0003\u0002\u0002\u0002\u0205\u01fa\u0003\u0002\u0002\u0002\u0205\u01fd\u0003\u0002\u0002\u0002\u0205\u0203\u0003\u0002\u0002\u0002\u0206\u0209\u0003\u0002\u0002\u0002\u0207\u0205\u0003\u0002\u0002\u0002\u0207\u0208\u0003\u0002\u0002\u0002\u0208\u0039\u0003\u0002\u0002\u0002\u0209\u0207\u0003\u0002\u0002\u0002\u020a\u020b\u0005\u0014\u000b\u0002\u020b\u020c\u0007\u0026\u0002\u0002\u020c\u020e\u0003\u0002\u0002\u0002\u020d\u020a\u0003\u0002\u0002\u0002\u020d\u020e\u0003\u0002\u0002\u0002\u020e\u020f\u0003\u0002\u0002\u0002\u020f\u0210\u0005\u0052\u002a\u0002\u0210\u003b\u0003\u0002\u0002\u0002\u0211\u0212\u0007\u0027\u0002\u0002\u0212\u0213\u0007\u002e\u0002\u0002\u0213\u0214\u0005\u0072\u003a\u0002\u0214\u0215\u0007\u0028\u0002\u0002\u0215\u003d\u0003\u0002\u0002\u0002\u0216\u0217\u0007\u0013\u0002\u0002\u0217\u0218\u0007\u0027\u0002\u0002\u0218\u0219\u0005\u0038\u001d\u0002\u0219\u021a\u0007\u0028\u0002\u0002\u021a\u021b\u0005\u0038\u001d\u0002\u021b\u021c\u0007\u0014\u0002\u0002\u021c\u021d\u0005\u0038\u001d\u0002\u021d\u003f\u0003\u0002\u0002\u0002\u021e\u021f\u0007\u0016\u0002\u0002\u021f\u0220\u0005\u0038\u001d\u0002\u0220\u0221\u0007\u0024\u0002\u0002\u0221\u0222\u0005\u0038\u001d\u0002\u0222\u0223\u0005\u0038\u001d\u0002\u0223\u0041\u0003\u0002\u0002\u0002\u0224\u0226\u0007\u0037\u0002\u0002\u0225\u0227\u0007\u0025\u0002\u0002\u0226\u0225\u0003\u0002\u0002\u0002\u0226\u0227\u0003\u0002\u0002\u0002\u0227\u0228\u0003\u0002\u0002\u0002\u0228\u0229\u0007\u002e\u0002\u0002\u0229\u022a\u0005\u0072\u003a\u0002\u022a\u0043\u0003\u0002\u0002\u0002\u022b\u022d\u0005\u004a\u0026\u0002\u022c\u022b\u0003\u0002\u0002\u0002\u022c\u022d\u0003\u0002\u0002\u0002\u022d\u022e\u0003\u0002\u0002\u0002\u022e\u022f\u0005\u0038\u001d\u0002\u022f\u0230\u0007\u002e\u0002\u0002\u0230\u0231\u0005\u0072\u003a\u0002\u0231\u0045\u0003\u0002\u0002\u0002\u0232\u0234\u0007\u0027\u0002\u0002\u0233\u0235\u0005\u0042\u0022\u0002\u0234\u0233\u0003\u0002\u0002\u0002\u0235\u0236\u0003\u0002\u0002\u0002\u0236\u0234\u0003\u0002\u0002\u0002\u0236\u0237\u0003\u0002\u0002\u0002\u0237\u0238\u0003\u0002\u0002\u0002\u0238\u023a\u0007\u0028\u0002\u0002\u0239\u023b\u0005\u0048\u0025\u0002\u023a\u0239\u0003\u0002\u0002\u0002\u023a\u023b\u0003\u0002\u0002\u0002\u023b\u0047\u0003\u0002\u0002\u0002\u023c\u023d\u0007\u0012\u0002\u0002\u023d\u023f\u0007\u0027\u0002\u0002\u023e\u0240\u0005\u0044\u0023\u0002\u023f\u023e\u0003\u0002\u0002\u0002\u0240\u0241\u0003\u0002\u0002\u0002\u0241\u023f\u0003\u0002\u0002\u0002\u0241\u0242\u0003\u0002\u0002\u0002\u0242\u0243\u0003\u0002\u0002\u0002\u0243\u0244\u0007\u0028\u0002\u0002\u0244\u0049\u0003\u0002\u0002\u0002\u0245\u0246\u0007\u0027\u0002\u0002\u0246\u0247\u0007\u0037\u0002\u0002\u0247\u0248\u0007\u0024\u0002\u0002\u0248\u0249\u0007\u0028\u0002\u0002\u0249\u004b\u0003\u0002\u0002\u0002\u024a\u024b\u0007\u0037\u0002\u0002\u024b\u024d\u0007\u0024\u0002\u0002\u024c\u024a\u0003\u0002\u0002\u0002\u024c\u024d\u0003\u0002\u0002\u0002\u024d\u024e\u0003\u0002\u0002\u0002\u024e\u025c\u0005\u0038\u001d\u0002\u024f\u0250\u0007\u0037\u0002\u0002\u0250\u0252\u0007\u0025\u0002\u0002\u0251\u024f\u0003\u0002\u0002\u0002\u0251\u0252\u0003\u0002\u0002\u0002\u0252\u0253\u0003\u0002\u0002\u0002\u0253\u0257\u0007\u002b\u0002\u0002\u0254\u0256\u0005\u0038\u001d\u0002\u0255\u0254\u0003\u0002\u0002\u0002\u0256\u0259\u0003\u0002\u0002\u0002\u0257\u0255\u0003\u0002\u0002\u0002\u0257\u0258\u0003\u0002\u0002\u0002\u0258\u025a\u0003\u0002\u0002\u0002\u0259\u0257\u0003\u0002\u0002\u0002\u025a\u025c\u0007\u002c\u0002\u0002\u025b\u024c\u0003\u0002\u0002\u0002\u025b\u0251\u0003\u0002\u0002\u0002\u025c\u004d\u0003\u0002\u0002\u0002\u025d\u0265\u0007\u0027\u0002\u0002\u025e\u0260\u0005\u0072\u003a\u0002\u025f\u025e\u0003\u0002\u0002\u0002\u0260\u0261\u0003\u0002\u0002\u0002\u0261\u025f\u0003\u0002\u0002\u0002\u0261\u0262\u0003\u0002\u0002\u0002\u0262\u0263\u0003\u0002\u0002\u0002\u0263\u0264\u0007\u002e\u0002\u0002\u0264\u0266\u0003\u0002\u0002\u0002\u0265\u025f\u0003\u0002\u0002\u0002\u0265\u0266\u0003\u0002\u0002\u0002\u0266\u026a\u0003\u0002\u0002\u0002\u0267\u0269\u0005\u004c\u0027\u0002\u0268\u0267\u0003\u0002\u0002\u0002\u0269\u026c\u0003\u0002\u0002\u0002\u026a\u0268\u0003\u0002\u0002\u0002\u026a\u026b\u0003\u0002\u0002\u0002\u026b\u026d\u0003\u0002\u0002\u0002\u026c\u026a\u0003\u0002\u0002\u0002\u026d\u0280\u0007\u0028\u0002\u0002\u026e\u0276\u0007\u002b\u0002\u0002\u026f\u0271\u0005\u0072\u003a\u0002\u0270\u026f\u0003\u0002\u0002\u0002\u0271\u0272\u0003\u0002\u0002\u0002\u0272\u0270\u0003\u0002\u0002\u0002\u0272\u0273\u0003\u0002\u0002\u0002\u0273\u0274\u0003\u0002\u0002\u0002\u0274\u0275\u0007\u002e\u0002\u0002\u0275\u0277\u0003\u0002\u0002\u0002\u0276\u0270\u0003\u0002\u0002\u0002\u0276\u0277\u0003\u0002\u0002\u0002\u0277\u027b\u0003\u0002\u0002\u0002\u0278\u027a\u0005\u0038\u001d\u0002\u0279\u0278\u0003\u0002\u0002\u0002\u027a\u027d\u0003\u0002\u0002\u0002\u027b\u0279\u0003\u0002\u0002\u0002\u027b\u027c\u0003\u0002\u0002\u0002\u027c\u027e\u0003\u0002\u0002\u0002\u027d\u027b\u0003\u0002\u0002\u0002\u027e\u0280\u0007\u002c\u0002\u0002\u027f\u025d\u0003\u0002\u0002\u0002\u027f\u026e\u0003\u0002\u0002\u0002\u0280\u004f\u0003\u0002\u0002\u0002\u0281\u0282\u0007\u0030\u0002\u0002\u0282\u0286\u0007\u0027\u0002\u0002\u0283\u0285\u0005\u0038\u001d\u0002\u0284\u0283\u0003\u0002\u0002\u0002\u0285\u0288\u0003\u0002\u0002\u0002\u0286\u0284\u0003\u0002\u0002\u0002\u0286\u0287\u0003\u0002\u0002\u0002\u0287\u0289\u0003\u0002\u0002\u0002\u0288\u0286\u0003\u0002\u0002\u0002\u0289\u028a\u0007\u0028\u0002\u0002\u028a\u0051\u0003\u0002\u0002\u0002\u028b\u028f\u0007\u0037\u0002\u0002\u028c\u028f\u0005\u0054\u002b\u0002\u028d\u028f\u0005\u0056\u002c\u0002\u028e\u028b\u0003\u0002\u0002\u0002\u028e\u028c\u0003\u0002\u0002\u0002\u028e\u028d\u0003\u0002\u0002\u0002\u028f\u0053\u0003\u0002\u0002\u0002\u0290\u0291\u0007\u0029\u0002\u0002\u0291\u0292\u0007\u0038\u0002\u0002\u0292\u0293\u0007\u002a\u0002\u0002\u0293\u0055\u0003\u0002\u0002\u0002\u0294\u0295\u0007\u0029\u0002\u0002\u0295\u0296\u0007\u002e\u0002\u0002\u0296\u0297\u0007\u0038\u0002\u0002\u0297\u0298\u0007\u002a\u0002\u0002\u0298\u0057\u0003\u0002\u0002\u0002\u0299\u029a\u0007\u0038\u0002\u0002\u029a\u0059\u0003\u0002\u0002\u0002\u029b\u029c\u0007\u0038\u0002\u0002\u029c\u005b\u0003\u0002\u0002\u0002\u029d\u02a0\u0005\u0060\u0031\u0002\u029e\u02a0\u0005\u005e\u0030\u0002\u029f\u029d\u0003\u0002\u0002\u0002\u029f\u029e\u0003\u0002\u0002\u0002\u02a0\u005d\u0003\u0002\u0002\u0002\u02a1\u02a5\u0007\u0037\u0002\u0002\u02a2\u02a3\u0007\u0027\u0002\u0002\u02a3\u02a4\u0007\u0010\u0002\u0002\u02a4\u02a6\u0007\u0028\u0002\u0002\u02a5\u02a2\u0003\u0002\u0002\u0002\u02a5\u02a6\u0003\u0002\u0002\u0002\u02a6\u02a7\u0003\u0002\u0002\u0002\u02a7\u02a8\u0005\u0072\u003a\u0002\u02a8\u005f\u0003\u0002\u0002\u0002\u02a9\u02ad\u0007\u0037\u0002\u0002\u02aa\u02ab\u0007\u0027\u0002\u0002\u02ab\u02ac\u0007\u0010\u0002\u0002\u02ac\u02ae\u0007\u0028\u0002\u0002\u02ad\u02aa\u0003\u0002\u0002\u0002\u02ad\u02ae\u0003\u0002\u0002\u0002\u02ae\u02b0\u0003\u0002\u0002\u0002\u02af\u02b1\u0005\u0072\u003a\u0002\u02b0\u02af\u0003\u0002\u0002\u0002\u02b0\u02b1\u0003\u0002\u0002\u0002\u02b1\u02b2\u0003\u0002\u0002\u0002\u02b2\u02b3\u0007\u0024\u0002\u0002\u02b3\u02b4\u0005\u0038\u001d\u0002\u02b4\u0061\u0003\u0002\u0002\u0002\u02b5\u02b9\u0005\u0064\u0033\u0002\u02b6\u02b8\u0005\u0068\u0035\u0002\u02b7\u02b6\u0003\u0002\u0002\u0002\u02b8\u02bb\u0003\u0002\u0002\u0002\u02b9\u02b7\u0003\u0002\u0002\u0002\u02b9\u02ba\u0003\u0002\u0002\u0002\u02ba\u02c4\u0003\u0002\u0002\u0002\u02bb\u02b9\u0003\u0002\u0002\u0002\u02bc\u02c0\u0005\u0066\u0034\u0002\u02bd\u02bf\u0005\u0068\u0035\u0002\u02be\u02bd\u0003\u0002\u0002\u0002\u02bf\u02c2\u0003\u0002\u0002\u0002\u02c0\u02be\u0003\u0002\u0002\u0002\u02c0\u02c1\u0003\u0002\u0002\u0002\u02c1\u02c4\u0003\u0002\u0002\u0002\u02c2\u02c0\u0003\u0002\u0002\u0002\u02c3\u02b5\u0003\u0002\u0002\u0002\u02c3\u02bc\u0003\u0002\u0002\u0002\u02c4\u0063\u0003\u0002\u0002\u0002\u02c5\u02c7\u0005\u0086\u0044\u0002\u02c6\u02c5\u0003\u0002\u0002\u0002\u02c6\u02c7\u0003\u0002\u0002\u0002\u02c7\u02c8\u0003\u0002\u0002\u0002\u02c8\u02ca\u0005\u0052\u002a\u0002\u02c9\u02cb\u0005\u002e\u0018\u0002\u02ca\u02c9\u0003\u0002\u0002\u0002\u02ca\u02cb\u0003\u0002\u0002\u0002\u02cb\u02cd\u0003\u0002\u0002\u0002\u02cc\u02ce\u0005\u0046\u0024\u0002\u02cd\u02cc\u0003\u0002\u0002\u0002\u02cd\u02ce\u0003\u0002\u0002\u0002\u02ce\u02cf\u0003\u0002\u0002\u0002\u02cf\u02d0\u0005\u0072\u003a\u0002\u02d0\u02d1\u0007\u0024\u0002\u0002\u02d1\u02d2\u0005\u0038\u001d\u0002\u02d2\u0065\u0003\u0002\u0002\u0002\u02d3\u02d5\u0005\u0086\u0044\u0002\u02d4\u02d3\u0003\u0002\u0002\u0002\u02d4\u02d5\u0003\u0002\u0002\u0002\u02d5\u02d6\u0003\u0002\u0002\u0002\u02d6\u02d8\u0005\u0052\u002a\u0002\u02d7\u02d9\u0005\u002e\u0018\u0002\u02d8\u02d7\u0003\u0002\u0002\u0002\u02d8\u02d9\u0003\u0002\u0002\u0002\u02d9\u02db\u0003\u0002\u0002\u0002\u02da\u02dc\u0005\u0046\u0024\u0002\u02db\u02da\u0003\u0002\u0002\u0002\u02db\u02dc\u0003\u0002\u0002\u0002\u02dc\u02dd\u0003\u0002\u0002\u0002\u02dd\u02de\u0007\u0009\u0002\u0002\u02de\u02e0\u0005\u0072\u003a\u0002\u02df\u02e1\u0005\u007c\u003f\u0002\u02e0\u02df\u0003\u0002\u0002\u0002\u02e0\u02e1\u0003\u0002\u0002\u0002\u02e1\u0067\u0003\u0002\u0002\u0002\u02e2\u02e4\u0007\u0011\u0002\u0002\u02e3\u02e5\u0007\u0037\u0002\u0002\u02e4\u02e3\u0003\u0002\u0002\u0002\u02e4\u02e5\u0003\u0002\u0002\u0002\u02e5\u02e6\u0003\u0002\u0002\u0002\u02e6\u02e8\u0007\u0027\u0002\u0002\u02e7\u02e9\u0005\u006a\u0036\u0002\u02e8\u02e7\u0003\u0002\u0002\u0002\u02e9\u02ea\u0003\u0002\u0002\u0002\u02ea\u02e8\u0003\u0002\u0002\u0002\u02ea\u02eb\u0003\u0002\u0002\u0002\u02eb\u02ec\u0003\u0002\u0002\u0002\u02ec\u02ed\u0007\u0028\u0002\u0002\u02ed\u0069\u0003\u0002\u0002\u0002\u02ee\u02f1\u0005\u0038\u001d\u0002\u02ef\u02f0\u0007\u002e\u0002\u0002\u02f0\u02f2\u0005\u0072\u003a\u0002\u02f1\u02ef\u0003\u0002\u0002\u0002\u02f1\u02f2\u0003\u0002\u0002\u0002\u02f2\u02f6\u0003\u0002\u0002\u0002\u02f3\u02f4\u0007\u002f\u0002\u0002\u02f4\u02f6\u0007\u0037\u0002\u0002\u02f5\u02ee\u0003\u0002\u0002\u0002\u02f5\u02f3\u0003\u0002\u0002\u0002\u02f6\u006b\u0003\u0002\u0002\u0002\u02f7\u02f8\u0007\u0029\u0002\u0002\u02f8\u02f9\u0005\u006e\u0038\u0002\u02f9\u02fa\u0007\u002a\u0002\u0002\u02fa\u02fb\u0005\u0038\u001d\u0002\u02fb\u006d\u0003\u0002\u0002\u0002\u02fc\u02fe\u0005\u0042\u0022\u0002\u02fd\u02fc\u0003\u0002\u0002\u0002\u02fe\u0301\u0003\u0002\u0002\u0002\u02ff\u02fd\u0003\u0002\u0002\u0002\u02ff\u0300\u0003\u0002\u0002\u0002\u0300\u0303\u0003\u0002\u0002\u0002\u0301\u02ff\u0003\u0002\u0002\u0002\u0302\u0304\u0005\u0070\u0039\u0002\u0303\u0302\u0003\u0002\u0002\u0002\u0303\u0304\u0003\u0002\u0002\u0002\u0304\u006f\u0003\u0002\u0002\u0002\u0305\u0307\u0007\u0012\u0002\u0002\u0306\u0308\u0005\u0044\u0023\u0002\u0307\u0306\u0003\u0002\u0002\u0002\u0308\u0309\u0003\u0002\u0002\u0002\u0309\u0307\u0003\u0002\u0002\u0002\u0309\u030a\u0003\u0002\u0002\u0002\u030a\u0071\u0003\u0002\u0002\u0002\u030b\u030d\u0007\u0036\u0002\u0002\u030c\u030b\u0003\u0002\u0002\u0002\u030c\u030d\u0003\u0002\u0002\u0002\u030d\u030e\u0003\u0002\u0002\u0002\u030e\u0314\u0005\u007a\u003e\u0002\u030f\u0311\u0007\u0036\u0002\u0002\u0310\u030f\u0003\u0002\u0002\u0002\u0310\u0311\u0003\u0002\u0002\u0002\u0311\u0312\u0003\u0002\u0002\u0002\u0312\u0314\u0005\u0074\u003b\u0002\u0313\u030c\u0003\u0002\u0002\u0002\u0313\u0310\u0003\u0002\u0002\u0002\u0314\u0073\u0003\u0002\u0002\u0002\u0315\u0316\u0005\u0014\u000b\u0002\u0316\u0317\u0007\u0026\u0002\u0002\u0317\u0319\u0003\u0002\u0002\u0002\u0318\u0315\u0003\u0002\u0002\u0002\u0318\u0319\u0003\u0002\u0002\u0002\u0319\u031e\u0003\u0002\u0002\u0002\u031a\u031f\u0007\u0037\u0002\u0002\u031b\u031c\u0007\u0033\u0002\u0002\u031c\u031d\u0007\u0037\u0002\u0002\u031d\u031f\u0007\u0033\u0002\u0002\u031e\u031a\u0003\u0002\u0002\u0002\u031e\u031b\u0003\u0002\u0002\u0002\u031f\u0328\u0003\u0002\u0002\u0002\u0320\u0322\u0007\u0027\u0002\u0002\u0321\u0323\u0005\u0072\u003a\u0002\u0322\u0321\u0003\u0002\u0002\u0002\u0323\u0324\u0003\u0002\u0002\u0002\u0324\u0322\u0003\u0002\u0002\u0002\u0324\u0325\u0003\u0002\u0002\u0002\u0325\u0326\u0003\u0002\u0002\u0002\u0326\u0327\u0007\u0028\u0002\u0002\u0327\u0329\u0003\u0002\u0002\u0002\u0328\u0320\u0003\u0002\u0002\u0002\u0328\u0329\u0003\u0002\u0002\u0002\u0329\u032c\u0003\u0002\u0002\u0002\u032a\u032c\u0005\u0076\u003c\u0002\u032b\u0318\u0003\u0002\u0002\u0002\u032b\u032a\u0003\u0002\u0002\u0002\u032c\u0075\u0003\u0002\u0002\u0002\u032d\u033c\u0007\u0017\u0002\u0002\u032e\u033c\u0007\u0018\u0002\u0002\u032f\u033c\u0007\u001c\u0002\u0002\u0330\u033c\u0007\u001d\u0002\u0002\u0331\u033c\u0007\u001b\u0002\u0002\u0332\u033c\u0007\u001a\u0002\u0002\u0333\u033c\u0007\u0019\u0002\u0002\u0334\u033c\u0007\u001e\u0002\u0002\u0335\u033c\u0007\u001f\u0002\u0002\u0336\u0337\u0007\u0020\u0002\u0002\u0337\u0338\u0007\u0027\u0002\u0002\u0338\u0339\u0005\u0072\u003a\u0002\u0339\u033a\u0007\u0028\u0002\u0002\u033a\u033c\u0003\u0002\u0002\u0002\u033b\u032d\u0003\u0002\u0002\u0002\u033b\u032e\u0003\u0002\u0002\u0002\u033b\u032f\u0003\u0002\u0002\u0002\u033b\u0330\u0003\u0002\u0002\u0002\u033b\u0331\u0003\u0002\u0002\u0002\u033b\u0332\u0003\u0002\u0002\u0002\u033b\u0333\u0003\u0002\u0002\u0002\u033b\u0334\u0003\u0002\u0002\u0002\u033b\u0335\u0003\u0002\u0002\u0002\u033b\u0336\u0003\u0002\u0002\u0002\u033c\u0077\u0003\u0002\u0002\u0002\u033d\u033f\u0005\u0072\u003a\u0002\u033e\u0340\u0007\u0025\u0002\u0002\u033f\u033e\u0003\u0002\u0002\u0002\u033f\u0340\u0003\u0002\u0002\u0002\u0340\u0079\u0003\u0002\u0002\u0002\u0341\u0345\u0007\u0027\u0002\u0002\u0342\u0344\u0005\u0078\u003d\u0002\u0343\u0342\u0003\u0002\u0002\u0002\u0344\u0347\u0003\u0002\u0002\u0002\u0345\u0343\u0003\u0002\u0002\u0002\u0345\u0346\u0003\u0002\u0002\u0002\u0346\u0348\u0003\u0002\u0002\u0002\u0347\u0345\u0003\u0002\u0002\u0002\u0348\u0349\u0007\u0028\u0002\u0002\u0349\u034a\u0007\u002d\u0002\u0002\u034a\u034b\u0005\u0072\u003a\u0002\u034b\u007b\u0003\u0002\u0002\u0002\u034c\u0350\u0007\u002b\u0002\u0002\u034d\u034f\u0005\u007e\u0040\u0002\u034e\u034d\u0003\u0002\u0002\u0002\u034f\u0352\u0003\u0002\u0002\u0002\u0350\u034e\u0003\u0002\u0002\u0002\u0350\u0351\u0003\u0002\u0002\u0002\u0351\u0353\u0003\u0002\u0002\u0002\u0352\u0350\u0003\u0002\u0002\u0002\u0353\u0356\u0007\u002c\u0002\u0002\u0354\u0356\u0007\u003c\u0002\u0002\u0355\u034c\u0003\u0002\u0002\u0002\u0355\u0354\u0003\u0002\u0002\u0002\u0356\u007d\u0003\u0002\u0002\u0002\u0357\u0358\u0005\u0080\u0041\u0002\u0358\u0359\u0007\u003c\u0002\u0002\u0359\u007f\u0003\u0002\u0002\u0002\u035a\u035b\u0007\u0037\u0002\u0002\u035b\u0081\u0003\u0002\u0002\u0002\u035c\u035d\u0007\u0006\u0002\u0002\u035d\u035e\u0007\u0037\u0002\u0002\u035e\u035f\u0005\u0046\u0024\u0002\u035f\u0083\u0003\u0002\u0002\u0002\u0360\u0361\u0005\u0014\u000b\u0002\u0361\u0362\u0007\u0026\u0002\u0002\u0362\u0364\u0003\u0002\u0002\u0002\u0363\u0360\u0003\u0002\u0002\u0002\u0363\u0364\u0003\u0002\u0002\u0002\u0364\u0365\u0003\u0002\u0002\u0002\u0365\u0367\u0007\u0037\u0002\u0002\u0366\u0368\u0005\u004e\u0028\u0002\u0367\u0366\u0003\u0002\u0002\u0002\u0367\u0368\u0003\u0002\u0002\u0002\u0368\u0085\u0003\u0002\u0002\u0002\u0369\u036d\u0007\u0029\u0002\u0002\u036a\u036c\u0005\u0084\u0043\u0002\u036b\u036a\u0003\u0002\u0002\u0002\u036c\u036f\u0003\u0002\u0002\u0002\u036d\u036b\u0003\u0002\u0002\u0002\u036d\u036e\u0003\u0002\u0002\u0002\u036e\u0370\u0003\u0002\u0002\u0002\u036f\u036d\u0003\u0002\u0002\u0002\u0370\u0371\u0007\u002a\u0002\u0002\u0371\u0087\u0003\u0002\u0002\u0002\u0079\u0089\u008e\u0093\u0095\u009b\u00a0\u00a3\u00a6\u00ac\u00b4\u00b8\u00be\u00c6\u00c8\u00db\u00e6\u00ee\u00fd\u0100\u0105\u010b\u010f\u0115\u011a\u011f\u0127\u012e\u0132\u0137\u013d\u0142\u0146\u014c\u0152\u0156\u015a\u015f\u0163\u0167\u016a\u016d\u0170\u0173\u0177\u017a\u0180\u0187\u018e\u0196\u019d\u01a2\u01a8\u01b5\u01ba\u01c4\u01cb\u01cf\u01d4\u01e3\u01f8\u0201\u0205\u0207\u020d\u0226\u022c\u0236\u023a\u0241\u024c\u0251\u0257\u025b\u0261\u0265\u026a\u0272\u0276\u027b\u027f\u0286\u028e\u029f\u02a5\u02ad\u02b0\u02b9\u02c0\u02c3\u02c6\u02ca\u02cd\u02d4\u02d8\u02db\u02e0\u02e4\u02ea\u02f1\u02f5\u02ff\u0303\u0309\u030c\u0310\u0313\u0318\u031e\u0324\u0328\u032b\u033b\u033f\u0345\u0350\u0355\u0363\u0367\u036d"

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
    private val ANNOTATION = Tokens.ANNOTATION.id
    private val CLASS = Tokens.CLASS.id
    private val DO = Tokens.DO.id
    private val FOREIGN = Tokens.FOREIGN.id
    private val NAMESPACE = Tokens.NAMESPACE.id
    private val INTERNAL = Tokens.INTERNAL.id
    private val IMPORT = Tokens.IMPORT.id
    private val IMPL = Tokens.IMPL.id
    private val INHERIT = Tokens.INHERIT.id
    private val RETURN = Tokens.RETURN.id
    private val MUTABLE = Tokens.MUTABLE.id
    private val INVERSE = Tokens.INVERSE.id
    private val FROM = Tokens.FROM.id
    private val IF = Tokens.IF.id
    private val ELSE = Tokens.ELSE.id
    private val NEW = Tokens.NEW.id
    private val LET = Tokens.LET.id
    private val INT = Tokens.INT.id
    private val LONG = Tokens.LONG.id
    private val DOUBLE = Tokens.DOUBLE.id
    private val FLOAT = Tokens.FLOAT.id
    private val BYTE = Tokens.BYTE.id
    private val CHAR = Tokens.CHAR.id
    private val STRING = Tokens.STRING.id
    private val BOOLEAN = Tokens.BOOLEAN.id
    private val UNIT = Tokens.UNIT.id
    private val ARRAY = Tokens.ARRAY.id
    private val NULL = Tokens.NULL.id
    private val TRUE = Tokens.TRUE.id
    private val FALSE = Tokens.FALSE.id
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
    private val As = Tokens.As.id
    private val COLON = Tokens.COLON.id
    private val DOUBLECOLON = Tokens.DOUBLECOLON.id
    private val COLONSHARP = Tokens.COLONSHARP.id
    private val QUOTE = Tokens.QUOTE.id
    private val COLONQUOTE = Tokens.COLONQUOTE.id
    private val SHARP = Tokens.SHARP.id
    private val QM = Tokens.QM.id
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
		fun findFileCompo() : List<FileCompoContext> = getRuleContexts(solver.getType("FileCompoContext"))
		fun findFileCompo(i: Int) : FileCompoContext? = getRuleContext(solver.getType("FileCompoContext"),i)
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
			this.state = 135
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAMESPACE) {
				if (true){
				this.state = 134
				namespace()
				}
			}

			this.state = 140
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPORT) {
				if (true){
				if (true){
				this.state = 137
				importEx()
				}
				}
				this.state = 142
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 147
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ANNOTATION) or (1L shl CLASS) or (1L shl LSQUARE) or (1L shl SHARP) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 145
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				CLASS , LSQUARE , SHARP , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 143
				fileCompo()
				}}
				ANNOTATION  ->  /*LL1AltBlock*/{if (true){
				this.state = 144
				annotationDef()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 149
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

	open class FileCompoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fileCompo.id
	        set(value) { throw RuntimeException() }
		fun findDefinition() : DefinitionContext? = getRuleContext(solver.getType("DefinitionContext"),0)
		fun SHARP() : TerminalNode? = getToken(FoldingParser.Tokens.SHARP.id, 0)
		fun findField() : FieldContext? = getRuleContext(solver.getType("FieldContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  fileCompo() : FileCompoContext {
		var _localctx : FileCompoContext = FileCompoContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_fileCompo.id)
		try {
			this.state = 153
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			CLASS , LSQUARE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 150
			definition()
			}}
			SHARP  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 151
			match(SHARP) as Token
			this.state = 152
			field()
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

	open class ImportExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importEx.id
	        set(value) { throw RuntimeException() }
		fun IMPORT() : TerminalNode? = getToken(FoldingParser.Tokens.IMPORT.id, 0)
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun findImportNest() : ImportNestContext? = getRuleContext(solver.getType("ImportNestContext"),0)
		fun findImportPath() : ImportPathContext? = getRuleContext(solver.getType("ImportPathContext"),0)
		fun findImportBody() : ImportBodyContext? = getRuleContext(solver.getType("ImportBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importEx() : ImportExContext {
		var _localctx : ImportExContext = ImportExContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_importEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 155
			match(IMPORT) as Token
			this.state = 156
			package_()
			this.state = 158
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1   -> if (true){
			this.state = 157
			importNest()
			}
			}
			this.state = 161
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 160
				importPath()
				}
			}

			this.state = 164
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 163
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
		fun findImportCompo() : List<ImportCompoContext> = getRuleContexts(solver.getType("ImportCompoContext"))
		fun findImportCompo(i: Int) : ImportCompoContext? = getRuleContext(solver.getType("ImportCompoContext"),i)
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
			this.state = 166
			match(LBRACE) as Token
			this.state = 170
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==CLASS || _la==ID) {
				if (true){
				if (true){
				this.state = 167
				importCompo()
				}
				}
				this.state = 172
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 173
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

	open class ImportCompoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importCompo.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun SHARP() : TerminalNode? = getToken(FoldingParser.Tokens.SHARP.id, 0)
		fun findImportAlias() : ImportAliasContext? = getRuleContext(solver.getType("ImportAliasContext"),0)
		fun As() : TerminalNode? = getToken(FoldingParser.Tokens.As.id, 0)
		fun findImportType() : ImportTypeContext? = getRuleContext(solver.getType("ImportTypeContext"),0)
		fun CLASS() : TerminalNode? = getToken(FoldingParser.Tokens.CLASS.id, 0)
		fun QUOTE() : List<TerminalNode> = getTokens(FoldingParser.Tokens.QUOTE.id)
		fun QUOTE(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.QUOTE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importCompo() : ImportCompoContext {
		var _localctx : ImportCompoContext = ImportCompoContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_importCompo.id)
		var _la: Int
		try {
			this.state = 198
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,13,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 175
			match(ID) as Token
			this.state = 178
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 176
				match(SHARP) as Token
				this.state = 177
				importAlias()
				}
			}

			this.state = 182
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==As) {
				if (true){
				this.state = 180
				match(As) as Token
				this.state = 181
				importType()
				}
			}

			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 184
			match(CLASS) as Token
			this.state = 185
			match(ID) as Token
			this.state = 188
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 186
				match(SHARP) as Token
				this.state = 187
				importAlias()
				}
			}

			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 190
			match(CLASS) as Token
			this.state = 191
			match(QUOTE) as Token
			this.state = 192
			match(ID) as Token
			this.state = 193
			match(QUOTE) as Token
			this.state = 196
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 194
				match(SHARP) as Token
				this.state = 195
				importAlias()
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

	open class ImportAliasContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importAlias.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importAlias() : ImportAliasContext {
		var _localctx : ImportAliasContext = ImportAliasContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_importAlias.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 200
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

	open class ImportTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importType.id
	        set(value) { throw RuntimeException() }
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importType() : ImportTypeContext {
		var _localctx : ImportTypeContext = ImportTypeContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_importType.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 202
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

	open class ImportPathContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importPath.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun FROM() : TerminalNode? = getToken(FoldingParser.Tokens.FROM.id, 0)
		fun RawString() : TerminalNode? = getToken(FoldingParser.Tokens.RawString.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importPath() : ImportPathContext {
		var _localctx : ImportPathContext = ImportPathContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_importPath.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 204
			match(LPAREN) as Token
			this.state = 205
			match(FROM) as Token
			this.state = 206
			match(RawString) as Token
			this.state = 207
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

	open class ImportNestContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importNest.id
	        set(value) { throw RuntimeException() }
		fun SHARP() : TerminalNode? = getToken(FoldingParser.Tokens.SHARP.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importNest() : ImportNestContext {
		var _localctx : ImportNestContext = ImportNestContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_importNest.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 209
			match(SHARP) as Token
			this.state = 210
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
		enterRule(_localctx, 18, Rules.RULE_package_.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 212
			match(ID) as Token
			this.state = 217
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,14,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 213
					match(DOT) as Token
					this.state = 214
					match(ID) as Token
					}
					} 
				}
				this.state = 219
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,14,context)
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
		enterRule(_localctx, 20, Rules.RULE_namespace.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 220
			match(NAMESPACE) as Token
			this.state = 221
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
		enterRule(_localctx, 22, Rules.RULE_doBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 223
			match(DO) as Token
			this.state = 224
			match(LBRACE) as Token
			this.state = 228
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl RETURN) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl NULL) or (1L shl TRUE) or (1L shl FALSE) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 225
				compo()
				}
				}
				this.state = 230
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 231
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
		enterRule(_localctx, 24, Rules.RULE_compo.id)
		try {
			this.state = 236
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,16,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 233
			fieldAssign()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 234
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 235
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
		enterRule(_localctx, 26, Rules.RULE_returning.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 238
			match(RETURN) as Token
			this.state = 239
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: FieldAssignContext) {
			super.copyFrom(ctx)
		}
	}
	open class ObjectFieldAssignContext : FieldAssignContext {
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun COLONSHARP() : TerminalNode? = getToken(FoldingParser.Tokens.COLONSHARP.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		constructor(ctx: FieldAssignContext) { copyFrom(ctx) }
	}
	open class GlobalFieldAssignContext : FieldAssignContext {
		fun SHARP() : TerminalNode? = getToken(FoldingParser.Tokens.SHARP.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(ctx: FieldAssignContext) { copyFrom(ctx) }
	}

	fun  fieldAssign() : FieldAssignContext {
		var _localctx : FieldAssignContext = FieldAssignContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_fieldAssign.id)
		try {
			this.state = 251
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,17,context) ) {
			1 -> {_localctx = GlobalFieldAssignContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 241
			match(SHARP) as Token
			this.state = 242
			match(ID) as Token
			this.state = 243
			match(ASSGIN) as Token
			this.state = 244
			value(0)
			}}
			2 -> {_localctx = ObjectFieldAssignContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 245
			value(0)
			this.state = 246
			match(COLONSHARP) as Token
			this.state = 247
			match(ID) as Token
			this.state = 248
			match(ASSGIN) as Token
			this.state = 249
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

	open class Class_Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_class_.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: Class_Context) {
			super.copyFrom(ctx)
		}
	}
	open class JustInterfaceContext : Class_Context {
		fun CLASS() : TerminalNode? = getToken(FoldingParser.Tokens.CLASS.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun COLON() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLON.id)
		fun COLON(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLON.id, i) as TerminalNode
		fun findImpl() : List<ImplContext> = getRuleContexts(solver.getType("ImplContext"))
		fun findImpl(i: Int) : ImplContext? = getRuleContext(solver.getType("ImplContext"),i)
		fun findDefInInterface() : List<DefInInterfaceContext> = getRuleContexts(solver.getType("DefInInterfaceContext"))
		fun findDefInInterface(i: Int) : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),i)
		fun findDef() : List<DefContext> = getRuleContexts(solver.getType("DefContext"))
		fun findDef(i: Int) : DefContext? = getRuleContext(solver.getType("DefContext"),i)
		constructor(ctx: Class_Context) { copyFrom(ctx) }
	}
	open class JustAbstractClassContext : Class_Context {
		fun CLASS() : TerminalNode? = getToken(FoldingParser.Tokens.CLASS.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findConstructorSelf() : ConstructorSelfContext? = getRuleContext(solver.getType("ConstructorSelfContext"),0)
		fun COLONSHARP() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLONSHARP.id)
		fun COLONSHARP(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLONSHARP.id, i) as TerminalNode
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		fun COLON() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLON.id)
		fun COLON(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLON.id, i) as TerminalNode
		fun findInherit() : InheritContext? = getRuleContext(solver.getType("InheritContext"),0)
		fun findImpl() : List<ImplContext> = getRuleContexts(solver.getType("ImplContext"))
		fun findImpl(i: Int) : ImplContext? = getRuleContext(solver.getType("ImplContext"),i)
		fun findDefInInterface() : List<DefInInterfaceContext> = getRuleContexts(solver.getType("DefInInterfaceContext"))
		fun findDefInInterface(i: Int) : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),i)
		fun findDef() : List<DefContext> = getRuleContexts(solver.getType("DefContext"))
		fun findDef(i: Int) : DefContext? = getRuleContext(solver.getType("DefContext"),i)
		constructor(ctx: Class_Context) { copyFrom(ctx) }
	}
	open class JustClassContext : Class_Context {
		fun CLASS() : TerminalNode? = getToken(FoldingParser.Tokens.CLASS.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun findConstructorSelf() : ConstructorSelfContext? = getRuleContext(solver.getType("ConstructorSelfContext"),0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun COLONSHARP() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLONSHARP.id)
		fun COLONSHARP(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLONSHARP.id, i) as TerminalNode
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		fun COLON() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLON.id)
		fun COLON(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLON.id, i) as TerminalNode
		fun findDef() : List<DefContext> = getRuleContexts(solver.getType("DefContext"))
		fun findDef(i: Int) : DefContext? = getRuleContext(solver.getType("DefContext"),i)
		fun findInherit() : InheritContext? = getRuleContext(solver.getType("InheritContext"),0)
		fun findImpl() : List<ImplContext> = getRuleContexts(solver.getType("ImplContext"))
		fun findImpl(i: Int) : ImplContext? = getRuleContext(solver.getType("ImplContext"),i)
		constructor(ctx: Class_Context) { copyFrom(ctx) }
	}

	fun  class_() : Class_Context {
		var _localctx : Class_Context = Class_Context(context, state)
		enterRule(_localctx, 30, Rules.RULE_class_.id)
		var _la: Int
		try {
			this.state = 353
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,37,context) ) {
			1 -> {_localctx = JustInterfaceContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 254
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 253
				annotationBlock()
				}
			}

			this.state = 256
			match(CLASS) as Token
			this.state = 257
			match(ID) as Token
			this.state = 259
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 258
				typeParam()
				}
			}

			this.state = 261
			match(LBRACE) as Token
			this.state = 269
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 262
				match(COLON) as Token
				this.state = 265
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,20,context) ) {
				1 -> {if (true){
				this.state = 263
				defInInterface()
				}}
				2 -> {if (true){
				this.state = 264
				def()
				}}
				}
				}
				}
				this.state = 271
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 275
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 272
				impl()
				}
				}
				this.state = 277
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 278
			match(RBRACE) as Token
			}}
			2 -> {_localctx = JustClassContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 280
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 279
				annotationBlock()
				}
			}

			this.state = 282
			match(CLASS) as Token
			this.state = 283
			match(ID) as Token
			this.state = 285
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 284
				typeParam()
				}
			}

			this.state = 287
			match(LBRACE) as Token
			this.state = 288
			constructorSelf()
			this.state = 293
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 289
				match(COLONSHARP) as Token
				this.state = 290
				field()
				}
				}
				this.state = 295
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 300
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 296
				match(COLON) as Token
				this.state = 297
				def()
				}
				}
				this.state = 302
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 304
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INHERIT) {
				if (true){
				this.state = 303
				inherit()
				}
			}

			this.state = 309
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 306
				impl()
				}
				}
				this.state = 311
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 312
			match(RBRACE) as Token
			}}
			3 -> {_localctx = JustAbstractClassContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 315
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 314
				annotationBlock()
				}
			}

			this.state = 317
			match(CLASS) as Token
			this.state = 318
			match(ID) as Token
			this.state = 320
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 319
				typeParam()
				}
			}

			this.state = 322
			match(LBRACE) as Token
			this.state = 324
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,31,context) ) {
			1   -> if (true){
			this.state = 323
			constructorSelf()
			}
			}
			this.state = 330
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 326
				match(COLONSHARP) as Token
				this.state = 327
				field()
				}
				}
				this.state = 332
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 340
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 333
				match(COLON) as Token
				this.state = 336
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,33,context) ) {
				1 -> {if (true){
				this.state = 334
				defInInterface()
				}}
				2 -> {if (true){
				this.state = 335
				def()
				}}
				}
				}
				}
				this.state = 342
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 344
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INHERIT) {
				if (true){
				this.state = 343
				inherit()
				}
			}

			this.state = 349
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 346
				impl()
				}
				}
				this.state = 351
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 352
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
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findDoBlock() : DoBlockContext? = getRuleContext(solver.getType("DoBlockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  constructor_() : Constructor_Context {
		var _localctx : Constructor_Context = Constructor_Context(context, state)
		enterRule(_localctx, 32, Rules.RULE_constructor_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 355
			match(ID) as Token
			this.state = 357
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 356
				parameter()
				}
			}

			this.state = 360
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 359
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
		enterRule(_localctx, 34, Rules.RULE_constructorSelf.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 363
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 362
				parameter()
				}
			}

			this.state = 366
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 365
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
		fun findCommonIdentifier() : CommonIdentifierContext? = getRuleContext(solver.getType("CommonIdentifierContext"),0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defInInterface() : DefInInterfaceContext {
		var _localctx : DefInInterfaceContext = DefInInterfaceContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_defInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 369
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,42,context) ) {
			1   -> if (true){
			this.state = 368
			annotationBlock()
			}
			}
			this.state = 371
			commonIdentifier()
			this.state = 373
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,43,context) ) {
			1   -> if (true){
			this.state = 372
			typeParam()
			}
			}
			this.state = 376
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,44,context) ) {
			1   -> if (true){
			this.state = 375
			parameter()
			}
			}
			this.state = 378
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

	open class InheritContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_inherit.id
	        set(value) { throw RuntimeException() }
		fun INHERIT() : TerminalNode? = getToken(FoldingParser.Tokens.INHERIT.id, 0)
		fun findImpl() : ImplContext? = getRuleContext(solver.getType("ImplContext"),0)
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  inherit() : InheritContext {
		var _localctx : InheritContext = InheritContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_inherit.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 380
			match(INHERIT) as Token
			this.state = 382
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==LBRACE) {
				if (true){
				this.state = 381
				argValue()
				}
			}

			this.state = 384
			impl()
			}
		}
		catch (re: RecognitionException) {
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  impl() : ImplContext {
		var _localctx : ImplContext = ImplContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_impl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 386
			match(IMPL) as Token
			this.state = 387
			typeEx()
			this.state = 389
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 388
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
		fun COLON() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLON.id)
		fun COLON(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLON.id, i) as TerminalNode
		fun findDef() : List<DefContext> = getRuleContexts(solver.getType("DefContext"))
		fun findDef(i: Int) : DefContext? = getRuleContext(solver.getType("DefContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  implBody() : ImplBodyContext {
		var _localctx : ImplBodyContext = ImplBodyContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_implBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 391
			match(LBRACE) as Token
			this.state = 396
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 392
				match(COLON) as Token
				this.state = 393
				def()
				}
				}
				this.state = 398
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 399
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
		enterRule(_localctx, 44, Rules.RULE_typeParam.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 402 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 401
				typeParamCompo()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 404 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,48,context)
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
		enterRule(_localctx, 46, Rules.RULE_typeParamCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 406
			match(ID) as Token
			this.state = 411
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TILDE) {
				if (true){
				if (true){
				this.state = 407
				match(TILDE) as Token
				this.state = 408
				typeEx()
				}
				}
				this.state = 413
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
		enterRule(_localctx, 48, Rules.RULE_definition.id)
		try {
			this.state = 416
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,50,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 414
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 415
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

	open class DefaultValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_defaultValue.id
	        set(value) { throw RuntimeException() }
		fun Integer() : TerminalNode? = getToken(FoldingParser.Tokens.Integer.id, 0)
		fun Double() : TerminalNode? = getToken(FoldingParser.Tokens.Double.id, 0)
		fun String() : TerminalNode? = getToken(FoldingParser.Tokens.String.id, 0)
		fun findBoolean() : BooleanContext? = getRuleContext(solver.getType("BooleanContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defaultValue() : DefaultValueContext {
		var _localctx : DefaultValueContext = DefaultValueContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_defaultValue.id)
		try {
			this.state = 422
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Integer  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 418
			match(Integer) as Token
			}}
			Double  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 419
			match(Double) as Token
			}}
			String  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 420
			match(String) as Token
			}}
			TRUE , FALSE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 421
			boolean()
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

	open class BooleanContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_boolean.id
	        set(value) { throw RuntimeException() }
		fun TRUE() : TerminalNode? = getToken(FoldingParser.Tokens.TRUE.id, 0)
		fun FALSE() : TerminalNode? = getToken(FoldingParser.Tokens.FALSE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  boolean() : BooleanContext {
		var _localctx : BooleanContext = BooleanContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_boolean.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 424
			_la = _input!!.LA(1)
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	open class ValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_value.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: ValueContext) {
			super.copyFrom(ctx)
		}
	}
	open class CallMethodContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun COLON() : TerminalNode? = getToken(FoldingParser.Tokens.COLON.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class TakeNullContext : ValueContext {
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun QM() : TerminalNode? = getToken(FoldingParser.Tokens.QM.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class OutputOfInversingContext : ValueContext {
		fun ARROW() : TerminalNode? = getToken(FoldingParser.Tokens.ARROW.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun QM() : TerminalNode? = getToken(FoldingParser.Tokens.QM.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class CallAopFuncContext : ValueContext {
		fun findCallingAopId() : CallingAopIdContext? = getRuleContext(solver.getType("CallingAopIdContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class GetFieldContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun COLONSHARP() : TerminalNode? = getToken(FoldingParser.Tokens.COLONSHARP.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class ReflectedContext : ValueContext {
		fun QUOTE() : TerminalNode? = getToken(FoldingParser.Tokens.QUOTE.id, 0)
		fun findReference() : ReferenceContext? = getRuleContext(solver.getType("ReferenceContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class CallFunctionContext : ValueContext {
		fun findReference() : ReferenceContext? = getRuleContext(solver.getType("ReferenceContext"),0)
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class CallFunctionLikeMethodContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun DOUBLECOLON() : TerminalNode? = getToken(FoldingParser.Tokens.DOUBLECOLON.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class UseForeignClassContext : ValueContext {
		fun NEW() : TerminalNode? = getToken(FoldingParser.Tokens.NEW.id, 0)
		fun findReference() : ReferenceContext? = getRuleContext(solver.getType("ReferenceContext"),0)
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class CallOpFuncContext : ValueContext {
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun findCallingOpId() : CallingOpIdContext? = getRuleContext(solver.getType("CallingOpIdContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class ReflectedMethodContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun COLONQUOTE() : TerminalNode? = getToken(FoldingParser.Tokens.COLONQUOTE.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class JustLambdaContext : ValueContext {
		fun findLambda() : LambdaContext? = getRuleContext(solver.getType("LambdaContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class ParenedValueContext : ValueContext {
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class JustDefaultValueContext : ValueContext {
		fun findDefaultValue() : DefaultValueContext? = getRuleContext(solver.getType("DefaultValueContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class NullContext : ValueContext {
		fun NULL() : TerminalNode? = getToken(FoldingParser.Tokens.NULL.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class AnonymousClassObjectContext : ValueContext {
		fun NEW() : TerminalNode? = getToken(FoldingParser.Tokens.NEW.id, 0)
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun COLONSHARP() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLONSHARP.id)
		fun COLONSHARP(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLONSHARP.id, i) as TerminalNode
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		fun COLON() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLON.id)
		fun COLON(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLON.id, i) as TerminalNode
		fun findDef() : List<DefContext> = getRuleContexts(solver.getType("DefContext"))
		fun findDef(i: Int) : DefContext? = getRuleContext(solver.getType("DefContext"),i)
		fun findInherit() : InheritContext? = getRuleContext(solver.getType("InheritContext"),0)
		fun findImpl() : List<ImplContext> = getRuleContexts(solver.getType("ImplContext"))
		fun findImpl(i: Int) : ImplContext? = getRuleContext(solver.getType("ImplContext"),i)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class GetFieldGlobalContext : ValueContext {
		fun SHARP() : TerminalNode? = getToken(FoldingParser.Tokens.SHARP.id, 0)
		fun findReference() : ReferenceContext? = getRuleContext(solver.getType("ReferenceContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class LetExpressionContext : ValueContext {
		fun findLet_binding() : Let_bindingContext? = getRuleContext(solver.getType("Let_bindingContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class DoExpressionContext : ValueContext {
		fun findDoBlock() : DoBlockContext? = getRuleContext(solver.getType("DoBlockContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class ValueTypeCastingContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findTypeCasting() : TypeCastingContext? = getRuleContext(solver.getType("TypeCastingContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class IfExpressionContext : ValueContext {
		fun findIf_else() : If_elseContext? = getRuleContext(solver.getType("If_elseContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class SimpleIfContext : ValueContext {
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun IF() : TerminalNode? = getToken(FoldingParser.Tokens.IF.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class InvokeValueContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findInvoking() : InvokingContext? = getRuleContext(solver.getType("InvokingContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}

	 fun value() : ValueContext {
		return value(0);
	}

	private fun value(_p: Int) : ValueContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : ValueContext= ValueContext(context, _parentState)
		var _prevctx : ValueContext= _localctx
		var _startState : Int = 54
		enterRecursionRule(_localctx, 54, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 481
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,58,context) ) {
			1 -> {if (true){
			_localctx = JustDefaultValueContext(_localctx)
			context = _localctx
			_prevctx = _localctx

			this.state = 427
			defaultValue()
			}}
			2 -> {if (true){
			_localctx = NullContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 428
			match(NULL) as Token
			}}
			3 -> {if (true){
			_localctx = OutputOfInversingContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 429
			match(ARROW) as Token
			this.state = 430
			_la = _input!!.LA(1)
			if ( !(_la==QM || _la==ID) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}}
			4 -> {if (true){
			_localctx = ReflectedContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 431
			match(QUOTE) as Token
			this.state = 432
			reference()
			}}
			5 -> {if (true){
			_localctx = CallFunctionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 433
			reference()
			this.state = 435
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,52,context) ) {
			1   -> if (true){
			this.state = 434
			argValue()
			}
			}
			}}
			6 -> {if (true){
			_localctx = UseForeignClassContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 437
			match(NEW) as Token
			this.state = 438
			reference()
			this.state = 440
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,53,context) ) {
			1   -> if (true){
			this.state = 439
			argValue()
			}
			}
			}}
			7 -> {if (true){
			_localctx = GetFieldGlobalContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 442
			match(SHARP) as Token
			this.state = 443
			reference()
			}}
			8 -> {if (true){
			_localctx = AnonymousClassObjectContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 444
			match(NEW) as Token
			this.state = 445
			match(LBRACE) as Token
			this.state = 450
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 446
				match(COLONSHARP) as Token
				this.state = 447
				field()
				}
				}
				this.state = 452
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 457
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 453
				match(COLON) as Token
				this.state = 454
				def()
				}
				}
				this.state = 459
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 461
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INHERIT) {
				if (true){
				this.state = 460
				inherit()
				}
			}

			this.state = 466
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 463
				impl()
				}
				}
				this.state = 468
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 469
			match(RBRACE) as Token
			}}
			9 -> {if (true){
			_localctx = CallAopFuncContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 470
			callingAopId()
			this.state = 471
			value(7)
			}}
			10 -> {if (true){
			_localctx = IfExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 473
			if_else()
			}}
			11 -> {if (true){
			_localctx = LetExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 474
			let_binding()
			}}
			12 -> {if (true){
			_localctx = DoExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 475
			doBlock()
			}}
			13 -> {if (true){
			_localctx = JustLambdaContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 476
			lambda()
			}}
			14 -> {if (true){
			_localctx = ParenedValueContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 477
			match(LPAREN) as Token
			this.state = 478
			value(0)
			this.state = 479
			match(RPAREN) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 517
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,62,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 515
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,61,context) ) {
					1 -> {if (true){
					_localctx = SimpleIfContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 483
					if (!(precpred(context!!, 9))) throw FailedPredicateException(this, "precpred(context!!, 9)")
					this.state = 484
					match(IF) as Token
					this.state = 485
					value(10)
					}}
					2 -> {if (true){
					_localctx = TakeNullContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 486
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 487
					match(QM) as Token
					this.state = 488
					value(9)
					}}
					3 -> {if (true){
					_localctx = CallOpFuncContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 489
					if (!(precpred(context!!, 6))) throw FailedPredicateException(this, "precpred(context!!, 6)")
					this.state = 490
					callingOpId()
					this.state = 491
					value(7)
					}}
					4 -> {if (true){
					_localctx = ValueTypeCastingContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 493
					if (!(precpred(context!!, 15))) throw FailedPredicateException(this, "precpred(context!!, 15)")
					this.state = 494
					typeCasting()
					}}
					5 -> {if (true){
					_localctx = GetFieldContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 495
					if (!(precpred(context!!, 14))) throw FailedPredicateException(this, "precpred(context!!, 14)")
					this.state = 496
					match(COLONSHARP) as Token
					this.state = 497
					match(ID) as Token
					}}
					6 -> {if (true){
					_localctx = CallMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 498
					if (!(precpred(context!!, 13))) throw FailedPredicateException(this, "precpred(context!!, 13)")
					this.state = 499
					match(COLON) as Token
					this.state = 500
					match(ID) as Token
					this.state = 502
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,59,context) ) {
					1   -> if (true){
					this.state = 501
					argValue()
					}
					}
					}}
					7 -> {if (true){
					_localctx = ReflectedMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 504
					if (!(precpred(context!!, 12))) throw FailedPredicateException(this, "precpred(context!!, 12)")
					this.state = 505
					match(COLONQUOTE) as Token
					this.state = 506
					match(ID) as Token
					}}
					8 -> {if (true){
					_localctx = CallFunctionLikeMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 507
					if (!(precpred(context!!, 11))) throw FailedPredicateException(this, "precpred(context!!, 11)")
					this.state = 508
					match(DOUBLECOLON) as Token
					this.state = 509
					match(ID) as Token
					this.state = 511
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,60,context) ) {
					1   -> if (true){
					this.state = 510
					argValue()
					}
					}
					}}
					9 -> {if (true){
					_localctx = InvokeValueContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 513
					if (!(precpred(context!!, 10))) throw FailedPredicateException(this, "precpred(context!!, 10)")
					this.state = 514
					invoking()
					}}
					}
					} 
				}
				this.state = 519
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,62,context)
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

	open class ReferenceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_reference.id
	        set(value) { throw RuntimeException() }
		fun findCommonIdentifier() : CommonIdentifierContext? = getRuleContext(solver.getType("CommonIdentifierContext"),0)
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun DOT() : TerminalNode? = getToken(FoldingParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  reference() : ReferenceContext {
		var _localctx : ReferenceContext = ReferenceContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_reference.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 523
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,63,context) ) {
			1   -> if (true){
			this.state = 520
			package_()
			this.state = 521
			match(DOT) as Token
			}
			}
			this.state = 525
			commonIdentifier()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TypeCastingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeCasting.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeCasting() : TypeCastingContext {
		var _localctx : TypeCastingContext = TypeCastingContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 527
			match(LPAREN) as Token
			this.state = 528
			match(TILDE) as Token
			this.state = 529
			typeEx()
			this.state = 530
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

	open class If_elseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_if_else.id
	        set(value) { throw RuntimeException() }
		fun IF() : TerminalNode? = getToken(FoldingParser.Tokens.IF.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun ELSE() : TerminalNode? = getToken(FoldingParser.Tokens.ELSE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  if_else() : If_elseContext {
		var _localctx : If_elseContext = If_elseContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_if_else.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 532
			match(IF) as Token
			this.state = 533
			match(LPAREN) as Token
			this.state = 534
			value(0)
			this.state = 535
			match(RPAREN) as Token
			this.state = 536
			value(0)
			this.state = 537
			match(ELSE) as Token
			this.state = 538
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

	open class Let_bindingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_let_binding.id
	        set(value) { throw RuntimeException() }
		fun LET() : TerminalNode? = getToken(FoldingParser.Tokens.LET.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  let_binding() : Let_bindingContext {
		var _localctx : Let_bindingContext = Let_bindingContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_let_binding.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 540
			match(LET) as Token
			this.state = 541
			value(0)
			this.state = 542
			match(ASSGIN) as Token
			this.state = 543
			value(0)
			this.state = 544
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
		enterRule(_localctx, 64, Rules.RULE_paramEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 546
			match(ID) as Token
			this.state = 548
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 547
				match(ELLIPSIS) as Token
				}
			}

			this.state = 550
			match(TILDE) as Token
			this.state = 551
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
		fun findSpecificAlias() : SpecificAliasContext? = getRuleContext(solver.getType("SpecificAliasContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramCEx() : ParamCExContext {
		var _localctx : ParamCExContext = ParamCExContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_paramCEx.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 554
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,65,context) ) {
			1   -> if (true){
			this.state = 553
			specificAlias()
			}
			}
			this.state = 556
			value(0)
			this.state = 557
			match(TILDE) as Token
			this.state = 558
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findParamEx() : List<ParamExContext> = getRuleContexts(solver.getType("ParamExContext"))
		fun findParamEx(i: Int) : ParamExContext? = getRuleContext(solver.getType("ParamExContext"),i)
		fun findParameterFromValue() : ParameterFromValueContext? = getRuleContext(solver.getType("ParameterFromValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parameter() : ParameterContext {
		var _localctx : ParameterContext = ParameterContext(context, state)
		enterRule(_localctx, 68, Rules.RULE_parameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 560
			match(LPAREN) as Token
			this.state = 562 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 561
				paramEx()
				}
				}
				this.state = 564 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==ID )
			this.state = 566
			match(RPAREN) as Token
			this.state = 568
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FROM) {
				if (true){
				this.state = 567
				parameterFromValue()
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

	open class ParameterFromValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameterFromValue.id
	        set(value) { throw RuntimeException() }
		fun FROM() : TerminalNode? = getToken(FoldingParser.Tokens.FROM.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findParamCEx() : List<ParamCExContext> = getRuleContexts(solver.getType("ParamCExContext"))
		fun findParamCEx(i: Int) : ParamCExContext? = getRuleContext(solver.getType("ParamCExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parameterFromValue() : ParameterFromValueContext {
		var _localctx : ParameterFromValueContext = ParameterFromValueContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_parameterFromValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 570
			match(FROM) as Token
			this.state = 571
			match(LPAREN) as Token
			this.state = 573 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 572
				paramCEx()
				}
				}
				this.state = 575 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl NULL) or (1L shl TRUE) or (1L shl FALSE) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L) )
			this.state = 577
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

	open class SpecificAliasContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_specificAlias.id
	        set(value) { throw RuntimeException() }
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  specificAlias() : SpecificAliasContext {
		var _localctx : SpecificAliasContext = SpecificAliasContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_specificAlias.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 579
			match(LPAREN) as Token
			this.state = 580
			match(ID) as Token
			this.state = 581
			match(ASSGIN) as Token
			this.state = 582
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: ArgExContext) {
			super.copyFrom(ctx)
		}
	}
	open class SingleArgContext : ArgExContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		constructor(ctx: ArgExContext) { copyFrom(ctx) }
	}
	open class MultiArgContext : ArgExContext {
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ELLIPSIS() : TerminalNode? = getToken(FoldingParser.Tokens.ELLIPSIS.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		constructor(ctx: ArgExContext) { copyFrom(ctx) }
	}

	fun  argEx() : ArgExContext {
		var _localctx : ArgExContext = ArgExContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_argEx.id)
		var _la: Int
		try {
			this.state = 601
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,72,context) ) {
			1 -> {_localctx = SingleArgContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 586
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,69,context) ) {
			1   -> if (true){
			this.state = 584
			match(ID) as Token
			this.state = 585
			match(ASSGIN) as Token
			}
			}
			this.state = 588
			value(0)
			}}
			2 -> {_localctx = MultiArgContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 591
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 589
				match(ID) as Token
				this.state = 590
				match(ELLIPSIS) as Token
				}
			}

			this.state = 593
			match(LBRACE) as Token
			this.state = 597
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl NULL) or (1L shl TRUE) or (1L shl FALSE) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 594
				value(0)
				}
				}
				this.state = 599
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 600
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: ArgValueContext) {
			super.copyFrom(ctx)
		}
	}
	open class SingleListArgValueContext : ArgValueContext {
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(ctx: ArgValueContext) { copyFrom(ctx) }
	}
	open class PrimaryArgValueContext : ArgValueContext {
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findArgEx() : List<ArgExContext> = getRuleContexts(solver.getType("ArgExContext"))
		fun findArgEx(i: Int) : ArgExContext? = getRuleContext(solver.getType("ArgExContext"),i)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(ctx: ArgValueContext) { copyFrom(ctx) }
	}

	fun  argValue() : ArgValueContext {
		var _localctx : ArgValueContext = ArgValueContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_argValue.id)
		var _la: Int
		try {
			this.state = 637
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{_localctx = PrimaryArgValueContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 603
			match(LPAREN) as Token
			this.state = 611
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,74,context) ) {
			1   -> if (true){
			this.state = 605 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 604
				typeEx()
				}
				}
				this.state = 607 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl LONG) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl UNIT) or (1L shl ARRAY) or (1L shl LPAREN) or (1L shl QUOTE) or (1L shl QM) or (1L shl ID))) != 0L) )
			this.state = 609
			match(TILDE) as Token
			}
			}
			this.state = 616
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl NULL) or (1L shl TRUE) or (1L shl FALSE) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 613
				argEx()
				}
				}
				this.state = 618
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 619
			match(RPAREN) as Token
			}}
			LBRACE  ->  /*LL1AltBlock*/{_localctx = SingleListArgValueContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 620
			match(LBRACE) as Token
			this.state = 628
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,77,context) ) {
			1   -> if (true){
			this.state = 622 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 621
				typeEx()
				}
				}
				this.state = 624 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl LONG) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl UNIT) or (1L shl ARRAY) or (1L shl LPAREN) or (1L shl QUOTE) or (1L shl QM) or (1L shl ID))) != 0L) )
			this.state = 626
			match(TILDE) as Token
			}
			}
			this.state = 633
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl NULL) or (1L shl TRUE) or (1L shl FALSE) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 630
				value(0)
				}
				}
				this.state = 635
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 636
			match(RBRACE) as Token
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

	open class InvokingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_invoking.id
	        set(value) { throw RuntimeException() }
		fun COLON() : TerminalNode? = getToken(FoldingParser.Tokens.COLON.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  invoking() : InvokingContext {
		var _localctx : InvokingContext = InvokingContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_invoking.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 639
			match(COLON) as Token
			this.state = 640
			match(LPAREN) as Token
			this.state = 644
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl NULL) or (1L shl TRUE) or (1L shl FALSE) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 641
				value(0)
				}
				}
				this.state = 646
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 647
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

	open class CommonIdentifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_commonIdentifier.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findOpIdWrap() : OpIdWrapContext? = getRuleContext(solver.getType("OpIdWrapContext"),0)
		fun findAopIdWrap() : AopIdWrapContext? = getRuleContext(solver.getType("AopIdWrapContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  commonIdentifier() : CommonIdentifierContext {
		var _localctx : CommonIdentifierContext = CommonIdentifierContext(context, state)
		enterRule(_localctx, 80, Rules.RULE_commonIdentifier.id)
		try {
			this.state = 652
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,81,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 649
			match(ID) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 650
			opIdWrap()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 651
			aopIdWrap()
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
		enterRule(_localctx, 82, Rules.RULE_opIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 654
			match(LSQUARE) as Token
			this.state = 655
			match(OPID) as Token
			this.state = 656
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
		enterRule(_localctx, 84, Rules.RULE_aopIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 658
			match(LSQUARE) as Token
			this.state = 659
			match(TILDE) as Token
			this.state = 660
			match(OPID) as Token
			this.state = 661
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

	open class CallingOpIdContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_callingOpId.id
	        set(value) { throw RuntimeException() }
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  callingOpId() : CallingOpIdContext {
		var _localctx : CallingOpIdContext = CallingOpIdContext(context, state)
		enterRule(_localctx, 86, Rules.RULE_callingOpId.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 663
			match(OPID) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CallingAopIdContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_callingAopId.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: CallingAopIdContext) {
			super.copyFrom(ctx)
		}
	}
	open class CommonAopIdContext : CallingAopIdContext {
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		constructor(ctx: CallingAopIdContext) { copyFrom(ctx) }
	}

	fun  callingAopId() : CallingAopIdContext {
		var _localctx : CallingAopIdContext = CallingAopIdContext(context, state)
		enterRule(_localctx, 88, Rules.RULE_callingAopId.id)
		try {
			 _localctx = CommonAopIdContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 665
			match(OPID) as Token
			}
		}
		catch (re: RecognitionException) {
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
		enterRule(_localctx, 90, Rules.RULE_field.id)
		try {
			this.state = 669
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,82,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 667
			fieldSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 668
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
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun MUTABLE() : TerminalNode? = getToken(FoldingParser.Tokens.MUTABLE.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  fieldNotInit() : FieldNotInitContext {
		var _localctx : FieldNotInitContext = FieldNotInitContext(context, state)
		enterRule(_localctx, 92, Rules.RULE_fieldNotInit.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 671
			match(ID) as Token
			this.state = 675
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,83,context) ) {
			1   -> if (true){
			this.state = 672
			match(LPAREN) as Token
			this.state = 673
			match(MUTABLE) as Token
			this.state = 674
			match(RPAREN) as Token
			}
			}
			this.state = 677
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
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun MUTABLE() : TerminalNode? = getToken(FoldingParser.Tokens.MUTABLE.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  fieldSetted() : FieldSettedContext {
		var _localctx : FieldSettedContext = FieldSettedContext(context, state)
		enterRule(_localctx, 94, Rules.RULE_fieldSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 679
			match(ID) as Token
			this.state = 683
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,84,context) ) {
			1   -> if (true){
			this.state = 680
			match(LPAREN) as Token
			this.state = 681
			match(MUTABLE) as Token
			this.state = 682
			match(RPAREN) as Token
			}
			}
			this.state = 686
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl LONG) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl UNIT) or (1L shl ARRAY) or (1L shl LPAREN) or (1L shl QUOTE) or (1L shl QM) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 685
				typeEx()
				}
			}

			this.state = 688
			match(ASSGIN) as Token
			this.state = 689
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
		fun findInverseDefining() : List<InverseDefiningContext> = getRuleContexts(solver.getType("InverseDefiningContext"))
		fun findInverseDefining(i: Int) : InverseDefiningContext? = getRuleContext(solver.getType("InverseDefiningContext"),i)
		fun findForeignDef() : ForeignDefContext? = getRuleContext(solver.getType("ForeignDefContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  def() : DefContext {
		var _localctx : DefContext = DefContext(context, state)
		enterRule(_localctx, 96, Rules.RULE_def.id)
		var _la: Int
		try {
			this.state = 705
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,88,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 691
			justDef()
			this.state = 695
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==INVERSE) {
				if (true){
				if (true){
				this.state = 692
				inverseDefining()
				}
				}
				this.state = 697
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 698
			foreignDef()
			this.state = 702
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==INVERSE) {
				if (true){
				if (true){
				this.state = 699
				inverseDefining()
				}
				}
				this.state = 704
				errorHandler.sync(this)
				_la = _input!!.LA(1)
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

	open class JustDefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_justDef.id
	        set(value) { throw RuntimeException() }
		fun findCommonIdentifier() : CommonIdentifierContext? = getRuleContext(solver.getType("CommonIdentifierContext"),0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  justDef() : JustDefContext {
		var _localctx : JustDefContext = JustDefContext(context, state)
		enterRule(_localctx, 98, Rules.RULE_justDef.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 708
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,89,context) ) {
			1   -> if (true){
			this.state = 707
			annotationBlock()
			}
			}
			this.state = 710
			commonIdentifier()
			this.state = 712
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,90,context) ) {
			1   -> if (true){
			this.state = 711
			typeParam()
			}
			}
			this.state = 715
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,91,context) ) {
			1   -> if (true){
			this.state = 714
			parameter()
			}
			}
			this.state = 717
			typeEx()
			this.state = 718
			match(ASSGIN) as Token
			this.state = 719
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

	open class ForeignDefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_foreignDef.id
	        set(value) { throw RuntimeException() }
		fun findCommonIdentifier() : CommonIdentifierContext? = getRuleContext(solver.getType("CommonIdentifierContext"),0)
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findAnnotationBlock() : AnnotationBlockContext? = getRuleContext(solver.getType("AnnotationBlockContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun findForeignBody() : ForeignBodyContext? = getRuleContext(solver.getType("ForeignBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignDef() : ForeignDefContext {
		var _localctx : ForeignDefContext = ForeignDefContext(context, state)
		enterRule(_localctx, 100, Rules.RULE_foreignDef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 722
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,92,context) ) {
			1   -> if (true){
			this.state = 721
			annotationBlock()
			}
			}
			this.state = 724
			commonIdentifier()
			this.state = 726
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 725
				typeParam()
				}
			}

			this.state = 729
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 728
				parameter()
				}
			}

			this.state = 731
			match(FOREIGN) as Token
			this.state = 732
			typeEx()
			this.state = 734
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE || _la==RawString) {
				if (true){
				this.state = 733
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

	open class InverseDefiningContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_inverseDefining.id
	        set(value) { throw RuntimeException() }
		fun INVERSE() : TerminalNode? = getToken(FoldingParser.Tokens.INVERSE.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findInverseDefCompo() : List<InverseDefCompoContext> = getRuleContexts(solver.getType("InverseDefCompoContext"))
		fun findInverseDefCompo(i: Int) : InverseDefCompoContext? = getRuleContext(solver.getType("InverseDefCompoContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  inverseDefining() : InverseDefiningContext {
		var _localctx : InverseDefiningContext = InverseDefiningContext(context, state)
		enterRule(_localctx, 102, Rules.RULE_inverseDefining.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 736
			match(INVERSE) as Token
			this.state = 738
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 737
				match(ID) as Token
				}
			}

			this.state = 740
			match(LPAREN) as Token
			this.state = 742 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 741
				inverseDefCompo()
				}
				}
				this.state = 744 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl NULL) or (1L shl TRUE) or (1L shl FALSE) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl As) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L) )
			this.state = 746
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

	open class InverseDefCompoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_inverseDefCompo.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: InverseDefCompoContext) {
			super.copyFrom(ctx)
		}
	}
	open class NecessaryParamContext : InverseDefCompoContext {
		fun As() : TerminalNode? = getToken(FoldingParser.Tokens.As.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		constructor(ctx: InverseDefCompoContext) { copyFrom(ctx) }
	}
	open class OutputParamContext : InverseDefCompoContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(ctx: InverseDefCompoContext) { copyFrom(ctx) }
	}

	fun  inverseDefCompo() : InverseDefCompoContext {
		var _localctx : InverseDefCompoContext = InverseDefCompoContext(context, state)
		enterRule(_localctx, 104, Rules.RULE_inverseDefCompo.id)
		var _la: Int
		try {
			this.state = 755
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			DO , IF , NEW , LET , NULL , TRUE , FALSE , LPAREN , LSQUARE , ARROW , QUOTE , SHARP , ID , OPID , Integer , Double , String  ->  /*LL1AltBlock*/{_localctx = OutputParamContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 748
			value(0)
			this.state = 751
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 749
				match(TILDE) as Token
				this.state = 750
				typeEx()
				}
			}

			}}
			As  ->  /*LL1AltBlock*/{_localctx = NecessaryParamContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 753
			match(As) as Token
			this.state = 754
			match(ID) as Token
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

	open class LambdaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lambda.id
	        set(value) { throw RuntimeException() }
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun findParameterForLambda() : ParameterForLambdaContext? = getRuleContext(solver.getType("ParameterForLambdaContext"),0)
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  lambda() : LambdaContext {
		var _localctx : LambdaContext = LambdaContext(context, state)
		enterRule(_localctx, 106, Rules.RULE_lambda.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 757
			match(LSQUARE) as Token
			this.state = 758
			parameterForLambda()
			this.state = 759
			match(RSQUARE) as Token
			this.state = 760
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

	open class ParameterForLambdaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameterForLambda.id
	        set(value) { throw RuntimeException() }
		fun findParamEx() : List<ParamExContext> = getRuleContexts(solver.getType("ParamExContext"))
		fun findParamEx(i: Int) : ParamExContext? = getRuleContext(solver.getType("ParamExContext"),i)
		fun findParameterFromValueForLambda() : ParameterFromValueForLambdaContext? = getRuleContext(solver.getType("ParameterFromValueForLambdaContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parameterForLambda() : ParameterForLambdaContext {
		var _localctx : ParameterForLambdaContext = ParameterForLambdaContext(context, state)
		enterRule(_localctx, 108, Rules.RULE_parameterForLambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 765
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 762
				paramEx()
				}
				}
				this.state = 767
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 769
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FROM) {
				if (true){
				this.state = 768
				parameterFromValueForLambda()
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

	open class ParameterFromValueForLambdaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameterFromValueForLambda.id
	        set(value) { throw RuntimeException() }
		fun FROM() : TerminalNode? = getToken(FoldingParser.Tokens.FROM.id, 0)
		fun findParamCEx() : List<ParamCExContext> = getRuleContexts(solver.getType("ParamCExContext"))
		fun findParamCEx(i: Int) : ParamCExContext? = getRuleContext(solver.getType("ParamCExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parameterFromValueForLambda() : ParameterFromValueForLambdaContext {
		var _localctx : ParameterFromValueForLambdaContext = ParameterFromValueForLambdaContext(context, state)
		enterRule(_localctx, 110, Rules.RULE_parameterFromValueForLambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 771
			match(FROM) as Token
			this.state = 773 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 772
				paramCEx()
				}
				}
				this.state = 775 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl NULL) or (1L shl TRUE) or (1L shl FALSE) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L) )
			}
		}
		catch (re: RecognitionException) {
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
		fun findTypeExFunc() : TypeExFuncContext? = getRuleContext(solver.getType("TypeExFuncContext"),0)
		fun QM() : TerminalNode? = getToken(FoldingParser.Tokens.QM.id, 0)
		fun findTypeExSingle() : TypeExSingleContext? = getRuleContext(solver.getType("TypeExSingleContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeEx() : TypeExContext {
		var _localctx : TypeExContext = TypeExContext(context, state)
		enterRule(_localctx, 112, Rules.RULE_typeEx.id)
		var _la: Int
		try {
			this.state = 785
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,105,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 778
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==QM) {
				if (true){
				this.state = 777
				match(QM) as Token
				}
			}

			this.state = 780
			typeExFunc()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 782
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==QM) {
				if (true){
				this.state = 781
				match(QM) as Token
				}
			}

			this.state = 784
			typeExSingle()
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

	open class TypeExSingleContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeExSingle.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun QUOTE() : List<TerminalNode> = getTokens(FoldingParser.Tokens.QUOTE.id)
		fun QUOTE(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.QUOTE.id, i) as TerminalNode
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun DOT() : TerminalNode? = getToken(FoldingParser.Tokens.DOT.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		fun findPrimitiveType() : PrimitiveTypeContext? = getRuleContext(solver.getType("PrimitiveTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeExSingle() : TypeExSingleContext {
		var _localctx : TypeExSingleContext = TypeExSingleContext(context, state)
		enterRule(_localctx, 114, Rules.RULE_typeExSingle.id)
		var _la: Int
		try {
			this.state = 809
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			QUOTE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 790
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,106,context) ) {
			1   -> if (true){
			this.state = 787
			package_()
			this.state = 788
			match(DOT) as Token
			}
			}
			this.state = 796
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ID  ->  /*LL1AltBlock*/{if (true){
			this.state = 792
			match(ID) as Token
			}}
			QUOTE  ->  /*LL1AltBlock*/{if (true){
			this.state = 793
			match(QUOTE) as Token
			this.state = 794
			match(ID) as Token
			this.state = 795
			match(QUOTE) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 806
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,109,context) ) {
			1   -> if (true){
			this.state = 798
			match(LPAREN) as Token
			this.state = 800 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 799
				typeEx()
				}
				}
				this.state = 802 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl LONG) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl UNIT) or (1L shl ARRAY) or (1L shl LPAREN) or (1L shl QUOTE) or (1L shl QM) or (1L shl ID))) != 0L) )
			this.state = 804
			match(RPAREN) as Token
			}
			}
			}}
			INT , LONG , DOUBLE , FLOAT , BYTE , CHAR , STRING , BOOLEAN , UNIT , ARRAY  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 808
			primitiveType()
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

	open class PrimitiveTypeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_primitiveType.id
	        set(value) { throw RuntimeException() }
		fun INT() : TerminalNode? = getToken(FoldingParser.Tokens.INT.id, 0)
		fun LONG() : TerminalNode? = getToken(FoldingParser.Tokens.LONG.id, 0)
		fun CHAR() : TerminalNode? = getToken(FoldingParser.Tokens.CHAR.id, 0)
		fun STRING() : TerminalNode? = getToken(FoldingParser.Tokens.STRING.id, 0)
		fun BYTE() : TerminalNode? = getToken(FoldingParser.Tokens.BYTE.id, 0)
		fun FLOAT() : TerminalNode? = getToken(FoldingParser.Tokens.FLOAT.id, 0)
		fun DOUBLE() : TerminalNode? = getToken(FoldingParser.Tokens.DOUBLE.id, 0)
		fun BOOLEAN() : TerminalNode? = getToken(FoldingParser.Tokens.BOOLEAN.id, 0)
		fun UNIT() : TerminalNode? = getToken(FoldingParser.Tokens.UNIT.id, 0)
		fun ARRAY() : TerminalNode? = getToken(FoldingParser.Tokens.ARRAY.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  primitiveType() : PrimitiveTypeContext {
		var _localctx : PrimitiveTypeContext = PrimitiveTypeContext(context, state)
		enterRule(_localctx, 116, Rules.RULE_primitiveType.id)
		try {
			this.state = 825
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			INT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 811
			match(INT) as Token
			}}
			LONG  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 812
			match(LONG) as Token
			}}
			CHAR  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 813
			match(CHAR) as Token
			}}
			STRING  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 814
			match(STRING) as Token
			}}
			BYTE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 815
			match(BYTE) as Token
			}}
			FLOAT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 816
			match(FLOAT) as Token
			}}
			DOUBLE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 7)
			if (true){
			this.state = 817
			match(DOUBLE) as Token
			}}
			BOOLEAN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 8)
			if (true){
			this.state = 818
			match(BOOLEAN) as Token
			}}
			UNIT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 9)
			if (true){
			this.state = 819
			match(UNIT) as Token
			}}
			ARRAY  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 10)
			if (true){
			this.state = 820
			match(ARRAY) as Token
			this.state = 821
			match(LPAREN) as Token
			this.state = 822
			typeEx()
			this.state = 823
			match(RPAREN) as Token
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
		enterRule(_localctx, 118, Rules.RULE_typeExParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 827
			typeEx()
			this.state = 829
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 828
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

	open class TypeExFuncContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeExFunc.id
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

	fun  typeExFunc() : TypeExFuncContext {
		var _localctx : TypeExFuncContext = TypeExFuncContext(context, state)
		enterRule(_localctx, 120, Rules.RULE_typeExFunc.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 831
			match(LPAREN) as Token
			this.state = 835
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl LONG) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl UNIT) or (1L shl ARRAY) or (1L shl LPAREN) or (1L shl QUOTE) or (1L shl QM) or (1L shl ID))) != 0L)) {
				if (true){
				if (true){
				this.state = 832
				typeExParamEx()
				}
				}
				this.state = 837
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 838
			match(RPAREN) as Token
			this.state = 839
			match(ARROW) as Token
			this.state = 840
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
		enterRule(_localctx, 122, Rules.RULE_foreignBody.id)
		var _la: Int
		try {
			this.state = 851
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LBRACE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 842
			match(LBRACE) as Token
			this.state = 846
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 843
				foreignElement()
				}
				}
				this.state = 848
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 849
			match(RBRACE) as Token
			}}
			RawString  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 850
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignElement() : ForeignElementContext {
		var _localctx : ForeignElementContext = ForeignElementContext(context, state)
		enterRule(_localctx, 124, Rules.RULE_foreignElement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 853
			foreignPlatform()
			this.state = 854
			match(RawString) as Token
			}
		}
		catch (re: RecognitionException) {
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
		enterRule(_localctx, 126, Rules.RULE_foreignPlatform.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 856
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

	open class AnnotationDefContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_annotationDef.id
	        set(value) { throw RuntimeException() }
		fun ANNOTATION() : TerminalNode? = getToken(FoldingParser.Tokens.ANNOTATION.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  annotationDef() : AnnotationDefContext {
		var _localctx : AnnotationDefContext = AnnotationDefContext(context, state)
		enterRule(_localctx, 128, Rules.RULE_annotationDef.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 858
			match(ANNOTATION) as Token
			this.state = 859
			match(ID) as Token
			this.state = 860
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

	open class AnnotationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_annotation.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun DOT() : TerminalNode? = getToken(FoldingParser.Tokens.DOT.id, 0)
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  annotation() : AnnotationContext {
		var _localctx : AnnotationContext = AnnotationContext(context, state)
		enterRule(_localctx, 130, Rules.RULE_annotation.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 865
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,116,context) ) {
			1   -> if (true){
			this.state = 862
			package_()
			this.state = 863
			match(DOT) as Token
			}
			}
			this.state = 867
			match(ID) as Token
			this.state = 869
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==LBRACE) {
				if (true){
				this.state = 868
				argValue()
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

	open class AnnotationBlockContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_annotationBlock.id
	        set(value) { throw RuntimeException() }
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		fun findAnnotation() : List<AnnotationContext> = getRuleContexts(solver.getType("AnnotationContext"))
		fun findAnnotation(i: Int) : AnnotationContext? = getRuleContext(solver.getType("AnnotationContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  annotationBlock() : AnnotationBlockContext {
		var _localctx : AnnotationBlockContext = AnnotationBlockContext(context, state)
		enterRule(_localctx, 132, Rules.RULE_annotationBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 871
			match(LSQUARE) as Token
			this.state = 875
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 872
				annotation()
				}
				}
				this.state = 877
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 878
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
		27 -> return value_sempred(_localctx as ValueContext, predIndex)
		}
		return true
	}
	private fun value_sempred( _localctx : ValueContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 9)
		    1 -> return precpred(context!!, 8)
		    2 -> return precpred(context!!, 6)
		    3 -> return precpred(context!!, 15)
		    4 -> return precpred(context!!, 14)
		    5 -> return precpred(context!!, 13)
		    6 -> return precpred(context!!, 12)
		    7 -> return precpred(context!!, 11)
		    8 -> return precpred(context!!, 10)
		}
		return true
	}

}