import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, t, g) = readln().split(' ').map { it.toInt() }
    val visited = MutableList(100000) { false }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val dm = listOf(1, 2)
    val ds = listOf(1, 0)

    visited[n] = true
    queue.offer(n to 0)
    while (queue.isNotEmpty()) {
        val (cur, d) = queue.poll()

        if (d > t) continue
        if (cur == g) return println(d)

        repeat(2) { o ->
            val new = (cur * dm[o] + ds[o]).also { if (it !in 1..99999) return@repeat }.let { num ->
                if (o == 0) num
                else num.toString().let { it.first().dec() + it.substring(1) }.toInt()
            }

            if (new < 100000 && !visited[new]) {
                visited[new] = true
                queue.offer(new to d + 1)
            }
        }
    }
    println("ANG")
}
