package backjoon

import kotlin.math.sqrt

/**
 * @author Jaeguk Cho
 */

fun main() {
    readln()
    val (left, right) = readln().split(' ').map { it.toInt() }
        .let { list -> list.partition { it % 2 == list[0] % 2 } }
        .also { if (it.first.size != it.second.size) return println(-1) }
    val isPrime = List(2050) { x -> (2..sqrt(x.toDouble()).toInt()).all { x % it != 0 } }
    val graph = List(left.size) { mutableListOf<Int>() }
        .also { left.forEachIndexed { i, l -> right.forEachIndexed { j, r -> if (isPrime[l + r]) it[i] += j } } }
    var match = mutableListOf<Int>()
    val ans = mutableListOf<Int>()

    fun dfs(no: Int, visited: MutableList<Boolean>): Boolean {
        if (no == 0) return false
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

    for (i in graph[0]) {
        match = MutableList(right.size) { -1 }.also { it[i] = 0 }
        var count = 1

        repeat(graph.size) {
            val visited = MutableList(left.size) { false }
            if (dfs(it, visited)) count++
        }

        if (count == right.size) ans += right[i]
    }

    println(
        if (ans.isEmpty()) -1
        else ans.sorted().joinToString(" ")
    )
}

