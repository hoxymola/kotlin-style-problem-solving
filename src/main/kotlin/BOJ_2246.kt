/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Condo(val dist: Int, val cost: Int)

    var answer = 0
    List(readln().toInt()) { readln().split(' ').map { it.toInt() } }
        .map { Condo(it[0], it[1]) }
        .also { condos ->
            condos.forEach { condo ->
                if (condos.none {
                        (it.dist < condo.dist && it.cost <= condo.cost) ||
                            (it.cost < condo.cost && it.dist <= condo.dist)
                    }
                ) answer++
            }
        }
    println(answer)
}
