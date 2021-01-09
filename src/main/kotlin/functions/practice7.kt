package functions

fun main() {
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad", temperature = 30, weather = "sunny"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}


