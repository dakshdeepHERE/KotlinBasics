package `Basics `

fun main (){
    val userRole = "admin"

    val hasAcess = when (userRole){

        "admin" -> println("Give access to admin")
        "" -> println("Username is must please type it")
        else -> println("AcessDenied")
    }
}