package classes

class SimpleSpice{
    val spiceName: String = "curry"
    val spiciness: String = "mild"

    val heat: Int
        get() = 5

}

fun main() {
    val mySimpleSpice = SimpleSpice()

    println("Name of spice: ${mySimpleSpice.spiceName}")
    println("Spiciness of spice: ${mySimpleSpice.heat}")
}