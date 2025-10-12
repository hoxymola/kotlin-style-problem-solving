package backjoon

import kotlin.math.abs

/**
 * @author Jaeguk Cho
 */

enum class Hand {
    LEFT,
    RIGHT,
    ;
}

enum class QWERTY(
    val _y: Int,
    val _x: Int,
    val hand: Hand,
) {
    q(0, 0, Hand.LEFT),
    w(0, 1, Hand.LEFT),
    e(0, 2, Hand.LEFT),
    r(0, 3, Hand.LEFT),
    t(0, 4, Hand.LEFT),
    y(0, 5, Hand.RIGHT),
    u(0, 6, Hand.RIGHT),
    i(0, 7, Hand.RIGHT),
    o(0, 8, Hand.RIGHT),
    p(0, 9, Hand.RIGHT),
    a(1, 0, Hand.LEFT),
    s(1, 1, Hand.LEFT),
    d(1, 2, Hand.LEFT),
    f(1, 3, Hand.LEFT),
    g(1, 4, Hand.LEFT),
    h(1, 5, Hand.RIGHT),
    j(1, 6, Hand.RIGHT),
    k(1, 7, Hand.RIGHT),
    l(1, 8, Hand.RIGHT),
    z(2, 0, Hand.LEFT),
    x(2, 1, Hand.LEFT),
    c(2, 2, Hand.LEFT),
    v(2, 3, Hand.LEFT),
    b(2, 4, Hand.RIGHT),
    n(2, 5, Hand.RIGHT),
    m(2, 6, Hand.RIGHT),
    ;

    fun distance(that: QWERTY): Int {
        return abs(this._y - that._y) + abs(this._x - that._x)
    }
}

fun main() {
    var (l, r) = readln().split(" ").let { QWERTY.valueOf(it[0]) to QWERTY.valueOf(it[1]) }
    val string = readln()
    var answer = 0

    string.map { "$it" }.forEach {
        val new = QWERTY.valueOf(it)

        when (new.hand) {
            Hand.LEFT -> {
                answer += l.distance(new)
                l = new
            }

            Hand.RIGHT -> {
                answer += r.distance(new)
                r = new
            }
        }
    }

    println(answer + string.length)
}
