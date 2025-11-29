package backjoon11053_2

fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }
    val dp = MutableList(n) { 1 }

    for (i in 0 until n) {
        for (j in 0 until i) {
            if (a[j] < a[i]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }

    println(dp.maxOrNull())
}
