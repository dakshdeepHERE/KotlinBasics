fun main(){
    val arrayname = Array(5, { i -> i * 1 })
    for (i in 0..arrayname.size-1)
    {
        print(" " + arrayname[i])
    }
    val value = arrayname.get(2)
    val value2 = arrayname.set(2,21)

    println()
    for (i in 0..arrayname.size-1)
    {
        print(" " + arrayname[i])
    }
}