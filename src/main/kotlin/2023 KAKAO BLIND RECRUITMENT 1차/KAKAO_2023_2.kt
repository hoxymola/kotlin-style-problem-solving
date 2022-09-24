package `2023 KAKAO BLIND RECRUITMENT 1차`

/**
 * @author Jaeguk Cho
 */

class KAKAO_2023_2 {
    fun solution(cap: Int, n: Int, deliveries: IntArray, pickups: IntArray): Long {
        var answer: Long = 0
        var mutableDeliveries = deliveries.toMutableList()
        var mutablePickups = pickups.toMutableList()
        var lastIndexDel = mutableDeliveries.indexOfLast { it > 0 }
        var lastIndexPic = mutablePickups.indexOfLast { it > 0 }

        while (lastIndexDel >= 0 || lastIndexPic >= 0) {
            var nn = cap
            answer += maxOf(lastIndexDel, lastIndexPic) + 1
            while (nn > 0 && lastIndexDel >= 0) {
                if (mutableDeliveries[lastIndexDel] > 0) {
                    mutableDeliveries[lastIndexDel]--
                    nn--
                } else {
                    lastIndexDel--
                }
            }
            while (lastIndexDel >= 0 && mutableDeliveries[lastIndexDel] == 0) {
                lastIndexDel--
            }
            var m = cap
            while (m > 0 && lastIndexPic >= 0) {
                if (mutablePickups[lastIndexPic] > 0) {
                    mutablePickups[lastIndexPic]--
                    m--
                } else {
                    lastIndexPic--
                }
            }
            while (lastIndexPic >= 0 && mutablePickups[lastIndexPic] == 0) {
                lastIndexPic--
            }
        }

        return answer * 2
    }
}

