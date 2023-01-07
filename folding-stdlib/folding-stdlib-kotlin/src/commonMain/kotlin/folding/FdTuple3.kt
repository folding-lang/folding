package folding




open class FdTuple3Class<T0Class,T1Class,T2Class>(val _0: T0Class, val _1: T1Class, val _2: T2Class) {
    
}
fun <T0Class,T1Class,T2Class> FdTuple3(_0: T0Class, _1: T1Class, _2: T2Class): FdTuple3Class<T0Class,T1Class,T2Class> {
    return FdTuple3Class<T0Class,T1Class,T2Class>(_0, _1, _2)
}
fun <T0Class,T1Class,T2Class> FdTuple3_inverse_0_1_2(instance: FdTuple3Class<T0Class,T1Class,T2Class>): folding.FdTuple3Class<T0Class,T1Class,T2Class> {
    return folding.FdTuple3Class<T0Class,T1Class,T2Class>(instance._0,instance._1,instance._2)
}