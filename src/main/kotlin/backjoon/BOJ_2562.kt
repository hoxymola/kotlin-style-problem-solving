fun main() {
    val nums = List(9) { readln().toInt() }
    val max = nums.maxOrNull()

    println(max)
    println(nums.indexOfFirst { it == max } + 1)
}
