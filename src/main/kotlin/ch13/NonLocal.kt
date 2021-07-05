package ch13

inline fun inlineTest2(argFun: (x: Int, y: Int) -> Int): Int {
    return argFun(10, 0)
}

fun callFun() {
    println("callFun.. top")
    val result = inlineTest2 { x, y ->
        if (y <= 0) return
        x / y
    }
    println("$result")
    println("callFun.. bottom")
}

fun main() {
    callFun()
}
