/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readLine()!!.toInt()) {
    println(
        when (val n = readLine()!!.toInt()) {
            in 0..999 -> n
            in 1000..999499 -> "${(n + 500) / 1000}K"
            else -> "${(n + 500000) / 1000000}M"
        }
    )
}
