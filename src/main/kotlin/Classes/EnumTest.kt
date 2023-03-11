package Classes

enum class Letters{
    A,
    B,
    C,
}

fun main(){
    println(Letters.C)
    println(Letters.C.ordinal)
    for (i in Letters.values()){
        println(i)
    }

}

