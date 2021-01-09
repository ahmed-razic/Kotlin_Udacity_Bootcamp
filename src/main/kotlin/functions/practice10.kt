package functions

fun main() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    println(decorations)

    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    val lazy = decorations.asSequence().filter { it[0] == 'p' }
    println(lazy)
    println(lazy.first())
    println(lazy.toList())

    val lazyMap = decorations.asSequence().map {
        println("map: $it")
        it
    }

    println( "first: ${ lazyMap.first() }")
    println( "all: ${ lazyMap.toList() }")


}