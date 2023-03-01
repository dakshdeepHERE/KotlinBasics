package OOPs

import java.util.*

fun main() {
// Create a new queue
    val queue = LinkedList<Int>()

// Add elements to the queue
    queue.add(1)
    queue.add(2)
    queue.add(3)
    println("The queue after adding the elements: $queue")

// Remove elements from the queue
    val firstElement = queue.remove() // Returns 1
    val secondElement = queue.remove() // Returns 2
    print(firstElement )
    println(" $secondElement")
    println("The queue after removing the elements from queue: $queue")
}