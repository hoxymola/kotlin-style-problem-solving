/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    println(
        with(readln()) {
            val fullScore = map { it - 'a' + 1 }.sum()
            when {
                length % 2 == 0 -> "Alice $fullScore"
                length == 1 -> "Bob $fullScore"
                else -> "Alice ${fullScore - 2 * (minOf(first(), last()) - 'a' + 1)}"
            }
        }
    )
}
