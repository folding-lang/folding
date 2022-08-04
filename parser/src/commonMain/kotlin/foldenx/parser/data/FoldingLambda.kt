package foldenx.parser.data

import foldenx.parser.FoldingIdentified

interface FoldingLambda<R:FoldingValue<R>> : FoldingValue<FoldingLambda<R>> {
    val isFolding: Boolean
}