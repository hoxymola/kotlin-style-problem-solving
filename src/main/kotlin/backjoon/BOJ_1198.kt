package backjoon

import kotlin.math.abs

/**
 * @author Jaeguk Cho
 */

data class Point(
    val y: Int,
    val x: Int,
)

fun getArea(p1: Point, p2: Point, p3: Point): Double {
    return abs(p1.y * p2.x + p2.y * p3.x + p3.y * p1.x - p1.x * p2.y - p2.x * p3.y - p3.x * p1.y) / 2.0
}

fun main() {
    val n = readln().toInt()
    val points = List(n) { readln().split(" ").map { it.toInt() }.let { Point(it[0], it[1]) } }
    var answer = 0.0

    for (i in 0..n - 3) {
        for (j in i + 1..n - 2) {
            for (k in j + 1..n - 1) {
                answer = maxOf(answer, getArea(points[i], points[j], points[k]))
            }
        }
    }

    println(answer.toBigDecimal())
}
