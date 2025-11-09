package backjoon34704

fun main() {
    val n = readln().toInt()
    val objects = IntArray(5)

    readln().split(" ").map { it.toInt() }.forEach {
        objects[it]++
    }

    val b4 = objects[4]
    val b3 = objects[3]
    val b2 = (objects[2] + 1) / 2
    val o1 = maxOf(0, objects[1] - objects[3] - (objects[2] % 2) * 2)
    val b1 = (o1 + 3) / 4

    println(b4 + b3 + b2 + b1)
}
