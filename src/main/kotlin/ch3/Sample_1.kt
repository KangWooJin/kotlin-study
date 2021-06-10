package ch3

import ch3.some_package.Sample_2
import java.util.*

var sum = 0

fun calSum() {
    for (i in 1..10) {
        sum += i
    }
}

class T1_User {
    val name = "kkang"
    fun sayHello() {
        val date = Date()
        println("date : " + date)
        println("hello!! " + name)
    }
}

fun main(args: Array<String>) {
    calSum()
    println(sum)
    T1_User().sayHello()
    Sample_2()
}
