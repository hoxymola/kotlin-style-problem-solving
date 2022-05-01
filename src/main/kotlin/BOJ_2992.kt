/**
 * @author Jaeguk Cho
 */

fun main() = with(readln()) {
    val numbers = mutableListOf<Int>()
    val visited = MutableList(length) { false }

    fun backTrack(d: Int, number: String) {
        if (d == length) numbers.add(number.toInt())
        else for (i in indices)
            if (!visited[i]) {
                visited[i] = true
                backTrack(d + 1, number + get(i))
                visited[i] = false
            }
    }

    backTrack(0, "")
    println(numbers.sorted().firstOrNull { it > toInt() } ?: 0)
}
