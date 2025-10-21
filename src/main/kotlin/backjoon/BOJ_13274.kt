package backjoon13274

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val nums = readln().split(" ").map { it.toLong() }.sorted().toLongArray()
    val tempList1 = LongArray(n)
    val tempList2 = LongArray(n)

    repeat(k) {
        val (l, r, x) = readln().split(" ").map { it.toInt() }
        var tempIndex1 = 0
        var tempIndex2 = 0

        (0 until l - 1).forEach { tempList1[tempIndex1++] = nums[it] }
        (r until n).forEach { tempList1[tempIndex1++] = nums[it] }
        (l - 1 until r).forEach { tempList2[tempIndex2++] = nums[it] + x }

        var t1 = 0
        var t2 = 0
        var t0 = 0

        while (t1 < tempIndex1 && t2 < tempIndex2) {
            nums[t0++] = if (tempList1[t1] < tempList2[t2]) {
                tempList1[t1++]
            } else {
                tempList2[t2++]
            }
        }

        while (t1 < tempIndex1) {
            nums[t0++] = tempList1[t1++]
        }

        while (t2 < tempIndex2) {
            nums[t0++] = tempList2[t2++]
        }
    }

    println(nums.joinToString(" "))
}
