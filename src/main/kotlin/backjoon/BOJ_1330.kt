fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }

    println(
        when {
            a > b -> ">"
            a < b -> "<"
            else -> "=="
        }
    )
}
