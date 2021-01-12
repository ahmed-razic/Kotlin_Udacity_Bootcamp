package beyond_basics

fun main() {
    val testList: List<Int> = listOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    println(reverseList(testList))
    println(reverseList2(testList))

    val reversed = testList.reversed()
    println(reversed)

    val symptoms: MutableList<String> = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")
    println(symptoms.contains("red"))
    println(symptoms.contains("red spots"))

    println(symptoms.subList(4, symptoms.size))

    println(listOf(1, 2, 3).sum())

    println(listOf("aa", "bbb", "cccc", "dddd").sumBy { it.length })
}

fun reverseList(list: List<Int>): List<Int> {
    val result: MutableList<Int> = mutableListOf()
    for (i: Int in list.indices) result.add(list[list.size - i -1])

    return result
}

fun reverseList2(list: List<Int>): List<Int> {
    val result: MutableList<Int> = mutableListOf()
    for(i: Int in list.size-1 downTo 0) {
        result.add(list[i])
    }
    return result
}



