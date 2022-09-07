
fun main (){
    print("Enter Any Amount: ")
    var i: String = readln().toString()
    var result = 0
    while (true) {
        //enter the user

        print("Enter Again?Yes?No: ")
        var ask: String = readln().toString()
        // Checking
        if (ask == "No" && ask == "no") {
            break
        }else if (ask == "Yes" && ask == "yes"){
            result += i.toInt()
            continue
        }else
            println("Total of amounts is $result")
            print("Divide the value by how many?: ")
        // Division
            var enterNum: Int = readln().toInt()
            var finalResult = result/enterNum
            println("Equals $finalResult")
            break
    }
    print("Thank You!")
}

