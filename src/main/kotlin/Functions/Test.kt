package Functions

fun main(){
    val Factorial = factorial(4).also { print(it) }
}


fun factorial(number: Int): Int {

    var accumulator = 1

    for (i in 1..number) {

        accumulator = accumulator * i
    }

    return accumulator
}