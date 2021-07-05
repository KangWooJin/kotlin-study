package ch13

 fun hoFunTest(argFun: (x1: Int, x2: Int) -> Int) {
    argFun(10, 20)
}

//inline fun hoFunTest(argFun: (x1: Int, x2: Int) -> Int) {
//    argFun(10, 20)
//}

fun main() {
    hoFunTest { x1, x2 ->
        println("hoFun")
        x1 + x2
    }
}
