package backjoon

/**
 * @author Jaeguk Cho
 */

fun List<MutableList<Int>>.rotate(): List<MutableList<Int>> {
    val n = size
    val temp = this[n / 2].toList()

    for (i in 0 until n) {
        this[n / 2][n - 1 - i] = this[i][n - 1 - i]
        this[i][n - 1 - i] = this[i][n / 2]
        this[i][n / 2] = this[i][i]
        this[i][i] = temp[i]
    }

    return this
}

fun main() = repeat(readln().toInt()) {
    val (n, d) = readln().split(" ").map { it.toInt() }
    val matrix = List(n) { readln().split(" ").map { it.toInt() }.toMutableList() }

    repeat((360 + d) % 360 / 45) { matrix.rotate() }

    println(matrix.joinToString("\n") { it.joinToString(" ") })
}
