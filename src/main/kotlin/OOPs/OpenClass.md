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