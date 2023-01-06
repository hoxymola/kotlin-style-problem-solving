/**
 * @author Jaeguk Cho
 */

fun main() = with(ArrayDeque<Int>()) {
    readln()
    readln().split(' ').map { it.toInt() }.reversed()
        .forEachIndexed { card, tech ->
            when (tech) {
                1 -> addFirst(card)
                2 -> add(1, card)
                3 -> addLast(card)
            }
        }
    println(joinToString(" ") { "${it + 1}" })
}
