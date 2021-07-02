package ch11

data class ComponentN(var name: String, val no: Int)

fun main() {
    var componentN: ComponentN = ComponentN("kang", 1)

    val (namezz, no) = componentN

    println("name : $namezz, no : $no")

    val copied = componentN.copy(name = "test")

    println(componentN.toString())
    println(copied.toString())

    componentN.name = "hello"
    println(componentN.toString())
    println(copied.toString())
}
