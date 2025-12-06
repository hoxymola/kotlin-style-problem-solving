package backjoon1932

fun main() {
    val n = readln().toInt()
    val dp = List(n + 1) { MutableList(n + 1) { 0 } }

    for (i in 1..n) {
        val row = readln().split(" ").map { it.toInt() }

        for (j in 1..i) {
            dp[i][j] = row[j - 1] + maxOf(dp[i - 1][j - 1], dp[i - 1][j])
        }
    }

    println(dp[n].maxOrNull())
}
