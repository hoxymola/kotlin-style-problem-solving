package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val thr = readln().split(" ").map { it.toInt() }
    var answer = 1
    var length = 1
    var idx = 0
    var entry = listOf(thr.first())

    for (i in 1 until n) {
        if (thr[i - 1] == thr[i]) {
            length++
        } else {
            if (entry.size == 1) {
                length++
                entry = listOf(thr[i - 1], thr[i])
                idx = i
            } else {
                if (thr[i] in entry) {
                    length++
                    idx = i
                } else {
                    length = i - idx + 1
                    entry = listOf(thr[i - 1], thr[i])
                    idx = i
                }
            }
        }

        answer = answer.coerceAtLeast(length)
    }

    println(answer)
}
