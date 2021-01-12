package beyond_basics


class Book1(private val title: String = "Title", private val author: String ="Author", private val year: Int = 2021) {

    fun getTitleAndAuthor(): Pair<String, String> = (title to author)

    fun getTitleAndAuthorAndYear(): Triple<String, String, Int> = Triple(title, author, year)
}

fun main() {
    val myBook = Book1()
    println("Here is your book ${myBook.getTitleAndAuthor().first} written by ${myBook.getTitleAndAuthor().second} in ${myBook.getTitleAndAuthorAndYear().third}")
}