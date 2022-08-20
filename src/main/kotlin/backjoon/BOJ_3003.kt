/**
 * @author Jaeguk Cho
 */

fun main() {
    val black = listOf(1, 1, 2, 2, 2, 8)
    val white = readln().split(' ').map { it.toInt() }
    println(black.mapIndexed { i, c -> c - white[i] }.joinToString(" "))
}
