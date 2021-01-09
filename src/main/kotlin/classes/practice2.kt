package classes

class Spice(val name: String, val spiciness: String = "mild") {

    init {
        println("Spice object created, name: $name, spiciness: $heat")
    }

    val heat: Int
        get() {
            return when(spiciness){
                "blend" -> 1
                "semi-mild" -> 3
                "mild" -> 5
                "spicy" -> 7
                "hot" -> 10
                else -> 0
            }
        }
}

fun main() {
    val listOfSpices = listOf(Spice(name = "Onion", spiciness = "mild"),
                            Spice(name = "Pepper", spiciness = "semi-mild"),
                            Spice("Curry", "spicy"),
                            Spice("Paprika", "hot"))

    val spices = listOfSpices.filter { it.heat <= 7 }
    for(i in spices) println(i.name)

    fun makeSalt() = Spice("salt")

}