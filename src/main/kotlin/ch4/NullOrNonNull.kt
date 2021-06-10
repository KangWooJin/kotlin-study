package ch4

//val nonNullData : String = null // error Null can not be a value of a non-null type String
val nullableData1: String? = null
var nullableData2: String? = null

fun main(args: Array<String>) {
//    nonNullData = "hello" // error
//    nullableData1 = "hello" // error Val cannot be reassigned
    nullableData2 = "hello"

}
