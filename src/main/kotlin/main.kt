
import java.util.*

fun main(args: Array<String>) {
    val numbers = mutableListOf<Int>()
    var dice= mutableListOf<Die>(Die(),Die(),Die(),Die(),Die(),Die())

    for (die in dice) {

        die.roll()
    }

    val length = dice.count()
    for(die in dice){
    if(length==6) {
        if ((dice[0] == dice[1]) && (dice[1] != dice[2]) && (dice[2] == dice[3]) &&(dice[3] == dice[4]) &&(dice[4] == dice[5])){
            println("Yahtzee")
        }
       
    }
    }


    println("Please,enter the number you get which you want to save (separate each one with space bar).")
    var stringInput = readLine()!!
    var fromStringInput = stringInput!!.split(' ').map { it.toInt() }
    if(dice.containsAll(fromStringInput)){
    numbers += fromStringInput}
    else {
        println("You must choose just from given numbers.")}
    //saving the saved numbers into another list (numbers) that will make the final list of
    //numbers that user chose to save
println("Saved numbers are: $numbers")


    var len:Int=numbers.count()
    val limitedList=dice.take((6-len))
    for(die in limitedList){

        die.roll()
    }


}







class Die(var number:Int) {
    constructor() : this(1)

    fun get(): Int {
        return this.number
    }

    fun roll() {
        val random = Random()
        var result = random.nextInt(6) + 1
        println("Rolled dice shows number " + result)


    }

    override fun toString(): String {
        return super.toString()
    }
     }




    inline fun repeat(times: Int, action: (Int) -> Unit) {}

