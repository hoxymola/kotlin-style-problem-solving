/**
 * @author Jaeguk Cho
 */

fun main() = with(ArrayDeque<Int>()) {
    for (i in 1..readln().toInt()) add(i)
    while (size != 1) {
        print("${removeFirst()} ")
        addLast(removeFirst())
    }
    println(first())
}
