package Classes

import java.util.*

enum class Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    companion object {
        fun isValid(dayName: String): Boolean {
            return values().any { it.name == dayName }
        }
    }
}

fun printHoursWorked(hours: Int, dayName: String) {
    if (Weekday.isValid(dayName)) {
        val weekday = Weekday.valueOf(dayName.uppercase(Locale.getDefault()))
        println("$hours hours worked on ${weekday.name}")
    } else {
        println("Wrong day name")
    }
}
fun main() {
    printHoursWorked(8, "Monday") // prints "8 hours worked on MONDAY"
    printHoursWorked(5, "monday") // prints "5 hours worked on MONDAY"
    printHoursWorked(7, "Thursday") // prints "7 hours worked on THURSDAY"
    printHoursWorked(3, "Weekend") // prints "Wrong day name"
}