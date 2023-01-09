/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val (a, b) = readln().split(' ').map { it.toInt() }
    val c = readln().toInt()
    val d = List(n) { readln().toInt() }.sortedDescending()
    val calorie = d.runningFold(c, Int::plus)
    val price = List(n + 1) { a + b * it }

    println((0..n).maxOf { calorie[it] / price[it] })
}
