package Questions

class PlayerName (
    val name:String,
    var score:Int,
    var BestScore:Int
    ){
    fun Score(name: String,score: Int,BestScore: Int){
        println("$name score is $score and the best score is $BestScore")
    }
    fun updateScore(newScore:Int){
        score = score + newScore
    }
    fun updateBestScore(newUpdateBestScore:Int){
        if(newUpdateBestScore>BestScore){
            BestScore = newUpdateBestScore
        }
    }
}

