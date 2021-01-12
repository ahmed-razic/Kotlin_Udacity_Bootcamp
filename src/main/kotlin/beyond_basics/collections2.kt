package beyond_basics


fun main() {
    val cures: Map<String, String> = mapOf<String, String>("white spots" to "Ich", "red sores" to "hole disease" )

    println(cures.get("white spots"))
    println(cures["white spots"])

    println(cures.getOrDefault("bloating", defaultValue = "Sorry..."))
    println(cures.getOrElse("bloating") {"Find another cure in pharmacy"})

    val inventory: MutableMap<String, Int> = mutableMapOf("fish net" to 1)

    inventory["tank scrubber"] = 2
    inventory["water additive"] = 3
    inventory.put("salt doser", 4)

    println(inventory)

}

