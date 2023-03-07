package oops

fun main(){
    val Sheero = dog("Sheero","German Shepherd")
    println(Sheero.name)
    println(Sheero.breed)
    println(Sheero.pet())
    Sheero.breed = "Not German" //Open in nature
    println(Sheero.breed)
}

interface Animal {
    var breed:String
    fun pet()
}
class cat(//Arguments for the class cat
    val name:String,
    override var breed: String
) : Animal{//instantiating the interface
    override fun pet() {
        println("Meow")
    }
}
class dog(//arguments
    val name:String,
    override var breed: String
):Animal{//instantiating the interface
    override fun pet() {
        println("Bark")
    }
}