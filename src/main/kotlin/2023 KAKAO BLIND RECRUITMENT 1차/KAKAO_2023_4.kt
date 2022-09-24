package `2023 KAKAO BLIND RECRUITMENT 1차`

/**
 * @author Jaeguk Cho
 */

// not solved
class KAKAO_2023_4 {
    fun solution(numbers: LongArray): IntArray {
        var answer: IntArray = intArrayOf()

        numbers.forEach {
            val binary = it.toString(2)

            answer += when (binary.length) {
                in 1..3 -> if (binary.all { it == '1' }) 1 else 0
                in listOf(5, 13, 29) -> if (binary.filterIndexed { i, _ -> i % 2 == 0 }.all { it == '1' }) 1 else 0
                in listOf(2, 6, 14, 30) -> if (binary.filterIndexed { i, _ -> i % 2 == 1 }.all { it == '1' } xor
                    binary.filterIndexed { i, _ -> i % 2 == 0 }.all { it == '1' }) 1 else 0
                in listOf(7, 15, 31) -> if (binary.filterIndexed { i, _ -> i % 2 == 1 }.all { it == '1' }) 1 else 0
                else -> 0
            }
        }

        return answer
    }
}
