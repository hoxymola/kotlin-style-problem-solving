/**
 * @author Jaeguk Cho
 */

fun main() = println(
    List(readln().toInt()) {
        readln().split(' ').let { it[0].toInt() to it[1].toInt() }
    }.sortedWith { p, q ->
        if (p.first != q.first) p.first - q.first
        else p.second - q.second
    }.joinToString("\n") { "${it.first} ${it.second}" }
)
