fun main() {
    val n = readln().toInt()
    val numbers = readln().map { it - '0' }

    println(numbers.sum())
}
