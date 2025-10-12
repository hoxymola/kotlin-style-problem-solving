package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val puzzle = List(n) { readln() }
    var answer = 0

    for (i in 0 until n) {
        for (j in 0 until m - 1) {
            if (puzzle[i][j] == 'X' && puzzle[i][j + 1] == 'Y' ||
                puzzle[i][j] == 'Y' && puzzle[i][j + 1] == 'X'
            ) {
                answer++
            }
        }
    }

    for (j in 0 until m) {
        for (i in 0 until n - 1) {
            if (puzzle[i][j] == 'X' && puzzle[i + 1][j] == 'Y' ||
                puzzle[i][j] == 'Y' && puzzle[i + 1][j] == 'X'
            ) {
                answer++
            }
        }
    }

    println(answer)
}
