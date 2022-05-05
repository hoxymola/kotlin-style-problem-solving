/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    println(
        "Division " + when (readln().toInt()) {
            in 1900..5000 -> "1"
            in 1600..1899 -> "2"
            in 1400..1599 -> "3"
            else -> "4"
        }
    )
}
