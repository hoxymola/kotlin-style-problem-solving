import java.math.BigInteger.valueOf

/**
 * @author Jaeguk Cho
 */

fun main() {
    var l = valueOf(0)
    var r = Long.MAX_VALUE.toBigInteger()
    var ans = Long.MAX_VALUE.toBigInteger()
    val n = readln().toBigInteger()
    while (l <= r) {
        val m = (l + r) / valueOf(2)
        if (m * m >= n) {
            ans = minOf(ans, m)
            r = m - valueOf(1)
        } else l = m + valueOf(1)
    }
    println(ans)
}
