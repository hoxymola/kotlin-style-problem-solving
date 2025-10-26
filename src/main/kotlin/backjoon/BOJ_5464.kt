package backjoon5464

import java.util.PriorityQueue

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val rs = IntArray(n + 1)
    val wk = IntArray(m + 1)
    val parkingLot = IntArray(m + 1)
    val pq = PriorityQueue((1..n).toList())
    val queue = ArrayDeque<Int>()
    var ans = 0L

    (1..n).forEach { rs[it] = readln().toInt() }
    (1..m).forEach { wk[it] = readln().toInt() }
    repeat(2 * m) {
        val car = readln().toInt()

        when {
            car > 0 -> {
                if (pq.isNotEmpty()) {
                    val place = pq.poll()

                    parkingLot[car] = place
                } else {
                    queue.add(car)
                }
            }

            car < 0 -> {
                val place = parkingLot[-car]

                ans += rs[place] * wk[-car]

                if (queue.isNotEmpty()) {
                    val newCar = queue.removeFirst()

                    parkingLot[newCar] = place
                } else {
                    pq.add(place)
                }
            }
        }
    }

    println(ans)
}
