package backjoon1697

val visited = BooleanArray(100001)
val mul = listOf(1, 1, 2)
val add = listOf(-1, 1, 0)

fun bfs(start: Int, target: Int) {
    val queue = ArrayDeque<Pair<Int, Int>>()

    visited[start] = true
    queue.addLast(start to 0)
    while (queue.isNotEmpty()) {
        val (current, depth) = queue.removeFirst()

        if (current == target) return println(depth)
        repeat(3) {
            val next = mul[it] * current + add[it]

            if (next in 0..100000 && !visited[next]) {
                visited[next] = true
                queue.addLast(next to depth + 1)
            }
        }
    }
}

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    bfs(n, k)
}
