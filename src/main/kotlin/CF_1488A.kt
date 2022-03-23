/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readLine()!!.toInt()) {
    var (x, y) = readLine()!!.split(' ').map { it.toLong() }
    var ans = 0L
    var t = x

    while (t * 10 <= y) {
        t *= 10
    }
    while (t >= x) {
        ans += y / t
        y %= t
        t /= 10
    }
    println(ans + y)
}
