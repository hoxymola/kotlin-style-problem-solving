/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readLine()!!.toInt()) {
    val arr = readLine()!!
    val bigger = '<' in arr
    val smaller = '>' in arr

    println(
        when {
            bigger && smaller -> "?"
            bigger -> "<"
            smaller -> ">"
            else -> "="
        }
    )
}
