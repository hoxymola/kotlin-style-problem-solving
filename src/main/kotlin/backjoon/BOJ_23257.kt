import kotlin.math.absoluteValue

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (_, m) = readln().split(' ').map { it.toInt() }
    val monthlyPoles = readln().split(' ').map { it.toInt().absoluteValue }
    val memoize = List(m) { MutableList(1025) { false } }

    monthlyPoles.forEach { memoize[0][it] = true }
    for (i in 1 until m) {
        memoize[i - 1].withIndex().filter { it.value }.forEach {
            monthlyPoles.forEach { pole ->
                memoize[i][it.index xor pole] = true
            }
        }
    }
    println(memoize[m - 1].withIndex().filter { it.value }.maxOf { it.index })
}
