fun main() {
    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }
    val hashMap = hashMapOf<Int, Int>()
    val m = readln().toInt()

    numbers.forEach { hashMap[it] = hashMap.getOrDefault(it, 0) + 1 }

    readln().split(" ").map { it.toInt() }
        .joinToString(" ") { "${hashMap.getOrDefault(it, 0)}" }
        .also { println(it) }
}
