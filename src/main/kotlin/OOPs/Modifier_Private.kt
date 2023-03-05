package OOPs

open class BankAcoount(){
    private var bank_balance:Int = 0
    protected var bank_Name:String="SBI"

    fun bankBalance(){
        println(bank_balance) // you can see here we called bank_balance and no error is there
        println(bank_Name)
    }
}

open class Salary constructor(ammount:Int) :BankAcoount(){
    var ammount = 0
    fun printName(){
        println(bank_Name)
    }

    // val NewBank_balance= bank_balance + ammount
    // error will be shown above line as the variable bank_balance is a private variable which can only be
    // used in the same function or class
}

class Spending(MoneySpent:Int, ammount: Int): Salary(ammount){
    var MoneySpent = 0
    // val MoneyLeft = NewBank_balance - MoneySpent
    // fun MoneyLefT(){
         // return MoneyLeft
    }
