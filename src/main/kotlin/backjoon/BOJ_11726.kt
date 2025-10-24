package backjoon11726

fun main() {
    val mod = 10007
    val n = readln().toInt()
    val dp = MutableList(1001) {
        when (it) {
            1 -> 1
            2 -> 2
            else -> 0
        }
    }

    (3..1000).forEach {
        dp[it] = (dp[it - 1] + dp[it - 2]) % mod
    }

    println(dp[n])
}
