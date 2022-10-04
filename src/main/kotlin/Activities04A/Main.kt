package Activities04A
/* Activity 04 - A Implement Activity 01 - B using OOP use all OOP concepts */
fun main(){
    println("\t---Welcome to E-Library---")
    var library = Books()
    var borrow = Borrow()
    while (true) {
        //Main menu of the program
        println("---MAIN MENU---")
        print(  "[1]:Books\n" +
                "[2]:Borrow a Book\n" +
                "[3]:Return Book\n" +
                "[4]:Borrowers Info\n" +
                "[5]:Borrowed Books\n" +
                "[6]:Exit\nSelect: ")
        var select = readln().toInt()
        // Checking Conditions
        if (select > 6 || select < 0) {
            println("Invalid Input/Out of range")
            break
        } else if (select == 1) {
            library.listofBooks1()
            println("Notes:")
              borrow.pages()
              borrow.category()
        } else if (select== 2) {
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
            try {
                var input3 = readln().toInt()
                library.borrowBooks2(input3)
                borrow.notesAndMessages()
            }catch (e:IndexOutOfBoundsException){
                println("Invalid Input! Your Input is Not in the list.")
            }catch (e:Exception){
                println("Invalid Input! or Invalid Input For Using A String")
                println("Please Try Again.")
            }
        } else if (select == 3) {
            library.borrowed_Books()
            println("---Return Book---")
            print("Enter Book Number: ")
            try {
                var returnBook = readln().toInt()
                library.returnBooks1(returnBook)
            }catch (e:IndexOutOfBoundsException){
                println("You don't have a Borrowed books or Invalid Input.")
            }catch (e:Exception){
                println("Invalid Input! or Invalid Input For Using A String")
                println("Please Try Again.")
            }
        } else if (select == 4) {
            library.printUser()
        } else if (select == 5) {
            library.borrowed_Books()
        } else if (select == 6) {
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