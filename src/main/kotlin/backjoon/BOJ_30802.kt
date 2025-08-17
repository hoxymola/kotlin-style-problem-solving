package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val sizes = readln().split(" ").map { it.toInt() }
    val (t, p) = readln().split(" ").map { it.toInt() }
    var tCnt = 0

    repeat(6) {
        tCnt += (sizes[it] - 1 + t) / t
    }

    println(tCnt)
    println("${n / p} ${n % p}")
}
