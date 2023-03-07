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
