package backjoon21758

fun main() {
    val n = readln().toInt()
    val b = readln().split(" ").map { it.toInt() }
    val prefixLeft = b.runningReduce { a, b -> a + b }
    val prefixRight = b.reversed().runningReduce { a, b -> a + b }.reversed()
    var max1 = 0
    var max2 = 0
    var max3 = 0

    (1..n - 2).forEach {
        // 벝통이 왼쪽 끝이라면..
        // 벌 하나는 반드시 오른쪽 끝이다 (오른쪽 끝에서 시작하지 않을 이유가 없음)
        // 나머지 하나는 브루트포스로 찾기
        max1 = maxOf(max1, prefixLeft[n - 2] - b[it] + prefixLeft[it - 1])

        // 벌통이 오른쪽 끝이라면.. 위와 동일
        max2 = maxOf(max2, prefixRight[1] - b[it] + prefixRight[it + 1])

        // 벌통이 중앙이라면..
        // 벌은 반드시 양쪽 끝이다.
        // 벌통이 중앙이면서 벌 두마리가 같은쪽에 있다면..
        // 벌통이 가운데에 있을 이유가 없고.. 끝으로 붙는게 이득임.. 근데 그러면 위의 케이스임 ㅇㅂㅇ
        // 그러므로 벌통이 중앙 & 벌은 양쪽 끝 케이스만 고려
        max3 = maxOf(max3, prefixLeft[n - 2] - prefixLeft[it - 1] + prefixRight[1] - prefixRight[it + 1])
    }

    println(maxOf(max1, max2, max3))
}
