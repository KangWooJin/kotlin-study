package ch5

fun main(args: Array<String>) {
    val boxed1:Int? = 126
    val boxed2:Int? = 126

    println("boxed1 == boxed2 is ${boxed1 == boxed2}")
    println("boxed1 === boxed2 is ${boxed1 === boxed2}")


    val num1:Int = 126
    val num2:Int = 126


    println("num1 == num2 is ${num1 == num2}")
    println("num1 === num2 is ${num1 === num2}")

    val num3:Int = 12611
    val num4:Int = 12611
    println("num3 == num4 is ${num3 == num4}")
    println("num3 === num4 is ${num3 === num4}")
}
