package backjoon1342

val alphabetMap = HashMap<Char, Int>()
var s = ""
var ans = 0

fun backTrack(k: Int, last: Char) {
    if (k == s.length) {
        return run { ans++ }
    }

    alphabetMap.forEach {
        if (it.value > 0 && last != it.key) {
            alphabetMap[it.key] = it.value.dec()
            backTrack(k + 1, it.key)
            alphabetMap[it.key] = it.value.inc()
        }
    }
}

fun main() {
    s = readln().onEach {
        alphabetMap[it] = alphabetMap.getOrDefault(it, 0) + 1
    }

    backTrack(0, '_')

    println(ans)
}
