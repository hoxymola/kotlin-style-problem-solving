/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    println(if (readln().matches("(aaa|aa|bbb|bb)+".toRegex())) "YES" else "NO")
}
