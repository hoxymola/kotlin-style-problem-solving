package backjoon

/**
 * @author Jaeguk Cho
 */

fun gcd(a: Int, b: Int): Int {
    if (b == 0) return a
    return gcd(b, a % b)
}

fun main() {
    val c = readln().toInt()
    val gcd = Array(1001) { IntArray(1001) }

    for (i in 1..1000) {
        for (j in i + 1..1000) {
            gcd[i][j] = gcd(i, j)
        }
    }

    repeat(c) {
        val n = readln().toInt()
        var answer = 0

        for (i in 1..n) {
            for (j in i + 1..n) {
                if (gcd[i][j] == 1) answer++
            }
        }

        println(2 * answer + 3)
    }
}
