package beyond_basics

class MyIntList {
    fun get(pos: Int) : Int {return 0}
    fun addItem(item: Int) {}
}

class MyShortList {
    fun get(pos: Int): Short {return 0}
    fun addItem(item: Short) {}
}

class MyList<T> {
    fun get(pos: Int): T {
        TODO()
    }
    fun addItem(item: T){}
}

fun workWithMyList(){
    val myIntList: MyList<Int> = MyList()
    val myShortList: MyList<Float> = MyList()
}