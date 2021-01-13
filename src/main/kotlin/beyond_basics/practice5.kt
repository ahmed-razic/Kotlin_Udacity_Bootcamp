package beyond_basics

import java.util.*

fun main() {

    val book = ReadingBook("Title", "Author", 2200, 250 )
    println(book.pages)
    val puppy = Puppy()

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println(book.pages)
    }
}

class ReadingBook(val title: String, val author: String, val year: Int, var pages: Int)

fun ReadingBook.tornPages(tornPages: Int) = if(pages > tornPages) pages -= tornPages else pages = 0


fun ReadingBook.weight(): Double = pages * 1.5

class Puppy(){
    fun playWithBook(myBook: ReadingBook) {
        myBook.tornPages(Random().nextInt(12))
    }
}

class PuzzleToy(val treats: List<String>)