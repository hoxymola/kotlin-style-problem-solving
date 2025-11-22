package backjoon7983

data class Task(
    val d: Int,
    val t: Int,
)

lateinit var tasks: List<Task>

fun check(mid: Int): Boolean {
    var cur = mid

    tasks.forEach {
        cur += it.d
        if (cur > it.t) return false
    }

    return true
}

fun main() {
    val n = readln().toInt()
    tasks = List(n) { readln().split(" ").map { it.toInt() } }
        .map { Task(it[0], it[1]) }
        .sortedWith(compareBy(Task::t, Task::d))

    var low = 0
    var high = Int.MAX_VALUE / 2
    while (low + 1 < high) {
        val mid = (low + high) / 2

        if (check(mid)) low = mid
        else high = mid
    }

    println(low)
}
