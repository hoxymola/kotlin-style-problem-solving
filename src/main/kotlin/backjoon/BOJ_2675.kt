fun main() = repeat(readln().toInt()) {
    val (r, s) = readln().split(" ")

    println(
        s.toList().joinToString("") { "$it".repeat(r.toInt()) }
    )
}
