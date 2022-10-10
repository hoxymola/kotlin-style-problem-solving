/**
 * @author Jaeguk Cho
 */

fun main() = println(List(readln().toInt()) { readln().split(' ').sumOf { it.toInt() } }.joinToString("\n"))
