fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    println("${numbers.minOrNull()} ${numbers.maxOrNull()}")
}
