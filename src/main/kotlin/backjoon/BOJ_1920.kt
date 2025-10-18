fun main() {
    val sb = StringBuilder()
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }.toHashSet()
    val m = readln().toInt()

    readln().split(" ").map { it.toInt() }.forEach {
        sb.append("${if (it in a) 1 else 0}\n")
    }

    println(sb.toString())
}
