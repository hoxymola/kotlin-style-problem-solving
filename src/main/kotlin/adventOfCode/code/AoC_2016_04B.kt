package adventOfCode.code

import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() {
    println(
        readLines("2016_04").map {
            with(it.substringAfterLast('-').substringBefore('[').toInt()) {
                it.substringBeforeLast('-').filter { it != '-' }.map {
                    'a' + (it - 'a' + this) % 26
                }.joinToString("") to this
            }
        }.first { it.first == "northpoleobjectstorage" }.second
    )
}
