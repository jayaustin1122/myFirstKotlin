package com.exercises

fun main(){
    //Implement Activity 02 - B using Classes.
    println("\t---Welcome to E-Library---")
    var library = MiniLibrary()
    while (true) {
        //Main menu of the program
        println("---MAIN MENU---")
        print("[1]:Books\n[2]:Borrow a Book\n[3]:Return Book\n[4]:Borrowers Info\n[5]:Borrowed Books\n[6]:Exit\nSelect: ")
        var select = readln().toString()
        // Checking Conditions
        if (select.length > 2) {
            println("Invalid Input/Out of range")
            break
        } else if (select.toInt() == 1) {
            library.listofBooks1()
        } else if (select.toInt() == 2) {
            //enter user's details
            println("---Fill This Form to Borrow a book---")
            print("Enter Name: ")
            var input1 = readln()
            print("Enter Current Date[mm/dd/yyyy]: ")
            var input2 = readln()
            library.userInfo1(input1,input2)
            library.listofBooks1()
            println("---Borrow a Books---")
            print("Select Book Num: ")
            var input3 = readln().toInt()
            library.borrowBooks2(input3)
        } else if (select.toInt() == 3) {
            library.borrowed_Books()
            println("---Return Book---")
            print("Enter Book Number: ")
            var returnBook = readln().toInt()
            library.returnBooks1(returnBook)
        } else if (select.toInt() == 4) {
            library.printUser()
        } else if (select.toInt() == 5) {
            library.borrowed_Books()
        } else if (select.toInt() == 6) {
            break
        }else {
            println("Invalid Input! Use Numbers only")
            break
        }
        print("Go to Main Menu?Y/N: ")
        var select3 = readln()
        if (select3 == "Y" || select3 == "y")
            continue
        else if (select3 == "N" || select3 == "n"){
            println("Exiting")
            break
        }else print("Invalid Input")
        break
    }
}
class MiniLibrary{
    var books1 = arrayListOf<String>("Trigo", "Comic Book", "Newspaper","Science")
    var borrowedBooks = arrayListOf<String>()
    var fullName1 = arrayListOf<String>()
    var datenow1 = arrayListOf<String>()
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
    fun borrowed_Books(){
        println("---Your Borrowed Books---")
        var counter = 0
        for (i in borrowedBooks){
            counter +=1
            println("${counter}: $i" )
        }
        println("------------------------------")
    }
    //Function for Borrow books.
    fun borrowBooks2(book:Int):Int{
        borrowedBooks.add(books1[book-1])
        println("You Borrowed ${books1[book-1]} ")
        books1.remove(books1[book-1])
        println("Success! Dont Forget to return It.")
        println("------------------------------")
        return book
    }
    //Function for users input details.
    fun userInfo1(fullname:String,date:String){
        fullName1.add(fullname)
        datenow1.add(date)
        println("------------------------------")
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
}