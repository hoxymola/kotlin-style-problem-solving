/**
 * @author Jaeguk Cho
 */

fun main() = with(StringBuilder()) {
    val (_, q) = readln().split(' ').map { it.toInt() }
    val prefix = readln().split(' ').map { it.toInt() }.sorted().runningFold(0, Int::plus)
    repeat(q) { append(readln().split(' ').map { it.toInt() }.let { "${prefix[it[1]] - prefix[it[0] - 1]}\n" }) }
    println(this)
}
