package ActivitiesExercise
fun main (){
    /*
Activity 03 - A
Add try-catch , Activity 01 - D
*/
    var counter = 0
    while (true){
        //Input users amount
        print("Enter any Amount: ")
        var amount = readln().toInt()
        //Ask the user to enter again.
        if (amount <=0) println("Invalid Input Use positive numbers only.")
        print("Enter Again?Yes/No: ")
        var select = readln().toString()
        counter+=amount
        //checking input of the user into Conditions
        if (select == "Yes" || select == "yes") {
            continue
        }else if (select == "No" || select == "no") {
            println("Total of amounts is $counter")
                print("Divide the value by how many?: ")
                // Division
                var enterNum = readln().toInt()
            try{
                var output = counter/enterNum
                println("Result: "+output)
            }
            catch(e:ArithmeticException){
                println("You Shouldn't divide a number by zero")
            }
        }else println("Invalid Input!\nExiting..")
        break
    }
}