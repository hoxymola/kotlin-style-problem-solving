/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, k) = readln().split(' ').map { it.toInt() }
    val list = readln().split(' ').map { it.toInt() }.toMutableList()
    var answer: Pair<Int, Int>? = null
    var count = 0

    fun swap(i: Int, j: Int) {
        list[i] = list[j].also { list[j] = list[i] }
        if (k == ++count) answer = list[i] to list[j]
    }

    for (i in n - 1 downTo 1) {
        for (j in 0 until i) {
            if (list[j] > list[j + 1]) swap(j, j + 1)
        }
    }
    println(answer?.let { "${it.first} ${it.second}" } ?: -1)
}
