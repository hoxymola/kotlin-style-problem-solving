/**
 * @author Jaeguk Cho
 */

fun main() {
    val dp = MutableList(readln().toInt()) { 1 }
    val arr = readln().split(' ').map { it.toInt() }
    arr.forEachIndexed { i, v ->
        for (j in 0 until i) {
            if (arr[j] < v) dp[i] = maxOf(dp[i], dp[j] + 1)
        }
    }
    println(dp.maxOrNull())
}
