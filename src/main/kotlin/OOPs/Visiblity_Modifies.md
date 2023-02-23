# Visibility Modifiers / Encapsulation

In this sections we learn about different modifiers in kotlin and there use.

## Private modifier

The private modifier is used when you want to restrict the variable inside a single class. When you use this modifier the variable won't even work in the subclasses or any inhertited classes.

```kotlin
fun main(){
    val account = Bank()
    account.deposite(5000)
    account.balance = 10000//error
}

class Bank(){
    private balance=2000
    fun deposite(amount:Double){
        //..
        balance+=amount
    }
    fun withdraw(amount:Double)
    {
        //..
        balance-=amount
    }
}
```

In the above code you will notice that when you enter `account.balance` it will give you compiler error as the balance variable was private and cannot be accessed outside the class Bank().

## Protected modifier

Protected is only used inside classes that are open or abstract. This modifier is like a better version of modifier private as when you make a variable protected you can still access that variable in the subclasses or the inherited classes out there in the code.

```kotlin
open class ship{
    protected var miles_passed=0
    fun printMilesPassed(){
        println(miles_passed)
    }
}

class ElectricShip:ship(){
    fun swimUsingEngine(distance:Double){
        miles_passed+=distance
    }
}

fun main(){
    val Ship=ElectricShip()
    ship.miles_passed=1000//compiler error
}
```

In the above code you must have noticed that when you try to call the method miles_passed in the class ElectricShip you were able to do it. But at the same then in the main function when you try to call that method you will get compiler error as the variable miles_passed is a `protected` variable which will only grant the access to use it in the subclasses or where this class is inherited to. We usually use protected modifier on a variable when we don't want  the users to modify the value our variables. 

## Internal Modifier 

Modifies an element to be visible throughout the same module.

```kotlin
internal fun add(a:Int , b:Int){
    return a + b
}

fun main(){
    val result = add (5,10)
    println(result) // O/P = 15
}
```

In the above code if its yours then thsi internal modifier will normally work like public but the make use of internal starts when but suppose the code written above is a part of a library and you want to use it then you won't be able to do so as the class or function in that library will be defined as internal modifier.
