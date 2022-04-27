/**
 * @author Jaeguk Cho
 */

fun main() {
    operator fun List<Int>.plus(list: List<Int>) =
        mapIndexed { i, v -> v + list[i] }

    val (n, m) = readln().split(' ').map { it.toInt() }
    val (a, b) = List(2) { List(n) { readln().split(' ').map { it.toInt() } }.flatten() }
    println((a + b).chunked(m).joinToString("\n") { it.joinToString(" ") })
}
