package functions

fun main() {
    val spices = listOf("ccp", "red hot curry", "curry", "pepper", "cayenne", "cringlere", "ginger", "really spicy hot curry", "green curry", "red pepper")

    val curries = (spices.filter { it.contains("curry") }).sortedBy { it.length }
    println(curries)

    val spicesWithCE1 = spices.filter { it[0] == 'c' && it[it.length-1] == 'e' }
    println(spicesWithCE1)

    val spicesWithCE2 = spices.filter { it.startsWith('c') && it.endsWith('e')}
    println(spicesWithCE2)

    val firstThree = spices.take(3).filter { it[0] == 'c' }
    println(firstThree)

}