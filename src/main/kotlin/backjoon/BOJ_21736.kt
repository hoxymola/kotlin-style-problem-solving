import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(' ').map { it.toInt() }
    val dy = listOf(0, 0, -1, 1)
    val dx = listOf(-1, 1, 0, 0)
    val campus = List(n) { readln() }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val visited = List(n) { MutableList(m) { false } }
    val (y, x) = campus.joinToString("").indexOf('I').let { it / m to it % m }
    var answer = 0

    visited[y][x] = true
    queue.offer(y to x)
    while (queue.isNotEmpty()) {
        val (y, x) = queue.poll()

        if (campus[y][x] == 'P') answer++
        repeat(4) {
            val ny = y + dy[it]
            val nx = x + dx[it]

            if (ny in 0 until n && nx in 0 until m && !visited[ny][nx] && campus[ny][nx] != 'X') {
                visited[ny][nx] = true
                queue.offer(ny to nx)
            }
        }
    }
    println(answer.takeIf { it > 0 } ?: "TT")
}
