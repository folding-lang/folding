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
                                                              FoldingParser.FieldInInterfaceContext::class,
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
                                                              FoldingParser.FieldContext::class,
                                                              FoldingParser.FieldNotInitContext::class,
                                                              FoldingParser.FieldSettedContext::class,
                                                              FoldingParser.ForeignFieldContext::class,
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
                                                              FoldingParser.TypeArgExContext::class,
                                                              FoldingParser.PrimitiveTypeContext::class,
                                                              FoldingParser.TypeExParamExContext::class,
                                                              FoldingParser.TypeExFuncContext::class,
                                                              FoldingParser.TypeExCovariantContext::class,
                                                              FoldingParser.TypeExContravariantContext::class,
                                                              FoldingParser.TypeExWildcardContext::class,
                                                              FoldingParser.ForeignBodyContext::class,
                                                              FoldingParser.ForeignElementContext::class,
                                                              FoldingParser.ForeignPlatformContext::class,
                                                              FoldingParser.TypeAliasContext::class,
                                                              FoldingParser.ForeignTypeExpectitiveContext::class,
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
        ABSTRACT(4),
        ANNOTATION(5),
        CLASS(6),
        DO(7),
        FOREIGN(8),
        NAMESPACE(9),
        INTERNAL(10),
        IMPORT(11),
        IMPL(12),
        INHERIT(13),
        RETURN(14),
        MUTABLE(15),
        INTERFACE(16),
        DATA(17),
        INVERSE(18),
        EXPECT(19),
        IF(20),
        ELSE(21),
        NEW(22),
        LET(23),
        TYPEALIAS(24),
        FROM(25),
        IS(26),
        GET(27),
        SET(28),
        INT(29),
        LONG(30),
        DOUBLE(31),
        FLOAT(32),
        BYTE(33),
        CHAR(34),
        STRING(35),
        BOOLEAN(36),
        UNIT(37),
        NULL(38),
        TRUE(39),
        FALSE(40),
        ALPHA(41),
        ASSGIN(42),
        ELLIPSIS(43),
        DOT(44),
        LPAREN(45),
        RPAREN(46),
        LSQUARE(47),
        RSQUARE(48),
        LBRACE(49),
        RBRACE(50),
        ARROW(51),
        ARROWQM(52),
        TILDE(53),
        As(54),
        COLON(55),
        DOUBLECOLON(56),
        COLONSHARP(57),
        QUOTE(58),
        COLONQUOTE(59),
        SHARP(60),
        QM(61),
        ID(62),
        OPID(63),
        Integer(64),
        Double(65),
        String(66),
        RawString(67)
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
        RULE_fieldInInterface(19),
        RULE_inherit(20),
        RULE_impl(21),
        RULE_implBody(22),
        RULE_typeParam(23),
        RULE_typeParamCompo(24),
        RULE_definition(25),
        RULE_defaultValue(26),
        RULE_boolean(27),
        RULE_value(28),
        RULE_reference(29),
        RULE_typeCasting(30),
        RULE_if_else(31),
        RULE_let_binding(32),
        RULE_paramEx(33),
        RULE_paramCEx(34),
        RULE_parameter(35),
        RULE_parameterFromValue(36),
        RULE_specificAlias(37),
        RULE_argEx(38),
        RULE_argValue(39),
        RULE_invoking(40),
        RULE_commonIdentifier(41),
        RULE_opIdWrap(42),
        RULE_aopIdWrap(43),
        RULE_field(44),
        RULE_fieldNotInit(45),
        RULE_fieldSetted(46),
        RULE_foreignField(47),
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
        RULE_typeArgEx(58),
        RULE_primitiveType(59),
        RULE_typeExParamEx(60),
        RULE_typeExFunc(61),
        RULE_typeExCovariant(62),
        RULE_typeExContravariant(63),
        RULE_typeExWildcard(64),
        RULE_foreignBody(65),
        RULE_foreignElement(66),
        RULE_foreignPlatform(67),
        RULE_typeAlias(68),
        RULE_foreignTypeExpectitive(69),
        RULE_annotationDef(70),
        RULE_annotation(71),
        RULE_annotationBlock(72)
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
                                "constructorSelf", "defInInterface", "fieldInInterface", 
                                "inherit", "impl", "implBody", "typeParam", 
                                "typeParamCompo", "definition", "defaultValue", 
                                "boolean", "value", "reference", "typeCasting", 
                                "if_else", "let_binding", "paramEx", "paramCEx", 
                                "parameter", "parameterFromValue", "specificAlias", 
                                "argEx", "argValue", "invoking", "commonIdentifier", 
                                "opIdWrap", "aopIdWrap", "field", "fieldNotInit", 
                                "fieldSetted", "foreignField", "def", "justDef", 
                                "foreignDef", "inverseDefining", "inverseDefCompo", 
                                "lambda", "parameterForLambda", "parameterFromValueForLambda", 
                                "typeEx", "typeExSingle", "typeArgEx", "primitiveType", 
                                "typeExParamEx", "typeExFunc", "typeExCovariant", 
                                "typeExContravariant", "typeExWildcard", 
                                "foreignBody", "foreignElement", "foreignPlatform", 
                                "typeAlias", "foreignTypeExpectitive", "annotationDef", 
                                "annotation", "annotationBlock")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
                                                          null, "'abstract'", 
                                                          "'annotation'", 
                                                          "'class'", "'do'", 
                                                          "'foreign'", "'package'", 
                                                          "'internal'", 
                                                          "'import'", "'impl'", 
                                                          "'inherit'", "'return'", 
                                                          "'mutable'", "'interface'", 
                                                          "'data'", "'inverse'", 
                                                          "'expect'", "'if'", 
                                                          "'else'", "'new'", 
                                                          "'let'", "'typealias'", 
                                                          "'from!'", "'is!'", 
                                                          "'get!'", "'set!'", 
                                                          "'Int'", "'Long'", 
                                                          "'Double'", "'Float'", 
                                                          "'Byte'", "'Char'", 
                                                          "'String'", "'Boolean'", 
                                                          "'Unit'", "'null'", 
                                                          "'true'", "'false'", 
                                                          "'@'", "'='", 
                                                          "'...'", "'.'", 
                                                          "'('", "')'", 
                                                          "'['", "']'", 
                                                          "'{'", "'}'", 
                                                          "'->'", "'->?'", 
                                                          "'~'", "'~>'", 
                                                          "':'", "'::'", 
                                                          "':#'", "'''", 
                                                          "':''", "'#'", 
                                                          "'?'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "WS", "COMMENT", 
                                                           "LINE_COMMENT", 
                                                           "ABSTRACT", "ANNOTATION", 
                                                           "CLASS", "DO", 
                                                           "FOREIGN", "NAMESPACE", 
                                                           "INTERNAL", "IMPORT", 
                                                           "IMPL", "INHERIT", 
                                                           "RETURN", "MUTABLE", 
                                                           "INTERFACE", 
                                                           "DATA", "INVERSE", 
                                                           "EXPECT", "IF", 
                                                           "ELSE", "NEW", 
                                                           "LET", "TYPEALIAS", 
                                                           "FROM", "IS", 
                                                           "GET", "SET", 
                                                           "INT", "LONG", 
                                                           "DOUBLE", "FLOAT", 
                                                           "BYTE", "CHAR", 
                                                           "STRING", "BOOLEAN", 
                                                           "UNIT", "NULL", 
                                                           "TRUE", "FALSE", 
                                                           "ALPHA", "ASSGIN", 
                                                           "ELLIPSIS", "DOT", 
                                                           "LPAREN", "RPAREN", 
                                                           "LSQUARE", "RSQUARE", 
                                                           "LBRACE", "RBRACE", 
                                                           "ARROW", "ARROWQM", 
                                                           "TILDE", "As", 
                                                           "COLON", "DOUBLECOLON", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0045\u03ee\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0004\u0042\u0009\u0042\u0004\u0043\u0009\u0043\u0004\u0044\u0009\u0044\u0004\u0045\u0009\u0045\u0004\u0046\u0009\u0046\u0004\u0047\u0009\u0047\u0004\u0048\u0009\u0048\u0004\u0049\u0009\u0049\u0004\u004a\u0009\u004a\u0003\u0002\u0005\u0002\u0096\u000a\u0002\u0003\u0002\u0007\u0002\u0099\u000a\u0002\u000c\u0002\u000e\u0002\u009c\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u00a1\u000a\u0002\u000c\u0002\u000e\u0002\u00a4\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u00a9\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u00ae\u000a\u0004\u0003\u0004\u0005\u0004\u00b1\u000a\u0004\u0003\u0004\u0005\u0004\u00b4\u000a\u0004\u0003\u0005\u0003\u0005\u0007\u0005\u00b8\u000a\u0005\u000c\u0005\u000e\u0005\u00bb\u000b\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00c2\u000a\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00c6\u000a\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00cc\u000a\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00d4\u000a\u0006\u0005\u0006\u00d6\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0007\u000b\u00e7\u000a\u000b\u000c\u000b\u000e\u000b\u00ea\u000b\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0007\u000d\u00f2\u000a\u000d\u000c\u000d\u000e\u000d\u00f5\u000b\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00fc\u000a\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u010b\u000a\u0010\u0003\u0011\u0005\u0011\u010e\u000a\u0011\u0003\u0011\u0005\u0011\u0111\u000a\u0011\u0003\u0011\u0005\u0011\u0114\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u011c\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u0121\u000a\u0011\u000c\u0011\u000e\u0011\u0124\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0129\u000a\u0011\u0007\u0011\u012b\u000a\u0011\u000c\u0011\u000e\u0011\u012e\u000b\u0011\u0003\u0011\u0007\u0011\u0131\u000a\u0011\u000c\u0011\u000e\u0011\u0134\u000b\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0138\u000a\u0011\u0003\u0011\u0005\u0011\u013b\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0143\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u0149\u000a\u0011\u000c\u0011\u000e\u0011\u014c\u000b\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u0150\u000a\u0011\u000c\u0011\u000e\u0011\u0153\u000b\u0011\u0003\u0011\u0005\u0011\u0156\u000a\u0011\u0003\u0011\u0007\u0011\u0159\u000a\u0011\u000c\u0011\u000e\u0011\u015c\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0161\u000a\u0011\u0003\u0011\u0005\u0011\u0164\u000a\u0011\u0003\u0011\u0005\u0011\u0167\u000a\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u016f\u000a\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u0173\u000a\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u0177\u000a\u0011\u000c\u0011\u000e\u0011\u017a\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u017f\u000a\u0011\u0007\u0011\u0181\u000a\u0011\u000c\u0011\u000e\u0011\u0184\u000b\u0011\u0003\u0011\u0005\u0011\u0187\u000a\u0011\u0003\u0011\u0007\u0011\u018a\u000a\u0011\u000c\u0011\u000e\u0011\u018d\u000b\u0011\u0003\u0011\u0005\u0011\u0190\u000a\u0011\u0003\u0012\u0003\u0012\u0005\u0012\u0194\u000a\u0012\u0003\u0012\u0005\u0012\u0197\u000a\u0012\u0003\u0013\u0005\u0013\u019a\u000a\u0013\u0003\u0013\u0005\u0013\u019d\u000a\u0013\u0003\u0014\u0005\u0014\u01a0\u000a\u0014\u0003\u0014\u0003\u0014\u0005\u0014\u01a4\u000a\u0014\u0003\u0014\u0005\u0014\u01a7\u000a\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0005\u0016\u01b3\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u01ba\u000a\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0007\u0018\u01bf\u000a\u0018\u000c\u0018\u000e\u0018\u01c2\u000b\u0018\u0003\u0018\u0003\u0018\u0007\u0018\u01c6\u000a\u0018\u000c\u0018\u000e\u0018\u01c9\u000b\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0006\u0019\u01ce\u000a\u0019\u000d\u0019\u000e\u0019\u01cf\u0003\u001a\u0003\u001a\u0003\u001a\u0007\u001a\u01d5\u000a\u001a\u000c\u001a\u000e\u001a\u01d8\u000b\u001a\u0003\u001b\u0003\u001b\u0005\u001b\u01dc\u000a\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0005\u001c\u01e2\u000a\u001c\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u01ec\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u01f2\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u01f7\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0007\u001e\u01ff\u000a\u001e\u000c\u001e\u000e\u001e\u0202\u000b\u001e\u0003\u001e\u0003\u001e\u0007\u001e\u0206\u000a\u001e\u000c\u001e\u000e\u001e\u0209\u000b\u001e\u0003\u001e\u0005\u001e\u020c\u000a\u001e\u0003\u001e\u0007\u001e\u020f\u000a\u001e\u000c\u001e\u000e\u001e\u0212\u000b\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u0216\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u0222\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u0236\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u023f\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0007\u001e\u0249\u000a\u001e\u000c\u001e\u000e\u001e\u024c\u000b\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0005\u001f\u0251\u000a\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0005\u0023\u026a\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0005\u0024\u0270\u000a\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0006\u0025\u0278\u000a\u0025\u000d\u0025\u000e\u0025\u0279\u0003\u0025\u0005\u0025\u027d\u000a\u0025\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0006\u0026\u0283\u000a\u0026\u000d\u0026\u000e\u0026\u0284\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0005\u0028\u028e\u000a\u0028\u0003\u0028\u0005\u0028\u0291\u000a\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0005\u0028\u0296\u000a\u0028\u0003\u0028\u0003\u0028\u0007\u0028\u029a\u000a\u0028\u000c\u0028\u000e\u0028\u029d\u000b\u0028\u0003\u0028\u0005\u0028\u02a0\u000a\u0028\u0003\u0029\u0003\u0029\u0006\u0029\u02a4\u000a\u0029\u000d\u0029\u000e\u0029\u02a5\u0005\u0029\u02a8\u000a\u0029\u0003\u0029\u0003\u0029\u0007\u0029\u02ac\u000a\u0029\u000c\u0029\u000e\u0029\u02af\u000b\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0006\u0029\u02b4\u000a\u0029\u000d\u0029\u000e\u0029\u02b5\u0005\u0029\u02b8\u000a\u0029\u0003\u0029\u0003\u0029\u0007\u0029\u02bc\u000a\u0029\u000c\u0029\u000e\u0029\u02bf\u000b\u0029\u0003\u0029\u0005\u0029\u02c2\u000a\u0029\u0003\u002a\u0003\u002a\u0003\u002a\u0007\u002a\u02c7\u000a\u002a\u000c\u002a\u000e\u002a\u02ca\u000b\u002a\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u02d1\u000a\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0003\u002e\u0005\u002e\u02df\u000a\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0005\u002f\u02e4\u000a\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0005\u0030\u02ec\u000a\u0030\u0003\u0030\u0003\u0030\u0005\u0030\u02f0\u000a\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u02fc\u000a\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u0300\u000a\u0031\u0003\u0032\u0003\u0032\u0007\u0032\u0304\u000a\u0032\u000c\u0032\u000e\u0032\u0307\u000b\u0032\u0003\u0032\u0003\u0032\u0007\u0032\u030b\u000a\u0032\u000c\u0032\u000e\u0032\u030e\u000b\u0032\u0005\u0032\u0310\u000a\u0032\u0003\u0033\u0005\u0033\u0313\u000a\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u0317\u000a\u0033\u0003\u0033\u0005\u0033\u031a\u000a\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0034\u0005\u0034\u0321\u000a\u0034\u0003\u0034\u0003\u0034\u0005\u0034\u0325\u000a\u0034\u0003\u0034\u0005\u0034\u0328\u000a\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0005\u0034\u032d\u000a\u0034\u0003\u0035\u0003\u0035\u0005\u0035\u0331\u000a\u0035\u0003\u0035\u0003\u0035\u0006\u0035\u0335\u000a\u0035\u000d\u0035\u000e\u0035\u0336\u0003\u0035\u0003\u0035\u0003\u0036\u0003\u0036\u0003\u0036\u0005\u0036\u033e\u000a\u0036\u0003\u0036\u0003\u0036\u0005\u0036\u0342\u000a\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0038\u0007\u0038\u034a\u000a\u0038\u000c\u0038\u000e\u0038\u034d\u000b\u0038\u0003\u0038\u0005\u0038\u0350\u000a\u0038\u0003\u0039\u0003\u0039\u0006\u0039\u0354\u000a\u0039\u000d\u0039\u000e\u0039\u0355\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0003\u003a\u0005\u003a\u035d\u000a\u003a\u0005\u003a\u035f\u000a\u003a\u0003\u003a\u0003\u003a\u0005\u003a\u0363\u000a\u003a\u0005\u003a\u0365\u000a\u003a\u0003\u003b\u0003\u003b\u0003\u003b\u0005\u003b\u036a\u000a\u003b\u0003\u003b\u0003\u003b\u0003\u003b\u0003\u003b\u0005\u003b\u0370\u000a\u003b\u0003\u003b\u0003\u003b\u0006\u003b\u0374\u000a\u003b\u000d\u003b\u000e\u003b\u0375\u0003\u003b\u0003\u003b\u0005\u003b\u037a\u000a\u003b\u0003\u003b\u0005\u003b\u037d\u000a\u003b\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0005\u003c\u0383\u000a\u003c\u0003\u003d\u0003\u003d\u0003\u003e\u0003\u003e\u0005\u003e\u0389\u000a\u003e\u0003\u003f\u0003\u003f\u0007\u003f\u038d\u000a\u003f\u000c\u003f\u000e\u003f\u0390\u000b\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0040\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0043\u0003\u0043\u0007\u0043\u03a6\u000a\u0043\u000c\u0043\u000e\u0043\u03a9\u000b\u0043\u0003\u0043\u0003\u0043\u0005\u0043\u03ad\u000a\u0043\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0045\u0003\u0045\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0005\u0046\u03ba\u000a\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0003\u0046\u0005\u0046\u03c0\u000a\u0046\u0003\u0046\u0005\u0046\u03c3\u000a\u0046\u0005\u0046\u03c5\u000a\u0046\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0047\u0007\u0047\u03cb\u000a\u0047\u000c\u0047\u000e\u0047\u03ce\u000b\u0047\u0003\u0047\u0007\u0047\u03d1\u000a\u0047\u000c\u0047\u000e\u0047\u03d4\u000b\u0047\u0003\u0047\u0003\u0047\u0003\u0048\u0003\u0048\u0003\u0048\u0003\u0048\u0003\u0049\u0003\u0049\u0003\u0049\u0005\u0049\u03df\u000a\u0049\u0003\u0049\u0003\u0049\u0005\u0049\u03e3\u000a\u0049\u0003\u004a\u0003\u004a\u0007\u004a\u03e7\u000a\u004a\u000c\u004a\u000e\u004a\u03ea\u000b\u004a\u0003\u004a\u0003\u004a\u0003\u004a\u0002\u0003\u003a\u004b\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0070\u0072\u0074\u0076\u0078\u007a\u007c\u007e\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0002\u0005\u0003\u0002\u0029\u002a\u0003\u0002\u003f\u0040\u0003\u0002\u001f\u0027\u0002\u044d\u0002\u0095\u0003\u0002\u0002\u0002\u0004\u00a8\u0003\u0002\u0002\u0002\u0006\u00aa\u0003\u0002\u0002\u0002\u0008\u00b5\u0003\u0002\u0002\u0002\u000a\u00d5\u0003\u0002\u0002\u0002\u000c\u00d7\u0003\u0002\u0002\u0002\u000e\u00d9\u0003\u0002\u0002\u0002\u0010\u00db\u0003\u0002\u0002\u0002\u0012\u00e0\u0003\u0002\u0002\u0002\u0014\u00e3\u0003\u0002\u0002\u0002\u0016\u00eb\u0003\u0002\u0002\u0002\u0018\u00ee\u0003\u0002\u0002\u0002\u001a\u00fb\u0003\u0002\u0002\u0002\u001c\u00fd\u0003\u0002\u0002\u0002\u001e\u010a\u0003\u0002\u0002\u0002\u0020\u018f\u0003\u0002\u0002\u0002\u0022\u0191\u0003\u0002\u0002\u0002\u0024\u0199\u0003\u0002\u0002\u0002\u0026\u019f\u0003\u0002\u0002\u0002\u0028\u01aa\u0003\u0002\u0002\u0002\u002a\u01b0\u0003\u0002\u0002\u0002\u002c\u01b6\u0003\u0002\u0002\u0002\u002e\u01bb\u0003\u0002\u0002\u0002\u0030\u01cd\u0003\u0002\u0002\u0002\u0032\u01d1\u0003\u0002\u0002\u0002\u0034\u01db\u0003\u0002\u0002\u0002\u0036\u01e1\u0003\u0002\u0002\u0002\u0038\u01e3\u0003\u0002\u0002\u0002\u003a\u0221\u0003\u0002\u0002\u0002\u003c\u0250\u0003\u0002\u0002\u0002\u003e\u0254\u0003\u0002\u0002\u0002\u0040\u0259\u0003\u0002\u0002\u0002\u0042\u0261\u0003\u0002\u0002\u0002\u0044\u0267\u0003\u0002\u0002\u0002\u0046\u026f\u0003\u0002\u0002\u0002\u0048\u0275\u0003\u0002\u0002\u0002\u004a\u0280\u0003\u0002\u0002\u0002\u004c\u0286\u0003\u0002\u0002\u0002\u004e\u029f\u0003\u0002\u0002\u0002\u0050\u02c1\u0003\u0002\u0002\u0002\u0052\u02c3\u0003\u0002\u0002\u0002\u0054\u02d0\u0003\u0002\u0002\u0002\u0056\u02d2\u0003\u0002\u0002\u0002\u0058\u02d6\u0003\u0002\u0002\u0002\u005a\u02de\u0003\u0002\u0002\u0002\u005c\u02e3\u0003\u0002\u0002\u0002\u005e\u02eb\u0003\u0002\u0002\u0002\u0060\u02f4\u0003\u0002\u0002\u0002\u0062\u030f\u0003\u0002\u0002\u0002\u0064\u0312\u0003\u0002\u0002\u0002\u0066\u0320\u0003\u0002\u0002\u0002\u0068\u032e\u0003\u0002\u0002\u0002\u006a\u0341\u0003\u0002\u0002\u0002\u006c\u0343\u0003\u0002\u0002\u0002\u006e\u034b\u0003\u0002\u0002\u0002\u0070\u0351\u0003\u0002\u0002\u0002\u0072\u0364\u0003\u0002\u0002\u0002\u0074\u037c\u0003\u0002\u0002\u0002\u0076\u0382\u0003\u0002\u0002\u0002\u0078\u0384\u0003\u0002\u0002\u0002\u007a\u0386\u0003\u0002\u0002\u0002\u007c\u038a\u0003\u0002\u0002\u0002\u007e\u0395\u0003\u0002\u0002\u0002\u0080\u039a\u0003\u0002\u0002\u0002\u0082\u039f\u0003\u0002\u0002\u0002\u0084\u03ac\u0003\u0002\u0002\u0002\u0086\u03ae\u0003\u0002\u0002\u0002\u0088\u03b1\u0003\u0002\u0002\u0002\u008a\u03b3\u0003\u0002\u0002\u0002\u008c\u03c6\u0003\u0002\u0002\u0002\u008e\u03d7\u0003\u0002\u0002\u0002\u0090\u03de\u0003\u0002\u0002\u0002\u0092\u03e4\u0003\u0002\u0002\u0002\u0094\u0096\u0005\u0016\u000c\u0002\u0095\u0094\u0003\u0002\u0002\u0002\u0095\u0096\u0003\u0002\u0002\u0002\u0096\u009a\u0003\u0002\u0002\u0002\u0097\u0099\u0005\u0006\u0004\u0002\u0098\u0097\u0003\u0002\u0002\u0002\u0099\u009c\u0003\u0002\u0002\u0002\u009a\u0098\u0003\u0002\u0002\u0002\u009a\u009b\u0003\u0002\u0002\u0002\u009b\u00a2\u0003\u0002\u0002\u0002\u009c\u009a\u0003\u0002\u0002\u0002\u009d\u00a1\u0005\u0004\u0003\u0002\u009e\u00a1\u0005\u008e\u0048\u0002\u009f\u00a1\u0005\u008a\u0046\u0002\u00a0\u009d\u0003\u0002\u0002\u0002\u00a0\u009e\u0003\u0002\u0002\u0002\u00a0\u009f\u0003\u0002\u0002\u0002\u00a1\u00a4\u0003\u0002\u0002\u0002\u00a2\u00a0\u0003\u0002\u0002\u0002\u00a2\u00a3\u0003\u0002\u0002\u0002\u00a3\u0003\u0003\u0002\u0002\u0002\u00a4\u00a2\u0003\u0002\u0002\u0002\u00a5\u00a9\u0005\u0034\u001b\u0002\u00a6\u00a7\u0007\u003e\u0002\u0002\u00a7\u00a9\u0005\u005a\u002e\u0002\u00a8\u00a5\u0003\u0002\u0002\u0002\u00a8\u00a6\u0003\u0002\u0002\u0002\u00a9\u0005\u0003\u0002\u0002\u0002\u00aa\u00ab\u0007\u000d\u0002\u0002\u00ab\u00ad\u0005\u0014\u000b\u0002\u00ac\u00ae\u0005\u0012\u000a\u0002\u00ad\u00ac\u0003\u0002\u0002\u0002\u00ad\u00ae\u0003\u0002\u0002\u0002\u00ae\u00b0\u0003\u0002\u0002\u0002\u00af\u00b1\u0005\u0010\u0009\u0002\u00b0\u00af\u0003\u0002\u0002\u0002\u00b0\u00b1\u0003\u0002\u0002\u0002\u00b1\u00b3\u0003\u0002\u0002\u0002\u00b2\u00b4\u0005\u0008\u0005\u0002\u00b3\u00b2\u0003\u0002\u0002\u0002\u00b3\u00b4\u0003\u0002\u0002\u0002\u00b4\u0007\u0003\u0002\u0002\u0002\u00b5\u00b9\u0007\u0033\u0002\u0002\u00b6\u00b8\u0005\u000a\u0006\u0002\u00b7\u00b6\u0003\u0002\u0002\u0002\u00b8\u00bb\u0003\u0002\u0002\u0002\u00b9\u00b7\u0003\u0002\u0002\u0002\u00b9\u00ba\u0003\u0002\u0002\u0002\u00ba\u00bc\u0003\u0002\u0002\u0002\u00bb\u00b9\u0003\u0002\u0002\u0002\u00bc\u00bd\u0007\u0034\u0002\u0002\u00bd\u0009\u0003\u0002\u0002\u0002\u00be\u00c1\u0007\u0040\u0002\u0002\u00bf\u00c0\u0007\u003e\u0002\u0002\u00c0\u00c2\u0005\u000c\u0007\u0002\u00c1\u00bf\u0003\u0002\u0002\u0002\u00c1\u00c2\u0003\u0002\u0002\u0002\u00c2\u00c5\u0003\u0002\u0002\u0002\u00c3\u00c4\u0007\u0038\u0002\u0002\u00c4\u00c6\u0005\u000e\u0008\u0002\u00c5\u00c3\u0003\u0002\u0002\u0002\u00c5\u00c6\u0003\u0002\u0002\u0002\u00c6\u00d6\u0003\u0002\u0002\u0002\u00c7\u00c8\u0007\u0008\u0002\u0002\u00c8\u00cb\u0007\u0040\u0002\u0002\u00c9\u00ca\u0007\u003e\u0002\u0002\u00ca\u00cc\u0005\u000c\u0007\u0002\u00cb\u00c9\u0003\u0002\u0002\u0002\u00cb\u00cc\u0003\u0002\u0002\u0002\u00cc\u00d6\u0003\u0002\u0002\u0002\u00cd\u00ce\u0007\u0008\u0002\u0002\u00ce\u00cf\u0007\u003c\u0002\u0002\u00cf\u00d0\u0007\u0040\u0002\u0002\u00d0\u00d3\u0007\u003c\u0002\u0002\u00d1\u00d2\u0007\u003e\u0002\u0002\u00d2\u00d4\u0005\u000c\u0007\u0002\u00d3\u00d1\u0003\u0002\u0002\u0002\u00d3\u00d4\u0003\u0002\u0002\u0002\u00d4\u00d6\u0003\u0002\u0002\u0002\u00d5\u00be\u0003\u0002\u0002\u0002\u00d5\u00c7\u0003\u0002\u0002\u0002\u00d5\u00cd\u0003\u0002\u0002\u0002\u00d6\u000b\u0003\u0002\u0002\u0002\u00d7\u00d8\u0007\u0040\u0002\u0002\u00d8\u000d\u0003\u0002\u0002\u0002\u00d9\u00da\u0005\u0072\u003a\u0002\u00da\u000f\u0003\u0002\u0002\u0002\u00db\u00dc\u0007\u002f\u0002\u0002\u00dc\u00dd\u0007\u001b\u0002\u0002\u00dd\u00de\u0007\u0045\u0002\u0002\u00de\u00df\u0007\u0030\u0002\u0002\u00df\u0011\u0003\u0002\u0002\u0002\u00e0\u00e1\u0007\u003e\u0002\u0002\u00e1\u00e2\u0007\u0040\u0002\u0002\u00e2\u0013\u0003\u0002\u0002\u0002\u00e3\u00e8\u0007\u0040\u0002\u0002\u00e4\u00e5\u0007\u002e\u0002\u0002\u00e5\u00e7\u0007\u0040\u0002\u0002\u00e6\u00e4\u0003\u0002\u0002\u0002\u00e7\u00ea\u0003\u0002\u0002\u0002\u00e8\u00e6\u0003\u0002\u0002\u0002\u00e8\u00e9\u0003\u0002\u0002\u0002\u00e9\u0015\u0003\u0002\u0002\u0002\u00ea\u00e8\u0003\u0002\u0002\u0002\u00eb\u00ec\u0007\u000b\u0002\u0002\u00ec\u00ed\u0005\u0014\u000b\u0002\u00ed\u0017\u0003\u0002\u0002\u0002\u00ee\u00ef\u0007\u0009\u0002\u0002\u00ef\u00f3\u0007\u0033\u0002\u0002\u00f0\u00f2\u0005\u001a\u000e\u0002\u00f1\u00f0\u0003\u0002\u0002\u0002\u00f2\u00f5\u0003\u0002\u0002\u0002\u00f3\u00f1\u0003\u0002\u0002\u0002\u00f3\u00f4\u0003\u0002\u0002\u0002\u00f4\u00f6\u0003\u0002\u0002\u0002\u00f5\u00f3\u0003\u0002\u0002\u0002\u00f6\u00f7\u0007\u0034\u0002\u0002\u00f7\u0019\u0003\u0002\u0002\u0002\u00f8\u00fc\u0005\u001e\u0010\u0002\u00f9\u00fc\u0005\u003a\u001e\u0002\u00fa\u00fc\u0005\u001c\u000f\u0002\u00fb\u00f8\u0003\u0002\u0002\u0002\u00fb\u00f9\u0003\u0002\u0002\u0002\u00fb\u00fa\u0003\u0002\u0002\u0002\u00fc\u001b\u0003\u0002\u0002\u0002\u00fd\u00fe\u0007\u0010\u0002\u0002\u00fe\u00ff\u0005\u003a\u001e\u0002\u00ff\u001d\u0003\u0002\u0002\u0002\u0100\u0101\u0007\u003e\u0002\u0002\u0101\u0102\u0007\u0040\u0002\u0002\u0102\u0103\u0007\u002c\u0002\u0002\u0103\u010b\u0005\u003a\u001e\u0002\u0104\u0105\u0005\u003a\u001e\u0002\u0105\u0106\u0007\u003b\u0002\u0002\u0106\u0107\u0007\u0040\u0002\u0002\u0107\u0108\u0007\u002c\u0002\u0002\u0108\u0109\u0005\u003a\u001e\u0002\u0109\u010b\u0003\u0002\u0002\u0002\u010a\u0100\u0003\u0002\u0002\u0002\u010a\u0104\u0003\u0002\u0002\u0002\u010b\u001f\u0003\u0002\u0002\u0002\u010c\u010e\u0005\u0092\u004a\u0002\u010d\u010c\u0003\u0002\u0002\u0002\u010d\u010e\u0003\u0002\u0002\u0002\u010e\u0110\u0003\u0002\u0002\u0002\u010f\u0111\u0007\u0006\u0002\u0002\u0110\u010f\u0003\u0002\u0002\u0002\u0110\u0111\u0003\u0002\u0002\u0002\u0111\u0113\u0003\u0002\u0002\u0002\u0112\u0114\u0007\u0012\u0002\u0002\u0113\u0112\u0003\u0002\u0002\u0002\u0113\u0114\u0003\u0002\u0002\u0002\u0114\u0115\u0003\u0002\u0002\u0002\u0115\u0116\u0007\u0008\u0002\u0002\u0116\u011b\u0007\u0040\u0002\u0002\u0117\u0118\u0007\u002f\u0002\u0002\u0118\u0119\u0005\u0030\u0019\u0002\u0119\u011a\u0007\u0030\u0002\u0002\u011a\u011c\u0003\u0002\u0002\u0002\u011b\u0117\u0003\u0002\u0002\u0002\u011b\u011c\u0003\u0002\u0002\u0002\u011c\u011d\u0003\u0002\u0002\u0002\u011d\u0122\u0007\u0033\u0002\u0002\u011e\u011f\u0007\u003b\u0002\u0002\u011f\u0121\u0005\u0028\u0015\u0002\u0120\u011e\u0003\u0002\u0002\u0002\u0121\u0124\u0003\u0002\u0002\u0002\u0122\u0120\u0003\u0002\u0002\u0002\u0122\u0123\u0003\u0002\u0002\u0002\u0123\u012c\u0003\u0002\u0002\u0002\u0124\u0122\u0003\u0002\u0002\u0002\u0125\u0128\u0007\u0039\u0002\u0002\u0126\u0129\u0005\u0026\u0014\u0002\u0127\u0129\u0005\u0062\u0032\u0002\u0128\u0126\u0003\u0002\u0002\u0002\u0128\u0127\u0003\u0002\u0002\u0002\u0129\u012b\u0003\u0002\u0002\u0002\u012a\u0125\u0003\u0002\u0002\u0002\u012b\u012e\u0003\u0002\u0002\u0002\u012c\u012a\u0003\u0002\u0002\u0002\u012c\u012d\u0003\u0002\u0002\u0002\u012d\u0132\u0003\u0002\u0002\u0002\u012e\u012c\u0003\u0002\u0002\u0002\u012f\u0131\u0005\u002c\u0017\u0002\u0130\u012f\u0003\u0002\u0002\u0002\u0131\u0134\u0003\u0002\u0002\u0002\u0132\u0130\u0003\u0002\u0002\u0002\u0132\u0133\u0003\u0002\u0002\u0002\u0133\u0135\u0003\u0002\u0002\u0002\u0134\u0132\u0003\u0002\u0002\u0002\u0135\u0190\u0007\u0034\u0002\u0002\u0136\u0138\u0005\u0092\u004a\u0002\u0137\u0136\u0003\u0002\u0002\u0002\u0137\u0138\u0003\u0002\u0002\u0002\u0138\u013a\u0003\u0002\u0002\u0002\u0139\u013b\u0007\u0013\u0002\u0002\u013a\u0139\u0003\u0002\u0002\u0002\u013a\u013b\u0003\u0002\u0002\u0002\u013b\u013c\u0003\u0002\u0002\u0002\u013c\u013d\u0007\u0008\u0002\u0002\u013d\u0142\u0007\u0040\u0002\u0002\u013e\u013f\u0007\u002f\u0002\u0002\u013f\u0140\u0005\u0030\u0019\u0002\u0140\u0141\u0007\u0030\u0002\u0002\u0141\u0143\u0003\u0002\u0002\u0002\u0142\u013e\u0003\u0002\u0002\u0002\u0142\u0143\u0003\u0002\u0002\u0002\u0143\u0144\u0003\u0002\u0002\u0002\u0144\u0145\u0007\u0033\u0002\u0002\u0145\u014a\u0005\u0024\u0013\u0002\u0146\u0147\u0007\u003b\u0002\u0002\u0147\u0149\u0005\u005a\u002e\u0002\u0148\u0146\u0003\u0002\u0002\u0002\u0149\u014c\u0003\u0002\u0002\u0002\u014a\u0148\u0003\u0002\u0002\u0002\u014a\u014b\u0003\u0002\u0002\u0002\u014b\u0151\u0003\u0002\u0002\u0002\u014c\u014a\u0003\u0002\u0002\u0002\u014d\u014e\u0007\u0039\u0002\u0002\u014e\u0150\u0005\u0062\u0032\u0002\u014f\u014d\u0003\u0002\u0002\u0002\u0150\u0153\u0003\u0002\u0002\u0002\u0151\u014f\u0003\u0002\u0002\u0002\u0151\u0152\u0003\u0002\u0002\u0002\u0152\u0155\u0003\u0002\u0002\u0002\u0153\u0151\u0003\u0002\u0002\u0002\u0154\u0156\u0005\u002a\u0016\u0002\u0155\u0154\u0003\u0002\u0002\u0002\u0155\u0156\u0003\u0002\u0002\u0002\u0156\u015a\u0003\u0002\u0002\u0002\u0157\u0159\u0005\u002c\u0017\u0002\u0158\u0157\u0003\u0002\u0002\u0002\u0159\u015c\u0003\u0002\u0002\u0002\u015a\u0158\u0003\u0002\u0002\u0002\u015a\u015b\u0003\u0002\u0002\u0002\u015b\u015d\u0003\u0002\u0002\u0002\u015c\u015a\u0003\u0002\u0002\u0002\u015d\u015e\u0007\u0034\u0002\u0002\u015e\u0190\u0003\u0002\u0002\u0002\u015f\u0161\u0005\u0092\u004a\u0002\u0160\u015f\u0003\u0002\u0002\u0002\u0160\u0161\u0003\u0002\u0002\u0002\u0161\u0163\u0003\u0002\u0002\u0002\u0162\u0164\u0007\u0006\u0002\u0002\u0163\u0162\u0003\u0002\u0002\u0002\u0163\u0164\u0003\u0002\u0002\u0002\u0164\u0166\u0003\u0002\u0002\u0002\u0165\u0167\u0007\u0013\u0002\u0002\u0166\u0165\u0003\u0002\u0002\u0002\u0166\u0167\u0003\u0002\u0002\u0002\u0167\u0168\u0003\u0002\u0002\u0002\u0168\u0169\u0007\u0008\u0002\u0002\u0169\u016e\u0007\u0040\u0002\u0002\u016a\u016b\u0007\u002f\u0002\u0002\u016b\u016c\u0005\u0030\u0019\u0002\u016c\u016d\u0007\u0030\u0002\u0002\u016d\u016f\u0003\u0002\u0002\u0002\u016e\u016a\u0003\u0002\u0002\u0002\u016e\u016f\u0003\u0002\u0002\u0002\u016f\u0170\u0003\u0002\u0002\u0002\u0170\u0172\u0007\u0033\u0002\u0002\u0171\u0173\u0005\u0024\u0013\u0002\u0172\u0171\u0003\u0002\u0002\u0002\u0172\u0173\u0003\u0002\u0002\u0002\u0173\u0178\u0003\u0002\u0002\u0002\u0174\u0175\u0007\u003b\u0002\u0002\u0175\u0177\u0005\u005a\u002e\u0002\u0176\u0174\u0003\u0002\u0002\u0002\u0177\u017a\u0003\u0002\u0002\u0002\u0178\u0176\u0003\u0002\u0002\u0002\u0178\u0179\u0003\u0002\u0002\u0002\u0179\u0182\u0003\u0002\u0002\u0002\u017a\u0178\u0003\u0002\u0002\u0002\u017b\u017e\u0007\u0039\u0002\u0002\u017c\u017f\u0005\u0026\u0014\u0002\u017d\u017f\u0005\u0062\u0032\u0002\u017e\u017c\u0003\u0002\u0002\u0002\u017e\u017d\u0003\u0002\u0002\u0002\u017f\u0181\u0003\u0002\u0002\u0002\u0180\u017b\u0003\u0002\u0002\u0002\u0181\u0184\u0003\u0002\u0002\u0002\u0182\u0180\u0003\u0002\u0002\u0002\u0182\u0183\u0003\u0002\u0002\u0002\u0183\u0186\u0003\u0002\u0002\u0002\u0184\u0182\u0003\u0002\u0002\u0002\u0185\u0187\u0005\u002a\u0016\u0002\u0186\u0185\u0003\u0002\u0002\u0002\u0186\u0187\u0003\u0002\u0002\u0002\u0187\u018b\u0003\u0002\u0002\u0002\u0188\u018a\u0005\u002c\u0017\u0002\u0189\u0188\u0003\u0002\u0002\u0002\u018a\u018d\u0003\u0002\u0002\u0002\u018b\u0189\u0003\u0002\u0002\u0002\u018b\u018c\u0003\u0002\u0002\u0002\u018c\u018e\u0003\u0002\u0002\u0002\u018d\u018b\u0003\u0002\u0002\u0002\u018e\u0190\u0007\u0034\u0002\u0002\u018f\u010d\u0003\u0002\u0002\u0002\u018f\u0137\u0003\u0002\u0002\u0002\u018f\u0160\u0003\u0002\u0002\u0002\u0190\u0021\u0003\u0002\u0002\u0002\u0191\u0193\u0007\u0040\u0002\u0002\u0192\u0194\u0005\u0048\u0025\u0002\u0193\u0192\u0003\u0002\u0002\u0002\u0193\u0194\u0003\u0002\u0002\u0002\u0194\u0196\u0003\u0002\u0002\u0002\u0195\u0197\u0005\u0018\u000d\u0002\u0196\u0195\u0003\u0002\u0002\u0002\u0196\u0197\u0003\u0002\u0002\u0002\u0197\u0023\u0003\u0002\u0002\u0002\u0198\u019a\u0005\u0048\u0025\u0002\u0199\u0198\u0003\u0002\u0002\u0002\u0199\u019a\u0003\u0002\u0002\u0002\u019a\u019c\u0003\u0002\u0002\u0002\u019b\u019d\u0005\u0018\u000d\u0002\u019c\u019b\u0003\u0002\u0002\u0002\u019c\u019d\u0003\u0002\u0002\u0002\u019d\u0025\u0003\u0002\u0002\u0002\u019e\u01a0\u0005\u0092\u004a\u0002\u019f\u019e\u0003\u0002\u0002\u0002\u019f\u01a0\u0003\u0002\u0002\u0002\u01a0\u01a1\u0003\u0002\u0002\u0002\u01a1\u01a3\u0005\u0054\u002b\u0002\u01a2\u01a4\u0005\u0030\u0019\u0002\u01a3\u01a2\u0003\u0002\u0002\u0002\u01a3\u01a4\u0003\u0002\u0002\u0002\u01a4\u01a6\u0003\u0002\u0002\u0002\u01a5\u01a7\u0005\u0048\u0025\u0002\u01a6\u01a5\u0003\u0002\u0002\u0002\u01a6\u01a7\u0003\u0002\u0002\u0002\u01a7\u01a8\u0003\u0002\u0002\u0002\u01a8\u01a9\u0005\u0072\u003a\u0002\u01a9\u0027\u0003\u0002\u0002\u0002\u01aa\u01ab\u0007\u002f\u0002\u0002\u01ab\u01ac\u0007\u0006\u0002\u0002\u01ac\u01ad\u0007\u0030\u0002\u0002\u01ad\u01ae\u0003\u0002\u0002\u0002\u01ae\u01af\u0005\u005c\u002f\u0002\u01af\u0029\u0003\u0002\u0002\u0002\u01b0\u01b2\u0007\u000f\u0002\u0002\u01b1\u01b3\u0005\u0050\u0029\u0002\u01b2\u01b1\u0003\u0002\u0002\u0002\u01b2\u01b3\u0003\u0002\u0002\u0002\u01b3\u01b4\u0003\u0002\u0002\u0002\u01b4\u01b5\u0005\u002c\u0017\u0002\u01b5\u002b\u0003\u0002\u0002\u0002\u01b6\u01b7\u0007\u000e\u0002\u0002\u01b7\u01b9\u0005\u0072\u003a\u0002\u01b8\u01ba\u0005\u002e\u0018\u0002\u01b9\u01b8\u0003\u0002\u0002\u0002\u01b9\u01ba\u0003\u0002\u0002\u0002\u01ba\u002d\u0003\u0002\u0002\u0002\u01bb\u01c0\u0007\u0033\u0002\u0002\u01bc\u01bd\u0007\u003b\u0002\u0002\u01bd\u01bf\u0005\u005a\u002e\u0002\u01be\u01bc\u0003\u0002\u0002\u0002\u01bf\u01c2\u0003\u0002\u0002\u0002\u01c0\u01be\u0003\u0002\u0002\u0002\u01c0\u01c1\u0003\u0002\u0002\u0002\u01c1\u01c7\u0003\u0002\u0002\u0002\u01c2\u01c0\u0003\u0002\u0002\u0002\u01c3\u01c4\u0007\u0039\u0002\u0002\u01c4\u01c6\u0005\u0062\u0032\u0002\u01c5\u01c3\u0003\u0002\u0002\u0002\u01c6\u01c9\u0003\u0002\u0002\u0002\u01c7\u01c5\u0003\u0002\u0002\u0002\u01c7\u01c8\u0003\u0002\u0002\u0002\u01c8\u01ca\u0003\u0002\u0002\u0002\u01c9\u01c7\u0003\u0002\u0002\u0002\u01ca\u01cb\u0007\u0034\u0002\u0002\u01cb\u002f\u0003\u0002\u0002\u0002\u01cc\u01ce\u0005\u0032\u001a\u0002\u01cd\u01cc\u0003\u0002\u0002\u0002\u01ce\u01cf\u0003\u0002\u0002\u0002\u01cf\u01cd\u0003\u0002\u0002\u0002\u01cf\u01d0\u0003\u0002\u0002\u0002\u01d0\u0031\u0003\u0002\u0002\u0002\u01d1\u01d6\u0007\u0040\u0002\u0002\u01d2\u01d3\u0007\u0037\u0002\u0002\u01d3\u01d5\u0005\u0072\u003a\u0002\u01d4\u01d2\u0003\u0002\u0002\u0002\u01d5\u01d8\u0003\u0002\u0002\u0002\u01d6\u01d4\u0003\u0002\u0002\u0002\u01d6\u01d7\u0003\u0002\u0002\u0002\u01d7\u0033\u0003\u0002\u0002\u0002\u01d8\u01d6\u0003\u0002\u0002\u0002\u01d9\u01dc\u0005\u0062\u0032\u0002\u01da\u01dc\u0005\u0020\u0011\u0002\u01db\u01d9\u0003\u0002\u0002\u0002\u01db\u01da\u0003\u0002\u0002\u0002\u01dc\u0035\u0003\u0002\u0002\u0002\u01dd\u01e2\u0007\u0042\u0002\u0002\u01de\u01e2\u0007\u0043\u0002\u0002\u01df\u01e2\u0007\u0044\u0002\u0002\u01e0\u01e2\u0005\u0038\u001d\u0002\u01e1\u01dd\u0003\u0002\u0002\u0002\u01e1\u01de\u0003\u0002\u0002\u0002\u01e1\u01df\u0003\u0002\u0002\u0002\u01e1\u01e0\u0003\u0002\u0002\u0002\u01e2\u0037\u0003\u0002\u0002\u0002\u01e3\u01e4\u0009\u0002\u0002\u0002\u01e4\u0039\u0003\u0002\u0002\u0002\u01e5\u01e6\u0008\u001e\u0001\u0002\u01e6\u0222\u0005\u0036\u001c\u0002\u01e7\u0222\u0007\u0028\u0002\u0002\u01e8\u01e9\u0007\u0035\u0002\u0002\u01e9\u01ec\u0009\u0003\u0002\u0002\u01ea\u01ec\u0007\u0036\u0002\u0002\u01eb\u01e8\u0003\u0002\u0002\u0002\u01eb\u01ea\u0003\u0002\u0002\u0002\u01ec\u0222\u0003\u0002\u0002\u0002\u01ed\u01ee\u0007\u003c\u0002\u0002\u01ee\u0222\u0005\u003c\u001f\u0002\u01ef\u01f1\u0005\u003c\u001f\u0002\u01f0\u01f2\u0005\u0050\u0029\u0002\u01f1\u01f0\u0003\u0002\u0002\u0002\u01f1\u01f2\u0003\u0002\u0002\u0002\u01f2\u0222\u0003\u0002\u0002\u0002\u01f3\u01f4\u0007\u0018\u0002\u0002\u01f4\u01f6\u0005\u003c\u001f\u0002\u01f5\u01f7\u0005\u0050\u0029\u0002\u01f6\u01f5\u0003\u0002\u0002\u0002\u01f6\u01f7\u0003\u0002\u0002\u0002\u01f7\u0222\u0003\u0002\u0002\u0002\u01f8\u01f9\u0007\u003e\u0002\u0002\u01f9\u0222\u0005\u003c\u001f\u0002\u01fa\u01fb\u0007\u0018\u0002\u0002\u01fb\u0200\u0007\u0033\u0002\u0002\u01fc\u01fd\u0007\u003b\u0002\u0002\u01fd\u01ff\u0005\u005a\u002e\u0002\u01fe\u01fc\u0003\u0002\u0002\u0002\u01ff\u0202\u0003\u0002\u0002\u0002\u0200\u01fe\u0003\u0002\u0002\u0002\u0200\u0201\u0003\u0002\u0002\u0002\u0201\u0207\u0003\u0002\u0002\u0002\u0202\u0200\u0003\u0002\u0002\u0002\u0203\u0204\u0007\u0039\u0002\u0002\u0204\u0206\u0005\u0062\u0032\u0002\u0205\u0203\u0003\u0002\u0002\u0002\u0206\u0209\u0003\u0002\u0002\u0002\u0207\u0205\u0003\u0002\u0002\u0002\u0207\u0208\u0003\u0002\u0002\u0002\u0208\u020b\u0003\u0002\u0002\u0002\u0209\u0207\u0003\u0002\u0002\u0002\u020a\u020c\u0005\u002a\u0016\u0002\u020b\u020a\u0003\u0002\u0002\u0002\u020b\u020c\u0003\u0002\u0002\u0002\u020c\u0210\u0003\u0002\u0002\u0002\u020d\u020f\u0005\u002c\u0017\u0002\u020e\u020d\u0003\u0002\u0002\u0002\u020f\u0212\u0003\u0002\u0002\u0002\u0210\u020e\u0003\u0002\u0002\u0002\u0210\u0211\u0003\u0002\u0002\u0002\u0211\u0213\u0003\u0002\u0002\u0002\u0212\u0210\u0003\u0002\u0002\u0002\u0213\u0222\u0007\u0034\u0002\u0002\u0214\u0216\u0007\u0037\u0002\u0002\u0215\u0214\u0003\u0002\u0002\u0002\u0215\u0216\u0003\u0002\u0002\u0002\u0216\u0217\u0003\u0002\u0002\u0002\u0217\u0218\u0007\u0041\u0002\u0002\u0218\u0222\u0005\u003a\u001e\u000c\u0219\u0222\u0005\u0040\u0021\u0002\u021a\u0222\u0005\u0042\u0022\u0002\u021b\u0222\u0005\u0018\u000d\u0002\u021c\u0222\u0005\u006c\u0037\u0002\u021d\u021e\u0007\u002f\u0002\u0002\u021e\u021f\u0005\u003a\u001e\u0002\u021f\u0220\u0007\u0030\u0002\u0002\u0220\u0222\u0003\u0002\u0002\u0002\u0221\u01e5\u0003\u0002\u0002\u0002\u0221\u01e7\u0003\u0002\u0002\u0002\u0221\u01eb\u0003\u0002\u0002\u0002\u0221\u01ed\u0003\u0002\u0002\u0002\u0221\u01ef\u0003\u0002\u0002\u0002\u0221\u01f3\u0003\u0002\u0002\u0002\u0221\u01f8\u0003\u0002\u0002\u0002\u0221\u01fa\u0003\u0002\u0002\u0002\u0221\u0215\u0003\u0002\u0002\u0002\u0221\u0219\u0003\u0002\u0002\u0002\u0221\u021a\u0003\u0002\u0002\u0002\u0221\u021b\u0003\u0002\u0002\u0002\u0221\u021c\u0003\u0002\u0002\u0002\u0221\u021d\u0003\u0002\u0002\u0002\u0222\u024a\u0003\u0002\u0002\u0002\u0223\u0224\u000c\u000b\u0002\u0002\u0224\u0225\u0007\u0041\u0002\u0002\u0225\u0249\u0005\u003a\u001e\u000c\u0226\u0227\u000c\u0009\u0002\u0002\u0227\u0228\u0007\u0016\u0002\u0002\u0228\u0249\u0005\u003a\u001e\u000a\u0229\u022a\u000c\u0008\u0002\u0002\u022a\u022b\u0007\u003f\u0002\u0002\u022b\u0249\u0005\u003a\u001e\u0009\u022c\u022d\u000c\u0013\u0002\u0002\u022d\u0249\u0005\u003e\u0020\u0002\u022e\u022f\u000c\u0012\u0002\u0002\u022f\u0230\u0007\u003b\u0002\u0002\u0230\u0249\u0007\u0040\u0002\u0002\u0231\u0232\u000c\u0011\u0002\u0002\u0232\u0233\u0007\u0039\u0002\u0002\u0233\u0235\u0007\u0040\u0002\u0002\u0234\u0236\u0005\u0050\u0029\u0002\u0235\u0234\u0003\u0002\u0002\u0002\u0235\u0236\u0003\u0002\u0002\u0002\u0236\u0249\u0003\u0002\u0002\u0002\u0237\u0238\u000c\u0010\u0002\u0002\u0238\u0239\u0007\u003d\u0002\u0002\u0239\u0249\u0007\u0040\u0002\u0002\u023a\u023b\u000c\u000f\u0002\u0002\u023b\u023c\u0007\u003a\u0002\u0002\u023c\u023e\u0007\u0040\u0002\u0002\u023d\u023f\u0005\u0050\u0029\u0002\u023e\u023d\u0003\u0002\u0002\u0002\u023e\u023f\u0003\u0002\u0002\u0002\u023f\u0249\u0003\u0002\u0002\u0002\u0240\u0241\u000c\u000e\u0002\u0002\u0241\u0249\u0005\u0052\u002a\u0002\u0242\u0243\u000c\u000d\u0002\u0002\u0243\u0244\u0007\u003c\u0002\u0002\u0244\u0249\u0007\u0041\u0002\u0002\u0245\u0246\u000c\u000a\u0002\u0002\u0246\u0247\u0007\u001c\u0002\u0002\u0247\u0249\u0005\u0072\u003a\u0002\u0248\u0223\u0003\u0002\u0002\u0002\u0248\u0226\u0003\u0002\u0002\u0002\u0248\u0229\u0003\u0002\u0002\u0002\u0248\u022c\u0003\u0002\u0002\u0002\u0248\u022e\u0003\u0002\u0002\u0002\u0248\u0231\u0003\u0002\u0002\u0002\u0248\u0237\u0003\u0002\u0002\u0002\u0248\u023a\u0003\u0002\u0002\u0002\u0248\u0240\u0003\u0002\u0002\u0002\u0248\u0242\u0003\u0002\u0002\u0002\u0248\u0245\u0003\u0002\u0002\u0002\u0249\u024c\u0003\u0002\u0002\u0002\u024a\u0248\u0003\u0002\u0002\u0002\u024a\u024b\u0003\u0002\u0002\u0002\u024b\u003b\u0003\u0002\u0002\u0002\u024c\u024a\u0003\u0002\u0002\u0002\u024d\u024e\u0005\u0014\u000b\u0002\u024e\u024f\u0007\u002e\u0002\u0002\u024f\u0251\u0003\u0002\u0002\u0002\u0250\u024d\u0003\u0002\u0002\u0002\u0250\u0251\u0003\u0002\u0002\u0002\u0251\u0252\u0003\u0002\u0002\u0002\u0252\u0253\u0005\u0054\u002b\u0002\u0253\u003d\u0003\u0002\u0002\u0002\u0254\u0255\u0007\u002f\u0002\u0002\u0255\u0256\u0007\u0037\u0002\u0002\u0256\u0257\u0005\u0072\u003a\u0002\u0257\u0258\u0007\u0030\u0002\u0002\u0258\u003f\u0003\u0002\u0002\u0002\u0259\u025a\u0007\u0016\u0002\u0002\u025a\u025b\u0007\u002f\u0002\u0002\u025b\u025c\u0005\u003a\u001e\u0002\u025c\u025d\u0007\u0030\u0002\u0002\u025d\u025e\u0005\u003a\u001e\u0002\u025e\u025f\u0007\u0017\u0002\u0002\u025f\u0260\u0005\u003a\u001e\u0002\u0260\u0041\u0003\u0002\u0002\u0002\u0261\u0262\u0007\u0019\u0002\u0002\u0262\u0263\u0005\u003a\u001e\u0002\u0263\u0264\u0007\u002c\u0002\u0002\u0264\u0265\u0005\u003a\u001e\u0002\u0265\u0266\u0005\u003a\u001e\u0002\u0266\u0043\u0003\u0002\u0002\u0002\u0267\u0269\u0007\u0040\u0002\u0002\u0268\u026a\u0007\u002d\u0002\u0002\u0269\u0268\u0003\u0002\u0002\u0002\u0269\u026a\u0003\u0002\u0002\u0002\u026a\u026b\u0003\u0002\u0002\u0002\u026b\u026c\u0007\u0037\u0002\u0002\u026c\u026d\u0005\u0072\u003a\u0002\u026d\u0045\u0003\u0002\u0002\u0002\u026e\u0270\u0005\u004c\u0027\u0002\u026f\u026e\u0003\u0002\u0002\u0002\u026f\u0270\u0003\u0002\u0002\u0002\u0270\u0271\u0003\u0002\u0002\u0002\u0271\u0272\u0005\u003a\u001e\u0002\u0272\u0273\u0007\u0037\u0002\u0002\u0273\u0274\u0005\u0072\u003a\u0002\u0274\u0047\u0003\u0002\u0002\u0002\u0275\u0277\u0007\u002f\u0002\u0002\u0276\u0278\u0005\u0044\u0023\u0002\u0277\u0276\u0003\u0002\u0002\u0002\u0278\u0279\u0003\u0002\u0002\u0002\u0279\u0277\u0003\u0002\u0002\u0002\u0279\u027a\u0003\u0002\u0002\u0002\u027a\u027c\u0003\u0002\u0002\u0002\u027b\u027d\u0005\u004a\u0026\u0002\u027c\u027b\u0003\u0002\u0002\u0002\u027c\u027d\u0003\u0002\u0002\u0002\u027d\u027e\u0003\u0002\u0002\u0002\u027e\u027f\u0007\u0030\u0002\u0002\u027f\u0049\u0003\u0002\u0002\u0002\u0280\u0282\u0007\u001b\u0002\u0002\u0281\u0283\u0005\u0046\u0024\u0002\u0282\u0281\u0003\u0002\u0002\u0002\u0283\u0284\u0003\u0002\u0002\u0002\u0284\u0282\u0003\u0002\u0002\u0002\u0284\u0285\u0003\u0002\u0002\u0002\u0285\u004b\u0003\u0002\u0002\u0002\u0286\u0287\u0007\u002f\u0002\u0002\u0287\u0288\u0007\u0040\u0002\u0002\u0288\u0289\u0007\u002c\u0002\u0002\u0289\u028a\u0007\u0030\u0002\u0002\u028a\u004d\u0003\u0002\u0002\u0002\u028b\u028c\u0007\u0040\u0002\u0002\u028c\u028e\u0007\u002c\u0002\u0002\u028d\u028b\u0003\u0002\u0002\u0002\u028d\u028e\u0003\u0002\u0002\u0002\u028e\u0290\u0003\u0002\u0002\u0002\u028f\u0291\u0007\u002d\u0002\u0002\u0290\u028f\u0003\u0002\u0002\u0002\u0290\u0291\u0003\u0002\u0002\u0002\u0291\u0292\u0003\u0002\u0002\u0002\u0292\u02a0\u0005\u003a\u001e\u0002\u0293\u0294\u0007\u0040\u0002\u0002\u0294\u0296\u0007\u002d\u0002\u0002\u0295\u0293\u0003\u0002\u0002\u0002\u0295\u0296\u0003\u0002\u0002\u0002\u0296\u0297\u0003\u0002\u0002\u0002\u0297\u029b\u0007\u0033\u0002\u0002\u0298\u029a\u0005\u003a\u001e\u0002\u0299\u0298\u0003\u0002\u0002\u0002\u029a\u029d\u0003\u0002\u0002\u0002\u029b\u0299\u0003\u0002\u0002\u0002\u029b\u029c\u0003\u0002\u0002\u0002\u029c\u029e\u0003\u0002\u0002\u0002\u029d\u029b\u0003\u0002\u0002\u0002\u029e\u02a0\u0007\u0034\u0002\u0002\u029f\u028d\u0003\u0002\u0002\u0002\u029f\u0295\u0003\u0002\u0002\u0002\u02a0\u004f\u0003\u0002\u0002\u0002\u02a1\u02a3\u0007\u002b\u0002\u0002\u02a2\u02a4\u0005\u0072\u003a\u0002\u02a3\u02a2\u0003\u0002\u0002\u0002\u02a4\u02a5\u0003\u0002\u0002\u0002\u02a5\u02a3\u0003\u0002\u0002\u0002\u02a5\u02a6\u0003\u0002\u0002\u0002\u02a6\u02a8\u0003\u0002\u0002\u0002\u02a7\u02a1\u0003\u0002\u0002\u0002\u02a7\u02a8\u0003\u0002\u0002\u0002\u02a8\u02a9\u0003\u0002\u0002\u0002\u02a9\u02ad\u0007\u002f\u0002\u0002\u02aa\u02ac\u0005\u004e\u0028\u0002\u02ab\u02aa\u0003\u0002\u0002\u0002\u02ac\u02af\u0003\u0002\u0002\u0002\u02ad\u02ab\u0003\u0002\u0002\u0002\u02ad\u02ae\u0003\u0002\u0002\u0002\u02ae\u02b0\u0003\u0002\u0002\u0002\u02af\u02ad\u0003\u0002\u0002\u0002\u02b0\u02c2\u0007\u0030\u0002\u0002\u02b1\u02b3\u0007\u002b\u0002\u0002\u02b2\u02b4\u0005\u0072\u003a\u0002\u02b3\u02b2\u0003\u0002\u0002\u0002\u02b4\u02b5\u0003\u0002\u0002\u0002\u02b5\u02b3\u0003\u0002\u0002\u0002\u02b5\u02b6\u0003\u0002\u0002\u0002\u02b6\u02b8\u0003\u0002\u0002\u0002\u02b7\u02b1\u0003\u0002\u0002\u0002\u02b7\u02b8\u0003\u0002\u0002\u0002\u02b8\u02b9\u0003\u0002\u0002\u0002\u02b9\u02bd\u0007\u0033\u0002\u0002\u02ba\u02bc\u0005\u003a\u001e\u0002\u02bb\u02ba\u0003\u0002\u0002\u0002\u02bc\u02bf\u0003\u0002\u0002\u0002\u02bd\u02bb\u0003\u0002\u0002\u0002\u02bd\u02be\u0003\u0002\u0002\u0002\u02be\u02c0\u0003\u0002\u0002\u0002\u02bf\u02bd\u0003\u0002\u0002\u0002\u02c0\u02c2\u0007\u0034\u0002\u0002\u02c1\u02a7\u0003\u0002\u0002\u0002\u02c1\u02b7\u0003\u0002\u0002\u0002\u02c2\u0051\u0003\u0002\u0002\u0002\u02c3\u02c4\u0007\u0039\u0002\u0002\u02c4\u02c8\u0007\u002f\u0002\u0002\u02c5\u02c7\u0005\u003a\u001e\u0002\u02c6\u02c5\u0003\u0002\u0002\u0002\u02c7\u02ca\u0003\u0002\u0002\u0002\u02c8\u02c6\u0003\u0002\u0002\u0002\u02c8\u02c9\u0003\u0002\u0002\u0002\u02c9\u02cb\u0003\u0002\u0002\u0002\u02ca\u02c8\u0003\u0002\u0002\u0002\u02cb\u02cc\u0007\u0030\u0002\u0002\u02cc\u0053\u0003\u0002\u0002\u0002\u02cd\u02d1\u0007\u0040\u0002\u0002\u02ce\u02d1\u0005\u0056\u002c\u0002\u02cf\u02d1\u0005\u0058\u002d\u0002\u02d0\u02cd\u0003\u0002\u0002\u0002\u02d0\u02ce\u0003\u0002\u0002\u0002\u02d0\u02cf\u0003\u0002\u0002\u0002\u02d1\u0055\u0003\u0002\u0002\u0002\u02d2\u02d3\u0007\u0031\u0002\u0002\u02d3\u02d4\u0007\u0041\u0002\u0002\u02d4\u02d5\u0007\u0032\u0002\u0002\u02d5\u0057\u0003\u0002\u0002\u0002\u02d6\u02d7\u0007\u0031\u0002\u0002\u02d7\u02d8\u0007\u0037\u0002\u0002\u02d8\u02d9\u0007\u0041\u0002\u0002\u02d9\u02da\u0007\u0032\u0002\u0002\u02da\u0059\u0003\u0002\u0002\u0002\u02db\u02df\u0005\u005e\u0030\u0002\u02dc\u02df\u0005\u005c\u002f\u0002\u02dd\u02df\u0005\u0060\u0031\u0002\u02de\u02db\u0003\u0002\u0002\u0002\u02de\u02dc\u0003\u0002\u0002\u0002\u02de\u02dd\u0003\u0002\u0002\u0002\u02df\u005b\u0003\u0002\u0002\u0002\u02e0\u02e1\u0007\u002f\u0002\u0002\u02e1\u02e2\u0007\u0011\u0002\u0002\u02e2\u02e4\u0007\u0030\u0002\u0002\u02e3\u02e0\u0003\u0002\u0002\u0002\u02e3\u02e4\u0003\u0002\u0002\u0002\u02e4\u02e5\u0003\u0002\u0002\u0002\u02e5\u02e6\u0007\u0040\u0002\u0002\u02e6\u02e7\u0005\u0072\u003a\u0002\u02e7\u005d\u0003\u0002\u0002\u0002\u02e8\u02e9\u0007\u002f\u0002\u0002\u02e9\u02ea\u0007\u0011\u0002\u0002\u02ea\u02ec\u0007\u0030\u0002\u0002\u02eb\u02e8\u0003\u0002\u0002\u0002\u02eb\u02ec\u0003\u0002\u0002\u0002\u02ec\u02ed\u0003\u0002\u0002\u0002\u02ed\u02ef\u0007\u0040\u0002\u0002\u02ee\u02f0\u0005\u0072\u003a\u0002\u02ef\u02ee\u0003\u0002\u0002\u0002\u02ef\u02f0\u0003\u0002\u0002\u0002\u02f0\u02f1\u0003\u0002\u0002\u0002\u02f1\u02f2\u0007\u002c\u0002\u0002\u02f2\u02f3\u0005\u003a\u001e\u0002\u02f3\u005f\u0003\u0002\u0002\u0002\u02f4\u02f5\u0007\u002f\u0002\u0002\u02f5\u02f6\u0007\u000a\u0002\u0002\u02f6\u02f7\u0007\u0030\u0002\u0002\u02f7\u02f8\u0007\u0040\u0002\u0002\u02f8\u02fb\u0005\u0072\u003a\u0002\u02f9\u02fa\u0007\u001d\u0002\u0002\u02fa\u02fc\u0005\u003a\u001e\u0002\u02fb\u02f9\u0003\u0002\u0002\u0002\u02fb\u02fc\u0003\u0002\u0002\u0002\u02fc\u02ff\u0003\u0002\u0002\u0002\u02fd\u02fe\u0007\u001e\u0002\u0002\u02fe\u0300\u0005\u003a\u001e\u0002\u02ff\u02fd\u0003\u0002\u0002\u0002\u02ff\u0300\u0003\u0002\u0002\u0002\u0300\u0061\u0003\u0002\u0002\u0002\u0301\u0305\u0005\u0064\u0033\u0002\u0302\u0304\u0005\u0068\u0035\u0002\u0303\u0302\u0003\u0002\u0002\u0002\u0304\u0307\u0003\u0002\u0002\u0002\u0305\u0303\u0003\u0002\u0002\u0002\u0305\u0306\u0003\u0002\u0002\u0002\u0306\u0310\u0003\u0002\u0002\u0002\u0307\u0305\u0003\u0002\u0002\u0002\u0308\u030c\u0005\u0066\u0034\u0002\u0309\u030b\u0005\u0068\u0035\u0002\u030a\u0309\u0003\u0002\u0002\u0002\u030b\u030e\u0003\u0002\u0002\u0002\u030c\u030a\u0003\u0002\u0002\u0002\u030c\u030d\u0003\u0002\u0002\u0002\u030d\u0310\u0003\u0002\u0002\u0002\u030e\u030c\u0003\u0002\u0002\u0002\u030f\u0301\u0003\u0002\u0002\u0002\u030f\u0308\u0003\u0002\u0002\u0002\u0310\u0063\u0003\u0002\u0002\u0002\u0311\u0313\u0005\u0092\u004a\u0002\u0312\u0311\u0003\u0002\u0002\u0002\u0312\u0313\u0003\u0002\u0002\u0002\u0313\u0314\u0003\u0002\u0002\u0002\u0314\u0316\u0005\u0054\u002b\u0002\u0315\u0317\u0005\u0030\u0019\u0002\u0316\u0315\u0003\u0002\u0002\u0002\u0316\u0317\u0003\u0002\u0002\u0002\u0317\u0319\u0003\u0002\u0002\u0002\u0318\u031a\u0005\u0048\u0025\u0002\u0319\u0318\u0003\u0002\u0002\u0002\u0319\u031a\u0003\u0002\u0002\u0002\u031a\u031b\u0003\u0002\u0002\u0002\u031b\u031c\u0005\u0072\u003a\u0002\u031c\u031d\u0007\u002c\u0002\u0002\u031d\u031e\u0005\u003a\u001e\u0002\u031e\u0065\u0003\u0002\u0002\u0002\u031f\u0321\u0005\u0092\u004a\u0002\u0320\u031f\u0003\u0002\u0002\u0002\u0320\u0321\u0003\u0002\u0002\u0002\u0321\u0322\u0003\u0002\u0002\u0002\u0322\u0324\u0005\u0054\u002b\u0002\u0323\u0325\u0005\u0030\u0019\u0002\u0324\u0323\u0003\u0002\u0002\u0002\u0324\u0325\u0003\u0002\u0002\u0002\u0325\u0327\u0003\u0002\u0002\u0002\u0326\u0328\u0005\u0048\u0025\u0002\u0327\u0326\u0003\u0002\u0002\u0002\u0327\u0328\u0003\u0002\u0002\u0002\u0328\u0329\u0003\u0002\u0002\u0002\u0329\u032a\u0007\u000a\u0002\u0002\u032a\u032c\u0005\u0072\u003a\u0002\u032b\u032d\u0005\u0084\u0043\u0002\u032c\u032b\u0003\u0002\u0002\u0002\u032c\u032d\u0003\u0002\u0002\u0002\u032d\u0067\u0003\u0002\u0002\u0002\u032e\u0330\u0007\u0014\u0002\u0002\u032f\u0331\u0007\u0040\u0002\u0002\u0330\u032f\u0003\u0002\u0002\u0002\u0330\u0331\u0003\u0002\u0002\u0002\u0331\u0332\u0003\u0002\u0002\u0002\u0332\u0334\u0007\u002f\u0002\u0002\u0333\u0335\u0005\u006a\u0036\u0002\u0334\u0333\u0003\u0002\u0002\u0002\u0335\u0336\u0003\u0002\u0002\u0002\u0336\u0334\u0003\u0002\u0002\u0002\u0336\u0337\u0003\u0002\u0002\u0002\u0337\u0338\u0003\u0002\u0002\u0002\u0338\u0339\u0007\u0030\u0002\u0002\u0339\u0069\u0003\u0002\u0002\u0002\u033a\u033d\u0005\u003a\u001e\u0002\u033b\u033c\u0007\u0037\u0002\u0002\u033c\u033e\u0005\u0072\u003a\u0002\u033d\u033b\u0003\u0002\u0002\u0002\u033d\u033e\u0003\u0002\u0002\u0002\u033e\u0342\u0003\u0002\u0002\u0002\u033f\u0340\u0007\u0038\u0002\u0002\u0340\u0342\u0007\u0040\u0002\u0002\u0341\u033a\u0003\u0002\u0002\u0002\u0341\u033f\u0003\u0002\u0002\u0002\u0342\u006b\u0003\u0002\u0002\u0002\u0343\u0344\u0007\u0031\u0002\u0002\u0344\u0345\u0005\u006e\u0038\u0002\u0345\u0346\u0007\u0032\u0002\u0002\u0346\u0347\u0005\u003a\u001e\u0002\u0347\u006d\u0003\u0002\u0002\u0002\u0348\u034a\u0005\u0044\u0023\u0002\u0349\u0348\u0003\u0002\u0002\u0002\u034a\u034d\u0003\u0002\u0002\u0002\u034b\u0349\u0003\u0002\u0002\u0002\u034b\u034c\u0003\u0002\u0002\u0002\u034c\u034f\u0003\u0002\u0002\u0002\u034d\u034b\u0003\u0002\u0002\u0002\u034e\u0350\u0005\u0070\u0039\u0002\u034f\u034e\u0003\u0002\u0002\u0002\u034f\u0350\u0003\u0002\u0002\u0002\u0350\u006f\u0003\u0002\u0002\u0002\u0351\u0353\u0007\u001b\u0002\u0002\u0352\u0354\u0005\u0046\u0024\u0002\u0353\u0352\u0003\u0002\u0002\u0002\u0354\u0355\u0003\u0002\u0002\u0002\u0355\u0353\u0003\u0002\u0002\u0002\u0355\u0356\u0003\u0002\u0002\u0002\u0356\u0071\u0003\u0002\u0002\u0002\u0357\u035f\u0005\u007c\u003f\u0002\u0358\u0359\u0007\u002f\u0002\u0002\u0359\u035a\u0005\u007c\u003f\u0002\u035a\u035c\u0007\u0030\u0002\u0002\u035b\u035d\u0007\u003f\u0002\u0002\u035c\u035b\u0003\u0002\u0002\u0002\u035c\u035d\u0003\u0002\u0002\u0002\u035d\u035f\u0003\u0002\u0002\u0002\u035e\u0357\u0003\u0002\u0002\u0002\u035e\u0358\u0003\u0002\u0002\u0002\u035f\u0365\u0003\u0002\u0002\u0002\u0360\u0362\u0005\u0074\u003b\u0002\u0361\u0363\u0007\u003f\u0002\u0002\u0362\u0361\u0003\u0002\u0002\u0002\u0362\u0363\u0003\u0002\u0002\u0002\u0363\u0365\u0003\u0002\u0002\u0002\u0364\u035e\u0003\u0002\u0002\u0002\u0364\u0360\u0003\u0002\u0002\u0002\u0365\u0073\u0003\u0002\u0002\u0002\u0366\u0367\u0005\u0014\u000b\u0002\u0367\u0368\u0007\u002e\u0002\u0002\u0368\u036a\u0003\u0002\u0002\u0002\u0369\u0366\u0003\u0002\u0002\u0002\u0369\u036a\u0003\u0002\u0002\u0002\u036a\u036f\u0003\u0002\u0002\u0002\u036b\u0370\u0007\u0040\u0002\u0002\u036c\u036d\u0007\u003c\u0002\u0002\u036d\u036e\u0007\u0040\u0002\u0002\u036e\u0370\u0007\u003c\u0002\u0002\u036f\u036b\u0003\u0002\u0002\u0002\u036f\u036c\u0003\u0002\u0002\u0002\u0370\u0379\u0003\u0002\u0002\u0002\u0371\u0373\u0007\u002f\u0002\u0002\u0372\u0374\u0005\u0076\u003c\u0002\u0373\u0372\u0003\u0002\u0002\u0002\u0374\u0375\u0003\u0002\u0002\u0002\u0375\u0373\u0003\u0002\u0002\u0002\u0375\u0376\u0003\u0002\u0002\u0002\u0376\u0377\u0003\u0002\u0002\u0002\u0377\u0378\u0007\u0030\u0002\u0002\u0378\u037a\u0003\u0002\u0002\u0002\u0379\u0371\u0003\u0002\u0002\u0002\u0379\u037a\u0003\u0002\u0002\u0002\u037a\u037d\u0003\u0002\u0002\u0002\u037b\u037d\u0005\u0078\u003d\u0002\u037c\u0369\u0003\u0002\u0002\u0002\u037c\u037b\u0003\u0002\u0002\u0002\u037d\u0075\u0003\u0002\u0002\u0002\u037e\u0383\u0005\u0072\u003a\u0002\u037f\u0383\u0005\u007e\u0040\u0002\u0380\u0383\u0005\u0080\u0041\u0002\u0381\u0383\u0005\u0082\u0042\u0002\u0382\u037e\u0003\u0002\u0002\u0002\u0382\u037f\u0003\u0002\u0002\u0002\u0382\u0380\u0003\u0002\u0002\u0002\u0382\u0381\u0003\u0002\u0002\u0002\u0383\u0077\u0003\u0002\u0002\u0002\u0384\u0385\u0009\u0004\u0002\u0002\u0385\u0079\u0003\u0002\u0002\u0002\u0386\u0388\u0005\u0072\u003a\u0002\u0387\u0389\u0007\u002d\u0002\u0002\u0388\u0387\u0003\u0002\u0002\u0002\u0388\u0389\u0003\u0002\u0002\u0002\u0389\u007b\u0003\u0002\u0002\u0002\u038a\u038e\u0007\u002f\u0002\u0002\u038b\u038d\u0005\u007a\u003e\u0002\u038c\u038b\u0003\u0002\u0002\u0002\u038d\u0390\u0003\u0002\u0002\u0002\u038e\u038c\u0003\u0002\u0002\u0002\u038e\u038f\u0003\u0002\u0002\u0002\u038f\u0391\u0003\u0002\u0002\u0002\u0390\u038e\u0003\u0002\u0002\u0002\u0391\u0392\u0007\u0030\u0002\u0002\u0392\u0393\u0007\u0035\u0002\u0002\u0393\u0394\u0005\u0072\u003a\u0002\u0394\u007d\u0003\u0002\u0002\u0002\u0395\u0396\u0007\u0031\u0002\u0002\u0396\u0397\u0007\u0037\u0002\u0002\u0397\u0398\u0005\u0072\u003a\u0002\u0398\u0399\u0007\u0032\u0002\u0002\u0399\u007f\u0003\u0002\u0002\u0002\u039a\u039b\u0007\u0031\u0002\u0002\u039b\u039c\u0005\u0072\u003a\u0002\u039c\u039d\u0007\u0037\u0002\u0002\u039d\u039e\u0007\u0032\u0002\u0002\u039e\u0081\u0003\u0002\u0002\u0002\u039f\u03a0\u0007\u0031\u0002\u0002\u03a0\u03a1\u0007\u003f\u0002\u0002\u03a1\u03a2\u0007\u0032\u0002\u0002\u03a2\u0083\u0003\u0002\u0002\u0002\u03a3\u03a7\u0007\u0033\u0002\u0002\u03a4\u03a6\u0005\u0086\u0044\u0002\u03a5\u03a4\u0003\u0002\u0002\u0002\u03a6\u03a9\u0003\u0002\u0002\u0002\u03a7\u03a5\u0003\u0002\u0002\u0002\u03a7\u03a8\u0003\u0002\u0002\u0002\u03a8\u03aa\u0003\u0002\u0002\u0002\u03a9\u03a7\u0003\u0002\u0002\u0002\u03aa\u03ad\u0007\u0034\u0002\u0002\u03ab\u03ad\u0007\u0045\u0002\u0002\u03ac\u03a3\u0003\u0002\u0002\u0002\u03ac\u03ab\u0003\u0002\u0002\u0002\u03ad\u0085\u0003\u0002\u0002\u0002\u03ae\u03af\u0005\u0088\u0045\u0002\u03af\u03b0\u0007\u0045\u0002\u0002\u03b0\u0087\u0003\u0002\u0002\u0002\u03b1\u03b2\u0007\u0040\u0002\u0002\u03b2\u0089\u0003\u0002\u0002\u0002\u03b3\u03b4\u0007\u001a\u0002\u0002\u03b4\u03b9\u0007\u0040\u0002\u0002\u03b5\u03b6\u0007\u002f\u0002\u0002\u03b6\u03b7\u0005\u0030\u0019\u0002\u03b7\u03b8\u0007\u0030\u0002\u0002\u03b8\u03ba\u0003\u0002\u0002\u0002\u03b9\u03b5\u0003\u0002\u0002\u0002\u03b9\u03ba\u0003\u0002\u0002\u0002\u03ba\u03c4\u0003\u0002\u0002\u0002\u03bb\u03bc\u0007\u002c\u0002\u0002\u03bc\u03c5\u0005\u0072\u003a\u0002\u03bd\u03bf\u0007\u000a\u0002\u0002\u03be\u03c0\u0005\u0084\u0043\u0002\u03bf\u03be\u0003\u0002\u0002\u0002\u03bf\u03c0\u0003\u0002\u0002\u0002\u03c0\u03c2\u0003\u0002\u0002\u0002\u03c1\u03c3\u0005\u008c\u0047\u0002\u03c2\u03c1\u0003\u0002\u0002\u0002\u03c2\u03c3\u0003\u0002\u0002\u0002\u03c3\u03c5\u0003\u0002\u0002\u0002\u03c4\u03bb\u0003\u0002\u0002\u0002\u03c4\u03bd\u0003\u0002\u0002\u0002\u03c5\u008b\u0003\u0002\u0002\u0002\u03c6\u03c7\u0007\u0015\u0002\u0002\u03c7\u03cc\u0007\u0033\u0002\u0002\u03c8\u03c9\u0007\u0039\u0002\u0002\u03c9\u03cb\u0005\u0026\u0014\u0002\u03ca\u03c8\u0003\u0002\u0002\u0002\u03cb\u03ce\u0003\u0002\u0002\u0002\u03cc\u03ca\u0003\u0002\u0002\u0002\u03cc\u03cd\u0003\u0002\u0002\u0002\u03cd\u03d2\u0003\u0002\u0002\u0002\u03ce\u03cc\u0003\u0002\u0002\u0002\u03cf\u03d1\u0005\u002c\u0017\u0002\u03d0\u03cf\u0003\u0002\u0002\u0002\u03d1\u03d4\u0003\u0002\u0002\u0002\u03d2\u03d0\u0003\u0002\u0002\u0002\u03d2\u03d3\u0003\u0002\u0002\u0002\u03d3\u03d5\u0003\u0002\u0002\u0002\u03d4\u03d2\u0003\u0002\u0002\u0002\u03d5\u03d6\u0007\u0034\u0002\u0002\u03d6\u008d\u0003\u0002\u0002\u0002\u03d7\u03d8\u0007\u0007\u0002\u0002\u03d8\u03d9\u0007\u0040\u0002\u0002\u03d9\u03da\u0005\u0048\u0025\u0002\u03da\u008f\u0003\u0002\u0002\u0002\u03db\u03dc\u0005\u0014\u000b\u0002\u03dc\u03dd\u0007\u002e\u0002\u0002\u03dd\u03df\u0003\u0002\u0002\u0002\u03de\u03db\u0003\u0002\u0002\u0002\u03de\u03df\u0003\u0002\u0002\u0002\u03df\u03e0\u0003\u0002\u0002\u0002\u03e0\u03e2\u0007\u0040\u0002\u0002\u03e1\u03e3\u0005\u0050\u0029\u0002\u03e2\u03e1\u0003\u0002\u0002\u0002\u03e2\u03e3\u0003\u0002\u0002\u0002\u03e3\u0091\u0003\u0002\u0002\u0002\u03e4\u03e8\u0007\u0031\u0002\u0002\u03e5\u03e7\u0005\u0090\u0049\u0002\u03e6\u03e5\u0003\u0002\u0002\u0002\u03e7\u03ea\u0003\u0002\u0002\u0002\u03e8\u03e6\u0003\u0002\u0002\u0002\u03e8\u03e9\u0003\u0002\u0002\u0002\u03e9\u03eb\u0003\u0002\u0002\u0002\u03ea\u03e8\u0003\u0002\u0002\u0002\u03eb\u03ec\u0007\u0032\u0002\u0002\u03ec\u0093\u0003\u0002\u0002\u0002\u008c\u0095\u009a\u00a0\u00a2\u00a8\u00ad\u00b0\u00b3\u00b9\u00c1\u00c5\u00cb\u00d3\u00d5\u00e8\u00f3\u00fb\u010a\u010d\u0110\u0113\u011b\u0122\u0128\u012c\u0132\u0137\u013a\u0142\u014a\u0151\u0155\u015a\u0160\u0163\u0166\u016e\u0172\u0178\u017e\u0182\u0186\u018b\u018f\u0193\u0196\u0199\u019c\u019f\u01a3\u01a6\u01b2\u01b9\u01c0\u01c7\u01cf\u01d6\u01db\u01e1\u01eb\u01f1\u01f6\u0200\u0207\u020b\u0210\u0215\u0221\u0235\u023e\u0248\u024a\u0250\u0269\u026f\u0279\u027c\u0284\u028d\u0290\u0295\u029b\u029f\u02a5\u02a7\u02ad\u02b5\u02b7\u02bd\u02c1\u02c8\u02d0\u02de\u02e3\u02eb\u02ef\u02fb\u02ff\u0305\u030c\u030f\u0312\u0316\u0319\u0320\u0324\u0327\u032c\u0330\u0336\u033d\u0341\u034b\u034f\u0355\u035c\u035e\u0362\u0364\u0369\u036f\u0375\u0379\u037c\u0382\u0388\u038e\u03a7\u03ac\u03b9\u03bf\u03c2\u03c4\u03cc\u03d2\u03de\u03e2\u03e8"

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
    private val ABSTRACT = Tokens.ABSTRACT.id
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
    private val INTERFACE = Tokens.INTERFACE.id
    private val DATA = Tokens.DATA.id
    private val INVERSE = Tokens.INVERSE.id
    private val EXPECT = Tokens.EXPECT.id
    private val IF = Tokens.IF.id
    private val ELSE = Tokens.ELSE.id
    private val NEW = Tokens.NEW.id
    private val LET = Tokens.LET.id
    private val TYPEALIAS = Tokens.TYPEALIAS.id
    private val FROM = Tokens.FROM.id
    private val IS = Tokens.IS.id
    private val GET = Tokens.GET.id
    private val SET = Tokens.SET.id
    private val INT = Tokens.INT.id
    private val LONG = Tokens.LONG.id
    private val DOUBLE = Tokens.DOUBLE.id
    private val FLOAT = Tokens.FLOAT.id
    private val BYTE = Tokens.BYTE.id
    private val CHAR = Tokens.CHAR.id
    private val STRING = Tokens.STRING.id
    private val BOOLEAN = Tokens.BOOLEAN.id
    private val UNIT = Tokens.UNIT.id
    private val NULL = Tokens.NULL.id
    private val TRUE = Tokens.TRUE.id
    private val FALSE = Tokens.FALSE.id
    private val ALPHA = Tokens.ALPHA.id
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
    private val ARROWQM = Tokens.ARROWQM.id
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
		fun findTypeAlias() : List<TypeAliasContext> = getRuleContexts(solver.getType("TypeAliasContext"))
		fun findTypeAlias(i: Int) : TypeAliasContext? = getRuleContext(solver.getType("TypeAliasContext"),i)
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
			this.state = 147
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAMESPACE) {
				if (true){
				this.state = 146
				namespace()
				}
			}

			this.state = 152
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPORT) {
				if (true){
				if (true){
				this.state = 149
				importEx()
				}
				}
				this.state = 154
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 160
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ABSTRACT) or (1L shl ANNOTATION) or (1L shl CLASS) or (1L shl INTERFACE) or (1L shl DATA) or (1L shl TYPEALIAS) or (1L shl LSQUARE) or (1L shl SHARP) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 158
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ABSTRACT , CLASS , INTERFACE , DATA , LSQUARE , SHARP , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 155
				fileCompo()
				}}
				ANNOTATION  ->  /*LL1AltBlock*/{if (true){
				this.state = 156
				annotationDef()
				}}
				TYPEALIAS  ->  /*LL1AltBlock*/{if (true){
				this.state = 157
				typeAlias()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 162
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
			this.state = 166
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ABSTRACT , CLASS , INTERFACE , DATA , LSQUARE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 163
			definition()
			}}
			SHARP  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 164
			match(SHARP) as Token
			this.state = 165
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
			this.state = 168
			match(IMPORT) as Token
			this.state = 169
			package_()
			this.state = 171
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1   -> if (true){
			this.state = 170
			importNest()
			}
			}
			this.state = 174
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 173
				importPath()
				}
			}

			this.state = 177
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 176
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
			this.state = 179
			match(LBRACE) as Token
			this.state = 183
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==CLASS || _la==ID) {
				if (true){
				if (true){
				this.state = 180
				importCompo()
				}
				}
				this.state = 185
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 186
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
			this.state = 211
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,13,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 188
			match(ID) as Token
			this.state = 191
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 189
				match(SHARP) as Token
				this.state = 190
				importAlias()
				}
			}

			this.state = 195
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==As) {
				if (true){
				this.state = 193
				match(As) as Token
				this.state = 194
				importType()
				}
			}

			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 197
			match(CLASS) as Token
			this.state = 198
			match(ID) as Token
			this.state = 201
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 199
				match(SHARP) as Token
				this.state = 200
				importAlias()
				}
			}

			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 203
			match(CLASS) as Token
			this.state = 204
			match(QUOTE) as Token
			this.state = 205
			match(ID) as Token
			this.state = 206
			match(QUOTE) as Token
			this.state = 209
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 207
				match(SHARP) as Token
				this.state = 208
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
			this.state = 213
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
			this.state = 215
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
			this.state = 217
			match(LPAREN) as Token
			this.state = 218
			match(FROM) as Token
			this.state = 219
			match(RawString) as Token
			this.state = 220
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
			this.state = 222
			match(SHARP) as Token
			this.state = 223
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
			this.state = 225
			match(ID) as Token
			this.state = 230
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,14,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 226
					match(DOT) as Token
					this.state = 227
					match(ID) as Token
					}
					} 
				}
				this.state = 232
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
			this.state = 233
			match(NAMESPACE) as Token
			this.state = 234
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
			this.state = 236
			match(DO) as Token
			this.state = 237
			match(LBRACE) as Token
			this.state = 241
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (((((_la - 7)) and 0x3f.inv()) == 0 && ((1L shl (_la - 7)) and ((1L shl (DO - 7)) or (1L shl (RETURN - 7)) or (1L shl (IF - 7)) or (1L shl (NEW - 7)) or (1L shl (LET - 7)) or (1L shl (NULL - 7)) or (1L shl (TRUE - 7)) or (1L shl (FALSE - 7)) or (1L shl (LPAREN - 7)) or (1L shl (LSQUARE - 7)) or (1L shl (ARROW - 7)) or (1L shl (ARROWQM - 7)) or (1L shl (TILDE - 7)) or (1L shl (QUOTE - 7)) or (1L shl (SHARP - 7)) or (1L shl (ID - 7)) or (1L shl (OPID - 7)) or (1L shl (Integer - 7)) or (1L shl (Double - 7)) or (1L shl (String - 7)))) != 0L)) {
				if (true){
				if (true){
				this.state = 238
				compo()
				}
				}
				this.state = 243
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 244
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
			this.state = 249
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,16,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 246
			fieldAssign()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 247
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 248
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
			this.state = 251
			match(RETURN) as Token
			this.state = 252
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
			this.state = 264
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,17,context) ) {
			1 -> {_localctx = GlobalFieldAssignContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 254
			match(SHARP) as Token
			this.state = 255
			match(ID) as Token
			this.state = 256
			match(ASSGIN) as Token
			this.state = 257
			value(0)
			}}
			2 -> {_localctx = ObjectFieldAssignContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 258
			value(0)
			this.state = 259
			match(COLONSHARP) as Token
			this.state = 260
			match(ID) as Token
			this.state = 261
			match(ASSGIN) as Token
			this.state = 262
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
		fun ABSTRACT() : TerminalNode? = getToken(FoldingParser.Tokens.ABSTRACT.id, 0)
		fun INTERFACE() : TerminalNode? = getToken(FoldingParser.Tokens.INTERFACE.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun COLONSHARP() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLONSHARP.id)
		fun COLONSHARP(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLONSHARP.id, i) as TerminalNode
		fun findFieldInInterface() : List<FieldInInterfaceContext> = getRuleContexts(solver.getType("FieldInInterfaceContext"))
		fun findFieldInInterface(i: Int) : FieldInInterfaceContext? = getRuleContext(solver.getType("FieldInInterfaceContext"),i)
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
		fun ABSTRACT() : TerminalNode? = getToken(FoldingParser.Tokens.ABSTRACT.id, 0)
		fun DATA() : TerminalNode? = getToken(FoldingParser.Tokens.DATA.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
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
		fun DATA() : TerminalNode? = getToken(FoldingParser.Tokens.DATA.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
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
			this.state = 397
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,43,context) ) {
			1 -> {_localctx = JustInterfaceContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 267
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 266
				annotationBlock()
				}
			}

			this.state = 270
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ABSTRACT) {
				if (true){
				this.state = 269
				match(ABSTRACT) as Token
				}
			}

			this.state = 273
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INTERFACE) {
				if (true){
				this.state = 272
				match(INTERFACE) as Token
				}
			}

			this.state = 275
			match(CLASS) as Token
			this.state = 276
			match(ID) as Token
			this.state = 281
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 277
				match(LPAREN) as Token
				this.state = 278
				typeParam()
				this.state = 279
				match(RPAREN) as Token
				}
			}

			this.state = 283
			match(LBRACE) as Token
			this.state = 288
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 284
				match(COLONSHARP) as Token
				this.state = 285
				fieldInInterface()
				}
				}
				this.state = 290
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 298
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 291
				match(COLON) as Token
				this.state = 294
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,23,context) ) {
				1 -> {if (true){
				this.state = 292
				defInInterface()
				}}
				2 -> {if (true){
				this.state = 293
				def()
				}}
				}
				}
				}
				this.state = 300
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 304
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 301
				impl()
				}
				}
				this.state = 306
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 307
			match(RBRACE) as Token
			}}
			2 -> {_localctx = JustClassContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 309
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 308
				annotationBlock()
				}
			}

			this.state = 312
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DATA) {
				if (true){
				this.state = 311
				match(DATA) as Token
				}
			}

			this.state = 314
			match(CLASS) as Token
			this.state = 315
			match(ID) as Token
			this.state = 320
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 316
				match(LPAREN) as Token
				this.state = 317
				typeParam()
				this.state = 318
				match(RPAREN) as Token
				}
			}

			this.state = 322
			match(LBRACE) as Token
			this.state = 323
			constructorSelf()
			this.state = 328
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 324
				match(COLONSHARP) as Token
				this.state = 325
				field()
				}
				}
				this.state = 330
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 335
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 331
				match(COLON) as Token
				this.state = 332
				def()
				}
				}
				this.state = 337
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 339
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INHERIT) {
				if (true){
				this.state = 338
				inherit()
				}
			}

			this.state = 344
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 341
				impl()
				}
				}
				this.state = 346
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 347
			match(RBRACE) as Token
			}}
			3 -> {_localctx = JustAbstractClassContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 350
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 349
				annotationBlock()
				}
			}

			this.state = 353
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ABSTRACT) {
				if (true){
				this.state = 352
				match(ABSTRACT) as Token
				}
			}

			this.state = 356
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DATA) {
				if (true){
				this.state = 355
				match(DATA) as Token
				}
			}

			this.state = 358
			match(CLASS) as Token
			this.state = 359
			match(ID) as Token
			this.state = 364
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 360
				match(LPAREN) as Token
				this.state = 361
				typeParam()
				this.state = 362
				match(RPAREN) as Token
				}
			}

			this.state = 366
			match(LBRACE) as Token
			this.state = 368
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,37,context) ) {
			1   -> if (true){
			this.state = 367
			constructorSelf()
			}
			}
			this.state = 374
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 370
				match(COLONSHARP) as Token
				this.state = 371
				field()
				}
				}
				this.state = 376
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 384
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 377
				match(COLON) as Token
				this.state = 380
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,39,context) ) {
				1 -> {if (true){
				this.state = 378
				defInInterface()
				}}
				2 -> {if (true){
				this.state = 379
				def()
				}}
				}
				}
				}
				this.state = 386
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 388
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INHERIT) {
				if (true){
				this.state = 387
				inherit()
				}
			}

			this.state = 393
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 390
				impl()
				}
				}
				this.state = 395
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 396
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
			this.state = 399
			match(ID) as Token
			this.state = 401
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 400
				parameter()
				}
			}

			this.state = 404
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 403
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
			this.state = 407
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 406
				parameter()
				}
			}

			this.state = 410
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 409
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
			this.state = 413
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,48,context) ) {
			1   -> if (true){
			this.state = 412
			annotationBlock()
			}
			}
			this.state = 415
			commonIdentifier()
			this.state = 417
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,49,context) ) {
			1   -> if (true){
			this.state = 416
			typeParam()
			}
			}
			this.state = 420
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,50,context) ) {
			1   -> if (true){
			this.state = 419
			parameter()
			}
			}
			this.state = 422
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

	open class FieldInInterfaceContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_fieldInInterface.id
	        set(value) { throw RuntimeException() }
		fun findFieldNotInit() : FieldNotInitContext? = getRuleContext(solver.getType("FieldNotInitContext"),0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun ABSTRACT() : TerminalNode? = getToken(FoldingParser.Tokens.ABSTRACT.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  fieldInInterface() : FieldInInterfaceContext {
		var _localctx : FieldInInterfaceContext = FieldInInterfaceContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_fieldInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 424
			match(LPAREN) as Token
			this.state = 425
			match(ABSTRACT) as Token
			this.state = 426
			match(RPAREN) as Token
			}
			this.state = 428
			fieldNotInit()
			}
		}
		catch (re: RecognitionException) {
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
		enterRule(_localctx, 40, Rules.RULE_inherit.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 430
			match(INHERIT) as Token
			this.state = 432
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ALPHA) or (1L shl LPAREN) or (1L shl LBRACE))) != 0L)) {
				if (true){
				this.state = 431
				argValue()
				}
			}

			this.state = 434
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
		enterRule(_localctx, 42, Rules.RULE_impl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 436
			match(IMPL) as Token
			this.state = 437
			typeEx()
			this.state = 439
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 438
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
		fun COLONSHARP() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLONSHARP.id)
		fun COLONSHARP(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLONSHARP.id, i) as TerminalNode
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		fun COLON() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLON.id)
		fun COLON(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLON.id, i) as TerminalNode
		fun findDef() : List<DefContext> = getRuleContexts(solver.getType("DefContext"))
		fun findDef(i: Int) : DefContext? = getRuleContext(solver.getType("DefContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  implBody() : ImplBodyContext {
		var _localctx : ImplBodyContext = ImplBodyContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_implBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 441
			match(LBRACE) as Token
			this.state = 446
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 442
				match(COLONSHARP) as Token
				this.state = 443
				field()
				}
				}
				this.state = 448
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 453
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 449
				match(COLON) as Token
				this.state = 450
				def()
				}
				}
				this.state = 455
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 456
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
		enterRule(_localctx, 46, Rules.RULE_typeParam.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 459 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 458
				typeParamCompo()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 461 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,55,context)
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
		enterRule(_localctx, 48, Rules.RULE_typeParamCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 463
			match(ID) as Token
			this.state = 468
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TILDE) {
				if (true){
				if (true){
				this.state = 464
				match(TILDE) as Token
				this.state = 465
				typeEx()
				}
				}
				this.state = 470
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
		enterRule(_localctx, 50, Rules.RULE_definition.id)
		try {
			this.state = 473
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,57,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 471
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 472
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
		enterRule(_localctx, 52, Rules.RULE_defaultValue.id)
		try {
			this.state = 479
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Integer  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 475
			match(Integer) as Token
			}}
			Double  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 476
			match(Double) as Token
			}}
			String  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 477
			match(String) as Token
			}}
			TRUE , FALSE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 478
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
		enterRule(_localctx, 54, Rules.RULE_boolean.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 481
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
	open class TypeCheckContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun IS() : TerminalNode? = getToken(FoldingParser.Tokens.IS.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
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
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class JustDefaultValueContext : ValueContext {
		fun findDefaultValue() : DefaultValueContext? = getRuleContext(solver.getType("DefaultValueContext"),0)
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
	open class TakeNullContext : ValueContext {
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun QM() : TerminalNode? = getToken(FoldingParser.Tokens.QM.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class OutputOfInversingContext : ValueContext {
		fun ARROW() : TerminalNode? = getToken(FoldingParser.Tokens.ARROW.id, 0)
		fun ARROWQM() : TerminalNode? = getToken(FoldingParser.Tokens.ARROWQM.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun QM() : TerminalNode? = getToken(FoldingParser.Tokens.QM.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class CallAopFuncContext : ValueContext {
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class CallAopFuncBackContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun QUOTE() : TerminalNode? = getToken(FoldingParser.Tokens.QUOTE.id, 0)
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class GetFieldContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun COLONSHARP() : TerminalNode? = getToken(FoldingParser.Tokens.COLONSHARP.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class CallFunctionLikeMethodContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun DOUBLECOLON() : TerminalNode? = getToken(FoldingParser.Tokens.DOUBLECOLON.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
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
	open class NullContext : ValueContext {
		fun NULL() : TerminalNode? = getToken(FoldingParser.Tokens.NULL.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class ValueTypeCastingContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findTypeCasting() : TypeCastingContext? = getRuleContext(solver.getType("TypeCastingContext"),0)
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
		var _startState : Int = 56
		enterRecursionRule(_localctx, 56, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 543
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,67,context) ) {
			1 -> {if (true){
			_localctx = JustDefaultValueContext(_localctx)
			context = _localctx
			_prevctx = _localctx

			this.state = 484
			defaultValue()
			}}
			2 -> {if (true){
			_localctx = NullContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 485
			match(NULL) as Token
			}}
			3 -> {if (true){
			_localctx = OutputOfInversingContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 489
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ARROW  ->  /*LL1AltBlock*/{if (true){
			this.state = 486
			match(ARROW) as Token
			this.state = 487
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
			ARROWQM  ->  /*LL1AltBlock*/{if (true){
			this.state = 488
			match(ARROWQM) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			4 -> {if (true){
			_localctx = ReflectedContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 491
			match(QUOTE) as Token
			this.state = 492
			reference()
			}}
			5 -> {if (true){
			_localctx = CallFunctionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 493
			reference()
			this.state = 495
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,60,context) ) {
			1   -> if (true){
			this.state = 494
			argValue()
			}
			}
			}}
			6 -> {if (true){
			_localctx = UseForeignClassContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 497
			match(NEW) as Token
			this.state = 498
			reference()
			this.state = 500
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,61,context) ) {
			1   -> if (true){
			this.state = 499
			argValue()
			}
			}
			}}
			7 -> {if (true){
			_localctx = GetFieldGlobalContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 502
			match(SHARP) as Token
			this.state = 503
			reference()
			}}
			8 -> {if (true){
			_localctx = AnonymousClassObjectContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 504
			match(NEW) as Token
			this.state = 505
			match(LBRACE) as Token
			this.state = 510
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 506
				match(COLONSHARP) as Token
				this.state = 507
				field()
				}
				}
				this.state = 512
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 517
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 513
				match(COLON) as Token
				this.state = 514
				def()
				}
				}
				this.state = 519
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 521
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INHERIT) {
				if (true){
				this.state = 520
				inherit()
				}
			}

			this.state = 526
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 523
				impl()
				}
				}
				this.state = 528
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 529
			match(RBRACE) as Token
			}}
			9 -> {if (true){
			_localctx = CallAopFuncContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 531
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==TILDE) {
				if (true){
				this.state = 530
				match(TILDE) as Token
				}
			}

			this.state = 533
			match(OPID) as Token
			this.state = 534
			value(10)
			}}
			10 -> {if (true){
			_localctx = IfExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 535
			if_else()
			}}
			11 -> {if (true){
			_localctx = LetExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 536
			let_binding()
			}}
			12 -> {if (true){
			_localctx = DoExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 537
			doBlock()
			}}
			13 -> {if (true){
			_localctx = JustLambdaContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 538
			lambda()
			}}
			14 -> {if (true){
			_localctx = ParenedValueContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 539
			match(LPAREN) as Token
			this.state = 540
			value(0)
			this.state = 541
			match(RPAREN) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 584
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,71,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 582
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,70,context) ) {
					1 -> {if (true){
					_localctx = CallOpFuncContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 545
					if (!(precpred(context!!, 9))) throw FailedPredicateException(this, "precpred(context!!, 9)")
					this.state = 546
					match(OPID) as Token
					this.state = 547
					value(10)
					}}
					2 -> {if (true){
					_localctx = SimpleIfContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 548
					if (!(precpred(context!!, 7))) throw FailedPredicateException(this, "precpred(context!!, 7)")
					this.state = 549
					match(IF) as Token
					this.state = 550
					value(8)
					}}
					3 -> {if (true){
					_localctx = TakeNullContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 551
					if (!(precpred(context!!, 6))) throw FailedPredicateException(this, "precpred(context!!, 6)")
					this.state = 552
					match(QM) as Token
					this.state = 553
					value(7)
					}}
					4 -> {if (true){
					_localctx = ValueTypeCastingContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 554
					if (!(precpred(context!!, 17))) throw FailedPredicateException(this, "precpred(context!!, 17)")
					this.state = 555
					typeCasting()
					}}
					5 -> {if (true){
					_localctx = GetFieldContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 556
					if (!(precpred(context!!, 16))) throw FailedPredicateException(this, "precpred(context!!, 16)")
					this.state = 557
					match(COLONSHARP) as Token
					this.state = 558
					match(ID) as Token
					}}
					6 -> {if (true){
					_localctx = CallMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 559
					if (!(precpred(context!!, 15))) throw FailedPredicateException(this, "precpred(context!!, 15)")
					this.state = 560
					match(COLON) as Token
					this.state = 561
					match(ID) as Token
					this.state = 563
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,68,context) ) {
					1   -> if (true){
					this.state = 562
					argValue()
					}
					}
					}}
					7 -> {if (true){
					_localctx = ReflectedMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 565
					if (!(precpred(context!!, 14))) throw FailedPredicateException(this, "precpred(context!!, 14)")
					this.state = 566
					match(COLONQUOTE) as Token
					this.state = 567
					match(ID) as Token
					}}
					8 -> {if (true){
					_localctx = CallFunctionLikeMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 568
					if (!(precpred(context!!, 13))) throw FailedPredicateException(this, "precpred(context!!, 13)")
					this.state = 569
					match(DOUBLECOLON) as Token
					this.state = 570
					match(ID) as Token
					this.state = 572
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,69,context) ) {
					1   -> if (true){
					this.state = 571
					argValue()
					}
					}
					}}
					9 -> {if (true){
					_localctx = InvokeValueContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 574
					if (!(precpred(context!!, 12))) throw FailedPredicateException(this, "precpred(context!!, 12)")
					this.state = 575
					invoking()
					}}
					10 -> {if (true){
					_localctx = CallAopFuncBackContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 576
					if (!(precpred(context!!, 11))) throw FailedPredicateException(this, "precpred(context!!, 11)")
					this.state = 577
					match(QUOTE) as Token
					this.state = 578
					match(OPID) as Token
					}}
					11 -> {if (true){
					_localctx = TypeCheckContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 579
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 580
					match(IS) as Token
					this.state = 581
					typeEx()
					}}
					}
					} 
				}
				this.state = 586
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,71,context)
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
		enterRule(_localctx, 58, Rules.RULE_reference.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 590
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,72,context) ) {
			1   -> if (true){
			this.state = 587
			package_()
			this.state = 588
			match(DOT) as Token
			}
			}
			this.state = 592
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
		enterRule(_localctx, 60, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 594
			match(LPAREN) as Token
			this.state = 595
			match(TILDE) as Token
			this.state = 596
			typeEx()
			this.state = 597
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
		enterRule(_localctx, 62, Rules.RULE_if_else.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 599
			match(IF) as Token
			this.state = 600
			match(LPAREN) as Token
			this.state = 601
			value(0)
			this.state = 602
			match(RPAREN) as Token
			this.state = 603
			value(0)
			this.state = 604
			match(ELSE) as Token
			this.state = 605
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
		enterRule(_localctx, 64, Rules.RULE_let_binding.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 607
			match(LET) as Token
			this.state = 608
			value(0)
			this.state = 609
			match(ASSGIN) as Token
			this.state = 610
			value(0)
			this.state = 611
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
		enterRule(_localctx, 66, Rules.RULE_paramEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 613
			match(ID) as Token
			this.state = 615
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 614
				match(ELLIPSIS) as Token
				}
			}

			this.state = 617
			match(TILDE) as Token
			this.state = 618
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
		enterRule(_localctx, 68, Rules.RULE_paramCEx.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 621
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,74,context) ) {
			1   -> if (true){
			this.state = 620
			specificAlias()
			}
			}
			this.state = 623
			value(0)
			this.state = 624
			match(TILDE) as Token
			this.state = 625
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
		enterRule(_localctx, 70, Rules.RULE_parameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 627
			match(LPAREN) as Token
			this.state = 629 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 628
				paramEx()
				}
				}
				this.state = 631 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==ID )
			this.state = 634
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FROM) {
				if (true){
				this.state = 633
				parameterFromValue()
				}
			}

			this.state = 636
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

	open class ParameterFromValueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_parameterFromValue.id
	        set(value) { throw RuntimeException() }
		fun FROM() : TerminalNode? = getToken(FoldingParser.Tokens.FROM.id, 0)
		fun findParamCEx() : List<ParamCExContext> = getRuleContexts(solver.getType("ParamCExContext"))
		fun findParamCEx(i: Int) : ParamCExContext? = getRuleContext(solver.getType("ParamCExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parameterFromValue() : ParameterFromValueContext {
		var _localctx : ParameterFromValueContext = ParameterFromValueContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_parameterFromValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 638
			match(FROM) as Token
			this.state = 640 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 639
				paramCEx()
				}
				}
				this.state = 642 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( ((((_la - 7)) and 0x3f.inv()) == 0 && ((1L shl (_la - 7)) and ((1L shl (DO - 7)) or (1L shl (IF - 7)) or (1L shl (NEW - 7)) or (1L shl (LET - 7)) or (1L shl (NULL - 7)) or (1L shl (TRUE - 7)) or (1L shl (FALSE - 7)) or (1L shl (LPAREN - 7)) or (1L shl (LSQUARE - 7)) or (1L shl (ARROW - 7)) or (1L shl (ARROWQM - 7)) or (1L shl (TILDE - 7)) or (1L shl (QUOTE - 7)) or (1L shl (SHARP - 7)) or (1L shl (ID - 7)) or (1L shl (OPID - 7)) or (1L shl (Integer - 7)) or (1L shl (Double - 7)) or (1L shl (String - 7)))) != 0L) )
			}
		}
		catch (re: RecognitionException) {
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
		enterRule(_localctx, 74, Rules.RULE_specificAlias.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 644
			match(LPAREN) as Token
			this.state = 645
			match(ID) as Token
			this.state = 646
			match(ASSGIN) as Token
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
		fun ELLIPSIS() : TerminalNode? = getToken(FoldingParser.Tokens.ELLIPSIS.id, 0)
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
		enterRule(_localctx, 76, Rules.RULE_argEx.id)
		var _la: Int
		try {
			this.state = 669
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,82,context) ) {
			1 -> {_localctx = SingleArgContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 651
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,78,context) ) {
			1   -> if (true){
			this.state = 649
			match(ID) as Token
			this.state = 650
			match(ASSGIN) as Token
			}
			}
			this.state = 654
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 653
				match(ELLIPSIS) as Token
				}
			}

			this.state = 656
			value(0)
			}}
			2 -> {_localctx = MultiArgContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 659
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 657
				match(ID) as Token
				this.state = 658
				match(ELLIPSIS) as Token
				}
			}

			this.state = 661
			match(LBRACE) as Token
			this.state = 665
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (((((_la - 7)) and 0x3f.inv()) == 0 && ((1L shl (_la - 7)) and ((1L shl (DO - 7)) or (1L shl (IF - 7)) or (1L shl (NEW - 7)) or (1L shl (LET - 7)) or (1L shl (NULL - 7)) or (1L shl (TRUE - 7)) or (1L shl (FALSE - 7)) or (1L shl (LPAREN - 7)) or (1L shl (LSQUARE - 7)) or (1L shl (ARROW - 7)) or (1L shl (ARROWQM - 7)) or (1L shl (TILDE - 7)) or (1L shl (QUOTE - 7)) or (1L shl (SHARP - 7)) or (1L shl (ID - 7)) or (1L shl (OPID - 7)) or (1L shl (Integer - 7)) or (1L shl (Double - 7)) or (1L shl (String - 7)))) != 0L)) {
				if (true){
				if (true){
				this.state = 662
				value(0)
				}
				}
				this.state = 667
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 668
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
		fun ALPHA() : TerminalNode? = getToken(FoldingParser.Tokens.ALPHA.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(ctx: ArgValueContext) { copyFrom(ctx) }
	}
	open class PrimaryArgValueContext : ArgValueContext {
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun ALPHA() : TerminalNode? = getToken(FoldingParser.Tokens.ALPHA.id, 0)
		fun findArgEx() : List<ArgExContext> = getRuleContexts(solver.getType("ArgExContext"))
		fun findArgEx(i: Int) : ArgExContext? = getRuleContext(solver.getType("ArgExContext"),i)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(ctx: ArgValueContext) { copyFrom(ctx) }
	}

	fun  argValue() : ArgValueContext {
		var _localctx : ArgValueContext = ArgValueContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_argValue.id)
		var _la: Int
		try {
			var _alt: Int
			this.state = 703
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,89,context) ) {
			1 -> {_localctx = PrimaryArgValueContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 677
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ALPHA) {
				if (true){
				this.state = 671
				match(ALPHA) as Token
				this.state = 673 
				errorHandler.sync(this)
				_alt = 1
				do {
					when (_alt) {
					    1 -> if (true){
					if (true){
					this.state = 672
					typeEx()
					}
					}
					else -> throw NoViableAltException(this)
					}
					this.state = 675 
					errorHandler.sync(this)
					_alt = interpreter!!.adaptivePredict(_input!!,83,context)
				} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
				}
			}

			this.state = 679
			match(LPAREN) as Token
			this.state = 683
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (((((_la - 7)) and 0x3f.inv()) == 0 && ((1L shl (_la - 7)) and ((1L shl (DO - 7)) or (1L shl (IF - 7)) or (1L shl (NEW - 7)) or (1L shl (LET - 7)) or (1L shl (NULL - 7)) or (1L shl (TRUE - 7)) or (1L shl (FALSE - 7)) or (1L shl (ELLIPSIS - 7)) or (1L shl (LPAREN - 7)) or (1L shl (LSQUARE - 7)) or (1L shl (LBRACE - 7)) or (1L shl (ARROW - 7)) or (1L shl (ARROWQM - 7)) or (1L shl (TILDE - 7)) or (1L shl (QUOTE - 7)) or (1L shl (SHARP - 7)) or (1L shl (ID - 7)) or (1L shl (OPID - 7)) or (1L shl (Integer - 7)) or (1L shl (Double - 7)) or (1L shl (String - 7)))) != 0L)) {
				if (true){
				if (true){
				this.state = 680
				argEx()
				}
				}
				this.state = 685
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 686
			match(RPAREN) as Token
			}}
			2 -> {_localctx = SingleListArgValueContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 693
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ALPHA) {
				if (true){
				this.state = 687
				match(ALPHA) as Token
				this.state = 689 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
				do {
					if (true){
					if (true){
					this.state = 688
					typeEx()
					}
					}
					this.state = 691 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
				} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl LONG) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl UNIT) or (1L shl LPAREN) or (1L shl QUOTE) or (1L shl ID))) != 0L) )
				}
			}

			this.state = 695
			match(LBRACE) as Token
			this.state = 699
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (((((_la - 7)) and 0x3f.inv()) == 0 && ((1L shl (_la - 7)) and ((1L shl (DO - 7)) or (1L shl (IF - 7)) or (1L shl (NEW - 7)) or (1L shl (LET - 7)) or (1L shl (NULL - 7)) or (1L shl (TRUE - 7)) or (1L shl (FALSE - 7)) or (1L shl (LPAREN - 7)) or (1L shl (LSQUARE - 7)) or (1L shl (ARROW - 7)) or (1L shl (ARROWQM - 7)) or (1L shl (TILDE - 7)) or (1L shl (QUOTE - 7)) or (1L shl (SHARP - 7)) or (1L shl (ID - 7)) or (1L shl (OPID - 7)) or (1L shl (Integer - 7)) or (1L shl (Double - 7)) or (1L shl (String - 7)))) != 0L)) {
				if (true){
				if (true){
				this.state = 696
				value(0)
				}
				}
				this.state = 701
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 702
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
		enterRule(_localctx, 80, Rules.RULE_invoking.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 705
			match(COLON) as Token
			this.state = 706
			match(LPAREN) as Token
			this.state = 710
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (((((_la - 7)) and 0x3f.inv()) == 0 && ((1L shl (_la - 7)) and ((1L shl (DO - 7)) or (1L shl (IF - 7)) or (1L shl (NEW - 7)) or (1L shl (LET - 7)) or (1L shl (NULL - 7)) or (1L shl (TRUE - 7)) or (1L shl (FALSE - 7)) or (1L shl (LPAREN - 7)) or (1L shl (LSQUARE - 7)) or (1L shl (ARROW - 7)) or (1L shl (ARROWQM - 7)) or (1L shl (TILDE - 7)) or (1L shl (QUOTE - 7)) or (1L shl (SHARP - 7)) or (1L shl (ID - 7)) or (1L shl (OPID - 7)) or (1L shl (Integer - 7)) or (1L shl (Double - 7)) or (1L shl (String - 7)))) != 0L)) {
				if (true){
				if (true){
				this.state = 707
				value(0)
				}
				}
				this.state = 712
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 713
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
		enterRule(_localctx, 82, Rules.RULE_commonIdentifier.id)
		try {
			this.state = 718
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,91,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 715
			match(ID) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 716
			opIdWrap()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 717
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
		enterRule(_localctx, 84, Rules.RULE_opIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 720
			match(LSQUARE) as Token
			this.state = 721
			match(OPID) as Token
			this.state = 722
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
		enterRule(_localctx, 86, Rules.RULE_aopIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 724
			match(LSQUARE) as Token
			this.state = 725
			match(TILDE) as Token
			this.state = 726
			match(OPID) as Token
			this.state = 727
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

	open class FieldContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_field.id
	        set(value) { throw RuntimeException() }
		fun findFieldSetted() : FieldSettedContext? = getRuleContext(solver.getType("FieldSettedContext"),0)
		fun findFieldNotInit() : FieldNotInitContext? = getRuleContext(solver.getType("FieldNotInitContext"),0)
		fun findForeignField() : ForeignFieldContext? = getRuleContext(solver.getType("ForeignFieldContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  field() : FieldContext {
		var _localctx : FieldContext = FieldContext(context, state)
		enterRule(_localctx, 88, Rules.RULE_field.id)
		try {
			this.state = 732
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,92,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 729
			fieldSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 730
			fieldNotInit()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 731
			foreignField()
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
		enterRule(_localctx, 90, Rules.RULE_fieldNotInit.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 737
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 734
				match(LPAREN) as Token
				this.state = 735
				match(MUTABLE) as Token
				this.state = 736
				match(RPAREN) as Token
				}
			}

			this.state = 739
			match(ID) as Token
			this.state = 740
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
		enterRule(_localctx, 92, Rules.RULE_fieldSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 745
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 742
				match(LPAREN) as Token
				this.state = 743
				match(MUTABLE) as Token
				this.state = 744
				match(RPAREN) as Token
				}
			}

			this.state = 747
			match(ID) as Token
			this.state = 749
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl LONG) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl UNIT) or (1L shl LPAREN) or (1L shl QUOTE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 748
				typeEx()
				}
			}

			this.state = 751
			match(ASSGIN) as Token
			this.state = 752
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

	open class ForeignFieldContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_foreignField.id
	        set(value) { throw RuntimeException() }
		var gettingValue: ValueContext? = null
		var settingValue: ValueContext? = null
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun GET() : TerminalNode? = getToken(FoldingParser.Tokens.GET.id, 0)
		fun SET() : TerminalNode? = getToken(FoldingParser.Tokens.SET.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignField() : ForeignFieldContext {
		var _localctx : ForeignFieldContext = ForeignFieldContext(context, state)
		enterRule(_localctx, 94, Rules.RULE_foreignField.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 754
			match(LPAREN) as Token
			this.state = 755
			match(FOREIGN) as Token
			this.state = 756
			match(RPAREN) as Token
			this.state = 757
			match(ID) as Token
			this.state = 758
			typeEx()
			this.state = 761
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==GET) {
				if (true){
				this.state = 759
				match(GET) as Token
				this.state = 760
				(_localctx as ForeignFieldContext).gettingValue = value(0)
				}
			}

			this.state = 765
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SET) {
				if (true){
				this.state = 763
				match(SET) as Token
				this.state = 764
				(_localctx as ForeignFieldContext).settingValue = value(0)
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
			this.state = 781
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,100,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 767
			justDef()
			this.state = 771
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==INVERSE) {
				if (true){
				if (true){
				this.state = 768
				inverseDefining()
				}
				}
				this.state = 773
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 774
			foreignDef()
			this.state = 778
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==INVERSE) {
				if (true){
				if (true){
				this.state = 775
				inverseDefining()
				}
				}
				this.state = 780
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
			this.state = 784
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,101,context) ) {
			1   -> if (true){
			this.state = 783
			annotationBlock()
			}
			}
			this.state = 786
			commonIdentifier()
			this.state = 788
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,102,context) ) {
			1   -> if (true){
			this.state = 787
			typeParam()
			}
			}
			this.state = 791
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,103,context) ) {
			1   -> if (true){
			this.state = 790
			parameter()
			}
			}
			this.state = 793
			typeEx()
			this.state = 794
			match(ASSGIN) as Token
			this.state = 795
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
			this.state = 798
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,104,context) ) {
			1   -> if (true){
			this.state = 797
			annotationBlock()
			}
			}
			this.state = 800
			commonIdentifier()
			this.state = 802
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 801
				typeParam()
				}
			}

			this.state = 805
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 804
				parameter()
				}
			}

			this.state = 807
			match(FOREIGN) as Token
			this.state = 808
			typeEx()
			this.state = 810
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE || _la==RawString) {
				if (true){
				this.state = 809
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
			this.state = 812
			match(INVERSE) as Token
			this.state = 814
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 813
				match(ID) as Token
				}
			}

			this.state = 816
			match(LPAREN) as Token
			this.state = 818 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 817
				inverseDefCompo()
				}
				}
				this.state = 820 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( ((((_la - 7)) and 0x3f.inv()) == 0 && ((1L shl (_la - 7)) and ((1L shl (DO - 7)) or (1L shl (IF - 7)) or (1L shl (NEW - 7)) or (1L shl (LET - 7)) or (1L shl (NULL - 7)) or (1L shl (TRUE - 7)) or (1L shl (FALSE - 7)) or (1L shl (LPAREN - 7)) or (1L shl (LSQUARE - 7)) or (1L shl (ARROW - 7)) or (1L shl (ARROWQM - 7)) or (1L shl (TILDE - 7)) or (1L shl (As - 7)) or (1L shl (QUOTE - 7)) or (1L shl (SHARP - 7)) or (1L shl (ID - 7)) or (1L shl (OPID - 7)) or (1L shl (Integer - 7)) or (1L shl (Double - 7)) or (1L shl (String - 7)))) != 0L) )
			this.state = 822
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
		try {
			this.state = 831
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			DO , IF , NEW , LET , NULL , TRUE , FALSE , LPAREN , LSQUARE , ARROW , ARROWQM , TILDE , QUOTE , SHARP , ID , OPID , Integer , Double , String  ->  /*LL1AltBlock*/{_localctx = OutputParamContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 824
			value(0)
			this.state = 827
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,110,context) ) {
			1   -> if (true){
			this.state = 825
			match(TILDE) as Token
			this.state = 826
			typeEx()
			}
			}
			}}
			As  ->  /*LL1AltBlock*/{_localctx = NecessaryParamContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 829
			match(As) as Token
			this.state = 830
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
			this.state = 833
			match(LSQUARE) as Token
			this.state = 834
			parameterForLambda()
			this.state = 835
			match(RSQUARE) as Token
			this.state = 836
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
			this.state = 841
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 838
				paramEx()
				}
				}
				this.state = 843
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 845
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FROM) {
				if (true){
				this.state = 844
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
			this.state = 847
			match(FROM) as Token
			this.state = 849 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 848
				paramCEx()
				}
				}
				this.state = 851 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( ((((_la - 7)) and 0x3f.inv()) == 0 && ((1L shl (_la - 7)) and ((1L shl (DO - 7)) or (1L shl (IF - 7)) or (1L shl (NEW - 7)) or (1L shl (LET - 7)) or (1L shl (NULL - 7)) or (1L shl (TRUE - 7)) or (1L shl (FALSE - 7)) or (1L shl (LPAREN - 7)) or (1L shl (LSQUARE - 7)) or (1L shl (ARROW - 7)) or (1L shl (ARROWQM - 7)) or (1L shl (TILDE - 7)) or (1L shl (QUOTE - 7)) or (1L shl (SHARP - 7)) or (1L shl (ID - 7)) or (1L shl (OPID - 7)) or (1L shl (Integer - 7)) or (1L shl (Double - 7)) or (1L shl (String - 7)))) != 0L) )
			}
		}
		catch (re: RecognitionException) {
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun QM() : TerminalNode? = getToken(FoldingParser.Tokens.QM.id, 0)
		fun findTypeExSingle() : TypeExSingleContext? = getRuleContext(solver.getType("TypeExSingleContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeEx() : TypeExContext {
		var _localctx : TypeExContext = TypeExContext(context, state)
		enterRule(_localctx, 112, Rules.RULE_typeEx.id)
		try {
			this.state = 866
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 860
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,116,context) ) {
			1 -> {if (true){
			this.state = 853
			typeExFunc()
			}}
			2 -> {if (true){
			this.state = 854
			match(LPAREN) as Token
			this.state = 855
			typeExFunc()
			this.state = 856
			match(RPAREN) as Token
			this.state = 858
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,115,context) ) {
			1   -> if (true){
			this.state = 857
			match(QM) as Token
			}
			}
			}}
			}
			}}
			INT , LONG , DOUBLE , FLOAT , BYTE , CHAR , STRING , BOOLEAN , UNIT , QUOTE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 862
			typeExSingle()
			this.state = 864
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,117,context) ) {
			1   -> if (true){
			this.state = 863
			match(QM) as Token
			}
			}
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
		fun QUOTE() : List<TerminalNode> = getTokens(FoldingParser.Tokens.QUOTE.id)
		fun QUOTE(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.QUOTE.id, i) as TerminalNode
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun DOT() : TerminalNode? = getToken(FoldingParser.Tokens.DOT.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findTypeArgEx() : List<TypeArgExContext> = getRuleContexts(solver.getType("TypeArgExContext"))
		fun findTypeArgEx(i: Int) : TypeArgExContext? = getRuleContext(solver.getType("TypeArgExContext"),i)
		fun findPrimitiveType() : PrimitiveTypeContext? = getRuleContext(solver.getType("PrimitiveTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeExSingle() : TypeExSingleContext {
		var _localctx : TypeExSingleContext = TypeExSingleContext(context, state)
		enterRule(_localctx, 114, Rules.RULE_typeExSingle.id)
		var _la: Int
		try {
			this.state = 890
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			QUOTE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 871
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,119,context) ) {
			1   -> if (true){
			this.state = 868
			package_()
			this.state = 869
			match(DOT) as Token
			}
			}
			this.state = 877
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ID  ->  /*LL1AltBlock*/{if (true){
			this.state = 873
			match(ID) as Token
			}}
			QUOTE  ->  /*LL1AltBlock*/{if (true){
			this.state = 874
			match(QUOTE) as Token
			this.state = 875
			match(ID) as Token
			this.state = 876
			match(QUOTE) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 887
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,122,context) ) {
			1   -> if (true){
			this.state = 879
			match(LPAREN) as Token
			this.state = 881 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 880
				typeArgEx()
				}
				}
				this.state = 883 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl LONG) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl UNIT) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl QUOTE) or (1L shl ID))) != 0L) )
			this.state = 885
			match(RPAREN) as Token
			}
			}
			}}
			INT , LONG , DOUBLE , FLOAT , BYTE , CHAR , STRING , BOOLEAN , UNIT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 889
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

	open class TypeArgExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeArgEx.id
	        set(value) { throw RuntimeException() }
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findTypeExCovariant() : TypeExCovariantContext? = getRuleContext(solver.getType("TypeExCovariantContext"),0)
		fun findTypeExContravariant() : TypeExContravariantContext? = getRuleContext(solver.getType("TypeExContravariantContext"),0)
		fun findTypeExWildcard() : TypeExWildcardContext? = getRuleContext(solver.getType("TypeExWildcardContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeArgEx() : TypeArgExContext {
		var _localctx : TypeArgExContext = TypeArgExContext(context, state)
		enterRule(_localctx, 116, Rules.RULE_typeArgEx.id)
		try {
			this.state = 896
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,124,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 892
			typeEx()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 893
			typeExCovariant()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 894
			typeExContravariant()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 895
			typeExWildcard()
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  primitiveType() : PrimitiveTypeContext {
		var _localctx : PrimitiveTypeContext = PrimitiveTypeContext(context, state)
		enterRule(_localctx, 118, Rules.RULE_primitiveType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 898
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl LONG) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl UNIT))) != 0L)) ) {
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
		enterRule(_localctx, 120, Rules.RULE_typeExParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 900
			typeEx()
			this.state = 902
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 901
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
		enterRule(_localctx, 122, Rules.RULE_typeExFunc.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 904
			match(LPAREN) as Token
			this.state = 908
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl LONG) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl UNIT) or (1L shl LPAREN) or (1L shl QUOTE) or (1L shl ID))) != 0L)) {
				if (true){
				if (true){
				this.state = 905
				typeExParamEx()
				}
				}
				this.state = 910
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 911
			match(RPAREN) as Token
			this.state = 912
			match(ARROW) as Token
			this.state = 913
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

	open class TypeExCovariantContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeExCovariant.id
	        set(value) { throw RuntimeException() }
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeExCovariant() : TypeExCovariantContext {
		var _localctx : TypeExCovariantContext = TypeExCovariantContext(context, state)
		enterRule(_localctx, 124, Rules.RULE_typeExCovariant.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 915
			match(LSQUARE) as Token
			this.state = 916
			match(TILDE) as Token
			this.state = 917
			typeEx()
			this.state = 918
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

	open class TypeExContravariantContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeExContravariant.id
	        set(value) { throw RuntimeException() }
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeExContravariant() : TypeExContravariantContext {
		var _localctx : TypeExContravariantContext = TypeExContravariantContext(context, state)
		enterRule(_localctx, 126, Rules.RULE_typeExContravariant.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 920
			match(LSQUARE) as Token
			this.state = 921
			typeEx()
			this.state = 922
			match(TILDE) as Token
			this.state = 923
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

	open class TypeExWildcardContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeExWildcard.id
	        set(value) { throw RuntimeException() }
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun QM() : TerminalNode? = getToken(FoldingParser.Tokens.QM.id, 0)
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeExWildcard() : TypeExWildcardContext {
		var _localctx : TypeExWildcardContext = TypeExWildcardContext(context, state)
		enterRule(_localctx, 128, Rules.RULE_typeExWildcard.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 925
			match(LSQUARE) as Token
			this.state = 926
			match(QM) as Token
			this.state = 927
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
		enterRule(_localctx, 130, Rules.RULE_foreignBody.id)
		var _la: Int
		try {
			this.state = 938
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LBRACE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 929
			match(LBRACE) as Token
			this.state = 933
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 930
				foreignElement()
				}
				}
				this.state = 935
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 936
			match(RBRACE) as Token
			}}
			RawString  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 937
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
		enterRule(_localctx, 132, Rules.RULE_foreignElement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 940
			foreignPlatform()
			this.state = 941
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
		enterRule(_localctx, 134, Rules.RULE_foreignPlatform.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 943
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

	open class TypeAliasContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_typeAlias.id
	        set(value) { throw RuntimeException() }
		fun TYPEALIAS() : TerminalNode? = getToken(FoldingParser.Tokens.TYPEALIAS.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ASSGIN() : TerminalNode? = getToken(FoldingParser.Tokens.ASSGIN.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findForeignBody() : ForeignBodyContext? = getRuleContext(solver.getType("ForeignBodyContext"),0)
		fun findForeignTypeExpectitive() : ForeignTypeExpectitiveContext? = getRuleContext(solver.getType("ForeignTypeExpectitiveContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeAlias() : TypeAliasContext {
		var _localctx : TypeAliasContext = TypeAliasContext(context, state)
		enterRule(_localctx, 136, Rules.RULE_typeAlias.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 945
			match(TYPEALIAS) as Token
			this.state = 946
			match(ID) as Token
			this.state = 951
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 947
				match(LPAREN) as Token
				this.state = 948
				typeParam()
				this.state = 949
				match(RPAREN) as Token
				}
			}

			this.state = 962
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ASSGIN  ->  /*LL1AltBlock*/{if (true){
			this.state = 953
			match(ASSGIN) as Token
			this.state = 954
			typeEx()
			}}
			FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 955
			match(FOREIGN) as Token
			this.state = 957
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE || _la==RawString) {
				if (true){
				this.state = 956
				foreignBody()
				}
			}

			this.state = 960
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==EXPECT) {
				if (true){
				this.state = 959
				foreignTypeExpectitive()
				}
			}

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

	open class ForeignTypeExpectitiveContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_foreignTypeExpectitive.id
	        set(value) { throw RuntimeException() }
		fun EXPECT() : TerminalNode? = getToken(FoldingParser.Tokens.EXPECT.id, 0)
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun COLON() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLON.id)
		fun COLON(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLON.id, i) as TerminalNode
		fun findDefInInterface() : List<DefInInterfaceContext> = getRuleContexts(solver.getType("DefInInterfaceContext"))
		fun findDefInInterface(i: Int) : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),i)
		fun findImpl() : List<ImplContext> = getRuleContexts(solver.getType("ImplContext"))
		fun findImpl(i: Int) : ImplContext? = getRuleContext(solver.getType("ImplContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignTypeExpectitive() : ForeignTypeExpectitiveContext {
		var _localctx : ForeignTypeExpectitiveContext = ForeignTypeExpectitiveContext(context, state)
		enterRule(_localctx, 138, Rules.RULE_foreignTypeExpectitive.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 964
			match(EXPECT) as Token
			this.state = 965
			match(LBRACE) as Token
			this.state = 970
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 966
				match(COLON) as Token
				this.state = 967
				defInInterface()
				}
				}
				this.state = 972
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 976
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 973
				impl()
				}
				}
				this.state = 978
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 979
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
		enterRule(_localctx, 140, Rules.RULE_annotationDef.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 981
			match(ANNOTATION) as Token
			this.state = 982
			match(ID) as Token
			this.state = 983
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
		enterRule(_localctx, 142, Rules.RULE_annotation.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 988
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,135,context) ) {
			1   -> if (true){
			this.state = 985
			package_()
			this.state = 986
			match(DOT) as Token
			}
			}
			this.state = 990
			match(ID) as Token
			this.state = 992
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ALPHA) or (1L shl LPAREN) or (1L shl LBRACE))) != 0L)) {
				if (true){
				this.state = 991
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
		enterRule(_localctx, 144, Rules.RULE_annotationBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 994
			match(LSQUARE) as Token
			this.state = 998
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 995
				annotation()
				}
				}
				this.state = 1000
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1001
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
		28 -> return value_sempred(_localctx as ValueContext, predIndex)
		}
		return true
	}
	private fun value_sempred( _localctx : ValueContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 9)
		    1 -> return precpred(context!!, 7)
		    2 -> return precpred(context!!, 6)
		    3 -> return precpred(context!!, 17)
		    4 -> return precpred(context!!, 16)
		    5 -> return precpred(context!!, 15)
		    6 -> return precpred(context!!, 14)
		    7 -> return precpred(context!!, 13)
		    8 -> return precpred(context!!, 12)
		    9 -> return precpred(context!!, 11)
		    10 -> return precpred(context!!, 8)
		}
		return true
	}

}