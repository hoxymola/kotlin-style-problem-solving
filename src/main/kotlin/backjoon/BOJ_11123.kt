import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    val (r, c) = readln().split(' ').map { it.toInt() }
    val visited = List(r) { MutableList(c) { false } }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val grid = List(r) { readln() }
    val dy = listOf(0, 0, -1, 1)
    val dx = listOf(-1, 1, 0, 0)
    var answer = 0

    repeat(r) { i ->
        repeat(c) { j ->
            if (!visited[i][j] && grid[i][j] == '#') {
                answer++
                visited[i][j] = true
                queue.offer(i to j)
                while (queue.isNotEmpty()) {
                    val (y, x) = queue.poll()

                    repeat(4) {
                        val ny = y + dy[it]
                        val nx = x + dx[it]

                        if (ny in 0 until r && nx in 0 until c && !visited[ny][nx] && grid[ny][nx] == '#') {
                            visited[ny][nx] = true
                            queue.offer(ny to nx)
                        }
                    }
                }
            }
        }
    }
    println(answer)
}
