package ch4

fun sayHello(name: String = "kkang", no: Int) {
    println("Hello!! $name")
}

// fun sayHello(no1:Int = 1, no: Int) {
//    println("Hello!! ${no}")
// }

fun main(args: Array<String>) {
//    sayHello(10) // The integer literal does not conform to the expected type String
    sayHello("lee", 10)
    sayHello(no = 10)
    sayHello(name = "kim", no = 10)
}
