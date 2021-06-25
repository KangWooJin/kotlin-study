package ch10

interface Interface1 {
    fun funA() {
        println("hi interface1")
    }
}

interface Interface2 {
    fun funA() {
        println("hi interface2")
    }
}

open class Super {
    open fun funA() {
        println("hi super")
    }
}

class Sub : Interface1, Interface2, Super() {
    override fun funA() {
        super<Interface1>.funA()
        super<Interface2>.funA()
        super<Super>.funA()
        println("hi sub")
    }
}

fun main() {
    val sub: Sub = Sub()

    sub.funA()
}
