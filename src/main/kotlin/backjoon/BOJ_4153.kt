fun main() {
    while (true) {
        val (a, b, c) = readln().split(" ").map { it.toInt() }
            .also { if (it[0] == 0) return }
            .sorted()

        println(
            if (a * a + b * b == c * c) "right"
            else "wrong"
        )
    }
}
