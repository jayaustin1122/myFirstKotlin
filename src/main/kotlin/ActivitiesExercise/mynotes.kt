fun main (){
    var counter = 0
    var numbers = arrayListOf<Int>()
    for  (i in 0..5) {
        //input user
        print("Enter Number: ")
        var input = readln().toInt()
        counter ++
        numbers.add(input)
        //stop loop when 5
        if (counter == 5){
            for (j in numbers)
            println(j)
            break
        }
    }

}