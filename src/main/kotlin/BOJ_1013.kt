/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    println(
        if (readln().matches("(100+1+|01)+".toRegex())) "YES"
        else "NO"
    )
}
