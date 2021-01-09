package classes

fun main() {
    //buildAquarium()
    fishExample()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println(myAquarium)

    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80
    println("Height: ${myAquarium.height}")
    println("Volume: ${myAquarium.volume}")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small aquarium tank volume: ${smallAquarium.volume}")
    println("Small aquarium water volume: ${smallAquarium.water}")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Length: ${myAquarium2.length} " +
            "Width: ${myAquarium2.width} " +
            "Height: ${myAquarium2.height} " +
            "Volume size: ${myAquarium2.volume}")
}

fun fishExample() {
//    val fish = Fish(friendly = true, volumeNeeded = 20)
//    println("Is the fish friendly? ${fish.friendly}. It needs volume: ${fish.size}")

    val fish2 = Fish()
    println("Is the fish friendly? ${fish2.friendly}. It needs volume: ${fish2.size}")
}
