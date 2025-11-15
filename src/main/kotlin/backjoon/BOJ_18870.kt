package backjoon18870

fun main() {
    val n = readln().toInt()
    val x = readln().split(" ").map { it.toInt() }
    val indexMap = x.distinct().sorted()
        .withIndex().associate { it.value to it.index }

    println(x.joinToString(" ") { "${indexMap[it]}" })
}
