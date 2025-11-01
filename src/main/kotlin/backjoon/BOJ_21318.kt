package backjoon21318

fun main() = with(StringBuilder()) {
    val n = readln().toInt()
    val difficulties = readln().split(" ").map { it.toInt() }
    val prefixSum = difficulties.zipWithNext { a, b ->
        if (a > b) 1 else 0
    }.scan(0) { a, b -> a + b }

    repeat(readln().toInt()) {
        val (x, y) = readln().split(" ").map { it.toInt() - 1 }

        appendLine(prefixSum[y] - prefixSum[x])
    }

    println(toString())
}
