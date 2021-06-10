package ch4

var myBool: Boolean = false
val myVal: String = "hello"
    get() {
        return if (myBool) {
            field
        } else {
            field.toUpperCase()
        }
    }

fun main(args: Array<String>) {
    println(myVal)
    myBool = true
    println(myVal)
    println(MyObject.myConst4)
//    MyObject.myConst4 = 40 // Val cannot be reassigned
}

private const val myConst: Int = 10
// const var myConst2: Int = 10 // Modifier 'const' is not applicable to 'vars'

class MyClass {
//    const val myConst3 = 30 // Const 'val' are only allowed on top level or in objects
}

object MyObject {
    const val myConst4 = 30
    // Const 'val' should not have a getter
//        get() {
//            return field * 2
//        }
}

fun some() {
//    const val myConst4 = 40 // Modifier 'const' is not applicable to 'local variable'
}
