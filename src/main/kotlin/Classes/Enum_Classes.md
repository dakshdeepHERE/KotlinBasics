# Enum Classes

In Kotlin, an enum class is a special type of class that represents a fixed set of constants. It is used to define a collection of related values that are known at compile time and cannot be modified at runtime. Each constant in an enum class is an instance of the class and has a unique name and an optional set of properties and methods. Enum classes provide type-safety and a concise syntax for working with a finite set of related values.

To define an `enum class`, you use the enum keyword followed by the class name and a set of constant values in parentheses, like this:

```kotlin
enum class Color {
    RED,
    GREEN,
    BLUE
}
```

You can access the values of an `enum class` using the dot notation, just like accessing a property or method of an object:

```kotlin
val color: Color = Color.RED
println(color) // output: RED
```

You can also define properties and methods on enum class constants, just like any other class:

```kotlin
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);

    fun toHex(): String {
        return "#${Integer.toHexString(rgb)}"
    }
}

val color: Color = Color.RED
println(color.toHex()) // output: #ff0000
```
