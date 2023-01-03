/**
 * @author Jaeguk Cho
 */

fun main() {
    readln()
    readln().split(' ').map { it.toDouble() }.also {
        println(it.sortedDescending().reduce { a, d -> a + d / 2 })
    }
}
