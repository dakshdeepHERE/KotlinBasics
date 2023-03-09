# Pair and Triple 

Pair and Triple are a type of data class which we can use anytime we want. When we need two constructor values we will use the `Pair ` and when we need three constructor values then we will use the `Triple` data class.

## Example of `Pair`:

`Pair` is the type of data class with two constructor properties with values of type either `Double` or `char`.

```kotlin
val Dog = Pair("Sheero",3)
val(Dog_name,Age) = Dog
//Dog_name is of type char
//Age is of type Double

println(Dog.Dog_name)
```

## Example of `Triple`:

`Triple` is a type of data class with three constructor property. Where each constructor can take values of type `Double` and `Char`.

```kotlin
val Student1 = Triple(51,"Daksh","Aps")
val (Roll_No,Name,School_Name)
// Roll_no is of type double, Name is of type char and School_Name is of type Char
println(Student1)
```