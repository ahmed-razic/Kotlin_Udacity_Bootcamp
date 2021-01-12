package beyond_basics

fun main() {
    val allBooks: Set<String> = setOf("Hamlet", "Book2", "Book3", "Book4")

    val library= mutableMapOf("Shakespeare" to allBooks)

    println("${ library.any { it.component2().contains("Hamlet") } }")

    val moreBooks: MutableMap<String, String> = mutableMapOf()

    moreBooks.put("Author 2 ", " Book 20")
    moreBooks["Author 3 "] = " Book 30"
    moreBooks.getOrPut("Author 4 ") { " Book 40"}
    println(moreBooks.getOrPut("Author 3 ") { " Book 30" })
    println(moreBooks)


}



/*
class Book(private val title: String = "Title", private val author: String ="Author", private val year: Int = 2021) {

    fun getTitleAndAuthor(): Pair<String, String> = (title to author)

    fun getTitleAndAuthorAndYear(): Triple<String, String, Int> = Triple(title, author, year)
}

fun main() {
    val myBook = Book()
    println("Here is your book ${myBook.getTitleAndAuthor().first} written by ${myBook.getTitleAndAuthor().second} in ${myBook.getTitleAndAuthorAndYear().third}")
}*/
