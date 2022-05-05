/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(' ').map { it.toInt() }
    val result = MutableList(m) { 0 }
    val visited = MutableList(n + 1) { false }

    fun backTrack(c: Int): Unit =
        if (c == m) println(result.joinToString(" "))
        else for (i in 1..n)
            if (!visited[i]) {
                visited[i] = true
                result[c] = i
                backTrack(c + 1)
                visited[i] = false
            }


    backTrack(0)
}
