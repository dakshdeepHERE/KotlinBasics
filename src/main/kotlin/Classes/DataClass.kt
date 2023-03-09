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
    println(dog2)
    // Classes.Dog@f6f4d33 without data class
    println("The name of the dog and age is: $dog1")

    //dog1.age = 2 as it is val we cannot change it so we will use the copy method for it

    //Copy method

    val Newdog1 = dog1.copy(age = 2) // here it will copy everything and change the name
    val NewDog1 = dog1.copy(age = dog1.age + 1)
    println("Before the copy: $dog1")
    println(Newdog1)
    println(NewDog1)

}