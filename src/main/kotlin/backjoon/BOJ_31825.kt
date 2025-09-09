package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (_, q) = readln().split(" ").map { it.toInt() }
    val s = readln().toMutableList()

    repeat(q) {
        val (op, l, r) = readln().split(" ").map { it.toInt() }

        when (op) {
            1 -> println(s.subList(l - 1, r).zipWithNext { a, b -> a != b }.count { it } + 1)

            2 -> for (i in l - 1 until r) {
                if (s[i] == 'Z') s[i] = 'A'
                else s[i] = s[i] + 1
            }
        }
    }
}
