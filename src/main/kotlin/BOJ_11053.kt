import java.lang.Math.max

/**
 * @author Jaeguk Cho
 */
fun main() {
    val n = readLine()!!.toInt()
    val dp = IntArray(n) { 1 }
    val arr = readLine()!!.split(' ').map { it.toInt() }
    arr.forEachIndexed { index, i ->
        for (j in 0 until index) {
            if (arr[j] < i) dp[index] = max(dp[index], dp[j] + 1)
        }
    }
    println(dp.maxOrNull())
}
