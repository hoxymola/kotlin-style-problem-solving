package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val times = List(n) { readln().split(" ").map { it.toLong() } }
        .map { it.drop(1).sum() }
        .sortedDescending()
    val totalTime = times.withIndex().sumOf { (it.index + 1) * it.value }

    println(totalTime)
}
