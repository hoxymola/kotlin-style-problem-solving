fun main() {
    val sb = StringBuilder()

    List(readln().toInt()) { readln().toInt() }.sorted()
        .forEach { sb.append("$it\n") }

    println(sb.toString())
}
