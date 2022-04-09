/**
 * @author Jaeguk Cho
 */

enum class Direction(val value: Int) {
    RIGHT(0), UP(1), LEFT(2), DOWN(3);

    companion object {
        fun fromInt(value: Int) = values().first { it.value == value % 4 }
    }
}

data class Robot(
    val range: Int
) {
    var y = 0
    var x = 0
    private var direction: Direction = Direction.RIGHT

    fun move(action: String, count: Int) =
        when (action) {
            "TURN" -> {
                direction = Direction.fromInt(
                    direction.value +
                        if (count == 0) 1
                        else 3
                )
            }
            "MOVE" -> when (direction) {
                Direction.RIGHT -> x += count
                Direction.UP -> y += count
                Direction.LEFT -> x -= count
                Direction.DOWN -> y -= count
            }.also {
                if (x !in 0..range || y !in 0..range)
                    throw Exception("robot out of range")
            }
            else -> throw Exception("unknown command")
        }
}

fun main() {
    val (m, n) = readln().split(' ').map { it.toInt() }
    val robot = Robot(m)

    repeat(n) {
        readln().split(' ')
            .also {
                try {
                    robot.move(it[0], it[1].toInt())
                } catch (e: Exception) {
                    println(-1)
                    return
                }
            }
    }
    println("${robot.x} ${robot.y}")
}
