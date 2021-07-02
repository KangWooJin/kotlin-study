package ch11

data class User(val name: String, val no: Int) {
    fun print() {
        println("hello $name")
    }
}

class Product(val name: String, val no: Int)

fun main() {
    val user: User = User("woojin", 1)

    user.print()
    val product : Product = Product("kakao" , 1)

    product.equals(user)
    user.equals(product)

    product.toString()
    user.toString()
}
