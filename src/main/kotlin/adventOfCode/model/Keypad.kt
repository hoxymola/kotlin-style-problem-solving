package adventOfCode.model

/**
 * @author Jaeguk Cho
 */

data class Keypad(
    var y: Int = 3,
    var x: Int = 1
) {
    companion object {
        val keypad = listOf(
            listOf(0, 0, 0, 0, 0, 0, 0),
            listOf(0, 0, 0, 1, 0, 0, 0),
            listOf(0, 0, 2, 3, 4, 0, 0),
            listOf(0, 5, 6, 7, 8, 9, 0),
            listOf(0, 0, 10, 11, 12, 0, 0),
            listOf(0, 0, 0, 13, 0, 0, 0),
            listOf(0, 0, 0, 0, 0, 0, 0)
        )
    }

    fun move(direction: String): Int {
        direction.forEach {
            when (it) {
                'U' -> y = (y - 1).takeIf { 0 < y } ?: y
                'L' -> x = (x - 1).takeIf { 0 < x } ?: x
                'D' -> y = (y + 1).takeIf { y < 2 } ?: y
                else -> x = (x + 1).takeIf { x < 2 } ?: x
            }
        }
        return y * 3 + x + 1
    }

    fun newMove(direction: String): Char {
        direction.forEach {
            when (it) {
                'U' -> y = (y - 1).takeIf { keypad[y - 1][x] != 0 } ?: y
                'L' -> x = (x - 1).takeIf { keypad[y][x - 1] != 0 } ?: x
                'D' -> y = (y + 1).takeIf { keypad[y + 1][x] != 0 } ?: y
                else -> x = (x + 1).takeIf { keypad[y][x + 1] != 0 } ?: x
            }
        }
        return with(keypad[y][x]) {
            if (this <= 9) '0' + this
            else 'A' + this - 10
        }
    }
}


