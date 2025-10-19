fun main() = with(StringBuilder()) {
    List(readln().toInt()) { readln().toInt() }
        .sorted().forEach { appendLine(it) }

    println(toString())
}
