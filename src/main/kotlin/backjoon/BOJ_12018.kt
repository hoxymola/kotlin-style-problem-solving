package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    var (n, m) = readln().trim().split(" ").map { it.toInt() }
    val mileage = mutableListOf<Int>()
    var answer = 0

    repeat(n) {
        val (_, l) = readln().trim().split(" ").map { it.toInt() }
        val othersMileage = readln().trim().split(" ").map { it.toInt() }.sortedDescending() + List(l) { 1 }

        mileage += othersMileage[l - 1]
    }

    mileage.sorted().forEach {
        if (m >= it) {
            answer++
            m -= it
        }
    }

    println(answer)
}
