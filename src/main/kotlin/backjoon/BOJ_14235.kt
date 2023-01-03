import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() = with(PriorityQueue<Int>(Collections.reverseOrder())) {
    repeat(readln().toInt()) {
        when (val present = readln().trim().split(' ').map { it.toInt() }.drop(1)) {
            emptyList<Int>() -> println(if (isEmpty()) -1 else poll())
            else -> addAll(present)
        }
    }
}
