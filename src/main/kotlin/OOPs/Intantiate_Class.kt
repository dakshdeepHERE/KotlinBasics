package OOPs

fun main(args: Array<String>){
    var student = Student("daksh",20) //here we are instantiating the constructor name from the class Student
    // The whole process of creating objects from class is known as instantiation
    var student2 = student.printAge(21)
    // We will further learn here why we created this constructor.
    var Greet = Hommie("Bye") // Here when you run the programm you will notice that init is running before constructor
}

class Student constructor (name: String, age: Int){
    var name:String = "dummy"
    var age:Int = 0
    init {
        println("The name of the student is ${name} and the age is ${age}")
    }
    fun printAge (age: Int){
        println(age)
    }
}

class property (bloodgroup:String){
    var bloodgroup = "daksh"
}

class Hommie constructor(greet:String){
    init {
        print("Hello " + greet)
    }
}