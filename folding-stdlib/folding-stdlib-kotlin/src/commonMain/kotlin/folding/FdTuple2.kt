package folding




open class FdTuple2Class<T0Class,T1Class>(val _0: T0Class, val _1: T1Class) {
    
}
fun <T0Class,T1Class> FdTuple2(_0: T0Class, _1: T1Class): FdTuple2Class<T0Class,T1Class> {
    return FdTuple2Class<T0Class,T1Class>(_0, _1)
}
fun <T0Class,T1Class> FdTuple2_inverse_0_1(instance: FdTuple2Class<T0Class,T1Class>): folding.FdTuple2Class<T0Class,T1Class> {
    return folding.FdTuple2Class<T0Class,T1Class>(instance._0,instance._1)
}