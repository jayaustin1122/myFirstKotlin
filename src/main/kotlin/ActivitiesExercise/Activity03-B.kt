package ActivitiesExercise
/*
Activity 03 - B
Create JUnit test for Activity 01 - D
 */
fun main (){
    fun newComputeAmount() = Amount()
    //Input users amount
    var counter : Double = 0.0
    while (true){
        print("Enter any Amount: ")
        var amount = readln().toDouble()
        newComputeAmount().computeAmount(amount)
        print("Enter Again?Yes/No: ")
        var select = readln()
        counter+=amount
        //checking input of the user into Conditions
        if (select == "Yes" || select == "yes") {
            continue
        }else if (select == "No" || select == "no") {
            println("Total of amounts is $counter")
            print("Divide the value by how many?: ")
            // Division
            var enterNum = readln().toDouble()
            var finalResult = counter / enterNum
            println("Equals $finalResult")
            println("Thankyou!")
            break
        }else println("Invalid Input!\nExiting..")
        break
    }
}
class Amount{
    // total input of user
    fun computeAmount(counter:Double):Double{
        println("Your Total Input is: $counter")
    return counter
    }
}