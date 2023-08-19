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
                                                              FoldingParser.ImportDefAliasContext::class,
                                                              FoldingParser.ImportClassAliasContext::class,
                                                              FoldingParser.ImportTypeContext::class,
                                                              FoldingParser.ImportPathContext::class,
                                                              FoldingParser.ImportNestContext::class,
                                                              FoldingParser.Package_Context::class,
                                                              FoldingParser.NamespaceContext::class,
                                                              FoldingParser.DoBlockContext::class,
                                                              FoldingParser.CompoContext::class,
                                                              FoldingParser.RemainLet_bindingContext::class,
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
                                                              FoldingParser.PatternMatchContext::class,
                                                              FoldingParser.PatternMatchCompoContext::class,
                                                              FoldingParser.TupleExContext::class,
                                                              FoldingParser.ParamExContext::class,
                                                              FoldingParser.ParameterContext::class,
                                                              FoldingParser.ArgExContext::class,
                                                              FoldingParser.ArgValueContext::class,
                                                              FoldingParser.InvokingContext::class,
                                                              FoldingParser.CommonOpIdentifierContext::class,
                                                              FoldingParser.CommonIdentifierContext::class,
                                                              FoldingParser.OpIdWrapContext::class,
                                                              FoldingParser.AopIdWrapContext::class,
                                                              FoldingParser.CommonClassIdentifierContext::class,
                                                              FoldingParser.FieldContext::class,
                                                              FoldingParser.FieldNotInitContext::class,
                                                              FoldingParser.FieldSettedContext::class,
                                                              FoldingParser.ForeignFieldContext::class,
                                                              FoldingParser.DefContext::class,
                                                              FoldingParser.JustDefContext::class,
                                                              FoldingParser.ForeignDefContext::class,
                                                              FoldingParser.InverseDefiningContext::class,
                                                              FoldingParser.InverseDefCompoContext::class,
                                                              FoldingParser.InverseDefGateCompoContext::class,
                                                              FoldingParser.LambdaContext::class,
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
        WHERE(25),
        FROM(26),
        IS(27),
        GET(28),
        SET(29),
        REMAIN(30),
        MATCH(31),
        INT(32),
        LONG(33),
        DOUBLE(34),
        FLOAT(35),
        BYTE(36),
        CHAR(37),
        STRING(38),
        BOOLEAN(39),
        UNIT(40),
        NULLKEYWORD(41),
        TRUE(42),
        FALSE(43),
        THIS(44),
        PIPE(45),
        ASSGIN(46),
        ELLIPSIS(47),
        DOT(48),
        LPAREN(49),
        RPAREN(50),
        LSQUARE(51),
        RSQUARE(52),
        LBRACE(53),
        RBRACE(54),
        ARROW(55),
        ARROWQM(56),
        TILDE(57),
        As(58),
        COLON(59),
        DOUBLECOLON(60),
        TRIPLECOLON(61),
        COLONSHARP(62),
        QUOTE(63),
        COLONQUOTE(64),
        SHARP(65),
        QM(66),
        EM(67),
        ID(68),
        OPID(69),
        Integer(70),
        Double(71),
        String(72),
        RawString(73)
    }

    enum class Rules(val id: Int) {
        RULE_file(0),
        RULE_fileCompo(1),
        RULE_importEx(2),
        RULE_importBody(3),
        RULE_importCompo(4),
        RULE_importDefAlias(5),
        RULE_importClassAlias(6),
        RULE_importType(7),
        RULE_importPath(8),
        RULE_importNest(9),
        RULE_package_(10),
        RULE_namespace(11),
        RULE_doBlock(12),
        RULE_compo(13),
        RULE_remainLet_binding(14),
        RULE_returning(15),
        RULE_fieldAssign(16),
        RULE_class_(17),
        RULE_constructor_(18),
        RULE_constructorSelf(19),
        RULE_defInInterface(20),
        RULE_fieldInInterface(21),
        RULE_inherit(22),
        RULE_impl(23),
        RULE_implBody(24),
        RULE_typeParam(25),
        RULE_typeParamCompo(26),
        RULE_definition(27),
        RULE_defaultValue(28),
        RULE_boolean(29),
        RULE_value(30),
        RULE_reference(31),
        RULE_typeCasting(32),
        RULE_if_else(33),
        RULE_let_binding(34),
        RULE_patternMatch(35),
        RULE_patternMatchCompo(36),
        RULE_tupleEx(37),
        RULE_paramEx(38),
        RULE_parameter(39),
        RULE_argEx(40),
        RULE_argValue(41),
        RULE_invoking(42),
        RULE_commonOpIdentifier(43),
        RULE_commonIdentifier(44),
        RULE_opIdWrap(45),
        RULE_aopIdWrap(46),
        RULE_commonClassIdentifier(47),
        RULE_field(48),
        RULE_fieldNotInit(49),
        RULE_fieldSetted(50),
        RULE_foreignField(51),
        RULE_def(52),
        RULE_justDef(53),
        RULE_foreignDef(54),
        RULE_inverseDefining(55),
        RULE_inverseDefCompo(56),
        RULE_inverseDefGateCompo(57),
        RULE_lambda(58),
        RULE_typeEx(59),
        RULE_typeExSingle(60),
        RULE_typeArgEx(61),
        RULE_primitiveType(62),
        RULE_typeExParamEx(63),
        RULE_typeExFunc(64),
        RULE_typeExCovariant(65),
        RULE_typeExContravariant(66),
        RULE_typeExWildcard(67),
        RULE_foreignBody(68),
        RULE_foreignElement(69),
        RULE_foreignPlatform(70),
        RULE_typeAlias(71),
        RULE_foreignTypeExpectitive(72),
        RULE_annotationDef(73),
        RULE_annotation(74),
        RULE_annotationBlock(75)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "fileCompo", "importEx", "importBody", 
                                "importCompo", "importDefAlias", "importClassAlias", 
                                "importType", "importPath", "importNest", 
                                "package_", "namespace", "doBlock", "compo", 
                                "remainLet_binding", "returning", "fieldAssign", 
                                "class_", "constructor_", "constructorSelf", 
                                "defInInterface", "fieldInInterface", "inherit", 
                                "impl", "implBody", "typeParam", "typeParamCompo", 
                                "definition", "defaultValue", "boolean", 
                                "value", "reference", "typeCasting", "if_else", 
                                "let_binding", "patternMatch", "patternMatchCompo", 
                                "tupleEx", "paramEx", "parameter", "argEx", 
                                "argValue", "invoking", "commonOpIdentifier", 
                                "commonIdentifier", "opIdWrap", "aopIdWrap", 
                                "commonClassIdentifier", "field", "fieldNotInit", 
                                "fieldSetted", "foreignField", "def", "justDef", 
                                "foreignDef", "inverseDefining", "inverseDefCompo", 
                                "inverseDefGateCompo", "lambda", "typeEx", 
                                "typeExSingle", "typeArgEx", "primitiveType", 
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
                                                          "'where'", "'from!'", 
                                                          "'is!'", "'get!'", 
                                                          "'set!'", "'remain!'", 
                                                          "'match!'", "'Int'", 
                                                          "'Long'", "'Double'", 
                                                          "'Float'", "'Byte'", 
                                                          "'Char'", "'String'", 
                                                          "'Boolean'", "'Unit'", 
                                                          "'null'", "'true'", 
                                                          "'false'", "'this'", 
                                                          "'|'", "'='", 
                                                          "'...'", "'.'", 
                                                          "'('", "')'", 
                                                          "'['", "']'", 
                                                          "'{'", "'}'", 
                                                          "'->'", "'->?'", 
                                                          "'~'", "'~>'", 
                                                          "':'", "'::'", 
                                                          "':::'", "':#'", 
                                                          "'''", "':''", 
                                                          "'#'", "'?'", 
                                                          "'!'")
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
                                                           "WHERE", "FROM", 
                                                           "IS", "GET", 
                                                           "SET", "REMAIN", 
                                                           "MATCH", "INT", 
                                                           "LONG", "DOUBLE", 
                                                           "FLOAT", "BYTE", 
                                                           "CHAR", "STRING", 
                                                           "BOOLEAN", "UNIT", 
                                                           "NULLKEYWORD", 
                                                           "TRUE", "FALSE", 
                                                           "THIS", "PIPE", 
                                                           "ASSGIN", "ELLIPSIS", 
                                                           "DOT", "LPAREN", 
                                                           "RPAREN", "LSQUARE", 
                                                           "RSQUARE", "LBRACE", 
                                                           "RBRACE", "ARROW", 
                                                           "ARROWQM", "TILDE", 
                                                           "As", "COLON", 
                                                           "DOUBLECOLON", 
                                                           "TRIPLECOLON", 
                                                           "COLONSHARP", 
                                                           "QUOTE", "COLONQUOTE", 
                                                           "SHARP", "QM", 
                                                           "EM", "ID", "OPID", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u004b\u0469\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0004\u0042\u0009\u0042\u0004\u0043\u0009\u0043\u0004\u0044\u0009\u0044\u0004\u0045\u0009\u0045\u0004\u0046\u0009\u0046\u0004\u0047\u0009\u0047\u0004\u0048\u0009\u0048\u0004\u0049\u0009\u0049\u0004\u004a\u0009\u004a\u0004\u004b\u0009\u004b\u0004\u004c\u0009\u004c\u0004\u004d\u0009\u004d\u0003\u0002\u0005\u0002\u009c\u000a\u0002\u0003\u0002\u0007\u0002\u009f\u000a\u0002\u000c\u0002\u000e\u0002\u00a2\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u00a7\u000a\u0002\u000c\u0002\u000e\u0002\u00aa\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u00af\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u00b4\u000a\u0004\u0003\u0004\u0005\u0004\u00b7\u000a\u0004\u0003\u0004\u0005\u0004\u00ba\u000a\u0004\u0003\u0005\u0003\u0005\u0007\u0005\u00be\u000a\u0005\u000c\u0005\u000e\u0005\u00c1\u000b\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00c8\u000a\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00cc\u000a\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00d2\u000a\u0006\u0005\u0006\u00d4\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000b\u00e4\u000a\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00e9\u000a\u000c\u000c\u000c\u000e\u000c\u00ec\u000b\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0007\u000e\u00f4\u000a\u000e\u000c\u000e\u000e\u000e\u00f7\u000b\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00ff\u000a\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0111\u000a\u0012\u0003\u0013\u0005\u0013\u0114\u000a\u0013\u0003\u0013\u0005\u0013\u0117\u000a\u0013\u0003\u0013\u0005\u0013\u011a\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0122\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0007\u0013\u0127\u000a\u0013\u000c\u0013\u000e\u0013\u012a\u000b\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u012f\u000a\u0013\u0007\u0013\u0131\u000a\u0013\u000c\u0013\u000e\u0013\u0134\u000b\u0013\u0003\u0013\u0007\u0013\u0137\u000a\u0013\u000c\u0013\u000e\u0013\u013a\u000b\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u013f\u000a\u0013\u0003\u0013\u0005\u0013\u0142\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u014a\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0007\u0013\u0150\u000a\u0013\u000c\u0013\u000e\u0013\u0153\u000b\u0013\u0003\u0013\u0003\u0013\u0007\u0013\u0157\u000a\u0013\u000c\u0013\u000e\u0013\u015a\u000b\u0013\u0003\u0013\u0005\u0013\u015d\u000a\u0013\u0003\u0013\u0007\u0013\u0160\u000a\u0013\u000c\u0013\u000e\u0013\u0163\u000b\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0168\u000a\u0013\u0003\u0013\u0005\u0013\u016b\u000a\u0013\u0003\u0013\u0005\u0013\u016e\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0176\u000a\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u017a\u000a\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u017f\u000a\u0013\u0007\u0013\u0181\u000a\u0013\u000c\u0013\u000e\u0013\u0184\u000b\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u0189\u000a\u0013\u0007\u0013\u018b\u000a\u0013\u000c\u0013\u000e\u0013\u018e\u000b\u0013\u0003\u0013\u0005\u0013\u0191\u000a\u0013\u0003\u0013\u0007\u0013\u0194\u000a\u0013\u000c\u0013\u000e\u0013\u0197\u000b\u0013\u0003\u0013\u0003\u0013\u0005\u0013\u019b\u000a\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0005\u0014\u01a2\u000a\u0014\u0003\u0014\u0005\u0014\u01a5\u000a\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u01ab\u000a\u0015\u0003\u0015\u0005\u0015\u01ae\u000a\u0015\u0003\u0016\u0005\u0016\u01b1\u000a\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u01b5\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u01bb\u000a\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0005\u0018\u01c7\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u01ce\u000a\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0007\u001a\u01d3\u000a\u001a\u000c\u001a\u000e\u001a\u01d6\u000b\u001a\u0003\u001a\u0003\u001a\u0007\u001a\u01da\u000a\u001a\u000c\u001a\u000e\u001a\u01dd\u000b\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0007\u001a\u01e2\u000a\u001a\u000c\u001a\u000e\u001a\u01e5\u000b\u001a\u0003\u001a\u0003\u001a\u0007\u001a\u01e9\u000a\u001a\u000c\u001a\u000e\u001a\u01ec\u000b\u001a\u0005\u001a\u01ee\u000a\u001a\u0003\u001b\u0006\u001b\u01f1\u000a\u001b\u000d\u001b\u000e\u001b\u01f2\u0003\u001c\u0003\u001c\u0003\u001c\u0007\u001c\u01f8\u000a\u001c\u000c\u001c\u000e\u001c\u01fb\u000b\u001c\u0003\u001d\u0003\u001d\u0005\u001d\u01ff\u000a\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u0205\u000a\u001e\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u0210\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u0216\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u021b\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0007\u0020\u0223\u000a\u0020\u000c\u0020\u000e\u0020\u0226\u000b\u0020\u0003\u0020\u0003\u0020\u0007\u0020\u022a\u000a\u0020\u000c\u0020\u000e\u0020\u022d\u000b\u0020\u0003\u0020\u0005\u0020\u0230\u000a\u0020\u0003\u0020\u0007\u0020\u0233\u000a\u0020\u000c\u0020\u000e\u0020\u0236\u000b\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u023c\u000a\u0020\u0005\u0020\u023e\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u024e\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u0259\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u0262\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u026a\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u0273\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u027e\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u0288\u000a\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0020\u0005\u0020\u0292\u000a\u0020\u0007\u0020\u0294\u000a\u0020\u000c\u0020\u000e\u0020\u0297\u000b\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0005\u0021\u029c\u000a\u0021\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0006\u0025\u02b5\u000a\u0025\u000d\u0025\u000e\u0025\u02b6\u0003\u0026\u0003\u0026\u0003\u0026\u0005\u0026\u02bc\u000a\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0003\u0027\u0007\u0027\u02c4\u000a\u0027\u000c\u0027\u000e\u0027\u02c7\u000b\u0027\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0005\u0028\u02d6\u000a\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0005\u0028\u02e1\u000a\u0028\u0003\u0029\u0006\u0029\u02e4\u000a\u0029\u000d\u0029\u000e\u0029\u02e5\u0003\u002a\u0003\u002a\u0005\u002a\u02ea\u000a\u002a\u0003\u002a\u0005\u002a\u02ed\u000a\u002a\u0003\u002a\u0003\u002a\u0003\u002a\u0005\u002a\u02f2\u000a\u002a\u0003\u002a\u0003\u002a\u0007\u002a\u02f6\u000a\u002a\u000c\u002a\u000e\u002a\u02f9\u000b\u002a\u0003\u002a\u0005\u002a\u02fc\u000a\u002a\u0003\u002b\u0003\u002b\u0006\u002b\u0300\u000a\u002b\u000d\u002b\u000e\u002b\u0301\u0003\u002b\u0003\u002b\u0005\u002b\u0306\u000a\u002b\u0003\u002b\u0007\u002b\u0309\u000a\u002b\u000c\u002b\u000e\u002b\u030c\u000b\u002b\u0003\u002b\u0003\u002b\u0003\u002b\u0006\u002b\u0311\u000a\u002b\u000d\u002b\u000e\u002b\u0312\u0003\u002b\u0003\u002b\u0005\u002b\u0317\u000a\u002b\u0003\u002b\u0007\u002b\u031a\u000a\u002b\u000c\u002b\u000e\u002b\u031d\u000b\u002b\u0003\u002b\u0005\u002b\u0320\u000a\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0007\u002c\u0325\u000a\u002c\u000c\u002c\u000e\u002c\u0328\u000b\u002c\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0005\u002d\u0330\u000a\u002d\u0003\u002e\u0003\u002e\u0003\u002e\u0005\u002e\u0335\u000a\u002e\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u002f\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0030\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0005\u0031\u0344\u000a\u0031\u0003\u0032\u0003\u0032\u0003\u0032\u0005\u0032\u0349\u000a\u0032\u0003\u0033\u0003\u0033\u0003\u0033\u0005\u0033\u034e\u000a\u0033\u0003\u0033\u0003\u0033\u0003\u0033\u0003\u0034\u0003\u0034\u0003\u0034\u0005\u0034\u0356\u000a\u0034\u0003\u0034\u0003\u0034\u0005\u0034\u035a\u000a\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u0367\u000a\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u036d\u000a\u0035\u0003\u0036\u0003\u0036\u0007\u0036\u0371\u000a\u0036\u000c\u0036\u000e\u0036\u0374\u000b\u0036\u0003\u0036\u0003\u0036\u0007\u0036\u0378\u000a\u0036\u000c\u0036\u000e\u0036\u037b\u000b\u0036\u0005\u0036\u037d\u000a\u0036\u0003\u0037\u0005\u0037\u0380\u000a\u0037\u0003\u0037\u0003\u0037\u0005\u0037\u0384\u000a\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0005\u0037\u038a\u000a\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0038\u0005\u0038\u0391\u000a\u0038\u0003\u0038\u0003\u0038\u0005\u0038\u0395\u000a\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0005\u0038\u039b\u000a\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0005\u0038\u03a0\u000a\u0038\u0003\u0039\u0003\u0039\u0005\u0039\u03a4\u000a\u0039\u0003\u0039\u0003\u0039\u0006\u0039\u03a8\u000a\u0039\u000d\u0039\u000e\u0039\u03a9\u0003\u0039\u0003\u0039\u0003\u0039\u0003\u0039\u0005\u0039\u03b0\u000a\u0039\u0003\u0039\u0003\u0039\u0006\u0039\u03b4\u000a\u0039\u000d\u0039\u000e\u0039\u03b5\u0003\u0039\u0003\u0039\u0003\u0039\u0005\u0039\u03bb\u000a\u0039\u0003\u003a\u0003\u003a\u0003\u003a\u0005\u003a\u03c0\u000a\u003a\u0003\u003a\u0003\u003a\u0005\u003a\u03c4\u000a\u003a\u0003\u003b\u0003\u003b\u0003\u003b\u0005\u003b\u03c9\u000a\u003b\u0003\u003b\u0003\u003b\u0005\u003b\u03cd\u000a\u003b\u0003\u003c\u0003\u003c\u0005\u003c\u03d1\u000a\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0003\u003d\u0003\u003d\u0003\u003d\u0003\u003d\u0003\u003d\u0005\u003d\u03db\u000a\u003d\u0005\u003d\u03dd\u000a\u003d\u0003\u003d\u0003\u003d\u0005\u003d\u03e1\u000a\u003d\u0005\u003d\u03e3\u000a\u003d\u0003\u003e\u0003\u003e\u0003\u003e\u0005\u003e\u03e8\u000a\u003e\u0003\u003e\u0003\u003e\u0003\u003e\u0006\u003e\u03ed\u000a\u003e\u000d\u003e\u000e\u003e\u03ee\u0003\u003e\u0003\u003e\u0005\u003e\u03f3\u000a\u003e\u0003\u003e\u0005\u003e\u03f6\u000a\u003e\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0005\u003f\u03fc\u000a\u003f\u0003\u0040\u0003\u0040\u0003\u0041\u0003\u0041\u0005\u0041\u0402\u000a\u0041\u0003\u0042\u0003\u0042\u0007\u0042\u0406\u000a\u0042\u000c\u0042\u000e\u0042\u0409\u000b\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0042\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0045\u0003\u0045\u0003\u0045\u0003\u0045\u0003\u0046\u0003\u0046\u0007\u0046\u041f\u000a\u0046\u000c\u0046\u000e\u0046\u0422\u000b\u0046\u0003\u0046\u0003\u0046\u0005\u0046\u0426\u000a\u0046\u0003\u0047\u0003\u0047\u0003\u0047\u0003\u0048\u0003\u0048\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0005\u0049\u0433\u000a\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0003\u0049\u0005\u0049\u0439\u000a\u0049\u0003\u0049\u0005\u0049\u043c\u000a\u0049\u0005\u0049\u043e\u000a\u0049\u0003\u004a\u0003\u004a\u0003\u004a\u0003\u004a\u0007\u004a\u0444\u000a\u004a\u000c\u004a\u000e\u004a\u0447\u000b\u004a\u0003\u004a\u0007\u004a\u044a\u000a\u004a\u000c\u004a\u000e\u004a\u044d\u000b\u004a\u0003\u004a\u0003\u004a\u0003\u004b\u0003\u004b\u0003\u004b\u0003\u004b\u0003\u004b\u0003\u004b\u0003\u004c\u0003\u004c\u0003\u004c\u0005\u004c\u045a\u000a\u004c\u0003\u004c\u0003\u004c\u0005\u004c\u045e\u000a\u004c\u0003\u004d\u0003\u004d\u0007\u004d\u0462\u000a\u004d\u000c\u004d\u000e\u004d\u0465\u000b\u004d\u0003\u004d\u0003\u004d\u0003\u004d\u0002\u0003\u003e\u004e\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0070\u0072\u0074\u0076\u0078\u007a\u007c\u007e\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u0002\u0005\u0003\u0002\u002c\u002d\u0004\u0002\u0044\u0044\u0046\u0046\u0003\u0002\u0022\u002a\u0002\u04d9\u0002\u009b\u0003\u0002\u0002\u0002\u0004\u00ae\u0003\u0002\u0002\u0002\u0006\u00b0\u0003\u0002\u0002\u0002\u0008\u00bb\u0003\u0002\u0002\u0002\u000a\u00d3\u0003\u0002\u0002\u0002\u000c\u00d5\u0003\u0002\u0002\u0002\u000e\u00d7\u0003\u0002\u0002\u0002\u0010\u00d9\u0003\u0002\u0002\u0002\u0012\u00db\u0003\u0002\u0002\u0002\u0014\u00e3\u0003\u0002\u0002\u0002\u0016\u00e5\u0003\u0002\u0002\u0002\u0018\u00ed\u0003\u0002\u0002\u0002\u001a\u00f0\u0003\u0002\u0002\u0002\u001c\u00fe\u0003\u0002\u0002\u0002\u001e\u0100\u0003\u0002\u0002\u0002\u0020\u0103\u0003\u0002\u0002\u0002\u0022\u0110\u0003\u0002\u0002\u0002\u0024\u019a\u0003\u0002\u0002\u0002\u0026\u019c\u0003\u0002\u0002\u0002\u0028\u01aa\u0003\u0002\u0002\u0002\u002a\u01b0\u0003\u0002\u0002\u0002\u002c\u01be\u0003\u0002\u0002\u0002\u002e\u01c4\u0003\u0002\u0002\u0002\u0030\u01ca\u0003\u0002\u0002\u0002\u0032\u01ed\u0003\u0002\u0002\u0002\u0034\u01f0\u0003\u0002\u0002\u0002\u0036\u01f4\u0003\u0002\u0002\u0002\u0038\u01fe\u0003\u0002\u0002\u0002\u003a\u0204\u0003\u0002\u0002\u0002\u003c\u0206\u0003\u0002\u0002\u0002\u003e\u024d\u0003\u0002\u0002\u0002\u0040\u029b\u0003\u0002\u0002\u0002\u0042\u029f\u0003\u0002\u0002\u0002\u0044\u02a4\u0003\u0002\u0002\u0002\u0046\u02ac\u0003\u0002\u0002\u0002\u0048\u02b2\u0003\u0002\u0002\u0002\u004a\u02b8\u0003\u0002\u0002\u0002\u004c\u02c0\u0003\u0002\u0002\u0002\u004e\u02e0\u0003\u0002\u0002\u0002\u0050\u02e3\u0003\u0002\u0002\u0002\u0052\u02fb\u0003\u0002\u0002\u0002\u0054\u031f\u0003\u0002\u0002\u0002\u0056\u0321\u0003\u0002\u0002\u0002\u0058\u032f\u0003\u0002\u0002\u0002\u005a\u0334\u0003\u0002\u0002\u0002\u005c\u0336\u0003\u0002\u0002\u0002\u005e\u033a\u0003\u0002\u0002\u0002\u0060\u0343\u0003\u0002\u0002\u0002\u0062\u0348\u0003\u0002\u0002\u0002\u0064\u034d\u0003\u0002\u0002\u0002\u0066\u0355\u0003\u0002\u0002\u0002\u0068\u035e\u0003\u0002\u0002\u0002\u006a\u037c\u0003\u0002\u0002\u0002\u006c\u037f\u0003\u0002\u0002\u0002\u006e\u0390\u0003\u0002\u0002\u0002\u0070\u03ba\u0003\u0002\u0002\u0002\u0072\u03c3\u0003\u0002\u0002\u0002\u0074\u03cc\u0003\u0002\u0002\u0002\u0076\u03ce\u0003\u0002\u0002\u0002\u0078\u03e2\u0003\u0002\u0002\u0002\u007a\u03f5\u0003\u0002\u0002\u0002\u007c\u03fb\u0003\u0002\u0002\u0002\u007e\u03fd\u0003\u0002\u0002\u0002\u0080\u03ff\u0003\u0002\u0002\u0002\u0082\u0403\u0003\u0002\u0002\u0002\u0084\u040e\u0003\u0002\u0002\u0002\u0086\u0413\u0003\u0002\u0002\u0002\u0088\u0418\u0003\u0002\u0002\u0002\u008a\u0425\u0003\u0002\u0002\u0002\u008c\u0427\u0003\u0002\u0002\u0002\u008e\u042a\u0003\u0002\u0002\u0002\u0090\u042c\u0003\u0002\u0002\u0002\u0092\u043f\u0003\u0002\u0002\u0002\u0094\u0450\u0003\u0002\u0002\u0002\u0096\u0459\u0003\u0002\u0002\u0002\u0098\u045f\u0003\u0002\u0002\u0002\u009a\u009c\u0005\u0018\u000d\u0002\u009b\u009a\u0003\u0002\u0002\u0002\u009b\u009c\u0003\u0002\u0002\u0002\u009c\u00a0\u0003\u0002\u0002\u0002\u009d\u009f\u0005\u0006\u0004\u0002\u009e\u009d\u0003\u0002\u0002\u0002\u009f\u00a2\u0003\u0002\u0002\u0002\u00a0\u009e\u0003\u0002\u0002\u0002\u00a0\u00a1\u0003\u0002\u0002\u0002\u00a1\u00a8\u0003\u0002\u0002\u0002\u00a2\u00a0\u0003\u0002\u0002\u0002\u00a3\u00a7\u0005\u0004\u0003\u0002\u00a4\u00a7\u0005\u0094\u004b\u0002\u00a5\u00a7\u0005\u0090\u0049\u0002\u00a6\u00a3\u0003\u0002\u0002\u0002\u00a6\u00a4\u0003\u0002\u0002\u0002\u00a6\u00a5\u0003\u0002\u0002\u0002\u00a7\u00aa\u0003\u0002\u0002\u0002\u00a8\u00a6\u0003\u0002\u0002\u0002\u00a8\u00a9\u0003\u0002\u0002\u0002\u00a9\u0003\u0003\u0002\u0002\u0002\u00aa\u00a8\u0003\u0002\u0002\u0002\u00ab\u00af\u0005\u0038\u001d\u0002\u00ac\u00ad\u0007\u0043\u0002\u0002\u00ad\u00af\u0005\u0062\u0032\u0002\u00ae\u00ab\u0003\u0002\u0002\u0002\u00ae\u00ac\u0003\u0002\u0002\u0002\u00af\u0005\u0003\u0002\u0002\u0002\u00b0\u00b1\u0007\u000d\u0002\u0002\u00b1\u00b3\u0005\u0016\u000c\u0002\u00b2\u00b4\u0005\u0014\u000b\u0002\u00b3\u00b2\u0003\u0002\u0002\u0002\u00b3\u00b4\u0003\u0002\u0002\u0002\u00b4\u00b6\u0003\u0002\u0002\u0002\u00b5\u00b7\u0005\u0012\u000a\u0002\u00b6\u00b5\u0003\u0002\u0002\u0002\u00b6\u00b7\u0003\u0002\u0002\u0002\u00b7\u00b9\u0003\u0002\u0002\u0002\u00b8\u00ba\u0005\u0008\u0005\u0002\u00b9\u00b8\u0003\u0002\u0002\u0002\u00b9\u00ba\u0003\u0002\u0002\u0002\u00ba\u0007\u0003\u0002\u0002\u0002\u00bb\u00bf\u0007\u0037\u0002\u0002\u00bc\u00be\u0005\u000a\u0006\u0002\u00bd\u00bc\u0003\u0002\u0002\u0002\u00be\u00c1\u0003\u0002\u0002\u0002\u00bf\u00bd\u0003\u0002\u0002\u0002\u00bf\u00c0\u0003\u0002\u0002\u0002\u00c0\u00c2\u0003\u0002\u0002\u0002\u00c1\u00bf\u0003\u0002\u0002\u0002\u00c2\u00c3\u0007\u0038\u0002\u0002\u00c3\u0009\u0003\u0002\u0002\u0002\u00c4\u00c7\u0005\u005a\u002e\u0002\u00c5\u00c6\u0007\u0043\u0002\u0002\u00c6\u00c8\u0005\u000c\u0007\u0002\u00c7\u00c5\u0003\u0002\u0002\u0002\u00c7\u00c8\u0003\u0002\u0002\u0002\u00c8\u00cb\u0003\u0002\u0002\u0002\u00c9\u00ca\u0007\u003c\u0002\u0002\u00ca\u00cc\u0005\u0010\u0009\u0002\u00cb\u00c9\u0003\u0002\u0002\u0002\u00cb\u00cc\u0003\u0002\u0002\u0002\u00cc\u00d4\u0003\u0002\u0002\u0002\u00cd\u00ce\u0007\u0008\u0002\u0002\u00ce\u00d1\u0005\u0060\u0031\u0002\u00cf\u00d0\u0007\u0043\u0002\u0002\u00d0\u00d2\u0005\u000e\u0008\u0002\u00d1\u00cf\u0003\u0002\u0002\u0002\u00d1\u00d2\u0003\u0002\u0002\u0002\u00d2\u00d4\u0003\u0002\u0002\u0002\u00d3\u00c4\u0003\u0002\u0002\u0002\u00d3\u00cd\u0003\u0002\u0002\u0002\u00d4\u000b\u0003\u0002\u0002\u0002\u00d5\u00d6\u0005\u005a\u002e\u0002\u00d6\u000d\u0003\u0002\u0002\u0002\u00d7\u00d8\u0005\u0060\u0031\u0002\u00d8\u000f\u0003\u0002\u0002\u0002\u00d9\u00da\u0005\u0078\u003d\u0002\u00da\u0011\u0003\u0002\u0002\u0002\u00db\u00dc\u0007\u0033\u0002\u0002\u00dc\u00dd\u0007\u001c\u0002\u0002\u00dd\u00de\u0007\u004b\u0002\u0002\u00de\u00df\u0007\u0034\u0002\u0002\u00df\u0013\u0003\u0002\u0002\u0002\u00e0\u00e1\u0007\u0043\u0002\u0002\u00e1\u00e4\u0007\u0046\u0002\u0002\u00e2\u00e4\u0007\u0045\u0002\u0002\u00e3\u00e0\u0003\u0002\u0002\u0002\u00e3\u00e2\u0003\u0002\u0002\u0002\u00e4\u0015\u0003\u0002\u0002\u0002\u00e5\u00ea\u0007\u0046\u0002\u0002\u00e6\u00e7\u0007\u0032\u0002\u0002\u00e7\u00e9\u0007\u0046\u0002\u0002\u00e8\u00e6\u0003\u0002\u0002\u0002\u00e9\u00ec\u0003\u0002\u0002\u0002\u00ea\u00e8\u0003\u0002\u0002\u0002\u00ea\u00eb\u0003\u0002\u0002\u0002\u00eb\u0017\u0003\u0002\u0002\u0002\u00ec\u00ea\u0003\u0002\u0002\u0002\u00ed\u00ee\u0007\u000b\u0002\u0002\u00ee\u00ef\u0005\u0016\u000c\u0002\u00ef\u0019\u0003\u0002\u0002\u0002\u00f0\u00f1\u0007\u0009\u0002\u0002\u00f1\u00f5\u0007\u0037\u0002\u0002\u00f2\u00f4\u0005\u001c\u000f\u0002\u00f3\u00f2\u0003\u0002\u0002\u0002\u00f4\u00f7\u0003\u0002\u0002\u0002\u00f5\u00f3\u0003\u0002\u0002\u0002\u00f5\u00f6\u0003\u0002\u0002\u0002\u00f6\u00f8\u0003\u0002\u0002\u0002\u00f7\u00f5\u0003\u0002\u0002\u0002\u00f8\u00f9\u0007\u0038\u0002\u0002\u00f9\u001b\u0003\u0002\u0002\u0002\u00fa\u00ff\u0005\u0022\u0012\u0002\u00fb\u00ff\u0005\u001e\u0010\u0002\u00fc\u00ff\u0005\u003e\u0020\u0002\u00fd\u00ff\u0005\u0020\u0011\u0002\u00fe\u00fa\u0003\u0002\u0002\u0002\u00fe\u00fb\u0003\u0002\u0002\u0002\u00fe\u00fc\u0003\u0002\u0002\u0002\u00fe\u00fd\u0003\u0002\u0002\u0002\u00ff\u001d\u0003\u0002\u0002\u0002\u0100\u0101\u0007\u0020\u0002\u0002\u0101\u0102\u0005\u0046\u0024\u0002\u0102\u001f\u0003\u0002\u0002\u0002\u0103\u0104\u0007\u0010\u0002\u0002\u0104\u0105\u0005\u003e\u0020\u0002\u0105\u0021\u0003\u0002\u0002\u0002\u0106\u0107\u0007\u0043\u0002\u0002\u0107\u0108\u0007\u0046\u0002\u0002\u0108\u0109\u0007\u0030\u0002\u0002\u0109\u0111\u0005\u003e\u0020\u0002\u010a\u010b\u0005\u003e\u0020\u0002\u010b\u010c\u0007\u0040\u0002\u0002\u010c\u010d\u0007\u0046\u0002\u0002\u010d\u010e\u0007\u0030\u0002\u0002\u010e\u010f\u0005\u003e\u0020\u0002\u010f\u0111\u0003\u0002\u0002\u0002\u0110\u0106\u0003\u0002\u0002\u0002\u0110\u010a\u0003\u0002\u0002\u0002\u0111\u0023\u0003\u0002\u0002\u0002\u0112\u0114\u0005\u0098\u004d\u0002\u0113\u0112\u0003\u0002\u0002\u0002\u0113\u0114\u0003\u0002\u0002\u0002\u0114\u0116\u0003\u0002\u0002\u0002\u0115\u0117\u0007\u0006\u0002\u0002\u0116\u0115\u0003\u0002\u0002\u0002\u0116\u0117\u0003\u0002\u0002\u0002\u0117\u0119\u0003\u0002\u0002\u0002\u0118\u011a\u0007\u0012\u0002\u0002\u0119\u0118\u0003\u0002\u0002\u0002\u0119\u011a\u0003\u0002\u0002\u0002\u011a\u011b\u0003\u0002\u0002\u0002\u011b\u011c\u0007\u0008\u0002\u0002\u011c\u0121\u0005\u0060\u0031\u0002\u011d\u011e\u0007\u0033\u0002\u0002\u011e\u011f\u0005\u0034\u001b\u0002\u011f\u0120\u0007\u0034\u0002\u0002\u0120\u0122\u0003\u0002\u0002\u0002\u0121\u011d\u0003\u0002\u0002\u0002\u0121\u0122\u0003\u0002\u0002\u0002\u0122\u0123\u0003\u0002\u0002\u0002\u0123\u0128\u0007\u0037\u0002\u0002\u0124\u0125\u0007\u0040\u0002\u0002\u0125\u0127\u0005\u002c\u0017\u0002\u0126\u0124\u0003\u0002\u0002\u0002\u0127\u012a\u0003\u0002\u0002\u0002\u0128\u0126\u0003\u0002\u0002\u0002\u0128\u0129\u0003\u0002\u0002\u0002\u0129\u0132\u0003\u0002\u0002\u0002\u012a\u0128\u0003\u0002\u0002\u0002\u012b\u012e\u0007\u003d\u0002\u0002\u012c\u012f\u0005\u002a\u0016\u0002\u012d\u012f\u0005\u006a\u0036\u0002\u012e\u012c\u0003\u0002\u0002\u0002\u012e\u012d\u0003\u0002\u0002\u0002\u012f\u0131\u0003\u0002\u0002\u0002\u0130\u012b\u0003\u0002\u0002\u0002\u0131\u0134\u0003\u0002\u0002\u0002\u0132\u0130\u0003\u0002\u0002\u0002\u0132\u0133\u0003\u0002\u0002\u0002\u0133\u0138\u0003\u0002\u0002\u0002\u0134\u0132\u0003\u0002\u0002\u0002\u0135\u0137\u0005\u0030\u0019\u0002\u0136\u0135\u0003\u0002\u0002\u0002\u0137\u013a\u0003\u0002\u0002\u0002\u0138\u0136\u0003\u0002\u0002\u0002\u0138\u0139\u0003\u0002\u0002\u0002\u0139\u013b\u0003\u0002\u0002\u0002\u013a\u0138\u0003\u0002\u0002\u0002\u013b\u013c\u0007\u0038\u0002\u0002\u013c\u019b\u0003\u0002\u0002\u0002\u013d\u013f\u0005\u0098\u004d\u0002\u013e\u013d\u0003\u0002\u0002\u0002\u013e\u013f\u0003\u0002\u0002\u0002\u013f\u0141\u0003\u0002\u0002\u0002\u0140\u0142\u0007\u0013\u0002\u0002\u0141\u0140\u0003\u0002\u0002\u0002\u0141\u0142\u0003\u0002\u0002\u0002\u0142\u0143\u0003\u0002\u0002\u0002\u0143\u0144\u0007\u0008\u0002\u0002\u0144\u0149\u0005\u0060\u0031\u0002\u0145\u0146\u0007\u0033\u0002\u0002\u0146\u0147\u0005\u0034\u001b\u0002\u0147\u0148\u0007\u0034\u0002\u0002\u0148\u014a\u0003\u0002\u0002\u0002\u0149\u0145\u0003\u0002\u0002\u0002\u0149\u014a\u0003\u0002\u0002\u0002\u014a\u014b\u0003\u0002\u0002\u0002\u014b\u014c\u0007\u0037\u0002\u0002\u014c\u0151\u0005\u0028\u0015\u0002\u014d\u014e\u0007\u0040\u0002\u0002\u014e\u0150\u0005\u0062\u0032\u0002\u014f\u014d\u0003\u0002\u0002\u0002\u0150\u0153\u0003\u0002\u0002\u0002\u0151\u014f\u0003\u0002\u0002\u0002\u0151\u0152\u0003\u0002\u0002\u0002\u0152\u0158\u0003\u0002\u0002\u0002\u0153\u0151\u0003\u0002\u0002\u0002\u0154\u0155\u0007\u003d\u0002\u0002\u0155\u0157\u0005\u006a\u0036\u0002\u0156\u0154\u0003\u0002\u0002\u0002\u0157\u015a\u0003\u0002\u0002\u0002\u0158\u0156\u0003\u0002\u0002\u0002\u0158\u0159\u0003\u0002\u0002\u0002\u0159\u015c\u0003\u0002\u0002\u0002\u015a\u0158\u0003\u0002\u0002\u0002\u015b\u015d\u0005\u002e\u0018\u0002\u015c\u015b\u0003\u0002\u0002\u0002\u015c\u015d\u0003\u0002\u0002\u0002\u015d\u0161\u0003\u0002\u0002\u0002\u015e\u0160\u0005\u0030\u0019\u0002\u015f\u015e\u0003\u0002\u0002\u0002\u0160\u0163\u0003\u0002\u0002\u0002\u0161\u015f\u0003\u0002\u0002\u0002\u0161\u0162\u0003\u0002\u0002\u0002\u0162\u0164\u0003\u0002\u0002\u0002\u0163\u0161\u0003\u0002\u0002\u0002\u0164\u0165\u0007\u0038\u0002\u0002\u0165\u019b\u0003\u0002\u0002\u0002\u0166\u0168\u0005\u0098\u004d\u0002\u0167\u0166\u0003\u0002\u0002\u0002\u0167\u0168\u0003\u0002\u0002\u0002\u0168\u016a\u0003\u0002\u0002\u0002\u0169\u016b\u0007\u0006\u0002\u0002\u016a\u0169\u0003\u0002\u0002\u0002\u016a\u016b\u0003\u0002\u0002\u0002\u016b\u016d\u0003\u0002\u0002\u0002\u016c\u016e\u0007\u0013\u0002\u0002\u016d\u016c\u0003\u0002\u0002\u0002\u016d\u016e\u0003\u0002\u0002\u0002\u016e\u016f\u0003\u0002\u0002\u0002\u016f\u0170\u0007\u0008\u0002\u0002\u0170\u0175\u0005\u0060\u0031\u0002\u0171\u0172\u0007\u0033\u0002\u0002\u0172\u0173\u0005\u0034\u001b\u0002\u0173\u0174\u0007\u0034\u0002\u0002\u0174\u0176\u0003\u0002\u0002\u0002\u0175\u0171\u0003\u0002\u0002\u0002\u0175\u0176\u0003\u0002\u0002\u0002\u0176\u0177\u0003\u0002\u0002\u0002\u0177\u0179\u0007\u0037\u0002\u0002\u0178\u017a\u0005\u0028\u0015\u0002\u0179\u0178\u0003\u0002\u0002\u0002\u0179\u017a\u0003\u0002\u0002\u0002\u017a\u0182\u0003\u0002\u0002\u0002\u017b\u017e\u0007\u0040\u0002\u0002\u017c\u017f\u0005\u0062\u0032\u0002\u017d\u017f\u0005\u002c\u0017\u0002\u017e\u017c\u0003\u0002\u0002\u0002\u017e\u017d\u0003\u0002\u0002\u0002\u017f\u0181\u0003\u0002\u0002\u0002\u0180\u017b\u0003\u0002\u0002\u0002\u0181\u0184\u0003\u0002\u0002\u0002\u0182\u0180\u0003\u0002\u0002\u0002\u0182\u0183\u0003\u0002\u0002\u0002\u0183\u018c\u0003\u0002\u0002\u0002\u0184\u0182\u0003\u0002\u0002\u0002\u0185\u0188\u0007\u003d\u0002\u0002\u0186\u0189\u0005\u002a\u0016\u0002\u0187\u0189\u0005\u006a\u0036\u0002\u0188\u0186\u0003\u0002\u0002\u0002\u0188\u0187\u0003\u0002\u0002\u0002\u0189\u018b\u0003\u0002\u0002\u0002\u018a\u0185\u0003\u0002\u0002\u0002\u018b\u018e\u0003\u0002\u0002\u0002\u018c\u018a\u0003\u0002\u0002\u0002\u018c\u018d\u0003\u0002\u0002\u0002\u018d\u0190\u0003\u0002\u0002\u0002\u018e\u018c\u0003\u0002\u0002\u0002\u018f\u0191\u0005\u002e\u0018\u0002\u0190\u018f\u0003\u0002\u0002\u0002\u0190\u0191\u0003\u0002\u0002\u0002\u0191\u0195\u0003\u0002\u0002\u0002\u0192\u0194\u0005\u0030\u0019\u0002\u0193\u0192\u0003\u0002\u0002\u0002\u0194\u0197\u0003\u0002\u0002\u0002\u0195\u0193\u0003\u0002\u0002\u0002\u0195\u0196\u0003\u0002\u0002\u0002\u0196\u0198\u0003\u0002\u0002\u0002\u0197\u0195\u0003\u0002\u0002\u0002\u0198\u0199\u0007\u0038\u0002\u0002\u0199\u019b\u0003\u0002\u0002\u0002\u019a\u0113\u0003\u0002\u0002\u0002\u019a\u013e\u0003\u0002\u0002\u0002\u019a\u0167\u0003\u0002\u0002\u0002\u019b\u0025\u0003\u0002\u0002\u0002\u019c\u01a1\u0007\u0046\u0002\u0002\u019d\u019e\u0007\u0033\u0002\u0002\u019e\u019f\u0005\u0050\u0029\u0002\u019f\u01a0\u0007\u0034\u0002\u0002\u01a0\u01a2\u0003\u0002\u0002\u0002\u01a1\u019d\u0003\u0002\u0002\u0002\u01a1\u01a2\u0003\u0002\u0002\u0002\u01a2\u01a4\u0003\u0002\u0002\u0002\u01a3\u01a5\u0005\u001a\u000e\u0002\u01a4\u01a3\u0003\u0002\u0002\u0002\u01a4\u01a5\u0003\u0002\u0002\u0002\u01a5\u0027\u0003\u0002\u0002\u0002\u01a6\u01a7\u0007\u0033\u0002\u0002\u01a7\u01a8\u0005\u0050\u0029\u0002\u01a8\u01a9\u0007\u0034\u0002\u0002\u01a9\u01ab\u0003\u0002\u0002\u0002\u01aa\u01a6\u0003\u0002\u0002\u0002\u01aa\u01ab\u0003\u0002\u0002\u0002\u01ab\u01ad\u0003\u0002\u0002\u0002\u01ac\u01ae\u0005\u001a\u000e\u0002\u01ad\u01ac\u0003\u0002\u0002\u0002\u01ad\u01ae\u0003\u0002\u0002\u0002\u01ae\u0029\u0003\u0002\u0002\u0002\u01af\u01b1\u0005\u0098\u004d\u0002\u01b0\u01af\u0003\u0002\u0002\u0002\u01b0\u01b1\u0003\u0002\u0002\u0002\u01b1\u01b2\u0003\u0002\u0002\u0002\u01b2\u01b4\u0005\u005a\u002e\u0002\u01b3\u01b5\u0005\u0034\u001b\u0002\u01b4\u01b3\u0003\u0002\u0002\u0002\u01b4\u01b5\u0003\u0002\u0002\u0002\u01b5\u01ba\u0003\u0002\u0002\u0002\u01b6\u01b7\u0007\u0033\u0002\u0002\u01b7\u01b8\u0005\u0050\u0029\u0002\u01b8\u01b9\u0007\u0034\u0002\u0002\u01b9\u01bb\u0003\u0002\u0002\u0002\u01ba\u01b6\u0003\u0002\u0002\u0002\u01ba\u01bb\u0003\u0002\u0002\u0002\u01bb\u01bc\u0003\u0002\u0002\u0002\u01bc\u01bd\u0005\u0078\u003d\u0002\u01bd\u002b\u0003\u0002\u0002\u0002\u01be\u01bf\u0007\u0033\u0002\u0002\u01bf\u01c0\u0007\u0006\u0002\u0002\u01c0\u01c1\u0007\u0034\u0002\u0002\u01c1\u01c2\u0003\u0002\u0002\u0002\u01c2\u01c3\u0005\u0064\u0033\u0002\u01c3\u002d\u0003\u0002\u0002\u0002\u01c4\u01c6\u0007\u000f\u0002\u0002\u01c5\u01c7\u0005\u0054\u002b\u0002\u01c6\u01c5\u0003\u0002\u0002\u0002\u01c6\u01c7\u0003\u0002\u0002\u0002\u01c7\u01c8\u0003\u0002\u0002\u0002\u01c8\u01c9\u0005\u0030\u0019\u0002\u01c9\u002f\u0003\u0002\u0002\u0002\u01ca\u01cb\u0007\u000e\u0002\u0002\u01cb\u01cd\u0005\u0078\u003d\u0002\u01cc\u01ce\u0005\u0032\u001a\u0002\u01cd\u01cc\u0003\u0002\u0002\u0002\u01cd\u01ce\u0003\u0002\u0002\u0002\u01ce\u0031\u0003\u0002\u0002\u0002\u01cf\u01d4\u0007\u0037\u0002\u0002\u01d0\u01d1\u0007\u0040\u0002\u0002\u01d1\u01d3\u0005\u0062\u0032\u0002\u01d2\u01d0\u0003\u0002\u0002\u0002\u01d3\u01d6\u0003\u0002\u0002\u0002\u01d4\u01d2\u0003\u0002\u0002\u0002\u01d4\u01d5\u0003\u0002\u0002\u0002\u01d5\u01db\u0003\u0002\u0002\u0002\u01d6\u01d4\u0003\u0002\u0002\u0002\u01d7\u01d8\u0007\u003d\u0002\u0002\u01d8\u01da\u0005\u006a\u0036\u0002\u01d9\u01d7\u0003\u0002\u0002\u0002\u01da\u01dd\u0003\u0002\u0002\u0002\u01db\u01d9\u0003\u0002\u0002\u0002\u01db\u01dc\u0003\u0002\u0002\u0002\u01dc\u01de\u0003\u0002\u0002\u0002\u01dd\u01db\u0003\u0002\u0002\u0002\u01de\u01ee\u0007\u0038\u0002\u0002\u01df\u01e0\u0007\u0040\u0002\u0002\u01e0\u01e2\u0005\u0062\u0032\u0002\u01e1\u01df\u0003\u0002\u0002\u0002\u01e2\u01e5\u0003\u0002\u0002\u0002\u01e3\u01e1\u0003\u0002\u0002\u0002\u01e3\u01e4\u0003\u0002\u0002\u0002\u01e4\u01ea\u0003\u0002\u0002\u0002\u01e5\u01e3\u0003\u0002\u0002\u0002\u01e6\u01e7\u0007\u003d\u0002\u0002\u01e7\u01e9\u0005\u006a\u0036\u0002\u01e8\u01e6\u0003\u0002\u0002\u0002\u01e9\u01ec\u0003\u0002\u0002\u0002\u01ea\u01e8\u0003\u0002\u0002\u0002\u01ea\u01eb\u0003\u0002\u0002\u0002\u01eb\u01ee\u0003\u0002\u0002\u0002\u01ec\u01ea\u0003\u0002\u0002\u0002\u01ed\u01cf\u0003\u0002\u0002\u0002\u01ed\u01e3\u0003\u0002\u0002\u0002\u01ee\u0033\u0003\u0002\u0002\u0002\u01ef\u01f1\u0005\u0036\u001c\u0002\u01f0\u01ef\u0003\u0002\u0002\u0002\u01f1\u01f2\u0003\u0002\u0002\u0002\u01f2\u01f0\u0003\u0002\u0002\u0002\u01f2\u01f3\u0003\u0002\u0002\u0002\u01f3\u0035\u0003\u0002\u0002\u0002\u01f4\u01f9\u0005\u0060\u0031\u0002\u01f5\u01f6\u0007\u003b\u0002\u0002\u01f6\u01f8\u0005\u0078\u003d\u0002\u01f7\u01f5\u0003\u0002\u0002\u0002\u01f8\u01fb\u0003\u0002\u0002\u0002\u01f9\u01f7\u0003\u0002\u0002\u0002\u01f9\u01fa\u0003\u0002\u0002\u0002\u01fa\u0037\u0003\u0002\u0002\u0002\u01fb\u01f9\u0003\u0002\u0002\u0002\u01fc\u01ff\u0005\u006a\u0036\u0002\u01fd\u01ff\u0005\u0024\u0013\u0002\u01fe\u01fc\u0003\u0002\u0002\u0002\u01fe\u01fd\u0003\u0002\u0002\u0002\u01ff\u0039\u0003\u0002\u0002\u0002\u0200\u0205\u0007\u0048\u0002\u0002\u0201\u0205\u0007\u0049\u0002\u0002\u0202\u0205\u0007\u004a\u0002\u0002\u0203\u0205\u0005\u003c\u001f\u0002\u0204\u0200\u0003\u0002\u0002\u0002\u0204\u0201\u0003\u0002\u0002\u0002\u0204\u0202\u0003\u0002\u0002\u0002\u0204\u0203\u0003\u0002\u0002\u0002\u0205\u003b\u0003\u0002\u0002\u0002\u0206\u0207\u0009\u0002\u0002\u0002\u0207\u003d\u0003\u0002\u0002\u0002\u0208\u0209\u0008\u0020\u0001\u0002\u0209\u024e\u0005\u003a\u001e\u0002\u020a\u024e\u0007\u002b\u0002\u0002\u020b\u024e\u0007\u002e\u0002\u0002\u020c\u020d\u0007\u0039\u0002\u0002\u020d\u0210\u0009\u0003\u0002\u0002\u020e\u0210\u0007\u003a\u0002\u0002\u020f\u020c\u0003\u0002\u0002\u0002\u020f\u020e\u0003\u0002\u0002\u0002\u0210\u024e\u0003\u0002\u0002\u0002\u0211\u0212\u0007\u0041\u0002\u0002\u0212\u024e\u0005\u0040\u0021\u0002\u0213\u0215\u0005\u0040\u0021\u0002\u0214\u0216\u0005\u0054\u002b\u0002\u0215\u0214\u0003\u0002\u0002\u0002\u0215\u0216\u0003\u0002\u0002\u0002\u0216\u024e\u0003\u0002\u0002\u0002\u0217\u0218\u0007\u0018\u0002\u0002\u0218\u021a\u0005\u0040\u0021\u0002\u0219\u021b\u0005\u0054\u002b\u0002\u021a\u0219\u0003\u0002\u0002\u0002\u021a\u021b\u0003\u0002\u0002\u0002\u021b\u024e\u0003\u0002\u0002\u0002\u021c\u021d\u0007\u0043\u0002\u0002\u021d\u024e\u0005\u0040\u0021\u0002\u021e\u021f\u0007\u0018\u0002\u0002\u021f\u0224\u0007\u0037\u0002\u0002\u0220\u0221\u0007\u0040\u0002\u0002\u0221\u0223\u0005\u0062\u0032\u0002\u0222\u0220\u0003\u0002\u0002\u0002\u0223\u0226\u0003\u0002\u0002\u0002\u0224\u0222\u0003\u0002\u0002\u0002\u0224\u0225\u0003\u0002\u0002\u0002\u0225\u022b\u0003\u0002\u0002\u0002\u0226\u0224\u0003\u0002\u0002\u0002\u0227\u0228\u0007\u003d\u0002\u0002\u0228\u022a\u0005\u006a\u0036\u0002\u0229\u0227\u0003\u0002\u0002\u0002\u022a\u022d\u0003\u0002\u0002\u0002\u022b\u0229\u0003\u0002\u0002\u0002\u022b\u022c\u0003\u0002\u0002\u0002\u022c\u022f\u0003\u0002\u0002\u0002\u022d\u022b\u0003\u0002\u0002\u0002\u022e\u0230\u0005\u002e\u0018\u0002\u022f\u022e\u0003\u0002\u0002\u0002\u022f\u0230\u0003\u0002\u0002\u0002\u0230\u0234\u0003\u0002\u0002\u0002\u0231\u0233\u0005\u0030\u0019\u0002\u0232\u0231\u0003\u0002\u0002\u0002\u0233\u0236\u0003\u0002\u0002\u0002\u0234\u0232\u0003\u0002\u0002\u0002\u0234\u0235\u0003\u0002\u0002\u0002\u0235\u0237\u0003\u0002\u0002\u0002\u0236\u0234\u0003\u0002\u0002\u0002\u0237\u023e\u0007\u0038\u0002\u0002\u0238\u023b\u0007\u0018\u0002\u0002\u0239\u023c\u0005\u002e\u0018\u0002\u023a\u023c\u0005\u0030\u0019\u0002\u023b\u0239\u0003\u0002\u0002\u0002\u023b\u023a\u0003\u0002\u0002\u0002\u023c\u023e\u0003\u0002\u0002\u0002\u023d\u021e\u0003\u0002\u0002\u0002\u023d\u0238\u0003\u0002\u0002\u0002\u023e\u024e\u0003\u0002\u0002\u0002\u023f\u024e\u0005\u004c\u0027\u0002\u0240\u0241\u0007\u003b\u0002\u0002\u0241\u0242\u0005\u0058\u002d\u0002\u0242\u0243\u0005\u003e\u0020\u000c\u0243\u024e\u0003\u0002\u0002\u0002\u0244\u024e\u0005\u0044\u0023\u0002\u0245\u024e\u0005\u0048\u0025\u0002\u0246\u024e\u0005\u0046\u0024\u0002\u0247\u024e\u0005\u001a\u000e\u0002\u0248\u024e\u0005\u0076\u003c\u0002\u0249\u024a\u0007\u0033\u0002\u0002\u024a\u024b\u0005\u003e\u0020\u0002\u024b\u024c\u0007\u0034\u0002\u0002\u024c\u024e\u0003\u0002\u0002\u0002\u024d\u0208\u0003\u0002\u0002\u0002\u024d\u020a\u0003\u0002\u0002\u0002\u024d\u020b\u0003\u0002\u0002\u0002\u024d\u020f\u0003\u0002\u0002\u0002\u024d\u0211\u0003\u0002\u0002\u0002\u024d\u0213\u0003\u0002\u0002\u0002\u024d\u0217\u0003\u0002\u0002\u0002\u024d\u021c\u0003\u0002\u0002\u0002\u024d\u023d\u0003\u0002\u0002\u0002\u024d\u023f\u0003\u0002\u0002\u0002\u024d\u0240\u0003\u0002\u0002\u0002\u024d\u0244\u0003\u0002\u0002\u0002\u024d\u0245\u0003\u0002\u0002\u0002\u024d\u0246\u0003\u0002\u0002\u0002\u024d\u0247\u0003\u0002\u0002\u0002\u024d\u0248\u0003\u0002\u0002\u0002\u024d\u0249\u0003\u0002\u0002\u0002\u024e\u0295\u0003\u0002\u0002\u0002\u024f\u0250\u000c\u0014\u0002\u0002\u0250\u0294\u0005\u0042\u0022\u0002\u0251\u0252\u000c\u0013\u0002\u0002\u0252\u0253\u0007\u0040\u0002\u0002\u0253\u0294\u0005\u005a\u002e\u0002\u0254\u0255\u000c\u0012\u0002\u0002\u0255\u0256\u0007\u003d\u0002\u0002\u0256\u0258\u0005\u005a\u002e\u0002\u0257\u0259\u0005\u0054\u002b\u0002\u0258\u0257\u0003\u0002\u0002\u0002\u0258\u0259\u0003\u0002\u0002\u0002\u0259\u0294\u0003\u0002\u0002\u0002\u025a\u025b\u000c\u0011\u0002\u0002\u025b\u025c\u0007\u0042\u0002\u0002\u025c\u0294\u0005\u005a\u002e\u0002\u025d\u025e\u000c\u0010\u0002\u0002\u025e\u025f\u0007\u003e\u0002\u0002\u025f\u0261\u0005\u005a\u002e\u0002\u0260\u0262\u0005\u0054\u002b\u0002\u0261\u0260\u0003\u0002\u0002\u0002\u0261\u0262\u0003\u0002\u0002\u0002\u0262\u0294\u0003\u0002\u0002\u0002\u0263\u0264\u000c\u000f\u0002\u0002\u0264\u0294\u0005\u0056\u002c\u0002\u0265\u0266\u000c\u000e\u0002\u0002\u0266\u0267\u0007\u003f\u0002\u0002\u0267\u0269\u0005\u003e\u0020\u0002\u0268\u026a\u0005\u0056\u002c\u0002\u0269\u0268\u0003\u0002\u0002\u0002\u0269\u026a\u0003\u0002\u0002\u0002\u026a\u0294\u0003\u0002\u0002\u0002\u026b\u0272\u000c\u000d\u0002\u0002\u026c\u026d\u0007\u0041\u0002\u0002\u026d\u0273\u0005\u0058\u002d\u0002\u026e\u026f\u0007\u0033\u0002\u0002\u026f\u0270\u0005\u0058\u002d\u0002\u0270\u0271\u0007\u0034\u0002\u0002\u0271\u0273\u0003\u0002\u0002\u0002\u0272\u026c\u0003\u0002\u0002\u0002\u0272\u026e\u0003\u0002\u0002\u0002\u0273\u0294\u0003\u0002\u0002\u0002\u0274\u027d\u000c\u000b\u0002\u0002\u0275\u0276\u0005\u0058\u002d\u0002\u0276\u0277\u0005\u003e\u0020\u0002\u0277\u027e\u0003\u0002\u0002\u0002\u0278\u0279\u0007\u0033\u0002\u0002\u0279\u027a\u0005\u0058\u002d\u0002\u027a\u027b\u0005\u003e\u0020\u0002\u027b\u027c\u0007\u0034\u0002\u0002\u027c\u027e\u0003\u0002\u0002\u0002\u027d\u0275\u0003\u0002\u0002\u0002\u027d\u0278\u0003\u0002\u0002\u0002\u027e\u0294\u0003\u0002\u0002\u0002\u027f\u0287\u000c\u000a\u0002\u0002\u0280\u0281\u0007\u001d\u0002\u0002\u0281\u0288\u0005\u0078\u003d\u0002\u0282\u0283\u0007\u0033\u0002\u0002\u0283\u0284\u0007\u001d\u0002\u0002\u0284\u0285\u0005\u0078\u003d\u0002\u0285\u0286\u0007\u0034\u0002\u0002\u0286\u0288\u0003\u0002\u0002\u0002\u0287\u0280\u0003\u0002\u0002\u0002\u0287\u0282\u0003\u0002\u0002\u0002\u0288\u0294\u0003\u0002\u0002\u0002\u0289\u0291\u000c\u0009\u0002\u0002\u028a\u028b\u0007\u0016\u0002\u0002\u028b\u0292\u0005\u003e\u0020\u0002\u028c\u028d\u0007\u0033\u0002\u0002\u028d\u028e\u0007\u0016\u0002\u0002\u028e\u028f\u0005\u003e\u0020\u0002\u028f\u0290\u0007\u0034\u0002\u0002\u0290\u0292\u0003\u0002\u0002\u0002\u0291\u028a\u0003\u0002\u0002\u0002\u0291\u028c\u0003\u0002\u0002\u0002\u0292\u0294\u0003\u0002\u0002\u0002\u0293\u024f\u0003\u0002\u0002\u0002\u0293\u0251\u0003\u0002\u0002\u0002\u0293\u0254\u0003\u0002\u0002\u0002\u0293\u025a\u0003\u0002\u0002\u0002\u0293\u025d\u0003\u0002\u0002\u0002\u0293\u0263\u0003\u0002\u0002\u0002\u0293\u0265\u0003\u0002\u0002\u0002\u0293\u026b\u0003\u0002\u0002\u0002\u0293\u0274\u0003\u0002\u0002\u0002\u0293\u027f\u0003\u0002\u0002\u0002\u0293\u0289\u0003\u0002\u0002\u0002\u0294\u0297\u0003\u0002\u0002\u0002\u0295\u0293\u0003\u0002\u0002\u0002\u0295\u0296\u0003\u0002\u0002\u0002\u0296\u003f\u0003\u0002\u0002\u0002\u0297\u0295\u0003\u0002\u0002\u0002\u0298\u0299\u0005\u0016\u000c\u0002\u0299\u029a\u0007\u0032\u0002\u0002\u029a\u029c\u0003\u0002\u0002\u0002\u029b\u0298\u0003\u0002\u0002\u0002\u029b\u029c\u0003\u0002\u0002\u0002\u029c\u029d\u0003\u0002\u0002\u0002\u029d\u029e\u0005\u005a\u002e\u0002\u029e\u0041\u0003\u0002\u0002\u0002\u029f\u02a0\u0007\u0033\u0002\u0002\u02a0\u02a1\u0007\u003b\u0002\u0002\u02a1\u02a2\u0005\u0078\u003d\u0002\u02a2\u02a3\u0007\u0034\u0002\u0002\u02a3\u0043\u0003\u0002\u0002\u0002\u02a4\u02a5\u0007\u0016\u0002\u0002\u02a5\u02a6\u0007\u0033\u0002\u0002\u02a6\u02a7\u0005\u003e\u0020\u0002\u02a7\u02a8\u0007\u0034\u0002\u0002\u02a8\u02a9\u0005\u003e\u0020\u0002\u02a9\u02aa\u0007\u0017\u0002\u0002\u02aa\u02ab\u0005\u003e\u0020\u0002\u02ab\u0045\u0003\u0002\u0002\u0002\u02ac\u02ad\u0007\u0019\u0002\u0002\u02ad\u02ae\u0005\u003e\u0020\u0002\u02ae\u02af\u0007\u0030\u0002\u0002\u02af\u02b0\u0005\u003e\u0020\u0002\u02b0\u02b1\u0005\u003e\u0020\u0002\u02b1\u0047\u0003\u0002\u0002\u0002\u02b2\u02b4\u0007\u0021\u0002\u0002\u02b3\u02b5\u0005\u004a\u0026\u0002\u02b4\u02b3\u0003\u0002\u0002\u0002\u02b5\u02b6\u0003\u0002\u0002\u0002\u02b6\u02b4\u0003\u0002\u0002\u0002\u02b6\u02b7\u0003\u0002\u0002\u0002\u02b7\u0049\u0003\u0002\u0002\u0002\u02b8\u02bb\u0005\u003e\u0020\u0002\u02b9\u02ba\u0007\u001b\u0002\u0002\u02ba\u02bc\u0005\u003e\u0020\u0002\u02bb\u02b9\u0003\u0002\u0002\u0002\u02bb\u02bc\u0003\u0002\u0002\u0002\u02bc\u02bd\u0003\u0002\u0002\u0002\u02bd\u02be\u0007\u0039\u0002\u0002\u02be\u02bf\u0005\u003e\u0020\u0002\u02bf\u004b\u0003\u0002\u0002\u0002\u02c0\u02c1\u0007\u0043\u0002\u0002\u02c1\u02c5\u0007\u0033\u0002\u0002\u02c2\u02c4\u0005\u003e\u0020\u0002\u02c3\u02c2\u0003\u0002\u0002\u0002\u02c4\u02c7\u0003\u0002\u0002\u0002\u02c5\u02c3\u0003\u0002\u0002\u0002\u02c5\u02c6\u0003\u0002\u0002\u0002\u02c6\u02c8\u0003\u0002\u0002\u0002\u02c7\u02c5\u0003\u0002\u0002\u0002\u02c8\u02c9\u0007\u0034\u0002\u0002\u02c9\u004d\u0003\u0002\u0002\u0002\u02ca\u02cb\u0007\u0046\u0002\u0002\u02cb\u02cc\u0007\u0031\u0002\u0002\u02cc\u02cd\u0007\u003b\u0002\u0002\u02cd\u02e1\u0005\u0078\u003d\u0002\u02ce\u02cf\u0007\u0046\u0002\u0002\u02cf\u02d0\u0007\u003b\u0002\u0002\u02d0\u02e1\u0005\u0078\u003d\u0002\u02d1\u02d5\u0005\u003e\u0020\u0002\u02d2\u02d3\u0007\u0039\u0002\u0002\u02d3\u02d6\u0007\u0044\u0002\u0002\u02d4\u02d6\u0007\u003a\u0002\u0002\u02d5\u02d2\u0003\u0002\u0002\u0002\u02d5\u02d4\u0003\u0002\u0002\u0002\u02d6\u02d7\u0003\u0002\u0002\u0002\u02d7\u02d8\u0007\u003b\u0002\u0002\u02d8\u02d9\u0005\u0078\u003d\u0002\u02d9\u02e1\u0003\u0002\u0002\u0002\u02da\u02db\u0005\u003e\u0020\u0002\u02db\u02dc\u0007\u0039\u0002\u0002\u02dc\u02dd\u0007\u0046\u0002\u0002\u02dd\u02de\u0007\u003b\u0002\u0002\u02de\u02df\u0005\u0078\u003d\u0002\u02df\u02e1\u0003\u0002\u0002\u0002\u02e0\u02ca\u0003\u0002\u0002\u0002\u02e0\u02ce\u0003\u0002\u0002\u0002\u02e0\u02d1\u0003\u0002\u0002\u0002\u02e0\u02da\u0003\u0002\u0002\u0002\u02e1\u004f\u0003\u0002\u0002\u0002\u02e2\u02e4\u0005\u004e\u0028\u0002\u02e3\u02e2\u0003\u0002\u0002\u0002\u02e4\u02e5\u0003\u0002\u0002\u0002\u02e5\u02e3\u0003\u0002\u0002\u0002\u02e5\u02e6\u0003\u0002\u0002\u0002\u02e6\u0051\u0003\u0002\u0002\u0002\u02e7\u02e8\u0007\u0046\u0002\u0002\u02e8\u02ea\u0007\u0030\u0002\u0002\u02e9\u02e7\u0003\u0002\u0002\u0002\u02e9\u02ea\u0003\u0002\u0002\u0002\u02ea\u02ec\u0003\u0002\u0002\u0002\u02eb\u02ed\u0007\u0031\u0002\u0002\u02ec\u02eb\u0003\u0002\u0002\u0002\u02ec\u02ed\u0003\u0002\u0002\u0002\u02ed\u02ee\u0003\u0002\u0002\u0002\u02ee\u02fc\u0005\u003e\u0020\u0002\u02ef\u02f0\u0007\u0046\u0002\u0002\u02f0\u02f2\u0007\u0031\u0002\u0002\u02f1\u02ef\u0003\u0002\u0002\u0002\u02f1\u02f2\u0003\u0002\u0002\u0002\u02f2\u02f3\u0003\u0002\u0002\u0002\u02f3\u02f7\u0007\u0037\u0002\u0002\u02f4\u02f6\u0005\u003e\u0020\u0002\u02f5\u02f4\u0003\u0002\u0002\u0002\u02f6\u02f9\u0003\u0002\u0002\u0002\u02f7\u02f5\u0003\u0002\u0002\u0002\u02f7\u02f8\u0003\u0002\u0002\u0002\u02f8\u02fa\u0003\u0002\u0002\u0002\u02f9\u02f7\u0003\u0002\u0002\u0002\u02fa\u02fc\u0007\u0038\u0002\u0002\u02fb\u02e9\u0003\u0002\u0002\u0002\u02fb\u02f1\u0003\u0002\u0002\u0002\u02fc\u0053\u0003\u0002\u0002\u0002\u02fd\u0305\u0007\u0033\u0002\u0002\u02fe\u0300\u0005\u0078\u003d\u0002\u02ff\u02fe\u0003\u0002\u0002\u0002\u0300\u0301\u0003\u0002\u0002\u0002\u0301\u02ff\u0003\u0002\u0002\u0002\u0301\u0302\u0003\u0002\u0002\u0002\u0302\u0303\u0003\u0002\u0002\u0002\u0303\u0304\u0007\u002f\u0002\u0002\u0304\u0306\u0003\u0002\u0002\u0002\u0305\u02ff\u0003\u0002\u0002\u0002\u0305\u0306\u0003\u0002\u0002\u0002\u0306\u030a\u0003\u0002\u0002\u0002\u0307\u0309\u0005\u0052\u002a\u0002\u0308\u0307\u0003\u0002\u0002\u0002\u0309\u030c\u0003\u0002\u0002\u0002\u030a\u0308\u0003\u0002\u0002\u0002\u030a\u030b\u0003\u0002\u0002\u0002\u030b\u030d\u0003\u0002\u0002\u0002\u030c\u030a\u0003\u0002\u0002\u0002\u030d\u0320\u0007\u0034\u0002\u0002\u030e\u0316\u0007\u0037\u0002\u0002\u030f\u0311\u0005\u0078\u003d\u0002\u0310\u030f\u0003\u0002\u0002\u0002\u0311\u0312\u0003\u0002\u0002\u0002\u0312\u0310\u0003\u0002\u0002\u0002\u0312\u0313\u0003\u0002\u0002\u0002\u0313\u0314\u0003\u0002\u0002\u0002\u0314\u0315\u0007\u002f\u0002\u0002\u0315\u0317\u0003\u0002\u0002\u0002\u0316\u0310\u0003\u0002\u0002\u0002\u0316\u0317\u0003\u0002\u0002\u0002\u0317\u031b\u0003\u0002\u0002\u0002\u0318\u031a\u0005\u003e\u0020\u0002\u0319\u0318\u0003\u0002\u0002\u0002\u031a\u031d\u0003\u0002\u0002\u0002\u031b\u0319\u0003\u0002\u0002\u0002\u031b\u031c\u0003\u0002\u0002\u0002\u031c\u031e\u0003\u0002\u0002\u0002\u031d\u031b\u0003\u0002\u0002\u0002\u031e\u0320\u0007\u0038\u0002\u0002\u031f\u02fd\u0003\u0002\u0002\u0002\u031f\u030e\u0003\u0002\u0002\u0002\u0320\u0055\u0003\u0002\u0002\u0002\u0321\u0322\u0007\u003d\u0002\u0002\u0322\u0326\u0007\u0033\u0002\u0002\u0323\u0325\u0005\u003e\u0020\u0002\u0324\u0323\u0003\u0002\u0002\u0002\u0325\u0328\u0003\u0002\u0002\u0002\u0326\u0324\u0003\u0002\u0002\u0002\u0326\u0327\u0003\u0002\u0002\u0002\u0327\u0329\u0003\u0002\u0002\u0002\u0328\u0326\u0003\u0002\u0002\u0002\u0329\u032a\u0007\u0034\u0002\u0002\u032a\u0057\u0003\u0002\u0002\u0002\u032b\u0330\u0007\u0047\u0002\u0002\u032c\u032d\u0005\u005a\u002e\u0002\u032d\u032e\u0007\u0045\u0002\u0002\u032e\u0330\u0003\u0002\u0002\u0002\u032f\u032b\u0003\u0002\u0002\u0002\u032f\u032c\u0003\u0002\u0002\u0002\u0330\u0059\u0003\u0002\u0002\u0002\u0331\u0335\u0007\u0046\u0002\u0002\u0332\u0335\u0005\u005c\u002f\u0002\u0333\u0335\u0005\u005e\u0030\u0002\u0334\u0331\u0003\u0002\u0002\u0002\u0334\u0332\u0003\u0002\u0002\u0002\u0334\u0333\u0003\u0002\u0002\u0002\u0335\u005b\u0003\u0002\u0002\u0002\u0336\u0337\u0007\u0035\u0002\u0002\u0337\u0338\u0007\u0047\u0002\u0002\u0338\u0339\u0007\u0036\u0002\u0002\u0339\u005d\u0003\u0002\u0002\u0002\u033a\u033b\u0007\u0035\u0002\u0002\u033b\u033c\u0007\u003b\u0002\u0002\u033c\u033d\u0007\u0047\u0002\u0002\u033d\u033e\u0007\u0036\u0002\u0002\u033e\u005f\u0003\u0002\u0002\u0002\u033f\u0344\u0007\u0046\u0002\u0002\u0340\u0341\u0007\u0041\u0002\u0002\u0341\u0342\u0007\u0046\u0002\u0002\u0342\u0344\u0007\u0041\u0002\u0002\u0343\u033f\u0003\u0002\u0002\u0002\u0343\u0340\u0003\u0002\u0002\u0002\u0344\u0061\u0003\u0002\u0002\u0002\u0345\u0349\u0005\u0066\u0034\u0002\u0346\u0349\u0005\u0064\u0033\u0002\u0347\u0349\u0005\u0068\u0035\u0002\u0348\u0345\u0003\u0002\u0002\u0002\u0348\u0346\u0003\u0002\u0002\u0002\u0348\u0347\u0003\u0002\u0002\u0002\u0349\u0063\u0003\u0002\u0002\u0002\u034a\u034b\u0007\u0033\u0002\u0002\u034b\u034c\u0007\u0011\u0002\u0002\u034c\u034e\u0007\u0034\u0002\u0002\u034d\u034a\u0003\u0002\u0002\u0002\u034d\u034e\u0003\u0002\u0002\u0002\u034e\u034f\u0003\u0002\u0002\u0002\u034f\u0350\u0007\u0046\u0002\u0002\u0350\u0351\u0005\u0078\u003d\u0002\u0351\u0065\u0003\u0002\u0002\u0002\u0352\u0353\u0007\u0033\u0002\u0002\u0353\u0354\u0007\u0011\u0002\u0002\u0354\u0356\u0007\u0034\u0002\u0002\u0355\u0352\u0003\u0002\u0002\u0002\u0355\u0356\u0003\u0002\u0002\u0002\u0356\u0357\u0003\u0002\u0002\u0002\u0357\u0359\u0007\u0046\u0002\u0002\u0358\u035a\u0005\u0078\u003d\u0002\u0359\u0358\u0003\u0002\u0002\u0002\u0359\u035a\u0003\u0002\u0002\u0002\u035a\u035b\u0003\u0002\u0002\u0002\u035b\u035c\u0007\u0030\u0002\u0002\u035c\u035d\u0005\u003e\u0020\u0002\u035d\u0067\u0003\u0002\u0002\u0002\u035e\u035f\u0007\u0033\u0002\u0002\u035f\u0360\u0007\u000a\u0002\u0002\u0360\u0361\u0007\u0034\u0002\u0002\u0361\u0362\u0007\u0046\u0002\u0002\u0362\u0366\u0005\u0078\u003d\u0002\u0363\u0364\u0007\u001e\u0002\u0002\u0364\u0365\u0007\u0030\u0002\u0002\u0365\u0367\u0005\u003e\u0020\u0002\u0366\u0363\u0003\u0002\u0002\u0002\u0366\u0367\u0003\u0002\u0002\u0002\u0367\u036c\u0003\u0002\u0002\u0002\u0368\u0369\u0007\u001f\u0002\u0002\u0369\u036a\u0007\u0046\u0002\u0002\u036a\u036b\u0007\u0030\u0002\u0002\u036b\u036d\u0005\u003e\u0020\u0002\u036c\u0368\u0003\u0002\u0002\u0002\u036c\u036d\u0003\u0002\u0002\u0002\u036d\u0069\u0003\u0002\u0002\u0002\u036e\u0372\u0005\u006c\u0037\u0002\u036f\u0371\u0005\u0070\u0039\u0002\u0370\u036f\u0003\u0002\u0002\u0002\u0371\u0374\u0003\u0002\u0002\u0002\u0372\u0370\u0003\u0002\u0002\u0002\u0372\u0373\u0003\u0002\u0002\u0002\u0373\u037d\u0003\u0002\u0002\u0002\u0374\u0372\u0003\u0002\u0002\u0002\u0375\u0379\u0005\u006e\u0038\u0002\u0376\u0378\u0005\u0070\u0039\u0002\u0377\u0376\u0003\u0002\u0002\u0002\u0378\u037b\u0003\u0002\u0002\u0002\u0379\u0377\u0003\u0002\u0002\u0002\u0379\u037a\u0003\u0002\u0002\u0002\u037a\u037d\u0003\u0002\u0002\u0002\u037b\u0379\u0003\u0002\u0002\u0002\u037c\u036e\u0003\u0002\u0002\u0002\u037c\u0375\u0003\u0002\u0002\u0002\u037d\u006b\u0003\u0002\u0002\u0002\u037e\u0380\u0005\u0098\u004d\u0002\u037f\u037e\u0003\u0002\u0002\u0002\u037f\u0380\u0003\u0002\u0002\u0002\u0380\u0381\u0003\u0002\u0002\u0002\u0381\u0383\u0005\u005a\u002e\u0002\u0382\u0384\u0005\u0034\u001b\u0002\u0383\u0382\u0003\u0002\u0002\u0002\u0383\u0384\u0003\u0002\u0002\u0002\u0384\u0389\u0003\u0002\u0002\u0002\u0385\u0386\u0007\u0033\u0002\u0002\u0386\u0387\u0005\u0050\u0029\u0002\u0387\u0388\u0007\u0034\u0002\u0002\u0388\u038a\u0003\u0002\u0002\u0002\u0389\u0385\u0003\u0002\u0002\u0002\u0389\u038a\u0003\u0002\u0002\u0002\u038a\u038b\u0003\u0002\u0002\u0002\u038b\u038c\u0005\u0078\u003d\u0002\u038c\u038d\u0007\u0030\u0002\u0002\u038d\u038e\u0005\u003e\u0020\u0002\u038e\u006d\u0003\u0002\u0002\u0002\u038f\u0391\u0005\u0098\u004d\u0002\u0390\u038f\u0003\u0002\u0002\u0002\u0390\u0391\u0003\u0002\u0002\u0002\u0391\u0392\u0003\u0002\u0002\u0002\u0392\u0394\u0005\u005a\u002e\u0002\u0393\u0395\u0005\u0034\u001b\u0002\u0394\u0393\u0003\u0002\u0002\u0002\u0394\u0395\u0003\u0002\u0002\u0002\u0395\u039a\u0003\u0002\u0002\u0002\u0396\u0397\u0007\u0033\u0002\u0002\u0397\u0398\u0005\u0050\u0029\u0002\u0398\u0399\u0007\u0034\u0002\u0002\u0399\u039b\u0003\u0002\u0002\u0002\u039a\u0396\u0003\u0002\u0002\u0002\u039a\u039b\u0003\u0002\u0002\u0002\u039b\u039c\u0003\u0002\u0002\u0002\u039c\u039d\u0007\u000a\u0002\u0002\u039d\u039f\u0005\u0078\u003d\u0002\u039e\u03a0\u0005\u008a\u0046\u0002\u039f\u039e\u0003\u0002\u0002\u0002\u039f\u03a0\u0003\u0002\u0002\u0002\u03a0\u006f\u0003\u0002\u0002\u0002\u03a1\u03a3\u0007\u0014\u0002\u0002\u03a2\u03a4\u0007\u0046\u0002\u0002\u03a3\u03a2\u0003\u0002\u0002\u0002\u03a3\u03a4\u0003\u0002\u0002\u0002\u03a4\u03a5\u0003\u0002\u0002\u0002\u03a5\u03a7\u0007\u0033\u0002\u0002\u03a6\u03a8\u0005\u0072\u003a\u0002\u03a7\u03a6\u0003\u0002\u0002\u0002\u03a8\u03a9\u0003\u0002\u0002\u0002\u03a9\u03a7\u0003\u0002\u0002\u0002\u03a9\u03aa\u0003\u0002\u0002\u0002\u03aa\u03ab\u0003\u0002\u0002\u0002\u03ab\u03ac\u0007\u0034\u0002\u0002\u03ac\u03bb\u0003\u0002\u0002\u0002\u03ad\u03af\u0007\u0014\u0002\u0002\u03ae\u03b0\u0007\u0046\u0002\u0002\u03af\u03ae\u0003\u0002\u0002\u0002\u03af\u03b0\u0003\u0002\u0002\u0002\u03b0\u03b1\u0003\u0002\u0002\u0002\u03b1\u03b3\u0007\u0033\u0002\u0002\u03b2\u03b4\u0005\u0074\u003b\u0002\u03b3\u03b2\u0003\u0002\u0002\u0002\u03b4\u03b5\u0003\u0002\u0002\u0002\u03b5\u03b3\u0003\u0002\u0002\u0002\u03b5\u03b6\u0003\u0002\u0002\u0002\u03b6\u03b7\u0003\u0002\u0002\u0002\u03b7\u03b8\u0007\u0034\u0002\u0002\u03b8\u03b9\u0005\u003e\u0020\u0002\u03b9\u03bb\u0003\u0002\u0002\u0002\u03ba\u03a1\u0003\u0002\u0002\u0002\u03ba\u03ad\u0003\u0002\u0002\u0002\u03bb\u0071\u0003\u0002\u0002\u0002\u03bc\u03bf\u0005\u003e\u0020\u0002\u03bd\u03be\u0007\u003b\u0002\u0002\u03be\u03c0\u0005\u0078\u003d\u0002\u03bf\u03bd\u0003\u0002\u0002\u0002\u03bf\u03c0\u0003\u0002\u0002\u0002\u03c0\u03c4\u0003\u0002\u0002\u0002\u03c1\u03c2\u0007\u003c\u0002\u0002\u03c2\u03c4\u0007\u0046\u0002\u0002\u03c3\u03bc\u0003\u0002\u0002\u0002\u03c3\u03c1\u0003\u0002\u0002\u0002\u03c4\u0073\u0003\u0002\u0002\u0002\u03c5\u03c9\u0007\u003a\u0002\u0002\u03c6\u03c7\u0007\u0039\u0002\u0002\u03c7\u03c9\u0007\u0044\u0002\u0002\u03c8\u03c5\u0003\u0002\u0002\u0002\u03c8\u03c6\u0003\u0002\u0002\u0002\u03c9\u03cd\u0003\u0002\u0002\u0002\u03ca\u03cb\u0007\u003c\u0002\u0002\u03cb\u03cd\u0007\u0046\u0002\u0002\u03cc\u03c8\u0003\u0002\u0002\u0002\u03cc\u03ca\u0003\u0002\u0002\u0002\u03cd\u0075\u0003\u0002\u0002\u0002\u03ce\u03d0\u0007\u0035\u0002\u0002\u03cf\u03d1\u0005\u0050\u0029\u0002\u03d0\u03cf\u0003\u0002\u0002\u0002\u03d0\u03d1\u0003\u0002\u0002\u0002\u03d1\u03d2\u0003\u0002\u0002\u0002\u03d2\u03d3\u0007\u0036\u0002\u0002\u03d3\u03d4\u0005\u003e\u0020\u0002\u03d4\u0077\u0003\u0002\u0002\u0002\u03d5\u03dd\u0005\u0082\u0042\u0002\u03d6\u03d7\u0007\u0033\u0002\u0002\u03d7\u03d8\u0005\u0082\u0042\u0002\u03d8\u03da\u0007\u0034\u0002\u0002\u03d9\u03db\u0007\u0044\u0002\u0002\u03da\u03d9\u0003\u0002\u0002\u0002\u03da\u03db\u0003\u0002\u0002\u0002\u03db\u03dd\u0003\u0002\u0002\u0002\u03dc\u03d5\u0003\u0002\u0002\u0002\u03dc\u03d6\u0003\u0002\u0002\u0002\u03dd\u03e3\u0003\u0002\u0002\u0002\u03de\u03e0\u0005\u007a\u003e\u0002\u03df\u03e1\u0007\u0044\u0002\u0002\u03e0\u03df\u0003\u0002\u0002\u0002\u03e0\u03e1\u0003\u0002\u0002\u0002\u03e1\u03e3\u0003\u0002\u0002\u0002\u03e2\u03dc\u0003\u0002\u0002\u0002\u03e2\u03de\u0003\u0002\u0002\u0002\u03e3\u0079\u0003\u0002\u0002\u0002\u03e4\u03e5\u0005\u0016\u000c\u0002\u03e5\u03e6\u0007\u0032\u0002\u0002\u03e6\u03e8\u0003\u0002\u0002\u0002\u03e7\u03e4\u0003\u0002\u0002\u0002\u03e7\u03e8\u0003\u0002\u0002\u0002\u03e8\u03e9\u0003\u0002\u0002\u0002\u03e9\u03f2\u0005\u0060\u0031\u0002\u03ea\u03ec\u0007\u0033\u0002\u0002\u03eb\u03ed\u0005\u007c\u003f\u0002\u03ec\u03eb\u0003\u0002\u0002\u0002\u03ed\u03ee\u0003\u0002\u0002\u0002\u03ee\u03ec\u0003\u0002\u0002\u0002\u03ee\u03ef\u0003\u0002\u0002\u0002\u03ef\u03f0\u0003\u0002\u0002\u0002\u03f0\u03f1\u0007\u0034\u0002\u0002\u03f1\u03f3\u0003\u0002\u0002\u0002\u03f2\u03ea\u0003\u0002\u0002\u0002\u03f2\u03f3\u0003\u0002\u0002\u0002\u03f3\u03f6\u0003\u0002\u0002\u0002\u03f4\u03f6\u0005\u007e\u0040\u0002\u03f5\u03e7\u0003\u0002\u0002\u0002\u03f5\u03f4\u0003\u0002\u0002\u0002\u03f6\u007b\u0003\u0002\u0002\u0002\u03f7\u03fc\u0005\u0078\u003d\u0002\u03f8\u03fc\u0005\u0084\u0043\u0002\u03f9\u03fc\u0005\u0086\u0044\u0002\u03fa\u03fc\u0005\u0088\u0045\u0002\u03fb\u03f7\u0003\u0002\u0002\u0002\u03fb\u03f8\u0003\u0002\u0002\u0002\u03fb\u03f9\u0003\u0002\u0002\u0002\u03fb\u03fa\u0003\u0002\u0002\u0002\u03fc\u007d\u0003\u0002\u0002\u0002\u03fd\u03fe\u0009\u0004\u0002\u0002\u03fe\u007f\u0003\u0002\u0002\u0002\u03ff\u0401\u0005\u0078\u003d\u0002\u0400\u0402\u0007\u0031\u0002\u0002\u0401\u0400\u0003\u0002\u0002\u0002\u0401\u0402\u0003\u0002\u0002\u0002\u0402\u0081\u0003\u0002\u0002\u0002\u0403\u0407\u0007\u0033\u0002\u0002\u0404\u0406\u0005\u0080\u0041\u0002\u0405\u0404\u0003\u0002\u0002\u0002\u0406\u0409\u0003\u0002\u0002\u0002\u0407\u0405\u0003\u0002\u0002\u0002\u0407\u0408\u0003\u0002\u0002\u0002\u0408\u040a\u0003\u0002\u0002\u0002\u0409\u0407\u0003\u0002\u0002\u0002\u040a\u040b\u0007\u0034\u0002\u0002\u040b\u040c\u0007\u0039\u0002\u0002\u040c\u040d\u0005\u0078\u003d\u0002\u040d\u0083\u0003\u0002\u0002\u0002\u040e\u040f\u0007\u0035\u0002\u0002\u040f\u0410\u0007\u003b\u0002\u0002\u0410\u0411\u0005\u0078\u003d\u0002\u0411\u0412\u0007\u0036\u0002\u0002\u0412\u0085\u0003\u0002\u0002\u0002\u0413\u0414\u0007\u0035\u0002\u0002\u0414\u0415\u0005\u0078\u003d\u0002\u0415\u0416\u0007\u003b\u0002\u0002\u0416\u0417\u0007\u0036\u0002\u0002\u0417\u0087\u0003\u0002\u0002\u0002\u0418\u0419\u0007\u0035\u0002\u0002\u0419\u041a\u0007\u0044\u0002\u0002\u041a\u041b\u0007\u0036\u0002\u0002\u041b\u0089\u0003\u0002\u0002\u0002\u041c\u0420\u0007\u0037\u0002\u0002\u041d\u041f\u0005\u008c\u0047\u0002\u041e\u041d\u0003\u0002\u0002\u0002\u041f\u0422\u0003\u0002\u0002\u0002\u0420\u041e\u0003\u0002\u0002\u0002\u0420\u0421\u0003\u0002\u0002\u0002\u0421\u0423\u0003\u0002\u0002\u0002\u0422\u0420\u0003\u0002\u0002\u0002\u0423\u0426\u0007\u0038\u0002\u0002\u0424\u0426\u0007\u004b\u0002\u0002\u0425\u041c\u0003\u0002\u0002\u0002\u0425\u0424\u0003\u0002\u0002\u0002\u0426\u008b\u0003\u0002\u0002\u0002\u0427\u0428\u0005\u008e\u0048\u0002\u0428\u0429\u0007\u004b\u0002\u0002\u0429\u008d\u0003\u0002\u0002\u0002\u042a\u042b\u0007\u0046\u0002\u0002\u042b\u008f\u0003\u0002\u0002\u0002\u042c\u042d\u0007\u001a\u0002\u0002\u042d\u0432\u0005\u0060\u0031\u0002\u042e\u042f\u0007\u0033\u0002\u0002\u042f\u0430\u0005\u0034\u001b\u0002\u0430\u0431\u0007\u0034\u0002\u0002\u0431\u0433\u0003\u0002\u0002\u0002\u0432\u042e\u0003\u0002\u0002\u0002\u0432\u0433\u0003\u0002\u0002\u0002\u0433\u043d\u0003\u0002\u0002\u0002\u0434\u0435\u0007\u0030\u0002\u0002\u0435\u043e\u0005\u0078\u003d\u0002\u0436\u0438\u0007\u000a\u0002\u0002\u0437\u0439\u0005\u008a\u0046\u0002\u0438\u0437\u0003\u0002\u0002\u0002\u0438\u0439\u0003\u0002\u0002\u0002\u0439\u043b\u0003\u0002\u0002\u0002\u043a\u043c\u0005\u0092\u004a\u0002\u043b\u043a\u0003\u0002\u0002\u0002\u043b\u043c\u0003\u0002\u0002\u0002\u043c\u043e\u0003\u0002\u0002\u0002\u043d\u0434\u0003\u0002\u0002\u0002\u043d\u0436\u0003\u0002\u0002\u0002\u043e\u0091\u0003\u0002\u0002\u0002\u043f\u0440\u0007\u0015\u0002\u0002\u0440\u0445\u0007\u0037\u0002\u0002\u0441\u0442\u0007\u003d\u0002\u0002\u0442\u0444\u0005\u002a\u0016\u0002\u0443\u0441\u0003\u0002\u0002\u0002\u0444\u0447\u0003\u0002\u0002\u0002\u0445\u0443\u0003\u0002\u0002\u0002\u0445\u0446\u0003\u0002\u0002\u0002\u0446\u044b\u0003\u0002\u0002\u0002\u0447\u0445\u0003\u0002\u0002\u0002\u0448\u044a\u0005\u0030\u0019\u0002\u0449\u0448\u0003\u0002\u0002\u0002\u044a\u044d\u0003\u0002\u0002\u0002\u044b\u0449\u0003\u0002\u0002\u0002\u044b\u044c\u0003\u0002\u0002\u0002\u044c\u044e\u0003\u0002\u0002\u0002\u044d\u044b\u0003\u0002\u0002\u0002\u044e\u044f\u0007\u0038\u0002\u0002\u044f\u0093\u0003\u0002\u0002\u0002\u0450\u0451\u0007\u0007\u0002\u0002\u0451\u0452\u0007\u0046\u0002\u0002\u0452\u0453\u0007\u0033\u0002\u0002\u0453\u0454\u0005\u0050\u0029\u0002\u0454\u0455\u0007\u0034\u0002\u0002\u0455\u0095\u0003\u0002\u0002\u0002\u0456\u0457\u0005\u0016\u000c\u0002\u0457\u0458\u0007\u0032\u0002\u0002\u0458\u045a\u0003\u0002\u0002\u0002\u0459\u0456\u0003\u0002\u0002\u0002\u0459\u045a\u0003\u0002\u0002\u0002\u045a\u045b\u0003\u0002\u0002\u0002\u045b\u045d\u0007\u0046\u0002\u0002\u045c\u045e\u0005\u0054\u002b\u0002\u045d\u045c\u0003\u0002\u0002\u0002\u045d\u045e\u0003\u0002\u0002\u0002\u045e\u0097\u0003\u0002\u0002\u0002\u045f\u0463\u0007\u0035\u0002\u0002\u0460\u0462\u0005\u0096\u004c\u0002\u0461\u0460\u0003\u0002\u0002\u0002\u0462\u0465\u0003\u0002\u0002\u0002\u0463\u0461\u0003\u0002\u0002\u0002\u0463\u0464\u0003\u0002\u0002\u0002\u0464\u0466\u0003\u0002\u0002\u0002\u0465\u0463\u0003\u0002\u0002\u0002\u0466\u0467\u0007\u0036\u0002\u0002\u0467\u0099\u0003\u0002\u0002\u0002\u009b\u009b\u00a0\u00a6\u00a8\u00ae\u00b3\u00b6\u00b9\u00bf\u00c7\u00cb\u00d1\u00d3\u00e3\u00ea\u00f5\u00fe\u0110\u0113\u0116\u0119\u0121\u0128\u012e\u0132\u0138\u013e\u0141\u0149\u0151\u0158\u015c\u0161\u0167\u016a\u016d\u0175\u0179\u017e\u0182\u0188\u018c\u0190\u0195\u019a\u01a1\u01a4\u01aa\u01ad\u01b0\u01b4\u01ba\u01c6\u01cd\u01d4\u01db\u01e3\u01ea\u01ed\u01f2\u01f9\u01fe\u0204\u020f\u0215\u021a\u0224\u022b\u022f\u0234\u023b\u023d\u024d\u0258\u0261\u0269\u0272\u027d\u0287\u0291\u0293\u0295\u029b\u02b6\u02bb\u02c5\u02d5\u02e0\u02e5\u02e9\u02ec\u02f1\u02f7\u02fb\u0301\u0305\u030a\u0312\u0316\u031b\u031f\u0326\u032f\u0334\u0343\u0348\u034d\u0355\u0359\u0366\u036c\u0372\u0379\u037c\u037f\u0383\u0389\u0390\u0394\u039a\u039f\u03a3\u03a9\u03af\u03b5\u03ba\u03bf\u03c3\u03c8\u03cc\u03d0\u03da\u03dc\u03e0\u03e2\u03e7\u03ee\u03f2\u03f5\u03fb\u0401\u0407\u0420\u0425\u0432\u0438\u043b\u043d\u0445\u044b\u0459\u045d\u0463"

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
    private val WHERE = Tokens.WHERE.id
    private val FROM = Tokens.FROM.id
    private val IS = Tokens.IS.id
    private val GET = Tokens.GET.id
    private val SET = Tokens.SET.id
    private val REMAIN = Tokens.REMAIN.id
    private val MATCH = Tokens.MATCH.id
    private val INT = Tokens.INT.id
    private val LONG = Tokens.LONG.id
    private val DOUBLE = Tokens.DOUBLE.id
    private val FLOAT = Tokens.FLOAT.id
    private val BYTE = Tokens.BYTE.id
    private val CHAR = Tokens.CHAR.id
    private val STRING = Tokens.STRING.id
    private val BOOLEAN = Tokens.BOOLEAN.id
    private val UNIT = Tokens.UNIT.id
    private val NULLKEYWORD = Tokens.NULLKEYWORD.id
    private val TRUE = Tokens.TRUE.id
    private val FALSE = Tokens.FALSE.id
    private val THIS = Tokens.THIS.id
    private val PIPE = Tokens.PIPE.id
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
    private val TRIPLECOLON = Tokens.TRIPLECOLON.id
    private val COLONSHARP = Tokens.COLONSHARP.id
    private val QUOTE = Tokens.QUOTE.id
    private val COLONQUOTE = Tokens.COLONQUOTE.id
    private val SHARP = Tokens.SHARP.id
    private val QM = Tokens.QM.id
    private val EM = Tokens.EM.id
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
			this.state = 153
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAMESPACE) {
				if (true){
				this.state = 152
				namespace()
				}
			}

			this.state = 158
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPORT) {
				if (true){
				if (true){
				this.state = 155
				importEx()
				}
				}
				this.state = 160
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 166
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ABSTRACT) or (1L shl ANNOTATION) or (1L shl CLASS) or (1L shl INTERFACE) or (1L shl DATA) or (1L shl TYPEALIAS) or (1L shl LSQUARE))) != 0L) || _la==SHARP || _la==ID) {
				if (true){
				this.state = 164
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				ABSTRACT , CLASS , INTERFACE , DATA , LSQUARE , SHARP , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 161
				fileCompo()
				}}
				ANNOTATION  ->  /*LL1AltBlock*/{if (true){
				this.state = 162
				annotationDef()
				}}
				TYPEALIAS  ->  /*LL1AltBlock*/{if (true){
				this.state = 163
				typeAlias()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 168
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
			this.state = 172
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ABSTRACT , CLASS , INTERFACE , DATA , LSQUARE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 169
			definition()
			}}
			SHARP  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 170
			match(SHARP) as Token
			this.state = 171
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
			this.state = 174
			match(IMPORT) as Token
			this.state = 175
			package_()
			this.state = 177
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1   -> if (true){
			this.state = 176
			importNest()
			}
			}
			this.state = 180
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 179
				importPath()
				}
			}

			this.state = 183
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 182
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
			this.state = 185
			match(LBRACE) as Token
			this.state = 189
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (((((_la - 6)) and 0x3f.inv()) == 0 && ((1L shl (_la - 6)) and ((1L shl (CLASS - 6)) or (1L shl (LSQUARE - 6)) or (1L shl (ID - 6)))) != 0L)) {
				if (true){
				if (true){
				this.state = 186
				importCompo()
				}
				}
				this.state = 191
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 192
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
		fun findCommonIdentifier() : CommonIdentifierContext? = getRuleContext(solver.getType("CommonIdentifierContext"),0)
		fun SHARP() : TerminalNode? = getToken(FoldingParser.Tokens.SHARP.id, 0)
		fun findImportDefAlias() : ImportDefAliasContext? = getRuleContext(solver.getType("ImportDefAliasContext"),0)
		fun As() : TerminalNode? = getToken(FoldingParser.Tokens.As.id, 0)
		fun findImportType() : ImportTypeContext? = getRuleContext(solver.getType("ImportTypeContext"),0)
		fun CLASS() : TerminalNode? = getToken(FoldingParser.Tokens.CLASS.id, 0)
		fun findCommonClassIdentifier() : CommonClassIdentifierContext? = getRuleContext(solver.getType("CommonClassIdentifierContext"),0)
		fun findImportClassAlias() : ImportClassAliasContext? = getRuleContext(solver.getType("ImportClassAliasContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importCompo() : ImportCompoContext {
		var _localctx : ImportCompoContext = ImportCompoContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_importCompo.id)
		var _la: Int
		try {
			this.state = 209
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LSQUARE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 194
			commonIdentifier()
			this.state = 197
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 195
				match(SHARP) as Token
				this.state = 196
				importDefAlias()
				}
			}

			this.state = 201
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==As) {
				if (true){
				this.state = 199
				match(As) as Token
				this.state = 200
				importType()
				}
			}

			}}
			CLASS  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 203
			match(CLASS) as Token
			this.state = 204
			commonClassIdentifier()
			this.state = 207
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 205
				match(SHARP) as Token
				this.state = 206
				importClassAlias()
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

	open class ImportDefAliasContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importDefAlias.id
	        set(value) { throw RuntimeException() }
		fun findCommonIdentifier() : CommonIdentifierContext? = getRuleContext(solver.getType("CommonIdentifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importDefAlias() : ImportDefAliasContext {
		var _localctx : ImportDefAliasContext = ImportDefAliasContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_importDefAlias.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 211
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

	open class ImportClassAliasContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importClassAlias.id
	        set(value) { throw RuntimeException() }
		fun findCommonClassIdentifier() : CommonClassIdentifierContext? = getRuleContext(solver.getType("CommonClassIdentifierContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importClassAlias() : ImportClassAliasContext {
		var _localctx : ImportClassAliasContext = ImportClassAliasContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_importClassAlias.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 213
			commonClassIdentifier()
			}
		}
		catch (re: RecognitionException) {
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
		enterRule(_localctx, 14, Rules.RULE_importType.id)
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
		enterRule(_localctx, 16, Rules.RULE_importPath.id)
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
		fun EM() : TerminalNode? = getToken(FoldingParser.Tokens.EM.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importNest() : ImportNestContext {
		var _localctx : ImportNestContext = ImportNestContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_importNest.id)
		try {
			this.state = 225
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			SHARP  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 222
			match(SHARP) as Token
			this.state = 223
			match(ID) as Token
			}}
			EM  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 224
			match(EM) as Token
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
		enterRule(_localctx, 20, Rules.RULE_package_.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 227
			match(ID) as Token
			this.state = 232
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,14,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 228
					match(DOT) as Token
					this.state = 229
					match(ID) as Token
					}
					} 
				}
				this.state = 234
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
		enterRule(_localctx, 22, Rules.RULE_namespace.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 235
			match(NAMESPACE) as Token
			this.state = 236
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
		enterRule(_localctx, 24, Rules.RULE_doBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 238
			match(DO) as Token
			this.state = 239
			match(LBRACE) as Token
			this.state = 243
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl RETURN) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl REMAIN) or (1L shl MATCH) or (1L shl NULLKEYWORD) or (1L shl TRUE) or (1L shl FALSE) or (1L shl THIS) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl ARROWQM) or (1L shl TILDE) or (1L shl QUOTE))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (SHARP - 65)) or (1L shl (ID - 65)) or (1L shl (Integer - 65)) or (1L shl (Double - 65)) or (1L shl (String - 65)))) != 0L)) {
				if (true){
				if (true){
				this.state = 240
				compo()
				}
				}
				this.state = 245
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 246
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
		fun findRemainLet_binding() : RemainLet_bindingContext? = getRuleContext(solver.getType("RemainLet_bindingContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findReturning() : ReturningContext? = getRuleContext(solver.getType("ReturningContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  compo() : CompoContext {
		var _localctx : CompoContext = CompoContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_compo.id)
		try {
			this.state = 252
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,16,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 248
			fieldAssign()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 249
			remainLet_binding()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 250
			value(0)
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 251
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

	open class RemainLet_bindingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_remainLet_binding.id
	        set(value) { throw RuntimeException() }
		fun REMAIN() : TerminalNode? = getToken(FoldingParser.Tokens.REMAIN.id, 0)
		fun findLet_binding() : Let_bindingContext? = getRuleContext(solver.getType("Let_bindingContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  remainLet_binding() : RemainLet_bindingContext {
		var _localctx : RemainLet_bindingContext = RemainLet_bindingContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_remainLet_binding.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 254
			match(REMAIN) as Token
			this.state = 255
			let_binding()
			}
		}
		catch (re: RecognitionException) {
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
		enterRule(_localctx, 30, Rules.RULE_returning.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 257
			match(RETURN) as Token
			this.state = 258
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
		enterRule(_localctx, 32, Rules.RULE_fieldAssign.id)
		try {
			this.state = 270
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,17,context) ) {
			1 -> {_localctx = GlobalFieldAssignContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 260
			match(SHARP) as Token
			this.state = 261
			match(ID) as Token
			this.state = 262
			match(ASSGIN) as Token
			this.state = 263
			value(0)
			}}
			2 -> {_localctx = ObjectFieldAssignContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 264
			value(0)
			this.state = 265
			match(COLONSHARP) as Token
			this.state = 266
			match(ID) as Token
			this.state = 267
			match(ASSGIN) as Token
			this.state = 268
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
		fun findCommonClassIdentifier() : CommonClassIdentifierContext? = getRuleContext(solver.getType("CommonClassIdentifierContext"),0)
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
		fun findCommonClassIdentifier() : CommonClassIdentifierContext? = getRuleContext(solver.getType("CommonClassIdentifierContext"),0)
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
		fun COLON() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLON.id)
		fun COLON(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLON.id, i) as TerminalNode
		fun findInherit() : InheritContext? = getRuleContext(solver.getType("InheritContext"),0)
		fun findImpl() : List<ImplContext> = getRuleContexts(solver.getType("ImplContext"))
		fun findImpl(i: Int) : ImplContext? = getRuleContext(solver.getType("ImplContext"),i)
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		fun findFieldInInterface() : List<FieldInInterfaceContext> = getRuleContexts(solver.getType("FieldInInterfaceContext"))
		fun findFieldInInterface(i: Int) : FieldInInterfaceContext? = getRuleContext(solver.getType("FieldInInterfaceContext"),i)
		fun findDefInInterface() : List<DefInInterfaceContext> = getRuleContexts(solver.getType("DefInInterfaceContext"))
		fun findDefInInterface(i: Int) : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),i)
		fun findDef() : List<DefContext> = getRuleContexts(solver.getType("DefContext"))
		fun findDef(i: Int) : DefContext? = getRuleContext(solver.getType("DefContext"),i)
		constructor(ctx: Class_Context) { copyFrom(ctx) }
	}
	open class JustClassContext : Class_Context {
		fun CLASS() : TerminalNode? = getToken(FoldingParser.Tokens.CLASS.id, 0)
		fun findCommonClassIdentifier() : CommonClassIdentifierContext? = getRuleContext(solver.getType("CommonClassIdentifierContext"),0)
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
		enterRule(_localctx, 34, Rules.RULE_class_.id)
		var _la: Int
		try {
			this.state = 408
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,44,context) ) {
			1 -> {_localctx = JustInterfaceContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 273
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 272
				annotationBlock()
				}
			}

			this.state = 276
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ABSTRACT) {
				if (true){
				this.state = 275
				match(ABSTRACT) as Token
				}
			}

			this.state = 279
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INTERFACE) {
				if (true){
				this.state = 278
				match(INTERFACE) as Token
				}
			}

			this.state = 281
			match(CLASS) as Token
			this.state = 282
			commonClassIdentifier()
			this.state = 287
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 283
				match(LPAREN) as Token
				this.state = 284
				typeParam()
				this.state = 285
				match(RPAREN) as Token
				}
			}

			this.state = 289
			match(LBRACE) as Token
			this.state = 294
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 290
				match(COLONSHARP) as Token
				this.state = 291
				fieldInInterface()
				}
				}
				this.state = 296
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 304
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 297
				match(COLON) as Token
				this.state = 300
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,23,context) ) {
				1 -> {if (true){
				this.state = 298
				defInInterface()
				}}
				2 -> {if (true){
				this.state = 299
				def()
				}}
				}
				}
				}
				this.state = 306
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 310
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 307
				impl()
				}
				}
				this.state = 312
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 313
			match(RBRACE) as Token
			}}
			2 -> {_localctx = JustClassContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 316
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 315
				annotationBlock()
				}
			}

			this.state = 319
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DATA) {
				if (true){
				this.state = 318
				match(DATA) as Token
				}
			}

			this.state = 321
			match(CLASS) as Token
			this.state = 322
			commonClassIdentifier()
			this.state = 327
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 323
				match(LPAREN) as Token
				this.state = 324
				typeParam()
				this.state = 325
				match(RPAREN) as Token
				}
			}

			this.state = 329
			match(LBRACE) as Token
			this.state = 330
			constructorSelf()
			this.state = 335
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 331
				match(COLONSHARP) as Token
				this.state = 332
				field()
				}
				}
				this.state = 337
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 342
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 338
				match(COLON) as Token
				this.state = 339
				def()
				}
				}
				this.state = 344
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 346
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INHERIT) {
				if (true){
				this.state = 345
				inherit()
				}
			}

			this.state = 351
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 348
				impl()
				}
				}
				this.state = 353
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 354
			match(RBRACE) as Token
			}}
			3 -> {_localctx = JustAbstractClassContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 357
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 356
				annotationBlock()
				}
			}

			this.state = 360
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ABSTRACT) {
				if (true){
				this.state = 359
				match(ABSTRACT) as Token
				}
			}

			this.state = 363
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DATA) {
				if (true){
				this.state = 362
				match(DATA) as Token
				}
			}

			this.state = 365
			match(CLASS) as Token
			this.state = 366
			commonClassIdentifier()
			this.state = 371
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 367
				match(LPAREN) as Token
				this.state = 368
				typeParam()
				this.state = 369
				match(RPAREN) as Token
				}
			}

			this.state = 373
			match(LBRACE) as Token
			this.state = 375
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,37,context) ) {
			1   -> if (true){
			this.state = 374
			constructorSelf()
			}
			}
			this.state = 384
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 377
				match(COLONSHARP) as Token
				this.state = 380
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,38,context) ) {
				1 -> {if (true){
				this.state = 378
				field()
				}}
				2 -> {if (true){
				this.state = 379
				fieldInInterface()
				}}
				}
				}
				}
				this.state = 386
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 394
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 387
				match(COLON) as Token
				this.state = 390
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,40,context) ) {
				1 -> {if (true){
				this.state = 388
				defInInterface()
				}}
				2 -> {if (true){
				this.state = 389
				def()
				}}
				}
				}
				}
				this.state = 396
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 398
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INHERIT) {
				if (true){
				this.state = 397
				inherit()
				}
			}

			this.state = 403
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 400
				impl()
				}
				}
				this.state = 405
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 406
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findDoBlock() : DoBlockContext? = getRuleContext(solver.getType("DoBlockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  constructor_() : Constructor_Context {
		var _localctx : Constructor_Context = Constructor_Context(context, state)
		enterRule(_localctx, 36, Rules.RULE_constructor_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 410
			match(ID) as Token
			this.state = 415
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 411
				match(LPAREN) as Token
				this.state = 412
				parameter()
				this.state = 413
				match(RPAREN) as Token
				}
			}

			this.state = 418
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 417
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findDoBlock() : DoBlockContext? = getRuleContext(solver.getType("DoBlockContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  constructorSelf() : ConstructorSelfContext {
		var _localctx : ConstructorSelfContext = ConstructorSelfContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_constructorSelf.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 424
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 420
				match(LPAREN) as Token
				this.state = 421
				parameter()
				this.state = 422
				match(RPAREN) as Token
				}
			}

			this.state = 427
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 426
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defInInterface() : DefInInterfaceContext {
		var _localctx : DefInInterfaceContext = DefInInterfaceContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_defInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 430
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,49,context) ) {
			1   -> if (true){
			this.state = 429
			annotationBlock()
			}
			}
			this.state = 432
			commonIdentifier()
			this.state = 434
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,50,context) ) {
			1   -> if (true){
			this.state = 433
			typeParam()
			}
			}
			this.state = 440
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,51,context) ) {
			1   -> if (true){
			this.state = 436
			match(LPAREN) as Token
			this.state = 437
			parameter()
			this.state = 438
			match(RPAREN) as Token
			}
			}
			this.state = 442
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
		enterRule(_localctx, 42, Rules.RULE_fieldInInterface.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 444
			match(LPAREN) as Token
			this.state = 445
			match(ABSTRACT) as Token
			this.state = 446
			match(RPAREN) as Token
			}
			this.state = 448
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
		enterRule(_localctx, 44, Rules.RULE_inherit.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 450
			match(INHERIT) as Token
			this.state = 452
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==LBRACE) {
				if (true){
				this.state = 451
				argValue()
				}
			}

			this.state = 454
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
		enterRule(_localctx, 46, Rules.RULE_impl.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 456
			match(IMPL) as Token
			this.state = 457
			typeEx()
			this.state = 459
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,53,context) ) {
			1   -> if (true){
			this.state = 458
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
		enterRule(_localctx, 48, Rules.RULE_implBody.id)
		var _la: Int
		try {
			var _alt: Int
			this.state = 491
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,58,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 461
			match(LBRACE) as Token
			this.state = 466
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 462
				match(COLONSHARP) as Token
				this.state = 463
				field()
				}
				}
				this.state = 468
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 473
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 469
				match(COLON) as Token
				this.state = 470
				def()
				}
				}
				this.state = 475
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 476
			match(RBRACE) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 481
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,56,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 477
					match(COLONSHARP) as Token
					this.state = 478
					field()
					}
					} 
				}
				this.state = 483
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,56,context)
			}
			this.state = 488
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,57,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 484
					match(COLON) as Token
					this.state = 485
					def()
					}
					} 
				}
				this.state = 490
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,57,context)
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
		enterRule(_localctx, 50, Rules.RULE_typeParam.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 494 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 493
				typeParamCompo()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 496 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,59,context)
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
		fun findCommonClassIdentifier() : CommonClassIdentifierContext? = getRuleContext(solver.getType("CommonClassIdentifierContext"),0)
		fun TILDE() : List<TerminalNode> = getTokens(FoldingParser.Tokens.TILDE.id)
		fun TILDE(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.TILDE.id, i) as TerminalNode
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeParamCompo() : TypeParamCompoContext {
		var _localctx : TypeParamCompoContext = TypeParamCompoContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_typeParamCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 498
			commonClassIdentifier()
			this.state = 503
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TILDE) {
				if (true){
				if (true){
				this.state = 499
				match(TILDE) as Token
				this.state = 500
				typeEx()
				}
				}
				this.state = 505
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
		enterRule(_localctx, 54, Rules.RULE_definition.id)
		try {
			this.state = 508
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,61,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 506
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 507
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
		enterRule(_localctx, 56, Rules.RULE_defaultValue.id)
		try {
			this.state = 514
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			Integer  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 510
			match(Integer) as Token
			}}
			Double  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 511
			match(Double) as Token
			}}
			String  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 512
			match(String) as Token
			}}
			TRUE , FALSE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 513
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
		enterRule(_localctx, 58, Rules.RULE_boolean.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 516
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
		fun findCommonIdentifier() : CommonIdentifierContext? = getRuleContext(solver.getType("CommonIdentifierContext"),0)
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
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
		fun findCommonOpIdentifier() : CommonOpIdentifierContext? = getRuleContext(solver.getType("CommonOpIdentifierContext"),0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class TupleContext : ValueContext {
		fun findTupleEx() : TupleExContext? = getRuleContext(solver.getType("TupleExContext"),0)
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
		fun findInherit() : InheritContext? = getRuleContext(solver.getType("InheritContext"),0)
		fun findImpl() : List<ImplContext> = getRuleContexts(solver.getType("ImplContext"))
		fun findImpl(i: Int) : ImplContext? = getRuleContext(solver.getType("ImplContext"),i)
		fun COLONSHARP() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLONSHARP.id)
		fun COLONSHARP(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLONSHARP.id, i) as TerminalNode
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		fun COLON() : List<TerminalNode> = getTokens(FoldingParser.Tokens.COLON.id)
		fun COLON(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.COLON.id, i) as TerminalNode
		fun findDef() : List<DefContext> = getRuleContexts(solver.getType("DefContext"))
		fun findDef(i: Int) : DefContext? = getRuleContext(solver.getType("DefContext"),i)
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
	open class InvokeValueLikeMethodContext : ValueContext {
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun TRIPLECOLON() : TerminalNode? = getToken(FoldingParser.Tokens.TRIPLECOLON.id, 0)
		fun findInvoking() : InvokingContext? = getRuleContext(solver.getType("InvokingContext"),0)
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class InvokeValueContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findInvoking() : InvokingContext? = getRuleContext(solver.getType("InvokingContext"),0)
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
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findCommonOpIdentifier() : CommonOpIdentifierContext? = getRuleContext(solver.getType("CommonOpIdentifierContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class CallAopFuncBackContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun QUOTE() : TerminalNode? = getToken(FoldingParser.Tokens.QUOTE.id, 0)
		fun findCommonOpIdentifier() : CommonOpIdentifierContext? = getRuleContext(solver.getType("CommonOpIdentifierContext"),0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class ThisContext : ValueContext {
		fun THIS() : TerminalNode? = getToken(FoldingParser.Tokens.THIS.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class GetFieldContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun COLONSHARP() : TerminalNode? = getToken(FoldingParser.Tokens.COLONSHARP.id, 0)
		fun findCommonIdentifier() : CommonIdentifierContext? = getRuleContext(solver.getType("CommonIdentifierContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class CallFunctionLikeMethodContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun DOUBLECOLON() : TerminalNode? = getToken(FoldingParser.Tokens.DOUBLECOLON.id, 0)
		fun findCommonIdentifier() : CommonIdentifierContext? = getRuleContext(solver.getType("CommonIdentifierContext"),0)
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class ReflectedMethodContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun COLONQUOTE() : TerminalNode? = getToken(FoldingParser.Tokens.COLONQUOTE.id, 0)
		fun findCommonIdentifier() : CommonIdentifierContext? = getRuleContext(solver.getType("CommonIdentifierContext"),0)
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
		fun NULLKEYWORD() : TerminalNode? = getToken(FoldingParser.Tokens.NULLKEYWORD.id, 0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class ValueTypeCastingContext : ValueContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findTypeCasting() : TypeCastingContext? = getRuleContext(solver.getType("TypeCastingContext"),0)
		constructor(ctx: ValueContext) { copyFrom(ctx) }
	}
	open class PatternMatchExpressionContext : ValueContext {
		fun findPatternMatch() : PatternMatchContext? = getRuleContext(solver.getType("PatternMatchContext"),0)
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
		var _startState : Int = 60
		enterRecursionRule(_localctx, 60, Rules.RULE_value.id, _p)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 587
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,72,context) ) {
			1 -> {if (true){
			_localctx = JustDefaultValueContext(_localctx)
			context = _localctx
			_prevctx = _localctx

			this.state = 519
			defaultValue()
			}}
			2 -> {if (true){
			_localctx = NullContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 520
			match(NULLKEYWORD) as Token
			}}
			3 -> {if (true){
			_localctx = ThisContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 521
			match(THIS) as Token
			}}
			4 -> {if (true){
			_localctx = OutputOfInversingContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 525
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ARROW  ->  /*LL1AltBlock*/{if (true){
			this.state = 522
			match(ARROW) as Token
			this.state = 523
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
			this.state = 524
			match(ARROWQM) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			5 -> {if (true){
			_localctx = ReflectedContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 527
			match(QUOTE) as Token
			this.state = 528
			reference()
			}}
			6 -> {if (true){
			_localctx = CallFunctionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 529
			reference()
			this.state = 531
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,64,context) ) {
			1   -> if (true){
			this.state = 530
			argValue()
			}
			}
			}}
			7 -> {if (true){
			_localctx = UseForeignClassContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 533
			match(NEW) as Token
			this.state = 534
			reference()
			this.state = 536
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,65,context) ) {
			1   -> if (true){
			this.state = 535
			argValue()
			}
			}
			}}
			8 -> {if (true){
			_localctx = GetFieldGlobalContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 538
			match(SHARP) as Token
			this.state = 539
			reference()
			}}
			9 -> {if (true){
			_localctx = AnonymousClassObjectContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 571
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,71,context) ) {
			1 -> {if (true){
			this.state = 540
			match(NEW) as Token
			this.state = 541
			match(LBRACE) as Token
			this.state = 546
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLONSHARP) {
				if (true){
				if (true){
				this.state = 542
				match(COLONSHARP) as Token
				this.state = 543
				field()
				}
				}
				this.state = 548
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 553
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 549
				match(COLON) as Token
				this.state = 550
				def()
				}
				}
				this.state = 555
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 557
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INHERIT) {
				if (true){
				this.state = 556
				inherit()
				}
			}

			this.state = 562
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 559
				impl()
				}
				}
				this.state = 564
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 565
			match(RBRACE) as Token
			}}
			2 -> {if (true){
			this.state = 566
			match(NEW) as Token
			this.state = 569
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			INHERIT  ->  /*LL1AltBlock*/{if (true){
			this.state = 567
			inherit()
			}}
			IMPL  ->  /*LL1AltBlock*/{if (true){
			this.state = 568
			impl()
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			}
			}}
			10 -> {if (true){
			_localctx = TupleContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 573
			tupleEx()
			}}
			11 -> {if (true){
			_localctx = CallAopFuncContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 574
			match(TILDE) as Token
			this.state = 575
			commonOpIdentifier()
			this.state = 576
			value(10)
			}}
			12 -> {if (true){
			_localctx = IfExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 578
			if_else()
			}}
			13 -> {if (true){
			_localctx = PatternMatchExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 579
			patternMatch()
			}}
			14 -> {if (true){
			_localctx = LetExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 580
			let_binding()
			}}
			15 -> {if (true){
			_localctx = DoExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 581
			doBlock()
			}}
			16 -> {if (true){
			_localctx = JustLambdaContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 582
			lambda()
			}}
			17 -> {if (true){
			_localctx = ParenedValueContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 583
			match(LPAREN) as Token
			this.state = 584
			value(0)
			this.state = 585
			match(RPAREN) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 659
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,81,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 657
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,80,context) ) {
					1 -> {if (true){
					_localctx = ValueTypeCastingContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 589
					if (!(precpred(context!!, 18))) throw FailedPredicateException(this, "precpred(context!!, 18)")
					this.state = 590
					typeCasting()
					}}
					2 -> {if (true){
					_localctx = GetFieldContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 591
					if (!(precpred(context!!, 17))) throw FailedPredicateException(this, "precpred(context!!, 17)")
					this.state = 592
					match(COLONSHARP) as Token
					this.state = 593
					commonIdentifier()
					}}
					3 -> {if (true){
					_localctx = CallMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 594
					if (!(precpred(context!!, 16))) throw FailedPredicateException(this, "precpred(context!!, 16)")
					this.state = 595
					match(COLON) as Token
					this.state = 596
					commonIdentifier()
					this.state = 598
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,73,context) ) {
					1   -> if (true){
					this.state = 597
					argValue()
					}
					}
					}}
					4 -> {if (true){
					_localctx = ReflectedMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 600
					if (!(precpred(context!!, 15))) throw FailedPredicateException(this, "precpred(context!!, 15)")
					this.state = 601
					match(COLONQUOTE) as Token
					this.state = 602
					commonIdentifier()
					}}
					5 -> {if (true){
					_localctx = CallFunctionLikeMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 603
					if (!(precpred(context!!, 14))) throw FailedPredicateException(this, "precpred(context!!, 14)")
					this.state = 604
					match(DOUBLECOLON) as Token
					this.state = 605
					commonIdentifier()
					this.state = 607
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,74,context) ) {
					1   -> if (true){
					this.state = 606
					argValue()
					}
					}
					}}
					6 -> {if (true){
					_localctx = InvokeValueContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 609
					if (!(precpred(context!!, 13))) throw FailedPredicateException(this, "precpred(context!!, 13)")
					this.state = 610
					invoking()
					}}
					7 -> {if (true){
					_localctx = InvokeValueLikeMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 611
					if (!(precpred(context!!, 12))) throw FailedPredicateException(this, "precpred(context!!, 12)")
					this.state = 612
					match(TRIPLECOLON) as Token
					this.state = 613
					value(0)
					this.state = 615
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,75,context) ) {
					1   -> if (true){
					this.state = 614
					invoking()
					}
					}
					}}
					8 -> {if (true){
					_localctx = CallAopFuncBackContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 617
					if (!(precpred(context!!, 11))) throw FailedPredicateException(this, "precpred(context!!, 11)")
					this.state = 624
					errorHandler.sync(this)
					when (_input!!.LA(1)) {
					QUOTE  ->  /*LL1AltBlock*/{if (true){
					this.state = 618
					match(QUOTE) as Token
					this.state = 619
					commonOpIdentifier()
					}}
					LPAREN  ->  /*LL1AltBlock*/{if (true){
					this.state = 620
					match(LPAREN) as Token
					this.state = 621
					commonOpIdentifier()
					this.state = 622
					match(RPAREN) as Token
					}}
					else -> throw NoViableAltException(this)
					}
					}}
					9 -> {if (true){
					_localctx = CallOpFuncContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 626
					if (!(precpred(context!!, 9))) throw FailedPredicateException(this, "precpred(context!!, 9)")
					this.state = 635
					errorHandler.sync(this)
					when (_input!!.LA(1)) {
					LSQUARE , ID , OPID  ->  /*LL1AltBlock*/{if (true){
					this.state = 627
					commonOpIdentifier()
					this.state = 628
					value(0)
					}}
					LPAREN  ->  /*LL1AltBlock*/{if (true){
					this.state = 630
					match(LPAREN) as Token
					this.state = 631
					commonOpIdentifier()
					this.state = 632
					value(0)
					this.state = 633
					match(RPAREN) as Token
					}}
					else -> throw NoViableAltException(this)
					}
					}}
					10 -> {if (true){
					_localctx = TypeCheckContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 637
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 645
					errorHandler.sync(this)
					when (_input!!.LA(1)) {
					IS  ->  /*LL1AltBlock*/{if (true){
					this.state = 638
					match(IS) as Token
					this.state = 639
					typeEx()
					}}
					LPAREN  ->  /*LL1AltBlock*/{if (true){
					this.state = 640
					match(LPAREN) as Token
					this.state = 641
					match(IS) as Token
					this.state = 642
					typeEx()
					this.state = 643
					match(RPAREN) as Token
					}}
					else -> throw NoViableAltException(this)
					}
					}}
					11 -> {if (true){
					_localctx = SimpleIfContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 647
					if (!(precpred(context!!, 7))) throw FailedPredicateException(this, "precpred(context!!, 7)")
					this.state = 655
					errorHandler.sync(this)
					when (_input!!.LA(1)) {
					IF  ->  /*LL1AltBlock*/{if (true){
					this.state = 648
					match(IF) as Token
					this.state = 649
					value(0)
					}}
					LPAREN  ->  /*LL1AltBlock*/{if (true){
					this.state = 650
					match(LPAREN) as Token
					this.state = 651
					match(IF) as Token
					this.state = 652
					value(0)
					this.state = 653
					match(RPAREN) as Token
					}}
					else -> throw NoViableAltException(this)
					}
					}}
					}
					} 
				}
				this.state = 661
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
		enterRule(_localctx, 62, Rules.RULE_reference.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 665
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,82,context) ) {
			1   -> if (true){
			this.state = 662
			package_()
			this.state = 663
			match(DOT) as Token
			}
			}
			this.state = 667
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
		enterRule(_localctx, 64, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 669
			match(LPAREN) as Token
			this.state = 670
			match(TILDE) as Token
			this.state = 671
			typeEx()
			this.state = 672
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
		enterRule(_localctx, 66, Rules.RULE_if_else.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 674
			match(IF) as Token
			this.state = 675
			match(LPAREN) as Token
			this.state = 676
			value(0)
			this.state = 677
			match(RPAREN) as Token
			this.state = 678
			value(0)
			this.state = 679
			match(ELSE) as Token
			this.state = 680
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
		enterRule(_localctx, 68, Rules.RULE_let_binding.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 682
			match(LET) as Token
			this.state = 683
			value(0)
			this.state = 684
			match(ASSGIN) as Token
			this.state = 685
			value(0)
			this.state = 686
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

	open class PatternMatchContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_patternMatch.id
	        set(value) { throw RuntimeException() }
		fun MATCH() : TerminalNode? = getToken(FoldingParser.Tokens.MATCH.id, 0)
		fun findPatternMatchCompo() : List<PatternMatchCompoContext> = getRuleContexts(solver.getType("PatternMatchCompoContext"))
		fun findPatternMatchCompo(i: Int) : PatternMatchCompoContext? = getRuleContext(solver.getType("PatternMatchCompoContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  patternMatch() : PatternMatchContext {
		var _localctx : PatternMatchContext = PatternMatchContext(context, state)
		enterRule(_localctx, 70, Rules.RULE_patternMatch.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 688
			match(MATCH) as Token
			this.state = 690 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 689
				patternMatchCompo()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 692 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,83,context)
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

	open class PatternMatchCompoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_patternMatchCompo.id
	        set(value) { throw RuntimeException() }
		var patternValue: ValueContext? = null
		var predicateValue: ValueContext? = null
		var outputValue: ValueContext? = null
		fun ARROW() : TerminalNode? = getToken(FoldingParser.Tokens.ARROW.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun WHERE() : TerminalNode? = getToken(FoldingParser.Tokens.WHERE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  patternMatchCompo() : PatternMatchCompoContext {
		var _localctx : PatternMatchCompoContext = PatternMatchCompoContext(context, state)
		enterRule(_localctx, 72, Rules.RULE_patternMatchCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 694
			(_localctx as PatternMatchCompoContext).patternValue = value(0)
			this.state = 697
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==WHERE) {
				if (true){
				this.state = 695
				match(WHERE) as Token
				this.state = 696
				(_localctx as PatternMatchCompoContext).predicateValue = value(0)
				}
			}

			this.state = 699
			match(ARROW) as Token
			this.state = 700
			(_localctx as PatternMatchCompoContext).outputValue = value(0)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TupleExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tupleEx.id
	        set(value) { throw RuntimeException() }
		fun SHARP() : TerminalNode? = getToken(FoldingParser.Tokens.SHARP.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  tupleEx() : TupleExContext {
		var _localctx : TupleExContext = TupleExContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_tupleEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 702
			match(SHARP) as Token
			this.state = 703
			match(LPAREN) as Token
			this.state = 707
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl MATCH) or (1L shl NULLKEYWORD) or (1L shl TRUE) or (1L shl FALSE) or (1L shl THIS) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl ARROWQM) or (1L shl TILDE) or (1L shl QUOTE))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (SHARP - 65)) or (1L shl (ID - 65)) or (1L shl (Integer - 65)) or (1L shl (Double - 65)) or (1L shl (String - 65)))) != 0L)) {
				if (true){
				if (true){
				this.state = 704
				value(0)
				}
				}
				this.state = 709
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 710
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

	open class ParamExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_paramEx.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun ELLIPSIS() : TerminalNode? = getToken(FoldingParser.Tokens.ELLIPSIS.id, 0)
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun ARROW() : TerminalNode? = getToken(FoldingParser.Tokens.ARROW.id, 0)
		fun QM() : TerminalNode? = getToken(FoldingParser.Tokens.QM.id, 0)
		fun ARROWQM() : TerminalNode? = getToken(FoldingParser.Tokens.ARROWQM.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  paramEx() : ParamExContext {
		var _localctx : ParamExContext = ParamExContext(context, state)
		enterRule(_localctx, 76, Rules.RULE_paramEx.id)
		try {
			this.state = 734
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,87,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 712
			match(ID) as Token
			this.state = 713
			match(ELLIPSIS) as Token
			this.state = 714
			match(TILDE) as Token
			this.state = 715
			typeEx()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 716
			match(ID) as Token
			this.state = 717
			match(TILDE) as Token
			this.state = 718
			typeEx()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 719
			value(0)
			this.state = 723
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ARROW  ->  /*LL1AltBlock*/{if (true){
			this.state = 720
			match(ARROW) as Token
			this.state = 721
			match(QM) as Token
			}}
			ARROWQM  ->  /*LL1AltBlock*/{if (true){
			this.state = 722
			match(ARROWQM) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 725
			match(TILDE) as Token
			this.state = 726
			typeEx()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 728
			value(0)
			this.state = 729
			match(ARROW) as Token
			this.state = 730
			match(ID) as Token
			this.state = 731
			match(TILDE) as Token
			this.state = 732
			typeEx()
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
		fun findParamEx() : List<ParamExContext> = getRuleContexts(solver.getType("ParamExContext"))
		fun findParamEx(i: Int) : ParamExContext? = getRuleContext(solver.getType("ParamExContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  parameter() : ParameterContext {
		var _localctx : ParameterContext = ParameterContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_parameter.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 737 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 736
				paramEx()
				}
				}
				this.state = 739 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl MATCH) or (1L shl NULLKEYWORD) or (1L shl TRUE) or (1L shl FALSE) or (1L shl THIS) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl ARROWQM) or (1L shl TILDE) or (1L shl QUOTE))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (SHARP - 65)) or (1L shl (ID - 65)) or (1L shl (Integer - 65)) or (1L shl (Double - 65)) or (1L shl (String - 65)))) != 0L) )
			}
		}
		catch (re: RecognitionException) {
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
		enterRule(_localctx, 80, Rules.RULE_argEx.id)
		var _la: Int
		try {
			this.state = 761
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,93,context) ) {
			1 -> {_localctx = SingleArgContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 743
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,89,context) ) {
			1   -> if (true){
			this.state = 741
			match(ID) as Token
			this.state = 742
			match(ASSGIN) as Token
			}
			}
			this.state = 746
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 745
				match(ELLIPSIS) as Token
				}
			}

			this.state = 748
			value(0)
			}}
			2 -> {_localctx = MultiArgContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 751
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 749
				match(ID) as Token
				this.state = 750
				match(ELLIPSIS) as Token
				}
			}

			this.state = 753
			match(LBRACE) as Token
			this.state = 757
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl MATCH) or (1L shl NULLKEYWORD) or (1L shl TRUE) or (1L shl FALSE) or (1L shl THIS) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl ARROWQM) or (1L shl TILDE) or (1L shl QUOTE))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (SHARP - 65)) or (1L shl (ID - 65)) or (1L shl (Integer - 65)) or (1L shl (Double - 65)) or (1L shl (String - 65)))) != 0L)) {
				if (true){
				if (true){
				this.state = 754
				value(0)
				}
				}
				this.state = 759
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 760
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
		fun PIPE() : TerminalNode? = getToken(FoldingParser.Tokens.PIPE.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(ctx: ArgValueContext) { copyFrom(ctx) }
	}
	open class PrimaryArgValueContext : ArgValueContext {
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun PIPE() : TerminalNode? = getToken(FoldingParser.Tokens.PIPE.id, 0)
		fun findArgEx() : List<ArgExContext> = getRuleContexts(solver.getType("ArgExContext"))
		fun findArgEx(i: Int) : ArgExContext? = getRuleContext(solver.getType("ArgExContext"),i)
		fun findTypeEx() : List<TypeExContext> = getRuleContexts(solver.getType("TypeExContext"))
		fun findTypeEx(i: Int) : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),i)
		constructor(ctx: ArgValueContext) { copyFrom(ctx) }
	}

	fun  argValue() : ArgValueContext {
		var _localctx : ArgValueContext = ArgValueContext(context, state)
		enterRule(_localctx, 82, Rules.RULE_argValue.id)
		var _la: Int
		try {
			this.state = 797
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{_localctx = PrimaryArgValueContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 763
			match(LPAREN) as Token
			this.state = 771
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,95,context) ) {
			1   -> if (true){
			this.state = 765 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 764
				typeEx()
				}
				}
				this.state = 767 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( ((((_la - 32)) and 0x3f.inv()) == 0 && ((1L shl (_la - 32)) and ((1L shl (INT - 32)) or (1L shl (LONG - 32)) or (1L shl (DOUBLE - 32)) or (1L shl (FLOAT - 32)) or (1L shl (BYTE - 32)) or (1L shl (CHAR - 32)) or (1L shl (STRING - 32)) or (1L shl (BOOLEAN - 32)) or (1L shl (UNIT - 32)) or (1L shl (LPAREN - 32)) or (1L shl (QUOTE - 32)) or (1L shl (ID - 32)))) != 0L) )
			this.state = 769
			match(PIPE) as Token
			}
			}
			this.state = 776
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl MATCH) or (1L shl NULLKEYWORD) or (1L shl TRUE) or (1L shl FALSE) or (1L shl THIS) or (1L shl ELLIPSIS) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl ARROW) or (1L shl ARROWQM) or (1L shl TILDE) or (1L shl QUOTE))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (SHARP - 65)) or (1L shl (ID - 65)) or (1L shl (Integer - 65)) or (1L shl (Double - 65)) or (1L shl (String - 65)))) != 0L)) {
				if (true){
				if (true){
				this.state = 773
				argEx()
				}
				}
				this.state = 778
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 779
			match(RPAREN) as Token
			}}
			LBRACE  ->  /*LL1AltBlock*/{_localctx = SingleListArgValueContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 780
			match(LBRACE) as Token
			this.state = 788
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,98,context) ) {
			1   -> if (true){
			this.state = 782 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 781
				typeEx()
				}
				}
				this.state = 784 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( ((((_la - 32)) and 0x3f.inv()) == 0 && ((1L shl (_la - 32)) and ((1L shl (INT - 32)) or (1L shl (LONG - 32)) or (1L shl (DOUBLE - 32)) or (1L shl (FLOAT - 32)) or (1L shl (BYTE - 32)) or (1L shl (CHAR - 32)) or (1L shl (STRING - 32)) or (1L shl (BOOLEAN - 32)) or (1L shl (UNIT - 32)) or (1L shl (LPAREN - 32)) or (1L shl (QUOTE - 32)) or (1L shl (ID - 32)))) != 0L) )
			this.state = 786
			match(PIPE) as Token
			}
			}
			this.state = 793
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl MATCH) or (1L shl NULLKEYWORD) or (1L shl TRUE) or (1L shl FALSE) or (1L shl THIS) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl ARROWQM) or (1L shl TILDE) or (1L shl QUOTE))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (SHARP - 65)) or (1L shl (ID - 65)) or (1L shl (Integer - 65)) or (1L shl (Double - 65)) or (1L shl (String - 65)))) != 0L)) {
				if (true){
				if (true){
				this.state = 790
				value(0)
				}
				}
				this.state = 795
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 796
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
		enterRule(_localctx, 84, Rules.RULE_invoking.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 799
			match(COLON) as Token
			this.state = 800
			match(LPAREN) as Token
			this.state = 804
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl MATCH) or (1L shl NULLKEYWORD) or (1L shl TRUE) or (1L shl FALSE) or (1L shl THIS) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl ARROWQM) or (1L shl TILDE) or (1L shl QUOTE))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (SHARP - 65)) or (1L shl (ID - 65)) or (1L shl (Integer - 65)) or (1L shl (Double - 65)) or (1L shl (String - 65)))) != 0L)) {
				if (true){
				if (true){
				this.state = 801
				value(0)
				}
				}
				this.state = 806
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 807
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

	open class CommonOpIdentifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_commonOpIdentifier.id
	        set(value) { throw RuntimeException() }
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		fun findCommonIdentifier() : CommonIdentifierContext? = getRuleContext(solver.getType("CommonIdentifierContext"),0)
		fun EM() : TerminalNode? = getToken(FoldingParser.Tokens.EM.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  commonOpIdentifier() : CommonOpIdentifierContext {
		var _localctx : CommonOpIdentifierContext = CommonOpIdentifierContext(context, state)
		enterRule(_localctx, 86, Rules.RULE_commonOpIdentifier.id)
		try {
			this.state = 813
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			OPID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 809
			match(OPID) as Token
			}}
			LSQUARE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 810
			commonIdentifier()
			this.state = 811
			match(EM) as Token
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
		enterRule(_localctx, 88, Rules.RULE_commonIdentifier.id)
		try {
			this.state = 818
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,103,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 815
			match(ID) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 816
			opIdWrap()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 817
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
		enterRule(_localctx, 90, Rules.RULE_opIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 820
			match(LSQUARE) as Token
			this.state = 821
			match(OPID) as Token
			this.state = 822
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
		enterRule(_localctx, 92, Rules.RULE_aopIdWrap.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 824
			match(LSQUARE) as Token
			this.state = 825
			match(TILDE) as Token
			this.state = 826
			match(OPID) as Token
			this.state = 827
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

	open class CommonClassIdentifierContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_commonClassIdentifier.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun QUOTE() : List<TerminalNode> = getTokens(FoldingParser.Tokens.QUOTE.id)
		fun QUOTE(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.QUOTE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  commonClassIdentifier() : CommonClassIdentifierContext {
		var _localctx : CommonClassIdentifierContext = CommonClassIdentifierContext(context, state)
		enterRule(_localctx, 94, Rules.RULE_commonClassIdentifier.id)
		try {
			this.state = 833
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 829
			match(ID) as Token
			}}
			QUOTE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 830
			match(QUOTE) as Token
			this.state = 831
			match(ID) as Token
			this.state = 832
			match(QUOTE) as Token
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
		enterRule(_localctx, 96, Rules.RULE_field.id)
		try {
			this.state = 838
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,105,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 835
			fieldSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 836
			fieldNotInit()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 837
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
		enterRule(_localctx, 98, Rules.RULE_fieldNotInit.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 843
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 840
				match(LPAREN) as Token
				this.state = 841
				match(MUTABLE) as Token
				this.state = 842
				match(RPAREN) as Token
				}
			}

			this.state = 845
			match(ID) as Token
			this.state = 846
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
		enterRule(_localctx, 100, Rules.RULE_fieldSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 851
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 848
				match(LPAREN) as Token
				this.state = 849
				match(MUTABLE) as Token
				this.state = 850
				match(RPAREN) as Token
				}
			}

			this.state = 853
			match(ID) as Token
			this.state = 855
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (((((_la - 32)) and 0x3f.inv()) == 0 && ((1L shl (_la - 32)) and ((1L shl (INT - 32)) or (1L shl (LONG - 32)) or (1L shl (DOUBLE - 32)) or (1L shl (FLOAT - 32)) or (1L shl (BYTE - 32)) or (1L shl (CHAR - 32)) or (1L shl (STRING - 32)) or (1L shl (BOOLEAN - 32)) or (1L shl (UNIT - 32)) or (1L shl (LPAREN - 32)) or (1L shl (QUOTE - 32)) or (1L shl (ID - 32)))) != 0L)) {
				if (true){
				this.state = 854
				typeEx()
				}
			}

			this.state = 857
			match(ASSGIN) as Token
			this.state = 858
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
		var inputID: Token? = null
		var settingValue: ValueContext? = null
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun FOREIGN() : TerminalNode? = getToken(FoldingParser.Tokens.FOREIGN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun ID() : List<TerminalNode> = getTokens(FoldingParser.Tokens.ID.id)
		fun ID(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.ID.id, i) as TerminalNode
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun GET() : TerminalNode? = getToken(FoldingParser.Tokens.GET.id, 0)
		fun ASSGIN() : List<TerminalNode> = getTokens(FoldingParser.Tokens.ASSGIN.id)
		fun ASSGIN(i: Int) : TerminalNode = getToken(FoldingParser.Tokens.ASSGIN.id, i) as TerminalNode
		fun SET() : TerminalNode? = getToken(FoldingParser.Tokens.SET.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignField() : ForeignFieldContext {
		var _localctx : ForeignFieldContext = ForeignFieldContext(context, state)
		enterRule(_localctx, 102, Rules.RULE_foreignField.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 860
			match(LPAREN) as Token
			this.state = 861
			match(FOREIGN) as Token
			this.state = 862
			match(RPAREN) as Token
			this.state = 863
			match(ID) as Token
			this.state = 864
			typeEx()
			this.state = 868
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,109,context) ) {
			1   -> if (true){
			this.state = 865
			match(GET) as Token
			this.state = 866
			match(ASSGIN) as Token
			this.state = 867
			(_localctx as ForeignFieldContext).gettingValue = value(0)
			}
			}
			this.state = 874
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,110,context) ) {
			1   -> if (true){
			this.state = 870
			match(SET) as Token
			this.state = 871
			(_localctx as ForeignFieldContext).inputID = match(ID) as Token
			this.state = 872
			match(ASSGIN) as Token
			this.state = 873
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
		enterRule(_localctx, 104, Rules.RULE_def.id)
		try {
			var _alt: Int
			this.state = 890
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,113,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 876
			justDef()
			this.state = 880
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,111,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 877
					inverseDefining()
					}
					} 
				}
				this.state = 882
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,111,context)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 883
			foreignDef()
			this.state = 887
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,112,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 884
					inverseDefining()
					}
					} 
				}
				this.state = 889
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,112,context)
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  justDef() : JustDefContext {
		var _localctx : JustDefContext = JustDefContext(context, state)
		enterRule(_localctx, 106, Rules.RULE_justDef.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 893
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,114,context) ) {
			1   -> if (true){
			this.state = 892
			annotationBlock()
			}
			}
			this.state = 895
			commonIdentifier()
			this.state = 897
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,115,context) ) {
			1   -> if (true){
			this.state = 896
			typeParam()
			}
			}
			this.state = 903
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,116,context) ) {
			1   -> if (true){
			this.state = 899
			match(LPAREN) as Token
			this.state = 900
			parameter()
			this.state = 901
			match(RPAREN) as Token
			}
			}
			this.state = 905
			typeEx()
			this.state = 906
			match(ASSGIN) as Token
			this.state = 907
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findForeignBody() : ForeignBodyContext? = getRuleContext(solver.getType("ForeignBodyContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  foreignDef() : ForeignDefContext {
		var _localctx : ForeignDefContext = ForeignDefContext(context, state)
		enterRule(_localctx, 108, Rules.RULE_foreignDef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 910
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,117,context) ) {
			1   -> if (true){
			this.state = 909
			annotationBlock()
			}
			}
			this.state = 912
			commonIdentifier()
			this.state = 914
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==QUOTE || _la==ID) {
				if (true){
				this.state = 913
				typeParam()
				}
			}

			this.state = 920
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 916
				match(LPAREN) as Token
				this.state = 917
				parameter()
				this.state = 918
				match(RPAREN) as Token
				}
			}

			this.state = 922
			match(FOREIGN) as Token
			this.state = 923
			typeEx()
			this.state = 925
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,120,context) ) {
			1   -> if (true){
			this.state = 924
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: InverseDefiningContext) {
			super.copyFrom(ctx)
		}
	}
	open class RawInverseDefContext : InverseDefiningContext {
		fun INVERSE() : TerminalNode? = getToken(FoldingParser.Tokens.INVERSE.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findInverseDefGateCompo() : List<InverseDefGateCompoContext> = getRuleContexts(solver.getType("InverseDefGateCompoContext"))
		fun findInverseDefGateCompo(i: Int) : InverseDefGateCompoContext? = getRuleContext(solver.getType("InverseDefGateCompoContext"),i)
		constructor(ctx: InverseDefiningContext) { copyFrom(ctx) }
	}
	open class SimpleInverseDefContext : InverseDefiningContext {
		fun INVERSE() : TerminalNode? = getToken(FoldingParser.Tokens.INVERSE.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun findInverseDefCompo() : List<InverseDefCompoContext> = getRuleContexts(solver.getType("InverseDefCompoContext"))
		fun findInverseDefCompo(i: Int) : InverseDefCompoContext? = getRuleContext(solver.getType("InverseDefCompoContext"),i)
		constructor(ctx: InverseDefiningContext) { copyFrom(ctx) }
	}

	fun  inverseDefining() : InverseDefiningContext {
		var _localctx : InverseDefiningContext = InverseDefiningContext(context, state)
		enterRule(_localctx, 110, Rules.RULE_inverseDefining.id)
		var _la: Int
		try {
			this.state = 952
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,125,context) ) {
			1 -> {_localctx = SimpleInverseDefContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 927
			match(INVERSE) as Token
			this.state = 929
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 928
				match(ID) as Token
				}
			}

			this.state = 931
			match(LPAREN) as Token
			this.state = 933 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 932
				inverseDefCompo()
				}
				}
				this.state = 935 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl MATCH) or (1L shl NULLKEYWORD) or (1L shl TRUE) or (1L shl FALSE) or (1L shl THIS) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl ARROWQM) or (1L shl TILDE) or (1L shl As) or (1L shl QUOTE))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (SHARP - 65)) or (1L shl (ID - 65)) or (1L shl (Integer - 65)) or (1L shl (Double - 65)) or (1L shl (String - 65)))) != 0L) )
			this.state = 937
			match(RPAREN) as Token
			}}
			2 -> {_localctx = RawInverseDefContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 939
			match(INVERSE) as Token
			this.state = 941
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 940
				match(ID) as Token
				}
			}

			this.state = 943
			match(LPAREN) as Token
			this.state = 945 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 944
				inverseDefGateCompo()
				}
				}
				this.state = 947 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ARROW) or (1L shl ARROWQM) or (1L shl As))) != 0L) )
			this.state = 949
			match(RPAREN) as Token
			this.state = 950
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
		enterRule(_localctx, 112, Rules.RULE_inverseDefCompo.id)
		try {
			this.state = 961
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			DO , IF , NEW , LET , MATCH , NULLKEYWORD , TRUE , FALSE , THIS , LPAREN , LSQUARE , ARROW , ARROWQM , TILDE , QUOTE , SHARP , ID , Integer , Double , String  ->  /*LL1AltBlock*/{_localctx = OutputParamContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 954
			value(0)
			this.state = 957
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,126,context) ) {
			1   -> if (true){
			this.state = 955
			match(TILDE) as Token
			this.state = 956
			typeEx()
			}
			}
			}}
			As  ->  /*LL1AltBlock*/{_localctx = NecessaryParamContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 959
			match(As) as Token
			this.state = 960
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

	open class InverseDefGateCompoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_inverseDefGateCompo.id
	        set(value) { throw RuntimeException() }
		fun ARROWQM() : TerminalNode? = getToken(FoldingParser.Tokens.ARROWQM.id, 0)
		fun ARROW() : TerminalNode? = getToken(FoldingParser.Tokens.ARROW.id, 0)
		fun QM() : TerminalNode? = getToken(FoldingParser.Tokens.QM.id, 0)
		fun As() : TerminalNode? = getToken(FoldingParser.Tokens.As.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  inverseDefGateCompo() : InverseDefGateCompoContext {
		var _localctx : InverseDefGateCompoContext = InverseDefGateCompoContext(context, state)
		enterRule(_localctx, 114, Rules.RULE_inverseDefGateCompo.id)
		try {
			this.state = 970
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ARROW , ARROWQM  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 966
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ARROWQM  ->  /*LL1AltBlock*/{if (true){
			this.state = 963
			match(ARROWQM) as Token
			}}
			ARROW  ->  /*LL1AltBlock*/{if (true){
			this.state = 964
			match(ARROW) as Token
			this.state = 965
			match(QM) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			}}
			As  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 968
			match(As) as Token
			this.state = 969
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
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  lambda() : LambdaContext {
		var _localctx : LambdaContext = LambdaContext(context, state)
		enterRule(_localctx, 116, Rules.RULE_lambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 972
			match(LSQUARE) as Token
			this.state = 974
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl LET) or (1L shl MATCH) or (1L shl NULLKEYWORD) or (1L shl TRUE) or (1L shl FALSE) or (1L shl THIS) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl ARROWQM) or (1L shl TILDE) or (1L shl QUOTE))) != 0L) || ((((_la - 65)) and 0x3f.inv()) == 0 && ((1L shl (_la - 65)) and ((1L shl (SHARP - 65)) or (1L shl (ID - 65)) or (1L shl (Integer - 65)) or (1L shl (Double - 65)) or (1L shl (String - 65)))) != 0L)) {
				if (true){
				this.state = 973
				parameter()
				}
			}

			this.state = 976
			match(RSQUARE) as Token
			this.state = 977
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
		enterRule(_localctx, 118, Rules.RULE_typeEx.id)
		try {
			this.state = 992
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 986
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,132,context) ) {
			1 -> {if (true){
			this.state = 979
			typeExFunc()
			}}
			2 -> {if (true){
			this.state = 980
			match(LPAREN) as Token
			this.state = 981
			typeExFunc()
			this.state = 982
			match(RPAREN) as Token
			this.state = 984
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,131,context) ) {
			1   -> if (true){
			this.state = 983
			match(QM) as Token
			}
			}
			}}
			}
			}}
			INT , LONG , DOUBLE , FLOAT , BYTE , CHAR , STRING , BOOLEAN , UNIT , QUOTE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 988
			typeExSingle()
			this.state = 990
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,133,context) ) {
			1   -> if (true){
			this.state = 989
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
		fun findCommonClassIdentifier() : CommonClassIdentifierContext? = getRuleContext(solver.getType("CommonClassIdentifierContext"),0)
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
		enterRule(_localctx, 120, Rules.RULE_typeExSingle.id)
		var _la: Int
		try {
			this.state = 1011
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			QUOTE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 997
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,135,context) ) {
			1   -> if (true){
			this.state = 994
			package_()
			this.state = 995
			match(DOT) as Token
			}
			}
			this.state = 999
			commonClassIdentifier()
			this.state = 1008
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,137,context) ) {
			1   -> if (true){
			this.state = 1000
			match(LPAREN) as Token
			this.state = 1002 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 1001
				typeArgEx()
				}
				}
				this.state = 1004 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( ((((_la - 32)) and 0x3f.inv()) == 0 && ((1L shl (_la - 32)) and ((1L shl (INT - 32)) or (1L shl (LONG - 32)) or (1L shl (DOUBLE - 32)) or (1L shl (FLOAT - 32)) or (1L shl (BYTE - 32)) or (1L shl (CHAR - 32)) or (1L shl (STRING - 32)) or (1L shl (BOOLEAN - 32)) or (1L shl (UNIT - 32)) or (1L shl (LPAREN - 32)) or (1L shl (LSQUARE - 32)) or (1L shl (QUOTE - 32)) or (1L shl (ID - 32)))) != 0L) )
			this.state = 1006
			match(RPAREN) as Token
			}
			}
			}}
			INT , LONG , DOUBLE , FLOAT , BYTE , CHAR , STRING , BOOLEAN , UNIT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1010
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
		enterRule(_localctx, 122, Rules.RULE_typeArgEx.id)
		try {
			this.state = 1017
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,139,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1013
			typeEx()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1014
			typeExCovariant()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 1015
			typeExContravariant()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 1016
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
		enterRule(_localctx, 124, Rules.RULE_primitiveType.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1019
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
		enterRule(_localctx, 126, Rules.RULE_typeExParamEx.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1021
			typeEx()
			this.state = 1023
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 1022
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
		enterRule(_localctx, 128, Rules.RULE_typeExFunc.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1025
			match(LPAREN) as Token
			this.state = 1029
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (((((_la - 32)) and 0x3f.inv()) == 0 && ((1L shl (_la - 32)) and ((1L shl (INT - 32)) or (1L shl (LONG - 32)) or (1L shl (DOUBLE - 32)) or (1L shl (FLOAT - 32)) or (1L shl (BYTE - 32)) or (1L shl (CHAR - 32)) or (1L shl (STRING - 32)) or (1L shl (BOOLEAN - 32)) or (1L shl (UNIT - 32)) or (1L shl (LPAREN - 32)) or (1L shl (QUOTE - 32)) or (1L shl (ID - 32)))) != 0L)) {
				if (true){
				if (true){
				this.state = 1026
				typeExParamEx()
				}
				}
				this.state = 1031
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1032
			match(RPAREN) as Token
			this.state = 1033
			match(ARROW) as Token
			this.state = 1034
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
		enterRule(_localctx, 130, Rules.RULE_typeExCovariant.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1036
			match(LSQUARE) as Token
			this.state = 1037
			match(TILDE) as Token
			this.state = 1038
			typeEx()
			this.state = 1039
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
		enterRule(_localctx, 132, Rules.RULE_typeExContravariant.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1041
			match(LSQUARE) as Token
			this.state = 1042
			typeEx()
			this.state = 1043
			match(TILDE) as Token
			this.state = 1044
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
		enterRule(_localctx, 134, Rules.RULE_typeExWildcard.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1046
			match(LSQUARE) as Token
			this.state = 1047
			match(QM) as Token
			this.state = 1048
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
		enterRule(_localctx, 136, Rules.RULE_foreignBody.id)
		var _la: Int
		try {
			this.state = 1059
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LBRACE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1050
			match(LBRACE) as Token
			this.state = 1054
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 1051
				foreignElement()
				}
				}
				this.state = 1056
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1057
			match(RBRACE) as Token
			}}
			RawString  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 1058
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
		enterRule(_localctx, 138, Rules.RULE_foreignElement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1061
			foreignPlatform()
			this.state = 1062
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
		enterRule(_localctx, 140, Rules.RULE_foreignPlatform.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1064
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
		fun findCommonClassIdentifier() : CommonClassIdentifierContext? = getRuleContext(solver.getType("CommonClassIdentifierContext"),0)
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
		enterRule(_localctx, 142, Rules.RULE_typeAlias.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1066
			match(TYPEALIAS) as Token
			this.state = 1067
			commonClassIdentifier()
			this.state = 1072
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 1068
				match(LPAREN) as Token
				this.state = 1069
				typeParam()
				this.state = 1070
				match(RPAREN) as Token
				}
			}

			this.state = 1083
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ASSGIN  ->  /*LL1AltBlock*/{if (true){
			this.state = 1074
			match(ASSGIN) as Token
			this.state = 1075
			typeEx()
			}}
			FOREIGN  ->  /*LL1AltBlock*/{if (true){
			this.state = 1076
			match(FOREIGN) as Token
			this.state = 1078
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE || _la==RawString) {
				if (true){
				this.state = 1077
				foreignBody()
				}
			}

			this.state = 1081
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==EXPECT) {
				if (true){
				this.state = 1080
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
		enterRule(_localctx, 144, Rules.RULE_foreignTypeExpectitive.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1085
			match(EXPECT) as Token
			this.state = 1086
			match(LBRACE) as Token
			this.state = 1091
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 1087
				match(COLON) as Token
				this.state = 1088
				defInInterface()
				}
				}
				this.state = 1093
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1097
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 1094
				impl()
				}
				}
				this.state = 1099
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1100
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
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  annotationDef() : AnnotationDefContext {
		var _localctx : AnnotationDefContext = AnnotationDefContext(context, state)
		enterRule(_localctx, 146, Rules.RULE_annotationDef.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1102
			match(ANNOTATION) as Token
			this.state = 1103
			match(ID) as Token
			if (true){
			this.state = 1104
			match(LPAREN) as Token
			this.state = 1105
			parameter()
			this.state = 1106
			match(RPAREN) as Token
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
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun DOT() : TerminalNode? = getToken(FoldingParser.Tokens.DOT.id, 0)
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  annotation() : AnnotationContext {
		var _localctx : AnnotationContext = AnnotationContext(context, state)
		enterRule(_localctx, 148, Rules.RULE_annotation.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1111
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,150,context) ) {
			1   -> if (true){
			this.state = 1108
			package_()
			this.state = 1109
			match(DOT) as Token
			}
			}
			this.state = 1113
			match(ID) as Token
			this.state = 1115
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN || _la==LBRACE) {
				if (true){
				this.state = 1114
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
		enterRule(_localctx, 150, Rules.RULE_annotationBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 1117
			match(LSQUARE) as Token
			this.state = 1121
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 1118
				annotation()
				}
				}
				this.state = 1123
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 1124
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
		30 -> return value_sempred(_localctx as ValueContext, predIndex)
		}
		return true
	}
	private fun value_sempred( _localctx : ValueContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return precpred(context!!, 18)
		    1 -> return precpred(context!!, 17)
		    2 -> return precpred(context!!, 16)
		    3 -> return precpred(context!!, 15)
		    4 -> return precpred(context!!, 14)
		    5 -> return precpred(context!!, 13)
		    6 -> return precpred(context!!, 12)
		    7 -> return precpred(context!!, 11)
		    8 -> return precpred(context!!, 9)
		    9 -> return precpred(context!!, 8)
		    10 -> return precpred(context!!, 7)
		}
		return true
	}

}