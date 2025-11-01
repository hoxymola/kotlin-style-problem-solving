package backjoon11650

data class Point(
    val x: Int,
    val y: Int,
)

fun main() = with(StringBuilder()) {
    List(readln().toInt()) { readln().split(" ").map { it.toInt() } }
        .map { Point(it[0], it[1]) }
        .sortedWith(compareBy(Point::x, Point::y))
        .forEach { appendLine("${it.x} ${it.y}") }

    println(toString())
}
