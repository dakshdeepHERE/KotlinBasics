# Types of polymorphism

- Compile-time Polymorphism
- Runtime Polymorphism

## Example

### **Compile-time Polymorphism:-**

Let’s start with compile-time polymorphism. In compile-time polymorphism, the name functions, that is, the signature remains the same but parameters or return type is different. At compile time, the compiler then resolves which functions we are trying to call based on the type of parameters and more. Check out this example:

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

### **Example 2: Runtime Polymorphism:-**

Now, let’s talk about run-time polymorphism. In run-time polymorphism, the compiler resolves a call to overridden/overloaded methods at runtime. We can achieve run-time polymorphism using method overriding. Let’s try an example where we extend a superclass and override one of its member methods:

```kotlin
fun main(args: Array<string>){
var a = Sup()
a.method1()
a.method2()

var b = Sum()
b.method1()
b.method2()
}

open class Sup{
open fun method1(){
	println("printing method 1 from inside Sup")
}
fun method2(){
	println("printing method 2 from inside Sup")
}
}

class Sum:Sup(){
override fun method1(){
	println("printing method 1 from inside Sum")
}
}

```

So the above examples were of types of polymorphism. 