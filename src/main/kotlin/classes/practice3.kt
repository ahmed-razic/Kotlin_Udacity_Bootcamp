package classes

open class Book( val title: String, val author: String) : Any() {
    private var currentPage: Int = 1

    open fun readPage() {
        currentPage++
    }
}

class EBook(val format: String = "text") : Book("E-Book Title", "Author E-Name") {
    private var wordCount = 0
    override fun readPage() {
         wordCount += 250
    }

}

fun main() {
    val myBook = Book("Book Title", "Author Name")
    println("${myBook.title}, ${myBook.author}")

    val eBook = EBook("Text-format")
    println("${eBook.title}, ${eBook.author}, ${eBook.format}")
}