package backjoon3079

lateinit var times: List<Int>

fun check(m: Long, k: Long): Boolean {
    var sum = 0L

    times.forEach {
        sum += m / it
        if (sum >= k) return true
    }

    return false
}

fun main() {
    val (n, k) = readln().split(" ").map { it.toLong() }
    times = List(n.toInt()) { readln().toInt() }

    var l = 0L
    var r = Long.MAX_VALUE / 2
    while (l + 1 < r) {
        val m = (l + r) / 2

        if (check(m, k)) r = m
        else l = m
    }

    println(r)
}
