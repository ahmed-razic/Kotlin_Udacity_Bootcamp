package beyond_basics

const val width = 5     //determined at compile time and declared at top level

fun main() {
    val number = 5  //determined at runtime

    val item: Int = getDouble(number) //determined at runtime

    val foo = Constants.NAME_CONSTANT
    println(foo)
    println(item)

    println(MyClassOfConstants.CONSTANT2)
    println(MyClassOfConstants.CONSTANT2)

    val myObject = MyClassOfConstants()
    println(myObject.toString())



}

fun getDouble(num: Int): Int {
    return 2 * num
}

object Constants {
    const val NAME_CONSTANT: String = "My Name" //determined at compile time and declared in object
}

class MyClassOfConstants {
    companion object {
        const val CONSTANT2: String = "const in object companion"
    }

/*    object Constants {
        const val NAME_CONSTANT: String = "My Name" //determined at compile time and declared in object
    }*/
}



