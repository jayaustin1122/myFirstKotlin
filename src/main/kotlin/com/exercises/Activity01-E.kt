import kotlin.system.exitProcess

fun main () {
//    Create an application that will accept 2 string inputs.
//    Your application will print all unique characters in both Strings.
    // input user
    println("----Print Unique Characters in a String----")
    while (true) {
        //input the user every loop
        print("Enter any word: ")
        var word = readln().toString()
        for (i in 0 until word.length) {
            var myVar = 0
            for (new in 0 until word.length) {
                if (word[i] == word[new] && i != new) {
                    myVar = 1
                    break
                }
            }
            if (myVar == 0)
                print("-${word[i]}")
        }
        //ask the user to input yes or no
        print("\nEnter Again?Yes/No: ")
        var input = readln()
        if (input == "Yes") {
        } else if (input == "No" || input == "no"){
            break
        }
    }
    println("\nThank You.")
}



