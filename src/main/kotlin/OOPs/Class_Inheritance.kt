package OOPs

open class P{
    fun a(){}
}
class C:P(){
    fun b(){
        println("Class Inheritance")
    }
}

class D:P(){
    fun e(){}
}
//Here we can see the result of class inheritance where class D is parent of C and C is parent of class P
fun main(){
    val o = C()
    o.b()
}

