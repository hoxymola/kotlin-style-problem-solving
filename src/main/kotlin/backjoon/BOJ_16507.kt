fun main() {
    val (r, c, q) = readln().split(" ").map { it.toInt() }
    val picture = List(r + 1) { MutableList(c + 1) { 0 } }
    val prefixSum = List(r + 1) { MutableList(c + 1) { 0 } }

    for (i in 1..r) {
        val row = readln().split(" ").map { it.toInt() }

        for (j in 1..c) {
            picture[i][j] = row[j - 1]
            prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1] + picture[i][j] - prefixSum[i - 1][j - 1]
        }
    }

    repeat(q) {
        val (r1, c1, r2, c2) = readln().split(" ").map { it.toInt() }
        val area = (r2 - r1 + 1) * (c2 - c1 + 1)

        println((prefixSum[r2][c2] - prefixSum[r2][c1 - 1] - prefixSum[r1 - 1][c2] + prefixSum[r1 - 1][c1 - 1]) / area)
    }
}
