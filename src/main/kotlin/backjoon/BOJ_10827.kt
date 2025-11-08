package backjoon10827

fun main() {
    val (a, b) = readln().split(" ")
        .let { it[0].toBigDecimal() to it[1].toInt() }

    println(a.pow(b).toPlainString())
}
