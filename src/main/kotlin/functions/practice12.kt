package functions

const val dirtyValue: Int = 20
val waterFilter: (Int) -> Int = {dirty:Int -> dirty/2}

fun main() {
    println(updateDirty(dirtyValue, waterFilter))
    println(updateDirty(dirtyValue, ::feedFish))
    println(updateDirty(dirtyValue) { dirtyValue -> dirtyValue + 50})
}

fun feedFish(dirty: Int) = dirty + 50

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
