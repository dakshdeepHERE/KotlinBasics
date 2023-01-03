package Classes
class Employee(
    val name: String,
    var Possition: String
)
fun main(){
    val employee1 = Employee("alex","manager")
    val employee2 = Employee("bob","SDE1")

    println(employee2.Possition)
    println(employee1.name)

    // We can also change the values in the class using the mentioned property
    employee2.Possition = "SDE2"
    println(employee2.Possition)


}