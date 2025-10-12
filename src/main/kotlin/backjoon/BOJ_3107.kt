package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val ipv6 = readln().split(":")
    val index = ipv6.indexOf("")

    println(
        when {
            ipv6.first().isEmpty() -> List(10 - ipv6.size) { "" } + ipv6.drop(2)
            ipv6.last().isEmpty() -> ipv6.dropLast(2) + List(10 - ipv6.size) { "" }
            index != -1 -> ipv6.take(index) + List(9 - ipv6.size) { "" } + ipv6.drop(index + 1)
            else -> ipv6
        }.joinToString(":") { it.padStart(4, '0') }
    )
}
