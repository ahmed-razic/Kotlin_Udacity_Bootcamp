package beyond_basics

fun main() {
    nullableExample()
}

class BigAquarium(val color: String = "green", private val size: Int)

val BigAquarium.isGreen: Boolean
    get() = color == "green"

fun BigAquarium?.pull() {
    this?.apply { println("$this") }
}

fun nullableExample() {
    val plant: BigAquarium? = null
    plant.pull()
}