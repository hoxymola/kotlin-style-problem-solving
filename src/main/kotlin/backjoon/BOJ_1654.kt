package backjoon1654

lateinit var lines: List<Int>

fun check(mid: Long, n: Int): Boolean {
    return n <= lines.sumOf { it / mid }
}

fun main() {
    val (k, n) = readln().split(" ").map { it.toInt() }
    lines = List(k) { readln().toInt() }

    var low = 0L
    var high = Int.MAX_VALUE + 1L
    while (low + 1 < high) {
        val mid = (low + high) / 2

        if (check(mid, n)) low = mid
        else high = mid
    }

    println(low)
}
