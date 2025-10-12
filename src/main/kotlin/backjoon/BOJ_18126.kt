package backjoon

/**
 * @author Jaeguk Cho
 */

data class Edge(
    val t: Int,
    val v: Long,
)

fun main() {
    val n = readln().toInt()
    val graph = List(n) { mutableListOf<Edge>() }
    val visited = MutableList(n) { false }
    val dfs = mutableListOf<Pair<Int, Long>>()
    var answer = 0L

    repeat(n - 1) {
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        graph[a - 1].add(Edge(b - 1, c.toLong()))
        graph[b - 1].add(Edge(a - 1, c.toLong()))
    }

    fun dfs(
        cur: Int,
        length: Long,
    ) {
        answer = maxOf(answer, length)

        for (edge in graph[cur]) {
            if (!visited[edge.t]) {
                visited[edge.t] = true
                dfs(edge.t, length + edge.v)
                visited[edge.t] = false
            }
        }
    }

    visited[0] = true
    dfs(0, 0L)

    println(answer)
}
