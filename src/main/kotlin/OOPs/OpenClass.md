### Open Class and Methods

## Parent - Child relationship 

When one class inherits from another, it takes all the previous class’s behavior (its methods and properties). It also becomes its subclass, which means that it can be used wherever its parent is expected. So, in the example below, Dog is a subclass of Mammal, or Mammal is a superclass of Dog. It is also called a parent-child relationship, so Dog is a child of Mammal, and Mammal is a parent of Dog.

```kotlin
open class Animal{
    fun feedTheAnimal(){}
}
class Dog:Animal{
    fun Fetch_the_Stick(){}
}
fun feed(mammal:Animal){
    fun Feed_the_Childer(){}
}

fun main(){
    val dog = Dog()
    dog.feedTheAnimal()
    dog.Fetch_the_Stick()
    feed(dog)
}
```
Here we can see that the feedtheAnimal() method was from the class Animal() but we instantiated the classs Dog with with the variable dog which allowed us to use the method feedTheAnimal() too. This shows and proves the above statement right that when you instantiate a class/inherit the class it becomes a subclass of that class and also gives the access of all the methods which are inside it.