package classes

fun main() {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d2)

    val d3 = Decorations("slate")
    println(d3)

    val d4 = d3.copy()
    println(d4)

    val d5 = Decorations2("crystal", "oak", "plastic doll")
    println(d5)

    println("----------------------------------------")
    val(rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

data class Decorations(val rocks: String) {}

data class Decorations2(val rocks: String, val wood: String, val diver: String){}