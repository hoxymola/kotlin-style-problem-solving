package backjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

/**
 * @author Jaeguk Cho
 */

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val answer = StringBuilder()

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toDouble()
        val s = sqrt(n - 1).toInt() + 1

        when {
            n <= s * (s - 1) -> answer.appendLine("${4 * s - 2}")
            n <= s * s -> answer.appendLine("${4 * s}")
        }
    }

    bw.write(answer.toString())
    bw.flush()
}
