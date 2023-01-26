/**
 * @author Jaeguk Cho
 */

class `크레인 인형뽑기 게임` {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        val map = List(board.size) { x -> ArrayDeque(board.map { it[x] }.filter { it > 0 }) }
        val basket = ArrayDeque<Int>()
        var ans = 0

        moves.forEach { move ->
            map[move.dec()].removeFirstOrNull()?.also {
                if (basket.lastOrNull() == it) {
                    basket.removeLast()
                    ans += 2
                } else {
                    basket.add(it)
                }
            }
        }

        return ans
    }
}
