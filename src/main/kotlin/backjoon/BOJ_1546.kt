fun main() {
    val n = readln().toInt()
    val scores = readln().split(" ").map { it.toDouble() }
    val m = scores.maxOrNull() ?: 0.0
    val newScores = scores.map { it / m * 100 }

    println(newScores.sum() / n)
}
