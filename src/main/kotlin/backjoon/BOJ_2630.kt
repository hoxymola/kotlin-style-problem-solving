package backjoon2630

lateinit var paper: List<List<Int>>
val dy = listOf(0, 1, 1, 0)
val dx = listOf(1, 1, 0, 0)
var white = 0
var blue = 0

fun divideAndConquer(n: Int, y: Int, x: Int) {
    val subPaper = paper.slice(y until y + n)
        .map { it.slice(x until x + n) }
    val cnt = subPaper.sumOf { it.sum() }

    when (cnt) {
        0 -> return run { white++ }
        n * n -> return run { blue++ }
    }

    repeat(4) {
        val ny = y + (n / 2) * dy[it]
        val nx = x + (n / 2) * dx[it]

        divideAndConquer(n / 2, ny, nx)
    }
}

fun main() {
    val n = readln().toInt()
    paper = List(n) { readln().split(" ").map { it.toInt() } }

    divideAndConquer(n, 0, 0)

    println(white)
    println(blue)
}
