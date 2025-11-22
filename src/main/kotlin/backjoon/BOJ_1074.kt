package backjoon1074

val n1 = listOf(listOf(0, 1), listOf(2, 3))

fun z(n: Int, r: Int, c: Int, b: Int) {
    val p = 1 shl (n - 1)

    if (n == 1) println(b + n1[r][c])
    else z(n - 1, r % p, c % p, b + p * p * n1[r / p][c / p])
}

fun main() {
    val (n, r, c) = readln().split(" ").map { it.toInt() }

    z(n, r, c, 0)
}
