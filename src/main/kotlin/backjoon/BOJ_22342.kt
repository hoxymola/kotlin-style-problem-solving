package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val robots = List(n) { readln().map { it - '0' } }
    val inputs = List(n + 2) { MutableList(m + 2) { 0 } }
    val outputs = List(n + 2) { MutableList(m + 2) { 0 } }
    var answer = 0

    for (j in 1..m) {
        for (i in 1..n) {
            inputs[i][j] = maxOf(outputs[i - 1][j - 1], outputs[i][j - 1], outputs[i + 1][j - 1])
            outputs[i][j] = inputs[i][j] + robots[i - 1][j - 1]
            answer = maxOf(inputs[i][j], answer)
        }
    }

    println(answer)
}
