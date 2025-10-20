fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }
    val hashMap = hashMapOf<Int, Int>()
    val m = readln().toInt()

    nums.forEach { hashMap[it] = hashMap.getOrDefault(it, 0) + 1 }

    readln().split(" ").map { it.toInt() }
        .joinToString(" ") { "${hashMap.getOrDefault(it, 0)}" }
        .also { println(it) }
}
