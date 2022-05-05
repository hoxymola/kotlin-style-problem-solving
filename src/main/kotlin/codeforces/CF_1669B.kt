/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    readln()
    println(
        readln().split(' ').groupBy { it }
            .map { it.key to it.value.count() }
            .firstOrNull { it.second >= 3 }
            ?.first ?: "-1"
    )
}
