/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(' ').map { it.toInt() }
    val floor = List(n) { readln() }
    val visited = List(n) { MutableList(m) { false } }
    var answer = 0

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (!visited[i][j]) {
                var ny = i
                var nx = j

                while (ny in 0 until n && nx in 0 until m && floor[ny][nx] == floor[i][j]) {
                    visited[ny][nx] = true
                    ny += (floor[i][j] == '|').compareTo(false)
                    nx += (floor[i][j] == '-').compareTo(false)
                }
                answer++
            }
        }
    }
    println(answer)
}
