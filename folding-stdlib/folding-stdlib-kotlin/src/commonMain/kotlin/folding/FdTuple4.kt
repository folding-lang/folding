package folding




open class FdTuple4Class<T0Class,T1Class,T2Class,T3Class>(val _0: T0Class, val _1: T1Class, val _2: T2Class, val _3: T3Class) {
    
}
fun <T0Class,T1Class,T2Class,T3Class> FdTuple4(_0: T0Class, _1: T1Class, _2: T2Class, _3: T3Class): FdTuple4Class<T0Class,T1Class,T2Class,T3Class> {
    return FdTuple4Class<T0Class,T1Class,T2Class,T3Class>(_0, _1, _2, _3)
}
fun <T0Class,T1Class,T2Class,T3Class> FdTuple4_inverse_0_1_2_3(instance: FdTuple4Class<T0Class,T1Class,T2Class,T3Class>): folding.FdTuple4Class<T0Class,T1Class,T2Class,T3Class> {
    return folding.FdTuple4Class<T0Class,T1Class,T2Class,T3Class>(instance._0,instance._1,instance._2,instance._3)
}