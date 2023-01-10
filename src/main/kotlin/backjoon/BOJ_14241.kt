/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val slimes = readln().split(' ').map { it.toInt() }.sorted()
    val prefixSum = slimes.runningFold(0, Int::plus)

    println((0 until n).sumOf { slimes[it] * prefixSum[it] })
}
