import kotlin.system.exitProcess

fun main (){
    //Welcome message to the user.
    print("\t----WELCOME----")
    println(" ")
    //Creating variable for the items.
    var item1 : String = "-Shampoo"
    var item2 : String = "-Soap"
    var item3 : String = "-Detergent Powder"
    var item4 : String = "-Pencil"
    var item5 : String = "-Bond papers"
    var item6 : String = "-envelopes"
    var item7 : String = "-Cabbage"
    var item8 : String = "-Orange"
    var item9 : String = "-Apple"
    var counter = 5
    // Asking the user to input and select.
    for ( i in 1..5 ){
        print("[1]:Add Item\n[2]:Go to inventory\n[3]:Exit\nSelect: ")
        --counter
            if (counter == 0){ println("Attempts Run Out. Try To run the Program Again. ")
                break}
        var select = readln().toString()
    //  Checking the Conditions to be executed.
        if (select.toInt() == 1){
            println("---Add Item---")
            print("Enter Item: ")
            var item = readln().toString()
            println("Success! $item is Added.")
            print("Go to Main Menu?Y/N: ")
            var select2 = readln().toString()
                if (select2 == "Y" || select2 == "y")
                    continue
                else if (select2 == "N" || select2 == "n")
                    break
                else print("Invalid Input")
                    break
        }else if (select.toInt() == 2){
            println("TIOLETRIES\n"+item1)
            println(item2)
            println(item3)
            println("SCHOOL SUPPLIES\n"+item4)
            println(item5)
            println(item6)
            println("FRUITS & VEGETABLES\n"+item7)
            println(item8)
            println(item9)
            break
        }else if(select.toInt() == 3){
                break
        }else {
            println("Warning you have $counter times attempt!")
            println("Invalid Input! Please Try Again")
            println(" ")
        }
    }
    println(" ")
    println("Thank you!")
    //END
}