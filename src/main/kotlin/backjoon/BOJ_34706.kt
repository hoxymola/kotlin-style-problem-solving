package backjoon34706

fun main() = with(StringBuilder()) {
    repeat(readln().toInt()) {
        val n = readln().toInt()

        if (n % 2 == 0) {
            repeat(n / 2) {
                appendLine("${n / 2} ${2 * it + 1}")
                appendLine("${n / 2 + 1} ${2 * it + 1}")
            }
        } else {
            repeat(n) {
                appendLine("${n / 2 + 1} ${it + 1}")
            }
        }
    }

    println(toString())
}
