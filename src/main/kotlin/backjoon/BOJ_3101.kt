package backjoon

/**
 * @author Jaeguk Cho
 */

enum class Direction(
    val dy: Int,
    val dx: Int,
) {
    U(-1, 0),
    D(1, 0),
    L(0, -1),
    R(0, 1),
    ;
}

fun getValue(
    n: Long,
    y: Int,
    x: Int,
): Long {
    return if (y + x < n) { // 정사각형의 왼쪽 위 절반
        val z = y + x
        val z2d = z.toDouble()

        if (z % 2 == 0) { // 짝수 줄 (왼쪽 아래 -> 오른쪽 위)
            ((z2d + 2) * (z2d + 2) / 2 - 3 * (z2d + 2) / 2 + 2 + x).toLong()
        } else { // 홀수 줄 (오른쪽 위 -> 왼쪽 아래)
            ((z2d + 1) * (z2d + 1) / 2 - (z2d + 1) / 2 + 1 + y).toLong()
        }
    } else { // 정사각형의 오른쪽 아래 절반
        val z = 2 * (n - 1).toInt() - (y + x)
        val z2d = z.toDouble()

        if (z % 2 == 0) { // 짝수 줄 (왼쪽 아래 -> 오른쪽 위)
            n * n + 1 - ((z2d + 2) * (z2d + 2) / 2 - 3 * (z2d + 2) / 2 + 2 + (n - 1 - x)).toLong()
        } else { // 홀수 줄 (오른쪽 위 -> 왼쪽 아래)
            n * n + 1 - ((z2d + 1) * (z2d + 1) / 2 - (z2d + 1) / 2 + 1 + (n - 1 - y)).toLong()
        }
    }
}

fun main() {
    val (n, _) = readln().split(" ").map { it.toLong() }
    val movements = readln()
    var answer = 1L
    var y = 0
    var x = 0

    movements.forEach {
        val direction = Direction.valueOf(it.toString())
        y = y + direction.dy
        x = x + direction.dx

        answer += getValue(n, y, x)
    }

    println(answer)
}
