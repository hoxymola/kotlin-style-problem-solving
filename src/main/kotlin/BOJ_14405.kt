/**
 * @author Jaeguk Cho
 */

fun main() {
    println(
        if (readln().matches("(pi|ka|chu)+".toRegex())) "YES"
        else "NO"
    )
}
