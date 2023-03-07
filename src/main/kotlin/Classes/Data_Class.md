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
