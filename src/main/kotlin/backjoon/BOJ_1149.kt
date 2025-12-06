package backjoon1149

const val R = 0
const val G = 1
const val B = 2

fun main() {
    val n = readln().toInt()
    val dp = List(n + 1) { MutableList(3) { 0 } }

    for (i in 1..n) {
        val (r, g, b) = readln().split(" ").map { it.toInt() }

        dp[i][R] = r + minOf(dp[i - 1][G], dp[i - 1][B])
        dp[i][G] = g + minOf(dp[i - 1][R], dp[i - 1][B])
        dp[i][B] = b + minOf(dp[i - 1][R], dp[i - 1][G])
    }

    println(dp[n].minOrNull())
}
