fun main(){
//Implement Activity 02 - B using Classes.
    println("\t---Welcome to E-Library---")
    var library = MiniLibrary()
    library.mainMenuofLibrary()
}
//global variable
class MiniLibrary() {
    var books1 = arrayListOf<String>("English", "Trigo", "Comic Book", "Newspaper")
    var fullName1 = arrayListOf<String>()
    var datenow1 = arrayListOf<String>()

    fun mainMenuofLibrary() {
        while (true) {
            //Main menu of the program
            println("---MAIN MENU---")
            print("[1]:Books\n[2]:Borrow a Book\n[3]:Return Book\n[4]:Borrowers Info\n[5]:Exit\nSelect: ")
            var select = readln().toString()
            // Checking Conditions
            if (select.length > 5) {
                println("Invalid Input/Out of range")
                break
            } else if (select.toInt() == 1) {
                listofBooks1()
            } else if (select.toInt() == 2) {
                userInfo1()
                borrowBooks1()
            } else if (select.toInt() == 3) {
                returnBooks1()
            } else if (select.toInt() == 4) {
                printUser()
            } else if (select.toInt() == 5) {
                break
            }else {
                println("Invalid Input!/Out of Range!")
                break
            }
            println("Thank you!")
            break
        }
    }

    //Function for list of books.
    fun listofBooks1 (){
        println("---Books---")
        var counter = 0
        for (i in books1){
            counter +=1
            println("${counter.toString()}: $i" )
        }
        mainMenuofLibrary()
    }
    //Function for Borrow books.
    fun borrowBooks1(){
        println("---Borrow a Books---")
        var counter = 0
        for (i in books1){
            counter +=1
            println("${counter.toString()}: $i" )
        }
        //Checking another condtion
        print("Select[1-4]: ")
        var input = readln().toString()
        if      (input.toInt() == 1){
            books1.remove(books1[0])
            println("Success! Dont Forget to return It.")
            for (i in fullName1)
                for (j in datenow1)
                    println("Borrower Full Name: $i\nDate Borrowed: $j")
        }else if (input.toInt() == 2){
            books1.remove(books1[1])
            println("Success! Dont Forget to return It.")
            for (i in fullName1)
                for (j in datenow1)
                    println("Borrower Full Name: $i\nDate Borrowed: $j")
        }else if (input.toInt() == 3){
            books1.remove(books1[2])
            println("Success! Dont Forget to return It.")
            for (i in fullName1)
                for (j in datenow1)
                    println("Borrower Full Name: $i\nDate Borrowed: $j")
        }else if (input.toInt() == 4){
            books1.remove(books1[3])
            println("Success! Dont Forget to return It.")
            for (i in fullName1)
                for (j in datenow1)
                    println("Borrower Full Name: $i\nDate Borrowed: $j")
        }else println("Invalid Input!/Out of Range!")
        mainMenuofLibrary()
    }
    //Function for users input details.
    fun userInfo1(){
        //enter user's details
        println("---Fill This Form---")
        print("Enter Name: ")
        var input1 = readln().toString()
        fullName1.add(input1)
        print("Enter Current Date[mm/dd/yyyy]: ")
        var input2 = readln().toString()
        datenow1.add(input2)
        borrowBooks1()
    }
    //Function return books
    fun returnBooks1() {
        println("---Return Book---")
        print("Enter Book: ")
        var input2 = readln().uppercase()
        books1.add(input2)
        println("Success $input2 is Returned to our library!")
        mainMenuofLibrary()
    }
    fun printUser(){
        var counter1 = 1
        var counter2 = 0
        println("Borrowers Details:")
        println("------------------------------")
        for (i in fullName1){
            println("${counter1}: Name: $i\nDate Borrowed: ${datenow1[counter2]}")
        }
        mainMenuofLibrary()
    }
}