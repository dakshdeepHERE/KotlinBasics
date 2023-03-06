package oops

data class Dog(
    val name: String,
    val age: Int
)

fun main(){
    val dog1 = Dog("Sheero", 1)
    val dog2 = Dog("Rocky",1)
    val dog3  = Dog("   Sheero", 1)

    println(dog1==dog2)
    println(dog1==dog3)

    println(dog1)
    println("The name of the dog and age is: $dog1")
}