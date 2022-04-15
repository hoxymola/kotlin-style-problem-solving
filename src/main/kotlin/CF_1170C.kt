/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readLine()!!.toInt()) {
    println(
        when ((readLine()!! matches readLine()!!.replace("+", """(\+|--)""").toRegex())) {
            true -> "YES"
            false -> "NO"
        }
    )
}
