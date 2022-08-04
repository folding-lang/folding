package foldenx.parser.data

sealed interface FoldingDefaultData<out T:FoldingValue<T>>: FoldingValue<T> {
    abstract class FoldingString(val value: String): FoldingDefaultData<FoldingString>
    abstract class FoldingInt(val value: Int): FoldingDefaultData<FoldingInt>
    abstract class FoldingDouble(val value: Double): FoldingDefaultData<FoldingDouble>
}