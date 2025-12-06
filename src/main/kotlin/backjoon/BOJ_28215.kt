package backjoon28215

import kotlin.math.abs

data class Home(
    val y: Int,
    val x: Int,
)

lateinit var homes: List<Home>
lateinit var selected: MutableList<Home>

var ans = Int.MAX_VALUE

fun backtrack(n: Int, k: Int, p: Int, s: Int) {
    if (k == p) {
        // 가까운 대피소까지의 거리중 최댓값
        var maxDistance = Int.MIN_VALUE

        homes.forEach { home ->
            if (home !in selected) {

                // 모든 대피소중 가장 가까운곳
                val minDistance = selected.minOf { abs(it.y - home.y) + abs(it.x - home.x) }

                maxDistance = maxOf(maxDistance, minDistance)
            }
        }

        ans = minOf(ans, maxDistance)

        return
    }

    (s until n).forEach {
        selected[p] = homes[it]
        backtrack(n, k, p + 1, it + 1)
    }
}

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    homes = List(n) { readln().split(" ").map { it.toInt() }.let { Home(it[0], it[1]) } }
    selected = MutableList(k) { Home(0, 0) }

    if(n == k) return println(0)

    backtrack(n, k, 0, 0)

    println(ans)
}
