package beyond_basics

open class BaseBuildingMaterial() {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial(){
    override val numberNeeded: Int = 4
}
class Brick : BaseBuildingMaterial(){
    override val numberNeeded: Int = 8
}

class Building<T: BaseBuildingMaterial>(private val buildingMaterial: T) {
    private val baseMaterialNeeded: Int = 100
    val actualMaterialNeeded: Int = buildingMaterial.numberNeeded * baseMaterialNeeded

    fun build() {
        println(" $actualMaterialNeeded ${buildingMaterial::class.simpleName} required")
    }
}


fun main() {
    Building(Wood()).build()
}

