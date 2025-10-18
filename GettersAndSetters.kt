fun main(){
    val vote = Voter()
    vote.rightToVote = 10
    println(vote.rightToVote)
}
class Voter{
    var rightToVote:Int = 20
        get() = field
        set(value) {
            if(value < 18){
                println("You cannot Vote")
            }
            else{
                field = value
            }
        }
}