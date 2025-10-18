fun main() {
    val n = readln().toInt()
    val members = MutableList(n) { readln().split(" ") }
        .map { it[0].toInt() to it[1] }

    members.sortedBy { it.first }
        .forEach { println("${it.first} ${it.second}") }
}
