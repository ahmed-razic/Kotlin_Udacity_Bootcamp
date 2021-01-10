package classes

abstract class AquariumFish {
    abstract val color: String
}

interface FishAction {
    fun eat()
}

open class Shark: AquariumFish(), FishAction {
    override val color: String = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color: String = "gold"
    override fun eat() {
        println("munch on algae")
    }
}