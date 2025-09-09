package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val m = readln().reversed()
    val k = readln().toInt()

    println(
        if (m.take(k).all { it == '0' }) "YES"
        else "NO"
    )
}
