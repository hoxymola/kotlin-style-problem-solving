package `2023 KAKAO BLIND RECRUITMENT 1차`

/**
 * @author Jaeguk Cho
 */

class KAKAO_2023_3 {
    private var maxSubscribers = 0
    private var maxSales = 0
    private val list = MutableList(10) { 0 }
    private fun brf(c: Int, users: List<List<Int>>, emoticons: List<Int>) {
        if (c == emoticons.size) {
            var subScribers = 0
            var sales = 0

            users.forEach { user ->
                var sum = 0
                emoticons.forEachIndexed { i, emoticon ->
                    if (user[0] <= list[i] * 10) {
                        sum += emoticon - emoticon * list[i] / 10
                    }
                }
                if (sum >= user[1]) {
                    subScribers++
                } else {
                    sales += sum
                }
            }

            if (maxSubscribers < subScribers) {
                maxSubscribers = subScribers
                maxSales = sales
            } else if (maxSubscribers == subScribers) {
                maxSales = maxOf(maxSales, sales)
            }
            return
        }

        for (i in 1..4) {
            list[c] = i
            brf(c + 1, users, emoticons)
        }
    }

    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        brf(0, users.map { it.toList() }, emoticons.toList())
        answer += maxSubscribers
        answer += maxSales

        return answer
    }
}
