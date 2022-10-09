/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val listA = readln().split(' ').map { it.toInt() }.toMutableList()
    val listB = readln().split(' ').map { it.toInt() }

    fun swap(i: Int, j: Int) {
        listA[i] = listA[j].also { listA[j] = listA[i] }
    }

    for (i in n - 1 downTo 1) {
        for (j in 0 until i) {
            if (listA[j] > listA[j + 1]) {
                if (listA[i] == listB[i] && listA == listB) return println(1)
                swap(j, j + 1)
            }
        }
    }
    println((listA == listB).compareTo(false))
}
