package backjoon16499

fun main() {
    val hashSet = HashSet<String>()

    repeat(readln().toInt()) {
        hashSet += readln().toList().sorted().joinToString("")
    }

    println(hashSet.size)
}
