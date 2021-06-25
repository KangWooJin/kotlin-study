package ch8

class LateInit {
    lateinit var lateDate: String
}

fun main() {
    val user = LateInit()
    user.lateDate = "hello"
    println(user.lateDate)
}
