package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    (10..99).map { "$it" }.forEach {
        if (it.reversed().toInt() % 4 != 0) return@forEach
        if (((it[0] - '0') + (it[1] - '0')) % 6 != 0) return@forEach
        if (it[0] == '8' || it[1] == '8') return@forEach

        println(it)
    }
}
