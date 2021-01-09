package functions

fun main() {
    println(whatShouldIDo("happy", "sunny"))
    println(whatShouldIDo("sad"))
    println(whatShouldIDo("sad", weather = "rainy"))
    print("How do you feel?")
    println(whatShouldIDo(readLine()!!))
}

fun whatShouldIDo(mood: String?, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isSunny(mood, weather, temperature)-> "go for a walk"
        isRainy(mood, weather, temperature) -> "stay in bed"
        isWarm(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isSunny(mood: String?, weather: String, temperature: Int): Boolean = mood == "happy" && weather == "sunny"
fun isRainy(mood: String?, weather: String, temperature: Int): Boolean = mood == "sad" && weather == "rainy"
fun isWarm(temperature: Int): Boolean = temperature > 35