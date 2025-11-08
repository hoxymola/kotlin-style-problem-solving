package backjoon18111

fun main() {
    val (n, m, b) = readln().split(" ").map { it.toInt() }
    val field = List(n) { readln().split(" ").map { it.toInt() } }.flatten()
    var minTime = Int.MAX_VALUE
    var maxHeight = -1

    for (height in 0..256) {
        var remove = 0
        var add = 0

        field.forEach {
            when {
                height < it -> remove += (it - height)
                it < height -> add += (height - it)
            }
        }

        if (b + remove >= add) {
            val time = 2 * remove + add

            if (time <= minTime) {
                minTime = time
                maxHeight = height
            }
        }
    }

    println("$minTime $maxHeight")
}
