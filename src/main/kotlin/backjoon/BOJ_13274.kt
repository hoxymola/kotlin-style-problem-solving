package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val sequence = readln().split(" ").map { it.toLong() }.toMutableList()
    val tempSequence = MutableList(n) { 0L }

    repeat(k) {
        val (l, r, x) = readln().split(" ").map { it.toInt() }

        var index1l = 0
        var index1r = r
        var index2 = l - 1
        var tempIndex = 0

        while (index1l < l - 1 && index2 < r) {
            tempSequence[tempIndex++] = when {
                sequence[index1l] < sequence[index2] + x -> sequence[index1l++]
                else -> sequence[index2++] + x
            }
        }
        while (index1r < n && index2 < r) {
            tempSequence[tempIndex++] = when {
                sequence[index1r] < sequence[index2] + x -> sequence[index1r++]
                else -> sequence[index2++] + x
            }
        }
        while (index1l < l - 1) {
            tempSequence[tempIndex++] = sequence[index1l++]
        }
        while (index1r < n) {
            tempSequence[tempIndex++] = sequence[index1r++]
        }
        while (index2 < r) {
            tempSequence[tempIndex++] = sequence[index2++] + x
        }

        for (i in 0 until n) {
            sequence[i] = tempSequence[i]
        }
    }

    println(sequence.joinToString(" "))
}
