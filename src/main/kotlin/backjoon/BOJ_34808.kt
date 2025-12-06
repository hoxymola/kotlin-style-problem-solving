package backjoonAAAAA

fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }

    if (n != 1 && m != 1) return println(-1)
    if (k == 0 && n * m > 2) return println(-1)

    val area = List(n) { i ->
        List(m) { j ->
            if ((i + j) % 2 == 0) 1 + (1L + k) * (i + j) / 2
            else 1 + k + (1L + k) * (i + j - 1) / 2
        }
    }

    area.forEach { println(it.joinToString(" ")) }
}
