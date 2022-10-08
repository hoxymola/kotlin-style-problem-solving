/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, k) = readln().split(' ').map { it.toInt() }
    val list = readln().split(' ').map { it.toInt() }.toMutableList()
    var answer: List<Int>? = null
    var count = 0

    fun swap(i: Int, j: Int) {
        list[i] = list[j].also { list[j] = list[i] }
        if (k == ++count) answer = list.map { it }
    }

    for (i in n - 1 downTo 1) {
        for (j in 0 until i) {
            if (list[j] > list[j + 1]) swap(j, j + 1)
        }
    }
    println(answer?.joinToString(" ") ?: -1)
}
