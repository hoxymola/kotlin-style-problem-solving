/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(val no: Int) {
        var depth = -1
        val connections = mutableListOf<Int>()
    }

    val (n, m, r) = readln().split(' ').map { it.toInt() }
    val graph = List(n) { Node(it) }
    val visited = MutableList(n) { false }

    repeat(m) {
        readln().split(' ').map { it.toInt() - 1 }.also {
            graph[it[0]].connections.add(it[1])
            graph[it[1]].connections.add(it[0])
        }
    }

    fun dfs(n: Int, depth: Int) {
        if (visited[n]) return
        graph[n].apply {
            visited[no] = true
            this.depth = depth
            connections.sortedDescending().forEach { dfs(it, depth + 1) }
        }
    }

    dfs(r - 1, 0)
    println(graph.joinToString("\n") { it.depth.toString() })
}
