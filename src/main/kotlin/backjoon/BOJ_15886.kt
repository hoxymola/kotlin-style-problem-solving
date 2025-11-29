package backjoon15886

fun main() {
    val n = readln().toInt()
    val road = readln()

    println(road.windowed(2).count { it == "EW" })
}
