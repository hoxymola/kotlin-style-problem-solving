package backjoon18222

// 길이가 a인 투에-모스 문자열에서 b번째 문자를 찾는다.
// a >= b -> a에서 b를 찾는 것은 a/2에서 b를 찾는 것과 동일
// a < b -> [1, a]와 [a+1, 2a]는 반전되어 있다. 즉 [1, a]에서 b-a의 반전 문자를 찾는 것과 동일
fun find(a: Long, b: Long, reversed: Boolean): Int {
    return when {
        b == 1L && reversed -> 1
        b == 1L && !reversed -> 0
        a >= b -> find(a / 2, b, reversed)
        else -> find(a, b - a, !reversed)
    }
}

fun main() {
    val k = readln().toLong()

    println(find(1L shl 60, k, false))
}
