package ch13

var sum = 0

fun closureTest(): (Int) -> Unit {
    return {
        for (i in 1..it) {
            sum += i
        }
    }
}

fun main() {
    val result = closureTest()
    result(5)
    result(5)
    println("result $sum")
}
