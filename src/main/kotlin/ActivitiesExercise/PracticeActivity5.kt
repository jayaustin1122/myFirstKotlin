fun main(){

    var numbers = arrayListOf<Int>()
    var counter = 0
    for (i in 1..5){
        //input user 5 times
        print("Enter Number: ")
        var input = readln().toInt()
        numbers.add(input)
        counter++
        if (input >5){
            println("Invalid Input!")
                break
        }
    }
    //print the user's input
    println("Your input is: ")
    for (value in numbers)
        print(value)
    //print the user's input in reverse.
    println("\nYour input in reverse:")
    numbers.reverse()
    for (j in numbers)
        print(j)


}
