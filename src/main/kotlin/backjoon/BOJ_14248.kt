import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val rocks = readln().trim().split(' ').map { it.toInt() }
    val visited = MutableList(n) { false }
    val queue: Queue<Int> = LinkedList()
    val s = readln().toInt() - 1
    var answer = 0

    visited[s] = true
    queue.offer(s)
    while (queue.isNotEmpty()) {
        val cur = queue.poll()

        answer++
        repeat(2) {
            val new = cur + rocks[cur] * if (it == 0) -1 else 1

            if (new in 0 until n && !visited[new]) {
                visited[new] = true
                queue.offer(new)
            }
        }
    }
    println(answer)
}
