package backjoon22857

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val s = readln().split(" ").map { it.toInt() }

    // dp[i][j]: j번 까지의 원소중에서 최대 i번 삭제했을때 최대 길이
    val dp = Array(k + 1) { IntArray(n + 1) }

    for (j in 1..n) {
        if (s[j - 1] % 2 == 0) {
            dp[0][j] = dp[0][j - 1] + 1
        }
    }

    for (i in 1..k) {
        for (j in 1..n) {
            if (s[j - 1] % 2 == 0) {
                dp[i][j] = dp[i][j - 1] + 1
            } else {
                dp[i][j] = dp[i - 1][j - 1]
            }
        }
    }

    println(dp[k].maxOrNull())
}
