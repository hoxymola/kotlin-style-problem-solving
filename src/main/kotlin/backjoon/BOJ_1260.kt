package backjoon1260

val graph = List(1001) { mutableListOf<Int>() }

fun dfs(n: Int, start: Int) = with(StringBuilder()) {
    val stack = ArrayDeque<Int>()
    val visited = BooleanArray(n + 1)

    stack.addLast(start)
    while (stack.isNotEmpty()) {
        val current = stack.removeLast()
        if (visited[current]) continue

        append("$current ")
        visited[current] = true
        graph[current].sortedDescending().forEach {
            stack.addLast(it)
        }
    }

    println(toString())
}

fun bfs(n: Int, start: Int) = with(StringBuilder()) {
    val queue = ArrayDeque<Int>()
    val visited = BooleanArray(n + 1)

    queue.addLast(start)
    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        if (visited[current]) continue

        append("$current ")
        visited[current] = true
        graph[current].sorted().forEach {
            queue.addLast(it)
        }
    }

    println(toString())
}

fun main() {
    val (n, m, v) = readln().split(" ").map { it.toInt() }

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        graph[a] += b
        graph[b] += a
    }

    dfs(n, v)
    bfs(n, v)
}
