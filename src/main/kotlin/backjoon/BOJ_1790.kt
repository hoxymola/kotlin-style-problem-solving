/**
 * @author Jaeguk Cho
 */

fun main() {
    var (n, k) = readln().split(' ').map { it.toLong() }

    k--
    var a = 1L
    var b = 1L
    while (true) {
        if (k < 9 * a * b) {
            val c = a + k / b
            println(
                if (c > n) -1
                else c.toString()[(k % b).toInt()]
            )
            return
        } else {
            k -= 9 * a * b
            a *= 10
            b++
        }
    }
}
