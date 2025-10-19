import kotlin.math.roundToInt

fun main() {
    val n = readln().toInt()
    val numbers = List(n) { readln().toInt() }.sorted()
    val frequency = numbers.groupingBy { it }.eachCount()
    val maxCount = frequency.maxOf { it.value }
    val mode = frequency.filter { it.value == maxCount }.keys.sorted()

    println((numbers.sum().toDouble() / n).roundToInt())
    println(numbers[n / 2])
    println(
        if (mode.size == 1) mode[0]
        else mode[1]
    )
    println(numbers.last() - numbers.first())
}
