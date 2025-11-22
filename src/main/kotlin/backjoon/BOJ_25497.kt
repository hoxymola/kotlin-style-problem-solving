package backjoon25497

fun main() {
    val n = readln().toInt()
    var ans = 0
    var sCnt = 0
    var lCnt = 0

    readln().forEach {
        when (it) {
            in '1'..'9' -> ans++
            'L' -> lCnt++
            'S' -> sCnt++
            'R' -> {
                if (lCnt == 0) {
                    return println(ans)
                } else {
                    lCnt--
                    ans++
                }
            }

            'K' -> {
                if (sCnt == 0) {
                    return println(ans)
                } else {
                    sCnt--
                    ans++
                }
            }
        }
    }

    println(ans)
}
