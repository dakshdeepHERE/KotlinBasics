package Functions

fun main(){
    val Factorial2 = Factorial(4).also { print(it) }
}

fun Factorial ( number : Int): Int {

    var FactorialNumber = 1
    for(i in 1 .. number){
        FactorialNumber = FactorialNumber * i
    }

    return FactorialNumber

}
