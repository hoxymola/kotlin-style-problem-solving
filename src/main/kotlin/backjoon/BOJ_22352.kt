import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(' ').map { it.toInt() }
    val before = List(n) { readln().split(' ').map { it.toInt() }.toMutableList() }
    val after = List(n) { readln().split(' ').map { it.toInt() } }.also { if (it == before) return println("YES") }
    val visited = List(n) { MutableList(m) { false } }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val dy = listOf(0, 0, -1, 1)
    val dx = listOf(-1, 1, 0, 0)
    val (y, x) = before.flatten().zip(after.flatten()).map { it.first - it.second }
        .indexOfFirst { it != 0 }.let { it / m to it % m }
    val beforeValue = before[y][x]
    val afterValue = after[y][x]

    visited[y][x] = true
    queue.offer(y to x)
    while (queue.isNotEmpty()) {
        val (y, x) = queue.poll()

        before[y][x] = afterValue
        repeat(4) {
            val ny = y + dy[it]
            val nx = x + dx[it]

            if (ny in 0 until n && nx in 0 until m && !visited[ny][nx] && before[ny][nx] == beforeValue) {
                visited[ny][nx] = true
                queue.offer(ny to nx)
            }
        }
    }
    println(if (before == after) "YES" else "NO")
}
