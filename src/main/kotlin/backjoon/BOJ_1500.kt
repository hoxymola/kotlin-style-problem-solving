package backjoon1500

import kotlin.math.roundToInt

fun main() {
    var (s, k) = readln().split(" ").map { it.toInt() }
    var ans = 1L

    (k downTo 1).forEach {
        val t = (s.toDouble() / it).roundToInt()
        ans *= t
        s -= t
    }

    println(ans)
}
