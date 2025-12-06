package backjoon1629

val powerCache = HashMap<Long, Long>()
fun power(a: Long, b: Long, c: Long): Long {
    if (powerCache[b] != null) return powerCache.getValue(b)

    return when {
        b == 0L -> 1L
        b % 2 != 0L -> a * power(a, b - 1, c) % c
        else -> power(a, b / 2, c) * power(a, b / 2, c) % c
    }.also { powerCache[b] = it }
}

fun main() {
    val (a, b, c) = readln().split(" ").map { it.toLong() }

    println(power(a, b, c))
}
