package backjoon16953bfs

val mul = listOf(2, 10)
val add = listOf(0, 1)

fun bfs(start: Long, target: Long) {
    val queue = ArrayDeque<Pair<Long, Int>>()

    queue.addLast(start to 0)
    while (queue.isNotEmpty()) {
        val (current, depth) = queue.removeFirst()

        if (current == target) return println(depth + 1)
        repeat(2) {
            val next = mul[it] * current + add[it]

            if (next <= target) {
                queue.addLast(next to depth + 1)
            }
        }
    }

    println(-1)
}

fun main() {
    val (a, b) = readln().split(" ").map { it.toLong() }

    bfs(a, b)
}
