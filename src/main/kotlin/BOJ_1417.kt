import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readLine()!!.toInt()
    var vote = readLine()!!.toInt()
    var ans = 0
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    repeat(n - 1) {
        pq.add(readLine()!!.toInt())
    }

    while (!pq.isEmpty() && vote <= pq.peek()) {
        vote++
        ans++
        pq.add(pq.poll() - 1)
    }
    println(ans)
}
