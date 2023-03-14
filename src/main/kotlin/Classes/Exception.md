# Exception

## Defining and throwing exceptions

Any class that extends Throwable can be used as an exception. That means it can be thrown using a throw block. Such an exception immediately ends functions unless it is caught with a try-catch block. 

```kotlin
class MyError: Throwable("Some message")

fun someFunction() {
    throw MyError()
    println("Will not be printed")
}

fun main() {
    try {
        someFunction()
        println("Will not be printed")
        } catch (e: Throwable) {
        println("Caught $e") // Caught MyError: Some message
        }
}
```

### Finally block

Inside try, you can also use a block called finally. It is used to specify a block of code that should always be invoked, even if an exception occurs. Take a look at the code below. Inside someFunction an exception is thrown. It ends the function, and it ends the body of try. Since you do not have catch block, this exception will not be caught, and it will end the 'main' function. However, there is the finally block that is invoked even if an exception occurs. 

```kotlin
fun someFunction() {
    throw Throwable("Some error")
    println("Will not be printed")
}

fun main() {
    try {
    someFunction()
    println("Will not be printed")
} finally {
println("Finally block was called") // Finally block was called
}
println("Will not be printed")
}
```