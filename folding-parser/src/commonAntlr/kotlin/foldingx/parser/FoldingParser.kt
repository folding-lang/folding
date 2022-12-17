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
                                                              FoldingParser.Package_Context::class,
                                                              FoldingParser.NamespaceContext::class,
                                                              FoldingParser.DoBlockContext::class,
                                                              FoldingParser.CompoContext::class,
                                                              FoldingParser.ReturningContext::class,
                                                              FoldingParser.FieldAssignContext::class,
                                                              FoldingParser.Class_Context::class,
                                                              FoldingParser.ClassBodyContext::class,
                                                              FoldingParser.ConstructContext::class,
                                                              FoldingParser.Constructor_Context::class,
                                                              FoldingParser.ConstructorSelfContext::class,
                                                              FoldingParser.DefInInterfaceContext::class,
                                                              FoldingParser.InheritContext::class,
                                                              FoldingParser.ImplContext::class,
                                                              FoldingParser.ImplBodyContext::class,
                                                              FoldingParser.DefInImplContext::class,
                                                              FoldingParser.TypeParamContext::class,
                                                              FoldingParser.TypeParamCompoContext::class,
                                                              FoldingParser.DefinitionContext::class,
                                                              FoldingParser.DefaultValueContext::class,
                                                              FoldingParser.ValueContext::class,
                                                              FoldingParser.ReferenceContext::class,
                                                              FoldingParser.TypeCastingContext::class,
                                                              FoldingParser.If_elseContext::class,
                                                              FoldingParser.ParamExContext::class,
                                                              FoldingParser.ParamCExContext::class,
                                                              FoldingParser.ParameterContext::class,
                                                              FoldingParser.ParameterFromValueContext::class,
                                                              FoldingParser.SpecificAliasContext::class,
                                                              FoldingParser.ArgExContext::class,
                                                              FoldingParser.ArgValueContext::class,
                                                              FoldingParser.InvokeExContext::class,
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
        FIELD(15),
        INVERSE(16),
        FROM(17),
        IF(18),
        ELSE(19),
        NEW(20),
        INT(21),
        DOUBLE(22),
        FLOAT(23),
        BYTE(24),
        CHAR(25),
        STRING(26),
        BOOLEAN(27),
        NULL(28),
        ASSGIN(29),
        ELLIPSIS(30),
        DOT(31),
        LPAREN(32),
        RPAREN(33),
        LSQUARE(34),
        RSQUARE(35),
        LBRACE(36),
        RBRACE(37),
        ARROW(38),
        TILDE(39),
        As(40),
        COLON(41),
        COLONSHARP(42),
        QUOTE(43),
        COLONQUOTE(44),
        SHARP(45),
        QM(46),
        PLUS(47),
        MINUS(48),
        MULTIPLY(49),
        DIVIDE(50),
        ID(51),
        OPID(52),
        Integer(53),
        Double(54),
        String(55),
        RawString(56)
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
        RULE_package_(8),
        RULE_namespace(9),
        RULE_doBlock(10),
        RULE_compo(11),
        RULE_returning(12),
        RULE_fieldAssign(13),
        RULE_class_(14),
        RULE_classBody(15),
        RULE_construct(16),
        RULE_constructor_(17),
        RULE_constructorSelf(18),
        RULE_defInInterface(19),
        RULE_inherit(20),
        RULE_impl(21),
        RULE_implBody(22),
        RULE_defInImpl(23),
        RULE_typeParam(24),
        RULE_typeParamCompo(25),
        RULE_definition(26),
        RULE_defaultValue(27),
        RULE_value(28),
        RULE_reference(29),
        RULE_typeCasting(30),
        RULE_if_else(31),
        RULE_paramEx(32),
        RULE_paramCEx(33),
        RULE_parameter(34),
        RULE_parameterFromValue(35),
        RULE_specificAlias(36),
        RULE_argEx(37),
        RULE_argValue(38),
        RULE_invokeEx(39),
        RULE_invoking(40),
        RULE_commonIdentifier(41),
        RULE_opIdWrap(42),
        RULE_aopIdWrap(43),
        RULE_callingOpId(44),
        RULE_callingAopId(45),
        RULE_field(46),
        RULE_fieldNotInit(47),
        RULE_fieldSetted(48),
        RULE_def(49),
        RULE_justDef(50),
        RULE_foreignDef(51),
        RULE_inverseDefining(52),
        RULE_inverseDefCompo(53),
        RULE_lambda(54),
        RULE_parameterForLambda(55),
        RULE_parameterFromValueForLambda(56),
        RULE_typeEx(57),
        RULE_typeExSingle(58),
        RULE_primitiveType(59),
        RULE_typeExParamEx(60),
        RULE_typeExFunc(61),
        RULE_foreignBody(62),
        RULE_foreignElement(63),
        RULE_foreignPlatform(64),
        RULE_annotationDef(65),
        RULE_annotation(66),
        RULE_annotationBlock(67)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("file", "fileCompo", "importEx", "importBody", 
                                "importCompo", "importAlias", "importType", 
                                "importPath", "package_", "namespace", "doBlock", 
                                "compo", "returning", "fieldAssign", "class_", 
                                "classBody", "construct", "constructor_", 
                                "constructorSelf", "defInInterface", "inherit", 
                                "impl", "implBody", "defInImpl", "typeParam", 
                                "typeParamCompo", "definition", "defaultValue", 
                                "value", "reference", "typeCasting", "if_else", 
                                "paramEx", "paramCEx", "parameter", "parameterFromValue", 
                                "specificAlias", "argEx", "argValue", "invokeEx", 
                                "invoking", "commonIdentifier", "opIdWrap", 
                                "aopIdWrap", "callingOpId", "callingAopId", 
                                "field", "fieldNotInit", "fieldSetted", 
                                "def", "justDef", "foreignDef", "inverseDefining", 
                                "inverseDefCompo", "lambda", "parameterForLambda", 
                                "parameterFromValueForLambda", "typeEx", 
                                "typeExSingle", "primitiveType", "typeExParamEx", 
                                "typeExFunc", "foreignBody", "foreignElement", 
                                "foreignPlatform", "annotationDef", "annotation", 
                                "annotationBlock")

        private val LITERAL_NAMES: List<String?> = listOf(null, null, null, 
                                                          null, "'annotation'", 
                                                          "'class'", "'do'", 
                                                          "'foreign'", "'package'", 
                                                          "'internal'", 
                                                          "'import'", "'impl'", 
                                                          "'inherit'", "'return'", 
                                                          "'mutable'", "'field'", 
                                                          "'inverse'", "'from'", 
                                                          "'if'", "'else'", 
                                                          "'new'", "'Int'", 
                                                          "'Double'", "'Float'", 
                                                          "'Byte'", "'Char'", 
                                                          "'String'", "'Boolean'", 
                                                          "'null'", "'='", 
                                                          "'...'", "'.'", 
                                                          "'('", "')'", 
                                                          "'['", "']'", 
                                                          "'{'", "'}'", 
                                                          "'->'", "'~'", 
                                                          "'~>'", "':'", 
                                                          "':#'", "'''", 
                                                          "':''", "'#'", 
                                                          "'?'", "'+'", 
                                                          "'-'", "'*'", 
                                                          "'/'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "WS", "COMMENT", 
                                                           "LINE_COMMENT", 
                                                           "ANNOTATION", 
                                                           "CLASS", "DO", 
                                                           "FOREIGN", "NAMESPACE", 
                                                           "INTERNAL", "IMPORT", 
                                                           "IMPL", "INHERIT", 
                                                           "RETURN", "MUTABLE", 
                                                           "FIELD", "INVERSE", 
                                                           "FROM", "IF", 
                                                           "ELSE", "NEW", 
                                                           "INT", "DOUBLE", 
                                                           "FLOAT", "BYTE", 
                                                           "CHAR", "STRING", 
                                                           "BOOLEAN", "NULL", 
                                                           "ASSGIN", "ELLIPSIS", 
                                                           "DOT", "LPAREN", 
                                                           "RPAREN", "LSQUARE", 
                                                           "RSQUARE", "LBRACE", 
                                                           "RBRACE", "ARROW", 
                                                           "TILDE", "As", 
                                                           "COLON", "COLONSHARP", 
                                                           "QUOTE", "COLONQUOTE", 
                                                           "SHARP", "QM", 
                                                           "PLUS", "MINUS", 
                                                           "MULTIPLY", "DIVIDE", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u003a\u030a\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0004\u002a\u0009\u002a\u0004\u002b\u0009\u002b\u0004\u002c\u0009\u002c\u0004\u002d\u0009\u002d\u0004\u002e\u0009\u002e\u0004\u002f\u0009\u002f\u0004\u0030\u0009\u0030\u0004\u0031\u0009\u0031\u0004\u0032\u0009\u0032\u0004\u0033\u0009\u0033\u0004\u0034\u0009\u0034\u0004\u0035\u0009\u0035\u0004\u0036\u0009\u0036\u0004\u0037\u0009\u0037\u0004\u0038\u0009\u0038\u0004\u0039\u0009\u0039\u0004\u003a\u0009\u003a\u0004\u003b\u0009\u003b\u0004\u003c\u0009\u003c\u0004\u003d\u0009\u003d\u0004\u003e\u0009\u003e\u0004\u003f\u0009\u003f\u0004\u0040\u0009\u0040\u0004\u0041\u0009\u0041\u0004\u0042\u0009\u0042\u0004\u0043\u0009\u0043\u0004\u0044\u0009\u0044\u0004\u0045\u0009\u0045\u0003\u0002\u0005\u0002\u008c\u000a\u0002\u0003\u0002\u0007\u0002\u008f\u000a\u0002\u000c\u0002\u000e\u0002\u0092\u000b\u0002\u0003\u0002\u0003\u0002\u0007\u0002\u0096\u000a\u0002\u000c\u0002\u000e\u0002\u0099\u000b\u0002\u0003\u0003\u0003\u0003\u0005\u0003\u009d\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u00a2\u000a\u0004\u0003\u0004\u0005\u0004\u00a5\u000a\u0004\u0003\u0005\u0003\u0005\u0007\u0005\u00a9\u000a\u0005\u000c\u0005\u000e\u0005\u00ac\u000b\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00b3\u000a\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u00b7\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0007\u000a\u00c2\u000a\u000a\u000c\u000a\u000e\u000a\u00c5\u000b\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u00cd\u000a\u000c\u000c\u000c\u000e\u000c\u00d0\u000b\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00d7\u000a\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0005\u0010\u00e1\u000a\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u00e6\u000a\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u00ed\u000a\u0011\u000c\u0011\u000e\u0011\u00f0\u000b\u0011\u0003\u0011\u0007\u0011\u00f3\u000a\u0011\u000c\u0011\u000e\u0011\u00f6\u000b\u0011\u0003\u0011\u0005\u0011\u00f9\u000a\u0011\u0003\u0011\u0007\u0011\u00fc\u000a\u0011\u000c\u0011\u000e\u0011\u00ff\u000b\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u0105\u000a\u0011\u000c\u0011\u000e\u0011\u0108\u000b\u0011\u0003\u0011\u0007\u0011\u010b\u000a\u0011\u000c\u0011\u000e\u0011\u010e\u000b\u0011\u0003\u0011\u0005\u0011\u0111\u000a\u0011\u0003\u0012\u0006\u0012\u0114\u000a\u0012\u000d\u0012\u000e\u0012\u0115\u0003\u0012\u0005\u0012\u0119\u000a\u0012\u0003\u0013\u0003\u0013\u0005\u0013\u011d\u000a\u0013\u0003\u0013\u0005\u0013\u0120\u000a\u0013\u0003\u0014\u0005\u0014\u0123\u000a\u0014\u0003\u0014\u0005\u0014\u0126\u000a\u0014\u0003\u0015\u0005\u0015\u0129\u000a\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u012d\u000a\u0015\u0003\u0015\u0005\u0015\u0130\u000a\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0005\u0015\u0135\u000a\u0015\u0003\u0016\u0003\u0016\u0005\u0016\u0139\u000a\u0016\u0003\u0016\u0003\u0016\u0005\u0016\u013d\u000a\u0016\u0003\u0017\u0003\u0017\u0005\u0017\u0141\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0145\u000a\u0017\u0003\u0018\u0003\u0018\u0007\u0018\u0149\u000a\u0018\u000c\u0018\u000e\u0018\u014c\u000b\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0005\u0019\u0151\u000a\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u0155\u000a\u0019\u0003\u0019\u0005\u0019\u0158\u000a\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0006\u001a\u015f\u000a\u001a\u000d\u001a\u000e\u001a\u0160\u0003\u001b\u0003\u001b\u0003\u001b\u0007\u001b\u0166\u000a\u001b\u000c\u001b\u000e\u001b\u0169\u000b\u001b\u0003\u001c\u0003\u001c\u0005\u001c\u016d\u000a\u001c\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u017a\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u017f\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u018d\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0005\u001e\u01a0\u000a\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0003\u001e\u0007\u001e\u01a9\u000a\u001e\u000c\u001e\u000e\u001e\u01ac\u000b\u001e\u0003\u001f\u0003\u001f\u0003\u001f\u0005\u001f\u01b1\u000a\u001f\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0005\u0021\u01c5\u000a\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0003\u0021\u0005\u0021\u01ce\u000a\u0021\u0003\u0022\u0003\u0022\u0005\u0022\u01d2\u000a\u0022\u0003\u0022\u0003\u0022\u0003\u0022\u0003\u0023\u0005\u0023\u01d8\u000a\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0007\u0024\u01e0\u000a\u0024\u000c\u0024\u000e\u0024\u01e3\u000b\u0024\u0003\u0024\u0003\u0024\u0005\u0024\u01e7\u000a\u0024\u0003\u0025\u0003\u0025\u0003\u0025\u0006\u0025\u01ec\u000a\u0025\u000d\u0025\u000e\u0025\u01ed\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0005\u0027\u01f9\u000a\u0027\u0003\u0027\u0003\u0027\u0005\u0027\u01fd\u000a\u0027\u0003\u0027\u0003\u0027\u0007\u0027\u0201\u000a\u0027\u000c\u0027\u000e\u0027\u0204\u000b\u0027\u0003\u0027\u0005\u0027\u0207\u000a\u0027\u0003\u0028\u0003\u0028\u0006\u0028\u020b\u000a\u0028\u000d\u0028\u000e\u0028\u020c\u0003\u0028\u0003\u0028\u0005\u0028\u0211\u000a\u0028\u0003\u0028\u0007\u0028\u0214\u000a\u0028\u000c\u0028\u000e\u0028\u0217\u000b\u0028\u0003\u0028\u0003\u0028\u0003\u0028\u0006\u0028\u021c\u000a\u0028\u000d\u0028\u000e\u0028\u021d\u0003\u0028\u0003\u0028\u0005\u0028\u0222\u000a\u0028\u0003\u0028\u0007\u0028\u0225\u000a\u0028\u000c\u0028\u000e\u0028\u0228\u000b\u0028\u0003\u0028\u0005\u0028\u022b\u000a\u0028\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0003\u0029\u0005\u0029\u0232\u000a\u0029\u0003\u002a\u0003\u002a\u0007\u002a\u0236\u000a\u002a\u000c\u002a\u000e\u002a\u0239\u000b\u002a\u0003\u002a\u0003\u002a\u0003\u002b\u0003\u002b\u0003\u002b\u0005\u002b\u0240\u000a\u002b\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002c\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002d\u0003\u002e\u0003\u002e\u0005\u002e\u024d\u000a\u002e\u0003\u002f\u0003\u002f\u0005\u002f\u0251\u000a\u002f\u0003\u0030\u0003\u0030\u0005\u0030\u0255\u000a\u0030\u0003\u0031\u0003\u0031\u0005\u0031\u0259\u000a\u0031\u0003\u0031\u0003\u0031\u0003\u0031\u0003\u0032\u0003\u0032\u0005\u0032\u0260\u000a\u0032\u0003\u0032\u0003\u0032\u0005\u0032\u0264\u000a\u0032\u0003\u0032\u0003\u0032\u0003\u0032\u0003\u0033\u0003\u0033\u0007\u0033\u026b\u000a\u0033\u000c\u0033\u000e\u0033\u026e\u000b\u0033\u0003\u0033\u0005\u0033\u0271\u000a\u0033\u0003\u0034\u0005\u0034\u0274\u000a\u0034\u0003\u0034\u0003\u0034\u0005\u0034\u0278\u000a\u0034\u0003\u0034\u0005\u0034\u027b\u000a\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0034\u0003\u0035\u0005\u0035\u0282\u000a\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u0286\u000a\u0035\u0003\u0035\u0005\u0035\u0289\u000a\u0035\u0003\u0035\u0003\u0035\u0003\u0035\u0005\u0035\u028e\u000a\u0035\u0003\u0036\u0003\u0036\u0005\u0036\u0292\u000a\u0036\u0003\u0036\u0003\u0036\u0006\u0036\u0296\u000a\u0036\u000d\u0036\u000e\u0036\u0297\u0003\u0036\u0003\u0036\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0003\u0037\u0005\u0037\u02a1\u000a\u0037\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0038\u0003\u0039\u0007\u0039\u02a9\u000a\u0039\u000c\u0039\u000e\u0039\u02ac\u000b\u0039\u0003\u0039\u0005\u0039\u02af\u000a\u0039\u0003\u003a\u0003\u003a\u0006\u003a\u02b3\u000a\u003a\u000d\u003a\u000e\u003a\u02b4\u0003\u003b\u0005\u003b\u02b8\u000a\u003b\u0003\u003b\u0003\u003b\u0005\u003b\u02bc\u000a\u003b\u0003\u003b\u0005\u003b\u02bf\u000a\u003b\u0003\u003c\u0003\u003c\u0003\u003c\u0005\u003c\u02c4\u000a\u003c\u0003\u003c\u0003\u003c\u0003\u003c\u0006\u003c\u02c9\u000a\u003c\u000d\u003c\u000e\u003c\u02ca\u0003\u003c\u0003\u003c\u0005\u003c\u02cf\u000a\u003c\u0003\u003c\u0005\u003c\u02d2\u000a\u003c\u0003\u003d\u0003\u003d\u0003\u003e\u0003\u003e\u0005\u003e\u02d8\u000a\u003e\u0003\u003f\u0003\u003f\u0007\u003f\u02dc\u000a\u003f\u000c\u003f\u000e\u003f\u02df\u000b\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u003f\u0003\u0040\u0003\u0040\u0007\u0040\u02e7\u000a\u0040\u000c\u0040\u000e\u0040\u02ea\u000b\u0040\u0003\u0040\u0003\u0040\u0005\u0040\u02ee\u000a\u0040\u0003\u0041\u0003\u0041\u0003\u0041\u0003\u0042\u0003\u0042\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0043\u0003\u0044\u0003\u0044\u0003\u0044\u0005\u0044\u02fc\u000a\u0044\u0003\u0044\u0003\u0044\u0003\u0044\u0003\u0045\u0003\u0045\u0007\u0045\u0303\u000a\u0045\u000c\u0045\u000e\u0045\u0306\u000b\u0045\u0003\u0045\u0003\u0045\u0003\u0045\u0002\u0003\u003a\u0046\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0046\u0048\u004a\u004c\u004e\u0050\u0052\u0054\u0056\u0058\u005a\u005c\u005e\u0060\u0062\u0064\u0066\u0068\u006a\u006c\u006e\u0070\u0072\u0074\u0076\u0078\u007a\u007c\u007e\u0080\u0082\u0084\u0086\u0088\u0002\u0006\u0003\u0002\u0037\u0039\u0003\u0002\u0031\u0034\u0003\u0002\u0031\u0032\u0003\u0002\u0017\u001d\u0002\u0340\u0002\u008b\u0003\u0002\u0002\u0002\u0004\u009c\u0003\u0002\u0002\u0002\u0006\u009e\u0003\u0002\u0002\u0002\u0008\u00a6\u0003\u0002\u0002\u0002\u000a\u00af\u0003\u0002\u0002\u0002\u000c\u00b8\u0003\u0002\u0002\u0002\u000e\u00ba\u0003\u0002\u0002\u0002\u0010\u00bc\u0003\u0002\u0002\u0002\u0012\u00be\u0003\u0002\u0002\u0002\u0014\u00c6\u0003\u0002\u0002\u0002\u0016\u00c9\u0003\u0002\u0002\u0002\u0018\u00d6\u0003\u0002\u0002\u0002\u001a\u00d8\u0003\u0002\u0002\u0002\u001c\u00db\u0003\u0002\u0002\u0002\u001e\u00e0\u0003\u0002\u0002\u0002\u0020\u0110\u0003\u0002\u0002\u0002\u0022\u0118\u0003\u0002\u0002\u0002\u0024\u011a\u0003\u0002\u0002\u0002\u0026\u0122\u0003\u0002\u0002\u0002\u0028\u0128\u0003\u0002\u0002\u0002\u002a\u0136\u0003\u0002\u0002\u0002\u002c\u013e\u0003\u0002\u0002\u0002\u002e\u0146\u0003\u0002\u0002\u0002\u0030\u0150\u0003\u0002\u0002\u0002\u0032\u015e\u0003\u0002\u0002\u0002\u0034\u0162\u0003\u0002\u0002\u0002\u0036\u016c\u0003\u0002\u0002\u0002\u0038\u016e\u0003\u0002\u0002\u0002\u003a\u018c\u0003\u0002\u0002\u0002\u003c\u01b0\u0003\u0002\u0002\u0002\u003e\u01b4\u0003\u0002\u0002\u0002\u0040\u01cd\u0003\u0002\u0002\u0002\u0042\u01cf\u0003\u0002\u0002\u0002\u0044\u01d7\u0003\u0002\u0002\u0002\u0046\u01dd\u0003\u0002\u0002\u0002\u0048\u01e8\u0003\u0002\u0002\u0002\u004a\u01f1\u0003\u0002\u0002\u0002\u004c\u0206\u0003\u0002\u0002\u0002\u004e\u022a\u0003\u0002\u0002\u0002\u0050\u0231\u0003\u0002\u0002\u0002\u0052\u0233\u0003\u0002\u0002\u0002\u0054\u023f\u0003\u0002\u0002\u0002\u0056\u0241\u0003\u0002\u0002\u0002\u0058\u0245\u0003\u0002\u0002\u0002\u005a\u024c\u0003\u0002\u0002\u0002\u005c\u0250\u0003\u0002\u0002\u0002\u005e\u0254\u0003\u0002\u0002\u0002\u0060\u0256\u0003\u0002\u0002\u0002\u0062\u025d\u0003\u0002\u0002\u0002\u0064\u0270\u0003\u0002\u0002\u0002\u0066\u0273\u0003\u0002\u0002\u0002\u0068\u0281\u0003\u0002\u0002\u0002\u006a\u028f\u0003\u0002\u0002\u0002\u006c\u02a0\u0003\u0002\u0002\u0002\u006e\u02a2\u0003\u0002\u0002\u0002\u0070\u02aa\u0003\u0002\u0002\u0002\u0072\u02b0\u0003\u0002\u0002\u0002\u0074\u02be\u0003\u0002\u0002\u0002\u0076\u02d1\u0003\u0002\u0002\u0002\u0078\u02d3\u0003\u0002\u0002\u0002\u007a\u02d5\u0003\u0002\u0002\u0002\u007c\u02d9\u0003\u0002\u0002\u0002\u007e\u02ed\u0003\u0002\u0002\u0002\u0080\u02ef\u0003\u0002\u0002\u0002\u0082\u02f2\u0003\u0002\u0002\u0002\u0084\u02f4\u0003\u0002\u0002\u0002\u0086\u02fb\u0003\u0002\u0002\u0002\u0088\u0300\u0003\u0002\u0002\u0002\u008a\u008c\u0005\u0014\u000b\u0002\u008b\u008a\u0003\u0002\u0002\u0002\u008b\u008c\u0003\u0002\u0002\u0002\u008c\u0090\u0003\u0002\u0002\u0002\u008d\u008f\u0005\u0006\u0004\u0002\u008e\u008d\u0003\u0002\u0002\u0002\u008f\u0092\u0003\u0002\u0002\u0002\u0090\u008e\u0003\u0002\u0002\u0002\u0090\u0091\u0003\u0002\u0002\u0002\u0091\u0097\u0003\u0002\u0002\u0002\u0092\u0090\u0003\u0002\u0002\u0002\u0093\u0096\u0005\u0004\u0003\u0002\u0094\u0096\u0005\u0084\u0043\u0002\u0095\u0093\u0003\u0002\u0002\u0002\u0095\u0094\u0003\u0002\u0002\u0002\u0096\u0099\u0003\u0002\u0002\u0002\u0097\u0095\u0003\u0002\u0002\u0002\u0097\u0098\u0003\u0002\u0002\u0002\u0098\u0003\u0003\u0002\u0002\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u009a\u009d\u0005\u0036\u001c\u0002\u009b\u009d\u0005\u005e\u0030\u0002\u009c\u009a\u0003\u0002\u0002\u0002\u009c\u009b\u0003\u0002\u0002\u0002\u009d\u0005\u0003\u0002\u0002\u0002\u009e\u009f\u0007\u000c\u0002\u0002\u009f\u00a1\u0005\u0012\u000a\u0002\u00a0\u00a2\u0005\u0010\u0009\u0002\u00a1\u00a0\u0003\u0002\u0002\u0002\u00a1\u00a2\u0003\u0002\u0002\u0002\u00a2\u00a4\u0003\u0002\u0002\u0002\u00a3\u00a5\u0005\u0008\u0005\u0002\u00a4\u00a3\u0003\u0002\u0002\u0002\u00a4\u00a5\u0003\u0002\u0002\u0002\u00a5\u0007\u0003\u0002\u0002\u0002\u00a6\u00aa\u0007\u0026\u0002\u0002\u00a7\u00a9\u0005\u000a\u0006\u0002\u00a8\u00a7\u0003\u0002\u0002\u0002\u00a9\u00ac\u0003\u0002\u0002\u0002\u00aa\u00a8\u0003\u0002\u0002\u0002\u00aa\u00ab\u0003\u0002\u0002\u0002\u00ab\u00ad\u0003\u0002\u0002\u0002\u00ac\u00aa\u0003\u0002\u0002\u0002\u00ad\u00ae\u0007\u0027\u0002\u0002\u00ae\u0009\u0003\u0002\u0002\u0002\u00af\u00b2\u0007\u0035\u0002\u0002\u00b0\u00b1\u0007\u002f\u0002\u0002\u00b1\u00b3\u0005\u000c\u0007\u0002\u00b2\u00b0\u0003\u0002\u0002\u0002\u00b2\u00b3\u0003\u0002\u0002\u0002\u00b3\u00b6\u0003\u0002\u0002\u0002\u00b4\u00b5\u0007\u002a\u0002\u0002\u00b5\u00b7\u0005\u000e\u0008\u0002\u00b6\u00b4\u0003\u0002\u0002\u0002\u00b6\u00b7\u0003\u0002\u0002\u0002\u00b7\u000b\u0003\u0002\u0002\u0002\u00b8\u00b9\u0007\u0035\u0002\u0002\u00b9\u000d\u0003\u0002\u0002\u0002\u00ba\u00bb\u0005\u0074\u003b\u0002\u00bb\u000f\u0003\u0002\u0002\u0002\u00bc\u00bd\u0007\u003a\u0002\u0002\u00bd\u0011\u0003\u0002\u0002\u0002\u00be\u00c3\u0007\u0035\u0002\u0002\u00bf\u00c0\u0007\u0021\u0002\u0002\u00c0\u00c2\u0007\u0035\u0002\u0002\u00c1\u00bf\u0003\u0002\u0002\u0002\u00c2\u00c5\u0003\u0002\u0002\u0002\u00c3\u00c1\u0003\u0002\u0002\u0002\u00c3\u00c4\u0003\u0002\u0002\u0002\u00c4\u0013\u0003\u0002\u0002\u0002\u00c5\u00c3\u0003\u0002\u0002\u0002\u00c6\u00c7\u0007\u000a\u0002\u0002\u00c7\u00c8\u0005\u0012\u000a\u0002\u00c8\u0015\u0003\u0002\u0002\u0002\u00c9\u00ca\u0007\u0008\u0002\u0002\u00ca\u00ce\u0007\u0026\u0002\u0002\u00cb\u00cd\u0005\u0018\u000d\u0002\u00cc\u00cb\u0003\u0002\u0002\u0002\u00cd\u00d0\u0003\u0002\u0002\u0002\u00ce\u00cc\u0003\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00cf\u00d1\u0003\u0002\u0002\u0002\u00d0\u00ce\u0003\u0002\u0002\u0002\u00d1\u00d2\u0007\u0027\u0002\u0002\u00d2\u0017\u0003\u0002\u0002\u0002\u00d3\u00d7\u0005\u001c\u000f\u0002\u00d4\u00d7\u0005\u003a\u001e\u0002\u00d5\u00d7\u0005\u001a\u000e\u0002\u00d6\u00d3\u0003\u0002\u0002\u0002\u00d6\u00d4\u0003\u0002\u0002\u0002\u00d6\u00d5\u0003\u0002\u0002\u0002\u00d7\u0019\u0003\u0002\u0002\u0002\u00d8\u00d9\u0007\u000f\u0002\u0002\u00d9\u00da\u0005\u003a\u001e\u0002\u00da\u001b\u0003\u0002\u0002\u0002\u00db\u00dc\u0005\u003a\u001e\u0002\u00dc\u00dd\u0007\u001f\u0002\u0002\u00dd\u00de\u0005\u003a\u001e\u0002\u00de\u001d\u0003\u0002\u0002\u0002\u00df\u00e1\u0005\u0088\u0045\u0002\u00e0\u00df\u0003\u0002\u0002\u0002\u00e0\u00e1\u0003\u0002\u0002\u0002\u00e1\u00e2\u0003\u0002\u0002\u0002\u00e2\u00e3\u0007\u0007\u0002\u0002\u00e3\u00e5\u0007\u0035\u0002\u0002\u00e4\u00e6\u0005\u0032\u001a\u0002\u00e5\u00e4\u0003\u0002\u0002\u0002\u00e5\u00e6\u0003\u0002\u0002\u0002\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u00e8\u0005\u0020\u0011\u0002\u00e8\u001f\u0003\u0002\u0002\u0002\u00e9\u00ea\u0007\u0026\u0002\u0002\u00ea\u00ee\u0005\u0022\u0012\u0002\u00eb\u00ed\u0005\u005e\u0030\u0002\u00ec\u00eb\u0003\u0002\u0002\u0002\u00ed\u00f0\u0003\u0002\u0002\u0002\u00ee\u00ec\u0003\u0002\u0002\u0002\u00ee\u00ef\u0003\u0002\u0002\u0002\u00ef\u00f4\u0003\u0002\u0002\u0002\u00f0\u00ee\u0003\u0002\u0002\u0002\u00f1\u00f3\u0005\u0028\u0015\u0002\u00f2\u00f1\u0003\u0002\u0002\u0002\u00f3\u00f6\u0003\u0002\u0002\u0002\u00f4\u00f2\u0003\u0002\u0002\u0002\u00f4\u00f5\u0003\u0002\u0002\u0002\u00f5\u00f8\u0003\u0002\u0002\u0002\u00f6\u00f4\u0003\u0002\u0002\u0002\u00f7\u00f9\u0005\u002a\u0016\u0002\u00f8\u00f7\u0003\u0002\u0002\u0002\u00f8\u00f9\u0003\u0002\u0002\u0002\u00f9\u00fd\u0003\u0002\u0002\u0002\u00fa\u00fc\u0005\u002c\u0017\u0002\u00fb\u00fa\u0003\u0002\u0002\u0002\u00fc\u00ff\u0003\u0002\u0002\u0002\u00fd\u00fb\u0003\u0002\u0002\u0002\u00fd\u00fe\u0003\u0002\u0002\u0002\u00fe\u0100\u0003\u0002\u0002\u0002\u00ff\u00fd\u0003\u0002\u0002\u0002\u0100\u0101\u0007\u0027\u0002\u0002\u0101\u0111\u0003\u0002\u0002\u0002\u0102\u0106\u0007\u0026\u0002\u0002\u0103\u0105\u0005\u0028\u0015\u0002\u0104\u0103\u0003\u0002\u0002\u0002\u0105\u0108\u0003\u0002\u0002\u0002\u0106\u0104\u0003\u0002\u0002\u0002\u0106\u0107\u0003\u0002\u0002\u0002\u0107\u010c\u0003\u0002\u0002\u0002\u0108\u0106\u0003\u0002\u0002\u0002\u0109\u010b\u0005\u002c\u0017\u0002\u010a\u0109\u0003\u0002\u0002\u0002\u010b\u010e\u0003\u0002\u0002\u0002\u010c\u010a\u0003\u0002\u0002\u0002\u010c\u010d\u0003\u0002\u0002\u0002\u010d\u010f\u0003\u0002\u0002\u0002\u010e\u010c\u0003\u0002\u0002\u0002\u010f\u0111\u0007\u0027\u0002\u0002\u0110\u00e9\u0003\u0002\u0002\u0002\u0110\u0102\u0003\u0002\u0002\u0002\u0111\u0021\u0003\u0002\u0002\u0002\u0112\u0114\u0005\u0024\u0013\u0002\u0113\u0112\u0003\u0002\u0002\u0002\u0114\u0115\u0003\u0002\u0002\u0002\u0115\u0113\u0003\u0002\u0002\u0002\u0115\u0116\u0003\u0002\u0002\u0002\u0116\u0119\u0003\u0002\u0002\u0002\u0117\u0119\u0005\u0026\u0014\u0002\u0118\u0113\u0003\u0002\u0002\u0002\u0118\u0117\u0003\u0002\u0002\u0002\u0119\u0023\u0003\u0002\u0002\u0002\u011a\u011c\u0007\u0035\u0002\u0002\u011b\u011d\u0005\u0046\u0024\u0002\u011c\u011b\u0003\u0002\u0002\u0002\u011c\u011d\u0003\u0002\u0002\u0002\u011d\u011f\u0003\u0002\u0002\u0002\u011e\u0120\u0005\u0016\u000c\u0002\u011f\u011e\u0003\u0002\u0002\u0002\u011f\u0120\u0003\u0002\u0002\u0002\u0120\u0025\u0003\u0002\u0002\u0002\u0121\u0123\u0005\u0046\u0024\u0002\u0122\u0121\u0003\u0002\u0002\u0002\u0122\u0123\u0003\u0002\u0002\u0002\u0123\u0125\u0003\u0002\u0002\u0002\u0124\u0126\u0005\u0016\u000c\u0002\u0125\u0124\u0003\u0002\u0002\u0002\u0125\u0126\u0003\u0002\u0002\u0002\u0126\u0027\u0003\u0002\u0002\u0002\u0127\u0129\u0005\u0088\u0045\u0002\u0128\u0127\u0003\u0002\u0002\u0002\u0128\u0129\u0003\u0002\u0002\u0002\u0129\u012a\u0003\u0002\u0002\u0002\u012a\u012c\u0007\u0035\u0002\u0002\u012b\u012d\u0005\u0032\u001a\u0002\u012c\u012b\u0003\u0002\u0002\u0002\u012c\u012d\u0003\u0002\u0002\u0002\u012d\u012f\u0003\u0002\u0002\u0002\u012e\u0130\u0005\u0046\u0024\u0002\u012f\u012e\u0003\u0002\u0002\u0002\u012f\u0130\u0003\u0002\u0002\u0002\u0130\u0131\u0003\u0002\u0002\u0002\u0131\u0134\u0005\u0074\u003b\u0002\u0132\u0133\u0007\u001f\u0002\u0002\u0133\u0135\u0005\u003a\u001e\u0002\u0134\u0132\u0003\u0002\u0002\u0002\u0134\u0135\u0003\u0002\u0002\u0002\u0135\u0029\u0003\u0002\u0002\u0002\u0136\u0138\u0007\u000e\u0002\u0002\u0137\u0139\u0005\u0032\u001a\u0002\u0138\u0137\u0003\u0002\u0002\u0002\u0138\u0139\u0003\u0002\u0002\u0002\u0139\u013a\u0003\u0002\u0002\u0002\u013a\u013c\u0005\u0074\u003b\u0002\u013b\u013d\u0005\u002e\u0018\u0002\u013c\u013b\u0003\u0002\u0002\u0002\u013c\u013d\u0003\u0002\u0002\u0002\u013d\u002b\u0003\u0002\u0002\u0002\u013e\u0140\u0007\u000d\u0002\u0002\u013f\u0141\u0005\u0032\u001a\u0002\u0140\u013f\u0003\u0002\u0002\u0002\u0140\u0141\u0003\u0002\u0002\u0002\u0141\u0142\u0003\u0002\u0002\u0002\u0142\u0144\u0005\u0074\u003b\u0002\u0143\u0145\u0005\u002e\u0018\u0002\u0144\u0143\u0003\u0002\u0002\u0002\u0144\u0145\u0003\u0002\u0002\u0002\u0145\u002d\u0003\u0002\u0002\u0002\u0146\u014a\u0007\u0026\u0002\u0002\u0147\u0149\u0005\u0030\u0019\u0002\u0148\u0147\u0003\u0002\u0002\u0002\u0149\u014c\u0003\u0002\u0002\u0002\u014a\u0148\u0003\u0002\u0002\u0002\u014a\u014b\u0003\u0002\u0002\u0002\u014b\u014d\u0003\u0002\u0002\u0002\u014c\u014a\u0003\u0002\u0002\u0002\u014d\u014e\u0007\u0027\u0002\u0002\u014e\u002f\u0003\u0002\u0002\u0002\u014f\u0151\u0005\u0088\u0045\u0002\u0150\u014f\u0003\u0002\u0002\u0002\u0150\u0151\u0003\u0002\u0002\u0002\u0151\u0152\u0003\u0002\u0002\u0002\u0152\u0154\u0007\u0035\u0002\u0002\u0153\u0155\u0005\u0032\u001a\u0002\u0154\u0153\u0003\u0002\u0002\u0002\u0154\u0155\u0003\u0002\u0002\u0002\u0155\u0157\u0003\u0002\u0002\u0002\u0156\u0158\u0005\u0046\u0024\u0002\u0157\u0156\u0003\u0002\u0002\u0002\u0157\u0158\u0003\u0002\u0002\u0002\u0158\u0159\u0003\u0002\u0002\u0002\u0159\u015a\u0005\u0074\u003b\u0002\u015a\u015b\u0007\u001f\u0002\u0002\u015b\u015c\u0005\u003a\u001e\u0002\u015c\u0031\u0003\u0002\u0002\u0002\u015d\u015f\u0005\u0034\u001b\u0002\u015e\u015d\u0003\u0002\u0002\u0002\u015f\u0160\u0003\u0002\u0002\u0002\u0160\u015e\u0003\u0002\u0002\u0002\u0160\u0161\u0003\u0002\u0002\u0002\u0161\u0033\u0003\u0002\u0002\u0002\u0162\u0167\u0007\u0035\u0002\u0002\u0163\u0164\u0007\u0029\u0002\u0002\u0164\u0166\u0005\u0074\u003b\u0002\u0165\u0163\u0003\u0002\u0002\u0002\u0166\u0169\u0003\u0002\u0002\u0002\u0167\u0165\u0003\u0002\u0002\u0002\u0167\u0168\u0003\u0002\u0002\u0002\u0168\u0035\u0003\u0002\u0002\u0002\u0169\u0167\u0003\u0002\u0002\u0002\u016a\u016d\u0005\u0064\u0033\u0002\u016b\u016d\u0005\u001e\u0010\u0002\u016c\u016a\u0003\u0002\u0002\u0002\u016c\u016b\u0003\u0002\u0002\u0002\u016d\u0037\u0003\u0002\u0002\u0002\u016e\u016f\u0009\u0002\u0002\u0002\u016f\u0039\u0003\u0002\u0002\u0002\u0170\u0171\u0008\u001e\u0001\u0002\u0171\u018d\u0005\u0038\u001d\u0002\u0172\u018d\u0007\u001e\u0002\u0002\u0173\u0174\u0007\u0028\u0002\u0002\u0174\u018d\u0007\u0035\u0002\u0002\u0175\u0176\u0007\u002d\u0002\u0002\u0176\u018d\u0005\u003c\u001f\u0002\u0177\u0179\u0005\u003c\u001f\u0002\u0178\u017a\u0005\u004e\u0028\u0002\u0179\u0178\u0003\u0002\u0002\u0002\u0179\u017a\u0003\u0002\u0002\u0002\u017a\u018d\u0003\u0002\u0002\u0002\u017b\u017c\u0007\u0016\u0002\u0002\u017c\u017e\u0005\u003c\u001f\u0002\u017d\u017f\u0005\u004e\u0028\u0002\u017e\u017d\u0003\u0002\u0002\u0002\u017e\u017f\u0003\u0002\u0002\u0002\u017f\u018d\u0003\u0002\u0002\u0002\u0180\u0181\u0007\u002f\u0002\u0002\u0181\u018d\u0005\u003c\u001f\u0002\u0182\u018d\u0005\u0040\u0021\u0002\u0183\u0184\u0005\u005c\u002f\u0002\u0184\u0185\u0005\u003a\u001e\u0007\u0185\u018d\u0003\u0002\u0002\u0002\u0186\u018d\u0005\u0016\u000c\u0002\u0187\u018d\u0005\u006e\u0038\u0002\u0188\u0189\u0007\u0022\u0002\u0002\u0189\u018a\u0005\u003a\u001e\u0002\u018a\u018b\u0007\u0023\u0002\u0002\u018b\u018d\u0003\u0002\u0002\u0002\u018c\u0170\u0003\u0002\u0002\u0002\u018c\u0172\u0003\u0002\u0002\u0002\u018c\u0173\u0003\u0002\u0002\u0002\u018c\u0175\u0003\u0002\u0002\u0002\u018c\u0177\u0003\u0002\u0002\u0002\u018c\u017b\u0003\u0002\u0002\u0002\u018c\u0180\u0003\u0002\u0002\u0002\u018c\u0182\u0003\u0002\u0002\u0002\u018c\u0183\u0003\u0002\u0002\u0002\u018c\u0186\u0003\u0002\u0002\u0002\u018c\u0187\u0003\u0002\u0002\u0002\u018c\u0188\u0003\u0002\u0002\u0002\u018d\u01aa\u0003\u0002\u0002\u0002\u018e\u018f\u000c\u000b\u0002\u0002\u018f\u0190\u0007\u0014\u0002\u0002\u0190\u01a9\u0005\u003a\u001e\u000c\u0191\u0192\u000c\u000a\u0002\u0002\u0192\u0193\u0007\u0030\u0002\u0002\u0193\u01a9\u0005\u003a\u001e\u000b\u0194\u0195\u000c\u0006\u0002\u0002\u0195\u0196\u0005\u005a\u002e\u0002\u0196\u0197\u0005\u003a\u001e\u0007\u0197\u01a9\u0003\u0002\u0002\u0002\u0198\u0199\u000c\u000f\u0002\u0002\u0199\u019a\u0007\u002c\u0002\u0002\u019a\u01a9\u0007\u0035\u0002\u0002\u019b\u019c\u000c\u000e\u0002\u0002\u019c\u019d\u0007\u002b\u0002\u0002\u019d\u019f\u0007\u0035\u0002\u0002\u019e\u01a0\u0005\u004e\u0028\u0002\u019f\u019e\u0003\u0002\u0002\u0002\u019f\u01a0\u0003\u0002\u0002\u0002\u01a0\u01a9\u0003\u0002\u0002\u0002\u01a1\u01a2\u000c\u000d\u0002\u0002\u01a2\u01a3\u0007\u002e\u0002\u0002\u01a3\u01a9\u0007\u0035\u0002\u0002\u01a4\u01a5\u000c\u000c\u0002\u0002\u01a5\u01a9\u0005\u0052\u002a\u0002\u01a6\u01a7\u000c\u0008\u0002\u0002\u01a7\u01a9\u0005\u003e\u0020\u0002\u01a8\u018e\u0003\u0002\u0002\u0002\u01a8\u0191\u0003\u0002\u0002\u0002\u01a8\u0194\u0003\u0002\u0002\u0002\u01a8\u0198\u0003\u0002\u0002\u0002\u01a8\u019b\u0003\u0002\u0002\u0002\u01a8\u01a1\u0003\u0002\u0002\u0002\u01a8\u01a4\u0003\u0002\u0002\u0002\u01a8\u01a6\u0003\u0002\u0002\u0002\u01a9\u01ac\u0003\u0002\u0002\u0002\u01aa\u01a8\u0003\u0002\u0002\u0002\u01aa\u01ab\u0003\u0002\u0002\u0002\u01ab\u003b\u0003\u0002\u0002\u0002\u01ac\u01aa\u0003\u0002\u0002\u0002\u01ad\u01ae\u0005\u0012\u000a\u0002\u01ae\u01af\u0007\u0021\u0002\u0002\u01af\u01b1\u0003\u0002\u0002\u0002\u01b0\u01ad\u0003\u0002\u0002\u0002\u01b0\u01b1\u0003\u0002\u0002\u0002\u01b1\u01b2\u0003\u0002\u0002\u0002\u01b2\u01b3\u0005\u0054\u002b\u0002\u01b3\u003d\u0003\u0002\u0002\u0002\u01b4\u01b5\u0007\u002a\u0002\u0002\u01b5\u01b6\u0005\u0074\u003b\u0002\u01b6\u003f\u0003\u0002\u0002\u0002\u01b7\u01b8\u0007\u0014\u0002\u0002\u01b8\u01b9\u0007\u0022\u0002\u0002\u01b9\u01ba\u0005\u003a\u001e\u0002\u01ba\u01bb\u0007\u0023\u0002\u0002\u01bb\u01bc\u0005\u003a\u001e\u0002\u01bc\u01bd\u0007\u0015\u0002\u0002\u01bd\u01be\u0005\u003a\u001e\u0002\u01be\u01ce\u0003\u0002\u0002\u0002\u01bf\u01c0\u0007\u0014\u0002\u0002\u01c0\u01c1\u0007\u0022\u0002\u0002\u01c1\u01c4\u0005\u003a\u001e\u0002\u01c2\u01c3\u0007\u002f\u0002\u0002\u01c3\u01c5\u0007\u0035\u0002\u0002\u01c4\u01c2\u0003\u0002\u0002\u0002\u01c4\u01c5\u0003\u0002\u0002\u0002\u01c5\u01c6\u0003\u0002\u0002\u0002\u01c6\u01c7\u0007\u0028\u0002\u0002\u01c7\u01c8\u0005\u003a\u001e\u0002\u01c8\u01c9\u0007\u0023\u0002\u0002\u01c9\u01ca\u0005\u003a\u001e\u0002\u01ca\u01cb\u0007\u0015\u0002\u0002\u01cb\u01cc\u0005\u003a\u001e\u0002\u01cc\u01ce\u0003\u0002\u0002\u0002\u01cd\u01b7\u0003\u0002\u0002\u0002\u01cd\u01bf\u0003\u0002\u0002\u0002\u01ce\u0041\u0003\u0002\u0002\u0002\u01cf\u01d1\u0007\u0035\u0002\u0002\u01d0\u01d2\u0007\u0020\u0002\u0002\u01d1\u01d0\u0003\u0002\u0002\u0002\u01d1\u01d2\u0003\u0002\u0002\u0002\u01d2\u01d3\u0003\u0002\u0002\u0002\u01d3\u01d4\u0007\u0029\u0002\u0002\u01d4\u01d5\u0005\u0074\u003b\u0002\u01d5\u0043\u0003\u0002\u0002\u0002\u01d6\u01d8\u0005\u004a\u0026\u0002\u01d7\u01d6\u0003\u0002\u0002\u0002\u01d7\u01d8\u0003\u0002\u0002\u0002\u01d8\u01d9\u0003\u0002\u0002\u0002\u01d9\u01da\u0005\u003a\u001e\u0002\u01da\u01db\u0007\u0029\u0002\u0002\u01db\u01dc\u0005\u0074\u003b\u0002\u01dc\u0045\u0003\u0002\u0002\u0002\u01dd\u01e1\u0007\u0022\u0002\u0002\u01de\u01e0\u0005\u0042\u0022\u0002\u01df\u01de\u0003\u0002\u0002\u0002\u01e0\u01e3\u0003\u0002\u0002\u0002\u01e1\u01df\u0003\u0002\u0002\u0002\u01e1\u01e2\u0003\u0002\u0002\u0002\u01e2\u01e4\u0003\u0002\u0002\u0002\u01e3\u01e1\u0003\u0002\u0002\u0002\u01e4\u01e6\u0007\u0023\u0002\u0002\u01e5\u01e7\u0005\u0048\u0025\u0002\u01e6\u01e5\u0003\u0002\u0002\u0002\u01e6\u01e7\u0003\u0002\u0002\u0002\u01e7\u0047\u0003\u0002\u0002\u0002\u01e8\u01e9\u0007\u0013\u0002\u0002\u01e9\u01eb\u0007\u0022\u0002\u0002\u01ea\u01ec\u0005\u0044\u0023\u0002\u01eb\u01ea\u0003\u0002\u0002\u0002\u01ec\u01ed\u0003\u0002\u0002\u0002\u01ed\u01eb\u0003\u0002\u0002\u0002\u01ed\u01ee\u0003\u0002\u0002\u0002\u01ee\u01ef\u0003\u0002\u0002\u0002\u01ef\u01f0\u0007\u0023\u0002\u0002\u01f0\u0049\u0003\u0002\u0002\u0002\u01f1\u01f2\u0007\u0022\u0002\u0002\u01f2\u01f3\u0007\u0035\u0002\u0002\u01f3\u01f4\u0007\u0029\u0002\u0002\u01f4\u01f5\u0007\u0023\u0002\u0002\u01f5\u004b\u0003\u0002\u0002\u0002\u01f6\u01f7\u0007\u0035\u0002\u0002\u01f7\u01f9\u0007\u001f\u0002\u0002\u01f8\u01f6\u0003\u0002\u0002\u0002\u01f8\u01f9\u0003\u0002\u0002\u0002\u01f9\u01fa\u0003\u0002\u0002\u0002\u01fa\u0207\u0005\u003a\u001e\u0002\u01fb\u01fd\u0007\u0035\u0002\u0002\u01fc\u01fb\u0003\u0002\u0002\u0002\u01fc\u01fd\u0003\u0002\u0002\u0002\u01fd\u01fe\u0003\u0002\u0002\u0002\u01fe\u0202\u0007\u0026\u0002\u0002\u01ff\u0201\u0005\u003a\u001e\u0002\u0200\u01ff\u0003\u0002\u0002\u0002\u0201\u0204\u0003\u0002\u0002\u0002\u0202\u0200\u0003\u0002\u0002\u0002\u0202\u0203\u0003\u0002\u0002\u0002\u0203\u0205\u0003\u0002\u0002\u0002\u0204\u0202\u0003\u0002\u0002\u0002\u0205\u0207\u0007\u0027\u0002\u0002\u0206\u01f8\u0003\u0002\u0002\u0002\u0206\u01fc\u0003\u0002\u0002\u0002\u0207\u004d\u0003\u0002\u0002\u0002\u0208\u0210\u0007\u0022\u0002\u0002\u0209\u020b\u0005\u0074\u003b\u0002\u020a\u0209\u0003\u0002\u0002\u0002\u020b\u020c\u0003\u0002\u0002\u0002\u020c\u020a\u0003\u0002\u0002\u0002\u020c\u020d\u0003\u0002\u0002\u0002\u020d\u020e\u0003\u0002\u0002\u0002\u020e\u020f\u0007\u0029\u0002\u0002\u020f\u0211\u0003\u0002\u0002\u0002\u0210\u020a\u0003\u0002\u0002\u0002\u0210\u0211\u0003\u0002\u0002\u0002\u0211\u0215\u0003\u0002\u0002\u0002\u0212\u0214\u0005\u004c\u0027\u0002\u0213\u0212\u0003\u0002\u0002\u0002\u0214\u0217\u0003\u0002\u0002\u0002\u0215\u0213\u0003\u0002\u0002\u0002\u0215\u0216\u0003\u0002\u0002\u0002\u0216\u0218\u0003\u0002\u0002\u0002\u0217\u0215\u0003\u0002\u0002\u0002\u0218\u022b\u0007\u0023\u0002\u0002\u0219\u0221\u0007\u0026\u0002\u0002\u021a\u021c\u0005\u0074\u003b\u0002\u021b\u021a\u0003\u0002\u0002\u0002\u021c\u021d\u0003\u0002\u0002\u0002\u021d\u021b\u0003\u0002\u0002\u0002\u021d\u021e\u0003\u0002\u0002\u0002\u021e\u021f\u0003\u0002\u0002\u0002\u021f\u0220\u0007\u0029\u0002\u0002\u0220\u0222\u0003\u0002\u0002\u0002\u0221\u021b\u0003\u0002\u0002\u0002\u0221\u0222\u0003\u0002\u0002\u0002\u0222\u0226\u0003\u0002\u0002\u0002\u0223\u0225\u0005\u003a\u001e\u0002\u0224\u0223\u0003\u0002\u0002\u0002\u0225\u0228\u0003\u0002\u0002\u0002\u0226\u0224\u0003\u0002\u0002\u0002\u0226\u0227\u0003\u0002\u0002\u0002\u0227\u0229\u0003\u0002\u0002\u0002\u0228\u0226\u0003\u0002\u0002\u0002\u0229\u022b\u0007\u0027\u0002\u0002\u022a\u0208\u0003\u0002\u0002\u0002\u022a\u0219\u0003\u0002\u0002\u0002\u022b\u004f\u0003\u0002\u0002\u0002\u022c\u0232\u0005\u003a\u001e\u0002\u022d\u022e\u0007\u0026\u0002\u0002\u022e\u022f\u0005\u003a\u001e\u0002\u022f\u0230\u0007\u0027\u0002\u0002\u0230\u0232\u0003\u0002\u0002\u0002\u0231\u022c\u0003\u0002\u0002\u0002\u0231\u022d\u0003\u0002\u0002\u0002\u0232\u0051\u0003\u0002\u0002\u0002\u0233\u0237\u0007\u0024\u0002\u0002\u0234\u0236\u0005\u0050\u0029\u0002\u0235\u0234\u0003\u0002\u0002\u0002\u0236\u0239\u0003\u0002\u0002\u0002\u0237\u0235\u0003\u0002\u0002\u0002\u0237\u0238\u0003\u0002\u0002\u0002\u0238\u023a\u0003\u0002\u0002\u0002\u0239\u0237\u0003\u0002\u0002\u0002\u023a\u023b\u0007\u0025\u0002\u0002\u023b\u0053\u0003\u0002\u0002\u0002\u023c\u0240\u0007\u0035\u0002\u0002\u023d\u0240\u0005\u0056\u002c\u0002\u023e\u0240\u0005\u0058\u002d\u0002\u023f\u023c\u0003\u0002\u0002\u0002\u023f\u023d\u0003\u0002\u0002\u0002\u023f\u023e\u0003\u0002\u0002\u0002\u0240\u0055\u0003\u0002\u0002\u0002\u0241\u0242\u0007\u0024\u0002\u0002\u0242\u0243\u0007\u0036\u0002\u0002\u0243\u0244\u0007\u0025\u0002\u0002\u0244\u0057\u0003\u0002\u0002\u0002\u0245\u0246\u0007\u0024\u0002\u0002\u0246\u0247\u0007\u0029\u0002\u0002\u0247\u0248\u0007\u0036\u0002\u0002\u0248\u0249\u0007\u0025\u0002\u0002\u0249\u0059\u0003\u0002\u0002\u0002\u024a\u024d\u0007\u0036\u0002\u0002\u024b\u024d\u0009\u0003\u0002\u0002\u024c\u024a\u0003\u0002\u0002\u0002\u024c\u024b\u0003\u0002\u0002\u0002\u024d\u005b\u0003\u0002\u0002\u0002\u024e\u0251\u0007\u0036\u0002\u0002\u024f\u0251\u0009\u0004\u0002\u0002\u0250\u024e\u0003\u0002\u0002\u0002\u0250\u024f\u0003\u0002\u0002\u0002\u0251\u005d\u0003\u0002\u0002\u0002\u0252\u0255\u0005\u0062\u0032\u0002\u0253\u0255\u0005\u0060\u0031\u0002\u0254\u0252\u0003\u0002\u0002\u0002\u0254\u0253\u0003\u0002\u0002\u0002\u0255\u005f\u0003\u0002\u0002\u0002\u0256\u0258\u0007\u0011\u0002\u0002\u0257\u0259\u0007\u0010\u0002\u0002\u0258\u0257\u0003\u0002\u0002\u0002\u0258\u0259\u0003\u0002\u0002\u0002\u0259\u025a\u0003\u0002\u0002\u0002\u025a\u025b\u0007\u0035\u0002\u0002\u025b\u025c\u0005\u0074\u003b\u0002\u025c\u0061\u0003\u0002\u0002\u0002\u025d\u025f\u0007\u0011\u0002\u0002\u025e\u0260\u0007\u0010\u0002\u0002\u025f\u025e\u0003\u0002\u0002\u0002\u025f\u0260\u0003\u0002\u0002\u0002\u0260\u0261\u0003\u0002\u0002\u0002\u0261\u0263\u0007\u0035\u0002\u0002\u0262\u0264\u0005\u0074\u003b\u0002\u0263\u0262\u0003\u0002\u0002\u0002\u0263\u0264\u0003\u0002\u0002\u0002\u0264\u0265\u0003\u0002\u0002\u0002\u0265\u0266\u0007\u001f\u0002\u0002\u0266\u0267\u0005\u003a\u001e\u0002\u0267\u0063\u0003\u0002\u0002\u0002\u0268\u026c\u0005\u0066\u0034\u0002\u0269\u026b\u0005\u006a\u0036\u0002\u026a\u0269\u0003\u0002\u0002\u0002\u026b\u026e\u0003\u0002\u0002\u0002\u026c\u026a\u0003\u0002\u0002\u0002\u026c\u026d\u0003\u0002\u0002\u0002\u026d\u0271\u0003\u0002\u0002\u0002\u026e\u026c\u0003\u0002\u0002\u0002\u026f\u0271\u0005\u0068\u0035\u0002\u0270\u0268\u0003\u0002\u0002\u0002\u0270\u026f\u0003\u0002\u0002\u0002\u0271\u0065\u0003\u0002\u0002\u0002\u0272\u0274\u0005\u0088\u0045\u0002\u0273\u0272\u0003\u0002\u0002\u0002\u0273\u0274\u0003\u0002\u0002\u0002\u0274\u0275\u0003\u0002\u0002\u0002\u0275\u0277\u0005\u0054\u002b\u0002\u0276\u0278\u0005\u0032\u001a\u0002\u0277\u0276\u0003\u0002\u0002\u0002\u0277\u0278\u0003\u0002\u0002\u0002\u0278\u027a\u0003\u0002\u0002\u0002\u0279\u027b\u0005\u0046\u0024\u0002\u027a\u0279\u0003\u0002\u0002\u0002\u027a\u027b\u0003\u0002\u0002\u0002\u027b\u027c\u0003\u0002\u0002\u0002\u027c\u027d\u0005\u0074\u003b\u0002\u027d\u027e\u0007\u001f\u0002\u0002\u027e\u027f\u0005\u003a\u001e\u0002\u027f\u0067\u0003\u0002\u0002\u0002\u0280\u0282\u0005\u0088\u0045\u0002\u0281\u0280\u0003\u0002\u0002\u0002\u0281\u0282\u0003\u0002\u0002\u0002\u0282\u0283\u0003\u0002\u0002\u0002\u0283\u0285\u0005\u0054\u002b\u0002\u0284\u0286\u0005\u0032\u001a\u0002\u0285\u0284\u0003\u0002\u0002\u0002\u0285\u0286\u0003\u0002\u0002\u0002\u0286\u0288\u0003\u0002\u0002\u0002\u0287\u0289\u0005\u0046\u0024\u0002\u0288\u0287\u0003\u0002\u0002\u0002\u0288\u0289\u0003\u0002\u0002\u0002\u0289\u028a\u0003\u0002\u0002\u0002\u028a\u028b\u0007\u0009\u0002\u0002\u028b\u028d\u0005\u0074\u003b\u0002\u028c\u028e\u0005\u007e\u0040\u0002\u028d\u028c\u0003\u0002\u0002\u0002\u028d\u028e\u0003\u0002\u0002\u0002\u028e\u0069\u0003\u0002\u0002\u0002\u028f\u0291\u0007\u0012\u0002\u0002\u0290\u0292\u0007\u0035\u0002\u0002\u0291\u0290\u0003\u0002\u0002\u0002\u0291\u0292\u0003\u0002\u0002\u0002\u0292\u0293\u0003\u0002\u0002\u0002\u0293\u0295\u0007\u0022\u0002\u0002\u0294\u0296\u0005\u006c\u0037\u0002\u0295\u0294\u0003\u0002\u0002\u0002\u0296\u0297\u0003\u0002\u0002\u0002\u0297\u0295\u0003\u0002\u0002\u0002\u0297\u0298\u0003\u0002\u0002\u0002\u0298\u0299\u0003\u0002\u0002\u0002\u0299\u029a\u0007\u0023\u0002\u0002\u029a\u006b\u0003\u0002\u0002\u0002\u029b\u029c\u0005\u0074\u003b\u0002\u029c\u029d\u0005\u003a\u001e\u0002\u029d\u02a1\u0003\u0002\u0002\u0002\u029e\u029f\u0007\u002a\u0002\u0002\u029f\u02a1\u0007\u0035\u0002\u0002\u02a0\u029b\u0003\u0002\u0002\u0002\u02a0\u029e\u0003\u0002\u0002\u0002\u02a1\u006d\u0003\u0002\u0002\u0002\u02a2\u02a3\u0007\u0024\u0002\u0002\u02a3\u02a4\u0005\u0070\u0039\u0002\u02a4\u02a5\u0007\u0025\u0002\u0002\u02a5\u02a6\u0005\u003a\u001e\u0002\u02a6\u006f\u0003\u0002\u0002\u0002\u02a7\u02a9\u0005\u0042\u0022\u0002\u02a8\u02a7\u0003\u0002\u0002\u0002\u02a9\u02ac\u0003\u0002\u0002\u0002\u02aa\u02a8\u0003\u0002\u0002\u0002\u02aa\u02ab\u0003\u0002\u0002\u0002\u02ab\u02ae\u0003\u0002\u0002\u0002\u02ac\u02aa\u0003\u0002\u0002\u0002\u02ad\u02af\u0005\u0072\u003a\u0002\u02ae\u02ad\u0003\u0002\u0002\u0002\u02ae\u02af\u0003\u0002\u0002\u0002\u02af\u0071\u0003\u0002\u0002\u0002\u02b0\u02b2\u0007\u0013\u0002\u0002\u02b1\u02b3\u0005\u0044\u0023\u0002\u02b2\u02b1\u0003\u0002\u0002\u0002\u02b3\u02b4\u0003\u0002\u0002\u0002\u02b4\u02b2\u0003\u0002\u0002\u0002\u02b4\u02b5\u0003\u0002\u0002\u0002\u02b5\u0073\u0003\u0002\u0002\u0002\u02b6\u02b8\u0007\u0030\u0002\u0002\u02b7\u02b6\u0003\u0002\u0002\u0002\u02b7\u02b8\u0003\u0002\u0002\u0002\u02b8\u02b9\u0003\u0002\u0002\u0002\u02b9\u02bf\u0005\u007c\u003f\u0002\u02ba\u02bc\u0007\u0030\u0002\u0002\u02bb\u02ba\u0003\u0002\u0002\u0002\u02bb\u02bc\u0003\u0002\u0002\u0002\u02bc\u02bd\u0003\u0002\u0002\u0002\u02bd\u02bf\u0005\u0076\u003c\u0002\u02be\u02b7\u0003\u0002\u0002\u0002\u02be\u02bb\u0003\u0002\u0002\u0002\u02bf\u0075\u0003\u0002\u0002\u0002\u02c0\u02c1\u0005\u0012\u000a\u0002\u02c1\u02c2\u0007\u0021\u0002\u0002\u02c2\u02c4\u0003\u0002\u0002\u0002\u02c3\u02c0\u0003\u0002\u0002\u0002\u02c3\u02c4\u0003\u0002\u0002\u0002\u02c4\u02c5\u0003\u0002\u0002\u0002\u02c5\u02ce\u0007\u0035\u0002\u0002\u02c6\u02c8\u0007\u0022\u0002\u0002\u02c7\u02c9\u0005\u0074\u003b\u0002\u02c8\u02c7\u0003\u0002\u0002\u0002\u02c9\u02ca\u0003\u0002\u0002\u0002\u02ca\u02c8\u0003\u0002\u0002\u0002\u02ca\u02cb\u0003\u0002\u0002\u0002\u02cb\u02cc\u0003\u0002\u0002\u0002\u02cc\u02cd\u0007\u0023\u0002\u0002\u02cd\u02cf\u0003\u0002\u0002\u0002\u02ce\u02c6\u0003\u0002\u0002\u0002\u02ce\u02cf\u0003\u0002\u0002\u0002\u02cf\u02d2\u0003\u0002\u0002\u0002\u02d0\u02d2\u0005\u0078\u003d\u0002\u02d1\u02c3\u0003\u0002\u0002\u0002\u02d1\u02d0\u0003\u0002\u0002\u0002\u02d2\u0077\u0003\u0002\u0002\u0002\u02d3\u02d4\u0009\u0005\u0002\u0002\u02d4\u0079\u0003\u0002\u0002\u0002\u02d5\u02d7\u0005\u0074\u003b\u0002\u02d6\u02d8\u0007\u0020\u0002\u0002\u02d7\u02d6\u0003\u0002\u0002\u0002\u02d7\u02d8\u0003\u0002\u0002\u0002\u02d8\u007b\u0003\u0002\u0002\u0002\u02d9\u02dd\u0007\u0022\u0002\u0002\u02da\u02dc\u0005\u007a\u003e\u0002\u02db\u02da\u0003\u0002\u0002\u0002\u02dc\u02df\u0003\u0002\u0002\u0002\u02dd\u02db\u0003\u0002\u0002\u0002\u02dd\u02de\u0003\u0002\u0002\u0002\u02de\u02e0\u0003\u0002\u0002\u0002\u02df\u02dd\u0003\u0002\u0002\u0002\u02e0\u02e1\u0007\u0023\u0002\u0002\u02e1\u02e2\u0007\u0028\u0002\u0002\u02e2\u02e3\u0005\u0074\u003b\u0002\u02e3\u007d\u0003\u0002\u0002\u0002\u02e4\u02e8\u0007\u0026\u0002\u0002\u02e5\u02e7\u0005\u0080\u0041\u0002\u02e6\u02e5\u0003\u0002\u0002\u0002\u02e7\u02ea\u0003\u0002\u0002\u0002\u02e8\u02e6\u0003\u0002\u0002\u0002\u02e8\u02e9\u0003\u0002\u0002\u0002\u02e9\u02eb\u0003\u0002\u0002\u0002\u02ea\u02e8\u0003\u0002\u0002\u0002\u02eb\u02ee\u0007\u0027\u0002\u0002\u02ec\u02ee\u0007\u003a\u0002\u0002\u02ed\u02e4\u0003\u0002\u0002\u0002\u02ed\u02ec\u0003\u0002\u0002\u0002\u02ee\u007f\u0003\u0002\u0002\u0002\u02ef\u02f0\u0005\u0082\u0042\u0002\u02f0\u02f1\u0007\u003a\u0002\u0002\u02f1\u0081\u0003\u0002\u0002\u0002\u02f2\u02f3\u0007\u0035\u0002\u0002\u02f3\u0083\u0003\u0002\u0002\u0002\u02f4\u02f5\u0007\u0006\u0002\u0002\u02f5\u02f6\u0007\u0035\u0002\u0002\u02f6\u02f7\u0005\u0046\u0024\u0002\u02f7\u0085\u0003\u0002\u0002\u0002\u02f8\u02f9\u0005\u0012\u000a\u0002\u02f9\u02fa\u0007\u0021\u0002\u0002\u02fa\u02fc\u0003\u0002\u0002\u0002\u02fb\u02f8\u0003\u0002\u0002\u0002\u02fb\u02fc\u0003\u0002\u0002\u0002\u02fc\u02fd\u0003\u0002\u0002\u0002\u02fd\u02fe\u0007\u0035\u0002\u0002\u02fe\u02ff\u0005\u004e\u0028\u0002\u02ff\u0087\u0003\u0002\u0002\u0002\u0300\u0304\u0007\u0024\u0002\u0002\u0301\u0303\u0005\u0086\u0044\u0002\u0302\u0301\u0003\u0002\u0002\u0002\u0303\u0306\u0003\u0002\u0002\u0002\u0304\u0302\u0003\u0002\u0002\u0002\u0304\u0305\u0003\u0002\u0002\u0002\u0305\u0307\u0003\u0002\u0002\u0002\u0306\u0304\u0003\u0002\u0002\u0002\u0307\u0308\u0007\u0025\u0002\u0002\u0308\u0089\u0003\u0002\u0002\u0002\u006b\u008b\u0090\u0095\u0097\u009c\u00a1\u00a4\u00aa\u00b2\u00b6\u00c3\u00ce\u00d6\u00e0\u00e5\u00ee\u00f4\u00f8\u00fd\u0106\u010c\u0110\u0115\u0118\u011c\u011f\u0122\u0125\u0128\u012c\u012f\u0134\u0138\u013c\u0140\u0144\u014a\u0150\u0154\u0157\u0160\u0167\u016c\u0179\u017e\u018c\u019f\u01a8\u01aa\u01b0\u01c4\u01cd\u01d1\u01d7\u01e1\u01e6\u01ed\u01f8\u01fc\u0202\u0206\u020c\u0210\u0215\u021d\u0221\u0226\u022a\u0231\u0237\u023f\u024c\u0250\u0254\u0258\u025f\u0263\u026c\u0270\u0273\u0277\u027a\u0281\u0285\u0288\u028d\u0291\u0297\u02a0\u02aa\u02ae\u02b4\u02b7\u02bb\u02be\u02c3\u02ca\u02ce\u02d1\u02d7\u02dd\u02e8\u02ed\u02fb\u0304"

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
    private val FIELD = Tokens.FIELD.id
    private val INVERSE = Tokens.INVERSE.id
    private val FROM = Tokens.FROM.id
    private val IF = Tokens.IF.id
    private val ELSE = Tokens.ELSE.id
    private val NEW = Tokens.NEW.id
    private val INT = Tokens.INT.id
    private val DOUBLE = Tokens.DOUBLE.id
    private val FLOAT = Tokens.FLOAT.id
    private val BYTE = Tokens.BYTE.id
    private val CHAR = Tokens.CHAR.id
    private val STRING = Tokens.STRING.id
    private val BOOLEAN = Tokens.BOOLEAN.id
    private val NULL = Tokens.NULL.id
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
    private val COLONSHARP = Tokens.COLONSHARP.id
    private val QUOTE = Tokens.QUOTE.id
    private val COLONQUOTE = Tokens.COLONQUOTE.id
    private val SHARP = Tokens.SHARP.id
    private val QM = Tokens.QM.id
    private val PLUS = Tokens.PLUS.id
    private val MINUS = Tokens.MINUS.id
    private val MULTIPLY = Tokens.MULTIPLY.id
    private val DIVIDE = Tokens.DIVIDE.id
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
			this.state = 137
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NAMESPACE) {
				if (true){
				this.state = 136
				namespace()
				}
			}

			this.state = 142
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPORT) {
				if (true){
				if (true){
				this.state = 139
				importEx()
				}
				}
				this.state = 144
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 149
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl ANNOTATION) or (1L shl CLASS) or (1L shl FIELD) or (1L shl LSQUARE) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 147
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				CLASS , FIELD , LSQUARE , ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 145
				fileCompo()
				}}
				ANNOTATION  ->  /*LL1AltBlock*/{if (true){
				this.state = 146
				annotationDef()
				}}
				else -> throw NoViableAltException(this)
				}
				}
				this.state = 151
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
		fun findField() : FieldContext? = getRuleContext(solver.getType("FieldContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  fileCompo() : FileCompoContext {
		var _localctx : FileCompoContext = FileCompoContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_fileCompo.id)
		try {
			this.state = 154
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			CLASS , LSQUARE , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 152
			definition()
			}}
			FIELD  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 153
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
			this.state = 156
			match(IMPORT) as Token
			this.state = 157
			package_()
			this.state = 159
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==RawString) {
				if (true){
				this.state = 158
				importPath()
				}
			}

			this.state = 162
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 161
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
			this.state = 164
			match(LBRACE) as Token
			this.state = 168
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 165
				importCompo()
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

	open class ImportCompoContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_importCompo.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		fun SHARP() : TerminalNode? = getToken(FoldingParser.Tokens.SHARP.id, 0)
		fun findImportAlias() : ImportAliasContext? = getRuleContext(solver.getType("ImportAliasContext"),0)
		fun As() : TerminalNode? = getToken(FoldingParser.Tokens.As.id, 0)
		fun findImportType() : ImportTypeContext? = getRuleContext(solver.getType("ImportTypeContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importCompo() : ImportCompoContext {
		var _localctx : ImportCompoContext = ImportCompoContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_importCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 173
			match(ID) as Token
			this.state = 176
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 174
				match(SHARP) as Token
				this.state = 175
				importAlias()
				}
			}

			this.state = 180
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==As) {
				if (true){
				this.state = 178
				match(As) as Token
				this.state = 179
				importType()
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
			this.state = 182
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
			this.state = 184
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
		fun RawString() : TerminalNode? = getToken(FoldingParser.Tokens.RawString.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  importPath() : ImportPathContext {
		var _localctx : ImportPathContext = ImportPathContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_importPath.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 186
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
		enterRule(_localctx, 16, Rules.RULE_package_.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 188
			match(ID) as Token
			this.state = 193
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,10,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 189
					match(DOT) as Token
					this.state = 190
					match(ID) as Token
					}
					} 
				}
				this.state = 195
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,10,context)
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
		enterRule(_localctx, 18, Rules.RULE_namespace.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 196
			match(NAMESPACE) as Token
			this.state = 197
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
		enterRule(_localctx, 20, Rules.RULE_doBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 199
			match(DO) as Token
			this.state = 200
			match(LBRACE) as Token
			this.state = 204
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl RETURN) or (1L shl IF) or (1L shl NEW) or (1L shl NULL) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl PLUS) or (1L shl MINUS) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 201
				compo()
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
		enterRule(_localctx, 22, Rules.RULE_compo.id)
		try {
			this.state = 212
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,12,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 209
			fieldAssign()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 210
			value(0)
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 211
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
		enterRule(_localctx, 24, Rules.RULE_returning.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 214
			match(RETURN) as Token
			this.state = 215
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
		enterRule(_localctx, 26, Rules.RULE_fieldAssign.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 217
			value(0)
			this.state = 218
			match(ASSGIN) as Token
			this.state = 219
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
		enterRule(_localctx, 28, Rules.RULE_class_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 222
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 221
				annotationBlock()
				}
			}

			this.state = 224
			match(CLASS) as Token
			this.state = 225
			match(ID) as Token
			this.state = 227
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 226
				typeParam()
				}
			}

			this.state = 229
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: ClassBodyContext) {
			super.copyFrom(ctx)
		}
	}
	open class JustInterfaceContext : ClassBodyContext {
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findDefInInterface() : List<DefInInterfaceContext> = getRuleContexts(solver.getType("DefInInterfaceContext"))
		fun findDefInInterface(i: Int) : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),i)
		fun findImpl() : List<ImplContext> = getRuleContexts(solver.getType("ImplContext"))
		fun findImpl(i: Int) : ImplContext? = getRuleContext(solver.getType("ImplContext"),i)
		constructor(ctx: ClassBodyContext) { copyFrom(ctx) }
	}
	open class JustClassContext : ClassBodyContext {
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun findConstruct() : ConstructContext? = getRuleContext(solver.getType("ConstructContext"),0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		fun findField() : List<FieldContext> = getRuleContexts(solver.getType("FieldContext"))
		fun findField(i: Int) : FieldContext? = getRuleContext(solver.getType("FieldContext"),i)
		fun findDefInInterface() : List<DefInInterfaceContext> = getRuleContexts(solver.getType("DefInInterfaceContext"))
		fun findDefInInterface(i: Int) : DefInInterfaceContext? = getRuleContext(solver.getType("DefInInterfaceContext"),i)
		fun findInherit() : InheritContext? = getRuleContext(solver.getType("InheritContext"),0)
		fun findImpl() : List<ImplContext> = getRuleContexts(solver.getType("ImplContext"))
		fun findImpl(i: Int) : ImplContext? = getRuleContext(solver.getType("ImplContext"),i)
		constructor(ctx: ClassBodyContext) { copyFrom(ctx) }
	}

	fun  classBody() : ClassBodyContext {
		var _localctx : ClassBodyContext = ClassBodyContext(context, state)
		enterRule(_localctx, 30, Rules.RULE_classBody.id)
		var _la: Int
		try {
			this.state = 270
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,21,context) ) {
			1 -> {_localctx = JustClassContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 231
			match(LBRACE) as Token
			this.state = 232
			construct()
			this.state = 236
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==FIELD) {
				if (true){
				if (true){
				this.state = 233
				field()
				}
				}
				this.state = 238
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 242
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 239
				defInInterface()
				}
				}
				this.state = 244
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 246
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==INHERIT) {
				if (true){
				this.state = 245
				inherit()
				}
			}

			this.state = 251
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 248
				impl()
				}
				}
				this.state = 253
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 254
			match(RBRACE) as Token
			}}
			2 -> {_localctx = JustInterfaceContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 256
			match(LBRACE) as Token
			this.state = 260
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 257
				defInInterface()
				}
				}
				this.state = 262
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 266
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==IMPL) {
				if (true){
				if (true){
				this.state = 263
				impl()
				}
				}
				this.state = 268
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 269
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

	open class ConstructContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_construct.id
	        set(value) { throw RuntimeException() }
		fun findConstructor_() : List<Constructor_Context> = getRuleContexts(solver.getType("Constructor_Context"))
		fun findConstructor_(i: Int) : Constructor_Context? = getRuleContext(solver.getType("Constructor_Context"),i)
		fun findConstructorSelf() : ConstructorSelfContext? = getRuleContext(solver.getType("ConstructorSelfContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  construct() : ConstructContext {
		var _localctx : ConstructContext = ConstructContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_construct.id)
		try {
			var _alt: Int
			this.state = 278
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,23,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 273 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 272
				constructor_()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 275 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,22,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 277
			constructorSelf()
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
		enterRule(_localctx, 34, Rules.RULE_constructor_.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 280
			match(ID) as Token
			this.state = 282
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 281
				parameter()
				}
			}

			this.state = 285
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 284
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
		enterRule(_localctx, 36, Rules.RULE_constructorSelf.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 288
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 287
				parameter()
				}
			}

			this.state = 291
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==DO) {
				if (true){
				this.state = 290
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
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 294
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 293
				annotationBlock()
				}
			}

			this.state = 296
			match(ID) as Token
			this.state = 298
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,29,context) ) {
			1   -> if (true){
			this.state = 297
			typeParam()
			}
			}
			this.state = 301
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,30,context) ) {
			1   -> if (true){
			this.state = 300
			parameter()
			}
			}
			this.state = 303
			typeEx()
			this.state = 306
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ASSGIN) {
				if (true){
				this.state = 304
				match(ASSGIN) as Token
				this.state = 305
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

	open class InheritContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_inherit.id
	        set(value) { throw RuntimeException() }
		fun INHERIT() : TerminalNode? = getToken(FoldingParser.Tokens.INHERIT.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findImplBody() : ImplBodyContext? = getRuleContext(solver.getType("ImplBodyContext"),0)
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
			this.state = 308
			match(INHERIT) as Token
			this.state = 310
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,32,context) ) {
			1   -> if (true){
			this.state = 309
			typeParam()
			}
			}
			this.state = 312
			typeEx()
			this.state = 314
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 313
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
		enterRule(_localctx, 42, Rules.RULE_impl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 316
			match(IMPL) as Token
			this.state = 318
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,34,context) ) {
			1   -> if (true){
			this.state = 317
			typeParam()
			}
			}
			this.state = 320
			typeEx()
			this.state = 322
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE) {
				if (true){
				this.state = 321
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
		enterRule(_localctx, 44, Rules.RULE_implBody.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 324
			match(LBRACE) as Token
			this.state = 328
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==LSQUARE || _la==ID) {
				if (true){
				if (true){
				this.state = 325
				defInImpl()
				}
				}
				this.state = 330
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 331
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
		fun findTypeParam() : TypeParamContext? = getRuleContext(solver.getType("TypeParamContext"),0)
		fun findParameter() : ParameterContext? = getRuleContext(solver.getType("ParameterContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defInImpl() : DefInImplContext {
		var _localctx : DefInImplContext = DefInImplContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_defInImpl.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 334
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LSQUARE) {
				if (true){
				this.state = 333
				annotationBlock()
				}
			}

			this.state = 336
			match(ID) as Token
			this.state = 338
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,38,context) ) {
			1   -> if (true){
			this.state = 337
			typeParam()
			}
			}
			this.state = 341
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,39,context) ) {
			1   -> if (true){
			this.state = 340
			parameter()
			}
			}
			this.state = 343
			typeEx()
			this.state = 344
			match(ASSGIN) as Token
			this.state = 345
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
		enterRule(_localctx, 48, Rules.RULE_typeParam.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 348 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 347
				typeParamCompo()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 350 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,40,context)
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
		enterRule(_localctx, 50, Rules.RULE_typeParamCompo.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 352
			match(ID) as Token
			this.state = 357
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TILDE) {
				if (true){
				if (true){
				this.state = 353
				match(TILDE) as Token
				this.state = 354
				typeEx()
				}
				}
				this.state = 359
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
		enterRule(_localctx, 52, Rules.RULE_definition.id)
		try {
			this.state = 362
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,42,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 360
			def()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 361
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  defaultValue() : DefaultValueContext {
		var _localctx : DefaultValueContext = DefaultValueContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_defaultValue.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 364
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
	open class GetFieldGlobalContext : ValueContext {
		fun SHARP() : TerminalNode? = getToken(FoldingParser.Tokens.SHARP.id, 0)
		fun findReference() : ReferenceContext? = getRuleContext(solver.getType("ReferenceContext"),0)
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
		var _startState : Int = 56
		enterRecursionRule(_localctx, 56, Rules.RULE_value.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 394
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,45,context) ) {
			1 -> {if (true){
			_localctx = JustDefaultValueContext(_localctx)
			context = _localctx
			_prevctx = _localctx

			this.state = 367
			defaultValue()
			}}
			2 -> {if (true){
			_localctx = NullContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 368
			match(NULL) as Token
			}}
			3 -> {if (true){
			_localctx = OutputOfInversingContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 369
			match(ARROW) as Token
			this.state = 370
			match(ID) as Token
			}}
			4 -> {if (true){
			_localctx = ReflectedContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 371
			match(QUOTE) as Token
			this.state = 372
			reference()
			}}
			5 -> {if (true){
			_localctx = CallFunctionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 373
			reference()
			this.state = 375
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,43,context) ) {
			1   -> if (true){
			this.state = 374
			argValue()
			}
			}
			}}
			6 -> {if (true){
			_localctx = UseForeignClassContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 377
			match(NEW) as Token
			this.state = 378
			reference()
			this.state = 380
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,44,context) ) {
			1   -> if (true){
			this.state = 379
			argValue()
			}
			}
			}}
			7 -> {if (true){
			_localctx = GetFieldGlobalContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 382
			match(SHARP) as Token
			this.state = 383
			reference()
			}}
			8 -> {if (true){
			_localctx = IfExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 384
			if_else()
			}}
			9 -> {if (true){
			_localctx = CallAopFuncContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 385
			callingAopId()
			this.state = 386
			value(5)
			}}
			10 -> {if (true){
			_localctx = DoExpressionContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 388
			doBlock()
			}}
			11 -> {if (true){
			_localctx = JustLambdaContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 389
			lambda()
			}}
			12 -> {if (true){
			_localctx = ParenedValueContext(_localctx)
			context = _localctx
			_prevctx = _localctx
			this.state = 390
			match(LPAREN) as Token
			this.state = 391
			value(0)
			this.state = 392
			match(RPAREN) as Token
			}}
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 424
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,48,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					this.state = 422
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,47,context) ) {
					1 -> {if (true){
					_localctx = SimpleIfContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 396
					if (!(precpred(context!!, 9))) throw FailedPredicateException(this, "precpred(context!!, 9)")
					this.state = 397
					match(IF) as Token
					this.state = 398
					value(10)
					}}
					2 -> {if (true){
					_localctx = TakeNullContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 399
					if (!(precpred(context!!, 8))) throw FailedPredicateException(this, "precpred(context!!, 8)")
					this.state = 400
					match(QM) as Token
					this.state = 401
					value(9)
					}}
					3 -> {if (true){
					_localctx = CallOpFuncContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 402
					if (!(precpred(context!!, 4))) throw FailedPredicateException(this, "precpred(context!!, 4)")
					this.state = 403
					callingOpId()
					this.state = 404
					value(5)
					}}
					4 -> {if (true){
					_localctx = GetFieldContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 406
					if (!(precpred(context!!, 13))) throw FailedPredicateException(this, "precpred(context!!, 13)")
					this.state = 407
					match(COLONSHARP) as Token
					this.state = 408
					match(ID) as Token
					}}
					5 -> {if (true){
					_localctx = CallMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 409
					if (!(precpred(context!!, 12))) throw FailedPredicateException(this, "precpred(context!!, 12)")
					this.state = 410
					match(COLON) as Token
					this.state = 411
					match(ID) as Token
					this.state = 413
					errorHandler.sync(this)
					when ( interpreter!!.adaptivePredict(_input!!,46,context) ) {
					1   -> if (true){
					this.state = 412
					argValue()
					}
					}
					}}
					6 -> {if (true){
					_localctx = ReflectedMethodContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 415
					if (!(precpred(context!!, 11))) throw FailedPredicateException(this, "precpred(context!!, 11)")
					this.state = 416
					match(COLONQUOTE) as Token
					this.state = 417
					match(ID) as Token
					}}
					7 -> {if (true){
					_localctx = InvokeValueContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 418
					if (!(precpred(context!!, 10))) throw FailedPredicateException(this, "precpred(context!!, 10)")
					this.state = 419
					invoking()
					}}
					8 -> {if (true){
					_localctx = ValueTypeCastingContext(ValueContext(_parentctx, _parentState))
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_value.id)
					this.state = 420
					if (!(precpred(context!!, 6))) throw FailedPredicateException(this, "precpred(context!!, 6)")
					this.state = 421
					typeCasting()
					}}
					}
					} 
				}
				this.state = 426
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,48,context)
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
			this.state = 430
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,49,context) ) {
			1   -> if (true){
			this.state = 427
			package_()
			this.state = 428
			match(DOT) as Token
			}
			}
			this.state = 432
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
		fun As() : TerminalNode? = getToken(FoldingParser.Tokens.As.id, 0)
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  typeCasting() : TypeCastingContext {
		var _localctx : TypeCastingContext = TypeCastingContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_typeCasting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 434
			match(As) as Token
			this.state = 435
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

	open class If_elseContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_if_else.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: If_elseContext) {
			super.copyFrom(ctx)
		}
	}
	open class DirectJudgeContext : If_elseContext {
		fun IF() : TerminalNode? = getToken(FoldingParser.Tokens.IF.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun ELSE() : TerminalNode? = getToken(FoldingParser.Tokens.ELSE.id, 0)
		constructor(ctx: If_elseContext) { copyFrom(ctx) }
	}
	open class BindingJudgeContext : If_elseContext {
		fun IF() : TerminalNode? = getToken(FoldingParser.Tokens.IF.id, 0)
		fun LPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.LPAREN.id, 0)
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		fun ARROW() : TerminalNode? = getToken(FoldingParser.Tokens.ARROW.id, 0)
		fun RPAREN() : TerminalNode? = getToken(FoldingParser.Tokens.RPAREN.id, 0)
		fun ELSE() : TerminalNode? = getToken(FoldingParser.Tokens.ELSE.id, 0)
		fun SHARP() : TerminalNode? = getToken(FoldingParser.Tokens.SHARP.id, 0)
		fun ID() : TerminalNode? = getToken(FoldingParser.Tokens.ID.id, 0)
		constructor(ctx: If_elseContext) { copyFrom(ctx) }
	}

	fun  if_else() : If_elseContext {
		var _localctx : If_elseContext = If_elseContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_if_else.id)
		var _la: Int
		try {
			this.state = 459
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,51,context) ) {
			1 -> {_localctx = DirectJudgeContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 437
			match(IF) as Token
			this.state = 438
			match(LPAREN) as Token
			this.state = 439
			value(0)
			this.state = 440
			match(RPAREN) as Token
			this.state = 441
			value(0)
			this.state = 442
			match(ELSE) as Token
			this.state = 443
			value(0)
			}}
			2 -> {_localctx = BindingJudgeContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 445
			match(IF) as Token
			this.state = 446
			match(LPAREN) as Token
			this.state = 447
			value(0)
			this.state = 450
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==SHARP) {
				if (true){
				this.state = 448
				match(SHARP) as Token
				this.state = 449
				match(ID) as Token
				}
			}

			this.state = 452
			match(ARROW) as Token
			this.state = 453
			value(0)
			this.state = 454
			match(RPAREN) as Token
			this.state = 455
			value(0)
			this.state = 456
			match(ELSE) as Token
			this.state = 457
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
			this.state = 461
			match(ID) as Token
			this.state = 463
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 462
				match(ELLIPSIS) as Token
				}
			}

			this.state = 465
			match(TILDE) as Token
			this.state = 466
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
			this.state = 469
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,53,context) ) {
			1   -> if (true){
			this.state = 468
			specificAlias()
			}
			}
			this.state = 471
			value(0)
			this.state = 472
			match(TILDE) as Token
			this.state = 473
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
			this.state = 475
			match(LPAREN) as Token
			this.state = 479
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 476
				paramEx()
				}
				}
				this.state = 481
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 482
			match(RPAREN) as Token
			this.state = 484
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FROM) {
				if (true){
				this.state = 483
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
			this.state = 486
			match(FROM) as Token
			this.state = 487
			match(LPAREN) as Token
			this.state = 489 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 488
				paramCEx()
				}
				}
				this.state = 491 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl NULL) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl PLUS) or (1L shl MINUS) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L) )
			this.state = 493
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
		fun TILDE() : TerminalNode? = getToken(FoldingParser.Tokens.TILDE.id, 0)
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
			this.state = 495
			match(LPAREN) as Token
			this.state = 496
			match(ID) as Token
			this.state = 497
			match(TILDE) as Token
			this.state = 498
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
		fun findValue() : List<ValueContext> = getRuleContexts(solver.getType("ValueContext"))
		fun findValue(i: Int) : ValueContext? = getRuleContext(solver.getType("ValueContext"),i)
		constructor(ctx: ArgExContext) { copyFrom(ctx) }
	}

	fun  argEx() : ArgExContext {
		var _localctx : ArgExContext = ArgExContext(context, state)
		enterRule(_localctx, 74, Rules.RULE_argEx.id)
		var _la: Int
		try {
			this.state = 516
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,60,context) ) {
			1 -> {_localctx = SingleArgContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 502
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,57,context) ) {
			1   -> if (true){
			this.state = 500
			match(ID) as Token
			this.state = 501
			match(ASSGIN) as Token
			}
			}
			this.state = 504
			value(0)
			}}
			2 -> {_localctx = MultiArgContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 506
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 505
				match(ID) as Token
				}
			}

			this.state = 508
			match(LBRACE) as Token
			this.state = 512
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl NULL) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl PLUS) or (1L shl MINUS) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 509
				value(0)
				}
				}
				this.state = 514
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 515
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
			this.state = 552
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LPAREN  ->  /*LL1AltBlock*/{_localctx = PrimaryArgValueContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 518
			match(LPAREN) as Token
			this.state = 526
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,62,context) ) {
			1   -> if (true){
			this.state = 520 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 519
				typeEx()
				}
				}
				this.state = 522 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl LPAREN) or (1L shl QM) or (1L shl ID))) != 0L) )
			this.state = 524
			match(TILDE) as Token
			}
			}
			this.state = 531
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl NULL) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl PLUS) or (1L shl MINUS) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 528
				argEx()
				}
				}
				this.state = 533
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 534
			match(RPAREN) as Token
			}}
			LBRACE  ->  /*LL1AltBlock*/{_localctx = SingleListArgValueContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 535
			match(LBRACE) as Token
			this.state = 543
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,65,context) ) {
			1   -> if (true){
			this.state = 537 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 536
				typeEx()
				}
				}
				this.state = 539 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl LPAREN) or (1L shl QM) or (1L shl ID))) != 0L) )
			this.state = 541
			match(TILDE) as Token
			}
			}
			this.state = 548
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl NULL) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl PLUS) or (1L shl MINUS) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 545
				value(0)
				}
				}
				this.state = 550
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 551
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

	open class InvokeExContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_invokeEx.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: InvokeExContext) {
			super.copyFrom(ctx)
		}
	}
	open class MultiInvokeContext : InvokeExContext {
		fun LBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.LBRACE.id, 0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		fun RBRACE() : TerminalNode? = getToken(FoldingParser.Tokens.RBRACE.id, 0)
		constructor(ctx: InvokeExContext) { copyFrom(ctx) }
	}
	open class SingleInvokeContext : InvokeExContext {
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(ctx: InvokeExContext) { copyFrom(ctx) }
	}

	fun  invokeEx() : InvokeExContext {
		var _localctx : InvokeExContext = InvokeExContext(context, state)
		enterRule(_localctx, 78, Rules.RULE_invokeEx.id)
		try {
			this.state = 559
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			DO , IF , NEW , NULL , LPAREN , LSQUARE , ARROW , QUOTE , SHARP , PLUS , MINUS , ID , OPID , Integer , Double , String  ->  /*LL1AltBlock*/{_localctx = SingleInvokeContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 554
			value(0)
			}}
			LBRACE  ->  /*LL1AltBlock*/{_localctx = MultiInvokeContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 555
			match(LBRACE) as Token
			this.state = 556
			value(0)
			this.state = 557
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: InvokingContext) {
			super.copyFrom(ctx)
		}
	}
	open class InvokeValueFuncContext : InvokingContext {
		fun LSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.LSQUARE.id, 0)
		fun RSQUARE() : TerminalNode? = getToken(FoldingParser.Tokens.RSQUARE.id, 0)
		fun findInvokeEx() : List<InvokeExContext> = getRuleContexts(solver.getType("InvokeExContext"))
		fun findInvokeEx(i: Int) : InvokeExContext? = getRuleContext(solver.getType("InvokeExContext"),i)
		constructor(ctx: InvokingContext) { copyFrom(ctx) }
	}

	fun  invoking() : InvokingContext {
		var _localctx : InvokingContext = InvokingContext(context, state)
		enterRule(_localctx, 80, Rules.RULE_invoking.id)
		var _la: Int
		try {
			 _localctx = InvokeValueFuncContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 561
			match(LSQUARE) as Token
			this.state = 565
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl NULL) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl LBRACE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl PLUS) or (1L shl MINUS) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L)) {
				if (true){
				if (true){
				this.state = 562
				invokeEx()
				}
				}
				this.state = 567
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 568
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
			this.state = 573
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,70,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 570
			match(ID) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 571
			opIdWrap()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 572
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
			this.state = 575
			match(LSQUARE) as Token
			this.state = 576
			match(OPID) as Token
			this.state = 577
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
			this.state = 579
			match(LSQUARE) as Token
			this.state = 580
			match(TILDE) as Token
			this.state = 581
			match(OPID) as Token
			this.state = 582
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: CallingOpIdContext) {
			super.copyFrom(ctx)
		}
	}
	open class PrimitiveOpIdContext : CallingOpIdContext {
		fun PLUS() : TerminalNode? = getToken(FoldingParser.Tokens.PLUS.id, 0)
		fun MINUS() : TerminalNode? = getToken(FoldingParser.Tokens.MINUS.id, 0)
		fun MULTIPLY() : TerminalNode? = getToken(FoldingParser.Tokens.MULTIPLY.id, 0)
		fun DIVIDE() : TerminalNode? = getToken(FoldingParser.Tokens.DIVIDE.id, 0)
		constructor(ctx: CallingOpIdContext) { copyFrom(ctx) }
	}
	open class CommmonOpIdContext : CallingOpIdContext {
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		constructor(ctx: CallingOpIdContext) { copyFrom(ctx) }
	}

	fun  callingOpId() : CallingOpIdContext {
		var _localctx : CallingOpIdContext = CallingOpIdContext(context, state)
		enterRule(_localctx, 88, Rules.RULE_callingOpId.id)
		var _la: Int
		try {
			this.state = 586
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			OPID  ->  /*LL1AltBlock*/{_localctx = CommmonOpIdContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 584
			match(OPID) as Token
			}}
			PLUS , MINUS , MULTIPLY , DIVIDE  ->  /*LL1AltBlock*/{_localctx = PrimitiveOpIdContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 585
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl PLUS) or (1L shl MINUS) or (1L shl MULTIPLY) or (1L shl DIVIDE))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
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
	open class CommmonAopIdContext : CallingAopIdContext {
		fun OPID() : TerminalNode? = getToken(FoldingParser.Tokens.OPID.id, 0)
		constructor(ctx: CallingAopIdContext) { copyFrom(ctx) }
	}
	open class PrimitiveAopIdContext : CallingAopIdContext {
		fun PLUS() : TerminalNode? = getToken(FoldingParser.Tokens.PLUS.id, 0)
		fun MINUS() : TerminalNode? = getToken(FoldingParser.Tokens.MINUS.id, 0)
		constructor(ctx: CallingAopIdContext) { copyFrom(ctx) }
	}

	fun  callingAopId() : CallingAopIdContext {
		var _localctx : CallingAopIdContext = CallingAopIdContext(context, state)
		enterRule(_localctx, 90, Rules.RULE_callingAopId.id)
		var _la: Int
		try {
			this.state = 590
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			OPID  ->  /*LL1AltBlock*/{_localctx = CommmonAopIdContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 588
			match(OPID) as Token
			}}
			PLUS , MINUS  ->  /*LL1AltBlock*/{_localctx = PrimitiveAopIdContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 589
			_la = _input!!.LA(1)
			if ( !(_la==PLUS || _la==MINUS) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
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
		enterRule(_localctx, 92, Rules.RULE_field.id)
		try {
			this.state = 594
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,73,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 592
			fieldSetted()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 593
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
		enterRule(_localctx, 94, Rules.RULE_fieldNotInit.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 596
			match(FIELD) as Token
			this.state = 598
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==MUTABLE) {
				if (true){
				this.state = 597
				match(MUTABLE) as Token
				}
			}

			this.state = 600
			match(ID) as Token
			this.state = 601
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
		enterRule(_localctx, 96, Rules.RULE_fieldSetted.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 603
			match(FIELD) as Token
			this.state = 605
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==MUTABLE) {
				if (true){
				this.state = 604
				match(MUTABLE) as Token
				}
			}

			this.state = 607
			match(ID) as Token
			this.state = 609
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl LPAREN) or (1L shl QM) or (1L shl ID))) != 0L)) {
				if (true){
				this.state = 608
				typeEx()
				}
			}

			this.state = 611
			match(ASSGIN) as Token
			this.state = 612
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
		enterRule(_localctx, 98, Rules.RULE_def.id)
		var _la: Int
		try {
			this.state = 622
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,78,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 614
			justDef()
			this.state = 618
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==INVERSE) {
				if (true){
				if (true){
				this.state = 615
				inverseDefining()
				}
				}
				this.state = 620
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 621
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
		enterRule(_localctx, 100, Rules.RULE_justDef.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 625
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,79,context) ) {
			1   -> if (true){
			this.state = 624
			annotationBlock()
			}
			}
			this.state = 627
			commonIdentifier()
			this.state = 629
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,80,context) ) {
			1   -> if (true){
			this.state = 628
			typeParam()
			}
			}
			this.state = 632
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,81,context) ) {
			1   -> if (true){
			this.state = 631
			parameter()
			}
			}
			this.state = 634
			typeEx()
			this.state = 635
			match(ASSGIN) as Token
			this.state = 636
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
		enterRule(_localctx, 102, Rules.RULE_foreignDef.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 639
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,82,context) ) {
			1   -> if (true){
			this.state = 638
			annotationBlock()
			}
			}
			this.state = 641
			commonIdentifier()
			this.state = 643
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 642
				typeParam()
				}
			}

			this.state = 646
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LPAREN) {
				if (true){
				this.state = 645
				parameter()
				}
			}

			this.state = 648
			match(FOREIGN) as Token
			this.state = 649
			typeEx()
			this.state = 651
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==LBRACE || _la==RawString) {
				if (true){
				this.state = 650
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
		enterRule(_localctx, 104, Rules.RULE_inverseDefining.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 653
			match(INVERSE) as Token
			this.state = 655
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ID) {
				if (true){
				this.state = 654
				match(ID) as Token
				}
			}

			this.state = 657
			match(LPAREN) as Token
			this.state = 659 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 658
				inverseDefCompo()
				}
				}
				this.state = 661 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl LPAREN) or (1L shl As) or (1L shl QM) or (1L shl ID))) != 0L) )
			this.state = 663
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
		fun findTypeEx() : TypeExContext? = getRuleContext(solver.getType("TypeExContext"),0)
		fun findValue() : ValueContext? = getRuleContext(solver.getType("ValueContext"),0)
		constructor(ctx: InverseDefCompoContext) { copyFrom(ctx) }
	}

	fun  inverseDefCompo() : InverseDefCompoContext {
		var _localctx : InverseDefCompoContext = InverseDefCompoContext(context, state)
		enterRule(_localctx, 106, Rules.RULE_inverseDefCompo.id)
		try {
			this.state = 670
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			INT , DOUBLE , FLOAT , BYTE , CHAR , STRING , BOOLEAN , LPAREN , QM , ID  ->  /*LL1AltBlock*/{_localctx = OutputParamContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 665
			typeEx()
			this.state = 666
			value(0)
			}}
			As  ->  /*LL1AltBlock*/{_localctx = NecessaryParamContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 668
			match(As) as Token
			this.state = 669
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
		enterRule(_localctx, 108, Rules.RULE_lambda.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 672
			match(LSQUARE) as Token
			this.state = 673
			parameterForLambda()
			this.state = 674
			match(RSQUARE) as Token
			this.state = 675
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
		enterRule(_localctx, 110, Rules.RULE_parameterForLambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 680
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 677
				paramEx()
				}
				}
				this.state = 682
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 684
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==FROM) {
				if (true){
				this.state = 683
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
		enterRule(_localctx, 112, Rules.RULE_parameterFromValueForLambda.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 686
			match(FROM) as Token
			this.state = 688 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 687
				paramCEx()
				}
				}
				this.state = 690 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DO) or (1L shl IF) or (1L shl NEW) or (1L shl NULL) or (1L shl LPAREN) or (1L shl LSQUARE) or (1L shl ARROW) or (1L shl QUOTE) or (1L shl SHARP) or (1L shl PLUS) or (1L shl MINUS) or (1L shl ID) or (1L shl OPID) or (1L shl Integer) or (1L shl Double) or (1L shl String))) != 0L) )
			}
		}
		catch (re: RecognitionException) {
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
		enterRule(_localctx, 114, Rules.RULE_typeEx.id)
		var _la: Int
		try {
			this.state = 700
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,94,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 693
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==QM) {
				if (true){
				this.state = 692
				match(QM) as Token
				}
			}

			this.state = 695
			typeExFunc()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 697
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==QM) {
				if (true){
				this.state = 696
				match(QM) as Token
				}
			}

			this.state = 699
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
		enterRule(_localctx, 116, Rules.RULE_typeExSingle.id)
		var _la: Int
		try {
			this.state = 719
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 705
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,95,context) ) {
			1   -> if (true){
			this.state = 702
			package_()
			this.state = 703
			match(DOT) as Token
			}
			}
			this.state = 707
			match(ID) as Token
			this.state = 716
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,97,context) ) {
			1   -> if (true){
			this.state = 708
			match(LPAREN) as Token
			this.state = 710 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 709
				typeEx()
				}
				}
				this.state = 712 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl LPAREN) or (1L shl QM) or (1L shl ID))) != 0L) )
			this.state = 714
			match(RPAREN) as Token
			}
			}
			}}
			INT , DOUBLE , FLOAT , BYTE , CHAR , STRING , BOOLEAN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 718
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
		fun CHAR() : TerminalNode? = getToken(FoldingParser.Tokens.CHAR.id, 0)
		fun STRING() : TerminalNode? = getToken(FoldingParser.Tokens.STRING.id, 0)
		fun BYTE() : TerminalNode? = getToken(FoldingParser.Tokens.BYTE.id, 0)
		fun FLOAT() : TerminalNode? = getToken(FoldingParser.Tokens.FLOAT.id, 0)
		fun DOUBLE() : TerminalNode? = getToken(FoldingParser.Tokens.DOUBLE.id, 0)
		fun BOOLEAN() : TerminalNode? = getToken(FoldingParser.Tokens.BOOLEAN.id, 0)
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
			this.state = 721
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN))) != 0L)) ) {
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
			this.state = 723
			typeEx()
			this.state = 725
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==ELLIPSIS) {
				if (true){
				this.state = 724
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
			this.state = 727
			match(LPAREN) as Token
			this.state = 731
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl DOUBLE) or (1L shl FLOAT) or (1L shl BYTE) or (1L shl CHAR) or (1L shl STRING) or (1L shl BOOLEAN) or (1L shl LPAREN) or (1L shl QM) or (1L shl ID))) != 0L)) {
				if (true){
				if (true){
				this.state = 728
				typeExParamEx()
				}
				}
				this.state = 733
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 734
			match(RPAREN) as Token
			this.state = 735
			match(ARROW) as Token
			this.state = 736
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
		enterRule(_localctx, 124, Rules.RULE_foreignBody.id)
		var _la: Int
		try {
			this.state = 747
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			LBRACE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 738
			match(LBRACE) as Token
			this.state = 742
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 739
				foreignElement()
				}
				}
				this.state = 744
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 745
			match(RBRACE) as Token
			}}
			RawString  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 746
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
		enterRule(_localctx, 126, Rules.RULE_foreignElement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 749
			foreignPlatform()
			this.state = 750
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
		enterRule(_localctx, 128, Rules.RULE_foreignPlatform.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 752
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
		enterRule(_localctx, 130, Rules.RULE_annotationDef.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 754
			match(ANNOTATION) as Token
			this.state = 755
			match(ID) as Token
			this.state = 756
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
		fun findArgValue() : ArgValueContext? = getRuleContext(solver.getType("ArgValueContext"),0)
		fun findPackage_() : Package_Context? = getRuleContext(solver.getType("Package_Context"),0)
		fun DOT() : TerminalNode? = getToken(FoldingParser.Tokens.DOT.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	}

	fun  annotation() : AnnotationContext {
		var _localctx : AnnotationContext = AnnotationContext(context, state)
		enterRule(_localctx, 132, Rules.RULE_annotation.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 761
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,103,context) ) {
			1   -> if (true){
			this.state = 758
			package_()
			this.state = 759
			match(DOT) as Token
			}
			}
			this.state = 763
			match(ID) as Token
			this.state = 764
			argValue()
			}
		}
		catch (re: RecognitionException) {
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
		enterRule(_localctx, 134, Rules.RULE_annotationBlock.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 766
			match(LSQUARE) as Token
			this.state = 770
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==ID) {
				if (true){
				if (true){
				this.state = 767
				annotation()
				}
				}
				this.state = 772
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 773
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
		    1 -> return precpred(context!!, 8)
		    2 -> return precpred(context!!, 4)
		    3 -> return precpred(context!!, 13)
		    4 -> return precpred(context!!, 12)
		    5 -> return precpred(context!!, 11)
		    6 -> return precpred(context!!, 10)
		    7 -> return precpred(context!!, 6)
		}
		return true
	}

}