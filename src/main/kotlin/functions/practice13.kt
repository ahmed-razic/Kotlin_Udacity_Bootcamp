package functions

import java.util.*

fun main() {
    for (i in 1..30) {
        print("${rollDice(12)} ")
    }

    println("\n-----------------------------------------------------------------")

    for (i in 1..30) {
        print("${rollDice2(12)} ")
    }

    println("\n-----------------------------------------------------------------")

    gamePlay(0, rollDice)
    gamePlay(15, ::rollDice2)

}

val rollDice: (Int) -> Int = { sides: Int -> if(sides == 0) 0 else (1 until sides).random()}

fun rollDice2(sides: Int): Int {
    return if (sides == 0) {
        0
    } else {
        Random().nextInt(12) + 1
    }
}

fun gamePlay( sides: Int, operation: (Int) -> Int) {
    println(operation(sides))
}