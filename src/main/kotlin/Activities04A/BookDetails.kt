package Activities04A
open class BookDetails:OtherInfo(),MoreInfo{
    var books1 = arrayListOf<String>("Trigo", "Comic Book", "Newspaper","Science")
    var borrowedBooks = arrayListOf<String>()
    var fullName1 = arrayListOf<String>()
    var datenow1 = arrayListOf<String>()


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

    override fun pages(){
        println("Every Books have the 200 pages in total.")
    }
    override fun category() {
        println("Category is not Fully Functional and Organized.")
    }
    override fun notesAndMessages() {
        println("Please Make sure to return this book to our library.")
    }
}

