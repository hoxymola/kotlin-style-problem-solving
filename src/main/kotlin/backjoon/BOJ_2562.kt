fun main() {
    val numbers = List(9) { readln().toInt() }
    val max = numbers.maxOrNull()

    println(max)
    println(numbers.indexOfFirst { it == max } + 1)
}
