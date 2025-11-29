package backjoon12847

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val prefixSum = readln().split(" ").map { it.toLong() }
        .runningFold(0, Long::plus)
    var ans = 0L

    for (i in m..n) {
        ans = maxOf(ans, prefixSum[i] - prefixSum[i - m])
    }

    println(ans)
}
