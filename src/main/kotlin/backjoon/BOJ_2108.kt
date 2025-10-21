import kotlin.math.roundToInt

fun main() {
    val n = readln().toInt()
    val nums = List(n) { readln().toInt() }.sorted()
    val frequency = nums.groupingBy { it }.eachCount()
    val maxCnt = frequency.maxOf { it.value }
    val mode = frequency.filter { it.value == maxCnt }.keys.sorted()

    println((nums.sum().toDouble() / n).roundToInt())
    println(nums[n / 2])
    println(
        if (mode.size == 1) mode[0]
        else mode[1]
    )
    println(nums.last() - nums.first())
}
