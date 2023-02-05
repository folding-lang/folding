package folding.collections.implfd.kotlin










fun <TClass> get(array: Array<TClass>, index: Int): TClass {
    return ((array).get(index))
}

fun <TClass> set(array: Array<TClass>, index: Int, element: TClass): TClass {
    return ({
        val r1o1c1h1k = (array).set(index,element)
        
        get(array, index)
    }())
}