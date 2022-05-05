/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readln().split(' ').sumOf { it.reversed().toInt() }.toString().reversed().toInt()
)
