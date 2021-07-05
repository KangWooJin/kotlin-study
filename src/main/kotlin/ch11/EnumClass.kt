package ch11

enum class Direction(val no: Int) {
    NORTH(0), SOUTH(1), WEST(2), EAST(3),
}

fun main() {
    val direction: Direction = Direction.EAST

    println("${direction.no} ... ${direction.name}... ${direction.ordinal}")

    val directions = Direction.values()
    directions.forEach { t -> println(t.name) }

    val direction1 = Direction.valueOf("WEST")
    println("${direction1.name}... ${direction1.ordinal}")

    val direction2 = Direction.valueOf("WESTT")
}
