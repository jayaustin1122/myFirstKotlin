fun main() {
        //Using Activity 01 - B and Implement a process where someone can borrow a book.

        println("\t---Welcome To School E-Library---")
        println("")
        // Arraylist the containers
        var books = arrayListOf<String>("Mathematics","Science","Comic Book","Newspaper")
        var fullName = arrayListOf<String>()
        var  datenow = arrayListOf<String>()
        while (true){
                //enter user's details
                println("---Fill This Form---")
                print("Enter Name: ")
                var input1 = readln().toString()
                fullName.add(input1)
                print("Enter Current Date[mm/dd/yyyy]: ")
                var input2 = readln().toString()
                datenow.add(input2)
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
                                println("---Books---")
                                var counter = 0
                                for (i in books){
                                        counter +=1
                                        println("${counter.toString()}: $i" )
                                }
                        }else if(select.toInt() == 2){
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

                        }else if(select.toInt() == 3){
                                println("---Return Book---")
                                print("Enter Book: ")
                                var input2 = readln().toString()
                                books.add(input2)
                                println("Success $input2 is Returned to our library!")
                        }else if(select.toInt() == 4){
                                break
                        }else  {
                                println("Invalid Input!/Out of Range!")
                                break
                        }
        //Message if the user wwants to continue or go to main the main menu
                        print("Go to Main Menu?Y/N: ")
                        var ask = readln().toString()
                        if (ask == "Y" || ask == "y")
                                continue
                        else if (ask == "N" || ask == "n"){
                                println("Exiting...")
                                break
                        }else print("Invalid Input")
                        break
                }
                println("Thank you!")
                break
        }
}