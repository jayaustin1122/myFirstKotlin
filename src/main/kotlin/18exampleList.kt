fun main(){
    var numbers = mutableListOf<Int>()

    var ctr : Int = 0
    while (ctr < 5){
        println("Enter number${ctr+1}")
        var input = readln().toInt()
        numbers.add(input)
        ctr++
    }
    //Display List
    println("Displaying List")
    for (i in numbers){
        println(i)
    }
}