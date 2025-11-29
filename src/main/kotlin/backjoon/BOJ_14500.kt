package backjoon14500

val dy = listOf(
    listOf(0, 0, 0, 0),
    listOf(0, 1, 2, 3),
    listOf(0, 0, 1, 1),
    listOf(0, 1, 2, 2),
    listOf(0, 0, 0, 1),
    listOf(0, 0, 1, 2),
    listOf(0, 1, 1, 1),
    listOf(0, 0, 1, 1),
    listOf(0, 1, 1, 2),
    listOf(0, 0, 0, 1),
    listOf(0, 1, 1, 2),
    listOf(0, 1, 1, 1),
    listOf(0, 1, 1, 2),
    listOf(0, 0, 1, 2),
    listOf(0, 1, 1, 1),
    listOf(0, 1, 2, 2),
    listOf(0, 0, 0, 1),
    listOf(0, 1, 1, 2),
    listOf(0, 0, 1, 1),
)
val dx = listOf(
    listOf(0, 1, 2, 3),
    listOf(0, 0, 0, 0),
    listOf(0, 1, 0, 1),
    listOf(0, 0, 0, 1),
    listOf(0, 1, 2, 0),
    listOf(0, 1, 1, 1),
    listOf(2, 0, 1, 2),
    listOf(1, 2, 0, 1),
    listOf(0, 0, 1, 1),
    listOf(0, 1, 2, 1),
    listOf(1, 0, 1, 1),
    listOf(1, 0, 1, 2),
    listOf(0, 0, 1, 0),
    listOf(0, 1, 0, 0),
    listOf(0, 0, 1, 2),
    listOf(1, 1, 0, 1),
    listOf(0, 1, 2, 2),
    listOf(1, 0, 1, 0),
    listOf(0, 1, 1, 2),
)

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val paper = List(n + 3) { MutableList(m + 3) { -1 } }
    var ans = 0

    for (i in 0 until n) {
        val row = readln().split(" ").map { it.toInt() }

        for (j in 0 until m) {
            paper[i][j] = row[j]
        }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            for (k in 0 until 19) {
                val tetromino = List(4) { paper[i + dy[k][it]][j + dx[k][it]] }

                if (tetromino.all { it != -1 }) ans = maxOf(ans, tetromino.sum())
            }
        }
    }

    println(ans)
}
