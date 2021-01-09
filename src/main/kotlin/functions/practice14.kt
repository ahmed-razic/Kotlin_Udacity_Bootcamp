package functions
//function recapitulation

fun main() {
    println("Hello Classes")

    println(namedFunction("item1", 1))
    println(singleLineFunction(item = "item2", number = 2, color = "red"))
    println(lambdaFunction("item3", 3, "yellow"))

    println(higherOrderFunction("item4", number = 4, color = "white") {item: String, number: Int, color: String -> "$number: $item, $color"})
    println(higherOrderFunction("item5", number = 5, color = "bright", lambdaFunction))
}

fun namedFunction(item: String, number: Int, color: String = "green"): String {
    return "$number: $item, $color"
}

fun singleLineFunction(item: String, number: Int, color: String = "green" ): String = "$number: $item, $color"

val lambdaFunction: (String, Int, String) -> String = {item: String, number: Int, color: String -> "$number: $item, $color"}

fun higherOrderFunction(item: String, number: Int, color: String, operation: (String, Int, String) -> String): String {
    return operation(item, number, color)
}