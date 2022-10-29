/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    val n = readln().toInt()
    val prefix = readln().trim().split(' ').map { it.toInt() }
    val infix = readln().trim().split(' ').map { it.toInt() }
    val postfix = MutableList(n) { 0 }

    fun traverse(preL: Int, preR: Int, inL: Int, inR: Int, postL: Int, postR: Int) {
        postfix[postR] = prefix[preL]

        val inM = infix.indexOf(prefix[preL])
        val left = inM - inL
        val right = inR - inM

        if (left > 0) traverse(preL + 1, preL + left, inL, inM - 1, postL, postL + left - 1)
        if (right > 0) traverse(preR - right + 1, preR, inM + 1, inR, postR - right, postR - 1)
    }

    traverse(0, n - 1, 0, n - 1, 0, n - 1)
    println(postfix.joinToString(" "))
}
