fun main (){

    print("Enter length: ")
    var num1 = readln().toDouble()
    CalculatePerimeter(num1.toDouble())
    print("Enter width: ")
    var num2 = readln().toDouble()
    CalculateArea(num2.toDouble())
    var area = num1 * num2
    var periMeter = 2*(num1 + num2)
    println("Perimeter is $periMeter")
    println("Area is is $area meters")
}
fun CalculatePerimeter( num1 : Double): Double {
    var lenght = num1
    return lenght
}
fun CalculateArea(num2 : Double):Double{
    var width = num2
    return width

}