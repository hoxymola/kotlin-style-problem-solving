import java.util.*
import kotlin.math.abs

/**
 * @author Jaeguk Cho
 */

fun main() {
    val pq = PriorityQueue<Int>() { x, y ->
        if (abs(x) == abs(y)) x - y
        else abs(x) - abs(y)
    }
    repeat(readln().toInt()) {
        when (val n = readln().toInt()) {
            0 -> println(pq.poll() ?: 0)
            else -> pq.add(n)
        }
    }
}
