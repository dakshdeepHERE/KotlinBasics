package `Basics `

fun main(){
    val DogName = ""

    val Outcome = when (DogName){
        "German Shepherd" -> "10-20"
        "Rotwieler" -> "8-16"
        "Border Collie" -> "5-25"
        "FoxHound" -> "4-15"
        else -> "We don't have the data of the above dog mentioned."
    }
    println("The weight of the dog mentioned is $Outcome kg")

    val a = 21
    if (a < 20)
        if(a > 10)
            print("Hi $a")
        else if(a < 10)
            print ("Bonjour $a")
        else
            print ("Welcome $a")

}