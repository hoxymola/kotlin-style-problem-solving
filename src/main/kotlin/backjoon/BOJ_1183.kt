import kotlin.math.abs

fun main() {
    val n = readln().toInt()
    val times = List(n) { readln().split(" ").map { it.toInt() } }
        .map { it[0] - it[1] }.sorted()

    println(
        if (n % 2 == 1) 1
        else abs(times[n / 2] - times[n / 2 - 1]) + 1
    )
}
