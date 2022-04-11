/**
 * @author Jaeguk Cho
 */

fun main() {
    val cnt = IntArray(53)
    readln()
    readln().split(' ').forEach { cnt[it.toInt()]++ }
    readln().toCharArray().forEach {
        cnt[when (it) {
            ' ' -> 0
            it.uppercaseChar() -> it - 'A' + 1
            else -> it - 'a' + 27
        }]--
    }
    for (i in cnt) {
        if (i != 0) {
            println("n")
            return
        }
    }
    println("y")
}
