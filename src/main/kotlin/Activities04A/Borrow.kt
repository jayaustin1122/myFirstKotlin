package Activities04A
class Borrow:BookDetails(){
    open fun borrowBooks2(book:Int):Int{
        borrowedBooks.add(books1[book-1])
        println("You Borrowed ${books1[book-1]} ")
        books1.remove(books1[book-1])
        println("Success! Don't Forget to return It.")
        println(books1)
        println("------------------------------")
        return book
    }
    fun borrowed_Books(){
        println("---Your Borrowed Books---")
        var counter = 0
        for (i in borrowedBooks){
            counter +=1
            println("${counter}: $i" )
        }
        println("------------------------------")
    }
}
