package backjoon25631

fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }
    val hashMap = HashMap<Int, Int>()

    a.forEach {
        hashMap[it] = hashMap.getOrDefault(it, 0) + 1
    }

    println(hashMap.maxOf { it.value })
}
