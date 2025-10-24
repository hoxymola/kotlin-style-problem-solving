package backjoon9095

fun main() {
    val dp = MutableList(12) {
        when (it) {
            1 -> 1
            2 -> 2
            3 -> 4
            else -> 0
        }
    }

    (4..10).forEach {
        dp[it] = dp[it - 1] + dp[it - 2] + dp[it - 3]
    }

    repeat(readln().toInt()) {
        val n = readln().toInt()

        println(dp[n])
    }
}
