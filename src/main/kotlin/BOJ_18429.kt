/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, k) = readln().split(' ').map { it.toInt() }
    val kit = readln().split(' ').map { it.toInt() }
    val visited = MutableList(n) { false }
    var answer = 0

    fun plan(d: Int, w: Int) {
        if (w < 500) return
        else if (d == n) answer++
        else for (i in 0 until n)
            if (!visited[i]) {
                visited[i] = true
                plan(d + 1, w + kit[i] - k)
                visited[i] = false
            }
    }

    plan(0, 500)
    println(answer)
}
