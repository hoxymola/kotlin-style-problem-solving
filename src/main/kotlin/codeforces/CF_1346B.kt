/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readLine()!!.toInt()) {
    val (_, k1, k2) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    var prev = 0
    readLine()!!.forEach {
        if (it == '1') {
            prev = minOf(k1, k2 - prev)
            ans += prev
        } else prev = 0
    }
    println(ans)
}
