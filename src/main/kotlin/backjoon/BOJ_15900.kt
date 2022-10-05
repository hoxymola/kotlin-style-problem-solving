/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(val num: Int) {
        val connections = mutableListOf<Int>()
        var visited = false
        var depth = -1
    }

    val n = readln().toInt()
    val tree = List(n) { Node(it) }

    repeat(n - 1) {
        readln().split(' ').map { it.toInt() - 1 }.also {
            tree[it[0]].connections.add(it[1])
            tree[it[1]].connections.add(it[0])
        }
    }

    fun dfs(n: Int, depth: Int) {
        if (tree[n].visited) return
        tree[n].apply {
            visited = true
            this.depth = depth
            connections.forEach { dfs(it, depth + 1) }
        }
    }

    dfs(0, 0)
    println(
        if (tree.filter { it.connections.size == 1 }.sumOf { it.depth } % 2 == 1) "Yes"
        else "No"
    )
}
