fun main() {
        //Using Activity 01 - B and Implement a process where someone can borrow a book.

        println("\t---Welcome To School E-Library---")
        println("")
        // Arraylist to make the container of the books
        var books = arrayListOf<String>("Mathematics","Science","Comic Book","Newspaper")
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
                        }else if (input.toInt() == 2){
                                books.remove(books[1])
                                println("Success! Dont Forget to return It.")
                        }else if (input.toInt() == 3){
                                books.remove(books[2])
                                println("Success! Dont Forget to return It.")
                        }else if (input.toInt() == 4){
                                books.remove(books[3])
                                println("Success! Dont Forget to return It.")
                        }else println("Invalid Input!/Out of Range!")
                }else if(select.toInt() == 3){
                        println("---Return Book---")
                        print("Enter Book: ")
                        var input2 = readln().toString()
                        books.add(input2)
                        println("Success $input2 is Returned to our library!")
                }else if(select.toInt() == 4){
                        break
                }else println("Invalid Input!/Out of Range!")
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
}