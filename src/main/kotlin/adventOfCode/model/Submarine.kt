package adventOfCode.model

/**
 * @author Jaeguk Cho
 */

data class Submarine(
    var position: Int = 0,
    var depth: Int = 0,
    var aim: Int = 0,
) {
    fun move(info: String) {
        info.substringAfter(' ').toInt().let {
            when (info.substringBefore(' ')) {
                "forward" -> position += it
                "down" -> depth += it
                "up" -> depth -= it
            }
        }
    }

    fun advancedMove(info: String) {
        info.substringAfter(' ').toInt().let {
            when (info.substringBefore(' ')) {
                "forward" -> {
                    position += it
                    depth += aim * it
                }
                "down" -> aim += it
                "up" -> aim -= it
            }
        }
    }
}
