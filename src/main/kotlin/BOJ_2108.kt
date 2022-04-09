import kotlin.math.roundToInt

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val arr = List(n) { readln().toInt() }

    println((arr.sum().toDouble() / n).roundToInt())
    println(arr.sorted()[n / 2])
    val frequency = arr.groupingBy { it }.eachCount()
    val maxValue = frequency.maxOf { it.value }
    val maxFrequency = frequency.filter { it.value == maxValue }.keys.sorted()
    println(
        if (maxFrequency.size == 1) maxFrequency[0]
        else maxFrequency[1]
    )
    println(arr.maxOrNull()!! - arr.minOrNull()!!)
}
