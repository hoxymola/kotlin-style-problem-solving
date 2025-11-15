package backjoon5525

fun main() {
    val n = readln().toInt()
    val m = readln().toInt()
    val s = readln()
    val dp = IntArray(m)

    (m - 3 downTo 0).forEach {
        if (s.slice(it..it + 2) == "IOI") {
            dp[it] = dp[it + 2] + 1
        }
    }

    println(dp.count { it >= n })
}
