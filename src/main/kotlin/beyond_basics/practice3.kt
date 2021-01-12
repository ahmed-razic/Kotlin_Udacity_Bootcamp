package beyond_basics

const val MAX_NUMBER_OF_BOOKS = 4

class Book(private val title: String = "Title",
           private val author: String ="Author",
           private val year: Int = 2000) {

    private val allBooks: Set<String> = setOf("Hamlet", "Book2", "Book3", "Book4")

    val library= mutableMapOf("Shakespeare" to allBooks)

    fun getTitleAndAuthor(): Pair<String, String> = (title to author)
    fun getTitleAndAuthorAndYear(): Triple<String, String, Int> = Triple(title, author, year)

    fun canBorrow(num: Int): Boolean {
        return num <= MAX_NUMBER_OF_BOOKS
    }

    fun printUrl() {
        println("$BASE_URL$title.html")
    }

    companion object BookConstants {
        const val BASE_URL = "http://www.books.com/"
    }
}

fun main(){
    val myBook = Book("Title", "Author", 2015)
    println(myBook.canBorrow(3))
    println(myBook.canBorrow(6))
    myBook.printUrl()
}



