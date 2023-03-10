package Classes

enum class Weekdays{
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}

fun WorkTime(HoursWorked:Int,Day:Weekdays){
    when(Day){
        Weekdays.Sunday -> println("Today is Off")
        Weekdays.Friday -> println("Friday night so it will be half day today")
        Weekdays.Monday -> println("First day of work")
        Weekdays.Thursday -> println("Today is Thursday")
        Weekdays.Tuesday -> println("Today is tuesday")
        Weekdays.Wednesday -> println("Today is Wednesday")
        else -> {
            println("Please enter a valid Weekday Name")
        }
    }
    println("You Worked for $HoursWorked on $Day")
}

fun  main() {
    val RahulWork = WorkTime(10,Weekdays.Sunday)
}