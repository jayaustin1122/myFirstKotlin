import java.text.BreakIterator

fun main (){


    //Creating variables to use loop
    var result = 0
    for (amount in 1..999999999) {
        //enter the user
        print("Enter Any Amount: ")
        var i: String = readln().toString()
        // Checking the Condition and convertions
        if (i != "No" +
            "" && i != "no") {
            result += i.toInt()
            continue
        }else
            println("Total of amounts "+result)
            print("Divide the value by how many?: ")
            var enterNum: Int = readln().toInt()
            var finalResult = result/enterNum
            println("Equals "+finalResult)
            break
    }
    print("Thank You!")
}

