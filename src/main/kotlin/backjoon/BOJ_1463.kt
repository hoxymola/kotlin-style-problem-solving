package backjoon1463

fun main() {
    val n = readln().toInt()
    val dp = MutableList(n + 1) { Int.MAX_VALUE }

    dp[1] = 0
    (1..n).forEach {
        if (it + 1 <= n) dp[it + 1] = minOf(dp[it + 1], dp[it] + 1)
        if (it * 2 <= n) dp[it * 2] = minOf(dp[it * 2], dp[it] + 1)
        if (it * 3 <= n) dp[it * 3] = minOf(dp[it * 3], dp[it] + 1)
    }

    println(dp[n])
}
