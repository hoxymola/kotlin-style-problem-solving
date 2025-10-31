package backjoon2885

fun main() {
    val k = readln().toInt()
    var length = 1
    var a = 0

    // 2^a: 초콜릿의 길이
    while (length < k) {
        length *= 2
        a++
    }

    // b: k를 이진수로 나타냈을 때, 처음으로 1이 등장하는 위치
    val b = k.toString(2).reversed().indexOf('1')

    println("$length ${a - b}")
}
