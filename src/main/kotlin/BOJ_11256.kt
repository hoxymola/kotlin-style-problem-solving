/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    var (j, n) = readln().split(' ').map { it.toInt() }
    println(
        List(n) { readln().split(' ').let { it[0].toInt() * it[1].toInt() } }
            .sortedDescending()
            .takeWhile {
                j -= it
                j > 0
            }.size + 1
    )
}
