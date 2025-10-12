package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val jewels = List(m) { readln().toLong() }
    var answer = Long.MAX_VALUE

    var l = 1L
    var r = jewels.sum()
    while (l <= r) {
        val m = (l + r) / 2

        if (jewels.sumOf { (it + m - 1) / m } <= n) {
            answer = m
            r = m - 1
        } else {
            l = m + 1
        }
    }

    println(answer)
}
