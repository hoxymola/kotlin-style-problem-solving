package adventOfCode.model

/**
 * @author Jaeguk Cho
 */
data class Location(
    val visited: MutableSet<Pair<Int, Int>>,
    var y: Int = 0,
    var x: Int = 0,
) {
    fun move(direction: Char) =
        when (direction) {
            '^' -> y++
            'v' -> y--
            '>' -> x++
            else -> x--
        }.also { visited.add(y to x) }
}
