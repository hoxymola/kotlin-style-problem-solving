package `2023 KAKAO BLIND RECRUITMENT 1차`

import java.time.LocalDate

/**
 * @author Jaeguk Cho
 */

class KAKAO_2023_1 {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer = intArrayOf()
        val today = today.split('.').map { it.toInt() }
            .let { LocalDate.of(it[0], it[1], it[2]) }
        val termMap = terms.map { it.split(' ').let { it[0] to it[1] } }.toMap()

        privacies.forEachIndexed { i, privacy ->
            val (date, term) = privacy.split(' ')
            val expireDate = date.split('.').map { it.toInt() }
                .let { LocalDate.of(it[0], it[1], it[2]) }
                .plusMonths(termMap[term]!!.toLong())

            if (today >= expireDate) answer += i + 1
        }

        return answer
    }
}
