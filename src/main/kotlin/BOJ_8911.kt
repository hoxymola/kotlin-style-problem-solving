import kotlin.math.max
import kotlin.math.min

/**
 * @author Jaeguk Cho
 */

data class Turtle(
    var y: Int = 0,
    var x: Int = 0,
    var dir: Int = 0 // 0: Up, 1: Left, 2: Down, 3: Right
) {
    private var maxY = 0
    private var minY = 0
    private var maxX = 0
    private var minX = 0
    val area: Int
        get() = (maxY - minY) * (maxX - minX)

    fun action(cmd: Char) {
        when (cmd) {
            'F', 'B' -> move(cmd).also { update() }
            'L' -> dir = (dir + 1) % 4
            'R' -> dir = (dir + 3) % 4
        }
    }

    private fun move(cmd: Char) {
        val w = if (cmd == 'F') 1 else -1
        when (dir) {
            0 -> y += w
            1 -> x -= w
            2 -> y -= w
            3 -> x += w
        }
    }

    private fun update() {
        maxY = max(maxY, y)
        minY = min(minY, y)
        maxX = max(maxX, x)
        minX = min(minX, x)
    }
}

fun main() = repeat(readLine()!!.toInt()) {
    val turtle = Turtle()
    readLine()!!.forEach {
        turtle.action(it)
    }
    println(turtle.area)
}
