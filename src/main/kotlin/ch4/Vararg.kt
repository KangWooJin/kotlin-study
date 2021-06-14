package ch4

fun <T> varargsFun(a1: Int, vararg array: T) {
    println("generic")
    for (a in array) {
        println(a)
    }
}

fun varargsFun(a1: Int, vararg array: Int) {
    println("Int")
    for (a in array) {
        println(a)
    }
}

fun varargsFun(a1: Int, vararg array: String) {
    println("String")
    for (a in array) {
        println(a)
    }
}

fun varargsFun(vararg array: String) {
    println("String")
    for (a in array) {
        println(a)
    }
}

fun main() {
    varargsFun(10, "hello", "world")
    varargsFun(10, 20, false)
    varargsFun(10, 20, 30)
    varargsFun("test", "hello", "world")
}
