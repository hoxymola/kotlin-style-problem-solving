package backjoon14929

fun main() {
    val n = readln().toInt()
    val x = readln().split(" ").map { it.toInt() }
    val prefixSum = x.scan(0) { acc, n -> acc + n }
    var ans = 0L

    (1 until n).forEach {
        ans += x[it - 1] * (prefixSum[n] - prefixSum[it])
    }

    println(ans)
}
