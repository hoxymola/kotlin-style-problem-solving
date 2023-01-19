/**
 * @author Jaeguk Cho
 */

class `체육복` {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val poor = (lost subtract reserve.toSet()) as MutableSet
        val rich = reserve subtract lost.toSet()

        rich.forEach { if (!poor.remove(it - 1)) poor.remove(it + 1) }
        return n - poor.size
    }
}
