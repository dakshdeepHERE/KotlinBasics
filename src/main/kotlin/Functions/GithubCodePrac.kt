package Functions

import kotlin.math.sqrt
class Dog(var name: String, var breed: String, var age: Int) {
    fun bark() {
        println("Woof!")
    }
}

val myDog = Dog("Fido", "Labrador", 3)
fun main(){
    println(myDog.bark())
}


