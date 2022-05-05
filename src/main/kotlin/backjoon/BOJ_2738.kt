/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(' ').map { it.toInt() }
    val (a, b) = List(2) { List(n) { readln().split(' ').map { it.toInt() } }.flatten() }
    println(
        a.zip(b).map { it.first + it.second }.chunked(m).joinToString("\n") { it.joinToString(" ") }
    )
}
