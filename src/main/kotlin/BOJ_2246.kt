/**
 * @author Jaeguk Cho
 */
//data class Condo(
//    val dist: Int,
//    val cost: Int,
//    var valid: Boolean = true
//)
//
//fun main() {
//    val n = readLine()!!.toInt()
//    val arr = List(n) {
//        readLine()!!.split(' ')
//            .map { it.toInt() }
//            .let { Condo(it[0], it[1]) }
//    }
//
//    val costOfMinDist = arr.minByOrNull { it.dist }!!.cost
//    val distOfMinCost = arr.minByOrNull { it.cost }!!.dist
//
//    arr.filter { it.cost > costOfMinDist }.forEach { it.valid = false }
//    arr.filter { it.dist > distOfMinCost }.forEach { it.valid = false }
//    println(arr.count { it.valid })
//}
