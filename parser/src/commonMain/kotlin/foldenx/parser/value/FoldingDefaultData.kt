package foldenx.parser.value

sealed interface FoldingDefaultData<out T:FoldingValue<T>>: FoldingValue<T> {
    data class FoldingString(val value: String): FoldingDefaultData<FoldingString>
    data class FoldingInt(val value: Int): FoldingDefaultData<FoldingInt>
    data class FoldingDouble(val value: Double): FoldingDefaultData<FoldingDouble>
}