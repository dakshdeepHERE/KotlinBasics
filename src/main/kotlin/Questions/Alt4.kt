package Questions

data class Process(val name: String, val arrivalTime: Int, var burstTime: Int, var remainingTime: Int, var completionTime: Int)

fun roundRobin(processes: List<Process>, quantum: Int) {
    val n = processes.size
    val waitingTime = IntArray(n)
    val turnaroundTime = IntArray(n)
    var time = 0
    var remainingProcesses = processes.toMutableList()

    while (remainingProcesses.isNotEmpty()) {
        var flag = false
        for (i in 0 until remainingProcesses.size) {
            val process = remainingProcesses[i]
            if (process.remainingTime > 0) {
                flag = true

                if (process.remainingTime > quantum) {
                    time += quantum
                    process.remainingTime -= quantum
                } else {
                    time += process.remainingTime
                    process.completionTime = time
                    process.remainingTime = 0
                }
            }
        }
        if (!flag) break
    }

    for (i in processes.indices) {
        val process = processes[i]
        turnaroundTime[i] = process.completionTime - process.arrivalTime
        waitingTime[i] = turnaroundTime[i] - process.burstTime
    }

    println("Round Robin Scheduling:")
    println("Process\tBurst Time\tArrival Time\tWaiting Time\tTurnaround Time")
    for (i in processes.indices) {
        val process = processes[i]
        println("${process.name}\t\t${process.burstTime}\t\t${process.arrivalTime}\t\t${waitingTime[i]}\t\t${turnaroundTime[i]}")
    }
    val avgWaitingTime = waitingTime.average()
    val avgTurnaroundTime = turnaroundTime.average()
    println("Average waiting time: $avgWaitingTime")
    println("Average turnaround time: $avgTurnaroundTime")
}


fun main() {
    val processes = listOf(
        Process("P1", 0, 8, 8, 0),
        Process("P2", 1, 4, 4, 0),
        Process("P3", 2, 9, 9, 0),
        Process("P4", 3, 5, 5, 0),
        Process("P5", 4, 2, 2, 0)
    )

    val quantum = 3

    roundRobin(processes, quantum)
}
