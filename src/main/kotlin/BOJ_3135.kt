import java.lang.Math.abs
import java.lang.Math.min

/**
 * @author Jaeguk Cho
 */
fun main() {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }

    var ans = abs(a - b)
    val n = readLine()!!.toInt()
    for (i in 1..n) ans = min(ans, abs(readLine()!!.toInt() - b) + 1)
    println(ans)
}
