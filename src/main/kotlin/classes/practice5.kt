package classes



abstract class FoodSpice(val name: String, private val spiciness: String = "mild", private val spiceColor: SpiceColor) : SpiceColor by spiceColor {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }
    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpice : SpiceColor {
    override val color = "yellow"
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpice) : FoodSpice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
    }
}

fun main(){
    val curry = Curry("Curry", "very spicy")
    println("Name of spice is ${ curry.name }.")
    println("Spiciness of curry is ${ curry.heat }.")
    println("Color of spice is ${ curry.color }.")
}











/*
val spices1 = listOf(
    FoodSpice("curry", "mild"),
    FoodSpice("pepper", "medium"),
    FoodSpice("cayenne", "spicy"),
    FoodSpice("ginger", "mild"),
    FoodSpice("red curry", "medium"),
    FoodSpice("green curry", "mild"),
    FoodSpice("hot pepper", "extremely spicy")
)
val spice = FoodSpice("cayenne", spiciness = "spicy")
val spicelist = spices1.filter {it.heat < 5}

fun makeSalt() = Spice("Salt")*/
