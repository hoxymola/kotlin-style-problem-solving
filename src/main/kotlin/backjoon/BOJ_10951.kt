fun main() {
    while (true) {
        val (a, b) = readLine()?.split(" ")?.map { it.toInt() } ?: return

        println(a + b)
    }
}
