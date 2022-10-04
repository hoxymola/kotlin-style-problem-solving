/**
 * @author Jaeguk Cho
 */

fun main() {
    tailrec fun String.isPalindrome(l: Int, r: Int): Boolean = when {
        l >= r -> true
        this[l] == this[r] -> isPalindrome(l + 1, r - 1)
        else -> false
    }

    println(with(readln()) {
        when {
            !isPalindrome(0, length - 1) -> length
            groupBy { it }.size == 1 -> -1
            else -> length - 1
        }
    })
}
