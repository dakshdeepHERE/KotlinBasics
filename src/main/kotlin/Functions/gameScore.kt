package Functions

fun main(){
    val OurScore = calculateScore(10,3).also { print(it) }
}


fun calculateScore(InitialPoints : Int , BonusPoints : Int) : Any {
    return InitialPoints*BonusPoints
}