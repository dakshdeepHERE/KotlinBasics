package Classes

class Student(
    val Name : String,
    val Birthday : String,
    val Status : String
)

class Teacher(val Name: String, val Surname : String, val Birthday: String, val Status : String
){

}


fun main(){
    val SangitaChopra = Teacher(Name = "Sangita", Surname = "Chopra", Birthday = "23.08.1991", Status = "Active")
    println(SangitaChopra.Name)
}