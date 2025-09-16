/*
Calculate the number of grains of wheat on a chessboard.

A chessboard has 64 squares. Square 1 has one grain, square 2 has two grains, square 3 has four grains, and so on, doubling each time.

Write code that calculates:

the number of grains on a given square
the total number of grains on the chessboard
1 = 2^0
2 = 2 ^ 1
3 = 2 ^2
4 = 2^3
*/

import kotlin.math.*
import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(number: Int): Double {
        return 2.0.pow(number)
    }

    fun getTotalGrainCount(): Double {
        var grainsqtd : Double = 0.0
        for(i in 0..63){
            grainsqtd = grainsqtd + 2.0.pow(i)
        }
        return grainsqtd
    }
}

fun main () {
    println(Board.getTotalGrainCount())
    println(Board.getGrainCountForSquare(64))
}



