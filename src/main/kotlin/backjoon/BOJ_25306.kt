/**
 * @author Jaeguk Cho
 */

fun main() {
    val (a, d) = readln().split(' ').map { it.toLong() }
    val b = a + 3 - a % 4
    val c = d / 4 * 4
    println(((a..b) + (c..d)).reduce(Long::xor))
}
