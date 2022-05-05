package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() = with(readLines("2015_01").first()) {
    println(count { it == '(' } - count { it == ')' })
}
