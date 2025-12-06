package backjoon2606

lateinit var graph: List<MutableList<Int>>
lateinit var visited: BooleanArray
var ans = -1

fun dfs(start: Int) {
    val stack = ArrayDeque<Int>()

    visited[start] = true
    stack.addLast(start)
    while (stack.isNotEmpty()) {
        val current = stack.removeLast()

        ans++
        graph[current].forEach {
            if (!visited[it]) {
                visited[it] = true
                stack.addLast(it)
            }
        }
    }
}

fun main() {
    val n = readln().toInt()
    graph = List(n + 1) { mutableListOf() }
    visited = BooleanArray(n + 1)

    repeat(readln().toInt()) {
        val (u, v) = readln().split(" ").map { it.toInt() }

        graph[u] += v
        graph[v] += u
    }

    dfs(1)

    println(ans)
}
