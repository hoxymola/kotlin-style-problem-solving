package backjoon

/**
 * @author Jaeguk Cho
 */

fun List<MutableList<Int>>.pool(
    y: Int,
    x: Int,
    d: Int,
) {
    this[y][x] = listOf(
        this[y][x],
        this[y][x + d],
        this[y + d][x],
        this[y + d][x + d]
    ).sorted()[2]
}

fun main() {
    val n = readln().toInt()
    var d = 1
    val matrix = List(n) { readln().split(" ").map { it.toInt() }.toMutableList() }

    while (n != d) {
        for (i in 0 until n step d * 2) {
            for (j in 0 until n step d * 2) {
                matrix.pool(i, j, d)
            }
        }

        d *= 2
    }

    println(matrix[0][0])
}
