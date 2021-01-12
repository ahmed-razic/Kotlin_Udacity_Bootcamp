package beyond_basics

fun main() {

    val equipment = "fishnet" to "catching fish"
    println(equipment.first)
    println(equipment.second)

    val equipment2 = "fishnet" to "catching fish" to "of big size" to "and strong"

    println(equipment)
    println(equipment2)

    println(equipment2.first.first.first)

    val fishnet = equipment2.first.first
    println(fishnet)

    val (tool, use) = fishnet

    println("tool is $tool and usage is $use")

    val fishnetString = fishnet.toString()
    val fishnetList = fishnet.toList()

    println(fishnetString)
    println(fishnetList)

    fun giveMeATool(): Pair<String, String> {
        return ("fishnet" to "catching fish")
    }

    val(tool2, use2) = giveMeATool()
    println("tool is $tool2 and usage is $use2")

}

internal fun buildAquarium() = Aquarium()

class Aquarium(val width: Int = 0, var height: Int = 40, val length: Int = 100) {
    var volume
        get() = width * height * length /1000
        set(value) {(height * 1000) / (width * length)}
}