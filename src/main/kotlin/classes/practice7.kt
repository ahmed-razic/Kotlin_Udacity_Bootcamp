package classes

object MobyDickWhale {
    var author = "Herman Melville"
    fun jump() {}
}

enum class Color(val rgb: Int) {
    RED(0XFF0000),
    GREEN(0X00FF00),
    BLUE(0X0000FF)
}

sealed class Seal

class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal) : String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}


fun main() {
    val myBook = MobyDickWhale
    println(myBook.author)
    myBook.jump()
    myBook.author = "ddd"
    println(myBook.author)

    val myBook2 = MobyDickWhale
    println(myBook)
    println(myBook2)
    println("${myBook === myBook2}")

    println("--------------------------------")
    println(Color.BLUE)
    println(Color.RED)
    println(Color.GREEN.rgb)

    println("--------------------------------")

    println(matchSeal(Walrus()))
    println(matchSeal(SeaLion()))
}


