/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Shark(
        val no: Int,
        val size: Int,
        val speed: Int,
        val iq: Int,
    ) {
        val edible = mutableListOf<Int>()

        fun edible(prey: Shark): Boolean {
            return if (size == prey.size && speed == prey.speed && iq == prey.iq) {
                no > prey.no
            } else size >= prey.size && speed >= prey.speed && iq >= prey.iq
        }
    }

    val n = readln().toInt()
    val graph = mutableListOf<Shark>()
    val match = MutableList(n) { -1 }
    var ans = n

    fun dfs(no: Int, visited: MutableList<Boolean>): Boolean {
        graph[no].edible.forEach {
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
        val (size, speed, iq) = readln().split(' ').map { it.toInt() }
        graph += Shark(it, size, speed, iq)
    }

    graph.forEach { predator ->
        graph.forEachIndexed { i, prey ->
            if (predator.edible(prey)) predator.edible += i
        }
    }.also { graph.addAll(graph) }

    repeat(2 * n) {
        val visited = MutableList(n) { false }
        if (dfs(it, visited)) ans--
    }
    println(ans)
}
