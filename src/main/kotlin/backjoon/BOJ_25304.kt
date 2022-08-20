/**
 * @author Jaeguk Cho
 */

fun main() = println("Yes".takeIf {
    readln().toInt() == List(readln().toInt()) {
        readln().split(' ').map { it.toInt() }
    }.sumOf { it.reduce(Int::times) }
} ?: "No")
