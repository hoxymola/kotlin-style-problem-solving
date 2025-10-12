package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() = println(List(readln().toInt()) { readln().split(" ").map { it.toInt() }.let { it[0] * it[1] } }.sum())
