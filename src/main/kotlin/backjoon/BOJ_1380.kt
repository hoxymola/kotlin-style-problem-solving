package backjoon1380

fun main() = (1..Int.MAX_VALUE).forEach {
    val n = readln().toInt().also { if (it == 0) return }
    val girls = List(n) { readln() }
    val set = mutableSetOf<Int>()

    repeat(2 * n - 1) {
        val t = readln().substringBefore(' ').toInt()

        if (t in set) set -= t
        else set += t
    }

    println("$it ${girls[set.first() - 1]}")
}
