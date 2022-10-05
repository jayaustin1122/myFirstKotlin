
fun main (){
    var counter: Double = 0.toDouble()
    while (true){
        //Input users amount
        print("Enter any Amount: ")
        var amount = readln().toDouble()
        //Ask the user to enter again.
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
            var enterNum = readln().toDouble()
            var finalResult = counter / enterNum
            println("Equals $finalResult")
            println("Thankyou!")
            break
        }else println("Invalid Input!\nExiting..")
            break
    }

}