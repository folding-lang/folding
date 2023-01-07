package folding





fun OP_2b(x: Int, y: Int): Int {
    return (x + y)
}
fun OP_2b_inverse___1(r: Int, x: Int): folding.FdTuple1Class<Int> {
    return folding.FdTuple1Class<Int>(OP_2d(r,x))
}
fun OP_2b_inverse_0__(r: Int, y: Int): folding.FdTuple1Class<Int> {
    return folding.FdTuple1Class<Int>(OP_2d(r,y))
}


fun OP_2d(x: Int, y: Int): Int {
    return (x - y)
}
fun OP_2d_inverse___1(r: Int, x: Int): folding.FdTuple1Class<Int> {
    return folding.FdTuple1Class<Int>(OP_2d(x,r))
}
fun OP_2d_inverse_0__(r: Int, y: Int): folding.FdTuple1Class<Int> {
    return folding.FdTuple1Class<Int>(OP_2b(r,y))
}


fun OP_2a(x: Int, y: Int): Int {
    return (x * y)
}
fun OP_2a_inverse___1(r: Int, x: Int): folding.FdTuple1Class<Int> {
    return folding.FdTuple1Class<Int>(OP_2f(r,x))
}
fun OP_2a_inverse_0__(r: Int, y: Int): folding.FdTuple1Class<Int> {
    return folding.FdTuple1Class<Int>(OP_2f(r,y))
}


fun OP_2f(x: Int, y: Int): Int {
    return (x / y)
}
fun OP_2f_inverse___1(r: Int, x: Int): folding.FdTuple1Class<Int> {
    return folding.FdTuple1Class<Int>(OP_2f(x,r))
}
fun OP_2f_inverse_0__(r: Int, y: Int): folding.FdTuple1Class<Int> {
    return folding.FdTuple1Class<Int>(OP_2a(r,y))
}


fun OP_25(x: Int, y: Int): Int {
    return (x % y)
}


fun AOP_2b(x: Int): Int {
    return (x)
}
fun AOP_2b_inverse_0(r: Int): folding.FdTuple1Class<Int> {
    return folding.FdTuple1Class<Int>(r)
}


fun AOP_2d(x: Int): Int {
    return (-x)
}
fun AOP_2d_inverse_0(r: Int): folding.FdTuple1Class<Int> {
    return folding.FdTuple1Class<Int>(AOP_2d(r))
}


fun OP_2b(x: Long, y: Long): Long {
    return (x + y)
}
fun OP_2b_inverse___1(r: Long, x: Long): folding.FdTuple1Class<Long> {
    return folding.FdTuple1Class<Long>(OP_2d(r,x))
}
fun OP_2b_inverse_0__(r: Long, y: Long): folding.FdTuple1Class<Long> {
    return folding.FdTuple1Class<Long>(OP_2d(r,y))
}


fun OP_2d(x: Long, y: Long): Long {
    return (x - y)
}
fun OP_2d_inverse___1(r: Long, x: Long): folding.FdTuple1Class<Long> {
    return folding.FdTuple1Class<Long>(OP_2d(x,r))
}
fun OP_2d_inverse_0__(r: Long, y: Long): folding.FdTuple1Class<Long> {
    return folding.FdTuple1Class<Long>(OP_2b(r,y))
}


fun OP_2a(x: Long, y: Long): Long {
    return (x * y)
}
fun OP_2a_inverse___1(r: Long, x: Long): folding.FdTuple1Class<Long> {
    return folding.FdTuple1Class<Long>(OP_2f(r,x))
}
fun OP_2a_inverse_0__(r: Long, y: Long): folding.FdTuple1Class<Long> {
    return folding.FdTuple1Class<Long>(OP_2f(r,y))
}


fun OP_2f(x: Long, y: Long): Long {
    return (x / y)
}
fun OP_2f_inverse___1(r: Long, x: Long): folding.FdTuple1Class<Long> {
    return folding.FdTuple1Class<Long>(OP_2f(x,r))
}
fun OP_2f_inverse_0__(r: Long, y: Long): folding.FdTuple1Class<Long> {
    return folding.FdTuple1Class<Long>(OP_2a(r,y))
}


fun OP_25(x: Long, y: Long): Long {
    return (x % y)
}


fun AOP_2b(x: Long): Long {
    return (x)
}
fun AOP_2b_inverse_0(r: Long): folding.FdTuple1Class<Long> {
    return folding.FdTuple1Class<Long>(r)
}


fun AOP_2d(x: Long): Long {
    return (-x)
}
fun AOP_2d_inverse_0(r: Long): folding.FdTuple1Class<Long> {
    return folding.FdTuple1Class<Long>(AOP_2d(r))
}


fun OP_2b(x: Byte, y: Byte): Int {
    return (x + y)
}
fun OP_2b_inverse___1(r: Int, x: Byte): folding.FdTuple1Class<Byte> {
    return folding.FdTuple1Class<Byte>(((OP_2d(r,(x as Int))) as Byte))
}
fun OP_2b_inverse_0__(r: Int, y: Byte): folding.FdTuple1Class<Byte> {
    return folding.FdTuple1Class<Byte>(((OP_2d(r,(y as Int))) as Byte))
}


fun OP_2d(x: Byte, y: Byte): Int {
    return (x - y)
}
fun OP_2d_inverse___1(r: Int, x: Byte): folding.FdTuple1Class<Byte> {
    return folding.FdTuple1Class<Byte>(((OP_2d((x as Int),r)) as Byte))
}
fun OP_2d_inverse_0__(r: Int, y: Byte): folding.FdTuple1Class<Byte> {
    return folding.FdTuple1Class<Byte>(((OP_2b(r,(y as Int))) as Byte))
}


fun OP_2a(x: Byte, y: Byte): Int {
    return (x * y)
}
fun OP_2a_inverse___1(r: Int, x: Byte): folding.FdTuple1Class<Byte> {
    return folding.FdTuple1Class<Byte>(((OP_2f(r,(x as Int))) as Byte))
}
fun OP_2a_inverse_0__(r: Int, y: Byte): folding.FdTuple1Class<Byte> {
    return folding.FdTuple1Class<Byte>(((OP_2f(r,(y as Int))) as Byte))
}


fun OP_2f(x: Byte, y: Byte): Int {
    return (x / y)
}
fun OP_2f_inverse___1(r: Int, x: Byte): folding.FdTuple1Class<Byte> {
    return folding.FdTuple1Class<Byte>(((OP_2f((x as Int),r)) as Byte))
}
fun OP_2f_inverse_0__(r: Int, y: Byte): folding.FdTuple1Class<Byte> {
    return folding.FdTuple1Class<Byte>(((OP_2a(r,(y as Int))) as Byte))
}


fun OP_25(x: Byte, y: Byte): Int {
    return (x % y)
}


fun AOP_2b(x: Byte): Byte {
    return (x)
}
fun AOP_2b_inverse_0(r: Byte): folding.FdTuple1Class<Byte> {
    return folding.FdTuple1Class<Byte>(r)
}


fun AOP_2d(x: Byte): Int {
    return (-x)
}


fun OP_2b(x: Double, y: Double): Double {
    return (x + y)
}
fun OP_2b_inverse___1(r: Double, x: Double): folding.FdTuple1Class<Double> {
    return folding.FdTuple1Class<Double>(OP_2d(r,x))
}
fun OP_2b_inverse_0__(r: Double, y: Double): folding.FdTuple1Class<Double> {
    return folding.FdTuple1Class<Double>(OP_2d(r,y))
}


fun OP_2d(x: Double, y: Double): Double {
    return (x - y)
}
fun OP_2d_inverse___1(r: Double, x: Double): folding.FdTuple1Class<Double> {
    return folding.FdTuple1Class<Double>(OP_2d(x,r))
}
fun OP_2d_inverse_0__(r: Double, y: Double): folding.FdTuple1Class<Double> {
    return folding.FdTuple1Class<Double>(OP_2b(r,y))
}


fun OP_2a(x: Double, y: Double): Double {
    return (x * y)
}
fun OP_2a_inverse___1(r: Double, x: Double): folding.FdTuple1Class<Double> {
    return folding.FdTuple1Class<Double>(OP_2f(r,x))
}
fun OP_2a_inverse_0__(r: Double, y: Double): folding.FdTuple1Class<Double> {
    return folding.FdTuple1Class<Double>(OP_2f(r,y))
}


fun OP_2f(x: Double, y: Double): Double {
    return (x / y)
}
fun OP_2f_inverse___1(r: Double, x: Double): folding.FdTuple1Class<Double> {
    return folding.FdTuple1Class<Double>(OP_2f(x,r))
}
fun OP_2f_inverse_0__(r: Double, y: Double): folding.FdTuple1Class<Double> {
    return folding.FdTuple1Class<Double>(OP_2a(r,y))
}


fun OP_25(x: Double, y: Double): Double {
    return (x % y)
}


fun AOP_2b(x: Double): Double {
    return (x)
}
fun AOP_2b_inverse_0(r: Double): folding.FdTuple1Class<Double> {
    return folding.FdTuple1Class<Double>(r)
}


fun AOP_2d(x: Double): Double {
    return (-x)
}
fun AOP_2d_inverse_0(r: Double): folding.FdTuple1Class<Double> {
    return folding.FdTuple1Class<Double>(AOP_2d(r))
}


fun OP_2b(x: Float, y: Float): Float {
    return (x + y)
}
fun OP_2b_inverse___1(r: Float, x: Float): folding.FdTuple1Class<Float> {
    return folding.FdTuple1Class<Float>(OP_2d(r,x))
}
fun OP_2b_inverse_0__(r: Float, y: Float): folding.FdTuple1Class<Float> {
    return folding.FdTuple1Class<Float>(OP_2d(r,y))
}


fun OP_2d(x: Float, y: Float): Float {
    return (x - y)
}
fun OP_2d_inverse___1(r: Float, x: Float): folding.FdTuple1Class<Float> {
    return folding.FdTuple1Class<Float>(OP_2d(x,r))
}
fun OP_2d_inverse_0__(r: Float, y: Float): folding.FdTuple1Class<Float> {
    return folding.FdTuple1Class<Float>(OP_2b(r,y))
}


fun OP_2a(x: Float, y: Float): Float {
    return (x * y)
}
fun OP_2a_inverse___1(r: Float, x: Float): folding.FdTuple1Class<Float> {
    return folding.FdTuple1Class<Float>(OP_2f(r,x))
}
fun OP_2a_inverse_0__(r: Float, y: Float): folding.FdTuple1Class<Float> {
    return folding.FdTuple1Class<Float>(OP_2f(r,y))
}


fun OP_2f(x: Float, y: Float): Float {
    return (x / y)
}
fun OP_2f_inverse___1(r: Float, x: Float): folding.FdTuple1Class<Float> {
    return folding.FdTuple1Class<Float>(OP_2f(x,r))
}
fun OP_2f_inverse_0__(r: Float, y: Float): folding.FdTuple1Class<Float> {
    return folding.FdTuple1Class<Float>(OP_2a(r,y))
}


fun OP_25(x: Float, y: Float): Float {
    return (x % y)
}


fun AOP_2b(x: Float): Float {
    return (x)
}
fun AOP_2b_inverse_0(r: Float): folding.FdTuple1Class<Float> {
    return folding.FdTuple1Class<Float>(r)
}


fun AOP_2d(x: Float): Float {
    return (-x)
}
fun AOP_2d_inverse_0(r: Float): folding.FdTuple1Class<Float> {
    return folding.FdTuple1Class<Float>(AOP_2d(r))
}