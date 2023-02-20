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