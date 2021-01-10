package classes

interface FishColor {
    val color: String
}

interface FishinAction {
    fun eat()
}

class Trout(fishColor: FishColor = GoldColor) :
    FishColor by fishColor,
    FishinAction by PrintingFishInAction("Trout eats lot of mosquitoes")

class Salmon(fishColor: FishColor):
    FishColor by fishColor,
    FishinAction by PrintingFishInAction("Salmon eats small fish")

object GoldColor : FishColor {
    override val color: String = "gold"
}

object RedColor : FishColor {
    override val color: String = "red"
}

class PrintingFishInAction(private val food: String) : FishinAction {
    override fun eat() {
        println(food)
    }
}


fun main() {
    delegate()
}

fun delegate() {
    val trout = Trout()
    println("${trout.color}")
    trout.eat()

    val salmon = Salmon(RedColor)
    println("${salmon.color}")
    salmon.eat()

}