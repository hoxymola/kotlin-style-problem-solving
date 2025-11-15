fun main() = with(StringBuilder()) {
    val words = List(readln().toInt()) { readln() }

    words.distinct()
        .sortedWith(compareBy({ it.length }, { it }))
        .forEach { appendLine(it) }

    println(toString())
}
