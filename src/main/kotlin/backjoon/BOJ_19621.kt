package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val peoples = List(n) { readln().split(" ").let { it[2].toInt() } }
    val dp = MutableList(n + 2) { 0 }

    peoples.forEachIndexed { i, people ->
        dp[i + 2] = maxOf(dp[i] + people, dp[i + 1])
    }

    println(dp[n + 1])
}
