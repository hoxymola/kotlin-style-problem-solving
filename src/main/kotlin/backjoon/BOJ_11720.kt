fun main() {
    val n = readln().toInt()
    val nums = readln().map { it - '0' }

    println(nums.sum())
}
