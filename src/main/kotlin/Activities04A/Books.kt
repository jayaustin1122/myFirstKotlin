package Activities04A

open class Books:OtherInfo(){
    var books1 = arrayListOf<String>("Trigo", "Comic Book", "Newspaper","Science")
    var borrowedBooks = arrayListOf<String>()
    var fullName1 = arrayListOf<String>()
    var datenow1 = arrayListOf<String>()
    override fun notesAndMessages() {
        println("Notes:\n Please Return it after 5 Days Thank you!")
    }
    open fun borrowBooks2(book:Int):Int{
        borrowedBooks.add(books1[book-1])
        println("You Bo rrowed ${books1[book-1]} ")
        books1.remove(books1[book-1])
        println("Success! Don't Forget to return It.")
        println(books1)
        println("------------------------------")
        return book
    }
    //Function return books
    fun returnBooks1(book: Int):Int {
        books1.add(borrowedBooks[book-1])
        println("Success! ${borrowedBooks[book-1]} is Returned to our library!\nThank You!")
        borrowedBooks.remove(borrowedBooks[book-1])
        println("------------------------------")
        return book
    }
    fun printUser(){
        var counter1 = 1
        var counter2 = 0
        println("Borrowers Details:")
        println("------------------------------")
        for (i in fullName1) {
            println("${counter1}:\nName: $i\n" +
                    "Date Borrowed: ${datenow1[counter2]}\n" +
                    "Borrowed Books: ${borrowedBooks[counter2]}")
            println("---------------------------------")
        }
    }
    //Function for list of books.
    fun listofBooks1(){
        println("---Books---")
        var counter = 0
        for (i in books1){
            counter +=1
            println("${counter}: $i" )
        }
        println("------------------------------")
    }
    //Function for users input details.
    fun userInfo1(fullname:String,date:String){
        fullName1.add(fullname)
        datenow1.add(date)
        println("------------------------------")
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