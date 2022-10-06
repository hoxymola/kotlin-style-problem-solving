/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, x) = readln().split(' ').map { it.toInt() }
    val visitors = readln().split(' ').map { it.toInt() }

    if (visitors.all { it == 0 }) return println("SAD")
    visitors.runningFold(0, Int::plus).withIndex().toList().let { list ->
        list.take(n - x + 1).map { list[it.index + x].value - it.value }
    }.also { window ->
        val max = window.maxOf { it }.also { println(it) }
        println(window.count { it == max })
    }
}
