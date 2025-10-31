package backjoon2805

lateinit var trees: List<Int>

fun check(mid: Long, k: Int): Boolean {
    return k <= trees.sumOf { maxOf(it - mid, 0) }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    trees = readln().split(" ").map { it.toInt() }

    var low = 0L
    var high = Int.MAX_VALUE + 1L
    while (low + 1 < high) {
        val mid = (low + high) / 2

        if (check(mid, m)) low = mid
        else high = mid
    }

    println(low)
}
