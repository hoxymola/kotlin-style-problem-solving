package backjoon1813

fun main() {
    val n = readln().toInt()
    val temp = readln().split(" ").map { it.toInt() }

    for (i in n downTo 0) {
        if (temp.count { it == i } == i) return println(i)
    }

    println(-1)
}
