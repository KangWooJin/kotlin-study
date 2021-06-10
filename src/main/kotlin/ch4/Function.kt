package ch4

fun sum(a: Int, b: Int): Int {
    var sum = 0
    fun calSum2() {
        for (i in a..b) {
            sum += i
            println(i)
        }
    }
    calSum2()
    return sum
}

fun sum2(a: Int, b: Int): Int = a + b

fun sum3(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    println("calSum")
//    calSum2() // Unresolved reference: calSum2
    println("sum")
    val result = sum(1, 10)
    println(result)

    println(sum2(1, 3))
    println(sum3(1, 3))
}
