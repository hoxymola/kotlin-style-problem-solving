package backjoon11399

fun main() {
    val n = readln().toInt()
    val p = readln().split(" ").map { it.toInt() }.sortedDescending()

    (0 until n).sumOf { p[it] * (it + 1) }
        .also { println(it) }
}
