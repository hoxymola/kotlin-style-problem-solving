/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, k, b) = readln().split(' ').map { it.toInt() }
    val roads = MutableList(n) { 1 }
    repeat(b) { roads[readln().toInt() - 1] = 0 }

    roads.runningFold(0, Int::plus).withIndex().toList().let { list ->
        list.drop(k).map { it.value - list[it.index - k].value }
    }.also { println(k - it.maxOf { it }) }
}
