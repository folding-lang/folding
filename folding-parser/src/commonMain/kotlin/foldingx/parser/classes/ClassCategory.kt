package foldingx.parser.classes

enum class ClassCategory(val canHasConstructorSelf: Boolean) {
    ABSTRACT_CLASS(false),
    ABSTRACT_DATA_CLASS(true),
    DATA_CLASS(true),
}