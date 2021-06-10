package ch4

// val topData1: Int // 에러 Property must be initialized
// var topData2 : Int // 에러 Property must be initialized

class Sample_1 {
    //    val objData1: String // 에러 Property must be initialized or be abstract
//    var objData2: String // 에러 Property must be initialized or be abstract

    fun some() {
        val localData1: Int
        var localData2: String

//        println(localData1) // 에러 Variable 'localData1' must be initialized
//        println(localData2) // 에러 Variable 'localData2' must be initialized
        localData1 = 1
        println(localData1)
    }
}

fun main(argss: Array<String>) {
    Sample_1().some()
}
