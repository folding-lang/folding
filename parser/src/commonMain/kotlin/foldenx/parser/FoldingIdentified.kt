package foldenx.parser

import foldenx.parser.util.Namespace

interface FoldingIdentified<T:FoldingIdentified<T>> : FoldingComponent {
    val id: String
    val namespace: Namespace
    val isOpId: Boolean

    fun isEqualTo(other: T) =
        id == other.id && namespace.isEqualTo(other.namespace)
}