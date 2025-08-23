package backjoon

/**
 * @author Jaeguk Cho
 */

data class Square(val x1: Int, val y1: Int, val x2: Int, val y2: Int)

fun isNull(p: Square, q: Square): Boolean {
    return (q.x2 < p.x1)
        || (p.x2 < q.x1)
        || (q.y2 < p.y1)
        || (p.y2 < q.y1)
}

fun isPoint(p: Square, q: Square): Boolean {
    return (q.x1 == p.x2 && q.y2 == p.y1)
        || (p.x1 == q.x2 && p.y1 == q.y2)
        || (p.x1 == q.x2 && p.y2 == q.y1)
        || (q.x1 == p.x2 && q.y1 == p.y2)
}

fun isLine(p: Square, q: Square): Boolean {
    return (q.x2 == p.x1 && !(q.y2 < p.y1 || p.y2 < q.y1))
        || (q.y2 == p.y1 && !(q.x2 < p.x1 || p.x2 < q.x1))
        || (p.x2 == q.x1 && !(q.y2 < p.y1 || p.y2 < q.y1))
        || (p.y2 == q.y1 && !(q.x2 < p.x1 || p.x2 < q.x1))
}

fun main() {
    val p = readln().split(" ").map { it.toInt() }
        .let { Square(it[0], it[1], it[2], it[3]) }
    val q = readln().split(" ").map { it.toInt() }
        .let { Square(it[0], it[1], it[2], it[3]) }

    println(
        when {
            isNull(p, q) -> "NULL"
            isPoint(p, q) -> "POINT"
            isLine(p, q) -> "LINE"
            else -> "FACE"
        }
    )
}
