package folding.collections










fun <TClass> array(element0: TClass): Array<TClass> {
    return (array(element0))
}
fun <TClass> array_inverse_0(result: Array<TClass>): folding.FdTuple1Class<TClass> {
    return folding.FdTuple1Class<TClass>(get(result, 0))
}

fun <TClass> array(element0: TClass, element1: TClass): Array<TClass> {
    return (array(element0,element1))
}
fun <TClass> array_inverse_0_1(result: Array<TClass>): folding.FdTuple2Class<TClass,TClass> {
    return folding.FdTuple2Class<TClass,TClass>(get(result, 0),get(result, 1))
}

fun <TClass> array(element0: TClass, element1: TClass, element2: TClass): Array<TClass> {
    return (array(element0,element1,element2))
}
fun <TClass> array_inverse_0_1_2(result: Array<TClass>): folding.FdTuple3Class<TClass,TClass,TClass> {
    return folding.FdTuple3Class<TClass,TClass,TClass>(get(result, 0),get(result, 1),get(result, 2))
}

fun <TClass> array(element0: TClass, element1: TClass, element2: TClass, element3: TClass): Array<TClass> {
    return (array(element0,element1,element2,element3))
}
fun <TClass> array_inverse_0_1_2_3(result: Array<TClass>): folding.FdTuple4Class<TClass,TClass,TClass,TClass> {
    return folding.FdTuple4Class<TClass,TClass,TClass,TClass>(get(result, 0),get(result, 1),get(result, 2),get(result, 3))
}

fun <TClass> array(element0: TClass, element1: TClass, element2: TClass, element3: TClass, element4: TClass): Array<TClass> {
    return (array(element0,element1,element2,element3,element4))
}
fun <TClass> array_inverse_0_1_2_3_4(result: Array<TClass>): folding.FdTuple5Class<TClass,TClass,TClass,TClass,TClass> {
    return folding.FdTuple5Class<TClass,TClass,TClass,TClass,TClass>(get(result, 0),get(result, 1),get(result, 2),get(result, 3),get(result, 4))
}

fun <TClass> array(elements: Array<TClass>): Array<TClass> {
    return (elements)
}

fun <TClass> get(array: Array<TClass>, index: Int): TClass {
    return (folding.collections.implfd.kotlin.get<TClass>(array as Array<TClass>, index as Int))
}

fun <TClass> set(array: Array<TClass>, index: Int, element: TClass): TClass {
    return (folding.collections.implfd.kotlin.set<TClass>(array as Array<TClass>, index as Int, element as TClass))
}