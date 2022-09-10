fun main () {
//Welcome message to the user..
    print("\t----WELCOME TO CARDO'S GROCERY STORE----")
    println()
//using arraylist as the container for the items.
    var toiletries = arrayListOf<String>("Shampoo", "Soap", "Detergent Powder")
    var scSupplies = arrayListOf<String>("Pencil", "Bond paper", "Envelope")
    var fruits = arrayListOf<String>("Orange", "Apples", "Grapes")
//Using While loop for iterating conditions
    while (true) {
        print("[1]:Add Item\n[2]:Go to inventory\n[3]:Exit\nSelect: ")
        var select1 = readln().toString()
// Check input and compare to conditions
        if (select1.length > 1) {       //select .length control input
            println("Invalid Input!/ Just Choose 1-3")
            continue
        } else if (select1.toInt() == 1) {
            println()
            println("---Add Item---")
            println()
        //Check another conditions needed.
            print("Which Section?\n[1]:TOILESTRIES\n[2]:SCHOOL SUPPLIES\n[3]:FRUITS\nSelect: ")
            var select2 = readln().toString()
            println("You Choose Section $select2")
            if (select2.toInt() == 1) {
                println("---TOILESTRIES SECTION---")
                print("Add an item: ")
                var additem = readln().toString()
                toiletries.add(additem)
                println("Success! $additem is Added.")
                for (i in toiletries)
                    println(i)
                continue
            } else if (select2.toInt() == 2) {
                println("---SCHOOL SUPPLIES SECTION---")
                print("Add an item: ")
                var additem = readln().toString()
                scSupplies.add(additem)
                println("Success! $additem is Added.")
                for (i in scSupplies)
                    println(i)
                continue
            } else if (select2.toInt() == 3) {
                println("--FRUITS SECTION--")
                print("Add an item: ")
                var additem = readln().toString()
                fruits.add(additem)
                println("Success! $additem is Added.")
                for (i in fruits)
                    println(i)
                continue
            } else {
                println("Invalid Input")
                break
            }
// Printing all category of groceries
        }else if (select1.toInt() == 2) {
            println("---TOILESTRIES SECTION---")
            for (i in toiletries)
                println(i)
            println("---SCHOOL SUPPLIES SECTION---")
            for (i in scSupplies)
                println(i)
            println("--FRUITS SECTION--")
            for (i in fruits)
                println(i)
// Exit program
        }else if (select1.toInt() == 3) {
            println("Exiting")
            break
        }else{
            println("Invalid Input!")
        }
// Ask the user to go to main menu or not.
        print("Go to Main Menu?Y/N: ")
        var select3 = readln().toString()
        if (select3 == "Y" || select3 == "y")
            continue
        else if (select3 == "N" || select3 == "n"){
            println("Exiting")
            break
        }else print("Invalid Input")
        break
    }
    println("Thank you!")
}