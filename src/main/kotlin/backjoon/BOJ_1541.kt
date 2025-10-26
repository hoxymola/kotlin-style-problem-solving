package backjoon1541

fun main() = println(
    readln().split("-")
        .map { it.split("+").sumOf(String::toInt) }
        .reduce(Int::minus)
)
