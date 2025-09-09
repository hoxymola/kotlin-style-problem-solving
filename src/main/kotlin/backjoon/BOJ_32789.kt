package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    readln()
    val nums = readln()
    var i = 0
    var n = 0

    while (true) {
        "${++n}".forEach {
            if (nums[i] == it && ++i == nums.length) return println(n)
        }
    }
}
