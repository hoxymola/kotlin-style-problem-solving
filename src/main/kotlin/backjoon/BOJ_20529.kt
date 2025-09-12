package backjoon

/**
 * @author Jaeguk Cho
 */

fun dist(a: String, b: String): Int {
    return a.zip(b).count { it.first != it.second }
}

fun dist(a: String, b: String, c: String): Int {
    return dist(a, b) + dist(b, c) + dist(c, a)
}

fun main() = repeat(readln().toInt()) {
    val n = readln().toInt()
    val mbtiList = readln().split(" ")
    var answer = 9

    if (n > 32) return@repeat println(0)

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                answer = minOf(answer, dist(mbtiList[i], mbtiList[j], mbtiList[k]))
            }
        }
    }

    println(answer)
}
