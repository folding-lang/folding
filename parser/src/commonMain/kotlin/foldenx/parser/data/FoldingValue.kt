package foldenx.parser.data

import foldenx.parser.FoldingComponent
import foldenx.parser.typebind.TypeBind

interface FoldingValue<out T:FoldingValue<T>> : FoldingComponent {
    val typeBinds: List<TypeBind<*>>
}