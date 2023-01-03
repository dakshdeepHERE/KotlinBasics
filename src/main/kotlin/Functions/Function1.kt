package Functions

fun main(){
    val a = changeSign(-2)
    println(a)
    }
fun changeSign(value: Int): Int {
    if (value>=0){
        return value
    }
    else{
        return value*-1
    }
}
