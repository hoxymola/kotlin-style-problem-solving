/**
 * @author Jaeguk Cho
 */

fun main() {
    println((1..30).toMutableList().apply { removeAll(List(28) { readln().toInt() }) }.joinToString("\n"))
}
