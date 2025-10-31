package backjoon16493

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val dp = IntArray(n + 1)

    repeat(m) {
        val (day, page) = readln().split(" ").map { it.toInt() }

        (n downTo day).forEach {
            dp[it] = maxOf(dp[it], dp[it - day] + page)
        }
    }

    println(dp[n])
}
