fun main(){
    var num1 : Int = 2
    var num2 : Int = 3

    var sum : Int = num1 + num2
    println("The sum of $num1 and $num2 is: $sum")

    var ctr :Int = 1
    while (ctr<=3){
        var ctr2:Int = 1
        while (ctr2<=3) {
            print("@")
            ctr2++

        }
        println()
        ctr++
    }
}
