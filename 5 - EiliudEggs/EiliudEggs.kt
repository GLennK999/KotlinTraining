import kotlin.math.*

object EliudsEggs {
    fun intToArray(num: Int): IntArray {
    return num.toString().map { it.digitToInt() }.toIntArray()
}
    
    fun eggCount(number: Int): Int{
        val eggsArray = intToArray(number)
        var decimal = 0.0
        var expoent = eggsArray.size.toDouble()
        for(i in eggsArray.reversed()){
            expoent = expoent-1
            decimal += i.toDouble() * 2.pow(expoent)
            
        }

        return decimal.toInt()
    }
}

fun main(){
    println(EliudsEggs.eggCount(1011001))
}