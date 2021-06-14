package ch5

var array4 = Array<Int>(3, { i -> i * 10 })

fun main(args: Array<String>) {
    println("${array4[0]}, ${array4[1]}, ${array4[4]}")
}
