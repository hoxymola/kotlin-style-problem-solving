fun main() {
    while (true) {
        try {
            val (a, b) = readln().split(" ").map { it.toInt() }

            println(a + b)
        } catch (_: Exception) {
            return
        }
    }
}
