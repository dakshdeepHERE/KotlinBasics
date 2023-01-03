package Classes
class Employee(
    val name: String,
    var Possition: String
){
    var label : String = "Label"
    // Remember if you define a property inside a class then you have to initialize it.
}
fun main(){
    val employee1 = Employee("alex","manager")
    val employee2 = Employee("bob","SDE1")

    println(employee2.Possition)
    println(employee1.name)

    // We can also change the values in the class using the mentioned property
    employee2.Possition = "SDE2" //Here the '.' is called a constructor.
    println(employee2.Possition)
    println(employee2.label)
    employee2.label = "New Label"
    println(employee2.label)
    

}