/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readLine()!!.toInt()) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    repeat(n) {
        readLine()!!.split(' ').map { it.toInt() }.also {
            if (it[0] <= k) ans = ans.coerceAtLeast(it[1] - k + 1)
        }
    }
    println(ans)
}
