package backjoon11724

lateinit var graph: List<MutableList<Int>>
lateinit var visited: BooleanArray

fun dfs(start: Int) {
    val stack = ArrayDeque<Int>()

    visited[start] = true
    stack.addLast(start)
    while (stack.isNotEmpty()) {
        val current = stack.removeLast()

        graph[current].forEach {
            if (!visited[it]) {
                visited[it] = true
                stack.addLast(it)
            }
        }
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    graph = List(n + 1) { mutableListOf() }
    visited = BooleanArray(n + 1)
    var ans = 0

    repeat(m) {
        val (u, v) = readln().split(" ").map { it.toInt() }

        graph[u] += v
        graph[v] += u
    }

    (1..n).forEach {
        if (!visited[it]) {
            dfs(it)
            ans++
        }
    }

    println(ans)
}
