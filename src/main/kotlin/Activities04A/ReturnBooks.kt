package Activities04A

class ReturnBooks:BookDetails(){
    //Function return books
    fun returnBooks1(book: Int):Int {
        books1.add(borrowedBooks[book-1])
        println("Success! ${borrowedBooks[book-1]} is Returned to our library!\nThank You!")
        borrowedBooks.remove(borrowedBooks[book-1])
        println("------------------------------")
        return book
    }
}
