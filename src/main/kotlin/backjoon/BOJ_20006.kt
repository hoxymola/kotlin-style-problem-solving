package backjoon

/**
 * @author Jaeguk Cho
 */

data class Player(
    val level: Int,
    val name: String,
)

data class Room(
    val level: Int,
    val players: MutableList<Player>,
)

fun main() {
    val (p, m) = readln().split(" ").map { it.toInt() }
    val rooms = mutableListOf<Room>()

    repeat(p) {
        val player = readln().split(" ").let { Player(it.first().toInt(), it.last()) }
        val room = rooms.firstOrNull { player.level in (it.level - 10)..(it.level + 10) && it.players.size < m }

        if (room != null) room.players += player
        else rooms += Room(player.level, mutableListOf(player))
    }

    rooms.forEach { room ->
        println(
            if (room.players.size == m) "Started!"
            else "Waiting!"
        )
        room.players.sortedBy { it.name }.forEach { player ->
            println("${player.level} ${player.name}")
        }
    }
}
