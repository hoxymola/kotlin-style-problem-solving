fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val chessBoard1 = List(8) { i -> List(8) { j -> if (i % 2 != j % 2) 'W' else 'B' } }
    val chessBoard2 = List(8) { i -> List(8) { j -> if (i % 2 != j % 2) 'B' else 'W' } }
    val board = List(n) { readln().toList() }
    var answer = 64


    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            var count1 = 0
            var count2 = 0

            for (y in 0 until 8) {
                for (x in 0 until 8) {
                    if (board[i + y][j + x] != chessBoard1[y][x]) count1++
                    if (board[i + y][j + x] != chessBoard2[y][x]) count2++
                }
            }

            answer = minOf(answer, count1, count2)
        }
    }

    println(answer)
}
