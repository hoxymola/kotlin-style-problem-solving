/**
 * @author Jaeguk Cho
 */

fun main() {
    fun String.isPalindrome(l: Int, r: Int): Boolean {
        return when {
            l >= r -> true
            this[l] == this[r] -> isPalindrome(l + 1, r - 1)
            else -> false
        }
    }

    repeat(readln().toInt()) {
        println(readln().uppercase().let {
            if (it.isPalindrome(0, it.length - 1)) "Yes"
            else "No"
        })
    }
}

