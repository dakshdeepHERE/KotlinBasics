package Questions

import java.time.LocalTime
import java.time.temporal.ChronoUnit

class Query(val requester: String, val timeRequested: LocalTime)

class QuerySystem(val startTime: LocalTime, val endTime: LocalTime) {
    private val studentQueue = mutableListOf<Query>()
    private val facultyQueue = mutableListOf<Query>()

    fun addQuery(requester: String, isFaculty: Boolean) {
        val queue = if (isFaculty) facultyQueue
        else studentQueue
        queue.add(Query(requester, LocalTime.now()))
    }

    fun handleQueries(): Pair<Int, Double> {
        var totalQueryTime = 0L
        var numQueries = 0

        var currentTime = startTime
        while (currentTime.isBefore(endTime) && (studentQueue.isNotEmpty() || facultyQueue.isNotEmpty())) {
            val queue = if (facultyQueue.isNotEmpty()) facultyQueue else studentQueue
            if (queue.isNotEmpty()) {
                val query = queue.first()
                val queryTime = ChronoUnit.MINUTES.between(query.timeRequested, currentTime)
                totalQueryTime += queryTime
                numQueries++
                queue.removeAt(0)
            }
            currentTime = currentTime.plusMinutes(30)
        }

        val avgQueryTime = if (numQueries > 0) totalQueryTime.toDouble() / numQueries else 0.0
        return Pair(numQueries, avgQueryTime)
    }
}

fun main() {
    val querySystem = QuerySystem(LocalTime.of(10, 0), LocalTime.of(12, 0))
    querySystem.addQuery("Alice", false)
    querySystem.addQuery("Bob", true)
    querySystem.addQuery("Charlie", false)
    querySystem.addQuery("David", false)
    val (numQueries, avgQueryTime) = querySystem.handleQueries()
    println("Handled $numQueries queries with " +
            "an average time of $avgQueryTime minutes.")
}
