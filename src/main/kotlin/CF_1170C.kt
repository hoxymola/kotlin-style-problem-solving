/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    println(
        when ((readln() matches readln().replace("+", """(\+|--)""").toRegex())) {
            true -> "YES"
            false -> "NO"
        }
    )
}
