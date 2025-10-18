data class Point(
    val x: Int,
    val y: Int,
)

fun main() {
    List(readln().toInt()) { readln().split(" ").map { it.toInt() } }
        .map { Point(it[0], it[1]) }
        .sortedWith { a, b ->
            if (a.x != b.x) a.x - b.x
            else a.y - b.y
        }.forEach { println("${it.x} ${it.y}") }
}
