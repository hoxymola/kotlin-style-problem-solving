import java.io.File

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    File("src/main/kotlin/input").readLines()
        .mapIndexed { i, v ->
            v[i * 3 % v.length] == '#'
        }.count { it }
)

