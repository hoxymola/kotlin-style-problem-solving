import java.math.BigInteger

/**
 * @author Jaeguk Cho
 */

fun main() {
    val nums = mutableListOf<BigInteger>()
    repeat(readln().toInt()) {
        readln().split("[^0-9]+".toRegex())
            .map { it.toBigIntegerOrNull()?.let { nums.add(it) } }
    }
    println(nums.sorted().joinToString("\n"))
}
