package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val quotes = readln().split(" ").map { it.toInt() }.toMutableList()
        .also { it.add(0) }
        .also { it.add(n) }
        .sortedDescending()

    println((0..n).first { it <= quotes[it] && quotes[it + 1] <= it })
}
