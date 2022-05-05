/**
 * @author Jaeguk Cho
 */

fun main() {
    readLine()
    var ans = 0
    val maxValue = mutableListOf(0, 0) // biggest , second biggest
    readLine()!!.split(' ').map { it.toInt() }.forEach {
        if (maxValue[1] > it) {
            ans++
        }
        maxValue[1] = maxOf(maxValue[1], it)
        maxValue.sortByDescending { it }
    }
    println(ans)
}
