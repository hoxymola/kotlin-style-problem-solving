import java.lang.Math.abs

/**
 * @author Jaeguk Cho
 */

data class Knight(
    var location: String
) {
    private val course = mutableSetOf<String>()

    fun move(next: String) {
        if (next in course) throw Exception("Duplicated Cell")

        if (isMoveValid(location, next)) {
            location = next
            course.add(location)
        } else {
            throw Exception("Wrong Move")
        }
    }

    private fun isMoveValid(cur: String, next: String) =
        (abs((cur[0] - 'A') - (next[0] - 'A')) == 2 && abs((cur[1] - '1') - (next[1] - '1')) == 1) ||
            (abs((cur[0] - 'A') - (next[0] - 'A')) == 1 && abs((cur[1] - '1') - (next[1] - '1')) == 2)
}

fun main() {
    val knight: Knight
    val initLocation = readLine()!!.apply {
        knight = Knight(this)
    }
    repeat(35) {
        try {
            knight.move(readLine()!!)
        } catch (e: Exception) {
            println("Invalid")
            return
        }
    }
    try {
        knight.move(initLocation)
    } catch (e: Exception) {
        println("Invalid")
        return
    }

    println("Valid")
}
