package backjoon20207

data class Schedule(
    val s: Int,
    val e: Int,
)

val calendar = List(1000) { MutableList(367) { false } }
var ans = 0

fun temp(sx: Int) {
    var minY = 100
    var maxY = -1
    var minX = sx
    var maxX = sx

    var cx = sx
    while (calendar.any { it[cx] }) {
        minY = minOf(minY, calendar.indexOfFirst { it[cx] })
        maxY = maxOf(maxY, calendar.indexOfLast { it[cx] })
        maxX = maxOf(maxX, cx)
        for (i in 0 until 1000) calendar[i][cx] = false
        cx++
    }


    ans += (maxY - minY + 1) * (maxX - minX + 1)
}

fun main() {
    val n = readln().toInt()
    List(n) { readln().split(" ").map { it.toInt() } }
        .map { Schedule(it[0], it[1]) }
        .sortedWith(compareBy(Schedule::s).thenByDescending(Schedule::e))
        .forEach { (s, e) ->
            val r = calendar.indexOfFirst { !it[s] }

            for (c in s..e) {
                calendar[r][c] = true
            }
        }

    for (j in 1..365) {
        if (calendar.any { it[j] }) {
            temp(j)
        }
    }

    println(ans)
}
