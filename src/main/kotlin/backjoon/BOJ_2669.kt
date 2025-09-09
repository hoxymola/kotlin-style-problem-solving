package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val plane = List(101) { MutableList(101) { false } }
    var answer = 0

    repeat(4) {
        val (y1, x1, y2, x2) = readln().split(" ").map { it.toInt() }

        for (i in y1 until y2) {
            for (j in x1 until x2) {
                if (!plane[i][j]) answer++
                plane[i][j] = true
            }
        }
    }

    println(answer)
}
