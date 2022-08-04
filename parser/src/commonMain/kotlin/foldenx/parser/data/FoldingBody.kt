package foldenx.parser.data

interface FoldingBody<R:FoldingValue<R>> : FoldingValue<FoldingBody<R>> {
    val isDo: Boolean
}