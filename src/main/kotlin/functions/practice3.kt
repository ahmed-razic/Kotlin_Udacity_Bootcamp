package functions

import java.util.*

fun main() {
    feedTheFish()
}

fun feedTheFish() {
    val day: String = randomDay()
    val food: String = fishFood(day)
    println("Today is $day and the fish eat $food")

    if (shouldChangeWater(day)) println("Change the water today")
    if (shouldChangeWater(day, temperature = 20, dirty = 40)) println("Change the water today")
}

fun randomDay(): String {
    val week = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "red-worms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}
fun getDirtySensorReading(): Int = 20

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {

    return when {
        isSunday(day) -> true
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        else -> false
    }

}

fun isTooHot(temperature: Int): Boolean = temperature > 30
fun isDirty(dirty: Int): Boolean = dirty > 30
fun isSunday(day: String): Boolean = day == "Sunday"
