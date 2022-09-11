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
    /*  data structures
            -1 array  - fixed size, changeable elements -> [ ]
            -2 collections
            -3 Arraylist - flexible, not fixed size, changeable components
            -4 maps - key pair (key i used to reference values)
                - mapOf()-> readonly -> fixed size, elements no changeable
                - mutableMapOf() -> flexible, changeable
            -5 set - unique values, no duplicates,
                - setOF() -> readonly -> fixed size, elements no changeable
                - mutableSetOf() -> flexible, changeable
            -6 list
                -listOf() = fixed
                -mutableListOf = Changeable

*/

}