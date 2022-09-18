/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, k) = readln().split(' ').map { it.toInt() }
    val list = readln().split(' ').map { it.toInt() }.toMutableList()
    val temp = MutableList(n) { 0 }
    var cnt = 0
    var ans = -1

    fun sort(l: Int, m: Int, r: Int) {
        var ii = l
        var ll = l
        var rr = m + 1

        while (ll <= m && rr <= r) {
            if (list[ll] <= list[rr]) {
                temp[ii++] = list[ll++]
            } else {
                temp[ii++] = list[rr++]
            }
        }
        while (ll <= m) {
            temp[ii++] = list[ll++]
        }
        while (rr <= r) {
            temp[ii++] = list[rr++]
        }
        for (i in l..r) {
            list[i] = temp[i]
            if (k == ++cnt) {
                ans = list[i]
            }
        }
    }

    fun merge(l: Int, r: Int) {
        if (l < r) {
            val m = (l + r) / 2

            merge(l, m)
            merge(m + 1, r)
            sort(l, m, r)
        }
    }

    merge(0, n - 1)
    println(ans)
}
