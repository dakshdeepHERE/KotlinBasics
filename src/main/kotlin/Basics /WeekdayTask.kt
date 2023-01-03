package `Basics `

fun main(){
    val weekday = "Monday"

    val timings = when(weekday){
        "Monday" -> println("Timing is from 8AM to 12PM")
        "Tuesday" -> println("Timing is from 8 AM to 6PM")
        "Wednesday" -> println("Timing is from 8AM to 6PM")
        "Thrusday" -> println("Timing is from 8AM to 6PM")
        "Friday" -> println("Timing is from 8AM to 9PM")
        "Saturday" -> println("Timing is from 8AM to 4PM")
        "Sunday" -> println("Timing is from 8AM to 4PM")
        else -> println("Write a correct weekday name.")
    }
    println("So the $timings for the selected $weekday")
}