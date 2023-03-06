package Classes

data class Dog(
    val name:String,
    val age:Int
)

fun main(){
    val dog1 = Dog("Sheero", 1)
    val dog2 = Dog("Rocky",1)
    val dog3  = Dog("   Sheero", 1)
    println(dog1==dog1)
    //True without data class
    println(dog1==dog2)
    //False
    println(dog1==dog3)
    // False without data class and true with data class as if you don't use data class then each instance will be treated as different object

    println(dog1)
    // Classes.Dog@4a574795 without data class
    println("The name of the dog and age is: $dog1")
}