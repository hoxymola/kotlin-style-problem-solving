/**
 * @author Jaeguk Cho
 */

fun main() {
    readln()
    println(1.takeIf { readln().split(' ').map { it.first() }.groupBy { it }.size == 1 } ?: 0)
}
