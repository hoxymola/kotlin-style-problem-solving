/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(' ').map { it.toInt() }
    val graph = MutableList(n) { listOf<Int>() }
    val match = MutableList(m) { -1 }
    var ans = 0

    fun dfs(no: Int, visited: MutableList<Boolean>): Boolean {
        graph[no].forEach {
            if (visited[it]) return@forEach
            visited[it] = true
            if (match[it] == -1 || dfs(match[it], visited)) {
                match[it] = no
                return true
            }
        }
        return false
    }

    repeat(n) {
        graph[it] = readln().split(' ').map { it.toInt() - 1 }.drop(1)
        val visited = MutableList(m) { false }
        if (dfs(it, visited)) ans++
    }
    println(ans)
}
