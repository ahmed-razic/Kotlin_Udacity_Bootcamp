package beyond_basics

fun main() {
    "Has spaces in sentence ?".hasSpaces()
    "Has spaces in sentence ?".hasSpaces2()

    val myPlant: AquariumPlant = AquariumPlant()
    println(myPlant.isRed())

    val myGreenPlant: GreenLeafyAquariumPlant = GreenLeafyAquariumPlant(200)
    println(myGreenPlant.isGreen())

    myPlant.print()
    myGreenPlant.print()

    val otherPlant: AquariumPlant = myGreenPlant
    otherPlant.print() //extension function are resolved statically, that is at compile time (before execution-runtime)
}

fun String.hasSpaces(): Boolean {
    val found: Char? = this.find {it == ' '}
    return found != null
}

fun String.hasSpaces2(): Boolean = find { it == ' '} != null


open class AquariumPlant(val color: String = "red", private val size: Int = 100)
class GreenLeafyAquariumPlant(val size: Int) : AquariumPlant(color = "green", size)

fun AquariumPlant.isRed(): Boolean = color == "red"
fun GreenLeafyAquariumPlant.isGreen(): Boolean = color == "green"

fun AquariumPlant.print() = println("Aquarium Plant")
fun GreenLeafyAquariumPlant.print() = println("GreenLeafy Plant")

// size property is private inside of class AquariumPlant and
// therefore not accessible to extension function isBig()

//fun AquariumPlant.isBig(): Boolean = size > 50

