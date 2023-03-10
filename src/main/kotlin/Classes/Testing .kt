package Classes

data class Value(val value: Int)

fun main() {
    val (value) = Value(42)
    println(value)
}