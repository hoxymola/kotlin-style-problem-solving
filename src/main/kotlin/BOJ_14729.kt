import java.text.DecimalFormat

/**
 * @author Jaeguk Cho
 */

fun main() {
    val arr = List(readLine()!!.toInt()) { readLine()!!.toDouble() }.sorted()
    for (i in 0..6)
        println(DecimalFormat(".000").format(arr[i]))
}
