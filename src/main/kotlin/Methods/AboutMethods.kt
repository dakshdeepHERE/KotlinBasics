package Methods

import jdk.jshell.Snippet.Status

// Methods are nothing but the further property which we define with our class

class Student1(
    val name:String,
    var age:Int,
    val birthday:String
){
    //here is the method
    fun WhatExactly(GameName : String, Price : Int): Methods.Status {
        println("$name is Playing game called $GameName and is priced @$Price$ ")
        return Status(GameName, Price)
        // you can all the variables that you assigned in your class directly in the methods
    }
    // here we further explained out method
}
class Status(
    val GameName: String,
    val Price: Int
)
fun main(){
    val daksh = Student1("Daksh Deep", 20, "7.03.2002")
    println(daksh.age)
    val status = daksh.WhatExactly("God of war", 30)
}