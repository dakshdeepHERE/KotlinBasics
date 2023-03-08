# Data Class

In Kotlin, a data class is a special type of class that is used primarily to hold data. Data classes are designed to reduce boilerplate code that is required to create classes that only hold data.

A data class is declared using the data keyword before the class declaration. For example:
```kotlin

data class Person(val name: String, val age: Int)

```

This creates a class called Person with two properties, name and age. The data keyword automatically generates the following methods for the class:
- `equals()`/`hashCode()`: This method checks if two objects of the class are equal by comparing their properties.
- `toString()`: This method returns a string representation of the object, usually in the format Person(name=John, age=30).
- `copy()`: This method creates a copy of the object with the option to change some properties.

For example, you can create an instance of the Person class like this:

```kotlin
val person = Person("John", 30)
```

You can then access the properties of the person object like this:

```kotlin
println(person.name) // prints "John"
println(person.age) // prints 30
```

You can also create a copy of the person object and change some properties like this:

```kotlin
val person2 = person.copy(age = 40)
println(person2.toString()) // prints "Person(name=John, age=40)"
```

Data classes are particularly useful when working with collections of data, such as lists or maps, as they provide a clean and concise way to represent and manipulate data.

# Code Samples 

Let's say that you have a very simple class. You can compare it to itself, but this comparison will only return true, if exactly the same instance is on both sides of the comparison. This means that by default, all objects created with custom classes are considered unique, they are not equal to any other object.

```kotlin
class Dog(
val name: String
)

fun main() {
val pluto1 = Dog("Pluto")
val pluto2 = Dog("Pluto")

println(pluto1 == pluto2) // false
println(pluto1 == pluto1) // true
}
```

Printing or transforming an object into a string is also not very useful. The result should be this class name, @ sign, and some numeric digits. The number is not really useful, it only helps us know if two objects are the same or not.

```shell
println(pluto1) // Dog@404b9385
println("Dog: $pluto1") // Dog: Dog@404b9385
```

So, what can you do to get more meaningful data from printing a string? This behavior can be altered if you use data modifier before a class. You use it before classes representing a bundle of data. Such a class is equal to a different instance of the same class if its constructor properties have the same value.

```kotlin
data class Dog(
val name: String
)

fun main() {
val pluto1 = Dog("Pluto")
val pluto2 = Dog("Pluto")
val rex = Dog("Rex")

println(pluto1 == pluto2) // true
println(pluto1 == pluto1) // true
println(pluto1 == rex) // false
}
```

When you transform a data class into a string, you not only have this class name, but also values for each constructor property.

```kotlin
println(pluto1) // Dog(name=Pluto)
println("Dog: $pluto1") // Dog: Dog(name=Pluto)
```

That is not all. Data classes can be destructured, which means reading values from this class and assigning them to variables.

```kotlin
data class Dog(
val name: String,
val age: Int
)

val dog = Dog("Pluto", 7)
val (name, age) = dog
println(name) // Pluto
println(age) // 7
```

Beware that destructuring in Kotlin is based on position, not name, so value names need to be placed at correct positions. For instance, if you place age at the position of name, and name at the position of age, then you will have age in a variable called name, and name in the variable called age.

```kotlin
data class Dog(
val name: String,
val age: Int
)

fun main() {
val dog = Dog("Pluto", 7)
val (age, name) = dog
println(age) // Pluto
println(name) // 7
}
```

To prevent this, always check if your variables are assigned to the correct positions of constructor parameters.

Finally, data classes have a copy method, that creates a copy of an object. It also allows you to specify what modifications you would like to introduce into an object.

```kotlin
data class Dog(
val name: String,
val age: Int
)

fun main() {
println(dog.copy()) // Dog(name=Pluto, age=7)
println(dog.copy(age = 8)) // Dog(name=Pluto, age=8)
println(dog.copy(name = "Neptune")) // Dog(name=Neptune, age=7)
}
```

