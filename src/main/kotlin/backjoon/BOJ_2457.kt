import java.time.LocalDate

/**
 * @author Jaeguk Cho
 */

fun main() {
    val startDate = LocalDate.of(2022, 3, 1)
    val endDate = LocalDate.of(2022, 11, 30)
    val blossoms = List(readln().toInt()) {
        readln().split(' ').map { it.toInt() }
            .let { LocalDate.of(2022, it[0], it[1]) to LocalDate.of(2022, it[2], it[3]) }
    }
    var bloom = startDate
    var answer = 0

    while (bloom <= endDate) {
        val nextBloom = blossoms.filter { it.first <= bloom }.maxOfOrNull { it.second } ?: bloom
        if (nextBloom == bloom) {
            println(0)
            return
        }
        bloom = nextBloom
        answer++
    }
    println(answer)
}
