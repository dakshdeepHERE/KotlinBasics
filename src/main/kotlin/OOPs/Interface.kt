package OOPs

import Classes.Employee

fun main(){
    val s = TOdo()
    println(s.name)
    var myObject = Name()
    myObject.EmptyFn()
}

interface Mylistener {
    var name: String // The normal properties are by default abstract in nature so we cannot give them a body
    fun jump(){
        print("World")
    } // As you can notice here we gave the function it's body which shows that its `open` in nature
    fun EmptyFn() // methods are by default `open` and `public` in nature so if you want you can give the body for the function
    // or call it in other class and override it to your own liking
}

class Name : Mylistener{ //
    override var name: String ="Hello"
    override fun EmptyFn() {
        println("Override Text")
    }

    override fun jump() {// Optional to override
    }
}

class TOdo : Mylistener{
    override var name: String = "hello"
    override fun EmptyFn() {
        print("World")
    }
}