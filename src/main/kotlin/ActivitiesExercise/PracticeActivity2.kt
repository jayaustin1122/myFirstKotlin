fun main (){

    print("Enter Grade in Math: ")
    var math: Double = readln().toDouble()
    print("Enter Grade in English: ")
    var english: Double = readln().toDouble()
    print("Enter Grade in Filipino: ")
    var filipino: Double = readln().toDouble()
    var sum : Double = math + english + filipino
    var result : Double = sum / 3
    print("Average Grade is "+ result)
}