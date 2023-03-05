# Types of polymorphism

- Compile-time Polymorphism
- Runtime Polymorphism

## Example

```kotlin
fun main (args: Array<String>) {
println(doubleof(4))
println(doubleof(4.3))
println(doubleof(4.323))
}

fun doubleof(a: Int):Int {
return 2*a
}

fun doubleOf(a:Float):Float {
return 2*a
}

fun doubleof(a:Double):Double {
return 2.00*a
}

```