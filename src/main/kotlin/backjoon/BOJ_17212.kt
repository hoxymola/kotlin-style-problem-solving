package backjoon17212

fun main() {
    val n = readln().toInt()
    val dp = MutableList(n + 1) { it }

    listOf(2, 5, 7).forEach { c ->
        for (i in c..n) dp[i] = minOf(dp[i], dp[i - c] + 1)
    }

    println(dp[n])
}
