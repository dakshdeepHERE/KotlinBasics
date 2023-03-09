package Classes

fun main(){

    val Student1 = Pair(41,"Daksh")
    val (Roll_No,Age) = Student1
    val Student2 = Pair(55,"Rohan")
    println(Student1) // as it prints (41,Daksh) shows that this pair is a data class type with two constructor values
    val Student3 = Triple(41,"Daksh","Aps")
    println(Student3)
//    val Student4 = Pair("daksh",41)
}