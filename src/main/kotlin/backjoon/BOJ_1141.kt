package backjoon1141

fun main() {
    val n = readln().toInt()
    val words = List(n) { readln() }.sortedBy { it.length }
    var ans = n

    words.forEachIndexed { i, word ->
        if (words.drop(i + 1).any { it.startsWith(word) }) ans--
    }

    println(ans)
}
