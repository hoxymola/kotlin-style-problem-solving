package adventOfCode.model

import kotlin.math.absoluteValue

/**
 * @author Jaeguk Cho
 */

data class Location(
    val visited: MutableSet<Pair<Int, Int>> = mutableSetOf(0 to 0),
    var y: Int = 0,
    var x: Int = 0,
    var dir: Int = 0
) {
    fun move(direction: Char) =
        when (direction) {
            '^' -> y++
            'v' -> y--
            '>' -> x++
            else -> x--
        }.also { visited.add(y to x) }

    fun turnBeforeMove(direction: Char, amount: Int): Int {
        var answer = -1
        dir = when (direction) {
            'L' -> (dir + 1)
            else -> (dir + 3)
        } % 4
        repeat(amount) {
            when (dir) {
                0 -> y++
                1 -> x++
                2 -> y--
                else -> x--
            }.also {
                if (visited.contains(y to x)) answer = y.absoluteValue + x.absoluteValue
                visited.add(y to x)
            }
        }
        return answer
    }
}
