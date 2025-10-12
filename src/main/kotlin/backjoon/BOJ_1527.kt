package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val gms = mutableListOf<Int>()

    fun generateGms(current: String, depth: Int) {
        if (depth > 9) return
        if (current.isNotEmpty()) gms.add(current.toInt())

        generateGms(current + "4", depth + 1)
        generateGms(current + "7", depth + 1)
    }

    generateGms("", 0)
    gms.sort()

    val (a, b) = readln().split(" ").map { it.toInt() }
    val ai = if (a in gms) gms.binarySearch(a - 1) else gms.binarySearch(a)
    val bi = if (b in gms) gms.binarySearch(b + 1) else gms.binarySearch(b)

    println(ai - bi)
}
