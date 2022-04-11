/**
 * @author Jaeguk Cho
 */

fun main() {
    readln()
    readln().split(' ').asSequence()
        .map { it.toInt() }
        .withIndex()
        .distinctBy { it.value }
        .sortedBy { it.value }
        .map { it.index + 1 }
        .toList()
        .also {
            println(
                if (it.size < 3) "-1 -1 -1"
                else "${it[0]} ${it[1]} ${it[2]}"
            )
        }
}
