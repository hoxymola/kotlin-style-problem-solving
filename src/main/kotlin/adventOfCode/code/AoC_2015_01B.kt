package adventOfCode.code

import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() {
    readLines("2015_01").first().also {
        for (i in it.indices) {
            with(it.substring(0, i)) {
                if (count { it == '(' } < count { it == ')' }) {
                    println(i)
                    return
                }
            }
        }
    }
}
