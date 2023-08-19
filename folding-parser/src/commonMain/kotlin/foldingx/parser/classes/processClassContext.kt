package foldingx.parser.classes

import foldingx.parser.FoldingParser

fun processClassContext(fdClassContext: FoldingParser.Class_Context): CommonClass {
    return when (fdClassContext) {
        is FoldingParser.JustInterfaceContext -> CommonClass(
            category = ClassCategory.ABSTRACT_CLASS,
            identifier = fdClassContext.findCommonClassIdentifier()!!,
            annotationBlockContext = fdClassContext.findAnnotationBlock(),
            typeParam = fdClassContext.findTypeParam(),
            defList = fdClassContext.findDef(),
            implList = fdClassContext.findImpl(),
            defInInterfaceList = fdClassContext.findDefInInterface(),
            fieldInInterfaceList = fdClassContext.findFieldInInterface()
        )
        is FoldingParser.JustClassContext -> CommonClass(
            category = ClassCategory.DATA_CLASS,
            identifier = fdClassContext.findCommonClassIdentifier()!!,
            annotationBlockContext = fdClassContext.findAnnotationBlock(),
            typeParam = fdClassContext.findTypeParam(),
            constructorSelf = fdClassContext.findConstructorSelf(),
            fieldList = fdClassContext.findField(),
            defList = fdClassContext.findDef(),
            inheritContext = fdClassContext.findInherit(),
            implList = fdClassContext.findImpl()
        )
        is FoldingParser.JustAbstractClassContext -> CommonClass(
            category = ClassCategory.ABSTRACT_DATA_CLASS,
            identifier = fdClassContext.findCommonClassIdentifier()!!,
            annotationBlockContext = fdClassContext.findAnnotationBlock(),
            typeParam = fdClassContext.findTypeParam(),
            constructorSelf = fdClassContext.findConstructorSelf(),
            fieldList = fdClassContext.findField(),
            defList = fdClassContext.findDef(),
            inheritContext = fdClassContext.findInherit(),
            implList = fdClassContext.findImpl(),
            defInInterfaceList = fdClassContext.findDefInInterface(),
            fieldInInterfaceList = fdClassContext.findFieldInInterface()
        )

        else -> throw IllegalArgumentException("unexpected kind of class")
    }
}


