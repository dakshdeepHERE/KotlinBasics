    package Functions

    fun main(){
        val Result = compareNumber(5,10)
        println(Result)
    }


    fun compareNumber (num1 : Int , num2 : Int) : Any {
        if(num1==num2){
            return "Numbers are Equal"
        }
        if (num1>num2){
            return num1
        }
        else{
            return num2
            // we can also use return after this bracket istead of using this else condition
            // using return instead of else condition will look much better and skillful
        }
    }
