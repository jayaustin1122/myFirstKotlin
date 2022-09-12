//global variable
var books = arrayListOf<String>("Mathematics","Science","Comic Book","Newspaper")
var fullName = arrayListOf<String>()
var  datenow = arrayListOf<String>()
fun main(){
    //Implement Activity 01 -  B using data structure.
    println("\t---Welcome To School E-Library---")
    println("")
    while (true) {
        //Main menu of the program
        println("---MAIN MENU---")
        print("[1]:Books\n[2]:Borrow a Book\n[3]:Return Book\n[4]:Exit\nSelect: ")
        var select = readln().toString()
        // Checking Conditions
        if (select.length > 1){
            println("Invalid Input/Out of range")
            break
        }else if(select.toInt() == 1){
            listofBooks()
        }else if(select.toInt() == 2){
            borrowBooks()
        }else if(select.toInt() == 3){
            returnBooks()
        }else if(select.toInt() == 4){
            break
        }else  {
            println("Invalid Input!/Out of Range!")
            break
        }
        askUser()
        println("Thank you!")
        break
    }
}
//Function for list of books.
fun listofBooks (){
    println("---Books---")
    var counter = 0
    for (i in books){
        counter +=1
        println("${counter.toString()}: $i" )
    }
}
//Function for Borrow books.
fun borrowBooks(){
    println("---Borrow a Books---")
    var counter = 0
    for (i in books){
        counter +=1
        println("${counter.toString()}: $i" )
    }

    //Checking another condtion
    print("Select[1-4]: ")
    var input = readln().toString()
    if      (input.toInt() == 1){
        books.remove(books[0])
        println("Success! Dont Forget to return It.")
        for (i in fullName)
            for (j in datenow)
                println("Borrower Full Name: $i\nDate Borrowed: $j")
    }else if (input.toInt() == 2){
        books.remove(books[1])
        println("Success! Dont Forget to return It.")
        for (i in fullName)
            for (j in datenow)
                println("Borrower Full Name: $i\nDate Borrowed: $j")
    }else if (input.toInt() == 3){
        books.remove(books[2])
        println("Success! Dont Forget to return It.")
        for (i in fullName)
            for (j in datenow)
                println("Borrower Full Name: $i\nDate Borrowed: $j")
    }else if (input.toInt() == 4){
        books.remove(books[3])
        println("Success! Dont Forget to return It.")
        for (i in fullName)
            for (j in datenow)
                println("Borrower Full Name: $i\nDate Borrowed: $j")
    }else println("Invalid Input!/Out of Range!")

}
//Function for users input details.
fun userInfo(){
    //enter user's details
    println("---Fill This Form---")
    print("Enter Name: ")
    var input1 = readln().toString()
    fullName.add(input1)
    print("Enter Current Date[mm/dd/yyyy]: ")
    var input2 = readln().toString()
    datenow.add(input2)
}
//Function return books
fun returnBooks(){
    println("---Return Book---")
    print("Enter Book: ")
    var input2 = readln().toString()
    books.add(input2)
    println("Success $input2 is Returned to our library!")
}
fun askUser(){
    //Message if the user wants to continue or go to main the main menu
    while (true) {
        print("Go to Main Menu?Y/N: ")
        var ask = readln().toString()
        if (ask == "Y" || ask == "y")
            continue
        else if (ask == "N" || ask == "n") {
            println("Exiting...")
            break
        } else print("Invalid Input")
        break
    }

}