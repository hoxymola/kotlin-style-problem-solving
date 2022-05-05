import java.text.DecimalFormat

/**
 * @author Jaeguk Cho
 */

fun main() {
    val topSeven = Array(7) { 101.0 }
    repeat(readLine()!!.toInt()) {
        topSeven.sort()
        topSeven[6] = topSeven[6].coerceAtMost(readLine()!!.toDouble())
    }
    topSeven.sorted().forEach { println(DecimalFormat("0.000").format(it)) }
}
