package classes

data class SpiceContainer(val spice: FoodSpice) {
    val label: String = spice.name
}

fun main() {

    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow curry", "spicy")),
        SpiceContainer(Pepper("Brown Pepper", "mild", BrownSpice)),
        SpiceContainer(Curry("Red curry", "spicy")))

    for (element in spiceCabinet) println(element.label)
}