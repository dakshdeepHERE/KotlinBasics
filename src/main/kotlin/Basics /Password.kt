fun main() {
    val password = "abahdaoidwaoiwhd"

    when{
        password == ""-> println("Password cannot be empty")
        password.length <7 -> println("Password is short please improve it.")
        else -> println("Password is OK!")
        }
    }