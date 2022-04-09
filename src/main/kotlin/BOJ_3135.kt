import java.lang.Math.abs
import java.lang.Math.min

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (a, b) = readln().split(' ').map { it.toInt() }

    var ans = abs(a - b)
    val n = readln().toInt()
    for (i in 1..n) ans = min(ans, abs(readln().toInt() - b) + 1)
    println(ans)
}
