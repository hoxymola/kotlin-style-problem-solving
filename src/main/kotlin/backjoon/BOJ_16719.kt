package backjoon16719

lateinit var visited: BooleanArray
lateinit var s: String

fun temp(l: Int, r: Int) {
    if (l > r) return

    val minValue = s.substring(l..r).minOf { it }
    val minIndex = s.withIndex().first { it.index in l..r && it.value == minValue }.index

    visited[minIndex] = true
    println(s.filterIndexed { i, _ -> visited[i] })

    temp(minIndex + 1, r)
    temp(l, minIndex - 1)
}

fun main() {
    s = readln()
    visited = BooleanArray(s.length)

    temp(0, s.length - 1)
}
