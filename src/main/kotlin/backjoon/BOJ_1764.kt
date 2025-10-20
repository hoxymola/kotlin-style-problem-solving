fun main() = with(StringBuilder()) {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val unheard = hashSetOf<String>()
    val unheardAndUnseen = mutableListOf<String>()

    repeat(n) { unheard.add(readln()) }
    repeat(m) {
        val name = readln()
        if (name in unheard) unheardAndUnseen += name
    }

    appendLine(unheardAndUnseen.size)
    unheardAndUnseen.sorted().forEach { appendLine(it) }

    println(toString())
}
