package classes

class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    var water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water = numberOfFish * 2000
        val tank: Double = water + water * 0.1
        height = (tank / (width * length)).toInt()
    }

/*    fun volume(): Int {
        return width * height * length / 1000
    }

    fun volume(): Int = width * height * length / 1000*/
}

class Fish(internal val friendly: Boolean = true, volumeNeeded: Int ) {
    val size: Int

    init {
        println("First init block")
    }

    constructor(): this (false, 9) {
        println("Running secondary constructor")
    }

    init {
        size = if(friendly) volumeNeeded else volumeNeeded * 2
        println("Second init block")
    }

    init {
        println("Constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("Last init block")
    }
}
