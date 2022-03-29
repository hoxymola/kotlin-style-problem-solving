/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readLine()!!.toInt()) {
    readLine()
    println(
        readLine()!!.split(' ').map { it.toInt() }
            .zipWithNext().firstOrNull { it.first % 2 == it.second % 2 }
            ?.let { "YES" } ?: "NO"
    )
}
