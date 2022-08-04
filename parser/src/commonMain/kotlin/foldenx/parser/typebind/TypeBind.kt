package foldenx.parser.typebind

import foldenx.parser.FoldingIdentified
import foldenx.parser.data.FoldingValue

interface TypeBind<T:TypeBind<T>>: FoldingIdentified<T> {
    fun <T:FoldingValue<T>> typeCheck(value: T) = value.typeBinds.contains(this)
}