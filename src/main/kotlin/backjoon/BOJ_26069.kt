package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val dancingSet = hashSetOf("ChongChong")
    val n = readln().toInt()

    repeat(n) {
        val (a, b) = readln().split(" ")

        if (dancingSet.contains(a)) dancingSet.add(b)
        if (dancingSet.contains(b)) dancingSet.add(a)
    }

    println(dancingSet.size)
}
