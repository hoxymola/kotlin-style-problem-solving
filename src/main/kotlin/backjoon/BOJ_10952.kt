fun main() {
    while (true) {
        val (a, b) = readln().split(" ").map { it.toInt() }
            .also { if (it[0] == 0 && it[1] == 0) return }

        println(a + b)
    }
}
