package ch1

data class User(val no: Int, val name: String, val email: String)

fun main(args: Array<String>) {
    val list = ArrayList<User>()
    val user1 = User(1,"kkang", "a@a.com")
    list.add(user1)

    val user2 = User(1,"kkang", "a@a.com")
    list.add(user2)
    println("List size = ${list.size}")

    if (user1.equals(user2)) {
        println("user1 == user2")
    } else {
        println("user1 != user2")
    }
}
