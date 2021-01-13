package beyond_basics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater: WaterSupply(true){
    fun addChemicalCleaners(){
        needsProcessing = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true) {
    fun filter(){
        needsProcessing = false
    }
}

class Aquarium2<T: Any?>(val waterSupply: T)

fun genericExample(){
    val aquarium2: Aquarium2<TapWater> = Aquarium2(TapWater())
    aquarium2.waterSupply.addChemicalCleaners()

    val aquarium3 = Aquarium2("string")
    aquarium3.waterSupply.length

    val aquarium4 = Aquarium2(null)
    aquarium4.waterSupply
}



