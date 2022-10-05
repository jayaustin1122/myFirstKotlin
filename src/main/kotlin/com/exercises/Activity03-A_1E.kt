package ActivitiesExercise
//Activity 03 - A Add try-catch, Activity 01 - E
fun main (){
//    Create an application that will accept 2 string inputs.
//    Your application will print all unique characters in both Strings.
    // input user
    println("----Print Unique Characters in a String----")
    while (true) {
        try {
            //input the user every loop
            print("Enter any word: ")
            var word = readln().toString()
            if (word.isNullOrEmpty()){
                throw Exception()
            }
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
            } else if (input == "No" || input == "no") {
                break
            }
        }catch (e:Exception){
            println("Invalid Input! PLease Try Again")
        }
    }
    println("\nThank You.")
}